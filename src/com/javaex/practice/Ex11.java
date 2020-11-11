package com.javaex.practice;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex11 {

	public static void main(String args[]) {
	 int salary;
	 int annual;
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.print("월급을 입력하시오: ");
	 salary = scan.nextInt();
	 
	 annual= 10*12*salary;
	 System.out.printf("10년동안 모은 저축액은 %d\n입니다.", annual);
		
	}
}
