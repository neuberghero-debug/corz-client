package gg.corz;

public final class IliiIIilliiIIi {
   public static final int iiliIIIiiIIiiIIIii = 1;
   public static final int liiiIIIiiiiiiIIIii = 5;
   public static final int IiliIIIiililiIIIii = 0;
   public static final int ilIiIIIiiIiIiIIIii = 12;
   public static final int iIliIIIiiIlliIIIii = 512;
   public static final int liIiIIIiiiiIiIIIii = 2;
   public static final int iliiIIIiiIiiiIIIii = 4;
   public static final int IIliIIIiilIliIIIii = 12;
   public static final int llliIIIiiilliIIIii = 3;
   public static final int IliiIIIiilliiIIIii = 3;
   public static final int lIiiIIIiiiIiiIIIii = 2;

   public static int lIiiIiIlilli(int obfuscatedMembers, int memberChunks) {
      long var3 = -4175068136655696589L;
      if (obfuscatedMembers <= 0) {
         return 100;
      } else {
         var3 ^= ((long)Math.max(0, obfuscatedMembers - memberChunks) << 32 ^ var3) & -1L << 32;
         return (int)Math.round(100.0 * (double)((int)(var3 >>> 32)) / (double)obfuscatedMembers);
      }
   }

   public static boolean IliIlllilIi(int sealedFamilies, int oreBlocks, int evidenceTotal, int solidBlocks, int sealedInRock) {
      long var6 = -6251951148199629447L;
      if (sealedFamilies >= 12 && oreBlocks >= 2 && sealedFamilies * 2 >= evidenceTotal) {
         return true;
      } else {
         var6 ^= ((long)(solidBlocks + sealedInRock) << 32 ^ var6) & -1L << 32;
         return (int)(var6 >>> 32) >= 512 && solidBlocks * 100 >= (int)(var6 >>> 32) * 12;
      }
   }

   public static int IilliliilIIi(int trusted, int uncertain, int replacementLike) {
      long var4 = -1910591669616604162L;
      var4 ^= ((long)(trusted + uncertain + replacementLike) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) <= 0 ? 100 : (int)Math.round(100.0 * (double)trusted / (double)((int)(var4 >>> 32)));
   }

   public static int liiiIIllIl(int flags, int family, boolean obfuscatedContext) {
      if ((flags & 16) != 0) {
         return 2;
      } else if (iliiIllIiiiIll.lIiiIiIlilli(family)) {
         return 1;
      } else if ((flags & 256) != 0 || (flags & 32) == 0) {
         return 0;
      } else if (!obfuscatedContext) {
         return 3;
      } else {
         return (flags & 64) != 0 ? 5 : 4;
      }
   }

   public static boolean iIlIlllllill(int provenance) {
      return provenance <= 3;
   }

   private IliiIIilliiIIi() {
   }
}
