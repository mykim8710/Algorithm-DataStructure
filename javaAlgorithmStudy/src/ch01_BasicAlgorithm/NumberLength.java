// 정수를 입력받고 해당 정수의 자리수를 도출

package ch01_BasicAlgorithm;

import java.util.Scanner;

public class NumberLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int length = 0;

		while (number > 0) {
			number = number / 10;
			length++;
		}

		System.out.println("자리수 : " +length);

	}
}
