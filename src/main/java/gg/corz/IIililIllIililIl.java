package gg.corz;

public record IIililIllIililIl(
   int tick,
   long routeFingerprint,
   int routeIndex,
   long feetCell,
   double distance,
   double verticalDistance,
   boolean onGround,
   iiiIIiilIIIlIiil transition,
   long constructionEpoch,
   boolean placementReady,
   boolean atNode
) {
   private final iiiIIiilIIIlIiil IlillilIll;
   private final boolean ilillilIll;
   private final long IilllilIll;
   private final boolean IiillilIll;
   private final double IIillilIll;
   private final int illllilIll;
   private final long llillilIll;
   private final boolean iIillilIll;
   private final long iilllilIll;
   private final int lilllilIll;
   private final double lIillilIll;

   public int iIlIlllllill() {
      return this.lilllilIll;
   }

   public long IilliliilIIi() {
      return this.iilllilIll;
   }

   public long liiiIIllIl() {
      return this.IilllilIll;
   }

   public int IliIlllilIi() {
      return this.illllilIll;
   }

   public boolean IIIllIIliIIl() {
      return this.iIillilIll;
   }

   public iiiIIiilIIIlIiil IlIlllIlilIl() {
      return this.IlillilIll;
   }

   public IIililIllIililIl(
      int tick,
      long routeFingerprint,
      int routeIndex,
      long feetCell,
      double distance,
      double verticalDistance,
      boolean onGround,
      iiiIIiilIIIlIiil transition,
      long constructionEpoch,
      boolean placementReady,
      boolean atNode
   ) {
      this.illllilIll = tick;
      this.IilllilIll = routeFingerprint;
      this.lilllilIll = routeIndex;
      this.iilllilIll = feetCell;
      this.IIillilIll = distance;
      this.lIillilIll = verticalDistance;
      this.iIillilIll = onGround;
      this.IlillilIll = transition;
      this.llillilIll = constructionEpoch;
      this.ilillilIll = placementReady;
      this.IiillilIll = atNode;
   }

   public double iliIiiliiiii() {
      return this.lIillilIll;
   }

   public boolean IIlllIlliIll() {
      return this.ilillilIll;
   }

   public double lIiiIiIlilli() {
      return this.IIillilIll;
   }

   public long IiIlliIliiIl() {
      return this.llillilIll;
   }

   public boolean Illlllllilll() {
      return this.IiillilIll;
   }

   public IIililIllIililIl(
      int onGround,
      long constructionEpoch,
      int routeFingerprint,
      long verticalDistance,
      double transition,
      double placementReady,
      boolean tick,
      iiiIIiilIIIlIiil feetCell,
      long routeIndex,
      boolean distance
   ) {
      this(onGround, constructionEpoch, routeFingerprint, verticalDistance, transition, placementReady, tick, feetCell, routeIndex, distance, true);
   }
}
