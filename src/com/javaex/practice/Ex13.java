package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	System.out.print("원화를 입력하시오: ");
	Scanner scan = new Scanner(System.in);
	int won = scan.nextInt();
	double ar = (won/1230.95);
	
	System.out.print(ar);
	
	scan.close();
	}

}
