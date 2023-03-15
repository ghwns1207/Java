class Hello{
	static void moring() {				//정적 메서드 
		System.out.println("좋은 아침");
	}
	static void lunch() {
		System.out.println("밥 묵자");
	}
	static void evning() {
		System.out.println("술먹자");
	}
	
}
public class StaticMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello.moring();					// 정적 필드와 마찬가지로 클래스에 소속되어 객체 생성 없이 클래스를 통해 직접 호출 가능 
		Hello.lunch();
		Hello.evning();
	}

}
