package first_java230223;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		// �Է� : �迭�� ũ��. �迭����, ������ ����(v)
		// ��� : �迭���� �� v�� ���� ������ ����
		
		// 1. 3���� ���������� �Է�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n : �迭�� ũ��
		int arr[] = new int [n]; // arr : �迭��
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // i��° �迭�� �� �Է�
		}
		int v = sc.nextInt(); // v : ������ ����
		
		// 2. ���� :: arr�� ���� �߿��� v�� ���� ������ ���� ����
		int cnt = 0; // ���� ������ ����
		for (int i = 0; i < n; i++) { // �迭���� Ž��
			if (arr[i]==v) {
				cnt++; // �߰��ϸ� 1 ���ϱ�
			}
		}
		System.out.println(cnt);
	}
}
