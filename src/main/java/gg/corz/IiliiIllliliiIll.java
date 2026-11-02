package gg.corz;

public final class IiliiIllliliiIll {
   private static final int lIllliilll = 64;
   private final float[] llllliilll;
   private final long[] iIllliilll = new long[64];
   private final float[] illlliilll;
   private final int[] Illlliilll = new int[64];
   private int Iillliilll;
   private int lillliilll;

   public void liiiIIllIl() {
      this.Iillliilll = 0;
      this.lillliilll = 0;
   }

   public int iIlIlllllill() {
      return this.Iillliilll;
   }

   public float[] iliIiiliiiii() {
      long var2 = 8930878232490710605L;
      if (this.Iillliilll == 0) {
         return null;
      } else {
         var2 ^= ((long)Math.floorMod(this.lillliilll - 1, 64) << 32 ^ var2) & -1L << 32;
         return new float[]{this.llllliilll[(int)(var2 >>> 32)], this.illlliilll[(int)(var2 >>> 32)]};
      }
   }

   static float IIIllIIliIIl(float d) {
      d %= 360.0F;
      if (d >= 180.0F) {
         d -= 360.0F;
      }

      if (d < -180.0F) {
         d += 360.0F;
      }

      return d;
   }

   public void IliIlllilIi(long nowNanos, int tick, float yaw, float pitch) {
      this.iIllliilll[this.lillliilll] = nowNanos;
      this.Illlliilll[this.lillliilll] = tick;
      this.llllliilll[this.lillliilll] = yaw;
      this.illlliilll[this.lillliilll] = pitch;
      this.lillliilll = (this.lillliilll + 1) % 64;
      if (this.Iillliilll < 64) {
         this.Iillliilll++;
      }
   }

   public long[] IilliliilIIi(float window, float yaw, float pitch) {
      return this.lIiiIiIlilli((windowx, yawx) -> Math.abs(IIIllIIliIIl(windowx - window)) <= pitch && Math.abs(yawx - yaw) <= pitch);
   }

   public IiliiIllliliiIll() {
      this.llllliilll = new float[64];
      this.illlliilll = new float[64];
   }

   public long[] lIiiIiIlilli(liilIIliiilIIl region) {
      long var5 = -8300005824701330942L;
      long var7 = -3237074606255780935L;
      var5 ^= (-4294967296L ^ var5) & -1L << 32;
      var5 ^= (0L ^ var5) & -1L >>> 32;

      while ((int)var5 < this.Iillliilll) {
         var7 ^= ((long)Math.floorMod(this.lillliilll - 1 - (int)var5, 64) << 32 ^ var7) & -1L << 32;
         if (!region.test(this.llllliilll[(int)(var7 >>> 32)], this.illlliilll[(int)(var7 >>> 32)])) {
            break;
         }

         var5 ^= ((long)((int)(var7 >>> 32)) << 32 ^ var5) & -1L << 32;
         var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32;
      }

      return (int)(var5 >>> 32) < 0 ? null : new long[]{this.iIllliilll[(int)(var5 >>> 32)], (long)this.Illlliilll[(int)(var5 >>> 32)]};
   }
}
