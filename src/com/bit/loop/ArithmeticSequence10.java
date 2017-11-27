package com.bit.loop;

import java.util.Scanner;

/*
 * Algorithm 10번 문제
 * 1+2+3+4+....+100 의 합계
 */
public class ArithmeticSequence10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원하는 구구단 수 입력");
		int num = s.nextInt();
		int res = 0;
		// TODO Auto-generated method stub
		// 1 + 2 + 3 + 4 + 5 .... + 10

for(int i = 1; i <= 9; i++) {
	res = num * i;
}
	
	}

}
