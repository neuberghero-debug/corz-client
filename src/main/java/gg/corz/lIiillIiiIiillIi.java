package gg.corz;

public record lIiillIiiIiillIi(
   double planCone,
   double keepCone,
   int dyMin,
   int dyMax,
   int radius,
   int targetRadius,
   int targetDyMin,
   int targetDyMax,
   int maxEvaluations,
   boolean eliteMode,
   float offWeight,
   float minDamage,
   float breakMinDamage,
   float popBonus,
   float killBonus,
   float selfWeight,
   float turnCost,
   boolean denyEnemyCrystals,
   float denyThreat,
   float obsidianPenalty,
   float breakTempo,
   double actReachMargin,
   int robustTop,
   boolean levelGate,
   double levelLo,
   double levelHi,
   double levelLowMin,
   double adjPref,
   double adjMax,
   float adjacentBonus,
   float lowPenalty,
   boolean tradeRule,
   float selfSpent,
   boolean popTrade,
   float floorDamage,
   ilIiliilIiIiliil tradeMode
) {
   public static final double IIlllIlIIi = 1.05;
   private final int lIIIlIlIIi;
   public static final double iiIllIlIIi = 0.45;
   private final double lIiIlIlIIi;
   private final int ilIIlIlIIi;
   private final float IIiIlIlIIi;
   private final boolean iIIllIlIIi;
   private final float lIIllIlIIi;
   private final double liiiIIlIIi;
   private final double liiIlIlIIi;
   private final boolean IilIlIlIIi;
   private final float iilIlIlIIi;
   private final double iliIlIlIIi;
   public static final double lIlllIlIIi = -1.05;
   private final double lliIlIlIIi;
   private final int iIiIlIlIIi;
   private final double IiiIlIlIIi;
   private final int IiIIlIlIIi;
   private final float IlIllIlIIi;
   public static final double iIlllIlIIi = 1.6;
   private final float lIlIlIlIIi;
   private final ilIiliilIiIiliil IiIllIlIIi;
   public static final double liIllIlIIi = -0.6;
   private final float lllIlIlIIi;
   private final float lilIlIlIIi;
   private final float IIlIlIlIIi;
   private final int IlIIlIlIIi;
   public static final lIiillIiiIiillIi lllllIlIIi = new lIiillIiiIiillIi(
      90.0,
      110.0,
      -1,
      1,
      4,
      0,
      0,
      0,
      12,
      false,
      1.0F,
      0.0F,
      0.0F,
      0.0F,
      0.0F,
      0.0F,
      0.0F,
      false,
      0.0F,
      0.0F,
      0.0F,
      0.0,
      0,
      false,
      -0.6,
      0.45,
      -1.05,
      1.6,
      2.3,
      0.0F,
      0.0F,
      false,
      0.0F,
      false
   );
   private final double iiiiIIlIIi;
   private final boolean liIIlIlIIi;
   private final float IIIllIlIIi;
   private final float ilIllIlIIi;
   private final boolean llIllIlIIi;
   private final float IllIlIlIIi;
   private final float iIlIlIlIIi;
   private final int iIIIlIlIIi;
   private final double iiiIlIlIIi;
   private final int IIIIlIlIIi;
   private final float illIlIlIIi;
   private final int llIIlIlIIi;
   private final float iiIIlIlIIi;
   public static final double IllllIlIIi = 2.3;
   private final boolean IliIlIlIIi;

   public float iilllIIill() {
      return this.ilIllIlIIi;
   }

   public double IIiIllIiIl() {
      return this.lIiIlIlIIi;
   }

   public lIiillIiiIiillIi IiIlliIliiIl(double v) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         this.iiIIlIlIIi,
         this.IIlIlIlIIi,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         this.lllIlIlIIi,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         this.IliIlIlIIi,
         this.lliIlIlIIi,
         v,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         this.iIIllIlIIi,
         this.IlIllIlIIi,
         this.llIllIlIIi,
         this.ilIllIlIIi,
         this.IiIllIlIIi
      );
   }

   public double IIillIiliIil() {
      return this.liiiIIlIIi;
   }

   public float llIIlilIIl() {
      return this.IllIlIlIIi;
   }

   public float IllIllllIl() {
      return this.lilIlIlIIi;
   }

   public static lIiillIiiIiillIi IliIlllilIi() {
      return new lIiillIiiIiillIi(
         180.0,
         180.0,
         -3,
         2,
         4,
         2,
         -2,
         1,
         16,
         true,
         1.0F,
         6.0F,
         4.0F,
         12.0F,
         40.0F,
         0.6F,
         0.02F,
         true,
         6.0F,
         0.5F,
         1.0F,
         0.15,
         3,
         false,
         -0.6,
         0.45,
         -1.05,
         1.6,
         2.3,
         2.0F,
         1.5F,
         false,
         0.0F,
         false
      );
   }

   public float iiIIlIIlIl() {
      return this.illIlIlIIi;
   }

   public boolean lIlIliIlIl() {
      return this.IilIlIlIIi;
   }

   public float IIIIllIIIl() {
      return this.lIlIlIlIIi;
   }

   public lIiillIiiIiillIi iIlIlllllill() {
      return !this.liiiIIllIl()
         ? this
         : new lIiillIiiIiillIi(
            this.liiiIIlIIi,
            this.iiiiIIlIIi,
            this.IIIIlIlIIi,
            this.lIIIlIlIIi,
            this.iIIIlIlIIi,
            this.IlIIlIlIIi,
            this.llIIlIlIIi,
            this.ilIIlIlIIi,
            this.IiIIlIlIIi,
            this.liIIlIlIIi,
            this.iiIIlIlIIi,
            this.ilIllIlIIi,
            Math.min(this.lIlIlIlIIi, this.ilIllIlIIi),
            this.iIlIlIlIIi,
            this.IllIlIlIIi,
            this.lllIlIlIIi,
            this.illIlIlIIi,
            this.IilIlIlIIi,
            this.lilIlIlIIi,
            this.iilIlIlIIi,
            this.IIiIlIlIIi,
            this.lIiIlIlIIi,
            this.iIiIlIlIIi,
            this.IliIlIlIIi,
            this.lliIlIlIIi,
            this.iliIlIlIIi,
            this.IiiIlIlIIi,
            this.liiIlIlIIi,
            this.iiiIlIlIIi,
            this.IIIllIlIIi,
            this.lIIllIlIIi,
            this.iIIllIlIIi,
            this.IlIllIlIIi,
            this.llIllIlIIi,
            this.ilIllIlIIi,
            this.IiIllIlIIi
         );
   }

   public lIiillIiiIiillIi(
      double breakMinDamage,
      double levelHi,
      int targetDyMin,
      int selfWeight,
      int eliteMode,
      int targetDyMax,
      int killBonus,
      int dyMin,
      int robustTop,
      boolean adjMax,
      float levelLowMin,
      float tradeRule,
      float levelGate,
      float denyEnemyCrystals,
      float targetRadius,
      float breakTempo,
      float denyThreat,
      boolean lowPenalty,
      float levelLo,
      float popTrade,
      float adjacentBonus,
      double actReachMargin,
      int floorDamage,
      boolean turnCost,
      double keepCone,
      double offWeight,
      double dyMax,
      double radius,
      double obsidianPenalty,
      float planCone,
      float maxEvaluations,
      boolean minDamage,
      float adjPref,
      boolean selfSpent,
      float popBonus
   ) {
      this(
         breakMinDamage,
         levelHi,
         targetDyMin,
         selfWeight,
         eliteMode,
         targetDyMax,
         killBonus,
         dyMin,
         robustTop,
         adjMax,
         levelLowMin,
         tradeRule,
         levelGate,
         denyEnemyCrystals,
         targetRadius,
         breakTempo,
         denyThreat,
         lowPenalty,
         levelLo,
         popTrade,
         adjacentBonus,
         actReachMargin,
         floorDamage,
         turnCost,
         keepCone,
         offWeight,
         dyMax,
         radius,
         obsidianPenalty,
         planCone,
         maxEvaluations,
         minDamage,
         adjPref,
         selfSpent,
         popBonus,
         ilIiliilIiIiliil.IiIlIIIiil
      );
   }

   public lIiillIiiIiillIi(
      double turnCost,
      double levelLo,
      int adjMax,
      int levelHi,
      int targetDyMin,
      int obsidianPenalty,
      int dyMin,
      int planCone,
      int adjacentBonus,
      boolean dyMax,
      float levelGate,
      float selfWeight,
      float breakTempo,
      float keepCone,
      float minDamage,
      float killBonus,
      float offWeight,
      boolean breakMinDamage,
      float eliteMode,
      float targetDyMax,
      float denyThreat,
      double robustTop,
      int lowPenalty,
      boolean adjPref,
      double radius,
      double maxEvaluations,
      double levelLowMin,
      double denyEnemyCrystals,
      double targetRadius,
      float actReachMargin,
      float popBonus
   ) {
      this(
         turnCost,
         levelLo,
         adjMax,
         levelHi,
         targetDyMin,
         obsidianPenalty,
         dyMin,
         planCone,
         adjacentBonus,
         dyMax,
         levelGate,
         selfWeight,
         breakTempo,
         keepCone,
         minDamage,
         killBonus,
         offWeight,
         breakMinDamage,
         eliteMode,
         targetDyMax,
         denyThreat,
         robustTop,
         lowPenalty,
         adjPref,
         radius,
         maxEvaluations,
         levelLowMin,
         denyEnemyCrystals,
         targetRadius,
         actReachMargin,
         popBonus,
         false,
         0.0F,
         false,
         0.0F
      );
   }

   public ilIiliilIiIiliil lIilliIill() {
      return this.IiIllIlIIi;
   }

   public int Iiilliiliiil() {
      return this.IIIIlIlIIi;
   }

   public float iIIIlIlIIl() {
      return this.iIlIlIlIIi;
   }

   public int IIIilIIiiIIi() {
      return this.lIIIlIlIIi;
   }

   public double iiiIlIIIll() {
      return this.iliIlIlIIi;
   }

   public float IIllllIlll() {
      return this.lIIllIlIIi;
   }

   public float lilIliilIl() {
      return this.IIiIlIlIIi;
   }

   public lIiillIiiIiillIi IIIllIIliIIl(float v) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         v,
         this.IIlIlIlIIi,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         this.lllIlIlIIi,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         this.IliIlIlIIi,
         this.lliIlIlIIi,
         this.iliIlIlIIi,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         this.iIIllIlIIi,
         this.IlIllIlIIi,
         this.llIllIlIIi,
         this.ilIllIlIIi,
         this.IiIllIlIIi
      );
   }

   public int IiIiliIiiiIi() {
      return this.IlIIlIlIIi;
   }

   public boolean lliIliliIl() {
      return this.IliIlIlIIi;
   }

   public double ilIllIiIll() {
      return this.iiiIlIlIIi;
   }

   public float illIlIilIl() {
      return this.iilIlIlIIi;
   }

   public int iIiIlIliIl() {
      return this.iIiIlIlIIi;
   }

   public lIiillIiiIiillIi Iilllilliill(float spent, boolean popTrade) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         this.iiIIlIlIIi,
         this.IIlIlIlIIi,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         this.lllIlIlIIi,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         this.IliIlIlIIi,
         this.lliIlIlIIi,
         this.iliIlIlIIi,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         true,
         spent,
         popTrade,
         this.ilIllIlIIi,
         this.IiIllIlIIi
      );
   }

   public boolean Illlllllilll() {
      return this.IiIllIlIIi.iIIIlIlIIl();
   }

   public float Iliilliiilii() {
      return this.iiIIlIlIIi;
   }

   public float lllllillll() {
      return this.IlIllIlIIi;
   }

   public boolean liiiIIllIl() {
      return this.liIIlIlIIi && this.IiIIlIlIIi > 0 && Float.isFinite(this.ilIllIlIIi) && this.ilIllIlIIi > 0.0F && this.ilIllIlIIi < this.IIlIlIlIIi;
   }

   public float Iiiiliiiiiii() {
      return this.IIlIlIlIIi;
   }

   public lIiillIiiIiillIi lIiiIiIlilli(float v) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         this.iiIIlIlIIi,
         v,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         this.lllIlIlIIi,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         this.IliIlIlIIi,
         this.lliIlIlIIi,
         this.iliIlIlIIi,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         this.iIIllIlIIi,
         this.IlIllIlIIi,
         this.llIllIlIIi,
         this.ilIllIlIIi,
         this.IiIllIlIIi
      );
   }

   public lIiillIiiIiillIi iliIiiliiiii(float v) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         this.iiIIlIlIIi,
         this.IIlIlIlIIi,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         v,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         this.IliIlIlIIi,
         this.lliIlIlIIi,
         this.iliIlIlIIi,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         this.iIIllIlIIi,
         this.IlIllIlIIi,
         this.llIllIlIIi,
         this.ilIllIlIIi,
         this.IiIllIlIIi
      );
   }

   public lIiillIiiIiillIi(
      double planCone,
      double keepCone,
      int dyMin,
      int dyMax,
      int radius,
      int targetRadius,
      int targetDyMin,
      int targetDyMax,
      int maxEvaluations,
      boolean eliteMode,
      float offWeight,
      float minDamage,
      float breakMinDamage,
      float popBonus,
      float killBonus,
      float selfWeight,
      float turnCost,
      boolean denyEnemyCrystals,
      float denyThreat,
      float obsidianPenalty,
      float breakTempo,
      double actReachMargin,
      int robustTop,
      boolean levelGate,
      double levelLo,
      double levelHi,
      double levelLowMin,
      double adjPref,
      double adjMax,
      float adjacentBonus,
      float lowPenalty,
      boolean tradeRule,
      float selfSpent,
      boolean popTrade,
      float floorDamage,
      ilIiliilIiIiliil tradeMode
   ) {
      tradeMode = tradeMode == null ? ilIiliilIiIiliil.IiIlIIIiil : tradeMode;
      this.liiiIIlIIi = planCone;
      this.iiiiIIlIIi = keepCone;
      this.IIIIlIlIIi = dyMin;
      this.lIIIlIlIIi = dyMax;
      this.iIIIlIlIIi = radius;
      this.IlIIlIlIIi = targetRadius;
      this.llIIlIlIIi = targetDyMin;
      this.ilIIlIlIIi = targetDyMax;
      this.IiIIlIlIIi = maxEvaluations;
      this.liIIlIlIIi = eliteMode;
      this.iiIIlIlIIi = offWeight;
      this.IIlIlIlIIi = minDamage;
      this.lIlIlIlIIi = breakMinDamage;
      this.iIlIlIlIIi = popBonus;
      this.IllIlIlIIi = killBonus;
      this.lllIlIlIIi = selfWeight;
      this.illIlIlIIi = turnCost;
      this.IilIlIlIIi = denyEnemyCrystals;
      this.lilIlIlIIi = denyThreat;
      this.iilIlIlIIi = obsidianPenalty;
      this.IIiIlIlIIi = breakTempo;
      this.lIiIlIlIIi = actReachMargin;
      this.iIiIlIlIIi = robustTop;
      this.IliIlIlIIi = levelGate;
      this.lliIlIlIIi = levelLo;
      this.iliIlIlIIi = levelHi;
      this.IiiIlIlIIi = levelLowMin;
      this.liiIlIlIIi = adjPref;
      this.iiiIlIlIIi = adjMax;
      this.IIIllIlIIi = adjacentBonus;
      this.lIIllIlIIi = lowPenalty;
      this.iIIllIlIIi = tradeRule;
      this.IlIllIlIIi = selfSpent;
      this.llIllIlIIi = popTrade;
      this.ilIllIlIIi = floorDamage;
      this.IiIllIlIIi = tradeMode;
   }

   public lIiillIiiIiillIi IlIlllIlilIl(boolean v) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         this.iiIIlIlIIi,
         this.IIlIlIlIIi,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         this.lllIlIlIIi,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         v,
         this.lliIlIlIIi,
         this.iliIlIlIIi,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         this.iIIllIlIIi,
         this.IlIllIlIIi,
         this.llIllIlIIi,
         this.ilIllIlIIi,
         this.IiIllIlIIi
      );
   }

   public lIiillIiiIiillIi(
      double dyMin,
      double obsidianPenalty,
      int radius,
      int eliteMode,
      int keepCone,
      int targetDyMax,
      int minDamage,
      int breakTempo,
      int robustTop,
      boolean planCone,
      float targetRadius,
      float offWeight,
      float targetDyMin,
      float denyEnemyCrystals,
      float turnCost,
      float denyThreat,
      float selfWeight,
      boolean popBonus,
      float actReachMargin,
      float maxEvaluations,
      float dyMax,
      double breakMinDamage,
      int killBonus
   ) {
      this(
         dyMin,
         obsidianPenalty,
         radius,
         eliteMode,
         keepCone,
         targetDyMax,
         minDamage,
         breakTempo,
         robustTop,
         planCone,
         targetRadius,
         offWeight,
         targetDyMin,
         denyEnemyCrystals,
         turnCost,
         denyThreat,
         selfWeight,
         popBonus,
         actReachMargin,
         maxEvaluations,
         dyMax,
         breakMinDamage,
         killBonus,
         false,
         -0.6,
         0.45,
         -1.05,
         1.6,
         2.3,
         0.0F,
         0.0F
      );
   }

   public boolean iIlllIllll() {
      return this.iIIllIlIIi;
   }

   public boolean Iillllilll() {
      return this.llIllIlIIi;
   }

   public int IIlilIliiIli() {
      return this.llIIlIlIIi;
   }

   public int IlIillIiilIi() {
      return this.iIIIlIlIIi;
   }

   public double lIIlliIIll() {
      return this.IiiIlIlIIi;
   }

   public int Illillliilli() {
      return this.ilIIlIlIIi;
   }

   public boolean IIiilIiiiIii() {
      return this.liIIlIlIIi;
   }

   public lIiillIiiIiillIi(
      double breakMinDamage,
      double eliteMode,
      int dyMin,
      int robustTop,
      int actReachMargin,
      int dyMax,
      int breakTempo,
      int selfSpent,
      int levelLo,
      boolean keepCone,
      float targetDyMin,
      float denyEnemyCrystals,
      float minDamage,
      float levelHi,
      float turnCost,
      float adjacentBonus,
      float levelLowMin,
      boolean adjMax,
      float popBonus,
      float maxEvaluations,
      float targetDyMax,
      double killBonus,
      int offWeight,
      boolean planCone,
      double popTrade,
      double obsidianPenalty,
      double selfWeight,
      double targetRadius,
      double adjPref,
      float levelGate,
      float denyThreat,
      boolean radius,
      float tradeRule,
      boolean lowPenalty
   ) {
      this(
         breakMinDamage,
         eliteMode,
         dyMin,
         robustTop,
         actReachMargin,
         dyMax,
         breakTempo,
         selfSpent,
         levelLo,
         keepCone,
         targetDyMin,
         denyEnemyCrystals,
         minDamage,
         levelHi,
         turnCost,
         adjacentBonus,
         levelLowMin,
         adjMax,
         popBonus,
         maxEvaluations,
         targetDyMax,
         killBonus,
         offWeight,
         planCone,
         popTrade,
         obsidianPenalty,
         selfWeight,
         targetRadius,
         adjPref,
         levelGate,
         denyThreat,
         radius,
         tradeRule,
         lowPenalty,
         0.0F
      );
   }

   public lIiillIiiIiillIi IilliliilIIi(float v) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         this.iiIIlIlIIi,
         this.IIlIlIlIIi,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         this.lllIlIlIIi,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         this.IliIlIlIIi,
         this.lliIlIlIIi,
         this.iliIlIlIIi,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         this.iIIllIlIIi,
         this.IlIllIlIIi,
         this.llIllIlIIi,
         v,
         this.IiIllIlIIi
      );
   }

   public double Ililllililil() {
      return this.iiiiIIlIIi;
   }

   public float IiIIlliIIl() {
      return this.lllIlIlIIi;
   }

   public int Iilililiiili() {
      return this.IiIIlIlIIi;
   }

   public double IiiIlliiIl() {
      return this.lliIlIlIIi;
   }

   public float liIlliiIll() {
      return this.IIIllIlIIi;
   }

   public double IlIllllIll() {
      return this.liiIlIlIIi;
   }

   public lIiillIiiIiillIi IIlllIlliIll(ilIiliilIiIiliil m) {
      return new lIiillIiiIiillIi(
         this.liiiIIlIIi,
         this.iiiiIIlIIi,
         this.IIIIlIlIIi,
         this.lIIIlIlIIi,
         this.iIIIlIlIIi,
         this.IlIIlIlIIi,
         this.llIIlIlIIi,
         this.ilIIlIlIIi,
         this.IiIIlIlIIi,
         this.liIIlIlIIi,
         this.iiIIlIlIIi,
         this.IIlIlIlIIi,
         this.lIlIlIlIIi,
         this.iIlIlIlIIi,
         this.IllIlIlIIi,
         this.lllIlIlIIi,
         this.illIlIlIIi,
         this.IilIlIlIIi,
         this.lilIlIlIIi,
         this.iilIlIlIIi,
         this.IIiIlIlIIi,
         this.lIiIlIlIIi,
         this.iIiIlIlIIi,
         this.IliIlIlIIi,
         this.lliIlIlIIi,
         this.iliIlIlIIi,
         this.IiiIlIlIIi,
         this.liiIlIlIIi,
         this.iiiIlIlIIi,
         this.IIIllIlIIi,
         this.lIIllIlIIi,
         this.iIIllIlIIi,
         this.IlIllIlIIi,
         this.llIllIlIIi,
         this.ilIllIlIIi,
         m
      );
   }
}
