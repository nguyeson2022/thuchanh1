package chuong4;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Nhập vào số nguyên thứ nhất: ");
			int a = sc.nextInt();
			System.out.print("Nhập vào số nguyên thứ hai: ");
			int b = sc.nextInt();
			
			// Kiểm tra b có bằng 0 không
			if (b == 0) {
				System.out.println("Lỗi: Không thể chia cho 0.");
			} else {
				double kq = (double) a / b;
				System.out.println("Kết quả phép chia: " + a + " / " + b + " = " + kq);
			}
			
		} catch (java.util.InputMismatchException e) {
			System.out.println("Lỗi: Vui lòng nhập vào số nguyên.");
		} finally {
			sc.close();
		}
	}
}
