package gg.corz;

public final class iIIIIIlIlIIIIl {
   public static int liiiIIllIl(
      double[] cycle, double[] landIndex, int rel, int earliest, int rT, int windowOpenIndex, int relAfterCycleWithKick, int ticksSinceLastBlast, double[] vy
   ) {
      long var17 = -8475610906259811676L;
      long var19 = 3224949774263310251L;
      if (cycle != null && landIndex != null && vy != null) {
         var17 ^= ((long)Math.min(ticksSinceLastBlast - 1, Math.min(cycle.length - 1, Math.min(landIndex.length - 1, vy.length - 1))) << 32 ^ var17)
            & -1L << 32;

         for (long var22 = var17 ^ ((long)Math.max(0, rel) ^ var17) & -1L >>> 32;
            (int)var22 <= (int)(var22 >>> 32);
            var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32
         ) {
            double var11 = (int)var22 + 1 < cycle.length ? cycle[(int)var22 + 1] : cycle[(int)var22];
            long var13 = (long)rT + (long)((int)var22);
            var19 ^= ((long)(var13 > 2147483647L ? Integer.MAX_VALUE : (int)var13) << 32 ^ var19) & -1L << 32;
            iilIIlIlIIiIIlIl var16 = IliIlllilIi(
               cycle[(int)var22],
               landIndex[(int)var22],
               (int)var22 >= earliest,
               (int)(var19 >>> 32),
               windowOpenIndex,
               relAfterCycleWithKick,
               ticksSinceLastBlast - (int)var22,
               var11,
               vy[(int)var22]
            );
            if (var16 != iilIIlIlIIiIIlIl.iIliIiilIl) {
               return (int)var22;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private iIIIIIlIlIIIIl() {
   }

   public static iilIIlIlIIiIIlIl IliIlllilIi(
      double ticksSinceLastBlast,
      double cycle,
      boolean rT,
      int relNow,
      int relAfterCycleWithKick,
      int landIndex,
      int vyNow,
      double windowOpenNow,
      double relNext
   ) {
      long var14 = 7275012637928664968L;
      var14 ^= ((long)(relNow >= relAfterCycleWithKick && landIndex < vyNow ? 1 : 0) << 32 ^ var14) & -1L << 32;
      if ((int)(var14 >>> 32) == 0) {
         return iilIIlIlIIiIIlIl.iIliIiilIl;
      } else if (rT && ticksSinceLastBlast >= 1.5 && ticksSinceLastBlast <= 3.5 && cycle <= 0.15 && relNext >= 1.0) {
         return iilIIlIlIIiIIlIl.IIliIiilIl;
      } else {
         return !(ticksSinceLastBlast >= 1.0) || !(windowOpenNow < 1.0) && 1 + landIndex < vyNow - 1
            ? iilIIlIlIIiIIlIl.iIliIiilIl
            : iilIIlIlIIiIIlIl.lIliIiilIl;
      }
   }
}
