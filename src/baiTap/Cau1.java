package baiTap;

import java.util.Scanner;

/**
 * Câu 1: Tìm số lớn nhất trong 3 số a, b, c người dùng nhập vào
 */
public class Cau1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Người dùng nhập vào 3 số
		System.out.println("Xin vui lòng nhập vào 3 số: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		//B2: Tìm số lớn nhất
		int max = max(a, b, c);
		
		//B3: In ra kết quả
		System.out.println("Số lớn nhất trong 3 số là: " + max);
	}
	
	public static int max(int a, int b, int c) {
		int max = a;		
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		
		return max;
	}
}
