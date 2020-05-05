// 세 정수를 입력받고 가장 작은 정수 값 도출

package ch01_BasicAlgorithm;

import java.util.Scanner;

public class GetMinValue {
	public static int getMinValue(int a, int b, int c) {
		int minValue = a;

		if (b < minValue) {
			minValue = b;
		}

		if (c < minValue) {
			minValue = c;
		}
		
		return minValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 세개를 입력하세요.");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("가장 작은 정수 : " +getMinValue(a, b, c));

	}
}
