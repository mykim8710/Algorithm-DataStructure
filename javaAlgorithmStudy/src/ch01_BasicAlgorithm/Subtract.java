// 두 정수 a, b의 b-a값을 도출, b값이 a값보다 작거나 같으면 다시 입력받는다

package ch01_BasicAlgorithm;

import java.util.Scanner;

public class Subtract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		do {
			System.out.println("b값이 a값보다 작거나 같습니다. b값을 다시 입력해주세요.");
			b = sc.nextInt();
		} while (b <= a);
		
		System.out.println("b - a = " +(b-a));
		
	}
}
