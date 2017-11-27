package com.bit.loop;

/*
 * Algorithm 11번 문제
 * 1 - 2 + 3 -4 + 5 - 6 ........+99 - 100 의 합계
 */
public class ArithmmeticSequence11 {

	public static void main(String[] args) {
		String str = "";
		int oddsum = 0, evensum = 0, res = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddsum += i;
				str += i + "-";

			} else {
				if (i != 100) {
					evensum -= i;
					str += i + "+";
				} else {
					str += i + "=";

				}

			}
		}
		res = oddsum + evensum;
		System.out.println(str + res);
	}

}
