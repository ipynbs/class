package first_java230223;

import java.util.Scanner;
import java.util.Random;

public class ex02 {
	public static void main(String[] args) {
		// �Է� : �迭�� ũ��. �迭����, ������ ����(v)
		// ��� : �迭���� �� v�� ���� ������ ����
		
		// 1. 3���� ���������� �Է�
		// ���� :: Random �Լ�
		Scanner sc = new Scanner(System.in); // Scanner Ŭ������ 
		Random rd = new Random(); // Random Ŭ������ ���� ��ü ����
		int n = sc.nextInt(); // n : �迭�� ũ��
		int arr[] = new int [n]; // arr : �迭��
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(10); // i��° �迭�� �� �Է� (����)
		}
		int v = sc.nextInt(); // v : ������ ����
		
		// 2. ���� :: arr�� ���� �߿��� v�� ���� ������ ���� ����
		int cnt = 0; // ���� ������ ����
		for (int i = 0; i < n; i++) { // �迭���� Ž��
			if (arr[i]==v) {
				cnt++; // �߰��ϸ� 1 ���ϱ�
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(cnt);
	}
}
