package chuong4;

import java.util.Scanner;

public class test2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String input;

     try {
         while (true) {
             System.out.print("Nhập chuỗi (hoặc gõ 'DONE' để kết thúc): ");
             input = scanner.nextLine();

             if (input.equals("DONE")) {
                 break;
             }

             if (input.length() > 30) {
                 throw new StringTooLongException("Chuỗi có quá nhiều ký tự (quá 30 ký tự).");
             }

             System.out.println("Chuỗi hợp lệ: " + input);
         }
     } catch (StringTooLongException e) {
         System.err.println("Lỗi: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}
