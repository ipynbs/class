package first_java0230221;
import java.util.*;

public class ex02 {
	public static void main(String args[]) {
		// 조건문 : if-else if-else, switch
		// 반복문 : while, do-while, for
		
		// 예제 : 평점 입력받고 학점 출력하기
		// A학점 : 90~100, B학점 : 80~89, c학점 : 70~79, D학점 : 60~69, F학점 : 0~59
		
		// 1. 평점 입력
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 2. 각 경우에 맞는 출력 수행
		score/=10; // 편리한 연산을 위한 일의 자리수 제거 score = score / 10; 이랑 똑같다
					// 현재 값을 10으로 나눈 몫으로 변수를 갱신하라. 
		// System.out.println(score);
		switch(score) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default: // else문이랑 유사함, 위 조건을 제외한 나머지
			System.out.println("F학점");
		}
	}
}
