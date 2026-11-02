package gg.corz;

record lIlIlIlliIlIlIll(lIiliiiliIiliiil offer, lIiIiIIiiIiIiIIi parts, double expo, boolean build) {
   private final lIiliiiliIiliiil IiilIillll;
   private final lIiIiIIiiIiIiIIi liilIillll;
   private final boolean IIIiIillll;
   private final double iiilIillll;

   public boolean IilliliilIIi() {
      return this.IIIiIillll;
   }

   public double iIlIlllllill() {
      return this.iiilIillll;
   }

   public lIiliiiliIiliiil IliIlllilIi() {
      return this.IiilIillll;
   }

   public lIiIiIIiiIiIiIIi liiiIIllIl() {
      return this.liilIillll;
   }

   private lIlIlIlliIlIlIll(lIiliiiliIiliiil offer, lIiIiIIiiIiIiIIi parts, double expo, boolean build) {
      this.IiilIillll = offer;
      this.liilIillll = parts;
      this.iiilIillll = expo;
      this.IIIiIillll = build;
   }
}
