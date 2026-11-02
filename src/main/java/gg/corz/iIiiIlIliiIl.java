package gg.corz;

record iIiiIlIliiIl(boolean projected, boolean resting, boolean unsafe, double ux, double uz) {
   private final double liiiililiiiiilil;
   private final boolean Iliiilillliiilil;
   private final boolean iliiililIiiiilil;
   private final double IIIIIiillIIIIiil;
   private final boolean lIiiililiIiiilil;

   private iIiiIlIliiIl(boolean projected, boolean resting, boolean unsafe, double ux, double uz) {
      this.lIiiililiIiiilil = projected;
      this.Iliiilillliiilil = resting;
      this.iliiililIiiiilil = unsafe;
      this.liiiililiiiiilil = ux;
      this.IIIIIiillIIIIiil = uz;
   }

   public double IilliliilIIi() {
      return this.liiiililiiiiilil;
   }

   public boolean iIlIlllllill() {
      return this.iliiililIiiiilil;
   }

   public double lIiiIiIlilli() {
      return this.IIIIIiillIIIIiil;
   }

   public boolean IliIlllilIi() {
      return this.lIiiililiIiiilil;
   }

   public boolean liiiIIllIl() {
      return this.Iliiilillliiilil;
   }
}
