package gg.corz;

record lIlllIiliIlllIil(String why, double min, double ideal, double max, boolean offense, boolean defensive, boolean flee, boolean heal) {
   private final boolean IIIIiIlIil;
   private final boolean lIIIiIlIil;
   private final double IiiilIlIil;
   private final double iliilIlIil;
   private final boolean iiiilIlIil;
   private final boolean iIIIiIlIil;
   private final String lliilIlIil;
   private final double liiilIlIil;

   public double liiiIIllIl() {
      return this.iliilIlIil;
   }

   public boolean IlIlllIlilIl() {
      return this.iIIIiIlIil;
   }

   public double iIlIlllllill() {
      return this.IiiilIlIil;
   }

   public String IliIlllilIi() {
      return this.lliilIlIil;
   }

   public boolean lIiiIiIlilli() {
      return this.iiiilIlIil;
   }

   public double IilliliilIIi() {
      return this.liiilIlIil;
   }

   public boolean IIIllIIliIIl() {
      return this.lIIIiIlIil;
   }

   public boolean iliIiiliiiii() {
      return this.IIIIiIlIil;
   }

   private lIlllIiliIlllIil(String why, double min, double ideal, double max, boolean offense, boolean defensive, boolean flee, boolean heal) {
      this.lliilIlIil = why;
      this.iliilIlIil = min;
      this.IiiilIlIil = ideal;
      this.liiilIlIil = max;
      this.iiiilIlIil = offense;
      this.IIIIiIlIil = defensive;
      this.lIIIiIlIil = flee;
      this.iIIIiIlIil = heal;
   }
}
