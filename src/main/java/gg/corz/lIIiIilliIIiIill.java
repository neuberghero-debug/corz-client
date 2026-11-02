package gg.corz;

final class lIIiIilliIIiIill {
   private final long[] IIillilill;
   private int lIillilill;
   private int iIillilill;

   synchronized void IliIlllilIi(long value) {
      this.IIillilill[this.iIillilill] = value;
      this.iIillilill = (this.iIillilill + 1) % this.IIillilill.length;
      if (this.lIillilill < this.IIillilill.length) {
         this.lIillilill++;
      }
   }

   lIIiIilliIIiIill(int capacity) {
      this.IIillilill = new long[capacity];
   }

   synchronized long iIlIlllllill() {
      long var4 = -1113751231129866086L;
      if (this.lIillilill == 0) {
         return 0L;
      } else {
         long var1 = 0L;

         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < this.lIillilill; var6 += 4294967296L) {
            var1 += this.IIillilill[(int)(var6 >>> 32)];
         }

         return Math.round((double)var1 / (double)this.lIillilill);
      }
   }

   synchronized int liiiIIllIl() {
      return this.lIillilill;
   }

   synchronized void IilliliilIIi() {
      this.lIillilill = 0;
      this.iIillilill = 0;
   }
}
