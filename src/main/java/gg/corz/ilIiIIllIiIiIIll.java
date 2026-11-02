package gg.corz;

import java.util.Arrays;

final class ilIiIIllIiIiIIll {
   final int[] iililIllll;
   final boolean IlIilIllll;
   int iIlilIllll;
   final int[] lllilIllll;
   final int[] illilIllll;
   final int[] IIiilIllll;
   private static final int liillIllll = 2;
   int iiIilIllll;
   final int[] lililIllll;
   int ilIilIllll;
   final int iIIilIllll;
   final int[] IililIllll;
   private static final float llillIllll = 1.5F;
   final byte[] lIiilIllll;
   final int iiillIllll;
   int[] lIlilIllll;
   private static final float IlillIllll = 0.5F;
   int[] IIlilIllll;
   private static final int ilillIllll = 16;
   float[] llIilIllll = new float[3584];
   boolean[] liIilIllll;
   private static final int IiillIllll = 1;
   final int IIIilIllll;
   final int lIIilIllll;
   int[] IllilIllll;
   private static final float iIillIllll = 0.02F;
   final float[] IliilIllll;
   final float[] iIiilIllll;
   float[] IiIilIllll = new float[1024];

   private void IlIlllIlilIl(boolean[] ext0, boolean[] cov) {
      Arrays.fill(this.lllilIllll, -1);
      Arrays.fill(this.lIiilIllll, (byte)0);

      for (int var3 = 0; var3 < this.ilIilIllll; var3++) {
         int var4 = var3 * 7;

         for (int var5 = 0; var5 < 3; var5++) {
            int var6 = var4 + var5 * 2;
            int var7 = var4 + (var5 + 1) % 3 * 2;
            int var8 = var4 + (var5 + 2) % 3 * 2;
            float var9 = this.llIilIllll[var6];
            float var10 = this.llIilIllll[var6 + 1];
            float var11 = this.llIilIllll[var7] - var9;
            float var12 = this.llIilIllll[var7 + 1] - var10;
            float var13 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12));
            if (!(var13 < 0.001F)) {
               float var14 = -var12 / var13;
               float var15 = var11 / var13;
               if ((this.llIilIllll[var8] - var9) * var14 + (this.llIilIllll[var8 + 1] - var10) * var15 > 0.0F) {
                  var14 = -var14;
                  var15 = -var15;
               }

               int var16 = Math.max(1, (int)Math.ceil((double)(var13 / 0.5F)));
               int var17 = -1;

               for (int var18 = 0; var18 < var16; var18++) {
                  float var19 = ((float)var18 + 0.5F) / (float)var16;
                  float var20 = var9 + var11 * var19;
                  float var21 = var10 + var12 * var19;
                  if (this.IIIllIIliIIl(var20 + var14 * 0.02F, var21 + var15 * 0.02F)) {
                     var17 = -1;
                  } else {
                     if (var17 < 0) {
                        float var22 = (float)var18 / (float)var16;
                        var17 = this.IIlllIlliIll(
                           var9 + var11 * var22, var10 + var12 * var22, this.IiIlliIliiIl(ext0, cov, var20 + var14 * 1.5F, var21 + var15 * 1.5F)
                        );
                     }

                     float var26 = ((float)var18 + 1.0F) / (float)var16;
                     this.IiIilIllll[var17 * 4 + 2] = var9 + var11 * var26;
                     this.IiIilIllll[var17 * 4 + 3] = var10 + var12 * var26;
                     int var23 = Math.max(0, Math.min(this.iiillIllll - 1, (int)var20));
                     int var24 = Math.max(0, Math.min(this.IIIilIllll - 1, (int)var21));
                     int var25 = var24 * this.iiillIllll + var23;
                     if (this.lllilIllll[var25] < 0 || this.IIlilIllll[this.lllilIllll[var25]] != var17) {
                        if (this.iIlilIllll == this.IIlilIllll.length) {
                           this.IIlilIllll = Arrays.copyOf(this.IIlilIllll, this.iIlilIllll * 2);
                           this.lIlilIllll = Arrays.copyOf(this.lIlilIllll, this.iIlilIllll * 2);
                        }

                        this.IIlilIllll[this.iIlilIllll] = var17;
                        this.lIlilIllll[this.iIlilIllll] = this.lllilIllll[var25];
                        this.lllilIllll[var25] = this.iIlilIllll++;
                        this.lIiilIllll[var25] = (byte)(this.lIiilIllll[var25] | (byte)(this.liIilIllll[var17] ? 2 : 1));
                     }
                  }
               }
            }
         }
      }
   }

   ilIiIIllIiIiIIll(int w, int cracks, boolean h) {
      this.liIilIllll = new boolean[256];
      this.IIlilIllll = new int[2048];
      this.lIlilIllll = new int[2048];
      this.IllilIllll = new int[4096];
      this.iiillIllll = w;
      this.IIIilIllll = cracks;
      this.IlIilIllll = h;
      this.lIIilIllll = (w + 16 - 1) / 16;
      this.iIIilIllll = (cracks + 16 - 1) / 16;
      this.lllilIllll = new int[w * cracks];
      this.illilIllll = new int[w * cracks];
      this.IililIllll = new int[w * cracks];
      this.lIiilIllll = new byte[w * cracks];
      this.lililIllll = new int[this.lIIilIllll * this.iIIilIllll + 1];
      int var4 = Math.max(w, cracks);
      this.iililIllll = new int[var4];
      this.IIiilIllll = new int[var4];
      this.iIiilIllll = new float[var4];
      this.IliilIllll = new float[var4 + 1];
   }

   private static int iliIiiliiiii(float v, int n) {
      long var3 = -1783733469680795953L;
      var3 ^= ((long)((int)Math.floor((double)(v / 16.0F))) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? 0 : ((int)(var3 >>> 32) >= n ? n - 1 : (int)(var3 >>> 32));
   }

   private int IIlllIlliIll(float y, float hole, boolean x) {
      if (this.iiIilIllll == this.liIilIllll.length) {
         this.IiIilIllll = Arrays.copyOf(this.IiIilIllll, this.iiIilIllll * ((1104209782 << 13 | 1104209782 >>> 19) - 37 ^ 485410845));
         this.liIilIllll = Arrays.copyOf(this.liIilIllll, this.iiIilIllll * 2);
      }

      this.IiIilIllll[this.iiIilIllll * 4] = y;
      this.IiIilIllll[this.iiIilIllll * 4 + 1] = hole;
      this.IiIilIllll[this.iiIilIllll * 4 + 2] = y;
      this.IiIilIllll[this.iiIilIllll * 4 + 3] = hole;
      this.liIilIllll[this.iiIilIllll] = x;
      return this.iiIilIllll++;
   }

   void IliIlllilIi() {
      this.ilIilIllll = 0;
      this.iiIilIllll = 0;
      this.iIlilIllll = 0;
   }

   private float Iilllilliill(int i, int q, int kinds) {
      if (q < 0) {
         return 1.0E20F;
      } else {
         float var4 = (float)(i % this.iiillIllll) + 0.5F;
         float var5 = (float)(i / this.iiillIllll) + 0.5F;
         int var6 = q % this.iiillIllll;
         int var7 = q / this.iiillIllll;
         float var8 = 1.0E20F;

         for (int var9 = 0; var9 < 5; var9++) {
            int var10 = var6 + (var9 == 1 ? 1 : (var9 == 2 ? -1 : 0));
            int var11 = var7 + (var9 == 3 ? 1 : (var9 == 4 ? -1 : 0));
            if (var10 >= 0 && var11 >= 0 && var10 < this.iiillIllll && var11 < this.IIIilIllll) {
               for (int var12 = this.lllilIllll[var11 * this.iiillIllll + var10]; var12 >= 0; var12 = this.lIlilIllll[var12]) {
                  int var13 = this.IIlilIllll[var12];
                  if ((kinds & (this.liIilIllll[var13] ? 2 : 1)) != 0) {
                     int var14 = var13 * 4;
                     float var15 = this.IiIilIllll[var14];
                     float var16 = this.IiIilIllll[var14 + 1];
                     float var17 = this.IiIilIllll[var14 + 2] - var15;
                     float var18 = this.IiIilIllll[var14 + 3] - var16;
                     float var19 = var17 * var17 + var18 * var18;
                     float var20 = var19 > 1.0E-12F ? Math.max(0.0F, Math.min(1.0F, ((var4 - var15) * var17 + (var5 - var16) * var18) / var19)) : 0.0F;
                     float var21 = var15 + var17 * var20 - var4;
                     float var22 = var16 + var18 * var20 - var5;
                     float var23 = var21 * var21 + var22 * var22;
                     if (var23 < var8) {
                        var8 = var23;
                     }
                  }
               }
            }
         }

         return var8 >= 5.0E19F ? 1.0E20F : (float)Math.sqrt((double)var8);
      }
   }

   boolean iIlIlllllill(boolean[] ext0, boolean[] outer, float[] cov, boolean sd) {
      if (this.ilIilIllll == 0) {
         return false;
      } else {
         this.lIiiIiIlilli();
         this.IlIlllIlilIl(ext0, outer);
         if (this.iIlilIllll != 0 && this.Illlllllilll(sd ? 1 : 3)) {
            for (int var5 = 0; var5 < this.iiillIllll * this.IIIilIllll; var5++) {
               float var6 = this.Iilllilliill(var5, this.illilIllll[var5], sd ? 1 : 3);
               if (var6 >= 5.0E19F) {
                  return false;
               }

               cov[var5] = !ext0[var5] && (!sd || outer[var5]) ? -var6 : var6;
            }

            return true;
         } else {
            return false;
         }
      }
   }

   private boolean Illlllllilll(int bit) {
      boolean var2 = false;

      for (int var3 = 0; var3 < this.iiillIllll; var3++) {
         int var4 = -1;

         for (int var5 = 0; var5 < this.IIIilIllll; var5++) {
            if ((this.lIiilIllll[var5 * this.iiillIllll + var3] & bit) != 0) {
               var4 = var5;
               var2 = true;
            }

            this.IililIllll[var5 * this.iiillIllll + var3] = var4;
         }

         var4 = -1;

         for (int var11 = this.IIIilIllll - 1; var11 >= 0; var11--) {
            if ((this.lIiilIllll[var11 * this.iiillIllll + var3] & bit) != 0) {
               var4 = var11;
            }

            int var6 = this.IililIllll[var11 * this.iiillIllll + var3];
            if (var4 >= 0 && (var6 < 0 || var4 - var11 < var11 - var6)) {
               this.IililIllll[var11 * this.iiillIllll + var3] = var4;
            }
         }
      }

      if (!var2) {
         return false;
      } else {
         for (int var7 = 0; var7 < this.IIIilIllll; var7++) {
            for (int var9 = 0; var9 < this.iiillIllll; var9++) {
               int var12 = this.IililIllll[var7 * this.iiillIllll + var9];
               this.iIiilIllll[var9] = var12 < 0 ? 1.0E20F : (float)(var12 - var7) * (float)(var12 - var7);
            }

            iiiilIiIIIIiIi.Iliilliiilii(this.iIiilIllll, this.iiillIllll, this.iililIllll, this.IIiilIllll, this.IliilIllll);

            for (int var10 = 0; var10 < this.iiillIllll; var10++) {
               int var13 = this.iililIllll[var10];
               int var14 = this.IililIllll[var7 * this.iiillIllll + var13];
               this.illilIllll[var7 * this.iiillIllll + var10] = var14 < 0 ? -1 : var14 * this.iiillIllll + var13;
            }
         }

         return true;
      }
   }

   void liiiIIllIl(float by, float bx, float cy, float cx, float ay, float ax) {
      float var7 = (cy - by) * (ax - bx) - (cx - bx) * (ay - by);
      if (!(Math.abs(var7) < 1.0E-4F)) {
         if ((this.ilIilIllll + 1) * 7 > this.llIilIllll.length) {
            this.llIilIllll = Arrays.copyOf(this.llIilIllll, this.llIilIllll.length * 2);
         }

         int var8 = this.ilIilIllll++ * 7;
         this.llIilIllll[var8] = by;
         this.llIilIllll[var8 + 1] = bx;
         this.llIilIllll[var8 + 2] = cy;
         this.llIilIllll[var8 + 3] = cx;
         this.llIilIllll[var8 + 4] = ay;
         this.llIilIllll[var8 + 5] = ax;
         this.llIilIllll[var8 + 6] = 1.0F / var7;
      }
   }

   private void lIiiIiIlilli() {
      Arrays.fill(this.lililIllll, 0);

      for (int var1 = 0; var1 < 2; var1++) {
         for (int var2 = 0; var2 < this.ilIilIllll; var2++) {
            int var3 = var2 * 7;
            int var4 = iliIiiliiiii(Math.min(this.llIilIllll[var3], Math.min(this.llIilIllll[var3 + 2], this.llIilIllll[var3 + 4])), this.lIIilIllll);
            int var5 = iliIiiliiiii(Math.max(this.llIilIllll[var3], Math.max(this.llIilIllll[var3 + 2], this.llIilIllll[var3 + 4])), this.lIIilIllll);
            int var6 = iliIiiliiiii(Math.min(this.llIilIllll[var3 + 1], Math.min(this.llIilIllll[var3 + 3], this.llIilIllll[var3 + 5])), this.iIIilIllll);
            int var7 = iliIiiliiiii(Math.max(this.llIilIllll[var3 + 1], Math.max(this.llIilIllll[var3 + 3], this.llIilIllll[var3 + 5])), this.iIIilIllll);

            for (int var8 = var6; var8 <= var7; var8++) {
               for (int var9 = var4; var9 <= var5; var9++) {
                  int var10 = var8 * this.lIIilIllll + var9;
                  if (var1 == 0) {
                     this.lililIllll[var10 + 1]++;
                  } else {
                     this.IllilIllll[this.illilIllll[var10]++] = var2;
                  }
               }
            }
         }

         if (var1 == 0) {
            for (int var11 = 0; var11 < this.lIIilIllll * this.iIIilIllll; var11++) {
               this.lililIllll[var11 + 1] = this.lililIllll[var11 + 1] + this.lililIllll[var11];
            }

            if (this.IllilIllll.length < this.lililIllll[this.lIIilIllll * this.iIIilIllll]) {
               this.IllilIllll = new int[this.lililIllll[this.lIIilIllll * this.iIIilIllll]];
            }

            System.arraycopy(this.lililIllll, 0, this.illilIllll, 0, this.lIIilIllll * this.iIIilIllll);
         }
      }
   }

   private boolean IiIlliIliiIl(boolean[] y, boolean[] ext0, float cov, float x) {
      long var6 = 4816077639047427134L;
      if (!(cov < 0.0F) && !(x < 0.0F) && !(cov >= (float)this.iiillIllll) && !(x >= (float)this.IIIilIllll)) {
         var6 ^= ((long)((int)x * this.iiillIllll + (int)cov) << 32 ^ var6) & -1L << 32;
         return this.IlIilIllll ? !ext0[(int)(var6 >>> 32)] : !y[(int)(var6 >>> 32)] && !ext0[(int)(var6 >>> 32)];
      } else {
         return false;
      }
   }

   boolean IilliliilIIi(float[] sh) {
      if (this.iIlilIllll != 0 && this.Illlllllilll(2)) {
         for (int var2 = 0; var2 < this.iiillIllll * this.IIIilIllll; var2++) {
            sh[var2] = this.Iilllilliill(var2, this.illilIllll[var2], 2);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean IIIllIIliIIl(float py, float px) {
      if (!(py < 0.0F) && !(px < 0.0F) && !(py >= (float)this.iiillIllll) && !(px >= (float)this.IIIilIllll)) {
         int var3 = (int)px / 16 * this.lIIilIllll + (int)py / 16;
         int var4 = this.lililIllll[var3];

         for (int var5 = this.lililIllll[var3 + 1]; var4 < var5; var4++) {
            int var6 = this.IllilIllll[var4] * 7;
            float var7 = this.llIilIllll[var6];
            float var8 = this.llIilIllll[var6 + 1];
            float var9 = this.llIilIllll[var6 + 2];
            float var10 = this.llIilIllll[var6 + 3];
            float var11 = this.llIilIllll[var6 + 4];
            float var12 = this.llIilIllll[var6 + 5];
            float var13 = this.llIilIllll[var6 + 6];
            float var14 = ((var9 - py) * (var12 - px) - (var10 - px) * (var11 - py)) * var13;
            if (!(var14 < 0.0F)) {
               float var15 = ((var11 - py) * (var8 - px) - (var12 - px) * (var7 - py)) * var13;
               if (!(var15 < 0.0F) && !(var14 + var15 > 1.0F)) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }
}
