package gg.corz;

public final class IIliiiilIliiii {
   private static int liiiIIllIl(int c01, int c10, int w00, int shift, int w10, float w01, float c11, float w11, float c00) {
      long var11 = -7521623428060800531L;
      float var9 = (float)(c01 >> w10 & 0xFF) * w01 + (float)(c10 >> w10 & 0xFF) * c11 + (float)(w00 >> w10 & 0xFF) * w11 + (float)(shift >> w10 & 0xFF) * c00;
      var11 ^= ((long)Math.round(var9) << 32 ^ var11) & -1L << 32;
      return (int)(var11 >>> 32) < 0 ? 0 : Math.min(255, (int)(var11 >>> 32));
   }

   private IIliiiilIliiii() {
   }

   public static int IliIlllilIi(int fz, int c00, int fx, int c01, float c10, float c11) {
      long var13 = -7271433752895046025L;
      long var15 = 5471387397704901014L;
      float var6 = (1.0F - c10) * (1.0F - c11);
      float var7 = c10 * (1.0F - c11);
      float var8 = (1.0F - c10) * c11;
      float var9 = c10 * c11;
      var13 ^= ((long)liiiIIllIl(fz, c00, fx, c01, 16, var6, var7, var8, var9) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)liiiIIllIl(fz, c00, fx, c01, 8, var6, var7, var8, var9) ^ var13) & -1L >>> 32;
      var15 ^= ((long)liiiIIllIl(fz, c00, fx, c01, 0, var6, var7, var8, var9) << 32 ^ var15) & -1L << 32;
      return 0xFF000000 | (int)(var13 >>> 32) << 16 | (int)var13 << 8 | (int)(var15 >>> 32);
   }
}
