package first_java0230221;
import java.util.Scanner;

public class ex04 {
	public static void main(String args[]) {
//		int arr1[] = new int [3]; // 크기가 3인 int형 1차원 배열
//		int arr2[][] = new int [3][3]; //크기가 3인 int형 2차원 배열
		
		// ex03.java의 문제를 다른(배열) 방식으로
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num[] = new int [n]; // 크기가 n인 1차원 배열 선언
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt(); // 배열값 하나씩 입력받기 (0번, 1번, 2번, ... )
		}
		int max = num[0]; // 배열의 첫번째 값 저장
		int min = num[0]; // 배열의 첫번째 값 저장
		for (int i = 1; i < n; i++) { // 배열의 두번째 값부터 비교하며, max와 min 갱신
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