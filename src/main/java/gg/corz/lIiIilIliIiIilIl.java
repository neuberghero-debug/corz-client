package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_2338;

public final class lIiIilIliIiIilIl {
   private static final lIIIiiIIIi[] IIilillIll = lIIIiiIIIi.values();
   private static final byte lIilillIll = 1;
   private static final byte IlilillIll = 4;
   private static final byte llilillIll = 8;
   public static final int IillillIll = 4;
   private static final int[] iillillIll = new int[]{-1, 0, 1, 0};
   public static final int illlillIll = 3;
   private static final byte iIilillIll = 2;
   private static final int[] lillillIll = new int[]{0, 1, 0, -1};

   public static IlIIiIillIIiIi liiiIIllIl(iIlIllIllIll start, class_2338 maxExpanded, Predicate<class_2338> min, class_2338 g, class_2338 max, int goal) {
      return iIlIlllllill(start, maxExpanded, min, null, g, max, goal);
   }

   public static boolean IliIlllilIi(iIlIllIllIll z, int y, int x, int g) {
      return z.IliIlllilIi(y, x - 1, g) && !z.IliIlllilIi(y, x, g) && !z.IliIlllilIi(y, x + 1, g);
   }

   public static IlIIiIillIIiIi iIlIlllllill(
      iIlIllIllIll hint, class_2338 goal, Predicate<class_2338> max, class_2338 min, class_2338 g, class_2338 start, int maxExpanded
   ) {
      return new IIiiIllllIiiIlll(hint, max, min, g, start).IliIlllilIi(goal, maxExpanded);
   }

   private lIiIilIliIiIilIl() {
   }

   private static long IilliliilIIi(long key) {
      return 1L
         << (int)(
            key * (4019324829697544040L ^ -6201180596319947907L)
               >>> ((-1337167344 * -1090785345 * 1431655765 >>> 9 | -1337167344 * -1090785345 * 1431655765 << 23) ^ 1477473988)
         );
   }
}
