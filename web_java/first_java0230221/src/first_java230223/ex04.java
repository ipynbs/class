package first_java230223;

class student {
	// ������ + getters
	private String name;
	private String age;
	private int id;
	private String call;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // �� ��ü(this)�� name �Ӽ����� name���� �����Ѵ�.
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}	
}

public class ex04 {
	public static void main(String[] args) {
		// ��ü ����
		student s1 = new student(); // s1 ��ü ����
		s1.setName("lee"); // s1�� ����Ű��, �� ��ü�� �̸��� ������
		student s2 = new student(); // s2 ��ü ����
		s2.setName("kim"); // s2�� ����Ű��, �� ��ü�� �̸��� ������
		
		System.out.println("s1�� �̸� : "+s1.getName());
		System.out.println("s2�� �̸� : "+s2.getName());
		
	}
}
