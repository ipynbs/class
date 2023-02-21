package first_java0230221;
import java.util.Scanner;

public class ex03 {
	// n을 입력받고, n의 개수만큼 숫자를 입력받는다.
	// n개의 숫자들 중 최대/최소값을 출력하는 코드를 작성해보시오.
	public static void main(String args[]) {
		// 1. 숫자 개수(n) 입력
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 2. 최대/최소를 저장할 변수를 만들기
		int max = 0;
		int min = 999999;
		
		// 3. 숫자 입력받으면서 max, min 갱신
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt(); // n개의 숫자 입력
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
		}
		// 4. 현재 저장된 max, min 출력
		System.out.println("max : "+max);
		System.out.println("min : "+min);
	}
}
