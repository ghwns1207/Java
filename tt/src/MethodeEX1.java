
class MethodeEX1 {
	
	static void gridLine(String str, char line) {
		for(int i = 0; i < str.length(); i++) {
			System.out.print(line);
		}
		System.out.println();
	}
	
	static void messageBox(String str, char line) {
		
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
