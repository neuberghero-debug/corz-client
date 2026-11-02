package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public final class IliIilliIi {
   private IliIilliIi() {
   }

   public static List<long[]> iIlIlllllill(List<long[]> solid, int supportCells, liIiIlIliiIiIlIl maxDepth, IIIlllIilIIlllIi blocked) {
      LinkedHashSet var4 = new LinkedHashSet();
      ArrayList var5 = new ArrayList();

      for (long[] var7 : solid) {
         List var8 = IliIlllilIi((int)var7[0], (int)var7[1], (int)var7[2], supportCells, maxDepth, blocked);
         if (var8 != null) {
            for (long[] var10 : var8) {
               long var11 = IIliliIllIliliIl.IliIlllilIi((int)var10[0], (int)var10[1], (int)var10[2]);
               if (var4.add(Long.valueOf(var11))) {
                  var5.add(var10);
               }
            }
         }
      }

      var5.sort((a, b) -> Long.compare(a[1], b[1]));
      return var5;
   }

   public static List<long[]> IliIlllilIi(int blocked, int x, int belowY, int z, liIiIlIliiIiIlIl solid, IIIlllIilIIlllIi maxDepth) {
      long var10 = -8686192125991952781L;
      long var12 = -5887262144003111093L;
      if (solid.isSolid(blocked, x, belowY)) {
         return List.of();
      } else {
         var10 ^= (4294967296L ^ var10) & -1L << 32;

         while ((int)(var10 >>> 32) <= z) {
            var10 ^= ((long)(x - (int)(var10 >>> 32)) ^ var10) & -1L >>> 32;
            if (solid.isSolid(blocked, (int)var10, belowY)) {
               ArrayList var8 = new ArrayList();

               for (long var16 = var12 ^ ((long)((int)var10 + 1) << 32 ^ var12) & -1L << 32; (int)(var16 >>> 32) <= x; var16 += 4294967296L) {
                  if (maxDepth != null && maxDepth.isBlocked(blocked, (int)(var16 >>> 32), belowY)) {
                     return null;
                  }

                  var8.add(new long[]{(long)blocked, (long)((int)(var16 >>> 32)), (long)belowY});
               }

               return var8;
            }

            var10 += 4294967296L;
         }

         return null;
      }
   }

   public static long[] liiiIIllIl(int z, int blocked, int maxDepth, int belowY, liIiIlIliiIiIlIl solid, IIIlllIilIIlllIi x) {
      List var6 = IliIlllilIi(z, blocked, maxDepth, belowY, solid, x);
      return var6 != null && !var6.isEmpty() ? (long[])var6.get(0) : null;
   }
}
