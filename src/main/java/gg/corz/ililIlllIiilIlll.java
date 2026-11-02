package gg.corz;

import java.util.Arrays;

public final class ililIlllIiilIlll {
   public static final int iiIliIIill = 4;
   private final double[] lIlliIIill = new double[4];
   private double IllliIIill;
   private int iIlliIIill;
   public static final double IIlliIIill = 16.0;

   public double iIlIlllllill() {
      long var8 = -3359571596493237588L;
      double var1 = this.IllliIIill;
      double[] var3 = this.lIlliIIill;
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         double var6 = var3[(int)var11];
         var1 += var6;
      }

      return var1;
   }

   public void liiiIIllIl() {
      this.lIlliIIill[this.iIlliIIill] = this.IllliIIill;
      this.iIlliIIill = (this.iIlliIIill + 1) % 4;
      this.IllliIIill = 0.0;
   }

   public void IliIlllilIi(double dy, double dx) {
      if (Double.isFinite(dy)) {
         this.IllliIIill = this.IllliIIill + Math.abs(dy);
      }

      if (Double.isFinite(dx)) {
         this.IllliIIill = this.IllliIIill + Math.abs(dx);
      }
   }

   public boolean IilliliilIIi() {
      return this.iIlIlllllill() >= 16.0;
   }

   public void lIiiIiIlilli() {
      Arrays.fill(this.lIlliIIill, 0.0);
      this.iIlliIIill = 0;
      this.IllliIIill = 0.0;
   }
}
