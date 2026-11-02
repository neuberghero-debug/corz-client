package gg.corz;

public interface lIilIiliIilIil {
   int ilIiIIiIiIiIiIIiIi = 8;
   int IlIiIIiIillIiIIiIi = 4;
   int llliIIiIiilliIIiIi = 128;
   int IIliIIiIilIliIIiIi = 32;
   int IiliIIiIililiIIiIi = 256;
   int iiilIIiIiIIIiIIiIi = 1;
   int liIiIIiIiiiIiIIiIi = 16;
   int lIIiIIiIiiIIiIIiIi = 2;
   int iIliIIiIiIlliIIiIi = 64;
   int iiliIIiIiIIiiIIiIi = 496;
   int lIiiIIiIiiIiiIIiIi = 10;

   static boolean lIiiIiIlilli(lIilIiliIilIil z, int y, int x, int c) {
      return liiiIIllIl(z.IliIlllilIi(y, x + 1, c), 6)
         ? true
         : liiiIIllIl(z.IliIlllilIi(y + 1, x, c), 6)
            || liiiIIllIl(z.IliIlllilIi(y - 1, x, c), 6)
            || liiiIIllIl(z.IliIlllilIi(y, x, c + 1), 6)
            || liiiIIllIl(z.IliIlllilIi(y, x, c - 1), 6);
   }

   static boolean iliIiiliiiii(lIilIiliIilIil y, int c, int z, int x) {
      long var5 = 7618077121898984852L;
      var5 ^= ((long)y.IliIlllilIi(c, z, x) << 32 ^ var5) & -1L << 32;
      return liiiIIllIl((int)(var5 >>> 32), 1) && !liiiIIllIl((int)(var5 >>> 32), -736896468 * 25 - 5 ^ -1242542147) && !lIiiIiIlilli(y, c, z, x);
   }

   int IliIlllilIi(int var1, int var2, int var3);

   static boolean IIIllIIliIIl(lIilIiliIilIil y, int x, int c, int z) {
      int[] var4 = new int[]{1, -1, 0, 0};
      int[] var5 = new int[]{0, 0, 1, -1};

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = x + var4[var6];
         int var8 = z + var5[var6];
         if (liiiIIllIl(y.IliIlllilIi(var7, c, var8), 2) || liiiIIllIl(y.IliIlllilIi(var7, c + 1, var8), 2)) {
            return true;
         }

         int var9 = y.IliIlllilIi(var7, c - 1, var8);
         if (liiiIIllIl(var9, 2) && !liiiIIllIl(var9, 1)) {
            return true;
         }
      }

      return false;
   }

   static boolean liiiIIllIl(int bits, int flags) {
      return (bits & flags) != 0;
   }

   static boolean IilliliilIIi(int flags) {
      return (flags & 1) != 0 && (flags & (~-1391184518 + 11 ^ 1391184778)) == 0;
   }

   static boolean iIlIlllllill(int flags) {
      return (flags & (((~(-1421337921 - 91) ^ -51) >>> 13 | (~(-1421337921 - 91) ^ -51) << 19) ^ -759866559)) == 0;
   }
}
