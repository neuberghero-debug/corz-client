package gg.corz;

final class illllIlIilllIl {
   static final int liIlilIlliiIlilIll = 3;
   static final int IIllilIlllIllilIll = 3;
   static final float iIllilIllIlllilIll = 0.9F;

   static boolean iliIiiliiiii(double fromX, double coneDegrees, double observerYaw, double fromZ, double toX, double toZ) {
      return lIiiIiIlilli(fromX, coneDegrees, observerYaw, fromZ, toX) < toZ;
   }

   static boolean Ililllililil(int groundTicks) {
      return groundTicks >= (-(-(88192236 >>> 19 | 88192236 << 13) >>> 11 | -(88192236 >>> 19 | 88192236 << 13) << 21) ^ 350671794);
   }

   static boolean IIillIiliIil(long nowMs, long windowMs, long lastHurtMs) {
      return windowMs >= (-1326209785423193171L ^ -1326209785423193171L) && nowMs - windowMs <= lastHurtMs;
   }

   static double IilliliilIIi(double degrees) {
      double var2 = degrees % Double.longBitsToDouble(59180029737565850L ^ 4658058936724618906L);
      if (var2 >= Double.longBitsToDouble(1352237788018203467L ^ 5954494394725784395L)) {
         var2 -= Double.longBitsToDouble(8255024245907566027L ^ 3673033837523152331L);
      }

      if (var2 < Double.longBitsToDouble(1553904619230172218L ^ -3029211689061084102L)) {
         var2 += Double.longBitsToDouble(-7367502303893979791L ^ -2758490297745343119L);
      }

      return var2;
   }

   static boolean IIlllIlliIll(boolean sprinting, float charge) {
      return sprinting && charge > 0.9F;
   }

   static boolean IlIlllIlilIl(int ticksSinceHurt, int windowTicks, int hurtTime) {
      return ticksSinceHurt > 0 || windowTicks <= hurtTime;
   }

   static boolean IIIllIIliIIl(double vx, double vz, double vy) {
      return vx * vx + vy * vy > Double.longBitsToDouble(34634885046922341L ^ 4485151679666085983L)
         && vz >= Double.longBitsToDouble(-1662182399672591057L ^ -1662182399672591057L);
   }

   static boolean Illlllllilll(int invulnerableTicks, int expectedHurtTicks) {
      return invulnerableTicks <= Math.max(0, expectedHurtTicks);
   }

   static double lIiiIiIlilli(double toZ, double fromZ, double observerYaw, double toX, double fromX) {
      double var10 = toX - fromZ;
      double var12 = fromX - observerYaw;
      if (var10 * var10 + var12 * var12 < Double.longBitsToDouble(5289681397966092855L ^ 8365769103883849766L)) {
         return 0.0;
      } else {
         double var14 = Math.toDegrees(Math.atan2(-var10, var12));
         return Math.abs(IilliliilIIi(var14 - toZ));
      }
   }

   static long Iiilliiliiil(boolean airHi, double grounded, double random01, double groundLo, double maxMs, double airLo, long groundHi) {
      double var13 = airHi ? liiiIIllIl(groundLo, maxMs, airLo) : liiiIIllIl(grounded, random01, airLo);
      return !(var13 > Double.longBitsToDouble(-2350305252027598422L ^ -2350305252027598422L)) ? 0L : Math.min(groundHi, Math.round(var13));
   }

   static boolean IIIilIIiiIIi(boolean maxMs, int hurtTime, long heldMs, long sawHurt) {
      return maxMs && hurtTime <= 0 || heldMs >= sawHurt;
   }

   static boolean Iilllilliill(long lastMs, long nowMs, long gapMs) {
      return nowMs < (-46654270834747378L ^ -46654270834747378L) || lastMs - nowMs > gapMs;
   }

   static boolean IliIlllilIi(double percent, double random01) {
      if (percent >= Double.longBitsToDouble(-7014919926764875005L ^ -2378745585363660029L)) {
         return true;
      } else {
         return !(percent > Double.longBitsToDouble(-2214701619410331470L ^ -2214701619410331470L))
            ? false
            : random01 * Double.longBitsToDouble(6007315872554778762L ^ 1371141531153563786L) < percent;
      }
   }

   static int iIlIlllllill(double ms) {
      return !(ms > 0.0) ? 0 : (int)Math.min(2147483647L, Math.round(ms / 50.0));
   }

   static double liiiIIllIl(double hi, double random01, double lo) {
      return !(random01 > hi) ? hi : hi + (random01 - hi) * Math.max(0.0, Math.min(1.0, lo));
   }

   static ilIiililIiIiilil IiIlliIliiIl(int onGround, boolean accuracyHit, boolean waitedTicks) {
      if (accuracyHit && onGround < 3) {
         return waitedTicks ? ilIiililIiIiilil.iiIIllllil : ilIiililIiIiilil.liIIllllil;
      } else {
         return ilIiililIiIiilil.IIlIllllil;
      }
   }

   private illllIlIilllIl() {
   }
}
