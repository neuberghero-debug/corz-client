package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1510;
import net.minecraft.class_1531;
import net.minecraft.class_1569;
import net.minecraft.class_1571;
import net.minecraft.class_1621;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_746;

public final class liiIIIlliiiIIIll {
   private static final class_1304[] IllliiIlll = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
   private static final class_310 iIlliiIlll = class_310.method_1551();

   public static class_1309 Ililllililil(double fovDegrees, double range, lilllliiilllli o) {
      class_1309 var5 = null;
      double var6 = Double.MAX_VALUE;
      double var8 = Double.MAX_VALUE;

      for (class_1309 var11 : Iilllilliill(fovDegrees, o)) {
         double var12 = IiIlliIliiIl(var11);
         if (ilIIlIlIiIIlIl.iIlIlllllill(var12, range)) {
            double var14 = IIIllIIliIIl(var11);
            if (var12 < var6 - 1.0E-6 || Math.abs(var12 - var6) <= 1.0E-6 && var14 < var8) {
               var5 = var11;
               var6 = var12;
               var8 = var14;
            }
         }
      }

      return var5;
   }

   public static boolean IilliliilIIi(class_1657 p) {
      class_746 var1 = iIlliiIlll.field_1724;
      return var1 != null && p != null && p != var1 ? ilIIlIlIiIIlIl.lIiiIiIlilli(var1.method_5781(), p.method_5781()) : false;
   }

   public static double IIIllIIliIIl(class_1297 e) {
      if (iIlliiIlll.field_1724 != null && e != null) {
         class_243 var1 = iIlliiIlll.field_1724.method_33571();
         class_238 var2 = e.method_5829();
         return ilIIlIlIiIIlIl.IilliliilIIi(
            var1.field_1352,
            var1.field_1351,
            var1.field_1350,
            var2.field_1323,
            var2.field_1322,
            var2.field_1321,
            var2.field_1320,
            var2.field_1325,
            var2.field_1324
         );
      } else {
         return Double.MAX_VALUE;
      }
   }

   public static boolean liiiIIllIl(class_1297 e) {
      return e instanceof class_1569 || e instanceof class_1621 || e instanceof class_1571 || e instanceof class_1510;
   }

   public static double IlIlllIlilIl(class_243 point) {
      if (iIlliiIlll.field_1724 != null && point != null) {
         class_243 var1 = iIlliiIlll.field_1724.method_33571();
         return ilIIlIlIiIIlIl.IliIlllilIi(
            iIiIlillIliIlill.ilillIiill(),
            iIiIlillIliIlill.liilliiill(),
            point.field_1352 - var1.field_1352,
            point.field_1351 - var1.field_1351,
            point.field_1350 - var1.field_1350
         );
      } else {
         return 180.0;
      }
   }

   public static double IiIlliIliiIl(class_1297 e) {
      return e == null ? 180.0 : IlIlllIlilIl(e.method_5829().method_1005());
   }

   public static boolean IliIlllilIi(class_1297 e, lilllliiilllli o) {
      if (e != null && o != null && iIlliiIlll.field_1724 != null && e != iIlliiIlll.field_1724) {
         if (!(e instanceof class_1309 var2) || e instanceof class_1531) {
            return false;
         }

         if (!var2.method_5805() || var2.method_31481() || var2.method_29504() || var2.method_6032() <= 0.0F || e.method_7325()) {
            return false;
         } else if (!o.IIlllIlliIll() && iIlIlllllill(var2)) {
            return false;
         } else if (iIIiIiIlIlIiIiIl.liiiIIllIl(e)) {
            return false;
         } else {
            if (!(e instanceof class_1657 var3)) {
               return liiiIIllIl(e) ? o.IlIlllIlilIl() : o.IiIlliIliiIl();
            }

            if (!o.IIIllIIliIIl()) {
               return false;
            } else {
               return !o.Iilllilliill() && iliIiiliiiii(var3) ? false : o.Illlllllilll() || !IilliliilIIi(var3);
            }
         }
      } else {
         return false;
      }
   }

   public static boolean IIlllIlliIll(class_1297 e, double fovDegrees) {
      return e != null && ilIIlIlIiIIlIl.iIlIlllllill(IiIlliIliiIl(e), fovDegrees);
   }

   private liiIIIlliiiIIIll() {
   }

   public static boolean iIlIlllllill(class_1309 e) {
      long var5 = -4581179045268007622L;
      if (e.method_5767() && e.method_6047().method_7960()) {
         class_1304[] var1 = IllliiIlll;
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            class_1304 var4 = var1[(int)var8];
            if (!e.method_6118(var4).method_7960()) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static Integer Iiilliiliiil(class_268 team) {
      if (team == null) {
         return null;
      } else {
         class_124 var1 = team.method_1202();
         return var1 == null ? null : var1.method_532();
      }
   }

   public static boolean Illlllllilll(class_1297 e) {
      return iIlliiIlll.field_1724 != null && e != null
         ? iIlliiIlll.field_1724.method_6057(e) || iillIiIlIIilIiIl.iliIiiliiiii(e.method_5829().method_1005())
         : false;
   }

   public static Integer lIiiIiIlilli(class_1657 p) {
      if (p == null) {
         return null;
      } else {
         class_634 var1 = iIlliiIlll.method_1562();
         if (var1 != null) {
            class_640 var2 = var1.method_2871(p.method_5667());
            if (var2 != null) {
               class_2561 var3 = var2.method_2971();
               Integer var4 = ilIIlIlIiIIlIl.IIIllIIliIIl(var3, p.method_5477().getString());
               if (var4 != null) {
                  return var4;
               }

               Integer var5 = Iiilliiliiil(var2.method_2955());
               if (var5 != null) {
                  return var5;
               }
            }
         }

         return Iiilliiliiil(p.method_5781());
      }
   }

   public static boolean iliIiiliiiii(class_1657 p) {
      if (p == null || p == iIlliiIlll.field_1724) {
         return false;
      } else if (ilIIlIlIiIIlIl.iliIiiliiiii(p.method_5667())) {
         return true;
      } else {
         class_634 var1 = iIlliiIlll.method_1562();
         return var1 != null && var1.method_2871(p.method_5667()) == null;
      }
   }

   public static List<class_1309> Iilllilliill(double o, lilllliiilllli range) {
      ArrayList var3 = new ArrayList();
      if (iIlliiIlll.field_1687 != null && iIlliiIlll.field_1724 != null && range != null) {
         for (class_1297 var6 : !range.IlIlllIlilIl() && !range.IiIlliIliiIl() ? iIlliiIlll.field_1687.method_18456() : iIlliiIlll.field_1687.method_18112()) {
            if (IliIlllilIi(var6, range) && IIIllIIliIIl(var6) <= o) {
               var3.add((class_1309)var6);
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   public static class_1309 IIillIiliIil(double range, lilllliiilllli o) {
      class_1309 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (class_1309 var7 : Iilllilliill(range, o)) {
         double var8 = IIIllIIliIIl(var7);
         if (var8 < var4) {
            var3 = var7;
            var4 = var8;
         }
      }

      return var3;
   }
}
