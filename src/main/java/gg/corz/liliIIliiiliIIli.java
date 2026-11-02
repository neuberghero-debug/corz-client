package gg.corz;

import net.minecraft.class_10707;
import net.minecraft.class_12392;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_5321;
import net.minecraft.class_6885;
import net.minecraft.class_746;
import net.minecraft.class_8110;
import net.minecraft.class_8111;
import net.minecraft.class_9334;
import net.minecraft.class_10707.class_10708;

public final class liliIIliiiliIIli {
   private static class_746 IlIiIiIlIi;
   private static double llIiIiIlIi = Double.NaN;
   public static final int IIIiIiIlIi = 4;
   static final double lIIiIiIlIi = 0.25;
   private static final class_310 iIIiIiIlIi = class_310.method_1551();

   static void IIIilIIiiIIi() {
      IlIiIiIlIi = null;
      llIiIiIlIi = Double.NaN;
   }

   public static int Illlllllilll(int horizon) {
      long var21 = 1003230921586553536L;
      class_746 var1 = iIIiIiIlIi.field_1724;
      if (var1 != null && iIIiIiIlIi.field_1687 != null && !var1.method_24828()) {
         class_243 var2 = var1.method_18798();
         double[] var3 = llIiIililIiIil.IiIlliIliiIl(var2.field_1351, var1.method_56989(), horizon);
         class_238 var4 = var1.method_5829();
         double var5 = 0.0;
         double var7 = 0.0;
         double var9 = 0.0;

         for (long var23 = var21 ^ (0L ^ var21) & -1L << 32; (int)(var23 >>> 32) < var3.length; var23 += 4294967296L) {
            double var12 = (double)((int)(var23 >>> 32) + 1);
            double var14 = var2.field_1352 * var12;
            double var16 = var2.field_1350 * var12;
            if (iIIiIiIlIi.field_1687.method_8587(var1, var4.method_989(var14, var9, var16))) {
               var5 = var14;
               var7 = var16;
            }

            double var18 = var3[(int)(var23 >>> 32)] - var9;
            if (var18 < 0.0) {
               class_238 var20 = var4.method_989(var5, var9, var7).method_1012(0.0, var18, 0.0);
               if (!iIIiIiIlIi.field_1687.method_8587(var1, var20) || iIIiIiIlIi.field_1687.method_22345(var20)) {
                  return (int)(var23 >>> 32);
               }
            }

            var9 = var3[(int)(var23 >>> 32)];
         }

         return var3.length;
      } else {
         return 0;
      }
   }

   public static boolean IIillIiliIil(class_1297 target, int attackTicks) {
      return llIiIililIiIil.IIlllIlliIll(Illlllllilll(4), Iilllilliill(target), attackTicks);
   }

   static void Ililllililil() {
      class_746 var0 = iIIiIiIlIi.field_1724;
      if (var0 != IlIiIiIlIi) {
         IlIiIiIlIi = var0;
         llIiIiIlIi = Double.NaN;
      }

      if (var0 != null) {
         if (var0.method_24828() || var0.field_6017 <= 0.0 || var0.method_5799() || var0.method_5765() || var0.method_6128()) {
            llIiIiIlIi = Double.NaN;
         }
      }
   }

   public static class_243 IIIllIIliIIl() {
      class_746 var0 = iIIiIiIlIi.field_1724;
      if (ilIiiIiIii.IiIlliIliiIl()) {
         return ilIiiIiIii.Iiilliiliiil(ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil());
      } else {
         return var0 == null ? class_243.field_1353 : var0.method_5720();
      }
   }

   private liliIIliiiliIIli() {
   }

   static boolean Iiilliiliiil() {
      class_746 var0 = iIIiIiIlIi.field_1724;
      if (var0 != null && !var0.method_24828()) {
         if (!llIiIililIiIil.IIIllIIliIIl(IilliliilIIi(), var0.method_6128(), 1.5)) {
            return false;
         } else {
            llIiIiIlIi = var0.method_23318();
            return true;
         }
      } else {
         return false;
      }
   }

   private static double iIlIlllllill(class_10707 block, class_5321<class_8110> type) {
      double var2 = -1.0;

      for (class_10708 var5 : block.comp_3588()) {
         if ((!(var5.comp_3593() <= 0.0F) || !(var5.comp_3594() <= 0.0F))
            && (!var5.comp_3592().isPresent() || !((class_6885)var5.comp_3592().get()).method_40239().noneMatch(e -> e.method_40225(type)))) {
            var2 = Math.max(var2, (double)var5.comp_3638());
         }
      }

      return var2 < 0.0 ? Double.NaN : llIiIililIiIil.lIiiIiIlilli(var2);
   }

   public static boolean lIiiIiIlilli(double minFall) {
      class_746 var2 = iIIiIiIlIi.field_1724;
      return var2 != null && !var2.method_24828() ? llIiIililIiIil.IIIllIIliIIl(IilliliilIIi(), var2.method_6128(), minFall) : false;
   }

   public static boolean IiIlliIliiIl(class_1297 weapon, class_1799 target) {
      class_746 var2 = iIIiIiIlIi.field_1724;
      if (var2 == null || weapon == null) {
         return false;
      } else {
         return weapon == iIiIlillIliIlill.IIIillIIil() ? true : IIlllIlliIll(var2, weapon, target, var2.method_5720());
      }
   }

   public static boolean liiiIIllIl(class_1297 type, class_243 entity, class_5321<class_8110> source) {
      long var11 = -1125221592318498001L;
      class_746 var3 = iIIiIiIlIi.field_1724;
      if (var3 == null || entity == null || !(type instanceof class_1309 var4) || var4 == var3) {
         return false;
      }

      if (!var4.method_6115()) {
         return false;
      } else {
         class_10707 var5 = (class_10707)var4.method_6030().method_58694(class_9334.field_56396);
         if (var5 == null) {
            return false;
         } else {
            double var6 = iIlIlllllill(var5, source);
            if (Double.isNaN(var6)) {
               return false;
            } else {
               var11 ^= ((long)llIiIililIiIil.iIlIlllllill(illIllilIilIllil.IiIlliIliiIl()) << 32 ^ var11) & -1L << 32;
               if (!llIiIililIiIil.IilliliilIIi(var4.method_6048(), (int)(var11 >>> 32), var5.method_67197())) {
                  return false;
               } else {
                  class_243 var9 = var4.method_5631(0.0F, var4.method_5791());
                  class_243 var10 = var4.method_73189();
                  return llIiIililIiIil.iliIiiliiiii(
                     var9.field_1352, var9.field_1350, entity.field_1352 - var10.field_1352, entity.field_1350 - var10.field_1350, var6, 0.2
                  );
               }
            }
         }
      }
   }

   public static boolean IlIlllIlilIl(class_1297 target, class_1799 weapon) {
      class_746 var2 = iIIiIiIlIi.field_1724;
      return var2 != null && target != null ? IIlllIlliIll(var2, target, weapon, IIIllIIliIIl()) : false;
   }

   public static boolean IliIlllilIi(class_1297 entity) {
      return iIIiIiIlIi.field_1724 != null && liiiIIllIl(entity, iIIiIiIlIi.field_1724.method_73189(), class_8111.field_42320);
   }

   public static double IilliliilIIi() {
      class_746 var0 = iIIiIiIlIi.field_1724;
      if (var0 == null) {
         return 0.0;
      } else {
         if (var0 != IlIiIiIlIi) {
            IlIiIiIlIi = var0;
            llIiIiIlIi = Double.NaN;
         }

         return llIiIililIiIil.IlIlllIlilIl(var0.field_6017, llIiIiIlIi, var0.method_23318());
      }
   }

   public static boolean Iilllilliill(class_1297 target) {
      class_746 var1 = iIIiIiIlIi.field_1724;
      if (var1 != null && target != null) {
         class_243 var2 = var1.method_33571().method_1019(var1.method_18798());
         class_243 var3 = new class_243(
            target.method_23317() - target.field_6014, target.method_23318() - target.field_6036, target.method_23321() - target.field_5969
         );
         class_238 var4 = target.method_5829().method_997(var3).method_1014((double)target.method_5871());
         class_243 var5 = IIIllIIliIIl();
         double var6 = llIiIililIiIil.Illlllllilll(
            var2.field_1352,
            var2.field_1351,
            var2.field_1350,
            var5.field_1352,
            var5.field_1351,
            var5.field_1350,
            var4.field_1323,
            var4.field_1322,
            var4.field_1321,
            var4.field_1320,
            var4.field_1325,
            var4.field_1324
         );
         return !llIiIililIiIil.IIillIiliIil(var6, var1.method_55755() - 0.25);
      } else {
         return true;
      }
   }

   public static boolean iliIiiliiiii() {
      return lIiiIiIlilli(1.5);
   }

   private static boolean IIlllIlliIll(class_746 look, class_1297 weapon, class_1799 target, class_243 self) {
      class_243 var4 = look.method_33571();
      class_238 var5 = weapon.method_5829().method_1014((double)weapon.method_5871());
      double var6 = llIiIililIiIil.Illlllllilll(
         var4.field_1352,
         var4.field_1351,
         var4.field_1350,
         self.field_1352,
         self.field_1351,
         self.field_1350,
         var5.field_1323,
         var5.field_1322,
         var5.field_1321,
         var5.field_1320,
         var5.field_1325,
         var5.field_1324
      );
      if (var6 == Double.POSITIVE_INFINITY) {
         return false;
      } else {
         class_12392 var8 = target != null && !target.method_7960() ? (class_12392)target.method_58694(class_9334.field_64680) : null;
         return var8 != null
            ? var8.method_76736(look, var4.method_1019(self.method_1029().method_1021(var6)))
            : llIiIililIiIil.IIillIiliIil(var6, look.method_55755());
      }
   }
}
