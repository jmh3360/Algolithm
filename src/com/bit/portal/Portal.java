package com.bit.portal;

import java.util.Scanner;

import com.bit.opcode.Bmi;
import com.bit.opcode.CalcSwitch;
import com.bit.opcode.GradeReport;

public class Portal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bmi bmi = new Bmi();
		GradeReport gradeReport = new GradeReport();
		CalcSwitch calcSwitch = new CalcSwitch();
		while(true) {
			System.out.println("[메뉴] 0.정지 1.bmi 실행 2.계산기 3.성적");
			int flag = scanner.nextInt();
			switch(flag) {
			
			case 0 :
				System.out.println("시스템 종료되었습니다.");
			return;
			case 1 : 
				bmi.main();
				break;
			case 2 :
				calcSwitch.main();
				break;
			case 3 :
				gradeReport.main();
				break;
				
			}
		}
	}

}
