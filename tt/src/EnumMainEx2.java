enum TankTier {
	TIER1("1단계", 30, 1), TIER2("2단계", 50, 2), TIER3("3단계", 70, 3, true, false), TIER4("4단계", 100, 3, true, true);

	private final String tier;
	final int ngd;
	final int dp;
	boolean missile;
	boolean nuclear;

	TankTier(String tier, int ngd, int dp) {
		this.tier = tier;
		this.ngd = ngd;
		this.dp = dp;

	}

	TankTier(String tier, int ngd, int dp, boolean missile, boolean nuclear) {
		this(tier, ngd, dp);
		this.missile = missile;
		this.nuclear = nuclear;
	}

	public String getTier() {
		return tier;
	}

//	public void infoTier() {
//		System.out.println("티어 : " + tier);
//		System.out.println("내구도 : " + ngd);
//		System.out.println(dp + "단계 포 장착");
//		System.out.printf("미사일 %s장착\n", missile ? "" : "미 ");
//		System.out.printf("핵미사일 %s장착\n\n", nuclear ? "" : "미 ");
//	}
//	

}

class Tank11 {
	String name;
	TankTier tanktier;
	static int count;
	int countTank;
	Tank11(String name, TankTier tanktier) {
		this.name = name;
		this.tanktier = tanktier;
		countTank =  ++count;
	}

	public void Specview() {
		System.out.printf("< %d번쨰 전차 >\n", countTank);
		System.out.println("탱크명 : " + name);
//		tanktier.infoTier();
		System.out.println("티어 : " + tanktier.getTier());
		System.out.println("내구도 : " + tanktier.ngd);
		System.out.println(tanktier.dp + "단계 포 장착");
		System.out.printf("미사일 %s장착\n", tanktier.missile ? "" : "미 ");
		System.out.printf("핵미사일 %s장착\n\n", tanktier.nuclear ? "" : "미 ");
	}

	private void printTankName() {
		System.out.printf("\n< %s 공격 >\n", name);
	}

	private void attackCannon() {
		String boom = null;

		switch (tanktier.dp) {
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

	private void attackHackMissile() {
		System.out.println("핵미사일 발사 : 뿌움!!!");

	}

	public void attDp() {
		printTankName();
		attackCannon();
	}

	public void attMissile() {
		if (tanktier.missile) {
			printTankName();
			attackMissile();
		}
	}

	public void attHackMissile() {
		if (tanktier.nuclear) {
			printTankName();
			attackHackMissile();
		}
	}

}

public class EnumMainEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank11 k1 = new Tank11("K1전차", TankTier.TIER1);
		Tank11 k1a1 = new Tank11("K1A1전차", TankTier.TIER2);
		Tank11 k1a2 = new Tank11("K1A2전차", TankTier.TIER3);
		Tank11 x2 = new Tank11("X2흑표전차", TankTier.TIER4);
		k1.Specview();
		k1a1.Specview();
		k1a2.Specview();
		x2.Specview();
		
		x2.attHackMissile();
		x2.attDp();
		k1a2.attMissile();
		
		k1.attDp();
		k1a1.attMissile();

	}

}
