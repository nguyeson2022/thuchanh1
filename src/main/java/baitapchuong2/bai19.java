package baitapchuong2;

import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập số giờ, phút và giây từ người dùng
        System.out.print("Nhập số giờ: ");
        int gio = sc.nextInt();
        System.out.print("Nhập số phút: ");
        int phut = sc.nextInt();
        System.out.print("Nhập số giây: ");
        int giay = sc.nextInt();
        
        // Tính tổng số giây
        long tongGiay = gio * 3600 + phut * 60 + giay;
        
        // In ra tổng số giây
        System.out.println("Tổng số giây được quy đổi từ giờ, phút và giây đã nhập là: " + tongGiay);
        
        sc.close(); // Đóng scanner
    }
}
