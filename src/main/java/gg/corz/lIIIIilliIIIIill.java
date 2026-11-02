package gg.corz;

public final class lIIIIilliIIIIill {
   public static final float IIillllill = 0.085F;
   private static final float iiillllill = (float) Math.PI;
   public static final float iIillllill = 0.05F;
   static final float Iiillllill = 0.35F;
   public static final float lIillllill = 0.04F;
   static final float liillllill = 0.6662F;
   static final float ilillllill = 1.0E-4F;
   public static final float llillllill = 0.04F;
   private static final float lIIilllill = (float) (Math.PI * 2);
   private static final float IIIilllill = (float) (Math.PI / 2);

   static float iliIiiliiiii(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static void IliIlllilIi(iiliIllIIiiIll strideProgress, float sim, float breezeScale, float alpha, float outRoll, float[] outPitch, float[] strideAmp) {
      long var25 = 6909092318614923959L;
      float var7 = Float.isFinite(sim) ? iliIiiliiiii(sim) : 1.0F;
      float var8 = lIiiIiIlilli(var7, strideProgress.IiiiIllilliiiIllil, strideProgress.lliiIllililiiIllil);
      float var9 = lIiiIiIlilli(var7, strideProgress.lIIIllliliIIIlllil, strideProgress.iiiiIllilIIIIlllil);
      float var10 = lIiiIiIlilli(var7, strideProgress.ilIIlllilIiIIlllil, strideProgress.IlIIlllilllIIlllil);
      if (!Float.isFinite(var8)) {
         var8 = 0.0F;
      }

      if (!Float.isFinite(var9)) {
         var9 = 0.0F;
      }

      if (!Float.isFinite(var10)) {
         var10 = 0.0F;
      }

      float var11 = IlIlllIlilIl(0.06F, 0.55F, var10);
      float var12 = (1.0F - var11) * Math.max(0.0F, IIIllIIliIIl(outRoll));
      float var13 = 0.085F * var11 * (0.6F + 0.4F * Math.min(var10, 1.0F));
      float var14 = iliIiiliiiii(IIIllIIliIIl(alpha));
      float var15 = IIIllIIliIIl(breezeScale) * 0.6662F;
      float var16 = (float)Math.cos((double)(2.0F * var15));
      float var17 = (float)Math.cos((double)var15);
      float var18 = (float)Math.sin((double)(1.3194689F * var8));
      float var19 = (float)Math.sin((double)(1.0053097F * var8 + 0.5F));

      for (long var27 = var25 ^ (0L ^ var25) & -1L << 32; (int)(var27 >>> 32) < 14; var27 += 4294967296L) {
         float var21 = iiliIllIIiiIll.IliIlllilIi((int)(var27 >>> 32));
         float var22 = lIiiIiIlilli(var7, strideProgress.llIiIllililIiIllil[(int)(var27 >>> 32)], strideProgress.ililIllilIiilIllil[(int)(var27 >>> 32)]);
         float var23 = lIiiIiIlilli(var7, strideProgress.IiIiIllilliIiIllil[(int)(var27 >>> 32)], strideProgress.IIIiIllillIIiIllil[(int)(var27 >>> 32)]);
         if (var13 > 0.0F) {
            var22 += var13 * (float)Math.pow((double)var21, 1.3) * (float)Math.sin((double)(var9 - 2.6F * var21));
            var23 += var13 * 0.45F * var21 * (float)Math.sin((double)(0.73F * var9 - 2.0F * var21 + 1.1F));
         }

         if (var12 > 0.0F) {
            float var24 = (float)Math.sin((double)(2.3247786F * var8 + 1.3F - 1.2F * var21));
            var22 += 0.04F * var12 * var21 * (0.6F * var18 + 0.4F * var24);
            var23 += 0.027999999F * var12 * var21 * var19;
         }

         if (var14 > 0.0F) {
            var22 += 0.05F * var14 * (0.35F + 0.65F * var21) * var16;
            var23 += 0.04F * var14 * var21 * var17;
         }

         outPitch[(int)(var27 >>> 32)] = var22;
         strideAmp[(int)(var27 >>> 32)] = var23;
      }
   }

   public static void liiiIIllIl(float[] roll, float[] pitch) {
      long var3 = -7252300094188983670L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 14; var5 += 4294967296L) {
         roll[(int)(var5 >>> 32)] = 0.0F;
         pitch[(int)(var5 >>> 32)] = 0.0F;
      }
   }

   private static void IilliliilIIi(float[] env, float[] pitch, IllIlIilllIlIi roll) {
      long var20 = -8296970178179972983L;
      long var22 = 1036274698928400633L;
      float var3 = 0.0F;
      float var4 = 2.0F;
      float var5 = 0.05F;
      float var6 = 0.0F;
      float var7 = roll.IilliliilIIi();
      var20 ^= (0L ^ var20) & -1L << 32;

      while ((int)(var20 >>> 32) < 14) {
         float var9 = env[(int)(var20 >>> 32)];
         float var10 = pitch[(int)(var20 >>> 32)];
         if (!Float.isFinite(var9)) {
            var9 = var5;
         }

         if (!Float.isFinite(var10)) {
            var10 = var6;
         }

         float var11 = iiliIllIIiiIll.iIlIlllllill((int)(var20 >>> 32));
         var10 = iiliIllIIiiIll.IlIillIiilIi(var10, -var11, var11);
         if ((int)(var20 >>> 32) > 0) {
            var10 = iiliIllIIiiIll.IlIillIiilIi(var10, var6 - 0.06F, var6 + 0.06F);
         }

         var9 = iiliIllIIiiIll.IlIillIiilIi(var9, -0.45F, iiliIllIIiiIll.liiiIIllIl((int)(var20 >>> 32)));
         if ((int)(var20 >>> 32) > 0) {
            var9 = iiliIllIIiiIll.IlIillIiilIi(var9, var5 - 0.6F, var5 + 0.6F);
         }

         float var12 = 1.1428572F * (float)Math.cos((double)var10);

         for (var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < 4; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            var22 ^= (0L ^ var22) & -1L << 32;
            float var15 = var3 + var12 * (float)Math.cos((double)var9);
            float var16 = var4 + var12 * (float)Math.sin((double)var9);
            float var17 = roll.IIIllIIliIIl(var15);
            if (var16 < var17 - 1.0E-4F) {
               float var18 = (var17 - var4) / var12;
               if (var18 >= 1.0F) {
                  var9 = (float) (Math.PI / 2);
               } else {
                  float var19 = (float)Math.asin((double)Math.max(var18, -1.0F));
                  var9 = iiliIllIIiiIll.IlIillIiilIi(var9, var19, (float) Math.PI - var19);
               }

               var22 ^= (4294967296L ^ var22) & -1L << 32;
            }

            if (var3 + var12 * (float)Math.cos((double)var9) > var7 + 1.0E-4F) {
               float var27 = (var7 - var3) / var12;
               float var28 = var27 >= 1.0F ? 0.0F : (var27 <= -1.0F ? (float) Math.PI : (float)Math.acos((double)var27));
               if (var9 < var28) {
                  var9 = var28;
                  var22 ^= (4294967296L ^ var22) & -1L << 32;
               }
            }

            if ((int)(var22 >>> 32) == 0) {
               break;
            }
         }

         var9 = iiliIllIIiiIll.IlIillIiilIi(var9, -0.45F, 1.85F);
         env[(int)(var20 >>> 32)] = var9;
         pitch[(int)(var20 >>> 32)] = var10;
         var3 += var12 * (float)Math.cos((double)var9);
         var4 += var12 * (float)Math.sin((double)var9);
         var5 = var9;
         var6 = var10;
         var20 += 4294967296L;
      }
   }

   static float lIiiIiIlilli(float a, float b, float t) {
      return b + (t - b) * a;
   }

   static float IlIlllIlilIl(float x, float e0, float e1) {
      float var3 = iliIiiliiiii((e1 - x) / (e0 - x));
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private lIIIIilliIIIIill() {
   }

   public static void iIlIlllllill(float[] roll, float[] pitch, IllIlIilllIlIi env) {
      long var7 = 1059807653841289187L;
      long var9 = 8013395415715053014L;
      IilliliilIIi(roll, pitch, env);
      var7 ^= (0L ^ var7) & -1L << 32;

      while ((int)(var7 >>> 32) < 3) {
         var7 ^= (0L ^ var7) & -1L >>> 32;

         for (var9 ^= (55834574848L ^ var9) & -1L << 32; (int)(var9 >>> 32) > 0; var9 += -4294967296L) {
            float var6 = Math.min(roll[(int)(var9 >>> 32)] - 0.35F, iiliIllIIiiIll.liiiIIllIl((int)(var9 >>> 32) - 1));
            if (roll[(int)(var9 >>> 32)] <= (float) (Math.PI / 2) && roll[(int)(var9 >>> 32) - 1] < var6) {
               roll[(int)(var9 >>> 32) - 1] = var6;
               var7 ^= (1L ^ var7) & -1L >>> 32;
            }
         }

         if ((int)var7 == 0) {
            return;
         }

         IilliliilIIi(roll, pitch, env);
         var7 += 4294967296L;
      }
   }

   private static float IIIllIIliIIl(float v) {
      return Float.isFinite(v) ? v : 0.0F;
   }
}
