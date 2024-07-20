package baiTap;

import java.util.Scanner;

/**
 * Câu 2: Viết hàm kiểm tra 1 số nhập vào là chẵn hay lẻ
 */
public class Cau2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Người dùng nhập số
		System.out.println("Xin vui lòng nhập số: ");
		int n = scanner.nextInt();
		
		//B2: Kiểm tra số chẵn hay lẻ
		checkNumber(n);
	}
	
	public static void checkNumber (int n) {
		if (n % 2 == 0) {
			System.out.println("Kết quả: Số chẵn.");
		} else {
			System.out.println("Kết quả: Số lẻ.");
		}
	}
	
}
