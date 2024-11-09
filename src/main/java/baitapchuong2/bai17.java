package baitapchuong2;

public class bai17 {
    public static void main(String[] args) {
        System.out.println("Các số có 3 chữ số thỏa mãn điều kiện a^3 + b^3 + c^3 = abc:");

        // Duyệt tất cả các số từ 100 đến 999
        for (int i = 100; i < 1000; i++) {
            // Tách các chữ số
            int a = i / 100; // Chữ số hàng trăm
            int b = (i / 10) % 10; // Chữ số hàng chục
            int c = i % 10; // Chữ số hàng đơn vị

            // Tính a^3 + b^3 + c^3
            int sumCubes = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
            
            // So sánh với giá trị của số i
            if (sumCubes == i) {
                System.out.println(i); // In ra số thỏa mãn
            }
        }
    }
}
