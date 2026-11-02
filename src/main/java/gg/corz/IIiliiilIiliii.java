package gg.corz;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_243;

public final class IIiliiilIiliii {
   public static final long lllIllIlIl = 2400L;
   public static final long IllIllIlIl = 100L;
   public static final int IilIllIlIl = 4;
   public static final int illIllIlIl = 4;

   public static iIIIlllIlIIlll liiiIIllIl(
      Collection<lilIiIiliilIiIil> from, List<IiIlIIiliIlIIi> delay, long villagers, long targets, class_243 usable, Predicate<lilIiIiliilIiIil> tick
   ) {
      long var22 = 4720418258775502649L;
      if (from != null && delay != null && !delay.isEmpty()) {
         iIIIlllIlIIlll var8 = null;
         double var9 = 0.0;

         for (lilIiIiliilIiIil var12 : from) {
            if (var12 != null && !var12.iliIiiliiiii(villagers) && (tick == null || tick.test(var12))) {
               IiIlIIiliIlIIi var13 = null;
               iIIIlIllIlIIlIll var14 = iIIIlIllIlIIlIll.IIiiIlllll;

               for (IiIlIIiliIlIIi var16 : delay) {
                  iIIIlIllIlIIlIll var17 = var12.IIIllIIliIIl(var16);
                  if (var17 != iIIIlIllIlIIlIll.IIiiIlllll) {
                     var13 = var16;
                     var14 = var17;
                     break;
                  }
               }

               if (var13 != null) {
                  long var24 = villagers - var12.ilIiillIil;
                  var22 ^= (
                        (long)(var14 == iIIIlIllIlIIlIll.lIiiIlllll && var12.IIliillIil > var12.ilIiillIil && var24 >= IliIlllilIi(var12.lIliillIil) ? 1 : 0)
                              << 32
                           ^ var22
                     )
                     & -1L << 32;
                  long var18 = var14 == iIIIlIllIlIIlIll.iIiiIlllll ? targets * 4L : targets;
                  if ((int)(var22 >>> 32) != 0 || var24 >= var18) {
                     double var20 = usable == null ? 0.0 : var12.IlilillIil.method_1025(usable);
                     if (var8 == null || iIlIlllllill((boolean)((int)(var22 >>> 32)), var12.ilIiillIil, var20, var8, var9)) {
                        var8 = new iIIIlllIlIIlll(var12, var13, (boolean)((int)(var22 >>> 32)));
                        var9 = var20;
                     }
                  }
               }
            }
         }

         return var8;
      } else {
         return null;
      }
   }

   private static boolean iIlIlllllill(boolean hinted, long dist, double bestDist, iIIIlllIlIIlll seen, double best) {
      if (hinted != seen.iIlIlllllill()) {
         return hinted;
      } else {
         long var8 = seen.IliIlllilIi().ilIiillIil;
         return dist != var8 ? dist < var8 : bestDist < best;
      }
   }

   private IIiliiilIiliii() {
   }

   public static long IliIlllilIi(int misses) {
      long var2 = -6052277809179574405L;
      var2 ^= ((long)Math.max(0, Math.min(misses, 4)) << 32 ^ var2) & -1L << 32;
      return Math.min(2400L, 100L << 3 * (int)(var2 >>> 32));
   }
}
