package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class IIIilIilIIilIi {
   public static final int IliIiiIiilliIiiIii = 6;
   public static final int IilIiiIiililIiiIii = 2;
   public static final int lIiIiiIiiiIiIiiIii = 200;
   public static final int iilIiiIiiIIiIiiIii = 3;

   public static boolean IilliliilIIi(long nowMs, long lastPlaceMs, int minGapMs) {
      return minGapMs > 0 && nowMs - lastPlaceMs < (long)minGapMs;
   }

   public static boolean IliIlllilIi(boolean reachablePlain, int enabled) {
      return reachablePlain && enabled >= 2;
   }

   public static int iIlIlllllill(int missStreak) {
      return missStreak >= 3 ? 200 : 0;
   }

   private IIIilIilIIilIi() {
   }

   public static List<iIIliIllIlIliIll> liiiIIllIl(List<iIIliIllIlIliIll> placesPerTick, Object reachable, int heldItem) {
      ArrayList var3 = new ArrayList();
      if (placesPerTick != null && !placesPerTick.isEmpty() && heldItem > 0) {
         ArrayList var4 = new ArrayList(placesPerTick);
         var4.sort(Comparator.comparingDouble(iIIliIllIlIliIll::iIlIlllllill).thenComparingLong(iIIliIllIlIliIll::IliIlllilIi));
         Object var5 = null;
         if (reachable != null) {
            for (iIIliIllIlIliIll var7 : var4) {
               if (reachable.equals(var7.liiiIIllIl())) {
                  var5 = reachable;
                  break;
               }
            }
         }

         if (var5 == null) {
            var5 = ((iIIliIllIlIliIll)var4.get(0)).liiiIIllIl();
         }

         for (iIIliIllIlIliIll var9 : var4) {
            if (var3.size() >= heldItem) {
               break;
            }

            if (var5.equals(var9.liiiIIllIl())) {
               var3.add(var9);
            }
         }

         return var3;
      } else {
         return var3;
      }
   }
}
