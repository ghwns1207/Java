class Car6{
	String name;
	String color;
	boolean gasol;
	
	Car6(String aname, String acolor, boolean gasol){   // 생성자의 형식 : 리턴 값이 없는 클래스명과 명칭이 동일한 메서드 형태 
 		name = aname;		   							// 객체 생성시 초기화를 시켜주는 특별한 메서드로써 객체 생성시 자동 호출함		
		color = acolor;									// 필드명과 매개변수명이 동일한 경우 this 키워드로 구분 ,this 는 객체 자신을 으미
		this.gasol = gasol;
	}
	
	void rus() {
		if(gasol) System.out.println("부릉 부릉");
		else System.out.println("덜컹");
	}
	
	void stop() {
		System.out.println("끼익");
	}
}
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car6 name = new Car6("프라이드", "파랑" , true);	//객체 생성시 실인수로 값 전달 
		
		name.rus();
		name.stop();
	}

}
