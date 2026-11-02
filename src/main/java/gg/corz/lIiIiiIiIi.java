package gg.corz;

record lIiIiiIiIi(long tick, illliIIiIilliIIi plan, IliIllilliIlli kick, boolean sprintHit, float meleeRaw, boolean turning) {
   private final IliIllilliIlli lIIiIiiiIIiIii;
   private final long IiilIiiliilIii;
   private final illliIIiIilliIIi iiilIiiIIIiIii;
   private final float ilIiIiiIiIiIii;
   private final boolean IlIiIiillIiIii;
   private final boolean liIiIiiiiIiIii;

   public IliIllilliIlli iIlIlllllill() {
      return this.lIIiIiiiIIiIii;
   }

   public illliIIiIilliIIi liiiIIllIl() {
      return this.iiilIiiIIIiIii;
   }

   public float lIiiIiIlilli() {
      return this.ilIiIiiIiIiIii;
   }

   public long IliIlllilIi() {
      return this.IiilIiiliilIii;
   }

   public boolean IilliliilIIi() {
      return this.IlIiIiillIiIii;
   }

   private lIiIiiIiIi(long tick, illliIIiIilliIIi plan, IliIllilliIlli kick, boolean sprintHit, float meleeRaw, boolean turning) {
      this.IiilIiiliilIii = tick;
      this.iiilIiiIIIiIii = plan;
      this.lIIiIiiiIIiIii = kick;
      this.IlIiIiillIiIii = sprintHit;
      this.ilIiIiiIiIiIii = meleeRaw;
      this.liIiIiiiiIiIii = turning;
   }

   public boolean iliIiiliiiii() {
      return this.liIiIiiiiIiIii;
   }
}
