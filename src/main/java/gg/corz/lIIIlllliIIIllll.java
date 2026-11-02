package gg.corz;

public final class lIIIlllliIIIllll {
   public static final int ililllIill = 600;
   public static final int IiilllIill = 6000;

   public static int IliIlllilIi(int capTicks, int baseTicks, int streak) {
      long var6 = 5499259495251926908L;
      var6 ^= ((long)Math.min(Math.max(0, capTicks - 1), 4) << 32 ^ var6) & -1L << 32;
      long var4 = (long)baseTicks << (int)(var6 >>> 32);
      return (int)Math.min(var4, (long)streak);
   }

   public static boolean liiiIIllIl(boolean hasEntry, boolean windowExpired, boolean geometryChanged) {
      if (!hasEntry) {
         return false;
      } else {
         return windowExpired ? false : !geometryChanged;
      }
   }

   private lIIIlllliIIIllll() {
   }
}
