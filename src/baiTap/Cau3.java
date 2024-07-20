package baiTap;

import java.util.Scanner;

/**
 * Câu 3: Viết hàm tính tổng 3 số người dùng nhập vào
 */
public class Cau3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Người dùng nhập số
		System.out.println("Xin vui lòng nhập 3 số: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		
		//B2: Tính tổng 3 số
		tong3So(n1, n2, n3);
	}
	
	public static void tong3So (double n1, double n2, double n3) {
		double sum = n1 + n2 + n3;
		System.out.println("Tổng 3 số là: " + sum);
	}
	
}
