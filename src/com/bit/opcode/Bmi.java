package com.bit.opcode;

import java.util.Scanner;

/*
 * 고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만
체질량 지수(體質量指數, Body Mass Index, BMI)는 인간의 비만도를 나타내는 지수로, 체중과 키의 관계로 계산된다.
키가 t 미터, 체중이 w 킬로그램일 때, BMI는 다음과 같다. (키의 단위가 센티미터가 아닌 미터임에 유의해야 한다.)
 */
public class Bmi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double wight = 0.0, height = 0.0, bmi = 0.0;
		String r = "", name = "", result = "";
		String[] res = { "고도비만", "중등도 비만", "경도 비만", "과체중", "정상", "저체중", "입니다.", "이름을 입력하세요.", "몸무게를 입력하세요.",
				"신장을 입력하세요(미터기준).", "bmi :" };
		int num = 0;
		System.out.println("검사인원 입력");
		num = s.nextInt();
		for (int i = 0; i < num; i++) {

			System.out.println(res[7]);
			name = s.next();
			System.out.println(res[8]);
			wight = s.nextDouble();
			System.out.println(res[9]);
			height = s.nextDouble();
			bmi = (wight / ((height * height) / 10000));

			if (35 < bmi) {
				r = res[0];
			} else if (30 < bmi && bmi < 35) {
				r = res[1];
			} else if (25 < bmi && bmi < 30) {
				r = res[2];
			} else if (23 < bmi && bmi < 24.9) {
				r = res[3];
			} else if (18.5 < bmi && bmi < 22.9) {
				r = res[4];
			} else if (bmi < 18) {
				r = res[5];

			}
			result += String.format("[이름] %s [몸무게] %s kg [신장] %s cm [결과] %s\n", name, wight, height, r);
		}
		System.out.println(result);
	}

}