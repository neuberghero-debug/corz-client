package gg.corz;

public final class IIiiililIiiili {
   public static final int IIIlIllIIl = 5;
   public static final int llIlIllIIl = 100;
   public static final float liIlIllIIl = 0.2F;
   public static final float IIllIllIIl = 50.0F;
   public static final float[] iiIlIllIIl = new float[]{0.3F, 0.09F, 0.0027F, 8.1E-4F};
   public static final float IiIlIllIIl = 0.2F;
   public static final int IlIlIllIIl = 30;
   public static final int iIIlIllIIl = 100000;
   public static final float ilIlIllIIl = 5.0F;
   public static final int lIIlIllIIl = Integer.MAX_VALUE;

   public static float liiiIIllIl(float toolSpeed, int efficiency, int onGround, int hasteAmp, boolean submergedNoAqua, boolean fatigueAmp) {
      float var6 = toolSpeed > 0.0F ? toolSpeed : 1.0F;
      if (var6 > 1.0F) {
         var6 += IliIlllilIi(efficiency);
      }

      if (onGround >= 0) {
         var6 *= 1.0F + (float)(onGround + 1) * 0.2F;
      }

      if (hasteAmp >= 0) {
         var6 *= iiIlIllIIl[Math.min(hasteAmp, iiIlIllIIl.length - 1)];
      }

      if (submergedNoAqua) {
         var6 *= 0.2F;
      }

      if (!fatigueAmp) {
         var6 /= 5.0F;
      }

      return var6;
   }

   public static int IilliliilIIi(float delta) {
      long var3 = -3643344590299848440L;
      if (!(delta > 0.0F)) {
         return Integer.MAX_VALUE;
      } else if (delta >= 1.0F) {
         return 0;
      } else {
         float var1 = 0.0F;

         for (long var5 = var3 ^ (4294967296L ^ var3) & -1L << 32; (int)(var5 >>> 32) <= 100000; var5 += 4294967296L) {
            var1 += delta;
            if (var1 >= 1.0F) {
               return (int)(var5 >>> 32);
            }
         }

         return Integer.MAX_VALUE;
      }
   }

   public static int iliIiiliiiii(float efficiency, int toolSpeed, boolean suitable) {
      return lIiiIiIlilli(efficiency, toolSpeed, 50.0F, suitable, true);
   }

   public static float IliIlllilIi(int level) {
      return level > 0 ? (float)(level * level + 1) : 0.0F;
   }

   private IIiiililIiiili() {
   }

   public static int lIiiIiIlilli(float toolSpeed, int efficiency, float hardness, boolean canHarvest, boolean onGround) {
      return IilliliilIIi(iIlIlllllill(liiiIIllIl(toolSpeed, efficiency, -1, -1, false, onGround), hardness, canHarvest));
   }

   public static boolean IIIllIIliIIl(float delta) {
      return delta >= 1.0F;
   }

   public static int IiIlliIliiIl(int b, int a) {
      if (b != Integer.MAX_VALUE && a != Integer.MAX_VALUE) {
         long var2 = (long)b + (long)a;
         return var2 >= 2147483647L ? Integer.MAX_VALUE : (int)var2;
      } else {
         return Integer.MAX_VALUE;
      }
   }

   public static int IlIlllIlilIl(int stage, int fullTicks) {
      long var3 = 3399225334788708731L;
      if (stage == Integer.MAX_VALUE) {
         return Integer.MAX_VALUE;
      } else if (stage <= 0) {
         return 0;
      } else {
         var3 ^= ((long)Math.max(0, Math.min(10, fullTicks)) << 32 ^ var3) & -1L << 32;
         return (int)Math.ceil((double)stage * (1.0 - (double)((int)(var3 >>> 32)) / 10.0));
      }
   }

   public static float iIlIlllllill(float hardness, float speed, boolean canHarvest) {
      if (speed < 0.0F) {
         return 0.0F;
      } else {
         return speed == 0.0F ? Float.POSITIVE_INFINITY : hardness / speed / (float)(canHarvest ? 30 : 100);
      }
   }
}
