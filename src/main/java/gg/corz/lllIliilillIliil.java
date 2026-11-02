package gg.corz;

public record lllIliilillIliil(
   liilllIliiilllIl kind,
   long clusterKey,
   int entryTravelTicks,
   int expectedPlacements,
   double placementsPerStand,
   double placementsPerMove,
   int rotationCostTicks,
   int inventorySwitchCostTicks,
   int precisePoseCostTicks,
   int crouchCostTicks,
   int surfacePhysicsCostTicks,
   int serverConfirmationCostTicks,
   double expectedFailureRisk,
   int exitCostTicks,
   String reason
) {
   private final int IiIIiIilil;
   private final int lIIIiIilil;
   private final int iiIIiIilil;
   private final double iiiilIilil;
   private final int iIIIiIilil;
   private final liilllIliiilllIl lliilIilil;
   private final int llIIiIilil;
   private final int IiiilIilil;
   private final double liIIiIilil;
   private final int liiilIilil;
   private final String IIlIiIilil;
   private final int ilIIiIilil;
   private final double IIIIiIilil;
   private final int IlIIiIilil;
   private final long iliilIilil;

   public int Iilllilliill() {
      return this.llIIiIilil;
   }

   public double IlIlllIlilIl() {
      return this.IIIIiIilil;
   }

   public String IlIillIiilIi() {
      return this.IIlIiIilil;
   }

   public int lIiiIiIlilli() {
      return this.IiiilIilil;
   }

   public int Illlllllilll() {
      return this.IlIIiIilil;
   }

   public double Iiilliiliiil() {
      return this.liIIiIilil;
   }

   public int IiIlliIliiIl() {
      return this.lIIIiIilil;
   }

   public int iliIiiliiiii() {
      return this.liiilIilil;
   }

   public double liiiIIllIl() {
      double var1 = this.IliIlllilIi();
      return !(var1 <= 0.0) && this.liiilIilil > 0 ? (double)this.liiilIilil / (var1 / 20.0) : 0.0;
   }

   public liilllIliiilllIl iIlIlllllill() {
      return this.lliilIilil;
   }

   public int Ililllililil() {
      return this.IiIIiIilil;
   }

   public int IIIilIIiiIIi() {
      return this.iiIIiIilil;
   }

   public double IliIlllilIi() {
      double var1 = (double)(this.IlIIiIilil + this.llIIiIilil + this.ilIIiIilil + this.IiIIiIilil + this.lIIIiIilil);
      double var3 = this.IIIIiIilil <= 0.0 ? (double)this.liiilIilil : Math.ceil((double)this.liiilIilil / this.IIIIiIilil);
      double var5 = this.iiiilIilil <= 0.0 ? (double)this.liiilIilil : Math.ceil((double)this.liiilIilil / this.iiiilIilil);
      double var7 = (double)(this.IiiilIilil + this.iiIIiIilil) + (double)this.liiilIilil * var1 + (double)this.iIIIiIilil + var3 * 6.0 + var5 * 30.0;
      return var7 * (1.0 + Math.max(0.0, this.liIIiIilil));
   }

   public lllIliilillIliil(
      liilllIliiilllIl kind,
      long clusterKey,
      int entryTravelTicks,
      int expectedPlacements,
      double placementsPerStand,
      double placementsPerMove,
      int rotationCostTicks,
      int inventorySwitchCostTicks,
      int precisePoseCostTicks,
      int crouchCostTicks,
      int surfacePhysicsCostTicks,
      int serverConfirmationCostTicks,
      double expectedFailureRisk,
      int exitCostTicks,
      String reason
   ) {
      this.lliilIilil = kind;
      this.iliilIilil = clusterKey;
      this.IiiilIilil = entryTravelTicks;
      this.liiilIilil = expectedPlacements;
      this.iiiilIilil = placementsPerStand;
      this.IIIIiIilil = placementsPerMove;
      this.lIIIiIilil = rotationCostTicks;
      this.iIIIiIilil = inventorySwitchCostTicks;
      this.IlIIiIilil = precisePoseCostTicks;
      this.llIIiIilil = crouchCostTicks;
      this.ilIIiIilil = surfacePhysicsCostTicks;
      this.IiIIiIilil = serverConfirmationCostTicks;
      this.liIIiIilil = expectedFailureRisk;
      this.iiIIiIilil = exitCostTicks;
      this.IIlIiIilil = reason;
   }

   public int IIillIiliIil() {
      return this.ilIIiIilil;
   }

   public long IilliliilIIi() {
      return this.iliilIilil;
   }

   public int IIlllIlliIll() {
      return this.iIIIiIilil;
   }

   public double IIIllIIliIIl() {
      return this.iiiilIilil;
   }
}
