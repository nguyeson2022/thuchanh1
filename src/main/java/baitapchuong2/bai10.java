package baitapchuong2;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào hai cạnh hình chữ nhật là a và b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Tính diện tích hình chữ nhật
        System.out.println("Diện tích hình chữ nhật là: " + (a * b));

        // Tính chu vi hình chữ nhật
        System.out.println("Chu vi hình chữ nhật là: " + (2 * (a + b)));

        sc.close();
    }
}
