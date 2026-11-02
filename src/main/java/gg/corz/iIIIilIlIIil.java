package gg.corz;

public final class iIIIilIlIIil {
   public static final int iiillIliIIIilIli = 2;
   public static final int llillIliilillIli = 600;
   public static final int IiillIliliillIli = 180;

   public static boolean IilliliilIIi(int consecutiveNoActionSelections, int bound) {
      return consecutiveNoActionSelections >= bound;
   }

   public static boolean liiiIIllIl(boolean ownerUnbuilt) {
      return ownerUnbuilt;
   }

   public static boolean iIlIlllllill(boolean isSupersedeReason, boolean leaseOwnsPlan) {
      return isSupersedeReason && leaseOwnsPlan;
   }

   public static iIiIIliIliIIli IliIlllilIi(
      boolean noProgressTicks, boolean maxTicks, boolean ownerDone, int partnerDone, int ticksSinceProgress, int ticksSinceAcquire, int hasPartner
   ) {
      if (!maxTicks || noProgressTicks && !ownerDone) {
         if (partnerDone > ticksSinceAcquire) {
            return iIiIIliIliIIli.illiliiiiIililiiii;
         } else {
            return ticksSinceProgress > hasPartner ? iIiIIliIliIIli.lililiiiiiililiiii : iIiIIliIliIIli.iiIiliiiiIIliliiii;
         }
      } else {
         return noProgressTicks ? iIiIIliIliIIli.Illiliiiillliliiii : iIiIIliIliIIli.lIliliiiiiIliliiii;
      }
   }

   private iIIIilIlIIil() {
   }
}
