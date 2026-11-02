package gg.corz;

public final class iIiiiliIliiili {
   public static final int iIllIllIIl = -9000;
   public static final int lIllIllIIl = -9999;

   public static boolean IliIlllilIi(int missionTopY) {
      return missionTopY > -9000;
   }

   public static iiliIIllIIiiIIll liiiIIllIl(int feetY, int genericVisible, boolean missionTopY, boolean onGround) {
      if (IliIlllilIi(feetY)) {
         return missionTopY && genericVisible >= feetY ? iiliIIllIIiiIIll.llilIlllll : iiliIIllIIiiIIll.IlilIlllll;
      } else {
         return missionTopY && onGround ? iiliIIllIIiiIIll.ililIlllll : iiliIIllIIiiIIll.IlilIlllll;
      }
   }

   private iIiiiliIliiili() {
   }
}
