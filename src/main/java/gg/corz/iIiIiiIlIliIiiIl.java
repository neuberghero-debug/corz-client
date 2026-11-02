package gg.corz;

public final class iIiIiiIlIliIiiIl {
   public static long liiiIIllIl(int x, int z) {
      return IliIlllilIi(x >> 4, z >> 4);
   }

   public static int IilliliilIIi(long chunkKey) {
      return (int)(chunkKey >> 32);
   }

   public static long IiIlliIliiIl(long centerZ, int chunkKey, int centerX) {
      long var4 = (long)(iIlIlllllill(centerZ) - chunkKey);
      long var6 = (long)(IilliliilIIi(centerZ) - centerX);
      return var4 * var4 + var6 * var6;
   }

   public static int iIlIlllllill(long chunkKey) {
      return (int)chunkKey;
   }

   public static int IlIlllIlilIl(long posKey) {
      return (int)(posKey << 26 >> 38);
   }

   public static int iliIiiliiiii(long posKey) {
      return (int)(posKey >> 38);
   }

   private iIiIiiIlIliIiiIl() {
   }

   public static long lIiiIiIlilli(int y, int x, int z) {
      return (long)(y & 67108863) << 38 | (long)(z & 67108863) << 12 | (long)(x & 4095);
   }

   public static int IIIllIIliIIl(long posKey) {
      return (int)(posKey << 52 >> 52);
   }

   public static long IliIlllilIi(int chunkX, int chunkZ) {
      return (long)chunkX & 4294967295L | (long)chunkZ << 32;
   }
}
