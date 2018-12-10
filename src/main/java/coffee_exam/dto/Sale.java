package coffee_exam.dto;

public class Sale {
	private int no;
	private Product product;	//제품코드
	private int price;
	private int saleCnt;
	private int marginRate;
	private int supplyPrice;
	private int addTax;
	private int salePrice;
	private int marginPrice;
	private int rank;
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}

	
	public Sale(Product product) {
		super();
		this.product = product;
	}

	public Sale(int no, Product product, int price, int saleCnt, int marginRate, int supplyPrice, int addTax,
			int salePrice, int marginPrice, int rank) {
		super();
		this.no = no;
		this.product = product;
		this.price = price;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
		this.supplyPrice = supplyPrice;
		this.addTax = addTax;
		this.salePrice = salePrice;
		this.marginPrice = marginPrice;
		this.rank = rank;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSaleCnt() {
		return saleCnt;
	}

	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}

	public int getMarginRate() {
		return marginRate;
	}

	public void setMarginRate(int marginRate) {
		this.marginRate = marginRate;
	}

	public int getSupplyPrice() {
		return supplyPrice;
	}

	public void setSupplyPrice(int supplyPrice) {
		this.supplyPrice = supplyPrice;
	}

	public int getAddTax() {
		return addTax;
	}

	public void setAddTax(int addTax) {
		this.addTax = addTax;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public int getMarginPrice() {
		return marginPrice;
	}

	public void setMarginPrice(int marginPrice) {
		this.marginPrice = marginPrice;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return String.format(
				"%s, %s, %s, %s, %s, %s, %s, %s, %s, %s",
				no, product, price, saleCnt, marginRate, supplyPrice, addTax, salePrice, marginPrice, rank);
	}
	
	
	
}
