package baitapchuong2;

import java.util.Scanner;

public class bai24 {
    // Nhập thông tin sinh viên và điểm của họ
    public void NhapSinhVien(int n, Scanner sc, String[] sinhVien, int[] diem) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
            sinhVien[i] = sc.nextLine(); // Nhập tên sinh viên
            System.out.print("Nhập điểm của sinh viên " + sinhVien[i] + ": ");
            diem[i] = sc.nextInt(); // Nhập điểm của sinh viên
            sc.nextLine(); // Đọc bỏ ký tự xuống dòng sau khi nhập số
        }
    }

    // Tìm sinh viên có điểm bằng với điểm nhập từ bàn phím
    public void TimSinhVien(int n, Scanner sc, String[] sinhVien, int[] diem) {
        System.out.print("Nhập điểm cần tìm: ");
        int diemCanTim = sc.nextInt();
        boolean timThay = false;

        System.out.println("\nSinh viên có điểm bằng " + diemCanTim + ":");
        for (int i = 0; i < n; i++) {
            if (diem[i] == diemCanTim) {
                System.out.println(sinhVien[i] + " có điểm: " + diem[i]);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Không có sinh viên nào có điểm bằng " + diemCanTim);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bai24 bai = new bai24(); // Tạo đối tượng để gọi phương thức

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine(); // Đọc bỏ ký tự xuống dòng sau khi nhập số nguyên

        String[] sinhVien = new String[n]; // Mảng lưu tên sinh viên
        int[] diem = new int[n]; // Mảng lưu điểm của sinh viên

        bai.NhapSinhVien(n, sc, sinhVien, diem); // Gọi phương thức nhập thông tin sinh viên
        bai.TimSinhVien(n, sc, sinhVien, diem); // Gọi phương thức tìm sinh viên theo điểm

        sc.close(); // Đóng scanner để tránh rò rỉ tài nguyên
    }
}
