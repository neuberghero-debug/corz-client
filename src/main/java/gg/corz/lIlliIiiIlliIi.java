package gg.corz;

public final class lIlliIiiIlliIi {
   public static float IlIlllIlilIl(double y, double x) {
      long var18 = 3680678673686189201L;
      double var4 = Math.floor(y);
      double var6 = Math.floor(x);
      var18 ^= ((long)((int)((long)var4)) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)((int)((long)var6)) ^ var18) & -1L >>> 32;
      float var10 = IilliliilIIi((float)(y - var4));
      float var11 = IilliliilIIi((float)(x - var6));
      float var12 = iliIiiliiiii((int)(var18 >>> 32), (int)var18);
      float var13 = iliIiiliiiii((int)(var18 >>> 32) + 1, (int)var18);
      float var14 = iliIiiliiiii((int)(var18 >>> 32), (int)var18 + 1);
      float var15 = iliIiiliiiii((int)(var18 >>> 32) + 1, (int)var18 + 1);
      float var16 = var12 + (var13 - var12) * var10;
      float var17 = var14 + (var15 - var14) * var10;
      return var16 + (var17 - var16) * var11;
   }

   public static float iIlIlllllill(int seed, int channel) {
      return (float)(IliIlllilIi(seed ^ channel * 1663821227 + 1540483477) >>> 8) * 5.9604645E-8F;
   }

   private static float iliIiiliiiii(int y, int x) {
      return (float)(IliIlllilIi(y * 668265263 + x * 1640531527 + 374761393) >>> 8) * 5.9604645E-8F;
   }

   public static int liiiIIllIl(int a, int b) {
      return IliIlllilIi(a * -1640531535 + IliIlllilIi(b));
   }

   public static float IIIllIIliIIl(double x) {
      long var8 = 4753887954081508364L;
      double var2 = Math.floor(x);
      var8 ^= ((long)((int)((long)var2)) << 32 ^ var8) & -1L << 32;
      float var5 = IilliliilIIi((float)(x - var2));
      float var6 = lIiiIiIlilli((int)(var8 >>> 32));
      float var7 = lIiiIiIlilli((int)(var8 >>> 32) + 1);
      return var6 + (var7 - var6) * var5;
   }

   public static int IliIlllilIi(int x) {
      x ^= x >>> 16;
      x *= 2146121005;
      x ^= x >>> 15;
      x *= -2073254261;
      return x ^ x >>> 16;
   }

   static float IilliliilIIi(float t) {
      return t * t * t * (t * (t * 6.0F - 15.0F) + 10.0F);
   }

   public static float IiIlliIliiIl(float e0, float x, float e1) {
      float var3 = (e1 - e0) / (x - e0);
      var3 = var3 < 0.0F ? 0.0F : (var3 > 1.0F ? 1.0F : var3);
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private static float lIiiIiIlilli(int x) {
      return (float)(IliIlllilIi(x * 668265263 + 374761393) >>> 8) * 5.9604645E-8F;
   }

   private lIlliIiiIlliIi() {
   }
}
