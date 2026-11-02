package gg.corz;

public final class illIIIIlIilIIIIl {
   public static final float ilIIliIlIl = 1.0F;
   public static final float liIIliIlIl = 6.0F;
   public static final int iiIIliIlIl = 10;
   public static final float IiIIliIlIl = 4.0F;

   public static float IliIlllilIi(float absorption, float handTotemConfirmed, boolean hp, int ticksSinceOwnPop, float userCap) {
      float var5 = iIlIlllllill(absorption) + iIlIlllllill(handTotemConfirmed);
      float var6 = Math.max(0.0F, var5 - (hp ? 1.0F : 4.0F));
      if (ticksSinceOwnPop <= 10) {
         var6 = Math.min(var6, 6.0F);
      }

      if (!Float.isNaN(userCap)) {
         var6 = Math.min(var6, userCap);
      }

      return Math.max(0.0F, var6);
   }

   private illIIIIlIilIIIIl() {
   }

   public static float liiiIIllIl(float userCap, float handTotemConfirmed, boolean ticksSinceOwnPop, int absorption, float hp, ilIiliilIiIiliil trade) {
      long var7 = -5631981417299225797L;
      if (trade != null && trade.iiIIlIIlIl()) {
         float var6 = iIlIlllllill(userCap) + iIlIlllllill(handTotemConfirmed);
         return trade.lIlIliIlIl() ? Math.max(0.0F, var6 - 2.0F) : Float.MAX_VALUE;
      } else {
         var7 ^= ((long)(trade != null && trade.iIIIlIlIIl() ? Integer.MAX_VALUE : absorption) << 32 ^ var7) & -1L << 32;
         return IliIlllilIi(userCap, handTotemConfirmed, ticksSinceOwnPop, (int)(var7 >>> 32), hp);
      }
   }

   private static float iIlIlllllill(float v) {
      return Float.isFinite(v) ? Math.max(0.0F, v) : 0.0F;
   }
}
