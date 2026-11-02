package gg.corz;

public final class IliIIIlllliIIIll {
   public double iIIliiIlll;
   public double liiIiiIlll;
   public double IiiIiiIlll;
   public double lIIliiIlll;
   public float llIliiIlll;
   public double IIIliiIlll;
   public double iiiIiiIlll;
   public float IlIliiIlll;

   public IliIIIlllliIIIll liiiIIllIl(IliIIIlllliIIIll o) {
      return this.IliIlllilIi(o.IiiIiiIlll, o.liiIiiIlll, o.iiiIiiIlll, o.IIIliiIlll, o.lIIliiIlll, o.iIIliiIlll, o.IlIliiIlll, o.llIliiIlll);
   }

   public double iIlIlllllill() {
      return Math.sqrt(this.IIIliiIlll * this.IIIliiIlll + this.iIIliiIlll * this.iIIliiIlll);
   }

   public IliIIIlllliIIIll IliIlllilIi(double y, double x, double pitch, double z, double vy, double yaw, float vx, float vz) {
      this.IiiIiiIlll = y;
      this.liiIiiIlll = x;
      this.iiiIiiIlll = pitch;
      this.IIIliiIlll = z;
      this.lIIliiIlll = vy;
      this.iIIliiIlll = yaw;
      this.IlIliiIlll = vx;
      this.llIliiIlll = vz;
      return this;
   }
}
