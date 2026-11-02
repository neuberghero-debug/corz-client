package gg.corz;

public final class lIilIIliiIilIIli {
   private boolean lliIilIlIi;
   public static final int IIiIilIlIi = 50;
   private final long lIiIilIlIi;
   private long IliIilIlIi;
   private long iIiIilIlIi;

   public int IliIlllilIi(long nowNanos) {
      if (!this.lliIilIlIi) {
         this.lliIilIlIi = true;
         this.iIiIilIlIi = nowNanos;
         this.IliIilIlIi = 0L;
         return 0;
      } else {
         long var3 = nowNanos - this.iIiIilIlIi;
         this.iIiIilIlIi = nowNanos;
         if (var3 <= 0L) {
            return 0;
         } else {
            this.IliIilIlIi += var3;
            long var5 = this.IliIilIlIi / this.lIiIilIlIi;
            this.IliIilIlIi = this.IliIilIlIi - var5 * this.lIiIilIlIi;
            if (var5 > 50L) {
               this.IliIilIlIi = 0L;
               return 50;
            } else {
               return (int)var5;
            }
         }
      }
   }

   public lIilIIliiIilIIli(int hz) {
      this.lIiIilIlIi = 1000000000L / (long)Math.max(1, hz);
   }

   public void liiiIIllIl() {
      this.lliIilIlIi = false;
      this.IliIilIlIi = 0L;
   }
}
