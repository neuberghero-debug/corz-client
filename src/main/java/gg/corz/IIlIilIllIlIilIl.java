package gg.corz;

public record IIlIilIllIlIilIl(
   int tick,
   double y,
   boolean onGround,
   double horizontalSpeed,
   boolean feetOnColumn,
   boolean clearOfTarget,
   boolean aimAligned,
   boolean rayOnSupportTop,
   boolean targetAir,
   boolean targetBuilt,
   boolean slippery
) {
   private final boolean iillilliIl;
   private final double IIililliIl;
   private final boolean llililliIl;
   private final boolean liililliIl;
   private final boolean IlililliIl;
   private final boolean IiililliIl;
   private final double lillilliIl;
   private final boolean iIililliIl;
   private final boolean ilililliIl;
   private final boolean lIililliIl;
   private final int IillilliIl;

   public boolean iliIiiliiiii() {
      return this.iIililliIl;
   }

   public IIlIilIllIlIilIl(
      int tick,
      double y,
      boolean onGround,
      double horizontalSpeed,
      boolean feetOnColumn,
      boolean clearOfTarget,
      boolean aimAligned,
      boolean rayOnSupportTop,
      boolean targetAir,
      boolean targetBuilt,
      boolean slippery
   ) {
      this.IillilliIl = tick;
      this.lillilliIl = y;
      this.iillilliIl = onGround;
      this.IIililliIl = horizontalSpeed;
      this.lIililliIl = feetOnColumn;
      this.iIililliIl = clearOfTarget;
      this.IlililliIl = aimAligned;
      this.llililliIl = rayOnSupportTop;
      this.ilililliIl = targetAir;
      this.IiililliIl = targetBuilt;
      this.liililliIl = slippery;
   }

   public boolean IIIllIIliIIl() {
      return this.IlililliIl;
   }

   public double IilliliilIIi() {
      return this.IIililliIl;
   }

   public int IliIlllilIi() {
      return this.IillilliIl;
   }

   public double liiiIIllIl() {
      return this.lillilliIl;
   }

   public boolean IiIlliIliiIl() {
      return this.ilililliIl;
   }

   public boolean IlIlllIlilIl() {
      return this.llililliIl;
   }

   public boolean Illlllllilll() {
      return this.liililliIl;
   }

   public boolean iIlIlllllill() {
      return this.iillilliIl;
   }

   public boolean IIlllIlliIll() {
      return this.IiililliIl;
   }

   public boolean lIiiIiIlilli() {
      return this.lIililliIl;
   }
}
