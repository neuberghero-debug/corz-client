package gg.corz;

public record IIIIIlilIIIIli(long tick, float yaw, float pitch, IiilIiIiliilIiIi purpose, boolean hold) {
   private final float llIllliiiilIllliii;
   private final float iIIllliiiIlIllliii;
   private final boolean iiIllliiiIIlllliii;
   private final long IIIllliiilIIllliii;
   private final IiilIiIiliilIiIi IiIllliiiliIllliii;

   public float liiiIIllIl() {
      return this.iIIllliiiIlIllliii;
   }

   public IiilIiIiliilIiIi IilliliilIIi() {
      return this.IiIllliiiliIllliii;
   }

   public boolean lIiiIiIlilli() {
      return this.iiIllliiiIIlllliii;
   }

   public IIIIIlilIIIIli(long tick, float yaw, float pitch, IiilIiIiliilIiIi purpose, boolean hold) {
      this.IIIllliiilIIllliii = tick;
      this.iIIllliiiIlIllliii = yaw;
      this.llIllliiiilIllliii = pitch;
      this.IiIllliiiliIllliii = purpose;
      this.iiIllliiiIIlllliii = hold;
   }

   public long IliIlllilIi() {
      return this.IIIllliiilIIllliii;
   }

   public float iIlIlllllill() {
      return this.llIllliiiilIllliii;
   }
}
