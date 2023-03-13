
class DataBox{
	// 클래스 내부는 참조형 디폴트 값으로 초기화
	int n;
	double d;
	String str;
	boolean initText ;					 		// boolean 디폴트 값 false 
	
	void initData(int n , double d , String str) { // 매개변수와 필드 이름이 같으면 가까운 놈으로 받음 
		//this는 객체의 자기자신 , 필드의 값  = 매개변수 
		this.n = n;
		this.d = d;
		this.str = str;
		initText = true;						// 값을 초기화하면 true 
		
	}
	
	// 내부에서 바로 접근 가능 
	void outputData() {         				// 초기화 체크 방어 코드 
		if(initText) {
			System.out.printf(" n = %d\n" , n);
			System.out.printf(" d = %f\n" , d);
			System.out.printf(" str = %s\n" , str);
			System.out.println();			
		}else {
			System.out.println("초기화 해라!!\n\n");
		}
	}
}



public class ClassObject {

	public static void main(String[] args) {
		int n; // 가비지 값으로 초기화 
		
		DataBox dataBox1 = new DataBox();  // 생성자 호출 객체는 메서드 처럼  new 연산자 새로운 공간, 참조 주소 할당 
		DataBox dataBox2 = new DataBox();  // 생성자 호출 객체는 메서드 처럼  각각 프레임(틀) 받음 
		
//		dataBox1.n = 1;
//		dataBox1.d = 1.1;
//		dataBox1.str = "테스트1";
//		
//		dataBox2.n = 2;
//		dataBox2.d = 2.2;
//		dataBox2.str = "테스트2";
		
		dataBox1.initData(1, 1.1, "테스트1");
		dataBox2.initData(2, 2.2, "테스트2");
		
		dataBox1.outputData();      // 필드나 메서드에 접근시 멤버 연산자 
		dataBox2.outputData();
	}

}
