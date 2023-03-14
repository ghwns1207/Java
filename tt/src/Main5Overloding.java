
class Car5{    
	
	String name;
	String color;
	boolean gasol;
	
	Car5(String name){				// 생성자 오버로딩 
		this.name = name;
	}
	
//	Car5(String name , String color){
//		this.name = name;
//		this.color = color;
//	}
	
	Car5(String name, String color, boolean gasol ){
		this(name);	// 생성자 간 호출 방식(위임) : "this(실인수);", 소괄호 안에 실인수를 지정함으로써 오버로딩 인수 형식에 맞는 다른 생성자 호출
//		this(name, color);
		this.color = color;			// this 생성자 호출 구문은 다른 필드 초기식 보다 항상 순두여야 함 
		this.gasol = gasol;
	}
	
	
}
public class Main5Overloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car5 name1 = new Car5("프라이드");					// 실인수에 맞는 생성자가 없으므로 생성자 미 정의 오류 발생, 객체 생성시 메서드와
		Car5 name2 = new Car5("프라이드" , "골드" , true);	// 마찬가지로 생성자의 실인수를 생략하거나 추가로 인수 지정을 해서는 안되며 타입 또한 일치해야됨
//		Car5 name3 = new Car5("프라이드" , "골드");

	}

}
