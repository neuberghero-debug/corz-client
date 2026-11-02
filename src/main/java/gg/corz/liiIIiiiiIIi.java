package gg.corz;

public final class liiIIiiiiIIi {
   public static final int[] iIiliiiiIliliiii = new int[]{-15724009, -1841430, -8541460, -10773956};
   public static final int lilliiiiiilliiii = 4;
   public static final int lIlliiiiiIlliiii = 1;
   public static final int iiIliiiiIIlliiii = 0;
   public static final int Illliiiilllliiii = 2;
   public static final int Iiiliiiiliiliiii = 160;
   public static final int illliiiiIilliiii = 3;
   public static final int lliliiiiililiiii = 256;
   public static final String[] IIiliiiilIiliiii = new String[]{
      IIlllIlliIll<"IIlllIlliIll","QZzVWFBGQK0hDgWMwVoL7YPJlL7+7q+5t/MiUWrj3Dw=">(),
      IIlllIlliIll<"IIlllIlliIll","G7w3onhOTC7yXX1C27OyVndgCpDvJEjl57klBSZO8BpD">(),
      IIlllIlliIll<"IIlllIlliIll","VODQyQtWzFWaUSqp6uLMAYw2+KUEIn2Ebeo7OyXlTA==">(),
      IIlllIlliIll<"IIlllIlliIll","mKyo6+9seXzzMcfomNmmBbN73SmrxgvVDcbDEiUc8EK+">()
   };

   static float IIIllIIliIIl(float octaves, float seed, int y, int x) {
      long var8 = -2988136846196374236L;
      float var4 = 0.0F;
      float var5 = 0.5F;
      float var6 = 0.0F;

      for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < y; var10 += 4294967296L) {
         var4 += var5 * IlIlllIlilIl(octaves, seed, x + (int)(var10 >>> 32) * 17);
         var6 += var5;
         octaves *= 2.03F;
         seed *= 2.03F;
         var5 *= 0.5F;
      }

      return var4 / var6;
   }

   public static float liiiIIllIl(float aspect) {
      float var1 = 1.6F;
      return aspect >= var1 ? 1.0F : Math.max(0.05F, aspect / var1);
   }

   private static float lIiiIiIlilli(float b, float t, float a) {
      return b + (t - b) * a;
   }

   public static int IliIlllilIi(int y, int kind, int h, int x, int w) {
      float var5 = ((float)kind + 0.5F) / (float)x;
      float var6 = ((float)h + 0.5F) / (float)w;
      float var7;
      float var8;
      float var9;
      switch (y) {
         case 1:
            float var19 = IIIllIIliIIl((float)kind * 0.018F, (float)h * 0.018F, 3, 71) - 0.5F;
            var7 = lIiiIiIlilli(238.0F, 216.0F, var6) + var19 * 7.0F;
            var8 = lIiiIiIlilli(240.0F, 220.0F, var6) + var19 * 7.0F;
            var9 = lIiiIiIlilli(243.0F, 226.0F, var6) + var19 * 6.0F;
            break;
         case 2:
            float var18 = (float)Math.pow((double)var6, 0.85);
            var7 = lIiiIiIlilli(76.0F, 169.0F, var18);
            var8 = lIiiIiIlilli(132.0F, 203.0F, var18);
            var9 = lIiiIiIlilli(223.0F, 244.0F, var18);
            float var22 = IIIllIIliIIl((float)kind * 0.011F, (float)h * 0.026F, 4, 13);
            float var24 = iliIiiliiiii((var22 - 0.5F) / 0.2F) * (0.92F - 0.45F * var6);
            var7 = lIiiIiIlilli(var7, 246.0F, var24);
            var8 = lIiiIiIlilli(var8, 248.0F, var24);
            var9 = lIiiIiIlilli(var9, 252.0F, var24);
            break;
         case 3:
            float var17 = IIIllIIliIIl((float)kind * 0.022F, (float)h * 0.022F, 4, 29);
            float var21 = IIIllIIliIIl((float)kind * 0.21F, (float)h * 0.045F, 2, 47) - 0.5F;
            float var23 = IiIlliIliiIl(kind, h, 5) - 0.5F;
            float var13 = 1.06F - 0.14F * var6;
            var7 = (lIiiIiIlilli(71.0F, 116.0F, var17) + var21 * 18.0F + var23 * 6.0F) * var13;
            var8 = (lIiiIiIlilli(127.0F, 178.0F, var17) + var21 * 26.0F + var23 * 8.0F) * var13;
            var9 = (lIiiIiIlilli(46.0F, 74.0F, var17) + var21 * 12.0F + var23 * 4.0F) * var13;
            break;
         default:
            float var10 = var5 - 0.5F;
            float var11 = var6 - 0.48F;
            float var12 = 1.0F - 0.32F * Math.min(1.0F, (var10 * var10 + var11 * var11) * 2.4F);
            var7 = lIiiIiIlilli(21.0F, 10.0F, var6) * var12;
            var8 = lIiiIiIlilli(23.0F, 11.0F, var6) * var12;
            var9 = lIiiIiIlilli(29.0F, 14.0F, var6) * var12;
      }

      float var20 = IiIlliIliiIl(kind, h, 101 + y) + IiIlliIliiIl(kind, h, 211 + y) - 1.0F;
      return 0xFF000000 | IilliliilIIi(var7 + var20) << 16 | IilliliilIIi(var8 + var20) << 8 | IilliliilIIi(var9 + var20);
   }

   public static float iIlIlllllill(float aspect) {
      float var1 = 1.6F;
      return aspect <= var1 ? 1.0F : Math.max(0.05F, var1 / aspect);
   }

   private static float iliIiiliiiii(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      return t * t * (3.0F - 2.0F * t);
   }

   static int IilliliilIIi(float v) {
      long var2 = 6189491659504294122L;
      var2 ^= ((long)Math.round(v) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) < 0 ? 0 : ((int)(var2 >>> 32) > 255 ? 255 : (int)(var2 >>> 32));
   }

   private static float IlIlllIlilIl(float x, float y, int seed) {
      long var11 = -8067424639592216937L;
      var11 ^= ((long)((int)Math.floor((double)x)) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)((int)Math.floor((double)y)) ^ var11) & -1L >>> 32;
      float var5 = iliIiiliiiii(x - (float)((int)(var11 >>> 32)));
      float var6 = iliIiiliiiii(y - (float)((int)var11));
      float var7 = IiIlliIliiIl((int)(var11 >>> 32), (int)var11, seed);
      float var8 = IiIlliIliiIl((int)(var11 >>> 32) + 1, (int)var11, seed);
      float var9 = IiIlliIliiIl((int)(var11 >>> 32), (int)var11 + 1, seed);
      float var10 = IiIlliIliiIl((int)(var11 >>> 32) + 1, (int)var11 + 1, seed);
      return lIiiIiIlilli(lIiiIiIlilli(var7, var8, var5), lIiiIiIlilli(var9, var10, var5), var6);
   }

   private liiIIiiiiIIi() {
   }

   static float IiIlliIliiIl(int x, int y, int seed) {
      long var4 = -3996251538744306411L;
      var4 ^= ((long)(x * 668265261 ^ y * 374761393 ^ seed * 1540483477) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 15) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) * 739982445) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 12) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) * 695872825) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 15) << 32 ^ var4) & -1L << 32;
      return (float)((int)(var4 >>> 32) & 16777215) / 1.6777216E7F;
   }
}
