package gg.corz;

public final class llIIiililIIiil {
   public double iiIiIiIliIIliIiIli;
   public double lIliIiIliiIliIiIli;

   public void IliIlllilIi(double dt, double damping, double stiffness, double target) {
      if (!(target <= 0.0)) {
         double var9 = (dt - this.iiIiIiIliIIliIiIli) * damping - this.lIliIiIliiIliIiIli * stiffness;
         this.lIliIiIliiIliIiIli += var9 * target;
         this.iiIiIiIliIIliIiIli = this.iiIiIiIliIIliIiIli + this.lIliIiIliiIliIiIli * target;
      }
   }

   public llIIiililIIiil(double initial) {
      this.iiIiIiIliIIliIiIli = initial;
   }

   public void liiiIIllIl(double v) {
      this.iiIiIiIliIIliIiIli = v;
      this.lIliIiIliiIliIiIli = 0.0;
   }

   public boolean iIlIlllllill(double eps, double target) {
      return Math.abs(this.iiIiIiIliIIliIiIli - eps) < target && Math.abs(this.lIliIiIliiIliIiIli) < target;
   }
}
