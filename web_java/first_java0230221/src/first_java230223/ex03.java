package first_java230223;

class Person { // ��� Ŭ����
	// private(����x), public(����o)
	// private �� �ٸ������� �Ժη� �������� ���ϰ� ��
	// �Ӽ� ���� :: [����������] [�ڷ���] [�Ӽ��̸�]
	// �Ӽ� ���� ��, ���� ���������ڴ� private ���� �����Ѵ�
	private String name; // �Ӽ� (�ʵ�)
	private int age;
	private double height;
	
	// �޼ҵ� (�Լ�) => get �Լ� :: Ư�� �Ӽ��� ���� ���� �Լ�
	// [����������] [��ȯ��] {��ɹ�;)
	public String getName() {
		return name;
	}
	//            => set �Լ� :: Ư�� �Ӽ��� ���� �����ϴ� �Լ�
	public void setName(String n) {
		name = n;
	}
	
}

public class ex03 {
	public static void main(String[] args) {
		// ��ü :: �ǻ�Ȱ���� �츮�� �� �� �ִ� ��ü (Ŭ������ ���� ������� ��)
		// Ŭ���� :: ��ü�� ������ Ʋ
		
		// ��ü �����ϴ� ���
		// �ڷ��� �����̸�
		// ��ü ���� �� ��� ȣ��
		
		// [Ŭ������] [��ü�̸�] 
		Person lee = new Person(); // ��ü lee ����
		lee.setName("lee");
		Person park = new Person(); // ��ü park ����
	}
}
