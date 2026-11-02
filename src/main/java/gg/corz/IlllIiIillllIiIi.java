package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class IlllIiIillllIiIi {
   private IlllIiIillllIiIi() {
   }

   public static liliIlIiiiliIlIi IliIlllilIi(Map<Long, ? extends List<Long>> standsByTarget, iillIIlIIilIIl metrics, int maxAnchors) {
      long var27 = -3359181347293721782L;
      long var29 = -7820082068420693678L;
      long var31 = -2074322144128775798L;
      if (standsByTarget != null && !standsByTarget.isEmpty() && maxAnchors > 0) {
         LinkedHashMap var3 = new LinkedHashMap();
         ArrayList var4 = new ArrayList(standsByTarget.keySet());
         var4.sort(Long::compare);

         for (long var6 : var4) {
            List var8 = (List)standsByTarget.get(var6);
            if (var8 != null) {
               ArrayList var9 = new ArrayList(var8);
               var9.sort(Long::compare);

               for (long var11 : var9) {
                  var3.computeIfAbsent(var11, k -> new LinkedHashSet<>()).add(Long.valueOf(var6));
               }
            }
         }

         if (var3.isEmpty()) {
            return liliIlIiiiliIlIi.liIliIIIIi;
         } else {
            LinkedHashSet var33 = new LinkedHashSet(var4);
            LinkedHashMap var34 = new LinkedHashMap();
            ArrayList var7 = new ArrayList();
            LinkedHashMap var35 = new LinkedHashMap();
            long var36 = 0L;
            var27 ^= (0L ^ var27) & -1L << 32;

            while (!var33.isEmpty() && var7.size() < maxAnchors) {
               long var12 = 0L;
               var27 ^= (0L ^ var27) & -1L >>> 32;
               var29 ^= (0L ^ var29) & -1L << 32;
               double var16 = Double.MAX_VALUE;

               for (Entry var19 : var3.entrySet()) {
                  long var20 = (Long)var19.getKey();
                  var29 ^= (0L ^ var29) & -1L >>> 32;

                  for (long var24 : (LinkedHashSet)var19.getValue()) {
                     if (var33.contains(Long.valueOf(var24))) {
                        var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32;
                     }
                  }

                  if ((int)var29 != 0) {
                     var31 ^= ((long)((int)(var27 >>> 32) != 0 && metrics.liiiIIllIl(var36, var20) ? 1 : 0) << 32 ^ var31) & -1L << 32;
                     double var39 = metrics.IliIlllilIi(var20);
                     var31 ^= (
                           (long)(
                                 (int)var29 <= (int)var27
                                       && ((int)var29 != (int)var27 || (int)(var31 >>> 32) == 0 || (int)(var29 >>> 32) != 0)
                                       && ((int)var29 != (int)var27 || (int)(var31 >>> 32) != (int)(var29 >>> 32) || !(var39 < var16))
                                       && (
                                          (int)var29 != (int)var27
                                             || (int)(var31 >>> 32) != (int)(var29 >>> 32)
                                             || var39 != var16
                                             || Long.compare(var20, var12) >= 0
                                       )
                                    ? 0
                                    : 1
                              )
                              ^ var31
                        )
                        & -1L >>> 32;
                     if ((int)var31 != 0) {
                        var12 = var20;
                        var27 ^= ((long)((int)var29) ^ var27) & -1L >>> 32;
                        var29 ^= ((long)((int)(var31 >>> 32)) << 32 ^ var29) & -1L << 32;
                        var16 = var39;
                     }
                  }
               }

               if ((int)var27 == 0) {
                  break;
               }

               var7.add(var12);
               var35.put(var12, (int)var27);

               for (long var38 : (LinkedHashSet)var3.get(var12)) {
                  if (var33.remove(Long.valueOf(var38))) {
                     var34.put(var38, var12);
                  }
               }

               var36 = var12;
               var27 ^= (4294967296L ^ var27) & -1L << 32;
            }

            return new liliIlIiiiliIlIi(var34, var7, var35);
         }
      } else {
         return liliIlIiiiliIlIi.liIliIIIIi;
      }
   }
}
