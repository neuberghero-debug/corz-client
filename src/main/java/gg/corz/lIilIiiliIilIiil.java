package gg.corz;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public final class lIilIiiliIilIiil {
   public static final int liiIIIilil = 200;
   public static final int iliIIIilil = 120;
   public static final int IiiIIIilil = 50;

   public static <K> boolean iIlIlllllill(Map<K, Integer> carried, Map<K, Integer> needs) {
      return liiiIIllIl(carried, needs).isEmpty();
   }

   public static <K> int lIiiIiIlilli(Map<K, Integer> load, Map<K, Integer> needs) {
      long var6 = -8908625764010716411L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for (Entry var4 : needs.entrySet()) {
         Integer var5 = (Integer)load.get(var4.getKey());
         if (var5 == null || var5 < (Integer)var4.getValue()) {
            load.put(var4.getKey(), (Integer)var4.getValue());
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   private lIilIiiliIilIiil() {
   }

   public static <K> int IilliliilIIi(Map<K, Integer> needs, Map<K, Integer> slotBudget, int maxStack, ToIntFunction<K> load) {
      long var17 = -3594044694806775359L;
      long var19 = -7789762389017168282L;
      long var21 = 1331328967369164515L;
      long var23 = 8596355971052792965L;
      long var15 = 6607721522508717484L;
      var15 ^= (0L ^ var15) & -1L << 32;
      var15 ^= ((long)Math.max(0, maxStack) ^ var15) & -1L >>> 32;

      for (Entry var7 : slotBudget.entrySet()) {
         var17 ^= ((long)needs.getOrDefault(var7.getKey(), 0).intValue() << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)((Integer)var7.getValue()).intValue() ^ var17) & -1L >>> 32;
         if ((int)(var17 >>> 32) < (int)var17) {
            long var29 = var19 ^ ((long)Math.max(1, load.applyAsInt(var7.getKey())) << 32 ^ var19) & -1L << 32;
            var19 = var29 ^ ((long)(((int)(var17 >>> 32) + (int)(var29 >>> 32) - 1) / (int)(var29 >>> 32)) ^ var29) & -1L >>> 32;
            var21 ^= ((long)(((int)var17 + (int)(var19 >>> 32) - 1) / (int)(var19 >>> 32)) << 32 ^ var21) & -1L << 32;
            var21 ^= ((long)((int)(var21 >>> 32) - (int)var19) ^ var21) & -1L >>> 32;
            if ((int)var21 <= (int)var15) {
               needs.put(var7.getKey(), (int)var17);
               var15 ^= ((long)((int)var15 - (int)var21) ^ var15) & -1L >>> 32;
               var15 += 4294967296L;
            } else {
               var23 ^= ((long)(((int)var19 + (int)var15) * (int)(var19 >>> 32)) << 32 ^ var23) & -1L << 32;
               if ((int)(var23 >>> 32) > (int)(var17 >>> 32)) {
                  needs.put(var7.getKey(), Math.min((int)var17, (int)(var23 >>> 32)));
                  var15 += 4294967296L;
               }

               var15 ^= (0L ^ var15) & -1L >>> 32;
            }

            if ((int)var15 == 0 && (int)var21 > 0 && needs.getOrDefault(var7.getKey(), 0) < (int)var17) {
               break;
            }
         }
      }

      return (int)(var15 >>> 32);
   }

   public static <K> LinkedHashMap<K, Integer> IliIlllilIi(List<K> upcoming, int horizon) {
      long var6 = 8124424851352921260L;
      LinkedHashMap var2 = new LinkedHashMap();
      var6 ^= ((long)Math.max(0, Math.min(horizon, upcoming == null ? 0 : upcoming.size())) << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         Object var5 = upcoming.get((int)var9);
         if (var5 != null) {
            var2.merge(var5, Integer.valueOf(1), Integer::sum);
         }
      }

      return var2;
   }

   public static <K> LinkedHashMap<K, Integer> liiiIIllIl(Map<K, Integer> carried, Map<K, Integer> needs) {
      long var6 = 3746366887092404732L;
      LinkedHashMap var2 = new LinkedHashMap();

      for (Entry var4 : carried.entrySet()) {
         var6 ^= ((long)(var4.getValue() - needs.getOrDefault(var4.getKey(), 0)) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) > 0) {
            var2.put(var4.getKey(), Integer.valueOf((int)(var6 >>> 32)));
         }
      }

      return var2;
   }
}
