package gg.corz;

public final class lllllillillllill {
   public static final double iiIIlIiill = 3.0;
   public static final float iIlIlIiill = 0.04F;
   public static final float IIlIlIiill = 5.0F;
   public static final float IllIlIiill = 1.0E-4F;
   public static final float lIlIlIiill = 20.0F;

   public static boolean IilliliilIIi(float budget, float hp) {
      return budget <= hp + 1.0E-4F;
   }

   private lllllillillllill() {
   }

   public static float IliIlllilIi(double water, float blocks, int resistanceAmp, boolean fallEpf) {
      if (!fallEpf && water > 3.0) {
         float var5 = (float)Math.ceil(water - 3.0 - 1.0E-6);
         return lIiiIiIlilli(var5, blocks, resistanceAmp);
      } else {
         return 0.0F;
      }
   }

   public static float liiiIIllIl(float resistanceAmp, int fallEpf) {
      return lIiiIiIlilli(5.0F, resistanceAmp, fallEpf);
   }

   static float lIiiIiIlilli(float epf, float raw, int resistanceAmp) {
      float var3 = Float.isFinite(raw) ? Math.max(0.0F, Math.min(20.0F, raw)) : 0.0F;
      float var4 = epf * (1.0F - var3 * 0.04F);
      if (resistanceAmp >= 0) {
         var4 *= Math.max(0.0F, 1.0F - 0.2F * (float)(resistanceAmp + 1));
      }

      return var4;
   }

   public static int iIlIlllllill(float hpBudget, int scanLimit, float fallEpf, int resistanceAmp) {
      long var5 = 1627962166451712619L;
      var5 ^= (12884901888L ^ var5) & -1L << 32;

      while ((int)(var5 >>> 32) < resistanceAmp && IilliliilIIi(IliIlllilIi((double)((int)(var5 >>> 32) + 1), hpBudget, scanLimit, false), fallEpf)) {
         var5 += 4294967296L;
      }

      return (int)(var5 >>> 32);
   }
}
