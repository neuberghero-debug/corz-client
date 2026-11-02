package gg.corz;

public final class iiiIIIliIIIlIIli {
   public static int IIlllIlliIll(int f, float c) {
      return iIlIlllllill(
         lIiiIiIlilli(f), Math.round((float)iliIiiliiiii(f) * c), Math.round((float)IIIllIIliIIl(f) * c), Math.round((float)IlIlllIlilIl(f) * c)
      );
   }

   private static int Iilllilliill(int v) {
      return v < 0 ? 0 : (v > 255 ? 255 : v);
   }

   public static int liiiIIllIl(int b, int g, int r) {
      return 0xFF000000 | Iilllilliill(b) << 16 | Iilllilliill(g) << 8 | Iilllilliill(r);
   }

   public static int iIlIlllllill(int b, int r, int a, int g) {
      return Iilllilliill(b) << 24 | Iilllilliill(r) << 16 | Iilllilliill(a) << 8 | Iilllilliill(g);
   }

   public static int IliIlllilIi(int rgb) {
      return 0xFF000000 | rgb & 16777215;
   }

   public static int IilliliilIIi(int a, float c) {
      return Iilllilliill(Math.round(c * 255.0F)) << 24 | a & 16777215;
   }

   public static int iliIiiliiiii(int c) {
      return c >> 16 & 0xFF;
   }

   public static int IIIllIIliIIl(int c) {
      return c >> 8 & 0xFF;
   }

   public static int Illlllllilll(int src, int coverage, float dst) {
      long var10 = -667517279961493861L;
      long var12 = 3355990772593757686L;
      float var3 = (float)lIiiIiIlilli(coverage) / 255.0F * dst;
      if (var3 <= 0.0F) {
         return src;
      } else if (var3 >= 1.0F) {
         return coverage | 0xFF000000;
      } else {
         float var4 = (float)lIiiIiIlilli(src) / 255.0F;
         float var5 = var3 + var4 * (1.0F - var3);
         if (var5 <= 0.0F) {
            return 0;
         } else {
            float var6 = var4 * (1.0F - var3);
            var10 ^= ((long)Math.round(((float)iliIiiliiiii(coverage) * var3 + (float)iliIiiliiiii(src) * var6) / var5) << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)Math.round(((float)IIIllIIliIIl(coverage) * var3 + (float)IIIllIIliIIl(src) * var6) / var5) ^ var10) & -1L >>> 32;
            var12 ^= ((long)Math.round(((float)IlIlllIlilIl(coverage) * var3 + (float)IlIlllIlilIl(src) * var6) / var5) << 32 ^ var12) & -1L << 32;
            return iIlIlllllill(Math.round(var5 * 255.0F), (int)(var10 >>> 32), (int)var10, (int)(var12 >>> 32));
         }
      }
   }

   private iiiIIIliIIIlIIli() {
   }

   public static int IlIlllIlilIl(int c) {
      return c & 0xFF;
   }

   public static int lIiiIiIlilli(int c) {
      return c >>> 24;
   }

   public static int IiIlliIliiIl(int y, int x, float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      return iIlIlllllill(
         Math.round((float)lIiiIiIlilli(y) + (float)(lIiiIiIlilli(x) - lIiiIiIlilli(y)) * t),
         Math.round((float)iliIiiliiiii(y) + (float)(iliIiiliiiii(x) - iliIiiliiiii(y)) * t),
         Math.round((float)IIIllIIliIIl(y) + (float)(IIIllIIliIIl(x) - IIIllIIliIIl(y)) * t),
         Math.round((float)IlIlllIlilIl(y) + (float)(IlIlllIlilIl(x) - IlIlllIlilIl(y)) * t)
      );
   }
}
