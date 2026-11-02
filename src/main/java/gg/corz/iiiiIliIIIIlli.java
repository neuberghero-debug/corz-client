package gg.corz;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public final class iiiiIliIIIIlli {
   public static final int iIllllIIIl = 2;

   public static lilIlliliilIllil IliIlllilIi(Illillllil cap, int t, int gx, int gz, int gy, int fromY) {
      long var22 = 1557123026121664132L;
      long var24 = -3829447347271356956L;
      long var26 = -6212908595528140501L;
      long var28 = 8651110936794350029L;
      long var30 = -3855489664938424340L;
      if (gz < t + 2) {
         return new lilIlliliilIllil(IlIliilllIliil.iiIliIlliIIlliIlli, 0, false, 0);
      } else if (!iIlilIilIllilIil.lIiiIiIlilli(cap, gx, gz, gy)) {
         return new lilIlliliilIllil(IlIliilllIliil.llIliIlliilIliIlli, 0, true, 0);
      } else {
         var22 ^= ((long)(t + 1) << 32 ^ var22) & -1L << 32;
         HashSet var7 = new HashSet();
         ArrayDeque var8 = new ArrayDeque();
         var7.add(llIiIiililIiIiil.IIIllIIliIIl(gx, gz, gy));
         var8.add(new int[]{gx, gz, gy});
         var22 ^= (0L ^ var22) & -1L >>> 32;
         int[][] var10 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
         int[][] var11 = new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

         while (!var8.isEmpty()) {
            if (var7.size() >= fromY) {
               return new lilIlliliilIllil(IlIliilllIliil.IiIliIlliliIliIlli, var7.size(), false, (int)var22);
            }

            int[] var12 = (int[])var8.poll();
            var24 ^= ((long)var12[0] << 32 ^ var24) & -1L << 32;
            var24 ^= ((long)var12[1] ^ var24) & -1L >>> 32;
            var26 ^= ((long)var12[2] << 32 ^ var26) & -1L << 32;
            if ((int)var24 == (int)(var22 >>> 32)) {
               int[][] var16 = var10;
               var26 ^= ((long)var10.length ^ var26) & -1L >>> 32;
               var28 ^= (0L ^ var28) & -1L << 32;

               while ((int)(var28 >>> 32) < (int)var26) {
                  int[] var19 = var16[(int)(var28 >>> 32)];
                  var28 ^= ((long)((int)(var24 >>> 32) - var19[0]) ^ var28) & -1L >>> 32;
                  var30 ^= ((long)((int)(var26 >>> 32) - var19[1]) << 32 ^ var30) & -1L << 32;
                  if (iIlilIilIllilIil.lIiiIiIlilli(cap, (int)var28, t, (int)(var30 >>> 32)) && !cap.solid((int)var28, t + 2, (int)(var30 >>> 32))) {
                     var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32;
                  }

                  var28 += 4294967296L;
               }

               if ((int)var22 > 0) {
                  return new lilIlliliilIllil(IlIliilllIliil.IiIliIlliliIliIlli, var7.size(), false, (int)var22);
               }
            }

            int[][] var32 = var10;
            var26 ^= ((long)var10.length ^ var26) & -1L >>> 32;
            var28 ^= (0L ^ var28) & -1L << 32;

            while ((int)(var28 >>> 32) < (int)var26) {
               int[] var34 = var32[(int)(var28 >>> 32)];
               liiiIIllIl(cap, var7, var8, (int)(var24 >>> 32) + var34[0], (int)var24, (int)(var26 >>> 32) + var34[1], (int)(var22 >>> 32));
               if ((int)var24 - 1 >= (int)(var22 >>> 32) && !cap.solid((int)(var24 >>> 32) + var34[0], (int)var24 + 1, (int)(var26 >>> 32) + var34[1])) {
                  liiiIIllIl(cap, var7, var8, (int)(var24 >>> 32) + var34[0], (int)var24 - 1, (int)(var26 >>> 32) + var34[1], (int)(var22 >>> 32));
               }

               for (var28 ^= (1L ^ var28) & -1L >>> 32; (int)var28 <= 2; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
                  liiiIIllIl(cap, var7, var8, (int)(var24 >>> 32) + var34[0], (int)var24 + (int)var28, (int)(var26 >>> 32) + var34[1], (int)(var22 >>> 32));
               }

               liiiIIllIl(cap, var7, var8, (int)(var24 >>> 32) + 2 * var34[0], (int)var24, (int)(var26 >>> 32) + 2 * var34[1], (int)(var22 >>> 32));
               liiiIIllIl(cap, var7, var8, (int)(var24 >>> 32) + 2 * var34[0], (int)var24 + 1, (int)(var26 >>> 32) + 2 * var34[1], (int)(var22 >>> 32));
               var28 += 4294967296L;
            }

            var32 = var11;
            var26 ^= ((long)var11.length ^ var26) & -1L >>> 32;

            for (var28 ^= (0L ^ var28) & -1L << 32; (int)(var28 >>> 32) < (int)var26; var28 += 4294967296L) {
               int[] var35 = var32[(int)(var28 >>> 32)];
               liiiIIllIl(cap, var7, var8, (int)(var24 >>> 32) + var35[0], (int)var24, (int)(var26 >>> 32) + var35[1], (int)(var22 >>> 32));
            }
         }

         return new lilIlliliilIllil((int)var22 == 0 ? IlIliilllIliil.llIliIlliilIliIlli : IlIliilllIliil.IiIliIlliliIliIlli, var7.size(), true, (int)var22);
      }
   }

   private iiiiIliIIIIlli() {
   }

   private static void liiiIIllIl(Illillllil z, Set<Long> floor, ArrayDeque<int[]> t, int seen, int q, int x, int y) {
      if (q >= y && iIlilIilIllilIil.lIiiIiIlilli(z, seen, q, x)) {
         if (floor.add(llIiIiililIiIiil.IIIllIIliIIl(seen, q, x))) {
            t.add(new int[]{seen, q, x});
         }
      }
   }
}
