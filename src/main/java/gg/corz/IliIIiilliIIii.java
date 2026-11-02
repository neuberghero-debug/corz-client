package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_243;

public final class IliIIiilliIIii {
   private static final double[][] iIIiillIIl = iliIiiliiiii();
   public static final int iIilillIIl = 1;
   public static final float IIIiillIIl = 0.15F;
   public static final double ililillIIl = 0.22;
   public static final int IlilillIIl = 3;
   public static final float liilillIIl = 1.5F;
   public static final int lIIiillIIl = 8;
   public static final double llilillIIl = 0.546;
   public static final float iiilillIIl = 0.75F;
   public static final double IiilillIIl = 0.5;

   private static float iIlIlllllill(IIlllIlllIlllIll fn, class_243 jumped, boolean at) {
      float var3 = fn.damageAt(jumped, at);
      return Float.isNaN(var3) ? Float.POSITIVE_INFINITY : Math.max(0.0F, var3);
   }

   public IiliIililiIi IliIlllilIi(class_243 goal, class_243 fn, int safe, class_243 velocity, IIlllIlllIlllIll feet, Predicate<class_243> etaTicks) {
      long var33 = 1531517560066131822L;
      long var35 = 1310877391745189516L;
      long var31 = 8391929248609431906L;
      if (goal != null && feet != null && lIiiIiIlilli(goal)) {
         var31 ^= ((long)Math.max(1, Math.min(3, safe)) << 32 ^ var31) & -1L << 32;
         double var8 = fn != null && Double.isFinite(fn.field_1352) ? fn.field_1352 : 0.0;
         double var10 = fn != null && Double.isFinite(fn.field_1350) ? fn.field_1350 : 0.0;
         class_243 var12 = new class_243(
            goal.field_1352 + var8 * (double)((int)(var31 >>> 32)) * 0.546, goal.field_1351, goal.field_1350 + var10 * (double)((int)(var31 >>> 32)) * 0.546
         );
         float var13 = iIlIlllllill(feet, var12, false);
         double var14 = (double)var13 + 0.5 * IilliliilIIi(var12, velocity);
         float var16 = var13;
         double var17 = 0.0;
         double var19 = 0.0;
         var31 ^= (0L ^ var31) & -1L >>> 32;
         var33 ^= (0L ^ var33) & -1L << 32;
         double[][] var23 = iIIiillIIl;
         var33 ^= ((long)var23.length ^ var33) & -1L >>> 32;

         for (long var42 = var35 ^ (0L ^ var35) & -1L << 32; (int)(var42 >>> 32) < (int)var33; var42 += 4294967296L) {
            double[] var26 = var23[(int)(var42 >>> 32)];
            class_243 var27 = new class_243(
               var12.field_1352 + var26[0] * 0.22 * (double)((int)(var31 >>> 32)),
               goal.field_1351,
               var12.field_1350 + var26[1] * 0.22 * (double)((int)(var31 >>> 32))
            );
            if (etaTicks == null || etaTicks.test(var27)) {
               float var28 = iIlIlllllill(feet, var27, false);
               double var29 = (double)var28 + 0.5 * IilliliilIIi(var27, velocity);
               if (var29 < var14) {
                  var14 = var29;
                  var16 = var28;
                  var17 = var26[0];
                  var19 = var26[1];
                  var31 ^= (0L ^ var31) & -1L >>> 32;
                  var33 ^= (4294967296L ^ var33) & -1L << 32;
               }
            }
         }

         if (etaTicks == null || etaTicks.test(var12)) {
            float var37 = iIlIlllllill(feet, var12, true);
            double var24 = (double)var37 + 0.5 * IilliliilIIi(var12, velocity);
            if (var24 < var14) {
               var16 = var37;
               var17 = 0.0;
               var19 = 0.0;
               var31 ^= (1L ^ var31) & -1L >>> 32;
               var33 ^= (4294967296L ^ var33) & -1L << 32;
            }
         }

         return (int)(var33 >>> 32) != 0 && !(var13 - var16 < liiiIIllIl(var13))
            ? new IiliIililiIi(var17, var19, (boolean)((int)var31), (int)(var31 >>> 32), var16, var13)
            : null;
      } else {
         return null;
      }
   }

   static float liiiIIllIl(float stay) {
      return !(stay < Float.POSITIVE_INFINITY) ? 1.5F : Math.min(1.5F, Math.max(0.75F, 0.15F * stay));
   }

   private static double IilliliilIIi(class_243 at, class_243 goal) {
      return goal != null && lIiiIiIlilli(goal) ? Math.hypot(at.field_1352 - goal.field_1352, at.field_1350 - goal.field_1350) : 0.0;
   }

   private static double[][] iliIiiliiiii() {
      long var4 = -3568416496444156392L;
      double[][] var0 = new double[8][];

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 8; var6 += 4294967296L) {
         double var2 = Math.toRadians((double)((int)(var6 >>> 32)) * 360.0 / 8.0);
         var0[(int)(var6 >>> 32)] = new double[]{-Math.sin(var2), Math.cos(var2)};
      }

      return var0;
   }

   private static boolean lIiiIiIlilli(class_243 v) {
      return Double.isFinite(v.field_1352) && Double.isFinite(v.field_1351) && Double.isFinite(v.field_1350);
   }
}
