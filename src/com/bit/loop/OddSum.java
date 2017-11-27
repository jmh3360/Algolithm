package com.bit.loop;

//1 ~ 100 까지의 홀 수의 합
//
public class OddSum {
	public static void main(String[] args) {
		int res = 0;
		String t = "";
		for (int i = 1; i <= 100; i++) {
			if (i == 99) {
				res += i;
				t += i +"=";
			} else if (i % 2 == 1) {
				res += i;
				t += i + "+";
			}
		}
		System.out.println(t + res);
	}
}
