package first_java0230221;
import java.util.Scanner; // import : 라이브러리를 해당 파일에 포함할 때 사용, 입력을 받으려할때 무조건 있어야함
// import java.util.*; // *은 안에있는 모든 함수를 가져오겠다

public class Hello {
	// 메인클래스를 기점으로 실행이됨
	// 자바는 특히나 대소문자 엄격함 ;
	public static void main(String args[]) { // 메인 코드
		// 출력문 : print, printf, println 
		System.out.print("print 사용 :: hello world!!!\n"); // 명령문 실행 Ctrl + F11
		System.out.printf("printf 사용 :: %s\n", "hello world!!!");
		System.out.printf("println 사용 :: hello world!!!");
		
		// 입력문
		Scanner sc = new Scanner(System.in); // Scanner 정의, 사용하겠다고 선언
		int i = sc.nextInt(); // int형 입력문
		double d = sc.nextDouble(); // double형 입력문
		char c = sc.next().charAt(0); // char형 입력문
		String s = sc.next(); // String형 입력문
		boolean b = sc.nextBoolean(); // Boolearn형 입력문
	}
}
