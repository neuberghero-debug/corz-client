package gg.corz;

public record iIllliiIllllii(float yaw, float pitch, float yawVelocity, float pitchVelocity) {
   private final float IIllIliIIl;
   private final float iIllIliIIl;
   private final float lIllIliIIl;
   private final float IlllIliIIl;

   public float liiiIIllIl() {
      return this.lIllIliIIl;
   }

   public float IilliliilIIi() {
      return this.IlllIliIIl;
   }

   public float IliIlllilIi() {
      return this.IIllIliIIl;
   }

   public float iIlIlllllill() {
      return this.iIllIliIIl;
   }

   public iIllliiIllllii(float yaw, float pitch, float yawVelocity, float pitchVelocity) {
      this.IIllIliIIl = yaw;
      this.lIllIliIIl = pitch;
      this.iIllIliIIl = yawVelocity;
      this.IlllIliIIl = pitchVelocity;
   }
}
