class Tank13 {
	String tier;
	String name;
	int dp;
	boolean missile;
	boolean nuclear;
	
	Tank13(String tier) {
		this.tier = tier;
	}

	public void infoTank() {
		System.out.println('\n'+ tier);
		System.out.println("탱크명 : " + name);
		System.out.printf("대포 : %d단계\n" , dp);
		System.out.printf("미사일 %s장착\n",missile ? "" : "미 ");
		System.out.printf("핵미사일 %s장착\n\n",nuclear ? "" : "미 ");
	}
	
	private void printTankName() {
		System.out.printf("\n< %s 공격 >\n", name);
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

	private void attackHackMissile() {
		System.out.println("핵미사일 발사 : 뿌움!!!");

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

	public void attHackMissile() {
		if (nuclear) {
			printTankName();
			attackHackMissile();
		}
	}

}

class Tier11 extends Tank13 {
	{
		name = "k1";
		dp = 1;
		missile = false;
		nuclear = false;
	}
	Tier11(String tier) {
		super( tier);
	}
	
	
}

class Tier12 extends Tank13 {
	{
		name = "k2";
		dp = 2;
		missile = true;
		nuclear = false;
	}

	Tier12(String tier) {
		super(tier);
	
	}
	

}

class Tier13 extends Tank13 {
	{
		name = "k3";
		dp = 3;
		missile = true;
		nuclear = true;
	}

	Tier13(String tier) {
		super(tier);
	
	}
	
}

public class ExtendsMainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tier11 k1 = new Tier11("Tier1");
		Tier12 k2 = new Tier12("Tier2");
		Tier13 k3 = new Tier13("Tier3");
		
		
		k1.infoTank();
		k2.infoTank();
		k3.infoTank();
		
		k1.attDp();
		k2.attDp();
		k3.attDp();
		
		k1.attMissile();
		k2.attMissile();
		k3.attMissile();
		
		k1.attHackMissile();
		k2.attHackMissile();
		k3.attHackMissile();
	}
	

}
