package gg.corz;

final class llilliIlililliIl {
   private final float IIlliiiIll;
   private final float[] llIliiiIll = null;
   private final float liIliiiIll;
   private final boolean IllliiiIll;
   private final float[] ilIliiiIll = null;
   private final float iIlliiiIll;
   private final float iiIliiiIll;
   private final float[] IiIliiiIll = null;
   private final float lIlliiiIll;

   llilliIlililliIl(float[] sx, float[] r, float y, float sz) {
      long var9 = -4569223195116520889L;
      super();
      this.llIliiiIll = sx;
      this.ilIliiiIll = r;
      this.liIliiiIll = y;
      this.iiIliiiIll = sz;
      this.IllliiiIll = false;
      this.lIlliiiIll = 0.0F;
      this.iIlliiiIll = 0.0F;
      this.IiIliiiIll = new float[sx.length];
      float var5 = 0.5F * (y + sz);

      for (long var11 = var9 ^ (4294967296L ^ var9) & -1L << 32; (int)(var11 >>> 32) < sx.length; var11 += 4294967296L) {
         float var7 = (sx[(int)(var11 >>> 32)] - sx[(int)(var11 >>> 32) - 1]) * var5;
         float var8 = r[(int)(var11 >>> 32)] - r[(int)(var11 >>> 32) - 1];
         this.IiIliiiIll[(int)(var11 >>> 32)] = this.IiIliiiIll[(int)(var11 >>> 32) - 1] + (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
      }

      this.IIlliiiIll = this.IiIliiiIll[sx.length - 1];
   }

   void IliIlllilIi(ililiIilIiiliIil px, float c, float py, float[] out) {
      long var14 = -8381874934642480941L;
      float var5 = Math.max(0.0F, Math.min(1.0F, (c - 0.5F) / (float)(px.IIlIlilIil - 1)));
      float var6 = Math.max(0.0F, Math.min(1.0F, (py - 0.5F) / (float)(px.lIlIlilIil - 1)));
      float var7 = (float) (Math.PI * 2) * (var5 - 0.5F);
      float var8;
      float var9;
      if (this.IllliiiIll) {
         float var10 = (float) Math.PI * var6;
         var8 = (float)Math.sin((double)var10);
         var9 = this.lIlliiiIll + this.iIlliiiIll * (float)Math.cos((double)var10);
      } else {
         float var16 = (1.0F - var6) * this.IIlliiiIll;
         var14 ^= (0L ^ var14) & -1L << 32;

         while ((int)(var14 >>> 32) < this.IiIliiiIll.length - 2 && this.IiIliiiIll[(int)(var14 >>> 32) + 1] < var16) {
            var14 += 4294967296L;
         }

         float var12 = this.IiIliiiIll[(int)(var14 >>> 32) + 1] - this.IiIliiiIll[(int)(var14 >>> 32)];
         float var13 = var12 > 1.0E-6F ? (var16 - this.IiIliiiIll[(int)(var14 >>> 32)]) / var12 : 0.0F;
         var13 = Math.max(0.0F, Math.min(1.0F, var13));
         var8 = this.llIliiiIll[(int)(var14 >>> 32)] + (this.llIliiiIll[(int)(var14 >>> 32) + 1] - this.llIliiiIll[(int)(var14 >>> 32)]) * var13;
         var9 = this.ilIliiiIll[(int)(var14 >>> 32)] + (this.ilIliiiIll[(int)(var14 >>> 32) + 1] - this.ilIliiiIll[(int)(var14 >>> 32)]) * var13;
      }

      out[0] = -var8 * this.liIliiiIll * (float)Math.sin((double)var7);
      out[1] = var9;
      out[2] = -var8 * this.iiIliiiIll * (float)Math.cos((double)var7);
   }

   llilliIlililliIl(float cy, float ry, float rz, float rx) {
      this.IIlliiiIll = 1.0F;
      this.liIliiiIll = ry;
      this.iiIliiiIll = rx;
      this.lIlliiiIll = cy;
      this.iIlliiiIll = rz;
      this.IllliiiIll = true;
   }
}
