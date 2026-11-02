package gg.corz;

public final class illlIIllIillIIll {
   public static final int[] IIIIlIllll = new int[]{-1, 0, 1, 0};
   public static final int[] iiiiIIllll = new int[]{0, 1, 0, -1};
   public static final int liiiIIllll = 3;
   public static final int lliiIIllll = 0;
   public static final int IiiiIIllll = 2;
   public static final int iliiIIllll = 1;

   public static boolean Illlllllilll(lIiIiilliIiIiill wantedType, boolean mergeableNeighbor) {
      return wantedType == lIiIiilliIiIiill.lIililiill && IIIllIIliIIl(mergeableNeighbor);
   }

   public static int IIlllIlliIll(int facing, lIiIiilliIiIiill existingHalfType) {
      return lIiiIiIlilli(facing, existingHalfType);
   }

   @Deprecated
   public static boolean IlIlllIlilIl() {
      return false;
   }

   public static int IliIlllilIi(int c) {
      return c + 1 & 3;
   }

   public static int liiiIIllIl(int c) {
      return c + 3 & 3;
   }

   private illlIIllIillIIll() {
   }

   public static int lIiiIiIlilli(int type, lIiIiilliIiIiill facing) {
      return switch (facing) {
         case Ilililiill -> -1;
         case lIililiill -> IliIlllilIi(type);
         case iIililiill -> liiiIIllIl(type);
      };
   }

   public static int IilliliilIIi(int c) {
      return c != 1 && c != 3 ? 1 : 0;
   }

   public static int[] iliIiiliiiii(int type, lIiIiilliIiIiill facing) {
      long var3 = -335056367180029883L;
      var3 ^= ((long)lIiiIiIlilli(type, facing) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? null : new int[]{iiiiIIllll[(int)(var3 >>> 32)], IIIIlIllll[(int)(var3 >>> 32)]};
   }

   public static boolean IiIlliIliiIl(int partnerFacing, int sideFromPartnerToTarget) {
      return IilliliilIIi(partnerFacing) != IilliliilIIi(sideFromPartnerToTarget);
   }

   public static boolean IIIllIIliIIl(boolean mergeableNeighbor) {
      return mergeableNeighbor;
   }

   public static int iIlIlllllill(int c) {
      return c + 2 & 3;
   }
}
