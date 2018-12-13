package kr.or.yi.coffee_exam.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.yi.coffee_exam.dao.SaleDao;
import kr.or.yi.coffee_exam.dao.SaleDaoImpl;
import kr.or.yi.coffee_exam.dto.Sale;

public class OutputService {
	private SaleDao saleDao;
	
	public OutputService() {
		saleDao = new SaleDaoImpl();
	}
	
	public List<Sale> outputOrder(boolean isSale) throws SQLException {
		return saleDao.selectSaleRank(isSale);
	}
}
