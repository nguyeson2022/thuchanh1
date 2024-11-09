package baitapchuong2;

import java.util.Scanner;

public class BAI13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập giá bán
        System.out.print("Nhập giá bán: ");
        int giaBan = sc.nextInt();
        
        // Nhập phần trăm giảm
        System.out.print("Nhập phần trăm giảm: ");
        int phanTramGiam = sc.nextInt();
        
        // Tính giá sau khi giảm
        double giaSauKhiGiam = giaBan * (1 - (phanTramGiam / 100.0));
        
        // In ra kết quả
        System.out.printf("Giá sau khi giảm là: %.2f\n", giaSauKhiGiam);
        
        sc.close(); // Đóng scanner
    }
}
