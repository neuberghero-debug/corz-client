package gg.corz;

public final class liiIiiiiiiIiii {
   private float IiilliiIIl;
   private boolean llilliiIIl;
   private float liilliiIIl;
   private float iiilliiIIl;
   private long ililliiIIl;
   private float IIIiliiIIl;

   private static float IIIllIIliIIl(float t) {
      return !(t > 0.0F) ? 0.0F : Math.min(t, 1.0F);
   }

   public float lIiiIiIlilli(float tickDelta) {
      return this.liilliiIIl + (this.IIIiliiIIl - this.liilliiIIl) * IIIllIIliIIl(tickDelta);
   }

   public float IilliliilIIi(float tickDelta) {
      return this.IiilliiIIl + (this.iiilliiIIl - this.IiilliiIIl) * IIIllIIliIIl(tickDelta);
   }

   public void liiiIIllIl() {
      this.llilliiIIl = false;
   }

   public boolean iIlIlllllill(long tick, float bodyYaw, float bodyPitch) {
      return this.llilliiIIl
         && tick == this.ililliiIIl
         && iliIiiliiiii(this.iiilliiIIl, bodyYaw)
         && iliIiiliiiii(this.IIIiliiIIl, bodyPitch)
         && Math.abs(this.iiilliiIIl - this.IiilliiIIl) < 180.0F
         && Math.abs(this.IIIiliiIIl - this.liilliiIIl) < 180.0F;
   }

   public void IliIlllilIi(long fromYaw, float toPitch, float fromPitch, float toYaw, float tick) {
      if (Float.isFinite(toPitch) && Float.isFinite(fromPitch) && Float.isFinite(toYaw) && Float.isFinite(tick)) {
         this.ililliiIIl = fromYaw;
         this.IiilliiIIl = toPitch;
         this.liilliiIIl = fromPitch;
         this.iiilliiIIl = toYaw;
         this.IIIiliiIIl = tick;
         this.llilliiIIl = true;
      } else {
         this.llilliiIIl = false;
      }
   }

   private static boolean iliIiiliiiii(float a, float b) {
      float var2 = Math.max(1.0E-4F, 4.0F * Math.ulp(Math.max(Math.abs(a), Math.abs(b))));
      return Math.abs(a - b) < var2;
   }
}
