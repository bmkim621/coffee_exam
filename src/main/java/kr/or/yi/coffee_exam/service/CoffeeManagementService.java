package kr.or.yi.coffee_exam.service;

import java.sql.SQLException;

import kr.or.yi.coffee_exam.dao.ProductDao;
import kr.or.yi.coffee_exam.dao.ProductDaoImpl;
import kr.or.yi.coffee_exam.dao.SaleDao;
import kr.or.yi.coffee_exam.dao.SaleDaoImpl;
import kr.or.yi.coffee_exam.dto.Product;
import kr.or.yi.coffee_exam.dto.Sale;

public class CoffeeManagementService {
	private SaleDao saleDao;
	private ProductDao productDao;
	
	public CoffeeManagementService() {
		saleDao = new SaleDaoImpl();
		productDao = new ProductDaoImpl();
	}
	
	public int registerSale(Sale sale) throws SQLException {
		return saleDao.insertSale(sale);
	}

	
	public Product searchProduct(Product product) throws SQLException {
		return productDao.selectProductByCode(product);
	}
}
