
class MethodeEX1 {
	
	static void gridLine(String str, char line) {
		for(int i = 0; i < str.length(); i++) {     // length 메소드 호출 배열은 랭스 필드 , 필드는 데이터를 저장하는 , 메서드는 기능을 
			System.out.print(line);					// 배열은 필드 랭스로 값을 뽑음, 스트링은 메서드`를 통해 길이 뽑는다 
		}
		System.out.println();
	}
	
	static void messageBox(String str, char line) {  //문자열 String  문자 char 
		
		gridLine(str , line);
		System.out.println(str);
		gridLine(str , line);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "| Hellow |"; 
		String str2 = "| Congratulatin |"; 
		
		messageBox(str1 , '-');       
		messageBox(str2 , '=');

	}

}
