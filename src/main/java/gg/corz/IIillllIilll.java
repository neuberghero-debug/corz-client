package gg.corz;

import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Vector3fc;

public final class IIillllIilll {
   private static float iiiIIlIiIIIlIlIi;
   private static float[] lIlIIlIiiIlIIlIi = new float[512];
   private static class_4588 iillIlIiIIilIlIi;
   private static float IillIlIilillIlIi;
   private static float lIIlIlIiiIIlIlIi;
   private static float IlIlIlIillIlIlIi;
   private static float[] illIIlIiIilIIlIi = new float[512];
   private static float[] iiIIIlIiIIlIIlIi = new float[512];
   private static final int llIIIlIiilIIIlIi = 6;
   private static Matrix4f lIilIlIiiIilIlIi;
   public static final float iIIIIlIiIlIIIlIi = 0.1F;
   private static float[] IllIIlIilllIIlIi = new float[512];
   private static float[] lilIIlIiiilIIlIi = new float[512];
   private static float IiiIIlIiliiIIlIi;
   private static int[] lliIIlIiiliIIlIi = new int[512];
   private static float liIlIlIiiiIlIlIi;
   private static float[] IiIIIlIiliIIIlIi = new float[512];
   private static float IIllIlIilIllIlIi;
   private static float iIllIlIiIlllIlIi;
   private static float[] iIiIIlIiIliIIlIi = new float[512];
   private static float[] IIiIIlIilIiIIlIi = new float[512];
   private static float ilIlIlIiIiIlIlIi;
   private static float llllIlIiilllIlIi;

   public static void liiiIIllIl(
      class_4588 camera, Matrix4f capStart, class_4184 consumer, double[] widthPx, int[] xyz, int argb, float capEnd, float count, boolean featherPx, boolean m
   ) {
      long var23 = 2902508822777823777L;
      long var25 = -1971284713931192929L;
      long var27 = 5506544432293550575L;
      if (argb >= 2 && !(capEnd <= 0.0F)) {
         IIlllIlliIll(argb + 2);
         Vector3fc var10 = consumer.method_19335();
         Vector3fc var11 = consumer.method_19336();
         Vector3fc var12 = consumer.method_35689();
         IIllIlIilIllIlIi = var10.x();
         iIllIlIiIlllIlIi = var10.y();
         llllIlIiilllIlIi = var10.z();
         IlIlIlIillIlIlIi = var11.x();
         ilIlIlIiIiIlIlIi = var11.y();
         liIlIlIiiiIlIlIi = var11.z();
         IiiIIlIiliiIIlIi = -var12.x();
         iiiIIlIiIIIlIlIi = -var12.y();
         lIIlIlIiiIIlIlIi = -var12.z();
         IillIlIilillIlIi = IliIlllilIi();
         iillIlIiIIilIlIi = camera;
         lIilIlIiiIilIlIi = capStart;
         class_243 var13 = consumer.method_71156();

         for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < argb; var23 += 4294967296L) {
            float var15 = (float)(widthPx[(int)(var23 >>> 32) * 3] - var13.field_1352);
            float var16 = (float)(widthPx[(int)(var23 >>> 32) * 3 + 1] - var13.field_1351);
            float var17 = (float)(widthPx[(int)(var23 >>> 32) * 3 + 2] - var13.field_1350);
            IiIIIlIiliIIIlIi[(int)(var23 >>> 32)] = var15 * IiiIIlIiliiIIlIi + var16 * iiiIIlIiIIIlIlIi + var17 * lIIlIlIiiIIlIlIi;
            iiIIIlIiIIlIIlIi[(int)(var23 >>> 32)] = var15 * IlIlIlIillIlIlIi + var16 * ilIlIlIiIiIlIlIi + var17 * liIlIlIiiiIlIlIi;
            lIlIIlIiiIlIIlIi[(int)(var23 >>> 32)] = var15 * IIllIlIilIllIlIi + var16 * iIllIlIiIlllIlIi + var17 * llllIlIiilllIlIi;
         }

         float var14 = Math.max(0.5F, count);
         float var29 = Math.max(0.0F, (capEnd - var14) * 0.5F);
         float var30 = (capEnd + var14) * 0.5F;
         float var31 = Math.min(1.0F, capEnd / var14);
         var23 ^= (0L ^ var23) & -1L >>> 32;
         var25 ^= ((long)(featherPx && lIlIIlIiiIlIIlIi[0] >= 0.1F ? 1 : 0) << 32 ^ var25) & -1L << 32;

         for (var25 ^= (0L ^ var25) & -1L >>> 32; (int)var25 < argb; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            var27 ^= ((long)(lIlIIlIiiIlIIlIi[(int)var25] >= 0.1F ? 1 : 0) << 32 ^ var27) & -1L << 32;
            if ((int)var25 > 0 && (int)(var27 >>> 32) != (lIlIIlIiiIlIIlIi[(int)var25 - 1] >= 0.1F ? 1 : 0)) {
               float var22 = (0.1F - lIlIIlIiiIlIIlIi[(int)var25 - 1]) / (lIlIIlIiiIlIIlIi[(int)var25] - lIlIIlIiiIlIIlIi[(int)var25 - 1]);
               int var10000 = (int)var23;
               var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
               IlIlllIlilIl(
                  var10000,
                  IiIIIlIiliIIIlIi[(int)var25 - 1] + (IiIIIlIiliIIIlIi[(int)var25] - IiIIIlIiliIIIlIi[(int)var25 - 1]) * var22,
                  iiIIIlIiIIlIIlIi[(int)var25 - 1] + (iiIIIlIiIIlIIlIi[(int)var25] - iiIIIlIiIIlIIlIi[(int)var25 - 1]) * var22,
                  0.1F,
                  IiIlliIliiIl(xyz[(int)var25 - 1], xyz[(int)var25], var22),
                  var31
               );
               if ((int)(var27 >>> 32) == 0) {
                  IilliliilIIi((int)var23, (boolean)((int)(var25 >>> 32)), false, var29, var30);
                  var23 ^= (0L ^ var23) & -1L >>> 32;
                  var25 ^= (0L ^ var25) & -1L << 32;
               }
            }

            if ((int)(var27 >>> 32) != 0) {
               int var36 = (int)var23;
               var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
               IlIlllIlilIl(var36, IiIIIlIiliIIIlIi[(int)var25], iiIIIlIiIIlIIlIi[(int)var25], lIlIIlIiiIlIIlIi[(int)var25], xyz[(int)var25], var31);
            }
         }

         IilliliilIIi((int)var23, (boolean)((int)(var25 >>> 32)), m, var29, var30);
         iillIlIiIIilIlIi = null;
         lIilIlIiiIilIlIi = null;
      }
   }

   private static void IilliliilIIi(int ho, boolean hc, boolean cap1, float cap0, float n) {
      long var16 = -2174147832888800813L;
      long var18 = 7266963078799018122L;
      long var20 = 2692575589420875600L;
      if (ho >= 2) {
         float var5 = 1.0F;
         float var6 = 0.0F;
         var16 ^= (-4294967296L ^ var16) & -1L << 32;

         for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < ho; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            long var26 = var18 ^ ((long)Math.max((int)var16 - 1, 0) << 32 ^ var18) & -1L << 32;
            var18 = var26 ^ ((long)Math.min((int)var16 + 1, ho - 1) ^ var26) & -1L >>> 32;
            float var11 = (
                  IllIIlIilllIIlIi[(int)var18] / lilIIlIiiilIIlIi[(int)var18] - IllIIlIilllIIlIi[(int)(var18 >>> 32)] / lilIIlIiiilIIlIi[(int)(var18 >>> 32)]
               )
               * IillIlIilillIlIi;
            float var12 = (
                  illIIlIiIilIIlIi[(int)var18] / lilIIlIiiilIIlIi[(int)var18] - illIIlIiIilIIlIi[(int)(var18 >>> 32)] / lilIIlIiiilIIlIi[(int)(var18 >>> 32)]
               )
               * IillIlIilillIlIi;
            float var13 = (float)Math.sqrt((double)(var11 * var11 + var12 * var12));
            if (var13 > 0.05F) {
               float var14 = -var12 / var13;
               float var15 = var11 / var13;
               if ((int)(var16 >>> 32) >= 0 && var14 * var5 + var15 * var6 < 0.0F) {
                  var14 = -var14;
                  var15 = -var15;
               }

               var5 = var14;
               var6 = var15;
               if ((int)(var16 >>> 32) < 0) {
                  var16 ^= ((long)((int)var16) << 32 ^ var16) & -1L << 32;
               }
            }

            IIiIIlIilIiIIlIi[(int)var16] = var5;
            iIiIIlIiIliIIlIi[(int)var16] = var6;
         }

         for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            IIiIIlIilIiIIlIi[(int)var16] = IIiIIlIilIiIIlIi[(int)(var16 >>> 32)];
            iIiIIlIiIliIIlIi[(int)var16] = iIiIIlIiIliIIlIi[(int)(var16 >>> 32)];
         }

         for (long var25 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var25 < ho - 1; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            var18 ^= ((long)lliIIlIiiliIIlIi[(int)var25] << 32 ^ var18) & -1L << 32;
            var18 ^= ((long)lliIIlIiiliIIlIi[(int)var25 + 1] ^ var18) & -1L >>> 32;
            if (((int)(var18 >>> 32) | (int)var18) >>> 24 != 0) {
               var20 ^= ((long)((int)(var18 >>> 32) & 16777215) << 32 ^ var20) & -1L << 32;
               var20 ^= ((long)((int)var18 & 16777215) ^ var20) & -1L >>> 32;
               if (cap0 > 0.0F) {
                  lIiiIiIlilli((int)var25, -cap0, (int)(var18 >>> 32), cap0, (int)(var18 >>> 32), cap0, (int)var18, -cap0, (int)var18);
               }

               lIiiIiIlilli((int)var25, cap0, (int)(var18 >>> 32), n, (int)(var20 >>> 32), n, (int)var20, cap0, (int)var18);
               lIiiIiIlilli((int)var25, -cap0, (int)(var18 >>> 32), -n, (int)(var20 >>> 32), -n, (int)var20, -cap0, (int)var18);
            }
         }

         if (hc) {
            iliIiiliiiii(0, 1, cap0, n);
         }

         if (cap1) {
            iliIiiliiiii(ho - 1, ho - 2, cap0, n);
         }
      }
   }

   private IIillllIilll() {
   }

   public static int iIlIlllllill(double[] out, int t1, double sub, double count, int t0, double[] in) {
      long var25 = 9038831859465075633L;
      long var27 = 2833263510085669273L;
      long var29 = -2748420401041679049L;
      long var31 = 3334466292201838381L;
      var25 ^= (0L ^ var25) & -1L << 32;
      double var9 = 1.0 / (double)t0;
      double var11 = sub;

      while (true) {
         var25 ^= ((long)Math.max(0, Math.min((int)Math.floor(var11), t1 - 2)) ^ var25) & -1L >>> 32;
         double var14 = var11 - (double)((int)var25);
         double var16 = var14 * var14;
         double var18 = var16 * var14;
         var27 ^= ((long)(Math.max((int)var25 - 1, 0) * 3) << 32 ^ var27) & -1L << 32;
         var27 ^= ((long)((int)var25 * 3) ^ var27) & -1L >>> 32;
         var29 ^= ((long)(((int)var25 + 1) * 3) << 32 ^ var29) & -1L << 32;
         var29 ^= ((long)(Math.min((int)var25 + 2, t1 - 1) * 3) ^ var29) & -1L >>> 32;

         for (var31 ^= (0L ^ var31) & -1L << 32; (int)(var31 >>> 32) < 3; var31 += 4294967296L) {
            int var10001 = (int)(var25 >>> 32);
            var25 += 4294967296L;
            in[var10001] = 0.5
               * (
                  2.0 * out[(int)var27 + (int)(var31 >>> 32)]
                     + (out[(int)(var29 >>> 32) + (int)(var31 >>> 32)] - out[(int)(var27 >>> 32) + (int)(var31 >>> 32)]) * var14
                     + (
                           2.0 * out[(int)(var27 >>> 32) + (int)(var31 >>> 32)]
                              - 5.0 * out[(int)var27 + (int)(var31 >>> 32)]
                              + 4.0 * out[(int)(var29 >>> 32) + (int)(var31 >>> 32)]
                              - out[(int)var29 + (int)(var31 >>> 32)]
                        )
                        * var16
                     + (
                           3.0 * out[(int)var27 + (int)(var31 >>> 32)]
                              - out[(int)(var27 >>> 32) + (int)(var31 >>> 32)]
                              - 3.0 * out[(int)(var29 >>> 32) + (int)(var31 >>> 32)]
                              + out[(int)var29 + (int)(var31 >>> 32)]
                        )
                        * var18
               );
         }

         if (var11 >= count) {
            return (int)(var25 >>> 32) / 3;
         }

         var11 = Math.min(count, (Math.floor(var11 * (double)t0 + 1.0E-6) + 1.0) * var9);
      }
   }

   private static int IiIlliIliiIl(int t, int a, float b) {
      long var7 = -5372569659013379017L;
      long var9 = -8849794047927202178L;
      var7 ^= ((long)(t >>> 24) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)(t >> 16 & 0xFF) ^ var7) & -1L >>> 32;
      var9 ^= ((long)(t >> 8 & 0xFF) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)(t & 0xFF) ^ var9) & -1L >>> 32;
      return (int)((float)((int)(var7 >>> 32)) + (float)((a >>> 24) - (int)(var7 >>> 32)) * b) << 24
         | (int)((float)((int)var7) + (float)((a >> 16 & 0xFF) - (int)var7) * b) << 16
         | (int)((float)((int)(var9 >>> 32)) + (float)((a >> 8 & 0xFF) - (int)(var9 >>> 32)) * b) << 8
         | (int)((float)((int)var9) + (float)((a & 0xFF) - (int)var9) * b);
   }

   public static float IliIlllilIi() {
      return (float)class_310.method_1551().method_22683().method_4506() * 0.5F / (float)Math.tan(Math.toRadians((double)IiilIIiliilIIi.liiiIIllIl()) * 0.5);
   }

   private static void IIIllIIliIIl(int i, float oy, float c, int ox) {
      float var4 = lilIIlIiiilIIlIi[i] / IillIlIilillIlIi;
      float var5 = IllIIlIilllIIlIi[i] + oy * var4;
      float var6 = illIIlIiIilIIlIi[i] + c * var4;
      float var7 = lilIIlIiiilIIlIi[i];
      iillIlIiIIilIlIi.method_22918(
            lIilIlIiiIilIlIi,
            IiiIIlIiliiIIlIi * var5 + IlIlIlIillIlIlIi * var6 + IIllIlIilIllIlIi * var7,
            iiiIIlIiIIIlIlIi * var5 + ilIlIlIiIiIlIlIi * var6 + iIllIlIiIlllIlIi * var7,
            lIIlIlIiiIIlIlIi * var5 + liIlIlIiiiIlIlIi * var6 + llllIlIiilllIlIi * var7
         )
         .method_39415(ox);
   }

   private static void IlIlllIlilIl(int i, float z, float y, float x, int gain, float c) {
      IllIIlIilllIIlIi[i] = z;
      illIIlIiIilIIlIi[i] = y;
      lilIIlIiiilIIlIi[i] = x;
      lliIIlIiiliIIlIi[i] = c >= 1.0F ? gain : (int)((float)(gain >>> 24) * c) << 24 | gain & 16777215;
   }

   private static void iliIiiliiiii(int hc, int i, float from, float ho) {
      long var18 = 3035863880505169239L;
      long var20 = -2507914532413616466L;
      var18 ^= ((long)lliIIlIiiliIIlIi[hc] << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)((int)(var18 >>> 32) & 16777215) ^ var18) & -1L >>> 32;
      if ((int)(var18 >>> 32) >>> 24 != 0) {
         float var6 = (IllIIlIilllIIlIi[hc] / lilIIlIiiilIIlIi[hc] - IllIIlIilllIIlIi[i] / lilIIlIiiilIIlIi[i]) * IillIlIilillIlIi;
         float var7 = (illIIlIiIilIIlIi[hc] / lilIIlIiiilIIlIi[hc] - illIIlIiIilIIlIi[i] / lilIIlIiiilIIlIi[i]) * IillIlIilillIlIi;
         float var8 = (float)Math.sqrt((double)(var6 * var6 + var7 * var7));
         if (var8 > 0.05F) {
            var6 /= var8;
            var7 /= var8;
         } else {
            var6 = iIiIIlIiIliIIlIi[hc];
            var7 = -IIiIIlIilIiIIlIi[hc];
         }

         float var9 = IIiIIlIilIiIIlIi[hc];
         float var10 = iIiIIlIiIliIIlIi[hc];

         for (long var26 = var20 ^ (4294967296L ^ var20) & -1L << 32; (int)(var26 >>> 32) <= 6; var26 += 4294967296L) {
            double var12 = Math.PI * (double)((int)(var26 >>> 32)) / 6.0;
            float var14 = (float)Math.cos(var12);
            float var15 = (float)Math.sin(var12);
            float var16 = IIiIIlIilIiIIlIi[hc] * var14 + var6 * var15;
            float var17 = iIiIIlIiIliIIlIi[hc] * var14 + var7 * var15;
            if (from > 0.0F) {
               iIiiIIilIliiIIil.Illlllllilll(4);
               IIIllIIliIIl(hc, 0.0F, 0.0F, (int)(var18 >>> 32));
               IIIllIIliIIl(hc, 0.0F, 0.0F, (int)(var18 >>> 32));
               IIIllIIliIIl(hc, var9 * from, var10 * from, (int)(var18 >>> 32));
               IIIllIIliIIl(hc, var16 * from, var17 * from, (int)(var18 >>> 32));
            }

            iIiiIIilIliiIIil.Illlllllilll(4);
            IIIllIIliIIl(hc, var9 * from, var10 * from, (int)(var18 >>> 32));
            IIIllIIliIIl(hc, var9 * ho, var10 * ho, (int)var18);
            IIIllIIliIIl(hc, var16 * ho, var17 * ho, (int)var18);
            IIIllIIliIIl(hc, var16 * from, var17 * from, (int)(var18 >>> 32));
            var9 = var16;
            var10 = var17;
         }
      }
   }

   private static void IIlllIlliIll(int n) {
      long var2 = -1257986819909646534L;
      if (IiIIIlIiliIIIlIi.length < n) {
         var2 ^= ((long)Math.max(n, IiIIIlIiliIIIlIi.length * 2) << 32 ^ var2) & -1L << 32;
         IiIIIlIiliIIIlIi = new float[(int)(var2 >>> 32)];
         iiIIIlIiIIlIIlIi = new float[(int)(var2 >>> 32)];
         lIlIIlIiiIlIIlIi = new float[(int)(var2 >>> 32)];
         IllIIlIilllIIlIi = new float[(int)(var2 >>> 32)];
         illIIlIiIilIIlIi = new float[(int)(var2 >>> 32)];
         lilIIlIiiilIIlIi = new float[(int)(var2 >>> 32)];
         IIiIIlIilIiIIlIi = new float[(int)(var2 >>> 32)];
         iIiIIlIiIliIIlIi = new float[(int)(var2 >>> 32)];
         lliIIlIiiliIIlIi = new int[(int)(var2 >>> 32)];
      }
   }

   private static void lIiiIiIlilli(int od, float cb, int ca, float oc, int cd, float cc, int ob, float oa, int i) {
      iIiiIIilIliiIIil.Illlllllilll(4);
      IIIllIIliIIl(od, IIiIIlIilIiIIlIi[od] * cb, iIiIIlIiIliIIlIi[od] * cb, ca);
      IIIllIIliIIl(od, IIiIIlIilIiIIlIi[od] * oc, iIiIIlIiIliIIlIi[od] * oc, cd);
      IIIllIIliIIl(od + 1, IIiIIlIilIiIIlIi[od + 1] * cc, iIiIIlIiIliIIlIi[od + 1] * cc, ob);
      IIIllIIliIIl(od + 1, IIiIIlIilIiIIlIi[od + 1] * oa, iIiIIlIiIliIIlIi[od + 1] * oa, i);
   }
}
