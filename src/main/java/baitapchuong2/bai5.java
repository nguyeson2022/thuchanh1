package baitapchuong2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên a
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("Số a vừa nhập là: " + a);

        // Nhập số thực b
        System.out.print("Nhập số thực b: ");
        float b = sc.nextFloat();
        System.out.println("Số thực b vừa nhập là: " + b);

        // Nhập vào 1 ký tự
        System.out.print("Nhập vào 1 ký tự: ");
        String str = sc.next();
        System.out.println("Ký tự vừa nhập: " + str);

        // Xóa bỏ dòng thừa sau khi nhập số
        sc.nextLine();

        // Nhập vào 1 chuỗi ký tự (bao gồm khoảng trắng)
        System.out.print("Nhập vào 1 chuỗi ký tự: ");
        String str1 = sc.nextLine();
        System.out.println("Chuỗi vừa nhập: " + str1);

        sc.close(); // Đóng scanner để tránh rò rỉ tài nguyên
    }
}
