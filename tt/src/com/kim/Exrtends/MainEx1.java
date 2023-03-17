package com.kim.Exrtends;

class Tank20 {
   String tankName;
   int cannon;

   public Tank20(String tankname, int cannon) {
      this.tankName = tankname;
      this.cannon = cannon;
   }

   public void infoTank() {
      System.out.printf("탱크명 : %s\n", tankName);
      System.out.printf("대포 : %d단계\n", cannon);
   }

   public void printTankName() {
      System.out.printf("\n\n< %s 탱크 >\n", tankName);
   }

   public void fireCannon() {
      printTankName();
      System.out.println("대포발사 : 펑");
   }
}

class Tier21 extends Tank20 {
   public Tier21(String tankname, int cannon) {
      super(tankname, cannon);
   }

   @Override
   public void infoTank() {
      super.infoTank();
      System.out.println("미사일 미장착");
      System.out.println("핵미사일 미장착");
      System.out.println();
   }
}

class Tier22 extends Tank20 {
   public Tier22(String tankname, int cannon) {
      super(tankname, cannon);
   }

   @Override
   public void infoTank() {
      super.infoTank();
      System.out.println("미사일 장착");
      System.out.println("핵미사일 미장착");
      System.out.println();
   }

   @Override
   public void fireCannon() {
      printTankName();
      System.out.println("대포발사 : 펑펑");
   }

   public void fireMissile() {
      printTankName();
      System.out.println("미사일 발사");
   }
}

class Tier23 extends Tank20 {
   public Tier23(String tankname, int cannon) {
      super(tankname, cannon);
   }

   @Override
   public void infoTank() {
      super.infoTank();
      System.out.println("미사일 장착");
      System.out.println("핵미사일 장착");
      System.out.println();
   }

   @Override
   public void fireCannon() {
      printTankName();
      System.out.println("대포발사 : 펑펑펑");
   }

   public void fireMissile() {
      printTankName();
      System.out.println("미사일 발사 : 초전박살");
   }

   public void fireNuclear() {
      printTankName();
      System.out.println("핵미사일 발사 : 지구멸망");
   }
}

public class MainEx1 {
   public static void testTank(Tank20 tank) {
      tank.fireCannon();
   }

   public static void main(String[] args) {
      Tank20[] tank = {
            new Tier21("K1", 1),
            new Tier22("K2", 2),
            new Tier23("K3", 3),
      };
      
      
      for(Tank20 t:tank) {
         testTank(t);
      }
   }
}