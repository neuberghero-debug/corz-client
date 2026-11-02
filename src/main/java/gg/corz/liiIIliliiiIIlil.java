package gg.corz;

import net.minecraft.class_238;
import net.minecraft.class_243;

public final class liiIIliliiiIIlil {
   public static final int IIIlIIiIil = 2;
   public static final double lliIIIiIil = 12.0;
   public static final int liiIIIiIil = 0;
   public static final float IiiIIIiIil = 1.0F;
   public static final int iiiIIIiIil = 1;
   public static final float IliIIIiIil = 6.0F;
   public static final double iliIIIiIil = 85.0;
   public static final int lIIlIIiIil = 3;

   public static boolean IIlllIlliIll(float antiSuicide, float damage, float absorption, boolean maxSelfDamage, float health) {
      if (antiSuicide <= 0.0F) {
         return true;
      } else {
         return maxSelfDamage && antiSuicide >= damage + absorption - 1.0F ? false : antiSuicide <= health;
      }
   }

   public static double IilliliilIIi(double distance) {
      return iIlIlllllill(IliIlllilIi(distance, 1.0, 6.0));
   }

   public static int IIiilIiiiIii(int pingMs) {
      long var2 = 2562462942094451142L;
      var2 ^= ((long)(Math.round((float)Math.max(0, pingMs) / 50.0F) + 2) << 32 ^ var2) & -1L << 32;
      return Math.max(2, Math.min(10, (int)(var2 >>> 32)));
   }

   public static boolean IIillIiliIil(float pitchA, float yawB, float pitchB, float yawA) {
      double var4 = Math.max(0.001, 4.0 * (double)Math.ulp(Math.max(Math.abs(pitchA), Math.abs(pitchB))));
      return Math.abs(Illlllllilll((double)pitchA - (double)pitchB)) <= var4 && Math.abs((double)yawB - (double)yawA) <= 0.001;
   }

   public static boolean Iilililiiili(class_238 inset, class_243 eye, class_243 end, double box) {
      if (inset != null && eye != null && end != null) {
         double var5 = box > 0.0 ? box : 0.0;
         class_238 var7 = inset.method_35580(
            Math.min(var5, inset.method_17939() * 0.25), Math.min(var5, inset.method_17940() * 0.25), Math.min(var5, inset.method_17941() * 0.25)
         );
         return var7.method_1006(eye) || var7.method_992(eye, end).isPresent();
      } else {
         return false;
      }
   }

   private liiIIliliiiIIlil() {
   }

   public static double Illillliilli(double py, double minZ, double maxY, double maxX, double minX, double pz, double minY, double px, double maxZ) {
      double var18 = Math.max(maxX, Math.min(py, minY));
      double var20 = Math.max(minX, Math.min(minZ, px));
      double var22 = Math.max(pz, Math.min(maxY, maxZ));
      double var24 = py - var18;
      double var26 = minZ - var20;
      double var28 = maxY - var22;
      return Math.sqrt(var24 * var24 + var26 * var26 + var28 * var28);
   }

   public static double iIlIlllllill(double rawDamage) {
      return Iliilliiilii(rawDamage / 85.0, 0.0, 1.0);
   }

   public static double IiIiliIiiiIi(double speed, double error) {
      return speed <= 0.0 ? 0.0 : Math.min(speed, 0.313 * speed + 1.56 * Math.max(0.0, error));
   }

   public static double Iiilliiliiil(double dx, double dy, double dz) {
      return Math.toDegrees(Math.atan2(-dy, Math.sqrt(dx * dx + dz * dz)));
   }

   public static float[] IIlilIliiIli(float toYaw, float toPitch, float speed, float fromPitch, double gcd, double jitter, float fromYaw) {
      double var9 = Illlllllilll((double)speed - (double)toYaw);
      double var11 = (double)Iiiiliiiiiii(fromPitch, -90.0F, 90.0F) - (double)toPitch;
      double var13 = Math.hypot(var9, var11);
      if (var13 < 1.0E-6) {
         return new float[]{toYaw, toPitch};
      } else {
         double var15 = IiIiliIiiiIi(var13, gcd);
         if (var15 < var13) {
            var15 *= Iliilliiilii(jitter, 0.5, 1.0);
         }

         double var17 = var15 / var13;
         float var19 = IlIillIiilIi((float)(var9 * var17), fromYaw);
         float var20 = IlIillIiilIi((float)(var11 * var17), fromYaw);
         return new float[]{toYaw + var19, Iiiiliiiiiii(toPitch + var20, -90.0F, 90.0F)};
      }
   }

   public static double Ililllililil(double dz, double dx) {
      return Math.toDegrees(Math.atan2(-dz, dx));
   }

   public static double Iilllilliill(float yawA, float pitchA, float pitchB, float yawB) {
      return Math.hypot(Illlllllilll((double)pitchB - (double)yawA), (double)yawB - (double)pitchA);
   }

   public static float lIiiIiIlilli(float difficulty, int damage) {
      return switch (damage) {
         case 0 -> 0.0F;
         case 1 -> Math.min(difficulty / 2.0F + 1.0F, difficulty);
         default -> difficulty;
         case 3 -> difficulty * 3.0F / 2.0F;
      };
   }

   public static double liiiIIllIl(double raw, double power) {
      double var4 = 3.5 * power * 2.0;
      if (raw > 1.0 && var4 > 0.0 && !Double.isInfinite(raw)) {
         double var6 = (-1.0 + Math.sqrt(1.0 + 4.0 * (raw - 1.0) / var4)) / 2.0;
         return Iliilliiilii(var6, 0.0, 1.0);
      } else {
         return 0.0;
      }
   }

   static double Iliilliiilii(double hi, double v, double lo) {
      return hi < v ? v : Math.min(hi, lo);
   }

   public static double IliIlllilIi(double exposure, double power, double distance) {
      double var6 = distance * 2.0;
      if (!(var6 <= 0.0) && !(exposure < 0.0)) {
         double var8 = exposure / var6;
         if (var8 > 1.0) {
            return 0.0;
         } else {
            double var10 = (1.0 - var8) * Iliilliiilii(power, 0.0, 1.0);
            return (var10 * var10 + var10) / 2.0 * 7.0 * var6 + 1.0;
         }
      } else {
         return 0.0;
      }
   }

   static float Iiiiliiiiiii(float v, float lo, float hi) {
      return v < lo ? lo : Math.min(v, hi);
   }

   public static float IlIillIiilIi(float gcd, float delta) {
      return !(delta > 0.0F) ? gcd : (float)Math.round(gcd / delta) * delta;
   }

   public static float iliIiiliiiii(float toughness, float damage, float armor) {
      float var3 = 2.0F + armor / 4.0F;
      float var4 = Iiiiliiiiiii(damage - toughness / var3, damage * 0.2F, 20.0F);
      return toughness * (1.0F - var4 / 25.0F);
   }

   public static boolean IIIilIIiiIIi(double viewYaw, double dx, float halfAngle, double dz) {
      return viewYaw * viewYaw + dx * dx < 1.0 ? true : Math.abs(Illlllllilll(Ililllililil(viewYaw, dx) - (double)halfAngle)) <= dz;
   }

   public static float IiIlliIliiIl(float resistanceAmplifier, int toughness, float protection, float difficulty, int armor, float raw) {
      float var6 = lIiiIiIlilli(resistanceAmplifier, toughness);
      if (var6 <= 0.0F) {
         return 0.0F;
      } else {
         var6 = iliIiiliiiii(var6, protection, difficulty);
         var6 = IIIllIIliIIl(var6, armor);
         return var6 <= 0.0F ? 0.0F : Math.max(IlIlllIlilIl(var6, raw), 0.0F);
      }
   }

   public static double Illlllllilll(double degrees) {
      double var2 = degrees % 360.0;
      if (var2 >= 180.0) {
         var2 -= 360.0;
      }

      if (var2 < -180.0) {
         var2 += 360.0;
      }

      return var2;
   }

   public static float IIIllIIliIIl(float amplifier, int damage) {
      long var3 = 8304575821313061588L;
      if (damage < 0) {
         return amplifier;
      } else {
         var3 ^= ((long)(25 - (damage + 1) * 5) << 32 ^ var3) & -1L << 32;
         return Math.max(amplifier * (float)((int)(var3 >>> 32)) / 25.0F, 0.0F);
      }
   }

   public static float IlIlllIlilIl(float protection, float damage) {
      float var2 = Iiiiliiiiiii(damage, 0.0F, 20.0F);
      return protection * (1.0F - var2 / 25.0F);
   }
}
