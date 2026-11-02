package gg.corz;

public final class liiIIlIliiiIIlIl {
   private final int[] IIIIliilIl;
   private final int iIIIliilIl;
   private final int lIIIliilIl;
   private final int IlIIliilIl;
   private final int llIIliilIl;

   public int iIlIlllllill() {
      return this.iIIIliilIl;
   }

   public int liiiIIllIl() {
      return this.lIIIliilIl;
   }

   private liiIIlIliiiIIlIl(int pvp, int util) {
      long var7 = 1509682733598683138L;
      long var9 = -4288935807025971473L;
      super();
      this.lIIIliilIl = Math.max(0, pvp);
      this.iIIIliilIl = Math.max(0, util);
      this.IIIIliilIl = new int[this.lIIIliilIl + this.iIIIliilIl];
      var7 ^= (25769803776L ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;
      var9 ^= (0L ^ var9) & -1L << 32;
      var9 ^= (0L ^ var9) & -1L >>> 32;

      while ((int)var9 < this.lIIIliilIl) {
         int var10001 = (int)var7;
         var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
         this.IIIIliilIl[var10001] = (int)(var7 >>> 32);
         var9 ^= ((long)((int)(var7 >>> 32) + 24) << 32 ^ var9) & -1L << 32;
         var7 += 115964116992L;
         var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
      }

      if (this.lIIIliilIl > 0 && this.iIIIliilIl > 0) {
         this.IlIIliilIl = (int)(var9 >>> 32) + 6;
         var7 ^= ((long)((int)(var9 >>> 32) + 13) << 32 ^ var7) & -1L << 32;
      } else {
         this.IlIIliilIl = -1;
      }

      var9 ^= (0L ^ var9) & -1L >>> 32;

      while ((int)var9 < this.iIIIliilIl) {
         int var20 = (int)var7;
         var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
         this.IIIIliilIl[var20] = (int)(var7 >>> 32);
         var9 ^= ((long)((int)(var7 >>> 32) + 24) << 32 ^ var9) & -1L << 32;
         var7 += 115964116992L;
         var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
      }

      this.llIIliilIl = (int)var7 == 0 ? 0 : (int)(var9 >>> 32) + 6;
   }

   public int IiIlliIliiIl(double scroll, double y) {
      long var8 = -2330245521024217639L;
      double var5 = scroll + y;

      for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < this.IIIIliilIl.length; var10 += 4294967296L) {
         if (var5 >= (double)this.IIIIliilIl[(int)(var10 >>> 32)] && var5 < (double)(this.IIIIliilIl[(int)(var10 >>> 32)] + 24)) {
            return (int)(var10 >>> 32);
         }
      }

      return -1;
   }

   public int IIIllIIliIIl() {
      return this.llIIliilIl;
   }

   public double IlIlllIlilIl(double view) {
      return Math.max(0.0, (double)this.llIIliilIl - view);
   }

   public int IliIlllilIi() {
      return this.IIIIliilIl.length;
   }

   public int IilliliilIIi(int i) {
      return this.IIIIliilIl[i];
   }

   public boolean lIiiIiIlilli(int i) {
      return i < this.lIIIliilIl;
   }

   public int iliIiiliiiii() {
      return this.IlIIliilIl;
   }
}
