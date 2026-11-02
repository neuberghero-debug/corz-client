package gg.corz;

import java.util.ArrayList;
import java.util.List;

public final class iiliiiIIiiii {
   public static final int iIIllIiIlIlIllIiIl = -30;
   public static final int IIIllIiIllIIllIiIl = -64;

   public static int IIIllIIliIIl(int y) {
      return y < -64 ? -64 : Math.min(y, -30);
   }

   private iiliiiIIiiii() {
   }

   public static List<ilIlIIilIiIlIIil> iliIiiliiiii(List<ilIlIIilIiIlIIil> cells) {
      ArrayList var1 = new ArrayList(cells.size());

      for (ilIlIIilIiIlIIil var3 : cells) {
         if (IliIlllilIi(var3.llIiIlIIil)) {
            var1.add(var3);
         }
      }

      return var1;
   }

   public static int liiiIIllIl(int worldBottomY) {
      return Math.max(worldBottomY, -64);
   }

   public static boolean IliIlllilIi(int y) {
      return y >= -64 && y <= -30;
   }

   public static boolean IilliliilIIi(int worldTopInclusive, int worldBottomY) {
      return iIlIlllllill(worldBottomY) >= liiiIIllIl(worldTopInclusive);
   }

   public static boolean lIiiIiIlilli(int sectionBaseY) {
      return sectionBaseY <= -30 && sectionBaseY + 15 >= -64;
   }

   public static int iIlIlllllill(int worldTopInclusive) {
      return Math.min(worldTopInclusive, -30);
   }
}
