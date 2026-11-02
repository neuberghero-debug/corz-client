package gg.corz;

public final class llIlIIiilIlIIi {
   public static final int IliliIililliliIili = 40;
   public static final int ililiIiliIiiliIili = 60;

   public static lIiiIilliIiiIill IliIlllilIi(int trialBlocks, boolean detectModified, int playerScore, boolean trialSpawnerOrVault) {
      long var5 = 7242308889181321019L;
      var5 ^= ((long)(!detectModified && trialBlocks < 40 ? 0 : 1) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) == 0) {
         return lIiiIilliIiiIill.Illililill;
      } else if (!trialSpawnerOrVault) {
         return lIiiIilliIiiIill.lIlililill;
      } else {
         return playerScore >= 60 ? lIiiIilliIiiIill.iIlililill : lIiiIilliIiiIill.lIlililill;
      }
   }

   private llIlIIiilIlIIi() {
   }
}
