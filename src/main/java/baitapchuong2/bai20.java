package baitapchuong2;

import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập nhiệt độ Celsius từ người dùng
        System.out.print("Nhập vào nhiệt độ C: ");
        float nhietdoC = sc.nextFloat();
        
        // Chuyển đổi sang Fahrenheit
        float nhietdoF = (nhietdoC * 1.8f) + 32;
        
        // In ra kết quả
        System.out.println("Nhiệt độ F tương ứng là: " + nhietdoF);
        
        sc.close(); // Đóng scanner để giải phóng tài nguyên
    }
}
