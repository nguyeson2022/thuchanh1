package baitapchuong2;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào điểm thi trong thang điểm 100: ");
        int a = sc.nextInt();

        // Kiểm tra xem điểm có hợp lệ không
        if (a < 0 || a > 100) {
            System.out.println("Điểm không hợp lệ! Vui lòng nhập điểm trong khoảng từ 0 đến 100.");
        } else if (a >= 90) {
            System.out.println("Xếp loại A!");
        } else if (a >= 80) {
            System.out.println("Xếp loại B!");
        } else if (a >= 70) {
            System.out.println("Xếp loại C!");
        } else if (a >= 50) {
            System.out.println("Xếp loại D!");
        } else {
            System.out.println("Xếp loại F!");
        }
        
        sc.close(); // Đóng scanner
    }
}
