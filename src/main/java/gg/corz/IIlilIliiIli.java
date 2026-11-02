package gg.corz;

final class IIlilIliiIli {
   private float llIlllilIlll;
   private float IiIlllliIlll;
   private boolean iiIlllIIllll = true;

   void IliIlllilIi(float target) {
      this.llIlllilIlll = target;
      this.IiIlllliIlll = 0.0F;
      this.iiIlllIIllll = true;
   }

   boolean liiiIIllIl() {
      return this.iiIlllIIllll;
   }

   private IIlilIliiIli() {
   }

   float iIlIlllllill(float dt, float zeta, float omega, float target) {
      float var5 = this.llIlllilIlll - dt;
      if (zeta <= 0.0F) {
         return this.llIlllilIlll;
      } else if (Math.abs(var5) < 0.001F && Math.abs(this.IiIlllliIlll) < 0.02F) {
         this.llIlllilIlll = dt;
         this.IiIlllliIlll = 0.0F;
         this.iiIlllIIllll = true;
         return this.llIlllilIlll;
      } else {
         this.iiIlllIIllll = false;
         float var6 = target * omega;
         float var7 = omega * (float)Math.sqrt((double)(1.0F - target * target));
         float var8 = (float)Math.exp((double)(-var6 * zeta));
         float var9 = (float)Math.cos((double)(var7 * zeta));
         float var10 = (float)Math.sin((double)(var7 * zeta));
         float var11 = (this.IiIlllliIlll + var6 * var5) / var7;
         this.llIlllilIlll = dt + var8 * (var5 * var9 + var11 * var10);
         this.IiIlllliIlll = var8 * ((var11 * var7 - var6 * var5) * var9 - (var5 * var7 + var6 * var11) * var10);
         return this.llIlllilIlll;
      }
   }
}
