package object.controller;

import object.model.Product;

public class TestProduct {
	static int t_price = 0; 
	static int price = 0;		
	static double tax = 0;
	
	public static void main(String[] args) {
		Product p1 = new Product("ssgnote-6","갤럭시노트6","경기도 수원",960000,10.0);
		Product p2 = new Product("lgxnote5","LG스마트폰5","경기도 평택",780000, 0.7);
		Product p3 = new Product("ktnorm3","KT일반폰3","서울시 강남구",25000, 0.3);
		
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		
		price = p1.getPrice();
		tax = p1.getTax();
		t_price = price + (int)(price * tax);
		System.out.println("상품명 : "+p1.getProductName());
		System.out.println("부가세 포함 가격 : "+ t_price);
		
		System.out.println();
		System.out.println("상품명 : "+p2.getProductName());
		System.out.println("부가세 포함 가격 : "+ (int)(p2.getPrice()+(p2.getPrice()*p2.getTax())));
		
		System.out.println();
		System.out.println("상품명 : "+p3.getProductName());
		System.out.println("부가세 포함 가격 : "+ (int)(p3.getPrice()+(p3.getPrice()*p3.getTax())));
		
		
		
		
	}

}
