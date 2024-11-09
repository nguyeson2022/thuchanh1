package baitapchuong2;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vao ban kinh cua hinh tron: ");
        int r = sc.nextInt();
       

        // Tính diện tích hình tron
        System.out.println("Diện tích hình chữ nhật là: " + (r*r*(Math.PI)));

        // Tính chu vi hình chữ nhật
        System.out.println("Chu vi hình chữ nhật là: " + (r*(Math.PI)*2));

        sc.close();
    }
}
