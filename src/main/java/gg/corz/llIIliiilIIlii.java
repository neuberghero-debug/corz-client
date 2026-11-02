package gg.corz;

public final class llIIliiilIIlii {
   public static final double iilIiIiIIl = 100.0;
   public static final double IiiilIiIIl = 2.9;
   public static final double IilIiIiIIl = 4.0;
   public static final int iiIIiIiIIl = 3;
   public static final float lIIIiIiIIl = 0.95F;
   public static final double lilIiIiIIl = 40.0;
   public static final double IIlIiIiIIl = 2.5;
   public static final double lllIiIiIIl = 2.3;
   public static final double IlIIiIiIIl = 0.35;
   public static final double iIlIiIiIIl = 0.12;
   public static final double IIIIiIiIIl = 0.020000000000000018;
   public static final int iIiIiIiIIl = 4;
   public static final double IIiIiIiIIl = 4.5;
   public static final double liIIiIiIIl = 0.12;
   public static final double IllIiIiIIl = 1.6;
   public static final double lIiIiIiIIl = 2.0;
   public static final double iliilIiIIl = 3.0;
   public static final double liiilIiIIl = 3.0;
   public static final double iiiilIiIIl = 2.98;
   public static final double ilIIiIiIIl = 0.1;
   public static final double lIlIiIiIIl = 0.35;
   public static final float iIIIiIiIIl = 0.6F;
   public static final double illIiIiIIl = 4.0;
   public static final double IiIIiIiIIl = 0.26;
   public static final double llIIiIiIIl = 0.08;

   public static int IIIllIIliIIl(long ticksSinceSwing, double attackSpeed, float threat) {
      if (ticksSinceSwing >= 0L && ticksSinceSwing < 2147483647L) {
         double var5 = (double)threat * iliIiiliiiii(attackSpeed) - 0.5 - (double)ticksSinceSwing;
         return var5 <= 0.0 ? 0 : (int)Math.ceil(var5 - 1.0E-9);
      } else {
         return 0;
      }
   }

   public static double liiiIIllIl(double reach) {
      return reach > 0.0 ? Math.max(0.0, reach - 0.020000000000000018) : 0.0;
   }

   public static int Iilllilliill(double band, double gap, double desired, int last) {
      if (Double.isFinite(band) && Double.isFinite(gap)) {
         double var7 = Math.max(0.0, desired);
         double var9 = band - gap;
         if (last > 0) {
            return var9 > -var7 ? 1 : (var9 < -2.0 * var7 ? -1 : 0);
         } else if (last < 0) {
            return var9 < var7 ? -1 : (var9 > 2.0 * var7 ? 1 : 0);
         } else {
            return var9 > 2.0 * var7 ? 1 : (var9 < -2.0 * var7 ? -1 : 0);
         }
      } else {
         return 0;
      }
   }

   public static double IIlilIliiIli(double sample, double alpha, double prev) {
      if (!Double.isFinite(alpha)) {
         return sample;
      } else if (!Double.isFinite(sample)) {
         return alpha;
      } else {
         double var6 = Math.max(0.0, Math.min(1.0, prev));
         return sample + var6 * (alpha - sample);
      }
   }

   public static boolean IIIilIIiiIIi(double gapAfterHit) {
      return Double.isFinite(gapAfterHit) && gapAfterHit < 2.3;
   }

   private llIIliiilIIlii() {
   }

   public static boolean iIlIlllllill(int blockedTicks) {
      return blockedTicks >= 4;
   }

   public static double IIillIiliIil(float dy, float dx, double yaw, double pitch, double dz) {
      double var8 = Math.sqrt(yaw * yaw + pitch * pitch + dz * dz);
      if (var8 > 1.0E-6 && Float.isFinite(dy) && Float.isFinite(dx)) {
         double var10 = Math.toRadians((double)dy);
         double var12 = Math.toRadians((double)dx);
         double var14 = -Math.sin(var10) * Math.cos(var12);
         double var16 = -Math.sin(var12);
         double var18 = Math.cos(var10) * Math.cos(var12);
         double var20 = (var14 * yaw + var16 * pitch + var18 * dz) / var8;
         return Math.toDegrees(Math.acos(Math.max(-1.0, Math.min(1.0, var20))));
      } else {
         return 180.0;
      }
   }

   public static double Illillliilli(double deg) {
      return (deg % 360.0 + 540.0) % 360.0 - 180.0;
   }

   public static double IiIlliIliiIl(int pingMs, double closing) {
      long var6 = -2852061031694806316L;
      var6 ^= ((long)Math.max(0, Math.min(3, (int)Math.round((double)Math.max(0, pingMs) / 50.0))) << 32 ^ var6) & -1L << 32;
      double var4 = Double.isFinite(closing) ? Math.max(0.0, Math.min(0.35, closing)) : 0.0;
      return 3.35 + (double)((int)(var6 >>> 32)) * 0.12 + var4 * 2.5;
   }

   public static double iliIiiliiiii(double attackSpeed) {
      double var2 = Double.isFinite(attackSpeed) && attackSpeed > 0.0 ? attackSpeed : 4.0;
      return 20.0 / var2;
   }

   public static double IliIlllilIi(double entityInteractionRange) {
      return entityInteractionRange > 0.0 ? Math.min(3.0, entityInteractionRange) : 0.0;
   }

   public static boolean IiIiliIiiiIi(boolean targetReadyIn, boolean weReach, boolean charge, float theyFace, int theyReach) {
      return targetReadyIn && weReach && charge && theyFace >= 0.6F && theyReach <= 0;
   }

   public static boolean Ililllililil(double lookError) {
      return lookError <= 40.0;
   }

   public static boolean IilliliilIIi(double currentGap, double attackerGap) {
      return Double.isFinite(attackerGap) && !(attackerGap > 4.5) ? !Double.isFinite(currentGap) || currentGap > attackerGap + 2.0 : false;
   }

   public static int IlIillIiilIi(double stuck, boolean gap) {
      return !gap && !IIIilIIiiIIi(stuck) ? 1 : 2;
   }

   public static double IIlllIlliIll(int safeGap, double ticksToCharge, double jitter) {
      if (safeGap <= 0) {
         return 2.9;
      } else {
         return safeGap <= 2 ? 3.08 + 0.1 * (double)(safeGap - 1) + jitter : Math.max(ticksToCharge + jitter, 2.9 + 0.26 * (double)safeGap);
      }
   }

   public static boolean Iiilliiliiil(double lookError, double awaySpeed) {
      return lookError >= 100.0 && awaySpeed > 0.05;
   }

   public static int Illlllllilll(double band, double desired, double gap) {
      if (Double.isFinite(band) && Double.isFinite(desired)) {
         double var6 = Math.max(0.0, gap);
         if (band > desired + var6) {
            return 1;
         } else {
            return band < desired - var6 ? -1 : 0;
         }
      } else {
         return 0;
      }
   }

   public static float IlIlllIlilIl(long attackSpeed, double ticksSinceSwing) {
      if (attackSpeed >= 0L && attackSpeed < 2147483647L) {
         double var4 = ((double)attackSpeed + 0.5) / iliIiiliiiii(ticksSinceSwing);
         return (float)Math.max(0.0, Math.min(1.0, var4));
      } else {
         return 1.0F;
      }
   }

   public static int lIiiIiIlilli(float perTick, float charge, float ready) {
      if (!(perTick < ready)) {
         return 0;
      } else {
         float var3 = Float.isFinite(charge) && charge > 0.0F ? charge : 12.5F;
         return Math.max(1, (int)Math.ceil((double)((ready - Math.max(0.0F, perTick)) * var3 - 1.0E-4F)));
      }
   }
}
