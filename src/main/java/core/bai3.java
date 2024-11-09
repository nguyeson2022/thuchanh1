package core;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		
		if(a<2) {
			System.out.println("a không phải là số nguyên tố!");
		}else {
			boolean check = true;
			for(int v = 2; v < (int)(Math.sqrt(a)); v++) {
				if(a%v==0) {
					check = false;
					break;
					
				}
			}
			if(check) {
				System.out.println("a là số nguyên tố!");
			}else {
				System.out.println("a không là số nguyen tố!");
			}
		}
	}
}
