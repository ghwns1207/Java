
public class NArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[3][];
		
		for(int i = 0 ; i < a.length; i++) {
			a[i] = new int[3];
		}
		
		int ac = 0;
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j <a[i].length; j++ ) {
				
				a[i][j] = ac++;
			}
		}
		
		for(int i = 0 ; i < a.length; i++) {
			System.out.println();
			for(int v : a[i]) {
				System.out.print(v + " ");
			}
		}
	}

}
