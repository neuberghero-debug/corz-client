package gg.corz;

public final class IIiiIlIilIiiIlIi {
   private static final float iilliIIIIi = 9.0F;
   final float[] llIiiIIIIi;
   static final float IllliIIIIi = (float) (Math.PI * 2);
   int IliiiIIIIi;
   private final int iIiliIIIIi;
   final float[] IlliiIIIIi;
   private boolean IIIIIlIIIi;
   final double[] lliliIIIIi;
   final float[] IIIiiIIIIi;
   final float[] IIliiIIIIi;
   private static final float lilliIIIIi = 0.55F;
   private boolean iliiiIIIIi;
   final float[] IIiiiIIIIi;
   private double liiiiIIIIi;
   private float ilIIIlIIIi;
   final float[] liiliIIIIi;
   private double IiiiiIIIIi;
   final float[] lIliiIIIIi;
   final float[] lIiiiIIIIi;
   final float[] liliiIIIIi;
   private float llIIIlIIIi;
   double lliiiIIIIi;
   final float[] iIliiIIIIi;
   final float[] iiliiIIIIi;
   public final IIlIIlillIlIIlil IIiliIIIIi;
   final float[] IiliiIIIIi;
   final float[] iiIiiIIIIi;
   final float[] IiiliIIIIi;
   final double[] ililiIIIIi;
   static final float iIlliIIIIi = 0.002F;
   private static final float lllliIIIIi = 2.0F;
   int iIiiiIIIIi;
   final float[] ilIiiIIIIi;
   private float IIlIIlIIIi;
   private float liIIIlIIIi;
   private double lIIIIlIIIi;
   private double iIIIIlIIIi;
   final int lIiliIIIIi;
   private float IiIIIlIIIi;
   private static final float IilliIIIIi = 0.5F;
   private float iiIIIlIIIi;
   private double IlIIIlIIIi;
   final int[] IlIiiIIIIi;
   private float lIlIIlIIIi;
   public static final ilIIIlIlIiIIIlIl iiIliIIIIi = (z, x) -> Float.NEGATIVE_INFINITY;
   static final float IIlliIIIIi = 0.2F;
   final float[] IiIiiIIIIi;
   final double[] IliliIIIIi;
   final float[] lIIiiIIIIi;
   final int[] iIIiiIIIIi;
   static final float lIlliIIIIi = 0.05F;
   private double iiiiiIIIIi;
   final float[] liIiiIIIIi;
   final float[] iiiliIIIIi;
   final float[] illiiIIIIi;
   private static final float illliIIIIi = 0.95F;
   final float[] llliiIIIIi;

   public int liiiIIllIl() {
      return this.IliiiIIIIi;
   }

   public void lIiiIiIlilli(double x, double y, double mvx, float z, float mvz, float mvy) {
      this.IIIIIlIIIi = true;
      this.lIIIIlIIIi = x;
      this.iIIIIlIIIi = y;
      this.IlIIIlIIIi = mvx;
      this.llIIIlIIIi = z;
      this.ilIIIlIIIi = mvz;
      this.IiIIIlIIIi = mvy;
   }

   private void IIlilIliiIli(int cz, double cx, double cy, double i) {
      double var8 = (double)this.IIiliIIIIi.IilliilIil;
      double var10 = this.IliliIIIIi[cz] - cx;
      double var12 = this.ililiIIIIi[cz] - i;
      double var14 = this.lliliIIIIi[cz] - cy;
      if (var10 < -var8 || var10 >= var8) {
         this.IliliIIIIi[cz] = cx + IiIlliIliiIl(var10, (double)this.IIiliIIIIi.IliIlllilIi());
      }

      if (var12 < -var8 || var12 >= var8) {
         this.ililiIIIIi[cz] = i + IiIlliIliiIl(var12, (double)this.IIiliIIIIi.IliIlllilIi());
      }

      if (var14 < (double)(-this.IIiliIIIIi.lilliilIil)) {
         this.lliliIIIIi[cz] = cy - (double)this.IIiliIIIIi.lilliilIil;
      } else if (var14 >= (double)this.IIiliIIIIi.iilliilIil) {
         this.lliliIIIIi[cz] = cy + (double)this.IIiliIIIIi.iilliilIil - 0.001;
      }
   }

   private void Iiilliiliiil(int i, double cz, double cx, double cy) {
      double var8 = (double)this.IIiliIIIIi.IliIlllilIi();
      double var10 = (double)this.IIiliIIIIi.IilliilIil;
      double var12 = this.IliliIIIIi[i] - cz;
      if (var12 < -var10 || var12 >= var10) {
         this.IliliIIIIi[i] = cz + IiIlliIliiIl(var12, var8);
      }

      double var14 = this.ililiIIIIi[i] - cy;
      if (var14 < -var10 || var14 >= var10) {
         this.ililiIIIIi[i] = cy + IiIlliIliiIl(var14, var8);
      }

      double var16 = this.lliliIIIIi[i] - cx;
      if (var16 < (double)(-this.IIiliIIIIi.lilliilIil)) {
         this.IiIiliIiiiIi(i, cz, cx, cy);
      } else if (var16 >= (double)this.IIiliIIIIi.iilliilIil) {
         double var18 = (double)this.IIiliIIIIi.liiiIIllIl();
         double var20 = var16 + (double)this.IIiliIIIIi.lilliilIil;
         var20 -= var18 * Math.floor(var20 / var18);
         this.lliliIIIIi[i] = cx - (double)this.IIiliIIIIi.lilliilIil + var20;
      }
   }

   void IiIiliIiiiIi(int cz, double i, double cx, double cy) {
      long var9 = 6696153288263066154L;
      this.iIIiiIIIIi[cz]++;
      this.Iilililiiili(cz);
      var9 ^= ((long)this.IlIiiIIIIi[cz] << 32 ^ var9) & -1L << 32;
      this.IliliIIIIi[cz] = i + (double)((lIlliIiiIlliIi.iIlIlllllill((int)(var9 >>> 32), 40) - 0.5F) * this.IIiliIIIIi.IliIlllilIi());
      this.ililiIIIIi[cz] = cy + (double)((lIlliIiiIlliIi.iIlIlllllill((int)(var9 >>> 32), 41) - 0.5F) * this.IIiliIIIIi.IliIlllilIi());
      this.lliliIIIIi[cz] = cx + (double)this.IIiliIIIIi.iilliilIil - 0.001 - (double)lIlliIiiIlliIi.iIlIlllllill((int)(var9 >>> 32), 42) * 0.6;
      this.IIlilIliiIli(cz, i, cx, cy);
      this.Illillliilli(cz);
      this.IIIiiIIIIi[cz] = 0.0F;
   }

   public void IIIllIIliIIl() {
      this.iIiiiIIIIi = 0;
      this.iliiiIIIIi = false;
   }

   private void Iilililiiili(int i) {
      long var19 = 8426158912594165242L;
      var19 ^= (
            (long)lIlliIiiIlliIi.IliIlllilIi(lIlliIiiIlliIi.IliIlllilIi(i * -1640531535 + this.iIiliIIIIi) ^ this.iIIiiIIIIi[i] * -2048144777) << 32 ^ var19
         )
         & -1L << 32;
      this.IlIiiIIIIi[i] = (int)(var19 >>> 32);
      float var3 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 0);
      float var4 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 1);
      float var5 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 2);
      float var6 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 3);
      float var7 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 4);
      float var8 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 5);
      float var9 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 6);
      float var10 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 7);
      if (this.IIiliIIIIi == IIlIIlillIlIIlil.lllliilIil) {
         float var11 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 8);
         float var12 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 9);
         float var13 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 10);
         float var14 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 11);
         float var15 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 12);
         float var16 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 13);
         float var17 = lIlliIiiIlliIi.iIlIlllllill((int)(var19 >>> 32), 14);
         this.llIiiIIIIi[i] = 0.055F + 0.05F * var3 * (float)Math.sqrt((double)var3);
         this.ilIiiIIIIi[i] = 0.82F + 0.24F * var4;
         this.IiIiiIIIIi[i] = 0.48F + 0.3F * var5;
         this.liIiiIIIIi[i] = 0.55F + 0.6F * var6;
         this.iiIiiIIIIi[i] = 0.26F + 0.24F * var7;
         this.IIliiIIIIi[i] = var8;
         this.lIliiIIIIi[i] = var9;
         this.iIliiIIIIi[i] = var10;
         float var18 = var11 < 0.25F ? 2.2F + 2.2F * var12 : 0.25F + 0.7F * var12;
         this.IlliiIIIIi[i] = var13 < 0.5F ? -var18 : var18;
         this.llliiIIIIi[i] = 0.45F + 0.6F * var14;
         this.illiiIIIIi[i] = var15 * (float) (Math.PI * 2);
         this.IiliiIIIIi[i] = var16;
         this.iiliiIIIIi[i] = var17 * (float) (Math.PI * 2);
         this.liliiIIIIi[i] = this.illiiIIIIi[i];
      } else {
         float var21 = 0.042F + 0.075F * var3 * var3;
         this.llIiiIIIIi[i] = var21;
         this.ilIiiIIIIi[i] = 1.0F;
         this.IiIiiIIIIi[i] = 0.62F + 0.42F * var4 + 2.6F * (var21 - 0.036F);
         this.liIiiIIIIi[i] = 0.1F + 0.22F * var5;
         this.iiIiiIIIIi[i] = 0.22F + 0.5F * var6;
         this.IIliiIIIIi[i] = this.iiIiiIIIIi[i] * (0.7F + 0.6F * var7);
         this.lIliiIIIIi[i] = var8;
         this.iIliiIIIIi[i] = var9;
         this.IiliiIIIIi[i] = var10;
         this.IlliiIIIIi[i] = 0.0F;
         this.llliiIIIIi[i] = 0.0F;
         this.illiiIIIIi[i] = 0.0F;
         this.iiliiIIIIi[i] = 0.0F;
         this.liliiIIIIi[i] = 0.0F;
      }
   }

   private void IIIilIIiiIIi(double cz, double cx, double cy) {
      long var9 = -687438309212732641L;
      this.iliiiIIIIi = true;
      var9 ^= ((long)Math.max(this.iIiiiIIIIi, this.IliiiIIIIi) << 32 ^ var9) & -1L << 32;

      for (var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         this.IlIillIiilIi((int)var9, cz, cx, cy);
      }

      this.iIiiiIIIIi = (int)(var9 >>> 32);
   }

   private boolean Ililllililil(int i, double cy, double cz, double cx) {
      double var8 = (double)this.IIiliIIIIi.IilliilIil;
      double var10 = this.IliliIIIIi[i] - cy;
      double var12 = this.lliliIIIIi[i] - cz;
      double var14 = this.ililiIIIIi[i] - cx;
      return var10 < -var8
         || var10 >= var8
         || var14 < -var8
         || var14 >= var8
         || var12 < (double)(-this.IIiliIIIIi.lilliilIil)
         || var12 >= (double)this.IIiliIIIIi.iilliilIil;
   }

   private void IlIillIiilIi(int i, double cz, double cx, double cy) {
      long var9 = -7956609385167842056L;
      this.iIIiiIIIIi[i]++;
      this.Iilililiiili(i);
      var9 ^= ((long)this.IlIiiIIIIi[i] << 32 ^ var9) & -1L << 32;
      this.IliliIIIIi[i] = cz + (double)((lIlliIiiIlliIi.iIlIlllllill((int)(var9 >>> 32), 40) - 0.5F) * this.IIiliIIIIi.IliIlllilIi());
      this.ililiIIIIi[i] = cy + (double)((lIlliIiiIlliIi.iIlIlllllill((int)(var9 >>> 32), 41) - 0.5F) * this.IIiliIIIIi.IliIlllilIi());
      this.lliliIIIIi[i] = cx
         - (double)this.IIiliIIIIi.lilliilIil
         + (double)(lIlliIiiIlliIi.iIlIlllllill((int)(var9 >>> 32), 42) * this.IIiliIIIIi.liiiIIllIl() * 0.999F);
      this.IIlilIliiIli(i, cz, cx, cy);
      this.Illillliilli(i);
      this.IIIiiIIIIi[i] = 0.0F;
   }

   public void iliIiiliiiii() {
      this.IIIIIlIIIi = false;
   }

   public void iIlIlllllill(int count) {
      this.IliiiIIIIi = count < 0 ? 0 : Math.min(count, this.lIiliIIIIi);
   }

   public void Illlllllilll(double camY, double ground, double camX, float dt, ilIIIlIlIiIIIlIl camZ) {
      long var17 = 7641183031227524219L;
      if (camZ == null) {
         camZ = iiIliIIIIi;
      }

      if (!(dt >= 0.0F)) {
         dt = 0.0F;
      }

      if (dt > 0.2F) {
         dt = 0.2F;
      }

      float var9 = this.IIiliIIIIi.IliIlllilIi();
      float var10 = this.IIiliIIIIi.liiiIIllIl();
      if (!this.iliiiIIIIi
         || Math.abs(camY - this.IiiiiIIIIi) > (double)var9
         || Math.abs(camX - this.iiiiiIIIIi) > (double)var9
         || Math.abs(ground - this.liiiiIIIIi) > (double)var10) {
         this.IIIilIIiiIIi(camY, ground, camX);
      }

      this.IiiiiIIIIi = camY;
      this.liiiiIIIIi = ground;
      this.iiiiiIIIIi = camX;
      this.lliiiIIIIi += (double)dt;
      if (this.IliiiIIIIi > this.iIiiiIIIIi) {
         for (var17 ^= ((long)this.iIiiiIIIIi << 32 ^ var17) & -1L << 32; (int)(var17 >>> 32) < this.IliiiIIIIi; var17 += 4294967296L) {
            this.IlIillIiilIi((int)(var17 >>> 32), camY, ground, camX);
         }

         this.iIiiiIIIIi = this.IliiiIIIIi;
      }

      var17 ^= ((long)(dt > 0.05F ? (int)Math.ceil((double)(dt / 0.05F)) : 1) << 32 ^ var17) & -1L << 32;
      float var12 = dt / (float)((int)(var17 >>> 32));
      float var13 = 1.0F - (float)Math.exp((double)(-var12 / this.IIiliIIIIi.IIiliilIil));
      float var14 = 1.0F - (float)Math.exp((double)(-dt * 2.4F));
      float var15 = 1.0F - (float)Math.exp((double)(-dt * 24.0F));

      for (long var20 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var20 < this.iIiiiIIIIi; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         this.Iilllilliill((int)var20, var12, (int)(var20 >>> 32), dt, var13, var14, var15, camY, ground, camX, camZ);
      }

      while (this.iIiiiIIIIi > this.IliiiIIIIi && this.IIIiiIIIIi[this.iIiiiIIIIi - 1] <= 0.002F) {
         this.iIiiiIIIIi--;
      }
   }

   private void IIillIiliIil(int h, float i) {
      double var3 = this.IliliIIIIi[h] - this.lIIIIlIIIi;
      double var5 = this.ililiIIIIi[h] - this.IlIIIlIIIi;
      double var7 = this.lliliIIIIi[h] - (this.iIIIIlIIIi + 0.9);
      if (!(var3 > 2.0) && !(var3 < -2.0) && !(var5 > 2.0) && !(var5 < -2.0)) {
         if (!(var7 < -1.5) && !(var7 > 1.7)) {
            float var9 = (float)(var3 * var3 + var5 * var5);
            if (!(var9 >= 4.0F) && !(var9 < 1.0E-6F)) {
               float var10 = (float)Math.sqrt(
                  (double)(this.llIIIlIIIi * this.llIIIlIIIi + this.IiIIIlIIIi * this.IiIIIlIIIi + this.ilIIIlIIIi * this.ilIIIlIIIi * 0.25F)
               );
               if (!(var10 < 0.15F)) {
                  float var11 = (float)Math.sqrt((double)var9);
                  float var12 = 1.0F - var11 / 2.0F;
                  var12 *= var12;
                  var12 *= 1.0F - lIlliIiiIlliIi.IiIlliIliiIl(0.9F, 1.6F, (float)Math.abs(var7));
                  if (!(var12 <= 0.0F)) {
                     float var13 = (float)var3 / var11;
                     float var14 = (float)var5 / var11;
                     float var15 = var13 * var10 * 0.95F;
                     float var16 = var14 * var10 * 0.95F;
                     float var17 = this.llIIIlIIIi * var14 - this.IiIIIlIIIi * var13 >= 0.0F ? 1.0F : -1.0F;
                     var15 += -var14 * var17 * var10 * 0.5F;
                     var16 += var13 * var17 * var10 * 0.5F;
                     float var18 = (float)Math.sqrt((double)(this.llIIIlIIIi * this.llIIIlIIIi + this.IiIIIlIIIi * this.IiIIIlIIIi));
                     if (var18 > 0.001F) {
                        float var19 = (var13 * this.llIIIlIIIi + var14 * this.IiIIIlIIIi) / var18;
                        if (var19 < 0.0F) {
                           var15 += this.llIIIlIIIi * -var19 * 0.55F;
                           var16 += this.IiIIIlIIIi * -var19 * 0.55F;
                        }
                     }

                     float var26 = this.ilIIIlIIIi * 0.3F;
                     float var20 = (float)Math.sqrt((double)(var15 * var15 + var16 * var16 + var26 * var26));
                     if (var20 > 9.0F) {
                        float var21 = 9.0F / var20;
                        var15 *= var21;
                        var16 *= var21;
                        var26 *= var21;
                     }

                     this.IiiliIIIIi[h] = this.IiiliIIIIi[h] + var15 * var12 * i;
                     this.liiliIIIIi[h] = this.liiliIIIIi[h] + var26 * var12 * i;
                     this.iiiliIIIIi[h] = this.iiiliIIIIi[h] + var16 * var12 * i;
                  }
               }
            }
         }
      }
   }

   public IIiiIlIilIiiIlIi(IIlIIlillIlIIlil style, int salt) {
      long var4 = 995455654764222724L;
      super();
      this.IIiliIIIIi = style;
      this.lIiliIIIIi = style.illliilIil;
      this.iIiliIIIIi = salt;
      var4 ^= ((long)this.lIiliIIIIi << 32 ^ var4) & -1L << 32;
      this.IliliIIIIi = new double[(int)(var4 >>> 32)];
      this.lliliIIIIi = new double[(int)(var4 >>> 32)];
      this.ililiIIIIi = new double[(int)(var4 >>> 32)];
      this.IiiliIIIIi = new float[(int)(var4 >>> 32)];
      this.liiliIIIIi = new float[(int)(var4 >>> 32)];
      this.iiiliIIIIi = new float[(int)(var4 >>> 32)];
      this.IIIiiIIIIi = new float[(int)(var4 >>> 32)];
      this.lIIiiIIIIi = new float[(int)(var4 >>> 32)];
      this.iIIiiIIIIi = new int[(int)(var4 >>> 32)];
      this.IlIiiIIIIi = new int[(int)(var4 >>> 32)];
      this.llIiiIIIIi = new float[(int)(var4 >>> 32)];
      this.ilIiiIIIIi = new float[(int)(var4 >>> 32)];
      this.IiIiiIIIIi = new float[(int)(var4 >>> 32)];
      this.liIiiIIIIi = new float[(int)(var4 >>> 32)];
      this.iiIiiIIIIi = new float[(int)(var4 >>> 32)];
      this.IIliiIIIIi = new float[(int)(var4 >>> 32)];
      this.lIliiIIIIi = new float[(int)(var4 >>> 32)];
      this.iIliiIIIIi = new float[(int)(var4 >>> 32)];
      this.IlliiIIIIi = new float[(int)(var4 >>> 32)];
      this.llliiIIIIi = new float[(int)(var4 >>> 32)];
      this.illiiIIIIi = new float[(int)(var4 >>> 32)];
      this.IiliiIIIIi = new float[(int)(var4 >>> 32)];
      this.liliiIIIIi = new float[(int)(var4 >>> 32)];
      this.iiliiIIIIi = new float[(int)(var4 >>> 32)];
      this.IIiiiIIIIi = new float[(int)(var4 >>> 32)];
      this.lIiiiIIIIi = new float[(int)(var4 >>> 32)];
   }

   public static double IiIlliIliiIl(double rel, double size) {
      double var4 = size * 0.5;
      return rel - size * Math.floor((rel + var4) / size);
   }

   public void IilliliilIIi(float w01, float wz, float gust01, float wx) {
      this.liIIIlIIIi = w01;
      this.iiIIIlIIIi = wz;
      this.IIlIIlIIIi = gust01;
      this.lIlIIlIIIi = wx;
   }

   public int IliIlllilIi() {
      return this.iIiiiIIIIi;
   }

   public static void IIlllIlliIll(double t, float out, float[] w01) {
      float var4 = (lIlliIiiIlliIi.IIIllIIliIIl(t * 0.011 + 7.31) - 0.5F) * 2.8F;
      float var5 = 0.6F + var4;
      float var6 = out * 2.2F * (0.75F + 0.5F * lIlliIiiIlliIi.IIIllIIliIIl(t * 0.043 + 1.17));
      float var7 = lIlliIiiIlliIi.IiIlliIliiIl(0.58F, 0.92F, lIlliIiiIlliIi.IIIllIIliIIl(t * 0.16 + 3.71));
      float var8 = var6 + out * 1.7F * var7;
      w01[0] = (float)Math.cos((double)var5) * var8;
      w01[1] = (float)Math.sin((double)var5) * var8;
      w01[2] = var7;
   }

   private static double Iiiiliiiiiii(double x) {
      return x - Math.floor(x);
   }

   private void Illillliilli(int i) {
      float var2 = this.IIiliIIIIi.lIiliilIil;
      this.IiiliIIIIi[i] = this.liIIIlIIIi * var2;
      this.iiiliIIIIi[i] = this.iiIIIlIIIi * var2;
      this.liiliIIIIi[i] = -this.IiIiiIIIIi[i];
      this.lIIiiIIIIi[i] = -1.0F;
      this.lIiiiIIIIi[i] = 0.0F;
      this.IIiiiIIIIi[i] = 0.0F;
   }

   static int Iliilliiilii(double v) {
      long var3 = -3264576618375345340L;
      var3 ^= ((long)((int)v) << 32 ^ var3) & -1L << 32;
      return v < (double)((int)(var3 >>> 32)) ? (int)(var3 >>> 32) - 1 : (int)(var3 >>> 32);
   }

   private void Iilllilliill(int kUnder, float h, int cz, float cy, float cx, float ground, float dt, double sub, double kUp, double kRelax, ilIIIlIlIiIIIlIl i) {
      long var32 = 2789504421730610055L;
      long var34 = 4231699484110599732L;
      float var15 = this.IIiliIIIIi.lliliilIil;
      if (this.lIIiiIIIIi[kUnder] >= 0.0F) {
         this.lIIiiIIIIi[kUnder] = this.lIIiiIIIIi[kUnder] + cy;
         this.lIiiiIIIIi[kUnder] = Math.min(1.0F, this.lIiiiIIIIi[kUnder] + cy * 4.0F);
         this.IiiliIIIIi[kUnder] = 0.0F;
         this.liiliIIIIi[kUnder] = 0.0F;
         this.iiiliIIIIi[kUnder] = 0.0F;
         if (this.lIIiiIIIIi[kUnder] >= this.IIiliIIIIi.iIiliilIil) {
            this.IiIiliIiiiIi(kUnder, sub, kUp, kRelax);
         } else if (this.Ililllililil(kUnder, sub, kUp, kRelax)) {
            this.IiIiliIiiiIi(kUnder, sub, kUp, kRelax);
         }
      } else {
         float var16 = 0.25F + 0.9F * this.IIlIIlIIIi;
         double var17 = this.lliiiIIIIi;
         float var19 = (lIlliIiiIlliIi.IlIlllIlilIl(this.IliliIIIIi[kUnder] * 0.045 + var17 * 0.07, this.ililiIIIIi[kUnder] * 0.045 - var17 * 0.05) - 0.5F)
            * var16;
         float var20 = (
               lIlliIiiIlliIi.IlIlllIlilIl(this.IliliIIIIi[kUnder] * 0.045 - var17 * 0.06 + 31.7, this.ililiIIIIi[kUnder] * 0.045 + var17 * 0.04 + 11.3) - 0.5F
            )
            * var16;
         float var21 = this.IIiliIIIIi.lIiliilIil;
         float var22;
         float var23;
         float var24;
         if (this.IIiliIIIIi == IIlIIlillIlIIlil.lllliilIil) {
            float var25 = (float)Iiiiliiiiiii(var17 * (double)this.iiIiiIIIIi[kUnder] + (double)this.lIliiIIIIi[kUnder]) * (float) (Math.PI * 2);
            float var26 = (float)Math.cos((double)var25);
            float var27 = (float)Math.sin((double)var25);
            float var28 = this.illiiIIIIi[kUnder] + (float)(var17 * 0.09 * ((double)this.IIliiIIIIi[kUnder] - 0.5));
            this.liliiIIIIi[kUnder] = var28;
            float var29 = this.liIiiIIIIi[kUnder] * var26;
            float var30 = lIlliIiiIlliIi.IiIlliIliiIl(0.64F, 1.0F, lIlliIiiIlliIi.IIIllIIliIIl(var17 * 0.08 + (double)this.iIliiIIIIi[kUnder] * 61.0));
            float var31 = var30 * (0.35F + 0.9F * this.IIlIIlIIIi) * 1.15F + this.lIlIIlIIIi * this.IIlIIlIIIi * 0.45F;
            var22 = (float)Math.cos((double)var28) * var29 + this.liIIIlIIIi * var21 + var19;
            var24 = (float)Math.sin((double)var28) * var29 + this.iiIIIlIIIi * var21 + var20;
            var23 = -this.IiIiiIIIIi[kUnder] * (0.42F + 0.9F * var26 * var26) + var31;
            this.IIiiiIIIIi[kUnder] = this.llliiIIIIi[kUnder] * var27;
            this.iiliiIIIIi[kUnder] = this.iiliiIIIIi[kUnder] + this.IlliiIIIIi[kUnder] * cy;
            if (this.iiliiIIIIi[kUnder] > (float) (Math.PI * 2)) {
               this.iiliiIIIIi[kUnder] = this.iiliiIIIIi[kUnder] - (float) (Math.PI * 2);
            } else if (this.iiliiIIIIi[kUnder] < (float) (-Math.PI * 2)) {
               this.iiliiIIIIi[kUnder] = this.iiliiIIIIi[kUnder] + (float) (Math.PI * 2);
            }
         } else {
            float var38 = (float)Iiiiliiiiiii(var17 * (double)this.iiIiiIIIIi[kUnder] + (double)this.lIliiIIIIi[kUnder]) * (float) (Math.PI * 2);
            float var39 = (float)Iiiiliiiiiii(var17 * (double)this.IIliiIIIIi[kUnder] + (double)this.iIliiIIIIi[kUnder]) * (float) (Math.PI * 2);
            float var41 = (float)Math.sin((double)var38);
            var22 = this.liIiiIIIIi[kUnder] * var41 + this.liIIIlIIIi * var21 + var19;
            var24 = this.liIiiIIIIi[kUnder] * (float)Math.cos((double)var39) + this.iiIIIlIIIi * var21 + var20;
            var23 = -this.IiIiiIIIIi[kUnder] * (1.0F + 0.1F * (float)Math.sin((double)(var38 * 1.7F))) + (var19 - var20) * 0.15F;
         }

         for (var32 ^= (0L ^ var32) & -1L << 32; (int)(var32 >>> 32) < cz; var32 += 4294967296L) {
            this.IiiliIIIIi[kUnder] = this.IiiliIIIIi[kUnder] + (var22 - this.IiiliIIIIi[kUnder]) * cx;
            this.liiliIIIIi[kUnder] = this.liiliIIIIi[kUnder] + (var23 - this.liiliIIIIi[kUnder]) * cx;
            this.iiiliIIIIi[kUnder] = this.iiiliIIIIi[kUnder] + (var24 - this.iiiliIIIIi[kUnder]) * cx;
            if (this.IIIIIlIIIi) {
               this.IIillIiliIil(kUnder, h);
            }

            double var40 = this.lliliIIIIi[kUnder];
            this.IliliIIIIi[kUnder] = this.IliliIIIIi[kUnder] + (double)(this.IiiliIIIIi[kUnder] * h);
            this.lliliIIIIi[kUnder] = this.lliliIIIIi[kUnder] + (double)(this.liiliIIIIi[kUnder] * h);
            this.ililiIIIIi[kUnder] = this.ililiIIIIi[kUnder] + (double)(this.iiiliIIIIi[kUnder] * h);
            float var42 = i.top(Iliilliiilii(this.IliliIIIIi[kUnder]), Iliilliiilii(this.ililiIIIIi[kUnder]));
            if (this.lliliIIIIi[kUnder] < (double)(var42 + var15) && var40 >= (double)(var42 + var15)) {
               this.lliliIIIIi[kUnder] = (double)(var42 + var15);
               this.lIIiiIIIIi[kUnder] = 0.0F;
               this.lIiiiIIIIi[kUnder] = 0.0F;
               this.IiiliIIIIi[kUnder] = 0.0F;
               this.liiliIIIIi[kUnder] = 0.0F;
               this.iiiliIIIIi[kUnder] = 0.0F;
               break;
            }
         }

         if (this.lIIiiIIIIi[kUnder] < 0.0F) {
            this.Iiilliiliiil(kUnder, sub, kUp, kRelax);
         } else if (this.Ililllililil(kUnder, sub, kUp, kRelax)) {
            this.IiIiliIiiiIi(kUnder, sub, kUp, kRelax);
         }
      }

      var32 ^= ((long)(kUnder < this.IliiiIIIIi ? 1 : 0) ^ var32) & -1L >>> 32;
      var34 ^= (0L ^ var34) & -1L << 32;
      if (this.lIIiiIIIIi[kUnder] < 0.0F) {
         float var18 = i.top(Iliilliiilii(this.IliliIIIIi[kUnder]), Iliilliiilii(this.ililiIIIIi[kUnder]));
         var34 ^= ((long)(this.lliliIIIIi[kUnder] < (double)(var18 + var15 - 0.001F) ? 1 : 0) << 32 ^ var34) & -1L << 32;
      }

      float var36 = (int)var32 != 0 && (int)(var34 >>> 32) == 0 ? 1.0F : 0.0F;
      float var37 = var36 > this.IIIiiIIIIi[kUnder] ? ground : ((int)(var34 >>> 32) != 0 ? dt : ground);
      this.IIIiiIIIIi[kUnder] = this.IIIiiIIIIi[kUnder] + (var36 - this.IIIiiIIIIi[kUnder]) * var37;
      if (var36 == 0.0F && this.IIIiiIIIIi[kUnder] < 0.002F) {
         this.IIIiiIIIIi[kUnder] = 0.0F;
      }
   }

   public int IlIlllIlilIl() {
      long var3 = -8457206702946717280L;
      var3 ^= (0L ^ var3) & -1L << 32;

      for (var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < this.iIiiiIIIIi; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
         if (this.IIIiiIIIIi[(int)var3] > 0.002F) {
            var3 += 4294967296L;
         }
      }

      return (int)(var3 >>> 32);
   }

   float IIiilIiiiIii(int i) {
      float var2 = this.lIIiiIIIIi[i];
      return var2 < 0.0F ? 1.0F : 1.0F - lIlliIiiIlliIi.IiIlliIliiIl(this.IIiliIIIIi.iIiliilIil * 0.2F, this.IIiliIIIIi.iIiliilIil, var2);
   }
}
