package gg.corz;

public final class iiIiIIilIIliIIil {
   private static final int[] illiilIIil = new int[]{-1, 1, 0, 0, 0, 0};
   public static final int iiIiilIIil = 2;
   public static final int IIliilIIil = 3;
   public static final int liIiilIIil = 1;
   public static final int iIliilIIil = 5;
   private static final int[] llliilIIil = new int[]{0, 0, 0, 0, -1, 1};
   private static final int[] IlliilIIil = new int[]{1, 0, 3, 2, 5, 4};
   private static final int[] IiliilIIil = new int[]{0, 0, -1, 1, 0, 0};
   public static final int lIliilIIil = 4;
   public static final int IiIiilIIil = 0;

   public static int iliIiiliiiii(int wantedFacing, ilIiillIiIiill kind) {
      return lIiiIiIlilli(wantedFacing, IilliliilIIi(kind));
   }

   public static int lIiiIiIlilli(int wantedFacing, iIilililIlililil family) {
      return family == iIilililIlililil.lIIlIlllil ? IliIlllilIi(wantedFacing) : wantedFacing;
   }

   public static int[] IIIllIIliIIl(int kind, ilIiillIiIiill wantedFacing) {
      long var6 = -4028783695024039811L;
      long var8 = 7060278525579488536L;
      var6 ^= ((long)iliIiiliiiii(kind, wantedFacing) << 32 ^ var6) & -1L << 32;
      if (iIlIlllllill((int)(var6 >>> 32))) {
         return new int[]{(int)(var6 >>> 32)};
      } else {
         int[] var3 = new int[6];
         var3[0] = (int)(var6 >>> 32);
         var6 ^= (1L ^ var6) & -1L >>> 32;

         for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < 6; var12 += 4294967296L) {
            if ((int)(var12 >>> 32) != (int)(var6 >>> 32)) {
               int var10001 = (int)var6;
               var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32;
               var3[var10001] = (int)(var12 >>> 32);
            }
         }

         return var3;
      }
   }

   public static int IlIlllIlilIl(double y, double z, double x) {
      double var6 = Math.abs(y);
      double var8 = Math.abs(z);
      double var10 = Math.abs(x);
      if (var8 > var6 && var8 > var10) {
         return z >= 0.0 ? 1 : 0;
      } else if (var6 > var10) {
         return y >= 0.0 ? 5 : 4;
      } else {
         return x >= 0.0 ? 3 : 2;
      }
   }

   private iiIiIIilIIliIIil() {
   }

   public static boolean iIlIlllllill(int dir) {
      return dir == 0 || dir == 1;
   }

   public static iIilililIlililil IilliliilIIi(ilIiillIiIiill kind) {
      return kind == ilIiillIiIiill.IIiiiIlIilIiiiIlIi ? iIilililIlililil.iIIlIlllil : iIilililIlililil.lIIlIlllil;
   }

   public static int[] liiiIIllIl(int dir) {
      return new int[]{llliilIIil[dir], illiilIIil[dir], IiliilIIil[dir]};
   }

   public static int IiIlliIliiIl(int kind, ilIiillIiIiill look) {
      return IilliliilIIi(look) == iIilililIlililil.lIIlIlllil ? IliIlllilIi(kind) : kind;
   }

   public static int IliIlllilIi(int dir) {
      return IlliilIIil[dir];
   }
}
