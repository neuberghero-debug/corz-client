package gg.corz;

import com.corz.client.CorzClient;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class ilIlllilIiIlllil {
   private final String[] liIiIiiIil;
   private final class_243[] IIiiIiiIil;
   private final float[] iiIiIiiIil;
   private final int[] lIliIiiIil;
   private final Object[] IlliIiiIil;
   private final String[] liliIiiIil;
   private final int[] llliIiiIil;
   private final String[] iiliIiiIil;
   static final int llIiIiiIil = 6;
   private final long[] illiIiiIil;
   static final float lIIiIiiIil = 72.0F;
   static final float iIIiIiiIil = 0.16F;
   private final float[] IIliIiiIil;
   private final class_4587 IiIiIiiIil = new class_4587();
   static final double ilIiIiiIil = 640.0;
   static final int IlIiIiiIil = 3;
   private final iiliIiiIIiiIii[] iIliIiiIil;
   private final String[] IiliIiiIil;

   public ilIlllilIiIlllil() {
      this.liIiIiiIil = new String[3];
      this.iiIiIiiIil = new float[3];
      this.IIliIiiIil = new float[3];
      this.lIliIiiIil = new int[3];
      this.iIliIiiIil = new iiliIiiIIiiIii[((-1937066069 - -11) * 1749801491 << 19 | (-1937066069 - -11) * 1749801491 >>> 13) * -1022611261 ^ 623095898];
      this.IlliIiiIil = new Object[((1774218819 >>> 27 | 1774218819 << 5) >>> 19 | (1774218819 >>> 27 | 1774218819 << 5) << 13) ^ -1190287609];
      this.llliIiiIil = new int[-978898103 * 111 * 1631000239 ^ -233713617];
      this.illiIiiIil = new long[(-973120234 * -1332920885 * -19 >>> 21 | -973120234 * -1332920885 * -19 << 11) ^ 1869369881];
      this.IiliIiiIil = new String[~(~(-1107852263 << 5 | -1107852263 >>> 27)) + -97 ^ -1091534128];
      this.liliIiiIil = new String[-1191068876 + -97 ^ -1191068971];
      this.iiliIiiIil = new String[((-945281385 >>> 21 | -945281385 << 11) - -13 + -81) * -941362695 ^ 367996983];
      this.IIiiIiiIil = new class_243[(~398739150 * -755159085 << 25 | ~398739150 * -755159085 >>> 7) * 57 ^ 1502098466];
   }

   private class_243 IliIlllilIi(int slot, iiliIiiIIiiIii s) {
      class_243 var3 = this.IIiiIiiIil[slot];
      double var4 = s.IliIlllilIi() + Double.longBitsToDouble(-3652739597564075928L ^ -959587020396519320L);
      double var6 = s.liiiIIllIl() + Double.longBitsToDouble(691393966914524847L ^ 3918636075904421685L);
      double var8 = s.iIlIlllllill() + Double.longBitsToDouble(3453189983751003300L ^ 1156354173792050340L);
      if (var3 == null || var3.field_1352 != var4 || var3.field_1351 != var6 || var3.field_1350 != var8) {
         this.IIiiIiiIil[slot] = var3 = new class_243(var4, var6, var8);
      }

      return var3;
   }

   private static int iliIiiliiiii(int rgb, float alpha255) {
      long var3 = -5694849095765333303L;
      var3 ^= ((long)class_3532.method_15340(Math.round(alpha255), 0, ~(--136335638 - 103) + -93 ^ -136335860) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (((832393547 >>> 1 | 832393547 << 31) << 23 | (832393547 >>> 1 | 832393547 << 31) >>> 9) * 125 ^ 1842246684)
         | rgb & (((~70255015 + -121) * 49 >>> 7 | (~70255015 + -121) * 49 << 25) ^ 1587175632);
   }

   private void lIiiIiIlilli(class_332 cx, IIlIiIlllIlIiIll f, iiliIiiIIiiIii ctx, int dist, double visW, float s, float cy, float visH, float slot) {
      float var11 = class_3532.method_15363(1.1F - (float)visW / 900.0F, 0.78F, 1.0F);
      float var12 = 18.0F * var11;
      float var13 = 7.0F * var11;
      float var14 = 11.0F * var11;
      float var15 = 5.0F * var11;
      if (this.iIliIiiIil[dist] != ctx || this.llliIiiIil[dist] != ctx.IilliliilIIi() || this.IiliIiiIil[dist] == null) {
         this.iIliIiiIil[dist] = ctx;
         this.llliIiiIil[dist] = ctx.IilliliilIIi();
         this.IiliIiiIil[dist] = ctx.IilliliilIIi() + IlIlllIlilIl<"IlIlllIlilIl","Y5rQQ54JZaSj2idE0ay1EEhWphViqLsOVtqn/QY=">();
      }

      List var16 = ctx.IiIlliIliiIl();
      if (this.IlliIiiIil[dist] != var16 || this.liliIiiIil[dist] == null) {
         this.IlliIiiIil[dist] = var16;
         this.liliIiiIil[dist] = var16.isEmpty()
            ? ""
            : IlIlllIlilIl<"IlIlllIlilIl","IQiqCmZ83GR6gws24wtq5nKHfnmI5KY3VqOO7dgx">()
               + String.join(IlIlllIlilIl<"IlIlllIlilIl","3BOWZqc67DhM8jYNCcS9dFN+uaFOrPF3coshdQ5q">(), var16);
      }

      long var17 = visW < 1000.0 ? Math.round(visW) : 1000000L + Math.round(visW / 100.0);
      if (this.illiIiiIil[dist] != var17 || this.iiliIiiIil[dist] == null) {
         this.illiIiiIil[dist] = var17;
         this.iiliIiiIil[dist] = IlIlllIlilIl<"IlIlllIlilIl","IQiqCmZ83GR6gws24wtq5nKHfnmI5KY3VqOO7dgx">() + lilIIiiliilIIiil.IliIlllilIi(visW);
      }

      String var19 = this.IiliIiiIil[dist];
      String var20 = this.liliIiiIil[dist];
      String var21 = this.iiliIiiIil[dist];
      float var22 = f.Iiilliiliiil(var19, var14);
      float var23 = f.Iiilliiliiil(var20, var14);
      float var24 = f.Iiilliiliiil(var21, var14);
      float var25 = var13 + var22 + var23 + var24 + var13;
      float var26 = s - var25 / 2.0F;
      float var27 = cy - var12;
      if (!(var26 + var25 + 16.0F < 0.0F) && !(var26 - 16.0F > visH) && !(var27 + var12 + 16.0F < 0.0F) && !(var27 - 16.0F > slot)) {
         IIIiiIillIIiiIil.Ililllililil(cx, var26, var27, var25, var12, var15, -233499369, 620756991);
         float var28 = var26 + var13;
         float var29 = var27 + (var12 - f.IlIillIiilIi(var14)) / 2.0F;
         int var30 = 0;
         this.liIiIiiIil[var30] = var19;
         this.iiIiIiiIil[var30] = var28;
         this.lIliIiiIil[var30++] = liiiIIllIl(ctx.IilliliilIIi());
         var28 += var22;
         if (!var20.isEmpty()) {
            this.liIiIiiIil[var30] = var20;
            this.iiIiIiiIil[var30] = var28;
            this.lIliIiiIil[var30++] = -1;
            var28 += var23;
         }

         this.liIiIiiIil[var30] = var21;
         this.iiIiIiiIil[var30] = var28;
         this.lIliIiiIil[var30++] = -6645087;

         for (int var31 = 0; var31 < var30; var31++) {
            this.IIliIiiIil[var31] = var29;
         }

         f.Iilililiiili(this.liIiIiiIil, this.iiIiIiiIil, this.IIliIiiIil, this.lIliIiiIil, var30, var14);
      }
   }

   public void iIlIlllllill(List<iiliIiiIIiiIii> tracers, boolean beams, boolean sites) {
      if (!tracers.isEmpty()) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1724 != null) {
            class_243 var5 = var4.field_1773.method_19418().method_71156();
            Matrix4f var6 = iIiiIIilIliiIIil.IIillIiliIil();
            class_4588 var7 = beams ? iIiiIIilIliiIIil.IilliliilIIi() : null;
            float var8 = 0.85F + 0.15F * (float)Math.sin((double)(System.currentTimeMillis() % 10000L) / 1000.0 * 2.4);

            for (int var9 = 0; var9 < tracers.size(); var9++) {
               iiliIiiIIiiIii var10 = (iiliIiiIIiiIii)tracers.get(var9);
               int var11 = liiiIIllIl(var10.IilliliilIIi()) & 16777215;
               double var12 = var10.IliIlllilIi() + 0.5;
               double var14 = var10.liiiIIllIl();
               double var16 = var10.iIlIlllllill() + 0.5;
               double var18 = var12 - var5.field_1352;
               double var20 = var16 - var5.field_1350;
               double var22 = Math.sqrt(var18 * var18 + var20 * var20);
               float var24 = (float)class_3532.method_15350(1.0 - (var22 - 900.0) / 1400.0, 0.35, 1.0);
               if (var7 != null) {
                  float var25 = var22 > 0.001 ? (float)(var20 / var22) : 1.0F;
                  float var26 = var22 > 0.001 ? (float)(-var18 / var22) : 0.0F;
                  float var27 = 0.16F * (float)class_3532.method_15350(var22 / 48.0, 1.0, 6.0);
                  float var28 = iIiiIIilIliiIIil.Ililllililil(var12);
                  float var29 = iIiiIIilIliiIIil.IIIilIIiiIIi(var16);
                  float var30 = iIiiIIilIliiIIil.Iiilliiliiil(var14);
                  float var31 = iIiiIIilIliiIIil.Iiilliiliiil(var14 + 72.0);
                  int var32 = iliIiiliiiii(var11, 150.0F * var24 * var8);
                  int var33 = iliIiiliiiii(var11, 0.0F);
                  iIiiIIilIliiIIil.IlIlllIlilIl(
                     var7,
                     var6,
                     var28 + var25 * var27,
                     var30,
                     var29 + var26 * var27,
                     var32,
                     var28 - var25 * var27,
                     var30,
                     var29 - var26 * var27,
                     var32,
                     var28 - var25 * var27,
                     var31,
                     var29 - var26 * var27,
                     var33,
                     var28 + var25 * var27,
                     var31,
                     var29 + var26 * var27,
                     var33
                  );
                  iIiiIIilIliiIIil.IlIlllIlilIl(
                     var7,
                     var6,
                     var28 - var26 * var27,
                     var30,
                     var29 + var25 * var27,
                     var32,
                     var28 + var26 * var27,
                     var30,
                     var29 - var25 * var27,
                     var32,
                     var28 + var26 * var27,
                     var31,
                     var29 - var25 * var27,
                     var33,
                     var28 - var26 * var27,
                     var31,
                     var29 + var25 * var27,
                     var33
                  );
               }

               if (beams) {
                  float var34 = 0.5F;
                  iIiiIIilIliiIIil.iIIIlIlIIl(
                     var6,
                     iIiiIIilIliiIIil.Ililllililil(var12 - (double)var34),
                     iIiiIIilIliiIIil.Iiilliiliiil(var14 - (double)var34),
                     iIiiIIilIliiIIil.IIIilIIiiIIi(var16 - (double)var34),
                     iIiiIIilIliiIIil.Ililllililil(var12 + (double)var34),
                     iIiiIIilIliiIIil.Iiilliiliiil(var14 + (double)var34),
                     iIiiIIilIliiIIil.IIIilIIiiIIi(var16 + (double)var34),
                     iliIiiliiiii(var11, 230.0F * var24),
                     1.6F
                  );
               }

               if (sites && var9 < 3) {
                  Iillllilll.Iilllilliill(var12, var14, var16, var11 | 0xFF000000, var9 == 0);
               }
            }
         }
      }
   }

   public void IilliliilIIi(class_332 ctx, List<iiliIiiIIiiIii> sites) {
      if (!sites.isEmpty()) {
         class_310 var3 = class_310.method_1551();
         if (var3.field_1724 != null && var3.field_1755 == null) {
            CorzClient.fontManager.iIlIlllllill(this.IiIiIiiIil);
            IIIiiIillIIiiIil.IliIlllilIi(this.IiIiIiiIil);
            double var4 = (double)var3.method_22683().method_4495();
            int var6 = var3.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var3), var3.method_1573());
            float var7 = (float)((double)var6 / var4);
            boolean var8 = Math.abs(var7 - 1.0F) > 1.0E-4F;
            if (var8) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)var3.method_22683().method_4486() / var7);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var3.method_22683().method_4502() / var7);
            }

            IIlIiIlllIlIiIll var9 = IIlIiIlllIlIiIll.lIiiIiIlilli();
            IIlIiIlllIlIiIll var10 = var9.IIillIiliIil() ? var9 : IIlIiIlllIlIiIll.liiiIIllIl();

            try {
               if (!var10.IIillIiliIil()) {
                  return;
               }

               class_243 var11 = var3.field_1773.method_19418().method_71156();
               float var12 = IliiIilliiIi.lIIlllIIliIIlllIIl > 0.0F
                  ? IliiIilliiIi.lIIlllIIliIIlllIIl
                  : (float)var3.method_22683().method_4489() / (float)var3.method_22683().method_4495();
               float var13 = IliiIilliiIi.IlIlllIIlllIlllIIl > 0.0F
                  ? IliiIilliiIi.IlIlllIIlllIlllIIl
                  : (float)var3.method_22683().method_4506() / (float)var3.method_22683().method_4495();
               int var14 = Math.min(6, sites.size());

               for (int var15 = var14 - 1; var15 >= 0; var15--) {
                  iiliIiiIIiiIii var16 = (iiliIiiIIiiIii)sites.get(var15);
                  double var17 = var16.IliIlllilIi() + 0.5 - var11.field_1352;
                  double var19 = var16.liiiIIllIl() - var11.field_1351;
                  double var21 = var16.iIlIlllllill() + 0.5 - var11.field_1350;
                  double var23 = Math.sqrt(var17 * var17 + var19 * var19 + var21 * var21);
                  if (var15 <= 0 || !(var23 > 640.0)) {
                     class_243 var25 = llilllililll.iIlIlllllill(this.IliIlllilIi(var15, var16));
                     if (var25 != null && !(var25.field_1350 <= 0.0) && !(var25.field_1350 >= 1.0)) {
                        this.lIiiIiIlilli(
                           ctx,
                           var10,
                           var16,
                           var15,
                           Math.sqrt(var17 * var17 + var21 * var21),
                           (float)(var25.field_1352 / (double)var7),
                           (float)(var25.field_1351 / (double)var7),
                           var12,
                           var13
                        );
                     }
                  }
               }
            } finally {
               if (var8) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }
            }
         }
      }
   }

   public static int liiiIIllIl(int score) {
      if (score >= (-(((-874437922 ^ 117) << 25 | (-874437922 ^ 117) >>> 7) + 109) ^ -1469563643)) {
         return ~(~1271352555) * 1527099483 ^ 19860200;
      } else {
         return score >= (-(-(-119506989) - 41) ^ -119506997)
            ? ((646782468 + -25 >>> 29 | 646782468 + -25 << 3) * -79 << 9 | (646782468 + -25 >>> 29 | 646782468 + -25 << 3) * -79 >>> 23) ^ -1011907957
            : -1680803507 + -67 + 45 ^ 1689209800;
      }
   }

   static String IIIllIIliIIl(double v) {
      return String.format(Locale.ROOT, IlIlllIlilIl<"IlIlllIlilIl","0hwHeRFlKib9RUuy7xixvRnHi+3hZDXA3chiWjBSRiE=">(), v);
   }
}
