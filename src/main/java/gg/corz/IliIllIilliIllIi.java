package gg.corz;

public final class IliIllIilliIllIi {
   private final float[] lIIiliIIIi;
   private final long[] IIIiliIIIi;
   private int liilliIIIi;
   public static final int iIilliIIIi = 40;
   private int IlIiliIIIi;
   private long ilIiliIIIi;
   private float llIiliIIIi;
   public static final int ililliIIIi = 2;
   public static final int IlilliIIIi = 2;
   private int iIIiliIIIi;
   public static final int llilliIIIi = 64;
   private int iiilliIIIi;
   private final long[] IiilliIIIi = new long[64];

   public float IIIllIIliIIl() {
      return this.llIiliIIIi;
   }

   public void iIlIlllllill(long tick) {
      this.ilIiliIIIi = Math.max(this.ilIiliIIIi, tick + 2L);
   }

   public boolean IilliliilIIi(long tick) {
      return this.ilIiliIIIi != Long.MIN_VALUE && tick <= this.ilIiliIIIi;
   }

   public void liiiIIllIl(long tick, int pingTicks) {
      this.ilIiliIIIi = Math.max(this.ilIiliIIIi, tick + (long)Math.max(0, pingTicks) + 2L);
   }

   public float iliIiiliiiii(long tick) {
      long var8 = 7520240153996928934L;
      float var3 = 0.0F;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < this.IlIiliIIIi) {
         var8 ^= ((long)Math.floorMod(this.iIIiliIIIi - 1 - (int)(var8 >>> 32), 64) ^ var8) & -1L >>> 32;
         long var6 = this.IIIiliIIIi[(int)var8];
         if (var6 <= tick && var6 > tick - 40L) {
            var3 += this.lIIiliIIIi[(int)var8];
         }

         var8 += 4294967296L;
      }

      return var3;
   }

   private boolean IiIlliIliiIl(long tick) {
      long var6 = 5966125237994246693L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.iiilliIIIi; var8 += 4294967296L) {
         long var4 = this.IiilliIIIi[Math.floorMod(this.liilliIIIi - 1 - (int)(var8 >>> 32), 64)];
         if (var4 <= tick && tick - var4 <= 2L) {
            return true;
         }
      }

      return false;
   }

   public void IlIlllIlilIl() {
      this.liilliIIIi = 0;
      this.iiilliIIIi = 0;
      this.iIIiliIIIi = 0;
      this.IlIiliIIIi = 0;
      this.llIiliIIIi = 0.0F;
      this.ilIiliIIIi = Long.MIN_VALUE;
   }

   public IliIllIilliIllIi() {
      this.IIIiliIIIi = new long[64];
      this.lIIiliIIIi = new float[64];
      this.ilIiliIIIi = Long.MIN_VALUE;
   }

   public void lIiiIiIlilli(long drop, float tick) {
      if (tick > 0.0F && Float.isFinite(tick)) {
         if (this.IiIlliIliiIl(drop)) {
            this.IIIiliIIIi[this.iIIiliIIIi] = drop;
            this.lIIiliIIIi[this.iIIiliIIIi] = tick;
            this.iIIiliIIIi = (this.iIIiliIIIi + 1) % 64;
            if (this.IlIiliIIIi < 64) {
               this.IlIiliIIIi++;
            }

            this.llIiliIIIi += tick;
         }
      }
   }

   public void IliIlllilIi(long tick) {
      this.IiilliIIIi[this.liilliIIIi] = tick;
      this.liilliIIIi = (this.liilliIIIi + 1) % 64;
      if (this.iiilliIIIi < 64) {
         this.iiilliIIIi++;
      }
   }
}
