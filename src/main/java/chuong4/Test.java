package chuong4;

public class Test {
	public static void main(String[] args) {
		try {
			ThoiGian tg = new ThoiGian(0, 11, 2024);
			System.out.println(tg);
		} catch (InvalidDateException e) {
			// TODO: handle exception
			System.out.println("Lỗi! " + e.getMessage());
		}
	}
}
