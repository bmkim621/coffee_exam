package kr.or.yi.coffee_exam.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.yi.coffee_exam.dto.Product;
import kr.or.yi.coffee_exam.dto.Sale;
import kr.or.yi.coffee_exam.jdbc.ConnectionProvider;
import kr.or.yi.coffee_exam.jdbc.LogUtil;
import kr.or.yi.coffee_exam.jdbc.MySQLjdbcUtil;

public class SaleDaoImpl implements SaleDao {

	@Override
	public List<Sale> selectSaleByAll() throws SQLException {
		LogUtil.prnLog("selectSaleByAll()");

		List<Sale> list = new ArrayList<>();
		String sql = "select no, code, price, sale_cnt, supply_price, add_tax, sale_price, margin_rate, margin_price from sale";
		try (Connection conn = MySQLjdbcUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			LogUtil.prnLog(pstmt);
			while (rs.next()) {
				list.add(getSale(rs));
			}
		}
		return list;
	}

	private Sale getSale(ResultSet rs) throws SQLException {
		int no = rs.getInt("no");
		Product code = new Product(rs.getString("code"));
		int price = rs.getInt("price");
		int saleCnt = rs.getInt("sale_cnt");
		int marginRate = rs.getInt("margin_rate");
		int supplyPrice = rs.getInt("supply_price");
		int addTax = rs.getInt("add_tax");
		int salePrice = rs.getInt("sale_price");
		int marginPrice = rs.getInt("margin_price");
		
		return new Sale(no, code, price, saleCnt, marginRate, supplyPrice, addTax, salePrice, marginPrice);
	}

	@Override
	public int insertSale(Sale sale) throws SQLException {
LogUtil.prnLog("insertSale");
		
		String sql = "insert into sale values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int res = 0;
		
		try(Connection conn = ConnectionProvider.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			//1 번호, 2 제품코드, 3 제품단가, 4 판매수량, 5 공급가액, 6 부가세액, 7 판매가격, 8 마진율 9 마진액
			pstmt.setInt(1, sale.getNo());
			pstmt.setString(2, sale.getProduct().getCode());
			pstmt.setInt(3, sale.getPrice());
			pstmt.setInt(4, sale.getSaleCnt());
			pstmt.setInt(5, sale.getSupplyPrice());
			pstmt.setInt(6, sale.getAddTax());
			pstmt.setInt(7, sale.getSalePrice());
			pstmt.setInt(8, sale.getMarginRate());
			pstmt.setInt(9, sale.getMarginPrice());
			
			LogUtil.prnLog(pstmt);
			
			res = pstmt.executeUpdate();
		}
		return res;
	}

	@Override
	public List<Sale> selectSaleRank(boolean isSale) throws SQLException {
		LogUtil.prnLog("selectSaleRank");
		List<Sale> list = new ArrayList<>();
		String sql = "{call price_rank(?)}";
		try(Connection conn = ConnectionProvider.getConnection();
				CallableStatement cs = conn.prepareCall(sql);){
			cs.setBoolean(1, isSale);
			LogUtil.prnLog(cs.toString());
			try(ResultSet rs = cs.executeQuery()){
				while(rs.next()) {
					list.add(getSaleDetail(rs));
				}
			}
		}
		LogUtil.prnLog("selectSaleRank" + list.size());
		return list;
	}

	private Sale getSaleDetail(ResultSet rs) throws SQLException {
		int no = rs.getInt("no");
		Product product = new Product(rs.getString("code"), rs.getString("name"));
		int price = rs.getInt("price");
		int saleCnt = rs.getInt("sale_cnt");
		int marginRate = rs.getInt("margin_rate");
		int supplyPrice = rs.getInt("supply_price");
		int addTax = rs.getInt("add_tax");
		int salePrice = rs.getInt("sale_price");
		int marginPrice = rs.getInt("margin_price");
		int rank = rs.getInt("rank");
		
		Sale sale = new Sale(no, product, price, saleCnt, marginRate, supplyPrice, addTax, salePrice, marginPrice);
		LogUtil.prnLog(sale.toString());
		return sale;
	}

}
