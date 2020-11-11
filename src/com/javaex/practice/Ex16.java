package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 가격: ");
		int price =sc.nextInt() ;
		System.out.print("받은돈: ");
		int money = sc.nextInt();
		
		System.out.println("====================");
		
		double money1 = money;
		System.out.println("받은돈:"+money1);
		double price1 = price;
		System.out.println("상품가격:"+price1);
		double surtax=(price/10);
		System.out.println("부가세:"+surtax);
		double Vocabulary =(money - price);
		System.out.println("잔액: "+Vocabulary);

	}

}
