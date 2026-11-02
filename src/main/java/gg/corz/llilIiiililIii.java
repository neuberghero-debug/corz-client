package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class llilIiiililIii {
   public static final int IliiiilIIl = 9;
   public static final int llIIIIiIIl = 8;
   public static final int IIIIIIiIIl = 10;
   public static final int lliiiilIIl = 3;
   public static final int IIiiiilIIl = 12;
   public static final double IlIIIIiIIl = 0.6;
   public static final double iIIIIIiIIl = 0.7;
   public static final double iIiiiilIIl = 0.8;
   public static final int lIIIIIiIIl = 8;
   public static final double liiiiilIIl = 0.6;
   public static final int iiiiiilIIl = 6;
   public static final int ilIIIIiIIl = 5;
   public static final double IiiiiilIIl = 0.6;
   public static final int IiIIIIiIIl = 2;
   public static final double iliiiilIIl = 0.85;
   public static final int lIiiiilIIl = 4;

   private static void lIiiIiIlilli(boolean[][] x, boolean[][] q, ArrayDeque<int[]> f, int z, int seen) {
      if (z >= 0 && z <= 15 && seen >= 0 && seen <= 15 && x[seen][z] && !q[seen][z]) {
         q[seen][z] = true;
         f.add(new int[]{z, seen});
      }
   }

   private static boolean IIlllIlliIll(boolean[][] x, int from, int to, int f) {
      long var6 = -2714234532353184904L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for (var6 ^= ((long)to ^ var6) & -1L >>> 32; (int)var6 < f; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         if (x[(int)var6][from]) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32) * 10 >= (f - to) * 8;
   }

   private static void liiiIIllIl(IIiIiiIllIiIiiIl m, boolean[][] baseY, int baseZ, int baseX, int out, int y, List<ilIlIIilIiIlIIil> f) {
      long var33 = 8574598442172901410L;
      long var23 = -7984643013757075219L;
      long var25 = -1816290480316351891L;
      long var27 = -963061396373362283L;
      long var29 = 4501931228506134441L;
      long var31 = -5771297215848649559L;
      boolean[][] var7 = new boolean[16][16];
      ArrayDeque var8 = new ArrayDeque();
      ArrayList var9 = new ArrayList();
      var23 ^= (0L ^ var23) & -1L << 32;

      while ((int)(var23 >>> 32) < 16) {
         for (var23 ^= (0L ^ var23) & -1L >>> 32; (int)var23 < 16; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            if (baseY[(int)(var23 >>> 32)][(int)var23] && !var7[(int)(var23 >>> 32)][(int)var23]) {
               var9.clear();
               var7[(int)(var23 >>> 32)][(int)var23] = true;
               var8.add(new int[]{(int)var23, (int)(var23 >>> 32)});
               var25 ^= ((long)((int)var23) << 32 ^ var25) & -1L << 32;
               var25 ^= ((long)((int)var23) ^ var25) & -1L >>> 32;
               var27 ^= ((long)((int)(var23 >>> 32)) << 32 ^ var27) & -1L << 32;
               var27 ^= ((long)((int)(var23 >>> 32)) ^ var27) & -1L >>> 32;

               while (!var8.isEmpty()) {
                  int[] var16 = (int[])var8.poll();
                  var9.add(var16);
                  var29 ^= ((long)var16[0] << 32 ^ var29) & -1L << 32;
                  var29 ^= ((long)var16[1] ^ var29) & -1L >>> 32;
                  if ((int)(var29 >>> 32) < (int)(var25 >>> 32)) {
                     var25 ^= ((long)((int)(var29 >>> 32)) << 32 ^ var25) & -1L << 32;
                  }

                  if ((int)(var29 >>> 32) > (int)var25) {
                     var25 ^= ((long)((int)(var29 >>> 32)) ^ var25) & -1L >>> 32;
                  }

                  if ((int)var29 < (int)(var27 >>> 32)) {
                     var27 ^= ((long)((int)var29) << 32 ^ var27) & -1L << 32;
                  }

                  if ((int)var29 > (int)var27) {
                     var27 ^= ((long)((int)var29) ^ var27) & -1L >>> 32;
                  }

                  lIiiIiIlilli(baseY, var7, var8, (int)(var29 >>> 32) + 1, (int)var29);
                  lIiiIiIlilli(baseY, var7, var8, (int)(var29 >>> 32) - 1, (int)var29);
                  lIiiIiIlilli(baseY, var7, var8, (int)(var29 >>> 32), (int)var29 + 1);
                  lIiiIiIlilli(baseY, var7, var8, (int)(var29 >>> 32), (int)var29 - 1);
               }

               long var41 = var31 ^ ((long)((int)var25 - (int)(var25 >>> 32) + 1) << 32 ^ var31) & -1L << 32;
               long var40 = var29 ^ ((long)((int)var27 - (int)(var27 >>> 32) + 1) << 32 ^ var29) & -1L << 32;
               var29 = var40 ^ ((long)var9.size() ^ var40) & -1L >>> 32;
               var31 = var41
                  ^ (
                        (long)(
                              (int)var29 >= 12
                                    && (int)(var41 >>> 32) >= 4
                                    && (int)(var29 >>> 32) >= 4
                                    && (double)((int)var29) >= 0.8 * (double)((int)(var41 >>> 32)) * (double)((int)(var29 >>> 32))
                                 ? 1
                                 : 0
                           )
                           ^ var41
                     )
                     & -1L >>> 32;
               var33 ^= (
                     (long)(
                              (int)var29 >= 9
                                    && (int)(var31 >>> 32) >= 3
                                    && (int)(var29 >>> 32) >= 3
                                    && (double)((int)var29) >= 0.85 * (double)((int)(var31 >>> 32)) * (double)((int)(var29 >>> 32))
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var33
                  )
                  & -1L << 32;
               if (((int)var31 != 0 || (int)(var33 >>> 32) != 0) && iIlIlllllill(m, var9, baseZ) && IilliliilIIi(m, baseY, var9, baseZ)) {
                  for (int[] var22 : var9) {
                     if (((baseX + var22[0]) % 3 + 3) % 3 == 0 && ((y + var22[1]) % 3 + 3) % 3 == 0) {
                        f.add(ilIlIIilIiIlIIil.IliIlllilIi(baseX + var22[0], out + baseZ, y + var22[1], lIlliIIiiIlliIIi.IIIIiliiil, 1, 139, 0));
                     }
                  }
               }
            }
         }

         var23 += 4294967296L;
      }
   }

   private static boolean IlIlllIlilIl(IIiIiiIllIiIiiIl x, int y, int z, int m) {
      return x.IilliliilIIi(y, z, m) && x.IilliliilIIi(y, z + 1, m);
   }

   private static void Illlllllilll(boolean[][][] baseX, int out, int floor, int baseZ, List<ilIlIIilIiIlIIil> baseY) {
      long var33 = -5855382313664932467L;
      long var35 = -1899828850912232181L;
      long var37 = 568363935334148672L;
      long var23 = -4448737378215731551L;
      long var25 = 4146701874196196457L;
      long var27 = 1983253441410235732L;
      long var29 = -3522749687315247542L;
      long var31 = 174390198648999660L;
      int[][] var5 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
      var23 ^= (4294967296L ^ var23) & -1L << 32;

      while ((int)(var23 >>> 32) <= 14) {
         for (var23 ^= (0L ^ var23) & -1L >>> 32; (int)var23 < 16; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            for (var25 ^= (0L ^ var25) & -1L << 32; (int)(var25 >>> 32) < 16; var25 += 4294967296L) {
               if (baseX[(int)(var23 >>> 32)][(int)var23][(int)(var25 >>> 32)]) {
                  int[][] var9 = var5;
                  var25 ^= ((long)var5.length ^ var25) & -1L >>> 32;
                  var27 ^= (0L ^ var27) & -1L << 32;

                  while ((int)(var27 >>> 32) < (int)var25) {
                     int[] var12 = var9[(int)(var27 >>> 32)];
                     var27 ^= ((long)((int)(var25 >>> 32) - var12[0]) ^ var27) & -1L >>> 32;
                     var29 ^= ((long)((int)var23 - var12[1]) << 32 ^ var29) & -1L << 32;
                     if ((int)(var23 >>> 32) + 1 > 14
                        || (int)var27 < 0
                        || (int)var27 >= 16
                        || (int)(var29 >>> 32) < 0
                        || (int)(var29 >>> 32) >= 16
                        || !baseX[(int)(var23 >>> 32) + 1][(int)(var29 >>> 32)][(int)var27]) {
                        var29 ^= (1L ^ var29) & -1L >>> 32;
                        var31 ^= ((long)((int)(var25 >>> 32)) << 32 ^ var31) & -1L << 32;
                        var31 ^= ((long)((int)(var23 >>> 32)) ^ var31) & -1L >>> 32;
                        var33 ^= ((long)((int)var23) << 32 ^ var33) & -1L << 32;

                        while (true) {
                           var33 ^= ((long)((int)(var31 >>> 32) + var12[0]) ^ var33) & -1L >>> 32;
                           var35 ^= ((long)((int)var31 - 1) << 32 ^ var35) & -1L << 32;
                           var35 ^= ((long)((int)(var33 >>> 32) + var12[1]) ^ var35) & -1L >>> 32;
                           if ((int)(var35 >>> 32) < 0
                              || (int)var33 < 0
                              || (int)var33 > 15
                              || (int)var35 < 0
                              || (int)var35 > 15
                              || !baseX[(int)(var35 >>> 32)][(int)var35][(int)var33]) {
                              if ((int)var29 >= 5) {
                                 var33 ^= ((long)((int)(var25 >>> 32)) ^ var33) & -1L >>> 32;
                                 var35 ^= ((long)((int)(var23 >>> 32)) << 32 ^ var35) & -1L << 32;
                                 var35 ^= ((long)((int)var23) ^ var35) & -1L >>> 32;

                                 for (var37 ^= (0L ^ var37) & -1L << 32; (int)(var37 >>> 32) < (int)var29; var37 += 4294967296L) {
                                    if ((int)(var37 >>> 32) % 2 == 0) {
                                       baseY.add(
                                          ilIlIIilIiIlIIil.IliIlllilIi(
                                             out + (int)var33, floor + (int)(var35 >>> 32), baseZ + (int)var35, lIlliIIiiIlliIIi.IIIIiliiil, 1, 147, 0
                                          )
                                       );
                                    }

                                    var33 ^= ((long)((int)var33 + var12[0]) ^ var33) & -1L >>> 32;
                                    var35 += -4294967296L;
                                    var35 ^= ((long)((int)var35 + var12[1]) ^ var35) & -1L >>> 32;
                                 }
                              }
                              break;
                           }

                           var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32;
                           var31 ^= ((long)((int)var33) << 32 ^ var31) & -1L << 32;
                           var31 ^= ((long)((int)(var35 >>> 32)) ^ var31) & -1L >>> 32;
                           var33 ^= ((long)((int)var35) << 32 ^ var33) & -1L << 32;
                        }
                     }

                     var27 += 4294967296L;
                  }
               }
            }
         }

         var23 += 4294967296L;
      }
   }

   private llilIiiililIii() {
   }

   public static List<ilIlIIilIiIlIIil> IliIlllilIi(IIiIiiIllIiIiiIl baseZ, int baseY, int surface, int baseX, int[] m) {
      long var11 = -5895520130511282095L;
      long var13 = 2340026468431666939L;
      ArrayList var5 = new ArrayList();
      if (baseZ != null && baseZ.lIiiIiIlilli()) {
         boolean[][][] var6 = new boolean[16][16][16];
         var11 ^= (0L ^ var11) & -1L << 32;

         for (var11 ^= (0L ^ var11) & -1L >>> 32; (int)var11 <= 14; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            var13 ^= (0L ^ var13) & -1L << 32;

            while ((int)(var13 >>> 32) < 16) {
               for (var13 ^= (0L ^ var13) & -1L >>> 32; (int)var13 < 16; var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
                  if (baseZ.iIlIlllllill((int)var13, (int)var11, (int)(var13 >>> 32))
                     && baseZ.iIlIlllllill((int)var13, (int)var11 + 1, (int)(var13 >>> 32))
                     && baseZ.IIIllIIliIIl((int)var13, (int)var11, (int)(var13 >>> 32))
                     && surface + (int)var11 <= m[(int)(var13 >>> 32) * 16 + (int)var13] - 2) {
                     var6[(int)var11][(int)(var13 >>> 32)][(int)var13] = true;
                     var11 ^= (4294967296L ^ var11) & -1L << 32;
                  }
               }

               var13 += 4294967296L;
            }
         }

         if ((int)(var11 >>> 32) != 0) {
            for (long var17 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var17 <= 14; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
               liiiIIllIl(baseZ, var6[(int)var17], (int)var17, baseY, surface, baseX, var5);
               iliIiiliiiii(baseZ, var6[(int)var17], (int)var17, baseY, surface, baseX, var5);
            }

            Illlllllilll(var6, baseY, surface, baseX, var5);
         }

         Iilllilliill(baseZ, baseY, surface, baseX, m, var5);
         return var5;
      } else {
         return var5;
      }
   }

   private static void Iilllilliill(IIiIiiIllIiIiiIl baseZ, int out, int baseX, int surface, int[] baseY, List<ilIlIIilIiIlIIil> m) {
      long var16 = -7667355159388160165L;
      long var12 = 5326754668900115385L;
      long var14 = 5969439131413136438L;
      var12 ^= (0L ^ var12) & -1L << 32;

      while ((int)(var12 >>> 32) < 16) {
         for (var12 ^= (0L ^ var12) & -1L >>> 32; (int)var12 < 16; var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            var14 ^= (0L ^ var14) & -1L << 32;
            var14 ^= (0L ^ var14) & -1L >>> 32;

            while ((int)var14 <= 16) {
               var16 ^= (
                     (long)(
                              (int)var14 < 16
                                    && baseZ.iIlIlllllill((int)var12, (int)var14, (int)(var12 >>> 32))
                                    && baseZ.IilliliilIIi((int)var12 + 1, (int)var14, (int)(var12 >>> 32))
                                    && baseZ.IilliliilIIi((int)var12 - 1, (int)var14, (int)(var12 >>> 32))
                                    && baseZ.IilliliilIIi((int)var12, (int)var14, (int)(var12 >>> 32) + 1)
                                    && baseZ.IilliliilIIi((int)var12, (int)var14, (int)(var12 >>> 32) - 1)
                                    && baseX + (int)var14 <= baseY[(int)(var12 >>> 32) * 16 + (int)var12] - 2
                                 ? 1
                                 : 0
                           )
                           << 32
                        ^ var16
                  )
                  & -1L << 32;
               if ((int)(var16 >>> 32) != 0) {
                  var14 += 4294967296L;
               } else {
                  if ((int)(var14 >>> 32) >= 8) {
                     for (var16 ^= ((long)((int)var14 - (int)(var14 >>> 32)) ^ var16) & -1L >>> 32;
                        (int)var16 < (int)var14;
                        var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32
                     ) {
                        if (((baseX + (int)var16) % 4 + 4) % 4 == 0) {
                           m.add(
                              ilIlIIilIiIlIIil.IliIlllilIi(
                                 out + (int)var12, baseX + (int)var16, surface + (int)(var12 >>> 32), lIlliIIiiIlliIIi.IIIIiliiil, 1, 141, 0
                              )
                           );
                        }
                     }
                  }

                  var14 ^= (0L ^ var14) & -1L << 32;
               }

               var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32;
            }
         }

         var12 += 4294967296L;
      }
   }

   private static boolean IiIlliIliiIl(boolean[] from, int row, int to) {
      long var5 = 6648626938670807182L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (var5 ^= ((long)row ^ var5) & -1L >>> 32; (int)var5 < to; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         if (from[(int)var5]) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32) * 10 >= (to - row) * 8;
   }

   private static boolean iIlIlllllill(IIiIiiIllIiIiiIl y, List<int[]> m, int comp) {
      long var9 = -2180070858244668285L;
      long var11 = 7546121779180601611L;
      long var13 = -680735421352456684L;
      int[] var3 = new int[7];
      var9 ^= (0L ^ var9) & -1L << 32;

      for (int[] var6 : m) {
         var9 ^= (0L ^ var9) & -1L >>> 32;

         while ((int)var9 < 6 && comp + (int)var9 < 16 && y.iIlIlllllill(var6[0], comp + (int)var9, var6[1])) {
            var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
         }

         var11 ^= ((long)(comp + (int)var9 >= 16 && (int)var9 < 6 ? 1 : 0) << 32 ^ var11) & -1L << 32;
         if ((int)(var11 >>> 32) == 0 && (int)var9 < 6) {
            var3[(int)var9]++;
            var9 += 4294967296L;
         }
      }

      if ((int)(var9 >>> 32) * 2 < m.size()) {
         return true;
      } else {
         var11 ^= (0L ^ var11) & -1L >>> 32;

         for (long var17 = var13 ^ (8589934592L ^ var13) & -1L << 32; (int)(var17 >>> 32) <= 6; var17 += 4294967296L) {
            var11 ^= ((long)Math.max((int)var11, var3[(int)(var17 >>> 32)]) ^ var11) & -1L >>> 32;
         }

         return (double)((int)var11) >= 0.6 * (double)((int)(var9 >>> 32));
      }
   }

   private static void iliIiiliiiii(IIiIiiIllIiIiiIl f, boolean[][] baseX, int out, int baseZ, int baseY, int m, List<ilIlIIilIiIlIIil> y) {
      long var19 = -2763156503448334892L;
      long var21 = -2614932430044146977L;
      long var23 = -1588988604791784544L;
      long var25 = -1810479620803386055L;
      long var27 = -5011414783496323958L;
      long var29 = -3867683419613632275L;
      boolean[][] var7 = new boolean[16][16];
      var19 ^= (0L ^ var19) & -1L << 32;

      while ((int)(var19 >>> 32) < 16) {
         var19 ^= (0L ^ var19) & -1L >>> 32;

         while ((int)var19 < 16) {
            if (baseX[(int)(var19 >>> 32)][(int)var19] && !var7[(int)(var19 >>> 32)][(int)var19]) {
               var21 ^= ((long)((int)var19) << 32 ^ var21) & -1L << 32;

               while ((int)var19 < 16 && baseX[(int)(var19 >>> 32)][(int)var19]) {
                  var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32;
               }

               var21 ^= ((long)((int)var19 - (int)(var21 >>> 32)) ^ var21) & -1L >>> 32;
               if ((int)var21 >= 8) {
                  var23 ^= (
                        (long)((int)(var19 >>> 32) + 1 < 16 && IiIlliIliiIl(baseX[(int)(var19 >>> 32) + 1], (int)(var21 >>> 32), (int)var19) ? 1 : 0) << 32
                           ^ var23
                     )
                     & -1L << 32;
                  var23 ^= (0L ^ var23) & -1L >>> 32;
                  var25 ^= (0L ^ var25) & -1L << 32;
                  var25 ^= (0L ^ var25) & -1L >>> 32;
                  var27 ^= ((long)((int)(var21 >>> 32)) << 32 ^ var27) & -1L << 32;

                  while ((int)(var27 >>> 32) < (int)var19) {
                     var27 ^= ((long)IlIlllIlilIl(f, (int)(var27 >>> 32), out, (int)(var19 >>> 32) - 1) ^ var27) & -1L >>> 32;
                     var29 ^= (
                           (long)(
                                    (int)(var23 >>> 32) != 0
                                       ? IlIlllIlilIl(f, (int)(var27 >>> 32), out, (int)(var19 >>> 32) + 2)
                                       : IlIlllIlilIl(f, (int)(var27 >>> 32), out, (int)(var19 >>> 32) + 1)
                                 )
                                 << 32
                              ^ var29
                        )
                        & -1L << 32;
                     if ((int)var27 != 0 && (int)(var29 >>> 32) != 0) {
                        var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
                     }

                     if (out + 2 < 16) {
                        var25 += 4294967296L;
                        if (f.IilliliilIIi((int)(var27 >>> 32), out + 2, (int)(var19 >>> 32))) {
                           var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32;
                        }
                     }

                     var27 += 4294967296L;
                  }

                  if (IIIllIIliIIl((int)var21, (int)var23, (int)(var25 >>> 32), (int)var25)) {
                     for (var27 ^= ((long)((int)(var21 >>> 32)) << 32 ^ var27) & -1L << 32; (int)(var27 >>> 32) < (int)var19; var27 += 4294967296L) {
                        var7[(int)(var19 >>> 32)][(int)(var27 >>> 32)] = true;
                        if ((int)(var23 >>> 32) != 0) {
                           var7[(int)(var19 >>> 32) + 1][(int)(var27 >>> 32)] = true;
                        }

                        if (((baseZ + (int)(var27 >>> 32)) % 4 + 4) % 4 == 0) {
                           y.add(
                              ilIlIIilIiIlIIil.IliIlllilIi(
                                 baseZ + (int)(var27 >>> 32), baseY + out, m + (int)(var19 >>> 32), lIlliIIiiIlliIIi.IIIIiliiil, 1, 140, 0
                              )
                           );
                        }
                     }
                  }
               }
            } else {
               var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32;
            }
         }

         var19 += 4294967296L;
      }

      var19 ^= (0L ^ var19) & -1L << 32;

      while ((int)(var19 >>> 32) < 16) {
         var19 ^= (0L ^ var19) & -1L >>> 32;

         while ((int)var19 < 16) {
            if (baseX[(int)var19][(int)(var19 >>> 32)] && !var7[(int)var19][(int)(var19 >>> 32)]) {
               var21 ^= ((long)((int)var19) << 32 ^ var21) & -1L << 32;

               while ((int)var19 < 16 && baseX[(int)var19][(int)(var19 >>> 32)]) {
                  var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32;
               }

               var21 ^= ((long)((int)var19 - (int)(var21 >>> 32)) ^ var21) & -1L >>> 32;
               if ((int)var21 >= 8) {
                  var23 ^= (
                        (long)((int)(var19 >>> 32) + 1 < 16 && IIlllIlliIll(baseX, (int)(var19 >>> 32) + 1, (int)(var21 >>> 32), (int)var19) ? 1 : 0) << 32
                           ^ var23
                     )
                     & -1L << 32;
                  var23 ^= (0L ^ var23) & -1L >>> 32;
                  var25 ^= (0L ^ var25) & -1L << 32;
                  var25 ^= (0L ^ var25) & -1L >>> 32;
                  var27 ^= ((long)((int)(var21 >>> 32)) << 32 ^ var27) & -1L << 32;

                  while ((int)(var27 >>> 32) < (int)var19) {
                     var27 ^= ((long)IlIlllIlilIl(f, (int)(var19 >>> 32) - 1, out, (int)(var27 >>> 32)) ^ var27) & -1L >>> 32;
                     var29 ^= (
                           (long)(
                                    (int)(var23 >>> 32) != 0
                                       ? IlIlllIlilIl(f, (int)(var19 >>> 32) + 2, out, (int)(var27 >>> 32))
                                       : IlIlllIlilIl(f, (int)(var19 >>> 32) + 1, out, (int)(var27 >>> 32))
                                 )
                                 << 32
                              ^ var29
                        )
                        & -1L << 32;
                     if ((int)var27 != 0 && (int)(var29 >>> 32) != 0) {
                        var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32;
                     }

                     if (out + 2 < 16) {
                        var25 += 4294967296L;
                        if (f.IilliliilIIi((int)(var19 >>> 32), out + 2, (int)(var27 >>> 32))) {
                           var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32;
                        }
                     }

                     var27 += 4294967296L;
                  }

                  if (IIIllIIliIIl((int)var21, (int)var23, (int)(var25 >>> 32), (int)var25)) {
                     for (var27 ^= ((long)((int)(var21 >>> 32)) << 32 ^ var27) & -1L << 32; (int)(var27 >>> 32) < (int)var19; var27 += 4294967296L) {
                        var7[(int)(var27 >>> 32)][(int)(var19 >>> 32)] = true;
                        if ((int)(var23 >>> 32) != 0) {
                           var7[(int)(var27 >>> 32)][(int)(var19 >>> 32) + 1] = true;
                        }

                        if (((m + (int)(var27 >>> 32)) % 4 + 4) % 4 == 0) {
                           y.add(
                              ilIlIIilIiIlIIil.IliIlllilIi(
                                 baseZ + (int)(var19 >>> 32), baseY + out, m + (int)(var27 >>> 32), lIlliIIiiIlliIIi.IIIIiliiil, 1, 140, 0
                              )
                           );
                        }
                     }
                  }
               }
            } else {
               var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32;
            }
         }

         var19 += 4294967296L;
      }
   }

   private static boolean IilliliilIIi(IIiIiiIllIiIiiIl comp, boolean[][] y, List<int[]> f, int m) {
      long var17 = 7225844463850029594L;
      long var19 = 4895564691201727830L;
      long var15 = 7470352693368566340L;
      var15 ^= (0L ^ var15) & -1L << 32;
      var15 ^= (0L ^ var15) & -1L >>> 32;
      int[][] var6 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

      for (int[] var8 : f) {
         int[][] var9 = var6;
         var17 ^= ((long)var6.length << 32 ^ var17) & -1L << 32;

         for (var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
            int[] var12 = var9[(int)var17];
            var19 ^= ((long)(var8[0] + var12[0]) << 32 ^ var19) & -1L << 32;
            var19 ^= ((long)(var8[1] + var12[1]) ^ var19) & -1L >>> 32;
            if ((int)(var19 >>> 32) >= 0 && (int)(var19 >>> 32) <= 15 && (int)var19 >= 0 && (int)var19 <= 15 && !y[(int)var19][(int)(var19 >>> 32)]) {
               if (comp.IilliliilIIi((int)(var19 >>> 32), m, (int)var19)) {
                  var15 += 4294967296L;
               } else {
                  var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32;
               }
            }
         }
      }

      return (int)(var15 >>> 32) + (int)var15 < 4 ? true : (double)((int)(var15 >>> 32)) >= 0.6 * (double)((int)(var15 >>> 32) + (int)var15);
   }

   private static boolean IIIllIIliIIl(int walled, int len, int ceilSolid, int ceilKnown) {
      if ((double)len < 0.7 * (double)walled) {
         return false;
      } else {
         return walled >= 10 ? true : ceilSolid > 0 && (double)ceilKnown >= 0.6 * (double)ceilSolid;
      }
   }
}
