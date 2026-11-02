package gg.corz;

public final class IliiIIlllliiIIll {
   private IliiIIlllliiIIll() {
   }

   public static IiiiilIiliiiilIi IliIlllilIi(boolean chestPlaced, boolean kit, boolean spot) {
      if (chestPlaced) {
         return IiiiilIiliiiilIi.lillIilIIi;
      } else if (!kit) {
         return IiiiilIiliiiilIi.IIilIilIIi;
      } else {
         return spot ? IiiiilIiliiiilIi.iillIilIIi : IiiiilIiliiiilIi.lIilIilIIi;
      }
   }

   public static boolean liiiIIllIl(boolean step, boolean adopted, boolean openClickSent, int containerOpen) {
      return step && (adopted || openClickSent && containerOpen == ((-(-1558420524 * -125) >>> 1 | -(-1558420524 * -125) << 31) ^ 1382965059));
   }
}
