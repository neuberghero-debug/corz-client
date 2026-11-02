package gg.corz;

public record iilllIIill(
   int routeIndex,
   boolean arrived,
   double targetX,
   double targetZ,
   double horizontalDistance,
   double verticalDistance,
   boolean occupiesSurface,
   boolean settled
) {
   private final double iIlIIIiIllIIIi;
   private final boolean ilIIIIiIiIIIIi;
   private final double IIlIIIilIlIIIi;
   private final double liIIIIiiiIIIIi;
   private final boolean iilIIIiIIiIIIi;
   private final double lllIIIiillIIIi;
   private final boolean IilIIIililIIIi;
   private final int IlIIIIillIIIIi;

   public double iIlIlllllill() {
      return this.liIIIIiiiIIIIi;
   }

   public iilllIIill(
      int routeIndex,
      boolean arrived,
      double targetX,
      double targetZ,
      double horizontalDistance,
      double verticalDistance,
      boolean occupiesSurface,
      boolean settled
   ) {
      this.IlIIIIillIIIIi = routeIndex;
      this.ilIIIIiIiIIIIi = arrived;
      this.liIIIIiiiIIIIi = targetX;
      this.IIlIIIilIlIIIi = targetZ;
      this.iIlIIIiIllIIIi = horizontalDistance;
      this.lllIIIiillIIIi = verticalDistance;
      this.IilIIIililIIIi = occupiesSurface;
      this.iilIIIiIIiIIIi = settled;
   }

   public double lIiiIiIlilli() {
      return this.iIlIIIiIllIIIi;
   }

   public double IilliliilIIi() {
      return this.IIlIIIilIlIIIi;
   }

   public int IliIlllilIi() {
      return this.IlIIIIillIIIIi;
   }

   public boolean IIIllIIliIIl() {
      return this.IilIIIililIIIi;
   }

   public boolean liiiIIllIl() {
      return this.ilIIIIiIiIIIIi;
   }

   public double iliIiiliiiii() {
      return this.lllIIIiillIIIi;
   }

   public boolean IlIlllIlilIl() {
      return this.iilIIIiIIiIIIi;
   }
}
