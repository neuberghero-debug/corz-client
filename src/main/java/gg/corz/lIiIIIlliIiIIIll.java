package gg.corz;

record lIiIIIlliIiIIIll(int targetId, int selfId, double eyeX, double eyeY, double eyeZ, double halfWidth, double height, double minLatency, double maxLatency) {
   private final double iIiIiiIlll;
   private final double IIiIiiIlll;
   private final double iliIiiIlll;
   private final double iilIiiIlll;
   private final double lliIiiIlll;
   private final int lilIiiIlll;
   private final double IliIiiIlll;
   private final double lIiIiiIlll;
   private final int IilIiiIlll;

   public double IlIlllIlilIl() {
      return this.lliIiiIlll;
   }

   private lIiIIIlliIiIIIll(
      int targetId, int selfId, double eyeX, double eyeY, double eyeZ, double halfWidth, double height, double minLatency, double maxLatency
   ) {
      this.IilIiiIlll = targetId;
      this.lilIiiIlll = selfId;
      this.iilIiiIlll = eyeX;
      this.IIiIiiIlll = eyeY;
      this.lIiIiiIlll = eyeZ;
      this.iIiIiiIlll = halfWidth;
      this.IliIiiIlll = height;
      this.lliIiiIlll = minLatency;
      this.iliIiiIlll = maxLatency;
   }

   public double iIlIlllllill() {
      return this.iilIiiIlll;
   }

   public double IIIllIIliIIl() {
      return this.IliIiiIlll;
   }

   public double iliIiiliiiii() {
      return this.iIiIiiIlll;
   }

   public double IilliliilIIi() {
      return this.IIiIiiIlll;
   }

   public int liiiIIllIl() {
      return this.lilIiiIlll;
   }

   public int IliIlllilIi() {
      return this.IilIiiIlll;
   }

   public double IiIlliIliiIl() {
      return this.iliIiiIlll;
   }

   public double lIiiIiIlilli() {
      return this.lIiIiiIlll;
   }
}
