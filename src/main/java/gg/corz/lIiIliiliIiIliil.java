package gg.corz;

final class lIiIliiliIiIliil {
   private static final float[] llIliIilil = new float[]{-0.38F, 0.06F, 0.26F, 0.1F, 0.0F, -0.2F};
   float IllliIilil;
   final float[] liIliIilil;
   private final float[] IiiIiIilil;
   private static final float[] IlIliIilil = new float[]{0.0F, 0.035F, 0.14F, 0.3F, 0.58F, 1.0F};
   private boolean IliliIilil;
   private float iilliIilil;
   int IIlliIilil;
   private float IilliIilil;
   private final float[] iliIiIilil;
   static final float lIiIiIilil = (float)(-Math.sin(Math.toRadians(40.0)));
   private float lilliIilil;
   private static final int IliIiIilil = 44;
   static final float IIiIiIilil = (float)(-Math.cos(Math.toRadians(40.0)));
   final float[] ilIliIilil;
   final float[] iiIliIilil;
   private final float[] IIIliIilil;
   private float lIiliIilil;
   int iIlliIilil;
   final float[] IiIliIilil;
   private float iIiliIilil;
   private static final int iIiIiIilil = 8;
   int lIlliIilil;
   float illliIilil;
   private final float[] iIIliIilil;
   private float IIiliIilil;
   private final float[] iiiIiIilil;
   private final float[] lliIiIilil = new float[44];
   float lllliIilil;
   private final float[] liiIiIilil;
   private final float[] lIIliIilil;

   boolean lIiiIiIlilli(float x, float y) {
      return IIIllIIliIIl(this.ilIliIilil, this.IiIliIilil, this.IIlliIilil, x, y);
   }

   float iIlIlllllill(float x, float y) {
      return (x - this.IilliIilil) * IIiIiIilil + (y - this.lilliIilil) * lIiIiIilil;
   }

   private int IiIlliIliiIl(float x, float alpha, float d, float y, float band) {
      float var6 = Math.max(0.0F, Math.min(1.0F, 1.0F - (d - this.iIlIlllllill(x, alpha)) / y));
      return IilIliillilIliil.IIlllIlliIll(0, 0.6F * var6 * var6 * band);
   }

   boolean iliIiiliiiii(float x, float y) {
      return this.illliIilil >= 1.0F && IIIllIIliIIl(this.liIliIilil, this.iiIliIilil, this.lIlliIilil, x, y);
   }

   private int IilliliilIIi(float y, float r, float h, float x, float w) {
      long var17 = 2019142335975178743L;
      long var15 = -6585892710031121378L;
      var15 ^= (0L ^ var15) & -1L << 32;
      float[][] var7 = new float[][]{{y + h - w, r + x - w, 0.0F}, {y + w, r + x - w, 90.0F}, {y + w, r + w, 180.0F}, {y + h - w, r + w, 270.0F}};
      float[][] var8 = var7;
      var15 ^= ((long)var7.length ^ var15) & -1L >>> 32;
      var17 ^= (0L ^ var17) & -1L << 32;

      while ((int)(var17 >>> 32) < (int)var15) {
         float[] var11 = var8[(int)(var17 >>> 32)];

         for (var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 <= 8; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
            double var13 = Math.toRadians((double)var11[2] + 90.0 * (double)((int)var17) / 8.0);
            this.lliIiIilil[(int)(var15 >>> 32)] = var11[0] + (float)Math.cos(var13) * w;
            this.iliIiIilil[(int)(var15 >>> 32)] = var11[1] + (float)Math.sin(var13) * w;
            var15 += 4294967296L;
         }

         var17 += 4294967296L;
      }

      return (int)(var15 >>> 32);
   }

   lIiIliiliIiIliil() {
      this.iliIiIilil = new float[44];
      this.IiiIiIilil = new float[44];
      this.liiIiIilil = new float[44];
      this.iiiIiIilil = new float[44];
      this.IIIliIilil = new float[44];
      this.lIIliIilil = new float[44];
      this.iIIliIilil = new float[44];
      this.ilIliIilil = new float[44];
      this.IiIliIilil = new float[44];
      this.liIliIilil = new float[44];
      this.iiIliIilil = new float[44];
   }

   void IlIlllIlilIl(float alpha) {
      long var6 = -5970686909224959903L;
      if (this.iIlliIilil >= 3 && !(alpha <= 0.01F)) {
         IilIliillilIliil.IliIlllilIi();

         try {
            float var2 = this.illliIilil * 0.5F;
            float var3 = Math.min(22.0F, 6.0F + this.illliIilil * 0.05F);

            for (long var10 = var6 ^ (4294967296L ^ var6) & -1L << 32; (int)(var10 >>> 32) < this.iIlliIilil - 1; var10 += 4294967296L) {
               IilIliillilIliil.IlIlllIlilIl(
                  this.IiiIiIilil[0],
                  this.liiIiIilil[0],
                  this.IiIlliIliiIl(this.IiiIiIilil[0], this.liiIiIilil[0], var2, var3, alpha),
                  this.IiiIiIilil[(int)(var10 >>> 32)],
                  this.liiIiIilil[(int)(var10 >>> 32)],
                  this.IiIlliIliiIl(this.IiiIiIilil[(int)(var10 >>> 32)], this.liiIiIilil[(int)(var10 >>> 32)], var2, var3, alpha),
                  this.IiiIiIilil[(int)(var10 >>> 32) + 1],
                  this.liiIiIilil[(int)(var10 >>> 32) + 1],
                  this.IiIlliIliiIl(this.IiiIiIilil[(int)(var10 >>> 32) + 1], this.liiIiIilil[(int)(var10 >>> 32) + 1], var2, var3, alpha)
               );
            }
         } finally {
            IilIliillilIliil.liiiIIllIl();
         }
      }
   }

   private int liiiIIllIl(float[] count, float[] keepBelow, int limit, float py, boolean oy, float[] ox, float[] px) {
      long var16 = 1606860791078979187L;
      long var14 = -3020533720383808868L;
      var14 ^= (0L ^ var14) & -1L << 32;

      for (var14 ^= (0L ^ var14) & -1L >>> 32; (int)var14 < limit; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         var16 ^= ((long)(((int)var14 + 1) % limit) << 32 ^ var16) & -1L << 32;
         float var11 = this.iIlIlllllill(count[(int)var14], keepBelow[(int)var14]) - py;
         float var12 = this.iIlIlllllill(count[(int)(var16 >>> 32)], keepBelow[(int)(var16 >>> 32)]) - py;
         if (!oy) {
            var11 = -var11;
            var12 = -var12;
         }

         if (var11 <= 0.0F) {
            ox[(int)(var14 >>> 32)] = count[(int)var14];
            px[(int)(var14 >>> 32)] = keepBelow[(int)var14];
            var14 += 4294967296L;
         }

         if (var11 <= 0.0F != var12 <= 0.0F && (int)(var14 >>> 32) < ox.length) {
            float var13 = var11 / (var11 - var12);
            ox[(int)(var14 >>> 32)] = count[(int)var14] + (count[(int)(var16 >>> 32)] - count[(int)var14]) * var13;
            px[(int)(var14 >>> 32)] = keepBelow[(int)var14] + (keepBelow[(int)(var16 >>> 32)] - keepBelow[(int)var14]) * var13;
            var14 += 4294967296L;
         }
      }

      return (int)(var14 >>> 32);
   }

   private int Illlllllilll(int x, float d, float back, float y, float alpha) {
      long var11 = -6702481181077810653L;
      float var6 = Math.max(0.0F, Math.min(1.0F, (this.iIlIlllllill(d, back) - y) / Math.max(1.0F, y)));
      var11 ^= (4294967296L ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < IlIliIilil.length - 1 && var6 > IlIliIilil[(int)(var11 >>> 32)]) {
         var11 += 4294967296L;
      }

      float var8 = (var6 - IlIliIilil[(int)(var11 >>> 32) - 1]) / (IlIliIilil[(int)(var11 >>> 32)] - IlIliIilil[(int)(var11 >>> 32) - 1]);
      float var9 = llIliIilil[(int)(var11 >>> 32) - 1]
         + (llIliIilil[(int)(var11 >>> 32)] - llIliIilil[(int)(var11 >>> 32) - 1]) * Math.max(0.0F, Math.min(1.0F, var8));
      var11 ^= ((long)(var9 >= 0.0F ? IIIiIillIIiIil.lliIliliIl(x, -1, var9) : IIIiIillIIiIil.lliIliliIl(x, -16777216, -var9)) ^ var11) & -1L >>> 32;
      return IilIliillilIliil.IIlllIlliIll((int)var11, alpha);
   }

   private static boolean IIIllIIliIIl(float[] count, float[] y, int px, float py, float x) {
      long var8 = -93449038363058913L;
      if (px < 3) {
         return false;
      } else {
         var8 ^= (0L ^ var8) & -1L << 32;

         while ((int)(var8 >>> 32) < px) {
            var8 ^= ((long)(((int)(var8 >>> 32) + 1) % px) ^ var8) & -1L >>> 32;
            float var7 = (count[(int)var8] - count[(int)(var8 >>> 32)]) * (x - y[(int)(var8 >>> 32)])
               - (y[(int)var8] - y[(int)(var8 >>> 32)]) * (py - count[(int)(var8 >>> 32)]);
            if (var7 < 0.0F) {
               return false;
            }

            var8 += 4294967296L;
         }

         return true;
      }
   }

   void IliIlllilIi(float h, float radius, float x0, float lift, float y0, float w) {
      long var12 = -4594519646153571560L;
      long var14 = 5992572666093203277L;
      this.illliIilil = Math.max(0.0F, w);
      var12 ^= ((long)this.IilliliilIIi(h, radius, x0, lift, Math.min(y0, Math.min(x0, lift) / 2.0F)) << 32 ^ var12) & -1L << 32;
      this.IilliIilil = h + x0;
      this.lilliIilil = radius + lift;
      float var8 = this.illliIilil * 0.5F;
      this.IIlliIilil = this.liiiIIllIl(this.lliIiIilil, this.iliIiIilil, (int)(var12 >>> 32), var8, true, this.ilIliIilil, this.IiIliIilil);
      this.IllliIilil = 0.0F;
      this.lllliIilil = 0.0F;

      for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < this.IIlliIilil; var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         this.IllliIilil = this.IllliIilil + this.ilIliIilil[(int)var12];
         this.lllliIilil = this.lllliIilil + this.IiIliIilil[(int)var12];
      }

      if (this.IIlliIilil > 0) {
         this.IllliIilil = this.IllliIilil / (float)this.IIlliIilil;
         this.lllliIilil = this.lllliIilil / (float)this.IIlliIilil;
      }

      this.lIlliIilil = this.IIlliIilil;

      for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < this.IIlliIilil; var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         var14 ^= ((long)(this.IIlliIilil - 1 - (int)var12) << 32 ^ var14) & -1L << 32;
         float var11 = this.illliIilil - 2.0F * this.iIlIlllllill(this.ilIliIilil[(int)(var14 >>> 32)], this.IiIliIilil[(int)(var14 >>> 32)]);
         this.liIliIilil[(int)var12] = this.ilIliIilil[(int)(var14 >>> 32)] + IIiIiIilil * var11;
         this.iiIliIilil[(int)var12] = this.IiIliIilil[(int)(var14 >>> 32)] + lIiIiIilil * var11;
      }

      this.IliliIilil = false;

      for (long var19 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var19 < this.IIlliIilil; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         var14 ^= ((long)(((int)var19 + 1) % this.IIlliIilil) << 32 ^ var14) & -1L << 32;
         if (Math.abs(this.iIlIlllllill(this.ilIliIilil[(int)var19], this.IiIliIilil[(int)var19]) - var8) < 0.01F
            && Math.abs(this.iIlIlllllill(this.ilIliIilil[(int)(var14 >>> 32)], this.IiIliIilil[(int)(var14 >>> 32)]) - var8) < 0.01F) {
            this.iilliIilil = this.ilIliIilil[(int)var19];
            this.IIiliIilil = this.IiIliIilil[(int)var19];
            this.lIiliIilil = this.ilIliIilil[(int)(var14 >>> 32)];
            this.iIiliIilil = this.IiIliIilil[(int)(var14 >>> 32)];
            this.IliliIilil = true;
         }
      }

      float var9 = Math.min(22.0F, 6.0F + this.illliIilil * 0.05F);
      this.iIlliIilil = this.liiiIIllIl(this.ilIliIilil, this.IiIliIilil, this.IIlliIilil, var8 - var9, false, this.IiiIiIilil, this.liiIiIilil);
   }

   void IIlllIlliIll(float alpha) {
      long var9 = 3071449915888380047L;
      long var11 = 6417012539138324271L;
      long var13 = -5117170694529794675L;
      if (this.lIlliIilil >= 3 && !(alpha <= 0.01F) && !(this.illliIilil < 1.0F)) {
         float var2 = this.illliIilil * 0.5F;
         IilIliillilIliil.IliIlllilIi();

         try {
            var9 ^= (0L ^ var9) & -1L << 32;

            while ((int)(var9 >>> 32) < 2) {
               float var4 = (int)(var9 >>> 32) == 0 ? 1.5F : 4.0F;
               float var5 = (int)(var9 >>> 32) == 0 ? 2.5F : 6.0F;
               var9 ^= ((long)IilIliillilIliil.IIlllIlliIll(0, ((int)(var9 >>> 32) == 0 ? 0.3F : 0.12F) * alpha) ^ var9) & -1L >>> 32;

               for (var11 ^= (4294967296L ^ var11) & -1L << 32; (int)(var11 >>> 32) < this.lIlliIilil - 1; var11 += 4294967296L) {
                  IilIliillilIliil.IlIlllIlilIl(
                     this.liIliIilil[0] + var4,
                     this.iiIliIilil[0] + var5,
                     (int)var9,
                     this.liIliIilil[(int)(var11 >>> 32)] + var4,
                     this.iiIliIilil[(int)(var11 >>> 32)] + var5,
                     (int)var9,
                     this.liIliIilil[(int)(var11 >>> 32) + 1] + var4,
                     this.iiIliIilil[(int)(var11 >>> 32) + 1] + var5,
                     (int)var9
                  );
               }

               var9 += 4294967296L;
            }

            var9 ^= ((long)IIIiIillIIiIil.lliIliliIl(0xFF000000 | IilIIIIililIIIIi.iIlIlllllill() & 16777215, -6310698, 0.14F) << 32 ^ var9) & -1L << 32;

            for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 + 1 < IlIliIilil.length; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
               var13 ^= (
                     (long)this.liiiIIllIl(
                              this.liIliIilil,
                              this.iiIliIilil,
                              this.lIlliIilil,
                              var2 + IlIliIilil[(int)var11] * var2 - 0.01F,
                              false,
                              this.iiiIiIilil,
                              this.IIIliIilil
                           )
                           << 32
                        ^ var13
                  )
                  & -1L << 32;
               if ((int)(var13 >>> 32) >= 3) {
                  var13 ^= (
                        (long)this.liiiIIllIl(
                                 this.iiiIiIilil,
                                 this.IIIliIilil,
                                 (int)(var13 >>> 32),
                                 var2 + IlIliIilil[(int)var11 + 1] * var2 + 0.01F,
                                 true,
                                 this.lIIliIilil,
                                 this.iIIliIilil
                              )
                              << 32
                           ^ var13
                     )
                     & -1L << 32;

                  for (var9 ^= (1L ^ var9) & -1L >>> 32; (int)var9 < (int)(var13 >>> 32) - 1; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
                     IilIliillilIliil.IlIlllIlilIl(
                        this.lIIliIilil[0],
                        this.iIIliIilil[0],
                        this.Illlllllilll((int)(var9 >>> 32), this.lIIliIilil[0], this.iIIliIilil[0], var2, alpha),
                        this.lIIliIilil[(int)var9],
                        this.iIIliIilil[(int)var9],
                        this.Illlllllilll((int)(var9 >>> 32), this.lIIliIilil[(int)var9], this.iIIliIilil[(int)var9], var2, alpha),
                        this.lIIliIilil[(int)var9 + 1],
                        this.iIIliIilil[(int)var9 + 1],
                        this.Illlllllilll((int)(var9 >>> 32), this.lIIliIilil[(int)var9 + 1], this.iIIliIilil[(int)var9 + 1], var2, alpha)
                     );
                  }
               }
            }

            var11 ^= ((long)IilIliillilIliil.IIlllIlliIll(16777215, 0.16F * alpha) ^ var11) & -1L >>> 32;

            for (var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < this.lIlliIilil; var13 += 4294967296L) {
               var9 ^= ((long)(((int)(var13 >>> 32) + 1) % this.lIlliIilil) ^ var9) & -1L >>> 32;
               if (!(Math.abs(this.iIlIlllllill(this.liIliIilil[(int)(var13 >>> 32)], this.iiIliIilil[(int)(var13 >>> 32)]) - var2) < 0.05F)
                  || !(Math.abs(this.iIlIlllllill(this.liIliIilil[(int)var9], this.iiIliIilil[(int)var9]) - var2) < 0.05F)) {
                  IilIliillilIliil.iliIiiliiiii(
                     this.liIliIilil[(int)(var13 >>> 32)],
                     this.iiIliIilil[(int)(var13 >>> 32)],
                     this.liIliIilil[(int)var9],
                     this.iiIliIilil[(int)var9],
                     0.3F,
                     (int)var11,
                     (int)var11
                  );
               }
            }

            if (this.IliliIilil) {
               var13 ^= ((long)IilIliillilIliil.IIlllIlliIll(16777215, 0.32F * alpha) << 32 ^ var13) & -1L << 32;
               IilIliillilIliil.iliIiiliiiii(this.iilliIilil, this.IIiliIilil, this.lIiliIilil, this.iIiliIilil, 0.4F, (int)(var13 >>> 32), (int)(var13 >>> 32));
            }
         } finally {
            IilIliillilIliil.liiiIIllIl();
         }
      }
   }
}
