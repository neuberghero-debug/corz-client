package gg.corz;

public record lIiliIiliIiliIil(boolean feasible, float cost, float dealt, int prepTicks) {
   private final float iiilIilIil;
   public static final lIiliIiliIiliIil iIIiIilIil = new lIiliIiliIiliIil(false, 0.0F, 0.0F, 0);
   private final boolean liilIilIil;
   private final float IIIiIilIil;
   private final int lIIiIilIil;

   public int IilliliilIIi() {
      return this.lIIiIilIil;
   }

   public boolean IliIlllilIi() {
      return this.liilIilIil;
   }

   public float iIlIlllllill() {
      return this.IIIiIilIil;
   }

   public float liiiIIllIl() {
      return this.iiilIilIil;
   }

   public lIiliIiliIiliIil(boolean feasible, float cost, float dealt, int prepTicks) {
      this.liilIilIil = feasible;
      this.iiilIilIil = cost;
      this.IIIiIilIil = dealt;
      this.lIIiIilIil = prepTicks;
   }
}
