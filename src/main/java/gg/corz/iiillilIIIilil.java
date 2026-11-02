package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.util.ArrayDeque;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class iiillilIIIilil {
   private static final class_4587 IIlIIlIlilIlIIlIli = new class_4587();
   private static final float IiIiiIIliliIiiIIli = 0.84F;
   private static final float iIIiiIIliIlIiiIIli = 13.0F;
   private static final int lllliIIliillliIIli = 9;
   private static final int ililiIIliIiiliIIli = 10;
   private static final float iiIiiIIliIIliiIIli = 0.76F;
   static final float IlIliIIlillIliIIli = 10.0F;
   private static float liiIIlIliiiiIIlIli;
   private static final int iIlliIIliIllliIIli = 22;
   static final float IiiIiIIliliiIiIIli = 4200.0F;
   static final float iiiIiIIliIIIliIIli = 380.0F;
   private static float llIlIlIliilIlIlIli = 200.0F;
   private static final Color IlIIIlIlillIIIlIli = new Color(((1362682194 >>> 3 | 1362682194 << 29) ^ -23 ^ -93) - 15 ^ -1252462288, true);
   static final float lIIliIIliiIIliIIli = 1400.0F;
   private static final Color lIIIIlIliiIIIIlIli = new Color(~(1730051076 * -113) ^ 2080320600, true);
   private static String IliIIlIlilliIIlIli = "";
   private static float iIIlIlIliIlIlIlIli;
   private static final float illiiIIliIiliiIIli = 6.0F;
   private static final float llIiiIIliilIiiIIli = 1.0F;
   private static final int IiiiiIIliliiiiIIli = 46;
   private static iIiiIlllIliiIlll iIlIIlIliIllIIlIli;
   private static final int IIlliIIlilIlliIIli = 8;
   static final float lliIiIIliiliIiIIli = 560.0F;
   static final int ilIliIIliIiIliIIli = 2;
   private static final float lIliiIIliiIliiIIli = 5.0F;
   private static final int lIiliIIliiIiliIIli = 4;
   private static final float IlliiIIlillliiIIli = 12.0F;
   private static String lIiIIlIliiIiIIlIli = "";
   private static float IIIlIlIlilIIlIlIli;
   private static final int IilliIIlililliIIli = 200;
   private static long IilIIlIlililIIlIli;
   private static final int lliiiIIliiliiiIIli = Math.round(178.5F);
   private static final int liIliIIliiiIliIIli = 40;
   private static final Color ilIIIlIliIiIIIlIli = new Color((-2072651009 + -15 + 5) * 97 ^ -817709416, true);
   private static final int iilliIIliIIiliIIli = 340;
   private static final int liiliIIliiiiliIIli = 2;
   private static final Color iiiiiIIliIIIIIlIli = new Color(~(-170243143 * -654471207 * -1056139499) ^ 97 ^ 653089358, true);
   private static String iliIIlIliIiiIIlIli = "";
   private static final float IIIiiIIlilIIiiIIli = 7.0F;
   private static final int IliliIIlilliliIIli = 12;
   private static long lllIIlIliillIIlIli;
   private static final ArrayDeque<iIiiIlllIliiIlll> liIIIlIliiiIIIlIli = new ArrayDeque<>();
   private static float iilIIlIliIIiIIlIli = -1.0F;
   private static final float liliiIIliiiliiIIli = 0.94F;
   private static final int iIiiiIIliIliiiIIli = 318767103;
   private static final float IIiiiIIlilIiiiIIli = 14.0F;

   private static void Illlllllilll(iIiiIlllIliiIlll card, int shownMs, float screenW, float outMs) {
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      if (var4.IilliliilIIi() != iilIIlIliIIiIIlIli) {
         IIIllIIliIIl(var4, card);
      }

      float var5 = -54.0F;
      float var6;
      float var7;
      float var8;
      if (outMs >= 0.0F) {
         float var9 = llliIlIlilliIlIl.liiiIIllIl(outMs / 380.0F);
         var6 = 10.0F + (var5 - 10.0F) * iliIiiliiiii(var9);
         var7 = 1.0F - var9 * var9;
         var8 = 1.0F;
      } else {
         float var32 = lIiiIiIlilli(screenW / 560.0F);
         var6 = var5 + (10.0F - var5) * var32;
         var7 = llliIlIlilliIlIl.iIlIlllllill(screenW / 308.0F);
         var8 = 0.94F + 0.060000002F * var32;
      }

      if (!(var7 <= 0.002F)) {
         boolean var33 = outMs < 0.0F && screenW >= 560.0F;
         float var10 = llliIlIlilliIlIl.IIIllIIliIIl(((float)shownMs - llIlIlIliilIlIlIli) / 2.0F);
         if (var33) {
            var6 = llliIlIlilliIlIl.IIIllIIliIIl(var6);
         }

         Color var11 = card.IilliliilIIi() ? IlIIIlIlillIIIlIli : ilIIIlIliIiIIIlIli;
         int var12 = (card.IilliliilIIi() ? -8393375 : -1750963) & 16777215;
         float var13 = IIIiiIillIIiiIil.Illlllllilll();
         float var14 = IliiIilliiIi.IilliliilIIi(var7);
         boolean var15 = Math.abs(var8 - 1.0F) > 5.0E-4F;
         if (var15) {
            IIlIIlIlilIlIIlIli.method_22903();
            IIlIIlIlilIlIIlIli.method_46416(var10 + llIlIlIliilIlIlIli / 2.0F, var6 + 20.0F, 0.0F);
            IIlIIlIlilIlIIlIli.method_22905(var8, var8, 1.0F);
            IIlIIlIlilIlIIlIli.method_46416(-(var10 + llIlIlIliilIlIlIli / 2.0F), -(var6 + 20.0F), 0.0F);
         }

         try {
            llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.lIIlIlIiIl, var10, var6, llIlIlIliilIlIlIli, 40.0F, 1.0F);
            float var16 = var10 + 8.0F;
            float var17 = var6 + 9.0F;
            float var18 = 4.5F;
            llliIlIlilliIlIl.Iliilliiilii(var16, var17, 22.0F, 22.0F, 7.0F, 1.0F);
            iiIlilIlIIllilIl.IliIlllilIi(
               var16 + var18,
               var17 + var18,
               13.0F,
               13.0F,
               lIlIIiliIlIIil.illIlIilIl(Iilllilliill<"Iilllilliill","/IbdxTrxyfX6IS3b81cjzsSyQ6J75KG1aTEQzj+bV0aq4g==">()),
               var11,
               IIlIIlIlilIlIIlIli
            );
            float var19 = var16 + 22.0F + 9.0F;
            float var20 = 24.0F;
            float var21 = var6 + (40.0F - var20) / 2.0F;
            IiIlliIliiIl(var4, card.IliIlllilIi(), var19, IlIlllIlilIl(var21, 12.0F, 1.0F), 1.0F, iiiiiIIliIIIIIlIli);
            if (IIIlIlIlilIIlIlIli > 0.0F) {
               float var22 = var19 + liiIIlIliiiiIIlIli + 6.0F;
               float var23 = var21 + 0.0F;
               llliIlIlilliIlIl.IIillIiliIil(var22, var23, IIIlIlIlilIIlIlIli, 12.0F, 6.0F, 0.0F, 771751936 | var12);
               IiIlliIliiIl(var4, lIiIIlIliiIiIIlIli, var22 + 5.0F, IlIlllIlilIl(var23, 12.0F, 0.76F), 0.76F, var11);
            }

            float var34 = var21 + 12.0F + 2.0F;
            float var35 = IlIlllIlilIl(var34, 10.0F, 0.84F);
            IiIlliIliiIl(var4, IliIIlIlilliIIlIli, var19, var35, 0.84F, lIIIIlIliiIIIIlIli);
            IiIlliIliiIl(var4, iliIIlIliIiiIIlIli, var19 + var4.iIlIlllllill(IliIIlIlilliIIlIli) * 0.84F, var35, 0.84F, llliIlIlilliIlIl.IIlllIlliIll());
            float var24 = var10 + 8.0F;
            float var25 = var6 + 40.0F - var13 * 2.0F;
            float var26 = llIlIlIliilIlIlIli - 16.0F;
            llliIlIlilliIlIl.IIillIiliIil(var24, var25, var26, var13, 0.0F, 0.0F, 318767103);
            float var27 = outMs >= 0.0F ? 0.0F : 1.0F - llliIlIlilliIlIl.liiiIIllIl((screenW - 560.0F) / 4200.0F);
            float var28 = llliIlIlilliIlIl.IIIllIIliIIl(var26 * var27);
            if (var28 > 0.0F) {
               llliIlIlilliIlIl.IIillIiliIil(var24, var25, var28, var13, 0.0F, 0.0F, lliiiIIliiliiiIIli << 24 | var12);
            }
         } finally {
            if (var15) {
               IIlIIlIlilIlIIlIli.method_22909();
            }

            IliiIilliiIi.lIiiIiIlilli(var14);
         }
      }
   }

   public static void iIlIlllllill() {
      liIIIlIliiiIIIlIli.clear();
      iIlIIlIliIllIIlIli = null;
      IilIIlIlililIIlIli = 0L;
   }

   public static void IliIlllilIi(iIiiIlllIliiIlll card) {
      if (card != null) {
         long var1 = System.nanoTime();
         if (iIlIIlIliIllIIlIli == null) {
            IilliliilIIi(card, var1);
         } else {
            while (liIIIlIliiiIIIlIli.size() >= 2) {
               liIIIlIliiiIIIlIli.pollFirst();
            }

            liIIIlIliiiIIIlIli.addLast(card);
            if (IilIIlIlililIIlIli == 0L) {
               IilIIlIlililIIlIli = Math.max(var1, lllIIlIliillIIlIli + 1400000000L);
            }
         }
      }
   }

   private iiillilIIIilil() {
   }

   public static boolean liiiIIllIl() {
      return iIlIIlIliIllIIlIli != null;
   }

   static float lIiiIiIlilli(float t) {
      float var1 = 1.0F - llliIlIlilliIlIl.liiiIIllIl(t);
      return 1.0F - var1 * var1 * var1 * var1 * var1;
   }

   private static float IlIlllIlilIl(float scale, float boxTop, float boxH) {
      return scale + boxTop / 2.0F - 8.28F * boxH;
   }

   public static void IIlllIlliIll(class_332 ctx) {
      if (iIlIIlIliIllIIlIli != null && ctx != null) {
         long var1 = System.nanoTime();
         float var3 = (float)(var1 - lllIIlIliillIIlIli) / 1000000.0F;
         if (IilIIlIlililIIlIli == 0L && var3 >= 4760.0F) {
            IilIIlIlililIIlIli = var1;
         }

         float var4 = IilIIlIlililIIlIli != 0L && var1 >= IilIIlIlililIIlIli ? (float)(var1 - IilIIlIlililIIlIli) / 1000000.0F : -1.0F;
         if (var4 >= 380.0F) {
            iIiiIlllIliiIlll var5 = liIIIlIliiiIIIlIli.pollFirst();
            if (var5 == null) {
               iIlIIlIliIllIIlIli = null;
               return;
            }

            IilliliilIIi(var5, var1);
            var3 = 0.0F;
            var4 = -1.0F;
         }

         class_310 var18 = class_310.method_1551();
         double var6 = (double)var18.method_22683().method_4495();
         int var8 = var18.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var18), var18.method_1573());
         float var9 = (float)((double)var8 / var6);
         boolean var10 = Math.abs(var9 - 1.0F) > 1.0E-4F;
         int var11 = var10 ? Math.round((float)var18.method_22683().method_4486() / var9) : var18.method_22683().method_4486();
         int var12 = var10 ? Math.round((float)var18.method_22683().method_4502() / var9) : var18.method_22683().method_4502();
         class_4587 var13 = CorzClient.fontManager.liiiIIllIl();
         class_4587 var14 = IIIiiIillIIiiIil.liiiIIllIl();
         CorzClient.fontManager.iIlIlllllill(IIlIIlIlilIlIIlIli);
         IIIiiIillIIiiIil.IliIlllilIi(IIlIIlIlilIlIIlIli);
         if (var10) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var11;
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)var12;
         }

         try {
            Illlllllilll(iIlIIlIliIllIIlIli, var11, var3, var4);
         } finally {
            if (var10) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }

            CorzClient.fontManager.iIlIlllllill(var13);
            IIIiiIillIIiiIil.IliIlllilIi(var14);
         }
      }
   }

   private static void IilliliilIIi(iIiiIlllIliiIlll now, long card) {
      iIlIIlIliIllIIlIli = now;
      lllIIlIliillIIlIli = card;
      IilIIlIlililIIlIli = 0L;
      iilIIlIliIIiIIlIli = -1.0F;
   }

   private static void IIIllIIliIIl(IIliiIlllIliiIll card, iIiiIlllIliiIlll font) {
      iilIIlIliIIiIIlIli = card.IilliliilIIi();
      float var2 = 289.0F;
      liiIIlIliiiiIIlIli = card.iIlIlllllill(font.IliIlllilIi()) * 1.0F;
      lIiIIlIliiIiIIlIli = card.Iiilliiliiil(font.liiiIIllIl(), Math.max(20.0F, (var2 - liiIIlIliiiiIIlIli - 6.0F) / 0.76F - 10.0F));
      IIIlIlIlilIIlIlIli = lIiIIlIliiIiIIlIli.isEmpty() ? 0.0F : card.iIlIlllllill(lIiIIlIliiIiIIlIli) * 0.76F + 10.0F;
      String var3 = font.iIlIlllllill();
      iliIIlIliIiiIIlIli = var3.endsWith(Iilllilliill<"Iilllilliill","Il73V+4YL10szjFXSNd+B04/ASYpHknBMwI7g5OFa+/hggo=">())
         ? Iilllilliill<"Iilllilliill","Il73V+4YL10szjFXSNd+B04/ASYpHknBMwI7g5OFa+/hggo=">()
         : "";
      String var4 = var3.substring(0, var3.length() - iliIIlIliIiiIIlIli.length());
      float var5 = card.iIlIlllllill(iliIIlIliIiiIIlIli) * 0.84F;
      IliIIlIlilliIIlIli = card.Iiilliiliiil(var4, Math.max(20.0F, (var2 - var5) / 0.84F));
      iIIlIlIliIlIlIlIli = card.iIlIlllllill(IliIIlIlilliIIlIli) * 0.84F + var5;
      float var6 = Math.max(liiIIlIliiiiIIlIli + (IIIlIlIlilIIlIlIli > 0.0F ? 6.0F + IIIlIlIlilIIlIlIli : 0.0F), iIIlIlIliIlIlIlIli);
      llIlIlIliilIlIlIli = Math.max(200.0F, Math.min(340.0F, 39.0F + var6 + 8.0F + 4.0F));
   }

   static float iliIiiliiiii(float t) {
      float var1 = llliIlIlilliIlIl.liiiIIllIl(t);
      return var1 * var1 * var1;
   }

   private static void IiIlliIliiIl(IIliiIlllIliiIll scale, String x, float font, float y, float s, Color color) {
      if (!x.isEmpty()) {
         IIlIIlIlilIlIIlIli.method_22903();

         try {
            IIlIIlIlilIlIIlIli.method_22905(s, s, 1.0F);
            scale.IliIlllilIi(x, font / s, y / s, color);
         } finally {
            IIlIIlIlilIlIIlIli.method_22909();
         }
      }
   }
}
