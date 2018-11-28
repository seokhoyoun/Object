package oop.practice.controller;

import oop.practice.model.Book;

public class TestBook {

	public static void main(String[] args) {
		
		Book test = new Book();
		test.bookInformation();
		Book test2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
		test2.bookInformation();
		System.out.println("수정 결과 확인 ");
		test2.setTitle("자바의 정석");
		test2.setPrice(35000);
		test2.setDR(0.1);
		test2.setAuthor("윤상섭");
		test2.bookInformation();
	}

}
