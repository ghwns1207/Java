
public class OverLoding {
	
	static int add(int a, int b){
		return a+b;
	}
	
	static int add(int a, int b, int c){
		return a+b+c;
	}
	
	static double add(double a, double b){
		return a+b;
	}
	
//	static long add(int a, int b){		//메서드의 오버로딩은 인수의 갯수니 타입네 의해 결정되며 리턴 타입은 
//		return a+b;						// 오버로딩의 요건이 되지 못함
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1, 2));		// 같은 메서드도 인수에 맞게 찾아는 기능  
		System.out.println(add(1, 2 ,3));
		System.out.println(add(1.2, 2.));	

	}

}
