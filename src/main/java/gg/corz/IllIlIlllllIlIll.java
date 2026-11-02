package gg.corz;

public final class IllIlIlllllIlIll {
   public static final int IlIiIillll = 127;
   public static final float lIIiIillll = 8.0F;
   public static final float iIIiIillll = -1.0F;

   public static void lIiiIiIlilli(float[] stride, int out, int depth, int[] index) {
      float var4 = stride[depth];
      float var5 = stride[depth - out];
      float var6 = stride[depth + out];
      float var7 = stride[depth + 1];
      float var8 = stride[depth - 1];
      index[0] = IliIlllilIi(IilliliilIIi(var4, var5, var8, stride[depth - out - 1]));
      index[1] = IliIlllilIi(IilliliilIIi(var4, var6, var8, stride[depth + out - 1]));
      index[2] = IliIlllilIi(IilliliilIIi(var4, var6, var7, stride[depth + out + 1]));
      index[3] = IliIlllilIi(IilliliilIIi(var4, var5, var7, stride[depth - out + 1]));
   }

   public static float liiiIIllIl(int level) {
      return ((float)level + 0.5F) / 127.0F;
   }

   public static float IIIllIIliIIl(float waterBelow, int surface) {
      return Math.min(8.0F, Math.max(0.0F, waterBelow) + (float)Math.max(0, surface));
   }

   public static float IilliliilIIi(float b, float a, float d, float c) {
      long var6 = -4373155581208709178L;
      float var4 = 0.0F;
      var6 ^= (0L ^ var6) & -1L << 32;
      if (b >= 0.0F) {
         var4 += b;
         var6 += 4294967296L;
      }

      if (a >= 0.0F) {
         var4 += a;
         var6 += 4294967296L;
      }

      if (d >= 0.0F) {
         var4 += d;
         var6 += 4294967296L;
      }

      if (c >= 0.0F) {
         var4 += c;
         var6 += 4294967296L;
      }

      return (int)(var6 >>> 32) == 0 ? 0.0F : var4 / (float)((int)(var6 >>> 32));
   }

   public static float iIlIlllllill(int level) {
      return (float)level * 8.0F / 127.0F;
   }

   private IllIlIlllllIlIll() {
   }

   public static boolean iliIiiliiiii(int[] c) {
      return c[0] == c[1] && c[1] == c[2] && c[2] == c[3];
   }

   public static int IliIlllilIi(float blocks) {
      return !(blocks > 0.0F) ? 0 : Math.min(127, Math.round(blocks / 8.0F * 127.0F));
   }
}
