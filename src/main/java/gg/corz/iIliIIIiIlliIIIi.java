package gg.corz;

import java.util.ArrayList;
import java.util.List;

public final class iIliIIIiIlliIIIi {
   public static List<int[]> IilliliilIIi(int ty, int wantedFacing, int maxBack, int tz, int tx) {
      long var8 = 3446548038408443412L;
      int[] var5 = iiIiIIilIIliIIil.liiiIIllIl(tz);
      ArrayList var6 = new ArrayList();

      for (long var10 = var8 ^ (4294967296L ^ var8) & -1L << 32; (int)(var10 >>> 32) <= tx; var10 += 4294967296L) {
         var6.add(new int[]{ty + var5[0] * (int)(var10 >>> 32), wantedFacing + var5[1] * (int)(var10 >>> 32), maxBack + var5[2] * (int)(var10 >>> 32)});
      }

      return var6;
   }

   public static List<int[]> iIlIlllllill(int maxBack, int wantedFacing, int tz, int ty, int tx) {
      long var8 = -2936433552514641953L;
      int[] var5 = iiIiIIilIIliIIil.liiiIIllIl(ty);
      ArrayList var6 = new ArrayList();

      for (long var10 = var8 ^ ((long)tx << 32 ^ var8) & -1L << 32; (int)(var10 >>> 32) >= 1; var10 += -4294967296L) {
         var6.add(new int[]{maxBack + var5[0] * (int)(var10 >>> 32), wantedFacing + var5[1] * (int)(var10 >>> 32), tz + var5[2] * (int)(var10 >>> 32)});
      }

      return var6;
   }

   public static int[] liiiIIllIl(int tz, int tx, int wantedFacing, int ty) {
      int[] var4 = iiIiIIilIIliIIil.liiiIIllIl(IliIlllilIi(ty));
      return new int[]{tz + var4[0], tx + var4[1], wantedFacing + var4[2]};
   }

   public static int IliIlllilIi(int wantedFacing) {
      return iiIiIIilIIliIIil.iliIiiliiiii(wantedFacing, ilIiillIiIiill.iIiiiIlIiIliiiIlIi);
   }

   public static boolean iliIiiliiiii(int wantedFacing) {
      return iiIiIIilIIliIIil.iIlIlllllill(wantedFacing);
   }

   public static int lIiiIiIlilli(int distanceBack) {
      return Math.max(0, Math.min(distanceBack, 4));
   }

   private iIliIIIiIlliIIIi() {
   }
}
