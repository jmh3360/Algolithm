package com.bit.opcode;

import java.util.Scanner;

// ctrl + L을 누르면 원하는 라인으로 이동 가능하다.
public class Whoareyou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String name ;
		System.out.println("이름이 무엇이냐");
		name = s.next();
		System.out.printf("%s ",
				name + "입니다.");
	}

}
