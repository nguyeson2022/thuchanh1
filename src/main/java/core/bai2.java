package core;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = sc.nextInt();
		if ((a % 4 == 0) && (a % 100 != 0) || a % 400 == 0) {
			System.err.println("Năm nay là năm nhuận!");
		} else {
			System.out.println("Năm nay không phải là năm nhuận!");
		}
	}
}
