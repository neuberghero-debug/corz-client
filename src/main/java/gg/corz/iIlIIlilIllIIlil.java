package gg.corz;

public record iIlIIlilIllIIlil(boolean ok, String why, float targetDamage, float selfFull, float selfCost, double value) {
   private final String liiliilIil;
   private final float lIIiiilIil;
   private final double iIIiiilIil;
   private final boolean IiiliilIil;
   private final float iiiliilIil;
   private final float IIIiiilIil;

   public boolean IliIlllilIi() {
      return this.IiiliilIil;
   }

   public float IilliliilIIi() {
      return this.IIIiiilIil;
   }

   public String liiiIIllIl() {
      return this.liiliilIil;
   }

   public float lIiiIiIlilli() {
      return this.lIIiiilIil;
   }

   public double iliIiiliiiii() {
      return this.iIIiiilIil;
   }

   public iIlIIlilIllIIlil(boolean ok, String why, float targetDamage, float selfFull, float selfCost, double value) {
      this.IiiliilIil = ok;
      this.liiliilIil = why;
      this.iiiliilIil = targetDamage;
      this.IIIiiilIil = selfFull;
      this.lIIiiilIil = selfCost;
      this.iIIiiilIil = value;
   }

   public float iIlIlllllill() {
      return this.iiiliilIil;
   }
}
