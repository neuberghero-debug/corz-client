package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import net.minecraft.class_1041;
import net.minecraft.class_1109;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_4185;
import net.minecraft.class_419;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_500;
import net.minecraft.class_634;
import net.minecraft.class_638;
import org.joml.Matrix4f;

public final class lIiilliIiill extends class_437 implements Illillliilli, Iilililiiili {
   private static final float IIllliIilIllliIi = 260.0F;
   private static final float iIiIliIiIliIliIi = 4.0F;
   private static final float IIIIliIilIIIliIi = 16.0F;
   private static final float iliiIiIiIiiiIiIi = 0.95F;
   private final int IiiliiIiliiliiIi;
   private static final int iIlIiiIiIllIiiIi = 2;
   private final class_2960[] llIIIIliilIIIIli;
   private static final int IlllIiIillllIiIi = 99;
   private static final float lIiIiiIiiIiIiiIi = 24.0F;
   private static final float IillliIilillliIi = 760.0F;
   private final float[] IllIIIlilllIIIli;
   private static final int IlIIiiIillIIiiIi = -7630437;
   private static final float lIliliIiiIliliIi = 0.8F;
   private float liIlIIliiiIlIIli;
   private final int iiiliiIiIIIiiiIi;
   private long iiIiIIliIIliIIli;
   private static final int lIllIiIiiIllIiIi = 88;
   private static final float lIlIliIiiIlIliIi = 320.0F;
   private static final int lliiliIiiliiliIi = -8393375;
   private static final float ilIlliIiIiIlliIi = 900.0F;
   private final Runnable illIIIliIilIIIli;
   private static final float IiIiliIiliIiliIi = -9.0F;
   private IIliiIlllIliiIll IIiIIIlilIiIIIli;
   private final String[] liiiiiIiiiiiiiIi;
   private static final int liIIiiIiiiIIiiIi = 0;
   private final String llliiiIiilliiiIi;
   private long lIliIIliiIliIIli;
   private int IlliIIlillliIIli;
   private static final float liilliIiiiilliIi = 1300.0F;
   private static final String[] IilIiiIililIiiIi = new String[]{
      IliIlllilIi<"IliIlllilIi","SjuV2BhWKowAJXqhvDjqybqZqoOKKro+6s5Ob4Fpqag=">(),
      IliIlllilIi<"IliIlllilIi","rcCu10HEMXw1qfgTYBoUjNDN9oOj1svkhP2BHGrehvmw">(),
      IliIlllilIi<"IliIlllilIi","XAKUcIwdaXPoW/3q5vs098zwqi8lk/U46qK4xmvKyLKD">(),
      IliIlllilIi<"IliIlllilIi","3pAqgGR4hejsQqF1YFJwfY1RUCn2z2HOBu2vWG08bRrmcg==">(),
      IliIlllilIi<"IliIlllilIi","/cP5v7RZdaKFqpNbwctjEwLuCoDRoa8JeyxVOfoPMSfJR0idhA==">(),
      IliIlllilIi<"IliIlllilIi","weV6g6OjRnN3Kj5bJp6qHGeHmqxdvK9gxkBKhSRgFymq">(),
      IliIlllilIi<"IliIlllilIi","y21XVDcDqGIVKMkl1YaZS57luiCgogpjmIV5LcfSPA==">(),
      IliIlllilIi<"IliIlllilIi","BwqsidT7+9b3Gb1+sC+Tr7q7d0nTNdcVlHVn454jqRI=">()
   };
   private static final float IllIliIilllIliIi = 120.0F;
   private static final int IIliIiIilIliIiIi = 22;
   private final Runnable lilIIIliiilIIIli;
   private float IlIlIIlillIlIIli;
   private final String[] IIIIIIlilIIIIIli;
   private static final int IiliIiIililiIiIi = 117;
   private static final int lililiIiiililiIi = -16050415;
   private final String IIliiiIilIliiiIi;
   private static final float[] IIIliiIilIIliiIi = new float[49];
   private static final float[] iiIliiIiIIlliiIi = new float[12];
   private static final int iiIIliIiIIlIliIi = 150994943;
   private final String lIiiiiIiiIiiiiIi;
   private final String lIIiiiIiiIIiiiIi;
   private static final int IIiiliIilIiiliIi = -15265270;
   private Color IlilIIlillilIIli;
   private static final float[] IllliiIilllliiIi = new float[12];
   private static final float IIIiliIilIIiliIi = 2600.0F;
   private class_4185 llIiIIliilIiIIli;
   private static final float[] llIliiIiilIliiIi = new float[49];
   private static final float IiIIliIiliIIliIi = 29.0F;
   private static final float illIliIiIilIliIi = 70.0F;
   private static final int iiiiliIiIIIIiiIi = -920587;
   private static final float lIIlliIiiIIlliIi = 280.0F;
   private final int lliliiIiililiiIi;
   private static final int IiilIiIiliilIiIi = 8;
   private final class_437 lilliiIiiilliiIi;
   private static final float[] illliiIiIilliiIi = new float[12];
   private static final float[] lIlliiIiiIlliiIi = new float[12];
   private static final float iIIiliIiIlIiliIi = 1100.0F;
   private static final float llllliIiilllliIi = 360.0F;
   private boolean iillIIliIIilIIli;
   private static final float ililliIiIiilliIi = 1300.0F;
   private static final int lIIIiiIiiIIIiiIi = -4932924;
   private static final int IiiiliIiliiiliIi = -1535700;
   private static final float liiiIiIiiiiiIiIi = 0.76F;
   private static final int llIlIiIiilIlIiIi = 72;
   private float iiiIIIliIIIlIIli;
   private static final float iIIlIiIiIlIlIiIi = 40.0F;
   private final String liIiiiIiiiIiiiIi;
   private final boolean iIiliiIiIliliiIi;
   private static final class_3414 lllIiiIiillIiiIi = class_3414.method_47908(
      class_2960.method_60655(
         IliIlllilIi<"IliIlllilIi","xSzZmHY08dOBrTY6vT3zGC21W8ZAgHKQ/EfWITo8rJm12y/w+m0=">(),
         IliIlllilIi<"IliIlllilIi","rFJBDeVeeXg4Ph1lOuJvjDsz5Av485tH6xOzgiIhpg9UWef+R4nUsdI=">()
      )
   );
   private static final float lilIliIiiilIliIi = 38.0F;
   private boolean iIIiIIliIlIiIIli;
   private String IiiIIIliliiIIIli;
   private static final float llIIliIiilIIliIi = 6.0F;
   private static final float liIlliIiiiIlliIi = 18.0F;
   private static final float IIIlIiIilIIlIiIi = 22.0F;
   private static final int iIiiliIiIliiliIi = -16052976;
   private final String iiliiiIiIIiiiiIi;
   private static final float lIilliIiiIilliIi = 320.0F;
   private static final float IIiIliIilIiIliIi = 230.0F;
   private final lliIIIililiIIIil IIiliiIilIiliiIi;
   private static final float iliIiiIiIiiIiiIi = 135.0F;
   private int illiIIliIiliIIli;
   private static final int iIliIiIiIlliIiIi = 6;
   private static final int iiilIiIiIIIiIiIi = 165;
   private boolean liilIIliiiilIIli;
   private static final float iIIIliIiIlIIliIi = 10.0F;
   private float llllIIliilllIIli;
   private static final float IliiIiIilliiIiIi = 0.82F;
   private static final int lIiiIiIiiIiiIiIi = -4000;
   private final iIliililIlliilil lIlIIIliiIlIIIli;
   private static final float IiiIliIiliiIliIi = 380.0F;
   private static final int iilIiiIiIIiIiiIi = 48;
   private static final Color ilIIiiIiIiIIiiIi = new Color(-1, true);
   private static final float iiiIliIiIIIlliIi = 300.0F;
   private final String[] iliiiiIiIiiiiiIi = new String[8];
   private static final float IlIlliIillIlliIi = 220.0F;
   private String iIiIIIliIliIIIli;
   private boolean IIIiIIlilIIiIIli;
   private float iIllIIliIlllIIli;
   private static final float[] iIIliiIiIlIliiIi = new float[49];
   private static final int iIilIiIiIlilIiIi = 2;
   private boolean ililIIliIiilIIli;
   private static final int IlIiIiIillIiIiIi = 5;
   private static final int iiliIiIiIIiiIiIi = 16;
   private float IillIIlilillIIli;
   private static final int llliIiIiilliIiIi = 332;
   private static final float IliIiiIilliIiiIi = 296.0F;
   private static final int lIIiIiIiiIIiIiIi = 26;
   private final String iIliiiIiIlliiiIi;
   private static final float iillliIiIIilliIi = 1040.0F;
   private static final float IlilliIillilliIi = 2200.0F;
   private float lIIlIIliiIIlIIli;
   private String lliIIIliiliIIIli;
   private static final int IIlIiiIilIlIiiIi = 1;
   private static final int ilIiIiIiIiIiIiIi = 6;
   private final String IliiiiIilliiiiIi;
   private final IIllIIIllIllIIIl iiIIIIliIIlIIIli;
   private static final int liiIIiIiiiiIIiIi = 18;
   private float IIllIIlilIllIIli;
   private static final int llilIiIiililIiIi = 4;
   private final String IiliiiIililiiiIi;
   private static final float lliIliIiiliIliIi = 110.0F;
   private final class_4587 IiIIIIliliIIIIli;
   private static final int iiIlIiIiIIllIiIi = 10;
   private static final float IlliliIillliliIi = 5.0F;
   private static final int IiIliiIiliIliiIi = 12;
   private static final float llIiliIiilIiliIi = 0.08F;
   private float IIiiIIlilIiiIIli;
   private static final float[] liiIiiIiiiiIiiIi = new float[49];
   private int lIilIIliiIilIIli;
   private float ilIlIIliIiIlIIli;
   private static final int lillIiIiiillIiIi = 34;
   private final String IlIiiiIillIiiiIi;
   private static final int IIilIiIilIilIiIi = 157;
   private final String ilIiiiIiIiIiiiIi;
   private static final int liIiIiIiiiIiIiIi = 296;
   private final String[] iIIIIIliIlIIIIli;
   private static final float iiIiliIiIIliliIi = 0.75F;
   private static final float iIllliIiIlllliIi = 820.0F;
   private float liliIIliiiliIIli;
   private static final int iliIIiIiIiiIIiIi = 320;
   private class_4185 IiIiIIliliIiIIli;
   private static final int IiIlIiIiliIlIiIi = 14;
   private static final int illlIiIiIillIiIi = 117;
   private static final int illiliIiIililiIi = -12922502;

   public void method_25394(class_332 ctx, int mx, int delta, float my) {
      if (!this.liilIIliiiilIIli) {
         try {
            if (!this.IlIlllIlilIl(ctx, mx, delta)) {
               return;
            }
         } catch (Throwable var6) {
            this.liilIIliiiilIIli = true;
            this.illiIIliIiliIIli = 0;
            IliiIilliiIi.ilIlllIIlIiIlllIIl = 1.0F;
         }
      }

      if (this.liilIIliiiilIIli) {
         if (this.lIliIIliiIliIIli != (-8146446140205980160L ^ -8146446140205980160L)) {
            this.lliIliliIl(this.IlliIIlillliIIli);
            return;
         }

         this.lilIliilIl(ctx);
      }

      super.method_25394(ctx, mx, delta, my);
   }

   private void Iilililiiili(class_332 ctx, int tw, float ty, float i, float tx) {
      IIIiiIillIIiiIil.Iilllilliill(ctx, ty, i, tx, 26.0F, 6.0F, 150994943, 352321535);
      float var6 = i + 5.0F;
      IIIiiIillIIiiIil.IlIlllIlilIl(ctx, ty + 6.0F, var6, 16.0F, 16.0F, 5.0F, llilliilililliil.IIIIllIIIl(iIIIlIlIIl(), 0.13F));
      class_2960 var7 = this.llIIIIliilIIIIli[tw];
      if (var7 != null) {
         float var8 = 3.0F;
         iiIlilIlIIllilIl.IliIlllilIi(ty + 6.0F + var8, var6 + var8, 10.0F, 10.0F, var7, this.IIIIllIIIl(), IIIiiIillIIiiIil.liiiIIllIl());
      }

      float var9 = ty + 29.0F;
      llilliilililliil.lIlIliIlIl(this.IIIIIIlilIIIIIli[tw], var9, llilliilililliil.IllIllllIl(i + 3.0F, 10.0F, 0.82F), 0.82F, -7630437);
      llilliilililliil.lIlIliIlIl(this.iIIIIIliIlIIIIli[tw], var9, llilliilililliil.IllIllllIl(i + 12.0F, 12.0F, 0.95F), 0.95F, -920587);
   }

   private void IIillIiliIil(class_332 ms, float cy, float ctx, float cx) {
      if (!(cx <= 0.0F) && !(cx >= 820.0F)) {
         float var5 = cx / 820.0F;
         float var6 = llilliilililliil.liiiIIllIl(var5);
         float var7 = (1.0F - var5) * (1.0F - var5);
         int var8 = iIIIlIlIIl();

         for (int var9 = 0; var9 < 12; var9++) {
            float var10 = 25.0F + IllliiIilllliiIi[var9] * var6;
            float var11 = illliiIiIilliiIi[var9] * (1.0F - 0.5F * var5);
            float var12 = cy + iiIliiIiIIlliiIi[var9] * var10 - var11 / 2.0F;
            float var13 = ctx + lIlliiIiiIlliiIi[var9] * var10 + 6.0F * var5 * var5 - var11 / 2.0F;
            int var14 = var9 % 3 == 0 ? -1 : (var9 % 3 == 1 ? this.lliliiIiililiiIi : var8);
            IIIiiIillIIiiIil.IlIlllIlilIl(ms, var12, var13, var11, var11, var11 / 2.0F, llilliilililliil.IIIIllIIIl(var14, var7));
         }
      }
   }

   static {
      float var0 = 24.0F;
      float var1 = 296.0F;
      float var2 = var1 - var0;
      float var3 = 135.0F;
      float var4 = var0 + 0.32F * var2;
      float var5 = var3 - 30.0F;
      float var6 = var0 + 0.66F * var2;
      float var7 = var3 + 14.0F;
      float var8 = var3 - 6.0F;

      for (int var9 = 0; var9 <= 48; var9++) {
         float var10 = (float)var9 / 48.0F;
         float var11 = 1.0F - var10;
         float var12 = var11 * var11 * var11;
         float var13 = 3.0F * var11 * var11 * var10;
         float var14 = 3.0F * var11 * var10 * var10;
         float var15 = var10 * var10 * var10;
         liiIiiIiiiiIiiIi[var9] = var12 * var0 + var13 * var4 + var14 * var6 + var15 * var1;
         IIIliiIilIIliiIi[var9] = var12 * var3 + var13 * var5 + var14 * var7 + var15 * var8;
         float var16 = 3.0F * var11 * var11 * (var4 - var0) + 6.0F * var11 * var10 * (var6 - var4) + 3.0F * var10 * var10 * (var1 - var6);
         float var17 = 3.0F * var11 * var11 * (var5 - var3) + 6.0F * var11 * var10 * (var7 - var5) + 3.0F * var10 * var10 * (var8 - var7);
         float var18 = (float)Math.sqrt((double)(var16 * var16 + var17 * var17));
         iIIliiIiIlIliiIi[var9] = var18 < 1.0E-4F ? 0.0F : -var17 / var18;
         llIliiIiilIliiIi[var9] = var18 < 1.0E-4F ? 1.0F : var16 / var18;
      }

      for (int var19 = 0; var19 < 12; var19++) {
         double var20 = (double)var19 * (Math.PI / 6) + (double)(var19 * 37 % 11) / 11.0 * 0.35;
         iiIliiIiIIlliiIi[var19] = (float)Math.cos(var20);
         lIlliiIiiIlliiIi[var19] = (float)Math.sin(var20);
         IllliiIilllliiIi[var19] = 8.0F + (float)(var19 * 53 % 7) * 1.6F;
         illliiIiIilliiIi[var19] = 1.8F + (float)(var19 * 29 % 5) * 0.25F;
      }
   }

   private static float lIlIliIlIl(double seconds) {
      return (float)(
         (
               Math.sin(
                     (double)System.nanoTime()
                        / Double.longBitsToDouble(-4538565473702816315L ^ -9165375158606146107L)
                        * Double.longBitsToDouble(6818341578021861744L ^ 2204156261547693160L)
                        * Double.longBitsToDouble(8085513082716202529L ^ 3473827064288814625L)
                        / seconds
                  )
                  + 1.0
            )
            / Double.longBitsToDouble(4817889284398278483L ^ 206203265970890579L)
      );
   }

   public boolean method_25404(class_11908 input) {
      long var3 = 6475100708747011637L;
      var3 ^= ((long)input.comp_4795() << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) == ((~(568554938 + -47) + 111) * 113 ^ 177819443)) {
         this.IIiIllIiIl(0);
         return true;
      } else if ((int)(var3 >>> 32) != (-(-(1875048716 + -11)) - 41 ^ 1875048921) && (int)(var3 >>> 32) != (1175747469 * -2083697005 * -121 ^ -675128050)) {
         return this.liilIIliiiilIIli ? super.method_25404(input) : true;
      } else {
         this.IIiIllIiIl(1);
         return true;
      }
   }

   private void IIlllIlliIll(class_332 ctx, int my, int mx, int py, int px) {
      float var6 = (float)my + 160.0F;
      float var7 = (float)(my + 18);
      float var8 = 284.0F;
      this.Illlllllilll(ctx, var6, (float)mx + 40.0F);
      if (this.IiIIlliIIl(this.llIIlilIIl(1))) {
         try {
            llilliilililliil.IiiIlliiIl(ctx, this.iIiIIIliIliIIIli, llilliilililliil.IIIllIIliIIl(var6 - this.iiiIIIliIIIlIIli / 2.0F), (float)(mx + 72), 14.0F);
         } finally {
            this.iiIIlIIlIl();
         }
      }

      if (this.IiIIlliIIl(this.llIIlilIIl(2))) {
         try {
            this.Ililllililil(var6, mx);
         } finally {
            this.iiIIlIIlIl();
         }
      }

      if (this.IiIIlliIIl(this.llIIlilIIl(3))) {
         try {
            this.Iiilliiliiil(ctx, my, mx);
         } finally {
            this.iiIIlIIlIl();
         }
      }

      if (this.IiIIlliIIl(this.llIIlilIIl(4))) {
         try {
            IIIiiIillIIiiIil.IilliliilIIi(ctx, var7, (float)(mx + 157), var8, IIIiiIillIIiiIil.Illlllllilll(), IilIIIIililIIIIi.IIillIiliIil());
         } finally {
            this.iiIIlIIlIl();
         }
      }

      float var9 = Iiiiliiiiiii();

      for (int var10 = 0; var10 < 8; var10++) {
         int var11 = var10 / 2;
         int var12 = var10 % 2;
         if (this.IiIIlliIIl(this.llIIlilIIl(4 + var11))) {
            try {
               this.Iilililiiili(ctx, var10, var7 + (float)var12 * (var9 + 5.0F), (float)(mx + 165 + var11 * 31), var9);
            } finally {
               this.iiIIlIIlIl();
            }
         }
      }

      if (this.IiIIlliIIl(this.llIIlilIIl(8))) {
         try {
            this.IIiilIiiiIii(ctx, var7, var8, (float)(mx + 296), py, px);
         } finally {
            this.iiIIlIIlIl();
         }
      }
   }

   private void Illlllllilll(class_332 ctx, float cy, float cx) {
      float var4 = 22.0F * llilliilililliil.IilliliilIIi((this.liliIIliiiliIIli - 110.0F) / 380.0F, 1.7F);
      if (!(var4 <= 0.25F)) {
         this.Iilllilliill(ctx, cy, cx, this.liliIIliiiliIIli - 280.0F);
         this.Iilllilliill(ctx, cy, cx, this.liliIIliiiliIIli - 280.0F - 220.0F);
         if (this.iIiliiIiIliliiIi) {
            this.IIillIiliIil(ctx, cy, cx, this.liliIIliiiliIIli - 260.0F);
         }

         float var5 = lIlIliIlIl(2.8);
         IIIiiIillIIiiIil.IiIlliIliiIl(
            ctx, cy - var4, cx - var4, var4 * 2.0F, var4 * 2.0F, var4, llilliilililliil.IIIIllIIIl(this.lliliiIiililiiIi, 0.3F + 0.08F * var5), 16.0F, 0.9F
         );
         IIIiiIillIIiiIil.IlIlllIlilIl(ctx, cy - var4, cx - var4, var4 * 2.0F, var4 * 2.0F, var4, this.lliliiIiililiiIi);
         float var6 = llilliilililliil.liiiIIllIl((this.liliIIliiiliIIli - 300.0F) / 200.0F);
         if (!(var6 <= 0.002F)) {
            boolean var7 = llilliilililliil.IlIlllIlilIl(
               ctx, cy, cx, 0.6F + 0.4F * llilliilililliil.IilliliilIIi((this.liliIIliiiliIIli - 300.0F) / 300.0F, 2.0F)
            );

            try {
               if (this.iIiliiIiIliliiIi) {
                  Color var8 = var6 >= 1.0F ? ilIIiiIiIiIIiiIi : new Color(llilliilililliil.IIIIllIIIl(-1, var6), true);
                  iiIlilIlIIllilIl.IliIlllilIi(cy - 12.0F, cx - 12.0F, 24.0F, 24.0F, lIlIIiliIlIIil.liiiIIllIl(), var8, IIIiiIillIIiiIil.liiiIIllIl());
               } else {
                  int var12 = llilliilililliil.IIIIllIIIl(-1, var6);
                  IIIiiIillIIiiIil.IlIlllIlilIl(ctx, cy - 1.7F, cx - 9.0F, 3.4F, 11.0F, 1.7F, var12);
                  IIIiiIillIIiiIil.IlIlllIlilIl(ctx, cy - 1.9F, cx + 4.2F, 3.8F, 3.8F, 1.9F, var12);
               }
            } finally {
               llilliilililliil.IiIlliIliiIl(ctx, var7);
            }
         }
      }
   }

   private void illIlIilIl() {
      try {
         class_310.method_1551()
            .method_1483()
            .method_4873(
               this.iIiliiIiIliliiIi ? class_1109.method_4757(lllIiiIiillIiiIi, 1.0F, 0.8F) : class_1109.method_4757(class_3417.field_14561, 1.0F, 1.0F)
            );
      } catch (Throwable var2) {
      }
   }

   public static void liiiIIllIl(lliIIIililiIIIil stats) {
      lliIIIililiIIIil var1 = lIiiIiIlilli(stats);
      class_310 var2 = class_310.method_1551();
      if (var2 != null) {
         var2.method_63588(() -> {
            if (var2.field_1687 != null) {
               try {
                  var2.method_73360(class_638.field_61021);
               } catch (Throwable var3) {
               }

               if (var2.field_1687 != null) {
                  IilliliilIIi(var2, var1);
               } else {
                  iIlIlllllill(var2, var1);
               }
            }
         });
      }
   }

   private static void IiIiliIiiiIi(
      class_4588 by, Matrix4f bny, float vc, float bnx, float feather, float anx, int m, float ax, float ay, float bx, float half, int any, float ca, float cb
   ) {
      int var14 = m & 16777215;
      int var15 = any & 16777215;
      float var16 = ca + cb;
      if (ca > 0.0F) {
         by.method_22918(bny, vc + feather * ca, bnx + anx * ca, 0.0F).method_39415(m);
         by.method_22918(bny, vc - feather * ca, bnx - anx * ca, 0.0F).method_39415(m);
         by.method_22918(bny, ax - bx * ca, ay - half * ca, 0.0F).method_39415(any);
         by.method_22918(bny, ax + bx * ca, ay + half * ca, 0.0F).method_39415(any);
      }

      by.method_22918(bny, vc + feather * ca, bnx + anx * ca, 0.0F).method_39415(m);
      by.method_22918(bny, vc + feather * var16, bnx + anx * var16, 0.0F).method_39415(var14);
      by.method_22918(bny, ax + bx * var16, ay + half * var16, 0.0F).method_39415(var15);
      by.method_22918(bny, ax + bx * ca, ay + half * ca, 0.0F).method_39415(any);
      by.method_22918(bny, vc - feather * ca, bnx - anx * ca, 0.0F).method_39415(m);
      by.method_22918(bny, vc - feather * var16, bnx - anx * var16, 0.0F).method_39415(var14);
      by.method_22918(bny, ax - bx * var16, ay - half * var16, 0.0F).method_39415(var15);
      by.method_22918(bny, ax - bx * ca, ay - half * ca, 0.0F).method_39415(any);
   }

   private boolean IlIlllIlilIl(class_332 ctx, int my, int mx) {
      llIilillilIilill.IliIlllilIi();
      IlIIilIlllIIilIl.IilliliilIIi();
      CorzClient.fontManager.iIlIlllllill(this.IiIIIIliliIIIIli);
      IIIiiIillIIiiIil.IliIlllilIi(this.IiIIIIliliIIIIli);
      IliiIilliiIi.ilIlllIIlIiIlllIIl = 1.0F;
      long var4 = System.nanoTime();
      if (this.lIliIIliiIliIIli != 0L && (float)(var4 - this.lIliIIliiIliIIli) / 1000000.0F >= 120.0F) {
         this.lliIliliIl(this.IlliIIlillliIIli);
         return false;
      } else {
         if (this.iiIiIIliIIliIIli == 0L) {
            this.iiIiIIliIIliIIli = var4;
            this.illIlIilIl();
         }

         boolean var6 = this.lIliIIliiIliIIli != 0L;
         this.liliIIliiiliIIli = (float)(var4 - this.iiIiIIliIIliIIli) / 1000000.0F;
         float var7 = var6 ? (float)(var4 - this.lIliIIliiIliIIli) / 1.2E8F : this.liliIIliiiliIIli / 320.0F;
         this.IIiiIIlilIiiIIli = Math.min(1.0F, Math.min((float)(this.field_22789 - 16) / 320.0F, (float)(this.field_22790 - 16) / 332.0F));
         int var8 = (this.field_22789 - 320) / 2;
         int var9 = (this.field_22790 - 332) / 2;
         int var10 = var6 ? -4000 : this.IllIllllIl((double)my, this.field_22789);
         int var11 = this.IllIllllIl((double)mx, this.field_22790);
         this.Iliilliiilii();
         this.IiIlliIliiIl(ctx);
         this.iiIIIIliIIlIIIli.IliIlllilIi();
         float var12 = llilliilililliil.liiiIIllIl((this.liliIIliiiliIIli - 110.0F) / 400.0F);
         boolean var13 = llilliilililliil.IlIlllIlilIl(
            ctx, (float)this.field_22789 / 2.0F, (float)this.field_22790 / 2.0F, llilliilililliil.Illlllllilll(var7, var6) * this.IIiiIIlilIiiIIli
         );
         float var14 = IliiIilliiIi.IilliliilIIi(llilliilililliil.IIlllIlliIll(var7, var6));

         try {
            IIIiiIillIIiiIil.IIlllIlliIll(
               ctx,
               (float)var8 + 24.0F,
               (float)var9 + 24.0F,
               272.0F,
               284.0F,
               40.0F,
               llilliilililliil.IIIIllIIIl(this.lliliiIiililiiIi, 0.07F * var12),
               60.0F,
               1.0F
            );
            llilliilililliil.IIIilIIiiIIi(
               ctx,
               (float)var8,
               (float)var9,
               320.0F,
               332.0F,
               IilIIIIililIIIIi.Illlllllilll(llilliilililliil.IIillIiliIil(), this.IiiliiIiliiliiIi, 0.55 * (double)var12),
               IilIIIIililIIIIi.Illlllllilll(352321535, llilliilililliil.IIIIllIIIl(this.lliliiIiililiiIi, 0.34F), (double)var12)
            );
            iilIllIiIIiIllIi.IIIllIIliIIl(ctx, 2, (float)var8, (float)var9, 320.0F, 117.0F, 10.0F, 0.6F);
            this.IIlllIlliIll(ctx, var8, var9, var10, var11);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var14);
            llilliilililliil.IiIlliIliiIl(ctx, var13);
         }

         return true;
      }
   }

   private float llIIlilIIl(int index) {
      return llilliilililliil.liiiIIllIl((this.liliIIliiiliIIli - 70.0F - (float)index * 38.0F) / 230.0F);
   }

   public void method_25420(class_332 delta, int my, int ctx, float mx) {
   }

   public lliIIIililiIIIil IIIllIIliIIl() {
      return this.IIiliiIilIiliiIi;
   }

   private void Ililllililil(float py, int cx) {
      float var3 = llilliilililliil.IllIllllIl((float)(cx + 88), 10.0F, 0.82F);
      float var4 = llilliilililliil.IIIllIIliIIl(py - this.IIllIIlilIllIIli / 2.0F);
      llilliilililliil.lIlIliIlIl(this.IlIiiiIillIiiiIi, var4, var3, 0.82F, -7630437);
      llilliilililliil.lIlIliIlIl(
         this.ilIiiiIiIiIiiiIi, llilliilililliil.IIIllIIliIIl(var4 + this.lIIlIIliiIIlIIli + this.liIlIIliiiIlIIli), var3, 0.82F, -920587
      );
      if (this.iillIIliIIilIIli) {
         llilliilililliil.lIlIliIlIl(
            this.liIiiiIiiiIiiiIi,
            llilliilililliil.IIIllIIliIIl(var4 + this.lIIlIIliiIIlIIli + this.IlIlIIlillIlIIli + this.liIlIIliiiIlIIli * 2.0F),
            var3,
            0.82F,
            -7630437
         );
      }

      if (!this.lliIIIliiliIIIli.isEmpty()) {
         float var5 = llilliilililliil.IllIllllIl((float)(cx + 99), 10.0F, 0.82F);
         llilliilililliil.lIlIliIlIl(
            this.lliIIIliiliIIIli, llilliilililliil.IIIllIIliIIl(py - this.iIllIIliIlllIIli / 2.0F), var5, 0.82F, this.iiiliiIiIIIiiiIi
         );
      }
   }

   private static void iIlIlllllill(class_310 trip, lliIIIililiIIIil mc) {
      class_437 var2 = trip.field_1755;

      try {
         trip.method_1507(new lIiilliIiill(var2, mc));
      } catch (Throwable var6) {
         try {
            trip.method_1507(
               new class_419(
                  (class_437)(var2 != null ? var2 : new class_442()), class_2561.method_43470(mc.IliIlllilIi()), class_2561.method_43470(mc.Illlllllilll())
               )
            );
         } catch (Throwable var5) {
         }
      }
   }

   public void method_25419() {
      this.lliIliliIl(0);
   }

   public void method_25432() {
      super.method_25432();
      if (!this.IIIiIIlilIIiIIli) {
         class_310 var1 = class_310.method_1551();
         var1.method_63588(() -> IiiIlliiIl(var1));
      }
   }

   private void lilIliilIl(class_332 ctx) {
      try {
         int var2 = this.field_22789 / 2;
         int var3 = Math.max(8, this.field_22790 / 2 - 52);
         if (!this.iIIiIIliIlIiIIli) {
            this.iIIiIIliIlIiIIli = true;
            this.llIiIIliilIiIIli = (class_4185)this.method_37063(
               class_4185.method_46430(
                     class_2561.method_43470(IliIlllilIi<"IliIlllilIi","5Ku+QYV4Qm+WLbuIWEfdVkIdtJxGwaCCwkYyyPBVIABGs3E+xq5r">()), b -> this.lliIliliIl(1)
                  )
                  .method_46434(var2 - 102, var3 + 66, 100, 20)
                  .method_46431()
            );
            this.IiIiIIliliIiIIli = (class_4185)this.method_37063(
               class_4185.method_46430(
                     class_2561.method_43470(IliIlllilIi<"IliIlllilIi","UfcGq6jSGyc0ZZL7RuUD4GWTOSiQu+eGS7t8z9CdFtKIxJ8e6XCulg==">()), b -> this.lliIliliIl(2)
                  )
                  .method_46434(var2 + 2, var3 + 66, 100, 20)
                  .method_46431()
            );
         }

         this.llIiIIliilIiIIli.method_48229(var2 - 102, var3 + 66);
         this.IiIiIIliliIiIIli.method_48229(var2 + 2, var3 + 66);
         ctx.method_25294(0, 0, this.field_22789, this.field_22790, -16052976);
         class_327 var4 = this.field_22793 != null ? this.field_22793 : class_310.method_1551().field_1772;
         ctx.method_25300(var4, this.lIIiiiIiiIIiiiIi, var2, var3, this.iIiliiIiIliliiIi ? -8393375 : -1535700);
         ctx.method_25300(var4, this.iiliiiIiIIiiiiIi, var2, var3 + 18, -920587);
         ctx.method_25300(var4, this.lIiiiiIiiIiiiiIi, var2, var3 + 30, -4932924);
         ctx.method_25300(var4, this.IliiiiIilliiiiIi, var2, var3 + 42, -7630437);
      } catch (Throwable var5) {
      }
   }

   private void Iilllilliill(class_332 cy, float cx, float ms, float ctx) {
      if (!(ctx <= 0.0F) && !(ctx >= 900.0F)) {
         float var5 = ctx / 900.0F;
         float var6 = 1.0F - var5;
         float var7 = 22.0F + 18.0F * llilliilililliil.liiiIIllIl(var5);
         IIIiiIillIIiiIil.Iiilliiliiil(
            cy, cx - var7, ms - var7, var7 * 2.0F, var7 * 2.0F, var7, 1.3F, llilliilililliil.IIIIllIIIl(this.lliliiIiililiiIi, 0.5F * var6 * var6)
         );
      }
   }

   private static void IiiIlliiIl(class_310 mc) {
      long var3 = -1521832073685129330L;
      if (!(mc.field_1755 instanceof Iilililiiili)) {
         class_1041 var1 = mc.method_22683();
         var3 ^= ((long)var1.method_4476((Integer)mc.field_1690.method_42474().method_41753(), mc.method_1573()) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != var1.method_4495()) {
            mc.method_15993();
         }
      }
   }

   private void Iliilliiilii() {
      IIliiIlllIliiIll var1 = llilliilililliil.IIiilIiiiIii();
      if (var1 != this.IIiIIIlilIiIIIli) {
         this.IIiIIIlilIiIIIli = var1;
         float var2 = 284.0F;
         this.iIiIIIliIliIIIli = var1.Iiilliiliiil(this.lIIiiiIiiIIiiiIi, var2 / 1.22F);
         this.iiiIIIliIIIlIIli = llilliilililliil.IiIIlliIIl(this.iIiIIIliIliIIIli, 1.22F);
         this.liIlIIliiiIlIIli = Math.max(
            1.5F,
            llilliilililliil.IiIIlliIIl(IliIlllilIi<"IliIlllilIi","kKX9WneQtiCPclOfNg3l2dwXPnM+p2nr+Dx2GG+74Q==">(), 0.82F)
               - llilliilililliil.IiIIlliIIl(IliIlllilIi<"IliIlllilIi","ndUJnyTN4lyJ5SK5faXmx7VGTTotOsD4nmmZrSnh">(), 0.82F)
         );
         this.lIIlIIliiIIlIIli = llilliilililliil.IiIIlliIIl(this.IlIiiiIillIiiiIi, 0.82F);
         this.IlIlIIlillIlIIli = llilliilililliil.IiIIlliIIl(this.ilIiiiIiIiIiiiIi, 0.82F);
         this.ilIlIIliIiIlIIli = this.liIiiiIiiiIiiiIi.isEmpty() ? 0.0F : llilliilililliil.IiIIlliIIl(this.liIiiiIiiiIiiiIi, 0.82F);
         this.IIllIIlilIllIIli = this.lIIlIIliiIIlIIli + this.liIlIIliiiIlIIli + this.IlIlIIlillIlIIli;
         this.iillIIliIIilIIli = this.ilIlIIliIiIlIIli > 0.0F && this.IIllIIlilIllIIli + this.liIlIIliiiIlIIli + this.ilIlIIliIiIlIIli <= var2;
         if (this.iillIIliIIilIIli) {
            this.IIllIIlilIllIIli = this.IIllIIlilIllIIli + this.liIlIIliiiIlIIli + this.ilIlIIliIiIlIIli;
         }

         this.lliIIIliiliIIIli = var1.Iiilliiliiil(this.IIliiiIilIliiiIi, var2 / 0.82F);
         this.iIllIIliIlllIIli = llilliilililliil.IiIIlliIIl(this.lliIIIliiliIIIli, 0.82F);
         this.llllIIliilllIIli = llilliilililliil.IiIIlliIIl(this.llliiiIiilliiiIi, 0.76F);
         this.IiiIIIliliiIIIli = var1.Iiilliiliiil(this.IiliiiIililiiiIi, Math.max(20.0F, var2 / 2.0F - this.llllIIliilllIIli / 2.0F - 10.0F) / 0.76F);
         this.IillIIlilillIIli = llilliilililliil.IiIIlliIIl(this.IiiIIIliliiIIIli, 0.76F);
         float var3 = Iiiiliiiiiii() - 29.0F - 6.0F;

         for (int var4 = 0; var4 < 8; var4++) {
            this.IIIIIIlilIIIIIli[var4] = var1.Iiilliiliiil(this.iliiiiIiIiiiiiIi[var4], var3 / 0.82F);
            this.iIIIIIliIlIIIIli[var4] = var1.Iiilliiliiil(this.liiiiiIiiiiiiiIi[var4], var3 / 0.95F);
            if (this.llIIIIliilIIIIli[var4] == null) {
               try {
                  this.llIIIIliilIIIIli[var4] = lIlIIiliIlIIil.illIlIilIl(IilIiiIililIiiIi[var4]);
               } catch (Throwable var6) {
               }
            }
         }
      }
   }

   private void IIIilIIiiIIi(class_332 ey, float end, float ctx, float ex) {
      float var5 = 4.6F * llilliilililliil.IilliliilIIi(ex, 2.0F);
      if (!(var5 <= 0.2F)) {
         if (!this.iIiliiIiIliliiIi) {
            IIIiiIillIIiiIil.IlIlllIlilIl(ey, end - var5, ctx - var5, var5 * 2.0F, var5 * 2.0F, var5, llilliilililliil.IIIIllIIIl(this.lliliiIiililiiIi, 0.22F));
            IIIiiIillIIiiIil.Iiilliiliiil(ey, end - var5, ctx - var5, var5 * 2.0F, var5 * 2.0F, var5, 1.3F, this.lliliiIiililiiIi);
         } else {
            float var6 = (this.liliIIliiiliIIli - 1040.0F) % 2200.0F / 1300.0F;
            if (var6 < 1.0F) {
               float var7 = var5 + 8.0F * llilliilililliil.liiiIIllIl(var6);
               float var8 = 1.0F - var6;
               IIIiiIillIIiiIil.Iiilliiliiil(
                  ey, end - var7, ctx - var7, var7 * 2.0F, var7 * 2.0F, var7, 1.1F, llilliilililliil.IIIIllIIIl(this.lliliiIiililiiIi, 0.55F * var8 * var8)
               );
            }

            IIIiiIillIIiiIil.IIlllIlliIll(
               ey, end - var5, ctx - var5, var5 * 2.0F, var5 * 2.0F, var5, llilliilililliil.IIIIllIIIl(this.lliliiIiililiiIi, 0.45F), 6.0F, 0.9F
            );
            IIIiiIillIIiiIil.IlIlllIlilIl(ey, end - var5, ctx - var5, var5 * 2.0F, var5 * 2.0F, var5, this.lliliiIiililiiIi);
            float var9 = Math.min(var5 * 0.4F, 1.7F);
            IIIiiIillIIiiIil.IlIlllIlilIl(ey, end - var9, ctx - var9, var9 * 2.0F, var9 * 2.0F, var9, -1);
         }
      }
   }

   private void Iiilliiliiil(class_332 py, int px, int ctx) {
      float var4 = llilliilililliil.iIlIlllllill((this.liliIIliiiliIIli - 360.0F) / 760.0F);
      int var5 = this.iIiliiIiIliliiIi ? iIIIlIlIIl() : -7630437;
      if (var4 > 0.0F) {
         if (this.iIiliiIiIliliiIi) {
            this.IlIillIiilIi((float)px, (float)ctx, var4, 0.0F, 5.0F, var5, this.lliliiIiililiiIi, 0.3F, false, -9.0F);
         }

         this.IlIillIiilIi(
            (float)px,
            (float)ctx,
            var4,
            0.75F,
            0.8F,
            var5,
            this.lliliiIiililiiIi,
            1.0F,
            !this.iIiliiIiIliliiIi,
            this.iIiliiIiIliliiIi ? this.Illillliilli() : -9.0F
         );
      }

      float var6 = (float)px + liiIiiIiiiiIiiIi[0];
      float var7 = (float)ctx + IIIliiIilIIliiIi[0];
      float var8 = 2.6F;
      IIIiiIillIIiiIil.IIlllIlliIll(py, var6 - var8, var7 - var8, var8 * 2.0F, var8 * 2.0F, var8, llilliilililliil.IIIIllIIIl(var5, 0.35F), 4.0F, 0.8F);
      IIIiiIillIIiiIil.IlIlllIlilIl(py, var6 - var8, var7 - var8, var8 * 2.0F, var8 * 2.0F, var8, IilIIIIililIIIIi.Illlllllilll(var5, -1, 0.2));
      if (var4 > 0.0F && var4 < 1.0F) {
         float var9 = var4 * 48.0F;
         int var10 = Math.min(47, (int)var9);
         float var11 = Math.min(1.0F, var9 - (float)var10);
         float var12 = (float)px + liiIiiIiiiiIiiIi[var10] + (liiIiiIiiiiIiiIi[var10 + 1] - liiIiiIiiiiIiiIi[var10]) * var11;
         float var13 = (float)ctx + IIIliiIilIIliiIi[var10] + (IIIliiIilIIliiIi[var10 + 1] - IIIliiIilIIliiIi[var10]) * var11;
         IIIiiIillIIiiIil.IiIlliIliiIl(py, var12 - 1.8F, var13 - 1.8F, 3.6F, 3.6F, 1.8F, llilliilililliil.IIIIllIIIl(-1, 0.9F), 6.0F, 0.9F);
      }

      float var14 = (this.liliIIliiiliIIli - 1040.0F) / 320.0F;
      if (var14 > 0.0F) {
         this.IIIilIIiiIIi(py, (float)px + liiIiiIiiiiIiiIi[48], (float)ctx + IIIliiIilIIliiIi[48], var14);
      }

      float var15 = llilliilililliil.IllIllllIl((float)(ctx + 117) + 24.0F, 10.0F, 0.76F);
      llilliilililliil.lIlIliIlIl(this.iIliiiIiIlliiiIi, llilliilililliil.IIIllIIliIIl(var6 - 3.0F), var15, 0.76F, -7630437);
      llilliilililliil.lIlIliIlIl(
         this.llliiiIiilliiiIi, llilliilililliil.IIIllIIliIIl((float)px + 160.0F - this.llllIIliilllIIli / 2.0F), var15, 0.76F, -7630437
      );
      llilliilililliil.lIlIliIlIl(
         this.IiiIIIliliiIIIli, llilliilililliil.IIIllIIliIIl((float)px + liiIiiIiiiiIiiIi[48] + 3.0F - this.IillIIlilillIIli), var15, 0.76F, -920587
      );
   }

   private void lliIliliIl(int which) {
      if (!this.IIIiIIlilIIiIIli) {
         this.IIIiIIlilIIiIIli = true;
         class_310 var2 = class_310.method_1551();

         Object var3;
         try {
            var3 = this.iIiIlIliIl(which);
         } catch (Throwable var5) {
            var3 = new class_442();
         }

         var2.method_1507((class_437)var3);
         IiiIlliiIl(var2);
      }
   }

   private void IiIlliIliiIl(class_332 ctx) {
      IIIiiIillIIiiIil.IilliliilIIi(ctx, 0.0F, 0.0F, (float)this.field_22789, (float)this.field_22790, -(-1974386143 * -45) ^ -1354656573);
      iilIllIiIIiIllIi.IIIllIIliIIl(ctx, 0, 0.0F, 0.0F, (float)this.field_22789, (float)this.field_22790, 0.0F, 1.0F);
   }

   private static int IIlilIliiIli(float alpha, int t, int from, float shine, float to) {
      long var7 = -2891548679117100565L;
      var7 ^= ((long)IilIIIIililIIIIi.Illlllllilll(t, from, (double)alpha) << 32 ^ var7) & -1L << 32;
      if (to > -8.0F) {
         float var6 = (alpha - to) / 0.08F;
         var7 ^= (
               (long)IilIIIIililIIIIi.Illlllllilll(
                        (int)(var7 >>> 32), -1, Double.longBitsToDouble(197380512027077870L ^ 4421590483267810676L) * Math.exp((double)(-var6 * var6))
                     )
                     << 32
                  ^ var7
            )
            & -1L << 32;
      }

      return IliiIilliiIi.IlIlllIlilIl(llilliilililliil.IIIIllIIIl((int)(var7 >>> 32), shine));
   }

   private void IIiilIiiiIii(class_332 mx, float w, float y, float my, int x, int ctx) {
      float var7 = (y - 6.0F) / 2.0F;
      llilliilililliil.Ilillllill(
         mx,
         this.iiIIIIliIIlIIIli,
         this.lIlIIIliiIlIIIli,
         IliIlllilIi<"IliIlllilIi","9hpd/fGo21RWvHzS445RXT3VMQJ5MM/+AiNXOkN+Jajx">(),
         IliIlllilIi<"IliIlllilIi","UfcGq6jSGyc0ZZL7RuUD4GWTOSiQu+eGS7t8z9CdFtKIxJ8e6XCulg==">(),
         w + var7,
         my,
         22.0F,
         var7,
         x,
         ctx,
         false,
         0.0F,
         this.lilIIIliiilIIIli
      );
      llilliilililliil.Iillllilll(
         mx,
         this.iiIIIIliIIlIIIli,
         this.lIlIIIliiIlIIIli,
         IliIlllilIi<"IliIlllilIi","wcEZO1Mau+yvOJ6/l57xaH6nq2juL44oQq0004l1Lg51i80=">(),
         IliIlllilIi<"IliIlllilIi","5Ku+QYV4Qm+WLbuIWEfdVkIdtJxGwaCCwkYyyPBVIABGs3E+xq5r">(),
         null,
         w + y,
         my,
         22.0F,
         var7,
         x,
         ctx,
         true,
         this.illIIIliIilIIIli
      );
   }

   private class_437 iIiIlIliIl(int which) {
      if (which == ((-1485800572 - -19 << 7 | -1485800572 - -19 >>> 25) ^ -1203909679)) {
         return new class_442();
      } else if (which == (~(-(~(-1204285191 ^ -89))) ^ -1204285279)) {
         return (class_437)(this.lilliiIiiilliiIi instanceof class_500
            ? this.lilliiIiiilliiIi
            : new class_500((class_437)(this.lilliiIiiilliiIi instanceof class_442 ? this.lilliiIiiilliiIi : new class_442())));
      } else {
         return (class_437)(this.lilliiIiiilliiIi != null ? this.lilliiIiiilliiIi : new class_442());
      }
   }

   private void IIiIllIiIl(int target) {
      if (this.liilIIliiiilIIli) {
         this.lliIliliIl(target);
      } else if (this.lIliIIliiIliIIli == (2451599020446071420L ^ 2451599020446071420L)) {
         this.lIliIIliiIliIIli = System.nanoTime();
         this.IlliIIlillliIIli = target;
      }
   }

   private void iiIIlIIlIl() {
      IliiIilliiIi.lIiiIiIlilli(this.IllIIIlilllIIIli[--this.illiIIliIiliIIli]);
      IIIiiIillIIiiIil.liiiIIllIl().method_22909();
   }

   private int IllIllllIl(double v, int span) {
      return (int)Math.round(
         (double)span / Double.longBitsToDouble(4287273367093566489L ^ 8898959385520954393L)
            + (v - (double)span / Double.longBitsToDouble(-8503987410101070755L ^ -3892301391673682851L)) / (double)this.IIiiIIlilIiiIIli
      );
   }

   private static lliIIIililiIIIil lIiiIiIlilli(lliIIIililiIIIil s) {
      return s != null ? s : new lliIIIililiIIIil(false, "", "", "", "", 0, 0, 0, 0.0, 0L, 0, 0, 0, 0, 0L, 0.0, 0.0);
   }

   private static int iIIIlIlIIl() {
      return IlIIilIlllIIilIl.lliiIlliIl | -(1836806934 - 111 + 63) ^ 1837403418;
   }

   public lIiilliIiill(class_437 parent, lliIIIililiIIIil stats) {
      super(class_2561.method_43470(IiiIliiliiIlii.liiiIIllIl(lIiiIiIlilli(stats).IliIlllilIi())));
      this.liiiiiIiiiiiiiIi = new String[8];
      this.IIIIIIlilIIIIIli = new String[8];
      this.iIIIIIliIlIIIIli = new String[8];
      this.llIIIIliilIIIIli = new class_2960[8];
      this.IiIIIIliliIIIIli = new class_4587();
      this.iiIIIIliIIlIIIli = new IIllIIIllIllIIIl();
      this.lIlIIIliiIlIIIli = new iIliililIlliilil();
      this.IllIIIlilllIIIli = new float[4];
      this.illIIIliIilIIIli = () -> this.IIiIllIiIl(1);
      this.lilIIIliiilIIIli = () -> this.IIiIllIiIl(2);
      this.iIiIIIliIliIIIli = "";
      this.lliIIIliiliIIIli = "";
      this.IiiIIIliliiIIIli = "";
      this.IlilIIlillilIIli = ilIIiiIiIiIIiiIi;
      this.IlliIIlillliIIli = 0;
      this.IIiiIIlilIiiIIli = 1.0F;
      this.lilliiIiiilliiIi = parent;
      this.IIiliiIilIiliiIi = lIiiIiIlilli(stats);
      lliIIIililiIIIil var3 = this.IIiliiIilIiliiIi;
      this.iIiliiIiIliliiIi = var3.Iiilliiliiil();
      this.lliliiIiililiiIi = this.iIiliiIiIliliiIi ? -12922502 : -1535700;
      this.IiiliiIiliiliiIi = this.iIiliiIiIliliiIi ? -16050415 : -15265270;
      this.iiiliiIiIIIiiiIi = this.iIiliiIiIliliiIi ? -7630437 : IilIIIIililIIIIi.Illlllllilll(-1535700, -1, 0.25);
      this.lIIiiiIiiIIiiiIi = IiiIliiliiIlii.liiiIIllIl(var3.IliIlllilIi());
      this.IlIiiiIillIiiiIi = this.iIiliiIiIliliiIi
         ? IliIlllilIi<"IliIlllilIi","RvsKmaW3KkcaC3MywoyBNw+g0VpqEL0xmbEEHYofXHHbuopPlA==">()
         : IliIlllilIi<"IliIlllilIi","pCRgYHFfHFFwCblmxzMJIP/hkpnKoXbQM93qs3/Xfkugfqwv3DE=">();
      this.ilIiiiIiIiIiiiIi = IiiIliiliiIlii.liiiIIllIl(var3.IIIllIIliIIl());
      this.liIiiiIiiiIiiiIi = var3.IIlilIliiIli().isEmpty()
         ? ""
         : IiiIliiliiIlii.liiiIIllIl(IliIlllilIi<"IliIlllilIi","rdfkJM5Ioe5Aq4k50UmnCUhLaZpz8jadPRNM3crszA==">() + var3.IIlilIliiIli());
      String var4;
      if (this.iIiliiIiIliliiIi) {
         var4 = var3.IiIlliIliiIl()
            ? var3.IIlllIlliIll() + IliIlllilIi<"IliIlllilIi","EE6C4VUbwmyPeZ77Zr2FSeTlDwf4yZ35OL0urgRqaTk/M+7jwIE88YBvGu1Bpqn9Qw==">()
            : IliIlllilIi<"IliIlllilIi","LYAtYZi568U++yV5O9KA/2ykcW7NVNWQhLEFND6jF1TVOJ1mBc+6rakhltB3">();
      } else {
         var4 = var3.IlIillIiilIi().isEmpty()
            ? IliIlllilIi<"IliIlllilIi","LYAtYZi568U++yV5O9KA/2ykcW7NVNWQhLEFND6jF1TVOJ1mBc+6rakhltB3">()
            : var3.IlIillIiilIi();
      }

      this.IIliiiIilIliiiIi = IiiIliiliiIlii.liiiIIllIl(var4);
      this.iIliiiIiIlliiiIi = IliIlllilIi<"IliIlllilIi","C0aOhkAIZS2QU4EOY19OzkfOPQjZTX4zxCpcdJwEA/tE">();
      this.llliiiIiilliiiIi = IiiIliiliiIlii.liiiIIllIl(var3.liiiIIllIl());
      this.IiliiiIililiiiIi = IiiIliiliiIlii.liiiIIllIl(var3.IlIlllIlilIl());
      this.iliIiiliiiii(0, IliIlllilIi<"IliIlllilIi","jGZ/SHnzuT8nbLAtx5m2sG90xIe7f/P6l5f9UWhNWOOApIaTbCrj4R4c">(), var3.liiiIIllIl());
      this.iliIiiliiiii(1, IliIlllilIi<"IliIlllilIi","49USFGJEv5sVYSvdcYvQM9+svAf4U8TU6pGpuCzBLUpTiB5Cpfcp">(), var3.iIlIlllllill());
      this.iliIiiliiiii(2, IliIlllilIi<"IliIlllilIi","DHnowcHxSltRDDYzdcNyEXot2pk70ET5ZVQiwkOS+xUDks5FVyU7wyo=">(), var3.IilliliilIIi());
      this.iliIiiliiiii(3, IliIlllilIi<"IliIlllilIi","p8eay+yU6r3ICxVGtQ4a+5o0aXJvxrTsKGxtQWfXGNwhWzQmjw==">(), var3.lIiiIiIlilli());
      this.iliIiiliiiii(
         4, IliIlllilIi<"IliIlllilIi","4hmKYMb/gMXlWC+EY0Mmry4SMkG7XnJTrB0s9N7i3LkxVC0J6vfNpw==">(), llIIilIiilIIilIi.lIiiIiIlilli((long)var3.IIIIllIIIl())
      );
      this.iliIiiliiiii(
         5, IliIlllilIi<"IliIlllilIi","WgGzP0ueouP7DgBOns2cr4GDMDl9WHXKaDS27p6Fn/bRF2+0McOkYO3zag==">(), llIIilIiilIIilIi.lIiiIiIlilli((long)var3.iIIIlIlIIl())
      );
      this.iliIiiliiiii(
         6, IliIlllilIi<"IliIlllilIi","lWBeogAKPGfitkQ4Cini/WNLE8KdN3B2nkOtxQfootMHDTMCOg==">(), llIIilIiilIIilIi.lIiiIiIlilli((long)var3.llIIlilIIl())
      );
      this.iliIiiliiiii(
         7,
         var3.IiIIlliIIl() > 0
            ? IliIlllilIi<"IliIlllilIi","gLLd0BlMATRyXVbNwAPJADbSBPXtLUQrzBUIvSlHHS/06tYnDA==">()
               + var3.IiIIlliIIl()
               + (
                  var3.IiIIlliIIl() == 1
                     ? IliIlllilIi<"IliIlllilIi","lRcbAwSt49AkRqRdp17++J6LoI3HjOQahfO1cgDveZ8=">()
                     : IliIlllilIi<"IliIlllilIi","42pjLQ8lgS/gkV8qgo+AmhI6O8aRLC16xj6NRyb48syR">()
               )
            : IliIlllilIi<"IliIlllilIi","p/HMryygBDhHLx8SrEEF7UdqD1O37wc4P97NlheUObf0">(),
         var3.iliIiiliiiii()
      );
      this.iiliiiIiIIiiiiIi = IiiIliiliiIlii.liiiIIllIl(
         this.IlIiiiIillIiiiIi
            + IliIlllilIi<"IliIlllilIi","OTzObp8azeYb7CzkBFh/saQVVg6eUZXraDDVtA8=">()
            + this.ilIiiiIiIiIiiiIi
            + (this.liIiiiIiiiIiiiIi.isEmpty() ? "" : IliIlllilIi<"IliIlllilIi","OTzObp8azeYb7CzkBFh/saQVVg6eUZXraDDVtA8=">() + this.liIiiiIiiiIiiiIi)
      );
      this.lIiiiiIiiIiiiiIi = IiiIliiliiIlii.liiiIIllIl(
         var3.liiiIIllIl()
            + IliIlllilIi<"IliIlllilIi","03n/8SrpbG1DmK+Va1JyqEaLcBfw/iXIOm/jiS72pow=">()
            + var3.iIlIlllllill()
            + IliIlllilIi<"IliIlllilIi","5dcjviSVsE7/3iitbTZ8p4ObaDtSIPdJm1TQPk7wOHg=">()
            + var3.IIIIllIIIl()
            + IliIlllilIi<"IliIlllilIi","w8udGIUmQjL9Llfz588Pt2JKo5993I4bR1tz+cVxE5mKr5GzCqS76g==">()
            + var3.iIIIlIlIIl()
            + IliIlllilIi<"IliIlllilIi","PVCh6mIuC6O5HxlXw8TbmI0RaBlOsnhpiK8ublRr254fK8cLOTGX">()
      );
      this.IliiiiIilliiiiIi = this.IIliiiIilIliiiIi;
   }

   private void IlIillIiilIi(float from, float dashed, float upto, float to, float shine, int oy, int ox, float alpha, boolean feather, float half) {
      float var11 = Math.min(1.0F, upto) * 48.0F;
      int var12 = Math.min(48, (int)var11);
      float var13 = var11 - (float)var12;
      Matrix4f var14 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
      class_4588 var15 = llIllIililIllIil.IilliliilIIi();

      for (int var16 = 0; var16 < 48 && var16 <= var12; var16++) {
         float var17 = var16 < var12 ? 1.0F : var13;
         if (var17 <= 0.0F) {
            break;
         }

         if (!feather || (var16 & 1) != 1) {
            int var18 = var16 + 1;
            float var19 = from + liiIiiIiiiiIiiIi[var16];
            float var20 = dashed + IIIliiIilIIliiIi[var16];
            float var21 = from + liiIiiIiiiiIiiIi[var16] + (liiIiiIiiiiIiiIi[var18] - liiIiiIiiiiIiiIi[var16]) * var17;
            float var22 = dashed + IIIliiIilIIliiIi[var16] + (IIIliiIilIIliiIi[var18] - IIIliiIilIIliiIi[var16]) * var17;
            float var23 = iIIliiIiIlIliiIi[var16] + (iIIliiIiIlIliiIi[var18] - iIIliiIiIlIliiIi[var16]) * var17;
            float var24 = llIliiIiilIliiIi[var16] + (llIliiIiilIliiIi[var18] - llIliiIiilIliiIi[var16]) * var17;
            int var25 = IIlilIliiIli((float)var16 / 48.0F, oy, ox, alpha, half);
            int var26 = IIlilIliiIli(((float)var16 + var17) / 48.0F, oy, ox, alpha, half);
            IiIiliIiiiIi(var15, var14, var19, var20, iIIliiIiIlIliiIi[var16], llIliiIiilIliiIi[var16], var25, var21, var22, var23, var24, var26, to, shine);
         }
      }

      llIllIililIllIil.IIillIiliIil();
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      if (this.liilIIliiiilIIli) {
         return super.method_25402(click, doubled);
      } else if (this.lIliIIliiIliIIli != (-6966095805899318357L ^ -6966095805899318357L)) {
         return true;
      } else {
         this.iiIIIIliIIlIIIli
            .IilliliilIIi((double)this.IllIllllIl(click.comp_4798(), this.field_22789), (double)this.IllIllllIl(click.comp_4799(), this.field_22790));
         return true;
      }
   }

   private void iliIiiliiiii(int i, String value, String label) {
      this.iliiiiIiIiiiiiIi[i] = IiiIliiliiIlii.liiiIIllIl(value);
      this.liiiiiIiiiiiiiIi[i] = IiiIliiliiIlii.liiiIIllIl(label);
      this.IIIIIIlilIIIIIli[i] = this.iliiiiIiIiiiiiIi[i];
      this.iIIIIIliIlIIIIli[i] = this.liiiiiIiiiiiiiIi[i];
   }

   private float Illillliilli() {
      float var1 = this.liliIIliiiliIIli - 1300.0F;
      if (var1 < 0.0F) {
         return -9.0F;
      } else {
         float var2 = var1 % 2600.0F / 1100.0F;
         return var2 > 1.0F ? -9.0F : -0.2F + 1.4F * var2;
      }
   }

   public boolean method_25421() {
      return false;
   }

   private static void IilliliilIIi(class_310 mc, lliIIIililiIIIil trip) {
      try {
         class_634 var2 = mc.method_1562();
         if (var2 != null) {
            var2.method_48296().method_10747(class_2561.method_43470(trip.Illlllllilll()));
         }
      } catch (Throwable var3) {
      }
   }

   private static float Iiiiliiiiiii() {
      return 139.5F;
   }

   private boolean IiIIlliIIl(float in) {
      if (!(in <= 0.002F) && this.illiIIliIiliIIli < this.IllIIIlilllIIIli.length) {
         class_4587 var2 = IIIiiIillIIiiIil.liiiIIllIl();
         var2.method_22903();
         var2.method_46416(0.0F, (1.0F - in) * 4.0F, 0.0F);
         this.IllIIIlilllIIIli[this.illiIIliIiliIIli++] = IliiIilliiIi.IilliliilIIi(in);
         return true;
      } else {
         return false;
      }
   }

   private Color IIIIllIIIl() {
      long var2 = 2861296755240829936L;
      var2 ^= ((long)IilIIIIililIIIIi.Illlllllilll(iIIIlIlIIl(), -1, Double.longBitsToDouble(4223654959307693168L ^ 381409214246713878L)) << 32 ^ var2)
         & -1L << 32;
      if ((int)(var2 >>> 32) != this.lIilIIliiIilIIli || this.IlilIIlillilIIli == ilIIiiIiIiIIiiIi) {
         this.lIilIIliiIilIIli = (int)(var2 >>> 32);
         this.IlilIIlillilIIli = new Color((int)(var2 >>> 32), true);
      }

      return this.IlilIIlillilIIli;
   }

   protected void method_25426() {
      if (!this.ililIIliIiilIIli) {
         this.ililIIliIiilIIli = true;
         class_310.method_1551().method_15993();
      } else {
         this.iIIiIIliIlIiIIli = false;
         super.method_25426();
      }
   }
}
