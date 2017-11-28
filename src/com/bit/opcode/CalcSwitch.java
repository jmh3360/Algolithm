package com.bit.opcode;

import java.util.Scanner;

public class CalcSwitch {

	public void main() {
		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "", test = "";
		boolean inputOk = true;
		//ex 
		
		String[] arr = {"첫 번째 숫자를 입력하세요.\n", "연산기호를 입력하세요.\n"
	  , "두 번째 숫자를 입력하세요.\n", "사칙연사자만 입력 가능", "%d %s %d = %d"}; 
		//count 갯수에는 0개라는 개념이 없어 실제 지정해주는 번호 값과 다르다
		//배열 작성 방식은 String[] arr = new String[?], String[] arr = {}; 방식이 있다.
		System.out.print(arr[0]);
		num1 = scan.nextInt();
		System.out.print(arr[1]);
		opcode = scan.next();
		System.out.print(arr[2]);
		num2 = scan.nextInt();
		
		
		

		switch (opcode) {
		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;

		case "*":
			result = num1 * num2;
			break;

		case "/":
			result = num1 / num2;
			break;

		case "%":
			result = num1 % num2;
			break;
// 사칙연산외에 값이 opcode에 들어갈 경우 입력오류를 나오게 하고싶을 때 
//(branch구문 내에 출력창이 들어가는건 좋지 않다.)
//defalut와 boolean을 사용하여 문제를 해결하였다
		default:
			inputOk = false;
			break;
		}
		if(!inputOk) {
			test = arr[3];
		}else {
			test = String.format(arr[4], num1, opcode, num2, result);
		}
		System.out.println(test);
	}

}
