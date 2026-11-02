package gg.corz;

public record iIlIllllIllIllll(boolean aggressive, int fightRange, float turnScale, boolean strafe, boolean jumpReset, boolean crits) {
   private final float iilIilIill;
   public static final iIlIllllIllIllll IliIilIill = new iIlIllllIllIllll(false, 16, 1.0F, true, true, true);
   private final boolean IilIilIill;
   private final boolean IIiIilIill;
   private final boolean iIiIilIill;
   private final boolean lIiIilIill;
   private final int lilIilIill;

   public boolean iliIiiliiiii() {
      return this.iIiIilIill;
   }

   public boolean IilliliilIIi() {
      return this.IIiIilIill;
   }

   public float iIlIlllllill() {
      return this.iilIilIill;
   }

   public boolean IliIlllilIi() {
      return this.IilIilIill;
   }

   public boolean lIiiIiIlilli() {
      return this.lIiIilIill;
   }

   public int liiiIIllIl() {
      return this.lilIilIill;
   }

   public iIlIllllIllIllll(boolean aggressive, int fightRange, float turnScale, boolean strafe, boolean jumpReset, boolean crits) {
      this.IilIilIill = aggressive;
      this.lilIilIill = fightRange;
      this.iilIilIill = turnScale;
      this.IIiIilIill = strafe;
      this.lIiIilIill = jumpReset;
      this.iIiIilIill = crits;
   }
}
