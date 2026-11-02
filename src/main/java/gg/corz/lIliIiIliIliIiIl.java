package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongPredicate;

public final class lIliIiIliIliIiIl {
   private static final int[][] iIiIlliIll = new int[][]{{1, 0, 5}, {-1, 0, 4}, {0, 1, 3}, {0, -1, 2}};
   static final int IIiIlliIll = 0;
   static final int lIiIlliIll = 1;

   private static int iIlIlllllill(lilliIIiiilliIIi r) {
      return r.IiIlliIliiIl() == r.IIlllIlliIll() ? 0 : 1;
   }

   public static List<Long> Illlllllilll(lilliIIiiilliIIi r) {
      ArrayList var1 = new ArrayList();

      for (lilIlilliilIlill var3 : r.iliIiiliiiii()) {
         var1.add(var3.liiiIIllIl());
      }

      return var1;
   }

   public static List<lilliIIiiilliIIi> liiiIIllIl(long minLength, liiiiiiiiiii w, int allowDirectional, int seed, boolean maxLength) {
      long var33 = 2853000320208808870L;
      long var35 = 8466834414216088699L;
      long var25 = 3196524340184197170L;
      long var27 = 6516952346408025922L;
      long var29 = 6158494815620112214L;
      long var31 = 2919084029111783L;
      ArrayList var6 = new ArrayList();
      if (!w.iIlIlllllill(minLength)) {
         return var6;
      } else {
         var25 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(minLength) << 32 ^ var25) & -1L << 32;
         var25 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(minLength) ^ var25) & -1L >>> 32;
         var27 ^= ((long)llIiIiililIiIiil.Illlllllilll(minLength) << 32 ^ var27) & -1L << 32;
         int[] var10 = new int[]{0, 2};
         var27 ^= ((long)var10.length ^ var27) & -1L >>> 32;
         var29 ^= (0L ^ var29) & -1L << 32;

         while ((int)(var29 >>> 32) < (int)var27) {
            var29 ^= ((long)var10[(int)(var29 >>> 32)] ^ var29) & -1L >>> 32;
            int[][] var14 = iIiIlliIll;
            var31 ^= ((long)var14.length << 32 ^ var31) & -1L << 32;

            for (var31 ^= (0L ^ var31) & -1L >>> 32; (int)var31 < (int)(var31 >>> 32); var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
               int[] var17 = var14[(int)var31];
               if (((int)var29 != 0 || var17[0] == 0) && ((int)var29 != 2 || var17[1] == 0)) {
                  int[] var18 = new int[]{0};
                  var33 ^= ((long)var18.length << 32 ^ var33) & -1L << 32;

                  for (var33 ^= (0L ^ var33) & -1L >>> 32; (int)var33 < (int)(var33 >>> 32); var33 ^= (var33 ^ var33 + (long)1) & -1L >>> 32) {
                     var35 ^= ((long)var18[(int)var33] << 32 ^ var35) & -1L << 32;
                     lilliIIiiilliIIi var22 = IilliliilIIi(
                        (int)(var25 >>> 32), (int)var25, (int)(var27 >>> 32), (int)var29, var17, (int)(var35 >>> 32), w, seed, maxLength, 1
                     );
                     lilliIIiiilliIIi var23 = IilliliilIIi(
                        (int)(var25 >>> 32), (int)var25, (int)(var27 >>> 32), (int)var29, var17, (int)(var35 >>> 32), w, seed, maxLength, -1
                     );
                     lilliIIiiilliIIi var24 = var22 == null ? var23 : (var23 == null ? var22 : (var23.IliIlllilIi() > var22.IliIlllilIi() ? var23 : var22));
                     if (var24 != null && var24.IliIlllilIi() >= allowDirectional) {
                        var6.add(var24);
                     }
                  }
               }
            }

            var29 += 4294967296L;
         }

         var6.sort((a, b) -> {
            long var3 = 1751406075325512841L;
            var3 ^= ((long)Integer.compare(b.IliIlllilIi(), a.IliIlllilIi()) << 32 ^ var3) & -1L << 32;
            if ((int)(var3 >>> 32) != 0) {
               return (int)(var3 >>> 32);
            } else {
               var3 ^= ((long)Integer.compare(iIlIlllllill(a), iIlIlllllill(b)) << 32 ^ var3) & -1L << 32;
               return (int)(var3 >>> 32) != 0 ? (int)(var3 >>> 32) : Long.compare(a.Illlllllilll(), b.Illlllllilll());
            }
         });
         return var6;
      }
   }

   public static List<lilliIIiiilliIIi> IliIlllilIi(long w, liiiiiiiiiii maxLength, int seed, int minLength) {
      return liiiIIllIl(w, maxLength, seed, minLength, true);
   }

   private static long iliIiiliiiii(long w, int target, long laneCell, boolean dir, long prevValid, liiiiiiiiiii prev) {
      int[] var9 = iiIiIIilIIliIIil.liiiIIllIl(target);
      long var10 = llIiIiililIiIiil.IIIllIIliIIl(
         llIiIiililIiIiil.IiIlliIliiIl(w) + var9[0], llIiIiililIiIiil.IIlllIlliIll(w) + var9[1], llIiIiililIiIiil.Illlllllilll(w) + var9[2]
      );
      if (var10 == prevValid) {
         return 0L;
      } else if (prev.liiiIIllIl(var10)) {
         return var10;
      } else {
         return dir && var10 == laneCell ? var10 : 0L;
      }
   }

   private static List<lilIlilliilIlill> IIIllIIliIIl(List<lilIlilliilIlill> az, long ax, int seed, int members) {
      long var8 = 5176512453431623385L;
      long var10 = 8137582931686013901L;
      var8 ^= (-4294967296L ^ var8) & -1L << 32;

      for (var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < az.size(); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         if (((lilIlilliilIlill)az.get((int)var8)).IliIlllilIi() == ax) {
            var8 ^= ((long)((int)var8) << 32 ^ var8) & -1L << 32;
            break;
         }
      }

      if ((int)(var8 >>> 32) < 0) {
         return List.of();
      } else {
         var8 ^= ((long)((int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
         var10 ^= ((long)((int)(var8 >>> 32)) << 32 ^ var10) & -1L << 32;

         while (
            (int)var8 > 0
               && IlIlllIlilIl(((lilIlilliilIlill)az.get((int)var8 - 1)).IliIlllilIi(), ((lilIlilliilIlill)az.get((int)var8)).IliIlllilIi(), seed, members)
         ) {
            var8 ^= (var8 ^ var8 + (long)-1) & -1L >>> 32;
         }

         while (
            (int)(var10 >>> 32) + 1 < az.size()
               && IlIlllIlilIl(
                  ((lilIlilliilIlill)az.get((int)(var10 >>> 32))).IliIlllilIi(),
                  ((lilIlilliilIlill)az.get((int)(var10 >>> 32) + 1)).IliIlllilIi(),
                  seed,
                  members
               )
         ) {
            var10 += 4294967296L;
         }

         return new ArrayList<>(az.subList((int)var8, (int)(var10 >>> 32) + 1));
      }
   }

   private static lilliIIiiilliIIi IilliliilIIi(
      int sx, int axis, int side, int dy, int[] sz, int w, liiiiiiiiiii sy, int travel, boolean allowDirectional, int maxLength
   ) {
      long var48 = 7465875787635325634L;
      long var50 = 5963588697641091453L;
      long var36 = 6848540514194615320L;
      long var38 = 6771407773693929057L;
      long var40 = 1361114101487153375L;
      long var42 = -8470876245408697531L;
      long var44 = -5828432671444065859L;
      long var46 = 8061504111364812173L;
      var36 ^= ((long)(axis + w) << 32 ^ var36) & -1L << 32;
      var36 ^= ((long)(dy == 0 ? 1 : 0) ^ var36) & -1L >>> 32;
      var38 ^= ((long)(dy == 2 ? 1 : 0) << 32 ^ var38) & -1L << 32;
      if (!IIlllIlliIll(sx, axis, side, sz, (int)(var36 >>> 32), sy, false)) {
         return null;
      } else {
         ArrayList var13 = new ArrayList();
         var38 ^= (0L ^ var38) & -1L >>> 32;

         for (var40 ^= (4294967296L ^ var40) & -1L << 32; (int)(var40 >>> 32) <= travel; var40 += 4294967296L) {
            var40 ^= ((long)(sx - (int)var36 * (int)(var40 >>> 32)) ^ var40) & -1L >>> 32;
            var42 ^= ((long)(side - (int)(var38 >>> 32) * (int)(var40 >>> 32)) << 32 ^ var42) & -1L << 32;
            if (!IIlllIlliIll((int)var40, axis, (int)(var42 >>> 32), sz, (int)(var36 >>> 32), sy, true)) {
               break;
            }

            var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32;
         }

         var40 ^= (0L ^ var40) & -1L << 32;
         var40 ^= (1L ^ var40) & -1L >>> 32;

         while ((int)var40 <= travel) {
            var42 ^= ((long)(sx + (int)var36 * (int)var40) << 32 ^ var42) & -1L << 32;
            var42 ^= ((long)(side + (int)(var38 >>> 32) * (int)var40) ^ var42) & -1L >>> 32;
            if (!IIlllIlliIll((int)(var42 >>> 32), axis, (int)var42, sz, (int)(var36 >>> 32), sy, true)) {
               break;
            }

            var40 += 4294967296L;
            var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32;
         }

         var40 ^= ((long)(-((int)var38)) ^ var40) & -1L >>> 32;
         var42 ^= ((long)((int)(var40 >>> 32)) << 32 ^ var42) & -1L << 32;
         if ((int)(var42 >>> 32) - (int)var40 + 1 > travel) {
            var42 ^= ((long)((int)(var42 >>> 32) - (int)var40 + 1 - travel) ^ var42) & -1L >>> 32;
            var44 ^= ((long)Math.min((int)var42, (int)var38) << 32 ^ var44) & -1L << 32;
            var40 ^= ((long)((int)var40 + (int)(var44 >>> 32)) ^ var40) & -1L >>> 32;
            var42 ^= ((long)((int)var42 - (int)(var44 >>> 32)) ^ var42) & -1L >>> 32;
            var42 ^= ((long)((int)(var42 >>> 32) - (int)var42) << 32 ^ var42) & -1L << 32;
         }

         if (maxLength > 0) {
            for (long var69 = var42 ^ ((long)((int)var40) ^ var42) & -1L >>> 32;
               (int)var69 <= (int)(var69 >>> 32);
               var69 ^= (var69 ^ var69 + (long)1) & -1L >>> 32
            ) {
               var13.add(new int[]{sx + (int)var36 * (int)var69, axis, side + (int)(var38 >>> 32) * (int)var69});
            }
         } else {
            for (long var70 = var42 ^ ((long)((int)(var42 >>> 32)) ^ var42) & -1L >>> 32;
               (int)var70 >= (int)var40;
               var70 ^= (var70 ^ var70 + (long)-1) & -1L >>> 32
            ) {
               var13.add(new int[]{sx + (int)var36 * (int)var70, axis, side + (int)(var38 >>> 32) * (int)var70});
            }
         }

         ArrayList var18 = new ArrayList();
         long var19 = 0L;
         var44 ^= (0L ^ var44) & -1L >>> 32;

         for (int[] var23 : var13) {
            long var24 = llIiIiililIiIiil.IIIllIIliIIl(var23[0], var23[1], var23[2]);
            long var26 = llIiIiililIiIiil.IIIllIIliIIl(var23[0] + sz[0], (int)(var36 >>> 32), var23[2] + sz[1]);
            var46 ^= ((long)sy.lIiiIiIlilli(var24) << 32 ^ var46) & -1L << 32;
            var46 ^= ((long)sy.iliIiiliiiii(var24) ^ var46) & -1L >>> 32;
            if (allowDirectional || (int)(var46 >>> 32) < 0 && ((int)var46 < 0 || (int)var46 == 0)) {
               var48 ^= (0L ^ var48) & -1L << 32;
               var48 ^= ~var48 & -1L >>> 32;
               long var30;
               if ((int)(var46 >>> 32) >= 0) {
                  if ((int)(var46 >>> 32) == 1 || (int)(var46 >>> 32) == 0) {
                     var44 ^= (0L ^ var44) & -1L >>> 32;
                     continue;
                  }

                  var30 = iliIiiliiiii(var24, (int)(var46 >>> 32), var19, (boolean)((int)var44), var26, sy);
                  var48 ^= (4294967296L ^ var48) & -1L << 32;
                  var48 ^= ((long)((int)(var46 >>> 32)) ^ var48) & -1L >>> 32;
               } else if ((int)var46 >= 0) {
                  var30 = iliIiiliiiii(var24, (int)var46, var19, (boolean)((int)var44), var26, sy);
               } else {
                  long var34 = llIiIiililIiIiil.IIIllIIliIIl(var23[0], var23[1] - 1, var23[2]);
                  var30 = sy.liiiIIllIl(var34) ? var34 : ((int)var44 != 0 ? var19 : 0L);
               }

               if (var30 == 0L) {
                  var44 ^= (0L ^ var44) & -1L >>> 32;
               } else {
                  var18.add(
                     new lilIlilliilIlill(var24, var26, var30, IiIlliIliiIl(var30, var24), (int)var48, (boolean)((int)(var48 >>> 32)), sy.IIIllIIliIIl(var30))
                  );
                  var19 = var24;
                  var44 ^= (1L ^ var44) & -1L >>> 32;
               }
            } else {
               var44 ^= (0L ^ var44) & -1L >>> 32;
            }
         }

         if (var18.isEmpty()) {
            return null;
         } else {
            List var52 = IIIllIIliIIl(var18, llIiIiililIiIiil.IIIllIIliIIl(sx, axis, side), (int)var36 * maxLength, (int)(var38 >>> 32) * maxLength);
            if (var52.isEmpty()) {
               return null;
            } else {
               var52 = lIiiIiIlilli(var52, sz, sy);
               liilllIliiilllIl var54 = liilllIliiilllIl.iiiIIIliIl;
               var50 ^= (0L ^ var50) & -1L << 32;
               var50 ^= (0L ^ var50) & -1L >>> 32;

               for (lilIlilliilIlill var27 : var52) {
                  if (var27.iliIiiliiiii()) {
                     var50 ^= (4294967296L ^ var50) & -1L << 32;
                  }

                  if (var27.IIIllIIliIIl()) {
                     var50 ^= (1L ^ var50) & -1L >>> 32;
                  }
               }

               if ((int)var50 != 0) {
                  var54 = liilllIliiilllIl.iIIlIIliIl;
               } else if ((int)(var50 >>> 32) != 0) {
                  var54 = liilllIliiilllIl.lIIlIIliIl;
               }

               return new lilliIIiiilliIIi(
                  var54,
                  var52,
                  dy,
                  maxLength,
                  (int)(var36 >>> 32),
                  axis,
                  ((lilIlilliilIlill)var52.get(0)).liiiIIllIl(),
                  ((lilIlilliilIlill)var52.get(var52.size() - 1)).liiiIIllIl()
               );
            }
         }
      }
   }

   private static boolean IlIlllIlilIl(long az, long ax, int a, int b) {
      return llIiIiililIiIiil.IiIlliIliiIl(ax) - llIiIiililIiIiil.IiIlliIliiIl(az) == a
         && llIiIiililIiIiil.Illlllllilll(ax) - llIiIiililIiIiil.Illlllllilll(az) == b
         && llIiIiililIiIiil.IIlllIlliIll(az) == llIiIiililIiIiil.IIlllIlliIll(ax);
   }

   public static int IiIlliIliiIl(long target, long support) {
      long var7 = 3277198103372017634L;
      long var9 = 7494889602997654564L;
      var7 ^= ((long)(llIiIiililIiIiil.IiIlliIliiIl(support) - llIiIiililIiIiil.IiIlliIliiIl(target)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)(llIiIiililIiIiil.IIlllIlliIll(support) - llIiIiililIiIiil.IIlllIlliIll(target)) ^ var7) & -1L >>> 32;
      var9 ^= ((long)(llIiIiililIiIiil.Illlllllilll(support) - llIiIiililIiIiil.Illlllllilll(target)) << 32 ^ var9) & -1L << 32;
      if ((int)var7 > 0) {
         return 1;
      } else if ((int)var7 < 0) {
         return 0;
      } else if ((int)(var9 >>> 32) < 0) {
         return 2;
      } else if ((int)(var9 >>> 32) > 0) {
         return 3;
      } else {
         return (int)(var7 >>> 32) < 0 ? 4 : 5;
      }
   }

   private lIliIiIliIliIiIl() {
   }

   private static boolean IIlllIlliIll(int x, int side, int laneY, int[] z, int requirePlaceable, liiiiiiiiiii w, boolean y) {
      long var7 = llIiIiililIiIiil.IIIllIIliIIl(x, side, laneY);
      if (y && !w.iIlIlllllill(var7)) {
         return false;
      } else {
         long var9 = llIiIiililIiIiil.IIIllIIliIIl(x + z[0], requirePlaceable, laneY + z[1]);
         if (!w.IliIlllilIi(var9)) {
            return false;
         } else {
            long var11 = llIiIiililIiIiil.IIIllIIliIIl(x + 2 * z[0], requirePlaceable, laneY + 2 * z[1]);
            return !w.IliIlllilIi(var11) && !w.liiiIIllIl(var11) ? false : requirePlaceable + 1 != side || z[0] != 0 || z[1] != 0;
         }
      }
   }

   private static List<lilIlilliilIlill> lIiiIiIlilli(List<lilIlilliilIlill> seg, int[] side, liiiiiiiiiii w) {
      long var13 = -5793705948680290075L;
      ArrayList var3 = new ArrayList(seg.size() * 2);
      var13 ^= (0L ^ var13) & -1L << 32;

      for (lilIlilliilIlill var6 : seg) {
         var3.add(var6);
         if (!var6.iliIiiliiiii() && !var6.IIIllIIliIIl() && w.IlIlllIlilIl(var6.IliIlllilIi())) {
            long var7 = var6.IliIlllilIi();
            long var9 = llIiIiililIiIiil.IIIllIIliIIl(
               llIiIiililIiIiil.IiIlliIliiIl(var7) - side[0], llIiIiililIiIiil.IIlllIlliIll(var7), llIiIiililIiIiil.Illlllllilll(var7) - side[1]
            );
            long var11 = llIiIiililIiIiil.IIIllIIliIIl(
               llIiIiililIiIiil.IiIlliIliiIl(var9), llIiIiililIiIiil.IIlllIlliIll(var9) - 1, llIiIiililIiIiil.Illlllllilll(var9)
            );
            if (w.IlIlllIlilIl(var9) && w.liiiIIllIl(var11) && !w.IIIllIIliIIl(var11)) {
               var3.add(new lilIlilliilIlill(var9, var6.liiiIIllIl(), var11, IiIlliIliiIl(var11, var9)));
               var13 ^= (4294967296L ^ var13) & -1L << 32;
            }
         }
      }

      return (List<lilIlilliilIlill>)((int)(var13 >>> 32) != 0 ? var3 : seg);
   }

   public static boolean Iilllilliill(lilliIIiiilliIIi placed, liiiiiiiiiii r, LongPredicate w) {
      for (lilIlilliilIlill var4 : placed.iliIiiliiiii()) {
         if (!r.IliIlllilIi(var4.liiiIIllIl())) {
            return false;
         }

         if (!w.test(var4.IliIlllilIi()) && !r.iIlIlllllill(var4.IliIlllilIi())) {
            return false;
         }
      }

      return true;
   }
}
