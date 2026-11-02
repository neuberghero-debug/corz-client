package gg.corz;

public final class iiIiiliIIliili {
   public static final float IIIIIllIIl = 0.85F;
   public static final double lIlIIllIIl = 0.5;
   public static final float lIIIIllIIl = 0.96F;
   public static final float llIIIllIIl = 1.0F;
   public static final float iiIIIllIIl = 0.6F;
   public static final float ilIIIllIIl = 0.35F;
   public static final float IiIIIllIIl = 1.0F;
   public static final int IlIIIllIIl = 3;
   public static final int iiiiiIlIIl = 10;
   public static final float IIlIIllIIl = 6.0F;
   public static final float liIIIllIIl = 4.0F;
   public static final int iIIIIllIIl = 10;

   private iiIiiliIIliili() {
   }

   public static float IliIlllilIi(float raw, int difficulty) {
      return difficulty < 0 ? raw : liiIIliliiiIIlil.lIiiIiIlilli(raw, difficulty);
   }

   public static boolean Ililllililil(float t, boolean targetDmg, double denial, lIiillIiiIiillIi pops) {
      return t >= pops.IIIIllIIIl() || targetDmg || denial > 0.0;
   }

   public static float IIIllIIliIIl(float w, iiIllIlIIlllIl a, IilIlIIllilIlIIl scaled, int landTicks) {
      IilIlIIllilIlIIl var4 = scaled == null ? IilIlIIllilIlIIl.IIIIlillIl : scaled;
      float var5 = lIiiIiIlilli(w, a);
      return var4.IliIlllilIi(landTicks) ? var5 : Math.max(iliIiiliiiii(w, a, var4, landTicks), var5 * IIlllIlliIll(var4.liiiIIllIl() - landTicks));
   }

   public static double Iilllilliill(boolean ours, float selfCostNow, float threatToUs, lIiillIiiIiillIi t) {
      return !ours && t.lIlIliIlIl() && !(selfCostNow < t.IllIllllIl()) ? 1.0 + Math.max(0.0, (double)(selfCostNow - threatToUs)) : 0.0;
   }

   public static float lIiiIiIlilli(float scaled, iiIllIlIIlllIl a) {
      if (!(scaled > 0.0F)) {
         return 0.0F;
      } else {
         iiIllIlIIlllIl var2 = a == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : a;
         float var3 = liiIIliliiiIIlil.iliIiiliiiii(scaled, var2.IliIlllilIi(), var2.liiiIIllIl());
         var3 = liiIIliliiiIIlil.IIIllIIliIIl(var3, var2.iIlIlllllill());
         return var3 <= 0.0F ? 0.0F : Math.max(0.0F, liiIIliliiiIIlil.IlIlllIlilIl(var3, var2.IilliliilIIi()));
      }
   }

   public static boolean IlIlllIlilIl(float damage, float ehp) {
      return damage >= ehp;
   }

   public static float IIlllIlliIll(int waitTicks) {
      return (float)Math.pow(0.96F, (double)Math.max(0, waitTicks));
   }

   public static boolean IIIilIIiiIIi(int readyIn, float popsNow, float excessNow, boolean contested, boolean maxHold, int heldTicks, int fullAtOpen) {
      return readyIn <= 0 || maxHold || contested || heldTicks >= fullAtOpen || popsNow >= 0.85F * excessNow * IIlllIlliIll(readyIn);
   }

   public static double Illlllllilll(float selfCost, boolean turnDegrees, boolean kills, float targetDmg, double t, boolean obsidian, lIiillIiiIiillIi pops) {
      return (double)(pops.Iliilliiilii() * selfCost)
         + (turnDegrees ? (double)pops.iIIIlIlIIl() : 0.0)
         + (kills ? (double)pops.llIIlilIIl() : 0.0)
         - (double)(pops.IiIIlliIIl() * targetDmg)
         - (double)pops.iiIIlIIlIl() * t
         - (obsidian ? (double)pops.illIlIilIl() : 0.0);
   }

   public static boolean IiIlliIliiIl(
      float full, float kills, float popsTarget, boolean selfEhp, boolean dealt, boolean spent, boolean popTrade, float totemTrade, float cost
   ) {
      if (Float.isFinite(kills) && Float.isFinite(popsTarget) && Float.isFinite(totemTrade)) {
         if (!dealt || !(popsTarget < totemTrade - 1.0F) && !spent) {
            if (selfEhp && popTrade) {
               return true;
            } else if (popsTarget >= totemTrade - 1.0F) {
               return false;
            } else if (kills > 1.0F && kills > totemTrade - 4.0F) {
               return false;
            } else {
               float var9 = selfEhp ? 0.6F * Math.max(full, 6.0F) : Math.max(1.0F, 0.35F * full);
               if (Math.max(0.0F, cost) + kills > 6.0F) {
                  var9 = Math.min(var9, 1.0F);
               }

               return kills <= var9;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public static float iIlIlllllill(float a, iiIllIlIIlllIl power, float scaled) {
      iiIllIlIIlllIl var3 = power == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : power;
      return (float)liiIIliliiiIIlil.liiiIIllIl((double)liiiIIllIl(a, var3.lIiiIiIlilli()), (double)scaled);
   }

   public static double IIillIiliIil(float t, boolean pops, boolean targetDmg, float denial, double kills, lIiillIiiIiillIi selfCost) {
      return (double)(selfCost.Iliilliiilii() * t)
         + (pops ? (double)selfCost.iIIIlIlIIl() : 0.0)
         + (targetDmg ? (double)selfCost.llIIlilIIl() : 0.0)
         - (double)(selfCost.IiIIlliIIl() * denial)
         + kills
         + (double)selfCost.lilIliilIl();
   }

   public static double IiIiliIiiiIi(double hz, double t, lIiillIiiIiillIi dy) {
      if (!dy.lliIliliIl()) {
         return 0.0;
      } else {
         double var5 = hz < dy.IiiIlliiIl() ? (double)(-dy.IIllllIlll()) : (hz > 0.45 ? -0.5 : 0.0);
         if (t <= dy.IlIllllIll() && hz >= dy.IiiIlliiIl()) {
            var5 += (double)dy.liIlliiIll();
         }

         return var5;
      }
   }

   public static float liiiIIllIl(float difficulty, int scaled) {
      if (difficulty > 0.0F && Float.isFinite(difficulty)) {
         return switch (scaled) {
            case 1 -> difficulty <= 2.0F ? difficulty : 2.0F * (difficulty - 1.0F);
            case 3 -> difficulty * 2.0F / 3.0F;
            default -> difficulty;
         };
      } else {
         return 0.0F;
      }
   }

   public static boolean Iiilliiliiil(int readyIn, float contested, float popsNow, boolean heldTicks, boolean fullAtOpen, int excessNow) {
      return IIIilIIiiIIi(readyIn, contested, popsNow, heldTicks, fullAtOpen, excessNow, 10);
   }

   public static float IilliliilIIi(float a, iiIllIlIIlllIl trade, IilIlIIllilIlIIl w, int landTicks, boolean scaled) {
      return scaled ? iliIiiliiiii(a, trade, w, landTicks) : IIIllIIliIIl(a, trade, w, landTicks);
   }

   public static boolean IlIillIiilIi(double t, double dy, lIiillIiiIiillIi hz) {
      return t >= hz.lIIlliIIll() && t <= hz.iiiIlIIIll() && dy <= hz.ilIllIiIll();
   }

   public static float iliIiiliiiii(float w, iiIllIlIIlllIl a, IilIlIIllilIlIIl landTicks, int scaled) {
      IilIlIIllilIlIIl var4 = landTicks == null ? IilIlIIllilIlIIl.IIIIlillIl : landTicks;
      return var4.IliIlllilIi(scaled) ? lIiiIiIlilli(w, a) : lIiiIiIlilli(Math.max(0.0F, w - var4.iIlIlllllill()), a);
   }
}
