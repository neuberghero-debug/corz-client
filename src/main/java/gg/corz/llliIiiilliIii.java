package gg.corz;

record llliIiiilliIii(iliIlIliIiiIlIli plan, int slot) {
   private final int IIlIlIiIIl;
   private final iliIlIliIiiIlIli iiIIlIiIIl;

   private llliIiiilliIii(iliIlIliIiiIlIli plan, int slot) {
      this.iiIIlIiIIl = plan;
      this.IIlIlIiIIl = slot;
   }

   public int iIlIlllllill() {
      return this.IIlIlIiIIl;
   }

   public iliIlIliIiiIlIli liiiIIllIl() {
      return this.iiIIlIiIIl;
   }

   boolean IliIlllilIi() {
      return this.iiIIlIiIIl == null;
   }
}
