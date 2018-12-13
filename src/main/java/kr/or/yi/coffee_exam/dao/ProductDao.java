package kr.or.yi.coffee_exam.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.yi.coffee_exam.dto.Product;

public interface ProductDao {
	List<Product> selectProductByAll() throws SQLException;

	Product selectProductByCode(Product pdt) throws SQLException;
}
