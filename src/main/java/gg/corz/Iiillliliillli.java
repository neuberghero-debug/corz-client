package gg.corz;

public record Iiillliliillli(int index, double vx, double vy, double vz, boolean set) {
   private final double iiiiIiIIIl;
   private final double IIIIliIIIl;
   private final double liiiIiIIIl;
   private final boolean lIIIliIIIl;
   private final int IiiiIiIIIl;

   public double iIlIlllllill() {
      return this.iiiiIiIIIl;
   }

   public double liiiIIllIl() {
      return this.liiiIiIIIl;
   }

   public Iiillliliillli(int index, double vx, double vy, double vz, boolean set) {
      this.IiiiIiIIIl = index;
      this.liiiIiIIIl = vx;
      this.iiiiIiIIIl = vy;
      this.IIIIliIIIl = vz;
      this.lIIIliIIIl = set;
   }

   public double IilliliilIIi() {
      return this.IIIIliIIIl;
   }

   public int IliIlllilIi() {
      return this.IiiiIiIIIl;
   }

   public boolean lIiiIiIlilli() {
      return this.lIIIliIIIl;
   }
}
