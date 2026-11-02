package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;

public final class IIiillllIiilll {
   private static final class_2350[] lIIillIIiiIIillIIi = new class_2350[]{
      class_2350.field_11043, class_2350.field_11034, class_2350.field_11035, class_2350.field_11039
   };
   private static final int IlIillIIillIillIIi = 3000;

   private static List<class_2338> liiiIIllIl(class_1937 w, class_2338 maxDrop, int p) {
      long var13 = 1636661473839814567L;
      long var15 = -5221773177111420226L;
      ArrayList var3 = new ArrayList(8);
      class_2350[] var4 = lIIillIIiiIIillIIi;
      var13 ^= ((long)var4.length << 32 ^ var13) & -1L << 32;

      for (long var18 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         class_2350 var7 = var4[(int)var18];
         class_2338 var8 = maxDrop.method_10093(var7);
         if (lllIIlilillIIlil.IIIllIIliIIl(w, var8)) {
            var3.add(var8);
         } else {
            class_2338 var9 = var8.method_10084();
            if (lllIIlilillIIlil.lIiiIiIlilli(w, maxDrop.method_10084().method_10084()) && lllIIlilillIIlil.IIIllIIliIIl(w, var9)) {
               var3.add(var9);
            } else if (lllIIlilillIIlil.lIiiIiIlilli(w, var8) && lllIIlilillIIlil.lIiiIiIlilli(w, var8.method_10084())) {
               class_2338 var10 = var8;

               for (var15 ^= (0L ^ var15) & -1L << 32; (int)(var15 >>> 32) < p; var15 += 4294967296L) {
                  class_2338 var12 = var10.method_10074();
                  if (lllIIlilillIIlil.iliIiiliiiii(w, var12)) {
                     break;
                  }

                  if (!lllIIlilillIIlil.lIiiIiIlilli(w, var12)) {
                     var10 = null;
                     break;
                  }

                  var10 = var12;
               }

               if (var10 != null && !var10.equals(var8) && lllIIlilillIIlil.IIIllIIliIIl(w, var10)) {
                  var3.add(var10);
               }
            }
         }
      }

      return var3;
   }

   public static List<class_2338> IliIlllilIi(class_1937 maxDrop, class_2338 w, class_2338 to, int from) {
      long var10 = 2959042390939376572L;
      if (w.equals(to)) {
         return List.of();
      } else if (!lllIIlilillIIlil.IIIllIIliIIl(maxDrop, to)) {
         return null;
      } else {
         HashMap var4 = new HashMap();
         ArrayDeque var5 = new ArrayDeque();
         var5.add(w);
         var4.put(w, null);
         var10 ^= (0L ^ var10) & -1L << 32;

         while (!var5.isEmpty()) {
            int var10000 = (int)(var10 >>> 32);
            var10 += 4294967296L;
            if (var10000 >= 3000) {
               break;
            }

            class_2338 var7 = (class_2338)var5.poll();
            if (var7.equals(to)) {
               return iIlIlllllill(var4, var7);
            }

            for (class_2338 var9 : liiiIIllIl(maxDrop, var7, from)) {
               if (!var4.containsKey(var9)) {
                  var4.put(var9, var7);
                  var5.add(var9);
               }
            }
         }

         return null;
      }
   }

   private static List<class_2338> iIlIlllllill(Map<class_2338, class_2338> end, class_2338 parent) {
      ArrayList var2 = new ArrayList();
      class_2338 var3 = parent;

      while (var3 != null && end.get(var3) != null) {
         var2.add(var3);
         var3 = (class_2338)end.get(var3);
      }

      Collections.reverse(var2);
      return var2;
   }

   private IIiillllIiilll() {
   }
}
