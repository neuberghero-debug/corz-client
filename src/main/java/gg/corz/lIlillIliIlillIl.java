package gg.corz;

record lIlillIliIlillIl(long tick, float scaled, float damage, float ehpAtFire, long deadline) {
   private final float iiiIIlliIl;
   private final long liiIIlliIl;
   private final float IIIlIlliIl;
   private final long iIIlIlliIl;
   private final float lIIlIlliIl;

   public float liiiIIllIl() {
      return this.iiiIIlliIl;
   }

   public long IliIlllilIi() {
      return this.liiIIlliIl;
   }

   public float IilliliilIIi() {
      return this.lIIlIlliIl;
   }

   public long lIiiIiIlilli() {
      return this.iIIlIlliIl;
   }

   public float iIlIlllllill() {
      return this.IIIlIlliIl;
   }

   private lIlillIliIlillIl(long tick, float scaled, float damage, float ehpAtFire, long deadline) {
      this.liiIIlliIl = tick;
      this.iiiIIlliIl = scaled;
      this.IIIlIlliIl = damage;
      this.lIIlIlliIl = ehpAtFire;
      this.iIIlIlliIl = deadline;
   }
}
