package gg.corz;

public final class iiIiIliIIliIli {
   private float lIiiIlIIIl = Float.NaN;

   public float lIiiIiIlilli() {
      return Float.isNaN(this.lIiiIlIIIl) ? 0.0F : this.lIiiIlIIIl;
   }

   public float liiiIIllIl(float target, float tau, float eps, float dt) {
      if (Float.isNaN(this.lIiiIlIIIl)) {
         this.lIiiIlIIIl = target;
         return this.lIiiIlIIIl;
      } else {
         this.lIiiIlIIIl = this.lIiiIlIIIl + (target - this.lIiiIlIIIl) * (1.0F - (float)Math.exp((double)(-tau / eps)));
         if (Math.abs(target - this.lIiiIlIIIl) < dt) {
            this.lIiiIlIIIl = target;
         }

         return this.lIiiIlIIIl;
      }
   }

   public float IilliliilIIi(float tau, float target, float dt) {
      return Math.max(tau, this.IliIlllilIi(tau, target, dt));
   }

   public void iIlIlllllill() {
      this.lIiiIlIIIl = Float.NaN;
   }

   public float IliIlllilIi(float tau, float dt, float target) {
      return this.liiiIIllIl(tau, dt, target, 0.05F);
   }
}
