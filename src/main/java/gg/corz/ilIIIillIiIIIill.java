package gg.corz;

public final class ilIIIillIiIIIill {
   public static boolean IilliliilIIi(boolean whiff, boolean ready, boolean ownTarget) {
      return whiff || ready && !ownTarget;
   }

   public static int IliIlllilIi(int pingMs) {
      return Math.max(0, (pingMs + 25) / 50);
   }

   public static boolean liiiIIllIl(int pingTicks, int blockDelayTicks, int useTicks) {
      return pingTicks + blockDelayTicks >= useTicks;
   }

   public static float lIiiIiIlilli(double min, double unit, double max) {
      double var6 = Math.min(min, unit);
      double var8 = Math.max(min, unit);
      return (float)(var6 + (var8 - var6) * max);
   }

   private ilIIIillIiIIIill() {
   }

   public static boolean iIlIlllllill(double facingZ, double facingX, double maxAngleDegrees, double toAttackerX, double toAttackerZ) {
      double var10 = Math.sqrt(maxAngleDegrees * maxAngleDegrees + toAttackerX * toAttackerX);
      double var12 = Math.sqrt(facingZ * facingZ + facingX * facingX);
      double var14 = !(var10 < 1.0E-9) && !(var12 < 1.0E-9) ? (maxAngleDegrees * facingZ + toAttackerX * facingX) / (var10 * var12) : 0.0;
      double var16 = Math.toDegrees(Math.acos(Math.max(-1.0, Math.min(1.0, var14))));
      return var16 <= toAttackerZ;
   }
}
