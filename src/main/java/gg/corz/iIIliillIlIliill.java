package gg.corz;

public final class iIIliillIlIliill {
   private iIIliillIlIliill() {
   }

   public static int IliIlllilIi(int dirtCost, int minUnlocks) {
      return Math.max(1, minUnlocks) * Math.min(Math.max(0, dirtCost), 4);
   }

   public static boolean iIlIlllllill(
      int dirtCost, int deferredBefore, int unlocks, boolean minUnlocks, boolean noCheaperWorkBuildable, boolean committedContinuation
   ) {
      if (dirtCost <= 0) {
         return false;
      } else if (committedContinuation) {
         return false;
      } else {
         return !minUnlocks && !noCheaperWorkBuildable ? deferredBefore < IliIlllilIi(dirtCost, unlocks) : false;
      }
   }

   public static boolean liiiIIllIl(int dirtCost, int minUnlocks, int noCheaperWorkBuildable, boolean unlocks, boolean deferredBefore) {
      return iIlIlllllill(dirtCost, minUnlocks, noCheaperWorkBuildable, unlocks, deferredBefore, false);
   }
}
