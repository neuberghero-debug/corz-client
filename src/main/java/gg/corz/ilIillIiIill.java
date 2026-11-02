package gg.corz;

import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class ilIillIiIill {
   private static final double[] llIIilIiilIIilIi = new double[]{0.0, 1.0};
   private static final double[] IiIIilIiliIIilIi = new double[]{0.0, 0.5, 1.0};
   private static final double lIlIilIiiIlIilIi = 0.001;
   private static final double[] iiIIilIiIIlIilIi = new double[]{0.0, 1.0};
   public static final int iIIIilIiIlIIilIi = 12;

   private ilIillIiIill() {
   }

   public static float IliIlllilIi(class_243 virtualAir, class_238 virtualSolid, class_1297 ctx, class_2338 center, class_2338 box) {
      long var33 = -2699095085419421778L;
      long var35 = -6152623006028948217L;
      long var37 = 6577355370487607880L;
      long var39 = -4677309961927096149L;
      class_638 var5 = class_310.method_1551().field_1687;
      if (var5 != null && virtualAir != null && virtualSolid != null) {
         class_238 var6 = center == null
            ? null
            : new class_238(
               (double)center.method_10263(),
               (double)center.method_10264(),
               (double)center.method_10260(),
               (double)center.method_10263() + 1.0,
               (double)center.method_10264() + 1.0 - 0.001,
               (double)center.method_10260() + 1.0
            );
         class_3726 var7 = ctx == null ? class_3726.method_16194() : class_3726.method_16195(ctx);
         var33 ^= (0L ^ var33) & -1L << 32;
         double[] var9 = llIIilIiilIIilIi;
         var33 ^= ((long)var9.length ^ var33) & -1L >>> 32;
         var35 ^= (0L ^ var35) & -1L << 32;

         while ((int)(var35 >>> 32) < (int)var33) {
            double var12 = var9[(int)(var35 >>> 32)];
            double[] var14 = IiIIilIiliIIilIi;
            var35 ^= ((long)var14.length ^ var35) & -1L >>> 32;
            var37 ^= (0L ^ var37) & -1L << 32;

            while ((int)(var37 >>> 32) < (int)var35) {
               double var17 = var14[(int)(var37 >>> 32)];
               double[] var19 = iiIIilIiIIlIilIi;
               var37 ^= ((long)var19.length ^ var37) & -1L >>> 32;
               var39 ^= (0L ^ var39) & -1L << 32;

               while ((int)(var39 >>> 32) < (int)var37) {
                  double var22 = var19[(int)(var39 >>> 32)];
                  double var24 = var12 == 0.0 ? virtualSolid.field_1323 + 0.001 : virtualSolid.field_1320 - 0.001;
                  double var26 = virtualSolid.field_1322 + (virtualSolid.field_1325 - virtualSolid.field_1322) * var17;
                  double var28 = var22 == 0.0 ? virtualSolid.field_1321 + 0.001 : virtualSolid.field_1324 - 0.001;
                  class_243 var30 = new class_243(var24, var26, var28);
                  class_3965 var31 = var5.method_17742(new class_3959(var30, virtualAir, class_3960.field_17558, class_242.field_1348, var7));
                  var39 ^= (
                        (long)(
                              var31.method_17783() != class_240.field_1333
                                    && (box == null || var31.method_17783() != class_240.field_1332 || !var31.method_17777().equals(box))
                                 ? 0
                                 : 1
                           )
                           ^ var39
                     )
                     & -1L >>> 32;
                  if ((int)var39 != 0 && var6 != null && var6.method_992(var30, virtualAir).isPresent()) {
                     var39 ^= (0L ^ var39) & -1L >>> 32;
                  }

                  if ((int)var39 != 0) {
                     var33 += 4294967296L;
                  }

                  var39 += 4294967296L;
               }

               var37 += 4294967296L;
            }

            var35 += 4294967296L;
         }

         return (float)((int)(var33 >>> 32)) / 12.0F;
      } else {
         return 0.0F;
      }
   }
}
