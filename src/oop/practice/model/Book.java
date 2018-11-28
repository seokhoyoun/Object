package oop.practice.model;

public class Book {
	// - private + public (설계시 접근제어자 기호)
	private String title;
	private int price;
	private double discountRate;
	private String author;
		
		public Book() {
			
		}
	
		public Book(String title, int price, double discountRate, String author) {
			this.title = title;
			this.price = price;
			this.discountRate = discountRate;
			this.author = author;
		}
		
		public void bookInformation() {
			System.out.println(title +"\t"+price+"\t"+discountRate+"\t"+author);
			
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public void setDR(double discountRate) {
			this.discountRate = discountRate;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public String getTitle() {
			return title;
		}
		public int getPrice() {
			return price;
		}
		public double getDR() {
			return discountRate;
		}
		public String getAuthor() {
			return author;
		}
}
