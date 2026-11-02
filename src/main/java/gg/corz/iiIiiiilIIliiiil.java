package gg.corz;

public record iiIiiiilIIliiiil(int tick, float yaw, float pitch, boolean moving, boolean sprinting, boolean sneaking) {
   private final boolean lliIIiIiil;
   private final float lIiIIiIiil;
   private final float IIiIIiIiil;
   private final boolean iIiIIiIiil;
   private final boolean IliIIiIiil;
   private final int iilIIiIiil;

   public boolean lIiiIiIlilli() {
      return this.IliIIiIiil;
   }

   public boolean IilliliilIIi() {
      return this.iIiIIiIiil;
   }

   public int IliIlllilIi() {
      return this.iilIIiIiil;
   }

   public float liiiIIllIl() {
      return this.IIiIIiIiil;
   }

   public iiIiiiilIIliiiil(int tick, float yaw, float pitch, boolean moving, boolean sprinting, boolean sneaking) {
      this.iilIIiIiil = tick;
      this.IIiIIiIiil = yaw;
      this.lIiIIiIiil = pitch;
      this.iIiIIiIiil = moving;
      this.IliIIiIiil = sprinting;
      this.lliIIiIiil = sneaking;
   }

   public boolean iliIiiliiiii() {
      return this.lliIIiIiil;
   }

   public float iIlIlllllill() {
      return this.lIiIIiIiil;
   }
}
