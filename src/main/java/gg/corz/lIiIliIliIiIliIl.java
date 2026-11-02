package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_10321;
import net.minecraft.class_11586;
import net.minecraft.class_1922;
import net.minecraft.class_2199;
import net.minecraft.class_2237;
import net.minecraft.class_2241;
import net.minecraft.class_2244;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2272;
import net.minecraft.class_2275;
import net.minecraft.class_2276;
import net.minecraft.class_2281;
import net.minecraft.class_2309;
import net.minecraft.class_2312;
import net.minecraft.class_2315;
import net.minecraft.class_2323;
import net.minecraft.class_2325;
import net.minecraft.class_2336;
import net.minecraft.class_2338;
import net.minecraft.class_2341;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2363;
import net.minecraft.class_2377;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_2401;
import net.minecraft.class_2404;
import net.minecraft.class_2426;
import net.minecraft.class_2428;
import net.minecraft.class_243;
import net.minecraft.class_2457;
import net.minecraft.class_2458;
import net.minecraft.class_2459;
import net.minecraft.class_2465;
import net.minecraft.class_2480;
import net.minecraft.class_2508;
import net.minecraft.class_2510;
import net.minecraft.class_2527;
import net.minecraft.class_2533;
import net.minecraft.class_2537;
import net.minecraft.class_2546;
import net.minecraft.class_2551;
import net.minecraft.class_2555;
import net.minecraft.class_265;
import net.minecraft.class_2665;
import net.minecraft.class_2680;
import net.minecraft.class_2738;
import net.minecraft.class_2741;
import net.minecraft.class_2742;
import net.minecraft.class_2768;
import net.minecraft.class_2769;
import net.minecraft.class_2773;
import net.minecraft.class_3708;
import net.minecraft.class_3709;
import net.minecraft.class_3726;
import net.minecraft.class_3749;
import net.minecraft.class_3922;
import net.minecraft.class_3959;
import net.minecraft.class_3962;
import net.minecraft.class_3965;
import net.minecraft.class_4538;
import net.minecraft.class_4776;
import net.minecraft.class_4777;
import net.minecraft.class_4950;
import net.minecraft.class_4951;
import net.minecraft.class_5000;
import net.minecraft.class_5172;
import net.minecraft.class_5542;
import net.minecraft.class_5544;
import net.minecraft.class_5551;
import net.minecraft.class_5554;
import net.minecraft.class_5635;
import net.minecraft.class_5778;
import net.minecraft.class_7713;
import net.minecraft.class_7714;
import net.minecraft.class_7923;
import net.minecraft.class_8810;
import net.minecraft.class_8886;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2352;
import net.minecraft.class_2350.class_2353;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class lIiIliIliIiIliIl {
   private static final class_2350[] lilIIiiIll = new class_2350[]{
      class_2350.field_11033, class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
   };
   public static final double IilIIiiIll = 0.3500000000000001;
   private static final double[][] illIIiiIll = new double[][]{
      null, {0.5, 0.3}, {0.5, 0.7}, {0.3, 0.5}, {0.7, 0.5}, {0.3, 0.3}, {0.3, 0.7}, {0.7, 0.3}, {0.7, 0.7}
   };

   public static boolean illIlIilIl(class_2680 state) {
      return state != null && state.method_26204() instanceof class_5778;
   }

   public static class_3965 liiiIIllIl(
      class_1922 target,
      class_2338 requiredLook,
      class_243 crouchedEye,
      double requiredYaw,
      class_2350 requiredDir,
      class_2350 requiredAxis,
      Float eye,
      class_2351 reachD,
      boolean policy,
      class_3726 w,
      liIliliiiIlili shapeCtx
   ) {
      return iIlIlllllill(target, requiredLook, crouchedEye, requiredYaw, requiredDir, requiredAxis, eye, reachD, policy, w, shapeCtx).IilliliilIIi();
   }

   public static class_2350 IIIIllIIIl(class_2680 want) {
      class_2248 var1 = want.method_26204();
      if (var1 instanceof class_2377) {
         return (class_2350)want.method_11654(class_2741.field_12545);
      } else if (iiIIlIIlIl(want)) {
         class_2350 var2 = IllIllllIl(want);
         int[] var3 = iiIiIIilIIliIIil.IIIllIIliIIl(var2.ordinal(), lIlIliIlIl(var1));
         return var3.length == 1 ? lilIIiiIll[var3[0]] : null;
      } else if ((
            var1 instanceof class_2537 || var1 instanceof class_2399 || var1 instanceof class_2555 || var1 instanceof class_2458 || var1 instanceof class_2546
         )
         && want.method_28498(class_2741.field_12481)) {
         return ((class_2350)want.method_11654(class_2741.field_12481)).method_10153();
      } else if (var1 instanceof class_5542 && want.method_28498(class_2741.field_12525)) {
         return ((class_2350)want.method_11654(class_2741.field_12525)).method_10153();
      } else if (var1 instanceof class_2480 && want.method_28498(class_2741.field_12525)) {
         return ((class_2350)want.method_11654(class_2741.field_12525)).method_10153();
      } else if ((var1 instanceof class_5551 || var1 instanceof class_5554) && want.method_28498(class_2741.field_12525)) {
         return ((class_2350)want.method_11654(class_2741.field_12525)).method_10153();
      } else if (var1 instanceof class_2527) {
         return class_2350.field_11033;
      } else if (var1 instanceof class_2244
         && want.method_28498(class_2244.field_9967)
         && want.method_28498(class_2741.field_12481)
         && want.method_11654(class_2244.field_9967) == class_2742.field_12560) {
         return ((class_2350)want.method_11654(class_2741.field_12481)).method_10153();
      } else if (var1 instanceof class_2551 && want.method_28498(class_2741.field_12481)) {
         return lilIIiiIll[illIiIIlIilIiIIl.IliIlllilIi(illIlIIiIilIlIIi.illIilliil, ((class_2350)want.method_11654(class_2741.field_12481)).ordinal())];
      } else if (var1 instanceof class_2508) {
         return lilIIiiIll[illIiIIlIilIiIIl.IliIlllilIi(illIlIIiIilIlIIi.lllIilliil, class_2350.field_11043.ordinal())];
      } else {
         return var1 instanceof class_7713 ? lilIIiiIll[illIiIIlIilIiIIl.IliIlllilIi(illIlIIiIilIlIIi.IilIilliil, class_2350.field_11043.ordinal())] : null;
      }
   }

   private lIiIliIliIiIliIl() {
   }

   public static class_243 IIIilIIiiIIi(class_1922 v, class_2680 side, class_2338 u, class_2350 st, double pos, double w) {
      class_265 var8 = IiIlliIliiIl(v, side, u);
      if (var8.method_1110()) {
         return null;
      } else {
         class_238 var9 = var8.method_1107();
         double var10 = (double)u.method_10263() + var9.field_1323;
         double var12 = (double)u.method_10263() + var9.field_1320;
         double var14 = (double)u.method_10264() + var9.field_1322;
         double var16 = (double)u.method_10264() + var9.field_1325;
         double var18 = (double)u.method_10260() + var9.field_1321;
         double var20 = (double)u.method_10260() + var9.field_1324;

         return switch (st) {
            case field_11036 -> new class_243(IlIillIiilIi(var10, var12, pos), var16, IlIillIiilIi(var18, var20, w));
            case field_11033 -> new class_243(IlIillIiilIi(var10, var12, pos), var14, IlIillIiilIi(var18, var20, w));
            case field_11043 -> new class_243(IlIillIiilIi(var10, var12, pos), IlIillIiilIi(var14, var16, w), var18);
            case field_11035 -> new class_243(IlIillIiilIi(var10, var12, pos), IlIillIiilIi(var14, var16, w), var20);
            case field_11039 -> new class_243(var10, IlIillIiilIi(var14, var16, pos), IlIillIiilIi(var18, var20, w));
            case field_11034 -> new class_243(var12, IlIillIiilIi(var14, var16, pos), IlIillIiilIi(var18, var20, w));
            default -> throw new MatchException(null, null);
         };
      }
   }

   public static liIIilliiIIill IiiIlliiIl(class_1922 target, class_2338 w, class_2680 want) {
      return new liIIilliiIIill(IIiIllIiIl(target, w, want), iIIIlIlIIl(want), llIIlilIIl(want), IiIIlliIIl(want), iiIIlIIlIl(want));
   }

   private static double Ililllililil(class_265 a, class_2351 s, class_2350 side) {
      if (side.method_10166() == s) {
         return side.method_10171() == class_2352.field_11056 ? a.method_1105(s) : a.method_1091(s);
      } else {
         return (a.method_1091(s) + a.method_1105(s)) / 2.0;
      }
   }

   public static class_2350 lilIliilIl(class_2680 want) {
      class_2248 var1 = want.method_26204();
      if (var1 instanceof class_10321 || var1 instanceof class_4776 || var1 instanceof class_4951) {
         return class_2350.field_11036;
      } else if (var1 instanceof class_4777 || var1 instanceof class_4950) {
         return class_2350.field_11033;
      } else if (var1 instanceof class_5544) {
         return class_2350.field_11033;
      } else if (var1 instanceof class_3749 && want.method_28498(class_2741.field_16561)) {
         return want.method_11654(class_2741.field_16561) ? class_2350.field_11036 : class_2350.field_11033;
      } else {
         return null;
      }
   }

   public static boolean IiIiliIiiiIi(class_1922 w, class_2338 p) {
      return w != null && w.method_8320(p).method_26204() instanceof class_2377;
   }

   public static class_2350 Iliilliiilii(int i) {
      return lilIIiiIll[i];
   }

   public static List<class_243> IlIlllIlilIl(class_1922 w, class_2680 st, class_2338 nb) {
      long var11 = -6210744464889100935L;
      ArrayList var3 = new ArrayList();
      double[][] var4 = new double[][]{{0.5, 0.5}, {0.5, 0.3}, {0.5, 0.7}, {0.3, 0.5}, {0.7, 0.5}};

      for (class_238 var6 : st.method_26218(w, nb).method_1090()) {
         double[][] var7 = var4;
         var11 ^= ((long)var4.length << 32 ^ var11) & -1L << 32;

         for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            double[] var10 = var7[(int)var11];
            var3.add(
               new class_243(
                  (double)nb.method_10263() + IlIillIiilIi(var6.field_1323, var6.field_1320, var10[0]),
                  (double)nb.method_10264() + var6.field_1325,
                  (double)nb.method_10260() + IlIillIiilIi(var6.field_1321, var6.field_1324, var10[1])
               )
            );
         }
      }

      return var3;
   }

   public static class_265 IiIlliIliiIl(class_1922 pos, class_2680 w, class_2338 st) {
      class_265 var3 = w.method_26220(pos, st);
      return var3.method_1110() && iliIiiliiiii(w) ? w.method_26218(pos, st) : var3;
   }

   public static class_2351 IiIIlliIIl(class_2680 want) {
      if (want != null && want.method_26204() instanceof class_2241 var1) {
         class_2769 var4 = var1.method_9474();
         if (!want.method_28498(var4)) {
            return null;
         } else {
            String var3 = illIiIIlIilIiIIl.IIIilIIiiIIi(((class_2768)want.method_11654(var4)).method_15434());
            return var3 == null
               ? null
               : (IlIllllIll<"IlIllllIll","5peXZ28cUWwt1NYKFXKHiEBZbqJiBpP9Ai42lIA=">().equals(var3) ? class_2351.field_11048 : class_2351.field_11051);
         }
      } else {
         return null;
      }
   }

   public static class_2350[] Iiiiliiiiiii() {
      return (class_2350[])lilIIiiIll.clone();
   }

   public static double[][] IliIlllilIi() {
      return (double[][])illIIiiIll.clone();
   }

   private static boolean lliIliliIl(class_1922 w, class_2338 p) {
      class_2680 var2 = w.method_8320(p);
      return !var2.method_26215() && !var2.method_45474() && !var2.method_26220(w, p).method_1110();
   }

   static class_2350 iIiIlIliIl(class_1922 w, class_2338 pos, class_2680 want) {
      class_2248 var3 = want.method_26204();
      if ((var3 instanceof class_2465 || var3 instanceof class_5172) && want.method_28498(class_2741.field_12496)) {
         class_2351 var4 = (class_2351)want.method_11654(class_2741.field_12496);
         class_2350 var5 = class_2350.method_10169(var4, class_2352.field_11060);
         if (lliIliliIl(w, pos.method_10093(var5))) {
            return var5;
         } else {
            return lliIliliIl(w, pos.method_10093(var5.method_10153())) ? var5.method_10153() : var5;
         }
      } else {
         return null;
      }
   }

   public static class_243 Iiilliiliiil(class_1922 side, class_2680 w, class_2338 st, class_2350 nb) {
      class_265 var4 = IiIlliIliiIl(side, w, st);
      if (var4.method_1110()) {
         return null;
      } else {
         double var5 = Ililllililil(var4, class_2351.field_11048, nb);
         double var7 = Ililllililil(var4, class_2351.field_11052, nb);
         double var9 = Ililllililil(var4, class_2351.field_11051, nb);
         if (nb.method_10166().method_10179() && w.method_26204() instanceof class_2377) {
            var7 = 0.75;
         }

         return new class_243((double)st.method_10263() + var5, (double)st.method_10264() + var7, (double)st.method_10260() + var9);
      }
   }

   private static double IlIillIiilIi(double a, double t, double b) {
      return a + (t - a) * b;
   }

   public static class_3965 Illlllllilll(class_1922 policy, class_3726 eye, class_243 reach, float yaw, float w, double ctx, liIliliiiIlili pitch) {
      if (pitch != null) {
         pitch.iliIiiliiiii();
      }

      double var8 = Math.toRadians((double)yaw);
      double var10 = Math.toRadians((double)w);
      class_243 var12 = new class_243(-Math.sin(var8) * Math.cos(var10), -Math.sin(var10), Math.cos(var8) * Math.cos(var10));
      class_243 var13 = reach.method_1019(var12.method_1021(ctx));
      return policy.method_17742(new class_3959(reach, var13, class_3960.field_17558, class_242.field_1348, eye == null ? class_3726.method_16194() : eye));
   }

   public static boolean iiIIlIIlIl(class_2680 want) {
      long var3 = -2888073069704761385L;
      class_2248 var1 = want.method_26204();
      if (var1 instanceof class_8886) {
         return want.method_28498(class_2741.field_23333);
      } else {
         var3 ^= (
               (long)(!(var1 instanceof class_2426) && !(var1 instanceof class_2315) && !(var1 instanceof class_2665) && !(var1 instanceof class_3708) ? 0 : 1)
                     << 32
                  ^ var3
            )
            & -1L << 32;
         return (int)(var3 >>> 32) != 0 && want.method_28498(class_2741.field_12525);
      }
   }

   public static boolean IIIllIIliIIl(class_2680 st) {
      long var4 = 4823348780636049734L;
      if (st != null && st.method_26204() instanceof class_2457) {
         var4 ^= (0L ^ var4) & -1L << 32;

         for (class_2350 var3 : class_2353.field_11062) {
            if (st.method_11654((class_2769)class_2457.field_11435.get(var3)) != class_2773.field_12687) {
               var4 += 4294967296L;
            }
         }

         return (int)(var4 >>> 32) > 0 && (int)(var4 >>> 32) < 4;
      } else {
         return false;
      }
   }

   public static class_2350 IIiIllIiIl(class_1922 want, class_2338 w, class_2680 pos) {
      long var11 = -5992624275855583757L;
      class_2350 var3 = lilIliilIl(pos);
      if (var3 != null && want instanceof class_4538 var4 && !pos.method_26184(var4, w)) {
         return var3;
      }

      class_2350 var13 = iIiIlIliIl(want, w, pos);
      if (var13 != null) {
         return var13;
      } else if (pos.method_26204() instanceof class_2459 && !(pos.method_26204() instanceof class_2458)) {
         return class_2350.field_11033;
      } else if (!illIlIilIl(pos)) {
         return IIIIllIIIl(pos);
      } else {
         class_2680 var5 = want.method_8320(w);
         class_2350 var6 = null;
         class_2350[] var7 = class_2350.values();
         var11 ^= ((long)var7.length << 32 ^ var11) & -1L << 32;

         for (long var15 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            class_2350 var10 = var7[(int)var15];
            if (class_5778.method_33366(pos, var10) && (var5.method_26204() != pos.method_26204() || !class_5778.method_33366(var5, var10))) {
               if (class_5778.method_65162(want, w, var10)) {
                  return var10;
               }

               if (var6 == null) {
                  var6 = var10;
               }
            }
         }

         return var6;
      }
   }

   public static ilIiillIiIiill lIlIliIlIl(class_2248 b) {
      if (b instanceof class_2426) {
         return ilIiillIiIiill.IIiiiIlIilIiiiIlIi;
      } else if (b instanceof class_2325) {
         return ilIiillIiIiill.lliiiIlIiiliiiIlIi;
      } else if (b instanceof class_2315) {
         return ilIiillIiIiill.iIiiiIlIiIliiiIlIi;
      } else if (b instanceof class_2665) {
         return ilIiillIiIiill.IiiiiIlIiliiiiIlIi;
      } else if (b instanceof class_3708) {
         return ilIiillIiIiill.lIIIIllIiiIIIIllIi;
      } else {
         return b instanceof class_8886 ? ilIiillIiIiill.IlIIIllIillIIIllIi : null;
      }
   }

   public static List<class_243> Iilllilliill(class_1922 nb, class_2680 side, class_2338 st, class_2350 w, class_243 eye) {
      long var11 = -5518839875975640339L;
      ArrayList var5 = new ArrayList(illIIiiIll.length + 9);
      if (w == class_2350.field_11036 && side.method_26204() instanceof class_2377) {
         var5.addAll(IIillIiliIil(st, eye));
      }

      double[][] var6 = illIIiiIll;
      var11 ^= ((long)var6.length << 32 ^ var11) & -1L << 32;

      for (long var14 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         double[] var9 = var6[(int)var14];
         class_243 var10 = var9 == null ? Iiilliiliiil(nb, side, st, w) : IIIilIIiiIIi(nb, side, st, w, var9[0], var9[1]);
         if (var10 != null) {
            var5.add(var10);
         }
      }

      return var5;
   }

   public static class_2350 IllIllllIl(class_2680 want) {
      return want.method_26204() instanceof class_8886 && want.method_28498(class_2741.field_23333)
         ? ((class_5000)want.method_11654(class_2741.field_23333)).method_26426()
         : (class_2350)want.method_11654(class_2741.field_12525);
   }

   private static ilIiIllIiIiIll IilliliilIIi(ilIiIllIiIiIll a, ilIiIllIiIiIll b) {
      return lIiiIiIlilli(b) > lIiiIiIlilli(a) ? b : a;
   }

   public static boolean IIlilIliiIli(class_1922 hit, class_3965 w) {
      if (w == null || w.method_17783() != class_240.field_1332 || w.method_17780() != class_2350.field_11036) {
         return true;
      } else if (!IiIiliIiiiIi(hit, w.method_17777())) {
         return true;
      } else {
         double var2 = w.method_17784().field_1351 - (double)w.method_17777().method_10264();
         return var2 >= 0.999 || var2 <= 0.6885;
      }
   }

   public static boolean Iilililiiili(class_2680 state) {
      return IlllIIIillllIIIi.liiiIIllIl(Illillliilli(state));
   }

   public static llIlllIiilIlllIi iIlIlllllill(
      class_1922 requiredLook,
      class_2338 target,
      class_243 policy,
      double requiredYaw,
      class_2350 requiredDir,
      class_2350 requiredAxis,
      Float crouchedEye,
      class_2351 reachD,
      boolean eye,
      class_3726 w,
      liIliliiiIlili shapeCtx
   ) {
      long var36 = 3196166095459161704L;
      long var38 = 3003954346087764463L;
      long var40 = 8644344191259342338L;
      liIliliiiIlili var12 = shapeCtx == null ? liIliliiiIlili.IllIIIlIIl : shapeCtx;
      class_3726 var13 = w == null ? class_3726.method_16194() : w;
      double var14 = requiredYaw * requiredYaw;
      class_3965 var16 = null;
      class_3965 var17 = null;
      ilIiIllIiIiIll var18 = ilIiIllIiIiIll.lliilIlililiilIlil;
      String var19 = null;
      class_2350[] var20 = class_2350.values();
      var36 ^= ((long)var20.length << 32 ^ var36) & -1L << 32;

      for (long var45 = var36 ^ (0L ^ var36) & -1L >>> 32; (int)var45 < (int)(var45 >>> 32); var45 ^= (var45 ^ var45 + (long)1) & -1L >>> 32) {
         class_2350 var23 = var20[(int)var45];
         if (requiredDir == null || var23 == requiredDir) {
            if (var12.IliIlllilIi(target, var23.method_10153())) {
               var19 = IlIllllIll<"IlIllllIll","L0ZmOgv1xAmumyjnjdkb3mrbvMFOGcyL7ruT54fK+CUw2WxEooa7SsZPLJE=">();
            } else {
               class_2338 var24 = target.method_10093(var23);
               class_2680 var25 = requiredLook.method_8320(var24);
               if (!var25.method_26215() && !var25.method_45474()) {
                  var38 ^= ((long)(requiredDir == class_2350.field_11033 && IIIllIIliIIl(var25) ? 1 : 0) << 32 ^ var38) & -1L << 32;
                  if (!var25.method_26220(requiredLook, var24).method_1110() || iliIiiliiiii(var25) || (int)(var38 >>> 32) != 0) {
                     class_2350 var27 = var23.method_10153();
                     var18 = IilliliilIIi(var18, ilIiIllIiIiIll.IiiilIlilliiilIlil);
                     var38 ^= ((long)Iilililiiili(var25) ^ var38) & -1L >>> 32;
                     class_243 var29 = (int)var38 != 0 && !eye ? policy.method_1031(0.0, -0.3500000000000001, 0.0) : policy;
                     var40 ^= ((long)var12.iIlIlllllill(target, var24) << 32 ^ var40) & -1L << 32;
                     class_243 var31 = null;

                     for (class_243 var33 : (int)(var38 >>> 32) != 0
                        ? IlIlllIlilIl(requiredLook, var25, var24)
                        : Iilllilliill(requiredLook, var25, var24, var27, var29)) {
                        if (var33 != null) {
                           if (var29.method_1025(var33) > var14) {
                              var18 = IilliliilIIi(var18, ilIiIllIiIiIll.IIiilIlillIiilIlil);
                           } else {
                              float[] var34 = ilIiiIiIii.Ililllililil(var29, var33);
                              if (((int)(var40 >>> 32) != 0 || requiredAxis == null || class_2350.method_10150((double)var34[0]) == requiredAxis)
                                 && (reachD == null || class_2350.method_10150((double)var34[0]).method_10166() == reachD)
                                 && ((int)(var40 >>> 32) != 0 || IIiilIiiiIii(var34[0], crouchedEye))) {
                                 var18 = IilliliilIIi(var18, ilIiIllIiIiIll.iIiilIlilIliilIlil);
                                 class_3965 var35 = IIlllIlliIll(
                                    requiredLook, var13, var29, var34[0], var34[1], requiredYaw, var12, iliIiiliiiii(var25) || (int)(var38 >>> 32) != 0
                                 );
                                 if (var35.method_17783() == class_240.field_1332
                                    && var35.method_17777().method_10093(var35.method_17780()).equals(target)
                                    && (requiredDir == null || var35.method_17777().equals(var24) && var35.method_17780() == var27)
                                    && IIlilIliiIli(requiredLook, var35)) {
                                    var31 = var33;
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     if (var31 != null) {
                        class_3965 var43 = new class_3965(var31, var27, var24, false);
                        if ((int)var38 == 0) {
                           if (!var12.lIiiIiIlilli(target)) {
                              return llIlllIiilIlllIi.liiiIIllIl(var43);
                           }

                           var18 = IilliliilIIi(var18, ilIiIllIiIiIll.ilIIiIlilIiIIiIlil);
                           var19 = IlIllllIll<"IlIllllIll","tPFEvk63llPGErHXlVZ5Q3ctrjUgj1TQ+La5r33qcmhhDTOmTeP7/gr22ZlJA1fysvnrfJt3bhTXsg==">();
                        } else if (var12.liiiIIllIl()) {
                           var18 = IilliliilIIi(var18, ilIiIllIiIiIll.ilIIiIlilIiIIiIlil);
                           var19 = IlIllllIll<"IlIllllIll","RuWCaA3RvdBx3HYRW7rcszOPiJaFkj9hFL6JSgXsgBKmUF+f/UQm4eixxm+g9FA0ovhP6Y8=">();
                        } else if (var12.IilliliilIIi(target)) {
                           if (var17 == null && var27.method_10166().method_10179() && var12.iIlIlllllill(target, var24)) {
                              var17 = var43;
                           }

                           var18 = IilliliilIIi(var18, ilIiIllIiIiIll.ilIIiIlilIiIIiIlil);
                           var19 = IlIllllIll<"IlIllllIll","IQQDrKytaW9Q+l5QlLL6AsGgXtxNklw7cPxSd1qPlI2vTjNbojgD1k8Fs0Id81Znon9gRw==">();
                        } else if (var16 == null) {
                           var16 = var43;
                        }
                     }
                  }
               }
            }
         }
      }

      class_3965 var42 = var16 != null ? var16 : var17;
      if (var42 != null) {
         return llIlllIiilIlllIi.liiiIIllIl(var42);
      } else {
         if (var18 == ilIiIllIiIiIll.IiiilIlilliiilIlil && requiredDir == null && requiredAxis == null && crouchedEye == null && reachD == null) {
            var18 = ilIiIllIiIiIll.iIiilIlilIliilIlil;
         }

         return llIlllIiilIlllIi.iIlIlllllill(var18, var19);
      }
   }

   private static int lIiiIiIlilli(ilIiIllIiIiIll r) {
      return switch (r) {
         case iiiilIlilIIIIiIlil -> 2;
         case lililIliliililIlil -> 3;
         case iIiilIlilIliilIlil -> 0;
         case IlIIiIlilllIIiIlil -> 1;
         default -> 4;
      };
   }

   public static Float llIIlilIIl(class_2680 want) {
      return (want.method_26204() instanceof class_2508 || want.method_26204() instanceof class_7713) && want.method_28498(class_2741.field_12532)
         ? illIiIIlIilIiIIl.iIlIlllllill((Integer)want.method_11654(class_2741.field_12532))
         : null;
   }

   public static class_3965 IIlllIlliIll(
      class_1922 outline, class_3726 eye, class_243 policy, float yaw, float w, double pitch, liIliliiiIlili reach, boolean ctx
   ) {
      if (reach != null) {
         reach.iliIiiliiiii();
      }

      double var9 = Math.toRadians((double)yaw);
      double var11 = Math.toRadians((double)w);
      class_243 var13 = new class_243(-Math.sin(var9) * Math.cos(var11), -Math.sin(var11), Math.cos(var9) * Math.cos(var11));
      class_243 var14 = policy.method_1019(var13.method_1021(pitch));
      return outline.method_17742(
         new class_3959(
            policy, var14, ctx ? class_3960.field_17559 : class_3960.field_17558, class_242.field_1348, eye == null ? class_3726.method_16194() : eye
         )
      );
   }

   public static boolean iiiIlIIIll(class_2680 want) {
      return want != null && want.method_26204() instanceof class_2404 && want.method_26227().method_15771();
   }

   public static boolean IIiilIiiiIii(float requiredYaw, Float yaw) {
      long var3 = 3417755376680372688L;
      if (yaw == null) {
         return true;
      } else {
         var3 ^= ((long)illIiIIlIilIiIIl.IilliliilIIi(yaw) << 32 ^ var3) & -1L << 32;
         return illIiIIlIilIiIIl.IilliliilIIi(requiredYaw) == (int)(var3 >>> 32);
      }
   }

   public static class_2350 iIIIlIlIIl(class_2680 want) {
      long var4 = 2061698076654048500L;
      class_2248 var1 = want.method_26204();
      if (var1 instanceof class_2341
         && want.method_28498(class_2741.field_12555)
         && want.method_28498(class_2741.field_12481)
         && want.method_11654(class_2741.field_12555) != class_2738.field_12471) {
         var4 ^= ((long)illIiIIlIilIiIIl.liiiIIllIl(((class_2350)want.method_11654(class_2741.field_12481)).ordinal(), false) << 32 ^ var4) & -1L << 32;
         return (int)(var4 >>> 32) < 0 ? null : lilIIiiIll[(int)(var4 >>> 32)];
      } else if (var1 instanceof class_2349 && want.method_28498(class_2741.field_12481)) {
         var4 ^= ((long)illIiIIlIilIiIIl.liiiIIllIl(((class_2350)want.method_11654(class_2741.field_12481)).ordinal(), false) << 32 ^ var4) & -1L << 32;
         return (int)(var4 >>> 32) < 0 ? null : lilIIiiIll[(int)(var4 >>> 32)];
      } else if (var1 instanceof class_2510 && want.method_28498(class_2741.field_12481)) {
         var4 ^= ((long)illIiIIlIilIiIIl.liiiIIllIl(((class_2350)want.method_11654(class_2741.field_12481)).ordinal(), false) << 32 ^ var4) & -1L << 32;
         return (int)(var4 >>> 32) < 0 ? null : lilIIiiIll[(int)(var4 >>> 32)];
      } else if (var1 instanceof class_2199 && want.method_28498(class_2741.field_12481)) {
         return ((class_2350)want.method_11654(class_2741.field_12481)).method_10160();
      } else if (var1 instanceof class_2244
         && want.method_28498(class_2244.field_9967)
         && want.method_28498(class_2741.field_12481)
         && want.method_11654(class_2244.field_9967) == class_2742.field_12557) {
         var4 ^= ((long)illIiIIlIilIiIIl.liiiIIllIl(((class_2350)want.method_11654(class_2741.field_12481)).ordinal(), false) << 32 ^ var4) & -1L << 32;
         return (int)(var4 >>> 32) < 0 ? null : lilIIiiIll[(int)(var4 >>> 32)];
      } else if (var1 instanceof class_3922 && want.method_28498(class_2741.field_12481)) {
         return (class_2350)want.method_11654(class_2741.field_12481);
      } else {
         var4 ^= (
               (long)(
                        !(var1 instanceof class_2281)
                              && !(var1 instanceof class_2363)
                              && !(var1 instanceof class_2336)
                              && !(var1 instanceof class_2312)
                              && !(var1 instanceof class_11586)
                              && !(var1 instanceof class_7714)
                              && !(var1 instanceof class_2276)
                           ? 0
                           : 1
                     )
                     << 32
                  ^ var4
            )
            & -1L << 32;
         if ((int)(var4 >>> 32) != 0 && want.method_28498(class_2741.field_12481)) {
            var4 ^= ((long)illIiIIlIilIiIIl.liiiIIllIl(((class_2350)want.method_11654(class_2741.field_12481)).ordinal(), true) ^ var4) & -1L >>> 32;
            return (int)var4 < 0 ? null : lilIIiiIll[(int)var4];
         } else {
            return null;
         }
      }
   }

   public static boolean iliIiiliiiii(class_2680 st) {
      return st != null
         && (
            st.method_26204() instanceof class_8810
               || st.method_26204() instanceof class_5635
               || st.method_26204() instanceof class_2537
               || st.method_26204() instanceof class_10321
               || st.method_26204() instanceof class_4777
               || st.method_26204() instanceof class_4950
               || st.method_26204() instanceof class_4776
               || st.method_26204() instanceof class_4951
               || st.method_26204() instanceof class_2349 && (Boolean)st.method_11654(class_2741.field_12537)
         );
   }

   public static IiIlllliIlll Illillliilli(class_2680 state) {
      long var4 = -7085073815861046964L;
      class_2248 var1 = state.method_26204();
      var4 ^= (
            (long)(
                     !(var1 instanceof class_2312)
                           && !(var1 instanceof class_2323)
                           && !(var1 instanceof class_2533)
                           && !(var1 instanceof class_2349)
                           && !(var1 instanceof class_2269)
                           && !(var1 instanceof class_2401)
                           && !(var1 instanceof class_2428)
                           && !(var1 instanceof class_2309)
                           && !(var1 instanceof class_2272)
                           && !(var1 instanceof class_3709)
                           && !(var1 instanceof class_2244)
                           && !(var1 instanceof class_3962)
                           && !(var1 instanceof class_2275)
                           && !(var1 instanceof class_3922)
                        ? 0
                        : 1
                  )
                  << 32
               ^ var4
         )
         & -1L << 32;
      String var3 = class_7923.field_41175.method_10221(var1).toString();
      return IlllIIIillllIIIi.IliIlllilIi(var3, var1 instanceof class_2237, (boolean)((int)(var4 >>> 32)));
   }

   public static List<class_243> IIillIiliIil(class_2338 nb, class_243 eye) {
      long var20 = 2265393055398336628L;
      double var2 = 0.4375;
      double var4 = (double)nb.method_10264() + 1.0;
      double var6 = (double)nb.method_10263() + 0.5;
      double var8 = (double)nb.method_10260() + 0.5;
      ArrayList var10 = new ArrayList(9);
      double var11 = eye.field_1352 - var6;
      double var13 = eye.field_1350 - var8;
      double var15 = Math.max(Math.abs(var11), Math.abs(var13));
      if (var15 > 1.0E-6) {
         var10.add(new class_243(var6 + var11 / var15 * 0.4375, var4, var8 + var13 / var15 * 0.4375));
      }

      ArrayList var17 = new ArrayList(8);
      var20 ^= (-4294967296L ^ var20) & -1L << 32;

      while ((int)(var20 >>> 32) <= 1) {
         for (var20 ^= ~var20 & -1L >>> 32; (int)var20 <= 1; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            if ((int)(var20 >>> 32) != 0 || (int)var20 != 0) {
               var17.add(new class_243(var6 + (double)((int)(var20 >>> 32)) * 0.4375, var4, var8 + (double)((int)var20) * 0.4375));
            }
         }

         var20 += 4294967296L;
      }

      var17.sort(Comparator.comparingDouble(p -> p.method_1025(eye)));
      var10.addAll(var17);
      return var10;
   }
}
