package first_java0230221;
import java.util.Scanner;

public class ex05 {
	public static void main(String args[]) {
		// 정수 n개로 이루어진 수열 a와 정수 x가 주어진다. 이때, a에서 x보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		System.out.print("숫자 2개를 입력하세요 : ");
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
