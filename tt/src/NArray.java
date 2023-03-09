
public class NArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][3];          //크기가 같으면 축약 
		int[] as = { 2 , 5 , 10};
		for(int i = 0 ; i < a.length; i++) {		//크기가 다르면 이렇게 
			a[i] = new int[as[i]];
		}
		
		int ac = 0;
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j <a[i].length; j++ ) {
				
				a[i][j] = ac++;
			}
		}
		System.out.println();
		
		for(int i =0 ; i<a.length ; i++) {
			for(int j =0 ; j<a[i].length ; j++) {
				System.out.printf("%2d" , a[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.println();
			for(int v : a[i]) {
				System.out.print(v + " ");
			}
			
		}
		System.out.println();
		
		for(int[] i :a) {
			for(int j :i) {
				System.out.printf("%2d" , j);
			}
			System.out.println();
		}
		
		
	}

}
