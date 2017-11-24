package com.bit.opcode;

import java.util.Scanner;

public class Ssnswitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "", num = "", gender = "", res = "";
		boolean inputOk = true;
		char ch ;
		String[] imp = {"이름을 입력해 주세요", "주민번호를 입력해 주세요",};
		System.out.println(imp[0]);
		name = s.next();
		System.out.println(imp[1]);
		num = s.next();
		ch = num.charAt(7);
		
		switch(ch) {
		
		case '1': case '3' : gender = "남자";
		break;
		case '2' : case '4' : gender ="여자";
		break;
		case '5' : case '6' : gender ="외국인";
		default : 
			res = "주민번호 입력 오류 재입력하세요.";
			break;
			
		}
		if(!inputOk) {
			res = "주민번호 입력오류 재입력하세요. ";
		}else {
			res = String.format("학생정보 :" + "%s : %s : %s ",
					name, num, gender);
		}
		System.out.println(res);
	}

}
