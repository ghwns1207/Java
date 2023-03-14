class Car4{
	String name;
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 pride = new Car4();
		
		pride.name = "프라이드";
		System.out.println(pride.name);
		
		method(pride);						//Car 형 실인수에 pride 객체의 참조(주소) 대입.
		System.out.println(pride.name);
		
	}
		
	static void method(Car4 c) {			// 객체 타입 c 
		c.name = "실수";						//메서드의 클래스형 매개변수 대입 또한 객체의 참조(주소) 대입
	}

}
