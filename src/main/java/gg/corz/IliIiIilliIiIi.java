package gg.corz;

final class IliIiIilliIiIi {
   final float[] llililliiililillii;
   final float[] lillilliiiillillii;
   final float[] IIililliilIilillii;
   final float[] iIililliiIlilillii;
   final float[] illlilliiIillillii;

   float liiiIIllIl(float z) {
      long var4 = 5716573562922210336L;
      var4 ^= ((long)this.illlilliiIillillii.length << 32 ^ var4) & -1L << 32;
      var4 ^= (0L ^ var4) & -1L >>> 32;

      while ((int)var4 < (int)(var4 >>> 32) - 2 && z > this.illlilliiIillillii[(int)var4 + 1]) {
         var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32;
      }

      return this.lillilliiiillillii[(int)var4]
         + (this.lillilliiiillillii[(int)var4 + 1] - this.lillilliiiillillii[(int)var4])
            * (z - this.illlilliiIillillii[(int)var4])
            / (this.illlilliiIillillii[(int)var4 + 1] - this.illlilliiIillillii[(int)var4]);
   }

   void IliIlllilIi(IIilllIilIilllIi s, iIlIlIliIllIlIli seg, int m, iIlIlIliIllIlIli endCap) {
      s.liIlliiIll(this.IIililliilIilillii, this.iIililliiIlilillii, this.llililliiililillii, m, seg, null, endCap, 0.0F, 1.0F, 0.0F);
   }

   IliIiIilliIiIi(float inset, float zs, float... outset) {
      long var9 = -2163850988299913598L;
      long var11 = -1563868646347457162L;
      super();
      this.illlilliiIillillii = outset;
      var9 ^= ((long)outset.length << 32 ^ var9) & -1L << 32;
      this.IIililliilIilillii = new float[3 * (int)(var9 >>> 32)];
      this.iIililliiIlilillii = new float[(int)(var9 >>> 32)];
      this.llililliiililillii = new float[(int)(var9 >>> 32)];
      this.lillilliiiillillii = new float[(int)(var9 >>> 32)];

      for (var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         float[] var6 = iiIIiIilIIlIiIil.Iilililiiili(outset[(int)var9]);
         float var7 = (int)var9 == 0 ? inset : ((int)var9 == (int)(var9 >>> 32) - 1 ? zs : 1.0F);
         this.IIililliilIilillii[3 * (int)var9 + 1] = 0.5F * (var6[0] + var6[1]);
         this.IIililliilIilillii[3 * (int)var9 + 2] = outset[(int)var9];
         this.iIililliiIlilillii[(int)var9] = var6[2] * var7;
         this.llililliiililillii[(int)var9] = 0.5F * (var6[0] - var6[1]) * var7;
      }

      float[] var5 = new float[(int)(var9 >>> 32)];

      for (var11 ^= (4294967296L ^ var11) & -1L << 32; (int)(var11 >>> 32) < (int)(var9 >>> 32); var11 += 4294967296L) {
         float var13 = this.IIililliilIilillii[3 * (int)(var11 >>> 32) + 1] - this.IIililliilIilillii[3 * (int)(var11 >>> 32) - 2];
         float var8 = outset[(int)(var11 >>> 32)] - outset[(int)(var11 >>> 32) - 1];
         var5[(int)(var11 >>> 32)] = var5[(int)(var11 >>> 32) - 1] + (float)Math.sqrt((double)(var13 * var13 + var8 * var8));
      }

      for (long var17 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var17 >>> 32) < (int)(var9 >>> 32); var17 += 4294967296L) {
         this.lillilliiiillillii[(int)(var17 >>> 32)] = var5[(int)(var17 >>> 32)] / var5[(int)(var9 >>> 32) - 1];
      }
   }

   float iIlIlllllill(float v) {
      long var4 = -1070131333418664787L;
      var4 ^= ((long)this.illlilliiIillillii.length << 32 ^ var4) & -1L << 32;
      var4 ^= (0L ^ var4) & -1L >>> 32;

      while ((int)var4 < (int)(var4 >>> 32) - 2 && v > this.lillilliiiillillii[(int)var4 + 1]) {
         var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32;
      }

      return this.illlilliiIillillii[(int)var4]
         + (this.illlilliiIillillii[(int)var4 + 1] - this.illlilliiIillillii[(int)var4])
            * (v - this.lillilliiiillillii[(int)var4])
            / (this.lillilliiiillillii[(int)var4 + 1] - this.lillilliiiillillii[(int)var4]);
   }
}
