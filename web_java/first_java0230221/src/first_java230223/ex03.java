package first_java230223;

class Person { // 사람 클래스
	// private(공개x), public(공개o)
	// private 은 다른곳에서 함부로 접근하지 못하게 함
	// 속성 선언 :: [접근제어자] [자료형] [속성이름]
	// 속성 선언 시, 보통 접근제어자는 private 으로 설정한다
	private String name; // 속성 (필드)
	private int age;
	private double height;
	
	// 메소드 (함수) => get 함수 :: 특정 속성의 값을 뱉어내는 함수
	// [접근제어자] [변환형] {명령문;)
	public String getName() {
		return name;
	}
	//            => set 함수 :: 특정 속성의 값을 수정하는 함수
	public void setName(String n) {
		name = n;
	}
	
}

public class ex03 {
	public static void main(String[] args) {
		// 객체 :: 실생활에서 우리가 볼 수 있는 실체 (클래스로 인해 만들어진 것)
		// 클래스 :: 객체를 만들어내는 틀
		
		// 객체 생성하는 방법
		// 자료형 변수이름
		// 객체 생성 및 멤버 호출
		
		// [클래스명] [객체이름] 
		Person lee = new Person(); // 객체 lee 생성
		lee.setName("lee");
		Person park = new Person(); // 객체 park 생성
	}
}
