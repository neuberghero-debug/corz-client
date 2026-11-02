package gg.corz;

public final class lIiiIIlliIiiIIll {
   public static final double liilIlllll = 1.0;
   public static final double lIIiIlllll = 6.0;
   public static final double iiilIlllll = 3.0;
   public static final double IlIiIlllll = 8.0;
   public static final double iIIiIlllll = 4.0;
   public static final double IIIiIlllll = 2.0;

   public static boolean IliIlllilIi(int recentreUnlocks, int hereConfirms, lIliiIIliIliiIIl bestElsewhere) {
      long var4 = -100353316132115379L;
      var4 ^= ((long)(Math.max(0, recentreUnlocks) + Math.max(0, hereConfirms)) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) <= 0) {
         return false;
      } else {
         return bestElsewhere == null ? true : new lIliiIIliIliiIIl(0L, (int)(var4 >>> 32), 0.0, 0, 0, 0, 0, 0).liiiIIllIl() >= bestElsewhere.liiiIIllIl();
      }
   }

   public static lIliiIIliIliiIIl iIlIlllllill(lIliiIIliIliiIIl a, lIliiIIliIliiIIl b) {
      if (a == null) {
         return b;
      } else if (b == null) {
         return a;
      } else {
         double var2 = a.liiiIIllIl();
         double var4 = b.liiiIIllIl();
         if (Math.abs(var2 - var4) > 1.0E-9) {
            return var2 > var4 ? a : b;
         } else if (a.IlIlllIlilIl() != b.IlIlllIlilIl()) {
            return a.IlIlllIlilIl() < b.IlIlllIlilIl() ? a : b;
         } else {
            return a.iliIiiliiiii() <= b.iliIiiliiiii() ? a : b;
         }
      }
   }

   public static boolean liiiIIllIl(int nextDelta, int previousDelta) {
      return nextDelta != 0 && previousDelta != 0 && Integer.signum(nextDelta) != Integer.signum(previousDelta);
   }

   public static String IilliliilIIi(lIliiIIliIliiIIl runnerUp, lIliiIIliIliiIIl stayed, boolean chosen) {
      return lIiiIiIlilli<"lIiiIiIlilli","l8Cvb5HSXKx8A0U5DZPMZsUiUBM5YJsI/pRuRmdQQHlksnA=">()
         + (runnerUp == null ? lIiiIiIlilli<"lIiiIiIlilli","eB+u9yeuorQcoJUsLXL6PW7GZsEakATlb8qlmQfVm1M=">() : runnerUp.iIlIlllllill())
         + lIiiIiIlilli<"lIiiIiIlilli","X5MaEd/oj/EL6ITvlrQvpRZ3dnxOLVp3e7hptH+QDhrUGeniSkG3">()
         + (stayed == null ? lIiiIiIlilli<"lIiiIiIlilli","eB+u9yeuorQcoJUsLXL6PW7GZsEakATlb8qlmQfVm1M=">() : stayed.iIlIlllllill())
         + lIiiIiIlilli<"lIiiIiIlilli","QQmY7FfEaW8VwXDID6vKXt51TRsyv1gItgyEF0IwPg2j3B0lIdnj">()
         + (
            chosen
               ? lIiiIiIlilli<"lIiiIiIlilli","HW9jgQ5A15Lqtb1QH9Kf9bCu1VMIB4Em/iFsZqDqC5c=">()
               : lIiiIiIlilli<"lIiiIiIlilli","mLpWtfsauy4W9M78TldpqZFb6XRTL9V963jTcpB0tFA=">()
         );
   }

   private lIiiIIlliIiiIIll() {
   }
}
