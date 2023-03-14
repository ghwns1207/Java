 class Tank1 {
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
		if (check) System.out.printf("탱크명 : %s , 포종류 : %d단계, 미사일 %s \n", name, dp, missile ? "장착" : "미장착");
		else System.out.println("탱크 정보를 입력해주세요!");
	}

	void strings() {
		System.out.printf("\n< %s 공격 >", name);
	}

	void mis() {
		if (missile) System.out.println("\n미사일 발사 : 초전박살");
		else System.out.printf("\n%s 미사일 없음!!!\n", name);
	} 
	
	void dpIn() {
		String st = null;
		
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
	}

	void allAtt() {
		if (check) {
			strings();
			dpIn();
			mis();
		}
	}

	void dpAtt() {
		if (check) {
			strings();
			dpIn();
		}

	}

	void missileAtt() {
		if (check) {
			strings();
			mis();
		}
	}

}

public class ClassObjectEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank1 tank1 = new Tank1();
		Tank1 tank2 = new Tank1();
		Tank1 tank3 = new Tank1();
		Tank1 tank4 = new Tank1();

		tank1.initData("k1", 1, false);
		tank2.initData("k2", 2, false);
		tank3.initData("k3", 3, true);

		tank1.infoTank();
		tank2.infoTank();
		tank3.infoTank();
		tank4.infoTank();

//		tank1.allAtt();
//		tank2.missileAtt();
		tank3.missileAtt();
		tank2.dpAtt();
		tank3.dpAtt();
//		tank3.allAtt();

	}

}
