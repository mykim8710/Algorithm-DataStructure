// 세 정수를 입력받고 가장 큰 정수값 도출

package ch01_BasicAlgorithm;

import java.util.Scanner;

public class GetMaxValue {
	public static int getMaxValue(int a, int b, int c) {
		int maxValue = a;

		if (b > maxValue) {
			maxValue = b;
		}

		if (c > maxValue) {
			maxValue = c;
		}
		
		return maxValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 세개를 입력하세요.");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("가장 큰 정수 : " +getMaxValue(a, b, c));

	}
}
