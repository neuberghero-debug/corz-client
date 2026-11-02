package gg.corz;

public record iillIilIIilIil(int x, int y, int z, double feetY, iIIIliIlIIli move, float hp, double g) {
   private final float llilIIiIiililIIiIi;
   private final int illlIIiIiIillIIiIi;
   private final int IlllIIiIillllIIiIi;
   private final double IIilIIiIilIilIIiIi;
   private final iIIIliIlIIli iIilIIiIiIlilIIiIi;
   private final int lillIIiIiiillIIiIi;
   private final double IiilIIiIiliilIIiIi;

   public double IliIlllilIi() {
      return (double)this.IlllIIiIillllIIiIi + 0.5;
   }

   public float IlIlllIlilIl() {
      return this.llilIIiIiililIIiIi;
   }

   public double IiIlliIliiIl() {
      return this.IiilIIiIiliilIIiIi;
   }

   public int iIlIlllllill() {
      return this.IlllIIiIillllIIiIi;
   }

   public double iliIiiliiiii() {
      return this.IIilIIiIilIilIIiIi;
   }

   public double liiiIIllIl() {
      return (double)this.lillIIiIiiillIIiIi + 0.5;
   }

   public iillIilIIilIil(int x, int y, int z, double feetY, iIIIliIlIIli move, float hp, double g) {
      this.IlllIIiIillllIIiIi = x;
      this.illlIIiIiIillIIiIi = y;
      this.lillIIiIiiillIIiIi = z;
      this.IIilIIiIilIilIIiIi = feetY;
      this.iIilIIiIiIlilIIiIi = move;
      this.llilIIiIiililIIiIi = hp;
      this.IiilIIiIiliilIIiIi = g;
   }

   public int lIiiIiIlilli() {
      return this.lillIIiIiiillIIiIi;
   }

   public iIIIliIlIIli IIIllIIliIIl() {
      return this.iIilIIiIiIlilIIiIi;
   }

   public int IilliliilIIi() {
      return this.illlIIiIiIillIIiIi;
   }
}
