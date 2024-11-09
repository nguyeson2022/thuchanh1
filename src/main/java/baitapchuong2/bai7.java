package baitapchuong2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập 2 số nguyên a và b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch;

        System.out.println("Nhập ký tự A, B, C, D:");
        ch = Character.toUpperCase(sc.next().charAt(0));

        switch (ch) {
            case 'A':
                System.out.println("Tổng 2 số a và b: " + (a + b));
                break;
            case 'B':
                System.out.println("Hiệu 2 số a và b: " + (a - b));
                break;
            case 'C':
                System.out.println("Tích 2 số a và b: " + (a * b));
                break;
            case 'D':
                if (b != 0) {
                    System.out.println("Thương 2 số a và b: " + ((float) a / b));
                } else {
                    System.out.println("Không thể chia cho 0!");
                }
                break;
            default:
                System.out.println("Ký tự nhập không hợp lệ!");
                break;
        }

        sc.close();  // Đóng scanner
    }
}
