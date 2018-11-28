package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {

	public static void main(String[] args) {
		
		Book test = new Book();
//		test.bookInformation();
		Book test2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
//		test2.bookInformation();
//		test2.bookInformation();
		int price1 = test2.getPrice();
		double DR1 = test2.getDR();
		
		System.out.println("책 제목 : "+ test2.getTitle());
		System.out.println("할인된 가격 : "+ (int)(price1 - (price1 * DR1)));
		
		test2.setTitle("자바의 정석");
		test2.setPrice(35000);
		test2.setDR(0.1);
		test2.setAuthor("윤상섭");
		int price = test2.getPrice();
		double DR = test2.getDR();
		
		System.out.println("책 제목 : "+ test2.getTitle());
		System.out.println("할인된 가격 : "+ (int)(price - (price * DR)));
	}

}
