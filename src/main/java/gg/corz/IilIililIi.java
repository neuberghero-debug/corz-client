package gg.corz;

public final class IilIililIi {
   private static final double liiIIiiiiiIIii = Math.PI / 180.0;

   public static double[] IliIlllilIi(double sideways, double forward, double yawDegrees, float speed) {
      double var7 = sideways * sideways + forward * forward;
      if (var7 < 1.0E-7) {
         return new double[]{0.0, 0.0};
      } else {
         double var9 = yawDegrees / (var7 > 1.0 ? Math.sqrt(var7) : 1.0);
         double var11 = sideways * var9;
         double var13 = forward * var9;
         double var15 = Math.sin((double)speed * (Math.PI / 180.0));
         double var17 = Math.cos((double)speed * (Math.PI / 180.0));
         return new double[]{var11 * var17 - var13 * var15, var13 * var17 + var11 * var15};
      }
   }

   private IilIililIi() {
   }
}
