package first_java230223;

class student {
	// 돋보기 + getters
	private String name;
	private String age;
	private int id;
	private String call;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // 이 객체(this)의 name 속성값을 name으로 설정한다.
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
		// 객체 생성
		student s1 = new student(); // s1 객체 생성
		s1.setName("lee"); // s1을 가리키며, 이 객체의 이름을 변경함
		student s2 = new student(); // s2 객체 생성
		s2.setName("kim"); // s2을 가리키며, 이 객체의 이름을 변경함
		
		System.out.println("s1의 이름 : "+s1.getName());
		System.out.println("s2의 이름 : "+s2.getName());
		
	}
}
