package baitapchuong2;

public class bai9 {
    public static void main(String[] args) {
        int tong = 0;
        
        // Tính tổng các số le từ 1 đến 100
        for (int i = 1; i <= 100; i+=2) {
            tong += i; 
        }
        
        // In ra tổng sau khi hoàn thành vòng lặp
        System.out.println("Tổng các số le từ 1 đến 100 là: " + tong);
    }
}
