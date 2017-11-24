package com.bit.opcode;
import java.util.Scanner;

public class Plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		System.out.println("\t첫 번째 숫자 입력\n");
		a = s.nextInt();
		System.out.println("두 번째 숫자 입력");
		b = s.nextInt();
		c = a + b;
		System.out.println("두 수의 합 =" + c);
		
	}

}
