package gg.corz;

import java.util.Arrays;

final class iilIIiIiIIiIIiIi {
   private int IlIIiilIIi;
   private long[] IIIIiilIIi;
   private int lIIIiilIIi;
   private int iIIIiilIIi;
   private static final long iiiililIIi = Long.MIN_VALUE;

   private void iliIiiliiiii() {
      long var7 = -1696451803876281154L;
      long[] var1 = this.IIIIiilIIi;
      this.IliIlllilIi(var1.length << 1);
      long[] var2 = var1;
      var7 ^= ((long)var1.length << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         long var5 = var2[(int)var10];
         if (var5 != Long.MIN_VALUE) {
            this.lIiiIiIlilli(var5);
         }
      }
   }

   int iIlIlllllill() {
      return this.IlIIiilIIi;
   }

   iilIIiIiIIiIIiIi(int expected) {
      long var3 = -405646299323627035L;
      super();
      var3 ^= (68719476736L ^ var3) & -1L << 32;

      while ((double)((int)(var3 >>> 32)) * 0.6 < (double)expected) {
         var3 ^= ((long)((int)(var3 >>> 32) << 1) << 32 ^ var3) & -1L << 32;
      }

      this.IliIlllilIi((int)(var3 >>> 32));
   }

   void liiiIIllIl() {
      if (this.IlIIiilIIi != 0) {
         Arrays.fill(this.IIIIiilIIi, Long.MIN_VALUE);
         this.IlIIiilIIi = 0;
      }
   }

   private static int IIIllIIliIIl(long key) {
      long var2 = key * -7046029254386353131L;
      return (int)(var2 ^ var2 >>> 29 ^ var2 >>> 47);
   }

   boolean lIiiIiIlilli(long key) {
      long var6 = -5676753382389944853L;
      var6 ^= ((long)(IIIllIIliIIl(key) & this.lIIIiilIIi) << 32 ^ var6) & -1L << 32;

      while (true) {
         long var4 = this.IIIIiilIIi[(int)(var6 >>> 32)];
         if (var4 == Long.MIN_VALUE) {
            this.IIIIiilIIi[(int)(var6 >>> 32)] = key;
            if (++this.IlIIiilIIi > this.iIIIiilIIi) {
               this.iliIiiliiiii();
            }

            return true;
         }

         if (var4 == key) {
            return false;
         }

         var6 ^= ((long)((int)(var6 >>> 32) + 1 & this.lIIIiilIIi) << 32 ^ var6) & -1L << 32;
      }
   }

   boolean IilliliilIIi(long key) {
      long var6 = -1932997880970930857L;
      var6 ^= ((long)(IIIllIIliIIl(key) & this.lIIIiilIIi) << 32 ^ var6) & -1L << 32;

      while (true) {
         long var4 = this.IIIIiilIIi[(int)(var6 >>> 32)];
         if (var4 == Long.MIN_VALUE) {
            return false;
         }

         if (var4 == key) {
            return true;
         }

         var6 ^= ((long)((int)(var6 >>> 32) + 1 & this.lIIIiilIIi) << 32 ^ var6) & -1L << 32;
      }
   }

   private void IliIlllilIi(int cap) {
      this.IIIIiilIIi = new long[cap];
      Arrays.fill(this.IIIIiilIIi, Long.MIN_VALUE);
      this.lIIIiilIIi = cap - 1;
      this.iIIIiilIIi = (int)((double)cap * 0.6);
      this.IlIIiilIIi = 0;
   }
}
