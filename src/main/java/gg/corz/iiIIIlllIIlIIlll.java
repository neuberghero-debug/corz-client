package gg.corz;

public interface iiIIIlllIIlIIlll {
   int iiiliiilll = Integer.MIN_VALUE;
   int liiliiilll = 4096;

   int iIlIlllllill();

   int liiiIIllIl(int var1, int var2);

   static int lIiiIiIlilli(int localY, int localZ, int localX) {
      return localZ << 8 | localX << 4 | localY;
   }

   static long iliIiiliiiii(int chunkZ, int chunkX) {
      return (long)chunkZ & 4294967295L | ((long)chunkX & 4294967295L) << 32;
   }

   int IilliliilIIi();

   static int IIIllIIliIIl(long chunkKey) {
      return (int)chunkKey;
   }

   static int IlIlllIlilIl(long chunkKey) {
      return (int)(chunkKey >>> 32);
   }

   byte[] IliIlllilIi(int var1, int var2, int var3);

   static long IiIlliIliiIl(int z, int y, int x) {
      return (long)(z & 67108863) << 38 | (long)(x & 67108863) << 12 | (long)(y & 4095);
   }
}
