package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.Predicate;
import net.minecraft.class_1922;
import net.minecraft.class_2211;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2266;
import net.minecraft.class_2275;
import net.minecraft.class_2281;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2354;
import net.minecraft.class_2377;
import net.minecraft.class_238;
import net.minecraft.class_2399;
import net.minecraft.class_2413;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2544;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2760;
import net.minecraft.class_310;
import net.minecraft.class_3610;
import net.minecraft.class_3830;
import net.minecraft.class_3922;
import net.minecraft.class_3959;
import net.minecraft.class_3962;
import net.minecraft.class_3965;
import net.minecraft.class_5635;
import net.minecraft.class_638;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2353;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class IIIlIIIilIIlIIIi {
   public static long lilIIIliil;
   public static long lIiIIIliil;
   public static long iilIIIliil;
   private static final double lllIIIliil = 1.5;
   private static final int illIIIliil = 2;
   static final int IllIIIliil = 24000;
   public static final int[] IliIIIliil = new int[]{-2, -1, 0, 1, 2};
   private static final HashSet<Long> iIiIIIliil = new HashSet<>();
   private static volatile long[] iliIIIliil;
   private static volatile long IiiIIIliil = Long.MIN_VALUE;
   private static volatile iillliiIIillii IilIIIliil = new iillliiIIillii(0, 10000, false, false, 0, 0);
   private static final class_310 lIlIIIliil = class_310.method_1551();
   private static volatile lilIiiliilIiil IIiIIIliil;
   public static final int[] lliIIIliil = new int[]{-3, -2, -1, 0, 1, 2};
   static final int iIlIIIliil = 10000;

   static boolean iliIiiliiiii(class_238 leaf, class_2350 d) {
      return switch (d) {
         case field_11043 -> leaf.field_1321 <= 0.01 && leaf.field_1324 < 0.5;
         case field_11035 -> leaf.field_1324 >= 0.99 && leaf.field_1321 > 0.5;
         case field_11039 -> leaf.field_1323 <= 0.01 && leaf.field_1320 < 0.5;
         case field_11034 -> leaf.field_1320 >= 0.99 && leaf.field_1323 > 0.5;
         default -> false;
      };
   }

   private static double iilllIIill(class_2338 a, class_2338 b) {
      double var2 = (double)Math.max(Math.abs(a.method_10263() - b.method_10263()), Math.abs(a.method_10260() - b.method_10260()));
      return var2 + 0.4 * (double)Math.abs(a.method_10264() - b.method_10264());
   }

   public static boolean IIillIiliIil(class_1922 feet, class_2338 w) {
      if (feet != null && IlllllIillllllIi.IilliliilIIi((double)feet.method_8320(w.method_10074()).method_26204().method_9499())) {
         for (class_2350 var3 : class_2353.field_11062) {
            class_2680 var4 = feet.method_8320(w.method_10093(var3));
            if (!var4.method_26227().method_15769() && var4.method_26220(feet, w.method_10093(var3)).method_1110()) {
               return true;
            }

            if (Ililllililil(feet, w.method_10093(var3))) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static lilIliilIl IiIiliIiiiIi(class_1922 ownedDirt, List<class_2338> blockedNodes, Set<Long> hint, Set<Long> route, liiiiIlliiiiiIll w) {
      long var8 = -8519077745692391943L;
      if (ownedDirt != null && blockedNodes != null && !blockedNodes.isEmpty()) {
         ArrayList var5 = new ArrayList();

         for (long var10 = var8 ^ (4294967296L ^ var8) & -1L << 32; (int)(var10 >>> 32) < blockedNodes.size(); var10 += 4294967296L) {
            lIiIIiiIiIIi var7 = IIiilIiiiIii(
               ownedDirt, (class_2338)blockedNodes.get((int)(var10 >>> 32) - 1), (class_2338)blockedNodes.get((int)(var10 >>> 32)), hint, route, w
            );
            var5.add(var7);
            if (var7.lIiiIiIlilli() != IilIlIlililIlIli.lliiiiIlIi || !IiIlillliIlill.IIIllIIliIIl(var7.iIlIlllllill())) {
               return new lilIliilIl(false, List.copyOf(var5), (int)(var10 >>> 32), var7.lIiiIiIlilli());
            }
         }

         return new lilIliilIl(true, List.copyOf(var5), -1, IilIlIlililIlIli.lliiiiIlIi);
      } else {
         return new lilIliilIl(false, List.of(), 0, IilIlIlililIlIli.iIIIIIllIi);
      }
   }

   private static boolean iIlllIllll(class_1922 feetCell, class_2338 w) {
      long var3 = -5430919444977815166L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) <= 2; var5 += 4294967296L) {
         if (IIlllIlliIll(feetCell, w.method_10087((int)(var5 >>> 32)))) {
            return true;
         }
      }

      return false;
   }

   public static boolean IilliliilIIi(class_2680 s) {
      class_2248 var1 = s.method_26204();
      if (var1 instanceof class_2349 && s.method_28498(class_2741.field_12537) && (Boolean)s.method_11654(class_2741.field_12537)) {
         return false;
      } else {
         return var1 instanceof class_2533
               && s.method_28498(class_2741.field_12537)
               && !s.method_11654(class_2741.field_12537)
               && s.method_28498(class_2741.field_12518)
               && s.method_11654(class_2741.field_12518) == class_2760.field_12617
            ? false
            : var1 instanceof class_2377
               || var1 instanceof class_2354
               || var1 instanceof class_2544
               || var1 instanceof class_2349
               || var1 instanceof class_2533
               || var1 instanceof class_2275
               || var1 instanceof class_3962;
      }
   }

   public static List<class_2338> IlIllllIll(class_2338 goal, class_2338 start) {
      return ilIllIiIll(goal, start, Integer.MAX_VALUE);
   }

   private static List<class_2338> lIilliIill(Map<Long, Long> cameFrom, long cur, class_2338 start) {
      ArrayList var4 = new ArrayList();
      long var5 = cur;

      while (var5 != start.method_10063()) {
         var4.add(class_2338.method_10092(var5));
         Long var7 = (Long)cameFrom.get(var5);
         if (var7 == null) {
            break;
         }

         var5 = var7;
      }

      var4.add(start);
      Collections.reverse(var4);
      return var4;
   }

   public static List<class_2338> IllIllllIl(class_2338 goals, Collection<class_2338> start) {
      long var13 = 4597754571060566773L;
      long var15 = -5792235153100623632L;
      class_638 var2 = lIlIIIliil.field_1687;
      if (var2 != null && !start.isEmpty()) {
         HashSet var3 = new HashSet();
         var13 ^= (42949672960000L ^ var13) & -1L << 32;
         var13 ^= (2147483647L ^ var13) & -1L >>> 32;

         for (class_2338 var7 : start) {
            var3.add(var7.method_10063());
            var13 ^= ((long)Math.max((int)(var13 >>> 32), liiiIIllIl(goals, var7)) << 32 ^ var13) & -1L << 32;
            var15 ^= (
                  (long)(
                           Math.max(Math.abs(goals.method_10263() - var7.method_10263()), Math.abs(goals.method_10260() - var7.method_10260()))
                              + Math.abs(goals.method_10264() - var7.method_10264()) * 2
                        )
                        << 32
                     ^ var15
               )
               & -1L << 32;
            var13 ^= ((long)Math.min((int)var13, (int)(var15 >>> 32)) ^ var13) & -1L >>> 32;
         }

         var15 ^= ((long)((int)var13) ^ var15) & -1L >>> 32;
         ArrayList var17 = new ArrayList(start);
         iIiIIIliil.clear();
         liiiiiiiii var8 = ilililIiIiililIi.IliIlllilIi(goals.method_10063(), var3, (int)(var13 >>> 32), 1.5, key -> {
            long var6 = 9138064266773647889L;
            List var3x = IIllllIlll(var2, class_2338.method_10092(key));
            long[] var4 = new long[var3x.size()];

            for (long var8x = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8x >>> 32) < var4.length; var8x += 4294967296L) {
               var4[(int)(var8x >>> 32)] = ((class_2338)var3x.get((int)(var8x >>> 32))).method_10063();
            }

            return var4;
         }, (b, a) -> 1.0 + 0.4 * (double)Math.abs(class_2338.method_10071(a) - class_2338.method_10071(b)), goalList -> {
            class_2338 var3x = class_2338.method_10092(goalList);
            double var4 = Double.MAX_VALUE;

            for (class_2338 var7x : var17) {
               var4 = Math.min(var4, iilllIIill(var3x, var7x));
            }

            return var4;
         });
         IilIIIliil = new iillliiIIillii(var8.IilliliilIIi(), (int)(var13 >>> 32), var8.IliIlllilIi(), var8.lIiiIiIlilli(), var8.iliIiiliiiii(), (int)var15);
         iliIIIliil = var8.IliIlllilIi() ? null : illIlIilIl(var8.IIIllIIliIIl());
         if (!var8.IliIlllilIi()) {
            return null;
         } else {
            ArrayList var9 = new ArrayList(var8.iIlIlllllill().size());

            for (long var11 : var8.iIlIlllllill()) {
               var9.add(class_2338.method_10092(var11));
            }

            return var9;
         }
      } else {
         return null;
      }
   }

   public static boolean IIIilIIiiIIi(class_2338 feet) {
      class_638 var1 = lIlIIIliil.field_1687;
      return IlIillIiilIi(var1, feet);
   }

   public static lIIlIliiIIlIli Iilililiiili(class_1922 step, lIiIIiiIiIIi w) {
      long var17 = -1364654592373210116L;
      long var19 = 9220178396212394237L;
      class_2338 var2 = w.liiiIIllIl();
      class_2338 var3 = w.IliIlllilIi();
      class_2680 var4 = step.method_8320(var2.method_10074());
      class_265 var5 = var4.method_26220(step, var2.method_10074());
      double var6 = !iIlIlllllill(var4) && (!IilliliilIIi(var4) || var4.method_26204() instanceof class_2377) && !var5.method_1110()
         ? var5.method_1105(class_2351.field_11052)
         : 0.0;
      class_2680 var8 = step.method_8320(var2);
      class_265 var9 = var8.method_26220(step, var2);
      double var10 = var9.method_1110() ? 0.0 : var9.method_1105(class_2351.field_11052);
      var17 ^= ((long)(!iIlIlllllill(var8) && !IilliliilIIi(var8) && var10 <= 0.26 ? 1 : 0) << 32 ^ var17) & -1L << 32;
      class_2680 var13 = step.method_8320(var2.method_10084());
      var17 ^= ((long)(!iIlIlllllill(var13) && var13.method_26220(step, var2.method_10084()).method_1110() ? 1 : 0) ^ var17) & -1L >>> 32;
      var19 ^= (0L ^ var19) & -1L << 32;
      if (w.iIlIlllllill() == iiiIIiilIIIlIiil.ilIIiillil) {
         class_2338 var16 = var2.method_10069(
            Integer.signum(var2.method_10263() - var3.method_10263()), 0, Integer.signum(var2.method_10260() - var3.method_10260())
         );
         var19 ^= ((long)(!IIlllIlliIll(step, var16) ? 1 : 0) << 32 ^ var19) & -1L << 32;
      }

      lIIlIliiIIlIli var21 = lIIlIliiIIlIli.Iilllilliill(
         w.iIlIlllllill(),
         var3.method_10063(),
         var2.method_10063(),
         var6,
         var10,
         (boolean)((int)(var17 >>> 32)),
         (boolean)((int)var17),
         (boolean)((int)(var19 >>> 32))
      );
      return var21.liiiIIllIl() && w.iIlIlllllill() == iiiIIiilIIIlIiil.ilIIiillil && var4.method_26204() instanceof class_2377
         ? var21.IliIlllilIi(lIliliIlil<"lIliliIlil","5DmHO/pWqkzkLjjm/t+CoiHSjhgdX5qky+IYWZaWa0eFHhDol0w4rPL2">())
         : var21;
   }

   public static void Illillliilli(lilIiiliilIiil veto) {
      IIiIIIliil = veto;
   }

   public static class_2338 IIIIllIIIl(class_2338 target, double feetValid, Predicate<class_2338> reach) {
      long var23 = -3810161928553910051L;
      long var25 = 2908202042754060447L;
      long var27 = -8392025518260300821L;
      class_638 var4 = lIlIIIliil.field_1687;
      if (var4 != null && lIlIIIliil.field_1724 != null) {
         var23 ^= ((long)((int)Math.ceil(feetValid)) << 32 ^ var23) & -1L << 32;
         class_243 var6 = lIlIIIliil.field_1724.method_73189();
         double var7 = Math.max(1.0, feetValid - 0.05);
         class_2338 var9 = null;
         double var10 = Double.MAX_VALUE;

         for (long var30 = var23 ^ ((long)(-((int)(var23 >>> 32))) ^ var23) & -1L >>> 32;
            (int)var30 <= (int)(var30 >>> 32);
            var30 ^= (var30 ^ var30 + (long)1) & -1L >>> 32
         ) {
            var25 ^= ((long)(-((int)(var30 >>> 32))) << 32 ^ var25) & -1L << 32;

            while ((int)(var25 >>> 32) <= (int)(var30 >>> 32)) {
               int[] var14 = lliIIIliil;
               var25 ^= ((long)var14.length ^ var25) & -1L >>> 32;
               var27 ^= (0L ^ var27) & -1L << 32;

               while ((int)(var27 >>> 32) < (int)var25) {
                  var27 ^= ((long)var14[(int)(var27 >>> 32)] ^ var27) & -1L >>> 32;
                  class_2338 var18 = target.method_10069((int)var30, (int)var27, (int)(var25 >>> 32));
                  if (!var18.equals(target) && !var18.equals(target.method_10074()) && !var18.method_10074().equals(target) && IIlllIlliIll(var4, var18)) {
                     double var19 = class_243.method_24953(var18).method_1031(0.0, 1.12, 0.0).method_1025(class_243.method_24953(target));
                     if (!(var19 > var7 * var7)
                        && (
                           reach != null
                              ? reach.test(var18)
                              : IiIIlliIIl(class_243.method_24953(var18).method_1031(0.0, 1.12, 0.0), class_243.method_24953(target))
                        )) {
                        double var21 = class_243.method_24953(var18).method_1025(var6) + var19 * 2.0 + (IIIilIIiiIIi(var18) ? 6.0 : 0.0);
                        if (var21 < var10) {
                           var10 = var21;
                           var9 = var18;
                        }
                     }
                  }

                  var27 += 4294967296L;
               }

               var25 += 4294967296L;
            }
         }

         return var9;
      } else {
         return null;
      }
   }

   public static boolean lliIliliIl(class_2338 goal, class_2338 from, int cap) {
      class_638 var3 = lIlIIIliil.field_1687;
      return var3 != null && from.method_10264() >= goal.method_10264() + 2
         ? iiiiIliIIIIlli.IliIlllilIi(IIiIllIiIl(var3), goal.method_10264(), from.method_10263(), from.method_10264(), from.method_10260(), cap).IliIlllilIi()
            == IlIliilllIliil.llIliIlliilIliIlli
         : false;
   }

   public static class_2338 iIIIlIlIIl(class_2338 feetValid, double reach, Set<Long> target, Predicate<class_2338> avoid, lIiIIliliIiIIlil stats) {
      class_2338 var6 = llIIlilIIl(feetValid, reach, target, avoid, stats, llIiIiililIiIiil.IiilIIilil);
      return var6 != null ? var6 : llIIlilIIl(feetValid, reach, target, avoid, stats, llIiIiililIiIiil.liilIIilil);
   }

   public static boolean liIlliiIll(class_2338 from, class_2338 cap, int goal) {
      long var16 = -3571006277957018182L;
      long var14 = -3698321932570185654L;
      class_638 var3 = lIlIIIliil.field_1687;
      if (var3 == null) {
         return false;
      } else if (cap.equals(from)) {
         return false;
      } else if (!IIlllIlliIll(var3, cap)) {
         return true;
      } else {
         HashSet var4 = new HashSet();
         ArrayDeque var5 = new ArrayDeque();
         HashMap var6 = new HashMap();
         var4.add(cap.method_10063());
         var5.add(cap);

         while (!var5.isEmpty()) {
            if (var4.size() >= goal) {
               return false;
            }

            class_2338 var7 = (class_2338)var5.poll();
            var14 ^= (-8589934592L ^ var14) & -1L << 32;

            while ((int)(var14 >>> 32) <= 2) {
               for (var14 ^= (-2L ^ var14) & -1L >>> 32; (int)var14 <= 2; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
                  if ((int)(var14 >>> 32) != 0 || (int)var14 != 0) {
                     var16 ^= ((long)(Math.abs((int)(var14 >>> 32)) != 2 && Math.abs((int)var14) != 2 ? 0 : 1) << 32 ^ var16) & -1L << 32;
                     if ((int)(var16 >>> 32) == 0
                        || Math.abs((int)(var14 >>> 32)) == 2 && (int)var14 == 0
                        || Math.abs((int)var14) == 2 && (int)(var14 >>> 32) == 0) {
                        for (var16 ^= ~var16 & -1L >>> 32; (int)var16 <= 2; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
                           class_2338 var12 = var7.method_10069((int)(var14 >>> 32), (int)var16, (int)var14);
                           if (!var4.contains(var12.method_10063()) && IIlllIlliIll(var3, var12)) {
                              List var13 = var6.computeIfAbsent(var12.method_10063(), k -> IIllllIlll(var3, var12));
                              if (var13.contains(var7)) {
                                 if (var12.equals(from)) {
                                    return false;
                                 }

                                 var4.add(var12.method_10063());
                                 var5.add(var12);
                              }
                           }
                        }
                     }
                  }
               }

               var14 += 4294967296L;
            }
         }

         return !var4.contains(from.method_10063());
      }
   }

   private static boolean lllllillll(class_1922 d, class_2338 w, int[] landing) {
      long var5 = -3568790315995033468L;
      class_2338 var3 = w.method_10069(landing[0], 0, landing[1]);
      if (!IlIlllIlilIl(d, var3)) {
         return true;
      } else if (IIlllIlliIll(d, var3)) {
         return true;
      } else {
         for (long var7 = var5 ^ (4294967296L ^ var5) & -1L << 32; (int)(var7 >>> 32) <= 2; var7 += 4294967296L) {
            if (IIlllIlliIll(d, var3.method_10087((int)(var7 >>> 32)))) {
               return true;
            }
         }

         return false;
      }
   }

   public static class_2338 llIIlilIIl(
      class_2338 feetValid, double reach, Set<Long> avoid, Predicate<class_2338> standDys, lIiIIliliIiIIlil target, int[] stats
   ) {
      long var25 = -9113751345292907546L;
      long var27 = 4278154934398569343L;
      long var29 = -392123557381250320L;
      class_638 var7 = lIlIIIliil.field_1687;
      if (var7 != null && lIlIIIliil.field_1724 != null) {
         var25 ^= ((long)((int)Math.ceil(reach)) << 32 ^ var25) & -1L << 32;
         class_243 var9 = lIlIIIliil.field_1724.method_73189();
         class_2338 var10 = null;
         double var11 = Double.MAX_VALUE;

         for (long var32 = var25 ^ ((long)(-((int)(var25 >>> 32))) ^ var25) & -1L >>> 32;
            (int)var32 <= (int)(var32 >>> 32);
            var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32
         ) {
            var27 ^= ((long)(-((int)(var32 >>> 32))) << 32 ^ var27) & -1L << 32;

            while ((int)(var27 >>> 32) <= (int)(var32 >>> 32)) {
               int[] var15 = stats;
               var27 ^= ((long)stats.length ^ var27) & -1L >>> 32;
               var29 ^= (0L ^ var29) & -1L << 32;

               while ((int)(var29 >>> 32) < (int)var27) {
                  var29 ^= ((long)var15[(int)(var29 >>> 32)] ^ var29) & -1L >>> 32;
                  class_2338 var19 = feetValid.method_10069((int)var32, (int)var29, (int)(var27 >>> 32));
                  if (!var19.equals(feetValid) && !var19.equals(feetValid.method_10074())) {
                     if (target != null) {
                        target.IIliiilIil++;
                     }

                     if (avoid != null && avoid.contains(var19.method_10063())) {
                        if (target != null) {
                           target.lIliiilIil++;
                        }
                     } else if (!IIlllIlliIll(var7, var19)) {
                        if (target != null) {
                           target.iIliiilIil++;
                        }
                     } else {
                        class_243 var20 = class_243.method_24953(var19).method_1031(0.0, 1.12, 0.0);
                        double var21 = Math.max(1.0, reach - 0.6);
                        if (var20.method_1025(class_243.method_24953(feetValid)) > var21 * var21) {
                           if (target != null) {
                              target.IlliiilIil++;
                           }
                        } else {
                           label105: {
                              if (standDys != null) {
                                 if (!standDys.test(var19)) {
                                    if (target != null) {
                                       target.llliiilIil++;
                                    }
                                    break label105;
                                 }
                              } else if (!IiIIlliIIl(var20, class_243.method_24953(feetValid))) {
                                 if (target != null) {
                                    target.llliiilIil++;
                                 }
                                 break label105;
                              }

                              if (target != null) {
                                 target.illiiilIil++;
                              }

                              double var23 = class_243.method_24953(var19).method_1025(var9)
                                 + (IIIilIIiiIIi(var19) ? 24.0 : 0.0)
                                 + (double)Math.abs((int)var29) * 2.0
                                 + ((double)var19.method_10264() + 0.5 < var9.field_1351 - 0.6 ? 12.0 : 0.0);
                              if (var23 < var11) {
                                 var11 = var23;
                                 var10 = var19;
                              }
                           }
                        }
                     }
                  }

                  var29 += 4294967296L;
               }

               var27 += 4294967296L;
            }
         }

         if (target != null) {
            target.IiliiilIil = var10;
         }

         return var10;
      } else {
         return null;
      }
   }

   public static void IIlilIliiIli() {
      iilIIIliil = 0L;
      lilIIIliil = 0L;
      lIiIIIliil = 0L;
   }

   public static iillliiIIillii IliIlllilIi() {
      return IilIIIliil;
   }

   public static boolean lIiiIiIlilli(class_2680 s) {
      return s.method_26204() instanceof class_2211 ? true : s.method_26204() instanceof class_2323;
   }

   private static boolean IiIlliIliiIl(class_1922 w, class_2338 p) {
      class_2680 var2 = w.method_8320(p);
      if (!iIlIlllllill(var2) && !IilliliilIIi(var2)) {
         class_265 var3 = var2.method_26220(w, p);
         return !var3.method_1110()
            && var3.method_1105(class_2351.field_11052) >= 0.8
            && !lIiiIiIlilli(var2)
            && !(var2.method_26204() instanceof class_2399)
            && (
               !var2.method_27852(class_2246.field_10379)
                  || !var2.method_28498(class_2741.field_12525)
                  || ((class_2350)var2.method_11654(class_2741.field_12525)).method_10166() == class_2351.field_11052
            );
      } else {
         return false;
      }
   }

   private static void Iillllilll(class_1922 from, class_2338 to, class_2338 out, List<class_2338> w) {
      lIiIIiiIiIIi var4 = IIiilIiiiIii(from, to, out, Set.of(), Set.of(), liiiiIlliiiiiIll.lIIIiiilll);
      if (var4.iIlIlllllill() == iiiIIiilIIIlIiil.ilIIiillil) {
         if (var4.lIiiIiIlilli() == IilIlIlililIlIli.lliiiiIlIi) {
            lilIIIliil++;
         } else {
            iilIIIliil++;
         }
      }

      if (var4.lIiiIiIlilli() == IilIlIlililIlIli.lliiiiIlIi && IiIlillliIlill.IIIllIIliIIl(var4.iIlIlllllill())) {
         if (var4.iIlIlllllill() != iiiIIiilIIIlIiil.llIIiillil && var4.iIlIlllllill() != iiiIIiilIIIlIiil.ilIIiillil || !IIillIiliIil(from, out)) {
            lilIiiliilIiil var5 = IIiIIIliil;
            if (var5 != null && var5.vetoed(to, out, var4.iIlIlllllill())) {
               lIiIIIliil++;
               iIiIIIliil.add(out.method_10063());
            } else {
               w.add(out);
            }
         }
      }
   }

   public static lIiIIiiIiIIi IIiilIiiiIii(class_1922 from, class_2338 ownedDirt, class_2338 hint, Set<Long> blockedNodes, Set<Long> to, liiiiIlliiiiiIll w) {
      long var32 = -4826307205939742305L;
      long var34 = -551029259055282594L;
      long var36 = 2776971621106030881L;
      long var38 = -1417407613100922006L;
      long var40 = -2998270204456200470L;
      long var42 = -5744125247725929598L;
      long var44 = -1999393405816381193L;
      long var30 = 4765438872282933225L;
      long var46 = 2637760530008497353L;
      var30 ^= ((long)(hint.method_10263() - ownedDirt.method_10263()) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)(hint.method_10264() - ownedDirt.method_10264()) ^ var30) & -1L >>> 32;
      var32 ^= ((long)(hint.method_10260() - ownedDirt.method_10260()) << 32 ^ var32) & -1L << 32;
      var32 ^= ((long)Math.abs((int)(var30 >>> 32)) ^ var32) & -1L >>> 32;
      var34 ^= ((long)Math.abs((int)(var32 >>> 32)) << 32 ^ var34) & -1L << 32;
      var34 ^= ((long)((int)var32 == 1 && (int)(var34 >>> 32) == 1 ? 1 : 0) ^ var34) & -1L >>> 32;
      var36 ^= (4294967296L ^ var36) & -1L << 32;
      if ((int)var34 != 0) {
         class_2338 var13 = ownedDirt.method_10069(Integer.signum((int)(var30 >>> 32)), 0, 0);
         class_2338 var14 = ownedDirt.method_10069(0, 0, Integer.signum((int)(var32 >>> 32)));
         var36 ^= (
               (long)(
                        IlIlllIlilIl(from, var13)
                              && IlIlllIlilIl(from, var13.method_10084())
                              && IlIlllIlilIl(from, var14)
                              && IlIlllIlilIl(from, var14.method_10084())
                              && iIlllIllll(from, var13)
                              && iIlllIllll(from, var14)
                           ? 1
                           : 0
                     )
                     << 32
                  ^ var36
            )
            & -1L << 32;
      }

      var36 ^= ((long)((int)var32 + (int)(var34 >>> 32) != 2 || (int)var32 != 2 && (int)(var34 >>> 32) != 2 ? 0 : 1) ^ var36) & -1L >>> 32;
      iIiIIIliIliIIIli var48 = (int)var36 != 0
         ? iliIiIiiIi.IliIlllilIi(
            ownedDirt.method_10063(),
            hint.method_10063(),
            wx -> IlIlllIlilIl(from, class_2338.method_10092(wx)),
            cell -> IIlllIlliIll(from, class_2338.method_10092(cell))
         )
         : null;
      var38 ^= ((long)((int)var36 != 0 && !var48.liiiIIllIl() ? 0 : 1) << 32 ^ var38) & -1L << 32;
      class_2680 var16 = from.method_8320(hint);
      class_2680 var17 = from.method_8320(hint.method_10084());
      class_2680 var18 = from.method_8320(hint.method_10074());
      var38 ^= (
            (long)(
                  iIlIlllllill(var16)
                        || IilliliilIIi(var16)
                        || !var16.method_26220(from, hint).method_1110() && !(var16.method_26220(from, hint).method_1105(class_2351.field_11052) <= 0.26)
                     ? 0
                     : 1
               )
               ^ var38
         )
         & -1L >>> 32;
      var40 ^= ((long)(!iIlIlllllill(var17) && var17.method_26220(from, hint.method_10084()).method_1110() ? 1 : 0) << 32 ^ var40) & -1L << 32;
      var40 ^= ((long)IiIlliIliiIl(from, hint.method_10074()) ^ var40) & -1L >>> 32;
      var42 ^= (
            (long)(
                     (int)var36 != 0
                        ? var48.IliIlllilIi()
                        : (
                           (int)var30 > 0
                                 && (
                                    !IlIlllIlilIl(from, ownedDirt.method_10084()) && !IIIllIIliIIl(from, ownedDirt, (int)(var30 >>> 32), (int)(var32 >>> 32))
                                       || !IlIlllIlilIl(from, ownedDirt.method_10086(2))
                                 )
                              ? 0
                              : 1
                        )
                  )
                  << 32
               ^ var42
         )
         & -1L << 32;
      var42 ^= ((long)(to != null && to.contains(hint.method_10063()) ? 1 : 0) ^ var42) & -1L >>> 32;
      var44 ^= ((long)(blockedNodes != null && blockedNodes.contains(hint.method_10074().method_10063()) ? 1 : 0) << 32 ^ var44) & -1L << 32;
      var44 ^= ((long)(var18.method_26204() instanceof class_2281) ^ var44) & -1L >>> 32;
      var46 ^= (4294967296L ^ var46) & -1L << 32;
      if ((int)var30 < 0 && ((int)(var30 >>> 32) != 0 || (int)(var32 >>> 32) != 0)) {
         class_2338 var27 = new class_2338(hint.method_10263(), ownedDirt.method_10264(), hint.method_10260());
         var46 ^= ((long)(IlIlllIlilIl(from, var27) && IlIlllIlilIl(from, var27.method_10084()) ? 1 : 0) << 32 ^ var46) & -1L << 32;
      }

      IIlIiilllIlIiill var49 = new IIlIiilllIlIiill(
         (int)(var30 >>> 32),
         (int)var30,
         (int)(var32 >>> 32),
         IIlllIlliIll(from, hint),
         (boolean)((int)var38),
         (boolean)((int)(var40 >>> 32)),
         (boolean)((int)var40),
         (boolean)((int)var42),
         (boolean)((int)(var36 >>> 32)),
         (boolean)((int)(var38 >>> 32)),
         (boolean)((int)(var44 >>> 32)),
         (boolean)((int)var44),
         IlIillIiilIi(from, hint),
         (boolean)((int)(var42 >>> 32)),
         (boolean)((int)(var46 >>> 32)),
         w
      );
      iiiIIiilIIIlIiil var28 = IiIlillliIlill.iIlIlllllill(var49);
      IilIlIlililIlIli var29 = IiIlillliIlill.IilliliilIIi(var49);
      return new lIiIIiiIiIIi(ownedDirt, hint, var28, IiIlillliIlill.lIiiIiIlilli(var28), var29);
   }

   private IIIlIIIilIIlIIIi() {
   }

   public static void lIIlliIIll(class_2338 start, class_2338 goal) {
      long var3 = -8134952738278533523L;
      var3 ^= (
            (long)(
                     Math.max(Math.abs(start.method_10263() - goal.method_10263()), Math.abs(start.method_10260() - goal.method_10260()))
                        + Math.abs(start.method_10264() - goal.method_10264()) * 2
                  )
                  << 32
               ^ var3
         )
         & -1L << 32;
      IilIIIliil = new iillliiIIillii(0, 0, false, false, 0, (int)(var3 >>> 32));
   }

   private static boolean IiIIlliIIl(class_243 from, class_243 to) {
      class_3965 var2 = lIlIIIliil.field_1687.method_17742(new class_3959(from, to, class_3960.field_17558, class_242.field_1348, lIlIIIliil.field_1724));
      return var2.method_17783() != class_240.field_1332 || var2.method_17784().method_1025(to) < 2.0;
   }

   public static List<class_2338> iiIIlIIlIl(class_2338 max, double avoid, Set<Long> reach, Predicate<class_2338> feetValid, int target) {
      List var6 = lIlIliIlIl(max, avoid, reach, feetValid, target, llIiIiililIiIiil.IiilIIilil);
      if (var6.size() < target) {
         var6.addAll(lIlIliIlIl(max, avoid, reach, feetValid, target - var6.size(), llIiIiililIiIiil.liilIIilil));
      }

      return var6;
   }

   public static boolean IlIillIiilIi(class_1922 feet, class_2338 w) {
      if (feet == null) {
         return false;
      } else {
         for (class_2350 var3 : class_2353.field_11062) {
            class_2338 var4 = w.method_10093(var3);
            class_2680 var5 = feet.method_8320(var4);
            if (IilliliilIIi(var5) || IilliliilIIi(feet.method_8320(var4.method_10074()))) {
               return true;
            }

            if (feet.method_8320(var4).method_26220(feet, var4).method_1110()
               && feet.method_8320(var4.method_10074()).method_26220(feet, var4.method_10074()).method_1110()) {
               return true;
            }
         }

         return false;
      }
   }

   private static List<class_2338> IIllllIlll(class_1922 w, class_2338 p) {
      long var16 = 4967522866836323239L;
      long var18 = -5738499809787010000L;
      long var20 = 6297966976930970379L;
      long var14 = 7862141086577357618L;
      ArrayList var2 = new ArrayList(8);
      class_2680 var3 = w.method_8320(p);
      if ((var3.method_26204() instanceof class_3962 || var3.method_26204() instanceof class_2275) && !IIlllIlliIll(w, p)) {
         if (IlIlllIlilIl(w, p.method_10084())) {
            for (class_2350 var26 : class_2353.field_11062) {
               class_2338 var28 = p.method_10093(var26).method_10084();
               if (IIlllIlliIll(w, var28)) {
                  Iillllilll(w, p, var28, var2);
               }
            }
         }

         return var2;
      } else if (var3.method_26204() instanceof class_2323 && IiIlliIliiIl(w, p.method_10074()) && !IIlllIlliIll(w, p)) {
         class_265 var22 = var3.method_26220(w, p);
         class_238 var25 = var22.method_1110() ? null : var22.method_1107();

         for (class_2350 var7 : class_2353.field_11062) {
            if (var25 == null || !iliIiiliiiii(var25, var7)) {
               class_2338 var29 = p.method_10093(var7);
               if (IIlllIlliIll(w, var29)) {
                  Iillllilll(w, p, var29, var2);
               } else {
                  class_2338 var30 = var29.method_10084();
                  if (IIlllIlliIll(w, var30)) {
                     Iillllilll(w, p, var30, var2);
                  } else {
                     for (var14 ^= (4294967296L ^ var14) & -1L << 32; (int)(var14 >>> 32) <= 2; var14 += 4294967296L) {
                        class_2338 var34 = var29.method_10087((int)(var14 >>> 32));
                        if (IIlllIlliIll(w, var34)) {
                           Iillllilll(w, p, var34, var2);
                           break;
                        }

                        if (!IlIlllIlilIl(w, var34.method_10084())) {
                           break;
                        }
                     }
                  }
               }
            }
         }

         return var2;
      } else {
         int[][] var4 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
         int[][] var5 = var4;
         var14 ^= ((long)var4.length ^ var14) & -1L >>> 32;
         var16 ^= (0L ^ var16) & -1L << 32;

         while ((int)(var16 >>> 32) < (int)var14) {
            int[] var8 = var5[(int)(var16 >>> 32)];
            var16 ^= ((long)(var8[0] != 0 && var8[1] != 0 ? 1 : 0) ^ var16) & -1L >>> 32;
            if ((int)var16 != 0) {
               class_2338 var31 = p.method_10069(var8[0], 0, 0);
               class_2338 var33 = p.method_10069(0, 0, var8[1]);
               if (IlIlllIlilIl(w, var31) && IlIlllIlilIl(w, var31.method_10084()) && IlIlllIlilIl(w, var33) && IlIlllIlilIl(w, var33.method_10084())) {
                  class_2338 var12 = p.method_10069(var8[0], 0, var8[1]);
                  if (IIlllIlliIll(w, var12)) {
                     Iillllilll(w, p, var12, var2);
                  }
               }
            } else {
               class_2338 var10 = p.method_10069(var8[0], 0, var8[1]);
               if (IIlllIlliIll(w, var10)) {
                  Iillllilll(w, p, var10, var2);
               } else {
                  class_2338 var11 = p.method_10069(var8[0], 1, var8[1]);
                  if (!IlIlllIlilIl(w, p.method_10084()) || !IIlllIlliIll(w, var11) || !IIlllIlliIll(w, p) && !Illlllllilll(w, p)) {
                     if (IlIlllIlilIl(w, p.method_10084()) && IIlllIlliIll(w, var11) && Iilllilliill(w, p)) {
                        Iillllilll(w, p, var11, var2);
                     } else {
                        for (var18 ^= (4294967296L ^ var18) & -1L << 32; (int)(var18 >>> 32) <= 2; var18 += 4294967296L) {
                           class_2338 var13 = p.method_10069(var8[0], -((int)(var18 >>> 32)), var8[1]);
                           if (IIlllIlliIll(w, var13)) {
                              Iillllilll(w, p, var13, var2);
                              break;
                           }

                           if (!IlIlllIlilIl(w, var13.method_10084())) {
                              break;
                           }
                        }
                     }
                  } else {
                     Iillllilll(w, p, var11, var2);
                  }
               }
            }

            var16 += 4294967296L;
         }

         var5 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
         int[][] var6 = var5;
         var16 ^= ((long)var5.length << 32 ^ var16) & -1L << 32;

         for (long var41 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var41 < (int)(var16 >>> 32); var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32) {
            int[] var9 = var6[(int)var41];
            class_2338 var32 = p.method_10069(var9[0], 0, var9[1]);
            if (!IIlllIlliIll(w, var32) && IlIlllIlilIl(w, var32) && IlIlllIlilIl(w, var32.method_10084()) && IlIlllIlilIl(w, p.method_10084())) {
               var20 ^= (0L ^ var20) & -1L << 32;

               for (var41 ^= (4294967296L ^ var41) & -1L << 32; (int)(var41 >>> 32) <= 2; var41 += 4294967296L) {
                  if (IIlllIlliIll(w, var32.method_10087((int)(var41 >>> 32)))) {
                     var20 ^= (4294967296L ^ var20) & -1L << 32;
                     break;
                  }
               }

               if ((int)(var20 >>> 32) != 0) {
                  class_2338 var35 = p.method_10069(var9[0] * 2, 0, var9[1] * 2);
                  if (IIlllIlliIll(w, var35)) {
                     if (lllllillll(w, var35, var9)) {
                        Iillllilll(w, p, var35, var2);
                     }
                  } else {
                     class_2338 var36 = var35.method_10074();
                     if (IlIlllIlilIl(w, var35) && IIlllIlliIll(w, var36) && lllllillll(w, var36, var9)) {
                        Iillllilll(w, p, var36, var2);
                     }
                  }
               }
            }
         }

         return var2;
      }
   }

   public static String Iiilliiliiil(class_1922 feet, class_2338 w) {
      if (feet == null) {
         return lIliliIlil<"lIliliIlil","tY4J2fAL2jteMHlukcERlOg9+XFpEvx7aT29Y/Aw2fQGwWkM">();
      } else {
         class_2680 var2 = feet.method_8320(w.method_10074());
         if (iIlIlllllill(var2)) {
            return lIliliIlil<"lIliliIlil","VlU5neGrgfb8ZQ9ZwKp/6dKGY2wdwquVzOHMpf58Mp2SJw==">();
         } else if (IilliliilIIi(var2) && !(var2.method_26204() instanceof class_2377)) {
            return lIliliIlil<"lIliliIlil","oY36jh3tYSYNLKxIM9yvh4BPPwaudgu63IJIF3QQlx55vrkOkDh3">();
         } else {
            class_265 var3 = var2.method_26220(feet, w.method_10074());
            if (var3.method_1110() || var3.method_1105(class_2351.field_11052) < 0.8 || lIiiIiIlilli(var2) || var2.method_26204() instanceof class_2399) {
               return lIliliIlil<"lIliliIlil","QAH30sn7snKJ0KuiCGmGQXuFYJekWIMqclo8Z18QHIrvquip">();
            } else if (var2.method_27852(class_2246.field_10379)
               && var2.method_28498(class_2741.field_12525)
               && ((class_2350)var2.method_11654(class_2741.field_12525)).method_10166() != class_2351.field_11052) {
               return lIliliIlil<"lIliliIlil","QAH30sn7snKJ0KuiCGmGQXuFYJekWIMqclo8Z18QHIrvquip">();
            } else {
               class_2680 var4 = feet.method_8320(w);
               if (iIlIlllllill(var4)) {
                  return lIliliIlil<"lIliliIlil","VlU5neGrgfb8ZQ9ZwKp/6dKGY2wdwquVzOHMpf58Mp2SJw==">();
               } else if (IilliliilIIi(var4)) {
                  return lIliliIlil<"lIliliIlil","oY36jh3tYSYNLKxIM9yvh4BPPwaudgu63IJIF3QQlx55vrkOkDh3">();
               } else {
                  class_265 var5 = var4.method_26220(feet, w);
                  if (!var5.method_1110() && var5.method_1105(class_2351.field_11052) > 0.26) {
                     return lIliliIlil<"lIliliIlil","yeLh2UafLdaAJkuSh+a4qVNGa7ka9g4h0DwdOBeBnGbWQ3b4X5MGjzI=">();
                  } else {
                     class_2680 var6 = feet.method_8320(w.method_10084());
                     if (iIlIlllllill(var6)) {
                        return lIliliIlil<"lIliliIlil","VlU5neGrgfb8ZQ9ZwKp/6dKGY2wdwquVzOHMpf58Mp2SJw==">();
                     } else {
                        return !var6.method_26220(feet, w.method_10084()).method_1110()
                           ? lIliliIlil<"lIliliIlil","xb2xKqmGe6qZF6iUvlSTF+/AaQc9lTSuY3iMxGKJi+GBKcUxvpGdWA==">()
                           : null;
                     }
                  }
               }
            }
         }
      }
   }

   public static Illillllil IIiIllIiIl(class_1922 w) {
      final class_2339 var1 = new class_2339();
      return new Illillllil() {
         @Override
         public boolean solid(int z, int y, int x) {
            var1.method_10103(z, y, x);
            class_2680 var4 = w.method_8320(var1);
            return IIIlIIIilIIlIIIi.iIlIlllllill(var4) || IIIlIIIilIIlIIIi.IilliliilIIi(var4) || !var4.method_26220(w, var1).method_1110();
         }

         @Override
         public boolean IliIlllilIi(int z, int x, int y) {
            var1.method_10103(z, x, y);
            class_2680 var4 = w.method_8320(var1);
            if (IIIlIIIilIIlIIIi.lIiiIiIlilli(var4)) {
               return false;
            } else if (!var4.method_26227().method_15769() && var4.method_26220(w, var1).method_1110()) {
               return false;
            } else if (IIIlIIIilIIlIIIi.iIlIlllllill(var4) && var4.method_26227().method_15769()) {
               return false;
            } else {
               class_265 var5 = var4.method_26220(w, var1);
               return !var5.method_1110() && var5.method_1105(class_2351.field_11052) <= 0.26 && !this.IliIlllilIi(z, x - 1, y)
                  ? false
                  : (!IIIlIIIilIIlIIIi.IilliliilIIi(var4) || var4.method_26204() instanceof class_2377) && this.solid(z, x, y);
            }
         }
      };
   }

   public static List<class_2338> lIlIliIlIl(class_2338 standDys, double reach, Set<Long> max, Predicate<class_2338> target, int avoid, int[] feetValid) {
      long var24 = -2221717210009488454L;
      long var26 = -5144192686025764380L;
      long var28 = 3331271359576893576L;
      class_638 var7 = lIlIIIliil.field_1687;
      ArrayList var8 = new ArrayList();
      if (var7 != null && lIlIIIliil.field_1724 != null && avoid > 0) {
         var24 ^= ((long)((int)Math.ceil(reach)) << 32 ^ var24) & -1L << 32;
         class_243 var10 = lIlIIIliil.field_1724.method_73189();
         ArrayList var11 = new ArrayList();

         for (long var31 = var24 ^ ((long)(-((int)(var24 >>> 32))) ^ var24) & -1L >>> 32;
            (int)var31 <= (int)(var31 >>> 32);
            var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32
         ) {
            var26 ^= ((long)(-((int)(var31 >>> 32))) << 32 ^ var26) & -1L << 32;

            while ((int)(var26 >>> 32) <= (int)(var31 >>> 32)) {
               int[] var14 = feetValid;
               var26 ^= ((long)feetValid.length ^ var26) & -1L >>> 32;
               var28 ^= (0L ^ var28) & -1L << 32;

               while ((int)(var28 >>> 32) < (int)var26) {
                  var28 ^= ((long)var14[(int)(var28 >>> 32)] ^ var28) & -1L >>> 32;
                  class_2338 var18 = standDys.method_10069((int)var31, (int)var28, (int)(var26 >>> 32));
                  if (!var18.equals(standDys)
                     && !var18.equals(standDys.method_10074())
                     && (max == null || !max.contains(var18.method_10063()))
                     && IIlllIlliIll(var7, var18)) {
                     class_243 var19 = class_243.method_24953(var18).method_1031(0.0, 1.12, 0.0);
                     double var20 = Math.max(1.0, reach - 0.6);
                     if (!(var19.method_1025(class_243.method_24953(standDys)) > var20 * var20)
                        && (target != null ? target.test(var18) : IiIIlliIIl(var19, class_243.method_24953(standDys)))) {
                        double var22 = class_243.method_24953(var18).method_1025(var10)
                           + (IIIilIIiiIIi(var18) ? 24.0 : 0.0)
                           + (double)Math.abs((int)var28) * 2.0
                           + ((double)var18.method_10264() + 0.5 < var10.field_1351 - 0.6 ? 12.0 : 0.0);
                        var11.add(new double[]{var22, (double)var18.method_10063()});
                     }
                  }

                  var28 += 4294967296L;
               }

               var26 += 4294967296L;
            }
         }

         var11.sort(Comparator.comparingDouble(a -> a[0]));

         for (double[] var13 : var11) {
            var8.add(class_2338.method_10092((long)var13[1]));
            if (var8.size() >= avoid) {
               break;
            }
         }

         return var8;
      } else {
         return var8;
      }
   }

   public static long iiiIlIIIll() {
      return IiiIIIliil;
   }

   private static long[] illIlIilIl(long[] footprint) {
      long var8 = 5242502169598735318L;
      long var10 = 1429086569920908206L;
      if (iIiIIIliil.isEmpty()) {
         return footprint;
      } else {
         long[] var1 = new long[(footprint == null ? 0 : footprint.length) + iIiIIIliil.size()];
         var8 ^= (0L ^ var8) & -1L << 32;
         if (footprint != null) {
            long[] var3 = footprint;
            var8 ^= ((long)footprint.length ^ var8) & -1L >>> 32;

            for (long var14 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var14 >>> 32) < (int)var8; var14 += 4294967296L) {
               long var6 = var3[(int)(var14 >>> 32)];
               int var10001 = (int)(var8 >>> 32);
               var8 += 4294967296L;
               var1[var10001] = var6;
            }
         }

         for (long var4 : iIiIIIliil) {
            int var15 = (int)(var8 >>> 32);
            var8 += 4294967296L;
            var1[var15] = var4;
         }

         return var1;
      }
   }

   public static boolean iIlIlllllill(class_2680 s) {
      if (!s.method_26227().method_15769()) {
         return true;
      } else {
         class_2248 var1 = s.method_26204();
         return var1 instanceof class_2266
            || var1 instanceof class_2413
            || var1 instanceof class_5635
            || var1 instanceof class_3830
            || var1 instanceof class_3922
            || var1 == class_2246.field_10036
            || var1 == class_2246.field_22089
            || var1 == class_2246.field_10606
            || var1 == class_2246.field_10164
            || var1 == class_2246.field_10343;
      }
   }

   private static boolean IlIlllIlilIl(class_1922 p, class_2338 w) {
      class_2680 var2 = p.method_8320(w);
      return !iIlIlllllill(var2) && !IilliliilIIi(var2) ? var2.method_26220(p, w).method_1110() : false;
   }

   public static boolean Iilllilliill(class_1922 p, class_2338 w) {
      return p.method_8320(w).method_27852(class_2246.field_10382) && IiIlliIliiIl(p, w.method_10074());
   }

   static boolean Ililllililil(class_1922 w, class_2338 c) {
      class_2680 var2 = w.method_8320(c);
      if (var2.method_26215() && !w.method_8320(c.method_10074()).method_26220(w, c.method_10074()).method_1110()) {
         for (class_2350 var4 : class_2353.field_11062) {
            class_3610 var5 = w.method_8316(c.method_10093(var4));
            if (!var5.method_15769() && !var5.method_15771() && var5.method_15761() > 1) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   static int liiiIIllIl(class_2338 goal, class_2338 start) {
      long var4 = 1692591630289204910L;
      var4 ^= ((long)Math.max(Math.abs(goal.method_10263() - start.method_10263()), Math.abs(goal.method_10260() - start.method_10260())) << 32 ^ var4)
         & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) + Math.abs(goal.method_10264() - start.method_10264()) * 2) ^ var4) & -1L >>> 32;
      return Math.max(10000, Math.min(24000, 2000 + (int)var4 * 160));
   }

   public static boolean Illlllllilll(class_1922 p, class_2338 w) {
      class_2680 var2 = p.method_8320(w);
      class_265 var3 = var2.method_26220(p, w);
      if (!var3.method_1110() && !(var3.method_1105(class_2351.field_11052) > 0.26) && !IilliliilIIi(var2)) {
         return var2.method_26227().method_15769() ? !iIlIlllllill(var2) : var2.method_28498(class_2741.field_12508);
      } else {
         return false;
      }
   }

   public static long[] IiiIlliiIl() {
      return iliIIIliil;
   }

   public static Illillllil lilIliilIl(class_1922 w, Illillllil base, class_2338 feet) {
      final class_2339 var3 = new class_2339();
      return new Illillllil() {
         @Override
         public boolean IliIlllilIi(int z, int x, int y) {
            return w.method_8316(var3.method_10103(z, x, y)).method_15769()
                  || z == feet.method_10263() && x == feet.method_10264() - 1 && y == feet.method_10260()
               ? base.IliIlllilIi(z, x, y)
               : false;
         }

         @Override
         public boolean IilliliilIIi(int y, int z, int x) {
            return base.IilliliilIIi(y, z, x);
         }

         @Override
         public boolean solid(int x, int z, int y) {
            return base.solid(x, z, y);
         }
      };
   }

   public static class_2338 Iliilliiilii(class_2338 target, double reach) {
      return Iiiiliiiiiii(target, reach, null);
   }

   public static boolean IIlllIlliIll(class_1922 w, class_2338 feet) {
      return Iiilliiliiil(w, feet) == null;
   }

   public static class_2338 Iiiiliiiiiii(class_2338 target, double reach, Set<Long> avoid) {
      return iIIIlIlIIl(target, reach, avoid, null, null);
   }

   private static boolean IIIllIIliIIl(class_1922 dx, class_2338 from, int w, int dz) {
      class_2680 var4 = dx.method_8320(from);
      class_2680 var5 = dx.method_8320(from.method_10084());
      if (var4.method_26204() instanceof class_2323 && var5.method_26204() instanceof class_2323) {
         class_265 var6 = var5.method_26220(dx, from.method_10084());
         if (var6.method_1110()) {
            return true;
         } else {
            class_238 var7 = var6.method_1107();
            return (w <= 0 || !iliIiiliiiii(var7, class_2350.field_11034))
               && (w >= 0 || !iliIiiliiiii(var7, class_2350.field_11039))
               && (dz <= 0 || !iliIiiliiiii(var7, class_2350.field_11035))
               && (dz >= 0 || !iliIiiliiiii(var7, class_2350.field_11043));
         }
      } else {
         return false;
      }
   }

   public static List<class_2338> ilIllIiIll(class_2338 goal, class_2338 start, int maxNodes) {
      long var24 = -8618726713296113410L;
      long var26 = -4090454237718198074L;
      class_638 var3 = lIlIIIliil.field_1687;
      if (var3 == null) {
         return null;
      } else {
         var24 ^= ((long)Math.min(liiiIIllIl(goal, start), Math.max(1, maxNodes)) << 32 ^ var24) & -1L << 32;
         var24 ^= (
               (long)(
                     Math.max(Math.abs(goal.method_10263() - start.method_10263()), Math.abs(goal.method_10260() - start.method_10260()))
                        + Math.abs(goal.method_10264() - start.method_10264()) * 2
                  )
                  ^ var24
            )
            & -1L >>> 32;
         IiiIIIliil = goal.method_10063();
         if (goal.equals(start)) {
            IilIIIliil = new iillliiIIillii(0, (int)(var24 >>> 32), true, false, 0, (int)var24);
            iliIIIliil = null;
            return new ArrayList<>(List.of(goal));
         } else {
            HashMap var6 = new HashMap();
            HashMap var7 = new HashMap();
            HashSet var8 = new HashSet();
            iIiIIIliil.clear();
            PriorityQueue var9 = new PriorityQueue<>(Comparator.comparingDouble(a -> Double.longBitsToDouble(a[1])));
            var7.put(goal.method_10063(), 0.0);
            var9.add(new long[]{goal.method_10063(), Double.doubleToLongBits(1.5 * iilllIIill(goal, start))});
            var26 ^= (0L ^ var26) & -1L << 32;

            while (!var9.isEmpty()) {
               int var10000 = (int)(var26 >>> 32);
               var26 += 4294967296L;
               if (var10000 >= (int)(var24 >>> 32)) {
                  break;
               }

               long var11 = ((long[])var9.poll())[0];
               if (var11 == start.method_10063()) {
                  IilIIIliil = new iillliiIIillii((int)(var26 >>> 32), (int)(var24 >>> 32), true, false, var9.size(), (int)var24);
                  iliIIIliil = null;
                  return lIilliIill(var6, var11, goal);
               }

               if (var8.add(var11)) {
                  class_2338 var13 = class_2338.method_10092(var11);
                  double var14 = var7.getOrDefault(var11, Double.MAX_VALUE);

                  for (class_2338 var17 : IIllllIlll(var3, var13)) {
                     long var18 = var17.method_10063();
                     if (!var8.contains(var18)) {
                        double var20 = 1.0 + 0.4 * (double)Math.abs(var17.method_10264() - var13.method_10264());
                        double var22 = var14 + var20;
                        if (var22 < var7.getOrDefault(var18, Double.MAX_VALUE)) {
                           var6.put(var18, var11);
                           var7.put(var18, var22);
                           var9.add(new long[]{var18, Double.doubleToLongBits(var22 + 1.5 * iilllIIill(var17, start))});
                        }
                     }
                  }
               }
            }

            IilIIIliil = new iillliiIIillii(
               Math.min((int)(var26 >>> 32), (int)(var24 >>> 32)), (int)(var24 >>> 32), false, !var9.isEmpty(), var9.size(), (int)var24
            );
            long[] var28 = new long[var8.size() + var9.size() + iIiIIIliil.size()];
            var26 ^= (0L ^ var26) & -1L >>> 32;

            for (long var32 : var8) {
               int var10001 = (int)var26;
               var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32;
               var28[var10001] = var32;
            }

            for (long[] var33 : var9) {
               int var39 = (int)var26;
               var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32;
               var28[var39] = var33[0];
            }

            for (long var34 : iIiIIIliil) {
               int var40 = (int)var26;
               var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32;
               var28[var40] = var34;
            }

            iliIIIliil = var28;
            return null;
         }
      }
   }

   public static Illillllil iIiIlIliIl(class_1922 w, Illillllil base) {
      final class_2339 var2 = new class_2339();
      return new Illillllil() {
         @Override
         public boolean IliIlllilIi(int z, int y, int x) {
            var2.method_10103(z, y, x);
            class_265 var4 = w.method_8320(var2).method_26220(w, var2);
            return !var4.method_1110() && var4.method_1105(class_2351.field_11052) > 0.26 && var4.method_1105(class_2351.field_11052) < 0.8
               ? false
               : base.IliIlllilIi(z, y, x);
         }

         @Override
         public boolean liiiIIllIl(int x, int y, int z) {
            var2.method_10103(x, y, z);
            return w.method_8320(var2).method_27852(class_2246.field_21211);
         }

         @Override
         public boolean IilliliilIIi(int z, int y, int x) {
            var2.method_10103(z, y, x);
            class_265 var4 = w.method_8320(var2).method_26220(w, var2);
            return !var4.method_1110() && var4.method_1105(class_2351.field_11052) <= 0.26;
         }

         @Override
         public boolean solid(int z, int x, int y) {
            return base.solid(z, x, y);
         }
      };
   }
}
