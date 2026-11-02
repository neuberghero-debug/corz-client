package gg.corz;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.function.LongConsumer;

public final class iIIlililIlIlilil {
   private static final int[][] IlIiIlIlil = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};

   private iIIlililIlIlilil() {
   }

   public static iiiliIiIIIiiIi IliIlllilIi(int z, int unbuilt, int cap, lliiIililiiIil x, lliiIililiiIil visited, int solid, LongConsumer y) {
      long var32 = -5434398623354737217L;
      long var34 = 7673970470139591858L;
      long var26 = 5243366190445045425L;
      long var28 = -6543722985178233191L;
      long var30 = 960745465709665523L;
      if (!x.test(z, unbuilt, cap)) {
         return new iiiliIiIIIiiIi(IlIiIIllllIiIIll.lilllIllll, unbuilt, 0);
      } else {
         ArrayDeque var7 = new ArrayDeque();
         HashSet var8 = new HashSet();
         long var9 = llIiIiililIiIiil.IIIllIIliIIl(z, unbuilt, cap);
         var7.add(var9);
         var8.add(var9);
         if (y != null) {
            y.accept(var9);
         }

         var26 ^= ((long)unbuilt << 32 ^ var26) & -1L << 32;

         while (!var7.isEmpty()) {
            long var12 = (Long)var7.poll();
            var26 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var12) ^ var26) & -1L >>> 32;
            var28 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var12) << 32 ^ var28) & -1L << 32;
            var28 ^= ((long)llIiIiililIiIiil.Illlllllilll(var12) ^ var28) & -1L >>> 32;
            if ((int)(var28 >>> 32) < (int)(var26 >>> 32)) {
               var26 ^= ((long)((int)(var28 >>> 32)) << 32 ^ var26) & -1L << 32;
            }

            int[][] var17 = IlIiIlIlil;
            var30 ^= ((long)var17.length << 32 ^ var30) & -1L << 32;

            for (var30 ^= (0L ^ var30) & -1L >>> 32; (int)var30 < (int)(var30 >>> 32); var30 ^= (var30 ^ var30 + (long)1) & -1L >>> 32) {
               int[] var20 = var17[(int)var30];
               var32 ^= ((long)((int)var26 + var20[0]) << 32 ^ var32) & -1L << 32;
               var32 ^= ((long)((int)(var28 >>> 32) + var20[1]) ^ var32) & -1L >>> 32;
               var34 ^= ((long)((int)var28 + var20[2]) << 32 ^ var34) & -1L << 32;
               if (x.test((int)(var32 >>> 32), (int)var32, (int)(var34 >>> 32))) {
                  long var24 = llIiIiililIiIiil.IIIllIIliIIl((int)(var32 >>> 32), (int)var32, (int)(var34 >>> 32));
                  if (var8.add(var24)) {
                     if (y != null) {
                        y.accept(var24);
                     }

                     if (var8.size() > solid) {
                        return new iiiliIiIIIiiIi(IlIiIIllllIiIIll.IIillIllll, (int)(var26 >>> 32), var8.size());
                     }

                     var7.add(var24);
                  }
               } else if (visited.test((int)(var32 >>> 32), (int)var32, (int)(var34 >>> 32))) {
                  return new iiiliIiIIIiiIi(IlIiIIllllIiIIll.lilllIllll, (int)(var26 >>> 32), var8.size());
               }
            }
         }

         return new iiiliIiIIIiiIi(IlIiIIllllIiIIll.iilllIllll, (int)(var26 >>> 32), var8.size());
      }
   }
}
