class Car10{
	String name;
	static int carNum;		// 정적멈버는 클래스 소속 되므로 다수의 객체를 생성하더라도 하나의 메모리 공간만을 할당
							// 정적 변수에 대한 선언시 초기화는 최초 클래스 사용시에만 초기화가 이루어지며 이후 객체
	Car10(String name){		// 객체 생성시에는 적용되지 않아 객체 생성 시 마다 값의 누적이 가능
		this.name = name;	// 모든 객체가 동일한 carNum의 기억공간을 가지고 있음
		carNum++;
	}
}
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Car10.carNum); // 정적 멤버는 클래스 소속되므로 객체 생성 없이 클래스를 통해 접근가능.

		Car10 name1 = new Car10("name1");
		Car10 name2 = new Car10("name2");
		Car10 name3 = new Car10("name3");
		
		System.out.println(Car10.carNum);
		System.out.println(name1.carNum); // 객체를 통해서도 접근은 가능하나 클래스를 통한 접근이 원칙.
	}

}
