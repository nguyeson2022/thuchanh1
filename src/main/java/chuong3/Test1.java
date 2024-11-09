package chuong3;

public class Test1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangcle("Red", 4, 5);
        shapes[1] = new Triangle("Blue", 3, 4);
        shapes[2] = new Rectangcle("Black", 6, 8); 
        
        for (Shape s : shapes) {
            System.out.println(s);
            if (s instanceof Rectangcle) {
                System.out.println("Đây là hình chữ nhật!");
            } else if (s instanceof Triangle) {
                System.out.println("Đây là hình tam giác!");
            }
        }
    }
}
