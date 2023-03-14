class Student{
	// 명시적(필드) 초기화 호출 순위 1
	String instructor ="박성연";
	String name;
	int kor;
	int math;
	int eng;
	int hist = -1 ;
	int sum;
	int avg;
	
	{	//  { 초기화 블럭  }  초기화 블럭 호출 순위 2 
		// 초기화 블럭에 대한 설계는 이와 같이 생성자를 통해 전달된 인수와 
		// 관계없는 공통적인 필드 값ㅇ ㅔ대한 초기화나 연산만 처리해야 함.
		System.out.println("강사는 " + instructor + "님 입니다");
	}
	
	Student(String name ,int kor, int math, int eng){
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		calcuration();
	}
	
	 Student(String name ,int kor, int math, int eng, int hist  ) {
		this(name,kor,math,eng);
		this.hist = hist;
		calcuration();
	}
	
	void calcuration() {
		if(hist <= -1) {
			sum = kor+math+eng;
			avg = sum/3;
		}else {
			sum = kor+math+eng+hist;
			avg = sum/4;
		}
	}
	
	void outputScore() {
		System.out.printf("학생 %s는 총점 %d점이고 평균 %d점입니다.\n\n" ,name ,sum ,avg);
	}
}


public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 초기화 호출 순위 3 
		Student name1 = new Student("A", 90, 90 ,90);
		Student name2 = new Student("B", 80, 80 ,80 ,80);
		
		name1.outputScore();
		name2.outputScore();
	}

}
