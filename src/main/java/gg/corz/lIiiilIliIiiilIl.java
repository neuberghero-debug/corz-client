package gg.corz;

public record lIiiilIliIiiilIl(int x, int y, int z, double score, boolean water) {
   private final int IIIlIIiIll;
   private final double iIIlIIiIll;
   private final int iiiIIIiIll;
   private final boolean IlIlIIiIll;
   private final int lIIlIIiIll;

   public boolean lIiiIiIlilli() {
      return this.IlIlIIiIll;
   }

   public int iIlIlllllill() {
      return this.lIIlIIiIll;
   }

   public int liiiIIllIl() {
      return this.IIIlIIiIll;
   }

   public double IilliliilIIi() {
      return this.iIIlIIiIll;
   }

   public int IliIlllilIi() {
      return this.iiiIIIiIll;
   }

   public lIiiilIliIiiilIl(int x, int y, int z, double score, boolean water) {
      this.iiiIIIiIll = x;
      this.IIIlIIiIll = y;
      this.lIIlIIiIll = z;
      this.iIIlIIiIll = score;
      this.IlIlIIiIll = water;
   }
}
