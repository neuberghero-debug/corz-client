package gg.corz;

public final class IllIIlIilllIIlIi {
   public static final double IIIliiiiil = 0.03;
   public static final long iiiIiiiiil = 90L;

   public static boolean liiiIIllIl(double after, double before) {
      return after < before - 0.03;
   }

   private IllIIlIilllIIlIi() {
   }

   public static long IliIlllilIi(long lastPositionUntil, long now, long delayMs) {
      long var6 = Math.max(lastPositionUntil, delayMs);
      return Math.min(var6 + 90L, lastPositionUntil + Math.max(0L, now));
   }
}
