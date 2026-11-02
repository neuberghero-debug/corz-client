package gg.corz;

public final class ilIIIIllIiIIIIll {
   public static final int IlllliIlll = 20;
   private int IillliIlll;
   private int lillliIlll;
   public static final int llllliIlll = 200;
   public static final int illlliIlll = 120;
   private int iillliIlll;

   public boolean IilliliilIIi(int tick) {
      this.IliIlllilIi(tick);
      return this.IillliIlll + 20 <= 120;
   }

   public boolean liiiIIllIl(int tick) {
      this.IliIlllilIi(tick);
      return tick >= this.iillliIlll && this.IillliIlll + 20 <= 120;
   }

   private void IliIlllilIi(int tick) {
      if (tick > this.lillliIlll) {
         this.IillliIlll = Math.max(0, this.IillliIlll - (tick - this.lillliIlll));
         this.lillliIlll = tick;
      }
   }

   public int iliIiiliiiii(int tick) {
      this.IliIlllilIi(tick);
      return this.IillliIlll;
   }

   public int IIIllIIliIIl(int tick) {
      long var4 = 7786097141953221679L;
      this.IliIlllilIi(tick);
      var4 ^= ((long)Math.max(0, this.iillliIlll - tick) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(this.IillliIlll + 20 <= 120 ? 0 : this.IillliIlll + 20 - 120) ^ var4) & -1L >>> 32;
      return Math.max((int)(var4 >>> 32), (int)var4);
   }

   public void iIlIlllllill(int tick, int minGap) {
      this.IliIlllilIi(tick);
      this.IillliIlll += 20;
      this.iillliIlll = tick + Math.max(0, minGap);
   }

   public void lIiiIiIlilli(int tick) {
      this.IliIlllilIi(tick);
      this.IillliIlll += 20;
   }
}
