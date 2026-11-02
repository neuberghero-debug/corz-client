package gg.corz;

final class iIliiiIlliii {
   private final double[] IlIIlIiIlllIIlIiIl;
   private final double[] ilIIlIiIlIiIIlIiIl;
   private double iIlIlIiIlIllIlIiIl;
   private int liIIlIiIliiIIlIiIl;
   private double IIlIlIiIllIlIlIiIl = Double.NaN;

   private double lIiiIiIlilli() {
      long var8 = 4620181143695779438L;
      if (!this.liiiIIllIl()) {
         return Double.NaN;
      } else {
         double var1 = Double.NaN;
         double var3 = Double.POSITIVE_INFINITY;

         for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < this.liIIlIiIliiIIlIiIl; var10 += 4294967296L) {
            double var6 = Math.abs(this.ilIIlIiIlIiIIlIiIl[(int)(var10 >>> 32)]);
            if (var6 < var3) {
               var3 = var6;
               var1 = this.IlIIlIiIlllIIlIiIl[(int)(var10 >>> 32)];
            }
         }

         return Double.isFinite(var3) ? var1 : Double.NaN;
      }
   }

   private void iIlIlllllill() {
      long var11 = -5641465760582868226L;
      double var1 = Double.POSITIVE_INFINITY;
      double var3 = Double.NaN;
      double var5 = Double.NaN;
      var11 ^= (0L ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < this.liIIlIiIliiIIlIiIl) {
         for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < this.liIIlIiIliiIIlIiIl; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            if (this.IlIIlIiIlllIIlIiIl[(int)(var11 >>> 32)] < this.IlIIlIiIlllIIlIiIl[(int)var11]
               && Math.signum(this.ilIIlIiIlIiIIlIiIl[(int)(var11 >>> 32)]) * Math.signum(this.ilIIlIiIlIiIIlIiIl[(int)var11]) < 0.0) {
               double var9 = this.IlIIlIiIlllIIlIiIl[(int)var11] - this.IlIIlIiIlllIIlIiIl[(int)(var11 >>> 32)];
               if (var9 < var1 && this.IilliliilIIi(this.IlIIlIiIlllIIlIiIl[(int)(var11 >>> 32)], this.IlIIlIiIlllIIlIiIl[(int)var11])) {
                  var1 = var9;
                  var3 = this.IlIIlIiIlllIIlIiIl[(int)(var11 >>> 32)];
                  var5 = this.IlIIlIiIlllIIlIiIl[(int)var11];
               }
            }
         }

         var11 += 4294967296L;
      }

      this.IIlIlIiIllIlIlIiIl = var3;
      this.iIlIlIiIlIllIlIiIl = var5;
   }

   private iIliiiIlliii(int capacity) {
      this.iIlIlIiIlIllIlIiIl = Double.NaN;
      this.IlIIlIiIlllIIlIiIl = new double[capacity];
      this.ilIIlIiIlIiIIlIiIl = new double[capacity];
   }

   private double IliIlllilIi(lllIililillIilil x, double miss) {
      double var4 = x.at(miss);
      if (Double.isNaN(var4)) {
         var4 = Double.POSITIVE_INFINITY;
      }

      if (this.liIIlIiIliiIIlIiIl < this.IlIIlIiIlllIIlIiIl.length) {
         this.IlIIlIiIlllIIlIiIl[this.liIIlIiIliiIIlIiIl] = miss;
         this.ilIIlIiIlIiIIlIiIl[this.liIIlIiIliiIIlIiIl] = var4;
         this.liIIlIiIliiIIlIiIl++;
      }

      this.iIlIlllllill();
      return var4;
   }

   private boolean liiiIIllIl() {
      return !Double.isNaN(this.IIlIlIiIllIlIlIiIl);
   }

   private boolean IilliliilIIi(double a, double b) {
      long var6 = 200930996482773371L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.liIIlIiIliiIIlIiIl; var8 += 4294967296L) {
         if (this.IlIIlIiIlllIIlIiIl[(int)(var8 >>> 32)] > a && this.IlIIlIiIlllIIlIiIl[(int)(var8 >>> 32)] < b) {
            return false;
         }
      }

      return true;
   }
}
