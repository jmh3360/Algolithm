package com.bit.loop;

public class PracticeOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t= "";
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 1) {
				sum += i;
			if (i != 99) {
				t += i + "+";
			}else {
				t += i + "=";
			}
			}
		}
	System.out.println(t + sum);
	}

}
