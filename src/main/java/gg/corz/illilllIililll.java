package gg.corz;

import java.util.List;

public record illilllIililll(
   int routeIndex,
   double bestDistance,
   double bestVerticalDistance,
   int lastProgressTick,
   int noProgressTicks,
   int cycleRepeats,
   int localRecoveries,
   lllIIIiillIIIi progressKind,
   List<Long> recentFeet
) {
   private final List<Long> lIllllIIiiIllllIIi;
   private final int IiIlllIIiliIlllIIi;
   private final int IliIllIIilliIllIIi;
   private final double iliIllIIiIiiIllIIi;
   private final int llIlllIIiilIlllIIi;
   private final int iIIlllIIiIlIlllIIi;
   private final double liiIllIIiiiiIllIIi;
   private final int IIIlllIIilIIlllIIi;
   private final lllIIIiillIIIi iiIlllIIiIIllllIIi;

   public int IilliliilIIi() {
      return this.IIIlllIIilIIlllIIi;
   }

   public double liiiIIllIl() {
      return this.iliIllIIiIiiIllIIi;
   }

   public int IliIlllilIi() {
      return this.IliIllIIilliIllIIi;
   }

   public int IIIllIIliIIl() {
      return this.IiIlllIIiliIlllIIi;
   }

   public List<Long> IiIlliIliiIl() {
      return this.lIllllIIiiIllllIIi;
   }

   public illilllIililll(
      int routeIndex,
      double bestDistance,
      double bestVerticalDistance,
      int lastProgressTick,
      int noProgressTicks,
      int cycleRepeats,
      int localRecoveries,
      lllIIIiillIIIi progressKind,
      List<Long> recentFeet
   ) {
      this.IliIllIIilliIllIIi = routeIndex;
      this.iliIllIIiIiiIllIIi = bestDistance;
      this.liiIllIIiiiiIllIIi = bestVerticalDistance;
      this.IIIlllIIilIIlllIIi = lastProgressTick;
      this.iIIlllIIiIlIlllIIi = noProgressTicks;
      this.llIlllIIiilIlllIIi = cycleRepeats;
      this.IiIlllIIiliIlllIIi = localRecoveries;
      this.iiIlllIIiIIllllIIi = progressKind;
      this.lIllllIIiiIllllIIi = recentFeet;
   }

   public int iliIiiliiiii() {
      return this.llIlllIIiilIlllIIi;
   }

   public double iIlIlllllill() {
      return this.liiIllIIiiiiIllIIi;
   }

   public lllIIIiillIIIi IlIlllIlilIl() {
      return this.iiIlllIIiIIllllIIi;
   }

   public int lIiiIiIlilli() {
      return this.iIIlllIIiIlIlllIIi;
   }
}
