// 1 ~ 입력받은 n까지의 총합 n > 1 for문 사용

package ch01_BasicAlgorithm;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.err.println("1 ~ " +n +"까지의 총합 : " +sum);
	}
}
