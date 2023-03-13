class Tank {
	String name;
	int dp;
	boolean missile;
	boolean check;

	void initData(String name, int dp, boolean missile) {
		this.name = name;
		this.dp = dp;
		this.missile = missile;
		check = true;

	}

	void infoTank() {
		if (check)
			System.out.printf("탱크명 : %s , 포종류 : %d단계, 미사일 %s \n", name, dp, missile ? "장착" : "미장착");
		else
			System.out.println("탱크 정보를 입력해주세요!");
	}

	void att() {
		if(check) {
			String st = null;
			System.out.printf("\n< %s 공격 >", name);
			switch (this.dp) {
			case 1:
				st = "평";
				break;
			case 2:
				st = "평펑";
				break;
			case 3:
				st = "콰쾅";
				break;
			}
			System.out.printf("\n대포발사 : %s \n", st);
			
//		if(this.dp == 1 || this.dp == 2) {
//			for(int i = 0 ; i < this.dp ; i++) {
//				System.out.print("펑");
//			}
//		}else System.out.println("콰쾅");
			
			if (missile) System.out.println("미사일 발사 : 초전박살");
		}
	}

}

public class ClassObjectEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank tank1 = new Tank();
		Tank tank2 = new Tank();
		Tank tank3 = new Tank();
		Tank tank4 = new Tank();

		tank1.initData("k1", 1, false);
		tank2.initData("k2", 2, false);
		tank3.initData("k3", 3, true);
	

		tank1.infoTank();
		tank2.infoTank();
		tank3.infoTank();
		tank4.infoTank();

		tank1.att();
		tank2.att();
		tank3.att();
		tank4.att();

	}

}
