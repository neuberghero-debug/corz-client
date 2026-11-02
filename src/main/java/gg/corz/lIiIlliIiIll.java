package gg.corz;

import java.util.Arrays;

final class lIiIlliIiIll<T> {
   private final long IIliIIIilIliIIIi;
   private int IiliIIIililiIIIi;
   private final T liIiIIIiiiIiIIIi;
   private long[] llliIIIiilliIIIi;
   private Object[] iIliIIIiIlliIIIi = new Object[1];

   void IIIllIIliIIl(Object owner, long latestUntilMs) {
      long var5 = 6302229368806950738L;

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < this.IiliIIIililiIIIi; var7 += 4294967296L) {
         if (this.iIliIIIiIlliIIIi[(int)(var7 >>> 32)] == owner) {
            this.llliIIIiilliIIIi[(int)(var7 >>> 32)] = Math.min(this.llliIIIiilliIIIi[(int)(var7 >>> 32)], latestUntilMs);
         }
      }
   }

   void iliIiiliiiii(Object owner) {
      long var3 = -3324316975629402763L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiliIIIililiIIIi; var5 += 4294967296L) {
         if (this.iIliIIIiIlliIIIi[(int)(var5 >>> 32)] == owner) {
            this.IiliIIIililiIIIi--;
            this.iIliIIIiIlliIIIi[(int)(var5 >>> 32)] = this.iIliIIIiIlliIIIi[this.IiliIIIililiIIIi];
            this.llliIIIiilliIIIi[(int)(var5 >>> 32)] = this.llliIIIiilliIIIi[this.IiliIIIililiIIIi];
            this.iIliIIIiIlliIIIi[this.IiliIIIililiIIIi] = null;
            return;
         }
      }
   }

   int iIlIlllllill() {
      return this.IiliIIIililiIIIi;
   }

   boolean lIiiIiIlilli(Object owner) {
      long var3 = -257215692570660490L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiliIIIililiIIIi; var5 += 4294967296L) {
         if (this.iIliIIIiIlliIIIi[(int)(var5 >>> 32)] == owner) {
            return true;
         }
      }

      return false;
   }

   boolean IlIlllIlilIl(long now, long maxAgeMs) {
      long var6 = -4907100154983348667L;
      if (maxAgeMs > 0L && now - this.IIliIIIilIliIIIi >= maxAgeMs) {
         return true;
      } else {
         for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.IiliIIIililiIIIi; var8 += 4294967296L) {
            if (this.llliIIIiilliIIIi[(int)(var8 >>> 32)] > now) {
               return false;
            }
         }

         return true;
      }
   }

   void IilliliilIIi(Object untilMs, long owner) {
      long var5 = 5156137581356248948L;

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < this.IiliIIIililiIIIi; var7 += 4294967296L) {
         if (this.iIliIIIiIlliIIIi[(int)(var7 >>> 32)] == untilMs) {
            this.llliIIIiilliIIIi[(int)(var7 >>> 32)] = Math.max(this.llliIIIiilliIIIi[(int)(var7 >>> 32)], owner);
            return;
         }
      }

      if (this.IiliIIIililiIIIi == this.iIliIIIiIlliIIIi.length) {
         this.iIliIIIiIlliIIIi = Arrays.copyOf(this.iIliIIIiIlliIIIi, this.IiliIIIililiIIIi * 2);
         this.llliIIIiilliIIIi = Arrays.copyOf(this.llliIIIiilliIIIi, this.IiliIIIililiIIIi * 2);
      }

      this.iIliIIIiIlliIIIi[this.IiliIIIililiIIIi] = untilMs;
      this.llliIIIiilliIIIi[this.IiliIIIililiIIIi] = owner;
      this.IiliIIIililiIIIi++;
   }

   lIiIlliIiIll(T payload, long enqueuedAt) {
      this.llliIIIiilliIIIi = new long[1];
      this.liIiIIIiiiIiIIIi = (T)payload;
      this.IIliIIIilIliIIIi = enqueuedAt;
   }

   T IliIlllilIi() {
      return this.liIiIIIiiiIiIIIi;
   }

   long liiiIIllIl() {
      return this.IIliIIIilIliIIIi;
   }
}
