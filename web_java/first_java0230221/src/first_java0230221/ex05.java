package first_java0230221;
import java.util.Scanner;

public class ex05 {
	public static void main(String args[]) {
		// ���� n���� �̷���� ���� a�� ���� x�� �־�����. �̶�, a���� x���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("���� 2���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int x = sc.nextInt();
		
		int num[] = new int [n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
	}
}
