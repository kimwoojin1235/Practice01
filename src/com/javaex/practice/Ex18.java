package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		int f = sc.nextInt();
		
		double c = (5/(double)9)*(f-32);
		double f1=f;
		System.out.println("화씨"+f1+"의 섭씨온도는"+c+"입니다.");

	}

}
