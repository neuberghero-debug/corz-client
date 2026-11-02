package gg.corz;

public final class IIiIiiIllIiIiiIl {
   boolean liIiIlIlll;
   final long[] ilIiIlIlll;
   long[] IiIiIlIlll;
   final long[] llIiIlIlll = new long[64];

   public boolean IilliliilIIi(int z, int y, int x) {
      return IiIlliIliiIl(z, y, x) && Illlllllilll(this.ilIiIlIlll, z, y, x);
   }

   public long[] IlIlllIlilIl() {
      long var5 = 1767271878118075070L;
      long var7 = 8718655883861659985L;
      long[] var1 = new long[4];
      var5 ^= (0L ^ var5) & -1L << 32;

      while ((int)(var5 >>> 32) < 16) {
         for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < 16; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            if (Illlllllilll(this.ilIiIlIlll, (int)var5, 15, (int)(var5 >>> 32))) {
               var7 ^= ((long)((int)(var5 >>> 32) << 4 | (int)var5) << 32 ^ var7) & -1L << 32;
               var1[(int)(var7 >>> 32) >>> 6] = var1[(int)(var7 >>> 32) >>> 6] | 1L << ((int)(var7 >>> 32) & 63);
            }
         }

         var5 += 4294967296L;
      }

      return var1;
   }

   private static boolean IiIlliIliiIl(int z, int y, int x) {
      return (z | y | x) >= 0 && z < 16 && y < 16 && x < 16;
   }

   public void IliIlllilIi(int z, int y, int x) {
      IIlllIlliIll(this.llIiIlIlll, z, y, x);
      this.liIiIlIlll = true;
   }

   public void iliIiiliiiii(long[] bits) {
      this.IiIiIlIlll = bits;
   }

   public boolean lIiiIiIlilli() {
      return this.liIiIlIlll;
   }

   public IIiIiiIllIiIiiIl() {
      this.ilIiIlIlll = new long[64];
      this.IiIiIlIlll = null;
      this.liIiIlIlll = false;
   }

   public void liiiIIllIl(int x, int y, int z) {
      IIlllIlliIll(this.ilIiIlIlll, x, y, z);
   }

   private static void IIlllIlliIll(long[] z, int y, int x, int bits) {
      long var5 = 5610333793077761716L;
      var5 ^= ((long)(x << 8 | bits << 4 | y) << 32 ^ var5) & -1L << 32;
      z[(int)(var5 >>> 32) >>> 6] = z[(int)(var5 >>> 32) >>> 6] | 1L << ((int)(var5 >>> 32) & 63);
   }

   private static boolean Illlllllilll(long[] z, int x, int bits, int y) {
      long var5 = -6778213862951198092L;
      var5 ^= ((long)(bits << 8 | y << 4 | x) << 32 ^ var5) & -1L << 32;
      return (z[(int)(var5 >>> 32) >>> 6] & 1L << ((int)(var5 >>> 32) & 63)) != 0L;
   }

   public boolean iIlIlllllill(int z, int y, int x) {
      return IiIlliIliiIl(z, y, x) && Illlllllilll(this.llIiIlIlll, z, y, x);
   }

   public boolean IIIllIIliIIl(int y, int z, int x) {
      long var5 = -5999259652046631538L;
      if (z > 0) {
         return this.IilliliilIIi(y, z - 1, x);
      } else if (this.IiIiIlIlll != null && IiIlliIliiIl(y, 0, x)) {
         var5 ^= ((long)(x << 4 | y) << 32 ^ var5) & -1L << 32;
         return (this.IiIiIlIlll[(int)(var5 >>> 32) >>> 6] & 1L << ((int)(var5 >>> 32) & 63)) != 0L;
      } else {
         return false;
      }
   }
}
