package com.bit.loop;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		String t = "";
		for (int i = 0; i <= 100; i++) {
			if (i == 100) {
				res += i;
				t += i + "=";
			} else if (i % 2 == 0) {
				res += i;
				t += i + "+";
			}
		}

		System.out.println(t + res);
	}

}
