package gg.corz;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class iiiiliIIIIii {
   private static final int iiIllllIlIIlllllIl = -1;
   private static final int IiIllllIlliIllllIl = 0;

   private iiiiliIIIIii() {
   }

   private static long IilliliilIIi(int bx, int bz, int by) {
      return (long)bx & 67108863L | (long)(by & 67108863) << 26 | (long)(bz & 4095) << 52;
   }

   private static int liiiIIllIl(int[] tail, int label, int[] clusterId, int[] count, int nbrs, int[] queued, int seeds) {
      long var9 = -1190106684008732911L;
      var9 ^= (0L ^ var9) & -1L << 32;

      while ((int)(var9 >>> 32) < label) {
         var9 ^= ((long)tail[(int)(var9 >>> 32)] ^ var9) & -1L >>> 32;
         if (clusterId[(int)var9] <= 0 && count[(int)var9] != nbrs) {
            count[(int)var9] = nbrs;
            queued[seeds++] = (int)var9;
         }

         var9 += 4294967296L;
      }

      return seeds;
   }

   public static List<lIiiIIIiiIiiIIIi> IliIlllilIi(List<ilIlIIilIiIlIIil> cells, int eps, int minPts) {
      long var21 = -4664270049384978591L;
      long var23 = 7648348986560897996L;
      long var25 = -651778084778951341L;
      long var27 = 326411198177394988L;
      long var29 = -3468638559406546776L;
      var21 ^= ((long)cells.size() << 32 ^ var21) & -1L << 32;
      ArrayList var4 = new ArrayList();
      if ((int)(var21 >>> 32) == 0) {
         return var4;
      } else {
         var21 ^= ((long)Math.max(1, eps) ^ var21) & -1L >>> 32;
         int[] var6 = new int[(int)(var21 >>> 32)];
         int[] var7 = new int[(int)(var21 >>> 32)];
         int[] var8 = new int[(int)(var21 >>> 32)];
         Long2ObjectOpenHashMap var9 = new Long2ObjectOpenHashMap();

         for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)(var21 >>> 32); var23 += 4294967296L) {
            ilIlIIilIiIlIIil var11 = (ilIlIIilIiIlIIil)cells.get((int)(var23 >>> 32));
            var6[(int)(var23 >>> 32)] = var11.IlIiIlIIil;
            var7[(int)(var23 >>> 32)] = var11.llIiIlIIil;
            var8[(int)(var23 >>> 32)] = var11.ilIiIlIIil;
            long var12 = IilliliilIIi(
               Math.floorDiv(var11.IlIiIlIIil, (int)var21), Math.floorDiv(var11.llIiIlIIil, (int)var21), Math.floorDiv(var11.ilIiIlIIil, (int)var21)
            );
            IntArrayList var14 = (IntArrayList)var9.get(var12);
            if (var14 == null) {
               var14 = new IntArrayList();
               var9.put(var12, var14);
            }

            var14.add((int)(var23 >>> 32));
         }

         int[] var10 = new int[(int)(var21 >>> 32)];
         var23 ^= (0L ^ var23) & -1L >>> 32;
         int[] var31 = new int[(int)(var21 >>> 32)];
         int[] var13 = new int[(int)(var21 >>> 32)];
         int[] var32 = new int[(int)(var21 >>> 32)];

         for (var25 ^= (0L ^ var25) & -1L << 32; (int)(var25 >>> 32) < (int)(var21 >>> 32); var25 += 4294967296L) {
            if (var10[(int)(var25 >>> 32)] == 0) {
               var25 ^= ((long)iIlIlllllill(var6, var7, var8, var9, (int)(var25 >>> 32), (int)var21, eps, var31) ^ var25) & -1L >>> 32;
               if ((int)var25 < minPts) {
                  var10[(int)(var25 >>> 32)] = -1;
               } else {
                  var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
                  var10[(int)(var25 >>> 32)] = (int)var23;
                  var27 ^= (0L ^ var27) & -1L << 32;
                  var27 ^= ((long)liiiIIllIl(var31, (int)var25, var10, var32, (int)var23, var13, 0) ^ var27) & -1L >>> 32;

                  while ((int)(var27 >>> 32) < (int)var27) {
                     int var10001 = (int)(var27 >>> 32);
                     var27 += 4294967296L;
                     var29 ^= ((long)var13[var10001] << 32 ^ var29) & -1L << 32;
                     if (var10[(int)(var29 >>> 32)] == -1) {
                        var10[(int)(var29 >>> 32)] = (int)var23;
                     }

                     if (var10[(int)(var29 >>> 32)] == 0) {
                        var10[(int)(var29 >>> 32)] = (int)var23;
                        var29 ^= ((long)iIlIlllllill(var6, var7, var8, var9, (int)(var29 >>> 32), (int)var21, eps, var31) ^ var29) & -1L >>> 32;
                        if ((int)var29 >= minPts) {
                           var27 ^= ((long)liiiIIllIl(var31, (int)var29, var10, var32, (int)var23, var13, (int)var27) ^ var27) & -1L >>> 32;
                        }
                     }
                  }
               }
            }
         }

         HashMap var15 = new HashMap();

         for (long var38 = var25 ^ (0L ^ var25) & -1L >>> 32; (int)var38 < (int)(var21 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
            if (var10[(int)var38] > 0) {
               var15.computeIfAbsent(var10[(int)var38], k -> new lIiiIIIiiIiiIIIi()).liiiIIllIl((ilIlIIilIiIlIIil)cells.get((int)var38));
            }
         }

         var4.addAll(var15.values());
         return var4;
      }
   }

   private static int iIlIlllllill(int[] zs, int[] buckets, int[] res, Long2ObjectOpenHashMap<IntArrayList> ys, int xs, int i, int g, int[] eps) {
      long var32 = 6834412386433490502L;
      long var34 = 2429899063731039626L;
      long var36 = -6599084454296928932L;
      long var38 = -6240551360467231647L;
      long var40 = -6025781103988878186L;
      long var26 = 3727858224908871022L;
      long var28 = -7110078709101412724L;
      long var30 = -4027461627392053206L;
      var26 ^= ((long)zs[xs] << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)buckets[xs] ^ var26) & -1L >>> 32;
      var28 ^= ((long)res[xs] << 32 ^ var28) & -1L << 32;
      var28 ^= ((long)Math.floorDiv((int)(var26 >>> 32), i) ^ var28) & -1L >>> 32;
      var30 ^= ((long)Math.floorDiv((int)var26, i) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)Math.floorDiv((int)(var28 >>> 32), i) ^ var30) & -1L >>> 32;
      var32 ^= (0L ^ var32) & -1L << 32;

      for (var32 ^= ~var32 & -1L >>> 32; (int)var32 <= 1; var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32) {
         var34 ^= (-4294967296L ^ var34) & -1L << 32;

         while ((int)(var34 >>> 32) <= 1) {
            for (var34 ^= ~var34 & -1L >>> 32; (int)var34 <= 1; var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32) {
               IntArrayList var18 = (IntArrayList)ys.get(
                  IilliliilIIi((int)var28 + (int)var32, (int)(var30 >>> 32) + (int)(var34 >>> 32), (int)var30 + (int)var34)
               );
               if (var18 != null) {
                  int[] var19 = var18.elements();
                  var36 ^= (0L ^ var36) & -1L << 32;

                  for (var36 ^= ((long)var18.size() ^ var36) & -1L >>> 32; (int)(var36 >>> 32) < (int)var36; var36 += 4294967296L) {
                     var38 ^= ((long)var19[(int)(var36 >>> 32)] << 32 ^ var38) & -1L << 32;
                     if ((int)(var38 >>> 32) != xs) {
                        var38 ^= ((long)Math.abs((int)(var26 >>> 32) - zs[(int)(var38 >>> 32)]) ^ var38) & -1L >>> 32;
                        var40 ^= ((long)Math.abs((int)var26 - buckets[(int)(var38 >>> 32)]) << 32 ^ var40) & -1L << 32;
                        var40 ^= ((long)Math.abs((int)(var28 >>> 32) - res[(int)(var38 >>> 32)]) ^ var40) & -1L >>> 32;
                        if (Math.max((int)var38, Math.max((int)(var40 >>> 32), (int)var40)) <= g) {
                           int var10001 = (int)(var32 >>> 32);
                           var32 += 4294967296L;
                           eps[var10001] = (int)(var38 >>> 32);
                        }
                     }
                  }
               }
            }

            var34 += 4294967296L;
         }
      }

      return (int)(var32 >>> 32);
   }
}
