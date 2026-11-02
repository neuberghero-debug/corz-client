package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class iIIiiIlIlIiiIl {
   public static final int IlIlliillllIlliill = -13375745;
   private static final List<float[]> IIIiliilllIIiliill = new ArrayList<>();
   public static final int ilIlliillIiIlliill = -4669236;
   private static final double Iillliilllillliill = 2400.0;
   public static final int lIIlliilliIIlliill = -871589;
   public static final int iIllliillIlllliill = -11870592;
   private static final double iillliillIIilliill = 1200.0;
   private static final float liilliilliiilliill = 0.2F;
   public static final int IIllliilllIllliill = -38037;
   private static final float ililliillIiilliill = 0.16F;
   public static final int iiiIliillIIIlliill = -12723068;
   private static final float llllliillilllliill = 0.02F;
   private static final double lIilliilliIilliill = 3000.0;
   public static final int liIlliilliiIlliill = -42406;
   private static final float Ililliillllilliill = 2.5F;

   private static float Iilllilliill(float x1, float w, float h, float y1) {
      long var8 = -1601022881774906163L;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < 6) {
         var8 ^= (0L ^ var8) & -1L >>> 32;

         for (float[] var7 : IIIiliilllIIiliill) {
            if (x1 < var7[2] && x1 + h > var7[0] && w < var7[3] && w + y1 > var7[1]) {
               w = var7[1] - y1 - 2.0F >= 2.0F ? var7[1] - y1 - 2.0F : var7[3] + 2.0F;
               var8 ^= (1L ^ var8) & -1L >>> 32;
            }
         }

         if ((int)var8 == 0) {
            break;
         }

         var8 += 4294967296L;
      }

      Illlllllilll(x1, w, h, y1);
      return w;
   }

   public static float IilliliilIIi() {
      double var0 = (double)(System.currentTimeMillis() % 1200L) / 1200.0;
      return 0.5F + 0.5F * (float)Math.sin(var0 * Math.PI * 2.0);
   }

   public static void IIillIiliIil(class_4587 scale, String sx, String title, int matrices, float accent, float sy, float meta) {
      long var24 = 3294709933733114362L;
      IIliiIlllIliiIll var7 = CorzClient.fontManager.lIiiIiIlilli();
      float var8 = var7.IilliliilIIi();
      float var9 = var8 * 0.42F;
      float var10 = 4.0F;
      float var11 = 6.0F;
      float var12 = 4.0F;
      float var13 = 1.5F;
      var24 ^= ((long)(title != null && !title.isEmpty() ? 1 : 0) << 32 ^ var24) & -1L << 32;
      float var15 = Math.max(var7.iIlIlllllill(sx), (int)(var24 >>> 32) != 0 ? var7.iIlIlllllill(title) : 0.0F);
      float var16 = var9 + var10 + var15 + var11 * 2.0F;
      float var17 = var8 * (float)((int)(var24 >>> 32) != 0 ? 2 : 1) + ((int)(var24 >>> 32) != 0 ? var13 : 0.0F) + var12 * 2.0F;
      sy = Iilllilliill(accent - var16 * meta / 2.0F, sy - var17 * meta, var16 * meta, var17 * meta) + var17 * meta;
      scale.method_22903();
      scale.method_46416(accent, sy, 0.0F);
      scale.method_22905(meta, meta, 1.0F);
      scale.method_46416(-accent, -sy, 0.0F);
      float var18 = accent - var16 / 2.0F;
      float var19 = sy - var17;
      var24 ^= (-16184564L ^ var24) & -1L >>> 32;
      llilllililll.IiIlliIliiIl(
         scale,
         new Color((int)var24 >> 16 & 0xFF, (int)var24 >> 8 & 0xFF, (int)var24 & 0xFF, 215),
         (double)var18,
         (double)var19,
         (double)(var18 + var16),
         (double)(var19 + var17),
         2.5,
         4.0
      );
      float var21 = var18 + var11;
      float var22 = var19 + var12 + (var8 - var9) / 2.0F;
      llilllililll.IiIlliIliiIl(
         scale,
         new Color(matrices >> 16 & 0xFF, matrices >> 8 & 0xFF, matrices & 0xFF, 255),
         (double)var21,
         (double)var22,
         (double)(var21 + var9),
         (double)(var22 + var9),
         (double)(var9 / 2.0F),
         6.0
      );
      float var23 = var18 + var11 + var9 + var10;
      var7.IliIlllilIi(sx, var23, var19 + var12, new Color(-1));
      if ((int)(var24 >>> 32) != 0) {
         var7.IliIlllilIi(title, var23, var19 + var12 + var8 + var13, new Color(-8421505));
      }

      scale.method_22909();
   }

   public static void IiIlliIliiIl(Matrix4f p, class_2338 active, int a, float rgb, boolean m) {
      long var32 = 8833697532178456251L;
      long var34 = -3240921957133059679L;
      long var36 = 8165336332061149777L;
      float var5 = (float)active.method_10263();
      float var6 = (float)active.method_10260();
      float var7 = var5 + 1.0F;
      float var8 = var6 + 1.0F;
      float var9 = (float)active.method_10264() + 1.01F;
      iIiiIIilIliiIIil.Illillliilli(p, var5, var9, var6, var7, var9, var6, var7, var9, var8, var5, var9, var8, IlIillIiilIi(a, rgb * (m ? 0.26F : 0.18F)));
      var32 ^= ((long)IlIillIiilIi(a, rgb * 0.55F) << 32 ^ var32) & -1L << 32;
      iIiiIIilIliiIIil.Iliilliiilii(p, var5, var9, var6, var7, var9, var6, (int)(var32 >>> 32), 1.2F);
      iIiiIIilIliiIIil.Iliilliiilii(p, var7, var9, var6, var7, var9, var8, (int)(var32 >>> 32), 1.2F);
      iIiiIIilIliiIIil.Iliilliiilii(p, var7, var9, var8, var5, var9, var8, (int)(var32 >>> 32), 1.2F);
      iIiiIIilIliiIIil.Iliilliiilii(p, var5, var9, var8, var5, var9, var6, (int)(var32 >>> 32), 1.2F);
      float var11 = var5 + 0.5F;
      float var12 = var6 + 0.5F;
      var32 ^= ((long)IlIillIiilIi(a, rgb * (m ? 0.6F : 0.35F)) ^ var32) & -1L >>> 32;
      var34 ^= ((long)IlIillIiilIi(a, 0.0F) << 32 ^ var34) & -1L << 32;
      class_4588 var15 = iIiiIIilIliiIIil.IilliliilIIi();
      iIiiIIilIliiIIil.IlIlllIlilIl(
         var15,
         p,
         var11 - 0.16F,
         var9,
         var12,
         (int)var32,
         var11 + 0.16F,
         var9,
         var12,
         (int)var32,
         var11 + 0.16F,
         var9 + 2.5F,
         var12,
         (int)(var34 >>> 32),
         var11 - 0.16F,
         var9 + 2.5F,
         var12,
         (int)(var34 >>> 32)
      );
      iIiiIIilIliiIIil.IlIlllIlilIl(
         var15,
         p,
         var11,
         var9,
         var12 - 0.16F,
         (int)var32,
         var11,
         var9,
         var12 + 0.16F,
         (int)var32,
         var11,
         var9 + 2.5F,
         var12 + 0.16F,
         (int)(var34 >>> 32),
         var11,
         var9 + 2.5F,
         var12 - 0.16F,
         (int)(var34 >>> 32)
      );
      double var16 = (double)(System.currentTimeMillis() % 3000L) / 3000.0 * Math.PI * 2.0;
      float var18 = (float)Math.cos(var16);
      float var19 = (float)Math.sin(var16);
      float var20 = 0.56F;
      float var21 = var9 + 0.01F;
      var34 ^= ((long)IlIillIiilIi(a, rgb * 0.95F) ^ var34) & -1L >>> 32;

      for (long var42 = var36 ^ (0L ^ var36) & -1L << 32; (int)(var42 >>> 32) < 4; var42 += 4294967296L) {
         float var24 = (int)(var42 >>> 32) != 0 && (int)(var42 >>> 32) != 3 ? 1.0F : -1.0F;
         float var25 = (int)(var42 >>> 32) < 2 ? -1.0F : 1.0F;
         float var26 = var11 + (var24 * var20 * var18 - var25 * var20 * var19);
         float var27 = var12 + var24 * var20 * var19 + var25 * var20 * var18;
         float var28 = -var24 * 0.2F;
         float var29 = 0.0F;
         float var30 = 0.0F;
         float var31 = -var25 * 0.2F;
         iIiiIIilIliiIIil.Iliilliiilii(
            p, var26, var21, var27, var26 + (var28 * var18 - var29 * var19), var21, var27 + var28 * var19 + var29 * var18, (int)var34, 2.0F
         );
         iIiiIIilIliiIIil.Iliilliiilii(
            p, var26, var21, var27, var26 + (var30 * var18 - var31 * var19), var21, var27 + var30 * var19 + var31 * var18, (int)var34, 2.0F
         );
      }
   }

   public static float IIIilIIiiIIi(double dist) {
      if (dist > 48.0) {
         return 0.0F;
      } else {
         return dist > 24.0 ? 0.6F : 1.0F;
      }
   }

   public static void Illlllllilll(float h, float x1, float w, float y1) {
      IIIiliilllIIiliill.add(new float[]{h, x1, h + w, x1 + y1});
   }

   public static void Ililllililil(class_4587 accent, String text, String sub, int matrices) {
      long var23 = 3639797895954483353L;
      class_310 var4 = class_310.method_1551();
      IIliiIlllIliiIll var5 = CorzClient.fontManager.lIiiIiIlilli();
      float var6 = var5.IilliliilIIi();
      float var7 = var6 * 0.42F;
      float var8 = 5.0F;
      float var9 = 8.0F;
      float var10 = 5.0F;
      float var11 = 8.0F;
      float var12 = var5.iIlIlllllill(text);
      float var13 = sub == null ? 0.0F : var5.iIlIlllllill(sub);
      float var14 = var9 * 2.0F + var7 + var8 + var12 + (sub == null ? 0.0F : var11 + var13);
      float var15 = var6 + var10 * 2.0F;
      float var16 = (float)var4.method_22683().method_4486() / 2.0F - var14 / 2.0F;
      float var17 = (float)var4.method_22683().method_4502() / 2.0F + 26.0F;
      var23 ^= (-69512173080018944L ^ var23) & -1L << 32;
      llilllililll.IiIlliIliiIl(
         accent,
         new Color((int)(var23 >>> 32) >> 16 & 0xFF, (int)(var23 >>> 32) >> 8 & 0xFF, (int)(var23 >>> 32) & 0xFF, 225),
         (double)var16,
         (double)var17,
         (double)(var16 + var14),
         (double)(var17 + var15),
         4.0,
         6.0
      );
      float var19 = 0.6F + 0.4F * iIlIlllllill();
      float var20 = var16 + var9;
      float var21 = var17 + var10 + (var6 - var7) / 2.0F;
      llilllililll.IiIlliIliiIl(
         accent,
         new Color(matrices >> 16 & 0xFF, matrices >> 8 & 0xFF, matrices & 0xFF, Math.round(255.0F * var19)),
         (double)var20,
         (double)var21,
         (double)(var20 + var7),
         (double)(var21 + var7),
         (double)(var7 / 2.0F),
         6.0
      );
      float var22 = var20 + var7 + var8;
      var5.IliIlllilIi(text, var22, var17 + var10, new Color(-1));
      if (sub != null) {
         var5.IliIlllilIi(sub, var22 + var12 + var11, var17 + var10, new Color(-8421505));
      }
   }

   public static float iIlIlllllill() {
      double var0 = (double)(System.currentTimeMillis() % 2400L) / 2400.0;
      return 0.75F + 0.25F * (0.5F + 0.5F * (float)Math.sin(var0 * Math.PI * 2.0));
   }

   public static String liiiIIllIl(IlliliIillliliIi role) {
      if (role == null) {
         return IIlilIliiIli<"IIlilIliiIli","IPm8YL41No1WFWmryheBu61DbPVoh+LsI1KV1XRY2Hw93U+o+p0ihyY=">();
      } else {
         return switch (role) {
            case llllIiiIIi -> IIlilIliiIli<"IIlilIliiIli","zM/Ba2aV96qoAHwHsWsq3a8tNdOteRpzK2eyhCCRIB7dAfhgrc4kJhU=">();
            case IlllIiiIIi -> IIlilIliiIli<"IIlilIliiIli","Ueu5N3kTbsf4J+ZvXvEsPJnNoxLm/J3/f0WMjHSsU4e2myAQauorWg==">();
            case iIllIiiIIi -> IIlilIliiIli<"IIlilIliiIli","CBMftEuqcdvBlOdHRkY+8qa7SDzZu8FXPjfUAlu+LDw8XCpbANgyjdQg">();
            case IillIiiIIi -> IIlilIliiIli<"IIlilIliiIli","czDjc2HySlRgcfrgFsWKCUmQ9ol9VUfNwvOqBHfsbZ6/zR7/uw==">();
            case illlIiiIIi -> IIlilIliiIli<"IIlilIliiIli","IPm8YL41No1WFWmryheBu61DbPVoh+LsI1KV1XRY2Hw93U+o+p0ihyY=">();
         };
      }
   }

   public static int IlIillIiilIi(int a, float rgb) {
      long var3 = -8744644480665933767L;
      var3 ^= ((long)Math.max(0, Math.min(255, Math.round(IiIiliIiiiIi(rgb) * 255.0F))) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << 24 | a & 16777215;
   }

   private static float IiIiliIiiiIi(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static class_238 iliIiiliiiii(class_2338 pos) {
      class_238 var1 = IIIllIIliIIl(pos);
      class_2338 var2 = lIiiIiIlilli(pos);
      return var2 == null ? var1 : var1.method_991(IIIllIIliIIl(var2));
   }

   private static class_238 IIIllIIliIIl(class_2338 pos) {
      class_310 var1 = class_310.method_1551();
      class_238 var2 = new class_238(pos);
      if (var1.field_1687 == null) {
         return var2;
      } else {
         try {
            class_265 var3 = var1.field_1687.method_8320(pos).method_26218(var1.field_1687, pos);
            return var3.method_1110() ? var2 : var3.method_1107().method_996(pos);
         } catch (Exception var4) {
            return var2;
         }
      }
   }

   public static void IlIlllIlilIl(Matrix4f m, class_238 fill, int a, float b, float rgb, float width) {
      float var6 = (float)fill.field_1323 - 0.02F;
      float var7 = (float)fill.field_1322 - 0.02F;
      float var8 = (float)fill.field_1321 - 0.02F;
      float var9 = (float)fill.field_1320 + 0.02F;
      float var10 = (float)fill.field_1325 + 0.02F;
      float var11 = (float)fill.field_1324 + 0.02F;
      if (rgb > 0.002F) {
         iIiiIIilIliiIIil.IIlilIliiIli(
            m,
            var6,
            var7,
            var8,
            var9,
            var10,
            var11,
            (float)(a >> 16 & 0xFF) / 255.0F,
            (float)(a >> 8 & 0xFF) / 255.0F,
            (float)(a & 0xFF) / 255.0F,
            IiIiliIiiiIi(rgb * b)
         );
      }

      iIiiIIilIliiIIil.iIIIlIlIIl(m, var6, var7, var8, var9, var10, var11, IlIillIiilIi(0, b * 0.45F), width + 2.0F);
      iIiiIIilIliiIIil.iIIIlIlIIl(m, var6, var7, var8, var9, var10, var11, IlIillIiilIi(a, b), width);
   }

   public static class_2338 lIiiIiIlilli(class_2338 pos) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1687 != null && pos != null) {
         class_2680 var2 = var1.field_1687.method_8320(pos);
         if (var2.method_26204() instanceof class_2281 && var2.method_28498(class_2281.field_10770)) {
            return var2.method_11654(class_2281.field_10770) == class_2745.field_12569 ? null : pos.method_10093(class_2281.method_9758(var2));
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private iIIiiIlIlIiiIl() {
   }

   public static void IIlllIlliIll() {
      IIIiliilllIIiliill.clear();
   }

   public static class_243 Iiilliiliiil(class_238 b) {
      return new class_243((b.field_1323 + b.field_1320) / 2.0, b.field_1325 + 0.35, (b.field_1321 + b.field_1324) / 2.0);
   }

   public static int IliIlllilIi(IlliliIillliliIi role) {
      if (role == null) {
         return -4669236;
      } else {
         return switch (role) {
            case llllIiiIIi -> -12723068;
            case IlllIiiIIi -> IlIIilIlllIIilIl.lliiIlliIl | 0xFF000000;
            case iIllIiiIIi -> -871589;
            case IillIiiIIi -> -13375745;
            case illlIiiIIi -> -4669236;
         };
      }
   }
}
