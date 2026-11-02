package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class iiiilIiIIIIiIi {
   private static final float iIiIllliiIliIlllii = 0.3F;
   private static final float iiiIllliiIIIllllii = 1.0E20F;
   private static final int[] IIiIllliilIiIlllii = new int[]{1024, 1280, 1536, 1792, 2048};
   private static final Map<illIIlllIilIIlll, IllIIiillllIIiil> IlIlllliillIllllii = new ConcurrentHashMap<>();
   public static final int lIlIllliiiIlIlllii = 8;
   private static final float[] iIllllliiIllllllii = new float[256];
   static final int ilIlllliiIiIllllii = -2171170;
   static final int lilIllliiiilIlllii = 2;
   static final float liIlllliiiiIllllii = 0.85F;
   private static final float lliIllliiiliIlllii = 0.02F;
   private static final int lIIlllliiiIIllllii = 20;
   private static final float IiiIllliiliiIlllii = 0.35F;
   public static final int IllIllliilllIlllii = 4;
   public static final float iiIIllliiIIlIlllii = 64.0F;
   static final float IIllllliilIlllllii = 0.85F;
   public static final int illIllliiIilIlllii = 2048;

   private static boolean iliIiiliiiii(IllIIiillllIIiil g, lIIllIiiIIllIi f) {
      for (int var2 = 0; var2 < 8; var2++) {
         if (g.ilIIlillil[var2] && f.iliIllIiiIiiIllIii[var2] != 2) {
            return true;
         }
      }

      return false;
   }

   private iiiilIiIIIIiIi() {
   }

   private static void IIlilIliiIli(float[] max, float[] r, int in, boolean out) {
      int var4 = max.length;

      for (int var5 = 0; var5 < var4; var5++) {
         float var6 = max[var5];
         int var7 = Math.max(0, var5 - in);

         for (int var8 = Math.min(var4 - 1, var5 + in); var7 <= var8; var7++) {
            var6 = out ? Math.max(var6, max[var7]) : Math.min(var6, max[var7]);
         }

         r[var5] = var6;
      }
   }

   static void IiIiliIiiiIi(boolean[] ph, int union, int r, int lo, float[] hi, float[] pw) {
      int var6 = -1;

      for (int var7 = 0; var7 < r; var7++) {
         hi[var7] = -1.0F;
         pw[var7] = -1.0F;

         for (int var8 = 0; var8 < union; var8++) {
            if (ph[var7 * union + var8]) {
               if (hi[var7] < 0.0F) {
                  hi[var7] = (float)var8;
               }

               pw[var7] = (float)(var8 + 1);
            }
         }

         if (hi[var7] >= 0.0F) {
            var6 = var7;
         } else if (var6 >= 0) {
            hi[var7] = hi[var6];
            pw[var7] = pw[var6];
         }
      }

      if (var6 >= 0) {
         var6 = -1;

         for (int var10 = r - 1; var10 >= 0; var10--) {
            if (hi[var10] >= 0.0F) {
               if (var6 < 0) {
                  var6 = var10;
               }
            } else if (var6 >= 0) {
               hi[var10] = hi[var6];
               pw[var10] = pw[var6];
            }
         }

         float[] var11 = new float[r];
         IIlilIliiIli(hi, var11, lo, true);
         IIlilIliiIli(var11, hi, lo, false);
         IIlilIliiIli(hi, var11, lo, false);
         IIlilIliiIli(var11, hi, lo, true);
         IIlilIliiIli(pw, var11, lo, false);
         IIlilIliiIli(var11, pw, lo, true);
         IIlilIliiIli(pw, var11, lo, true);
         IIlilIliiIli(var11, pw, lo, false);
         int var12 = Math.max(1, lo / 4);
         Illillliilli(hi, var11, var12);
         Illillliilli(pw, var11, var12);
      }
   }

   static boolean Illlllllilll(IllIIiillllIIiil g, lIIllIiiIIllIi P, float f) {
      if (P.IiIlllIiiliIlllIii.length == 0) {
         return true;
      } else {
         int[][] var3 = IIIllIIliIIl(g, P.IiIlllIiiliIlllIii, f, 0);
         int[][] var4 = IilliliilIIi(
            var3, (-(-598939657 >>> 29 | -598939657 << 3) + -41 << 21 | -(-598939657 >>> 29 | -598939657 << 3) + -41 >>> 11) ^ 52673304
         );
         return var4 != null
            && lIiiIiIlilli(Math.max(1409282216 * -1601513229 * -75 ^ 319625168, var4[var3.length][1]))
               <= (((1618056195 - -1 >>> 21 | 1618056195 - -1 << 11) << 9 | (1618056195 - -1 >>> 21 | 1618056195 - -1 << 11) >>> 23) ^ 1078333209);
      }
   }

   private static void Illillliilli(float[] a, float[] tmp, int r) {
      int var3 = a.length;
      System.arraycopy(a, 0, tmp, 0, var3);

      for (int var4 = 0; var4 < var3; var4++) {
         float var5 = 0.0F;
         int var6 = 0;
         int var7 = Math.max(0, var4 - r);

         for (int var8 = Math.min(var3 - 1, var4 + r); var7 <= var8; var7++) {
            var5 += tmp[var7];
            var6++;
         }

         a[var4] = var5 / (float)var6;
      }
   }

   static iIiiliIiIliiliIi lliIliliIl(IllIIiillllIIiil f, lIIllIiiIIllIi l, liiilIIliiiilIIl part, int g) {
      lIillIiiIillIi var4 = f.lIIIlillil[g];
      int var5 = var4.iIlIlllllill();
      float[] var6 = new float[var5 * 8];
      int[] var7 = new int[var5 * 4];
      int var8 = 0;

      for (int var9 = 0; var9 < var5; var9++) {
         if (l.iIIlllIiiIlIlllIii[f.iIIIlillil[g][var9] & 0xFF] >= 0) {
            var8++;
         }
      }

      int[] var30 = new int[var8];
      float[] var10 = new float[var8 * 8];
      int var11 = 0;
      boolean var12 = f.IIIIlillil.lIiiIiIlilli();

      for (int var13 = 0; var13 < var5; var13++) {
         int var14 = f.iIIIlillil[g][var13];
         int var15 = var14 & 0xFF;
         boolean var16 = (var14 & 256) != 0;
         byte var17 = l.iliIllIiiIiiIllIii[var15];
         int var18 = l.IIIlllIiilIIlllIii[var15];
         int var19 = l.iIIlllIiiIlIlllIii[var15];
         float var20 = 0.0F;
         float var21 = 0.0F;
         if (var12) {
            for (int var22 = 0; var22 < 4; var22++) {
               var20 += var4.lliIliIiiiliIliIii[var4.lIIlliIiiiIIlliIii[var13 * 4 + var22] * 2];
               var21 += var4.lliIliIiiiliIliIii[var4.lIIlliIiiiIIlliIii[var13 * 4 + var22] * 2 + 1];
            }

            var20 /= 4.0F;
            var21 /= 4.0F;
         }

         for (int var31 = 0; var31 < 4; var31++) {
            int var23 = var4.lIIlliIiiiIIlliIii[var13 * 4 + var31];
            int var24 = (var13 * 4 + var31) * 2;
            float var25 = var4.IIiIliIiilIiIliIii[var23 * 3];
            float var26 = var4.IIiIliIiilIiIliIii[var23 * 3 + 1];
            if (var17 == 2 && var18 >= 0) {
               var6[var24] = ((float)(part.iIIlIIilIl[var18][0] + 8) + (var25 - part.llIlIIilIl[var18][0]) * part.liiIIIilIl) / (float)part.IliIIIilIl;
               var6[var24 + 1] = ((float)(part.iIIlIIilIl[var18][1] + 8) + (part.llIlIIilIl[var18][3] - var26) * part.liiIIIilIl) / (float)part.lliIIIilIl;
               var7[var13 * 4 + var31] = var16 ? -5987164 : -1;
            } else {
               int var27 = Math.max(1, part.iiiIIIilIl);
               float[] var28 = IiiIlliiIl(var12, var17, var4.lliIliIiiiliIliIii[var23 * 2], var4.lliIliIiiiliIliIii[var23 * 2 + 1], var20, var21, var27);
               var6[var24] = ((float)(part.IIIlIIilIl + 8) + var28[0] * 256.0F * (float)var27) / (float)part.IliIIIilIl;
               var6[var24 + 1] = ((float)(part.lIIlIIilIl + 8) + var28[1] * 256.0F * (float)var27) / (float)part.lliIIIilIl;
               int var29 = var17 == 1 ? l.liiIllIiiiiiIllIii[var15] : (var12 ? -1 : var4.IiiIliIiiliiIliIii[var23]);
               var7[var13 * 4 + var31] = var16 && var17 == 1 ? lIIlliIIll(var29, -5987164) : var29;
            }

            if (var19 >= 0) {
               int var32 = (var11 * 4 + var31) * 2;
               var10[var32] = ((float)(part.IlIlIIilIl[var19][0] + 8) + (var25 - part.ilIlIIilIl[var19][0]) * part.liiIIIilIl) / (float)part.iliIIIilIl;
               var10[var32 + 1] = ((float)(part.IlIlIIilIl[var19][1] + 8) + (part.ilIlIIilIl[var19][3] - var26) * part.liiIIIilIl) / (float)part.IiiIIIilIl;
            }
         }

         if (var19 >= 0) {
            var30[var11++] = var13;
         }
      }

      return new iIiiliIiIliiliIi(var6, var7, var30, var10);
   }

   private static boolean[] iIIIlIlIIl(boolean[] h, int cov, int w) {
      boolean[] var3 = new boolean[cov * w];
      int[] var4 = new int[cov * w];
      int var5 = 0;

      for (int var6 = 0; var6 < cov; var6++) {
         var5 = llIIlilIIl(h, var3, var4, var5, var6);
         var5 = llIIlilIIl(h, var3, var4, var5, (w - 1) * cov + var6);
      }

      for (int var11 = 0; var11 < w; var11++) {
         var5 = llIIlilIIl(h, var3, var4, var5, var11 * cov);
         var5 = llIIlilIIl(h, var3, var4, var5, var11 * cov + cov - 1);
      }

      while (var5 > 0) {
         int var12 = var4[--var5];
         int var7 = var12 % cov;
         int var8 = var12 / cov;
         if (var7 > 0) {
            var5 = llIIlilIIl(h, var3, var4, var5, var12 - 1);
         }

         if (var7 < cov - 1) {
            var5 = llIIlilIIl(h, var3, var4, var5, var12 + 1);
         }

         if (var8 > 0) {
            var5 = llIIlilIIl(h, var3, var4, var5, var12 - cov);
         }

         if (var8 < w - 1) {
            var5 = llIIlilIIl(h, var3, var4, var5, var12 + cov);
         }
      }

      return var3;
   }

   private static void iiIIlIIlIl(float[] f, int z, float[] d, int[] n, float[] v) {
      int var5 = 0;
      n[0] = 0;
      v[0] = -1.0E20F;
      v[1] = 1.0E20F;

      for (int var6 = 1; var6 < z; var6++) {
         while (true) {
            int var8 = n[var5];
            float var7 = (f[var6] + (float)var6 * (float)var6 - (f[var8] + (float)var8 * (float)var8)) / (2.0F * (float)(var6 - var8));
            if (!(var7 <= v[var5]) || var5 <= 0) {
               if (var7 <= v[var5]) {
                  n[0] = var6;
                  v[0] = -1.0E20F;
                  v[1] = 1.0E20F;
                  var5 = 0;
               } else {
                  var5++;
                  n[var5] = var6;
                  v[var5] = var7;
                  v[var5 + 1] = 1.0E20F;
               }
               break;
            }

            var5--;
         }
      }

      var5 = 0;

      for (int var10 = 0; var10 < z; var10++) {
         while (v[var5 + 1] < (float)var10) {
            var5++;
         }

         float var11 = (float)(var10 - n[var5]);
         d[var10] = var11 * var11 + f[n[var5]];
      }
   }

   static liiilIIliiiilIIl IiIlliIliiIl(illIIlllIilIIlll h, lIIllIiiIIllIi f, int rig, int w) {
      IllIIiillllIIiil var4 = liiiIIllIl(h);
      if (var4 != null && f != null && rig > 0 && w > 0) {
         boolean var5 = iliIiiliiiii(var4, f);

         for (int var9 : var5 ? new int[]{2, 1} : new int[]{0}) {
            if (IIlllIlliIll(var4, f, 64.0F, var9, rig, w)) {
               return Iilllilliill(var4, f, rig, w, 64.0F, var9);
            }

            if (IIlllIlliIll(var4, f, 1.0F, var9, rig, w)) {
               float var10 = 1.0F;
               float var11 = 64.0F;

               for (int var12 = 0; var12 < 24; var12++) {
                  float var13 = (var10 + var11) / 2.0F;
                  if (IIlllIlliIll(var4, f, var13, var9, rig, w)) {
                     var10 = var13;
                  } else {
                     var11 = var13;
                  }
               }

               return Iilllilliill(var4, f, rig, w, var10, var9);
            }
         }

         return null;
      } else {
         return null;
      }
   }

   static float[] IIillIiliIil(IllIIiillllIIiil classes, int g, float P) {
      float[] var3 = classes.IliIlllilIi(g);
      float[] var4 = classes.IliIlllilIi(Ililllililil(g));
      if (var3 != null && var4 != null) {
         float var5 = var4[0] + (float)Math.floor((double)((var3[0] - var4[0]) * P)) / P;
         float var6 = var4[3] - (float)Math.floor((double)((var4[3] - var3[3]) * P)) / P;
         return new float[]{var5, var3[1], var3[2], var6};
      } else {
         return var3;
      }
   }

   static boolean IIlllIlliIll(IllIIiillllIIiil h, lIIllIiiIIllIi w, float f, int P, int g, int sw) {
      int[][] var6 = IIIllIIliIIl(h, w.llIlllIiiilIlllIii, f, P);
      int[][] var7 = IilliliilIIi(var6, g);
      return var7 != null && var7[var6.length][1] <= sw && Illlllllilll(h, w, f);
   }

   private static void IliIlllilIi(float[] y, float e, float x) {
      if (e < y[0]) {
         y[0] = e;
      }

      if (x < y[1]) {
         y[1] = x;
      }

      if (e > y[2]) {
         y[2] = e;
      }

      if (x > y[3]) {
         y[3] = x;
      }
   }

   private static boolean Iilililiiili(
      boolean[] cls, boolean[] mat, IllllIlilllllIli ic, int ib, int cov, float[] v, float P, float[] pw, int ext, int ia, int ph, byte attr, byte fd
   ) {
      float var13 = (pw[ext] - v[0]) * P + 8.0F;
      float var14 = (v[3] - pw[ext + 1]) * P + 8.0F;
      float var15 = (pw[ia] - v[0]) * P + 8.0F;
      float var16 = (v[3] - pw[ia + 1]) * P + 8.0F;
      float var17 = (pw[ph] - v[0]) * P + 8.0F;
      float var18 = (v[3] - pw[ph + 1]) * P + 8.0F;
      float var19 = (var15 - var13) * (var18 - var14) - (var16 - var14) * (var17 - var13);
      if (Math.abs(var19) < 1.0E-9F) {
         return false;
      } else {
         int var20 = Math.max(0, (int)Math.floor((double)Math.min(var13, Math.min(var15, var17))));
         int var21 = Math.min(ib - 1, (int)Math.ceil((double)Math.max(var13, Math.max(var15, var17))));
         int var22 = Math.max(0, (int)Math.floor((double)Math.min(var14, Math.min(var16, var18))));
         int var23 = Math.min(cov - 1, (int)Math.ceil((double)Math.max(var14, Math.max(var16, var18))));
         boolean var24 = false;

         for (int var25 = var22; var25 <= var23; var25++) {
            for (int var26 = var20; var26 <= var21; var26++) {
               float var27 = (float)var26 + 0.5F;
               float var28 = (float)var25 + 0.5F;
               float var29 = ((var15 - var27) * (var18 - var28) - (var16 - var28) * (var17 - var27)) / var19;
               float var30 = ((var17 - var27) * (var14 - var28) - (var18 - var28) * (var13 - var27)) / var19;
               float var31 = 1.0F - var29 - var30;
               if (!(var29 < -1.0E-4F) && !(var30 < -1.0E-4F) && !(var31 < -1.0E-4F)) {
                  int var32 = var25 * ib + var26;
                  cls[var32] = true;
                  var24 = true;
                  if (mat != null) {
                     mat[var32] = true;
                     ic.lllilIllIi[var32] = attr;
                     ic.illilIllIi[var32] = fd;
                     float var33 = var29 * pw[ext + 2] + var30 * pw[ia + 2] + var31 * pw[ph + 2];
                     float var34 = var29 * pw[ext + 3] + var30 * pw[ia + 3] + var31 * pw[ph + 3];
                     float var35 = var29 * pw[ext + 4] + var30 * pw[ia + 4] + var31 * pw[ph + 4];
                     float var36 = (float)Math.sqrt((double)(var33 * var33 + var34 * var34 + var35 * var35));
                     if (var36 > 1.0E-6F) {
                        ic.lIlilIllIi[var32 * 3] = var33 / var36;
                        ic.lIlilIllIi[var32 * 3 + 1] = var34 / var36;
                        ic.lIlilIllIi[var32 * 3 + 2] = var35 / var36;
                     }
                  }
               }
            }
         }

         return var24;
      }
   }

   private static liiilIIliiiilIIl Iilllilliill(IllIIiillllIIiil w, lIIllIiiIIllIi g, int f, int P, float sw, int h) {
      liiilIIliiiilIIl var6 = new liiilIIliiiilIIl();
      var6.IliIIIilIl = f;
      var6.lliIIIilIl = P;
      var6.liiIIIilIl = sw;
      var6.iiiIIIilIl = h;
      int[][] var7 = IIIllIIliIIl(w, g.llIlllIiiilIlllIii, sw, h);
      int[][] var8 = IilliliilIIi(var7, f);
      int var9 = g.llIlllIiiilIlllIii.length;
      var6.iIIlIIilIl = new int[var9][];
      var6.llIlIIilIl = new float[var9][];
      var6.IiIlIIilIl = new float[var9][];

      for (int var10 = 0; var10 < var9; var10++) {
         var6.iIIlIIilIl[var10] = new int[]{var8[var10][0], var8[var10][1], var7[var10][0], var7[var10][1]};
         var6.llIlIIilIl[var10] = IIillIiliIil(w, g.llIlllIiiilIlllIii[var10].IliIlllilIi(), sw);
         var6.IiIlIIilIl[var10] = w.IliIlllilIi(Ililllililil(g.llIlllIiiilIlllIii[var10].IliIlllilIi()));
      }

      if (h > 0) {
         var6.IIIlIIilIl = var8[var9][0];
         var6.lIIlIIilIl = var8[var9][1];
      }

      int[][] var14 = IIIllIIliIIl(w, g.IiIlllIiiliIlllIii, sw, 0);
      int[][] var11 = IilliliilIIi(var14, 2048);
      int var12 = g.IiIlllIiiliIlllIii.length;
      var6.IlIlIIilIl = new int[var12][];
      var6.ilIlIIilIl = new float[var12][];
      var6.liIlIIilIl = new float[var12][];

      for (int var13 = 0; var13 < var12; var13++) {
         var6.IlIlIIilIl[var13] = new int[]{var11[var13][0], var11[var13][1], var14[var13][0], var14[var13][1]};
         var6.ilIlIIilIl[var13] = IIillIiliIil(w, g.IiIlllIiiliIlllIii[var13].IliIlllilIi(), sw);
         var6.liIlIIilIl[var13] = w.IliIlllilIi(Ililllililil(g.IiIlllIiiliIlllIii[var13].IliIlllilIi()));
      }

      var6.iliIIIilIl = var12 == 0 ? 0 : lIiiIiIlilli(Math.max(8, var11[var12][0]));
      var6.IiiIIIilIl = var12 == 0 ? 0 : lIiiIiIlilli(Math.max(8, var11[var12][1]));
      return var6;
   }

   private static int lIiiIiIlilli(int v) {
      return v + ((-880679450 >>> 1 | -880679450 << 31) ^ -53 ^ -1707143873) & (-(-1368113460 * -96516119 ^ -61) ^ 1318339689);
   }

   static iliiillIiiiill IlIllllIll(illIIlllIilIIlll rig, lIIllIiiIIllIi f) {
      IllIIiillllIIiil var2 = liiiIIllIl(rig);
      if (var2 != null && f != null) {
         liiilIIliiiilIIl var3 = IlIlllIlilIl(rig, f);
         if (var3 == null) {
            return null;
         } else {
            IliillIilliillIi var4 = new IliillIilliillIi(var2, var3.liiIIIilIl);
            int[] var5 = IllIllllIl(rig, f, var3, false, var4);
            int[][] var6 = iIiIlIliIl(var5, var3.IliIIIilIl, var3.lliIIIilIl, false);
            int[][] var7 = null;
            if (f.liiiIIllIl() && var3.iliIIIilIl > 0) {
               var7 = iIiIlIliIl(IllIllllIl(rig, f, var3, true, var4), var3.iliIIIilIl, var3.IiiIIIilIl, true);
            }

            iIiiliIiIliiliIi[] var8 = new iIiiliIiIliiliIi[var2.lIIIlillil.length];

            for (int var9 = 0; var9 < var8.length; var9++) {
               var8[var9] = lliIliliIl(var2, f, var3, var9);
            }

            return new iliiillIiiiill(rig, f, var3.IliIIIilIl, var3.lliIIIilIl, var3.iliIIIilIl, var3.IiiIIIilIl, var6, var7, var8);
         }
      } else {
         return null;
      }
   }

   static int[] IIIilIIiiIIi(float[] depth) {
      Integer[] var1 = new Integer[depth.length];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = var2;
      }

      Arrays.sort(var1, (a, b) -> depth[a] != depth[b] ? Float.compare(depth[a], depth[b]) : Integer.compare(a, b));
      int[] var4 = new int[var1.length];

      for (int var3 = 0; var3 < var4.length; var3++) {
         var4[var3] = var1[var3];
      }

      return var4;
   }

   static int[][] IilliliilIIi(int[][] maxW, int items) {
      Integer[] var2 = new Integer[maxW.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = var3;
      }

      Arrays.sort(var2, (itemsx, b) -> maxW[b][1] != maxW[itemsx][1] ? Integer.compare(maxW[b][1], maxW[itemsx][1]) : Integer.compare(itemsx, b));
      int[][] var14 = new int[maxW.length + 1][];
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      Integer[] var8 = var2;
      int var9 = var2.length;

      for (int var10 = 0; var10 < var9; var10++) {
         int var11 = var8[var10];
         int var12 = maxW[var11][0];
         int var13 = maxW[var11][1];
         if (var12 > items) {
            return null;
         }

         if (var4 + var12 > items) {
            var5 += var6;
            var4 = 0;
            var6 = 0;
         }

         var14[var11] = new int[]{var4, var5};
         var4 += var12;
         var6 = Math.max(var6, var13);
         var7 = Math.max(var7, var4);
      }

      var14[maxW.length] = new int[]{var7, var5 + var6};
      return var14;
   }

   static IllllIlilllllIli Iiilliiliiil(IllIIiillllIIiil ext, int classes, float[] g, int pw, int ph, float P) {
      IllllIlilllllIli var6 = new IllllIlilllllIli(pw, ph);
      Arrays.fill(var6.ilIilIllIi, -1.0E20F);
      Arrays.fill(var6.IiIilIllIi, 1.0E20F);
      Arrays.fill(var6.iiIilIllIi, 1.0E20F);
      Arrays.fill(var6.IIlilIllIi, 1.0E20F);
      Arrays.fill(var6.iIlilIllIi, -1.0F);
      Arrays.fill(var6.IllilIllIi, -1.0F);
      Arrays.fill(var6.lllilIllIi, (byte)-1);
      Arrays.fill(var6.illilIllIi, (byte)-1);
      if (g == null) {
         return var6;
      } else {
         int var7 = Ililllililil(classes);
         boolean var8 = ext.IIIIlillil.lIiiIiIlilli();
         boolean[] var9 = new boolean[pw * ph];
         boolean[] var10 = new boolean[pw * ph];
         boolean[] var11 = new boolean[pw * ph];
         boolean[] var12 = var8 ? new boolean[pw * ph] : null;
         float[] var13 = new float[pw * ph];
         float[] var14 = new float[pw * ph];
         float[] var15 = var8 ? new float[384] : null;
         ilIiIIllIiIiIIll var16 = new ilIiIIllIiIiIIll(pw, ph, var8);
         boolean var17 = false;

         for (int var18 = 0; var18 < ext.lIIIlillil.length; var18++) {
            Arrays.fill(var11, false);
            var16.IliIlllilIi();
            float[] var19 = ext.liIIlillil[var18];
            int var20 = ext.IiIIlillil[var18].length;
            int var21 = 0;
            int[] var22 = var8 ? IIIilIIiiIIi(ext.lIlIlillil[var18]) : null;
            boolean var23 = false;
            if (var8) {
               Arrays.fill(var12, false);
            }

            for (int var24 = 0; var24 < 2; var24++) {
               for (int var25 = 0; var25 < var20; var25++) {
                  int var26 = var22 == null ? var25 : var22[var25];
                  if ((var7 & IlIliIlllIliIl.IliIlllilIi(ext.iiIIlillil[var18][var26])) != 0 && ext.IIlIlillil[var18][var26] == (var24 == 1)) {
                     boolean var27 = var8 && var24 == 1 && ext.IiIIlillil[var18][var26] == 16 && ext.iiIIlillil[var18][var26] == 4;
                     int var28 = var26 * 20;

                     for (int var29 = 0; var29 < 2; var29++) {
                        int var31 = var28 + (var29 == 0 ? 5 : 10);
                        int var32 = var28 + (var29 == 0 ? 10 : 15);
                        if (Iilililiiili(
                           var11,
                           var24 == 1 ? var10 : null,
                           var6,
                           pw,
                           ph,
                           g,
                           P,
                           var19,
                           var28,
                           var31,
                           var32,
                           (byte)ext.IiIIlillil[var18][var26],
                           (byte)ext.iiIIlillil[var18][var26]
                        )) {
                           var23 = true;
                           float var33 = (var19[var28] - g[0]) * P + 8.0F;
                           float var34 = (g[3] - var19[var28 + 1]) * P + 8.0F;
                           float var35 = (var19[var31] - g[0]) * P + 8.0F;
                           float var36 = (g[3] - var19[var31 + 1]) * P + 8.0F;
                           float var37 = (var19[var32] - g[0]) * P + 8.0F;
                           float var38 = (g[3] - var19[var32 + 1]) * P + 8.0F;
                           var16.liiiIIllIl(var33, var34, var35, var36, var37, var38);
                           if (var27) {
                              Iilililiiili(var12, null, var6, pw, ph, g, P, var19, var28, var31, var32, (byte)0, (byte)0);
                              if (var21 + 6 > var15.length) {
                                 var15 = Arrays.copyOf(var15, var15.length * 2);
                              }

                              var15[var21++] = var33;
                              var15[var21++] = var34;
                              var15[var21++] = var35;
                              var15[var21++] = var36;
                              var15[var21++] = var37;
                              var15[var21++] = var38;
                           }
                        }
                     }
                  }
               }
            }

            if (var23) {
               var17 = true;
               boolean[] var51 = iIIIlIlIIl(var11, pw, ph);
               boolean var53 = false;

               for (int var54 = 0; var54 < var11.length && !var53 && !var8; var54++) {
                  var53 = !var11[var54] && !var51[var54];
               }

               if (!var16.iIlIlllllill(var11, var51, var13, var8)) {
                  Iiiiliiiiiii(var8 ? IlIillIiilIi(var11, var51) : var11, pw, ph, var13);
               }

               if (var53 && !var16.IilliliilIIi(var14)) {
                  IIIIllIIIl(var11, var51, pw, ph, var14);
               }

               boolean var55 = var21 > 0;
               if (var55) {
                  var16.IliIlllilIi();

                  for (byte var56 = 0; var56 < var21; var56 += 6) {
                     var16.liiiIIllIl(var15[var56], var15[var56 + 1], var15[var56 + 2], var15[var56 + 3], var15[var56 + 4], var15[var56 + 5]);
                  }

                  if (!var16.iIlIlllllill(var12, iIIIlIlIIl(var12, pw, ph), var14, false)) {
                     Iiiiliiiiiii(var12, pw, ph, var14);
                  }
               }

               for (int var57 = 0; var57 < var11.length; var57++) {
                  if (var13[var57] > var6.ilIilIllIi[var57]) {
                     var6.ilIilIllIi[var57] = var13[var57];
                     var6.IiIilIllIi[var57] = var55
                        ? Math.max(0.0F, -var14[var57])
                        : (var53 ? (!var11[var57] && !var51[var57] ? 0.0F : var14[var57]) : 1.0E20F);
                  }

                  var9[var57] |= var11[var57];
               }
            }
         }

         for (int var39 = 0; var39 < var6.ilIilIllIi.length; var39++) {
            var6.ilIilIllIi[var39] = var6.ilIilIllIi[var39] <= -5.0E19F ? -1.0E20F : var6.ilIilIllIi[var39] / P;
            var6.IiIilIllIi[var39] = var6.IiIilIllIi[var39] >= 5.0E19F ? 1.0E20F : var6.IiIilIllIi[var39] / P;
         }

         IIiilIiiiIii(var6, var10, pw, ph, pw + ph);
         if (!var17) {
            Arrays.fill(var6.liIilIllIi, 0.5F);
            return var6;
         } else {
            IiIiliIiiiIi(var9, pw, ph, Math.max(1, Math.round(0.35F * P)), var6.iIlilIllIi, var6.IllilIllIi);

            for (int var40 = 0; var40 < ph; var40++) {
               float var41 = var6.iIlilIllIi[var40];
               float var42 = var6.IllilIllIi[var40];
               float var48 = var42 - var41;

               for (int var49 = 0; var49 < pw; var49++) {
                  int var50 = var40 * pw + var49;
                  float var52 = (float)var49 + 0.5F;
                  var6.liIilIllIi[var50] = var48 <= 0.001F ? 0.5F : Math.max(0.0F, Math.min(1.0F, (var52 - var41) / var48));
                  var6.IIlilIllIi[var50] = (var52 - var41) / P;
                  var6.iiIilIllIi[var50] = (var42 - var52) / P;
               }
            }

            return var6;
         }
      }
   }

   static float[] IiiIlliiIl(boolean flat, byte meanU, float u, float scale, float meanV, float v, int mode) {
      if (!flat) {
         return new float[]{u, scale};
      } else if (meanU == 1) {
         return new float[]{0.85F, 0.85F};
      } else {
         float var7 = 0.5F / (float)(256 * Math.max(1, mode));
         return new float[]{iiiIlIIIll(u, meanV, var7), iiiIlIIIll(scale, v, var7)};
      }
   }

   private static void IIIIllIIIl(boolean[] pw, boolean[] ext0, int sh, int ph, float[] cov) {
      for (int var5 = 0; var5 < pw.length; var5++) {
         cov[var5] = !pw[var5] && !ext0[var5] ? 0.0F : 1.0E20F;
      }

      IiIIlliIIl(cov, sh, ph);

      for (int var6 = 0; var6 < pw.length; var6++) {
         cov[var6] = (float)Math.sqrt((double)cov[var6]);
      }
   }

   static int Ililllililil(int classes) {
      int var1 = 0;

      for (int var2 = 0; var2 < 8; var2++) {
         if ((classes & IlIliIlllIliIl.IliIlllilIi(var2)) != 0) {
            var1 |= IlIliIlllIliIl.liiiIIllIl(var2);
         }
      }

      return var1;
   }

   static int[] lIlIliIlIl(illIIlllIilIIlll glow, lIIllIiiIIllIi l, liiilIIliiiilIIl f, boolean rig) {
      IllIIiillllIIiil var4 = liiiIIllIl(glow);
      return var4 == null ? null : IllIllllIl(glow, l, f, rig, new IliillIilliillIi(var4, f.liiIIIilIl));
   }

   static {
      for (int var0 = 0; var0 < 256; var0++) {
         double var1 = (double)var0 / 255.0;
         iIllllliiIllllllii[var0] = (float)(var1 <= 0.04045 ? var1 / 12.92 : Math.pow((var1 + 0.055) / 1.055, 2.4));
      }
   }

   static IllIIiillllIIiil liiiIIllIl(illIIlllIilIIlll rig) {
      IllIIiillllIIiil var1 = IlIlllliillIllllii.get(rig);
      if (var1 != null) {
         return var1;
      } else {
         lIillIiiIillIi[] var2 = lIillIiiIillIi.iliIiiliiiii(rig);
         if (var2 == null) {
            return null;
         } else {
            var1 = new IllIIiillllIIiil(rig, var2);
            IllIIiillllIIiil var3 = IlIlllliillIllllii.putIfAbsent(rig, var1);
            return var3 != null ? var3 : var1;
         }
      }
   }

   static void IiIIlliIIl(float[] h, int w, int g) {
      int var3 = Math.max(w, g);
      float[] var4 = new float[var3];
      float[] var5 = new float[var3];
      float[] var6 = new float[var3 + 1];
      int[] var7 = new int[var3];

      for (int var8 = 0; var8 < w; var8++) {
         for (int var9 = 0; var9 < g; var9++) {
            var4[var9] = h[var9 * w + var8];
         }

         iiIIlIIlIl(var4, g, var5, var7, var6);

         for (int var11 = 0; var11 < g; var11++) {
            h[var11 * w + var8] = var5[var11];
         }
      }

      for (int var10 = 0; var10 < g; var10++) {
         System.arraycopy(h, var10 * w, var4, 0, w);
         iiIIlIIlIl(var4, w, var5, var7, var6);
         System.arraycopy(var5, 0, h, var10 * w, w);
      }
   }

   static float IIiIllIiIl(int c8) {
      return iIllllliiIllllllii[c8 & ((168243325 * 5 << 13 | 168243325 * 5 >>> 19) ^ 2119050939)];
   }

   static int[] IllIllllIl(illIIlllIilIIlll fields, lIIllIiiIIllIi glow, liiilIIliiiilIIl rig, boolean l, IliillIilliillIi f) {
      IllIIiillllIIiil var5 = liiiIIllIl(fields);
      if (var5 == null) {
         return null;
      } else {
         int var6 = l ? rig.iliIIIilIl : rig.IliIIIilIl;
         int var7 = l ? rig.IiiIIIilIl : rig.lliIIIilIl;
         if (var6 > 0 && var7 > 0) {
            int[] var8 = new int[var6 * var7];
            if (!l) {
               Arrays.fill(var8, -8355712);
            }

            ilIIililIiIIilil[] var9 = l ? glow.IiIlllIiiliIlllIii : glow.llIlllIiiilIlllIii;
            int[][] var10 = l ? rig.IlIlIIilIl : rig.iIIlIIilIl;
            float[][] var11 = l ? rig.ilIlIIilIl : rig.llIlIIilIl;
            float[][] var12 = l ? rig.liIlIIilIl : rig.IiIlIIilIl;
            illliIllIilliIll var13 = new illliIllIilliIll();
            var13.IilIIiilll = fields;
            var13.lilIIiilll = glow.IliIllIiilliIllIii;
            var13.IiIlIiilll = 1.0F / rig.liiIIIilIl;
            float[] var14 = var5.IlIIlillil;

            for (int var15 = 0; var15 < var9.length; var15++) {
               float[] var16 = var11[var15];
               float[] var17 = var12[var15];
               if (var16 != null) {
                  int var18 = var10[var15][0];
                  int var19 = var10[var15][1];
                  int var20 = var10[var15][2];
                  int var21 = var10[var15][3];
                  IllllIlilllllIli var22 = f.IliIlllilIi(Ililllililil(var9[var15].IliIlllilIi()), var17);
                  int var23 = Math.round((var16[0] - var17[0]) * rig.liiIIIilIl);
                  int var24 = Math.round((var17[3] - var16[3]) * rig.liiIIIilIl);
                  lilIiiiliilIiiil var25 = var9[var15].liiiIIllIl();
                  float var26 = Math.max(1.0E-4F, var17[2] - var17[0]);
                  float var27 = Math.max(1.0E-4F, var17[3] - var17[1]);
                  float var28 = Math.max(1.0E-4F, var14[2] - var14[0]);
                  float var29 = Math.max(1.0E-4F, var14[3] - var14[1]);

                  for (int var30 = 0; var30 < var21; var30++) {
                     int var31 = (var19 + var30) * var6 + var18;
                     if (var19 + var30 >= var7) {
                        break;
                     }

                     int var32 = Math.max(0, Math.min(var22.llIilIllIi - 1, var30 + var24));

                     for (int var33 = 0; var33 < var20 && var18 + var33 < var6; var33++) {
                        int var34 = var32 * var22.IlIilIllIi + Math.max(0, Math.min(var22.IlIilIllIi - 1, var33 + var23));
                        var13.lIiIIiilll = var16[0] + ((float)(var33 - 8) + 0.5F) / rig.liiIIIilIl;
                        var13.iIiIIiilll = var16[3] - ((float)(var30 - 8) + 0.5F) / rig.liiIIIilIl;
                        var13.IliIIiilll = (var13.lIiIIiilll - var17[0]) / var26;
                        var13.lliIIiilll = (var13.iIiIIiilll - var17[1]) / var27;
                        var13.iliIIiilll = (var13.lIiIIiilll - var14[0]) / var28;
                        var13.IiiIIiilll = (var13.iIiIIiilll - var14[1]) / var29;
                        var13.liiIIiilll = var22.liIilIllIi[var34];
                        var13.iiiIIiilll = var22.iiIilIllIi[var34];
                        var13.IIIlIiilll = var22.IIlilIllIi[var34];
                        var13.lIIlIiilll = var22.ilIilIllIi[var34];
                        var13.iIIlIiilll = var22.IiIilIllIi[var34];
                        var13.IIiIIiilll = var22.lllilIllIi[var34];
                        var13.iilIIiilll = var22.illilIllIi[var34];
                        float var35 = var22.lIlilIllIi[var34 * 3 + 2];
                        if (var35 == 0.0F && var22.lIlilIllIi[var34 * 3] == 0.0F && var22.lIlilIllIi[var34 * 3 + 1] == 0.0F) {
                           var13.IlIlIiilll = 0.0F;
                           var13.llIlIiilll = 0.0F;
                           var13.ilIlIiilll = 1.0F;
                        } else {
                           var13.IlIlIiilll = var22.lIlilIllIi[var34 * 3];
                           var13.llIlIiilll = var22.lIlilIllIi[var34 * 3 + 1];
                           var13.ilIlIiilll = var35;
                        }

                        int var36 = var25.paint(var13);
                        var8[var31 + var33] = l ? var36 : var36 | 0xFF000000;
                     }
                  }
               }
            }

            if (!l && rig.IIIlIIilIl >= 0) {
               int[] var37 = lIillIiiIillIi.IlIlllIlilIl(fields);
               short var38 = 256;
               int var39 = rig.iiiIIIilIl;
               int var40 = var38 * var39 + 16;

               for (int var41 = 0; var41 < var40 && rig.lIIlIIilIl + var41 < var7; var41++) {
                  for (int var42 = 0; var42 < var40 && rig.IIIlIIilIl + var42 < var6; var42++) {
                     int var43 = Math.max(0, Math.min(var38 - 1, Math.floorDiv(var42 - 8, var39)));
                     int var44 = Math.max(0, Math.min(var38 - 1, Math.floorDiv(var41 - 8, var39)));
                     var8[(rig.lIIlIIilIl + var41) * var6 + rig.IIIlIIilIl + var42] = illIlIilIl(var37, var44 * var38 + var43);
                  }
               }
            }

            return var8;
         } else {
            return null;
         }
      }
   }

   private static void Iliilliiilii(float[] z, int n, int[] f, int[] v, float[] arg) {
      int var5 = 0;
      v[0] = 0;
      arg[0] = -1.0E20F;
      arg[1] = 1.0E20F;

      for (int var6 = 1; var6 < n; var6++) {
         while (true) {
            int var8 = v[var5];
            float var7 = (z[var6] + (float)var6 * (float)var6 - (z[var8] + (float)var8 * (float)var8)) / (2.0F * (float)(var6 - var8));
            if (!(var7 <= arg[var5]) || var5 <= 0) {
               if (var7 <= arg[var5]) {
                  v[0] = var6;
                  arg[0] = -1.0E20F;
                  arg[1] = 1.0E20F;
                  var5 = 0;
               } else {
                  var5++;
                  v[var5] = var6;
                  arg[var5] = var7;
                  arg[var5 + 1] = 1.0E20F;
               }
               break;
            }

            var5--;
         }
      }

      var5 = 0;

      for (int var10 = 0; var10 < n; var10++) {
         while (arg[var5 + 1] < (float)var10) {
            var5++;
         }

         f[var10] = v[var5];
      }
   }

   private static void Iiiiliiiiiii(boolean[] pw, int cov, int ph, float[] sd) {
      float[] var4 = new float[cov * ph];
      float[] var5 = new float[cov * ph];

      for (int var6 = 0; var6 < pw.length; var6++) {
         var4[var6] = pw[var6] ? 1.0E20F : 0.0F;
         var5[var6] = pw[var6] ? 0.0F : 1.0E20F;
      }

      IiIIlliIIl(var4, cov, ph);
      IiIIlliIIl(var5, cov, ph);

      for (int var7 = 0; var7 < pw.length; var7++) {
         sd[var7] = pw[var7] ? (float)Math.sqrt((double)var4[var7]) - 0.5F : 0.5F - (float)Math.sqrt((double)var5[var7]);
      }
   }

   private static int iIlIlllllill(float P, float units) {
      return (int)Math.ceil((double)(P * units)) + 1 + (((-2056315557 << 15 | -2056315557 >>> 17) ^ 55) + 5 ^ -1901215083);
   }

   private static boolean[] IlIillIiilIi(boolean[] ext0, boolean[] cov) {
      boolean[] var2 = new boolean[ext0.length];

      for (int var3 = 0; var3 < ext0.length; var3++) {
         var2[var3] = ext0[var3] || !cov[var3];
      }

      return var2;
   }

   private static float iiiIlIIIll(float mean, float c, float in) {
      float var3 = c - mean;
      return Math.abs(var3) <= in ? c : mean + Math.copySign(in, var3);
   }

   private static void IIiilIiiiIii(IllllIlilllllIli w, boolean[] h, int cov, int steps, int fd) {
      int var5 = cov * steps;
      int[] var6 = new int[var5];
      int[] var7 = new int[var5];
      Arrays.fill(var7, -1);
      int var8 = 0;
      int var9 = 0;

      for (int var10 = 0; var10 < var5; var10++) {
         if (h[var10]) {
            var7[var10] = 0;
            var6[var9++] = var10;
         }
      }

      while (var8 < var9) {
         int var15 = var6[var8++];
         if (var7[var15] < fd) {
            int var11 = var15 % cov;
            int var12 = var15 / cov;

            for (int var13 = 0; var13 < 4; var13++) {
               int var14 = var13 == 0
                  ? (var11 > 0 ? var15 - 1 : -1)
                  : (var13 == 1 ? (var11 < cov - 1 ? var15 + 1 : -1) : (var13 == 2 ? (var12 > 0 ? var15 - cov : -1) : (var12 < steps - 1 ? var15 + cov : -1)));
               if (var14 >= 0 && var7[var14] < 0) {
                  var7[var14] = var7[var15] + 1;
                  w.lIlilIllIi[var14 * 3] = w.lIlilIllIi[var15 * 3];
                  w.lIlilIllIi[var14 * 3 + 1] = w.lIlilIllIi[var15 * 3 + 1];
                  w.lIlilIllIi[var14 * 3 + 2] = w.lIlilIllIi[var15 * 3 + 2];
                  w.lllilIllIi[var14] = w.lllilIllIi[var15];
                  w.illilIllIi[var14] = w.illilIllIi[var15];
                  var6[var9++] = var14;
               }
            }
         }
      }
   }

   static int lIIlliIIll(int a, int b) {
      int var2 = (a >> 16 & 0xFF) * (b >> 16 & 0xFF) / 255;
      int var3 = (a >> 8 & 0xFF) * (b >> 8 & 0xFF) / 255;
      int var4 = (a & 0xFF) * (b & 0xFF) / 255;
      return a & 0xFF000000 | var2 << 16 | var3 << 8 | var4;
   }

   private static int llIIlilIIl(boolean[] cov, boolean[] i, int[] out, int sp, int stack) {
      if (!cov[stack] && !i[stack]) {
         i[stack] = true;
         out[sp++] = stack;
         return sp;
      } else {
         return sp;
      }
   }

   static int lilIliilIl(float lin) {
      if (lin <= 0.0F) {
         return 0;
      } else if (lin >= 1.0F) {
         return ~(-437600377 * 3 << 7 | -437600377 * 3 >>> 25) - 107 ^ 534819907;
      } else {
         double var1 = (double)lin <= Double.longBitsToDouble(2880143970145505344L ^ 1770467076830799705L)
            ? (double)lin * Double.longBitsToDouble(822235042001887577L ^ 5422612540869182094L)
            : Double.longBitsToDouble(1906091428836204912L ^ 2703053995377073041L)
                  * Math.pow((double)lin, Double.longBitsToDouble(-1778012378676916537L ^ -2843581694255192980L))
               - Double.longBitsToDouble(-4679294783275526987L ^ -9177237791656294244L);
         return (int)Math.round(var1 * Double.longBitsToDouble(-8818301212042247249L ^ -4183569429896674385L));
      }
   }

   static int illIlIilIl(int[] i, int atlas) {
      long var3 = -3100998794318918535L;
      if (i == null) {
         return ~(~-1261279896 - 25 << 13 | ~-1261279896 - 25 >>> 19) ^ -1284577212;
      } else {
         var3 ^= ((long)i[atlas] << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) >>> ((((-1296779024 ^ 115) + -73 ^ 85) >>> 25 | ((-1296779024 ^ 115) + -73 ^ 85) << 7) ^ 1515993025) == 0
            ? -(~(90611096 + 45 + -81)) ^ -88587349
            : (int)(var3 >>> 32) | (438450821 - 89) * 79 - 11 ^ -275778679;
      }
   }

   static int[][] IIIllIIliIIl(IllIIiillllIIiil g, ilIIililIiIIilil[] swatch, float pages, int P) {
      ArrayList var4 = new ArrayList();

      for (ilIIililIiIIilil var8 : swatch) {
         float[] var9 = IIillIiliIil(g, var8.IliIlllilIi(), pages);
         var4.add(var9 == null ? new int[]{1, 1} : new int[]{iIlIlllllill(var9[2] - var9[0], pages), iIlIlllllill(var9[3] - var9[1], pages)});
      }

      if (P > 0) {
         var4.add(new int[]{256 * P + 16, 256 * P + 16});
      }

      return var4.toArray(new int[0][]);
   }

   static liiilIIliiiilIIl IlIlllIlilIl(illIIlllIilIIlll rig, lIIllIiiIIllIi f) {
      IllIIiillllIIiil var2 = liiiIIllIl(rig);
      if (var2 != null && f != null) {
         int var3 = iliIiiliiiii(var2, f) ? 2 : 0;
         int[][] var4 = IIIllIIliIIl(var2, f.llIlllIiiilIlllIii, 64.0F, var3);
         int var5 = -1;
         int var6 = -1;
         long var7 = Long.MAX_VALUE;

         for (int var12 : IIiIllliilIiIlllii) {
            int[][] var13 = IilliliilIIi(var4, var12);
            if (var13 != null) {
               int var14 = lIiiIiIlilli(Math.max(8, var13[var4.length][0]));
               int var15 = lIiiIiIlilli(Math.max(8, var13[var4.length][1]));
               if (var14 <= 2048 && var15 <= 2048) {
                  long var16 = (long)var14 * (long)var15;
                  if (var16 < var7 || var16 == var7 && Math.max(var14, var15) < Math.max(var5, var6)) {
                     var7 = var16;
                     var5 = var14;
                     var6 = var15;
                  }
               }
            }
         }

         return var5 < 0 ? IiIlliIliiIl(rig, f, 2048, 2048) : IiIlliIliiIl(rig, f, var5, var6);
      } else {
         return null;
      }
   }

   static int[][] iIiIlIliIl(int[] alphaWeighted, int w, int img, boolean h) {
      int var4 = 1;

      while (var4 < 4 && w >> var4 >= 8 && img >> var4 >= 8 && w % (1 << var4) == 0 && img % (1 << var4) == 0) {
         var4++;
      }

      int[][] var5 = new int[var4][];
      var5[0] = alphaWeighted;
      int var6 = w;
      int var7 = img;

      for (int var8 = 1; var8 < var4; var8++) {
         int var9 = var6 / 2;
         int var10 = var7 / 2;
         int[] var11 = var5[var8 - 1];
         int[] var12 = new int[var9 * var10];

         for (int var13 = 0; var13 < var10; var13++) {
            for (int var14 = 0; var14 < var9; var14++) {
               float var15 = 0.0F;
               float var16 = 0.0F;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for (int var20 = 0; var20 < 4; var20++) {
                  int var21 = var11[(var13 * 2 + (var20 >> 1)) * var6 + var14 * 2 + (var20 & 1)];
                  float var22 = (float)(var21 >>> 24 & 0xFF) / 255.0F;
                  float var23 = h ? var22 : 1.0F;
                  var15 += IIiIllIiIl(var21 >> 16) * var23;
                  var16 += IIiIllIiIl(var21 >> 8) * var23;
                  var17 += IIiIllIiIl(var21) * var23;
                  var18 += var22;
                  var19 += var23;
               }

               if (var19 <= 1.0E-6F) {
                  for (int var24 = 0; var24 < 4; var24++) {
                     int var26 = var11[(var13 * 2 + (var24 >> 1)) * var6 + var14 * 2 + (var24 & 1)];
                     var15 += IIiIllIiIl(var26 >> 16);
                     var16 += IIiIllIiIl(var26 >> 8);
                     var17 += IIiIllIiIl(var26);
                  }

                  var19 = 4.0F;
               }

               int var25 = Math.round(var18 / 4.0F * 255.0F);
               var12[var13 * var9 + var14] = var25 << 24 | lilIliilIl(var15 / var19) << 16 | lilIliilIl(var16 / var19) << 8 | lilIliilIl(var17 / var19);
            }
         }

         var5[var8] = var12;
         var6 = var9;
         var7 = var10;
      }

      return var5;
   }
}
