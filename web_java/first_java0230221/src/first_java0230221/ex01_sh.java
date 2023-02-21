package first_java0230221;

import java.util.Scanner;

public class ex01_sh {
	// 문제 1. 2개의 정수를 입력받고 5가지의 사칙연산 결과 출력하기(+,-,*,/,%)
	public static void main(String args[]) {
		int i = 5;
		int j = 2;
		System.out.printf("더하기 : %d+%d=%d\n",i,j,i+j);
		System.out.printf("뺴기 : %d-%d=%d\n",i,j,i-j);
		System.out.printf("곱하기 : %d*%d=%d\n",i,j,i*j);
		System.out.printf("나누기 : %d/%d=%d\n",i,j,i/j);
		System.out.printf("나머지 : %d%%%d=%d\n",i,j,i%j);

		System.out.print("2개의 정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("더하기 : %d\n",a+b);
		System.out.printf("빼기 : %d\n",a-b);
		System.out.printf("곱하기 : %d\n",a*b);
		System.out.printf("나누기 : %d\n",a/b);
		System.out.printf("나머지 : %d\n",a%b);
		
		System.out.print("2개의 정수를 입력하세요 : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		// 2. 결과값 바로 출력하기
		System.out.println("덧셈 결과: "+(num1+num2));
		System.out.println("뺄셈 결과: "+(num1-num2));
		System.out.println("곱셈 결과: "+(num1*num2));
		System.out.println("몫 나누기 결과: "+(num1/num2));
		System.out.println("나머지 나누기 결과: "+(num1%num2));
	}
}
