package gg.corz;

import java.util.List;

public final class IlliIlllliIl {
   private static boolean iIlIlllllill(iIiliiiIliliii cell, liIiIlIliiIiIlIl solid) {
      return solid.isSolid(cell.IliIlllilIi(), cell.liiiIIllIl(), cell.iIlIlllllill());
   }

   private static boolean liiiIIllIl(iIiliiiIliliii cell, liIiIlIliiIiIlIl solid) {
      long var4 = -8351669001413550766L;

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 6; var6 += 4294967296L) {
         int[] var3 = iiIiIIilIIliIIil.liiiIIllIl((int)(var6 >>> 32));
         if (solid.isSolid(cell.IliIlllilIi() + var3[0], cell.liiiIIllIl() + var3[1], cell.iIlIlllllill() + var3[2])) {
            return true;
         }
      }

      return false;
   }

   private IlliIlllliIl() {
   }

   private static boolean IilliliilIIi(iIiliiiIliliii blocked, IIIlllIilIIlllIi cell) {
      return cell != null && cell.isBlocked(blocked.IliIlllilIi(), blocked.liiiIIllIl(), blocked.iIlIlllllill());
   }

   public static lIlIIliiIlIIli IliIlllilIi(
      int targetY, int targetX, int maxDepth, int solid, int targetZ, liIiIlIliiIiIlIl blocked, IIIlllIilIIlllIi requiredLook
   ) {
      long var20 = 8279415451534895624L;
      long var22 = 3631231779811358847L;
      if (iiIiIIilIIliIIil.iIlIlllllill(solid) && blocked != null) {
         int[] var7 = iiIiIIilIIliIIil.liiiIIllIl(solid);
         iIiliiiIliliii var8 = new iIiliiiIliliii(targetY + var7[0], targetX + var7[1], maxDepth + var7[2]);
         if (!IilliliilIIi(var8, requiredLook) && !iIlIlllllill(var8, blocked)) {
            if (liiiIIllIl(var8, blocked)) {
               return new lIlIIliiIlIIli(var8, var8, var8, lIiiiiIiii.lIllilIliIllilIl, 1);
            } else {
               lIlIIliiIlIIli var9 = null;
               if (solid == 0) {
                  iIiliiiIliliii var10 = new iIiliiiIliliii(var8.IliIlllilIi(), var8.liiiIIllIl() - 1, var8.iIlIlllllill());
                  if (!IilliliilIIi(var10, requiredLook)) {
                     List var11 = IliIilliIi.IliIlllilIi(
                        var10.IliIlllilIi(), var10.liiiIIllIl(), var10.iIlIlllllill(), Math.max(1, targetZ), blocked, requiredLook
                     );
                     if (var11 != null && !var11.isEmpty()) {
                        long[] var12 = (long[])var11.get(0);
                        var9 = new lIlIIliiIlIIli(
                           var8, var10, new iIiliiiIliliii((int)var12[0], (int)var12[1], (int)var12[2]), lIiiiiIiii.iiIlilIlIIllilIl, var11.size() + 1
                        );
                     }
                  }
               }

               int[] var24 = new int[]{2, 3, 4, 5};
               int[] var25 = var24;
               var20 ^= ((long)var24.length << 32 ^ var20) & -1L << 32;

               for (long var27 = var20 ^ (0L ^ var20) & -1L >>> 32; (int)var27 < (int)(var27 >>> 32); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
                  var22 ^= ((long)var25[(int)var27] << 32 ^ var22) & -1L << 32;
                  int[] var15 = iiIiIIilIIliIIil.liiiIIllIl((int)(var22 >>> 32));
                  iIiliiiIliliii var16 = new iIiliiiIliliii(var8.IliIlllilIi() + var15[0], var8.liiiIIllIl(), var8.iIlIlllllill() + var15[2]);
                  if (!IilliliilIIi(var16, requiredLook)) {
                     List var17 = IliIilliIi.IliIlllilIi(
                        var16.IliIlllilIi(), var16.liiiIIllIl(), var16.iIlIlllllill(), Math.max(1, targetZ), blocked, requiredLook
                     );
                     if (var17 != null && !var17.isEmpty()) {
                        long[] var18 = (long[])var17.get(0);
                        lIlIIliiIlIIli var19 = new lIlIIliiIlIIli(
                           var8, var16, new iIiliiiIliliii((int)var18[0], (int)var18[1], (int)var18[2]), lIiiiiIiii.iiIlilIlIIllilIl, var17.size() + 1
                        );
                        if (var9 == null || var19.lIiiIiIlilli() < var9.lIiiIiIlilli()) {
                           var9 = var19;
                        }
                     }
                  }
               }

               return var9;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
