package gg.corz;

import net.minecraft.class_332;

public final class iiIlillIIllill {
   private static final int iiIllIlIiIIlllIlIi = 2303536;
   private static final int lIlllIlIiiIlllIlIi = 2632499;

   public static void Illlllllilll(class_332 fill, int edge, int r, int ctx, int w, int y, int x, int h) {
      IiIlliIliiIl(fill, edge, r, ctx, w, y, 1.0F, 18.0F, 0.05F, 2303536);
      IIiIllIllIiIllIl.lIiiIiIlilli(fill, (float)edge, (float)r, (float)ctx, (float)w, (float)y, x, h);
   }

   public static void IiIlliIliiIl(class_332 glow, int intensity, int rgb, int h, int r, int offset, float y, float w, float x, int ctx) {
      long var11 = 6210114787862826820L;
      if (!(x <= 0.002F)) {
         var11 ^= ((long)((int)(IliIlllilIi(x) * 255.0F)) << 32 ^ var11) & -1L << 32;
         IIIiiIillIIiiIil.iliIiiliiiii(glow, intensity, Math.round((float)rgb + y), h, r, offset, (int)(var11 >>> 32) << 24 | ctx & 16777215, w, 1.0F);
      }
   }

   private static float IliIlllilIi(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static void IIIllIIliIIl(class_332 x, int a, int r, int w, int y, float ctx) {
      IilliliilIIi(x, (float)(a + y), (float)r + 1.0F, (float)w - 2.0F * (float)y, iIlIlllllill(ctx));
   }

   public static void IIlllIlliIll(class_332 intensity, int ctx, int w, int h, int offset, int r, float glow, float y, float x) {
      IiIlliIliiIl(intensity, ctx, w, h, offset, r, glow, y, x, 2632499);
   }

   public static void iliIiiliiiii(class_332 ctx, int x, int y, int a, int w, int h, float r) {
      IilliliilIIi(ctx, (float)(x + h), (float)(y + w) - 2.0F, (float)a - 2.0F * (float)h, iIlIlllllill(r));
   }

   public static void lIiiIiIlilli(class_332 w, int x, int a, int ctx, int y, float r) {
      IilliliilIIi(w, (float)(x + y), (float)a + 1.0F, (float)ctx - 2.0F * (float)y, liiiIIllIl(r));
   }

   public static void IlIlllIlilIl(class_332 x, int h, int y, int offset, int intensity, int ctx, float r, float glow, float w) {
      if (!(w <= 0.002F)) {
         IIIiiIillIIiiIil.iliIiiliiiii(x, h, Math.round((float)y + r), offset, intensity, ctx, -16777216, glow, w);
      }
   }

   private iiIlillIIllill() {
   }

   public static void Iilllilliill(class_332 edge, int ctx, int x, int h, int w, int fill, int r, int y) {
      IIIiiIillIIiiIil.IIillIiliIil(edge, ctx, x, h, w, fill, r, y);
      IilliliilIIi(edge, (float)(ctx + fill), (float)x + IIIiiIillIIiiIil.Illlllllilll(), (float)h - 2.0F * (float)fill, iIlIlllllill(0.08F));
   }

   private static void IilliliilIIi(class_332 x, float ctx, float w, float y, int argb) {
      if (!(y <= 0.0F)) {
         IIIiiIillIIiiIil.IilliliilIIi(x, ctx, w, y, 1.0F, argb);
      }
   }

   public static void IIillIiliIil(class_332 press, int ctx, int x, int fill, int r, int edge, int w, int lift, float y, float h) {
      y = IliIlllilIi(y);
      h = IliIlllilIi(h);
      float var10 = (0.06F + 0.04F * y) * (1.0F - 0.85F * h);
      IIlllIlliIll(press, ctx, x, fill, r, edge, 0.7F + 0.4F * y, 4.0F + y * 2.0F, var10);
      IIIiiIillIIiiIil.IIillIiliIil(press, ctx, x, fill, r, edge, w, lift);
      if (h > 0.02F) {
         float var11 = IIIiiIillIIiiIil.Illlllllilll();
         IIIiiIillIIiiIil.IlIlllIlilIl(
            press,
            (float)ctx + var11,
            (float)x + var11,
            (float)fill - var11 * 2.0F,
            (float)r - var11 * 2.0F,
            Math.max(0.0F, (float)edge - var11),
            iIlIlllllill(0.12F * h)
         );
      }
   }

   private static int liiiIIllIl(float a) {
      return (int)(IliIlllilIi(a) * 255.0F) << 24 | 16777215;
   }

   private static int iIlIlllllill(float a) {
      return (int)(IliIlllilIi(a) * 255.0F) << 24;
   }
}
