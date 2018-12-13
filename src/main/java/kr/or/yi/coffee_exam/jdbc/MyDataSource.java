package kr.or.yi.coffee_exam.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.DataSources;

public class MyDataSource {
	private static final MyDataSource instance = new MyDataSource();

	public static MyDataSource getInstance() {
		return instance;
	}

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void close() {
		try {
			DataSources.destroy(dataSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private MyDataSource() {
		Properties prop = loadProperties();

		DataSource ds_unpooled;
		try {
			ds_unpooled = DataSources.unpooledDataSource(prop.getProperty("url"), prop);
			Map<String, Object> overrides = new HashMap<>();
			overrides.put("maxStatements", "200");
			overrides.put("maxPoolSize", new Integer(50));
			dataSource = DataSources.pooledDataSource(ds_unpooled, overrides);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Properties loadProperties() {
		Properties properties = new Properties();
		// 파일명 db.properties를 불러온다.
		try (InputStream is = ClassLoader.getSystemResourceAsStream("db.properties")) {
			// 파일 불러온 것을 is에 넣는다.(is에 db.properties가 들어있다.)
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

}
