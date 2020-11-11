package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("500원의 개수: ");
		int owon = sc.nextInt();
		System.out.print("100원의 개수: ");
		int hwon = sc.nextInt();
		System.out.print("50원의 개수: ");
		int otwon = sc.nextInt();
		System.out.print("10원의 개수: ");
		int twon = sc.nextInt();
		
		int sum = (500*owon+100*hwon+50*otwon+10*twon);
		System.out.println("동전의 총합은"+sum+"입니다.");
		

	}

}
