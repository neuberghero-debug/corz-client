package gg.corz;

public record IIlIiiilIlIiii(int tick, double x, double y, double z, int feetX, int feetY, int feetZ, boolean onGround, boolean collision, boolean sprinting) {
   private final double lIiiiliIIl;
   private final boolean iiiiiliIIl;
   private final double iIiiiliIIl;
   private final boolean IIIIIiiIIl;
   private final int iliiiliIIl;
   private final int IIiiiliIIl;
   private final int lliiiliIIl;
   private final boolean liiiiliIIl;
   private final double IliiiliIIl;
   private final int IiiiiliIIl;

   public double liiiIIllIl() {
      return this.lIiiiliIIl;
   }

   public int IliIlllilIi() {
      return this.IIiiiliIIl;
   }

   public boolean IiIlliIliiIl() {
      return this.iiiiiliIIl;
   }

   public int lIiiIiIlilli() {
      return this.lliiiliIIl;
   }

   public int iliIiiliiiii() {
      return this.iliiiliIIl;
   }

   public int IIIllIIliIIl() {
      return this.IiiiiliIIl;
   }

   public IIlIiiilIlIiii(int feetY, double x, double feetZ, double tick, int feetX, int collision, int z, boolean y, boolean onGround) {
      this(feetY, x, feetZ, tick, feetX, collision, z, y, onGround, false);
   }

   public boolean IlIlllIlilIl() {
      return this.liiiiliIIl;
   }

   public double IilliliilIIi() {
      return this.IliiiliIIl;
   }

   public boolean IIlllIlliIll() {
      return this.IIIIIiiIIl;
   }

   public double iIlIlllllill() {
      return this.iIiiiliIIl;
   }

   public IIlIiiilIlIiii(int tick, double x, double y, double z, int feetX, int feetY, int feetZ, boolean onGround, boolean collision, boolean sprinting) {
      this.IIiiiliIIl = tick;
      this.lIiiiliIIl = x;
      this.iIiiiliIIl = y;
      this.IliiiliIIl = z;
      this.lliiiliIIl = feetX;
      this.iliiiliIIl = feetY;
      this.IiiiiliIIl = feetZ;
      this.liiiiliIIl = onGround;
      this.iiiiiliIIl = collision;
      this.IIIIIiiIIl = sprinting;
   }
}
