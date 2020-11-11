package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		double avenue;
		double column;
		System.out.print("가로를 입력하세요: ");
		Scanner sc=new Scanner(System.in);
		avenue = sc.nextDouble();
		System.out.print("세로를 입력하세요: ");
		column = sc.nextDouble();
		
		double area = avenue*column;
		System.out.println("사각형의 넓이:"+area);
		
		double periphery = (avenue+column)*2;
		System.out.println("사각형의 둘레:"+periphery);
	}

}
