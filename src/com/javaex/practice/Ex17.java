package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름: ");
		int goo =sc.nextInt();
		
		double radius = ((double)4/3*3.14*goo*goo*goo);
		System.out.println("구의 부피는:"+radius+"입니다.");

	}

}
