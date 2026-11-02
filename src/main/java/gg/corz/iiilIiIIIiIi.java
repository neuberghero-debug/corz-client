package gg.corz;

public final class iiilIiIIIiIi {
   public static final int lllilIIIlillilIIIl = 2;
   private static long IililIIIllililIIIl = Long.MIN_VALUE;

   public static void liiiIIllIl(long tick) {
      IililIIIllililIIIl = tick;
   }

   public static boolean IliIlllilIi(long tick) {
      return IililIIIllililIIIl != tick;
   }

   private iiilIiIIIiIi() {
   }

   public static void iIlIlllllill() {
      IililIIIllililIIIl = Long.MIN_VALUE;
   }
}
