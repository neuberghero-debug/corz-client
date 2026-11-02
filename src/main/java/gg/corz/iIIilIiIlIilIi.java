package gg.corz;

public final class iIIilIiIlIilIi {
   private static final double iIIliiIiiIlIliiIii = 20.0;
   private static final double IIIliiIiilIIliiIii = 20.0;
   private static final double liiIiiIiiiiiIiiIii = 0.3;
   private long IiIliiIiiliIliiIii;
   private double iiIliiIiiIIlliiIii;
   public static final long iliIiiIiiIiiIiiIii = 1500L;
   private long llIliiIiiilIliiIii = -1L;

   public double iIlIlllllill() {
      if (!Double.isNaN(this.iiIliiIiiIIlliiIii) && !(this.iiIliiIiiIIlliiIii <= 0.0)) {
         double var1 = 20000.0 / this.iiIliiIiiIIlliiIii;
         return Math.max(0.0, Math.min(20.0, var1));
      } else {
         return 20.0;
      }
   }

   public void IliIlllilIi() {
      this.llIliiIiiilIliiIii = -1L;
      this.IiIliiIiiliIliiIii = -1L;
      this.iiIliiIiiIIlliiIii = Double.NaN;
   }

   public iIIilIiIlIilIi() {
      this.IiIliiIiiliIliiIii = -1L;
      this.iiIliiIiiIIlliiIii = Double.NaN;
   }

   public void liiiIIllIl(long nowMs) {
      if (this.llIliiIiiilIliiIii >= 0L) {
         long var3 = nowMs - this.llIliiIiiilIliiIii;
         if (var3 > 0L) {
            this.iiIliiIiiIIlliiIii = Double.isNaN(this.iiIliiIiiIIlliiIii)
               ? (double)var3
               : this.iiIliiIiiIIlliiIii + 0.3 * ((double)var3 - this.iiIliiIiiIIlliiIii);
         }
      }

      if (this.llIliiIiiilIliiIii < 0L || nowMs >= this.llIliiIiiilIliiIii) {
         this.llIliiIiiilIliiIii = nowMs;
      }
   }

   public boolean IilliliilIIi(long nowMs) {
      if (this.llIliiIiiilIliiIii < 0L) {
         if (this.IiIliiIiiliIliiIii < 0L) {
            this.IiIliiIiiliIliiIii = nowMs;
         }

         return nowMs - this.IiIliiIiiliIliiIii > 1500L;
      } else {
         return nowMs - this.llIliiIiiilIliiIii > 1500L;
      }
   }
}
