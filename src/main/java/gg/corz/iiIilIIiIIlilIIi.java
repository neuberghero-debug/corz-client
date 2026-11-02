package gg.corz;

public final class iiIilIIiIIlilIIi {
   private final float[] IIlllIiiil;
   private final float[] illllIiiil;
   static final float liiiIIiiil = 0.85F;
   private final float[] IIIllIiiil;
   private double IlillIiiil;
   private float iIlilIiiil;
   static final float lliiIIiiil = 0.8F;
   public static final float liliIIiiil = 0.035F;
   private static final float[] IllIlIiiil = new float[15];
   private float liillIiiil;
   private static final float[] IIlIlIiiil = new float[]{0.0F, 1.0F, 0.0F};
   static final float llIIlIiiil = 0.72F;
   private static final float[] liIIlIiiil = new float[]{0.0F, 0.3F, 1.0F, 0.3F, 0.0F};
   public static final float llIiIIiiil = 0.6F;
   static final float lIiiIIiiil = 0.55F;
   private final float[] lilllIiiil;
   public static final float IiliIIiiil = 0.3F;
   private final double[] IIiIlIiiil;
   private int liIilIiiil;
   private double iIillIiiil;
   public static final double lIIiIIiiil = 0.015;
   private final int[] ilIllIiiil;
   static final float IIIIlIiiil = 0.9F;
   private final double[] iilIlIiiil;
   private final float[] iIIllIiiil;
   static final float IlIIlIiiil = 0.07F;
   private final int IilIlIiiil;
   public static final float iIliIIiiil = 0.99F;
   private double lIillIiiil;
   private final double[] iIiIlIiiil;
   private final float[] iIlllIiiil;
   public static final float IIiiIIiiil = 0.75F;
   private float llIilIiiil;
   public static final int iiIiIIiiil = 400;
   private static final float[] IiIIlIiiil = new float[]{-1.0F, -0.4F, 0.0F, 0.4F, 1.0F};
   private int IiIllIiiil;
   private lilIlIIiiilIlIIi ilillIiiil;
   static final float iIIIlIiiil = 0.15F;
   public static final float IiIiIIiiil = 0.03F;
   private final float[] IlIllIiiil;
   private final float[] IllllIiiil;
   private final double[] llIllIiiil;
   public static final float iiliIIiiil = 0.04F;
   private final float[] IliIlIiiil;
   private int ilIilIiiil;
   static final float IiiiIIiiil = 0.28F;
   public static final int IIliIIiiil = 64;
   static final float iIiiIIiiil = 0.05F;
   private int lIlilIiiil;
   public static final double llilIIiiil = 0.6;
   private int iIIilIiiil;
   private float IiillIiiil;
   static final float lIIIlIiiil = 0.7F;
   private int IIlilIiiil;
   private final float[] liIllIiiil;
   private double IIillIiiil;
   private final float[] lIlllIiiil;
   private final double[] lilIlIiiil;
   private final float[] lIIllIiiil;
   static final float IliiIIiiil = 0.22F;
   static final float ilIIlIiiil = 0.45F;
   private final float[] liiIlIiiil;
   private float IIIilIiiil;
   public static final double liilIIiiil = 0.5;
   public static final int IIIiIIiiil = 12;
   static final float iliiIIiiil = 0.8F;
   private static final float iIlIlIiiil = (float)Math.cos(Math.PI / 7);
   private IliiiIIilliiiIIi llillIiiil;
   public static final float IlIiIIiiil = 0.3F;
   private int iiIilIiiil;
   private final float[] lllllIiiil;
   private static final float[] lllIlIiiil = new float[15];
   private final float[] iiIllIiiil;
   public static final float llliIIiiil = 3.0F;
   private int lliIlIiiil;
   public static final float liIiIIiiil = 0.08F;
   public static final int IiilIIiiil = 2;
   public static final float IlliIIiiil = 0.12F;
   public static final double IlilIIiiil = 0.2;
   public static final float illiIIiiil = 6.0F;
   public static final double iiilIIiiil = 0.1;
   private final float[] IilllIiiil;
   public static final float ililIIiiil = 0.95F;
   private final double[] lIiIlIiiil;
   private final int illIlIiiil;
   private static final int lIlIlIiiil = 14;
   private int IlIilIiiil;
   private final float[] iliIlIiiil;
   public static final int lIliIIiiil = 24;
   private final float[] IiiIlIiiil;
   private final float[] IllilIiiil;
   public static final float ilIiIIiiil = 2.4F;
   private int IiIilIiiil;
   static final float iiiiIIiiil = 0.95F;
   private final double[] iilllIiiil = new double[3];
   private float lIIilIiiil;
   public static final float iIIiIIiiil = 0.7F;
   private static final float[] iiIIlIiiil = new float[]{-1.0F, 0.0F, 1.0F};
   private final float[] iiiIlIiiil;
   private float iiillIiiil;

   public int IIillIiliIil() {
      return this.IIlilIiiil;
   }

   public int Iilllilliill() {
      return this.iiIilIiiil;
   }

   private float IllIllllIl(float base) {
      return base * Math.max(1.0F, this.llillIiiil.llIiliiiil / 0.3F);
   }

   static float lIliliIlil(float f, float a, float b) {
      return f + (a - f) * b;
   }

   public iiIilIIiIIlilIIi(int bufferCapacity) {
      this.IllilIiiil = new float[3];
      this.illIlIiiil = bufferCapacity + 4;
      this.IilIlIiiil = Math.max(640, bufferCapacity + 260);
      this.lilIlIiiil = new double[this.illIlIiiil];
      this.iilIlIiiil = new double[this.illIlIiiil];
      this.IIiIlIiiil = new double[this.illIlIiiil];
      this.lIiIlIiiil = new double[this.illIlIiiil];
      this.iIiIlIiiil = new double[this.illIlIiiil];
      this.IliIlIiiil = new float[this.illIlIiiil];
      this.iliIlIiiil = new float[this.IilIlIiiil];
      this.IiiIlIiiil = new float[this.IilIlIiiil];
      this.liiIlIiiil = new float[this.IilIlIiiil];
      this.iiiIlIiiil = new float[this.IilIlIiiil];
      this.IIIllIiiil = new float[this.IilIlIiiil];
      this.lIIllIiiil = new float[this.IilIlIiiil];
      this.iIIllIiiil = new float[this.IilIlIiiil];
      this.IlIllIiiil = new float[this.IilIlIiiil];
      this.llIllIiiil = new double[this.IilIlIiiil];
      this.ilIllIiiil = new int[this.IilIlIiiil];
      this.liIllIiiil = new float[this.IilIlIiiil];
      this.iiIllIiiil = new float[this.IilIlIiiil];
      this.IIlllIiiil = new float[this.IilIlIiiil];
      this.lIlllIiiil = new float[this.IilIlIiiil];
      this.iIlllIiiil = new float[this.IilIlIiiil];
      this.IllllIiiil = new float[this.IilIlIiiil];
      this.lllllIiiil = new float[this.IilIlIiiil];
      this.illllIiiil = new float[this.IilIlIiiil];
      this.IilllIiiil = new float[this.IilIlIiiil];
      this.lilllIiiil = new float[this.IilIlIiiil];
   }

   private void liIlliiIll(float[] px, float[] py, float[] pz) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      boolean var7 = false;

      for (int var8 = 0; var8 < this.IiIllIiiil; var8++) {
         int var9 = var8 > 0 ? var8 - 1 : var8;
         int var10 = var8 < this.IiIllIiiil - 1 ? var8 + 1 : var8;
         float var11 = px[var10] - px[var9];
         float var12 = py[var10] - py[var9];
         float var13 = pz[var10] - pz[var9];
         float var14 = px[var8];
         float var15 = py[var8];
         float var16 = pz[var8];
         float var17 = var12 * var16 - var13 * var15;
         float var18 = var13 * var14 - var11 * var16;
         float var19 = var11 * var15 - var12 * var14;
         float var20 = (float)Math.sqrt((double)(var17 * var17 + var18 * var18 + var19 * var19));
         float var21 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         float var22 = (float)Math.sqrt((double)(var14 * var14 + var15 * var15 + var16 * var16));
         if (var20 > 0.02F * var21 * var22 && var20 > 1.0E-9F) {
            var17 /= var20;
            var18 /= var20;
            var19 /= var20;
            if (var7 && var17 * var4 + var18 * var5 + var19 * var6 < 0.0F) {
               var17 = -var17;
               var18 = -var18;
               var19 = -var19;
            }
         } else if (var7) {
            var17 = var4;
            var18 = var5;
            var19 = var6;
         } else {
            var17 = 1.0F;
            var18 = 0.0F;
            var19 = 0.0F;
         }

         this.iIlllIiiil[var8] = var17;
         this.IllllIiiil[var8] = var18;
         this.lllllIiiil[var8] = var19;
         var4 = var17;
         var5 = var18;
         var6 = var19;
         var7 = true;
         this.IilllIiiil[var8] = 1.0F;
         this.lilllIiiil[var8] = 1.0F;
         if (var8 > 0 && var8 < this.IiIllIiiil - 1 && this.illllIiiil[var8] > 1.0E-5F) {
            float var23 = IIllllIlll(
               px[var8 - 1], py[var8 - 1], pz[var8 - 1], px[var8], py[var8], pz[var8], px[var8 + 1], py[var8 + 1], pz[var8 + 1], var17, var18, var19
            );
            float var24 = this.illllIiiil[var8] * Math.abs(var23);
            if (var24 > 0.95F) {
               float var25 = 0.95F / var24;
               if (var23 > 0.0F) {
                  this.IilllIiiil[var8] = var25;
               } else {
                  this.lilllIiiil[var8] = var25;
               }
            }
         }
      }

      float var26 = 1.0F;
      float var27 = 1.0F;

      for (int var28 = 0; var28 < this.IiIllIiiil; var28++) {
         float var29 = this.IilllIiiil[var28];
         float var30 = this.lilllIiiil[var28];
         float var31 = var28 + 1 < this.IiIllIiiil ? this.IilllIiiil[var28 + 1] : 1.0F;
         float var32 = var28 + 1 < this.IiIllIiiil ? this.lilllIiiil[var28 + 1] : 1.0F;
         this.IilllIiiil[var28] = Math.min(var29, Math.min(var26, var31));
         this.lilllIiiil[var28] = Math.min(var30, Math.min(var27, var32));
         var26 = var29;
         var27 = var30;
      }
   }

   private int lliIliliIl(float u) {
      long var4 = -405238264417315350L;
      if (this.llillIiiil.IIIiliiiil) {
         float var3 = (float)(
            this.llillIiiil.liIiliiiil * Double.longBitsToDouble(-6198208557093382380L ^ -7622444770402055363L)
               + (double)u * Double.longBitsToDouble(6389960461756682967L ^ 7455518317279193142L)
         );
         var3 -= (float)Math.floor((double)var3);
         var4 ^= ((long)ilillIiill(var3, 0.72F, 1.0F) << 32 ^ var4) & -1L << 32;
      } else {
         float var7 = this.IiillIiiil - 0.07F * u;
         var7 -= (float)Math.floor((double)var7);
         var4 ^= ((long)ilillIiill(var7, this.liillIiiil, this.iiillIiiil) << 32 ^ var4) & -1L << 32;
      }

      float var9 = 0.15F * this.IIIilIiiil * (1.0F - u) * (1.0F - u);
      return Ilillllill((int)(var4 >>> 32), var9);
   }

   private void Illillliilli(int lambda, double passes) {
      for (int var4 = 0; var4 < lambda; var4++) {
         double var5 = this.lilIlIiiil[0];
         double var7 = this.iilIlIiiil[0];
         double var9 = this.IIiIlIiiil[0];

         for (int var11 = 1; var11 < this.lliIlIiiil - 1; var11++) {
            double var12 = this.lilIlIiiil[var11];
            double var14 = this.iilIlIiiil[var11];
            double var16 = this.IIiIlIiiil[var11];
            this.lilIlIiiil[var11] = var12 + passes * ((var5 + this.lilIlIiiil[var11 + 1]) * 0.5 - var12);
            this.iilIlIiiil[var11] = var14 + passes * ((var7 + this.iilIlIiiil[var11 + 1]) * 0.5 - var14);
            this.IIiIlIiiil[var11] = var16 + passes * ((var9 + this.IIiIlIiiil[var11 + 1]) * 0.5 - var16);
            var5 = var12;
            var7 = var14;
            var9 = var16;
         }
      }
   }

   public void IIIilIIiiIIi(iIIIilllIlIIilll style, double sink, double camY, double camX, double buffer, IliiiIIilliiiIIi camZ, lilIlIIiiilIlIIi now) {
      int var12 = style.liiiIIllIl();
      if (var12 != 0 && !(camZ.IlIiliiiil <= 0.0)) {
         this.IIillIiiil = sink;
         this.lIillIiiil = camY;
         this.iIillIiiil = camX;
         this.IlillIiiil = buffer;
         this.llillIiiil = camZ;
         this.ilillIiiil = now;
         float[] var13 = this.liilliiill(camZ.lIIiliiiil);
         this.IiillIiiil = var13[0];
         this.liillIiiil = var13[1];
         this.iiillIiiil = var13[2];
         float var14 = camZ.IIIiliiiil ? 0.72F : this.liillIiiil;
         this.IIIilIiiil = var14 * var14;
         this.lIIilIiiil = 0.45F + 0.55F * var14;
         this.IlIilIiiil = Math.max(1, Math.min(400, camZ.iIliliiiil));
         this.llIilIiiil = (float)this.IlIilIiiil * 0.75F;
         this.ilIilIiiil = 0;
         int var15 = Math.max(64, camZ.lIliliiiil);
         int var16 = var12;

         while (var16 > 0) {
            int var17 = var16 - 1;

            while (var17 > 0 && !style.IIiilIiiiIii(var17)) {
               var17--;
            }

            this.iIIilIiiil = Math.min(this.IilIlIiiil, var15);
            if (this.iIIilIiiil < 24 || camZ.iiilliiiil == IIIliIIilIIliIIi.IlIilliiil && this.IiIiliIiiiIi()) {
               break;
            }

            this.IIlilIliiIli(style, var17, var16, var16 == var12);
            var15 -= this.IiIllIiiil;
            var16 = var17;
         }

         this.ilillIiiil = null;
         this.llillIiiil = null;
      }
   }

   static int IiIilliIil(int v) {
      return v < 0 ? 0 : Math.min(v, ((1817688614 ^ 103 ^ -87) << 15 | (1817688614 ^ 103 ^ -87) >>> 17) ^ 586434859);
   }

   public void liiiIIllIl() {
      this.IiIilIiiil = 0;
      this.liIilIiiil = 0;
      this.iiIilIiiil = 0;
      this.IIlilIiiil = 0;
      this.lIlilIiiil = 0;
      this.iIlilIiiil = 0.0F;
   }

   private void lllllillll(float px, float a, float glowAngle, float r, float py, int pz, float oddRim, int rgb, float stride) {
      float var10 = (float)Math.sqrt((double)(px * px + a * a + glowAngle * glowAngle));
      if (!(var10 < 1.0E-4F)) {
         float var11 = -px / var10;
         float var12 = -a / var10;
         float var13 = -glowAngle / var10;
         float var14 = var13;
         float var15 = -var11;
         float var16 = (float)Math.sqrt((double)(var13 * var13 + var15 * var15));
         if (var16 < 1.0E-4F) {
            var14 = 1.0F;
            var15 = 0.0F;
            var16 = 1.0F;
         }

         var14 /= var16;
         var15 /= var16;
         float var17 = var12 * var15;
         float var18 = var13 * var14 - var11 * var15;
         float var19 = -var12 * var14;
         int var20 = lIilliIill(Ilillllill(pz, 0.12F * this.IIIilIiiil), py * 0.9F);
         int var21 = lIilliIill(pz, 0.0F);
         int var22 = iilllIIill(Ilillllill(pz, 0.1F * this.IIIilIiiil), py * 0.7F * this.lIIilIiiil);
         float var23 = Math.min(r * 2.4F, Math.max(r * 1.2F, oddRim * var10));
         int var24 = 0;

         while (var24 < 14) {
            int var25 = var24 + rgb;
            float var26 = (var24 & 1) == 0 ? 1.0F : stride;
            float var27 = (var25 & 1) == 0 ? 1.0F : stride;
            float var28 = IllIlIiiil[var24] * var26;
            float var29 = lllIlIiiil[var24] * var26;
            float var30 = IllIlIiiil[var25] * var27;
            float var31 = lllIlIiiil[var25] * var27;
            float var32 = px + (var14 * var28 + var17 * var29) * r;
            float var33 = a + var18 * var29 * r;
            float var34 = glowAngle + (var15 * var28 + var19 * var29) * r;
            float var35 = px + (var14 * var30 + var17 * var31) * r;
            float var36 = a + var18 * var31 * r;
            float var37 = glowAngle + (var15 * var30 + var19 * var31) * r;
            this.ilillIiiil.IliIlllilIi(px, a, glowAngle, var20, var32, var33, var34, var21, var35, var36, var37, var21, px, a, glowAngle, var20);
            this.IIlilIiiil++;
            float var38 = px + (var14 * var28 + var17 * var29) * var23;
            float var39 = a + var18 * var29 * var23;
            float var40 = glowAngle + (var15 * var28 + var19 * var29) * var23;
            float var41 = px + (var14 * var30 + var17 * var31) * var23;
            float var42 = a + var18 * var31 * var23;
            float var43 = glowAngle + (var15 * var30 + var19 * var31) * var23;
            this.ilillIiiil.liiiIIllIl(px, a, glowAngle, var22, var38, var39, var40, -16777216, var41, var42, var43, -16777216);
            this.iiIilIiiil++;
            var24 += rgb;
         }
      }
   }

   public iiIilIIiIIlilIIi() {
      this((--170235231 << 11 | --170235231 >>> 21) - -83 ^ 749402404);
   }

   static double iiIilIIlil(double a, double f, double b) {
      return a + (f - a) * b;
   }

   private void IIlilIliiIli(iIIIilllIlIIilll latest, int s, int e, boolean b) {
      this.IiIllIiiil = 0;
      double var5 = this.IIillIiiil - this.llillIiiil.IlIiliiiil;
      int var7 = s;

      while (var7 < e && latest.IIIilIIiiIIi(var7) <= var5) {
         var7++;
      }

      boolean var8 = b && latest.iIlIlllllill() && latest.Iliilliiilii() > var5;
      if (var7 != e || var8) {
         this.lliIlIiiil = 0;
         boolean var9 = var7 > s;
         if (var9) {
            int var10 = var7 - 1;
            double var11;
            double var13;
            double var15;
            double var17;
            double var19;
            float var21;
            if (var7 < e) {
               var11 = latest.IlIillIiilIi(var7);
               var13 = latest.IiIiliIiiiIi(var7);
               var15 = latest.IIlilIliiIli(var7);
               var17 = latest.IIIilIIiiIIi(var7);
               var21 = latest.Iilililiiili(var7);
               var19 = latest.Illillliilli(var7);
            } else {
               var11 = latest.Iiiiliiiiiii();
               var13 = latest.IIIIllIIIl();
               var15 = latest.iIIIlIlIIl();
               var17 = latest.Iliilliiilii();
               var21 = latest.llIIlilIIl();
               var19 = latest.Illillliilli(var10)
                  + iIIIilllIlIIilll.iiIIlIIlIl(var11, var13, var15, latest.IlIillIiilIi(var10), latest.IiIiliIiiiIi(var10), latest.IIlilIliiIli(var10));
            }

            double var22 = var17 - latest.IIIilIIiiIIi(var10);
            double var24 = var22 <= 1.0E-9 ? 1.0 : llIililIil((var5 - latest.IIIilIIiiIIi(var10)) / var22);
            this.IIiilIiiiIii(
               iiIilIIlil(latest.IlIillIiilIi(var10), var11, var24),
               iiIilIIlil(latest.IiIiliIiiiIi(var10), var13, var24),
               iiIilIIlil(latest.IIlilIliiIli(var10), var15, var24),
               var5,
               (float)iiIilIIlil((double)latest.Iilililiiili(var10), (double)var21, var24),
               iiIilIIlil(latest.Illillliilli(var10), var19, var24),
               false
            );
         }

         double var26 = Iilililiiili(this.llillIiiil.llIiliiiil);
         if (this.iIIilIiiil < this.IilIlIiiil) {
            int var12 = var9 ? var7 - 1 : s;
            double var29 = latest.Illillliilli(e - 1) - latest.Illillliilli(var12);
            if (var8) {
               var29 += iIIIilllIlIIilll.iiIIlIIlIl(
                  latest.Iiiiliiiiiii(),
                  latest.IIIIllIIIl(),
                  latest.iIIIlIlIIl(),
                  latest.IlIillIiilIi(e - 1),
                  latest.IiIiliIiiiIi(e - 1),
                  latest.IIlilIliiIli(e - 1)
               );
            }

            double var32 = (double)this.iIIilIiiil * 0.5 - 4.0;

            while (var29 / var26 > var32 && var26 < 10000.0) {
               var26 *= 2.0;
            }
         }

         for (int var27 = var9 ? var7 : s; var27 < e; var27++) {
            boolean var30 = !var8 && var27 == e - 1;
            boolean var14 = var27 == s && !var9 || var30;
            boolean var33 = var27 > s && Math.floor(latest.Illillliilli(var27) / var26) != Math.floor(latest.Illillliilli(var27 - 1) / var26);
            if (var14 || var33) {
               this.IIiilIiiiIii(
                  latest.IlIillIiilIi(var27),
                  latest.IiIiliIiiiIi(var27),
                  latest.IIlilIliiIli(var27),
                  latest.IIIilIIiiIIi(var27),
                  latest.Iilililiiili(var27),
                  latest.Illillliilli(var27),
                  var30
               );
            }
         }

         if (var8) {
            int var28 = e - 1;
            double var31 = latest.Illillliilli(var28)
               + iIIIilllIlIIilll.iiIIlIIlIl(
                  latest.Iiiiliiiiiii(),
                  latest.IIIIllIIIl(),
                  latest.iIIIlIlIIl(),
                  latest.IlIillIiilIi(var28),
                  latest.IiIiliIiiiIi(var28),
                  latest.IIlilIliiIli(var28)
               );
            this.IIiilIiiiIii(latest.Iiiiliiiiiii(), latest.IIIIllIIIl(), latest.iIIIlIlIIl(), latest.Iliilliiilii(), latest.llIIlilIIl(), var31, true);
         }

         if (this.lliIlIiiil >= 2) {
            this.Illillliilli(2, 0.5);
            this.Iiiiliiiiiii();
            if (this.IiIllIiiil >= 2) {
               this.llIIlilIIl(var9, b && var8);
               this.IiIilIiiil++;
               this.liIilIiiil = this.liIilIiiil + this.IiIllIiiil;
               this.iIlilIiiil = Math.max(this.iIlilIiiil, Math.max(this.iIIllIiiil[0], this.iIIllIiiil[this.IiIllIiiil - 1]));
               switch (this.llillIiiil.iiilliiiil) {
                  case lIIilliiil:
                     this.iiiIlIIIll();
                     break;
                  case iIIilliiil:
                     this.lIIlliIIll();
                     break;
                  case IlIilliiil:
                     this.iIlllIllll();
               }
            }
         }
      }
   }

   public int Ililllililil() {
      return this.lIlilIiiil;
   }

   private void IIiilIiiiIii(double od, double end, double x, double t, float y, double z, boolean h) {
      long var20 = -4497126297879299578L;
      double var13 = od - this.lIillIiiil;
      double var15 = end - this.iIillIiiil;
      double var17 = x - this.IlillIiiil;
      if (this.lliIlIiiil > 0) {
         var20 ^= ((long)(this.lliIlIiiil - 1) << 32 ^ var20) & -1L << 32;
         if (iIIIilllIlIIilll.iiIIlIIlIl(
               var13, var15, var17, this.lilIlIiiil[(int)(var20 >>> 32)], this.iilIlIiiil[(int)(var20 >>> 32)], this.IIiIlIiiil[(int)(var20 >>> 32)]
            )
            < Double.longBitsToDouble(-8444336785254615836L ^ -5386014613141231012L)) {
            if (h && this.lliIlIiiil > ((~641667602 >>> 23 | ~641667602 << 9) - 53 ^ -2116297857)) {
               this.Iliilliiilii((int)(var20 >>> 32), var13, var15, var17, t, y, z);
            }

            return;
         }
      }

      if (this.lliIlIiiil >= this.illIlIiiil) {
         if (h) {
            this.Iliilliiilii(this.lliIlIiiil - 1, var13, var15, var17, t, y, z);
         }
      } else {
         this.Iliilliiilii(this.lliIlIiiil++, var13, var15, var17, t, y, z);
      }
   }

   public static float IIllllIlll(float sy, float cz, float bx, float sx, float ay, float cy, float bz, float ax, float cx, float by, float az, float sz) {
      float var12 = (float)Math.sqrt((double)(sx * sx + ay * ay + cy * cy));
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var15 = 0.0F;
      if (var12 > 1.0E-6F) {
         var13 = sx / var12;
         var14 = ay / var12;
         var15 = cy / var12;
      }

      float var16 = sx - sy;
      float var17 = ay - cz;
      float var18 = cy - bx;
      float var19 = var16 * var13 + var17 * var14 + var18 * var15;
      var16 -= var19 * var13;
      var17 -= var19 * var14;
      var18 -= var19 * var15;
      float var20 = bz - sx;
      float var21 = ax - ay;
      float var22 = cx - cy;
      float var23 = var20 * var13 + var21 * var14 + var22 * var15;
      var20 -= var23 * var13;
      var21 -= var23 * var14;
      var22 -= var23 * var15;
      float var24 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17 + var18 * var18));
      float var25 = (float)Math.sqrt((double)(var20 * var20 + var21 * var21 + var22 * var22));
      if (!(var24 < 1.0E-6F) && !(var25 < 1.0E-6F)) {
         float var26 = 2.0F / (var24 + var25);
         float var27 = (var20 / var25 - var16 / var24) * var26;
         float var28 = (var21 / var25 - var17 / var24) * var26;
         float var29 = (var22 / var25 - var18 / var24) * var26;
         return var27 * by + var28 * az + var29 * sz;
      } else {
         return 0.0F;
      }
   }

   float IlIlllIlilIl(int i) {
      return this.IlIllIiiil[i];
   }

   public static int lIilliIill(int a, float rgb) {
      long var3 = -5647324804483194214L;
      var3 ^= ((long)IiIilliIil(Math.round(iIIilIlIil(rgb) * 255.0F)) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << ((-2033101164 >>> 29 | -2033101164 << 3) * -81 * 286331153 ^ 39 ^ -1071630877)
         | a & (~((-1994468228 - -91 << 19 | -1994468228 - -91 >>> 13) >>> 1 | (-1994468228 - -91 << 19 | -1994468228 - -91 >>> 13) << 31) ^ -1403116421);
   }

   public static int iilllIIill(int rgb, float k) {
      long var5 = 3269558560937780920L;
      long var7 = 1266623541008954210L;
      if (k <= 0.0F) {
         return (-(506417059 ^ 69 ^ -9) << 25 | -(506417059 ^ 69 ^ -9) >>> 7) ^ 557604511;
      } else {
         var5 ^= (
               (long)IiIilliIil(
                        Math.round(
                           (float)(
                                 rgb
                                       >> (
                                          (
                                                (~(-285665049 ^ -87) >>> 17 | ~(-285665049 ^ -87) << 15) >>> 27
                                                   | (~(-285665049 ^ -87) >>> 17 | ~(-285665049 ^ -87) << 15) << 5
                                             )
                                             ^ -1960906879
                                       )
                                    & ((-1579096136 * -1926714301 + -17 << 5 | -1579096136 * -1926714301 + -17 >>> 27) ^ -913792481)
                              )
                              * k
                        )
                     )
                     << 32
                  ^ var5
            )
            & -1L << 32;
         var5 ^= (
               (long)IiIilliIil(
                     Math.round(
                        (float)(
                              rgb >> ((-897184203 + -117 << 9 | -897184203 + -117 >>> 23) * -1171354717 - -61 ^ 799369492)
                                 & ((-545998298 ^ -31 ^ -79) * 286331153 ^ -822593751)
                           )
                           * k
                     )
                  )
                  ^ var5
            )
            & -1L >>> 32;
         var7 ^= (
               (long)IiIilliIil(
                        Math.round(
                           (float)(
                                 rgb
                                    & (((~-422525480 << 9 | ~-422525480 >>> 23) - -49 >>> 27 | (~-422525480 << 9 | ~-422525480 >>> 23) - -49 << 5) ^ -829829996)
                              )
                              * k
                        )
                     )
                     << 32
                  ^ var7
            )
            & -1L << 32;
         return (1308219097 - 41 - 65 << 17 | 1308219097 - 41 - 65 >>> 15) ^ 1407097843
            | (int)(var5 >>> 32) << ((690215170 * 89 * -47 * 1944890851 << 9 | 690215170 * 89 * -47 * 1944890851 >>> 23) ^ 1579510966)
            | (int)var5 << (~(~1818877125 * 373475417 * 1041204193) ^ -998330851)
            | (int)(var7 >>> 32);
      }
   }

   private boolean IiiIlliiIl() {
      return this.llillIiiil.IIliliiiil >= 0.99F;
   }

   private static int ilIllIiIll(int rgb, int centre, int whiteCore, float lane) {
      return centre == whiteCore && lane > 0.0F ? Ilillllill(rgb, lane) : rgb;
   }

   public static void iIIIlIlIIl(
      double s,
      double p2x,
      double p1y,
      double p0x,
      double p1x,
      double p3z,
      double p2z,
      double p3y,
      double p0z,
      double p3x,
      double p1z,
      double p2y,
      double p0y,
      double[] out
   ) {
      double var27 = Math.sqrt(iIIIilllIlIIilll.iiIIlIIlIl(p0x, p1x, p3z, p2z, p3y, p0z));
      if (var27 < 1.0E-6) {
         out[0] = p0x + (p2z - p0x) * p0y;
         out[1] = p1x + (p3y - p1x) * p0y;
         out[2] = p3z + (p0z - p3z) * p0y;
      } else {
         double var29 = Math.sqrt(iIIIilllIlIIilll.iiIIlIIlIl(s, p2x, p1y, p0x, p1x, p3z));
         double var31 = Math.sqrt(iIIIilllIlIIilll.iiIIlIIlIl(p2z, p3y, p0z, p3x, p1z, p2y));
         if (var29 < 1.0E-6) {
            var29 = var27;
         }

         if (var31 < 1.0E-6) {
            var31 = var27;
         }

         double var33 = ((p0x - s) / var29 - (p2z - s) / (var29 + var27) + (p2z - p0x) / var27) * var27;
         double var35 = ((p1x - p2x) / var29 - (p3y - p2x) / (var29 + var27) + (p3y - p1x) / var27) * var27;
         double var37 = ((p3z - p1y) / var29 - (p0z - p1y) / (var29 + var27) + (p0z - p3z) / var27) * var27;
         double var39 = ((p2z - p0x) / var27 - (p3x - p0x) / (var27 + var31) + (p3x - p2z) / var31) * var27;
         double var41 = ((p3y - p1x) / var27 - (p1z - p1x) / (var27 + var31) + (p1z - p3y) / var31) * var27;
         double var43 = ((p0z - p3z) / var27 - (p2y - p3z) / (var27 + var31) + (p2y - p0z) / var31) * var27;
         double var45 = p0y * p0y;
         double var47 = var45 * p0y;
         double var49 = 2.0 * var47 - 3.0 * var45 + 1.0;
         double var51 = var47 - 2.0 * var45 + p0y;
         double var53 = -2.0 * var47 + 3.0 * var45;
         double var55 = var47 - var45;
         out[0] = var49 * p0x + var51 * var33 + var53 * p2z + var55 * var39;
         out[1] = var49 * p1x + var51 * var35 + var53 * p3y + var55 * var41;
         out[2] = var49 * p3z + var51 * var37 + var53 * p0z + var55 * var43;
      }
   }

   float IilliliilIIi(int i) {
      return this.iliIlIiiil[i];
   }

   float IIIllIIliIIl(int i) {
      return this.iIIllIiiil[i];
   }

   private void Iillllilll(
      float cz, float dx, float cd, int by, float cb, float ca, float ay, int dz, float ax, float az, float bz, int cc, float cx, float cy, float dy, int bx
   ) {
      if ((by | dz | cc | bx) != ((1038456136 ^ -21) * 128207979 ^ 1092548129)) {
         this.ilillIiiil.liiiIIllIl(cz, dx, cd, by, cb, ca, ay, dz, ax, az, bz, cc);
         this.ilillIiiil.liiiIIllIl(cz, dx, cd, by, ax, az, bz, cc, cx, cy, dy, bx);
         this.iiIilIiiil += 2;
      }
   }

   float iliIiiliiiii(int i) {
      return this.liiIlIiiil[i];
   }

   private void iiiIlIIIll() {
      boolean var1 = this.IiiIlliiIl();
      float var2 = 1.0F - iIIilIlIil(this.llillIiiil.IIliliiiil);
      float var3 = 0.22F * this.lIIilIiiil * var2;
      float var4 = Math.max(0.08F, iIIilIlIil(this.llillIiiil.ilIiliiiil));

      for (int var5 = 0; var5 < this.IiIllIiiil; var5++) {
         float var6 = var4 * this.iiiIlIiiil[var5];
         float var7 = 0.03F + var6 * 0.5F;
         float var8 = var6 * 0.5F * this.iIIllIiiil[var5];
         this.liIllIiiil[var5] = this.iliIlIiiil[var5];
         this.IIlllIiiil[var5] = this.liiIlIiiil[var5];
         this.iiIllIiiil[var5] = this.IiiIlIiiil[var5] + var7 + var8;
         this.lIlllIiiil[var5] = this.IiiIlIiiil[var5] + var7 - var8;
      }

      for (int var10 = 0; var10 < this.IiIllIiiil - 1; var10++) {
         float var12 = this.IlIllIiiil[var10];
         float var14 = this.IlIllIiiil[var10 + 1];
         if ((!(var12 < 0.004F) || !(var14 < 0.004F)) && (!(this.iIIllIiiil[var10] < 0.001F) || !(this.iIIllIiiil[var10 + 1] < 0.001F))) {
            int var18 = this.ilIllIiiil[var10];
            int var9 = this.ilIllIiiil[var10 + 1];
            this.ilillIiiil
               .IliIlllilIi(
                  this.liIllIiiil[var10],
                  this.lIlllIiiil[var10],
                  this.IIlllIiiil[var10],
                  lIilliIill(var18, var12 * 0.05F),
                  this.liIllIiiil[var10],
                  this.iiIllIiiil[var10],
                  this.IIlllIiiil[var10],
                  lIilliIill(var18, var12 * 0.55F),
                  this.liIllIiiil[var10 + 1],
                  this.iiIllIiiil[var10 + 1],
                  this.IIlllIiiil[var10 + 1],
                  lIilliIill(var9, var14 * 0.55F),
                  this.liIllIiiil[var10 + 1],
                  this.lIlllIiiil[var10 + 1],
                  this.IIlllIiiil[var10 + 1],
                  lIilliIill(var9, var14 * 0.05F)
               );
            this.IIlilIiiil++;
            if (!var1) {
               this.Iillllilll(
                  this.liIllIiiil[var10],
                  this.lIlllIiiil[var10],
                  this.IIlllIiiil[var10],
                  -16777216,
                  this.liIllIiiil[var10],
                  this.iiIllIiiil[var10],
                  this.IIlllIiiil[var10],
                  iilllIIill(var18, var12 * var3),
                  this.liIllIiiil[var10 + 1],
                  this.iiIllIiiil[var10 + 1],
                  this.IIlllIiiil[var10 + 1],
                  iilllIIill(var9, var14 * var3),
                  this.liIllIiiil[var10 + 1],
                  this.lIlllIiiil[var10 + 1],
                  this.IIlllIiiil[var10 + 1],
                  -16777216
               );
            }
         }
      }

      float var11 = this.llillIiiil.llIiliiiil * 0.5F;
      float var13 = this.IllIllllIl(0.035F);

      for (int var15 = 0; var15 < this.IiIllIiiil; var15++) {
         this.illllIiiil[var15] = var11 * 0.4F * (float)Math.sqrt((double)this.iIIllIiiil[var15]);
      }

      this.IlIllllIll(this.liIllIiiil, this.iiIllIiiil, this.IIlllIiiil, iiIIlIiiil, IIlIlIiiil, 0.8F, false, 0.0F);

      for (int var16 = 0; var16 < this.IiIllIiiil; var16++) {
         this.illllIiiil[var16] = this.illIlIilIl(var16, var11 * (float)Math.sqrt((double)this.iIIllIiiil[var16]), var13);
      }

      this.IlIllllIll(this.liIllIiiil, this.iiIllIiiil, this.IIlllIiiil, IiIIlIiiil, liIIlIiiil, 0.8F, true, 0.25F);
      if (!var1) {
         for (int var17 = 0; var17 < this.IiIllIiiil; var17++) {
            this.iiIllIiiil[var17] = this.lIlllIiiil[var17];
            this.illllIiiil[var17] = this.illIlIilIl(var17, var11 * 0.7F * (float)Math.sqrt((double)this.iIIllIiiil[var17]), var13);
         }

         this.IlIllllIll(this.liIllIiiil, this.iiIllIiiil, this.IIlllIiiil, IiIIlIiiil, liIIlIiiil, 0.28F * var2, true, 0.0F);
      }
   }

   public int Illlllllilll() {
      return this.liIilIiiil;
   }

   public static float iIiIlIliIl(float fade, float u) {
      float var2 = iIIilIlIil(u);
      float var3 = iIIilIlIil(fade);
      float var4 = (1.0F - var3) * (1.0F - var3 * 0.5F);
      return 1.0F - var2 + var2 * var4;
   }

   private void lIIlliIIll() {
      float var1 = iIIilIlIil(this.llillIiiil.ilIiliiiil);

      for (int var2 = 0; var2 < this.IiIllIiiil; var2++) {
         this.liIllIiiil[var2] = this.iliIlIiiil[var2];
         this.iiIllIiiil[var2] = this.IiiIlIiiil[var2] + 0.03F + var1 * this.iiiIlIiiil[var2];
         this.IIlllIiiil[var2] = this.liiIlIiiil[var2];
      }

      float var5 = this.llillIiiil.llIiliiiil * 0.5F;

      for (int var3 = 0; var3 < this.IiIllIiiil; var3++) {
         this.illllIiiil[var3] = var5 * 0.5F * this.iIIllIiiil[var3];
      }

      this.IlIllllIll(this.liIllIiiil, this.iiIllIiiil, this.IIlllIiiil, iiIIlIiiil, IIlIlIiiil, 0.85F, false, 0.0F);
      float var6 = this.IllIllllIl(0.035F);

      for (int var4 = 0; var4 < this.IiIllIiiil; var4++) {
         this.illllIiiil[var4] = this.illIlIilIl(var4, var5 * 1.5F * this.iIIllIiiil[var4], var6);
      }

      this.IlIllllIll(this.liIllIiiil, this.iiIllIiiil, this.IIlllIiiil, IiIIlIiiil, liIIlIiiil, 0.95F, true, 0.4F);
   }

   public static int ilillIiill(float v, float h, float s) {
      float var3 = (v - (float)Math.floor((double)v)) * 6.0F;
      int var4 = (int)var3;
      float var5 = var3 - (float)var4;
      float var6 = s * (1.0F - h);
      float var7 = s * (1.0F - h * var5);
      float var8 = s * (1.0F - h * (1.0F - var5));
      float var9;
      float var10;
      float var11;
      switch (var4) {
         case 0:
            var9 = s;
            var10 = var8;
            var11 = var6;
            break;
         case 1:
            var9 = var7;
            var10 = s;
            var11 = var6;
            break;
         case 2:
            var9 = var6;
            var10 = s;
            var11 = var8;
            break;
         case 3:
            var9 = var6;
            var10 = var7;
            var11 = s;
            break;
         case 4:
            var9 = var8;
            var10 = var6;
            var11 = s;
            break;
         default:
            var9 = s;
            var10 = var6;
            var11 = var7;
      }

      return IiIilliIil(Math.round(var9 * 255.0F)) << 16 | IiIilliIil(Math.round(var10 * 255.0F)) << 8 | IiIilliIil(Math.round(var11 * 255.0F));
   }

   public int IIlllIlliIll() {
      return this.IiIilIiiil;
   }

   public float Iiilliiliiil() {
      return this.iIlilIiiil;
   }

   public static int Ilillllill(int rgb, float t) {
      long var5 = -5882541716207256837L;
      long var7 = -6619562873130831050L;
      if (t <= 0.0F) {
         return rgb & (((1255415106 ^ 89) << 3 | (1255415106 ^ 89) >>> 29) ^ 1449072421);
      } else {
         var5 ^= (
               (long)(
                        rgb >> (((-1212951520 >>> 23 | -1212951520 << 9) << 27 | (-1212951520 >>> 23 | -1212951520 << 9) >>> 5) ^ 2067612187)
                           & (~(952530978 + 103) * 111 - 71 ^ 1643232028)
                     )
                     << 32
                  ^ var5
            )
            & -1L << 32;
         var5 ^= (
               (long)(rgb >> (((--1311723710 ^ -67) + 83 >>> 11 | (--1311723710 ^ -67) + 83 << 21) ^ -355059171) & (-1509834421 - 115 - 59 ^ -1509834654))
                  ^ var5
            )
            & -1L >>> 32;
         var7 ^= ((long)(rgb & (1447240598 + -125 ^ 83 ^ 1447240629)) << 32 ^ var7) & -1L << 32;
         var5 ^= (
               (long)Math.round(
                        (float)((int)(var5 >>> 32))
                           + (float)(
                                 (((-237405772 >>> 9 | -237405772 << 23) * -19 >>> 23 | (-237405772 >>> 9 | -237405772 << 23) * -19 << 9) + -113 ^ 215751134)
                                    - (int)(var5 >>> 32)
                              )
                              * t
                     )
                     << 32
                  ^ var5
            )
            & -1L << 32;
         var5 ^= (
               (long)Math.round((float)((int)var5) + (float)(((-262548020 * 1556147571 >>> 27 | -262548020 * 1556147571 << 5) ^ -1994599322) - (int)var5) * t)
                  ^ var5
            )
            & -1L >>> 32;
         var7 ^= ((long)Math.round((float)((int)(var7 >>> 32)) + (float)((~-1198783649 * -119 ^ 41 ^ -921333386) - (int)(var7 >>> 32)) * t) << 32 ^ var7)
            & -1L << 32;
         return IiIilliIil((int)(var5 >>> 32))
               << (((-1218325186 << 11 | -1218325186 >>> 21) * 75 << 27 | (-1218325186 << 11 | -1218325186 >>> 21) * 75 >>> 5) ^ 1247696894)
            | IiIilliIil((int)var5) << (-1257642816 * -1191041351 * -5 ^ -738593208)
            | IiIilliIil((int)(var7 >>> 32));
      }
   }

   public static float lIlIliIlIl(boolean ty, float vz, float vx, float dist, float tz, float tx, float ribbon, float vy) {
      float var8 = vx * ribbon - dist * tx;
      float var9 = dist * tz - vz * ribbon;
      float var10 = vz * tx - vx * tz;
      float var11 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9 + var10 * var10));
      float var12 = IIIillIIil(0.08F, 0.45F, var11);
      if (ty) {
         float var13 = (float)Math.sqrt((double)(vz * vz + dist * dist));
         if (var13 < 1.0E-4F) {
            return 1.0F;
         }

         float var14 = Math.abs(dist * tz - vz * ribbon) / var13;
         float var15 = IIIillIIil(0.6F, 0.9F, Math.abs(tx)) * IIIillIIil(3.0F, 6.0F, vy);
         var12 = Math.max(IIIillIIil(0.04F, 0.3F, var14), var12 * var15);
      }

      return 0.12F + 0.88F * var12;
   }

   static float iIIilIlIil(float t) {
      return t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
   }

   float lIiiIiIlilli(int i) {
      return this.IiiIlIiiil[i];
   }

   static double llIililIil(double t) {
      return t < Double.longBitsToDouble(2301146381449119037L ^ 2301146381449119037L)
         ? 0.0
         : (t > Double.longBitsToDouble(-4243742252791791228L ^ -366142973625794172L) ? 1.0 : t);
   }

   private void iIlllIllll() {
      float var1 = iIIilIlIil(this.llillIiiil.ilIiliiiil);
      double var2 = Math.max(0.18, (double)this.llillIiiil.llIiliiiil * 1.5);
      float var4 = this.llillIiiil.llIiliiiil * 0.5F;
      float var5 = this.IllIllllIl(0.04F);
      int var6 = this.IiiIlliiIl() ? 2 : 1;
      float var7 = 1.0F - (1.0F - iIlIlIiiil) * iIIilIlIil(this.llillIiiil.IIliliiiil / 0.99F);

      for (int var8 = this.IiIllIiiil - 2; var8 >= 0; var8--) {
         double var9 = this.llIllIiiil[var8];
         double var11 = this.llIllIiiil[var8 + 1];
         if (!(var11 <= var9)) {
            double var13 = Math.floor(var11 / var2);

            while (var13 * var2 > var9) {
               if (this.IiIiliIiiiIi()) {
                  return;
               }

               float var15 = this.IlIillIiilIi();
               float var16 = (float)((var13 * var2 - var9) / (var11 - var9));
               var13--;
               float var17 = lIliliIlil(this.iIIllIiiil[var8], this.iIIllIiiil[var8 + 1], var16);
               float var18 = lIliliIlil(this.IlIllIiiil[var8], this.IlIllIiiil[var8 + 1], var16) * var15;
               if (!(var17 < 0.02F) && !(var18 < 0.004F)) {
                  float var19 = lIliliIlil(this.iliIlIiiil[var8], this.iliIlIiiil[var8 + 1], var16);
                  float var20 = lIliliIlil(this.IiiIlIiiil[var8], this.IiiIlIiiil[var8 + 1], var16)
                     + 0.03F
                     + var1 * lIliliIlil(this.iiiIlIiiil[var8], this.iiiIlIiiil[var8 + 1], var16);
                  float var21 = lIliliIlil(this.liiIlIiiil[var8], this.liiIlIiiil[var8 + 1], var16);
                  int var22 = var16 < 0.5F ? this.ilIllIiiil[var8] : this.ilIllIiiil[var8 + 1];
                  this.lllllillll(var19, var20, var21, var4 * (0.3F + 0.7F * var17), var18, var22, var5, var6, var7);
                  this.ilIilIiiil++;
                  this.lIlilIiiil++;
               }
            }
         }
      }
   }

   private float IiIIlliIIl(int j) {
      float var2 = iIIilIlIil(this.llillIiiil.ilIiliiiil);
      float var3;
      if (this.llillIiiil.iiilliiiil == IIIliIIilIIliIIi.lIIilliiil) {
         float var4 = this.IiiIlIiiil[j] + 0.03F;
         float var5 = var4 + Math.max(0.08F, var2) * this.iiiIlIiiil[j];
         var3 = var4 > 0.0F ? var4 : (var5 < 0.0F ? var5 : 0.0F);
      } else {
         var3 = this.IiiIlIiiil[j] + 0.03F + var2 * this.iiiIlIiiil[j];
      }

      return (float)Math.sqrt((double)(this.iliIlIiiil[j] * this.iliIlIiiil[j] + var3 * var3 + this.liiIlIiiil[j] * this.liiIlIiiil[j]));
   }

   private void Iliilliiilii(int od, double i, double h, double t, double x, float y, double z) {
      this.lilIlIiiil[od] = i;
      this.iilIlIiiil[od] = h;
      this.IIiIlIiiil[od] = t;
      this.lIiIlIiiil[od] = x;
      this.IliIlIiiil[od] = y;
      this.iIiIlIiiil[od] = z;
   }

   static float lilIliilIl(float capLen, float d) {
      return d <= 1.0E-4F ? 1.0F : IIIillIIil(0.0F, d, capLen);
   }

   private void IlIllllIll(float[] intensity, float[] whiteCore, float[] py, float[] pz, float[] profile, float additive, boolean off, float px) {
      this.liIlliiIll(intensity, whiteCore, py);
      int var9 = pz.length;
      int var10 = var9 / 2;
      float var11 = px * this.IIIilIiiil;

      for (int var12 = 0; var12 < this.IiIllIiiil - 1; var12++) {
         float var13 = this.IlIllIiiil[var12] * additive;
         float var14 = this.IlIllIiiil[var12 + 1] * additive;
         if (!(var13 < 0.004F) || !(var14 < 0.004F)) {
            float var15 = this.illllIiiil[var12];
            float var16 = this.illllIiiil[var12 + 1];
            if (!(var15 < 1.0E-4F) || !(var16 < 1.0E-4F)) {
               int var17 = this.ilIllIiiil[var12];
               int var18 = this.ilIllIiiil[var12 + 1];

               for (int var19 = 0; var19 < var9 - 1; var19++) {
                  float var20 = pz[var19];
                  float var21 = pz[var19 + 1];
                  float var22 = var20 * var15 * (var20 > 0.0F ? this.IilllIiiil[var12] : this.lilllIiiil[var12]);
                  float var23 = var21 * var15 * (var21 > 0.0F ? this.IilllIiiil[var12] : this.lilllIiiil[var12]);
                  float var24 = var20 * var16 * (var20 > 0.0F ? this.IilllIiiil[var12 + 1] : this.lilllIiiil[var12 + 1]);
                  float var25 = var21 * var16 * (var21 > 0.0F ? this.IilllIiiil[var12 + 1] : this.lilllIiiil[var12 + 1]);
                  float var26 = intensity[var12] + this.iIlllIiiil[var12] * var22;
                  float var27 = whiteCore[var12] + this.IllllIiiil[var12] * var22;
                  float var28 = py[var12] + this.lllllIiiil[var12] * var22;
                  float var29 = intensity[var12] + this.iIlllIiiil[var12] * var23;
                  float var30 = whiteCore[var12] + this.IllllIiiil[var12] * var23;
                  float var31 = py[var12] + this.lllllIiiil[var12] * var23;
                  float var32 = intensity[var12 + 1] + this.iIlllIiiil[var12 + 1] * var25;
                  float var33 = whiteCore[var12 + 1] + this.IllllIiiil[var12 + 1] * var25;
                  float var34 = py[var12 + 1] + this.lllllIiiil[var12 + 1] * var25;
                  float var35 = intensity[var12 + 1] + this.iIlllIiiil[var12 + 1] * var24;
                  float var36 = whiteCore[var12 + 1] + this.IllllIiiil[var12 + 1] * var24;
                  float var37 = py[var12 + 1] + this.lllllIiiil[var12 + 1] * var24;
                  if (off) {
                     int var38 = iilllIIill(ilIllIiIll(var17, var19, var10, var11), var13 * profile[var19] * this.lIIilIiiil);
                     int var39 = iilllIIill(ilIllIiIll(var17, var19 + 1, var10, var11), var13 * profile[var19 + 1] * this.lIIilIiiil);
                     int var40 = iilllIIill(ilIllIiIll(var18, var19 + 1, var10, var11), var14 * profile[var19 + 1] * this.lIIilIiiil);
                     int var41 = iilllIIill(ilIllIiIll(var18, var19, var10, var11), var14 * profile[var19] * this.lIIilIiiil);
                     this.Iillllilll(var26, var27, var28, var38, var29, var30, var31, var39, var32, var33, var34, var40, var35, var36, var37, var41);
                  } else {
                     int var42 = lIilliIill(var17, var13 * profile[var19]);
                     int var43 = lIilliIill(var17, var13 * profile[var19 + 1]);
                     int var44 = lIilliIill(var18, var14 * profile[var19 + 1]);
                     int var45 = lIilliIill(var18, var14 * profile[var19]);
                     this.ilillIiiil
                        .IliIlllilIi(var26, var27, var28, var42, var29, var30, var31, var43, var32, var33, var34, var44, var35, var36, var37, var45);
                     this.IIlilIiiil++;
                  }
               }
            }
         }
      }
   }

   private float iiIIlIIlIl(int j) {
      int var2 = j > 0 ? j - 1 : j;
      int var3 = j < this.IiIllIiiil - 1 ? j + 1 : j;
      float var4 = this.iliIlIiiil[var3] - this.iliIlIiiil[var2];
      float var5 = this.IiiIlIiiil[var3] - this.IiiIlIiiil[var2];
      float var6 = this.liiIlIiiil[var3] - this.liiIlIiiil[var2];
      float var7 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
      if (var7 < 1.0E-6F) {
         return 1.0F;
      } else {
         var4 /= var7;
         var5 /= var7;
         var6 /= var7;
         boolean var8 = this.llillIiiil.iiilliiiil == IIIliIIilIIliIIi.lIIilliiil;
         float var9 = iIIilIlIil(this.llillIiiil.ilIiliiiil);
         float var10 = var8 ? 0.5F * Math.max(0.08F, var9) * this.iiiIlIiiil[j] : var9 * this.iiiIlIiiil[j];
         float var11 = this.iliIlIiiil[j];
         float var12 = this.IiiIlIiiil[j] + 0.03F + var10;
         float var13 = this.liiIlIiiil[j];
         float var14 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
         return var14 < 1.0E-6F ? 0.12F : lIlIliIlIl(var8, var4, var5, var6, var11 / var14, var12 / var14, var13 / var14, var14);
      }
   }

   float IiIlliIliiIl(int i) {
      return this.IIIllIiiil[i];
   }

   static {
      for (int var0 = 0; var0 <= 14; var0++) {
         double var1 = (Math.PI * 2) * (double)var0 / 14.0;
         IllIlIiiil[var0] = (float)Math.cos(var1);
         lllIlIiiil[var0] = (float)Math.sin(var1);
      }
   }

   public static double Iilililiiili(float width) {
      double var1 = (double)width * Double.longBitsToDouble(3300182317075778441L ^ 1310452273152850106L);
      return var1 < Double.longBitsToDouble(510236941111424727L ^ 4097466776624033613L)
         ? Double.longBitsToDouble(5675279887976609092L ^ 8145671853459516638L)
         : Math.min(var1, Double.longBitsToDouble(-5320530845097779772L ^ -8517821670423843081L));
   }

   public static float IIiIllIiIl(float u) {
      return 1.0F - IIIillIIil(0.12F, 1.0F, u);
   }

   private void llIIlilIIl(boolean headIsLive, boolean tailCut) {
      this.lIIllIiiil[0] = 0.0F;

      for (int var3 = 1; var3 < this.IiIllIiiil; var3++) {
         this.lIIllIiiil[var3] = this.lIIllIiiil[var3 - 1]
            + (float)iIIIilllIlIIilll.iiIIlIIlIl(
               (double)this.iliIlIiiil[var3],
               (double)this.IiiIlIiiil[var3],
               (double)this.liiIlIiiil[var3],
               (double)this.iliIlIiiil[var3 - 1],
               (double)this.IiiIlIiiil[var3 - 1],
               (double)this.liiIlIiiil[var3 - 1]
            );
      }

      float var13 = this.lIIllIiiil[this.IiIllIiiil - 1];
      float var4 = Math.min(0.7F, var13 * 0.3F);
      float var5 = tailCut ? Math.min(0.3F, var13 * 0.25F) : Math.min(0.7F, var13 * 0.3F);
      float var6 = this.llillIiiil.IiIiliiiil;
      float var7 = this.llillIiiil.iIIiliiiil;

      for (int var8 = 0; var8 < this.IiIllIiiil; var8++) {
         float var9 = this.IIIllIiiil[var8];
         float var10 = IIiIllIiIl(var9);
         float var11 = 1.0F;
         if (!headIsLive) {
            var11 *= lilIliilIl(this.lIIllIiiil[var8], var4);
         }

         var11 *= lilIliilIl(var13 - this.lIIllIiiil[var8], var5);
         this.iIIllIiiil[var8] = var10 * var11;
         float var12 = IIIillIIil(0.6F, 2.4F, this.IiIIlliIIl(var8));
         this.IlIllIiiil[var8] = iIiIlIliIl(var9, var6) * (0.35F + 0.65F * var11) * var12 * var7 * this.iiIIlIIlIl(var8);
         this.ilIllIiiil[var8] = this.lliIliliIl(var9);
      }
   }

   public static float IIIillIIil(float x, float e0, float e1) {
      if (e0 <= x) {
         return e1 < x ? 0.0F : 1.0F;
      } else {
         float var3 = iIIilIlIil((e1 - x) / (e0 - x));
         return var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private float IlIillIiilIi() {
      return 1.0F - IIIillIIil(this.llIilIiiil, (float)this.IlIilIiiil, (float)this.ilIilIiiil);
   }

   int iIlIlllllill() {
      return this.IiIllIiiil;
   }

   private float[] liilliiill(int rgb) {
      float var2 = (float)(rgb >> 16 & 0xFF) / 255.0F;
      float var3 = (float)(rgb >> 8 & 0xFF) / 255.0F;
      float var4 = (float)(rgb & 0xFF) / 255.0F;
      float var5 = Math.max(var2, Math.max(var3, var4));
      float var6 = Math.min(var2, Math.min(var3, var4));
      float var7 = var5 - var6;
      float var8;
      if (var7 < 1.0E-6F) {
         var8 = 0.0F;
      } else if (var5 == var2) {
         var8 = (var3 - var4) / var7 / 6.0F;
      } else if (var5 == var3) {
         var8 = ((var4 - var2) / var7 + 2.0F) / 6.0F;
      } else {
         var8 = ((var2 - var3) / var7 + 4.0F) / 6.0F;
      }

      if (var8 < 0.0F) {
         var8++;
      }

      this.IllilIiiil[0] = var8;
      this.IllilIiiil[1] = var5 <= 0.0F ? 0.0F : var7 / var5;
      this.IllilIiiil[2] = var5;
      return this.IllilIiiil;
   }

   private boolean IiIiliIiiiIi() {
      return this.ilIilIiiil >= this.IlIilIiiil || this.IlIillIiilIi() < 0.004F;
   }

   public int IliIlllilIi() {
      return this.IilIlIiiil;
   }

   private float illIlIilIl(int j, float angle, float want) {
      float var4 = (float)Math.sqrt(
         (double)(this.liIllIiiil[j] * this.liIllIiiil[j] + this.iiIllIiiil[j] * this.iiIllIiiil[j] + this.IIlllIiiil[j] * this.IIlllIiiil[j])
      );
      return Math.min(angle, want * var4);
   }

   private void Iiiiliiiiiii() {
      this.IiIllIiiil = 0;
      double var1 = 0.0;

      for (int var3 = 0; var3 < this.lliIlIiiil - 1; var3++) {
         var1 += iIIIilllIlIIilll.iiIIlIIlIl(
            this.lilIlIiiil[var3],
            this.iilIlIiiil[var3],
            this.IIiIlIiiil[var3],
            this.lilIlIiiil[var3 + 1],
            this.iilIlIiiil[var3 + 1],
            this.IIiIlIiiil[var3 + 1]
         );
      }

      int var25 = Math.max(8, this.iIIilIiiil - this.lliIlIiiil - 2);
      double var4 = Math.max(0.1 * (double)Math.max(1.0F, this.llillIiiil.iiIiliiiil), var1 / (double)var25);

      for (int var6 = 0; var6 < this.lliIlIiiil - 1; var6++) {
         double var7;
         double var9;
         double var11;
         if (var6 > 0) {
            var7 = this.lilIlIiiil[var6 - 1];
            var9 = this.iilIlIiiil[var6 - 1];
            var11 = this.IIiIlIiiil[var6 - 1];
         } else {
            var7 = 2.0 * this.lilIlIiiil[0] - this.lilIlIiiil[1];
            var9 = 2.0 * this.iilIlIiiil[0] - this.iilIlIiiil[1];
            var11 = 2.0 * this.IIiIlIiiil[0] - this.IIiIlIiiil[1];
         }

         double var13;
         double var15;
         double var17;
         if (var6 + 2 < this.lliIlIiiil) {
            var13 = this.lilIlIiiil[var6 + 2];
            var15 = this.iilIlIiiil[var6 + 2];
            var17 = this.IIiIlIiiil[var6 + 2];
         } else {
            var13 = 2.0 * this.lilIlIiiil[this.lliIlIiiil - 1] - this.lilIlIiiil[this.lliIlIiiil - 2];
            var15 = 2.0 * this.iilIlIiiil[this.lliIlIiiil - 1] - this.iilIlIiiil[this.lliIlIiiil - 2];
            var17 = 2.0 * this.IIiIlIiiil[this.lliIlIiiil - 1] - this.IIiIlIiiil[this.lliIlIiiil - 2];
         }

         double var19 = iIIIilllIlIIilll.iiIIlIIlIl(
            this.lilIlIiiil[var6],
            this.iilIlIiiil[var6],
            this.IIiIlIiiil[var6],
            this.lilIlIiiil[var6 + 1],
            this.iilIlIiiil[var6 + 1],
            this.IIiIlIiiil[var6 + 1]
         );
         int var21 = (int)Math.ceil(var19 / var4);
         if (var21 < 1) {
            var21 = 1;
         }

         if (var21 > 12) {
            var21 = 12;
         }

         for (int var22 = 0; var22 < var21 && this.IiIllIiiil < this.iIIilIiiil - 1; var22++) {
            double var23 = (double)var22 / (double)var21;
            iIIIlIlIIl(
               var7,
               var9,
               var11,
               this.lilIlIiiil[var6],
               this.iilIlIiiil[var6],
               this.IIiIlIiiil[var6],
               this.lilIlIiiil[var6 + 1],
               this.iilIlIiiil[var6 + 1],
               this.IIiIlIiiil[var6 + 1],
               var13,
               var15,
               var17,
               var23,
               this.iilllIiiil
            );
            this.IIIIllIIIl(
               this.iilllIiiil[0],
               this.iilllIiiil[1],
               this.iilllIiiil[2],
               iiIilIIlil(this.lIiIlIiiil[var6], this.lIiIlIiiil[var6 + 1], var23),
               (float)iiIilIIlil((double)this.IliIlIiiil[var6], (double)this.IliIlIiiil[var6 + 1], var23),
               iiIilIIlil(this.iIiIlIiiil[var6], this.iIiIlIiiil[var6 + 1], var23)
            );
         }
      }

      int var26 = this.lliIlIiiil - 1;
      this.IIIIllIIIl(
         this.lilIlIiiil[var26], this.iilIlIiiil[var26], this.IIiIlIiiil[var26], this.lIiIlIiiil[var26], this.IliIlIiiil[var26], this.iIiIlIiiil[var26]
      );
   }

   private void IIIIllIIIl(double h, double x, double t, double y, float z, double od) {
      long var13 = 2431612500104514049L;
      var13 ^= ((long)(this.IiIllIiiil++) << 32 ^ var13) & -1L << 32;
      this.iliIlIiiil[(int)(var13 >>> 32)] = (float)h;
      this.IiiIlIiiil[(int)(var13 >>> 32)] = (float)x;
      this.liiIlIiiil[(int)(var13 >>> 32)] = (float)t;
      this.iiiIlIiiil[(int)(var13 >>> 32)] = z;
      this.llIllIiiil[(int)(var13 >>> 32)] = od;
      this.IIIllIiiil[(int)(var13 >>> 32)] = (float)llIililIil((this.IIillIiiil - y) / this.llillIiiil.IlIiliiiil);
   }
}
