package baitapchuong2;

import java.util.Scanner;

public class bai16 {

    // Phương thức đệ quy để tính giai thừa
    public static long giaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1; // Cơ sở: 0! = 1 và 1! = 1
        } else {
            return n * giaiThua(n - 1); // Đệ quy
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
        } else {
            long result = giaiThua(n); // Tính giai thừa
            System.out.printf("Giai thừa của %d là: %d\n", n, result);
        }

        sc.close(); // Đóng scanner
    }
}
