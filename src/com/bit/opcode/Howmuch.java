package com.bit.opcode;
import java.util.Scanner;

public class Howmuch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {"얼마에요?", "원 입니다. ", "몇개 드릴까요?\n", "개 주세요"
			, "총 금액은 ", "원입니다.\n", "비싸요 깎아주세요.\n", "몇 퍼센트 DC해드릴까요?",
			"퍼센트 해주세요\n", "안 팔아요."
		};

		boolean inputOk = true;
		int price = 0, num = 0, tprice = 0, dc = 0, dcprice = 0;
		String a = "";
		
		System.out.print(arr[0]);
		price = s.nextInt();
		System.out.print(price + arr[1]);
		System.out.print(arr[2]);
		num = s.nextInt();
		System.out.print(num + arr[3]);
		tprice = price * num;
		System.out.print(arr[4]+ tprice + arr[5]);
		System.out.print(arr[6]);
		System.out.print(arr[7]);
		dc = s.nextInt();
		System.out.print(dc + arr[8]);
		switch(dc/10) {
		case 0 : 
			dcprice = (tprice * (100 - dc)) /100;						
			break;
			
			default :
				
				break;
		}
			if(dc<10) {
				a = dcprice + arr[1];
			}else {
				a = arr[9];
			}
			System.out.println(a);
			
		}
		
		
		
	}


