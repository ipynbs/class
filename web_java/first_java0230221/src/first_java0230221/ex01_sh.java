package first_java0230221;

import java.util.Scanner;

public class ex01_sh {
	// ���� 1. 2���� ������ �Է¹ް� 5������ ��Ģ���� ��� ����ϱ�(+,-,*,/,%)
	public static void main(String args[]) {
		int i = 5;
		int j = 2;
		System.out.printf("���ϱ� : %d+%d=%d\n",i,j,i+j);
		System.out.printf("���� : %d-%d=%d\n",i,j,i-j);
		System.out.printf("���ϱ� : %d*%d=%d\n",i,j,i*j);
		System.out.printf("������ : %d/%d=%d\n",i,j,i/j);
		System.out.printf("������ : %d%%%d=%d\n",i,j,i%j);

		System.out.print("2���� ������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("���ϱ� : %d\n",a+b);
		System.out.printf("���� : %d\n",a-b);
		System.out.printf("���ϱ� : %d\n",a*b);
		System.out.printf("������ : %d\n",a/b);
		System.out.printf("������ : %d\n",a%b);
		
		System.out.print("2���� ������ �Է��ϼ��� : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		// 2. ����� �ٷ� ����ϱ�
		System.out.println("���� ���: "+(num1+num2));
		System.out.println("���� ���: "+(num1-num2));
		System.out.println("���� ���: "+(num1*num2));
		System.out.println("�� ������ ���: "+(num1/num2));
		System.out.println("������ ������ ���: "+(num1%num2));
	}
}
