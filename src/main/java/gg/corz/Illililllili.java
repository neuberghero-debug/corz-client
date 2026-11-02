package gg.corz;

public final class Illililllili {
   public static final int IIIiIllIllIIiIllIl = 4;
   public static final int lIilIllIliIilIllIl = 0;
   public static final int IlilIllIlllilIllIl = 1;
   public static final int iIIiIllIlIlIiIllIl = 5;
   public static final int ililIllIlIiilIllIl = 2;
   public static final int liilIllIliiilIllIl = 3;

   public static boolean IilliliilIIi(boolean neighbourStairsComplete) {
      return !neighbourStairsComplete;
   }

   public static boolean iliIiiliiiii(boolean wantTop, int clickedSideOrdinal, double hitYFraction) {
      return IliIlllilIi(clickedSideOrdinal, hitYFraction) == wantTop;
   }

   private Illililllili() {
   }

   public static boolean IliIlllilIi(int clickedSideOrdinal, double hitYFraction) {
      if (clickedSideOrdinal == 0) {
         return true;
      } else {
         return clickedSideOrdinal == 1 ? false : hitYFraction > 0.5;
      }
   }

   public static double lIiiIiIlilli(boolean topHalf) {
      return topHalf ? 0.78 : 0.22;
   }

   public static int liiiIIllIl(float yaw) {
      long var2 = 1404377988455091102L;
      var2 ^= ((long)((int)Math.floor((double)yaw / 90.0 + 0.5) & 3) << 32 ^ var2) & -1L << 32;

      return switch ((int)(var2 >>> 32)) {
         case 0 -> 3;
         case 1 -> 4;
         case 2 -> 2;
         default -> 5;
      };
   }

   public static float iIlIlllllill(int facingOrdinal) {
      return switch (facingOrdinal) {
         case 2 -> 180.0F;
         case 3 -> 0.0F;
         case 4 -> 90.0F;
         case 5 -> -90.0F;
         default -> 0.0F;
      };
   }
}
