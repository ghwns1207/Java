package com.kim.main;

interface Operator {
	char getOpChar();
	int test(int n1, int n2);						// 함수형 인터페이스 추상 메서드가 하나만 있어야 가능 
}

class Sum implements Operator{					//재활용 서브객체 인터페이스 구현 
	char opChar = '+';
	public int test(int n1, int n2) {
		return n1 + n2;
	}
	@Override
	public char getOpChar() {
		// TODO Auto-generated method stub
		return opChar;
	}
	
}
class Sub implements Operator{
	char opChar = '-';
	public int test(int n1, int n2) {
		return n1 - n2;
	}
	@Override
	public char getOpChar() {
		// TODO Auto-generated method stub
		return opChar;
	}
}
class Mul implements Operator{
	char opChar = '*';
	public int test(int n1, int n2) {
		return n1 * n2;
	}
	@Override
	public char getOpChar() {
		// TODO Auto-generated method stub
		return opChar;
	}
}
class Div implements Operator{
	char opChar = '/';
	public int test(int n1, int n2) {
		return n1 / n2;
	}
	@Override
	public char getOpChar() {
		// TODO Auto-generated method stub
		return opChar;
	}
}

public class InterfaceMainEx {

	public static void calculator(int n1, int n2, Operator op) { // 인터페이스 타입으로 받기

		System.out.printf("%d %c %d = %d\n",n1, op.getOpChar(), n2,  op.test(n1, n2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		calculator(10, 5, (n1 , n2) -> n1+n2); //람다식 함수형 인터페이스만 사용가능 
//		calculator(10, 5, new Operator() { // 일회성은 익명 객체를 사용 슈퍼클래스명() { } 타입 체크 불가 
//			public int test(int n1, int n2) {
//				return n1 + n2;
//			}
//		});
//		calculator(10, 5, new Operator() {
//			public int test(int n1, int n2) {
//				return n1 - n2;
//			}
//		});
//		calculator(10, 5, new Operator() {
//			public int test(int n1, int n2) {
//				return n1 * n2;
//			}
//		});
//		calculator(10, 5, new Operator() {
//			public int test(int n1, int n2) {
//				return n1 / n2;
//			}
//		});
		
		calculator(10, 5, new Sum());
		calculator(10, 5, new Sub());
		calculator(10, 5, new Mul());
		calculator(10, 5, new Div());

	}

}
