package core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai1 {

	public static void tamgiac(int a, int b, int c) {
		// kiem tra tam giac hop le
		if (a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("Tam giac khong hop le");
		} else {
			System.out.println("Tam giac hop le");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// khai bao doi tuong

		bai1 check = new bai1();

		// nhap du lieu

		try {
			System.out.print("Nhap a la canh thu nhat:");

			int a = sc.nextInt();

			System.out.print("Nhap b la canh thu hai:");

			int b = sc.nextInt();

			System.out.print("Nhap c la canh thu ba:");

			int c = sc.nextInt();

			try {
				bai1.tamgiac(a, b, c);

			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.print("nhap lai");
			}
		} catch (Exception e) {
			System.out.print("sai");
		}
		sc.close();
	}

}
