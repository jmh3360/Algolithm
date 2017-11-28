package com.bit.loop;

import java.util.Scanner;

public class InfiniteDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴] 0.정지 1.bmi 실행 2.계산기 3.성적");
			int flag = scanner.nextInt();
			
			
			switch(flag){
			
			
			case 0 :
				System.out.println("시스템이 종료");
				
				return;
			
			case 1 :
				
				break;
			}
			System.out.println("while loop 종료");
	}
	
		
	}

}
