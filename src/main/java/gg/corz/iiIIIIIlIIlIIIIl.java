package gg.corz;

record iiIIIIIlIIlIIIIl(boolean ok, float dealt, float cost, float full, boolean pops, boolean kills) {
   private final boolean IIiiIiIlIl;
   private final float liliIiIlIl;
   private final boolean iiliIiIlIl;
   static final iiIIIIIlIIlIIIIl lIiiIiIlIl = new iiIIIIIlIIlIIIIl(false, 0.0F, 0.0F, 0.0F, false, false);
   private final boolean llliIiIlIl;
   private final float IiliIiIlIl;
   private final float illiIiIlIl;

   public float liiiIIllIl() {
      return this.illiIiIlIl;
   }

   public boolean iliIiiliiiii() {
      return this.IIiiIiIlIl;
   }

   public float IilliliilIIi() {
      return this.liliIiIlIl;
   }

   public float iIlIlllllill() {
      return this.IiliIiIlIl;
   }

   private iiIIIIIlIIlIIIIl(boolean ok, float dealt, float cost, float full, boolean pops, boolean kills) {
      this.llliIiIlIl = ok;
      this.illiIiIlIl = dealt;
      this.IiliIiIlIl = cost;
      this.liliIiIlIl = full;
      this.iiliIiIlIl = pops;
      this.IIiiIiIlIl = kills;
   }

   public boolean IliIlllilIi() {
      return this.llliIiIlIl;
   }

   public boolean lIiiIiIlilli() {
      return this.iiliIiIlIl;
   }
}
