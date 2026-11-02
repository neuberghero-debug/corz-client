package gg.corz;

import java.util.Optional;
import net.minecraft.class_1304;
import net.minecraft.class_1320;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3486;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_1322.class_1323;

public final class iIIiIIilIlIiIIil {
   public static final double[] ilIIilIIil = new double[]{0.45, 1.0};
   public static final double IIlIilIIil = 0.5;
   public static final double lIlIilIIil = 1.0E-6;
   public static final int IiIIilIIil = 3;
   public static final double liIIilIIil = 1.0;
   public static final double iiIIilIIil = 0.5;

   private iIIiIIilIlIiIIil() {
   }

   static boolean IlIlllIlilIl(class_1937 pos, class_2338 w) {
      class_2680 var2 = pos.method_8320(w);
      return !var2.method_26220(pos, w).method_1110();
   }

   public static boolean IIIllIIliIIl(class_1937 dx, class_243 w, double dz, double feet) {
      long var24 = 3540008585809609473L;
      long var26 = -706043693135191821L;
      long var28 = -8511318465428043951L;
      long var30 = 7780330310639334685L;
      if (dx != null && w != null) {
         double var6 = Math.hypot(dz, feet);
         if (!(var6 > 1.0E-6)) {
            return true;
         } else {
            double var8 = dz / var6;
            double var10 = feet / var6;
            var24 ^= ((long)((int)Math.floor(w.field_1351 + 0.01)) << 32 ^ var24) & -1L << 32;
            double[] var13 = ilIIilIIil;
            var24 ^= ((long)var13.length ^ var24) & -1L >>> 32;
            var26 ^= (0L ^ var26) & -1L << 32;

            while ((int)(var26 >>> 32) < (int)var24) {
               double var16 = var13[(int)(var26 >>> 32)];
               var26 ^= ((long)((int)Math.floor(w.field_1352 + var8 * var16)) ^ var26) & -1L >>> 32;
               var28 ^= ((long)((int)Math.floor(w.field_1350 + var10 * var16)) << 32 ^ var28) & -1L << 32;
               if (IIlllIlliIll(dx, new class_2338((int)var26, (int)(var24 >>> 32), (int)(var28 >>> 32)))
                  || IIlllIlliIll(dx, new class_2338((int)var26, (int)(var24 >>> 32) + 1, (int)(var28 >>> 32)))) {
                  return false;
               }

               class_2338 var20 = new class_2338((int)var26, (int)(var24 >>> 32), (int)(var28 >>> 32));
               if (!IlIlllIlilIl(dx, var20)) {
                  var28 ^= (0L ^ var28) & -1L >>> 32;
                  var30 ^= (4294967296L ^ var30) & -1L << 32;

                  while (true) {
                     if ((int)(var30 >>> 32) <= 4) {
                        class_2338 var23 = var20.method_10087((int)(var30 >>> 32));
                        if (IIlllIlliIll(dx, var23) || IiIlliIliiIl(dx.method_8320(var23))) {
                           return false;
                        }

                        if (!IlIlllIlilIl(dx, var23)) {
                           var30 += 4294967296L;
                           continue;
                        }

                        var28 ^= (1L ^ var28) & -1L >>> 32;
                     }

                     if ((int)var28 == 0) {
                        return false;
                     }
                     break;
                  }
               }

               var26 += 4294967296L;
            }

            return true;
         }
      } else {
         return true;
      }
   }

   public static boolean iliIiiliiiii(class_1799 s, double best) {
      return liiiIIllIl(s) && iIlIlllllill(s) >= best - 1.0E-6;
   }

   public static double iIlIlllllill(class_1799 s) {
      if (!liiiIIllIl(s)) {
         return Double.NEGATIVE_INFINITY;
      } else {
         double[] var1 = new double[1];
         s.method_57354(class_1304.field_6173, (attr, sum) -> {
            if (Illlllllilll(attr, class_5134.field_23721) && sum.comp_2450() == class_1323.field_6328) {
               var1[0] += sum.comp_2449();
            }
         });
         return 1.0 + var1[0] + IilliliilIIi(lIlllIliIlllIl.lIiiIiIlilli(s, class_1893.field_9118));
      }
   }

   static boolean IiIlliIliiIl(class_2680 st) {
      return st != null && st.method_26227().method_15767(class_3486.field_15518);
   }

   public static double IilliliilIIi(int level) {
      return level > 0 ? 0.5 * (double)level + 0.5 : 0.0;
   }

   public static double lIiiIiIlilli(double[] damage) {
      long var8 = 1040946858560370486L;
      double var1 = Double.NEGATIVE_INFINITY;
      if (damage != null) {
         double[] var3 = damage;
         var8 ^= ((long)damage.length << 32 ^ var8) & -1L << 32;

         for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            double var6 = var3[(int)var11];
            if (var6 > var1) {
               var1 = var6;
            }
         }
      }

      return var1;
   }

   public static boolean liiiIIllIl(class_1799 s) {
      return lIlllIliIlllIl.iIlIlllllill(s);
   }

   static boolean IIlllIlliIll(class_1937 pos, class_2338 w) {
      class_2680 var2 = pos.method_8320(w);
      return IiIlliIliiIl(var2)
         ? true
         : var2.method_27852(class_2246.field_10036)
            || var2.method_27852(class_2246.field_22089)
            || var2.method_27852(class_2246.field_10092)
            || var2.method_27852(class_2246.field_10029)
            || var2.method_27852(class_2246.field_16999)
            || var2.method_27852(class_2246.field_27879)
            || var2.method_27852(class_2246.field_10343)
            || var2.method_27852(class_2246.field_10606)
            || var2.method_27852(class_2246.field_17350)
            || var2.method_27852(class_2246.field_23860);
   }

   public static double IliIlllilIi(class_1799 s) {
      if (s != null && !s.method_7960()) {
         double[] var1 = new double[1];
         s.method_57354(class_1304.field_6173, (attr, mod) -> {
            if (Illlllllilll(attr, class_5134.field_23723) && mod.comp_2450() == class_1323.field_6328) {
               var1[0] += mod.comp_2449();
            }
         });
         double var2 = 4.0 + var1[0];
         return var2 > 0.0 ? var2 : 4.0;
      } else {
         return 4.0;
      }
   }

   private static boolean Illlllllilll(class_6880<class_1320> a, class_6880<class_1320> b) {
      if (a == b) {
         return true;
      } else {
         Optional var2 = b.method_40230();
         return var2.isPresent() && a.method_40225((class_5321)var2.get());
      }
   }
}
