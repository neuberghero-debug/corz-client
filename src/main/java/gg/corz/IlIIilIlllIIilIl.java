package gg.corz;

public class IlIIilIlllIIilIl {
   private static boolean llIIllliIl;
   private static int lIIIllliIl;
   private static int IIIIllliIl;
   public static final int liliIlliIl = -3947581;
   public static int IiiiIlliIl;
   public static int lliiIlliIl;
   public static final int llliIlliIl = -16448249;
   private static long IlIIllliIl;
   public static final int lIiiIlliIl = -15461350;
   private static final int IlliIlliIl = -16748289;
   public static int iliiIlliIl;
   public static final int IIiiIlliIl = -8421505;
   public static int liiiIlliIl;
   public static final int iIiiIlliIl = Integer.MIN_VALUE;
   public static final int illiIlliIl = -16184564;
   private static final long iiiiIlliIl = 420000000L;
   private static int iIIIllliIl = -1;
   public static final int iiliIlliIl = -1;
   public static final int IiliIlliIl = -16184564;
   public static final int IliiIlliIl = 1073741824;
   private static boolean ilIIllliIl;

   private static Iiliililliliilil iIlIlllllill() {
      try {
         return (Iiliililliliilil)llilIllililIll.iliIiiliiiii(Iiliililliliilil.class);
      } catch (Exception var1) {
         return null;
      }
   }

   public static void IliIlllilIi() {
      ilIIllliIl = true;
   }

   public static boolean liiiIIllIl() {
      return llIIllliIl;
   }

   static {
      IilliliilIIi();
   }

   public static void IilliliilIIi() {
      long var17 = -3715740961296510777L;
      long var11 = -7622324259146415262L;
      long var13 = -6521271408808703492L;
      long var15 = 7496823485432592359L;
      Iiliililliliilil var0 = iIlIlllllill();
      var11 ^= ((long)((var0 != null ? var0.lIIlliIIll() : -16748289) & 16777215) << 32 ^ var11) & -1L << 32;
      long var2 = System.nanoTime();
      if ((int)(var11 >>> 32) != iIIIllliIl) {
         if (ilIIllliIl && iIIIllliIl != -1) {
            lIIIllliIl = IIIIllliIl;
            IlIIllliIl = var2;
            llIIllliIl = true;
         } else {
            IIIIllliIl = (int)(var11 >>> 32);
            llIIllliIl = false;
         }

         iIIIllliIl = (int)(var11 >>> 32);
      }

      ilIIllliIl = false;
      if (llIIllliIl) {
         float var4 = (float)(var2 - IlIIllliIl) / 4.2E8F;
         if (var4 >= 1.0F) {
            IIIIllliIl = iIIIllliIl;
            llIIllliIl = false;
         } else {
            IIIIllliIl = iIillliIlillli.IIIllIIliIIl(0xFF000000 | lIIIllliIl, 0xFF000000 | iIIIllliIl, iIillliIlillli.Ililllililil(var4)) & 16777215;
         }
      }

      var11 ^= ((long)IIIIllliIl ^ var11) & -1L >>> 32;
      var13 ^= ((long)((int)var11 >> 16 & 0xFF) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)((int)var11 >> 8 & 0xFF) ^ var13) & -1L >>> 32;
      var15 ^= ((long)((int)var11 & 0xFF) << 32 ^ var15) & -1L << 32;
      lliiIlliIl = 0xFF000000 | (int)var11 & 16777215;
      iliiIlliIl = 1610612736 | (int)(var13 >>> 32) << 16 | (int)var13 << 8 | (int)(var15 >>> 32);
      var15 ^= ((long)Math.min(255, (int)(var13 >>> 32) + (255 - (int)(var13 >>> 32)) / 3) ^ var15) & -1L >>> 32;
      var17 ^= ((long)Math.min(255, (int)var13 + (255 - (int)var13) / 3) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)Math.min(255, (int)(var15 >>> 32) + (255 - (int)(var15 >>> 32)) / 3) ^ var17) & -1L >>> 32;
      IiiiIlliIl = -2147483648 | (int)var15 << 16 | (int)(var17 >>> 32) << 8 | (int)var17;
      liiiIlliIl = 0xFF000000 | (int)(var13 >>> 32) << 16 | (int)var13 << 8 | (int)(var15 >>> 32);
   }
}
