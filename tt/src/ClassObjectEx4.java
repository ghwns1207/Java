class Tank2 {
	private String name;
	private int dp;
	private boolean missile;

	public Tank2(String name, int dp) {
		this.name = name;
		this.dp = dp;
	}

	public Tank2(String name, int dp, boolean missile) {
		this(name, dp);
		this.missile = missile;
	}

	public void infoTank() {
		System.out.printf("탱크명 : %s, ", name);
		System.out.printf("포종류 : %d단계, ", dp);
		System.out.printf("미사일 %s장착\n", missile ? "" : "미");
	}

	private void printTankName() {
		System.out.printf("\n\n< %s 공격 >\n", name);
	}

	private void attackCannon() {
		String boom = null;

		switch (dp) {
		case 1:
			boom = "펑";
			break;
		case 2:
			boom = "펑펑";
			break;
		case 3:
			boom = "콰쾅";
			break;
		}

		System.out.printf("대포발사 : %s\n", boom);
	}

	private void attackMissile() {
		System.out.println("미사일 발사 : 초전박살");

	}

	public void attDp() {
		printTankName();
		attackCannon();
	}

	public void attMissile() {
		if (missile) {
			printTankName();
			attackMissile();
		}
	}

	public void attack() {
		if (missile) {
			printTankName();
			attackCannon();
			attackMissile();
		}
	}

}

public class ClassObjectEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank2 tank1 = new Tank2("K1", 1);
		Tank2 tank2 = new Tank2("K2", 2);
		Tank2 tank3 = new Tank2("K3", 3, true);

		tank1.infoTank();
		tank2.infoTank();
		tank3.infoTank();

		tank1.attDp();
		tank2.attDp();
		tank3.attDp();

		tank1.attMissile();
		tank2.attMissile();
		tank3.attMissile();

		tank1.attack();
		tank2.attack();
		tank3.attack();

	}

}
