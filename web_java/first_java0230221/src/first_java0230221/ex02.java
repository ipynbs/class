package first_java0230221;
import java.util.*;

public class ex02 {
	public static void main(String args[]) {
		// ���ǹ� : if-else if-else, switch
		// �ݺ��� : while, do-while, for
		
		// ���� : ���� �Է¹ް� ���� ����ϱ�
		// A���� : 90~100, B���� : 80~89, c���� : 70~79, D���� : 60~69, F���� : 0~59
		
		// 1. ���� �Է�
		System.out.print("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 2. �� ��쿡 �´� ��� ����
		score/=10; // ���� ������ ���� ���� �ڸ��� ���� score = score / 10; �̶� �Ȱ���
					// ���� ���� 10���� ���� ������ ������ �����϶�. 
		// System.out.println(score);
		switch(score) {
		case 10:
		case 9:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		case 7:
			System.out.println("C����");
			break;
		case 6:
			System.out.println("D����");
			break;
		default: // else���̶� ������, �� ������ ������ ������
			System.out.println("F����");
		}
	}
}
