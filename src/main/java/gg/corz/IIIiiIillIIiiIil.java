package gg.corz;

import java.awt.Color;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class IIIiiIillIIiiIil {
   private static class_4587 IllIlilIil = new class_4587();

   public static class_4587 liiiIIllIl() {
      return IllIlilIil;
   }

   public static void IilliliilIIi(class_332 h, float x, float ctx, float color, float y, int w) {
      if (!(color <= 0.0F) && !(y <= 0.0F)) {
         float var6 = IliiIilliiIi.Illlllllilll();
         Color var7 = new Color(w, true);
         IliiIilliiIi.Iilllilliill(
            IllIlilIil.method_23760().method_23761(),
            x - 1.0F,
            ctx - 1.0F,
            x + color + 1.0F,
            ctx + y + 1.0F,
            x / var6,
            ctx / var6,
            color / var6,
            y / var6,
            0.0F,
            (float)var7.getRed() / 255.0F,
            (float)var7.getGreen() / 255.0F,
            (float)var7.getBlue() / 255.0F,
            (float)var7.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl
         );
      }
   }

   public static void Iiilliiliiil(class_332 ctx, float stroke, float color, float y, float r, float w, float h, int x) {
      if (!(y <= 0.0F) && !(r <= 0.0F)) {
         float var8 = IliiIilliiIi.Illlllllilll();
         Color var9 = new Color(x, true);
         IliiIilliiIi.Iiilliiliiil(
            IllIlilIil.method_23760().method_23761(),
            stroke - 1.0F,
            color - 1.0F,
            stroke + y + 1.0F,
            color + r + 1.0F,
            stroke / var8,
            color / var8,
            y / var8,
            r / var8,
            w / var8,
            h / var8,
            (float)var9.getRed() / 255.0F,
            (float)var9.getGreen() / 255.0F,
            (float)var9.getBlue() / 255.0F,
            (float)var9.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl
         );
      }
   }

   public static int IlIillIiilIi(double active) {
      long var16 = 4196634022230476000L;
      long var18 = 839325311667252632L;
      long var20 = 6409575571418015108L;
      long var12 = 7711627244617239256L;
      long var14 = -5882306564089372289L;
      active = active < 0.0 ? 0.0 : (active > 1.0 ? 1.0 : active);
      var12 ^= (1369094282425663488L ^ var12) & -1L << 32;
      var12 ^= ((long)(-1610612736 | IlIIilIlllIIilIl.lliiIlliIl & 16777215) ^ var12) & -1L >>> 32;
      var14 ^= ((long)((int)(var12 >>> 32) >>> 24 & 0xFF) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)((int)(var12 >>> 32) >> 16 & 0xFF) ^ var14) & -1L >>> 32;
      var16 ^= ((long)((int)(var12 >>> 32) >> 8 & 0xFF) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)((int)(var12 >>> 32) & 0xFF) ^ var16) & -1L >>> 32;
      var18 ^= ((long)((int)var12 >>> 24 & 0xFF) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)((int)var12 >> 16 & 0xFF) ^ var18) & -1L >>> 32;
      var20 ^= ((long)((int)var12 >> 8 & 0xFF) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)((int)var12 & 0xFF) ^ var20) & -1L >>> 32;
      return (int)((double)((int)(var14 >>> 32)) + (double)((int)(var18 >>> 32) - (int)(var14 >>> 32)) * active) << 24
         | (int)((double)((int)var14) + (double)((int)var18 - (int)var14) * active) << 16
         | (int)((double)((int)(var16 >>> 32)) + (double)((int)(var20 >>> 32) - (int)(var16 >>> 32)) * active) << 8
         | (int)((double)((int)var16) + (double)((int)var20 - (int)var16) * active);
   }

   public static void IIlilIliiIli(class_332 ctx, int x, int w, int color, int r, int h, int y) {
      iliIiiliiiii(ctx, x - 1, w - 1, color + 2, r + 2, h, y, 4.0F, 0.4F);
      lIiiIiIlilli(ctx, x, w, color, r, h, -16184564);
   }

   public static void IIIllIIliIIl(class_332 clipH, float clipW, float clipY, float color, float h, float y, int ctx, float r, float w, float clipX, float x) {
      if (!(color <= 0.0F) && !(h <= 0.0F) && !(clipX <= 0.0F) && !(x <= 0.0F)) {
         float var11 = IliiIilliiIi.Illlllllilll();
         Color var12 = new Color(ctx, true);
         IliiIilliiIi.Iilllilliill(
            IllIlilIil.method_23760().method_23761(),
            r,
            w,
            r + clipX,
            w + x,
            clipW / var11,
            clipY / var11,
            color / var11,
            h / var11,
            y / var11,
            (float)var12.getRed() / 255.0F,
            (float)var12.getGreen() / 255.0F,
            (float)var12.getBlue() / 255.0F,
            (float)var12.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl
         );
      }
   }

   public static void Iilllilliill(class_332 r, float fill, float x, float h, float w, float y, int ctx, int edge) {
      IlIlllIlilIl(r, fill, x, h, w, y, ctx);
      Iiilliiliiil(r, fill, x, h, w, y, Illlllllilll(), edge);
   }

   public static void IlIlllIlilIl(class_332 color, float x, float h, float y, float ctx, float r, int w) {
      if (!(y <= 0.0F) && !(ctx <= 0.0F)) {
         float var7 = IliiIilliiIi.Illlllllilll();
         Color var8 = new Color(w, true);
         IliiIilliiIi.Iilllilliill(
            IllIlilIil.method_23760().method_23761(),
            x - 1.0F,
            h - 1.0F,
            x + y + 1.0F,
            h + ctx + 1.0F,
            x / var7,
            h / var7,
            y / var7,
            ctx / var7,
            r / var7,
            (float)var8.getRed() / 255.0F,
            (float)var8.getGreen() / 255.0F,
            (float)var8.getBlue() / 255.0F,
            (float)var8.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl
         );
      }
   }

   public static void IIlllIlliIll(class_332 w, float h, float glowIntensity, float y, float ctx, float color, int x, float r, float glowSize) {
      if (!(y <= 0.0F) && !(ctx <= 0.0F)) {
         float var9 = IliiIilliiIi.Illlllllilll();
         float var10 = Math.max(2.0F, r + 2.0F);
         Color var11 = new Color(x, true);
         IliiIilliiIi.IIIilIIiiIIi(
            IllIlilIil.method_23760().method_23761(),
            h - var10,
            glowIntensity - var10,
            h + y + var10,
            glowIntensity + ctx + var10,
            h / var9,
            glowIntensity / var9,
            y / var9,
            ctx / var9,
            color / var9,
            (float)var11.getRed() / 255.0F,
            (float)var11.getGreen() / 255.0F,
            (float)var11.getBlue() / 255.0F,
            (float)var11.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl,
            r / var9,
            glowSize,
            false
         );
      }
   }

   public static void lIiiIiIlilli(class_332 ctx, int r, int x, int h, int y, int color, int w) {
      IlIIlilllIIlil.IliIlllilIi((float)r, (float)x, (float)h, (float)y, (float)color, new Color(w, true), IllIlilIil);
   }

   public static void IiIiliIiiiIi(class_332 y, int w, int r, int x, int h, int ctx) {
      iliIllIiIiiIllIi.IliIlllilIi((float)w, (float)(r + 2), (float)x, (float)h, (float)ctx, new Color(Integer.MIN_VALUE, true), 8.0F, 0.3F, true, IllIlilIil);
   }

   public static void IIIilIIiiIIi(class_332 w, int color, int y, int ctx, int r, int x, float h, int stroke) {
      IlIIlilllIIlil.liiiIIllIl((float)color, (float)y, (float)ctx, (float)r, (float)x, h, new Color(stroke, true), IllIlilIil);
   }

   public static void IliIlllilIi(class_4587 ms) {
      IllIlilIil = ms;
   }

   public static void Ililllililil(class_332 fill, float edge, float x, float ctx, float h, float y, int w, int r) {
      float var8 = Illlllllilll();
      if (IilIIIIililIIIIi.liiiIIllIl()) {
         IlIlllIlilIl(fill, edge, x, ctx, h, y, w);
         Iiilliiliiil(fill, edge, x, ctx, h, y, var8, r);
      } else {
         IlIlllIlilIl(fill, edge, x, ctx, h, y, r);
         IlIlllIlilIl(fill, edge + var8, x + var8, ctx - var8 * 2.0F, h - var8 * 2.0F, Math.max(0.0F, y - var8), w);
      }
   }

   public static void iIlIlllllill(class_332 ctx, int radius, int cx, int cy, int color) {
      iliIllIiIiiIllIi.IliIlllilIi(
         (float)(radius - cy), (float)(cx - cy), (float)(cy * 2), (float)(cy * 2), (float)cy, new Color(color, true), 6.0F, 0.5F, true, IllIlilIil
      );
   }

   public static float Illlllllilll() {
      return IliiIilliiIi.Illlllllilll();
   }

   public static void iliIiiliiiii(class_332 y, int ctx, int h, int glowIntensity, int x, int glowSize, int w, float r, float color) {
      iliIllIiIiiIllIi.IliIlllilIi((float)ctx, (float)h, (float)glowIntensity, (float)x, (float)glowSize, new Color(w, true), r, color, true, IllIlilIil);
   }

   public static void IIillIiliIil(class_332 h, int r, int ctx, int w, int x, int fill, int edge, int y) {
      Ililllililil(h, (float)r, (float)ctx, (float)w, (float)x, (float)fill, edge, y);
   }

   public static void IiIlliIliiIl(class_332 x, float glowSize, float color, float h, float glowIntensity, float y, int ctx, float r, float w) {
      if (!(h <= 0.0F) && !(glowIntensity <= 0.0F)) {
         float var9 = IliiIilliiIi.Illlllllilll();
         float var10 = Math.max(2.0F, r + 2.0F);
         Color var11 = new Color(ctx, true);
         IliiIilliiIi.IIIilIIiiIIi(
            IllIlilIil.method_23760().method_23761(),
            glowSize - var10,
            color - var10,
            glowSize + h + var10,
            color + glowIntensity + var10,
            glowSize / var9,
            color / var9,
            h / var9,
            glowIntensity / var9,
            y / var9,
            (float)var11.getRed() / 255.0F,
            (float)var11.getGreen() / 255.0F,
            (float)var11.getBlue() / 255.0F,
            (float)var11.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl,
            r / var9,
            w,
            true
         );
      }
   }
}
