package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;

public final class iIiIllIlIliIllIl {
   public static <K> IIIIllillIIIllil<K> liiiIIllIl(
      Map<K, Integer> placed, Map<K, Integer> reusableItems, Map<K, Integer> inventory, Map<K, Integer> hotbar, boolean required
   ) {
      long var21 = -6620428920204156891L;
      long var23 = -5814262481567263712L;
      long var25 = 8841644017945581017L;
      long var27 = 4532424232708768045L;
      long var29 = -456047788276850806L;
      long var31 = 4923000446689557739L;
      LinkedHashSet var5 = new LinkedHashSet(placed.keySet());
      ArrayList var6 = new ArrayList(var5.size());
      var21 ^= (0L ^ var21) & -1L << 32;
      var21 ^= (0L ^ var21) & -1L >>> 32;
      var23 ^= (0L ^ var23) & -1L << 32;
      var23 ^= (0L ^ var23) & -1L >>> 32;

      for (Object var12 : var5) {
         var25 ^= ((long)Math.max(0, placed.getOrDefault(var12, 0)) << 32 ^ var25) & -1L << 32;
         if ((int)(var25 >>> 32) != 0) {
            var25 ^= ((long)Math.min((int)(var25 >>> 32), Math.max(0, iIlIlllllill(reusableItems, var12))) ^ var25) & -1L >>> 32;
            long var39 = var27 ^ ((long)((int)(var25 >>> 32) - (int)var25) << 32 ^ var27) & -1L << 32;
            var27 = var39 ^ ((long)Math.max(0, iIlIlllllill(inventory, var12)) ^ var39) & -1L >>> 32;
            long var40 = var29 ^ ((long)Math.max(0, iIlIlllllill(hotbar, var12)) << 32 ^ var29) & -1L << 32;
            var29 = var40 ^ ((long)((int)var27 + (int)(var40 >>> 32)) ^ var40) & -1L >>> 32;
            var31 ^= (
                  (long)(required ? ((int)(var27 >>> 32) > 0 && (int)var29 == 0 ? (int)(var27 >>> 32) : 0) : Math.max(0, (int)(var27 >>> 32) - (int)var29))
                        << 32
                     ^ var31
               )
               & -1L << 32;
            llliilIlilliilIl var20;
            if ((int)(var27 >>> 32) == 0) {
               var20 = llliilIlilliilIl.lIliiilIll;
            } else if ((int)var29 == 0) {
               var20 = llliilIlilliilIl.llliiilIll;
            } else if (required) {
               var20 = llliilIlilliilIl.iIliiilIll;
            } else if ((int)var29 >= (int)(var27 >>> 32)) {
               var20 = llliilIlilliilIl.iIliiilIll;
            } else {
               var20 = llliilIlilliilIl.IlliiilIll;
            }

            var6.add(
               new liIiIiiiiIiIii<>(
                  var12, (int)(var25 >>> 32), (int)var25, (int)(var27 >>> 32), (int)var27, (int)(var29 >>> 32), (int)var29, (int)(var31 >>> 32), var20
               )
            );
            var21 ^= ((long)((int)(var21 >>> 32) + (int)(var25 >>> 32)) << 32 ^ var21) & -1L << 32;
            var21 ^= ((long)((int)var21 + (int)var25) ^ var21) & -1L >>> 32;
            var23 ^= ((long)((int)(var23 >>> 32) + (int)(var27 >>> 32)) << 32 ^ var23) & -1L << 32;
            if ((int)(var31 >>> 32) > 0) {
               var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
            }
         }
      }

      var6.sort(
         Comparator.<liIiIiiiiIiIii>comparingInt(r -> r.IliiIIiIIl)
            .reversed()
            .thenComparing(Comparator.<liIiIiiiiIiIii>comparingInt(r -> r.liiiIIiIIl).reversed())
            .thenComparing(Comparator.<liIiIiiiiIiIii>comparingInt(r -> r.lIiiIIiIIl).reversed())
      );
      double var33 = (int)(var21 >>> 32) == 0 ? 1.0 : (double)((int)var21) / (double)((int)(var21 >>> 32));
      return new IIIIllillIIIllil<>(var6, new iIIIlIlIIl((int)(var21 >>> 32), (int)var21, (int)(var23 >>> 32), var6.size(), (int)var23, var33));
   }

   public static <K> IIIIllillIIIllil<K> IliIlllilIi(Map<K, Integer> inventory, Map<K, Integer> required, Map<K, Integer> placed, Map<K, Integer> hotbar) {
      return liiiIIllIl(inventory, required, placed, hotbar, false);
   }

   private static <K> int iIlIlllllill(Map<K, Integer> m, K k) {
      Integer var2 = (Integer)m.get(k);
      return var2 == null ? 0 : var2;
   }

   private iIiIllIlIliIllIl() {
   }
}
