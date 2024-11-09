package chuong3;

public class Test {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(5);
        System.out.println("Thông tin hình tròn ban đầu: ");
        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Chu vi: " + String.format("%.2f", circle.getPerimeter()));
        System.out.println("Diện tích: " + String.format("%.2f", circle.getArea()));
        System.out.println("-----------------------------------");
        circle.resize(20);
        System.out.println("Sau khi tăng 20%!");
        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Chu vi: " + String.format("%.2f", circle.getPerimeter()));
        System.out.println("Diện tích: " + String.format("%.2f", circle.getArea()));
        System.out.println("-----------------------------------");
       
    }
}
