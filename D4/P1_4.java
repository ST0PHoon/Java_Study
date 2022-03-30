package hello;

import java.util.Arrays;
import java.util.Scanner;

public class P1_4 {

	static int N;
	static int[] result;
	static int sum = 0;
	static int sumsum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. ���� ���� �� �ʱ�ȭ
		System.out.println("�ֻ��� ������ �Է����ּ���.");
		N = sc.nextInt(); 
		System.out.println("�ֻ����� ���� �Է����ּ���.");
		sumsum = sc.nextInt(); 
		if (sumsum > N * 6 || sumsum < N) {
			System.out.println("���� ����� �� �����ϴ�.");
		}
		result = new int[N]; // ������� ������ �迭
		int diceNum = 0; // 0~(N-1)�� �ֻ����� �ǹ�

		// 2. ����Լ� ȣ��
		roll(diceNum);

	}

	private static void roll(int diceNum) {
		// 3. Ż������
		if (diceNum == N) { // N��° �ֻ����� ���� �־�����
			for (int i = 0; i < N; i++) {
				sum += result[i];
			}
			if (sum == sumsum) {
				System.out.println(Arrays.toString(result));
				return; // print �� �޼��� ����
			} else {
				sum = 0;
			}
		} else {
			// 4. ��� Ž��
			for (int i = 1; i <= 6; i++) { // i�� 1~6���� �ش� ���� �ο�
				// 4.1 �� �ٲٱ�
				result[diceNum] = i; // n�� �ֻ����� i�� ���� �ο�
				diceNum = diceNum + 1; // n+1�� �ֻ����� �Ѿ
				// 4.2 ���ȣ��
				roll(diceNum); // n+1�� �ֻ����� ���Ͽ� ���ȣ��
				// 4.3 �� ����
				diceNum = diceNum - 1; // �ٽ� n�� �ֻ����� ����
				result[diceNum] = 0; // �� �˻��� ���� ���������� ����
			}
		}
	}
}
