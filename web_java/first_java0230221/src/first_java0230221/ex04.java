package first_java0230221;
import java.util.Scanner;

public class ex04 {
	public static void main(String args[]) {
//		int arr1[] = new int [3]; // ũ�Ⱑ 3�� int�� 1���� �迭
//		int arr2[][] = new int [3][3]; //ũ�Ⱑ 3�� int�� 2���� �迭
		
		// ex03.java�� ������ �ٸ�(�迭) �������
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num[] = new int [n]; // ũ�Ⱑ n�� 1���� �迭 ����
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt(); // �迭�� �ϳ��� �Է¹ޱ� (0��, 1��, 2��, ... )
		}
		int max = num[0]; // �迭�� ù��° �� ����
		int min = num[0]; // �迭�� ù��° �� ����
		for (int i = 1; i < n; i++) { // �迭�� �ι�° ������ ���ϸ�, max�� min ����
			if (max < num[i]) {
				max = num[i];
			}
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}
}