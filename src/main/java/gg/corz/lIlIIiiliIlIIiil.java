package gg.corz;

public record lIlIIiiliIlIIiil(long support, int face, double x, double y, double z) {
   private final int iliiIillil;
   private final long lliiIillil;
   private final double iiiiIillil;
   private final double liiiIillil;
   private final double IiiiIillil;

   public int liiiIIllIl() {
      return this.iliiIillil;
   }

   public double IilliliilIIi() {
      return this.liiiIillil;
   }

   public double lIiiIiIlilli() {
      return this.iiiiIillil;
   }

   public lIlIIiiliIlIIiil(long support, int face, double x, double y, double z) {
      this.lliiIillil = support;
      this.iliiIillil = face;
      this.IiiiIillil = x;
      this.liiiIillil = y;
      this.iiiiIillil = z;
   }

   public double iIlIlllllill() {
      return this.IiiiIillil;
   }

   public long IliIlllilIi() {
      return this.lliiIillil;
   }
}
