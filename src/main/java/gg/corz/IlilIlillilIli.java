package gg.corz;

public final class IlilIlillilIli {
   public static int liiiIIllIl(int d) {
      return Math.max(1, Math.min(4, d));
   }

   public static int iIlIlllllill(boolean wantedSubtract, boolean actualSubtract) {
      return wantedSubtract == actualSubtract ? 0 : 1;
   }

   public static int lIiiIiIlilli(boolean wantedOn, boolean actualOn) {
      return wantedOn == actualOn ? 0 : 1;
   }

   private IlilIlillilIli() {
   }

   public static int IilliliilIIi(boolean wantedOpen, boolean actualOpen) {
      return wantedOpen == actualOpen ? 0 : 1;
   }

   public static int IliIlllilIi(int actualDelay, int wantedDelay) {
      long var4 = 196679314513156160L;
      var4 ^= ((long)liiiIIllIl(actualDelay) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)liiiIIllIl(wantedDelay) ^ var4) & -1L >>> 32;
      return (((int)var4 - (int)(var4 >>> 32)) % 4 + 4) % 4;
   }

   public static boolean iliIiiliiiii(int hitYFrac, double clickedSide) {
      if (hitYFrac == 0) {
         return true;
      } else {
         return hitYFrac == 1 ? false : clickedSide > 0.5;
      }
   }
}
