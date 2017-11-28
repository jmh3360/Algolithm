package com.bit.loop;

import java.util.Scanner;

/*
 * 사용자가 원하는대로 숫자를 입력하게 하고
 * 0을 누르면 총 누적된 합계를 보여주는 어플
 */
public class InputSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0, num2 = 0, res = 0;
		String opcode = "";
		while (true) {
			System.out.println("숫자를 입력하세요.");
			a = scanner.nextInt();
			
			switch (a) {
			case 0 :
				System.out.println(res);
				return;
				default :
					res = a;
					res += a;
					System.out.println("연산기호 입력");
					opcode = scanner.next();
					switch(opcode) {
					case "-" :
						res -= a;
					break;
					case "0" :
						System.out.println(res);
						return;
					}
					
			}
		
		}
	}

}
