package gg.corz;

import java.util.function.BooleanSupplier;

public final class IlIIIillIIIi {
   public static final int iiiiIliiIIIIllii = 0;
   public static final double iIillliiIlilllii = 0.35;
   public static final double liiIlliiiiiIllii = 0.2;
   public static final float iiillliiIIIillii = 0.002F;
   public static final double IIIllliilIIlllii = 1.5;
   public static final double iiIllliiIIllllii = 0.2;
   public static final int IlIIlliillIIllii = 2;
   public static final double IIillliilIilllii = 1.0;
   public static final double llillliiililllii = 0.16;
   public static final double llIllliiilIlllii = 0.0;
   public static final double lIlllliiiIllllii = 0.2;
   public static final double lIiIlliiiIiIllii = 0.2;
   public static final double lilllliiiillllii = 0.0;
   public static final double IiIllliiliIlllii = 1.0;
   public static final double IliIlliilliIllii = 2.5;
   public static final String[] ilIIlliiIiIIllii = new String[]{
      IiIIlliIIl<"IiIIlliIIl","hpJ5j2+f4SfhTV5eD6im08KEan4J1AgenRbFbT6bbUyojg==">(),
      IiIIlliIIl<"IiIIlliIIl","L6bZGoXDySAe4ygGO6sTwRSzmOzspZG01qNXOKM/RqD7/wc=">(),
      IiIIlliIIl<"IiIIlliIIl","zLCLHkcoqSkFpSZJl1xKzd7WFhI+BKAfsSe6utG6SFgQ">()
   };
   public static final int lIIIlliiiIIIllii = 1;
   public static final double IIlIlliilIlIllii = 0.35;
   public static final int lIIilliiiIIillii = 3;
   public static final double iIIllliiIlIlllii = 0.75;
   public static final double Iiillliiliilllii = 0.24;
   public static final double lllIlliiillIllii = 0.1;
   public static final double liIIlliiiiIIllii = 0.08;
   public static final double iIlIlliiIllIllii = 0.18;
   public static final double iilIlliiIIiIllii = 0.55;
   public static final double illllliiIillllii = 0.55;
   public static final double Illllliillllllii = 0.8;
   public static final double iliIlliiIiiIllii = 1.0;
   public static final double IilIlliililIllii = 1.0;

   public static int Illlllllilll(String name) {
      long var3 = -6124664988284305560L;
      if (name == null) {
         return 0;
      } else {
         var3 ^= (-4294967296L ^ var3) & -1L << 32;
         switch (name.hashCode()) {
            case -1968751561:
               if (name.equals(IiIIlliIIl<"IiIIlliIIl","hpJ5j2+f4SfhTV5eD6im08KEan4J1AgenRbFbT6bbUyojg==">())) {
                  var3 ^= (8589934592L ^ var3) & -1L << 32;
               }
               break;
            case -1565776511:
               if (name.equals(IiIIlliIIl<"IiIIlliIIl","L6bZGoXDySAe4ygGO6sTwRSzmOzspZG01qNXOKM/RqD7/wc=">())) {
                  var3 ^= (0L ^ var3) & -1L << 32;
               }
               break;
            case 79847370:
               if (name.equals(IiIIlliIIl<"IiIIlliIIl","zLCLHkcoqSkFpSZJl1xKzd7WFhI+BKAfsSe6utG6SFgQ">())) {
                  var3 ^= (4294967296L ^ var3) & -1L << 32;
               }
         }

         switch ((int)(var3 >>> 32)) {
            case 0:
               return 1;
            case 1:
               return 2;
            case 2:
            default:
               return 0;
         }
      }
   }

   public static float IIlllIlliIll(double v) {
      return (float)liiiIIllIl(v, 0.0, 1.0);
   }

   public static float IIIllIIliIIl(double v) {
      return (float)liiiIIllIl(v, 0.2, 1.5);
   }

   public static boolean IIIilIIiiIIi(boolean screenOpen, boolean firstPerson, boolean enabled, float fadeAlpha) {
      return screenOpen && firstPerson && !enabled && fadeAlpha > 0.002F;
   }

   public static float IliIlllilIi(float v, float hi, float lo) {
      return v < hi ? hi : (v > lo ? lo : v);
   }

   private IlIIIillIIIi() {
   }

   private static float Iilililiiili(float x) {
      return x - (float)Math.floor((double)x);
   }

   public static double liiiIIllIl(double lo, double hi, double v) {
      return lo < hi ? hi : (lo > v ? v : lo);
   }

   public static boolean IlIillIiilIi(boolean flameEnabled, boolean noFlameEnabled, boolean hideVanilla, boolean firstPerson) {
      return firstPerson || flameEnabled && noFlameEnabled && hideVanilla;
   }

   public static float IlIlllIlilIl(double v) {
      return (float)liiiIIllIl(v, 0.0, 1.0);
   }

   public static float Iiiiliiiiiii(float intensity, float u, int style, float t) {
      float var4 = style == 2 ? 3.0F : (style == 1 ? 1.7F : 2.2F);
      float var5 = Iliilliiilii(intensity * 5.0F + u * 0.9F);
      var5 = var5 * 0.65F + Iliilliiilii(intensity * 11.0F - u * 1.3F) * 0.35F;
      float var6 = 0.55F + 0.45F * Iliilliiilii(intensity * 2.1F + u * 0.25F);
      var5 *= var6;
      float var7 = IliIlllilIi((t - 0.2F) / 1.3F, 0.0F, 1.0F);
      var5 = Math.max(var5, 0.15F * var7);
      float var8 = Math.max(0.8F, var4 - var7 * 0.7F);
      float var9 = (float)Math.pow((double)IliIlllilIi(var5, 0.0F, 1.0F), (double)var8);
      return IliIlllilIi(var9, 0.0F, 1.0F);
   }

   public static int Ililllililil(int argb) {
      long var8 = -3272040867874760403L;
      long var10 = -7659684795306795273L;
      long var12 = -2791030671898158928L;
      long var14 = -4187713133120327899L;
      var8 ^= ((long)(argb >>> 24 & 0xFF) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(argb >> 16 & 0xFF) ^ var8) & -1L >>> 32;
      var10 ^= ((long)(argb >> 8 & 0xFF) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)(argb & 0xFF) ^ var10) & -1L >>> 32;
      var12 ^= ((long)IIillIiliIil(Math.round((float)((int)var8) + (float)(255 - (int)var8) * 0.55F)) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)IIillIiliIil(Math.round((float)((int)(var10 >>> 32)) + (float)(255 - (int)(var10 >>> 32)) * 0.72F)) ^ var12) & -1L >>> 32;
      var14 ^= ((long)IIillIiliIil(Math.round((float)((int)var10) + (float)(255 - (int)var10) * 0.38F)) << 32 ^ var14) & -1L << 32;
      return (int)(var8 >>> 32) << 24 | (int)(var12 >>> 32) << 16 | (int)var12 << 8 | (int)(var14 >>> 32);
   }

   public static float lIiiIiIlilli(double v) {
      return (float)liiiIIllIl(v, 0.1, 1.0);
   }

   private static float iIlIlllllill(float e1, float e0, float x) {
      if (e0 <= e1) {
         return x < e1 ? 0.0F : 1.0F;
      } else {
         float var3 = IliIlllilIi((x - e1) / (e0 - e1), 0.0F, 1.0F);
         return var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   public static boolean IIlilIliiIli(boolean shaderFailed) {
      return shaderFailed;
   }

   public static float IIiilIiiiIii(float p) {
      p = Iilililiiili(p * 0.1031F);
      p *= p + 33.33F;
      p *= p + p;
      return Iilililiiili(p);
   }

   public static boolean iIIIlIlIIl(BooleanSupplier op) {
      try {
         return op.getAsBoolean();
      } catch (Throwable var2) {
         return false;
      }
   }

   public static boolean IiIiliIiiiIi(int consecutiveFailures) {
      return consecutiveFailures >= 3;
   }

   public static float IiIlliIliiIl(double v) {
      return (float)liiiIIllIl(v, 0.2, 0.8);
   }

   public static void llIIlilIIl(Runnable restore, Runnable body) {
      try {
         restore.run();
      } finally {
         body.run();
      }
   }

   public static float Iiilliiliiil(float visibleTarget, boolean dt, double current) {
      if (current < 0.0) {
         current = 0.0;
      }

      float var4 = IliIlllilIi(visibleTarget, 0.0F, 1.0F);
      return dt ? Math.min(1.0F, var4 + (float)(current / 0.16)) : Math.max(0.0F, var4 - (float)(current / 0.24));
   }

   public static float iliIiiliiiii(double v) {
      return (float)liiiIIllIl(v, 0.2, 2.5);
   }

   public static float Iliilliiilii(float x) {
      float var1 = (float)Math.floor((double)x);
      float var2 = x - var1;
      float var3 = var2 * var2 * (3.0F - 2.0F * var2);
      return IIiilIiiiIii(var1) * (1.0F - var3) + IIiilIiiiIii(var1 + 1.0F) * var3;
   }

   public static boolean IIIIllIIIl(boolean alreadyRegistered) {
      return !alreadyRegistered;
   }

   public static float Iilllilliill(float centerClear, float uvx) {
      float var2 = Math.abs(centerClear - 0.5F) * 2.0F;
      float var3 = iIlIlllllill(0.15F, 0.75F, var2);
      float var4 = Math.max(0.0F, 1.0F - uvx * 1.6F);
      return var4 + (1.0F - var4) * var3;
   }

   private static int IIillIiliIil(int v) {
      return v < 0 ? 0 : (v > 255 ? 255 : v);
   }

   public static float IilliliilIIi(double v) {
      return (float)liiiIIllIl(v, 0.08, 0.35);
   }

   public static float[] Illillliilli(float framebufferH, float framebufferW) {
      return new float[]{framebufferH, framebufferW};
   }
}
