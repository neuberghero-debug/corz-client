package gg.corz;

import java.util.Locale;

public final class iiiiIiilIIIIliil {
   public static float liiiIIllIl(float currentYaw, float desiredWrappedYaw) {
      return currentYaw + IliIlllilIi(desiredWrappedYaw - currentYaw);
   }

   public static float IliIlllilIi(float degrees) {
      float var1 = degrees % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public static String iliIiiliiiii(String owner, float desiredWrapped, float chosenContinuous, float currentYaw) {
      return String.format(
         Locale.ROOT,
         IIIllIIliIIl<"IIIllIIliIIl","94rbGRz2narX8QHqA63PKu8nUyPWpXZYKue7wTz7bet3n8UaxlF1ohH6kR3UkiJiRX+F5+p9TSrJMRw6PGb3tGU+2fAUU74CZZPd6XiJcWUnNbqMJwr+Ji6GdKKmK4eXLSwWCU6bJ5S2GS+rTf3FfGzQl1nsgsySCr2ie30wB181wKW4Zr+7q52T+eKDEtLZ2cGPqH70gZU/rZTZdSs=">(),
         owner,
         desiredWrapped,
         chosenContinuous,
         currentYaw,
         iIlIlllllill(desiredWrapped, chosenContinuous),
         currentYaw - desiredWrapped,
         IilliliilIIi(desiredWrapped, chosenContinuous)
      );
   }

   public static float iIlIlllllill(float desiredWrappedYaw, float currentYaw) {
      return IliIlllilIi(currentYaw - desiredWrappedYaw);
   }

   public static int IilliliilIIi(float rawRequestedYaw, float currentYaw) {
      return (int)Math.floor((double)(Math.abs(currentYaw - liiiIIllIl(rawRequestedYaw, currentYaw)) / 360.0F));
   }

   public static boolean lIiiIiIlilli(float requestedContinuousYaw, float currentYaw) {
      return Math.abs(currentYaw - requestedContinuousYaw) <= 180.001F;
   }

   private iiiiIiilIIIIliil() {
   }
}
