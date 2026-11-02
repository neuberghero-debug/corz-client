package gg.corz;

final class lIiilIiliIiilIil {
   final float[] llllIllIil;
   final float[] lIllIllIil;
   final float[] IlllIllIil;
   final int iillIllIil;
   final float[] IIllIllIil;
   final float[] IillIllIil;
   final float[] iIllIllIil;
   final float[] illlIllIil;
   final int lillIllIil;

   float lIiiIiIlilli(float z) {
      long var7 = -7865609381743609170L;
      float var2 = 0.0F;
      float var3 = (float)this.iillIllIil - 1.0F;
      var7 ^= ((long)(this.IIllIllIil[3 * (this.iillIllIil - 1) + 2] > this.IIllIllIil[2] ? 1 : 0) << 32 ^ var7) & -1L << 32;

      for (long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < 40; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         float var6 = 0.5F * (var2 + var3);
         if ((this.liiiIIllIl(var6)[2] < z ? 1 : 0) == (int)(var10 >>> 32)) {
            var2 = var6;
         } else {
            var3 = var6;
         }
      }

      return 0.5F * (var2 + var3);
   }

   float iIlIlllllill(float x, float z) {
      float[] var3 = this.liiiIIllIl(this.lIiiIiIlilli(z));
      float var4 = Math.max(0.0F, 1.0F - x / var3[3] * (x / var3[3]));
      return var3[1] + var3[4] * (float)Math.sqrt((double)var4);
   }

   float IIIllIIliIIl(float z) {
      return this.iliIiiliiiii(this.lIiiIiIlilli(z));
   }

   float[] liiiIIllIl(float s) {
      long var17 = -7848666164456048135L;
      long var19 = -7391808730317245104L;
      long var15 = -1737399953960151252L;
      s = lilIiiIliilIiiIl.Ilillllill(s, 0.0F, (float)this.iillIllIil - 1.0F);
      var15 ^= ((long)Math.min(this.iillIllIil - 2, (int)Math.floor((double)s)) << 32 ^ var15) & -1L << 32;
      float var3 = s - (float)((int)(var15 >>> 32));
      float var4 = var3 * var3;
      float var5 = var4 * var3;
      var15 ^= ((long)Math.max(0, (int)(var15 >>> 32) - 1) ^ var15) & -1L >>> 32;
      var17 ^= ((long)((int)(var15 >>> 32) + 1) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)Math.min(this.iillIllIil - 1, (int)(var15 >>> 32) + 2) ^ var17) & -1L >>> 32;
      float[] var9 = new float[5];

      for (long var26 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var26 >>> 32) < 3; var26 += 4294967296L) {
         float var11 = this.IIllIllIil[3 * (int)var15 + (int)(var26 >>> 32)];
         float var12 = this.IIllIllIil[3 * (int)(var15 >>> 32) + (int)(var26 >>> 32)];
         float var13 = this.IIllIllIil[3 * (int)(var17 >>> 32) + (int)(var26 >>> 32)];
         float var14 = this.IIllIllIil[3 * (int)var17 + (int)(var26 >>> 32)];
         var9[(int)(var26 >>> 32)] = this.lillIllIil == 1
            ? var12 + (var13 - var12) * var3
            : 0.5F
               * (
                  2.0F * var12
                     + (-var11 + var13) * var3
                     + (2.0F * var11 - 5.0F * var12 + 4.0F * var13 - var14) * var4
                     + (-var11 + 3.0F * var12 - 3.0F * var13 + var14) * var5
               );
      }

      float var10 = this.lillIllIil == 1 ? var3 : var3 * var3 * (3.0F - 2.0F * var3);
      var9[3] = this.lIllIllIil[(int)(var15 >>> 32)] + (this.lIllIllIil[(int)(var15 >>> 32) + 1] - this.lIllIllIil[(int)(var15 >>> 32)]) * var10;
      var9[4] = this.iIllIllIil[(int)(var15 >>> 32)] + (this.iIllIllIil[(int)(var15 >>> 32) + 1] - this.iIllIllIil[(int)(var15 >>> 32)]) * var10;
      return var9;
   }

   float[] IilliliilIIi(float degrees, float s) {
      float[] var3 = this.liiiIIllIl(degrees);
      float[] var4 = this.liiiIIllIl(degrees - 0.02F);
      float[] var5 = this.liiiIIllIl(degrees + 0.02F);
      float var6 = var5[0] - var4[0];
      float var7 = var5[1] - var4[1];
      float var8 = var5[2] - var4[2];
      float var9 = (float)Math.sqrt((double)(var6 * var6 + var7 * var7 + var8 * var8));
      var6 /= var9;
      var7 /= var9;
      var8 /= var9;
      float var10 = -var7 * var6;
      float var11 = 1.0F - var7 * var7;
      float var12 = -var7 * var8;
      var9 = (float)Math.sqrt((double)(var10 * var10 + var11 * var11 + var12 * var12));
      var10 /= var9;
      var11 /= var9;
      var12 /= var9;
      float var13 = var7 * var12 - var8 * var11;
      float var14 = var8 * var10 - var6 * var12;
      float var15 = var6 * var11 - var7 * var10;
      float var16 = (float)Math.toRadians((double)s);
      float var17 = (float)Math.cos((double)var16);
      float var18 = (float)Math.sin((double)var16);
      return new float[]{
         var3[0] + var10 * var3[4] * var17 + var13 * var3[3] * var18,
         var3[1] + var11 * var3[4] * var17 + var14 * var3[3] * var18,
         var3[2] + var12 * var3[4] * var17 + var15 * var3[3] * var18
      };
   }

   static lIiilIiliIiilIil IliIlllilIi(float[][] upper, boolean st) {
      long var12 = 1627296175053816518L;
      var12 ^= ((long)upper.length << 32 ^ var12) & -1L << 32;
      float[] var3 = new float[3 * (int)(var12 >>> 32)];
      float[] var4 = new float[(int)(var12 >>> 32)];
      float[] var5 = new float[(int)(var12 >>> 32)];

      for (long var15 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         float var7 = upper[(int)var15][0];
         float var8 = upper[(int)var15][1];
         float var9 = upper[(int)var15][2];
         float var10 = upper[(int)var15][3];
         float var11 = upper[(int)var15][4];
         if (st) {
            var3[3 * (int)var15 + 1] = var9 + 0.35F * (var8 - var9);
            var5[(int)var15] = 0.65F * (var8 - var9);
            var4[(int)var15] = var11;
         } else {
            var3[3 * (int)var15 + 1] = var9 - 0.35F * (var9 - var10);
            var5[(int)var15] = 0.65F * (var9 - var10);
            var4[(int)var15] = var11 * 0.82F;
         }

         var3[3 * (int)var15 + 2] = var7;
      }

      return new lIiilIiliIiilIil(1, var3, var4, var5);
   }

   float iliIiiliiiii(float s) {
      long var4 = 6771405451898908750L;
      float var2 = lilIiiIliilIiiIl.Ilillllill(s, 0.0F, (float)this.iillIllIil - 1.0F) * (float)this.lillIllIil;
      var4 ^= ((long)Math.min(this.IillIllIil.length - 2, (int)Math.floor((double)var2)) << 32 ^ var4) & -1L << 32;
      return (
            this.IillIllIil[(int)(var4 >>> 32)]
               + (this.IillIllIil[(int)(var4 >>> 32) + 1] - this.IillIllIil[(int)(var4 >>> 32)]) * (var2 - (float)((int)(var4 >>> 32)))
         )
         / this.IillIllIil[this.IillIllIil.length - 1];
   }

   lIiilIiliIiilIil(int per, float[] rxKeys, float[] ryKeys, float[] keys) {
      long var10 = 7526747514626834638L;
      super();
      this.lillIllIil = per;
      this.IIllIllIil = rxKeys;
      this.lIllIllIil = ryKeys;
      this.iIllIllIil = keys;
      this.iillIllIil = rxKeys.length / 3;
      this.IlllIllIil = IIilllIilIilllIi.iIlIlllllill(per, rxKeys);
      var10 ^= ((long)IIilllIilIilllIi.lIiiIiIlilli(this.IlllIllIil) << 32 ^ var10) & -1L << 32;
      this.llllIllIil = IIilllIilIilllIi.IilliliilIIi((int)(var10 >>> 32), ryKeys);
      this.illlIllIil = IIilllIilIilllIi.IilliliilIIi((int)(var10 >>> 32), keys);
      this.IillIllIil = new float[(int)(var10 >>> 32)];

      for (long var13 = var10 ^ (1L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         float var7 = this.IlllIllIil[3 * (int)var13] - this.IlllIllIil[3 * (int)var13 - 3];
         float var8 = this.IlllIllIil[3 * (int)var13 + 1] - this.IlllIllIil[3 * (int)var13 - 2];
         float var9 = this.IlllIllIil[3 * (int)var13 + 2] - this.IlllIllIil[3 * (int)var13 - 1];
         this.IillIllIil[(int)var13] = this.IillIllIil[(int)var13 - 1] + (float)Math.sqrt((double)(var7 * var7 + var8 * var8 + var9 * var9));
      }
   }
}
