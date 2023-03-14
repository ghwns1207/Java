class Time{
	boolean am; 
	int hour; 
	int minute;
	int second;
	
	Time(int hour , int minute){
		this.hour = hour;
		this.minute = minute;
	}
	
	Time(boolean am, int hour , int minute){
		this(hour,minute);
		this.am = am;
	}
	
	Time(boolean am, int hour , int minute, int second){
		this(am,hour,minute);
		this.second = second;
	}
	// 결과는 동일하지만 생성자간 초기화의 위임은 이와 같이 넓은 인수 범위에서 좁은 인수범위로 
	// 위임하는 것이 유리. 이 경우 this 생성자를 통해 위임할 인수만 전달하고 해당하지 않는 인수는
	// 직접 초기화를 시키면 되지만 반대의 경우 추가 디폴트 값을 지정해야 하는 불편 발생 
	
	void whatTime() {
		System.out.println(am ? "오전": "오후");
		System.out.println(hour + "시" + minute + "분" + second + "초 ");
	}
	
}
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time1 = new Time(true ,11, 30 ,15);
		Time time2 = new Time(true ,11, 30 );
		Time time3 = new Time(11, 30);
		
		time1.whatTime();
		time2.whatTime();
		time3.whatTime();

	}

}
