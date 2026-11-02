package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public final class lIllllIiiIllllIi {
   public static boolean liiiIIllIl(int unlocks, int dirtCost, int minUnlocksPerTemp) {
      long var4 = 3627865039033878839L;
      if (dirtCost <= 0) {
         return unlocks > 0;
      } else {
         var4 ^= ((long)(Math.max(1, minUnlocksPerTemp) * Math.min(dirtCost, 4)) << 32 ^ var4) & -1L << 32;
         return unlocks >= (int)(var4 >>> 32);
      }
   }

   private static int iIlIlllllill(iIiIiIlIliIiIl a, iIiIiIlIliIiIl b) {
      return Math.max(Math.abs(a.liiiIIllIl() - b.liiiIIllIl()), Math.abs(a.IilliliilIIi() - b.IilliliilIIi()));
   }

   private lIllllIiiIllllIi() {
   }

   public static List<iIiIiIlIliIiIl> IliIlllilIi(long input, List<iIiIiIlIliIiIl> seed, int linkRadius, int maxTargets) {
      long var16 = -605439936585847650L;
      long var18 = -9154943292817004357L;
      if (seed != null && !seed.isEmpty() && maxTargets > 0) {
         iIiIiIlIliIiIl var5 = null;

         for (iIiIiIlIliIiIl var7 : seed) {
            if (var7.IliIlllilIi() == input) {
               var5 = var7;
               break;
            }
         }

         if (var5 == null) {
            return List.of();
         } else {
            var16 ^= ((long)Math.max(1, linkRadius) << 32 ^ var16) & -1L << 32;
            var16 ^= ((long)Math.max(1, maxTargets) ^ var16) & -1L >>> 32;
            ArrayDeque var8 = new ArrayDeque();
            LinkedHashSet var9 = new LinkedHashSet();
            ArrayList var10 = new ArrayList();
            var8.add(var5);
            var9.add(Long.valueOf(var5.IliIlllilIi()));

            while (!var8.isEmpty() && var10.size() < (int)var16) {
               iIiIiIlIliIiIl var11 = (iIiIiIlIliIiIl)var8.removeFirst();
               var10.add(var11);

               for (iIiIiIlIliIiIl var13 : seed) {
                  if (!var9.contains(Long.valueOf(var13.IliIlllilIi())) && var13.iIlIlllllill() == var5.iIlIlllllill()) {
                     var18 ^= ((long)Math.abs(var13.liiiIIllIl() - var11.liiiIIllIl()) << 32 ^ var18) & -1L << 32;
                     var18 ^= ((long)Math.abs(var13.IilliliilIIi() - var11.IilliliilIIi()) ^ var18) & -1L >>> 32;
                     if (Math.max((int)(var18 >>> 32), (int)var18) <= (int)(var16 >>> 32)) {
                        var9.add(Long.valueOf(var13.IliIlllilIi()));
                        var8.addLast(var13);
                     }
                  }
               }
            }

            iIiIiIlIliIiIl var20 = var5;
            var10.sort(
               Comparator.<iIiIiIlIliIiIl>comparingInt(clusterRoot -> iIlIlllllill(clusterRoot, var20))
                  .thenComparingInt(iIiIiIlIliIiIl::IilliliilIIi)
                  .thenComparingInt(iIiIiIlIliIiIl::liiiIIllIl)
                  .thenComparingLong(iIiIiIlIliIiIl::IliIlllilIi)
            );
            return List.copyOf(var10);
         }
      } else {
         return List.of();
      }
   }
}
