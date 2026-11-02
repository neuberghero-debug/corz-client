package gg.corz;

public final class iiliIiIiIIiiIiIi {
   public final int liIliIiIIi;
   public final int IiIliIiIIi;
   public final int ilIliIiIIi;
   public final int iiIliIiIIi;

   public boolean IilliliilIIi(int maxY, int maxX, int minX, int minZ, int maxZ, int minY) {
      long var9 = 8645533431654358444L;
      var9 ^= ((long)this.IliIlllilIi() << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)this.liiiIIllIl() ^ var9) & -1L >>> 32;
      if (this.IiIliIiIIi < maxY - (int)(var9 >>> 32) || this.IiIliIiIIi > minZ + (int)(var9 >>> 32)) {
         return false;
      } else {
         return this.iiIliIiIIi >= minX - (int)(var9 >>> 32) && this.iiIliIiIIi <= minY + (int)(var9 >>> 32)
            ? this.liIliIiIIi >= maxX - (int)var9 && this.liIliIiIIi <= maxZ + (int)var9
            : false;
      }
   }

   public int liiiIIllIl() {
      return this.ilIliIiIIi == 34 ? 32 : 24;
   }

   public iiliIiIiIIiiIiIi(int family, int z, int y, int x) {
      this.ilIliIiIIi = family;
      this.IiIliIiIIi = z;
      this.liIliIiIIi = y;
      this.iiIliIiIIi = x;
   }

   public int lIiiIiIlilli() {
      return iIlIlllllill(this.ilIliIiIIi) ? this.IliIlllilIi() : 8;
   }

   public static boolean iIlIlllllill(int family) {
      switch (family) {
         case 113:
         case 124:
         case 127:
         case 132:
            return true;
         default:
            return false;
      }
   }

   public boolean iliIiiliiiii(int minY, int maxX, int minZ, int maxY, int minX, int maxZ) {
      long var8 = 5001489396133779790L;
      var8 ^= ((long)this.lIiiIiIlilli() << 32 ^ var8) & -1L << 32;
      return this.IiIliIiIIi >= minY - (int)(var8 >>> 32)
         && this.IiIliIiIIi <= maxY + (int)(var8 >>> 32)
         && this.iiIliIiIIi >= minZ - (int)(var8 >>> 32)
         && this.iiIliIiIIi <= maxZ + (int)(var8 >>> 32)
         && this.liIliIiIIi >= maxX - (int)(var8 >>> 32)
         && this.liIliIiIIi <= minX + (int)(var8 >>> 32);
   }

   public int IliIlllilIi() {
      switch (this.ilIliIiIIi) {
         case 34:
            return 80;
         case 113:
         case 124:
         case 127:
            return 12;
         case 116:
         case 117:
            return 64;
         case 119:
         case 128:
         case 136:
            return 48;
         case 120:
            return 40;
         case 123:
            return 48;
         case 132:
            return 8;
         case 133:
         case 135:
            return 24;
         case 134:
            return 48;
         default:
            return 16;
      }
   }
}
