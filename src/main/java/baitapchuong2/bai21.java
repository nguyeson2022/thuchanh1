package baitapchuong2;

import java.util.Scanner;

public class bai21 {
	// Nhập mảng
	public static void NhapMang(int a[], int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập a[" + i + "]: ");
			a[i] = sc.nextInt(); // Lưu giá trị nhập vào mảng
		}
	}

	// Xuất mảng
	public static void XuatMang(int a[], int n) {

		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]); // In ra giá trị của phần tử
		}
	}

	// tính tổng mảng
	public static int Sum(int a[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}

	// sắp xếp mảng
	public static int[] SapXep(int[] arr, boolean isINC) {
		byte orr = (byte) (isINC ? 1 : -1);
		int tmp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] * orr > arr[j] * orr) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}

		return arr;
	}// Tìm giá trị lớn nhất của mảng

	public static int TimGiaTriLonNhat(int a[], int n) {
		int max = a[0]; // Giả sử phần tử đầu tiên là lớn nhất
		for (int i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i]; // Cập nhật giá trị lớn nhất nếu tìm thấy phần tử lớn hơn
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		int a[] = new int[n]; // Tạo mảng có n phần tử
		NhapMang(a, n); // Gọi hàm nhập mảng
		System.out.println("Hiển thị:");
		XuatMang(a, n); // Gọi hàm xuất mảng
		int kq = Sum(a, n);
		System.out.println("Tong cac phan tu trong mang: " + kq);
		a = bai21.SapXep(a, true);
		System.out.println("Mảng sau khi sắp xếp!!");
		XuatMang(a, n);
		// Tìm giá trị lớn nhất
		int max = TimGiaTriLonNhat(a, n);
		System.out.println("Giá trị lớn nhất trong mảng: " + max);
		sc.close(); // Đóng scanner
	}
}
