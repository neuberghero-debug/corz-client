package gg.corz;

public final class lliliIllililiIll {
   public static final float lIilIiilll = 0.203125F;
   public static final float iillIiilll = 0.578125F;
   public static final float IIilIiilll = 0.453125F;
   public static final float iIilIiilll = 0.72F;

   public static int iIlIlllllill(int gap, int fontHeight, int kWidth) {
      return liiiIIllIl(IliIlllilIi(gap)) + kWidth + fontHeight;
   }

   public static int liiiIIllIl(int cmdBox) {
      return Math.round(0.578125F * (float)cmdBox);
   }

   private lliliIllililiIll() {
   }

   public static int IliIlllilIi(int fontHeight) {
      return Math.round((float)fontHeight * 0.72F / 0.578125F);
   }
}
