package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class iillIiIlIIilIiIl {
   private static final class_310 iIIiIliIll = class_310.method_1551();

   public static double lIiiIiIlilli(class_243 fromYaw, float target, float fromPitch) {
      if (iIIiIliIll.field_1724 == null) {
         return 180.0;
      } else {
         class_243 var3 = iIIiIliIll.field_1724.method_33571();
         float[] var4 = ilIiiIiIii.Ililllililil(var3, fromYaw);
         float var5 = class_3532.method_15393(var4[0] - target);
         float var6 = var4[1] - fromPitch;
         return Math.sqrt((double)(var5 * var5 + var6 * var6));
      }
   }

   public static class_1309 iIlIlllllill(double range, Predicate<class_1309> filter) {
      if (iIIiIliIll.field_1687 != null && iIIiIliIll.field_1724 != null) {
         class_243 var3 = iIIiIliIll.field_1724.method_33571();
         double var4 = range * range;
         class_1309 var6 = null;
         double var7 = Double.MAX_VALUE;

         for (class_1297 var10 : iIIiIliIll.field_1687.method_18112()) {
            if (var10 != iIIiIliIll.field_1724 && var10 instanceof class_1309) {
               class_1309 var11 = (class_1309)var10;
               if (var11.method_5805()) {
                  double var12 = var3.method_1028(var11.method_23317(), var11.method_23320(), var11.method_23321());
                  if (!(var12 > var4) && !(var12 >= var7) && (filter == null || filter.test(var11))) {
                     var6 = var11;
                     var7 = var12;
                  }
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   private iillIiIlIIilIiIl() {
   }

   public static boolean iliIiiliiiii(class_243 target) {
      if (iIIiIliIll.field_1687 != null && iIIiIliIll.field_1724 != null) {
         class_243 var1 = iIIiIliIll.field_1724.method_33571();
         class_3965 var2 = iIIiIliIll.field_1687
            .method_17742(new class_3959(var1, target, class_3960.field_17558, class_242.field_1348, iIIiIliIll.field_1724));
         return var2.method_17783() == class_240.field_1333 || var1.method_1025(var2.method_17784()) >= var1.method_1025(target);
      } else {
         return false;
      }
   }

   public static List<class_1657> IliIlllilIi(double range) {
      ArrayList var2 = new ArrayList();
      if (iIIiIliIll.field_1687 != null && iIIiIliIll.field_1724 != null) {
         class_243 var3 = iIIiIliIll.field_1724.method_33571();
         double var4 = range * range;

         for (class_1657 var7 : iIIiIliIll.field_1687.method_18456()) {
            if (var7 != iIIiIliIll.field_1724 && var7.method_5805() && !var7.method_7325()) {
               double var8 = var3.method_1028(var7.method_23317(), var7.method_23320(), var7.method_23321());
               if (var8 <= var4 && !iIIiIiIlIlIiIiIl.liiiIIllIl(var7)) {
                  var2.add(var7);
               }
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static class_1657 liiiIIllIl(double range) {
      if (iIIiIliIll.field_1724 == null) {
         return null;
      } else if (iIIiIliIll.field_1687 == null) {
         return null;
      } else {
         class_243 var2 = iIIiIliIll.field_1724.method_33571();
         double var3 = range * range;
         class_1657 var5 = null;
         double var6 = Double.MAX_VALUE;

         for (class_1657 var9 : iIIiIliIll.field_1687.method_18456()) {
            if (var9 != iIIiIliIll.field_1724 && var9.method_5805() && !var9.method_7325()) {
               double var10 = var2.method_1028(var9.method_23317(), var9.method_23320(), var9.method_23321());
               if (var10 <= var3 && (var5 == null || var10 < var6) && !iIIiIiIlIlIiIiIl.liiiIIllIl(var9)) {
                  var5 = var9;
                  var6 = var10;
               }
            }
         }

         return var5;
      }
   }

   public static double IilliliilIIi(class_243 target) {
      return iIIiIliIll.field_1724 == null ? 180.0 : lIiiIiIlilli(target, iIIiIliIll.field_1724.method_36454(), iIIiIliIll.field_1724.method_36455());
   }
}
