package gg.corz;

final class llIiIililIiIil {
   static final int ilIlIliIiIiIlIliIi = 9;
   static final double IlIlIliIillIlIliIi = 0.98;
   static final double lIIlIliIiiIIlIliIi = 0.2;
   static final double iiiIIliIiIIIlIliIi = 1.5;

   static int IliIlllilIi(boolean[] selected, int[] level, int mace) {
      long var8 = 2636757671764569114L;
      long var10 = -8692050291570125463L;
      long var12 = -2104559069556862410L;
      var8 ^= (-4294967296L ^ var8) & -1L << 32;
      var8 ^= ~var8 & -1L >>> 32;
      var10 ^= ((long)Math.min(Math.min(selected.length, level.length), 9) << 32 ^ var10) & -1L << 32;

      for (long var18 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
         if (selected[(int)var18]) {
            var12 ^= ((long)Math.max(0, level[(int)var18]) << 32 ^ var12) & -1L << 32;
            if ((int)(var12 >>> 32) > (int)var8 || (int)(var12 >>> 32) == (int)var8 && (int)var18 == mace) {
               var8 ^= ((long)((int)var18) << 32 ^ var8) & -1L << 32;
               var8 ^= ((long)((int)(var12 >>> 32)) ^ var8) & -1L >>> 32;
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   static double lIiiIiIlilli(double horizontalAngleDegrees) {
      double var2 = Math.max(0.0, Math.min(180.0, horizontalAngleDegrees));
      return Math.cos(Math.toRadians(var2));
   }

   static double Illlllllilll(
      double px, double minZ, double py, double dz, double minX, double maxX, double maxZ, double minY, double maxY, double dy, double pz, double dx
   ) {
      if (px >= maxZ && px <= dy && minZ >= minY && minZ <= pz && py >= maxY && py <= dx) {
         return 0.0;
      } else {
         double var24 = Math.sqrt(dz * dz + minX * minX + maxX * maxX);
         if (!(var24 > 1.0E-12)) {
            return Double.POSITIVE_INFINITY;
         } else {
            double[] var26 = new double[]{Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY};
            if (Iilllilliill(px, dz / var24, maxZ, dy, var26)
               && Iilllilliill(minZ, minX / var24, minY, pz, var26)
               && Iilllilliill(py, maxX / var24, maxY, dx, var26)) {
               return var26[0] >= 0.0 ? var26[0] : Double.POSITIVE_INFINITY;
            } else {
               return Double.POSITIVE_INFINITY;
            }
         }
      }
   }

   static boolean iliIiiliiiii(double dx, double cosLimit, double facingZ, double margin, double facingX, double dz) {
      double var12 = Math.sqrt(facingZ * facingZ + margin * margin);
      double var14 = var12 < 1.0E-5 ? 0.0 : (facingZ * dx + margin * cosLimit) / var12;
      return var14 >= facingX - dz;
   }

   static int iIlIlllllill(int pingMs) {
      return pingMs <= 0 ? 0 : (pingMs + 25) / 50;
   }

   static boolean IlIillIiilIi(long now, long restoreAt, long quietUntil) {
      return now >= restoreAt && IIIilIIiiIIi(now, quietUntil);
   }

   static int liiiIIllIl(boolean[] selected, int match) {
      long var4 = 6408041995908218683L;
      var4 ^= ((long)Math.min(selected.length, 9) << 32 ^ var4) & -1L << 32;
      if (match >= 0 && match < (int)(var4 >>> 32) && selected[match]) {
         return match;
      } else {
         for (long var7 = var4 ^ (0L ^ var4) & -1L >>> 32; (int)var7 < (int)(var7 >>> 32); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            if (selected[(int)var7]) {
               return (int)var7;
            }
         }

         return -1;
      }
   }

   static boolean Ililllililil(int foreignOwnerBusy, int selected, boolean setSlot) {
      return foreignOwnerBusy == selected || setSlot;
   }

   static boolean IilliliilIIi(int useTicks, int blockDelayTicks, int pingTicks) {
      return useTicks >= 0 && useTicks + Math.max(0, blockDelayTicks) >= pingTicks;
   }

   static double[] IiIlliIliiIl(double vy, double ticks, int gravity) {
      long var11 = 2804583027865274415L;
      double[] var5 = new double[Math.max(0, gravity)];
      double var6 = vy;
      double var8 = 0.0;

      for (long var13 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var13 >>> 32) < var5.length; var13 += 4294967296L) {
         var8 += var6;
         var5[(int)(var13 >>> 32)] = var8;
         var6 = (var6 - ticks) * 0.98;
      }

      return var5;
   }

   static boolean IIlllIlliIll(int reachLostNextTick, boolean attackTicksNeeded, int airTicksLeft) {
      return attackTicksNeeded || reachLostNextTick <= airTicksLeft;
   }

   static boolean IIillIiliIil(double range, double distance) {
      return range <= distance;
   }

   static boolean IIIilIIiiIIi(long quietUntil, long now) {
      return quietUntil > now;
   }

   static boolean IIIllIIliIIl(double minFall, boolean fall, double gliding) {
      return !fall && minFall > 1.5 && minFall >= gliding;
   }

   private static boolean Iilllilliill(double dir, double t, double origin, double max, double[] min) {
      if (!(Math.abs(t) < 1.0E-12)) {
         double var9 = (origin - dir) / t;
         double var11 = (max - dir) / t;
         min[0] = Math.max(min[0], Math.min(var9, var11));
         min[1] = Math.min(min[1], Math.max(var9, var11));
         return min[0] <= min[1];
      } else {
         return dir >= origin && dir <= max;
      }
   }

   static boolean Iiilliiliiil(int lastId, long window, int lastTick, long now, int id) {
      return lastId >= 0 && lastId == lastTick && now >= window && now - window < (long)id;
   }

   static boolean IiIiliIiiiIi(long now, long untilTick, long armTick) {
      return now > untilTick && now <= armTick;
   }

   static double IlIlllIlilIl(double y, double smashY, double fallDistance) {
      return Double.isNaN(smashY) ? Math.max(0.0, y) : Math.max(0.0, Math.min(y, smashY - fallDistance));
   }

   private llIiIililIiIil() {
   }
}
