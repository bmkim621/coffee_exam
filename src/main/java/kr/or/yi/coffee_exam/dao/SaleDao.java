package kr.or.yi.coffee_exam.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.yi.coffee_exam.dto.Sale;

public interface SaleDao {
	List<Sale> selectSaleByAll() throws SQLException;

	int insertSale(Sale sale) throws SQLException;

	List<Sale> selectSaleRank(boolean isSale) throws SQLException;
}
