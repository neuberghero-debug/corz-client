package gg.corz;

public final class llllIIililllIIil {
   public static final double lIIIllIIil = 900000.0;
   public static final int IIIIllIIil = 2;

   public static IiiiIlllliiiIlll iliIiiliiiii(
      boolean candidateSurvivorsIfVictimPlaced, int victimWasHeldForThisCandidate, int victimSurvivorsIfCandidatePlaced
   ) {
      long var5 = -7810044331653596141L;
      if (!candidateSurvivorsIfVictimPlaced) {
         return IiiiIlllliiiIlll.lillllIill;
      } else {
         var5 ^= ((long)(victimWasHeldForThisCandidate > 0 ? 1 : 0) << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)(victimSurvivorsIfCandidatePlaced > 0 ? 1 : 0) ^ var5) & -1L >>> 32;
         if ((int)(var5 >>> 32) != 0 && (int)var5 == 0) {
            return IiiiIlllliiiIlll.illlllIill;
         } else if ((int)var5 != 0 && (int)(var5 >>> 32) == 0) {
            return IiiiIlllliiiIlll.IillllIill;
         } else if ((int)(var5 >>> 32) != 0) {
            return victimWasHeldForThisCandidate >= victimSurvivorsIfCandidatePlaced ? IiiiIlllliiiIlll.illlllIill : IiiiIlllliiiIlll.IillllIill;
         } else {
            return IiiiIlllliiiIlll.lillllIill;
         }
      }
   }

   public static boolean IilliliilIIi(int solutionsAfter, int candidateIsCompoundPartner, boolean solutionsBefore) {
      return !solutionsBefore && iIlIlllllill(solutionsAfter, candidateIsCompoundPartner);
   }

   public static boolean IliIlllilIi(int viableSolutions) {
      return viableSolutions >= 0 && viableSolutions <= 2;
   }

   public static boolean iIlIlllllill(int solutionsBefore, int solutionsAfter) {
      return solutionsBefore > 0 && solutionsBefore <= 2 && solutionsAfter <= 0;
   }

   public static boolean lIiiIiIlilli(boolean victimWasHeldForThisCandidate) {
      return victimWasHeldForThisCandidate;
   }

   public static double liiiIIllIl(int viableSolutions, boolean directionalOrCompound) {
      long var5 = -3181547094316987551L;
      if (directionalOrCompound && IliIlllilIi(viableSolutions)) {
         var5 ^= ((long)(2 - Math.max(0, Math.min(2, viableSolutions)) + 1) << 32 ^ var5) & -1L << 32;
         double var3 = 300000.0;
         return -Math.min(900000.0, (double)((int)(var5 >>> 32)) * var3);
      } else {
         return 0.0;
      }
   }

   private llllIIililllIIil() {
   }
}
