package gg.corz;

import java.util.Random;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_7923;

public final class lliiIliliiIl {
   public static boolean IiIiliIiiiIi(class_2338 radius, double pos) {
      class_238 var3 = new class_238(radius).method_1014(pos);

      for (class_1297 var5 : IliIlllilIi().field_1687.method_8335(null, var3)) {
         if (var5 instanceof class_1542) {
            class_1542 var6 = (class_1542)var5;
            class_1799 var7 = var6.method_6983();
            if (!var7.method_7960()) {
               if (var7.method_31574(class_1802.field_8626)) {
                  return true;
               }

               String var8 = class_7923.field_41178.method_10221(var7.method_7909()).method_12832();
               if (var8.contains(Iilililiiili<"Iilililiiili","M3ims1qqbC6npkPZek1IDX9yPnF6BmUrrCYqDB1OxkPQsw==">())
                  || var8.contains(Iilililiiili<"Iilililiiili","FYLYbrz3f96n08RNHFK58LWXDWPy4giyaoF/Rq3B0LzOB4xOBmg=">())
                  || var8.contains(Iilililiiili<"Iilililiiili","AmnOcDo89m9n6Y/rI7pxtCFrvCwhwi+Lad5NPwvmOs1yofZW">())
                  || var8.contains(Iilililiiili<"Iilililiiili","9ZCsqgGWwt4pmx/QA+PJCB0wAAF3maRW0NWzq1P5Qfil">())
                  || var8.contains(Iilililiiili<"Iilililiiili","BdeoAy9k35r7Y1OGhV/MxZgyLHA++PZCY3ayUOmz6eq8">())) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static double[] Illillliilli(class_243 look) {
      return new double[]{look.field_1352, look.field_1351, look.field_1350};
   }

   public static boolean Iilllilliill(class_3965 eye, class_243 hit, double reach) {
      return eye != null && IiilIllliilIll.IIIilIIiiIIi(IIlilIliiIli(hit, eye.method_17777()), IIIilIIiiIIi(eye.method_17780()), reach);
   }

   public static lIIliiiliIIliiil IlIlllIlilIl(class_2338 supportOk, class_238 anchor, Predicate<class_2338> selfBox, class_2680 coverState) {
      long var10 = 6477873794392044520L;
      double[] var4 = new double[]{
         anchor.field_1323 - (double)supportOk.method_10263(),
         anchor.field_1322 - (double)supportOk.method_10264(),
         anchor.field_1321 - (double)supportOk.method_10260(),
         anchor.field_1320 - (double)supportOk.method_10263(),
         anchor.field_1325 - (double)supportOk.method_10264(),
         anchor.field_1324 - (double)supportOk.method_10260()
      };
      var10 ^= ((long)IiilIllliilIll.lIIllIliliIIllIlil.length << 32 ^ var10) & -1L << 32;
      boolean[] var6 = new boolean[(int)(var10 >>> 32)];
      boolean[] var7 = new boolean[(int)(var10 >>> 32)];

      for (long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         class_2338 var9 = IIIllIIliIIl(supportOk, (int)var13);
         var6[(int)var13] = !lIiiIiIlilli(var9);
         var7[(int)var13] = !var6[(int)var13] && iliIiiliiiii(var9, coverState) && selfBox.test(var9);
      }

      return IiilIllliilIll.Iilllilliill(var4, var6, var7);
   }

   public static boolean iIlIlllllill() {
      class_310 var0 = IliIlllilIi();
      return var0.field_1687 != null && !class_1937.field_25180.equals(var0.field_1687.method_27983());
   }

   public static boolean iliIiiliiiii(class_2338 pos, class_2680 state) {
      return IliIlllilIi().field_1687.method_8628(state, pos, class_3726.method_16194());
   }

   public static double liiiIIllIl() {
      class_310 var0 = IliIlllilIi();
      double var1 = var0.field_1724 == null ? 4.5 : var0.field_1724.method_55754();
      return Math.min(4.5, var1) - 0.1;
   }

   public static boolean IIillIiliIil(class_3965 reach, class_243 eye, double hit) {
      return reach != null && !lIiiIiIlilli(reach.method_17777()) && Iilllilliill(reach, eye, hit);
   }

   public static boolean IlIillIiilIi(class_1799 stack) {
      return !stack.method_31574(class_1802.field_8801) && !stack.method_31574(class_1802.field_23141) && !(stack.method_7909() instanceof class_1747);
   }

   public static class_243 Illlllllilll(class_243 normal, class_2350 rng, Random centre) {
      double var3 = (centre.nextDouble() * 2.0 - 1.0) * 0.3;
      double var5 = (centre.nextDouble() * 2.0 - 1.0) * 0.3;

      return switch (rng.method_10166()) {
         case field_11048 -> normal.method_1031(0.0, var3, var5);
         case field_11052 -> normal.method_1031(var3, 0.0, var5);
         case field_11051 -> normal.method_1031(var3, var5, 0.0);
         default -> throw new MatchException(null, null);
      };
   }

   public static class_2338 IIIllIIliIIl(class_2338 anchor, int index) {
      int[] var2 = IiilIllliilIll.lIIllIliliIIllIlil[index];
      return anchor.method_10069(var2[0], 0, var2[1]);
   }

   public static class_2350 Ililllililil(class_2338 to, class_2338 from) {
      long var5 = -8211780940472057164L;
      long var7 = 2252592567097456406L;
      var5 ^= ((long)(from.method_10263() - to.method_10263()) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)(from.method_10264() - to.method_10264()) ^ var5) & -1L >>> 32;
      var7 ^= ((long)(from.method_10260() - to.method_10260()) << 32 ^ var7) & -1L << 32;
      if (Math.abs((int)(var5 >>> 32)) >= Math.abs((int)var5) && Math.abs((int)(var5 >>> 32)) >= Math.abs((int)(var7 >>> 32))) {
         return (int)(var5 >>> 32) > 0 ? class_2350.field_11034 : class_2350.field_11039;
      } else if (Math.abs((int)var5) >= Math.abs((int)(var5 >>> 32)) && Math.abs((int)var5) >= Math.abs((int)(var7 >>> 32))) {
         return (int)var5 > 0 ? class_2350.field_11036 : class_2350.field_11033;
      } else {
         return (int)(var7 >>> 32) > 0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   private static class_310 IliIlllilIi() {
      return class_310.method_1551();
   }

   public static int IilliliilIIi(class_2338 pos) {
      class_2680 var1 = IliIlllilIi().field_1687.method_8320(pos);
      return var1.method_27852(class_2246.field_23152) ? (Integer)var1.method_11654(class_4969.field_23153) : -1;
   }

   public static boolean lIiiIiIlilli(class_2338 pos) {
      class_2680 var1 = IliIlllilIi().field_1687.method_8320(pos);
      return var1.method_26215() || var1.method_45474();
   }

   private lliiIliliiIl() {
   }

   public static class_3965 IiIlliIliiIl(class_2338 rng, class_2338 target, class_243 avoid, class_243 eye, double look, Random reach) {
      long var14 = -1332032046764957357L;
      var14 ^= ((long)(target != null && rng.method_19455(target) == 1 ? IIIilIIiiIIi(Ililllililil(rng, target)) : -1) << 32 ^ var14) & -1L << 32;
      boolean[] var8 = new boolean[6];

      for (var14 ^= (0L ^ var14) & -1L >>> 32; (int)var14 < 6; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         var8[(int)var14] = !lIiiIiIlilli(rng.method_10093(Iiilliiliiil((int)var14)));
      }

      var14 ^= ((long)IiilIllliilIll.IiIiliIiiiIi(var8, (int)(var14 >>> 32), IIlilIliiIli(avoid, rng), Illillliilli(eye), look) ^ var14) & -1L >>> 32;
      if ((int)var14 == -1) {
         return null;
      } else {
         class_2350 var10 = Iiilliiliiil((int)var14);
         class_2338 var11 = rng.method_10093(var10);
         class_2350 var12 = var10.method_10153();
         class_243 var13 = Illlllllilll(
            class_243.method_24953(rng).method_1031((double)var10.method_10148() * 0.5, (double)var10.method_10164() * 0.5, (double)var10.method_10165() * 0.5),
            var10,
            reach
         );
         return new class_3965(var13, var12, var11, false);
      }
   }

   public static int IIIilIIiiIIi(class_2350 d) {
      return switch (d) {
         case field_11033 -> 0;
         case field_11036 -> 1;
         case field_11043 -> 2;
         case field_11035 -> 3;
         case field_11039 -> 4;
         case field_11034 -> 5;
         default -> throw new MatchException(null, null);
      };
   }

   private static double[] IIlilIliiIli(class_243 eye, class_2338 block) {
      return new double[]{
         eye.field_1352 - (double)block.method_10263(), eye.field_1351 - (double)block.method_10264(), eye.field_1350 - (double)block.method_10260()
      };
   }

   public static class_3965 IIlllIlliIll(class_2338 eye, class_243 rng, class_243 reach, double block, Random look) {
      long var9 = 3597015333735440967L;
      var9 ^= ((long)IiilIllliilIll.IlIillIiilIi(IIlilIliiIli(rng, eye), Illillliilli(reach), block) << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) == -1) {
         return null;
      } else {
         class_2350 var7 = Iiilliiliiil((int)(var9 >>> 32));
         class_243 var8 = Illlllllilll(
            class_243.method_24953(eye).method_1031((double)var7.method_10148() * 0.5, (double)var7.method_10164() * 0.5, (double)var7.method_10165() * 0.5),
            var7,
            look
         );
         return new class_3965(var8, var7, eye, false);
      }
   }

   public static class_2350 Iiilliiliiil(int index) {
      return switch (index) {
         case 0 -> class_2350.field_11033;
         case 1 -> class_2350.field_11036;
         case 2 -> class_2350.field_11043;
         case 3 -> class_2350.field_11035;
         case 4 -> class_2350.field_11039;
         case 5 -> class_2350.field_11034;
         default -> class_2350.field_11036;
      };
   }
}
