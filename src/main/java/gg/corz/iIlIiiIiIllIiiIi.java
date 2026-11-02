package gg.corz;

public final class iIlIiiIiIllIiiIi {
   private final int IIiIiiiIIi;
   private final int iilIiiiIIi;
   private final liIIiIlliiIIiIll[] lilIiiiIIi;

   private static int iliIiiliiiii(liIIiIlliiIIiIll[] s) {
      long var3 = -6016032243764464118L;
      var3 ^= ((long)(!s[0].IIIllIIliIIl() ? 1 : 0) << 32 ^ var3) & -1L << 32;

      for (long var6 = var3 ^ (1L ^ var3) & -1L >>> 32; (int)var6 < s.length; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         if (s[(int)var6].IIIllIIliIIl()) {
            if ((int)(var6 >>> 32) != 0) {
               return (int)var6;
            }
         } else {
            var6 ^= (4294967296L ^ var6) & -1L << 32;
         }
      }

      return s.length;
   }

   public liIIiIlliiIIiIll IliIlllilIi(int index) {
      long var3 = 3150586468406106797L;
      var3 ^= ((long)(index < 0 ? 0 : Math.min(index, this.lilIiiiIIi.length - 1)) << 32 ^ var3) & -1L << 32;
      return this.lilIiiiIIi[(int)(var3 >>> 32)];
   }

   public int liiiIIllIl() {
      return this.lilIiiiIIi.length;
   }

   public int IilliliilIIi() {
      return this.IIiIiiiIIi;
   }

   public double lIiiIiIlilli() {
      return this.lilIiiiIIi[this.IIiIiiiIIi].liiiIIllIl();
   }

   public int iIlIlllllill() {
      return this.iilIiiiIIi;
   }

   private iIlIiiIiIllIiiIi(liIIiIlliiIIiIll[] samples) {
      long var4 = 6402066112644315532L;
      super();
      this.lilIiiiIIi = samples;
      this.iilIiiiIIi = iliIiiliiiii(samples);
      var4 ^= (0L ^ var4) & -1L << 32;

      for (var4 ^= (1L ^ var4) & -1L >>> 32; (int)var4 < samples.length; var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
         if (samples[(int)var4].liiiIIllIl() > samples[(int)(var4 >>> 32)].liiiIIllIl()) {
            var4 ^= ((long)((int)var4) << 32 ^ var4) & -1L << 32;
         }
      }

      this.IIiIiiiIIi = (int)(var4 >>> 32);
   }
}
