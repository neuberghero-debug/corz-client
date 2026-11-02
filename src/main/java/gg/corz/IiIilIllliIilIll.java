package gg.corz;

record IiIilIllliIilIll(float targetDamage, float selfFull, float selfCost, boolean pops, boolean kills, double denial, boolean safe, double value, float knock) {
   private final float iIlIlIilll;
   private final float lIlIlIilll;
   private final double IilIlIilll;
   private final float IllIlIilll;
   private final boolean lllIlIilll;
   private final boolean illIlIilll;
   private final double iilIlIilll;
   private final boolean lilIlIilll;
   private final float IIiIlIilll;

   public float iIlIlllllill() {
      return this.IllIlIilll;
   }

   public boolean lIiiIiIlilli() {
      return this.illIlIilll;
   }

   public boolean IIIllIIliIIl() {
      return this.lilIlIilll;
   }

   public float IliIlllilIi() {
      return this.lIlIlIilll;
   }

   public float liiiIIllIl() {
      return this.iIlIlIilll;
   }

   public double IlIlllIlilIl() {
      return this.iilIlIilll;
   }

   public float IiIlliIliiIl() {
      return this.IIiIlIilll;
   }

   public boolean IilliliilIIi() {
      return this.lllIlIilll;
   }

   public double iliIiiliiiii() {
      return this.IilIlIilll;
   }

   private IiIilIllliIilIll(
      float targetDamage, float selfFull, float selfCost, boolean pops, boolean kills, double denial, boolean safe, double value, float knock
   ) {
      this.lIlIlIilll = targetDamage;
      this.iIlIlIilll = selfFull;
      this.IllIlIilll = selfCost;
      this.lllIlIilll = pops;
      this.illIlIilll = kills;
      this.IilIlIilll = denial;
      this.lilIlIilll = safe;
      this.iilIlIilll = value;
      this.IIiIlIilll = knock;
   }
}
