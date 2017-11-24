package com.bit.opcode;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		String[] arr = {"+", "-", "*", "/", "%", "첫 번째 숫자를 입력하세요.", "두 번째 숫자를 입력하세요.", "두 수의 합은 +, 두 수의 뺄셈은 -",
				"사칙연산 기호를 입력하세요." };
		String opcode = "";
		System.out.println(arr[5]);
		num1 = scan.nextInt();
		System.out.println(arr[6]);
		num2 = scan.nextInt();
		System.out.println(arr[7]);
		opcode = scan.next();
		if (opcode.equals(arr[0])) {
			result = num1 + num2;

		} else if (opcode.equals(arr[1])) {
			result = num1 - num2;

		} else if (opcode.equals(arr[2])) {
			result = num1 * num2;

		} else if (opcode.equals(arr[3])) {
			result = num1 / num2;

		} else if (opcode.equals(arr[4])) {
			result = num1 % num2;

		} else {
			System.out.println(arr[9]);
			return;
		}

		System.out.printf("%d %s %d = %d", num1, opcode, num2, result);
	}

}
