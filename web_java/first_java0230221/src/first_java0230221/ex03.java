package first_java0230221;
import java.util.Scanner;

public class ex03 {
	// n�� �Է¹ް�, n�� ������ŭ ���ڸ� �Է¹޴´�.
	// n���� ���ڵ� �� �ִ�/�ּҰ��� ����ϴ� �ڵ带 �ۼ��غ��ÿ�.
	public static void main(String args[]) {
		// 1. ���� ����(n) �Է�
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 2. �ִ�/�ּҸ� ������ ������ �����
		int max = 0;
		int min = 999999;
		
		// 3. ���� �Է¹����鼭 max, min ����
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt(); // n���� ���� �Է�
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
		}
		// 4. ���� ����� max, min ���
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}
}
