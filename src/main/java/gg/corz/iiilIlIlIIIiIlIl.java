package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class iiilIlIlIIIiIlIl {
   public static final double lllIIIIiIl = 1.0E-6;

   public static List<Integer> IliIlllilIi(List<lIliIlIiiIliIlIi> bestItems, boolean entries) {
      ArrayList var2 = new ArrayList();

      for (lIliIlIiiIliIlIi var4 : bestItems) {
         if (var4.lIiiIiIlilli() && lIiiIiIlilli(var4)) {
            iliIiiliiiii(var2, var4.IliIlllilIi());
         }
      }

      if (entries) {
         LinkedHashMap var9 = new LinkedHashMap();

         for (lIliIlIiiIliIlIi var5 : bestItems) {
            if (var5.liiiIIllIl() >= 0 && !var5.lIiiIiIlilli()) {
               var9.computeIfAbsent(var5.liiiIIllIl(), k -> new ArrayList<>()).add(var5);
            }
         }

         for (List var12 : var9.values()) {
            var12.sort(Comparator.comparingDouble(lIliIlIiiIliIlIi::iIlIlllllill).reversed());
            ArrayList var6 = new ArrayList(var12.size());

            for (lIliIlIiiIliIlIi var8 : var12) {
               if (lIiiIiIlilli(var8) && IilliliilIIi(var8, var6)) {
                  iliIiiliiiii(var2, var8.IliIlllilIi());
               } else {
                  var6.add(var8);
               }
            }
         }
      }

      var2.sort(Comparator.comparingInt(iiilIlIlIIIiIlIl::iIlIlllllill));
      return var2;
   }

   private static boolean lIiiIiIlilli(lIliIlIiiIliIlIi e) {
      return !e.IilliliilIIi() && e.IliIlllilIi() >= 0 && e.IliIlllilIi() < 36;
   }

   private static void iliIiiliiiii(List<Integer> slot, int out) {
      if (!slot.contains(out)) {
         slot.add(out);
      }
   }

   public static int iIlIlllllill(int slot) {
      return slot < 9 ? 100 + slot : slot;
   }

   public static boolean liiiIIllIl(lIliIlIiiIliIlIi other, lIliIlIiiIliIlIi keeper) {
      if (other.IIIllIIliIIl() < keeper.IIIllIIliIIl() - 1.0E-6) {
         return false;
      } else {
         for (Map.Entry var3 : keeper.IlIlllIlilIl().entrySet()) {
            if (other.IlIlllIlilIl().getOrDefault(var3.getKey(), 0) < (Integer)var3.getValue()) {
               return false;
            }
         }

         for (Map.Entry var5 : other.IiIlliIliiIl().entrySet()) {
            if (keeper.IiIlliIliiIl().getOrDefault(var5.getKey(), 0) < (Integer)var5.getValue()) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean IilliliilIIi(lIliIlIiiIliIlIi kept, List<lIliIlIiiIliIlIi> e) {
      for (lIliIlIiiIliIlIi var3 : e) {
         if (var3.iliIiiliiiii() >= 0.1 && liiiIIllIl(var3, kept)) {
            return true;
         }
      }

      return false;
   }

   private iiilIlIlIIIiIlIl() {
   }
}
