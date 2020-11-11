package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		final double pi=3.14;
		Scanner scan = new Scanner(System.in);
		double radius;
		
		System.out.print("반지름을 입력하세요: " );
		radius = scan.nextDouble();
		
		double ar = radius* radius*pi;
		System.out.println(ar);
		
	}
}
