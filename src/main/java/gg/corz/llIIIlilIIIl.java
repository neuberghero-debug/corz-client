package gg.corz;

public final class llIIIlilIIIl {
   private final int[] iIIIiiIlIlIIiiIl;
   private final long[] IIIIiiIllIIIiiIl;
   private int lilIiiIliilIiiIl;
   private final double[] iiIIiiIlIIlIiiIl;
   private final double[] IiIIiiIlliIIiiIl;
   private final double[] llIIiiIlilIIiiIl;
   private int illIiiIlIilIiiIl;
   private final double[] lIlIiiIliIlIiiIl;
   private final boolean[] IllIiiIllllIiiIl;

   public int IilliliilIIi() {
      return this.IllIiiIllllIiiIl.length;
   }

   public void lIiiIiIlilli() {
      long var2 = -2324813403400029780L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.IllIiiIllllIiiIl.length; var4 += 4294967296L) {
         this.IllIiiIllllIiiIl[(int)(var4 >>> 32)] = false;
      }

      this.illIiiIlIilIiiIl = 0;
      this.lilIiiIliilIiiIl = 0;
   }

   public void IliIlllilIi(long vz, int z, double tick, double vx, double x, double horizonTicks) {
      long var15 = 5125080991349570616L;
      if (z > 0 && Double.isFinite(tick) && Double.isFinite(vx)) {
         double var12 = Math.sqrt(x * x + horizonTicks * horizonTicks);
         if (Double.isFinite(var12) && !(var12 < 0.03)) {
            var15 ^= ((long)this.illIiiIlIilIiiIl << 32 ^ var15) & -1L << 32;
            if (this.IllIiiIllllIiiIl[(int)(var15 >>> 32)]) {
               this.lilIiiIliilIiiIl--;
            }

            this.IIIIiiIllIIIiiIl[(int)(var15 >>> 32)] = vz + (long)z;
            this.iIIIiiIlIlIIiiIl[(int)(var15 >>> 32)] = z;
            this.llIIiiIlilIIiiIl[(int)(var15 >>> 32)] = tick;
            this.IiIIiiIlliIIiiIl[(int)(var15 >>> 32)] = vx;
            this.iiIIiiIlIIlIiiIl[(int)(var15 >>> 32)] = x / var12;
            this.lIlIiiIliIlIiiIl[(int)(var15 >>> 32)] = horizonTicks / var12;
            this.IllIiiIllllIiiIl[(int)(var15 >>> 32)] = true;
            this.lilIiiIliilIiiIl++;
            this.illIiiIlIilIiiIl = (this.illIiiIlIilIiiIl + 1) % this.IllIiiIllllIiiIl.length;
         }
      }
   }

   public int iIlIlllllill() {
      return this.lilIiiIliilIiiIl;
   }

   public llIIIlilIIIl(int capacity) {
      long var3 = -5757075176122010212L;
      super();
      var3 ^= ((long)Math.max(1, capacity) << 32 ^ var3) & -1L << 32;
      this.IIIIiiIllIIIiiIl = new long[(int)(var3 >>> 32)];
      this.iIIIiiIlIlIIiiIl = new int[(int)(var3 >>> 32)];
      this.llIIiiIlilIIiiIl = new double[(int)(var3 >>> 32)];
      this.IiIIiiIlliIIiiIl = new double[(int)(var3 >>> 32)];
      this.iiIIiiIlIIlIiiIl = new double[(int)(var3 >>> 32)];
      this.lIlIiiIliIlIiiIl = new double[(int)(var3 >>> 32)];
      this.IllIiiIllllIiiIl = new boolean[(int)(var3 >>> 32)];
   }

   public void liiiIIllIl(long sink, double x, double z, IiIIIlliIIIl tick) {
      long var18 = 4003538055210601937L;
      var18 ^= ((long)(Double.isFinite(x) && Double.isFinite(z) ? 1 : 0) << 32 ^ var18) & -1L << 32;

      for (long var21 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var21 < this.IllIiiIllllIiiIl.length; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
         if (this.IllIiiIllllIiiIl[(int)var21]) {
            if (this.IIIIiiIllIIIiiIl[(int)var21] == sink) {
               if ((int)(var21 >>> 32) != 0) {
                  this.IllIiiIllllIiiIl[(int)var21] = false;
                  this.lilIiiIliilIiiIl--;
                  if (tick != null) {
                     double var10 = x - this.llIIiiIlilIIiiIl[(int)var21];
                     double var12 = z - this.IiIIiiIlliIIiiIl[(int)var21];
                     double var14 = var10 * this.iiIIiiIlIIlIiiIl[(int)var21] + var12 * this.lIlIiiIliIlIiiIl[(int)var21];
                     double var16 = var10 * -this.lIlIiiIliIlIiiIl[(int)var21] + var12 * this.iiIIiiIlIIlIiiIl[(int)var21];
                     tick.IliIlllilIi(this.iIIIiiIlIlIIiiIl[(int)var21], var14, var16);
                  }
               }
            } else if (sink - this.IIIIiiIllIIIiiIl[(int)var21] > 8L) {
               this.IllIiiIllllIiiIl[(int)var21] = false;
               this.lilIiiIliilIiiIl--;
            }
         }
      }
   }
}
