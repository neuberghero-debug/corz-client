package gg.corz;

public record lIlIIliiIlIIli(iIiliiiIliliii connector, iIiliiiIliliii column, iIiliiiIliliii next, lIiiiiIiii stage, int estimatedRemaining) {
   private final lIiiiiIiii llilIiiiiililIiiii;
   private final int IiilIiiiiliilIiiii;
   private final iIiliiiIliliii iIilIiiiiIlilIiiii;
   private final iIiliiiIliliii lillIiiiiiillIiiii;
   private final iIiliiiIliliii IIilIiiiilIilIiiii;

   public iIiliiiIliliii iIlIlllllill() {
      return this.iIilIiiiiIlilIiiii;
   }

   public iIiliiiIliliii IliIlllilIi() {
      return this.lillIiiiiiillIiiii;
   }

   public lIiiiiIiii IilliliilIIi() {
      return this.llilIiiiiililIiiii;
   }

   public iIiliiiIliliii liiiIIllIl() {
      return this.IIilIiiiilIilIiiii;
   }

   public int lIiiIiIlilli() {
      return this.IiilIiiiiliilIiiii;
   }

   public lIlIIliiIlIIli(iIiliiiIliliii connector, iIiliiiIliliii column, iIiliiiIliliii next, lIiiiiIiii stage, int estimatedRemaining) {
      this.lillIiiiiiillIiiii = connector;
      this.IIilIiiiilIilIiiii = column;
      this.iIilIiiiiIlilIiiii = next;
      this.llilIiiiiililIiiii = stage;
      this.IiilIiiiiliilIiiii = estimatedRemaining;
   }
}
