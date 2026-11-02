package gg.corz;

import java.util.ArrayList;
import java.util.Optional;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1684;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_3610;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_631;
import net.minecraft.class_638;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class liIiililiiIiilil {
   public static final double IilIllllil = 0.99F;
   public static final double lilIllllil = 0.8F;
   public static final double iIlIllllil = 0.03;
   private static final double iilIllllil = 0.125;
   private static final double lIiIllllil = 0.014;
   public static final double illIllllil = 0.05;
   public static final double lllIllllil = 1.5;
   private static final double IIiIllllil = 0.25;
   private static final class_310 iIiIllllil = class_310.method_1551();
   public static final double IllIllllil = 0.99;

   public static class_243 Iilllilliill(class_1309 p) {
      float var1 = p.method_36454();
      float var2 = p.method_36455();
      float var3 = -class_3532.method_15374((double)(var1 * (float) (Math.PI / 180.0))) * class_3532.method_15362((double)(var2 * (float) (Math.PI / 180.0)));
      float var4 = -class_3532.method_15374((double)(var2 * (float) (Math.PI / 180.0)));
      float var5 = class_3532.method_15362((double)(var1 * (float) (Math.PI / 180.0))) * class_3532.method_15362((double)(var2 * (float) (Math.PI / 180.0)));
      class_243 var6 = new class_243((double)var3, (double)var4, (double)var5).method_1029().method_1021(1.5);
      double var7 = p.method_23317() - p.field_6014;
      double var9 = p.method_24828() ? 0.0 : p.method_23318() - p.field_6036;
      double var11 = p.method_23321() - p.field_5969;
      return var6.method_1031(var7, var9, var11);
   }

   private static boolean IIlllIlliIll(class_243 point) {
      if (iIiIllllil.field_1687 == null) {
         return false;
      } else {
         class_2338 var1 = class_2338.method_49638(point);
         if (!iIiIllllil.field_1687.method_8393(var1.method_10263() >> 4, var1.method_10260() >> 4)) {
            return false;
         } else {
            class_2680 var2 = iIiIllllil.field_1687.method_8320(var1);
            return !var2.method_26220(iIiIllllil.field_1687, var1).method_1110();
         }
      }
   }

   private static boolean IlIlllIlilIl(class_638 push, class_2339 x, double y, double z, double mut, double[] world) {
      long var48 = -2361792339870259217L;
      long var50 = -7790815182304007095L;
      long var52 = 2338537831064785612L;
      long var54 = -2622361325996329253L;
      long var56 = 3940644448086064450L;
      long var46 = -7960217499360275756L;
      double var9 = y - 0.125 + 0.001;
      double var11 = y + 0.125 - 0.001;
      double var13 = z + 0.001;
      double var15 = z + 0.25 - 0.001;
      double var17 = mut - 0.125 + 0.001;
      double var19 = mut + 0.125 - 0.001;
      var46 ^= ((long)class_3532.method_15357(var9) << 32 ^ var46) & -1L << 32;
      var46 ^= ((long)class_3532.method_15384(var11) ^ var46) & -1L >>> 32;
      var48 ^= ((long)class_3532.method_15357(var13) << 32 ^ var48) & -1L << 32;
      var48 ^= ((long)class_3532.method_15384(var15) ^ var48) & -1L >>> 32;
      var50 ^= ((long)class_3532.method_15357(var17) << 32 ^ var50) & -1L << 32;
      var50 ^= ((long)class_3532.method_15384(var19) ^ var50) & -1L >>> 32;
      var52 ^= (0L ^ var52) & -1L << 32;
      double var28 = 0.0;
      double var30 = 0.0;
      double var32 = 0.0;
      double var34 = 0.0;
      var52 ^= (0L ^ var52) & -1L >>> 32;
      var54 ^= ((long)((int)(var46 >>> 32)) << 32 ^ var54) & -1L << 32;

      while ((int)(var54 >>> 32) < (int)var46) {
         for (var54 ^= ((long)((int)(var48 >>> 32)) ^ var54) & -1L >>> 32; (int)var54 < (int)var48; var54 ^= (var54 ^ var54 + (long)1) & -1L >>> 32) {
            for (var56 ^= ((long)((int)(var50 >>> 32)) << 32 ^ var56) & -1L << 32; (int)(var56 >>> 32) < (int)var50; var56 += 4294967296L) {
               x.method_10103((int)(var54 >>> 32), (int)var54, (int)(var56 >>> 32));
               class_3610 var40 = push.method_8316(x);
               if (var40.method_15767(class_3486.field_15517)) {
                  double var41 = (double)((float)((int)var54) + var40.method_15763(push, x));
                  if (!(var41 < var13)) {
                     var52 ^= (4294967296L ^ var52) & -1L << 32;
                     var28 = Math.max(var41 - var13, var28);
                     class_243 var43 = var40.method_15758(push, x);
                     double var44 = var28 < 0.4 ? var28 : 1.0;
                     var30 += var43.field_1352 * var44;
                     var32 += var43.field_1351 * var44;
                     var34 += var43.field_1350 * var44;
                     var52 ^= (var52 ^ var52 + (long)1) & -1L >>> 32;
                  }
               }
            }
         }

         var54 += 4294967296L;
      }

      world[0] = world[1] = world[2] = 0.0;
      if ((int)var52 > 0) {
         var30 /= (double)((int)var52);
         var32 /= (double)((int)var52);
         var34 /= (double)((int)var52);
         double var37 = Math.sqrt(var30 * var30 + var32 * var32 + var34 * var34);
         if (var37 >= 1.0E-5F) {
            world[0] = var30 / var37 * 0.014;
            world[1] = var32 / var37 * 0.014;
            world[2] = var34 / var37 * 0.014;
         }
      }

      return (boolean)((int)(var52 >>> 32));
   }

   public static lIililiIilil iIlIlllllill(class_243 pos, class_243 vel, int maxTicks) {
      return lIiiIiIlilli(pos, vel, false, 0, null, null, false, maxTicks);
   }

   public static lIililiIilil IliIlllilIi(class_243 vel, class_243 pos, double maxTicks, double gravity, int drag) {
      long var11 = 6281947841125351523L;
      ArrayList var7 = new ArrayList();
      var7.add(vel);
      var11 ^= (0L ^ var11) & -1L << 32;

      for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < drag; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         class_243 var10 = vel.method_1019(pos);
         if (IIlllIlliIll(var10)) {
            var11 ^= (4294967296L ^ var11) & -1L << 32;
            vel = var10;
            var7.add(var10);
            break;
         }

         vel = var10;
         var7.add(var10);
         pos = pos.method_1021(gravity);
         pos = pos.method_1023(0.0, maxTicks, 0.0);
      }

      return new lIililiIilil(var7, vel, (boolean)((int)(var11 >>> 32)));
   }

   public static float IiIlliIliiIl(class_243 from, class_243 speed, double gravity, double to) {
      double var6 = speed.field_1352 - from.field_1352;
      double var8 = speed.field_1350 - from.field_1350;
      double var10 = Math.sqrt(var6 * var6 + var8 * var8);
      if (var10 < 0.5) {
         return Float.NaN;
      } else {
         double var12 = speed.field_1351 - from.field_1351;
         double var14 = to * var10 * var10 / (2.0 * gravity * gravity);
         double var16 = var10 * var10 - 4.0 * var14 * (var12 + var14);
         if (var16 < 0.0) {
            return Float.NaN;
         } else {
            double var18 = (var10 - Math.sqrt(var16)) / (2.0 * var14);
            return (float)(-Math.toDegrees(Math.atan(var18)));
         }
      }
   }

   public static class_243 Illlllllilll(class_1309 p) {
      return new class_243(p.method_23317(), p.method_23320() - 0.1F, p.method_23321());
   }

   private static boolean iliIiiliiiii(class_638 p, class_2339 world, class_243 mut) {
      long var16 = -458995719479238483L;
      long var18 = 5878053287207278399L;
      long var20 = -8238164204235656880L;
      long var12 = 1787206527865865140L;
      long var14 = 6415508471026934268L;
      var12 ^= ((long)class_3532.method_15357(mut.field_1352 - 0.125) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)class_3532.method_15357(mut.field_1352 + 0.125) ^ var12) & -1L >>> 32;
      var14 ^= ((long)class_3532.method_15357(mut.field_1351) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)class_3532.method_15357(mut.field_1351 + 0.25) ^ var14) & -1L >>> 32;
      var16 ^= ((long)class_3532.method_15357(mut.field_1350 - 0.125) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)class_3532.method_15357(mut.field_1350 + 0.125) ^ var16) & -1L >>> 32;
      var18 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var18) & -1L << 32;

      while ((int)(var18 >>> 32) <= (int)var12) {
         for (var18 ^= ((long)((int)(var14 >>> 32)) ^ var18) & -1L >>> 32; (int)var18 <= (int)var14; var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            for (var20 ^= ((long)((int)(var16 >>> 32)) << 32 ^ var20) & -1L << 32; (int)(var20 >>> 32) <= (int)var16; var20 += 4294967296L) {
               if (p.method_8320(world.method_10103((int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32))).method_27852(class_2246.field_10422)) {
                  return true;
               }
            }
         }

         var18 += 4294967296L;
      }

      return false;
   }

   public static lIililiIilil liiiIIllIl(class_243 vel, class_243 pos, int maxTicks) {
      return IliIlllilIi(vel, pos, 0.03, 0.99, maxTicks);
   }

   private static class_238 IIIllIIliIIl(class_243 vx, double p, double vy, double vz) {
      return new class_238(vx.field_1352 - 0.125, vx.field_1351, vx.field_1350 - 0.125, vx.field_1352 + 0.125, vx.field_1351 + 0.25, vx.field_1350 + 0.125)
         .method_1012(p, vy, vz)
         .method_1014(1.0);
   }

   public static lIililiIilil lIiiIiIlilli(
      class_243 age, class_243 maxTicks, boolean vel, int self, class_1297 owner, class_1297 pos, boolean entities, int touchingWater
   ) {
      long var43 = 7981744458419234328L;
      long var45 = 8971338840728196434L;
      long var47 = 5894040892017189504L;
      ArrayList var8 = new ArrayList(64);
      var8.add(age);
      class_638 var9 = iIiIllllil.field_1687;
      if (var9 == null) {
         return new lIililiIilil(var8, age, false, null, age, age, -1, -1.0, null, null, -1, false);
      } else {
         class_3726 var10 = class_3726.method_16194();
         class_631 var11 = var9.method_2935();
         class_2339 var12 = new class_2339();
         double[] var13 = new double[3];
         double var14 = (double)(var9.method_31607() - 64);
         class_243 var16 = age;
         double var17 = maxTicks.field_1352;
         double var19 = maxTicks.field_1351;
         double var21 = maxTicks.field_1350;
         var43 ^= ((long)vel << 32 ^ var43) & -1L << 32;
         var43 ^= ((long)(pos != null && pos.method_5829().method_994(IIIllIIliIIl(age, var17, var19, var21)) ? 0 : 1) ^ var43) & -1L >>> 32;
         if (iliIiiliiiii(var9, var12, age)) {
            return new lIililiIilil(var8, age, false, null, age, age, -1, -1.0, null, null, -1, false);
         } else {
            var45 ^= (4294967296L ^ var45) & -1L << 32;

            while ((int)(var45 >>> 32) <= touchingWater) {
               double var49 = var19 - 0.03;
               double var26 = (int)(var43 >>> 32) != 0 ? 0.8F : 0.99F;
               var17 *= var26;
               var19 = var49 * var26;
               var21 *= var26;
               class_243 var28 = new class_243(var16.field_1352 + var17, var16.field_1351 + var19, var16.field_1350 + var21);
               class_3965 var29 = var9.method_61717(new class_3959(var16, var28, class_3960.field_17558, class_242.field_1348, var10));
               var45 ^= ((long)(var29.method_17783() != class_240.field_1333 ? 1 : 0) ^ var45) & -1L >>> 32;
               class_243 var31 = (int)var45 != 0 ? var29.method_17784() : var28;
               class_1297 var32 = null;
               if (entities) {
                  float var33 = Math.max(0.0F, Math.min(0.3F, (float)(self + (int)(var45 >>> 32) - 2) / 20.0F));
                  var47 ^= ((long)((int)var43) << 32 ^ var47) & -1L << 32;
                  double var35 = Double.MAX_VALUE;
                  class_243 var37 = null;

                  for (class_1297 var39 : var9.method_8333(
                     owner, IIIllIIliIIl(var16, var17, var19, var21), ownerx -> ownerx.method_49108() && (pos == null || leftNow || !pos.method_5794(ownerx))
                  )) {
                     Optional var40 = var39.method_5829().method_1014((double)var33).method_992(var16, var31);
                     if (!var40.isEmpty()) {
                        double var41 = var16.method_1025((class_243)var40.get());
                        if (var41 < var35) {
                           var35 = var41;
                           var32 = var39;
                           var37 = (class_243)var40.get();
                        }
                     }
                  }

                  if (var32 != null) {
                     var31 = var37;
                  }
               }

               if ((int)var45 == 0 && var32 == null) {
                  var16 = var28;
                  var8.add(var28);
                  if (!(var28.field_1351 < var14)
                     && var11.method_12123(class_3532.method_15357(var28.field_1352) >> 4, class_3532.method_15357(var28.field_1350) >> 4)
                     && !iliIiiliiiii(var9, var12, var28)) {
                     if ((int)var43 == 0) {
                        var43 ^= ((long)(!pos.method_5829().method_994(IIIllIIliIIl(var28, var17, var19, var21)) ? 1 : 0) ^ var43) & -1L >>> 32;
                     }

                     var43 ^= ((long)IlIlllIlilIl(var9, var12, var28.field_1352, var28.field_1351, var28.field_1350, var13) << 32 ^ var43) & -1L << 32;
                     if ((int)(var43 >>> 32) != 0) {
                        var17 += var13[0];
                        var19 += var13[1];
                        var21 += var13[2];
                     }

                     var45 += 4294967296L;
                     continue;
                  }
                  break;
               }

               var8.add(var31);
               double var50 = Math.sqrt(var17 * var17 + var19 * var19 + var21 * var21);
               double var51 = var50 < 1.0E-9 ? 1.0 : Math.min(1.0, var16.method_1022(var31) / var50);
               var47 ^= ((long)(var32 == null ? 1 : 0) ^ var47) & -1L >>> 32;
               return new lIililiIilil(
                  var8,
                  var31,
                  (boolean)((int)var47),
                  var31,
                  var16,
                  var28,
                  (int)(var45 >>> 32),
                  (double)((int)(var45 >>> 32) - 1) + var51,
                  (int)var47 != 0 ? var29.method_17780() : null,
                  (int)var47 != 0 ? var29.method_17777() : null,
                  var32 == null ? -1 : var32.method_5628(),
                  true
               );
            }

            return new lIililiIilil(var8, var16, false, null, var16, var16, -1, -1.0, null, null, -1, false);
         }
      }
   }

   public static lIililiIilil IilliliilIIi(class_1684 maxTicks, boolean pearl, int entities) {
      return lIiiIiIlilli(
         maxTicks.method_73189(), maxTicks.method_18798(), maxTicks.method_5799(), maxTicks.field_6012, maxTicks, maxTicks.method_24921(), pearl, entities
      );
   }

   private liIiililiiIiilil() {
   }
}
