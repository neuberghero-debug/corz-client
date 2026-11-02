package gg.corz;

public final class iilIIillIIiIIill {
   public static final int iiIIillill = 3;

   public static lIIlillliIIlilll liiiIIllIl(long tick, long releaseTick) {
      if (releaseTick == Long.MIN_VALUE) {
         return lIIlillliIIlilll.iiillIlill;
      } else if (tick == releaseTick) {
         return lIIlillliIIlilll.IIIilIlill;
      } else {
         return tick > releaseTick ? lIIlillliIIlilll.lIIilIlill : lIIlillliIIlilll.iiillIlill;
      }
   }

   public static long IliIlllilIi(long strikeTick) {
      return strikeTick == Long.MIN_VALUE ? Long.MIN_VALUE : strikeTick - 3L;
   }

   private iilIIillIIiIIill() {
   }
}
