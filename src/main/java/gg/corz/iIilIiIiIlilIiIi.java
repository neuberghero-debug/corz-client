package gg.corz;

public record iIilIiIiIlilIiIi(int x, int y, int z, int booms, long lastBoom, double interval) {
   private final int iiliIIiIIi;
   private final int liliIIiIIi;
   private final int IIiiIIiIIi;
   private final long lIiiIIiIIi;
   private final double iIiiIIiIIi;
   private final int IiliIIiIIi;

   public long IiIlliIliiIl() {
      return this.lIiiIIiIIi;
   }

   public double IIlllIlliIll() {
      return this.iIiiIIiIIi;
   }

   public int IIIllIIliIIl() {
      return this.iiliIIiIIi;
   }

   public double IilliliilIIi() {
      return (double)this.liliIIiIIi + 1.0;
   }

   public int iliIiiliiiii() {
      return this.liliIIiIIi;
   }

   public iIilIiIiIlilIiIi(int x, int y, int z, int booms, long lastBoom, double interval) {
      this.IiliIIiIIi = x;
      this.liliIIiIIi = y;
      this.iiliIIiIIi = z;
      this.IIiiIIiIIi = booms;
      this.lIiiIIiIIi = lastBoom;
      this.iIiiIIiIIi = interval;
   }

   public double liiiIIllIl() {
      return (double)this.liliIIiIIi + 1.0;
   }

   public double iIlIlllllill() {
      return (double)this.iiliIIiIIi + 0.5;
   }

   public int IlIlllIlilIl() {
      return this.IIiiIIiIIi;
   }

   public double IliIlllilIi() {
      return (double)this.IiliIIiIIi + 0.5;
   }

   public int lIiiIiIlilli() {
      return this.IiliIIiIIi;
   }
}
