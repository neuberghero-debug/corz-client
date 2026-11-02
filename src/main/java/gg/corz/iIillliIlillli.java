package gg.corz;

import java.awt.Color;

public final class iIillliIlillli {
   public static float IiIiliIiiiIi(int argb) {
      return (float)(argb >> 16 & 0xFF) / 255.0F;
   }

   public static float IIiilIiiiIii(int argb) {
      return 0.2126F * IiIiliIiiiIi(argb) + 0.7152F * IIlilIliiIli(argb) + 0.0722F * Illillliilli(argb);
   }

   private static float IIillIiliIil(float c) {
      c = liiiIIllIl(c);
      return c <= 0.0031308F ? c * 12.92F : 1.055F * (float)Math.pow((double)c, 0.4166666666666667) - 0.055F;
   }

   public static float Iilililiiili(int argb) {
      return (float)(argb >>> 24 & 0xFF) / 255.0F;
   }

   public static float liiiIIllIl(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static int IilliliilIIi(float offset, float saturation, float speed, float brightness) {
      return iIlIlllllill(IliIlllilIi() * offset * 0.1F + saturation, speed, brightness);
   }

   public static float IIlilIliiIli(int argb) {
      return (float)(argb >> 8 & 0xFF) / 255.0F;
   }

   private static float[] IIlllIlliIll(int argb) {
      float var1 = Iilllilliill(IiIiliIiiiIi(argb));
      float var2 = Iilllilliill(IIlilIliiIli(argb));
      float var3 = Iilllilliill(Illillliilli(argb));
      float var4 = (float)Math.cbrt((double)(0.41222146F * var1 + 0.53633255F * var2 + 0.051445995F * var3));
      float var5 = (float)Math.cbrt((double)(0.2119035F * var1 + 0.6806995F * var2 + 0.10739696F * var3));
      float var6 = (float)Math.cbrt((double)(0.08830246F * var1 + 0.28171885F * var2 + 0.6299787F * var3));
      return new float[]{
         0.21045426F * var4 + 0.7936178F * var5 - 0.004072047F * var6,
         1.9779985F * var4 - 2.4285922F * var5 + 0.4505937F * var6,
         0.025904037F * var4 + 0.78277177F * var5 - 0.80867577F * var6
      };
   }

   public static float Ililllililil(float t) {
      t = liiiIIllIl(t);
      return t * t * (3.0F - 2.0F * t);
   }

   public static float IlIlllIlilIl(int argb) {
      return IIlllIlliIll(argb)[0];
   }

   public static int IiIlliIliiIl(int hueDegrees, float chromaMul, float argb, float lightMul) {
      float[] var4 = IIlllIlliIll(hueDegrees);
      double var5 = Math.hypot((double)var4[1], (double)var4[2]) * (double)lightMul;
      double var7 = Math.atan2((double)var4[2], (double)var4[1]) + Math.toRadians((double)chromaMul);
      float var9 = Math.min(0.95F, var4[0] * argb);
      return hueDegrees & 0xFF000000 | Illlllllilll(var9, (float)(var5 * Math.cos(var7)), (float)(var5 * Math.sin(var7)));
   }

   public static int IlIillIiilIi(int argb, float mul) {
      return Math.round((float)(argb >>> 24 & 0xFF) * liiiIIllIl(mul)) << 24 | argb & 16777215;
   }

   public static int lIiiIiIlilli(float offset, float speed) {
      return IilliliilIIi(offset, speed, 0.75F, 1.0F);
   }

   public static float IliIlllilIi() {
      return (float)(System.nanoTime() % 1000000000000L) / 1.0E9F;
   }

   public static boolean Iliilliiilii(int argb) {
      return IIiilIiiiIii(argb) > 0.72F;
   }

   public static int iIlIlllllill(float h, float b, float s) {
      return 0xFF000000 | Color.HSBtoRGB(h - (float)Math.floor((double)h), liiiIIllIl(b), liiiIIllIl(s)) & 16777215;
   }

   private static int Illlllllilll(float B, float A, float L) {
      long var9 = -4848055948929238882L;
      long var11 = 4824506954550434692L;
      float var3 = B + 0.39633778F * A + 0.21580376F * L;
      float var4 = B - 0.105561346F * A - 0.06385417F * L;
      float var5 = B - 0.08948418F * A - 1.2914855F * L;
      var3 = var3 * var3 * var3;
      var4 = var4 * var4 * var4;
      var5 = var5 * var5 * var5;
      var9 ^= ((long)Math.round(IIillIiliIil(4.0767417F * var3 - 3.3077116F * var4 + 0.23096994F * var5) * 255.0F) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)Math.round(IIillIiliIil(-1.268438F * var3 + 2.6097574F * var4 - 0.34131938F * var5) * 255.0F) ^ var9) & -1L >>> 32;
      var11 ^= ((long)Math.round(IIillIiliIil(-0.0041960864F * var3 - 0.7034186F * var4 + 1.7076147F * var5) * 255.0F) << 32 ^ var11) & -1L << 32;
      return (int)(var9 >>> 32) << 16 | (int)var9 << 8 | (int)(var11 >>> 32);
   }

   public static int Iiiiliiiiiii(int onDark, double progress, int onLight, int accent, int off) {
      long var9 = -254403760335641431L;
      float var6 = liiiIIllIl((float)progress);
      float var7 = liiiIIllIl((IIiilIiiiIii(onDark) - 0.62F) / 0.16F);
      var9 ^= ((long)iliIiiliiiii(accent, off, var7) << 32 ^ var9) & -1L << 32;
      return iliIiiliiiii(onLight, (int)(var9 >>> 32), var6);
   }

   public static int Iiilliiliiil(int speed, int a, float offset, float b) {
      float var4 = (float)(0.5 - 0.5 * Math.cos((double)(IliIlllilIi() * offset * 0.1F + b) * Math.PI * 2.0));
      return iliIiiliiiii(speed, a, var4);
   }

   public static int iliIiiliiiii(int b, int t, float a) {
      long var17 = -8675631279432144360L;
      long var11 = -7880802011706717703L;
      long var13 = 1043029959111492087L;
      long var15 = 880312561680056595L;
      a = liiiIIllIl(a);
      var11 ^= ((long)(b >>> 24 & 0xFF) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(b >> 16 & 0xFF) ^ var11) & -1L >>> 32;
      var13 ^= ((long)(b >> 8 & 0xFF) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(b & 0xFF) ^ var13) & -1L >>> 32;
      var15 ^= ((long)(t >>> 24 & 0xFF) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(t >> 16 & 0xFF) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(t >> 8 & 0xFF) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)(t & 0xFF) ^ var17) & -1L >>> 32;
      return Math.round((float)((int)(var11 >>> 32)) + (float)((int)(var15 >>> 32) - (int)(var11 >>> 32)) * a) << 24
         | Math.round((float)((int)var11) + (float)((int)var15 - (int)var11) * a) << 16
         | Math.round((float)((int)(var13 >>> 32)) + (float)((int)(var17 >>> 32) - (int)(var13 >>> 32)) * a) << 8
         | Math.round((float)((int)var13) + (float)((int)var17 - (int)var13) * a);
   }

   private static float Iilllilliill(float c) {
      return c <= 0.04045F ? c / 12.92F : (float)Math.pow((double)((c + 0.055F) / 1.055F), 2.4);
   }

   public static int IIIllIIliIIl(int t, int b, float a) {
      long var10 = 1372770573330484305L;
      a = liiiIIllIl(a);
      if (a <= 0.0F || t == b) {
         return t;
      } else if (a >= 1.0F) {
         return b;
      } else {
         float[] var3 = IIlllIlliIll(t);
         float[] var4 = IIlllIlliIll(b);
         float var5 = var3[0] + (var4[0] - var3[0]) * a;
         float var6 = var3[1] + (var4[1] - var3[1]) * a;
         float var7 = var3[2] + (var4[2] - var3[2]) * a;
         var10 ^= ((long)(t >>> 24 & 0xFF) << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)(b >>> 24 & 0xFF) ^ var10) & -1L >>> 32;
         return Math.round((float)((int)(var10 >>> 32)) + (float)((int)var10 - (int)(var10 >>> 32)) * a) << 24 | Illlllllilll(var5, var6, var7);
      }
   }

   public static int IIIilIIiiIIi(int argb, float alpha01) {
      return Math.round(liiiIIllIl(alpha01) * 255.0F) << 24 | argb & 16777215;
   }

   private iIillliIlillli() {
   }

   public static float Illillliilli(int argb) {
      return (float)(argb & 0xFF) / 255.0F;
   }
}
