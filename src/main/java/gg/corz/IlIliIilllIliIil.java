package gg.corz;

final class IlIliIilllIliIil {
   final float[] iilIIilIil;
   final int[] IIiIIilIil;

   void IliIlllilIi(float sink, float oy, float ox, iiIllIilIIlllIil oz) {
      long var10 = -6768783342946542970L;
      long var12 = -7398787202616528839L;
      float[] var5 = this.iilIIilIil;
      var10 ^= (0L ^ var10) & -1L << 32;

      for (long var15 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)(var15 >>> 32) < this.IIiIIilIil.length; var15 += 4294967296L) {
         var12 ^= ((long)this.IIiIIilIil[(int)(var15 >>> 32)] << 32 ^ var12) & -1L << 32;

         for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < 4; var15 ^= (var15 ^ var15 + (long)5) & -1L >>> 32) {
            oz.IilliliilIIi(
               sink + var5[(int)var15], oy + var5[(int)var15 + 1], ox + var5[(int)var15 + 2], var5[(int)var15 + 3], var5[(int)var15 + 4], (int)(var12 >>> 32)
            );
            var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32;
         }
      }
   }

   IlIliIilllIliIil(float[] vertices, int[] colors) {
      this.iilIIilIil = vertices;
      this.IIiIIilIil = colors;
   }
}
