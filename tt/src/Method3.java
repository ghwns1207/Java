
public class Method3 {
	
	static int add(int... a) {				// 가변 인수 문법 : 타입... 형식인수 
		int s = 0;							// 동일 타입의 인수 여러 개를 배열 형태로 전달 받음 
											// 가변 인수의 다른 타입의 형식인수 지정도 가능하나, 가변 인수가 항상 다른 타입의 인수보다 뒤에 와야 함에 주의 
		for(int i : a) s +=i;
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {7 , 8 , 9 , 10};
		
		System.out.println(add(1 , 2));
		System.out.println(add(1 , 2 , 4 , 56));
		System.out.println(add(1 , 2 , 5 ,2, 4));
		System.out.println(add( ar ));				// 배열의 참조 또한 가변인수로 전달 가능하며 이는 단순히 값이 복사가 아닌,
													// 배열의 연속성에 의한 가변인수를 통힌 베열 전체 요소의 참조순회를 의미 
		System.out.println(add( new int[] {7 , 7} ));  //임시 생성한 배열 요소도 전달 가능.
		
	}

}
