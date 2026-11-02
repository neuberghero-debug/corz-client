package gg.corz;

public final class iiiiiliIIIIIii {
   public static String lIiiIiIlilli(IiIillIlliIillIl l) {
      return l == null ? "" : IilliliilIIi(l.iliIiiliiiii(), l.IlIlllIlilIl());
   }

   private iiiiiliIIIIIii() {
   }

   public static String IilliliilIIi(long secondsLeft, long price) {
      long var4 = Math.round((double)secondsLeft * 3600.0 / (double)Math.max(1L, price));
      String var6 = llIIilIiilIIilIi.iIlIlllllill(var4, var4 < 1000000L ? 0 : 2);
      return (var6.startsWith(IIIllIIliIIl<"IIIllIIliIIl","HH6PMMQMXoM9DDpmrx2tjlQE3/ngKdXzBwfRgVM=">()) ? var6.substring(1) : var6)
         + IIIllIIliIIl<"IIIllIIliIIl","cHtjrNA0RhPdvP9zcxGlpvn808nxTuqzvh/2yZsR">();
   }

   public static long IliIlllilIi(IiIillIlliIillIl scannedAtMs, long l, long nowMs) {
      if (scannedAtMs == null) {
         return 0L;
      } else {
         long var5 = Math.max(0L, nowMs - l) / 1000L;
         return Math.max(0L, scannedAtMs.IlIlllIlilIl() - var5);
      }
   }

   public static String liiiIIllIl(long nowMs, long scannedAtMs) {
      if (nowMs <= 0L) {
         return IIIllIIliIIl<"IIIllIIliIIl","4I8169/BIO+gIUW7ObFHsF8xFAUf9pS8uo6QUrP14LNs">();
      } else {
         long var4 = Math.max(0L, scannedAtMs - nowMs) / 1000L;
         return var4 < 60L
            ? IIIllIIliIIl<"IIIllIIliIIl","VMeUac+d3GWU2G4z7YW/ga8vPtpSrJuPqLy+6vCmchDzPWzc">()
            : iIIiIiilIlIiIiil.iIlIlllllill(var4 - var4 % 60L) + IIIllIIliIIl<"IIIllIIliIIl","5yDdaiuyEC9GSEK2HpY7VUs9OjasNFhh5OXLPx7/jcM=">();
      }
   }

   public static String iliIiiliiiii(IiIillIlliIillIl l, long scannedAtMs, long nowMs) {
      return l == null ? "" : IilliliilIIi(l.iliIiiliiiii(), IliIlllilIi(l, scannedAtMs, nowMs));
   }

   public static float iIlIlllllill(long secondsLeft) {
      return (float)Math.max(0.0, Math.min(1.0, (double)secondsLeft / 86400.0));
   }
}
