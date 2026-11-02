package gg.corz;

public final class IiIiIlllliIiIlll {
   private IiIiIlllliIiIlll() {
   }

   static double iIlIlllllill(double[] b, double[] a) {
      double var2 = Math.hypot(b[0], b[1]);
      double var4 = Math.hypot(a[0], a[1]);
      return !(var2 < 1.0E-9) && !(var4 < 1.0E-9) ? (b[0] * a[0] + b[1] * a[1]) / (var2 * var4) : -Double.MAX_VALUE;
   }

   public static int[] IliIlllilIi(int forward, int realYaw, float sentYaw, float strafe) {
      long var13 = -3758041108594726250L;
      long var15 = -5595906855512635554L;
      if (forward == 0 && realYaw == 0) {
         return new int[]{0, 0};
      } else {
         double[] var4 = liiiIIllIl((double)forward, (double)realYaw, sentYaw);
         var13 ^= (0L ^ var13) & -1L << 32;
         var13 ^= (0L ^ var13) & -1L >>> 32;
         double var7 = -Double.MAX_VALUE;
         var15 ^= (-4294967296L ^ var15) & -1L << 32;

         while ((int)(var15 >>> 32) <= 1) {
            for (var15 ^= ~var15 & -1L >>> 32; (int)var15 <= 1; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
               if ((int)(var15 >>> 32) != 0 || (int)var15 != 0) {
                  double var11 = iIlIlllllill(var4, liiiIIllIl((double)((int)var15), (double)((int)(var15 >>> 32)), strafe));
                  if (var11 > var7) {
                     var7 = var11;
                     var13 ^= ((long)((int)var15) << 32 ^ var13) & -1L << 32;
                     var13 ^= ((long)((int)(var15 >>> 32)) ^ var13) & -1L >>> 32;
                  }
               }
            }

            var15 += 4294967296L;
         }

         return new int[]{(int)(var13 >>> 32), (int)var13};
      }
   }

   static double[] liiiIIllIl(double strafe, double yawDeg, float forward) {
      double var5 = Math.toRadians((double)forward);
      double var7 = Math.sin(var5);
      double var9 = Math.cos(var5);
      return new double[]{strafe * var9 - yawDeg * var7, yawDeg * var9 + strafe * var7};
   }
}
