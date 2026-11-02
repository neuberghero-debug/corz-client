package gg.corz;

import java.util.EnumSet;
import java.util.function.BiPredicate;

public final class lIlllliiIlllli {
   public static liIlIiIliiIlIiIl liiiIIllIl(double vx, double x, double z, double vz, BiPredicate<Integer, Integer> floor) {
      if (!IliIlllilIi(vx - 0.32 + z, vx + 0.32 + z, x - 0.32 + vz, x + 0.32 + vz, floor)) {
         return liIlIiIliiIlIiIl.IiIlIliIll;
      } else {
         return !IliIlllilIi(vx - 1.3, vx + 1.3, x - 1.3, x + 1.3, floor) ? liIlIiIliiIlIiIl.ilIlIliIll : liIlIiIliiIlIiIl.llIlIliIll;
      }
   }

   public static EnumSet<iiIilIiIIlilIi> iIlIlllllill(boolean edge, boolean recipe, boolean temporary, boolean interaction, boolean inventory) {
      EnumSet var5 = EnumSet.noneOf(iiIilIiIIlilIi.class);
      if (inventory) {
         return var5;
      } else {
         if (edge) {
            var5.add(iiIilIiIIlilIi.lIlliiIiiiIlliiIii);
         }

         if (recipe) {
            var5.add(iiIilIiIIlilIi.IllliiIiilllliiIii);
         }

         if (temporary) {
            var5.add(iiIilIiIIlilIi.illliiIiiIilliiIii);
         }

         if (interaction) {
            var5.add(iiIilIiIIlilIi.lilliiIiiiilliiIii);
         }

         return var5;
      }
   }

   public static boolean IliIlllilIi(double minZ, double minX, double floor, double maxZ, BiPredicate<Integer, Integer> maxX) {
      long var11 = -1319995981530928003L;
      var11 ^= ((long)((int)Math.floor(minZ)) << 32 ^ var11) & -1L << 32;

      while ((double)((int)(var11 >>> 32)) <= Math.floor(minX - 1.0E-7)) {
         for (var11 ^= ((long)((int)Math.floor(floor)) ^ var11) & -1L >>> 32;
            (double)((int)var11) <= Math.floor(maxZ - 1.0E-7);
            var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32
         ) {
            if (!maxX.test((int)(var11 >>> 32), (int)var11)) {
               return false;
            }
         }

         var11 += 4294967296L;
      }

      return true;
   }
}
