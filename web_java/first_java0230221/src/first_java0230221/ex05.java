package first_java0230221;
import java.util.Scanner;

public class ex05 {
	public static void main(String args[]) {
		// ���� n���� �̷���� ���� a�� ���� x�� �־�����. �̶�, a���� x���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// �Է� :: �迭�� ũ��, ������ ����(v), �迭����
		// ��� :: �迭���� �� v���� ���� ���ڵ� ���������� ���
		
		// 1. �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ���");
		int n = sc.nextInt(); // n: �迭�� ũ��
		System.out.println("� ���ں��� ���� ���ڸ� ã�� �ͽ��ϱ�");		
		int v = sc.nextInt(); // v: ������ ����
		System.out.println("�迭�� ũ�⸸ŭ ���ڸ� �Է��ϼ���");
		int arr[] = new int [n]; // arr: �迭����
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // arr�� i��° �迭�� ���������� �Է�
		}
		// 2. �ٷ� ���ϰ�, �ٷ� ���
		for (int i = 0; i < n; i++) {
			if(arr[i]<v) { // "���� ��ġ�� �迭���� v���� �۴ٸ�"
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
}
