package gg.corz;

import com.corz.client.CorzClient;
import com.corz.client.mixins.AccessorGameRenderer;
import java.awt.Color;
import java.util.Arrays;
import net.minecraft.class_1041;
import net.minecraft.class_1306;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4061;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_9779;
import net.minecraft.class_758.class_4596;
import org.joml.Matrix3x2fStack;

public final class iIlIiiiIllIiii {
   private static IIliiIlllIliiIll liliIiiIIl;
   private static final float ilIlIiiIIl = 2.5F;
   private static final float iiIlIiiIIl = 0.8F;
   private static float IlIIliiIIl;
   private static final int ililIiiIIl = 822083583;
   private static final float liiIIiiIIl = 1.0F;
   private static final float IiIIIiiIIl = 20.0F;
   private static final float[] iIliIiiIIl = new float[10];
   private static final int IIilIiiIIl = 721420287;
   private static final float iliIIiiIIl = 13.5F;
   private static float lIIIliiIIl;
   private static boolean IIiiIiiIIl;
   private static final float[] IiliIiiIIl = new float[1000];
   private static final float iIlIIiiIIl = 22.0F;
   private static int iiiiIiiIIl = -1;
   private static final float[] lIliIiiIIl = new float[10];
   private static final float lIiIIiiIIl = 5.0F;
   private static class_1799 iiliIiiIIl = class_1799.field_8037;
   private static final float IiiIIiiIIl = 12.0F;
   private static int iliiIiiIIl;
   private static final int lIilIiiIIl = -1291845632;
   private static final int llilIiiIIl = -1945104364;
   private static final float[] IIliIiiIIl = new float[10];
   private static final int iillIiiIIl = 184549375;
   private static boolean lIiiIiiIIl;
   private static final float llIlIiiIIl = 7.0F;
   private static final float IiIlIiiIIl = 0.06F;
   private static final int iIilIiiIIl = 1207959551;
   private static final float lliIIiiIIl = 2.0F;
   private static final long[] iiIiIiiIIl = new long[9];
   private static final float lIlIIiiIIl = 7.0F;
   private static final IIlilIliiIli[] llIiIiiIIl = new IIlilIliiIli[9];
   private static int IIIIliiIIl = 2;
   private static final float IllIIiiIIl = 0.8F;
   private static final float[] IlliIiiIIl = new float[10];
   private static final float liIIIiiIIl = 16.0F;
   private static final float illlIiiIIl = 0.95F;
   private static final float lilIIiiIIl = 8.0F;
   private static final class_1792[] ilIiIiiIIl = new class_1792[10];
   private static final Color iiilIiiIIl = new Color(-1, true);
   private static final long[] liIiIiiIIl = new long[10];
   private static final float illIIiiIIl = 0.1F;
   private static final float iIiIIiiIIl = 16.75F;
   private static final int liilIiiIIl = iilIllIiIIiIllIi.IlIlllIlilIl(3, 25);
   private static final float lllIIiiIIl = 1.0F;
   private static final int IlilIiiIIl = 1375731712;
   private static final float llllIiiIIl = 2.2E8F;
   private static final float IlIlIiiIIl = 1.25F;
   private static final class_4587 lIIiIiiIIl = new class_4587();
   private static float llIIliiIIl;
   private static final float lIllIiiIIl = 0.5F;
   private static final float liIlIiiIIl = 42.0F;
   private static final float IillIiiIIl = 2.4E8F;
   private static int liiiIiiIIl = -1;
   private static final float IIiIIiiIIl = 18.5F;
   private static final float IIIlIiiIIl = 3.0F;
   private static final float iIllIiiIIl = 30.0F;
   private static final float llIIIiiIIl = 182.0F;
   private static final float iiiIIiiIIl = 0.12F;
   private static final float IIllIiiIIl = 36.0F;
   private static final IIlilIliiIli IlIiIiiIIl = new IIlilIliiIli();
   private static final float ilIIIiiIIl = 22.0F;
   private static float IiIIliiIIl;
   private static final long lillIiiIIl = 1000000000L;
   private static final float lIIlIiiIIl = 6.0F;
   private static final String[] illiIiiIIl = new String[1000];
   private static final Color IIIiIiiIIl = new Color(-939524096, true);
   private static long iIiiIiiIIl;
   private static final float IlllIiiIIl = 0.55F;
   private static final int iIIIIiiIIl = 9;
   private static final float iIIlIiiIIl = 4.5F;
   private static final float iiIIIiiIIl = 4.5F;
   private static final float IilIIiiIIl = 0.16F;
   private static final float iilIIiiIIl = 0.75F;
   private static final String lIIIIiiIIl = "hotbar";
   private static final IIlilIliiIli iIIiIiiIIl = new IIlilIliiIli();
   private static long IliiIiiIIl;
   private static float iIIIliiIIl;
   private static float ilIIliiIIl;
   private static final float IliIIiiIIl = 16.0F;
   private static final int IlIIIiiIIl = 9;
   private static long lliiIiiIIl;
   private static final int IiilIiiIIl = iilIllIiIIiIllIi.IlIlllIlilIl(6, 24);
   private static final float IIlIIiiIIl = 1.0F;
   private static final int[] IiIiIiiIIl = new int[10];
   private static int IiiiIiiIIl = -1;
   private static final float[] llliIiiIIl = new float[10];

   private static int Iiilliiliiil(float f) {
      return f > 0.5F
         ? IilIIIIililIIIIi.Illlllllilll(
            ((~-178874077 << 31 | ~-178874077 >>> 1) >>> 5 | (~-178874077 << 31 | ~-178874077 >>> 1) << 27) * 1041204193 ^ 1504071447,
            ((-414757448 * -1944890851 ^ -109) * 73 << 21 | (-414757448 * -1944890851 ^ -109) * 73 >>> 11) ^ 319907933,
            (double)((f - 0.5F) * 2.0F)
         )
         : IilIIIIililIIIIi.Illlllllilll(
            -(-(-762957462 - -61)) ^ 761493994, (-750701974 + 57 << 11 | -750701974 + 57 >>> 21) - 71 - -21 ^ -159543484, (double)(f * 2.0F)
         );
   }

   private static float Illlllllilll(long[] i, int now, long starts, float amount) {
      long var5 = i[now];
      if (var5 == (-4528981295559804134L ^ -4528981295559804134L)) {
         return 1.0F;
      } else {
         float var7 = (float)(starts - var5) / 2.4E8F;
         if (var7 >= 1.0F) {
            i[now] = 0L;
            return 1.0F;
         } else {
            return 1.0F + amount * llliIlIlilliIlIl.lIiiIiIlilli(var7);
         }
      }
   }

   private static void iliIiiliiiii(
      class_332 f, class_9779 ctx, class_310 factor, class_746 tc, long dt, int realH, boolean scaled, float realW, float mc, boolean p, int fresh, int now
   ) {
      float var13 = p ? 1.0F / mc : 1.0F;
      float var14 = IIIiiIillIIiiIil.Illlllllilll();
      float var15 = 182.0F * var13;
      float var16 = 22.0F * var13;
      float var17 = (float)(fresh / 2 - 91) * var13;
      float var18 = (float)(now - 22) * var13;
      var17 = llliIlIlilliIlIl.IIIllIIliIIl(var17);
      var18 = llliIlIlilliIlIl.IIIllIIliIIl(var18);
      var15 = llliIlIlilliIlIl.IIIllIIliIIl(var15);
      var16 = llliIlIlilliIlIl.IIIllIIliIIl(var16);
      IiIIliiIIl = var16;
      float var19 = 0.0F;
      float var20 = 0.0F;
      iiIliiiIIlliii var21 = null;
      if (IIililillIililil.lllllillll(IlIillIiilIi<"IlIillIiilIi","SheCx0kGQ+WGLdF7B6eEG9OFYSzxC485Au+eCTZZUWLaKQ==">())) {
         var19 = IIililillIililil.IiiiIlliiiIl(IlIillIiilIi<"IlIillIiilIi","SheCx0kGQ+WGLdF7B6eEG9OFYSzxC485Au+eCTZZUWLaKQ==">());
         var20 = IIililillIililil.iiiiIlIIIIll(IlIillIiilIi<"IlIillIiilIi","SheCx0kGQ+WGLdF7B6eEG9OFYSzxC485Au+eCTZZUWLaKQ==">());
         lIIIliiIIl = var17 + var19;
         iIIIliiIIl = var18 + var20;
         IlIIliiIIl = var15;
         llIIliiIIl = var16;
         liiiIiiIIl = realH;
         var21 = IIililillIililil.ilIIllIiIIll(
            IlIillIiilIi<"IlIillIiilIi","SheCx0kGQ+WGLdF7B6eEG9OFYSzxC485Au+eCTZZUWLaKQ==">(), lIIIliiIIl, iIIIliiIIl, IlIIliiIIl, llIIliiIIl
         );
      }

      float var22 = var17 + (float)Math.round(var19);
      float var23 = var18 + (float)Math.round(var20);
      class_1661 var24 = tc.method_31548();
      int var25 = Math.max(0, Math.min(8, var24.method_67532()));
      class_1799 var26 = tc.method_6079();
      boolean var27 = !var26.method_7960();
      boolean var28 = tc.method_6068().method_5928() == class_1306.field_6182;
      if (scaled) {
         iIIiIiiIIl.IliIlllilIi((float)var25);

         for (int var29 = 0; var29 < 9; var29++) {
            llIiIiiIIl[var29].IliIlllilIi(var29 == var25 ? 1.0F : 0.0F);
         }

         IlIiIiiIIl.IliIlllilIi(var27 ? 1.0F : 0.0F);
         IliiIiiIIl = dt;
         ilIIliiIIl = 0.0F;
      } else if (var25 != IiiiIiiIIl) {
         iiIiIiiIIl[var25] = dt;
      }

      IiiiIiiIIl = var25;
      float var78 = iIIiIiiIIl.iIlIlllllill((float)var25, realW, 42.0F, 0.8F);
      float var30 = IlIiIiiIIl.iIlIlllllill(var27 ? 1.0F : 0.0F, realW, 30.0F, 0.55F);
      if (var27) {
         if (iiliIiiIIl.method_7960() || iiliIiiIIl.method_7909() != var26.method_7909()) {
            iiliIiiIIl = var26.method_7972();
         }
      } else if (var30 <= 0.01F) {
         iiliIiiIIl = class_1799.field_8037;
      }

      float var31 = (float)(dt - IliiIiiIIl) / 2.2E8F;
      float var32 = var31 >= 1.0F ? 1.0F : llliIlIlilliIlIl.iIlIlllllill(var31 / 0.6F);
      float var33 = var31 >= 1.0F ? 1.0F : 0.95F + 0.050000012F * llliIlIlilliIlIl.IilliliilIIi(var31, 1.7F);
      float var34 = 20.0F * var13;
      float var35 = 16.0F * var13;
      float var36 = 1.0F * var13;
      float var37 = 4.5F * var13;
      float var38 = var22 + (var15 - 9.0F * var34) / 2.0F;
      float var39 = var23 + (var16 - var34) / 2.0F;
      float var40 = Math.max(var14, llliIlIlilliIlIl.IIIllIIliIIl(1.0F * var13));
      int var41 = llliIlIlilliIlIl.Illlllllilll();
      float var42 = var38 + var78 * var34;
      if (iIIiIiiIIl.liiiIIllIl()) {
         var42 = llliIlIlilliIlIl.IIIllIIliIIl(var42);
      }

      float var43 = var22 + var15 / 2.0F;
      float var44 = var23 + var16;
      boolean var45 = Math.abs(var33 - 1.0F) > 5.0E-4F;
      float var46 = IliiIilliiIi.IilliliilIIi(var32);
      if (var21 != null) {
         var21.IilliliilIIi(lIIiIiiIIl);
      }

      if (var45) {
         IIIllIIliIIl(lIIiIiiIIl, var43, var44, var33);
      }

      Matrix3x2fStack var47 = f.method_51448();
      var47.pushMatrix();

      try {
         if (p) {
            var47.scale(mc, mc);
         }

         if (var21 != null) {
            var21.IIIllIIliIIl(var47);
         }

         if (var45) {
            var47.translate(var43, var44);
            var47.scale(var33, var33);
            var47.translate(-var43, -var44);
         }

         llliIlIlilliIlIl.Iiilliiliiil(IiilIiiIIl, var22, var23, var15, var16, 1.0F);

         for (int var48 = 0; var48 < 9; var48++) {
            float var49 = llliIlIlilliIlIl.liiiIIllIl(Math.abs((float)var48 - var78) * 1.5F);
            if (var49 > 0.01F) {
               llliIlIlilliIlIl.IIillIiliIil(
                  var38 + (float)var48 * var34 + var36,
                  var39 + var36,
                  var34 - 2.0F * var36,
                  var34 - 2.0F * var36,
                  var37 - var36,
                  0.0F,
                  llliIlIlilliIlIl.iliIiiliiiii(184549375, var49)
               );
            }
         }

         llliIlIlilliIlIl.IIillIiliIil(var42, var39, var34, var34, var37, 0.0F, llliIlIlilliIlIl.iliIiiliiiii(var41, 0.14F));
         llliIlIlilliIlIl.IIillIiliIil(var42, var39, var34, var34, var37, var14, llliIlIlilliIlIl.iliIiiliiiii(var41, 0.9F));
         float var79 = 22.0F * var13;
         float var80 = var28 ? var22 - 29.0F * var13 : var22 + var15 + 7.0F * var13;
         float var50 = llliIlIlilliIlIl.liiiIIllIl(var30);
         float var51 = 0.8F + 0.19999999F * var30;
         boolean var52 = var30 > 0.01F && !iiliIiiIIl.method_7960();
         if (var52) {
            float var53 = IliiIilliiIi.IilliliilIIi(var50);
            boolean var54 = Math.abs(var51 - 1.0F) > 5.0E-4F;
            if (var54) {
               IIIllIIliIIl(lIIiIiiIIl, var80 + var79 / 2.0F, var23 + var16 / 2.0F, var51);
            }

            try {
               llliIlIlilliIlIl.Iiilliiliiil(liilIiiIIl, var80, var23, var79, var16, 1.0F);
            } finally {
               if (var54) {
                  lIIiIiiIIl.method_22909();
               }

               IliiIilliiIi.lIiiIiIlilli(var53);
            }
         }

         boolean var81 = lIiiIiiIIl;

         for (int var82 = 0; var82 < 9; var82++) {
            class_1799 var55 = var24.method_5438(var82);
            IIlllIlliIll(var82, var55, dt, scaled);
            float var56 = llIiIiiIIl[var82].iIlIlllllill(var82 == var25 ? 1.0F : 0.0F, realW, 36.0F, 0.5F);
            if (var55.method_7960()) {
               IlliIiiIIl[var82] = 0.0F;
            } else {
               float var57 = Illlllllilll(iiIiIiiIIl, var82, dt, 0.1F) * Illlllllilll(liIiIiiIIl, var82, dt, 0.16F);
               float var58 = var38 + (float)var82 * var34 + (var34 - var35) / 2.0F;
               float var59 = var23 + (var16 - var35) / 2.0F - var40 * var56;
               lIliIiiIIl[var82] = var58;
               iIliIiiIIl[var82] = var59;
               IlliIiiIIl[var82] = var57;
               llliIiiIIl[var82] = 1.0F;
               IlIlllIlilIl(f, factor, var55, var58, var59, var35, var57, var81);
            }
         }

         IIlllIlliIll(9, var26, dt, scaled);
         IlliIiiIIl[9] = 0.0F;
         if (var52) {
            float var83 = var51 * Illlllllilll(liIiIiiIIl, 9, dt, 0.16F);
            float var85 = var80 + (var79 - var35) / 2.0F;
            float var87 = var23 + (var16 - var35) / 2.0F;
            float var89 = IliiIilliiIi.IilliliilIIi(var50);

            try {
               IlIlllIlilIl(f, factor, var27 ? var26 : iiliIiiIIl, var85, var87, var35, var83, var81 && var27);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var89);
            }

            if (var27) {
               lIliIiiIIl[9] = var85;
               iIliIiiIIl[9] = var87;
               IlliIiiIIl[9] = var83;
               llliIiiIIl[9] = var50;
            }
         }

         boolean var84 = !var81 && IiIlliIliiIl(factor);
         float var86 = 8.0F * var13;
         float var88 = Math.max(var14, llliIlIlilliIlIl.IIIllIIliIIl(0.75F * var13));
         llliIlIlilliIlIl.IIillIiliIil(
            var42 + (var34 - var86) / 2.0F, llliIlIlilliIlIl.IIIllIIliIIl(var23 + 18.5F * var13), var86, var88, var88 / 2.0F, 0.0F, var41
         );
         if (var84) {
            float var90 = ctx.method_60637(true);

            for (int var91 = 0; var91 <= 9; var91++) {
               if (IlliIiiIIl[var91] > 0.0F) {
                  Iilllilliill(
                     tc,
                     var91 < 9 ? var24.method_5438(var91) : var26,
                     var91,
                     lIliIiiIIl[var91],
                     iIliIiiIIl[var91],
                     var35,
                     IlliIiiIIl[var91],
                     llliIiiIIl[var91],
                     var13,
                     var14,
                     var90,
                     realW
                  );
               }
            }
         }

         IIIilIIiiIIi(factor, tc, var28, var22, var23, var15, var16, var13, var14, realW, var41);
      } finally {
         var47.popMatrix();
         if (var45) {
            lIIiIiiIIl.method_22909();
         }

         if (var21 != null) {
            lIIiIiiIIl.method_22909();
         }

         IliiIilliiIi.lIiiIiIlilli(var46);
      }
   }

   public static float liiiIIllIl() {
      return IIililillIililil.Iillllilll() - iliiIiiIIl <= ((~1943377960 >>> 11 | ~1943377960 << 21) ^ -84834995) ? IiIIliiIIl : 0.0F;
   }

   private static void lIiiIiIlilli(class_332 ctx, class_9779 tc, class_310 mc, class_746 p) {
      long var4 = System.nanoTime();
      int var6 = IIililillIililil.Iillllilll();
      boolean var7 = iIiiIiiIIl == 0L || var6 != iliiIiiIIl && var6 != iliiIiiIIl + 1;
      float var8 = var7 ? 0.0F : Math.min(0.05F, (float)(var4 - iIiiIiiIIl) / 1.0E9F);
      iliiIiiIIl = var6;
      iIiiIiiIIl = var4;
      class_1041 var9 = mc.method_22683();
      float var10 = (float)((double)IilliliilIIi(mc, var9, var4) / (double)var9.method_4495());
      boolean var11 = Math.abs(var10 - 1.0F) > 1.0E-4F;
      int var12 = var9.method_4486();
      int var13 = var9.method_4502();
      class_4587 var14 = CorzClient.fontManager.liiiIIllIl();
      class_4587 var15 = IIIiiIillIIiiIil.liiiIIllIl();
      CorzClient.fontManager.iIlIlllllill(lIIiIiiIIl);
      IIIiiIillIIiiIil.IliIlllilIi(lIIiIiiIIl);
      if (var11) {
         IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)var12 / var10);
         IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var13 / var10);
      }

      try {
         iliIiiliiiii(ctx, tc, mc, p, var4, var6, var7, var8, var10, var11, var12, var13);
      } finally {
         if (var11) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
            IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
         }

         CorzClient.fontManager.iIlIlllllill(var14);
         IIIiiIillIIiiIil.IliIlllilIi(var15);
      }
   }

   private static float Ililllililil(IIliiIlllIliiIll font, int text, String n) {
      if (text >= 0 && text < IiliIiiIIl.length) {
         float var3 = IiliIiiIIl[text];
         if (var3 < 0.0F) {
            IiliIiiIIl[text] = var3 = font.iIlIlllllill(n);
         }

         return var3;
      } else {
         return font.iIlIlllllill(n);
      }
   }

   public static boolean IliIlllilIi(class_332 tc, class_9779 ctx) {
      if (!IIiiIiiIIl && tc != null && ctx != null) {
         class_310 var2 = class_310.method_1551();
         class_746 var3 = var2.field_1724;
         if (var3 == null) {
            return false;
         } else {
            try {
               lIiiIiIlilli(tc, ctx, var2, var3);
               return true;
            } catch (Throwable var5) {
               IIiiIiiIIl = true;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private static int IilliliilIIi(class_310 win, class_1041 now, long mc) {
      long var5 = -6527115550422775585L;
      var5 ^= (
            (long)(
                     (now.method_4480() * (~(~(--748672994)) ^ 748673021) + now.method_4507()) * (-(-1923434187 * 84215045 - 113) * -954437177 ^ -866031673)
                        + now.method_4506()
                        + (win.method_1573() ? 1 : 0)
                  )
                  << 32
               ^ var5
         )
         & -1L << 32;
      if ((int)(var5 >>> 32) != iiiiIiiIIl || mc - lliiIiiIIl > (-4592952584593795403L ^ -4592952585240322891L)) {
         iiiiIiiIIl = (int)(var5 >>> 32);
         lliiIiiIIl = mc;
         IIIIliiIIl = now.method_4476(IIililillIililil.iiiIlIIIll(win), win.method_1573());
      }

      return IIIIliiIIl;
   }

   private static void IIlllIlliIll(int st, class_1799 now, long i, boolean fresh) {
      long var8 = 7157229339536837309L;
      var8 ^= ((long)now.method_7960() << 32 ^ var8) & -1L << 32;
      class_1792 var6 = (int)(var8 >>> 32) != 0 ? null : now.method_7909();
      var8 ^= ((long)((int)(var8 >>> 32) != 0 ? 0 : now.method_7947()) ^ var8) & -1L >>> 32;
      if (!fresh && var6 != null && (var6 != ilIiIiiIIl[st] || (int)var8 > IiIiIiiIIl[st])) {
         liIiIiiIIl[st] = i;
      }

      if (var6 != ilIiIiiIIl[st]) {
         IIliIiiIIl[st] = Float.NaN;
      }

      ilIiIiiIIl[st] = var6;
      IiIiIiiIIl[st] = (int)var8;
   }

   private static void IIIllIIliIIl(class_4587 ms, float cy, float s, float cx) {
      ms.method_22903();
      ms.method_46416(cy, s, 0.0F);
      ms.method_22905(cx, cx, 1.0F);
      ms.method_46416(-cy, -s, 0.0F);
   }

   private iIlIiiiIllIiii() {
   }

   static {
      for (int var0 = 0; var0 < 9; var0++) {
         llIiIiiIIl[var0] = new IIlilIliiIli();
      }

      Arrays.fill(IIliIiiIIl, Float.NaN);
   }

   public static void iIlIlllllill() {
      if (liiiIiiIIl == IIililillIililil.Iillllilll()) {
         IIililillIililil.ilIIllIiIIll(
            IlIillIiilIi<"IlIillIiilIi","SheCx0kGQ+WGLdF7B6eEG9OFYSzxC485Au+eCTZZUWLaKQ==">(), lIIIliiIIl, iIIIliiIIl, IlIIliiIIl, llIIliiIIl
         );
      }
   }

   private static boolean IiIlliIliiIl(class_310 mc) {
      try {
         AccessorGameRenderer var1 = (AccessorGameRenderer)mc.field_1773;
         var1.corzGuiRenderer().method_70890(var1.corzFogRenderer().method_71109(class_4596.field_60101));
         return true;
      } catch (Throwable var2) {
         lIiiIiiIIl = true;
         return false;
      }
   }

   private static String IIillIiliIil(int n) {
      if (n >= 0 && n < illiIiiIIl.length) {
         String var1 = illiIiiIIl[n];
         if (var1 == null) {
            illiIiiIIl[n] = var1 = Integer.toString(n);
         }

         return var1;
      } else {
         return Integer.toString(n);
      }
   }

   private static void IIIilIIiiIIi(class_310 u, class_746 mc, boolean bh, float bw, float by, float px, float dt, float accent, float bx, float offLeft, int p) {
      boolean var11 = u.field_1690.method_42565().method_41753() == class_4061.field_18153;
      float var12 = var11 ? llliIlIlilliIlIl.liiiIIllIl(mc.method_7261(0.0F)) : 1.0F;
      float var13 = var12 < 1.0F ? 1.0F : 0.0F;
      ilIIliiIIl = offLeft <= 0.0F ? var13 : ilIIliiIIl + (var13 - ilIIliiIIl) * (1.0F - (float)Math.exp((double)(-offLeft / 0.06F)));
      if (ilIIliiIIl < 0.01F) {
         if (var13 == 0.0F) {
            ilIIliiIIl = 0.0F;
         }
      } else {
         float var14 = 4.5F * accent;
         float var15 = Math.max(bx, llliIlIlilliIlIl.IIIllIIliIIl(1.25F * accent));
         float var16 = var14 + 2.5F * accent;
         float var17 = bh ? bw + px + 7.0F * accent + var16 : bw - 7.0F * accent - var16;
         float var18 = by + dt / 2.0F;
         float var19 = IliiIilliiIi.IilliliilIIi(ilIIliiIIl);

         try {
            llliIlIlilliIlIl.IIillIiliIil(var17 - var16, var18 - var16, var16 * 2.0F, var16 * 2.0F, var16, 0.0F, -1945104364);
            llliIlIlilliIlIl.IIllllIlll(var17, var18, var14, var15, 1.0F, 822083583);
            llliIlIlilliIlIl.IIllllIlll(var17, var18, var14, var15, var12, p);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var19);
         }
      }
   }

   private static void IlIlllIlilIl(class_332 ctx, class_310 size, class_1799 x, float vanillaOverlay, float s, float mc, float st, boolean y) {
      Matrix3x2fStack var8 = ctx.method_51448();
      var8.pushMatrix();

      try {
         if (Math.abs(st - 1.0F) > 5.0E-4F) {
            float var9 = vanillaOverlay + mc / 2.0F;
            float var10 = s + mc / 2.0F;
            var8.translate(var9, var10);
            var8.scale(st, st);
            var8.translate(-var9, -var10);
         }

         var8.translate(vanillaOverlay, s);
         float var14 = mc / 16.0F;
         if (Math.abs(var14 - 1.0F) > 1.0E-4F) {
            var8.scale(var14, var14);
         }

         llllIIlilllIIl.iIlIlllllill(ctx, x, 0, 0, ~(-(-670213572 * -15 * -97)) ^ -203171053);
         if (y) {
            ctx.method_51431(size.field_1772, x, 0, 0);
         }
      } finally {
         var8.popMatrix();
      }
   }

   private static void Iilllilliill(class_746 p, class_1799 dt, int i, float size, float st, float px, float s, float u, float x, float y, float tp, float a) {
      boolean var12 = dt.method_31578();
      int var13 = dt.method_7947();
      float var14 = p.method_7357().method_7905(dt, tp);
      if (!var12) {
         IIliIiiIIl[i] = Float.NaN;
      }

      if (var12 || var13 != 1 || !(var14 <= 0.001F)) {
         boolean var15 = Math.abs(s - 1.0F) > 5.0E-4F;
         if (var15) {
            IIIllIIliIIl(lIIiIiiIIl, size + px / 2.0F, st + px / 2.0F, s);
         }

         float var16 = IliiIilliiIi.IilliliilIIi(u);

         try {
            if (var14 > 0.001F) {
               float var17 = px * Math.min(1.0F, var14);
               llliIlIlilliIlIl.IIillIiliIil(
                  size, st + px - var17, px, var17, Math.min(3.0F * x, var17 / 2.0F), 0.0F, llliIlIlilliIlIl.iliIiiliiiii(1207959551, var14 * 6.0F)
               );
            }

            if (var12) {
               boolean var29 = dt.method_7963();
               float var18 = var29
                  ? llliIlIlilliIlIl.liiiIIllIl(1.0F - (float)dt.method_7919() / (float)Math.max(1, dt.method_7936()))
                  : llliIlIlilliIlIl.liiiIIllIl((float)dt.method_31579() / 13.0F);
               float var19 = IIliIiiIIl[i];
               if (!Float.isNaN(var19) && !(a <= 0.0F)) {
                  var19 += (var18 - var19) * (1.0F - (float)Math.exp((double)(-a / 0.12F)));
                  if (Math.abs(var18 - var19) < 0.002F) {
                     var19 = var18;
                  }
               } else {
                  var19 = var18;
               }

               IIliIiiIIl[i] = var19;
               float var20 = 12.0F * x;
               float var21 = Math.max(y, llliIlIlilliIlIl.IIIllIIliIIl(1.0F * x));
               float var22 = size + 2.0F * x;
               float var23 = llliIlIlilliIlIl.IIIllIIliIIl(st + 13.5F * x);
               llliIlIlilliIlIl.IIillIiliIil(var22 - y, var23 - y, var20 + 2.0F * y, var21 + 2.0F * y, var21 / 2.0F + y, 0.0F, -1291845632);
               llliIlIlilliIlIl.IIillIiliIil(
                  var22, var23, Math.max(var21, var20 * var19), var21, var21 / 2.0F, 0.0F, var29 ? Iiilliiliiil(var19) : 0xFF000000 | dt.method_31580()
               );
            }

            if (var13 != 1) {
               IIliiIlllIliiIll var30 = llliIlIlilliIlIl.IliIlllilIi();
               if (var30 != liliIiiIIl) {
                  liliIiiIIl = var30;
                  Arrays.fill(IiliIiiIIl, -1.0F);
               }

               float var31 = var30.IiIiliIiiiIi();
               if (var31 > 0.01F) {
                  float var33 = 5.0F * x;
                  float var34 = var33 / var31;
                  String var35 = IIillIiliIil(var13);
                  float var36 = Ililllililil(var30, var13, var35) * var34;
                  float var37 = llliIlIlilliIlIl.IIIllIIliIIl(size + 16.75F * x - var36);
                  float var24 = st + 16.0F * x - var33;
                  float var25 = llliIlIlilliIlIl.illilIilil(var24, var33, var34);
                  llliIlIlilliIlIl.Ililllililil(var37, var24, var36, var33, var33 / 2.0F, 1375731712, 2.0F * x, true);
                  llliIlIlilliIlIl.lililiilil(var35, var37 + y, var25 + y, var34, IIIiIiiIIl);
                  llliIlIlilliIlIl.lililiilil(var35, var37, var25, var34, iiilIiiIIl);
               }
            }
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var16);
            if (var15) {
               lIIiIiiIIl.method_22909();
            }
         }
      }
   }
}
