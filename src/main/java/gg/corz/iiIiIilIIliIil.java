package gg.corz;

public final class iiIiIilIIliIil {
   private float IIIiIliIilIIiIliIi;
   private float iIIiIliIiIlIiIliIi;

   public float[] IliIlllilIi(float pitch, float driftPitch, float cap, float driftYaw, float targetYaw, float yaw, float targetPitch) {
      targetYaw = Math.max(1.0F, Math.min(30.0F, targetYaw));
      float var8 = Math.min(8.0F, targetYaw / 3.0F);
      this.IIIiIliIilIIiIliIi = this.liiiIIllIl(llIlillilIlill.IliIlllilIi(pitch, cap + yaw), this.IIIiIliIilIIiIliIi, targetYaw, var8);
      this.iIIiIliIiIlIiIliIi = this.liiiIIllIl(driftYaw + targetPitch - driftPitch, this.iIIiIliIiIlIiIliIi, targetYaw, var8);
      return new float[]{pitch + this.IIIiIliIilIIiIliIi, Math.max(-90.0F, Math.min(90.0F, driftPitch + this.iIIiIliIiIlIiIliIi))};
   }

   public void iIlIlllllill() {
      this.IIIiIliIilIIiIliIi = this.iIIiIliIiIlIiIliIi = 0.0F;
   }

   private float liiiIIllIl(float cap, float accel, float v, float distance) {
      float var5 = Math.max(-v, Math.min(v, cap * 0.65F));
      return Math.max(accel - distance, Math.min(accel + distance, var5));
   }
}
