package gg.corz;

public final class iiIiIIIlIIliIIIl {
   public static final double llliiIllIl = 4.0;
   public static final double IlliiIllIl = 3.0;
   public static final double ilIiiIllIl = 3.0;
   public static final double liliiIllIl = 0.5;
   public static final int llIIIlllIl = 40;
   public static final double IlIIIlllIl = 0.98;
   public static final double lIIiiIllIl = 0.5;
   public static final double illiiIllIl = 0.75;
   public static final int IIIIIlllIl = 2;
   public static final float IliiiIllIl = 1.0F;
   public static final int lIIIIlllIl = 3;
   public static final double ilIIIlllIl = 0.25;
   public static final double iIliiIllIl = 4.5;
   public static final double IIliiIllIl = 1.0;
   public static final float iIiiiIllIl = 0.5F;
   public static final double liIiiIllIl = 0.5;
   public static final int iiiiiIllIl = 1;
   public static final double IIIiiIllIl = 20.0;
   public static final double llIiiIllIl = 1.5;
   public static final double iiIiiIllIl = 1.3;
   public static final float IiiiiIllIl = 2.0F;
   public static final int liiiiIllIl = 9;
   public static final double iiliiIllIl = 0.5;
   public static final double IIiiiIllIl = 1.5;
   public static final double IlIiiIllIl = 10.0;
   public static final double lIliiIllIl = 0.5;
   public static final double IiliiIllIl = 0.5;
   public static final double iIIIIlllIl = 0.08;
   public static final double lIiiiIllIl = 0.5;
   public static final float lliiiIllIl = 0.9F;
   public static final float iliiiIllIl = 2.0F;
   public static final double IiIiiIllIl = 1.5;
   public static final double iIIiiIllIl = 4.0;

   public static double iIlIlllllill(IiIIlillliIIlill turnDeg, double kind, int wait) {
      return Math.max(IliIlllilIi(kind) + (double)liiiIIllIl(turnDeg), (double)Math.max(0, wait));
   }

   public static boolean IiIlliIliiIl(boolean busy, double owed, boolean available, boolean value) {
      return busy && Double.isFinite(owed) && (owed > 0.25 || available || value);
   }

   public static double Illlllllilll(boolean centreDeg, double onLook) {
      return centreDeg ? 0.0 : onLook;
   }

   public static boolean IiIiliIiiiIi(int readyIn, int act) {
      return readyIn - Math.max(0, act) <= 4;
   }

   public static IiliiIIililiiIIi IIiilIiiiIii(
      boolean crystalDealt,
      boolean owed,
      boolean crystal,
      boolean pearl,
      boolean meleeKills,
      boolean anchor,
      double anchorUnplaced,
      boolean crystalBreak,
      double pearlAiming,
      double melee,
      boolean anchorValue,
      boolean dist,
      boolean crystalHold,
      boolean anchorBusy
   ) {
      if (anchorValue && dist) {
         return IiliiIIililiiIIi.lIllliiiil;
      } else if (crystalDealt) {
         return pearl && meleeKills && owed && anchorUnplaced >= pearlAiming ? IiliiIIililiiIIi.iiIlliiiil : IiliiIIililiiIIi.IIllliiiil;
      } else if (!crystalHold || !(melee > 3.0) || pearl && meleeKills) {
         if (crystalBreak && crystal) {
            return IiliiIIililiiIIi.IIllliiiil;
         } else if (!pearl || !meleeKills && crystalBreak && !(1.3 * anchorUnplaced >= pearlAiming)) {
            if (!anchor || crystalBreak && !(1.3 * anchorUnplaced >= pearlAiming)) {
               if (crystalBreak) {
                  return IiliiIIililiiIIi.IIllliiiil;
               } else if (pearl) {
                  return IiliiIIililiiIIi.iiIlliiiil;
               } else if (anchorValue) {
                  return IiliiIIililiiIIi.lIllliiiil;
               } else {
                  return anchorBusy && melee > 3.0 ? IiliiIIililiiIIi.iIllliiiil : IiliiIIililiiIIi.Illlliiiil;
               }
            } else {
               return IiliiIIililiiIIi.Illlliiiil;
            }
         } else {
            return IiliiIIililiiIIi.iiIlliiiil;
         }
      } else {
         return IiliiIIililiiIIi.iIllliiiil;
      }
   }

   public static boolean IIIllIIliIIl(IiIIlillliIIlill kind, double turnDeg, int airLeft, int readyIn) {
      return readyIn > 0 && Double.isFinite(turnDeg) && iIlIlllllill(kind, turnDeg, airLeft) + 1.0 <= (double)readyIn;
   }

   public static boolean Iilllilliill(boolean ownDealt, boolean topPops, float topKills, double ownScore, boolean ownKills, boolean topScore, double ownPops) {
      if (ownDealt) {
         return true;
      } else if (!ownKills && (!topScore || topPops)) {
         return topPops || Float.isFinite(topKills) && topKills >= 2.0F
            ? Double.isFinite(ownScore) && (!Double.isFinite(ownPops) || ownScore >= 0.5 * ownPops)
            : false;
      } else {
         return false;
      }
   }

   public static boolean iIIIlIlIIl(IiliiIIililiiIIi kitHasCrystals, boolean crystalsOffHotbar, boolean swordKills, boolean pick) {
      return swordKills && pick && kitHasCrystals != null
         ? kitHasCrystals == IiliiIIililiiIIi.Illlliiiil || kitHasCrystals == IiliiIIililiiIIi.lIllliiiil && !crystalsOffHotbar
         : false;
   }

   public static boolean IIIIllIIIl(IiIIlillliIIlill staged, boolean kills, boolean ready, boolean kind) {
      return kills && ready && !kind && (staged == IiIIlillliIIlill.liIIiilill || staged == IiIIlillliIIlill.IIlIiilill);
   }

   public static boolean IiIIlliIIl(double rel, double h, double min) {
      return !Double.isNaN(rel) && !Double.isNaN(h) ? rel <= -0.5 || h >= min : false;
   }

   public static boolean Iiiiliiiiiii(
      boolean owed, boolean crystalKills, boolean crystal, boolean anchor, boolean anchorBusy, boolean anchorKills, boolean anchorUnplaced
   ) {
      if (!anchor || !anchorBusy) {
         return false;
      } else {
         return owed && !crystalKills ? false : !crystal || !anchorKills || !anchorUnplaced;
      }
   }

   public static double Ililllililil(double feetY, double blastY) {
      if (!Double.isNaN(feetY) && !Double.isNaN(blastY)) {
         double var4 = blastY - feetY - 0.5;
         return var4 <= 0.0 ? 1.0 : 1.0 / (1.0 + 0.5 * var4);
      } else {
         return 1.0;
      }
   }

   public static int iliIiiliiiii(boolean onGround, double above, double vy) {
      long var10 = 6217851956567761696L;
      if (!onGround && Double.isFinite(above) && Double.isFinite(vy) && !(vy < 0.75)) {
         double var5 = vy;
         double var7 = above;

         for (var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < 40; var10 += 4294967296L) {
            var5 += var7;
            var7 = (var7 - 0.08) * 0.98;
            if (var5 < 0.75) {
               break;
            }
         }

         return (int)(var10 >>> 32);
      } else {
         return 0;
      }
   }

   public static int liiiIIllIl(IiIIlillliIIlill kind) {
      if (kind == null) {
         return 0;
      } else {
         return switch (kind) {
            case liIIiilill, iiIIiilill -> 0;
            case lIlIiilill -> 1;
            case IIlIiilill -> 2;
         };
      }
   }

   public static double Illillliilli(
      IiIIlillliIIlill wait, float selfCost, float selfFull, float kind, boolean pops, boolean spot, boolean dealt, boolean kills, double ours, int turnDeg
   ) {
      if (wait != null && Float.isFinite(selfCost)) {
         double var11 = (double)Math.max(0.0F, selfCost);
         double var13 = Float.isFinite(selfFull) ? (double)Math.max(0.0F, selfFull) : 0.0;
         double var15 = Float.isFinite(kind) ? (double)Math.max(0.0F, kind) : var13;
         double var17 = var11 + (pops ? 4.0 : 0.0) + (spot ? 10.0 : 0.0) - 0.5 * var15 + (kills ? 3.0 : 0.0);
         if (wait == IiIIlillliIIlill.liIIiilill || wait == IiIIlillliIIlill.iiIIiilill) {
            var17++;
            if (!dealt) {
               var17 += 0.5 * Math.max(0.0, var13 - var15);
            }
         }

         return var17 / (1.0 + iIlIlllllill(wait, ours, turnDeg));
      } else {
         return Double.NEGATIVE_INFINITY;
      }
   }

   public static boolean Iilililiiili(double focusPops, boolean focusKills, boolean focusScore, double kills, boolean score, boolean pops) {
      if (!Double.isFinite(focusPops)) {
         return true;
      } else if (!Double.isFinite(kills)) {
         return false;
      } else if (pops && !focusScore) {
         return true;
      } else {
         return score && !focusKills && !focusScore ? true : kills >= focusPops + Math.max(1.0, 0.5 * Math.abs(focusPops));
      }
   }

   public static boolean IIIilIIiiIIi(IiIIlillliIIlill pops, float selfCost, float ours, float dealt, boolean kind, boolean selfFull) {
      long var7 = 4880849384290609983L;
      var7 ^= ((long)(Float.isFinite(selfCost) && selfCost >= 0.5F ? 1 : 0) << 32 ^ var7) & -1L << 32;
      if (pops != IiIIlillliIIlill.liIIiilill || kind) {
         return (boolean)((int)(var7 >>> 32));
      } else {
         return Float.isFinite(ours) && Float.isFinite(dealt) ? (int)(var7 >>> 32) != 0 && (selfFull || selfCost >= dealt) || ours - dealt >= 1.0F : false;
      }
   }

   public static double IIlllIlliIll(boolean feetY, double floorY, double onGround, double vy) {
      return !feetY && floorY < 0.0 && !Double.isNaN(onGround) && !Double.isNaN(vy) && vy < onGround && !(onGround - vy > 4.0) ? vy : Double.NaN;
   }

   public static boolean llIIlilIIl(boolean itemLane, boolean defends, boolean heal, boolean breaching, boolean escape) {
      return itemLane || defends || heal || breaching || escape;
   }

   public static double Iiilliiliiil(IiIIlillliIIlill spot, double turnDeg, double bound, boolean kind, boolean focus) {
      double var7 = Double.isFinite(turnDeg) ? Math.max(0.0, turnDeg) : 0.0;
      return var7 / (1.0 + iIlIlllllill(spot, bound, 0))
         + (kind ? 3.0 : 0.0)
         + (focus ? 1.5 : 0.0)
         + (spot != IiIIlillliIIlill.liIIiilill && spot != IiIIlillliIIlill.iiIIiilill ? 0.0 : 1.5);
   }

   public static int IilliliilIIi(double feetY) {
      return (int)Math.floor(feetY - 0.75);
   }

   public static IiliiIIililiiIIi Iliilliiilii(
      boolean pearl,
      boolean crystalKills,
      boolean crystalDealt,
      boolean meleeKills,
      boolean anchorValue,
      boolean anchor,
      double crystalHold,
      boolean anchorBusy,
      double anchorUnplaced,
      double owed,
      boolean pearlAiming,
      boolean anchorKills,
      boolean crystalBreak,
      boolean crystal,
      boolean melee,
      boolean dist
   ) {
      return (!pearlAiming || !anchorKills) && Iiiiliiiiiii(pearl, crystalKills, crystalDealt, meleeKills, melee, anchorBusy, dist)
         ? IiliiIIililiiIIi.iiIlliiiil
         : IIiilIiiiIii(
            pearl,
            crystalKills,
            crystalDealt,
            meleeKills,
            anchorValue,
            anchor,
            crystalHold,
            anchorBusy,
            anchorUnplaced,
            owed,
            pearlAiming,
            anchorKills,
            crystalBreak,
            crystal
         );
   }

   public static boolean IlIlllIlilIl(boolean value, boolean unplaced, double bare) {
      return value && unplaced && !(bare > 0.25);
   }

   public static double lIiiIiIlilli(boolean floorY, double feetY, double onGround) {
      return !floorY && !Double.isNaN(feetY) && !Double.isNaN(onGround) && !(onGround > feetY) ? onGround : feetY;
   }

   public static boolean IlIillIiilIi(boolean pops, int real, boolean ok, float ours, boolean readyIn) {
      return pops && real > 0 && !readyIn ? !ok || !(ours >= 2.0F) : false;
   }

   private iiIiIIIlIIliIIIl() {
   }

   public static double IliIlllilIi(double deg) {
      if (Double.isNaN(deg) || Double.isInfinite(deg)) {
         return 9.0;
      } else {
         return !(deg > 0.0) ? 0.0 : Math.min(9.0, Math.ceil(deg / 20.0));
      }
   }

   public static boolean IIillIiliIil(IiIIlillliIIlill kind, double backDeg, double readyIn, int toDeg) {
      return iIlIlllllill(kind, backDeg, 0) + IliIlllilIi(readyIn) <= (double)Math.max(1, toDeg);
   }

   public static double[] iiIIlIIlIl(double hz, double ux, double radius, double uz, double hx) {
      double var10 = Math.hypot(radius - hz, uz - ux);
      double var12 = var10 < 0.001 ? 1.0 : (radius - hz) / var10;
      double var14 = var10 < 0.001 ? 0.0 : (uz - ux) / var10;
      double var16 = Double.isFinite(hx) ? Math.max(0.0, hx) : 0.0;
      return new double[]{hz + var12 * var16, ux + var14 * var16};
   }

   public static boolean IIlilIliiIli(double dealt, boolean kills, double cost, float usFeetY, float pops, boolean usGround, boolean blastY) {
      if (blastY) {
         return true;
      } else if (!Float.isFinite(usFeetY) || !Float.isFinite(pops) || Double.isNaN(dealt) || Double.isNaN(cost)) {
         return false;
      } else if (pops <= 2.0F || dealt <= cost - 0.5) {
         return true;
      } else {
         return !kills && dealt > cost + 0.5 ? false : (double)usFeetY >= (usGround ? 0.5 : 1.5) * (double)pops;
      }
   }
}
