package chuong4;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;

		while (true) {
			System.out.print("Nhập chuỗi (hoặc gõ 'DONE' để kết thúc): ");
			input = scanner.nextLine();

			if (input.equals("DONE")) {
				break;
			}

			if (input.length() > 20) {
				System.err.println("Lỗi: Chuỗi có quá nhiều ký tự (quá 20 ký tự).");
			} else {
				System.out.println("Chuỗi hợp lệ: " + input);
			}
		}
		scanner.close();
	}

}
