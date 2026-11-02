package gg.corz;

import net.minecraft.class_3532;

public final class lilllliillll {
   public static float liiiIIllIl(float fraction, float target, float maxStep, float minStep, float cur) {
      float var5 = class_3532.method_15393(target - fraction);
      float var6 = Math.abs(var5);
      if (var6 < 1.0E-4F) {
         return fraction;
      } else {
         float var7 = var6 * maxStep;
         if (var7 > minStep) {
            var7 = minStep;
         }

         if (var7 < cur) {
            var7 = cur;
         }

         if (var7 > var6) {
            var7 = var6;
         }

         return fraction + Math.copySign(var7, var5);
      }
   }

   public static float IliIlllilIi(float target, float cur, float maxStep) {
      float var3 = class_3532.method_15393(cur - target);
      if (var3 > maxStep) {
         var3 = maxStep;
      } else if (var3 < -maxStep) {
         var3 = -maxStep;
      }

      return target + var3;
   }

   private lilllliillll() {
   }

   public static float iIlIlllllill(long amp, float axis, int tick) {
      double var4 = (double)amp * 0.5 + (double)tick * 7.13;
      double var6 = 0.6 * Math.sin(var4) + 0.4 * Math.sin(var4 * 2.3 + 1.1);
      return (float)((double)axis * var6);
   }
}
