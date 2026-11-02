package gg.corz;

import java.util.Arrays;

final class iIIiIilIlIiIil {
   private int IiiIIliIiliiIIliIi;
   private int[] IIiIIliIilIiIIliIi;
   private int iIiIIliIiIliIIliIi;
   private int lliIIliIiiliIIliIi;
   private int[] lilIIliIiiilIIliIi;
   private static final int illIIliIiIilIIliIi = -1;

   private void IliIlllilIi(int cap) {
      this.lilIIliIiiilIIliIi = new int[cap];
      this.IIiIIliIilIiIIliIi = new int[cap];
      Arrays.fill(this.lilIIliIiiilIIliIi, -1);
      this.iIiIIliIiIliIIliIi = cap - 1;
      this.lliIIliIiiliIIliIi = cap >> 1;
      this.IiiIIliIiliiIIliIi = 0;
   }

   void IilliliilIIi(int key, int value) {
      long var5 = 119478145127373773L;
      var5 ^= ((long)(iliIiiliiiii(key) & this.iIiIIliIiIliIIliIi) << 32 ^ var5) & -1L << 32;

      while (true) {
         var5 ^= ((long)this.lilIIliIiiilIIliIi[(int)(var5 >>> 32)] ^ var5) & -1L >>> 32;
         if ((int)var5 == -1) {
            this.lilIIliIiiilIIliIi[(int)(var5 >>> 32)] = key;
            this.IIiIIliIilIiIIliIi[(int)(var5 >>> 32)] = value;
            if (++this.IiiIIliIiliiIIliIi > this.lliIIliIiiliIIliIi) {
               this.lIiiIiIlilli();
            }

            return;
         }

         if ((int)var5 == key) {
            this.IIiIIliIilIiIIliIi[(int)(var5 >>> 32)] = value;
            return;
         }

         var5 ^= ((long)((int)(var5 >>> 32) + 1 & this.iIiIIliIiIliIIliIi) << 32 ^ var5) & -1L << 32;
      }
   }

   private void lIiiIiIlilli() {
      long var4 = -2412474913969754754L;
      int[] var1 = this.lilIIliIiiilIIliIi;
      int[] var2 = this.IIiIIliIilIiIIliIi;
      this.IliIlllilIi(var1.length << 1);

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < var1.length; var6 += 4294967296L) {
         if (var1[(int)(var6 >>> 32)] != -1) {
            this.IilliliilIIi(var1[(int)(var6 >>> 32)], var2[(int)(var6 >>> 32)]);
         }
      }
   }

   int iIlIlllllill(int key) {
      long var4 = 96430453885235348L;
      var4 ^= ((long)(iliIiiliiiii(key) & this.iIiIIliIiIliIIliIi) << 32 ^ var4) & -1L << 32;

      while (true) {
         var4 ^= ((long)this.lilIIliIiiilIIliIi[(int)(var4 >>> 32)] ^ var4) & -1L >>> 32;
         if ((int)var4 == -1) {
            return -1;
         }

         if ((int)var4 == key) {
            return this.IIiIIliIilIiIIliIi[(int)(var4 >>> 32)];
         }

         var4 ^= ((long)((int)(var4 >>> 32) + 1 & this.iIiIIliIiIliIIliIi) << 32 ^ var4) & -1L << 32;
      }
   }

   private static int iliIiiliiiii(int key) {
      long var2 = -8347406905546282681L;
      var2 ^= ((long)(key * -1640531535) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) ^ (int)(var2 >>> 32) >>> 15;
   }

   iIIiIilIlIiIil(int expected) {
      long var3 = 6837040951220423593L;
      super();
      var3 ^= (68719476736L ^ var3) & -1L << 32;

      while ((double)((int)(var3 >>> 32)) * 0.5 < (double)expected) {
         var3 ^= ((long)((int)(var3 >>> 32) << 1) << 32 ^ var3) & -1L << 32;
      }

      this.IliIlllilIi((int)(var3 >>> 32));
   }

   void liiiIIllIl() {
      if (this.IiiIIliIiliiIIliIi != 0) {
         Arrays.fill(this.lilIIliIiiilIIliIi, -1);
         this.IiiIIliIiliiIIliIi = 0;
      }
   }
}
