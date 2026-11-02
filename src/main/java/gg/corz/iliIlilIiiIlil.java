package gg.corz;

final class iliIlilIiiIlil implements IliIlillliIlil {
   private final int lIiIiiiIiiIiIiiiIi;
   private static final int iIlIiiiIiIllIiiiIi = 2048;
   private int iIIliiiIiIlIliiiIi;
   private final byte[] liiIiiiIiiiiIiiiIi;
   private final IliIlillliIlil IilIiiiIililIiiiIi;
   int llIliiiIiilIliiiIi;
   private static final int liIIiiiIiiiIIiiiIi = 32767;
   private static final int IlIIiiiIillIIiiiIi = 15;
   private static final int IIlIiiiIilIlIiiiIi = 24576;
   private final boolean[] IIIliiiIilIIliiiIi;
   private static final byte lllIiiiIiillIiiiIi = -1;
   private static final int ilIIiiiIiIiIIiiiIi = 32768;
   private final int[] IliIiiiIilliIiiiIi = new int[~-1142379103 * 270549121 - -119 ^ 1343783381];
   private final int iilIiiiIiIIiIiiiIi;
   private final int[] iliIiiiIiIiiIiiiIi = new int[((872399171 ^ -31) << 19 | (872399171 ^ -31) >>> 13) + -125 ^ 71 ^ -183050301];

   iliIlilIiiIlil(IliIlillliIlil probe, int ox, int oz) {
      this.liiIiiiIiiiiIiiiIi = new byte[-((723226426 ^ 73) - -15) - 101 ^ -723193831];
      this.IIIliiiIilIIliiiIi = new boolean[((1600802447 << 21 | 1600802447 >>> 11) * 71 << 7 | (1600802447 << 21 | 1600802447 >>> 11) * 71 >>> 25) ^ 929505180];
      this.IilIiiiIililIiiiIi = probe;
      this.iilIiiiIiIIiIiiiIi = ox;
      this.lIiIiiiIiiIiIiiiIi = oz;
   }

   @Override
   public int liiiIIllIl(int x, int z, int y) {
      long var6 = -6056880769012006220L;
      var6 ^= ((long)this.IilliliilIIi(x, y) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) >= 0 && this.iliIiiiIiIiiIiiiIi[(int)(var6 >>> 32)] == z) {
         if (this.liiIiiiIiiiiIiiiIi[(int)(var6 >>> 32)] == (-((-826132245 ^ 115) * -11) + -103 ^ 497521118)) {
            this.llIliiiIiilIliiiIi++;
            var6 ^= ((long)this.IilIiiiIililIiiiIi.liiiIIllIl(x, z, y) ^ var6) & -1L >>> 32;
            this.liiIiiiIiiiiIiiiIi[(int)(var6 >>> 32)] = (byte)(
               (int)var6 >= 0 && (int)var6 <= (~(-748150545 << 3 | -748150545 >>> 29) ^ 29 ^ 1690237081) ? (int)var6 : 5
            );
         }

         return this.liiIiiiIiiiiIiiiIi[(int)(var6 >>> 32)];
      } else {
         this.llIliiiIiilIliiiIi++;
         return this.IilIiiiIililIiiiIi.liiiIIllIl(x, z, y);
      }
   }

   @Override
   public int IliIlllilIi(int z, int x) {
      long var4 = -4531315921542200901L;
      var4 ^= ((long)this.IilliliilIIi(z, x) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) >= 0) {
         return this.iliIiiiIiIiiIiiiIi[(int)(var4 >>> 32)];
      } else {
         this.llIliiiIiilIliiiIi++;
         return this.IilIiiiIililIiiiIi.IliIlllilIi(z, x);
      }
   }

   private int IilliliilIIi(int z, int x) {
      int var3 = z - this.iilIiiiIiIIiIiiiIi + 2048;
      int var4 = x - this.lIiIiiiIiiIiIiiiIi + 2048;
      if (var3 >= 0 && var4 >= 0 && var3 < 4096 && var4 < 4096) {
         int var5 = (var3 << 12 | var4) + 1;

         int var6;
         int var7;
         for (var6 = var5 * -1640531527 >>> 17; (var7 = this.IliIiiiIilliIiiiIi[var6]) != 0; var6 = var6 + 1 & 32767) {
            if (var7 == var5) {
               return var6;
            }
         }

         if (this.iIIliiiIiIlIliiiIi >= 24576) {
            return -1;
         } else {
            var7 = this.IilIiiiIililIiiiIi.IliIlllilIi(z, x);
            this.llIliiiIiilIliiiIi++;
            this.IliIiiiIilliIiiiIi[var6] = var5;
            this.iliIiiiIiIiiIiiiIi[var6] = var7;
            this.liiIiiiIiiiiIiiiIi[var6] = -1;
            this.iIIliiiIiIlIliiiIi++;
            return var6;
         }
      } else {
         return -1;
      }
   }

   boolean iIlIlllllill(int z, int x) {
      long var4 = -3598027942063137346L;
      var4 ^= ((long)this.IilliliilIIi(z, x) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) < 0) {
         return true;
      } else if (this.IIIliiiIilIIliiiIi[(int)(var4 >>> 32)]) {
         return false;
      } else {
         this.IIIliiiIilIIliiiIi[(int)(var4 >>> 32)] = true;
         return true;
      }
   }
}
