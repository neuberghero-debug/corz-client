package gg.corz;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public final class iIlilIilIllilIil {
   public static final int IiIIIllIil = 2;
   public static final int ilIIIllIil = 12;
   public static final int liIIIllIil = 160;
   public static final int llIIIllIil = 40;

   public static Illillllil IIIllIIliIIl(Illillllil base) {
      return new Illillllil() {
         @Override
         public boolean IilliliilIIi(int x, int z, int y) {
            return base.IilliliilIIi(x, z, y);
         }

         @Override
         public boolean IliIlllilIi(int y, int z, int x) {
            return base.IliIlllilIi(y, z, x);
         }

         @Override
         public boolean liiiIIllIl(int x, int z, int y) {
            return base.liiiIIllIl(x, z, y);
         }

         @Override
         public boolean solid(int x, int z, int y) {
            return base.solid(x, z, y);
         }

         @Override
         public boolean iIlIlllllill() {
            return true;
         }
      };
   }

   public static int IlIlllIlilIl(Illillllil fx, int t, int cap, int fz, int fy) {
      return IiIlliIliiIl(fx, t, cap, fz, fy, new HashSet<>());
   }

   private static long Illlllllilll(int x, int z, int y) {
      return llIiIiililIiIiil.IIIllIIliIIl(x, z, y);
   }

   static boolean iliIiiliiiii(Illillllil x, int t, int y, int z) {
      long var5 = -1795301032444408624L;

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) <= 2; var7 += 4294967296L) {
         if (lIiiIiIlilli(x, t, y - (int)(var7 >>> 32), z)) {
            return true;
         }
      }

      return false;
   }

   public static boolean Iiilliiliiil(Illillllil fromX, int toZ, int base, int toX, int fromZ, int fromY, int toY) {
      long var9 = -979220065964033733L;
      if (fromY >= base) {
         return false;
      } else {
         var9 ^= ((long)IlIlllIlilIl(fromX, toZ, base, toX, 40) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) == 0 && fromX.solid(toZ, base - 1, toX) && !fromX.IliIlllilIi(toZ, base - 1, toX)) {
            var9 ^= ((long)Ililllililil(fromX, toZ, base, toX) << 32 ^ var9) & -1L << 32;
         }

         var9 ^= ((long)IlIlllIlilIl(fromX, fromZ, fromY, toY, 40) ^ var9) & -1L >>> 32;
         if ((int)(var9 >>> 32) == 0 && (int)var9 > 0 && !fromX.solid(toZ, base - 1, toX)) {
            var9 ^= ((long)Ililllililil(fromX, toZ, base, toX) << 32 ^ var9) & -1L << 32;
         }

         return (int)(var9 >>> 32) >= 40 ? (int)var9 < 40 : (int)var9 < (int)(var9 >>> 32) && (int)var9 <= 12;
      }
   }

   public static lllIllIiillIllIi IIillIiliIil(Illillllil placedFloor, int ty, int fy, int tx, int tz, int base, int fx, boolean fz) {
      long var11 = 5373649469889871448L;
      long var13 = 3552433453881007283L;
      if (!lIiiIiIlilli(placedFloor, ty, fy, tx)) {
         return new lllIllIiillIllIi(iillIlIiIIilIlIi.ilIiIIIIIi, -1, -1);
      } else {
         var11 ^= ((long)IlIlllIlilIl(placedFloor, ty, fy, tx, 40) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)IlIlllIlilIl(iIlIlllllill(placedFloor, tz, base, fx, fz), ty, fy, tx, 40) ^ var11) & -1L >>> 32;
         var13 ^= ((long)(lIiiIiIlilli(placedFloor, tz, base, fx) ? 1 : 0) << 32 ^ var13) & -1L << 32;
         return (int)(var11 >>> 32) >= 40
            ? new lllIllIiillIllIi((int)var11 >= 40 ? iillIlIiIIilIlIi.iIIiIIIIIi : iillIlIiIIilIlIi.IlIiIIIIIi, (int)(var11 >>> 32), (int)var11)
            : new lllIllIiillIllIi(
               (int)(var11 >>> 32) - (int)var11 <= (int)(var13 >>> 32) && (int)var11 > 1 ? iillIlIiIIilIlIi.llIiIIIIIi : iillIlIiIIilIlIi.IlIiIIIIIi,
               (int)(var11 >>> 32),
               (int)var11
            );
      }
   }

   private iIlilIilIllilIil() {
   }

   static int Ililllililil(Illillllil t, int fx, int fy, int fz) {
      long var17 = -6440179028867456362L;
      long var13 = -8848119082849452102L;
      long var15 = 549197112931184443L;
      var13 ^= (0L ^ var13) & -1L << 32;
      int[][] var5 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
      int[][] var6 = var5;
      var13 ^= ((long)var5.length ^ var13) & -1L >>> 32;
      var15 ^= (0L ^ var15) & -1L << 32;

      while ((int)(var15 >>> 32) < (int)var13) {
         int[] var9 = var6[(int)(var15 >>> 32)];
         var15 ^= ((long)(fx + var9[0]) ^ var15) & -1L >>> 32;
         var17 ^= ((long)(fz + var9[1]) << 32 ^ var17) & -1L << 32;
         if (IilliliilIIi(t, (int)var15, fy + 1, (int)(var17 >>> 32))) {
            for (var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 <= 2; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
               if (lIiiIiIlilli(t, (int)var15, fy - (int)var17, (int)(var17 >>> 32))) {
                  var13 ^= ((long)Math.max((int)(var13 >>> 32), IlIlllIlilIl(t, (int)var15, fy - (int)var17, (int)(var17 >>> 32), 40)) << 32 ^ var13)
                     & -1L << 32;
                  break;
               }

               if (!IilliliilIIi(t, (int)var15, fy - (int)var17, (int)(var17 >>> 32))) {
                  break;
               }
            }
         }

         var15 += 4294967296L;
      }

      return (int)(var13 >>> 32);
   }

   public static lllIllIiillIllIi Iilllilliill(Illillllil tx, int tz, int base, int fy, int fz, int fx, int ty) {
      return IIillIiliIil(tx, tz, base, fy, fz, fx, ty, true);
   }

   public static boolean IliIlllilIi(Illillllil t, int fx, int fy, int fz) {
      return lIiiIiIlilli(t, fx, fy, fz);
   }

   public static Illillllil liiiIIllIl(Illillllil ty, int tx, int tz, int base) {
      return iIlIlllllill(ty, tx, tz, base, true);
   }

   public static int IiIiliIiiiIi(Illillllil fy, int maxK, int fz, int pillar, int base, illlIIIiIillIIIi fx) {
      long var8 = -5877068405976362411L;
      if (!lIiiIiIlilli(fy, maxK, fz, pillar)) {
         return 0;
      } else {
         Illillllil var6 = fy;

         for (long var10 = var8 ^ (4294967296L ^ var8) & -1L << 32; (int)(var10 >>> 32) <= base; var10 += 4294967296L) {
            if (!IilliliilIIi(fy, maxK, fz + (int)(var10 >>> 32) + 1, pillar) || !fx.allowed(maxK, fz + (int)(var10 >>> 32) - 1, pillar)) {
               return 0;
            }

            var6 = liiiIIllIl(var6, maxK, fz + (int)(var10 >>> 32) - 1, pillar);
            if (IlIlllIlilIl(var6, maxK, fz + (int)(var10 >>> 32), pillar, 40) >= 40) {
               return (int)(var10 >>> 32);
            }
         }

         return 0;
      }
   }

   public static boolean IIlilIliiIli(Illillllil with, Illillllil fz, int without, int fy, int fx) {
      return IlIlllIlilIl(fz, without, fy, fx, 160) < 158 && IlIlllIlilIl(with, without, fy, fx, 160) >= 160;
   }

   private static void IIlllIlliIll(Illillllil y, Set<Long> t, ArrayDeque<long[]> z, int seen, int q, int x) {
      if (t.add(Illlllllilll(seen, q, x))) {
         z.add(new long[]{(long)seen, (long)q, (long)x});
      }
   }

   private static int IiIlliIliiIl(Illillllil fy, int t, int fx, int fz, int cap, Set<Long> seen) {
      long var32 = 8485772268223350169L;
      long var34 = 67005203638112097L;
      long var24 = -8271164679143749903L;
      long var26 = -2855891117529578221L;
      long var28 = 7270470450119213896L;
      long var30 = 5564200543445733923L;
      if (!lIiiIiIlilli(fy, t, fx, fz)) {
         return 0;
      } else {
         ArrayDeque var6 = new ArrayDeque();
         seen.add(Illlllllilll(t, fx, fz));
         var6.add(new long[]{(long)t, (long)fx, (long)fz});
         int[][] var7 = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
         int[][] var8 = new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

         while (!var6.isEmpty()) {
            if (seen.size() >= cap) {
               return seen.size();
            }

            long[] var9 = (long[])var6.poll();
            var24 ^= ((long)((int)var9[0]) << 32 ^ var24) & -1L << 32;
            var24 ^= ((long)((int)var9[1]) ^ var24) & -1L >>> 32;
            var26 ^= ((long)((int)var9[2]) << 32 ^ var26) & -1L << 32;
            int[][] var13 = var8;
            var26 ^= ((long)var8.length ^ var26) & -1L >>> 32;

            for (var28 ^= (0L ^ var28) & -1L << 32; (int)(var28 >>> 32) < (int)var26; var28 += 4294967296L) {
               int[] var16 = var13[(int)(var28 >>> 32)];
               if (IilliliilIIi(fy, (int)(var24 >>> 32) + var16[0], (int)var24, (int)(var26 >>> 32))
                  && IilliliilIIi(fy, (int)(var24 >>> 32) + var16[0], (int)var24 + 1, (int)(var26 >>> 32))
                  && IilliliilIIi(fy, (int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32) + var16[1])
                  && IilliliilIIi(fy, (int)(var24 >>> 32), (int)var24 + 1, (int)(var26 >>> 32) + var16[1])
                  && lIiiIiIlilli(fy, (int)(var24 >>> 32) + var16[0], (int)var24, (int)(var26 >>> 32) + var16[1])
                  && (
                     !fy.iIlIlllllill()
                        || iliIiiliiiii(fy, (int)(var24 >>> 32) + var16[0], (int)var24, (int)(var26 >>> 32))
                           && iliIiiliiiii(fy, (int)(var24 >>> 32), (int)var24, (int)(var26 >>> 32) + var16[1])
                  )) {
                  IIlllIlliIll(fy, seen, var6, (int)(var24 >>> 32) + var16[0], (int)var24, (int)(var26 >>> 32) + var16[1]);
               }
            }

            var13 = var7;
            var26 ^= ((long)var7.length ^ var26) & -1L >>> 32;
            var28 ^= (0L ^ var28) & -1L << 32;

            while ((int)(var28 >>> 32) < (int)var26) {
               int[] var37 = var13[(int)(var28 >>> 32)];
               var28 ^= ((long)((int)(var24 >>> 32) + var37[0]) ^ var28) & -1L >>> 32;
               var30 ^= ((long)((int)(var26 >>> 32) + var37[1]) << 32 ^ var30) & -1L << 32;
               if (lIiiIiIlilli(fy, (int)var28, (int)var24, (int)(var30 >>> 32))) {
                  IIlllIlliIll(fy, seen, var6, (int)var28, (int)var24, (int)(var30 >>> 32));
               } else if (!IilliliilIIi(fy, (int)(var24 >>> 32), (int)var24 + 2, (int)(var26 >>> 32))
                  || !lIiiIiIlilli(fy, (int)var28, (int)var24 + 1, (int)(var30 >>> 32))
                  || fy.IilliliilIIi((int)(var24 >>> 32), (int)var24 - 1, (int)(var26 >>> 32)) && !fy.IilliliilIIi((int)var28, (int)var24, (int)(var30 >>> 32))
                  || fy.liiiIIllIl((int)(var24 >>> 32), (int)var24 - 1, (int)(var26 >>> 32)) && !fy.IilliliilIIi((int)var28, (int)var24, (int)(var30 >>> 32))) {
                  var30 ^= (0L ^ var30) & -1L >>> 32;
                  var32 ^= ((long)IilliliilIIi(fy, (int)var28, (int)var24 + 1, (int)(var30 >>> 32)) << 32 ^ var32) & -1L << 32;

                  for (var32 ^= (1L ^ var32) & -1L >>> 32;
                     (int)(var32 >>> 32) != 0
                        && (int)var32 <= 3
                        && IilliliilIIi(fy, (int)var28, (int)var24 - (int)var32 + 1, (int)(var30 >>> 32))
                        && (
                           (int)var32 != 2
                              || fy.IilliliilIIi((int)(var24 >>> 32), (int)var24 - 1, (int)(var26 >>> 32))
                              || !fy.IilliliilIIi((int)var28, (int)var24 - (int)var32 - 1, (int)(var30 >>> 32))
                              || !lIiiIiIlilli(fy, (int)var28, (int)var24 - (int)var32, (int)(var30 >>> 32))
                        );
                     var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32
                  ) {
                     if (lIiiIiIlilli(fy, (int)var28, (int)var24 - (int)var32, (int)(var30 >>> 32))) {
                        if ((int)var32 <= 2 || !fy.IilliliilIIi((int)var28, (int)var24 - (int)var32 - 1, (int)(var30 >>> 32))) {
                           IIlllIlliIll(fy, seen, var6, (int)var28, (int)var24 - (int)var32, (int)(var30 >>> 32));
                           var30 ^= (1L ^ var30) & -1L >>> 32;
                        }
                        break;
                     }

                     if ((int)var32 == 2 && !fy.IilliliilIIi((int)(var24 >>> 32), (int)var24 - 1, (int)(var26 >>> 32))) {
                        break;
                     }
                  }

                  if ((int)var30 == 0
                     && IilliliilIIi(fy, (int)var28, (int)var24, (int)(var30 >>> 32))
                     && IilliliilIIi(fy, (int)var28, (int)var24 + 1, (int)(var30 >>> 32))
                     && IilliliilIIi(fy, (int)(var24 >>> 32), (int)var24 + 2, (int)(var26 >>> 32))) {
                     var32 ^= (0L ^ var32) & -1L >>> 32;

                     for (var34 ^= (4294967296L ^ var34) & -1L << 32; (int)(var34 >>> 32) <= 2; var34 += 4294967296L) {
                        if (lIiiIiIlilli(fy, (int)var28, (int)var24 - (int)(var34 >>> 32), (int)(var30 >>> 32))) {
                           var32 ^= (1L ^ var32) & -1L >>> 32;
                           break;
                        }
                     }

                     if ((int)var32 != 0) {
                        var34 ^= ((long)((int)(var24 >>> 32) + 2 * var37[0]) << 32 ^ var34) & -1L << 32;
                        var34 ^= ((long)((int)(var26 >>> 32) + 2 * var37[1]) ^ var34) & -1L >>> 32;
                        if (lIiiIiIlilli(fy, (int)(var34 >>> 32), (int)var24, (int)var34)) {
                           IIlllIlliIll(fy, seen, var6, (int)(var34 >>> 32), (int)var24, (int)var34);
                        } else if (IilliliilIIi(fy, (int)(var34 >>> 32), (int)var24, (int)var34)
                           && lIiiIiIlilli(fy, (int)(var34 >>> 32), (int)var24 - 1, (int)var34)) {
                           IIlllIlliIll(fy, seen, var6, (int)(var34 >>> 32), (int)var24 - 1, (int)var34);
                        }
                     }
                  }
               } else {
                  IIlllIlliIll(fy, seen, var6, (int)var28, (int)var24 + 1, (int)(var30 >>> 32));
               }

               var28 += 4294967296L;
            }
         }

         return seen.size();
      }
   }

   public static boolean lIiiIiIlilli(Illillllil y, int x, int t, int z) {
      return y.IliIlllilIi(x, t - 1, z) && IilliliilIIi(y, x, t, z) && IilliliilIIi(y, x, t + 1, z);
   }

   static boolean IilliliilIIi(Illillllil x, int t, int z, int y) {
      return !x.solid(t, z, y);
   }

   public static boolean Illillliilli(Illillllil pillar, int base, int toY, int toX, int fromZ, int toZ, int fromY, illlIIIiIillIIIi fromX) {
      long var16 = -1431997251089433687L;
      long var18 = -8718862158541178020L;
      if (toZ < toY && IlIlllIlilIl(pillar, base, toY, toX, 40) >= 40) {
         HashSet var8 = new HashSet();
         var16 ^= ((long)IiIlliIliiIl(pillar, fromZ, toZ, fromY, 160, var8) << 32 ^ var16) & -1L << 32;
         if ((int)(var16 >>> 32) >= 40 && (int)(var16 >>> 32) < 160 && !var8.contains(Illlllllilll(base, toY, toX))) {
            for (long var11 : var8) {
               var16 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var11) ^ var16) & -1L >>> 32;
               var18 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var11) << 32 ^ var18) & -1L << 32;
               var18 ^= ((long)llIiIiililIiIiil.Illlllllilll(var11) ^ var18) & -1L >>> 32;
               if (IilliliilIIi(pillar, (int)var16, (int)(var18 >>> 32) + 2, (int)var18)
                  && IilliliilIIi(pillar, (int)var16, (int)(var18 >>> 32) + 3, (int)var18)
                  && fromX.allowed((int)var16, (int)(var18 >>> 32), (int)var18)) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean IlIillIiilIi(Illillllil climb, int fz, int base, int fy, illlIIIiIillIIIi fx) {
      long var12 = -5136562078917760050L;
      long var14 = 7449873117135891177L;
      HashSet var5 = new HashSet();
      if (IiIlliIliiIl(climb, fz, base, fy, 40, var5) >= 40) {
         return true;
      } else {
         for (long var7 : var5) {
            var12 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var7) << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var7) ^ var12) & -1L >>> 32;
            var14 ^= ((long)llIiIiililIiIiil.Illlllllilll(var7) << 32 ^ var14) & -1L << 32;
            if (IilliliilIIi(climb, (int)(var12 >>> 32), (int)var12 + 2, (int)(var14 >>> 32))
               && IilliliilIIi(climb, (int)(var12 >>> 32), (int)var12 + 3, (int)(var14 >>> 32))
               && fx.allowed((int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32))) {
               return true;
            }
         }

         return false;
      }
   }

   public static Illillllil iIlIlllllill(Illillllil base, int tz, int placedFloor, int tx, boolean ty) {
      return new Illillllil() {
         @Override
         public boolean liiiIIllIl(int z, int x, int y) {
            return (z != tz || x != placedFloor || y != tx) && base.liiiIIllIl(z, x, y);
         }

         @Override
         public boolean IilliliilIIi(int y, int x, int z) {
            return (y != tz || x != placedFloor || z != tx) && base.IilliliilIIi(y, x, z);
         }

         @Override
         public boolean solid(int y, int x, int z) {
            return y == tz && x == placedFloor && z == tx || base.solid(y, x, z);
         }

         @Override
         public boolean IliIlllilIi(int z, int x, int y) {
            return z == tz && x == placedFloor && y == tx ? ty : base.IliIlllilIi(z, x, y);
         }
      };
   }

   public static boolean IIIilIIiiIIi(Illillllil toY, int toZ, int base, int toX, int climb, int fromY, int fromX, illlIIIiIillIIIi fromZ) {
      long var16 = 6036234736803984288L;
      long var18 = 6035370367549081529L;
      if (fromY >= base) {
         return false;
      } else {
         HashSet var8 = new HashSet();
         var16 ^= ((long)IiIlliIliiIl(toY, climb, fromY, fromX, 160, var8) << 32 ^ var16) & -1L << 32;
         if ((int)(var16 >>> 32) != 0 && (int)(var16 >>> 32) < 160 && !var8.contains(Illlllllilll(toZ, base, toX))) {
            for (long var11 : var8) {
               var16 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var11) ^ var16) & -1L >>> 32;
               var18 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var11) << 32 ^ var18) & -1L << 32;
               var18 ^= ((long)llIiIiililIiIiil.Illlllllilll(var11) ^ var18) & -1L >>> 32;
               if (IilliliilIIi(toY, (int)var16, (int)(var18 >>> 32) + 2, (int)var18)
                  && IilliliilIIi(toY, (int)var16, (int)(var18 >>> 32) + 3, (int)var18)
                  && fromZ.allowed((int)var16, (int)(var18 >>> 32), (int)var18)) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
