package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public final class iIiIilIiIliIilIi {
   public static final double lIiiIllIIi = 0.79;
   public static final int iIiiIllIIi = 8;
   public static final int iiliIllIIi = 4;
   private static final int[][] IliiIllIIi = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
   public static final int IIiiIllIIi = 2;

   public static List<lliliIiililiIi> Illlllllilll(
      Iiilliiliiil fz, int executable, int fx, Set<Long> blocked, Predicate<lliliIiililiIi> edgeAllowed, BiPredicate<Long, Long> d
   ) {
      long var17 = -6819234978049798258L;
      long var15 = 7206515500171079830L;
      lllIllllillIllll var6 = Iilllilliill(fz, llIiIiililIiIiil.IIIllIIliIIl(executable, fz.IiiiIlliiiIl + 1, fx), d);
      ArrayList var7 = new ArrayList();

      for (List var9 : fz.lIIIlliIIIll.values()) {
         for (liiIiiiiIi var11 : var9) {
            var15 ^= ((long)var6.IliIlllilIi(var11.liiiIIllIl()) << 32 ^ var15) & -1L << 32;
            if ((int)(var15 >>> 32) > 0 && !blocked.contains(var11.liiiIIllIl())) {
               var7.add(
                  new lliliIiililiIi(
                     var11.IliIlllilIi(),
                     var11.liiiIIllIl(),
                     var11.iIlIlllllill(),
                     (int)(var15 >>> 32),
                     llIiIiililIiIiil.IiIlliIliiIl(var11.IliIlllilIi()) - executable,
                     llIiIiililIiIiil.Illlllllilll(var11.IliIlllilIi()) - fx
                  )
               );
            }
         }
      }

      var7.sort(
         Comparator.comparingInt(lliliIiililiIi::IilliliilIIi)
            .thenComparingLong(lliliIiililiIi::liiiIIllIl)
            .thenComparingLong(lliliIiililiIi::IliIlllilIi)
            .thenComparing(lliliIiililiIi::iIlIlllllill)
      );
      ArrayList var19 = new ArrayList();
      HashMap var20 = new HashMap();
      var15 ^= (2147483647L ^ var15) & -1L >>> 32;
      HashSet var21 = new HashSet();

      for (lliliIiililiIi var13 : var7) {
         var17 ^= ((long)IIlllIlliIll(var13.IilliliilIIi()) << 32 ^ var17) & -1L << 32;
         if ((int)(var17 >>> 32) > 2 && (int)var15 <= 2) {
            break;
         }

         if (var21.add(var13.IliIlllilIi() ^ Long.rotateLeft(var13.liiiIIllIl(), 29)) && edgeAllowed.test(var13)) {
            var15 ^= ((long)Math.min((int)var15, (int)(var17 >>> 32)) ^ var15) & -1L >>> 32;
            var19.add(var13);
            var20.computeIfAbsent(var13.liiiIIllIl(), k -> new HashSet<>()).add(var13.IliIlllilIi());
         }
      }

      var15 ^= ((long)((int)var15) << 32 ^ var15) & -1L << 32;
      var19.removeIf(bestTier -> IIlllIlliIll(bestTier.IilliliilIIi()) != p);
      var19.sort(
         Comparator.<lliliIiililiIi>comparingDouble(p -> (double)(-((Set)var20.get(p.liiiIIllIl())).size()) / (1.0 + (double)p.IilliliilIIi()))
            .thenComparingInt(lliliIiililiIi::IilliliilIIi)
            .thenComparingLong(lliliIiililiIi::liiiIIllIl)
            .thenComparingLong(lliliIiililiIi::IliIlllilIi)
            .thenComparing(lliliIiililiIi::iIlIlllllill)
      );
      return var19;
   }

   public static boolean liiiIIllIl(lIIiiiiIIiii z, int y, int p, int x) {
      return z.IliIlllilIi(y, p, x) && z.liiiIIllIl(y, p, x) && z.iIlIlllllill(y, p, x) && IliIlllilIi(z, y, p, x);
   }

   public static int IIlllIlliIll(int distance) {
      return distance == 0 ? 0 : (distance <= 3 ? 1 : (distance <= 8 ? 2 : 3));
   }

   static Map<Long, List<liiIiiiiIi>> IlIlllIlilIl(lIIiiiiIIiii walkable, int p, Set<Long> y, Set<Long> floor) {
      long var33 = 8728420493300353472L;
      long var49 = 6999079400859117254L;
      long var35 = 465506545032415298L;
      long var51 = -7064955298921559000L;
      long var37 = 3031366263426368053L;
      long var53 = -6376679076286255236L;
      long var39 = -3344542011193582756L;
      long var41 = -7563967946226571041L;
      long var43 = -6203361359377711L;
      long var45 = 2833857740822920722L;
      long var47 = 3178258270502909168L;
      HashMap var4 = new HashMap();
      HashSet var5 = new HashSet();

      for (long var7 : y) {
         var33 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var7) << 32 ^ var33) & -1L << 32;
         var33 ^= ((long)llIiIiililIiIiil.Illlllllilll(var7) ^ var33) & -1L >>> 32;
         int[][] var11 = IliiIllIIi;
         var35 ^= ((long)var11.length << 32 ^ var35) & -1L << 32;

         for (var35 ^= (0L ^ var35) & -1L >>> 32; (int)var35 < (int)(var35 >>> 32); var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
            int[] var14 = var11[(int)var35];
            long var62 = var37 ^ ((long)((int)(var33 >>> 32) + var14[0]) << 32 ^ var37) & -1L << 32;
            var37 = var62 ^ ((long)((int)var33 + var14[1]) ^ var62) & -1L >>> 32;
            long var17 = llIiIiililIiIiil.IIIllIIliIIl((int)(var37 >>> 32), p, (int)var37);
            if (!y.contains(var17)
               && var5.add(var17)
               && walkable.IliIlllilIi((int)(var37 >>> 32), p, (int)var37)
               && walkable.IilliliilIIi((int)(var37 >>> 32), p, (int)var37)) {
               ArrayList var19 = new ArrayList(4);
               var39 ^= ((long)walkable.iIlIlllllill((int)(var37 >>> 32), p - 1, (int)var37) << 32 ^ var39) & -1L << 32;
               int[][] var21 = IliiIllIIi;
               var39 ^= ((long)var21.length ^ var39) & -1L >>> 32;
               var41 ^= (0L ^ var41) & -1L << 32;

               while ((int)(var41 >>> 32) < (int)var39) {
                  int[] var24 = var21[(int)(var41 >>> 32)];
                  var41 ^= ((long)((int)(var37 >>> 32) + var24[0]) ^ var41) & -1L >>> 32;
                  var43 ^= ((long)((int)var37 + var24[1]) << 32 ^ var43) & -1L << 32;
                  if (y.contains(llIiIiililIiIiil.IIIllIIliIIl((int)var41, p, (int)(var43 >>> 32)))) {
                     var43 ^= ((long)((int)(var37 >>> 32) - (int)var41) ^ var43) & -1L >>> 32;
                     var45 ^= ((long)((int)var37 - (int)(var43 >>> 32)) << 32 ^ var45) & -1L << 32;
                     var19.add(
                        new liiIiiiiIi(
                           var17,
                           llIiIiililIiIiil.IIIllIIliIIl((int)var41, p + 1, (int)(var43 >>> 32)),
                           iIlIililIllIilil.lIIiiIIlil,
                           (int)var43,
                           (int)(var45 >>> 32)
                        )
                     );

                     for (var45 ^= ((long)((int)(var37 >>> 32) - 2) ^ var45) & -1L >>> 32;
                        (int)var45 <= (int)(var37 >>> 32) + 2;
                        var45 ^= (var45 ^ var45 + (long)1) & -1L >>> 32
                     ) {
                        for (var47 ^= ((long)((int)var37 - 2) << 32 ^ var47) & -1L << 32; (int)(var47 >>> 32) <= (int)var37 + 2; var47 += 4294967296L) {
                           if (((int)var45 != (int)var41 || (int)(var47 >>> 32) != (int)(var43 >>> 32))
                              && ((int)var45 != (int)(var37 >>> 32) || (int)(var47 >>> 32) != (int)var37)) {
                              long var31 = llIiIiililIiIiil.IIIllIIliIIl((int)var45, p + 1, (int)(var47 >>> 32));
                              if (floor.contains(var31)
                                 && ((int)var45 - (int)var41) * (int)var43 + ((int)(var47 >>> 32) - (int)(var43 >>> 32)) * (int)(var45 >>> 32) > 0) {
                                 var19.add(new liiIiiiiIi(var17, var31, iIlIililIllIilil.iIIiiIIlil, (int)var43, (int)(var45 >>> 32)));
                              }
                           }
                        }
                     }
                  }

                  var41 += 4294967296L;
               }

               if ((int)(var39 >>> 32) != 0) {
                  for (var47 ^= ((long)((int)(var37 >>> 32) - 2) ^ var47) & -1L >>> 32;
                     (int)var47 <= (int)(var37 >>> 32) + 2;
                     var47 ^= (var47 ^ var47 + (long)1) & -1L >>> 32
                  ) {
                     for (var39 ^= ((long)((int)var37 - 2) ^ var39) & -1L >>> 32; (int)var39 <= (int)var37 + 2; var39 ^= (var39 ^ var39 + (long)1) & -1L >>> 32) {
                        long var23 = llIiIiililIiIiil.IIIllIIliIIl((int)var47, p + 1, (int)var39);
                        if (floor.contains(var23)) {
                           var19.add(new liiIiiiiIi(var17, var23, iIlIililIllIilil.IlIiiIIlil, (int)(var37 >>> 32) - (int)var47, (int)var37 - (int)var39));
                        }
                     }
                  }
               }

               if (!var19.isEmpty()) {
                  var4.put(var17, var19);
               }
            }
         }
      }

      HashSet var55 = new HashSet(var4.keySet());
      int[][] var56 = new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

      for (long var9 : y) {
         var49 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var9) << 32 ^ var49) & -1L << 32;
         var35 ^= ((long)llIiIiililIiIiil.Illlllllilll(var9) << 32 ^ var35) & -1L << 32;
         int[][] var13 = var56;
         var49 ^= ((long)var56.length ^ var49) & -1L >>> 32;

         for (var37 ^= (0L ^ var37) & -1L << 32; (int)(var37 >>> 32) < (int)var49; var37 += 4294967296L) {
            int[] var16 = var13[(int)(var37 >>> 32)];
            long var67 = var51 ^ ((long)((int)(var49 >>> 32) + var16[0]) << 32 ^ var51) & -1L << 32;
            var51 = var67 ^ ((long)((int)(var35 >>> 32) + var16[1]) ^ var67) & -1L >>> 32;
            long var57 = llIiIiililIiIiil.IIIllIIliIIl((int)(var51 >>> 32), p, (int)var51);
            if (!y.contains(var57)
               && var5.add(var57)
               && walkable.IliIlllilIi((int)(var51 >>> 32), p, (int)var51)
               && walkable.IilliliilIIi((int)(var51 >>> 32), p, (int)var51)
               && walkable.iIlIlllllill((int)(var51 >>> 32), p - 1, (int)var51)) {
               var47 ^= (0L ^ var47) & -1L >>> 32;
               int[][] var22 = IliiIllIIi;
               var41 ^= ((long)var22.length << 32 ^ var41) & -1L << 32;

               for (var53 ^= (0L ^ var53) & -1L << 32; (int)(var53 >>> 32) < (int)(var41 >>> 32); var53 += 4294967296L) {
                  int[] var25 = var22[(int)(var53 >>> 32)];
                  if (var55.contains(llIiIiililIiIiil.IIIllIIliIIl((int)(var51 >>> 32) + var25[0], p, (int)var51 + var25[1]))) {
                     var47 ^= (1L ^ var47) & -1L >>> 32;
                     break;
                  }
               }

               if ((int)var47 == 0) {
                  ArrayList var58 = new ArrayList(4);

                  for (var41 ^= ((long)((int)(var51 >>> 32) - 2) << 32 ^ var41) & -1L << 32;
                     (int)(var41 >>> 32) <= (int)(var51 >>> 32) + 2;
                     var41 += 4294967296L
                  ) {
                     for (var53 ^= ((long)((int)var51 - 2) << 32 ^ var53) & -1L << 32; (int)(var53 >>> 32) <= (int)var51 + 2; var53 += 4294967296L) {
                        long var59 = llIiIiililIiIiil.IIIllIIliIIl((int)(var41 >>> 32), p + 1, (int)(var53 >>> 32));
                        if (floor.contains(var59)) {
                           var58.add(
                              new liiIiiiiIi(
                                 var57, var59, iIlIililIllIilil.IlIiiIIlil, (int)(var51 >>> 32) - (int)(var41 >>> 32), (int)var51 - (int)(var53 >>> 32)
                              )
                           );
                        }
                     }
                  }

                  if (!var58.isEmpty()) {
                     var4.put(var57, var58);
                  }
               }
            }
         }
      }

      return var4;
   }

   public static boolean IlIillIiilIi(Iiilliiliiil from, long d, long to) {
      long var17 = 4888377236653943687L;
      long var19 = -4438415785649175782L;
      if (from.iiiiIlIIIIll.contains(d) && from.iiiiIlIIIIll.contains(to)) {
         if (d == to) {
            return true;
         } else {
            HashSet var5 = new HashSet();
            ArrayDeque var6 = new ArrayDeque();
            var5.add(d);
            var6.add(d);

            while (!var6.isEmpty()) {
               long var7 = (Long)var6.poll();
               var17 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var7) << 32 ^ var17) & -1L << 32;
               var17 ^= ((long)llIiIiililIiIiil.Illlllllilll(var7) ^ var17) & -1L >>> 32;
               int[][] var11 = IliiIllIIi;
               var19 ^= ((long)var11.length << 32 ^ var19) & -1L << 32;

               for (var19 ^= (0L ^ var19) & -1L >>> 32; (int)var19 < (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
                  int[] var14 = var11[(int)var19];
                  long var15 = llIiIiililIiIiil.IIIllIIliIIl((int)(var17 >>> 32) + var14[0], from.IiiiIlliiiIl + 1, (int)var17 + var14[1]);
                  if (var15 == to) {
                     return true;
                  }

                  if (from.iiiiIlIIIIll.contains(var15) && var5.add(var15)) {
                     var6.add(var15);
                  }
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   public static iIlillIllill lIiiIiIlilli(lIIiiiiIIiii cz, int cx, int p, int cap, int r, int y) {
      long var20 = -5377388096405474096L;
      long var22 = 3037467276117899532L;
      long var24 = -3249644700168989108L;
      var20 ^= (0L ^ var20) & -1L << 32;
      var20 ^= (0L ^ var20) & -1L >>> 32;
      Iiilliiliiil var8 = null;
      HashSet var9 = new HashSet();
      var22 ^= ((long)(-r) << 32 ^ var22) & -1L << 32;

      while ((int)(var22 >>> 32) <= r) {
         for (var22 ^= ((long)(-r) ^ var22) & -1L >>> 32; (int)var22 <= r; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            var24 ^= ((long)(p + (int)(var22 >>> 32)) << 32 ^ var24) & -1L << 32;
            var24 ^= ((long)(cap + (int)var22) ^ var24) & -1L >>> 32;
            if (cz.IliIlllilIi((int)(var24 >>> 32), cx, (int)var24)
               && cz.liiiIIllIl((int)(var24 >>> 32), cx, (int)var24)
               && cz.iIlIlllllill((int)(var24 >>> 32), cx, (int)var24)) {
               var20 += 4294967296L;
               if (IliIlllilIi(cz, (int)(var24 >>> 32), cx, (int)var24)) {
                  var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32;
                  long var14 = llIiIiililIiIiil.IIIllIIliIIl((int)(var24 >>> 32), cx, (int)var24);
                  if (!var9.contains(var14)) {
                     Iiilliiliiil var16 = iIlIlllllill(cz, cx, (int)(var24 >>> 32), (int)var24, y);
                     if (var16 != null) {
                        for (long var18 : var16.iiiiIlIIIIll) {
                           var9.add(llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(var18), cx, llIiIiililIiIiil.Illlllllilll(var18)));
                        }

                        if (var8 == null || var16.lIiiIiIlilli() > var8.lIiiIiIlilli()) {
                           var8 = var16;
                        }
                     }
                  }
               }
            }
         }

         var22 += 4294967296L;
      }

      return new iIlillIllill(
         cx,
         (int)(var20 >>> 32),
         (int)var20,
         var8 == null ? 0 : var8.lIiiIiIlilli(),
         var8 == null ? 0 : var8.IilliliilIIi(),
         var8 == null ? 0 : var8.IlIIllllIIll,
         var8 == null ? 0 : IIIilIIiiIIi(cz, var8).size(),
         var8
      );
   }

   public static List<lliliIiililiIi> Iiilliiliiil(Iiilliiliiil lastDirX, int fz, int lastX, int fx, int blockedStands, int d, int lastDirZ, Set<Long> lastZ) {
      long var20 = 9128097485028608254L;
      long var22 = -1279469630389035347L;
      long var24 = -7646006275964344678L;
      long var26 = 4108967613428478637L;
      long var8 = llIiIiililIiIiil.IIIllIIliIIl(fz, lastDirX.IiiiIlliiiIl + 1, lastX);
      ArrayList var10 = new ArrayList();

      for (Entry var12 : lastDirX.lIIIlliIIIll.entrySet()) {
         liiIiiiiIi var13 = null;
         var20 ^= (9223372032559808512L ^ var20) & -1L << 32;
         var20 ^= (9L ^ var20) & -1L >>> 32;

         for (liiIiiiiIi var17 : (List)var12.getValue()) {
            if (lastZ == null || !lastZ.contains(var17.liiiIIllIl())) {
               var22 ^= (
                     (long)(
                              var17.liiiIIllIl() == var8
                                 ? 0
                                 : Math.max(
                                    Math.abs(llIiIiililIiIiil.IiIlliIliiIl(var17.liiiIIllIl()) - fz),
                                    Math.abs(llIiIiililIiIiil.Illlllllilll(var17.liiiIIllIl()) - lastX)
                                 )
                           )
                           << 32
                        ^ var22
                  )
                  & -1L << 32;
               var22 ^= (
                     (long)(var17.iIlIlllllill() == iIlIililIllIilil.IlIiiIIlil ? 0 : (var17.iIlIlllllill() == iIlIililIllIilil.iIIiiIIlil ? 1 : 2)) ^ var22
                  )
                  & -1L >>> 32;
               if ((int)(var22 >>> 32) < (int)(var20 >>> 32) || (int)(var22 >>> 32) == (int)(var20 >>> 32) && (int)var22 < (int)var20) {
                  var13 = var17;
                  var20 ^= ((long)((int)(var22 >>> 32)) << 32 ^ var20) & -1L << 32;
                  var20 ^= ((long)((int)var22) ^ var20) & -1L >>> 32;
               }
            }
         }

         if (var13 != null) {
            long var31 = var24 ^ ((long)llIiIiililIiIiil.IiIlliIliiIl(var13.IliIlllilIi()) << 32 ^ var24) & -1L << 32;
            var24 = var31 ^ ((long)llIiIiililIiIiil.Illlllllilll(var13.IliIlllilIi()) ^ var31) & -1L >>> 32;
            var10.add(
               new lliliIiililiIi(
                  var13.IliIlllilIi(), var13.liiiIIllIl(), var13.iIlIlllllill(), (int)(var20 >>> 32), (int)(var24 >>> 32) - fz, (int)var24 - lastX
               )
            );
         }
      }

      var26 ^= ((long)(fx != Integer.MIN_VALUE ? 1 : 0) << 32 ^ var26) & -1L << 32;
      var10.sort(
         (lastDirXx, a) -> {
            long var16 = 4698311080137225292L;
            long var12x = -4889938400106620757L;
            long var14 = 3289714584948223901L;
            if (lastDirXx.IilliliilIIi() != a.IilliliilIIi()) {
               return Integer.compare(lastDirXx.IilliliilIIi(), a.IilliliilIIi());
            } else {
               if (b) {
                  var12x ^= (
                        (long)Math.max(
                                 Math.abs(llIiIiililIiIiil.IiIlliIliiIl(lastDirXx.IliIlllilIi()) - fx),
                                 Math.abs(llIiIiililIiIiil.Illlllllilll(lastDirXx.IliIlllilIi()) - blockedStands)
                              )
                              << 32
                           ^ var12x
                     )
                     & -1L << 32;
                  var12x ^= (
                        (long)Math.max(
                              Math.abs(llIiIiililIiIiil.IiIlliIliiIl(a.IliIlllilIi()) - fx),
                              Math.abs(llIiIiililIiIiil.Illlllllilll(a.IliIlllilIi()) - blockedStands)
                           )
                           ^ var12x
                     )
                     & -1L >>> 32;
                  if ((int)(var12x >>> 32) != (int)var12x) {
                     return Integer.compare((int)(var12x >>> 32), (int)var12x);
                  }
               }

               var12x ^= ((long)(lastDirXx.lIiiIiIlilli() * d + lastDirXx.iliIiiliiiii() * lastDirZ) << 32 ^ var12x) & -1L << 32;
               var12x ^= ((long)(a.lIiiIiIlilli() * d + a.iliIiiliiiii() * lastDirZ) ^ var12x) & -1L >>> 32;
               if ((int)(var12x >>> 32) != (int)var12x) {
                  return Integer.compare((int)var12x, (int)(var12x >>> 32));
               } else {
                  var14 ^= ((long)(Math.abs(lastDirXx.lIiiIiIlilli()) + Math.abs(lastDirXx.iliIiiliiiii())) << 32 ^ var14) & -1L << 32;
                  var14 ^= ((long)(Math.abs(a.lIiiIiIlilli()) + Math.abs(a.iliIiiliiiii())) ^ var14) & -1L >>> 32;
                  if ((int)(var14 >>> 32) != (int)var14) {
                     return Integer.compare((int)(var14 >>> 32), (int)var14);
                  } else {
                     var16 ^= (
                           (long)Integer.compare(llIiIiililIiIiil.IiIlliIliiIl(lastDirXx.IliIlllilIi()), llIiIiililIiIiil.IiIlliIliiIl(a.IliIlllilIi())) << 32
                              ^ var16
                        )
                        & -1L << 32;
                     return (int)(var16 >>> 32) != 0
                        ? (int)(var16 >>> 32)
                        : Integer.compare(llIiIiililIiIiil.Illlllllilll(lastDirXx.IliIlllilIi()), llIiIiililIiIiil.Illlllllilll(a.IliIlllilIi()));
                  }
               }
            }
         }
      );
      return var10;
   }

   public static Iiilliiliiil iIlIlllllill(lIIiiiiIIiii cap, int sz, int p, int y, int sx) {
      long var16 = 7458720197411530490L;
      long var18 = 7508681528073181468L;
      if (!liiiIIllIl(cap, p, sz, y)) {
         return null;
      } else {
         HashSet var5 = new HashSet();
         ArrayDeque var6 = new ArrayDeque();
         var5.add(llIiIiililIiIiil.IIIllIIliIIl(p, sz, y));
         var6.add(new long[]{(long)p, (long)y});

         while (!var6.isEmpty() && var5.size() < sx) {
            long[] var7 = (long[])var6.poll();
            int[][] var8 = IliiIllIIi;
            var16 ^= ((long)var8.length << 32 ^ var16) & -1L << 32;

            for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
               int[] var11 = var8[(int)var16];
               long var23 = var18 ^ ((long)((int)var7[0] + var11[0]) << 32 ^ var18) & -1L << 32;
               var18 = var23 ^ ((long)((int)var7[1] + var11[1]) ^ var23) & -1L >>> 32;
               long var14 = llIiIiililIiIiil.IIIllIIliIIl((int)(var18 >>> 32), sz, (int)var18);
               if (!var5.contains(var14) && liiiIIllIl(cap, (int)(var18 >>> 32), sz, (int)var18)) {
                  var5.add(var14);
                  var6.add(new long[]{(long)((int)(var18 >>> 32)), (long)((int)var18)});
               }
            }
         }

         HashSet var20 = new HashSet(var5.size() * 2);

         for (long var9 : var5) {
            var20.add(llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(var9), sz + 1, llIiIiililIiIiil.Illlllllilll(var9)));
         }

         return new Iiilliiliiil(sz, var20, IlIlllIlilIl(cap, sz, var5, var20), IilliliilIIi(cap, sz, var5, sx));
      }
   }

   public static List<Long> IIillIiliIil(Iiilliiliiil edgeAllowed, long from, long to, BiPredicate<Long, Long> d) {
      return Iilllilliill(edgeAllowed, from, d).liiiIIllIl(to);
   }

   static int IilliliilIIi(lIIiiiiIIiii y, int cap, Set<Long> p, int floor) {
      long var21 = -5953332432049437636L;
      long var23 = 7181267676747568779L;
      long var25 = 1022792318660288027L;
      long var27 = -8823725405251026128L;
      long var29 = -5845394812690211132L;
      HashSet var4 = new HashSet(p);
      ArrayDeque var5 = new ArrayDeque(p);
      var21 ^= (0L ^ var21) & -1L << 32;

      while (!var5.isEmpty() && (int)(var21 >>> 32) < floor) {
         long var7 = (Long)var5.poll();
         var21 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var7) ^ var21) & -1L >>> 32;
         var23 ^= ((long)llIiIiililIiIiil.Illlllllilll(var7) << 32 ^ var23) & -1L << 32;
         int[][] var11 = IliiIllIIi;
         var23 ^= ((long)var11.length ^ var23) & -1L >>> 32;
         var25 ^= (0L ^ var25) & -1L << 32;

         while ((int)(var25 >>> 32) < (int)var23) {
            int[] var14 = var11[(int)(var25 >>> 32)];
            var25 ^= ((long)((int)var21 + var14[0]) ^ var25) & -1L >>> 32;
            var27 ^= ((long)((int)(var23 >>> 32) + var14[1]) << 32 ^ var27) & -1L << 32;
            long var17 = llIiIiililIiIiil.IIIllIIliIIl((int)var25, cap, (int)(var27 >>> 32));
            if (!var4.contains(var17) && y.IliIlllilIi((int)var25, cap, (int)(var27 >>> 32))) {
               var27 ^= ((long)y.liiiIIllIl((int)var25, cap, (int)(var27 >>> 32)) ^ var27) & -1L >>> 32;
               var29 ^= ((long)((int)var27 == 0 && y.IilliliilIIi((int)var25, cap, (int)(var27 >>> 32)) ? 1 : 0) << 32 ^ var29) & -1L << 32;
               if ((int)var27 != 0 || (int)(var29 >>> 32) != 0) {
                  var4.add(var17);
                  var5.add(var17);
                  if ((int)(var29 >>> 32) != 0) {
                     var21 += 4294967296L;
                  }
               }
            }

            var25 += 4294967296L;
         }
      }

      return (int)(var21 >>> 32);
   }

   public static List<Long> IiIiliIiiiIi(Set<Long> cells) {
      ArrayList var1 = new ArrayList(cells);
      Collections.sort(var1);
      return var1;
   }

   public static Iiilliiliiil IIIllIIliIIl(lIIiiiiIIiii cap, int y, int cz, int p, int r, int cx) {
      long var11 = -810852135429842959L;
      long var13 = 7638232940305109897L;
      long var15 = 6920501828136407310L;
      if (liiiIIllIl(cap, cz, y, p)) {
         return iIlIlllllill(cap, y, cz, p, cx);
      } else {
         var11 ^= (4294967296L ^ var11) & -1L << 32;

         while ((int)(var11 >>> 32) <= r) {
            for (var11 ^= ((long)(-((int)(var11 >>> 32))) ^ var11) & -1L >>> 32;
               (int)var11 <= (int)(var11 >>> 32);
               var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32
            ) {
               for (var13 ^= ((long)(-((int)(var11 >>> 32))) << 32 ^ var13) & -1L << 32; (int)(var13 >>> 32) <= (int)(var11 >>> 32); var13 += 4294967296L) {
                  if (Math.max(Math.abs((int)var11), Math.abs((int)(var13 >>> 32))) == (int)(var11 >>> 32)) {
                     var13 ^= ((long)(cz + (int)var11) ^ var13) & -1L >>> 32;
                     var15 ^= ((long)(p + (int)(var13 >>> 32)) << 32 ^ var15) & -1L << 32;
                     if (liiiIIllIl(cap, (int)var13, y, (int)(var15 >>> 32))) {
                        return iIlIlllllill(cap, y, (int)var13, (int)(var15 >>> 32), cx);
                     }
                  }
               }
            }

            var11 += 4294967296L;
         }

         return null;
      }
   }

   public static List<long[]> IIIilIIiiIIi(lIIiiiiIIiii p, Iiilliiliiil d) {
      long var17 = 6269310539086396665L;
      long var19 = 6984125291116634442L;
      long var21 = -4003939295859679856L;
      ArrayList var2 = new ArrayList();
      HashSet var3 = new HashSet();

      for (long var5 : d.iiiiIlIIIIll) {
         var17 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var5) << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)llIiIiililIiIiil.Illlllllilll(var5) ^ var17) & -1L >>> 32;
         int[][] var9 = IliiIllIIi;
         var19 ^= ((long)var9.length << 32 ^ var19) & -1L << 32;

         for (var19 ^= (0L ^ var19) & -1L >>> 32; (int)var19 < (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            int[] var12 = var9[(int)var19];
            long var25 = var21 ^ ((long)((int)(var17 >>> 32) + var12[0]) << 32 ^ var21) & -1L << 32;
            var21 = var25 ^ ((long)((int)var17 + var12[1]) ^ var25) & -1L >>> 32;
            long var15 = llIiIiililIiIiil.IIIllIIliIIl((int)(var21 >>> 32), d.IiiiIlliiiIl, (int)var21);
            if (var3.add(var15)
               && !p.IliIlllilIi((int)(var21 >>> 32), d.IiiiIlliiiIl, (int)var21)
               && !p.iIlIlllllill((int)(var21 >>> 32), d.IiiiIlliiiIl, (int)var21)
               && !p.iIlIlllllill((int)(var21 >>> 32), d.IiiiIlliiiIl + 1, (int)var21)
               && !p.iIlIlllllill((int)(var21 >>> 32), d.IiiiIlliiiIl + 2, (int)var21)) {
               var2.add(new long[]{var5, var15});
            }
         }
      }

      return var2;
   }

   public static List<lliliIiililiIi> IiIlliIliiIl(Iiilliiliiil d, int executable, int fx, Set<Long> fz, Predicate<lliliIiililiIi> blocked) {
      return Illlllllilll(d, executable, fx, fz, blocked, (a, b) -> true);
   }

   public static lllIllllillIllll Iilllilliill(Iiilliiliiil edgeAllowed, long d, BiPredicate<Long, Long> from) {
      long var17 = -1792693446738672933L;
      long var19 = 7084991225579563915L;
      HashMap var4 = new HashMap();
      HashMap var5 = new HashMap();
      if (edgeAllowed != null && edgeAllowed.iIlIlllllill(d)) {
         ArrayDeque var6 = new ArrayDeque();
         var6.add(d);
         var4.put(d, 0);

         while (!var6.isEmpty()) {
            long var7 = (Long)var6.remove();
            var17 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var7) << 32 ^ var17) & -1L << 32;
            var17 ^= ((long)llIiIiililIiIiil.Illlllllilll(var7) ^ var17) & -1L >>> 32;
            int[][] var11 = IliiIllIIi;
            var19 ^= ((long)var11.length << 32 ^ var19) & -1L << 32;

            for (var19 ^= (0L ^ var19) & -1L >>> 32; (int)var19 < (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
               int[] var14 = var11[(int)var19];
               long var15 = llIiIiililIiIiil.IIIllIIliIIl((int)(var17 >>> 32) + var14[0], edgeAllowed.IiiiIlliiiIl + 1, (int)var17 + var14[1]);
               if (edgeAllowed.iIlIlllllill(var15) && !var4.containsKey(var15) && from.test(var7, var15)) {
                  var4.put(var15, (Integer)var4.get(var7) + 1);
                  var5.put(var15, var7);
                  var6.add(var15);
               }
            }
         }

         return new lllIllllillIllll(d, Map.copyOf(var4), Map.copyOf(var5));
      } else {
         return new lllIllllillIllll(d, var4, var5);
      }
   }

   static boolean IliIlllilIi(lIIiiiiIIiii x, int p, int y, int z) {
      return !x.iIlIlllllill(p, y + 1, z) && !x.iIlIlllllill(p, y + 2, z);
   }

   public static List<Long> Ililllililil(Iiilliiliiil d, long from, long to) {
      long var13 = 1655396415876611617L;
      long var15 = -7583608497652489668L;
      if (d != null && d.iIlIlllllill(from) && d.iIlIlllllill(to) && from != to) {
         var13 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(from) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)llIiIiililIiIiil.Illlllllilll(from) ^ var13) & -1L >>> 32;
         int[][] var7 = IliiIllIIi;
         var15 ^= ((long)var7.length << 32 ^ var15) & -1L << 32;

         for (long var20 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            int[] var10 = var7[(int)var20];
            long var11 = llIiIiililIiIiil.IIIllIIliIIl((int)(var13 >>> 32) + var10[0], d.IiiiIlliiiIl + 1, (int)var13 + var10[1]);
            if (d.iIlIlllllill(var11)) {
               if (var11 == to) {
                  return List.of(from, to);
               }

               if (Math.abs(llIiIiililIiIiil.IiIlliIliiIl(var11) - llIiIiililIiIiil.IiIlliIliiIl(to))
                     + Math.abs(llIiIiililIiIiil.Illlllllilll(var11) - llIiIiililIiIiil.Illlllllilll(to))
                  == 1) {
                  return List.of(from, var11, to);
               }
            }
         }

         return List.of();
      } else {
         return List.of();
      }
   }

   public static List<Long> iliIiiliiiii(lIIiiiiIIiii d, Iiilliiliiil p) {
      long var8 = -8028370463538625629L;
      ArrayList var2 = new ArrayList();

      for (long var4 : p.iiiiIlIIIIll) {
         var8 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var4) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)llIiIiililIiIiil.Illlllllilll(var4) ^ var8) & -1L >>> 32;
         if (d.IliIlllilIi((int)(var8 >>> 32), p.IiiiIlliiiIl + 1, (int)var8) || d.IliIlllilIi((int)(var8 >>> 32), p.IiiiIlliiiIl + 2, (int)var8)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   private iIiIilIiIliIilIi() {
   }
}
