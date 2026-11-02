package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_2338;

public final class IliliIillliliIil {
   static final int lIIIlilIil = 9;
   private static final int IiiiIilIil = 16;
   private static final int[] liliIilIil = new int[]{-1, 0, 1, 0};
   public static final double IlliIilIil = 2.5;
   public static final double IIliIilIil = 1.7;
   private static final int iiiiIilIil = 64;
   public static final double llliIilIil = 0.6;
   public static final double lIliIilIil = 1.8;
   private static final int[] iiliIilIil = new int[]{1, 1, -1, -1};
   static final int iIIIlilIil = 40;
   private static final int iliiIilIil = 8;
   public static final double illiIilIil = 1.5;
   private static final int IliiIilIil = 2;
   public static final int ilIiIilIil = 12;
   public static final double iiIiIilIil = 2.8;
   private static final int[] IIiiIilIil = new int[]{1, -1, 1, -1};
   private static final int liiiIilIil = 32;
   private static final int iIiiIilIil = 1;
   public static final double iIliIilIil = 1.5;
   public static final double IiIiIilIil = Math.sqrt(2.0);
   public static final double liIiIilIil = 2.0;
   private static final int lliiIilIil = 4;
   private static final int IIIIlilIil = 128;
   public static final int llIiIilIil = 4;
   public static final int IlIiIilIil = 3;
   private static final int[] IiliIilIil = new int[]{0, 1, 0, -1};
   private static final IllIllllllIlll[] lIiiIilIil = IllIllllllIlll.values();

   private static long IIIllIIliIIl(long key) {
      return 1L << (int)(key * (-956386711053328245L ^ 7821981670613539998L) >>> (~-960239709 * -93 ^ 892020398));
   }

   private IliliIillliliIil() {
   }

   public static iiillliIIIilli liiiIIllIl(ilIliiIlIiIliiIl min, class_2338 start, Predicate<class_2338> maxExpanded, class_2338 goal, class_2338 g, int max) {
      return iIlIlllllill(min, start, maxExpanded, null, goal, g, max);
   }

   public static iIiIIlllIliIIlll lIiiIiIlilli(
      ilIliiIlIiIliiIl g, class_2338 start, Predicate<class_2338> min, class_2338 goal, class_2338 max, class_2338 o, int maxExpanded, illlilIlIillilIl hint
   ) {
      return new iIiIIlllIliIIlll(g, start, min, goal, max, o, maxExpanded, hint == null ? illlilIlIillilIl.llIllilIll : hint);
   }

   static int iliIiiliiiii(boolean submerged, boolean air, int unlimited) {
      return submerged && !air
         ? 1
            + Math.max(
               0,
               Math.min(
                  -((1699497295 << 25 | 1699497295 >>> 7) * -799063683) ^ 1260550809,
                  unlimited / ((-(-1685164493 >>> 25 | -1685164493 << 7) << 27 | -(-1685164493 >>> 25 | -1685164493 << 7) >>> 5) ^ -33 ^ 1715058886)
               )
            )
         : 0;
   }

   public static iiillliIIIilli iIlIlllllill(
      ilIliiIlIiIliiIl g, class_2338 hint, Predicate<class_2338> maxExpanded, class_2338 min, class_2338 start, class_2338 max, int goal
   ) {
      return IilliliilIIi(g, hint, maxExpanded, min, start, max, goal, illlilIlIillilIl.llIllilIll);
   }

   public static boolean IliIlllilIi(ilIliiIlIiIliiIl g, int x, int z, int y) {
      return g.IliIlllilIi(x, z - 1, y)
         && !g.IliIlllilIi(x, z, y)
         && !g.IliIlllilIi(x, z + 1, y)
         && !g.IilliliilIIi(x, z - 1, y)
         && !g.IilliliilIIi(x, z, y)
         && !g.IilliliilIIi(x, z + 1, y);
   }

   public static iiillliIIIilli IilliliilIIi(
      ilIliiIlIiIliiIl g, class_2338 min, Predicate<class_2338> maxExpanded, class_2338 max, class_2338 goal, class_2338 start, int o, illlilIlIillilIl hint
   ) {
      iIiIIlllIliIIlll var8 = lIiiIiIlilli(g, min, maxExpanded, max, goal, start, o, hint);

      iiillliIIIilli var9;
      while ((var9 = var8.lIiiIiIlilli(Integer.MAX_VALUE)) == null) {
         if (var8.liiiIIllIl() >= o) {
            return var8.IilliliilIIi();
         }
      }

      return var9;
   }
}
