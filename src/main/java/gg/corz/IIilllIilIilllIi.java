package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class IIilllIilIilllIi {
   final llIIliilIIli lIiliiIIIi;
   private final iIlIlIliIllIlIli iiiliiIIIi;
   private static final float IIiliiIIIi = (float) (Math.PI / 2);
   private lIillIlliIillIll lliliiIIIi;
   private lIillIlliIillIll IliliiIIIi;
   final float IIIiiiIIIi;
   private static final float iilliiIIIi = (float) (Math.PI * 2);
   final List<lIillIlliIillIll> iIiliiIIIi = new ArrayList<>();
   private final float[] liiliiIIIi;
   private final ArrayDeque<iIIiiiilIlIiiiil> IiiliiIIIi;
   private final iIIiiiilIlIiiiil ililiiIIIi = new iIIiiiilIlIiiiil();

   liIlilIiiiIlilIi iIIilIlIil(String sharedAtlas, int[] id) {
      this.lIiliiIIIi.iIlIlllllill();
      return new liIlilIiiiIlilIi(sharedAtlas, this.lIiliiIIIi, id, this.iIiliiIIIi, this.lliliiIIIi);
   }

   private void iIIIlIlIIl() {
      this.ililiiIIIi.Iilllilliill(this.liiliiIIIi, 0);
   }

   IIilllIilIilllIi(int detail, int atlasHeight, float atlasWidth, boolean dry) {
      this.IiiliiIIIi = new ArrayDeque<>();
      this.liiliiIIIi = new float[9];
      this.IIIiiiIIIi = atlasWidth;
      this.lIiliiIIIi = new llIIliilIIli(detail, atlasHeight, dry);
      this.iiiliiIIIi = new iIlIlIliIllIlIli(this.lIiliiIIIi.IliiilIIllliiilIIl, -1, true);
      this.IliliiIIIi = this.IlIlllIlilIl(llIililIil<"llIililIil","HtIqtwMMdrTBs4CzcAzgZM9s4AdhHPa/uMaqqITwWds=">(), null, 0.0F, 0.0F, 0.0F);
   }

   public iIlIlIliIllIlIli IIiilIiiiIii(iIlIliilIllIliil r) {
      return new iIlIlIliIllIlIli(r, -1, false);
   }

   public static float[] iIlIlllllill(int xyz, float... samplesPerSpan) {
      long var21 = 3149576498618263235L;
      long var23 = -5255812679733168403L;
      long var25 = 8568545884687838279L;
      long var27 = -109810833199144272L;
      long var29 = -8060679121142272847L;
      long var31 = -4679787021406836364L;
      var21 ^= ((long)(samplesPerSpan.length / 3) << 32 ^ var21) & -1L << 32;
      if ((int)(var21 >>> 32) < 2) {
         throw new IllegalArgumentException(llIililIil<"llIililIil","46MDmWmFwv3GwdjXUPcNLgtMut8ssLSD+UTTE4EyqeZSOW50jUipTqJhd8rgBKgxhw==">());
      } else {
         var21 ^= ((long)((int)(var21 >>> 32) - 1) ^ var21) & -1L >>> 32;
         var23 ^= ((long)Math.max(1, xyz) << 32 ^ var23) & -1L << 32;
         float[] var5 = new float[3 * ((int)var21 * (int)(var23 >>> 32) + 1)];
         var23 ^= (0L ^ var23) & -1L >>> 32;
         var25 ^= (0L ^ var25) & -1L << 32;

         while ((int)(var25 >>> 32) < (int)var21) {
            var25 ^= ((long)Math.max(0, (int)(var25 >>> 32) - 1) ^ var25) & -1L >>> 32;
            var27 ^= ((long)((int)(var25 >>> 32)) << 32 ^ var27) & -1L << 32;
            var27 ^= ((long)((int)(var25 >>> 32) + 1) ^ var27) & -1L >>> 32;
            var29 ^= ((long)Math.min((int)(var21 >>> 32) - 1, (int)(var25 >>> 32) + 2) << 32 ^ var29) & -1L << 32;

            for (var29 ^= (0L ^ var29) & -1L >>> 32; (int)var29 < (int)(var23 >>> 32); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
               float var13 = (float)((int)var29) / (float)((int)(var23 >>> 32));
               float var14 = var13 * var13;
               float var15 = var14 * var13;

               for (var31 ^= (0L ^ var31) & -1L << 32; (int)(var31 >>> 32) < 3; var31 += 4294967296L) {
                  float var17 = samplesPerSpan[3 * (int)var25 + (int)(var31 >>> 32)];
                  float var18 = samplesPerSpan[3 * (int)(var27 >>> 32) + (int)(var31 >>> 32)];
                  float var19 = samplesPerSpan[3 * (int)var27 + (int)(var31 >>> 32)];
                  float var20 = samplesPerSpan[3 * (int)(var29 >>> 32) + (int)(var31 >>> 32)];
                  var5[(int)var23 + (int)(var31 >>> 32)] = 0.5F
                     * (
                        2.0F * var18
                           + (-var17 + var19) * var13
                           + (2.0F * var17 - 5.0F * var18 + 4.0F * var19 - var20) * var14
                           + (-var17 + 3.0F * var18 - 3.0F * var19 + var20) * var15
                     );
               }

               var23 ^= (var23 ^ var23 + (long)3) & -1L >>> 32;
            }

            var25 += 4294967296L;
         }

         var5[(int)var23] = samplesPerSpan[3 * ((int)(var21 >>> 32) - 1)];
         var5[(int)var23 + 1] = samplesPerSpan[3 * ((int)(var21 >>> 32) - 1) + 1];
         var5[(int)var23 + 2] = samplesPerSpan[3 * ((int)(var21 >>> 32) - 1) + 2];
         return var5;
      }
   }

   public IIilllIilIilllIi Illlllllilll(lIillIlliIillIll arm) {
      this.lliliiIIIi = arm;
      return this;
   }

   public IIilllIilIilllIi lIlIliIlIl(
      float back,
      float top,
      float z0,
      float z1,
      float front,
      float y0,
      iIlIlIliIllIlIli x1,
      iIlIlIliIllIlIli x0,
      iIlIlIliIllIlIli y1,
      iIlIlIliIllIlIli right,
      iIlIlIliIllIlIli bottom,
      iIlIlIliIllIlIli left
   ) {
      this.iIIIlIlIIl();
      float var13 = Math.min(back, z1);
      float var14 = Math.max(back, z1);
      float var15 = Math.min(top, front);
      float var16 = Math.max(top, front);
      float var17 = Math.min(z0, y0);
      float var18 = Math.max(z0, y0);
      float[] var19 = new float[]{0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F};
      if (x1 != null) {
         this.llIIlilIIl(new float[]{var14, var16, var17, var13, var16, var17, var13, var15, var17, var14, var15, var17}, var19, 0.0F, 0.0F, -1.0F, x1);
      }

      if (x0 != null) {
         this.llIIlilIIl(new float[]{var13, var16, var18, var14, var16, var18, var14, var15, var18, var13, var15, var18}, var19, 0.0F, 0.0F, 1.0F, x0);
      }

      if (y1 != null) {
         this.llIIlilIIl(new float[]{var14, var16, var18, var14, var16, var17, var14, var15, var17, var14, var15, var18}, var19, 1.0F, 0.0F, 0.0F, y1);
      }

      if (right != null) {
         this.llIIlilIIl(new float[]{var13, var16, var17, var13, var16, var18, var13, var15, var18, var13, var15, var17}, var19, -1.0F, 0.0F, 0.0F, right);
      }

      if (bottom != null) {
         this.llIIlilIIl(new float[]{var13, var16, var17, var14, var16, var17, var14, var16, var18, var13, var16, var18}, var19, 0.0F, 1.0F, 0.0F, bottom);
      }

      if (left != null) {
         this.llIIlilIIl(new float[]{var14, var15, var17, var13, var15, var17, var13, var15, var18, var14, var15, var18}, var19, 0.0F, -1.0F, 0.0F, left);
      }

      return this;
   }

   public IIilllIilIilllIi liIlliiIll(
      float[] endCap, float[] upZ, float[] rx, int upY, iIlIlIliIllIlIli seg, iIlIlIliIllIlIli ry, iIlIlIliIllIlIli upX, float startCap, float m, float path
   ) {
      long var33 = -2401441110426378334L;
      long var35 = -5948712115681203959L;
      long var37 = -110331662085365269L;
      long var39 = -2303665172873551628L;
      long var41 = 4335695317649972311L;
      long var31 = 6292354662976450184L;
      var31 ^= ((long)(endCap.length / 3 - 1) << 32 ^ var31) & -1L << 32;
      if ((int)(var31 >>> 32) >= 1 && upZ.length == (int)(var31 >>> 32) + 1 && rx.length == (int)(var31 >>> 32) + 1) {
         var31 ^= ((long)Math.max(3, Math.round((float)upY * this.IIIiiiIIIi)) ^ var31) & -1L >>> 32;
         float[] var13 = new float[3 * ((int)(var31 >>> 32) + 1)];
         float[] var14 = new float[3 * ((int)(var31 >>> 32) + 1)];
         float[] var15 = new float[3 * ((int)(var31 >>> 32) + 1)];
         var33 ^= (0L ^ var33) & -1L << 32;

         while ((int)(var33 >>> 32) <= (int)(var31 >>> 32)) {
            var33 ^= ((long)Math.max(0, (int)(var33 >>> 32) - 1) ^ var33) & -1L >>> 32;
            var35 ^= ((long)Math.min((int)(var31 >>> 32), (int)(var33 >>> 32) + 1) << 32 ^ var35) & -1L << 32;
            float var19 = endCap[3 * (int)(var35 >>> 32)] - endCap[3 * (int)var33];
            float var20 = endCap[3 * (int)(var35 >>> 32) + 1] - endCap[3 * (int)var33 + 1];
            float var21 = endCap[3 * (int)(var35 >>> 32) + 2] - endCap[3 * (int)var33 + 2];
            float var22 = (float)Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21));
            if (var22 < 1.0E-6F) {
               var19 = 0.0F;
               var20 = 1.0F;
               var21 = 0.0F;
               var22 = 1.0F;
            }

            var13[3 * (int)(var33 >>> 32)] = var19 / var22;
            var13[3 * (int)(var33 >>> 32) + 1] = var20 / var22;
            var13[3 * (int)(var33 >>> 32) + 2] = var21 / var22;
            var33 += 4294967296L;
         }

         float var16 = startCap;
         float var17 = m;
         float var18 = path;

         for (long var62 = var35 ^ (0L ^ var35) & -1L >>> 32; (int)var62 <= (int)(var31 >>> 32); var62 ^= (var62 ^ var62 + (long)1) & -1L >>> 32) {
            float var44 = var13[3 * (int)var62];
            float var46 = var13[3 * (int)var62 + 1];
            float var49 = var13[3 * (int)var62 + 2];
            float var23 = var16 * var44 + var17 * var46 + var18 * var49;
            float var24 = var16 - var23 * var44;
            float var25 = var17 - var23 * var46;
            float var26 = var18 - var23 * var49;
            float var27 = (float)Math.sqrt((double)(var24 * var24 + var25 * var25 + var26 * var26));
            if (var27 < 1.0E-4F) {
               float[] var28 = Math.abs(var46) < 0.9F ? new float[]{0.0F, 1.0F, 0.0F} : new float[]{0.0F, 0.0F, -1.0F};
               var23 = var28[0] * var44 + var28[1] * var46 + var28[2] * var49;
               var24 = var28[0] - var23 * var44;
               var25 = var28[1] - var23 * var46;
               var26 = var28[2] - var23 * var49;
               var27 = (float)Math.sqrt((double)(var24 * var24 + var25 * var25 + var26 * var26));
            }

            var16 = var24 / var27;
            var17 = var25 / var27;
            var18 = var26 / var27;
            var14[3 * (int)var62] = var16;
            var14[3 * (int)var62 + 1] = var17;
            var14[3 * (int)var62 + 2] = var18;
            var15[3 * (int)var62] = var46 * var18 - var49 * var17;
            var15[3 * (int)var62 + 1] = var49 * var16 - var44 * var18;
            var15[3 * (int)var62 + 2] = var44 * var17 - var46 * var16;
         }

         float[] var43 = new float[(int)(var31 >>> 32) + 1];

         for (var37 ^= (4294967296L ^ var37) & -1L << 32; (int)(var37 >>> 32) <= (int)(var31 >>> 32); var37 += 4294967296L) {
            float var47 = endCap[3 * (int)(var37 >>> 32)] - endCap[3 * (int)(var37 >>> 32) - 3];
            float var50 = endCap[3 * (int)(var37 >>> 32) + 1] - endCap[3 * (int)(var37 >>> 32) - 2];
            float var53 = endCap[3 * (int)(var37 >>> 32) + 2] - endCap[3 * (int)(var37 >>> 32) - 1];
            var43[(int)(var37 >>> 32)] = var43[(int)(var37 >>> 32) - 1] + (float)Math.sqrt((double)(var47 * var47 + var50 * var50 + var53 * var53));
         }

         float var45 = var43[(int)(var31 >>> 32)] > 0.0F ? var43[(int)(var31 >>> 32)] : 1.0F;
         float[] var48 = new float[(int)var31 + 1];
         float[] var51 = new float[(int)(var31 >>> 32) + 1];

         for (long var64 = var37 ^ (0L ^ var37) & -1L >>> 32; (int)var64 <= (int)(var31 >>> 32); var64 ^= (var64 ^ var64 + (long)1) & -1L >>> 32) {
            var51[(int)var64] = var43[(int)var64] / var45;
         }

         float[] var54 = new float[3 * ((int)var31 + 1) * ((int)(var31 >>> 32) + 1)];
         var39 ^= (0L ^ var39) & -1L << 32;

         while ((int)(var39 >>> 32) <= (int)var31) {
            var48[(int)(var39 >>> 32)] = (float)((int)(var39 >>> 32)) / (float)((int)var31);
            float var55 = (float) (Math.PI * 2) * (var48[(int)(var39 >>> 32)] - 0.5F);
            float var56 = (float)Math.cos((double)var55);
            float var57 = (float)Math.sin((double)var55);

            for (var39 ^= (0L ^ var39) & -1L >>> 32; (int)var39 <= (int)(var31 >>> 32); var39 ^= (var39 ^ var39 + (long)1) & -1L >>> 32) {
               var41 ^= ((long)(3 * ((int)var39 * ((int)var31 + 1) + (int)(var39 >>> 32))) << 32 ^ var41) & -1L << 32;

               for (var41 ^= (0L ^ var41) & -1L >>> 32; (int)var41 < 3; var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32) {
                  var54[(int)(var41 >>> 32) + (int)var41] = endCap[3 * (int)var39 + (int)var41]
                     + var14[3 * (int)var39 + (int)var41] * rx[(int)var39] * var56
                     + var15[3 * (int)var39 + (int)var41] * upZ[(int)var39] * var57;
               }
            }

            var39 += 4294967296L;
         }

         this.Ilillllill(var54, (int)var31, (int)(var31 >>> 32), var48, var51, true, false, seg);
         if (ry != null) {
            this.IIllllIlll(endCap, var14, var15, var13, upZ, rx, 0, (int)var31, -1.0F, ry);
         }

         if (upX != null) {
            this.IIllllIlll(endCap, var14, var15, var13, upZ, rx, (int)(var31 >>> 32), (int)var31, 1.0F, upX);
         }

         return this;
      } else {
         throw new IllegalArgumentException(llIililIil<"llIililIil","kOO/tb6bL75smiRWQc+BFlOkcYmkhwQY+tcaqC8TsnJIBaPNOw==">());
      }
   }

   private void llIIlilIIl(float[] nz, float[] p, float m, float ny, float uv, iIlIlIliIllIlIli nx) {
      long var8 = 344757178964547505L;

      for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < 4; var10 += 4294967296L) {
         this.IIIIllIIIl(
            nz[(int)(var10 >>> 32) * 3],
            nz[(int)(var10 >>> 32) * 3 + 1],
            nz[(int)(var10 >>> 32) * 3 + 2],
            nx.iIlIlllllill(p[(int)(var10 >>> 32) * 2]),
            nx.IilliliilIIi(p[(int)(var10 >>> 32) * 2 + 1]),
            m,
            ny,
            uv,
            nx.IiliiiIlIi
         );
      }
   }

   private void IIIIllIIIl(float nz, float x, float nx, float z, float u, float y, float v, float color, int ny) {
      float var10 = this.ililiiIIIi.IiIlliIliiIl(nz, x, nx);
      float var11 = this.ililiiIIIi.IIlllIlliIll(nz, x, nx);
      float var12 = this.ililiiIIIi.Illlllllilll(nz, x, nx);
      float var13 = this.liiliiIIIi[0] * y + this.liiliiIIIi[1] * v + this.liiliiIIIi[2] * color;
      float var14 = this.liiliiIIIi[3] * y + this.liiliiIIIi[4] * v + this.liiliiIIIi[5] * color;
      float var15 = this.liiliiIIIi[6] * y + this.liiliiIIIi[7] * v + this.liiliiIIIi[8] * color;
      this.IliliiIIIi.IilIIIilll.IliIlllilIi(var10, var11, var12, z, u, var13, var14, var15, ny);
   }

   private static boolean iilllIIill(float xy, float c, float[] py, int px, int b, int a) {
      long var11 = -2163426481318576087L;
      float var6 = lIilliIill(xy, c, py[2 * px], py[2 * px + 1], py[2 * b], py[2 * b + 1]);
      float var7 = lIilliIill(xy, c, py[2 * b], py[2 * b + 1], py[2 * a], py[2 * a + 1]);
      float var8 = lIilliIill(xy, c, py[2 * a], py[2 * a + 1], py[2 * px], py[2 * px + 1]);
      var11 ^= ((long)(!(var6 < 0.0F) && !(var7 < 0.0F) && !(var8 < 0.0F) ? 0 : 1) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(!(var6 > 0.0F) && !(var7 > 0.0F) && !(var8 > 0.0F) ? 0 : 1) ^ var11) & -1L >>> 32;
      return (int)(var11 >>> 32) == 0 || (int)var11 == 0;
   }

   liIlilIiiiIlilIi IIIillIIil(String id) {
      return this.iIIilIlIil(id, null);
   }

   public IIilllIilIilllIi Ililllililil(float x, float z, float y) {
      this.ililiiIIIi.IilliliilIIi(x, z, y);
      return this;
   }

   private void Ilillllill(float[] us, int nu, int wrapU, float[] m, float[] vs, boolean wrapV, boolean p, iIlIlIliIllIlIli nv) {
      long var33 = -2856485471597513856L;
      long var35 = -1046683525732022167L;
      long var25 = 5910030211026581181L;
      long var27 = -6857277242957034842L;
      long var29 = 6047633457397768516L;
      long var31 = -8892409872978865664L;
      var25 ^= ((long)(nu + 1) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)((int)(var25 >>> 32) * (wrapU + 1)) ^ var25) & -1L >>> 32;
      float[] var11 = new float[3 * (int)var25];
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;

      for (var27 ^= (0L ^ var27) & -1L << 32; (int)(var27 >>> 32) < (int)var25; var27 += 4294967296L) {
         var12 += us[3 * (int)(var27 >>> 32)];
         var13 += us[3 * (int)(var27 >>> 32) + 1];
         var14 += us[3 * (int)(var27 >>> 32) + 2];
      }

      var12 /= (float)((int)var25);
      var13 /= (float)((int)var25);
      var14 /= (float)((int)var25);
      float var15 = 0.0F;

      for (long var43 = var27 ^ (0L ^ var27) & -1L >>> 32; (int)var43 <= wrapU; var43 ^= (var43 ^ var43 + (long)1) & -1L >>> 32) {
         for (var29 ^= (0L ^ var29) & -1L << 32; (int)(var29 >>> 32) <= nu; var29 += 4294967296L) {
            float[] var18 = ilillIiill(us, (int)(var29 >>> 32), (int)var43, nu, wrapU, wrapV);
            if (var18[0] * var18[0] + var18[1] * var18[1] + var18[2] * var18[2] < 1.0E-10F) {
               var29 ^= ((long)((int)var43 < wrapU ? (int)var43 + 1 : (int)var43 - 1) ^ var29) & -1L >>> 32;
               if ((int)var43 > 0 && (int)var43 < wrapU) {
                  var29 ^= ((long)((int)var43 + 1) ^ var29) & -1L >>> 32;
               }

               var18 = ilillIiill(us, (int)(var29 >>> 32), (int)var29, nu, wrapU, wrapV);
            }

            float[] var19 = liilliiill(us, (int)(var29 >>> 32), (int)var43, nu, wrapU, p);
            float var20 = var18[1] * var19[2] - var18[2] * var19[1];
            float var21 = var18[2] * var19[0] - var18[0] * var19[2];
            float var22 = var18[0] * var19[1] - var18[1] * var19[0];
            var31 ^= ((long)(3 * ((int)var43 * (int)(var25 >>> 32) + (int)(var29 >>> 32))) << 32 ^ var31) & -1L << 32;
            var11[(int)(var31 >>> 32)] = var20;
            var11[(int)(var31 >>> 32) + 1] = var21;
            var11[(int)(var31 >>> 32) + 2] = var22;
            float var24 = var20 * (us[(int)(var31 >>> 32)] - var12)
               + var21 * (us[(int)(var31 >>> 32) + 1] - var13)
               + var22 * (us[(int)(var31 >>> 32) + 2] - var14);
            var15 += var24 > 0.0F ? 1.0F : (var24 < 0.0F ? -1.0F : 0.0F);
         }
      }

      float var16 = var15 < 0.0F ? -1.0F : 1.0F;
      this.iIIIlIlIIl();
      int[] var17 = new int[4];

      for (long var44 = var31 ^ (0L ^ var31) & -1L >>> 32; (int)var44 < wrapU; var44 ^= (var44 ^ var44 + (long)1) & -1L >>> 32) {
         for (var29 ^= (0L ^ var29) & -1L >>> 32; (int)var29 < nu; var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
            var17[0] = (int)var44 * (int)(var25 >>> 32) + (int)var29;
            var17[1] = (int)var44 * (int)(var25 >>> 32) + (int)var29 + 1;
            var17[2] = ((int)var44 + 1) * (int)(var25 >>> 32) + (int)var29 + 1;
            var17[3] = ((int)var44 + 1) * (int)(var25 >>> 32) + (int)var29;
            var33 ^= (0L ^ var33) & -1L << 32;

            while ((int)(var33 >>> 32) < 4) {
               var33 ^= ((long)var17[(int)(var33 >>> 32)] ^ var33) & -1L >>> 32;
               long var46 = var35 ^ ((long)(3 * (int)var33) << 32 ^ var35) & -1L << 32;
               var44 ^= ((long)((int)var33 % (int)(var25 >>> 32)) << 32 ^ var44) & -1L << 32;
               var35 = var46 ^ ((long)((int)var33 / (int)(var25 >>> 32)) ^ var46) & -1L >>> 32;
               this.IIIIllIIIl(
                  us[(int)(var35 >>> 32)],
                  us[(int)(var35 >>> 32) + 1],
                  us[(int)(var35 >>> 32) + 2],
                  nv.iIlIlllllill(m[(int)(var44 >>> 32)]),
                  nv.IilliliilIIi(vs[(int)var35]),
                  var11[(int)(var35 >>> 32)] * var16,
                  var11[(int)(var35 >>> 32) + 1] * var16,
                  var11[(int)(var35 >>> 32) + 2] * var16,
                  nv.IiliiiIlIi
               );
               var33 += 4294967296L;
            }
         }
      }
   }

   public IIilllIilIilllIi IIlilIliiIli(float x, float z, float y) {
      this.ililiiIIIi.lIiiIiIlilli(x, z, y);
      return this;
   }

   private static float[] ilillIiill(float[] nv, int i, int p, int j, int wrap, boolean nu) {
      long var11 = 7471465281343127584L;
      long var13 = -4502369177433649313L;
      long var15 = 628548150887507858L;
      var11 ^= ((long)(j + 1) << 32 ^ var11) & -1L << 32;
      if (nu) {
         var11 ^= ((long)(i % j) ^ var11) & -1L >>> 32;
         var13 ^= ((long)(((int)var11 - 1 + j) % j) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)(((int)var11 + 1) % j) ^ var13) & -1L >>> 32;
      } else {
         var13 ^= ((long)Math.max(0, i - 1) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)Math.min(j, i + 1) ^ var13) & -1L >>> 32;
      }

      var11 ^= ((long)(3 * (p * (int)(var11 >>> 32) + (int)(var13 >>> 32))) ^ var11) & -1L >>> 32;
      var15 ^= ((long)(3 * (p * (int)(var11 >>> 32) + (int)var13)) << 32 ^ var15) & -1L << 32;
      return new float[]{
         nv[(int)(var15 >>> 32)] - nv[(int)var11], nv[(int)(var15 >>> 32) + 1] - nv[(int)var11 + 1], nv[(int)(var15 >>> 32) + 2] - nv[(int)var11 + 2]
      };
   }

   public IIilllIilIilllIi IlIillIiilIi(float deg) {
      this.ililiiIIIi.IlIlllIlilIl((float)Math.toRadians((double)deg));
      return this;
   }

   private static float[] liilliiill(float[] wrap, int j, int p, int nv, int nu, boolean i) {
      long var11 = 1361891416778761892L;
      long var13 = 7077598137838364009L;
      long var15 = 808964481136925472L;
      var11 ^= ((long)(nv + 1) << 32 ^ var11) & -1L << 32;
      if (i) {
         var11 ^= ((long)(p % nu) ^ var11) & -1L >>> 32;
         var13 ^= ((long)(((int)var11 - 1 + nu) % nu) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)(((int)var11 + 1) % nu) ^ var13) & -1L >>> 32;
      } else {
         var13 ^= ((long)Math.max(0, p - 1) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)Math.min(nu, p + 1) ^ var13) & -1L >>> 32;
      }

      var11 ^= ((long)(3 * ((int)(var13 >>> 32) * (int)(var11 >>> 32) + j)) ^ var11) & -1L >>> 32;
      var15 ^= ((long)(3 * ((int)var13 * (int)(var11 >>> 32) + j)) << 32 ^ var15) & -1L << 32;
      return new float[]{
         wrap[(int)(var15 >>> 32)] - wrap[(int)var11],
         wrap[(int)(var15 >>> 32) + 1] - wrap[(int)var11 + 1],
         wrap[(int)(var15 >>> 32) + 2] - wrap[(int)var11 + 2]
      };
   }

   public IIilllIilIilllIi Iiilliiliiil(float deg) {
      this.ililiiIIIi.iliIiiliiiii((float)Math.toRadians((double)deg));
      return this;
   }

   public IIilllIilIilllIi IiIiliIiiiIi(float s) {
      this.ililiiIIIi.lIiiIiIlilli(s, s, s);
      return this;
   }

   public IIilllIilIilllIi IiIlliIliiIl(lIillIlliIillIll b) {
      this.IliliiIIIi = b;
      return this;
   }

   public IIilllIilIilllIi IIIilIIiiIIi(float deg) {
      this.ililiiIIIi.IIIllIIliIIl((float)Math.toRadians((double)deg));
      return this;
   }

   public lIillIlliIillIll IlIlllIlilIl(String z, lIillIlliIillIll parent, float name, float x, float y) {
      if (!this.iIiliiIIIi.isEmpty() && parent == null) {
         parent = this.iIiliiIIIi.get(0);
      }

      lIillIlliIillIll var6 = new lIillIlliIillIll(this.iIiliiIIIi.size(), z, parent, name, x, y);
      this.iIiliiIIIi.add(var6);
      return var6;
   }

   public IIilllIilIilllIi lilIliilIl(float[] top, float[] bottom, int y, iIlIlIliIllIlIli seg, iIlIlIliIllIlIli side, iIlIlIliIllIlIli r) {
      return this.IIiIllIiIl(top, bottom, y, 1.0F, 1.0F, seg, side, r);
   }

   private static float lIilliIill(float by, float ay, float bx, float py, float ax, float px) {
      return (by - ax) * (py - px) - (bx - ax) * (ay - px);
   }

   private static int[] Iillllilll(float[] ccw, boolean xy) {
      long var16 = 235128959783669894L;
      long var18 = 1280048124208214443L;
      long var20 = -1739282870519735921L;
      long var22 = 6142926130966691243L;
      long var24 = -8079917882965742950L;
      long var26 = 1033651019821751467L;
      var16 ^= ((long)(ccw.length / 2) << 32 ^ var16) & -1L << 32;
      ArrayList var3 = new ArrayList();

      for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
         var3.add((int)var16);
      }

      int[] var4 = new int[3 * ((int)(var16 >>> 32) - 2)];
      var18 ^= (0L ^ var18) & -1L << 32;
      var18 ^= (0L ^ var18) & -1L >>> 32;

      label68:
      while (var3.size() > 3) {
         int var10000 = (int)var18;
         var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32;
         if (var10000 >= (int)(var16 >>> 32) * (int)(var16 >>> 32)) {
            break;
         }

         var20 ^= (0L ^ var20) & -1L << 32;

         for (var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < var3.size(); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            long var39 = var22 ^ ((long)((Integer)var3.get(((int)var20 + var3.size() - 1) % var3.size())).intValue() << 32 ^ var22) & -1L << 32;
            var22 = var39 ^ ((long)((Integer)var3.get((int)var20)).intValue() ^ var39) & -1L >>> 32;
            var24 ^= ((long)((Integer)var3.get(((int)var20 + 1) % var3.size())).intValue() << 32 ^ var24) & -1L << 32;
            float var12 = (ccw[2 * (int)var22] - ccw[2 * (int)(var22 >>> 32)]) * (ccw[2 * (int)(var24 >>> 32) + 1] - ccw[2 * (int)(var22 >>> 32) + 1])
               - (ccw[2 * (int)var22 + 1] - ccw[2 * (int)(var22 >>> 32) + 1]) * (ccw[2 * (int)(var24 >>> 32)] - ccw[2 * (int)(var22 >>> 32)]);
            if (xy ? !(var12 <= 0.0F) : !(var12 >= 0.0F)) {
               var24 ^= (1L ^ var24) & -1L >>> 32;
               Iterator var14 = var3.iterator();

               while (var14.hasNext()) {
                  var26 ^= ((long)((Integer)var14.next()).intValue() << 32 ^ var26) & -1L << 32;
                  if ((int)(var26 >>> 32) != (int)(var22 >>> 32)
                     && (int)(var26 >>> 32) != (int)var22
                     && (int)(var26 >>> 32) != (int)(var24 >>> 32)
                     && iilllIIill(ccw[2 * (int)(var26 >>> 32)], ccw[2 * (int)(var26 >>> 32) + 1], ccw, (int)(var22 >>> 32), (int)var22, (int)(var24 >>> 32))) {
                     var24 ^= (0L ^ var24) & -1L >>> 32;
                     break;
                  }
               }

               if ((int)var24 != 0) {
                  int var10001 = (int)(var18 >>> 32);
                  var18 += 4294967296L;
                  var4[var10001] = (int)(var22 >>> 32);
                  var10001 = (int)(var18 >>> 32);
                  var18 += 4294967296L;
                  var4[var10001] = (int)var22;
                  var10001 = (int)(var18 >>> 32);
                  var18 += 4294967296L;
                  var4[var10001] = (int)(var24 >>> 32);
                  var3.remove((int)var20);
                  var20 ^= (4294967296L ^ var20) & -1L << 32;
                  if ((int)(var20 >>> 32) == 0) {
                     var20 ^= ((long)((Integer)var3.get(0)).intValue() ^ var20) & -1L >>> 32;
                     long var40 = var22 ^ ((long)((Integer)var3.get(1)).intValue() << 32 ^ var22) & -1L << 32;
                     var22 = var40 ^ ((long)((Integer)var3.get(2)).intValue() ^ var40) & -1L >>> 32;
                     var10001 = (int)(var18 >>> 32);
                     var18 += 4294967296L;
                     var4[var10001] = (int)var20;
                     var10001 = (int)(var18 >>> 32);
                     var18 += 4294967296L;
                     var4[var10001] = (int)(var22 >>> 32);
                     var10001 = (int)(var18 >>> 32);
                     var18 += 4294967296L;
                     var4[var10001] = (int)var22;
                     var3.remove(1);
                  }
                  continue label68;
               }
            }
         }
         break;
      }

      if (var3.size() == 3) {
         int var46 = (int)(var18 >>> 32);
         var18 += 4294967296L;
         var4[var46] = (Integer)var3.get(0);
         var46 = (int)(var18 >>> 32);
         var18 += 4294967296L;
         var4[var46] = (Integer)var3.get(1);
         var46 = (int)(var18 >>> 32);
         var18 += 4294967296L;
         var4[var46] = (Integer)var3.get(2);
      }

      return Arrays.copyOf(var4, (int)(var18 >>> 32));
   }

   public IIilllIilIilllIi IIillIiliIil() {
      this.ililiiIIIi.liiiIIllIl(this.IiiliiIIIi.pop());
      return this;
   }

   public IIilllIilIilllIi IlIllllIll(float cz, float segU, float minor, float m, float major, int cx, int segV, iIlIlIliIllIlIli cy) {
      long var22 = 750632048127048421L;
      long var24 = 2511512801501023480L;
      long var26 = -3596808208320698131L;
      var22 ^= ((long)Math.max(3, Math.round((float)cx * this.IIIiiiIIIi)) << 32 ^ var22) & -1L << 32;
      var22 ^= ((long)Math.max(3, Math.round((float)segV * this.IIIiiiIIIi)) ^ var22) & -1L >>> 32;
      float[] var11 = new float[3 * ((int)(var22 >>> 32) + 1) * ((int)var22 + 1)];
      float[] var12 = new float[(int)(var22 >>> 32) + 1];
      float[] var13 = new float[(int)var22 + 1];

      for (var24 ^= (0L ^ var24) & -1L << 32; (int)(var24 >>> 32) <= (int)var22; var24 += 4294967296L) {
         var13[(int)(var24 >>> 32)] = (float)((int)(var24 >>> 32)) / (float)((int)var22);
      }

      var24 ^= (0L ^ var24) & -1L << 32;

      while ((int)(var24 >>> 32) <= (int)(var22 >>> 32)) {
         var12[(int)(var24 >>> 32)] = (float)((int)(var24 >>> 32)) / (float)((int)(var22 >>> 32));
         float var15 = (float) (Math.PI * 2) * (var12[(int)(var24 >>> 32)] - 0.5F);
         float var16 = (float)Math.sin((double)var15);
         float var17 = (float)Math.cos((double)var15);

         for (var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 <= (int)var22; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            float var19 = (float) (Math.PI * 2) * var13[(int)var24];
            float var20 = m + major * (float)Math.cos((double)var19);
            var26 ^= ((long)(3 * ((int)var24 * ((int)(var22 >>> 32) + 1) + (int)(var24 >>> 32))) << 32 ^ var26) & -1L << 32;
            var11[(int)(var26 >>> 32)] = cz - var20 * var16;
            var11[(int)(var26 >>> 32) + 1] = segU + major * (float)Math.sin((double)var19);
            var11[(int)(var26 >>> 32) + 2] = minor - var20 * var17;
         }

         var24 += 4294967296L;
      }

      this.Ilillllill(var11, (int)(var22 >>> 32), (int)var22, var12, var13, true, true, cy);
      return this;
   }

   public IIilllIilIilllIi iiIIlIIlIl(float z1, float y1, float z0, float m, float x0, float y0, iIlIlIliIllIlIli x1) {
      return this.lIlIliIlIl(z1, y1, z0, m, x0, y0, x1, x1, x1, x1, x1, x1);
   }

   public iIlIlIliIllIlIli Iiiiliiiiiii(iIlIliilIllIliil r) {
      return new iIlIlIliIllIlIli(r, -1, true);
   }

   public IIilllIilIilllIi ilIllIiIll(float[] radius, float[] seg, int path, iIlIlIliIllIlIli caps, boolean m) {
      return this.liIlliiIll(radius, seg, seg, path, caps, m ? caps : null, m ? caps : null, 0.0F, 0.0F, -1.0F);
   }

   public IIilllIilIilllIi iiiIlIIIll(float cz, float rx, float bottom, float cy, float top, float m, int cx, float rz, float seg, iIlIlIliIllIlIli ry) {
      long var26 = -2449874653656965768L;
      long var28 = 7986247012285412865L;
      long var30 = 3427616620733688949L;
      var26 ^= ((long)Math.max(4, Math.round((float)cx * this.IIIiiiIIIi)) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)Math.max(2, Math.round((float)((int)(var26 >>> 32)) * 0.5F * Math.abs(seg - rz))) ^ var26) & -1L >>> 32;
      float var13 = Math.min(rz, seg);
      float var14 = Math.max(rz, seg);
      float[] var15 = new float[(int)var26 + 1];
      float[] var16 = new float[(int)var26 + 1];

      for (var28 ^= (0L ^ var28) & -1L << 32; (int)(var28 >>> 32) <= (int)var26; var28 += 4294967296L) {
         float var18 = var14 + (var13 - var14) * (float)((int)(var28 >>> 32)) / (float)((int)var26);
         float var19 = (float) Math.PI * var18;
         var15[(int)(var28 >>> 32)] = (float)Math.sin((double)var19);
         var16[(int)(var28 >>> 32)] = rx + top * (float)Math.cos((double)var19);
      }

      this.Iilllilliill();
      this.ililiiIIIi.IilliliilIIi(cz, 0.0F, bottom);
      float[] var17 = new float[(int)(var26 >>> 32) + 1];
      float[] var32 = new float[(int)var26 + 1];
      float[] var33 = new float[3 * ((int)(var26 >>> 32) + 1) * ((int)var26 + 1)];

      for (var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 <= (int)var26; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
         var32[(int)var28] = 1.0F - (float)((int)var28) / (float)((int)var26);
      }

      for (long var38 = var28 ^ (0L ^ var28) & -1L >>> 32; (int)var38 <= (int)(var26 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
         var17[(int)var38] = (float)((int)var38) / (float)((int)(var26 >>> 32));
         float var21 = (float) (Math.PI * 2) * (var17[(int)var38] - 0.5F);
         float var22 = (float)Math.sin((double)var21);
         float var23 = (float)Math.cos((double)var21);
         var30 ^= (0L ^ var30) & -1L << 32;

         while ((int)(var30 >>> 32) <= (int)var26) {
            var30 ^= ((long)(3 * ((int)(var30 >>> 32) * ((int)(var26 >>> 32) + 1) + (int)var38)) ^ var30) & -1L >>> 32;
            var33[(int)var30] = -var15[(int)(var30 >>> 32)] * var22 * cy;
            var33[(int)var30 + 1] = var16[(int)(var30 >>> 32)];
            var33[(int)var30 + 2] = -var15[(int)(var30 >>> 32)] * var23 * m;
            var30 += 4294967296L;
         }
      }

      this.Ilillllill(var33, (int)(var26 >>> 32), (int)var26, var17, var32, true, false, ry);
      this.IIillIiliIil();
      return this;
   }

   IIilllIilIilllIi(int detail, int atlasHeight, float atlasWidth) {
      this(detail, atlasHeight, atlasWidth, false);
   }

   public IIilllIilIilllIi lIIlliIIll(float cy, float m, float cz, float cx, int seg, iIlIlIliIllIlIli r) {
      return this.IiiIlliiIl(cy, m, cz, cx, cx, cx, seg, r);
   }

   public iIlIliilIllIliil Illillliilli(int w, int h) {
      return this.lIiliiIIIi.IliIlllilIi(w, h);
   }

   public IIilllIilIilllIi lllllillll(float[] z1, float side, float z0, iIlIlIliIllIlIli xy, iIlIlIliIllIlIli back, iIlIlIliIllIlIli front) {
      long var34 = 1690647986346010322L;
      long var36 = -505565976531682478L;
      long var38 = -226426598783275916L;
      long var40 = -2135676543745020352L;
      var34 ^= ((long)(z1.length / 2) << 32 ^ var34) & -1L << 32;
      if ((int)(var34 >>> 32) < 3) {
         throw new IllegalArgumentException(llIililIil<"llIililIil","F1k+kSzdV+Y8gwkEa0KHTH3PLe6jm9N6o/CvRpdEN6+WW6vUAeVRBe1OdQ==">());
      } else {
         float var8 = 0.0F;
         float var9 = Float.MAX_VALUE;
         float var10 = Float.MAX_VALUE;
         float var11 = -Float.MAX_VALUE;
         float var12 = -Float.MAX_VALUE;
         var34 ^= (0L ^ var34) & -1L >>> 32;
         var36 ^= ((long)((int)(var34 >>> 32) - 1) << 32 ^ var36) & -1L << 32;

         while ((int)var34 < (int)(var34 >>> 32)) {
            var8 += z1[2 * (int)(var36 >>> 32)] * z1[2 * (int)var34 + 1] - z1[2 * (int)var34] * z1[2 * (int)(var36 >>> 32) + 1];
            var9 = Math.min(var9, z1[2 * (int)var34]);
            var11 = Math.max(var11, z1[2 * (int)var34]);
            var10 = Math.min(var10, z1[2 * (int)var34 + 1]);
            var12 = Math.max(var12, z1[2 * (int)var34 + 1]);
            int var10000 = (int)var34;
            var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32;
            var36 ^= ((long)var10000 << 32 ^ var36) & -1L << 32;
         }

         var34 ^= ((long)(var8 > 0.0F ? 1 : 0) ^ var34) & -1L >>> 32;
         float var14 = Math.max(1.0E-4F, var11 - var9);
         float var15 = Math.max(1.0E-4F, var12 - var10);
         int[] var16 = Iillllilll(z1, (boolean)((int)var34));
         this.iIIIlIlIIl();
         float var17 = Math.min(side, z0);
         float var18 = Math.max(side, z0);

         for (long var49 = var36 ^ (0L ^ var36) & -1L >>> 32; (int)var49 < var16.length; var49 ^= (var49 ^ var49 + (long)3) & -1L >>> 32) {
            if (xy != null) {
               var38 ^= (0L ^ var38) & -1L << 32;

               while ((int)(var38 >>> 32) < 4) {
                  var38 ^= ((long)var16[(int)var49 + Math.min((int)(var38 >>> 32), 2)] ^ var38) & -1L >>> 32;
                  float var22 = z1[2 * (int)var38];
                  float var23 = z1[2 * (int)var38 + 1];
                  this.IIIIllIIIl(
                     var22, var23, var17, xy.iIlIlllllill((var11 - var22) / var14), xy.IilliliilIIi((var12 - var23) / var15), 0.0F, 0.0F, -1.0F, xy.IiliiiIlIi
                  );
                  var38 += 4294967296L;
               }
            }

            if (back != null && var18 > var17) {
               var38 ^= (0L ^ var38) & -1L << 32;

               while ((int)(var38 >>> 32) < 4) {
                  var38 ^= ((long)var16[(int)var49 + Math.min((int)(var38 >>> 32), 2)] ^ var38) & -1L >>> 32;
                  float var42 = z1[2 * (int)var38];
                  float var43 = z1[2 * (int)var38 + 1];
                  this.IIIIllIIIl(
                     var42,
                     var43,
                     var18,
                     back.iIlIlllllill((var42 - var9) / var14),
                     back.IilliliilIIi((var12 - var43) / var15),
                     0.0F,
                     0.0F,
                     1.0F,
                     back.IiliiiIlIi
                  );
                  var38 += 4294967296L;
               }
            }
         }

         if (front != null && var18 > var17) {
            float var19 = 0.0F;
            var38 ^= (0L ^ var38) & -1L << 32;

            while ((int)(var38 >>> 32) < (int)(var34 >>> 32)) {
               var38 ^= ((long)(((int)(var38 >>> 32) + 1) % (int)(var34 >>> 32)) ^ var38) & -1L >>> 32;
               var19 += (float)Math.hypot(
                  (double)(z1[2 * (int)var38] - z1[2 * (int)(var38 >>> 32)]), (double)(z1[2 * (int)var38 + 1] - z1[2 * (int)(var38 >>> 32) + 1])
               );
               var38 += 4294967296L;
            }

            float var20 = 0.0F;

            for (long var54 = var38 ^ (0L ^ var38) & -1L >>> 32; (int)var54 < (int)(var34 >>> 32); var54 ^= (var54 ^ var54 + (long)1) & -1L >>> 32) {
               var40 ^= ((long)(((int)var54 + 1) % (int)(var34 >>> 32)) << 32 ^ var40) & -1L << 32;
               float var44 = z1[2 * (int)var54];
               float var24 = z1[2 * (int)var54 + 1];
               float var25 = z1[2 * (int)(var40 >>> 32)];
               float var26 = z1[2 * (int)(var40 >>> 32) + 1];
               float var27 = var25 - var44;
               float var28 = var26 - var24;
               float var29 = (float)Math.hypot((double)var27, (double)var28);
               if (!(var29 < 1.0E-6F)) {
                  float var30 = (int)var34 != 0 ? var28 : -var28;
                  float var31 = (int)var34 != 0 ? -var27 : var27;
                  float var32 = var20 / var19;
                  float var33 = (var20 + var29) / var19;
                  var20 += var29;
                  this.IIIIllIIIl(var44, var24, var17, front.iIlIlllllill(var32), front.IilliliilIIi(0.0F), var30, var31, 0.0F, front.IiliiiIlIi);
                  this.IIIIllIIIl(var25, var26, var17, front.iIlIlllllill(var33), front.IilliliilIIi(0.0F), var30, var31, 0.0F, front.IiliiiIlIi);
                  this.IIIIllIIIl(var25, var26, var18, front.iIlIlllllill(var33), front.IilliliilIIi(1.0F), var30, var31, 0.0F, front.IiliiiIlIi);
                  this.IIIIllIIIl(var44, var24, var18, front.iIlIlllllill(var32), front.IilliliilIIi(1.0F), var30, var31, 0.0F, front.IiliiiIlIi);
               }
            }
         }

         return this;
      }
   }

   public IIilllIilIilllIi IiIIlliIIl(float m, float cz, float az, float bz, float cy, float by, float ay, float bx, float cx, iIlIlIliIllIlIli ax) {
      this.iIIIlIlIIl();
      float var11 = bz - m;
      float var12 = cy - cz;
      float var13 = by - az;
      float var14 = ay - m;
      float var15 = bx - cz;
      float var16 = cx - az;
      float var17 = var12 * var16 - var13 * var15;
      float var18 = var13 * var14 - var11 * var16;
      float var19 = var11 * var15 - var12 * var14;
      this.IIIIllIIIl(m, cz, az, ax.iIlIlllllill(0.0F), ax.IilliliilIIi(0.0F), var17, var18, var19, ax.IiliiiIlIi);
      this.IIIIllIIIl(bz, cy, by, ax.iIlIlllllill(1.0F), ax.IilliliilIIi(0.0F), var17, var18, var19, ax.IiliiiIlIi);
      this.IIIIllIIIl(ay, bx, cx, ax.iIlIlllllill(1.0F), ax.IilliliilIIi(1.0F), var17, var18, var19, ax.IiliiiIlIi);
      this.IIIIllIIIl(ay, bx, cx, ax.iIlIlllllill(1.0F), ax.IilliliilIIi(1.0F), var17, var18, var19, ax.IiliiiIlIi);
      return this;
   }

   public static float IliIlllilIi(float x, float radius) {
      double var2 = Math.asin((double)Math.max(-1.0F, Math.min(1.0F, x / radius)));
      return (float)(0.5 - var2 / (Math.PI * 2));
   }

   public IIilllIilIilllIi IIiIllIiIl(float[] top, float[] r, int y, float sz, float seg, iIlIlIliIllIlIli bottom, iIlIlIliIllIlIli side, iIlIlIliIllIlIli sx) {
      long var23 = 6918749909593773900L;
      long var25 = 7363289897639450766L;
      long var27 = -8452929161192822459L;
      var23 ^= ((long)(top.length - 1) << 32 ^ var23) & -1L << 32;
      if ((int)(var23 >>> 32) >= 1 && r.length == top.length) {
         var23 ^= ((long)Math.max(3, Math.round((float)y * this.IIIiiiIIIi)) ^ var23) & -1L >>> 32;
         float[] var11 = new float[3 * ((int)var23 + 1) * ((int)(var23 >>> 32) + 1)];
         float[] var12 = new float[(int)var23 + 1];
         float[] var13 = new float[(int)(var23 >>> 32) + 1];
         float[] var14 = new float[(int)(var23 >>> 32) + 1];
         float var15 = 0.5F * (sz + seg);

         for (var25 ^= (4294967296L ^ var25) & -1L << 32; (int)(var25 >>> 32) <= (int)(var23 >>> 32); var25 += 4294967296L) {
            float var17 = (top[(int)(var25 >>> 32)] - top[(int)(var25 >>> 32) - 1]) * var15;
            float var18 = r[(int)(var25 >>> 32)] - r[(int)(var25 >>> 32) - 1];
            var14[(int)(var25 >>> 32)] = var14[(int)(var25 >>> 32) - 1] + (float)Math.sqrt((double)(var17 * var17 + var18 * var18));
         }

         float var16 = var14[(int)(var23 >>> 32)] > 0.0F ? var14[(int)(var23 >>> 32)] : 1.0F;

         for (var25 ^= (0L ^ var25) & -1L >>> 32; (int)var25 <= (int)(var23 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            var13[(int)var25] = 1.0F - var14[(int)var25] / var16;
         }

         for (long var34 = var25 ^ (0L ^ var25) & -1L >>> 32; (int)var34 <= (int)var23; var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32) {
            var12[(int)var34] = (float)((int)var34) / (float)((int)var23);
            float var29 = (float) (Math.PI * 2) * (var12[(int)var34] - 0.5F);
            float var19 = (float)Math.sin((double)var29);
            float var20 = (float)Math.cos((double)var29);
            var27 ^= (0L ^ var27) & -1L << 32;

            while ((int)(var27 >>> 32) <= (int)(var23 >>> 32)) {
               var27 ^= ((long)(3 * ((int)(var27 >>> 32) * ((int)var23 + 1) + (int)var34)) ^ var27) & -1L >>> 32;
               var11[(int)var27] = -top[(int)(var27 >>> 32)] * var19 * sz;
               var11[(int)var27 + 1] = r[(int)(var27 >>> 32)];
               var11[(int)var27 + 2] = -top[(int)(var27 >>> 32)] * var20 * seg;
               var27 += 4294967296L;
            }
         }

         this.Ilillllill(var11, (int)var23, (int)(var23 >>> 32), var12, var13, true, false, bottom);
         if (side != null && top[0] > 1.0E-4F) {
            this.iIiIlIliIl(0.0F, r[0], 0.0F, top[0] * sz, top[0] * seg, (int)var23, false, side);
         }

         if (sx != null && top[(int)(var23 >>> 32)] > 1.0E-4F) {
            this.iIiIlIliIl(0.0F, r[(int)(var23 >>> 32)], 0.0F, top[(int)(var23 >>> 32)] * sz, top[(int)(var23 >>> 32)] * seg, (int)var23, true, sx);
         }

         return this;
      } else {
         throw new IllegalArgumentException(llIililIil<"llIililIil","KgHewkTtt5eFVjhxU899oj7JQuStH4bz76PlTv1EX+46XneZJaJo7AA=">());
      }
   }

   public static float iliIiiliiiii(float x, float radius) {
      return (float)(-Math.toDegrees(Math.asin((double)Math.max(-1.0F, Math.min(1.0F, x / radius)))));
   }

   public IIilllIilIilllIi illIlIilIl(
      float z0, float x0, float y1, float y0, float seg, float radius, float faces, int x1, iIlIlIliIllIlIli[] z1, iIlIlIliIllIlIli edge
   ) {
      long var49 = 7077954713543260999L;
      long var43 = -5334861586495608568L;
      long var45 = -7514818200966998852L;
      long var47 = -1351813069168391785L;
      float var11 = Math.min(z0, y0);
      float var12 = Math.max(z0, y0);
      float var13 = Math.min(x0, seg);
      float var14 = Math.max(x0, seg);
      float var15 = Math.min(y1, radius);
      float var16 = Math.max(y1, radius);
      float var17 = Math.max(0.0F, Math.min(faces, 0.5F * Math.min(var12 - var11, Math.min(var14 - var13, var16 - var15)) - 0.001F));
      x1 = Math.max(1, Math.round((float)x1 * this.IIIiiiIIIi));
      float var18 = var11 + var17;
      float var19 = var12 - var17;
      float var20 = var13 + var17;
      float var21 = var14 - var17;
      float var22 = var15 + var17;
      float var23 = var16 - var17;
      this.iIIIlIlIIl();
      float[] var24 = new float[]{0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 1.0F};
      if (z1[0] != null) {
         this.llIIlilIIl(new float[]{var19, var21, var15, var18, var21, var15, var18, var20, var15, var19, var20, var15}, var24, 0.0F, 0.0F, -1.0F, z1[0]);
      }

      if (z1[1] != null) {
         this.llIIlilIIl(new float[]{var18, var21, var16, var19, var21, var16, var19, var20, var16, var18, var20, var16}, var24, 0.0F, 0.0F, 1.0F, z1[1]);
      }

      if (z1[2] != null) {
         this.llIIlilIIl(new float[]{var12, var21, var23, var12, var21, var22, var12, var20, var22, var12, var20, var23}, var24, 1.0F, 0.0F, 0.0F, z1[2]);
      }

      if (z1[3] != null) {
         this.llIIlilIIl(new float[]{var11, var21, var22, var11, var21, var23, var11, var20, var23, var11, var20, var22}, var24, -1.0F, 0.0F, 0.0F, z1[3]);
      }

      if (z1[4] != null) {
         this.llIIlilIIl(new float[]{var18, var14, var22, var19, var14, var22, var19, var14, var23, var18, var14, var23}, var24, 0.0F, 1.0F, 0.0F, z1[4]);
      }

      if (z1[5] != null) {
         this.llIIlilIIl(new float[]{var19, var13, var22, var18, var13, var22, var18, var13, var23, var19, var13, var23}, var24, 0.0F, -1.0F, 0.0F, z1[5]);
      }

      if (!(var17 <= 0.0F) && edge != null) {
         float var25 = edge.iIlIlllllill(0.5F);
         float var26 = edge.IilliliilIIi(0.5F);
         var43 ^= ((long)edge.IiliiiIlIi << 32 ^ var43) & -1L << 32;

         for (var43 ^= ~var43 & -1L >>> 32; (int)var43 <= 1; var43 ^= (var43 ^ var43 + (long)2) & -1L >>> 32) {
            var45 ^= (-4294967296L ^ var45) & -1L << 32;

            while ((int)(var45 >>> 32) <= 1) {
               float var30 = (int)var43 < 0 ? var20 : var21;
               float var31 = (int)(var45 >>> 32) < 0 ? var22 : var23;

               for (var45 ^= (0L ^ var45) & -1L >>> 32; (int)var45 < x1; var45 ^= (var45 ^ var45 + (long)1) & -1L >>> 32) {
                  float var33 = (float) (Math.PI / 2) * (float)((int)var45) / (float)x1;
                  float var34 = (float) (Math.PI / 2) * (float)((int)var45 + 1) / (float)x1;
                  float var35 = (float)((int)var43) * (float)Math.cos((double)var33);
                  float var36 = (float)((int)(var45 >>> 32)) * (float)Math.sin((double)var33);
                  float var37 = (float)((int)var43) * (float)Math.cos((double)var34);
                  float var38 = (float)((int)(var45 >>> 32)) * (float)Math.sin((double)var34);
                  this.IIIIllIIIl(var18, var30 + var17 * var35, var31 + var17 * var36, var25, var26, 0.0F, var35, var36, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var19, var30 + var17 * var35, var31 + var17 * var36, var25, var26, 0.0F, var35, var36, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var19, var30 + var17 * var37, var31 + var17 * var38, var25, var26, 0.0F, var37, var38, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var18, var30 + var17 * var37, var31 + var17 * var38, var25, var26, 0.0F, var37, var38, (int)(var43 >>> 32));
               }

               var45 += 8589934592L;
            }
         }

         for (var43 ^= ~var43 & -1L >>> 32; (int)var43 <= 1; var43 ^= (var43 ^ var43 + (long)2) & -1L >>> 32) {
            var45 ^= (-4294967296L ^ var45) & -1L << 32;

            while ((int)(var45 >>> 32) <= 1) {
               float var52 = (int)var43 < 0 ? var18 : var19;
               float var54 = (int)(var45 >>> 32) < 0 ? var22 : var23;

               for (var45 ^= (0L ^ var45) & -1L >>> 32; (int)var45 < x1; var45 ^= (var45 ^ var45 + (long)1) & -1L >>> 32) {
                  float var57 = (float) (Math.PI / 2) * (float)((int)var45) / (float)x1;
                  float var60 = (float) (Math.PI / 2) * (float)((int)var45 + 1) / (float)x1;
                  float var62 = (float)((int)var43) * (float)Math.cos((double)var57);
                  float var64 = (float)((int)(var45 >>> 32)) * (float)Math.sin((double)var57);
                  float var67 = (float)((int)var43) * (float)Math.cos((double)var60);
                  float var70 = (float)((int)(var45 >>> 32)) * (float)Math.sin((double)var60);
                  this.IIIIllIIIl(var52 + var17 * var62, var20, var54 + var17 * var64, var25, var26, var62, 0.0F, var64, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var52 + var17 * var62, var21, var54 + var17 * var64, var25, var26, var62, 0.0F, var64, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var52 + var17 * var67, var21, var54 + var17 * var70, var25, var26, var67, 0.0F, var70, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var52 + var17 * var67, var20, var54 + var17 * var70, var25, var26, var67, 0.0F, var70, (int)(var43 >>> 32));
               }

               var45 += 8589934592L;
            }
         }

         for (var43 ^= ~var43 & -1L >>> 32; (int)var43 <= 1; var43 ^= (var43 ^ var43 + (long)2) & -1L >>> 32) {
            var45 ^= (-4294967296L ^ var45) & -1L << 32;

            while ((int)(var45 >>> 32) <= 1) {
               float var53 = (int)var43 < 0 ? var18 : var19;
               float var55 = (int)(var45 >>> 32) < 0 ? var20 : var21;

               for (var45 ^= (0L ^ var45) & -1L >>> 32; (int)var45 < x1; var45 ^= (var45 ^ var45 + (long)1) & -1L >>> 32) {
                  float var58 = (float) (Math.PI / 2) * (float)((int)var45) / (float)x1;
                  float var61 = (float) (Math.PI / 2) * (float)((int)var45 + 1) / (float)x1;
                  float var63 = (float)((int)var43) * (float)Math.cos((double)var58);
                  float var65 = (float)((int)(var45 >>> 32)) * (float)Math.sin((double)var58);
                  float var68 = (float)((int)var43) * (float)Math.cos((double)var61);
                  float var71 = (float)((int)(var45 >>> 32)) * (float)Math.sin((double)var61);
                  this.IIIIllIIIl(var53 + var17 * var63, var55 + var17 * var65, var22, var25, var26, var63, var65, 0.0F, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var53 + var17 * var63, var55 + var17 * var65, var23, var25, var26, var63, var65, 0.0F, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var53 + var17 * var68, var55 + var17 * var71, var23, var25, var26, var68, var71, 0.0F, (int)(var43 >>> 32));
                  this.IIIIllIIIl(var53 + var17 * var68, var55 + var17 * var71, var22, var25, var26, var68, var71, 0.0F, (int)(var43 >>> 32));
               }

               var45 += 8589934592L;
            }
         }

         for (long var76 = var43 ^ ~var43 & -1L >>> 32; (int)var76 <= 1; var76 ^= (var76 ^ var76 + (long)2) & -1L >>> 32) {
            for (var45 ^= (-4294967296L ^ var45) & -1L << 32; (int)(var45 >>> 32) <= 1; var45 += 8589934592L) {
               var47 ^= (-4294967296L ^ var47) & -1L << 32;

               while ((int)(var47 >>> 32) <= 1) {
                  float var56 = (int)var76 < 0 ? var18 : var19;
                  float var32 = (int)(var45 >>> 32) < 0 ? var20 : var21;
                  float var59 = (int)(var47 >>> 32) < 0 ? var22 : var23;

                  for (var47 ^= (0L ^ var47) & -1L >>> 32; (int)var47 < x1; var47 ^= (var47 ^ var47 + (long)1) & -1L >>> 32) {
                     var49 ^= (0L ^ var49) & -1L << 32;

                     while ((int)(var49 >>> 32) < x1) {
                        float[] var66 = new float[]{
                           (float) (Math.PI / 2) * (float)((int)var47) / (float)x1,
                           (float) (Math.PI / 2) * (float)((int)var47 + 1) / (float)x1,
                           (float) (Math.PI / 2) * (float)((int)var47 + 1) / (float)x1,
                           (float) (Math.PI / 2) * (float)((int)var47) / (float)x1
                        };
                        float[] var69 = new float[]{
                           (float) (Math.PI / 2) * (float)((int)(var49 >>> 32)) / (float)x1,
                           (float) (Math.PI / 2) * (float)((int)(var49 >>> 32)) / (float)x1,
                           (float) (Math.PI / 2) * (float)((int)(var49 >>> 32) + 1) / (float)x1,
                           (float) (Math.PI / 2) * (float)((int)(var49 >>> 32) + 1) / (float)x1
                        };

                        for (var49 ^= (0L ^ var49) & -1L >>> 32; (int)var49 < 4; var49 ^= (var49 ^ var49 + (long)1) & -1L >>> 32) {
                           float var39 = (float)Math.sin((double)var69[(int)var49]);
                           float var40 = (float)((int)var76) * var39 * (float)Math.cos((double)var66[(int)var49]);
                           float var41 = (float)((int)(var45 >>> 32)) * (float)Math.cos((double)var69[(int)var49]);
                           float var42 = (float)((int)(var47 >>> 32)) * var39 * (float)Math.sin((double)var66[(int)var49]);
                           this.IIIIllIIIl(
                              var56 + var17 * var40, var32 + var17 * var41, var59 + var17 * var42, var25, var26, var40, var41, var42, (int)(var76 >>> 32)
                           );
                        }

                        var49 += 4294967296L;
                     }
                  }

                  var47 += 8589934592L;
               }
            }
         }

         return this;
      } else {
         return this;
      }
   }

   public IIilllIilIilllIi IllIllllIl(float y0, float m, float radius, float x1, float seg, float y1, float x0, int z1, iIlIlIliIllIlIli z0) {
      return this.illIlIilIl(y0, m, radius, x1, seg, y1, x0, z1, new iIlIlIliIllIlIli[]{z0, z0, z0, z0, z0, z0}, z0);
   }

   public IIilllIilIilllIi IiiIlliiIl(float cz, float rz, float ry, float rx, float cy, float m, int cx, iIlIlIliIllIlIli seg) {
      return this.iiiIlIIIll(cz, rz, ry, rx, cy, m, cx, 0.0F, 1.0F, seg);
   }

   public static int lIiiIiIlilli(float[] path) {
      return path.length / 3;
   }

   private void iIiIlIliIl(float m, float cx, float rz, float nu, float cz, int up, boolean cy, iIlIlIliIllIlIli rx) {
      long var17 = 6629177186568290306L;
      this.iIIIlIlIIl();
      float var9 = cy ? 1.0F : -1.0F;

      for (long var19 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var19 >>> 32) < up; var19 += 4294967296L) {
         float var11 = (float) (Math.PI * 2) * (float)((int)(var19 >>> 32)) / (float)up;
         float var12 = (float) (Math.PI * 2) * (float)((int)(var19 >>> 32) + 1) / (float)up;
         float var13 = (float)Math.sin((double)var11);
         float var14 = (float)Math.cos((double)var11);
         float var15 = (float)Math.sin((double)var12);
         float var16 = (float)Math.cos((double)var12);
         this.IIIIllIIIl(m, cx, rz, rx.iIlIlllllill(0.5F), rx.IilliliilIIi(0.5F), 0.0F, var9, 0.0F, rx.IiliiiIlIi);
         this.IIIIllIIIl(
            m + var13 * nu, cx, rz + var14 * cz, rx.iIlIlllllill(0.5F + 0.5F * var13), rx.IilliliilIIi(0.5F + 0.5F * var14), 0.0F, var9, 0.0F, rx.IiliiiIlIi
         );
         this.IIIIllIIIl(
            m + var15 * nu, cx, rz + var16 * cz, rx.iIlIlllllill(0.5F + 0.5F * var15), rx.IilliliilIIi(0.5F + 0.5F * var16), 0.0F, var9, 0.0F, rx.IiliiiIlIi
         );
         this.IIIIllIIIl(
            m + var15 * nu, cx, rz + var16 * cz, rx.iIlIlllllill(0.5F + 0.5F * var15), rx.IilliliilIIi(0.5F + 0.5F * var16), 0.0F, var9, 0.0F, rx.IiliiiIlIi
         );
      }
   }

   public static float liiiIIllIl(float degreesTowardItsRight) {
      float var1 = 0.5F - degreesTowardItsRight / 360.0F;
      return var1 - (float)Math.floor((double)var1);
   }

   public iIlIlIliIllIlIli Iilililiiili(int rgb) {
      return new iIlIlIliIllIlIli(this.lIiliiIIIi.IliiilIIllliiilIIl, iiiIIIliIIIlIIli.IliIlllilIi(rgb), true);
   }

   public lIillIlliIillIll IIlllIlliIll() {
      return this.IliliiIIIi;
   }

   public IIilllIilIilllIi iIlllIllll(float cz, float rx, float seg, float cy, float cx, int m, iIlIlIliIllIlIli ry) {
      long var16 = -3155889088467188659L;
      this.iIIIlIlIIl();
      var16 ^= ((long)Math.max(3, Math.round((float)m * this.IIIiiiIIIi)) << 32 ^ var16) & -1L << 32;

      for (long var19 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var19 < (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         float var10 = (float) (Math.PI * 2) * (float)((int)var19) / (float)((int)(var19 >>> 32));
         float var11 = (float) (Math.PI * 2) * (float)((int)var19 + 1) / (float)((int)(var19 >>> 32));
         float var12 = (float)Math.cos((double)var10);
         float var13 = (float)Math.sin((double)var10);
         float var14 = (float)Math.cos((double)var11);
         float var15 = (float)Math.sin((double)var11);
         this.IIIIllIIIl(cz, rx, seg, ry.iIlIlllllill(0.5F), ry.IilliliilIIi(0.5F), 0.0F, 0.0F, -1.0F, ry.IiliiiIlIi);
         this.IIIIllIIIl(
            cz + var12 * cy, rx + var13 * cx, seg, ry.iIlIlllllill(0.5F - 0.5F * var12), ry.IilliliilIIi(0.5F - 0.5F * var13), 0.0F, 0.0F, -1.0F, ry.IiliiiIlIi
         );
         this.IIIIllIIIl(
            cz + var14 * cy, rx + var15 * cx, seg, ry.iIlIlllllill(0.5F - 0.5F * var14), ry.IilliliilIIi(0.5F - 0.5F * var15), 0.0F, 0.0F, -1.0F, ry.IiliiiIlIi
         );
         this.IIIIllIIIl(
            cz + var14 * cy, rx + var15 * cx, seg, ry.iIlIlllllill(0.5F - 0.5F * var14), ry.IilliliilIIi(0.5F - 0.5F * var15), 0.0F, 0.0F, -1.0F, ry.IiliiiIlIi
         );
      }

      return this;
   }

   public IIilllIilIilllIi Iilllilliill() {
      this.IiiliiIIIi.push(new iIIiiiilIlIiiiil().liiiIIllIl(this.ililiiIIIi));
      return this;
   }

   public iIlIlIliIllIlIli Iliilliiilii(iIlIliilIllIliil r, int tintRgb) {
      return new iIlIlIliIllIlIli(r, iiiIIIliIIIlIIli.IliIlllilIi(tintRgb), false);
   }

   private void IIllllIlll(float[] path, float[] rx, float[] nu, float[] ry, float[] b, float[] k, int dir, int t, float m, iIlIlIliIllIlIli n) {
      long var30 = 1170866141053534183L;
      if (!(b[dir] < 1.0E-4F) || !(k[dir] < 1.0E-4F)) {
         this.iIIIlIlIIl();
         float var11 = path[3 * dir];
         float var12 = path[3 * dir + 1];
         float var13 = path[3 * dir + 2];
         float var14 = ry[3 * dir] * m;
         float var15 = ry[3 * dir + 1] * m;
         float var16 = ry[3 * dir + 2] * m;

         for (long var32 = var30 ^ (0L ^ var30) & -1L << 32; (int)(var32 >>> 32) < t; var32 += 4294967296L) {
            float var18 = (float) (Math.PI * 2) * (float)((int)(var32 >>> 32)) / (float)t;
            float var19 = (float) (Math.PI * 2) * (float)((int)(var32 >>> 32) + 1) / (float)t;
            float var20 = (float)Math.cos((double)var18);
            float var21 = (float)Math.sin((double)var18);
            float var22 = (float)Math.cos((double)var19);
            float var23 = (float)Math.sin((double)var19);
            float var24 = var11 + rx[3 * dir] * k[dir] * var20 + nu[3 * dir] * b[dir] * var21;
            float var25 = var12 + rx[3 * dir + 1] * k[dir] * var20 + nu[3 * dir + 1] * b[dir] * var21;
            float var26 = var13 + rx[3 * dir + 2] * k[dir] * var20 + nu[3 * dir + 2] * b[dir] * var21;
            float var27 = var11 + rx[3 * dir] * k[dir] * var22 + nu[3 * dir] * b[dir] * var23;
            float var28 = var12 + rx[3 * dir + 1] * k[dir] * var22 + nu[3 * dir + 1] * b[dir] * var23;
            float var29 = var13 + rx[3 * dir + 2] * k[dir] * var22 + nu[3 * dir + 2] * b[dir] * var23;
            this.IIIIllIIIl(var11, var12, var13, n.iIlIlllllill(0.5F), n.IilliliilIIi(0.5F), var14, var15, var16, n.IiliiiIlIi);
            this.IIIIllIIIl(var24, var25, var26, n.iIlIlllllill(0.5F + 0.5F * var21), n.IilliliilIIi(0.5F - 0.5F * var20), var14, var15, var16, n.IiliiiIlIi);
            this.IIIIllIIIl(var27, var28, var29, n.iIlIlllllill(0.5F + 0.5F * var23), n.IilliliilIIi(0.5F - 0.5F * var22), var14, var15, var16, n.IiliiiIlIi);
            this.IIIIllIIIl(var27, var28, var29, n.iIlIlllllill(0.5F + 0.5F * var23), n.IilliliilIIi(0.5F - 0.5F * var22), var14, var15, var16, n.IiliiiIlIi);
         }
      }
   }

   public lIillIlliIillIll IIIllIIliIIl() {
      return this.iIiliiIIIi.get(0);
   }

   public IIilllIilIilllIi lliIliliIl(float r1, float y1, float r0, float seg, int side, iIlIlIliIllIlIli y0, iIlIlIliIllIlIli caps) {
      return this.lilIliilIl(new float[]{r1, y1}, new float[]{r0, seg}, side, y0, caps, caps);
   }

   public static float[] IilliliilIIi(int keys, float... count) {
      long var7 = 5910256482640954167L;
      float[] var2 = new float[keys];
      if (count.length != 1 && keys != 1) {
         var7 ^= (0L ^ var7) & -1L << 32;

         while ((int)(var7 >>> 32) < keys) {
            float var4 = (float)((int)(var7 >>> 32)) / (float)(keys - 1) * (float)(count.length - 1);
            var7 ^= ((long)Math.min(count.length - 2, (int)Math.floor((double)var4)) ^ var7) & -1L >>> 32;
            float var6 = var4 - (float)((int)var7);
            var6 = var6 * var6 * (3.0F - 2.0F * var6);
            var2[(int)(var7 >>> 32)] = count[(int)var7] + (count[(int)var7 + 1] - count[(int)var7]) * var6;
            var7 += 4294967296L;
         }

         return var2;
      } else {
         Arrays.fill(var2, count[0]);
         return var2;
      }
   }
}
