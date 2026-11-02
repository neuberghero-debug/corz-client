package gg.corz;

public final class liliIiiliiliIiil {
   public static final int illiIIilil = 80;
   public static final double IiliIIilil = 0.05;

   public static boolean liiiIIllIl(int reachedTick, int tick) {
      return reachedTick - tick >= 80;
   }

   public static boolean IliIlllilIi(long placedTarget, boolean ownerTarget, long declaredPlatformTarget) {
      return declaredPlatformTarget == placedTarget || ownerTarget;
   }

   public static boolean IilliliilIIi(int firstMissingTick, int lastProgressTick, int tick) {
      return lastProgressTick >= 0 && (firstMissingTick - lastProgressTick > 80 || firstMissingTick - tick > 20);
   }

   private liliIiiliiliIiil() {
   }

   public static boolean iIlIlllllill(int grounded, int plannedTopY, boolean feetY) {
      return grounded > -9000 && feetY && plannedTopY >= grounded;
   }

   public static boolean iliIiiliiiii(int stagnantTicks) {
      return stagnantTicks > 24;
   }

   public static boolean lIiiIiIlilli(int routeCommits, int tick, int stepStartedTick) {
      return routeCommits - tick > 120 || stepStartedTick > 2;
   }

   public static lIilIllliIilIlll IIIllIIliIIl(lIilIllliIilIlll onGround, double prev, boolean y) {
      if (!y) {
         return onGround;
      } else if (onGround.iIlIlllllill() == Double.NEGATIVE_INFINITY) {
         return new lIilIllliIilIlll(prev, 0);
      } else {
         return prev > onGround.iIlIlllllill() + 0.05
            ? new lIilIllliIilIlll(prev, 0)
            : new lIilIllliIilIlll(onGround.iIlIlllllill(), onGround.IilliliilIIi() + 1);
      }
   }
}
