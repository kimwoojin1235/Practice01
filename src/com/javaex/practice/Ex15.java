package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		System.out.print("마일을 입력하세요: ");
		Scanner sc=new Scanner(System.in);
		double ar =sc.nextDouble();	
		double mail = (ar*1.609);
		
		System.out.println(ar+"마일은"+mail+"마일입니다.");
	}
}
