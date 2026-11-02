package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;

public final class ilililIiIiililIi {
   private static List<Long> liiiIIllIl(Map<Long, Long> start, long cameFrom, long goal) {
      ArrayList var5 = new ArrayList();
      long var6 = cameFrom;

      while (var6 != goal) {
         var5.add(var6);
         Long var8 = (Long)start.get(var6);
         if (var8 == null) {
            break;
         }

         var6 = var8;
      }

      var5.add(goal);
      Collections.reverse(var5);
      return var5;
   }

   private ilililIiIiililIi() {
   }

   public static liiiiiiiii IliIlllilIi(
      long start, Set<Long> neighbours, int heuristic, double heuristicWeight, LongFunction<long[]> stepCost, IlIlIIlllIlIIl budget, LongToDoubleFunction goals
   ) {
      long var25 = 6297418973876810422L;
      long var27 = -6118620411124522372L;
      if (neighbours.isEmpty()) {
         return new liiiiiiiii(0L, null, 0, false, 0);
      } else if (neighbours.contains(start)) {
         return new liiiiiiiii(start, List.of(start), 0, false, 0);
      } else {
         HashMap var9 = new HashMap();
         HashMap var10 = new HashMap();
         HashSet var11 = new HashSet();
         PriorityQueue var12 = new PriorityQueue<>(Comparator.comparingDouble(a -> Double.longBitsToDouble(a[1])));
         var10.put(start, 0.0);
         var12.add(new long[]{start, Double.doubleToLongBits(heuristicWeight * goals.applyAsDouble(start))});
         var25 ^= (0L ^ var25) & -1L << 32;

         while (!var12.isEmpty()) {
            int var10000 = (int)(var25 >>> 32);
            var25 += 4294967296L;
            if (var10000 >= heuristic) {
               break;
            }

            long var14 = ((long[])var12.poll())[0];
            if (neighbours.contains(var14)) {
               return new liiiiiiiii(var14, liiiIIllIl(var9, var14, start), (int)(var25 >>> 32), false, var12.size());
            }

            if (var11.add(var14)) {
               double var16 = var10.getOrDefault(var14, Double.MAX_VALUE);
               long[] var18 = (long[])stepCost.apply(var14);
               var25 ^= ((long)var18.length ^ var25) & -1L >>> 32;

               for (var27 ^= (0L ^ var27) & -1L << 32; (int)(var27 >>> 32) < (int)var25; var27 += 4294967296L) {
                  long var21 = var18[(int)(var27 >>> 32)];
                  if (!var11.contains(var21)) {
                     double var23 = var16 + budget.cost(var14, var21);
                     if (var23 < var10.getOrDefault(var21, Double.MAX_VALUE)) {
                        var9.put(var21, var14);
                        var10.put(var21, var23);
                        var12.add(new long[]{var21, Double.doubleToLongBits(var23 + heuristicWeight * goals.applyAsDouble(var21))});
                     }
                  }
               }
            }
         }

         long[] var29 = new long[var11.size() + var12.size()];
         var27 ^= (0L ^ var27) & -1L >>> 32;

         for (long var17 : var11) {
            int var10001 = (int)var27;
            var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32;
            var29[var10001] = var17;
         }

         for (long[] var32 : var12) {
            int var35 = (int)var27;
            var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32;
            var29[var35] = var32[0];
         }

         return new liiiiiiiii(0L, null, Math.min((int)(var25 >>> 32), heuristic), !var12.isEmpty(), var12.size(), var29);
      }
   }
}
