package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.util.Locale;
import java.util.function.IntConsumer;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_8685;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;

public final class llilliilililliil {
   private static final float lliliiilil = 1.7E8F;
   private static final float ililiiilil = 2.2E8F;
   public static final int lIIliiilil = -10761846;
   public static final int ilIliiilil = 6;
   private static final float Ililiiilil = 2.4E8F;
   public static final int IiiIiiilil = 8;
   public static final float Iilliiilil = 6.44F;
   public static final float iilIiiilil = 1.0F;
   public static final int iliIiiilil = 4;
   public static final float iiiIiiilil = 0.82F;
   public static final int iIlIiiilil = 18;
   public static final float IIIliiilil = 1.22F;
   public static final int lllIiiilil = 16;
   public static final float IlIliiilil = 4.0F;
   private static final float iIiliiilil = 1.8E8F;
   public static final int lIlliiilil = 12;
   public static final float iIIliiilil = 4.0F;
   private static final float iiIliiilil = 0.94F;
   public static final int lIlIiiilil = 6;
   private static final long liiliiilil = 300000000L;
   private static final float IIlliiilil = 1.6F;
   public static final int IliIiiilil = 4;
   public static final float lllliiilil = 11.5F;
   public static final int iIlliiilil = 9;
   public static final int IIlIiiilil = 22;
   public static final float illliiilil = 4.41F;
   public static final int liiIiiilil = 7;
   public static final float liIliiilil = 130.0F;
   public static final float iilliiilil = 0.07F;
   public static final int IilIiiilil = 18;
   private static final String[] iIIiiiilil = new String[256];
   private static final float Iiiliiilil = 3.0F;
   public static final int illIiiilil = 6;
   public static final int llIliiilil = 10;
   private static final int IIIiiiilil = 1;
   public static final float lilliiilil = 0.05F;
   public static final float Illliiilil = 6.0F;
   public static final float IIiliiilil = 0.025F;
   public static final int IllIiiilil = 5;
   public static final float lIiIiiilil = 3.0F;
   public static final int lliIiiilil = 1040187391;
   public static final float lilIiiilil = 6.0F;
   private static final int iiiliiilil = 0;
   private static final float lIiliiilil = 0.07F;
   public static final int iIiIiiilil = 16;
   private static final int lIIiiiilil = 2;
   public static final float IIiIiiilil = 4.0F;
   public static final float IiIliiilil = 240.0F;

   public static float lIilliIill(
      class_332 y,
      IIllIIIllIllIIIl hits,
      iIliililIlliilil mx,
      String ctx,
      String act,
      float danger,
      float my,
      float h,
      int xRight,
      int id,
      boolean anims,
      Runnable label
   ) {
      return liilliiill(y, hits, mx, ctx, act, danger, false, my, h, 40.0F, xRight, id, anims, 0.0F, label);
   }

   private static float IiIiliIiiiIi(illIilIiIilIilIi icon, String label, class_2960 target, float c) {
      long var8 = 3147346469444397907L;
      long var4 = System.nanoTime();
      var8 ^= ((long)(var4 - icon.IIlIIllIIi > 300000000L ? 1 : 0) << 32 ^ var8) & -1L << 32;
      icon.IIlIIllIIi = var4;
      if (icon.lllIIllIIi != null && (int)(var8 >>> 32) == 0) {
         if (!icon.lllIIllIIi.equals(label)) {
            icon.illIIllIIi = icon.lllIIllIIi;
            icon.lilIIllIIi = icon.IilIIllIIi;
            icon.lllIIllIIi = label;
            icon.IIiIIllIIi = icon.iilIIllIIi;
            icon.iiIIIllIIi = var4;
         }

         icon.IilIIllIIi = target;
         if (icon.iiIIIllIIi == 0L) {
            icon.iilIIllIIi = c;
            return c;
         } else {
            float var7 = (float)(var4 - icon.iiIIIllIIi) / 1.7E8F;
            if (var7 >= 1.0F) {
               icon.iiIIIllIIi = 0L;
               icon.illIIllIIi = null;
               icon.lilIIllIIi = null;
               icon.iilIIllIIi = c;
               return c;
            } else {
               icon.lIiIIllIIi = var7;
               icon.iilIIllIIi = icon.IIiIIllIIi + (c - icon.IIiIIllIIi) * (c >= icon.IIiIIllIIi ? liiiIIllIl(var7) : iIlIlllllill(var7));
               return icon.iilIIllIIi;
            }
         }
      } else {
         icon.lllIIllIIi = label;
         icon.IilIIllIIi = target;
         icon.illIIllIIi = null;
         icon.lilIIllIIi = null;
         icon.iiIIIllIIi = 0L;
         icon.iilIIllIIi = c;
         if ((int)(var8 >>> 32) != 0) {
            icon.IliIIllIIi = false;
         }

         return c;
      }
   }

   public static IIliiIlllIliiIll IIiilIiiiIii() {
      return CorzClient.fontRenderer();
   }

   private static float liilliiill(
      class_332 minW,
      IIllIIIllIllIIIl act,
      iIliililIlliilil hits,
      String mx,
      String anchor,
      float fromLeft,
      boolean h,
      float ctx,
      float my,
      float label,
      int danger,
      int anims,
      boolean y,
      float id,
      Runnable armed
   ) {
      long var24 = 2998136543034673626L;
      long var26 = -5855348204409371119L;
      illIilIiIilIilIi var15 = hits.IliIlllilIi(mx);
      float var16 = IiIiliIiiiIi(var15, anchor, null, Math.max(label, (float)Math.ceil((double)llIIlilIIl(anchor)) + 18.0F));
      float var17 = h ? fromLeft : fromLeft - var16;
      float var18 = hits.IIIllIIliIIl(mx, Iliilliiilii((double)danger, (double)anims, var17, ctx, var16, my));
      float var19 = Math.max(var18, IliIlllilIi(id));
      float var20 = var15.IliIlllilIi(y ? 1.0F : 0.0F, 14.0F);
      var24 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-15461350, IilIIIIililIIIIi.Illlllllilll(-14737624, -14411235, (double)var20), (double)var19) << 32 ^ var24)
         & -1L << 32;
      var24 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IIIiiIillIIiiIil.IlIillIiilIi((double)var19),
                  IilIIIIililIIIIi.Illlllllilll(IIIiiIillIIiiIil.IlIillIiilIi(0.0), -1931130803, (double)var19),
                  (double)var20
               )
               ^ var24
         )
         & -1L >>> 32;
      var26 ^= ((long)IlIlllIlilIl(minW, var17 + var16 / 2.0F, ctx + my / 2.0F, hits.IilliliilIIi(mx, 0.05F)) << 32 ^ var26) & -1L << 32;
      IIIiiIillIIiiIil.Ililllililil(minW, var17, ctx, var16, my, 5.0F, (int)(var24 >>> 32), (int)var24);
      IIlilIliiIli(
         var15,
         1,
         anchor,
         null,
         var17,
         ctx,
         var16,
         my,
         IilIIIIililIIIIi.Illlllllilll(-920587, IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1750963, (double)var20), (double)var19 * 0.8)
      );
      IiIlliIliiIl(minW, (boolean)((int)(var26 >>> 32)));
      act.iIlIlllllill(var17, ctx - 1.0F, var16, my + 2.0F, armed, hits, mx);
      return h ? var17 + var16 : var17;
   }

   public static float lilIliilIl(String trackPx, float s, float scale) {
      long var6 = -6599653619343220362L;
      if (trackPx == null || trackPx.isEmpty()) {
         return 0.0F;
      } else if (scale == 0.0F) {
         return IiIIlliIIl(trackPx, s);
      } else {
         IIliiIlllIliiIll var3 = IIiilIiiiIii();
         float var4 = 0.0F;

         for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < trackPx.length(); var8 += 4294967296L) {
            var4 += var3.iIlIlllllill(illIlIilIl(trackPx.charAt((int)(var8 >>> 32))));
         }

         return var4 * s + scale * (float)(trackPx.length() - 1);
      }
   }

   public static float IIIllIIliIIl(float v) {
      float var1 = IIIiiIillIIiiIil.Illlllllilll();
      return (float)Math.round(v / var1) * var1;
   }

   public static void lllIiillIi(class_332 x, String w, float ctx, float y, float label) {
      String var5 = w.toUpperCase(Locale.ROOT);
      float var6 = 0.8F;
      float var7 = IIIiiIillIIiiIil.Illlllllilll();
      float var8 = y + 6.0F;
      lIlIliIlIl(var5, ctx + 1.0F, var8 - 11.5F * var6, var6, -11117467);
      float var9 = (float)Math.ceil((double)((ctx + 1.0F + IiIIlliIIl(var5, var6) + 7.0F) / var7)) * var7;
      float var10 = IIIllIIliIIl(var8 - 6.44F * var6 / 2.0F - var7 / 2.0F);
      if (var9 < ctx + label) {
         IIIiiIillIIiiIil.IilliliilIIi(x, var9, var10, ctx + label - var9, var7, IilIIIIililIIIIi.IIillIiliIil());
      }
   }

   public static float IilliliilIIi(float t, float back) {
      float var2 = IliIlllilIi(t) - 1.0F;
      return 1.0F + (back + 1.0F) * var2 * var2 * var2 + back * var2 * var2;
   }

   public static float iiiIlIIIll(
      class_332 rowH,
      IIllIIIllIllIIIl rowY,
      iIliililIlliilil x,
      String my,
      String[] ctx,
      int active,
      float hits,
      float id,
      float onPick,
      int labels,
      int anims,
      IntConsumer mx
   ) {
      float var12 = IIIiiIillIIiiIil.Illlllllilll();
      hits = (float)Math.ceil((double)(hits / var12)) * var12;
      return IlIllllIll(rowH, rowY, x, my, ctx, active, hits, id + (onPick - 18.0F) / 2.0F, 18.0F, 16.0F, 8.0F, 6.0F, labels, anims, mx);
   }

   public static float IlIIillIIi(class_332 y, boolean label, String online, float x, float ctx) {
      return ilIIiIiIIi(y, label, online, x, ctx, true);
   }

   public static void iilIiIIiIi(class_332 x, float h, float y, float index, float w, float ctx, int tabW) {
      long var12 = -7667002406615412142L;
      double var7 = (Math.sin((double)System.nanoTime() / 1.0E9 * 4.0 + (double)tabW * 0.6) + 1.0) / 2.0;
      float var9 = lililiilil(x, h, y, index, w, ctx, (float)(0.25 * var7), 0.0F);
      var12 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-15065820, -14012872, var7) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)IIIIllIIIl((int)(var12 >>> 32), 0.7F) ^ var12) & -1L >>> 32;
      IIIiiIillIIiiIil.IlIlllIlilIl(x, h + 8.0F, y + 6.0F, ctx - 16.0F, 6.0F, 2.0F, (int)(var12 >>> 32));
      IIIiiIillIIiiIil.IlIlllIlilIl(x, h + 8.0F, var9 + 9.0F, index * 0.34F, 5.0F, 2.0F, (int)var12);
      IIIiiIillIIiiIil.IlIlllIlilIl(x, h + 8.0F, y + w - 16.0F, index * 0.26F, 5.0F, 2.0F, (int)var12);
      IIIiiIillIIiiIil.IlIlllIlilIl(x, h + index - 8.0F - 50.0F, y + w - 22.0F, 50.0F, 16.0F, 5.0F, (int)var12);
   }

   static {
      long var1 = 4198030729077775874L;

      for (long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) < iIIiiiilil.length; var3 += 4294967296L) {
         iIIiiiilil[(int)(var3 >>> 32)] = String.valueOf((char)((int)(var3 >>> 32)));
      }
   }

   public static int Iiiiliiiiiii() {
      return iIillliIlillli.IIiilIiiiIii(IlIIilIlllIIilIl.lliiIlliIl) > 0.55F ? -15724006 : -1;
   }

   public static int lliIliliIl(int index, int innerW, int cols, int x, int gap) {
      return iIiIlIliIl(index, innerW, cols, x, gap + 1) - x - iIiIlIliIl(index, innerW, cols, x, gap);
   }

   public static float Illillllil(class_332 ctx, String maxW, float x, float y, float label) {
      float var5 = 0.78F;
      float var6 = 11.0F;
      String var7 = IIiilIiiiIii().Iiilliiliiil(maxW, (label - 10.0F) / var5);
      float var8 = IiIilliIil(var7);
      IIIiiIillIIiiIil.IlIlllIlilIl(ctx, x, y, var8, var6, 4.0F, IIIIllIIIl(-1, 0.07F));
      lIlIliIlIl(var7, x + 5.0F, IllIllllIl(y, var6, var5), var5, -7630437);
      return var8;
   }

   private static void IIiillIiil(float tab, float h, float r, float f, float w, float color, float x, int y) {
      float var8 = h + 16.0F;
      float var9 = f - 16.0F;
      float var10 = h + f;
      float var11 = tab + w + x;
      float var12 = color * 2.0F + 2.0F;
      Iiiilliiil(tab, h, w, 16.0F + var12, color, 0.0F, y, tab - 1.0F, h - 1.0F, tab + w + 1.0F, var8);
      iiiilIIIIi(tab + w, var8 - x * 2.0F, x * 2.0F, x * 2.0F, x, y, 1000000.0F, 1.0F, false, tab + w, var8 - x, var11, var8);
      Iiiilliiil(tab, var8 - var12, r, var9 + var12, color, 0.0F, y, tab - 1.0F, var8, var11, var10 + 1.0F);
      Iiiilliiil(tab, var8, r, var9, color, 0.0F, y, var11, var8 - 1.0F, tab + r + 1.0F, var10 + 1.0F);
   }

   public static float IiIilliIil(String label) {
      return (float)Math.ceil((double)IiIIlliIIl(label, 0.78F)) + 10.0F;
   }

   public static float liIIiiiIIi(class_332 ctx, int dotColor, int label, String x, float y, float textColor) {
      return IIlIilIlIi(ctx, dotColor, label, x, y, textColor, true);
   }

   public static void IIllllIlll(
      class_332 ctx,
      IIllIIIllIllIIIl icon,
      iIliililIlliilil mx,
      String hits,
      class_2960 act,
      float box,
      float id,
      float anims,
      float x,
      int y,
      int my,
      boolean danger,
      Runnable iconSize
   ) {
      iIlllIllll(ctx, icon, mx, hits, act, box, id, anims, x, y, my, danger, 0.0F, iconSize);
   }

   public static float IllIllllIl(float scale, float boxH, float boxY) {
      float var3 = (float)IIiilIiiiIii().IlIillIiilIi(0, 100) - 50.0F;
      return scale + boxH / 2.0F + var3 * boxY;
   }

   public static float lililiilil(class_332 tabW, float w, float h, float active, float y, float ctx, float hover, float x) {
      long var14 = -7761791363005029749L;
      float var8 = 7.0F;
      float var9 = 4.0F;
      float var10 = IIIiiIillIIiiIil.Illlllllilll();
      float var11 = Math.max(var8 * 2.0F + 2.0F, Math.min(ctx, active - var8 - var9));
      var14 ^= ((long)IilIIIIililIIIIi.iliIiiliiiii() << 32 ^ var14) & -1L << 32;
      if (x > 0.004F) {
         var14 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var14 >>> 32), IlIIilIlllIIilIl.lliiIlliIl, 0.05 * (double)x) << 32 ^ var14) & -1L << 32;
      }

      if (hover > 0.004F) {
         var14 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var14 >>> 32), -1, 0.04 * (double)hover) << 32 ^ var14) & -1L << 32;
      }

      var14 ^= ((long)(x > 0.004F ? IilIIIIililIIIIi.Illlllllilll(234881023, IilIIIIililIIIIi.IIlllIlliIll(0.42), (double)x) : 234881023) ^ var14) & -1L >>> 32;
      var14 ^= ((long)iilIllIiIIiIllIi.iliIiiliiiii((int)(var14 >>> 32)) << 32 ^ var14) & -1L << 32;
      if (!IilIIIIililIIIIi.liiiIIllIl() && (int)(var14 >>> 32) >>> 24 == 255) {
         if (x > 0.02F) {
            lliililiil(w, h, active, y, var11, var8, var9, IilIIIIililIIIIi.IIlllIlliIll(0.2 * (double)x), true);
         }

         IIiillIiil(w, h, active, y, var11, var8, var9, (int)var14);
         IIiillIiil(w + var10, h + var10, active - var10 * 2.0F, y - var10 * 2.0F, var11 - var10 * 2.0F, var8 - var10, var9 + var10, (int)(var14 >>> 32));
      } else {
         if (!IilIIIIililIIIIi.liiiIIllIl() && x > 0.02F) {
            lliililiil(w, h, active, y, var11, var8, var9, IilIIIIililIIIIi.IIlllIlliIll(0.2 * (double)x), false);
         }

         IIiillIiil(w, h, active, y, var11, var8, var9, (int)(var14 >>> 32));
         iIiilIliil(w, h, active, y, var11, var8, var9, var10, (int)var14);
      }

      return h + 16.0F;
   }

   public static boolean IlIlllIlilIl(class_332 cx, float ctx, float cy, float scale) {
      if (Math.abs(scale - 1.0F) <= 5.0E-4F) {
         return false;
      } else {
         class_4587 var4 = IIIiiIillIIiiIil.liiiIIllIl();
         var4.method_22903();
         var4.method_46416(ctx, cy, 0.0F);
         var4.method_22905(scale, scale, 1.0F);
         var4.method_46416(-ctx, -cy, 0.0F);
         Matrix3x2fStack var5 = cx.method_51448();
         var5.pushMatrix();
         var5.translate(ctx, cy);
         var5.scale(scale, scale);
         var5.translate(-ctx, -cy);
         return true;
      }
   }

   public static float IiIIlliIIl(String s, float scale) {
      return IIiilIiiiIii().iIlIlllllill(s) * scale;
   }

   public static void lIlIliIlIl(String y, float x, float argb, float s, int scale) {
      class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
      var5.method_22903();
      var5.method_22905(s, s, 1.0F);
      IIiilIiiiIii().IliIlllilIi(y, x / s, argb / s, new Color(scale, true));
      var5.method_22909();
   }

   public static void iIIIlIlIIl(float x, float h, float y, float w, int solidTop, float argb, boolean strength) {
      long var13 = 4469450487603065602L;
      long var15 = 8533009688426613977L;
      if (!(y <= 0.0F) && !(w <= 0.0F) && !(argb <= 0.01F)) {
         var13 ^= ((long)IliiIilliiIi.IlIlllIlilIl(IIIIllIIIl(solidTop, IliIlllilIi(argb))) << 32 ^ var13) & -1L << 32;
         if ((int)(var13 >>> 32) >>> 24 != 0) {
            var13 ^= ((long)((int)(var13 >>> 32) & 16777215) ^ var13) & -1L >>> 32;
            var15 ^= ((long)(strength ? (int)(var13 >>> 32) : (int)var13) << 32 ^ var15) & -1L << 32;
            var15 ^= ((long)(strength ? (int)var13 : (int)(var13 >>> 32)) ^ var15) & -1L >>> 32;
            Matrix4f var11 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
            class_4588 var12 = llIllIililIllIil.IilliliilIIi();
            var12.method_22918(var11, x, h, 0.0F).method_39415((int)(var15 >>> 32));
            var12.method_22918(var11, x, h + w, 0.0F).method_39415((int)var15);
            var12.method_22918(var11, x + y, h + w, 0.0F).method_39415((int)var15);
            var12.method_22918(var11, x + y, h, 0.0F).method_39415((int)(var15 >>> 32));
            llIllIililIllIil.IIillIiliIil();
         }
      }
   }

   public static void IiIlliIliiIl(class_332 ctx, boolean pushed) {
      if (pushed) {
         ctx.method_51448().popMatrix();
         IIIiiIillIIiiIil.liiiIIllIl().method_22909();
      }
   }

   public static float iIlIiIllIi(String label) {
      return 8.0F + IiIIlliIIl(label, 0.82F);
   }

   private static void iIiilIliil(float line, float f, float w, float x, float color, float r, float h, float y, int tab) {
      float var9 = f + 16.0F;
      float var10 = x - 16.0F;
      float var11 = f + x;
      float var12 = line + color + h;
      float var13 = line + color - y;
      float var14 = r * 2.0F + 2.0F;
      float var15 = h + y;
      Iiiilliiil(line, f, color, 16.0F + var14, r, y, tab, line - 1.0F, f - 1.0F, line + color + 1.0F, var9 - h);
      Iiiilliiil(var13, var9 - h - var15, var15 * 2.0F, var15 * 2.0F, var15, y, tab, var13, var9 - h, var12, var9 + y);
      Iiiilliiil(line, var9 - var14, w, var10 + var14, r, y, tab, line - 1.0F, var9 - h, var13, var11 + 1.0F);
      Iiiilliiil(line, var9, w, var10, r, y, tab, var12, var9 - 1.0F, line + w + 1.0F, var9 + r);
      Iiiilliiil(line, var9, w, var10, r, y, tab, var13, var9 + r, line + w + 1.0F, var11 + 1.0F);
   }

   public static float IIiIllIiIl(String x, float scale, float y, float argb, float trackPx, int s) {
      long var15 = -4903262807391292478L;
      if (x == null || x.isEmpty()) {
         return 0.0F;
      } else if (trackPx == 0.0F) {
         lIlIliIlIl(x, scale, y, argb, s);
         return IiIIlliIIl(x, argb);
      } else {
         IIliiIlllIliiIll var6 = IIiilIiiiIii();
         class_4587 var7 = IIIiiIillIIiiIil.liiiIIllIl();
         var7.method_22903();
         var7.method_22905(argb, argb, 1.0F);

         float var12;
         try {
            Color var8 = new Color(s, true);
            float var9 = scale / argb;
            float var10 = y / argb;
            float var11 = trackPx / argb;

            for (long var19 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var19 >>> 32) < x.length(); var19 += 4294967296L) {
               String var13 = illIlIilIl(x.charAt((int)(var19 >>> 32)));
               var6.IliIlllilIi(var13, var9, var10, var8);
               var9 += var6.iIlIlllllill(var13) + ((int)(var19 >>> 32) < x.length() - 1 ? var11 : 0.0F);
            }

            var12 = var9 * argb - scale;
         } finally {
            var7.method_22909();
         }

         return var12;
      }
   }

   public static void Iiilliiliiil(class_332 x, float h, float y, float w, float ctx) {
      IIIilIIiiIIi(x, h, y, w, ctx, IIillIiliIil(), 352321535);
   }

   public static int IIIIllIIIl(int argb, float a) {
      long var4 = -6007115902163285074L;
      var4 ^= ((long)(argb >>> 24 & 0xFF) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) == 0) {
         var4 ^= (1095216660480L ^ var4) & -1L << 32;
      }

      var4 ^= ((long)Math.max(0, Math.min(255, Math.round((float)((int)(var4 >>> 32)) * a))) ^ var4) & -1L >>> 32;
      return (int)var4 << 24 | argb & 16777215;
   }

   public static void IilIililIi(
      class_332 h,
      IIllIIIllIllIIIl sub,
      iIliililIlliilil x,
      String id,
      float y,
      float my,
      float mx,
      float ctx,
      class_2960 anims,
      String cta,
      String icon,
      String hits,
      int w,
      int title,
      Runnable act
   ) {
      long var29 = 7572666924643012451L;
      illIilIiIilIilIi var15 = x.IliIlllilIi(id);
      long var16 = System.nanoTime();
      if (var16 - var15.lIlIIllIIi > 300000000L) {
         var15.iIlIIllIIi = var16;
      }

      var15.lIlIIllIIi = var16;
      float var18 = 1.0F;
      if (var15.iIlIIllIIi != 0L) {
         float var19 = (float)(var16 - var15.iIlIIllIIi) / 2.2E8F;
         if (var19 >= 1.0F) {
            var15.iIlIIllIIi = 0L;
         } else {
            var18 = liiiIIllIl(var19);
         }
      }

      float var33 = (1.0F - var18) * 4.0F;
      var29 ^= ((long)(var33 > 0.0F ? 1 : 0) << 32 ^ var29) & -1L << 32;
      if ((int)(var29 >>> 32) != 0) {
         IIIiiIillIIiiIil.liiiIIllIl().method_22903();
         IIIiiIillIIiiIil.liiiIIllIl().method_46416(0.0F, var33, 0.0F);
         h.method_51448().pushMatrix();
         h.method_51448().translate(0.0F, var33);
      }

      float var21 = IliiIilliiIi.IilliliilIIi(var18);

      try {
         float var22 = IIiilIiiiIii().IilliliilIIi();
         float var23 = 26.0F + var22 + 3.0F + var22 * 0.82F + (hits == null ? 0.0F : 28.0F);
         float var24 = my + Math.max(0.0F, (ctx - var23) / 2.0F);
         float var25 = y + mx / 2.0F;
         if (anims != null) {
            var29 ^= ((long)IlIlllIlilIl(h, var25, var24 + 9.0F, 0.86F + 0.14F * IilliliilIIi(var18, 1.9F)) ^ var29) & -1L >>> 32;
            iiIlilIlIIllilIl.IliIlllilIi(var25 - 9.0F, var24, 18.0F, 18.0F, anims, new Color(-10722709, true), IIIiiIillIIiiIil.liiiIIllIl());
            IiIlliIliiIl(h, (boolean)((int)var29));
         }

         float var26 = var24 + 18.0F + 8.0F;
         iiIIlIIlIl(cta, var25 - llIIlilIIl(cta) / 2.0F, var26, -920587);
         var26 += var22 + 3.0F;
         if (icon != null && !icon.isEmpty()) {
            lIlIliIlIl(icon, var25 - IiIIlliIIl(icon, 0.82F) / 2.0F, var26, 0.82F, -7630437);
         }

         if (hits != null) {
            float var27 = Math.max(40.0F, (float)Math.ceil((double)llIIlilIIl(hits)) + 18.0F);
            lIilliIill(h, sub, x, id, hits, var25 + var27 / 2.0F, var26 + var22 * 0.82F + 10.0F, 18.0F, w, title, false, act);
         }
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var21);
         if ((int)(var29 >>> 32) != 0) {
            h.method_51448().popMatrix();
            IIIiiIillIIiiIil.liiiIIllIl().method_22909();
         }
      }
   }

   public static float lllllillll(
      class_332 act,
      IIllIIIllIllIIIl anims,
      iIliililIlliilil h,
      String mx,
      String hits,
      class_2960 xRight,
      float y,
      float ctx,
      float enabled,
      int label,
      int id,
      boolean icon,
      Runnable my
   ) {
      return Iillllilll(act, anims, h, mx, hits, xRight, y, ctx, enabled, 0.0F, label, id, icon, my);
   }

   private static float llIililIil(
      class_332 hits,
      IIllIIIllIllIIIl h,
      iIliililIlliilil mx,
      String y,
      String listen,
      class_2960 id,
      float trailingIcon,
      float label,
      float act,
      float ctx,
      int xRight,
      int my,
      float minW,
      float anims,
      Runnable accent
   ) {
      long var32 = -715555867014338504L;
      long var28 = 4973551571321252580L;
      long var30 = -9024383584238135705L;
      float var15 = 7.0F;
      float var16 = 8.0F;
      illIilIiIilIilIi var17 = mx.IliIlllilIi(y);
      float var18 = id == null ? 0.0F : 5.0F + var16;
      float var19 = IiIiliIiiiIi(var17, listen, null, Math.max(ctx, (float)Math.ceil((double)llIIlilIIl(listen)) + var15 * 2.0F + var18));
      float var20 = trailingIcon - var19;
      float var21 = mx.IIIllIIliIIl(y, Iliilliiilii((double)xRight, (double)my, var20, label, var19, act));
      var28 ^= ((long)(anims > 0.01F ? 1 : 0) << 32 ^ var28) & -1L << 32;
      float var23 = (int)(var28 >>> 32) != 0 ? iliIiiliiiii(1.5) : 0.0F;
      var28 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IilIIIIililIIIIi.Illlllllilll(-15461350, -14737624, (double)var21), IlIIilIlllIIilIl.lliiIlliIl, 0.1 * (double)anims
               )
               ^ var28
         )
         & -1L >>> 32;
      var30 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                     IilIIIIililIIIIi.Illlllllilll(IIIiiIillIIiiIil.IlIillIiilIi((double)var21), IilIIIIililIIIIi.IIlllIlliIll(0.78), (double)minW),
                     IilIIIIililIIIIi.IIlllIlliIll(0.6 + 0.32 * (double)var23),
                     (double)anims
                  )
                  << 32
               ^ var30
         )
         & -1L << 32;
      var30 ^= ((long)IlIlllIlilIl(hits, var20 + var19 / 2.0F, label + act / 2.0F, mx.IilliliilIIi(y, 0.05F)) ^ var30) & -1L >>> 32;
      if ((int)(var28 >>> 32) != 0) {
         IIIiiIillIIiiIil.IIlllIlliIll(
            hits, var20, label, var19, act, 5.0F, IilIIIIililIIIIi.IIlllIlliIll((0.16 + 0.24 * (double)var23) * (double)anims), 3.5F + 1.5F * var23, 0.85F
         );
      }

      IIIiiIillIIiiIil.Ililllililil(hits, var20, label, var19, act, 5.0F, (int)var28, (int)(var30 >>> 32));
      if ((int)(var28 >>> 32) != 0) {
         Iilililiiili(var20, label, var19, act, 5.0F, anims);
      }

      var32 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                     IilIIIIililIIIIi.Illlllllilll(-920587, IlIIilIlllIIilIl.lliiIlliIl, (double)var21 * 0.8), IlIIilIlllIIilIl.lliiIlliIl, (double)minW
                  )
                  << 32
               ^ var32
         )
         & -1L << 32;
      IIlilIliiIli(var17, id == null ? 1 : 2, listen, null, var20, label, var19, act, (int)(var32 >>> 32));
      if (id != null) {
         iiIlilIlIIllilIl.IliIlllilIi(
            var20 + var19 - var15 - var16 + 1.0F,
            label + (act - var16) / 2.0F,
            var16,
            var16,
            id,
            new Color(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var21), true),
            IIIiiIillIIiiIil.liiiIIllIl()
         );
      }

      IiIlliIliiIl(hits, (boolean)((int)var30));
      h.iIlIlllllill(var20, label - 1.0F, var19, act + 2.0F, accent, mx, y);
      return var20;
   }

   public static float liiiIIllIl(float t) {
      float var1 = 1.0F - IliIlllilIi(t);
      return 1.0F - var1 * var1 * var1;
   }

   public static float Illlllllilll(float closing, boolean t) {
      closing = IliIlllilIi(closing);
      return t ? 1.0F - 0.036000002F * closing * closing : 0.94F + 0.060000002F * IilliliilIIi(closing, 1.6F);
   }

   public static void iIlllIllll(
      class_332 y,
      IIllIIIllIllIIIl icon,
      iIliililIlliilil box,
      String id,
      class_2960 mx,
      float iconSize,
      float ctx,
      float active,
      float act,
      int anims,
      int hits,
      boolean danger,
      float my,
      Runnable x
   ) {
      long var23 = -267807077454272234L;
      long var25 = -8254961722575533268L;
      long var27 = 4548699474175496805L;
      float var14 = box.IIIllIIliIIl(id, Iliilliiilii((double)anims, (double)hits, iconSize, ctx, active, active));
      var23 ^= ((long)(danger ? -1750963 : IlIIilIlllIIilIl.lliiIlliIl) << 32 ^ var23) & -1L << 32;
      float var16 = danger ? 0.35F + 0.65F * Math.max(var14, my) : my;
      var23 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.03 + 0.06 * (double)var14),
                  (int)(var23 >>> 32),
                  0.14 * (double)var16 + (danger ? 0.55 : 0.14) * (double)my
               )
               ^ var23
         )
         & -1L >>> 32;
      var25 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                     IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, (double)var14),
                     IIIIllIIIl((int)(var23 >>> 32), danger ? 0.55F + 0.45F * my : 0.55F),
                     (double)var16
                  )
                  << 32
               ^ var25
         )
         & -1L << 32;
      var25 ^= ((long)IlIlllIlilIl(y, iconSize + active / 2.0F, ctx + active / 2.0F, box.IilliliilIIi(id, 0.07F)) ^ var25) & -1L >>> 32;
      IIIiiIillIIiiIil.Ililllililil(y, iconSize, ctx, active, active, 5.0F, (int)var23, (int)(var25 >>> 32));
      var27 ^= (
            (long)(
                     danger
                        ? IilIIIIililIIIIi.Illlllllilll(-7630437, -1750963, 0.7 + 0.3 * (double)var14)
                        : IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var14)
                  )
                  << 32
               ^ var27
         )
         & -1L << 32;
      var27 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll((int)(var27 >>> 32), danger ? -1 : IilIIIIililIIIIi.Illlllllilll((int)(var23 >>> 32), -1, 0.22), (double)my)
               ^ var27
         )
         & -1L >>> 32;
      float var22 = (active - act) / 2.0F;
      iiIlilIlIIllilIl.IliIlllilIi(iconSize + var22, ctx + var22, act, act, mx, new Color((int)var27, true), IIIiiIillIIiiIil.liiiIIllIl());
      IiIlliIliiIl(y, (boolean)((int)var25));
      icon.iIlIlllllill(iconSize - 1.0F, ctx - 1.0F, active + 2.0F, active + 2.0F, x, box, id);
   }

   public static void Ililllililil(class_332 screenH, float amount, float ctx, float screenW) {
      if (!(screenW <= 0.002F)) {
         IIIiiIillIIiiIil.IilliliilIIi(screenH, -amount, -ctx, amount * 3.0F, ctx * 3.0F, IIIIllIIIl(-16777216, screenW));
      }
   }

   private static void Illillliilli(int icon, String y, class_2960 w, float h, float dy, float col, float x, int kind, float label) {
      float var9 = (float)IIiilIiiiIii().IlIillIiilIi(Math.round(dy), Math.round(x)) + label;
      if (icon == 0) {
         float var10 = w == null ? 0.0F : 13.0F;
         float var11 = h + 8.0F + (col - ((float)Math.ceil((double)llIIlilIIl(y)) + 16.0F + var10)) / 2.0F;
         if (w != null) {
            iiIlilIlIIllilIl.IliIlllilIi(var11 - 1.0F, dy + (x - 10.0F) / 2.0F + label, 10.0F, 10.0F, w, new Color(kind, true), IIIiiIillIIiiIil.liiiIIllIl());
            var11 += var10;
         }

         iiIIlIIlIl(y, var11, var9, kind);
      } else if (icon == 2) {
         iiIIlIIlIl(y, h + 7.0F, var9, kind);
      } else {
         iiIIlIIlIl(y, IIIllIIliIIl(h + (col - llIIlilIIl(y)) / 2.0F), var9, kind);
      }
   }

   public static float Iillllilll(
      class_332 hits,
      IIllIIIllIllIIIl my,
      iIliililIlliilil mx,
      String xRight,
      String label,
      class_2960 y,
      float act,
      float h,
      float ctx,
      float icon,
      int minW,
      int id,
      boolean enabled,
      Runnable anims
   ) {
      return iilllIIill(hits, my, mx, xRight, label, y, act, h, ctx, icon, minW, id, enabled, 0.0F, anims);
   }

   public static float ilillIiill(
      class_332 y,
      IIllIIIllIllIIIl ctx,
      iIliililIlliilil act,
      String id,
      String h,
      float anims,
      float label,
      float my,
      int hits,
      int danger,
      boolean mx,
      float xLeft,
      Runnable armed
   ) {
      return liilliiill(y, ctx, act, id, h, anims, true, label, my, 40.0F, hits, danger, mx, xLeft, armed);
   }

   public static float IIIillIIil(
      class_332 trailingIcon,
      IIllIIIllIllIIIl h,
      iIliililIlliilil accent,
      String xRight,
      String mx,
      class_2960 my,
      float anims,
      float minW,
      float ctx,
      float id,
      int label,
      int y,
      float hits,
      Runnable act
   ) {
      return llIililIil(trailingIcon, h, accent, xRight, mx, my, anims, minW, ctx, id, label, y, hits, 0.0F, act);
   }

   public static void Iiiilliiil(float h, float x2, float x, float y1, float x1, float y2, int r, float w, float y, float stroke, float color) {
      if (!(x <= 0.0F) && !(y1 <= 0.0F) && !(stroke <= w) && !(color <= y)) {
         float var11 = IliiIilliiIi.Illlllllilll();
         IliiIilliiIi.Iiilliiliiil(
            IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(),
            w,
            y,
            stroke,
            color,
            h / var11,
            x2 / var11,
            x / var11,
            y1 / var11,
            x1 / var11,
            y2 / var11,
            (float)(r >> 16 & 0xFF) / 255.0F,
            (float)(r >> 8 & 0xFF) / 255.0F,
            (float)(r & 0xFF) / 255.0F,
            (float)(r >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl
         );
      }
   }

   public static float iilllIIill(
      class_332 h,
      IIllIIIllIllIIIl armed,
      iIliililIlliilil label,
      String enabled,
      String minW,
      class_2960 xRight,
      float anims,
      float act,
      float ctx,
      float my,
      int id,
      int icon,
      boolean y,
      float hits,
      Runnable mx
   ) {
      long var24 = 2420422011478534697L;
      illIilIiIilIilIi var15 = label.IliIlllilIi(enabled);
      float var16 = (float)Math.ceil((double)llIIlilIIl(minW)) + 16.0F + (xRight == null ? 0.0F : 13.0F);
      float var17 = IiIiliIiiiIi(var15, minW, xRight, Math.max(my, var16));
      float var18 = anims - var17;
      float var19 = label.IIIllIIliIIl(enabled, y && Iliilliiilii((double)id, (double)icon, var18, act, var17, ctx));
      float var20 = var15.IliIlllilIi(y ? 1.0F : 0.0F, 14.0F);
      float var21 = Math.max(var19, hits) * var20;
      var24 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                     IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), IlIIilIlllIIilIl.lliiIlliIl, 0.16),
                     IilIIIIililIIIIi.Illlllllilll(IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F), -1, 0.1 * (double)var19 + 0.07 * (double)hits),
                     (double)var20
                  )
                  << 32
               ^ var24
         )
         & -1L << 32;
      var24 ^= ((long)IlIlllIlilIl(h, var18 + var17 / 2.0F, act + ctx / 2.0F, label.IilliliilIIi(enabled, 0.05F)) ^ var24) & -1L >>> 32;
      if (var21 > 0.01F) {
         IIIiiIillIIiiIil.IiIlliIliiIl(
            h, var18, act, var17, ctx, 5.0F, IilIIIIililIIIIi.IIlllIlliIll(0.16 * (double)var21 + 0.1 * (double)hits * (double)var20), 4.0F, 0.5F
         );
      }

      IIIiiIillIIiiIil.IlIlllIlilIl(h, var18, act, var17, ctx, 5.0F, (int)(var24 >>> 32));
      IIlilIliiIli(var15, 0, minW, xRight, var18, act, var17, ctx, IilIIIIililIIIIi.Illlllllilll(-7630437, Iiiiliiiiiii(), (double)var20));
      IiIlliIliiIl(h, (boolean)((int)var24));
      if (y) {
         armed.iIlIlllllill(var18, act - 1.0F, var17, ctx + 2.0F, mx, label, enabled);
      }

      return var18;
   }

   public static void lIIIiiIIIi(class_332 x, String ctx, float name, float size, float y) {
      class_8685 var5 = ctx == null ? null : IiIiiIIlliIiiIIl.IilliliilIIi(ctx);
      if (var5 != null) {
         Matrix4f var9 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
         class_2960 var10 = var5.comp_1626().comp_3627();
         float var11 = Math.max(3.0F, y / 5.0F);
         IliiIilliiIi.Iliilliiilii(var9, name, size, name + y, size + y, 0.125F, 0.125F, 0.25F, 0.25F, var10, var11);
         IliiIilliiIi.Iliilliiilii(var9, name, size, name + y, size + y, 0.625F, 0.125F, 0.75F, 0.25F, var10, var11);
      } else {
         float var6 = Math.max(3.0F, y / 4.0F);
         IIIiiIillIIiiIil.Ililllililil(
            x,
            name,
            size,
            y,
            y,
            var6,
            IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), IlIIilIlllIIilIl.lliiIlliIl, 0.16),
            IilIIIIililIIIIi.IIlllIlliIll(0.3)
         );
         String var7 = ctx != null && !ctx.isEmpty()
            ? ctx.substring(0, 1).toUpperCase(Locale.ROOT)
            : IliIilliIi<"IliIilliIi","Y3oAB1ERVpKUWQTIf1tW/sBWW8CeHmsaRQCuIEU=">();
         float var8 = llIIlilIIl(var7);
         iiIIlIIlIl(
            var7,
            name + (y - var8) / 2.0F,
            (float)IIiilIiiiIii().IlIillIiilIi(Math.round(size), Math.round(y)),
            IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.25)
         );
      }
   }

   public static int iIiIlIliIl(int gap, int innerW, int x, int index, int cols) {
      return gap + Math.round((float)(cols * (innerW + index)) / (float)x);
   }

   public static float iiIilIIlil(class_332 rgb, String ctx, float label, float x, int y) {
      long var9 = -9038359944787593111L;
      float var5 = 0.78F;
      float var6 = 11.0F;
      float var7 = (float)Math.ceil((double)IiIIlliIIl(ctx, var5)) + 10.0F;
      var9 ^= ((long)(0xFF000000 | y & 16777215) << 32 ^ var9) & -1L << 32;
      IIIiiIillIIiiIil.Ililllililil(rgb, label, x, var7, var6, 5.0F, IIIIllIIIl((int)(var9 >>> 32), 0.18F), IIIIllIIIl((int)(var9 >>> 32), 0.42F));
      lIlIliIlIl(ctx, label + 5.0F, IllIllllIl(x, var6, var5), var5, IilIIIIililIIIIi.Illlllllilll((int)(var9 >>> 32), -1, 0.3));
      return var7;
   }

   public static void iiiilIIIIi(
      float x, float y1, float r, float y2, float fill, int w, float x1, float strength, boolean glow, float h, float y, float color, float x2
   ) {
      if (!(r <= 0.0F) && !(y2 <= 0.0F) && !(color <= h) && !(x2 <= y)) {
         float var13 = IliiIilliiIi.Illlllllilll();
         IliiIilliiIi.IIIilIIiiIIi(
            IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(),
            h,
            y,
            color,
            x2,
            x / var13,
            y1 / var13,
            r / var13,
            y2 / var13,
            fill / var13,
            (float)(w >> 16 & 0xFF) / 255.0F,
            (float)(w >> 8 & 0xFF) / 255.0F,
            (float)(w & 0xFF) / 255.0F,
            (float)(w >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl,
            x1,
            strength,
            glow
         );
      }
   }

   public static float IIlllIlliIll(float closing, boolean t) {
      closing = IliIlllilIi(closing);
      return t ? 1.0F - closing * closing : liiiIIllIl(closing / 0.6F);
   }

   public static float lIIlliIIll(
      class_332 id,
      IIllIIIllIllIIIl anims,
      iIliililIlliilil ctx,
      String labels,
      String[] hits,
      int y,
      float xRight,
      float active,
      float onPick,
      int my,
      int h,
      IntConsumer mx
   ) {
      long var17 = 2631685584188322383L;
      float var12 = 1.0F;
      String[] var13 = hits;
      var17 ^= ((long)hits.length << 32 ^ var17) & -1L << 32;

      for (long var21 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var21 < (int)(var21 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
         String var16 = var13[(int)var21];
         var12 += (float)Math.ceil((double)llIIlilIIl(var16)) + 12.0F + 1.0F;
      }

      float var19 = xRight - var12;
      IlIllllIll(id, anims, ctx, labels, hits, y, var19, active, onPick, onPick - 2.0F, 6.0F, 5.0F, my, h, mx);
      return var19;
   }

   private static void Iilililiiili(float y, float r, float amount, float h, float x, float w) {
      long var12 = -6526957702279312201L;
      float var6 = IIIiiIillIIiiIil.Illlllllilll();
      float var7 = iIlIlllllill((float)((double)System.nanoTime() / 1.0E9 / 1.7 % 1.0));
      float var8 = y - 14.0F + (amount + 28.0F) * var7;
      var12 ^= ((long)IIIIllIIIl(IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.55), 0.24F * w) << 32 ^ var12) & -1L << 32;

      for (long var15 = var12 ^ (1L ^ var12) & -1L >>> 32; (int)var15 <= 4; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         float var11 = 3.0F * (float)((int)var15);
         Iiiilliiil(
            y, r, amount, h, x, var6, (int)(var15 >>> 32), Math.max(y - 1.0F, var8 - var11), r - 1.0F, Math.min(y + amount + 1.0F, var8 + var11), r + h + 1.0F
         );
      }
   }

   private static void lliililiil(float color, float w, float h, float solid, float f, float tab, float r, int x, boolean y) {
      float var9 = w + 16.0F;
      float var10 = solid - 16.0F;
      float var11 = w + solid;
      float var12 = color + f + r;
      float var13 = tab * 2.0F + 2.0F;
      float var14 = 3.0F / IliiIilliiIi.Illlllllilll();
      float var15 = 5.0F;
      iiiilIIIIi(color, w, f, 16.0F + var13, tab, x, var14, 0.85F, y, color - var15, w - var15, var12, var9);
      iiiilIIIIi(color, var9 - var13, h, var10 + var13, tab, x, var14, 0.85F, y, color - var15, var9, var12, var11 + var15);
      iiiilIIIIi(color, var9, h, var10, tab, x, var14, 0.85F, y, var12, var9 - var15, color + h + var15, var11 + var15);
      iiiilIIIIi(color, var9, h, var10, tab, x, var14, 0.85F, y, color + f, var9 - var15, var12, var9);
   }

   public static float IIlIilIlIi(class_332 textColor, int rest, int dotColor, String x, float ctx, float label, boolean y) {
      float var7 = 4.0F;
      float var8 = label + 7.6219F - var7 / 2.0F;
      IIIiiIillIIiiIil.IlIlllIlilIl(textColor, IIIllIIliIIl(ctx), y ? IIIllIIliIIl(var8) : var8, var7, var7, var7 / 2.0F, rest);
      lIlIliIlIl(x, IIIllIIliIIl(ctx) + var7 + 4.0F, label, 0.82F, dotColor);
      return iIlIiIllIi(x);
   }

   private static String illIlIilIl(char c) {
      return c < iIIiiiilil.length ? iIIiiiilil[c] : String.valueOf(c);
   }

   public static void ilIllIiIll(class_332 ctx, float x, float active, float frac, float midY, float w) {
      long var20 = -2954578614152226437L;
      long var22 = 3797630536159227630L;
      float var6 = 4.0F;
      float var7 = var6 / 2.0F;
      float var8 = active - var7;
      IIIiiIillIIiiIil.IlIlllIlilIl(ctx, x, var8, frac, var6, var7, IilIIIIililIIIIi.Illlllllilll(-13948620, IlIIilIlllIIilIl.lliiIlliIl, 0.04));
      float var9 = IIIllIIliIIl(frac * IliIlllilIi(midY));
      if (var9 > 0.0F) {
         var20 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-14673876, IlIIilIlllIIilIl.lliiIlliIl, 0.4) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-14410956, IlIIilIlllIIilIl.lliiIlliIl, 0.64) ^ var20) & -1L >>> 32;
         IIIiiIillIIiiIil.IiIlliIliiIl(ctx, x, var8, var9, var6, var7, IilIIIIililIIIIi.IIlllIlliIll(0.34), 3.5F, 0.34F);
         IIIiiIillIIiiIil.IlIlllIlilIl(ctx, x, var8, var9, var6, var7, (int)(var20 >>> 32));
         float var12 = x + var7;
         float var13 = x + var9 - var12;
         if (var13 >= IIIiiIillIIiiIil.Illlllllilll()) {
            class_4588 var14 = llIllIililIllIil.IilliliilIIi();
            var22 ^= ((long)Math.max(1, (int)(var13 / 2.0F)) << 32 ^ var22) & -1L << 32;

            for (long var28 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var28 < (int)(var28 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
               float var17 = var12 + var13 * (float)((int)var28) / (float)((int)(var28 >>> 32));
               float var18 = var12 + var13 * (float)((int)var28 + 1) / (float)((int)(var28 >>> 32));
               float var19 = ((var17 + var18) * 0.5F - x) / frac;
               llIllIililIllIil.iliIiiliiiii(
                  var14, var17, var8, var18, var8 + var6, IliiIilliiIi.IlIlllIlilIl(iIillliIlillli.iliIiiliiiii((int)(var20 >>> 32), (int)var20, var19))
               );
            }

            llIllIililIllIil.IIillIiliIil();
         }
      }

      float var10 = 3.0F + 0.5F * IliIlllilIi(w);
      float var11 = x + var9 - var10;
      float var24 = active - var10;
      IIIiiIillIIiiIil.IiIlliIliiIl(
         ctx, var11, var24, var10 * 2.0F, var10 * 2.0F, var10, IilIIIIililIIIIi.IIlllIlliIll(0.24 + 0.18 * (double)w), 4.0F, 0.34F + 0.16F * w
      );
      IIIiiIillIIiiIil.IlIlllIlilIl(ctx, var11, var24, var10 * 2.0F, var10 * 2.0F, var10, -658441);
   }

   public static float iIIilIlIil(
      class_332 label,
      IIllIIIllIllIIIl act,
      iIliililIlliilil minW,
      String listen,
      String my,
      float anims,
      float mx,
      float xRight,
      float y,
      int h,
      int ctx,
      float id,
      Runnable hits
   ) {
      return llIililIil(label, act, minW, listen, my, null, anims, mx, xRight, y, h, ctx, id, id, hits);
   }

   public static float IiiIlliiIl(class_332 ctx, String rowY, float rowH, float x, float title) {
      float var5 = IllIllllIl(x, title, 1.22F);
      lIlIliIlIl(rowY, rowH, var5, 1.22F, -920587);
      lIlIliIlIl(rowY, rowH + IIIiiIillIIiiIil.Illlllllilll(), var5, 1.22F, IIIIllIIIl(-920587, 0.55F));
      return rowH + IiIIlliIIl(rowY, 1.22F);
   }

   public static float IliIlllilIi(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static boolean Iliilliiilii(double w, double mx, float my, float h, float x, float y) {
      return w >= (double)my && w <= (double)(my + x) && mx >= (double)h && mx <= (double)(h + y);
   }

   public static float Iilllilliill(float closing, boolean t) {
      closing = IliIlllilIi(closing);
      return t ? 1.0F - closing : liiiIIllIl(closing / 0.8F);
   }

   public static float llIIlilIIl(String s) {
      return IIiilIiiiIii().iIlIlllllill(s);
   }

   public static float lIliliIlil(class_332 ctx, String label, float y, float x) {
      float var4 = 0.78F;
      float var5 = 11.0F;
      float var6 = IiIilliIil(label);
      IIIiiIillIIiiIil.IlIlllIlilIl(ctx, y, x, var6, var5, 5.0F, IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F));
      lIlIliIlIl(label, y + 5.0F, IllIllllIl(x, var5, var4), var4, Iiiiliiiiiii());
      return var6;
   }

   public static void illilIilil(class_332 press, float y, float hover, float ctx, float x, float active, float w, float h) {
      IIiIllIllIiIllIl.IlIlllIlilIl(press, y, hover, ctx, x, 7.0F, (double)h, (double)active, (double)w);
   }

   public static float iIlIlllllill(float t) {
      t = IliIlllilIi(t);
      if (t < 0.5F) {
         return 4.0F * t * t * t;
      } else {
         float var1 = 1.0F - t;
         return 1.0F - 4.0F * var1 * var1 * var1;
      }
   }

   public static void IIIilIIiiIIi(class_332 ctx, float x, float w, float h, float fill, int edge, int y) {
      IIIiiIillIIiiIil.IiIlliIliiIl(ctx, x + 3.0F, w + 7.0F, h - 6.0F, fill - 4.0F, 10.0F, 1375731712, 20.0F, 1.0F);
      IIIiiIillIIiiIil.Ililllililil(ctx, x, w, h, fill, 10.0F, edge, y);
   }

   private static float iliIiiliiiii(double seconds) {
      return (float)((Math.sin((double)System.nanoTime() / 1.0E9 * Math.PI * 2.0 / seconds) + 1.0) / 2.0);
   }

   public static float Ilillllill(
      class_332 my,
      IIllIIIllIllIIIl id,
      iIliililIlliilil anims,
      String minW,
      String xRight,
      float act,
      float label,
      float mx,
      float hits,
      int danger,
      int ctx,
      boolean armed,
      float h,
      Runnable y
   ) {
      return liilliiill(my, id, anims, minW, xRight, act, false, label, mx, hits, danger, ctx, armed, h, y);
   }

   private static float lIiiIiIlilli(float t) {
      return t < 0.3F ? liiiIIllIl(t / 0.3F) : 1.0F - IilliliilIIi((t - 0.3F) / 0.7F, 2.0F);
   }

   private static float IlIllllIll(
      class_332 mx,
      IIllIIIllIllIIIl radius,
      iIliililIlliilil my,
      String trackH,
      String[] x,
      int labels,
      float hits,
      float pillH,
      float anims,
      float onPick,
      float id,
      float ctx,
      int pad,
      int trackY,
      IntConsumer active
   ) {
      long var33 = 8614646282175964402L;
      long var35 = -7175896963704442330L;
      long var37 = 4767670119841447133L;
      long var39 = 7626617631537128034L;
      float var15 = (anims - onPick) / 2.0F;
      float var16 = pillH + var15;
      float[] var17 = new float[x.length];
      float[] var18 = new float[x.length];
      float var19 = hits + var15;

      for (var33 ^= (0L ^ var33) & -1L << 32; (int)(var33 >>> 32) < x.length; var33 += 4294967296L) {
         var17[(int)(var33 >>> 32)] = var19;
         var18[(int)(var33 >>> 32)] = (float)Math.ceil((double)llIIlilIIl(x[(int)(var33 >>> 32)])) + id * 2.0F;
         var19 += var18[(int)(var33 >>> 32)] + var15;
      }

      IIIiiIillIIiiIil.Ililllililil(mx, hits, pillH, var19 - hits, anims, ctx, IilIIIIililIIIIi.IlIlllIlilIl(), IilIIIIililIIIIi.IIillIiliIil());
      var33 ^= ((long)Math.max(0, Math.min(x.length - 1, labels)) << 32 ^ var33) & -1L << 32;
      float var21 = my.iliIiiliiiii(trackH + IliIilliIi<"IliIilliIi","iYGFD8WKCpBgY0t/EbfxAbmseKiOSJgK200MkDAX">(), var17[(int)(var33 >>> 32)] - hits, 20.0F)
         + hits;
      float var22 = my.iliIiiliiiii(trackH + IliIilliIi<"IliIilliIi","97lT26r4Q0Em0s1BirjMArIys4s5xG8ambTIM5p3">(), var18[(int)(var33 >>> 32)], 20.0F);
      illIilIiIilIilIi var23 = my.IliIlllilIi(trackH);
      float var24 = my.IilliliilIIi(trackH, 0.07F);
      var33 ^= ((long)IlIlllIlilIl(mx, var21 + var22 / 2.0F, var16 + onPick / 2.0F, var24) ^ var33) & -1L >>> 32;
      IIIiiIillIIiiIil.IlIlllIlilIl(mx, var21, var16, var22, onPick, ctx - var15, IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F));
      IiIlliIliiIl(mx, (boolean)((int)var33));
      var35 ^= ((long)IIiilIiiiIii().IlIillIiilIi(Math.round(var16), Math.round(onPick)) << 32 ^ var35) & -1L << 32;

      for (long var45 = var35 ^ (0L ^ var35) & -1L >>> 32; (int)var45 < x.length; var45 ^= (var45 ^ var45 + (long)1) & -1L >>> 32) {
         long var46 = var37 ^ ((long)Iliilliiilii((double)pad, (double)trackY, var17[(int)var45], var16, var18[(int)var45], onPick) << 32 ^ var37) & -1L << 32;
         float var29 = my.IIIllIIliIIl(
            trackH + IliIilliIi<"IliIilliIi","UPEPB7KureAq3V7Tu45AZC2fiTItqwDh5iP/mxO8">() + (int)var45,
            (int)(var46 >>> 32) != 0 && (int)var45 != (int)(var33 >>> 32)
         );
         float var30 = my.lIiiIiIlilli(
            trackH + IliIilliIi<"IliIilliIi","p8nbu2OqpC1VQ9hmHOepwEqYaQD9EIhLlQbQ7c4qLA==">() + (int)var45,
            (int)var45 == (int)(var33 >>> 32) ? 1.0F : 0.0F,
            (int)var45 == (int)(var33 >>> 32) ? 1.0F : 0.0F,
            18.0F
         );
         var37 = var46 ^ ((long)IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var29) ^ var46) & -1L >>> 32;
         var33 ^= (
               (long)((int)var45 == var23.IllIIllIIi && IlIlllIlilIl(mx, var17[(int)var45] + var18[(int)var45] / 2.0F, var16 + onPick / 2.0F, var24) ? 1 : 0)
                  ^ var33
            )
            & -1L >>> 32;
         iiIIlIIlIl(
            x[(int)var45], var17[(int)var45] + id, (float)((int)(var45 >>> 32)), IilIIIIililIIIIi.Illlllllilll((int)var37, Iiiiliiiiiii(), (double)var30)
         );
         IiIlliIliiIl(mx, (boolean)((int)var33));
         var39 ^= ((long)((int)var45) << 32 ^ var39) & -1L << 32;
         radius.iIlIlllllill(var17[(int)var45], pillH, var18[(int)var45], anims, () -> {
            var23.IllIIllIIi = c;
            active.accept(c);
         }, my, trackH);
      }

      return var19;
   }

   public static float ilIIiIiIIi(class_332 x, boolean ctx, String online, float label, float y, boolean rest) {
      return IIlIilIlIi(x, ctx ? -10761846 : -10722709, ctx ? IilIIIIililIIIIi.Illlllllilll(-10761846, -7630437, 0.35) : -7630437, online, label, y, rest);
   }

   public static int IIillIiliIil() {
      return IilIIIIililIIIIi.liiiIIllIl() ? -267579372 : -15921132;
   }

   private llilliilililliil() {
   }

   private static void IIlilIliiIli(illIilIiIilIilIi label, int c, String col, class_2960 y, float icon, float x, float kind, float w, int h) {
      if (label.iiIIIllIIi != 0L && label.illIIllIIi != null) {
         float var9 = IliIlllilIi(label.lIiIIllIIi / 0.45F);
         float var10 = liiiIIllIl((label.lIiIIllIIi - 0.3F) / 0.7F);
         if (var9 < 1.0F) {
            float var11 = IliiIilliiIi.IilliliilIIi(1.0F - var9);

            try {
               Illillliilli(c, label.illIIllIIi, label.lilIIllIIi, icon, x, kind, w, h, -3.0F * var9);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var11);
            }
         }

         if (var10 > 0.0F) {
            float var20 = IliiIilliiIi.IilliliilIIi(var10);

            try {
               Illillliilli(c, col, y, icon, x, kind, w, h, 3.0F * (1.0F - var10));
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var20);
            }
         }
      } else {
         Illillliilli(c, col, y, icon, x, kind, w, h, 0.0F);
      }
   }

   public static float liIlliiIll(
      class_332 ctx,
      IIllIIIllIllIIIl xRight,
      iIliililIlliilil rowH,
      String mx,
      class_2960 armed,
      String confirm,
      float icon,
      float rowY,
      float hits,
      int anims,
      int my,
      boolean act,
      Runnable id
   ) {
      float var13 = 18.0F;
      float var14 = icon - var13;
      float var15 = rowY + (hits - var13) / 2.0F;
      float var16 = var14 - 2.0F;
      float var17 = (float)Math.ceil((double)IiIIlliIIl(confirm, 0.82F)) + 14.0F;
      float var18 = var16 - var17;
      float var19 = rowH.iliIiiliiiii(mx + IliIilliIi<"IliIilliIi","GLyK0nXnKs2HT+xdL584XimGy3TtH1Jy+a7qKeKzftM=">(), act ? 1.0F : 0.0F, 18.0F);
      if (var19 > 0.01F) {
         float var20 = Math.max(10.0F, var17 * var19);
         float var21 = var19 >= 1.0F ? var18 : var16 - var20;
         float var22 = IliIlllilIi(var19 / 0.35F);
         float var23 = liiiIIllIl((var19 - 0.86F) / 0.14F);
         IIIiiIillIIiiIil.Ililllililil(ctx, var21, var15, var16 - var21, var13, 5.0F, IIIIllIIIl(-1750963, 0.13F * var22), IIIIllIIIl(-1750963, 0.42F * var22));
         if (var23 > 0.01F) {
            lIlIliIlIl(
               confirm,
               var18 + 7.0F,
               IllIllllIl(var15, var13, 0.82F) + 3.0F * (1.0F - var23),
               0.82F,
               IIIIllIIIl(IilIIIIililIIIIi.Illlllllilll(-1750963, -1, 0.18), var23)
            );
         }
      }

      if (act) {
         xRight.liiiIIllIl(var18, var15 - 1.0F, icon - var18, var13 + 2.0F, id);
      }

      iIlllIllll(ctx, xRight, rowH, mx, armed, var14, var15, var13, 12.0F, anims, my, true, var19, id);
      return var18;
   }

   public static void iiIIlIIlIl(String s, float x, float argb, int y) {
      IIiilIiiiIii().IliIlllilIi(s, x, argb, new Color(y, true));
   }

   public static float IlIillIiilIi(class_332 ctx, float error, float hover, float x, float w, class_2960 focus, float icon, float y, float h) {
      long var13 = -5933293369662700673L;
      float var9 = Math.max(icon, y * 0.5F);
      var13 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 1.0F), -1750963, (double)h) << 32 ^ var13) & -1L << 32;
      if (icon > 0.01F) {
         IIIiiIillIIiiIil.IIlllIlliIll(ctx, error, hover, x, w, 6.0F, IIIIllIIIl((int)(var13 >>> 32), 0.22F * icon), 3.0F, 0.85F);
      }

      var13 ^= (
            (long)IilIIIIililIIIIi.Illlllllilll(
                  IilIIIIililIIIIi.Illlllllilll(318767103, IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.86F), (double)var9), IIIIllIIIl(-1750963, 0.8F), (double)h
               )
               ^ var13
         )
         & -1L >>> 32;
      IIIiiIillIIiiIil.Ililllililil(ctx, error, hover, x, w, 6.0F, IilIIIIililIIIIi.IlIlllIlilIl(), (int)var13);
      if (focus == null) {
         return error + 9.0F;
      } else {
         float var12 = 12.0F;
         iiIlilIlIIllilIl.IliIlllilIi(
            error + 7.0F,
            hover + (w - var12) / 2.0F,
            var12,
            var12,
            focus,
            new Color(IilIIIIililIIIIi.Illlllllilll(-10722709, -920587, (double)var9), true),
            IIIiiIillIIiiIil.liiiIIllIl()
         );
         return error + 7.0F + var12 + 6.0F;
      }
   }
}
