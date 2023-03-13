
class Car{
	String name;
	String color;
	boolean gasol;
	boolean check; 
	
	void initData(String name, String color , boolean gasol) {
		this.name = name; 
		this.color = color;
		this.gasol = gasol;
		check = true;
	}
	
	void infoCar() {
		if(check) {			
			System.out.println("차량명 : " + name);
			System.out.println("색상 : " + color);
			if(gasol) System.out.println("내연기관 : 가솔린 차량");
			else System.out.println("내연기관 : 디젤 차량");
		}else System.out.println("정보 입력하자!!!");
				
	}
	
	
	void run() {
		if(gasol) System.out.println("부릉 부릉");
		else System.out.println("덜컹 덜컹 ");
		
	}
	
	void stop() {
		System.out.println("끼이이익");
	}
}
public class ClassObjectEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car pride = new Car();
		Car pride1 = new Car();
		Car pride2 = new Car();
		
		pride.initData("프라이드", "검정", true);
		pride1.initData("k7", "검정", false);
		
		pride.infoCar();
		pride.run();
		pride.stop();
		
		pride1.infoCar();
		pride1.run();
		pride1.stop();
		
		pride2.infoCar();
		pride2.run();
		pride2.stop();
		
	}

}
