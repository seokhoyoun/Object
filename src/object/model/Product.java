package object.model;

public class Product {
	private String productID;
	private String productName; 
	private String productArea; // 생산지
	private int price;
	private double tax; //
	
	public Product() {
		
	}
	
	public Product(String productID, String productName, String productArea, int price, double tax) {
		this.productID = productID;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	public void info() {
		System.out.println("ID : " + this.productID);
		System.out.println("상품명 : "+ this.productName);
		System.out.println("생산지 : "+ this.productArea);
		System.out.println("가격 : "+ this.price+"원");
		System.out.println("부가세 : "+ this.tax+"%");
		System.out.println();
		
	}
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductArea() {
		return productArea;
	}

	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
}
