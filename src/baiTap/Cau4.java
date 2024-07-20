package baiTap;

import java.util.Scanner;

/**
 * Câu 4: Xây dựng chương trình tính toán cộng, trừ, nhân, chia số nguyên khác
 * 0. Y/c SỬ DỤNG HÀM. Xuất thông báo cho người dùng chọn: 1 là +, 2 là -, 3 là
 * *, 4 là chia.
 */
public class Cau4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// B1: Xuất ra menu
		int phepToan = menu();

		// B2: Nhập 2 số nguyên
		System.out.println("Xin vui lòng nhập 2 số nguyên khác 0: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		// B3: Kiểm tra 2 số khác 0
		if (a == 0 || b == 0) {
			System.out.println("Số nhập vào phải có giá trị khác 0!");
			return;
		}

		// B4: Tiến hành Tính toán
		mayTinh(phepToan, a, b);
	}

	public static int menu() {
		Scanner scanner = new Scanner(System.in);
		int phepToan;

		do {
			// B1: Xuất ra menu, yêu cầu người dùng chọn và nhập 2 số
			System.out.println("Xin vui lòng chọn phép toán: \n 1: Phép + \n 2: Phép - \n 3: Phép * \n 4: Phép : ");
			phepToan = scanner.nextInt();

			// B2: Kiểm tra phép toán
			if (phepToan != 1 && phepToan != 2 && phepToan != 3 && phepToan != 4) {
				System.out.println("Phép toán không hợp lệ!");
			}
		} while (phepToan != 1 && phepToan != 2 && phepToan != 3 && phepToan != 4);

		return phepToan;
	}

	public static void mayTinh(int phepToan, int a, int b) {
		switch (phepToan) {
		case 1: {
			tinhTongHaiSo(a, b);
			break;
		}
		case 2: {
			tinhHieuHaiSo(a, b);
			break;
		}
		case 3: {
			tinhTichHaiSo(a, b);
			break;
		}
		default:
			chiaHaiSo(a, b);
			break;
		}
	}

	public static void tinhTongHaiSo(int thamso1, int thamso2) {
		System.out.println("Tổng 2 số là: " + (thamso1 + thamso2));
	}

	public static void tinhHieuHaiSo(int thamso1, int thamso2) {
		System.out.println("Hiệu 2 số là: " + (thamso1 - thamso2));
	}

	public static void tinhTichHaiSo(int thamso1, int thamso2) {
		int kq = thamso1 * thamso2;

		System.out.println("Tích 2 số là: " + kq);
	}

	public static void chiaHaiSo(int thamso1, int thamso2) {
		double kq = (double) thamso1 / thamso2;

		System.out.println("Phép chia 2 số là: " + kq);
	}

}