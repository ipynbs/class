package first_java0230221;
import java.util.Scanner; // import : ���̺귯���� �ش� ���Ͽ� ������ �� ���, �Է��� �������Ҷ� ������ �־����
// import java.util.*; // *�� �ȿ��ִ� ��� �Լ��� �������ڴ�

public class Hello {
	// ����Ŭ������ �������� �����̵�
	// �ڹٴ� Ư���� ��ҹ��� ������ ;
	public static void main(String args[]) { // ���� �ڵ�
		// ��¹� : print, printf, println 
		System.out.print("print ��� :: hello world!!!\n"); // ��ɹ� ���� Ctrl + F11
		System.out.printf("printf ��� :: %s\n", "hello world!!!");
		System.out.printf("println ��� :: hello world!!!");
		
		// �Է¹�
		Scanner sc = new Scanner(System.in); // Scanner ����, ����ϰڴٰ� ����
		int i = sc.nextInt(); // int�� �Է¹�
		double d = sc.nextDouble(); // double�� �Է¹�
		char c = sc.next().charAt(0); // char�� �Է¹�
		String s = sc.next(); // String�� �Է¹�
		boolean b = sc.nextBoolean(); // Boolearn�� �Է¹�
	}
}
