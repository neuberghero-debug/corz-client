package gg.corz;

public final class IililIllililIl {
   public static final boolean lIIIlIllliIIIlIlll = false;
   public static final float illiIIlllIiliIIlll = 3.0F;
   public static final boolean iIiiIIlllIliiIIlll = true;
   public static final float liliIIllliiliIIlll = 1.0F;
   public static final int llIiIIlllilIiIIlll = 1291799782;
   public static final boolean lliiIIllliliiIIlll = true;
   public static final float IlIIlIlllllIIlIlll = -0.4F;
   public static final int iiIiIIlllIIliIIlll = 1291816976;
   public static final float IlliIIlllllliIIlll = 1.0F;
   public static final boolean IiiiIIlllliiiIIlll = false;
   public static final int iIIiIIlllIlIiIIlll = 741585894;
   public static final boolean iiiiIIlllIIIIlIlll = false;
   public static final int IiIiIIlllliIiIIlll = 1291793203;
   public static final boolean IIiiIIllllIiiIIlll = true;
   public static final float lIliIIllliIliIIlll = 0.5F;
   public static final float ilIIlIlllIiIIlIlll = -0.8F;

   public static int iIlIlllllill(IIlIlIllIlIlIl cls) {
      return switch (cls) {
         case lllIIIIllillIIIIll -> 741585894;
         case lIiIIIIlliIiIIIIll -> 1291799782;
         case IilIIIIlllilIIIIll -> 1291793203;
         case iilIIIIllIIiIIIIll -> 1291816976;
         case iIlIIIIllIllIIIIll, IliIIIIlllliIIIIll -> 0;
      };
   }

   private IililIllililIl() {
   }

   public static float liiiIIllIl(IIlIlIllIlIlIl cls) {
      long var2 = -9136344698066660001L;
      var2 ^= ((long)iIlIlllllill(cls) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) == 0 ? 0.0F : (float)((int)(var2 >>> 32) >>> 24 & 0xFF) / 255.0F;
   }

   public static int IliIlllilIi(IIlIlIllIlIlIl cls) {
      return iIlIlllllill(cls) & 16777215;
   }
}
