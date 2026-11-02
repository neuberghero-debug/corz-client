package gg.corz;

public final class lIIIIiIiiIIIIiIi {
   public static final double illIlilIIi = 1.8;
   public static final double lllIlilIIi = 0.3;
   public static final double IllIlilIIi = 1.0;

   private lIIIIiIiiIIIIiIi() {
   }

   public static boolean IliIlllilIi(double feetY, int cellY) {
      return feetY >= (double)cellY + 1.0;
   }

   public static boolean liiiIIllIl(double cy, double cx, double z, int x, int cz, int feetY) {
      return cy - 0.3 < (double)(x + 1)
         && cy + 0.3 > (double)x
         && cx < (double)(cz + 1)
         && cx + 1.8 > (double)cz
         && z - 0.3 < (double)(feetY + 1)
         && z + 0.3 > (double)feetY;
   }
}
