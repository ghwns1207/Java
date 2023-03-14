class Car3{
	 public String name;		// 어디서든 접근 간으 
	 protected String Color; 	//같은 패키지까지 가능, 상속받은 놈까지 가능
	 boolean gas; 				//디폴트 같은 패키지 내에서만 접근 가능
	 private int modelYear;		//같은 클래스 내에서만 접근 가능 
	 
	 public void internal() {
		name = "에큐스";
		Color = "gold";
		gas = true;
		modelYear = 2013;
	}

	public int getModelYear() { //private 접근 기준을 만족 했을 때 값을 가져오는 
		return modelYear;		//private으로 설정되어 외부 접근이 불가능한 modelYear
	}							//필드의 값을 얻기 위한 public get 메서드 설정

	public void setModelYear(int modelYear) {	//private으로 설정되어 외부 접근 불가능한 
		this.modelYear = modelYear;				// 값 지정을 위한 퍼블릭 set 설정 값 변경 
	}
	 
	 
}
public class MainGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car = new Car3();   //생성자 
		
		System.out.println(car.name);		
		System.out.println(car.gas);
		System.out.println(car.Color);
//		System.out.println(car.modelYear); // private 같은 클래스 내의 필드 값이 아님 접근 불가 
		System.out.println();
		car.internal();
		System.out.println(car.name);		
		System.out.println(car.gas);
		System.out.println(car.Color);
		System.out.println(car.getModelYear()); //퍼블릭 get 메서드 사용 같은 클래스 내의 메서드를 이용 값을 리턴으로 받아옴 
	}

}
