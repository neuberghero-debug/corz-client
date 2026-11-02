package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class IiIIiilliIIiil {
   public static final int IlliIiIlillliIiIli = 0;
   private static final int[] iilIliIliIIiIliIli = new int[]{-1, 1, 0, 0};
   private static final int iIlIliIliIllIliIli = 3;
   public static final int lliiIiIliiliiIiIli = 5;
   public static final int IiiiIiIliliiiIiIli = -1;
   private static final int[] IilIliIlililIliIli = new int[]{0, 0, -1, 1};
   private static final int liIIliIliiiIIliIli = 1;
   private static final int IIlIliIlilIlIliIli = 2;
   private static final int lllIliIliillIliIli = -2;
   public static final int IIiiIiIlilIiiIiIli = 3;
   static final int lIIIliIliiIIIliIli = 8;
   public static final int liliIiIliiiliIiIli = 2;
   public static final int iIiiIiIliIliiIiIli = 4;
   static final int iiiiIiIliIIIIliIli = 1024;
   private static final int ilIIliIliIiIIliIli = 0;
   public static final int illiIiIliIiliIiIli = 1;
   private static final int[][] lIiIliIliiIiIliIli = new int[][]{{0, 1}, {2, 3}, {3, 1}, {2, 1}, {2, 0}, {3, 0}};
   static final int IlIIliIlillIIliIli = 3;

   private static int iliIiiliiiii(lIilIliIilIl r, boolean curveYawEastWest) {
      return r.iliIiiliiiii() != 0 && r.iliIiiliiiii() != 1 ? (curveYawEastWest ? 1 : 0) : r.iliIiiliiiii();
   }

   private static List<lIilIliIilIl> IlIlllIlilIl(List<lIilIliIilIl> base, Map<Long, lIilIliIilIl> at, List<lIilIliIilIl> comp) {
      long var9 = -1322649297944426920L;
      HashMap var3 = new HashMap();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList(comp);
      ArrayList var6 = new ArrayList(comp.size());

      while (!var5.isEmpty()) {
         var9 ^= (-4294967296L ^ var9) & -1L << 32;

         for (var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 < var5.size(); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            if (IiIlliIliiIl(var3, at, (lIilIliIilIl)var5.get((int)var9), var4)) {
               var9 ^= ((long)((int)var9) << 32 ^ var9) & -1L << 32;
               break;
            }
         }

         if ((int)(var9 >>> 32) < 0) {
            return null;
         }

         var6.add((lIilIliIilIl)var5.remove((int)(var9 >>> 32)));
      }

      return Iilllilliill(var3, base) ? var6 : null;
   }

   private IiIIiilliIIiil() {
   }

   private static int IIIilIIiiIIi(boolean n, boolean s, boolean cur, boolean curves, boolean we, int e) {
      long var7 = 4148799703381390299L;
      var7 ^= (-4294967296L ^ var7) & -1L << 32;
      if (s || cur) {
         var7 ^= (0L ^ var7) & -1L << 32;
      }

      if (curves || we) {
         var7 ^= (4294967296L ^ var7) & -1L << 32;
      }

      if (n) {
         if (cur && we && !s && !curves) {
            var7 ^= (8589934592L ^ var7) & -1L << 32;
         }

         if (cur && curves && !s && !we) {
            var7 ^= (12884901888L ^ var7) & -1L << 32;
         }

         if (s && curves && !cur && !we) {
            var7 ^= (17179869184L ^ var7) & -1L << 32;
         }

         if (s && we && !cur && !curves) {
            var7 ^= (21474836480L ^ var7) & -1L << 32;
         }
      }

      return (int)(var7 >>> 32) < 0 ? e : (int)(var7 >>> 32);
   }

   private static long IIlilIliiIli(int x, int z) {
      return (long)x << 32 | (long)z & 4294967295L;
   }

   public static Map<Long, long[]> liiiIIllIl(List<lIilIliIilIl> rails) {
      HashMap var1 = new HashMap();
      HashSet var2 = new HashSet();
      TreeMap var3 = new TreeMap();

      for (lIilIliIilIl var5 : rails) {
         var2.add(Illillliilli(var5.liiiIIllIl(), var5.iIlIlllllill(), var5.IilliliilIIi()));
         var3.computeIfAbsent(var5.iIlIlllllill(), k -> new ArrayList<>()).add(var5);
      }

      for (List var7 : var3.values()) {
         iIlIlllllill(var7, var2, var1);
      }

      return var1;
   }

   static Map<Long, Integer> lIiiIiIlilli(List<lIilIliIilIl> curveYawEastWest, boolean order) {
      HashMap var2 = new HashMap();

      for (lIilIliIilIl var4 : curveYawEastWest) {
         var2.put(IIlilIliiIli(var4.liiiIIllIl(), var4.IilliliilIIi()), var4);
      }

      HashMap var7 = new HashMap();

      for (lIilIliIilIl var5 : curveYawEastWest) {
         Iiilliiliiil(var7, var2, var5.liiiIIllIl(), var5.IilliliilIIi(), var5.lIiiIiIlilli(), iliIiiliiiii(var5, order), null);
      }

      HashMap var9 = new HashMap();

      for (lIilIliIilIl var6 : curveYawEastWest) {
         var9.put(var6.IliIlllilIi(), (Integer)var7.get(IIlilIliiIli(var6.liiiIIllIl(), var6.IilliliilIIi())));
      }

      return var9;
   }

   private static boolean Iilllilliill(Map<Long, Integer> w, List<lIilIliIilIl> comp) {
      for (lIilIliIilIl var3 : comp) {
         Integer var4 = (Integer)w.get(IIlilIliiIli(var3.liiiIIllIl(), var3.IilliliilIIi()));
         if (var4 == null || var4 != var3.iliIiiliiiii()) {
            return false;
         }
      }

      return true;
   }

   private static void iIlIlllllill(List<lIilIliIilIl> out, Set<Long> cells, Map<Long, long[]> level) {
      long var14 = -6317054893588809358L;
      LinkedHashMap var3 = new LinkedHashMap();

      for (lIilIliIilIl var5 : out) {
         var3.put(Long.valueOf(IIlilIliiIli(var5.liiiIIllIl(), var5.IilliliilIIi())), var5);
      }

      HashSet var16 = new HashSet();

      for (lIilIliIilIl var6 : out) {
         if (var16.add(IIlilIliiIli(var6.liiiIIllIl(), var6.IilliliilIIi()))) {
            ArrayList var7 = new ArrayList();
            ArrayList var8 = new ArrayList();
            var7.add(var6);
            var8.add(var6);

            while (!var8.isEmpty()) {
               lIilIliIilIl var9 = (lIilIliIilIl)var8.remove(var8.size() - 1);

               for (var14 ^= (0L ^ var14) & -1L << 32; (int)(var14 >>> 32) < 4; var14 += 4294967296L) {
                  long var11 = IIlilIliiIli(
                     var9.liiiIIllIl() + IilIliIlililIliIli[(int)(var14 >>> 32)], var9.IilliliilIIi() + iilIliIliIIiIliIli[(int)(var14 >>> 32)]
                  );
                  lIilIliIilIl var13 = (lIilIliIilIl)var3.get(var11);
                  if (var13 != null && var16.add(var11)) {
                     var7.add(var13);
                     var8.add(var13);
                  }
               }
            }

            IilliliilIIi(var7, var3, cells, level);
         }
      }
   }

   private static boolean Ililllililil(Map<Long, Integer> z, int d, int x, int w) {
      long var7 = -6753817278348843799L;
      long var9 = 2067487793677036754L;
      var7 ^= ((long)(d + IilIliIlililIliIli[w]) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)(x + iilIliIliIIiIliIli[w]) ^ var7) & -1L >>> 32;
      if (!z.containsKey(IIlilIliiIli((int)(var7 >>> 32), (int)var7))) {
         return false;
      } else {
         var9 ^= ((long)IIillIiliIil(z, (int)(var7 >>> 32), (int)var7) << 32 ^ var9) & -1L << 32;
         return ((int)(var9 >>> 32) & 1 << (w ^ 1)) != 0 || Integer.bitCount((int)(var9 >>> 32)) != 2;
      }
   }

   private static boolean IiIlliIliiIl(Map<Long, Integer> log, Map<Long, lIilIliIilIl> at, lIilIliIilIl r, List<long[]> w) {
      long var9 = -1635264071098634806L;
      long var11 = -2044424299703058303L;
      int[] var4 = r.iliIiiliiiii() != 0 && r.iliIiiliiiii() != 1 ? new int[]{0, 1} : new int[]{r.iliIiiliiiii()};
      int[] var5 = null;
      var9 ^= (0L ^ var9) & -1L << 32;

      while ((int)(var9 >>> 32) < var4.length) {
         Iiilliiliiil(log, at, r.liiiIIllIl(), r.IilliliilIIi(), r.lIiiIiIlilli(), var4[(int)(var9 >>> 32)], w);
         var9 ^= ((long)Illlllllilll(log, at, r.liiiIIllIl(), r.IilliliilIIi()) ^ var9) & -1L >>> 32;

         for (var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < 4; var11 += 4294967296L) {
            var9 ^= (
                  (long)(
                        (int)var9 != 0
                              && Illlllllilll(
                                 log, at, r.liiiIIllIl() + IilIliIlililIliIli[(int)(var11 >>> 32)], r.IilliliilIIi() + iilIliIliIIiIliIli[(int)(var11 >>> 32)]
                              )
                           ? 1
                           : 0
                     )
                     ^ var9
               )
               & -1L >>> 32;
         }

         int[] var8 = IIlllIlliIll(log, r);
         if ((int)var9 == 0 || var5 != null && !Arrays.equals(var8, var5)) {
            IlIillIiilIi(log, w);
            return false;
         }

         var5 = var8;
         if ((int)(var9 >>> 32) < var4.length - 1) {
            IlIillIiilIi(log, w);
         }

         var9 += 4294967296L;
      }

      w.clear();
      return true;
   }

   private static int IIillIiliIil(Map<Long, Integer> x, int w, int z) {
      long var10 = -796427547412323817L;
      long var12 = -1446273862510831981L;
      Integer var3 = (Integer)x.get(IIlilIliiIli(w, z));
      if (var3 == null) {
         return 0;
      } else {
         var10 ^= (0L ^ var10) & -1L << 32;
         int[] var5 = lIiIliIliiIiIliIli[var3];
         var10 ^= ((long)var5.length ^ var10) & -1L >>> 32;
         var12 ^= (0L ^ var12) & -1L << 32;

         while ((int)(var12 >>> 32) < (int)var10) {
            var12 ^= ((long)var5[(int)(var12 >>> 32)] ^ var12) & -1L >>> 32;
            Integer var9 = (Integer)x.get(IIlilIliiIli(w + IilIliIlililIliIli[(int)var12], z + iilIliIliIIiIliIli[(int)var12]));
            if (var9 != null && (lIiIliIliiIiIliIli[var9][0] == ((int)var12 ^ 1) || lIiIliIliiIiIliIli[var9][1] == ((int)var12 ^ 1))) {
               var10 ^= ((long)((int)(var10 >>> 32) | 1 << (int)var12) << 32 ^ var10) & -1L << 32;
            }

            var12 += 4294967296L;
         }

         return (int)(var10 >>> 32);
      }
   }

   private static int[] IIlllIlliIll(Map<Long, Integer> w, lIilIliIilIl r) {
      long var5 = 2461249959897114191L;
      int[] var2 = new int[5];
      var2[0] = IIillIiliIil(w, r.liiiIIllIl(), r.IilliliilIIi()) == 0 ? -2 : (Integer)w.get(IIlilIliiIli(r.liiiIIllIl(), r.IilliliilIIi()));

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 4; var7 += 4294967296L) {
         Integer var4 = (Integer)w.get(
            IIlilIliiIli(r.liiiIIllIl() + IilIliIlililIliIli[(int)(var7 >>> 32)], r.IilliliilIIi() + iilIliIliIIiIliIli[(int)(var7 >>> 32)])
         );
         var2[(int)(var7 >>> 32) + 1] = var4 == null ? -1 : var4;
      }

      return var2;
   }

   private static boolean IIIllIIliIIl(List<lIilIliIilIl> comp, List<lIilIliIilIl> at, Map<Long, lIilIliIilIl> order) {
      long var8 = 4060335013872222689L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for (lIilIliIilIl var5 : comp) {
         if (var5.iliIiiliiiii() != 0 && var5.iliIiiliiiii() != 1) {
            var8 ^= (4294967296L ^ var8) & -1L << 32;
         }
      }

      for (long var12 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var12 < ((int)(var12 >>> 32) != 0 ? 2 : 1); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         HashMap var10 = new HashMap();

         for (lIilIliIilIl var7 : at) {
            Iiilliiliiil(var10, order, var7.liiiIIllIl(), var7.IilliliilIIi(), var7.lIiiIiIlilli(), iliIiiliiiii(var7, (int)var12 == 1), null);
         }

         if (!Iilllilliill(var10, comp)) {
            return false;
         }
      }

      return true;
   }

   private static void IilliliilIIi(List<lIilIliIilIl> at, Map<Long, lIilIliIilIl> comp, Set<Long> out, Map<Long, long[]> cells) {
      long var19 = -7776309010003843379L;
      long var21 = 6233272634717327950L;
      long var23 = -7650071398433994287L;
      long var25 = 5430740103093995524L;
      if (at.size() >= 2 && at.size() <= 1024) {
         for (lIilIliIilIl var5 : at) {
            if (var5.iliIiiliiiii() < 0) {
               return;
            }

            var19 ^= (0L ^ var19) & -1L << 32;

            while ((int)(var19 >>> 32) < 4) {
               for (var19 ^= ~var19 & -1L >>> 32; (int)var19 <= 1; var19 ^= (var19 ^ var19 + (long)2) & -1L >>> 32) {
                  if (out.contains(
                     Illillliilli(
                        var5.liiiIIllIl() + IilIliIlililIliIli[(int)(var19 >>> 32)],
                        var5.iIlIlllllill() + (int)var19,
                        var5.IilliliilIIi() + iilIliIliIIiIliIli[(int)(var19 >>> 32)]
                     )
                  )) {
                     return;
                  }
               }

               var19 += 4294967296L;
            }
         }

         var21 ^= (0L ^ var21) & -1L << 32;

         for (lIilIliIilIl var6 : at) {
            if (var6.lIiiIiIlilli()) {
               var21 ^= (4294967296L ^ var21) & -1L << 32;
               break;
            }
         }

         if ((int)(var21 >>> 32) != 0) {
            ArrayList var28 = new ArrayList(at);
            ArrayList var29 = new ArrayList(at);
            var28.sort(
               (b, a) -> b.liiiIIllIl() != a.liiiIIllIl()
                     ? Integer.compare(b.liiiIIllIl(), a.liiiIIllIl())
                     : Integer.compare(b.IilliliilIIi(), a.IilliliilIIi())
            );
            var29.sort(
               (a, b) -> a.IilliliilIIi() != b.IilliliilIIi()
                     ? Integer.compare(a.IilliliilIIi(), b.IilliliilIIi())
                     : Integer.compare(a.liiiIIllIl(), b.liiiIIllIl())
            );
            ArrayList var7 = new ArrayList(var28);
            ArrayList var8 = new ArrayList(var29);
            Collections.reverse(var7);
            Collections.reverse(var8);
            ArrayList var9 = new ArrayList();
            var9.add(at);
            var9.add(var28);
            var9.add(var29);
            var9.add(var7);
            var9.add(var8);

            for (var21 ^= (1L ^ var21) & -1L >>> 32; (int)var21 <= 8; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
               var9.add(IiIiliIiiiIi(at, (int)var21 * 7919));
            }

            var21 ^= (0L ^ var21) & -1L >>> 32;

            for (List var12 : var9) {
               if (!IIIllIIliIIl(at, var12, comp)) {
                  var21 ^= (1L ^ var21) & -1L >>> 32;
                  break;
               }
            }

            if ((int)var21 != 0) {
               List var30 = null;

               for (List var13 : List.of(var28, var29, var7, var8)) {
                  var30 = IlIlllIlilIl(at, comp, var13);
                  if (var30 != null) {
                     break;
                  }
               }

               if (var30 != null) {
                  HashMap var32 = new HashMap();

                  for (var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < var30.size(); var23 += 4294967296L) {
                     var32.put(
                        IIlilIliiIli(((lIilIliIilIl)var30.get((int)(var23 >>> 32))).liiiIIllIl(), ((lIilIliIilIl)var30.get((int)(var23 >>> 32))).IilliliilIIi()),
                        (int)(var23 >>> 32)
                     );
                  }

                  var23 ^= (0L ^ var23) & -1L << 32;

                  while ((int)(var23 >>> 32) < var30.size()) {
                     lIilIliIilIl var14 = (lIilIliIilIl)var30.get((int)(var23 >>> 32));
                     ArrayList var15 = new ArrayList();

                     for (var23 ^= (-3L ^ var23) & -1L >>> 32; (int)var23 <= 3; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
                        for (var25 ^= (-12884901888L ^ var25) & -1L << 32; (int)(var25 >>> 32) <= 3; var25 += 4294967296L) {
                           if (Math.abs((int)var23) + Math.abs((int)(var25 >>> 32)) <= 3 && ((int)var23 != 0 || (int)(var25 >>> 32) != 0)) {
                              Integer var18 = (Integer)var32.get(IIlilIliiIli(var14.liiiIIllIl() + (int)var23, var14.IilliliilIIi() + (int)(var25 >>> 32)));
                              if (var18 != null && var18 < (int)(var23 >>> 32)) {
                                 var15.add(((lIilIliIilIl)var30.get(var18)).IliIlllilIi());
                              }
                           }
                        }
                     }

                     long[] var16 = new long[var15.size()];

                     for (var25 ^= (0L ^ var25) & -1L << 32; (int)(var25 >>> 32) < var16.length; var25 += 4294967296L) {
                        var16[(int)(var25 >>> 32)] = (Long)var15.get((int)(var25 >>> 32));
                     }

                     cells.put(var14.IliIlllilIi(), var16);
                     var23 += 4294967296L;
                  }
               }
            }
         }
      }
   }

   private static boolean Illlllllilll(Map<Long, Integer> z, Map<Long, lIilIliIilIl> x, int at, int w) {
      long var8 = -1539430716748026120L;
      lIilIliIilIl var4 = (lIilIliIilIl)x.get(IIlilIliiIli(at, w));
      Integer var5 = (Integer)z.get(IIlilIliiIli(at, w));
      if (var4 != null && var5 != null) {
         var8 ^= ((long)IIillIiliIil(z, at, w) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)(1 << lIiIliIliiIiIliIli[var4.iliIiiliiiii()][0] | 1 << lIiIliIliiIiIliIli[var4.iliIiiliiiii()][1]) ^ var8) & -1L >>> 32;
         return ((int)(var8 >>> 32) & ~((int)var8)) != 0 ? false : Integer.bitCount((int)(var8 >>> 32)) < 2 || var5 == var4.iliIiiliiiii();
      } else {
         return true;
      }
   }

   private static long Illillliilli(int x, int z, int y) {
      return (long)(x & 67108863) << 38 | (long)(y & 67108863) << 12 | (long)(z & 4095);
   }

   private static void IlIillIiilIi(Map<Long, Integer> w, List<long[]> log) {
      long var4 = -5634469525864718439L;

      for (long var6 = var4 ^ ((long)(log.size() - 1) << 32 ^ var4) & -1L << 32; (int)(var6 >>> 32) >= 0; var6 += -4294967296L) {
         long[] var3 = (long[])log.get((int)(var6 >>> 32));
         if (var3[1] == Long.MIN_VALUE) {
            w.remove(var3[0]);
         } else {
            w.put(var3[0], (int)var3[1]);
         }
      }

      log.clear();
   }

   private static List<lIilIliIilIl> IiIiliIiiiIi(List<lIilIliIilIl> seed, int comp) {
      long var7 = 2146185985455387781L;
      long var9 = 4956138790896262029L;
      ArrayList var2 = new ArrayList(seed);
      var7 ^= ((long)comp << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)(var2.size() - 1) ^ var7) & -1L >>> 32;

      while ((int)var7 > 0) {
         var7 ^= ((long)((int)(var7 >>> 32) * 1103515245 + 12345) << 32 ^ var7) & -1L << 32;
         var9 ^= ((long)((int)(((long)((int)(var7 >>> 32)) & 4294967295L) % (long)((int)var7 + 1))) << 32 ^ var9) & -1L << 32;
         lIilIliIilIl var6 = (lIilIliIilIl)var2.get((int)var7);
         var2.set((int)var7, (lIilIliIilIl)var2.get((int)(var9 >>> 32)));
         var2.set((int)(var9 >>> 32), var6);
         var7 ^= (var7 ^ var7 + (long)-1) & -1L >>> 32;
      }

      return var2;
   }

   private static void Iiilliiliiil(Map<Long, Integer> x, Map<Long, lIilIliIilIl> yaw, int at, int curves, boolean w, int log, List<long[]> z) {
      long var32 = 5795591909334740502L;
      long var34 = 7932918671206968697L;
      long var36 = -6914547501739632075L;
      long var38 = 8747510422324458846L;
      long var40 = -5707949710750127083L;
      long var42 = 4689272790762075780L;
      long var44 = -7935169426355441425L;
      long var30 = -8299900257257465497L;
      long var7 = IIlilIliiIli(at, curves);
      if (z != null) {
         z.add(new long[]{var7, x.containsKey(var7) ? (long)((Integer)x.get(var7)).intValue() : Long.MIN_VALUE});
      }

      x.put(var7, log);
      var30 ^= ((long)Ililllililil(x, at, curves, 0) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)Ililllililil(x, at, curves, 1) ^ var30) & -1L >>> 32;
      var32 ^= ((long)Ililllililil(x, at, curves, 2) << 32 ^ var32) & -1L << 32;
      var32 ^= ((long)Ililllililil(x, at, curves, 3) ^ var32) & -1L >>> 32;
      var34 ^= (-4294967296L ^ var34) & -1L << 32;
      var34 ^= ((long)((int)(var30 >>> 32) == 0 && (int)var30 == 0 ? 0 : 1) ^ var34) & -1L >>> 32;
      var36 ^= ((long)((int)(var32 >>> 32) == 0 && (int)var32 == 0 ? 0 : 1) << 32 ^ var36) & -1L << 32;
      if ((int)var34 != 0 && (int)(var36 >>> 32) == 0) {
         var34 ^= (0L ^ var34) & -1L << 32;
      }

      if ((int)(var36 >>> 32) != 0 && (int)var34 == 0) {
         var34 ^= (4294967296L ^ var34) & -1L << 32;
      }

      var36 ^= ((long)((int)var30 != 0 && (int)var32 != 0 ? 1 : 0) ^ var36) & -1L >>> 32;
      var38 ^= ((long)((int)var30 != 0 && (int)(var32 >>> 32) != 0 ? 1 : 0) << 32 ^ var38) & -1L << 32;
      var38 ^= ((long)((int)(var30 >>> 32) != 0 && (int)var32 != 0 ? 1 : 0) ^ var38) & -1L >>> 32;
      var40 ^= ((long)((int)(var30 >>> 32) != 0 && (int)(var32 >>> 32) != 0 ? 1 : 0) << 32 ^ var40) & -1L << 32;
      if (w) {
         if ((int)var36 != 0 && (int)(var30 >>> 32) == 0 && (int)(var32 >>> 32) == 0) {
            var34 ^= (8589934592L ^ var34) & -1L << 32;
         }

         if ((int)(var38 >>> 32) != 0 && (int)(var30 >>> 32) == 0 && (int)var32 == 0) {
            var34 ^= (12884901888L ^ var34) & -1L << 32;
         }

         if ((int)(var40 >>> 32) != 0 && (int)var30 == 0 && (int)var32 == 0) {
            var34 ^= (17179869184L ^ var34) & -1L << 32;
         }

         if ((int)var38 != 0 && (int)var30 == 0 && (int)(var32 >>> 32) == 0) {
            var34 ^= (21474836480L ^ var34) & -1L << 32;
         }
      }

      if ((int)(var34 >>> 32) < 0) {
         if ((int)var34 != 0 && (int)(var36 >>> 32) != 0) {
            var34 ^= ((long)log << 32 ^ var34) & -1L << 32;
         } else if ((int)var34 != 0) {
            var34 ^= (0L ^ var34) & -1L << 32;
         } else if ((int)(var36 >>> 32) != 0) {
            var34 ^= (4294967296L ^ var34) & -1L << 32;
         }

         if (w) {
            if ((int)(var40 >>> 32) != 0) {
               var34 ^= (17179869184L ^ var34) & -1L << 32;
            }

            if ((int)var38 != 0) {
               var34 ^= (21474836480L ^ var34) & -1L << 32;
            }

            if ((int)(var38 >>> 32) != 0) {
               var34 ^= (12884901888L ^ var34) & -1L << 32;
            }

            if ((int)var36 != 0) {
               var34 ^= (8589934592L ^ var34) & -1L << 32;
            }
         }
      }

      if ((int)(var34 >>> 32) < 0) {
         var34 ^= ((long)log << 32 ^ var34) & -1L << 32;
      }

      x.put(var7, (int)(var34 >>> 32));
      int[] var20 = lIiIliIliiIiIliIli[(int)(var34 >>> 32)];
      var40 ^= ((long)var20.length ^ var40) & -1L >>> 32;
      var42 ^= (0L ^ var42) & -1L << 32;

      while ((int)(var42 >>> 32) < (int)var40) {
         var42 ^= ((long)var20[(int)(var42 >>> 32)] ^ var42) & -1L >>> 32;
         long var24 = IIlilIliiIli(at + IilIliIlililIliIli[(int)var42], curves + iilIliIliIIiIliIli[(int)var42]);
         Integer var26 = (Integer)x.get(var24);
         if (var26 != null) {
            var44 ^= ((long)IIillIiliIil(x, at + IilIliIlililIliIli[(int)var42], curves + iilIliIliIIiIliIli[(int)var42]) << 32 ^ var44) & -1L << 32;
            if (((int)(var44 >>> 32) & 1 << ((int)var42 ^ 1)) != 0 || Integer.bitCount((int)(var44 >>> 32)) != 2) {
               var44 ^= ((long)((int)(var44 >>> 32) | 1 << ((int)var42 ^ 1)) << 32 ^ var44) & -1L << 32;
               lIilIliIilIl var28 = (lIilIliIilIl)yaw.get(var24);
               var44 ^= (
                     (long)IIIilIIiiIIi(
                           var28 != null && var28.lIiiIiIlilli(),
                           ((int)(var44 >>> 32) & 1) != 0,
                           ((int)(var44 >>> 32) & 2) != 0,
                           ((int)(var44 >>> 32) & 4) != 0,
                           ((int)(var44 >>> 32) & 8) != 0,
                           var26
                        )
                        ^ var44
                  )
                  & -1L >>> 32;
               if (z != null) {
                  z.add(new long[]{var24, (long)var26.intValue()});
               }

               x.put(var24, (int)var44);
            }
         }

         var42 += 4294967296L;
      }
   }

   public static int IliIlllilIi(String name) {
      long var3 = -8969246850417088700L;
      var3 ^= (-4294967296L ^ var3) & -1L << 32;
      switch (name.hashCode()) {
         case 617340435:
            if (name.equals(Iiiiliiiiiii<"Iiiiliiiiiii","7Yl0rPCQvcv4KbaTnyoSEQQKyB4/ponkaUKYiw+YwI3ivNHlNUvH">())) {
               var3 ^= (0L ^ var3) & -1L << 32;
            }
            break;
         case 801663791:
            if (name.equals(Iiiiliiiiiii<"Iiiiliiiiiii","aw4Y9HxhfB5YQTMYad0FsGVAJCw9HcDV0aSH1fNj+XAl7uK1DBg=">())) {
               var3 ^= (8589934592L ^ var3) & -1L << 32;
            }
            break;
         case 802203873:
            if (name.equals(Iiiiliiiiiii<"Iiiiliiiiiii","IvoHP/v8Y1/36k8115GsvAHur30lvlGSeXVIDPdGJjfxyvCB3nI=">())) {
               var3 ^= (12884901888L ^ var3) & -1L << 32;
            }
            break;
         case 850767607:
            if (name.equals(Iiiiliiiiiii<"Iiiiliiiiiii","rOI94UJBhPOfFamCN9iT5hAct1PGvTYR0URk7qE/1t+GigJiNDM=">())) {
               var3 ^= (21474836480L ^ var3) & -1L << 32;
            }
            break;
         case 851307689:
            if (name.equals(Iiiiliiiiiii<"Iiiiliiiiiii","a59132tzXh+AQ0vYUwNniVkYkMooy0WqaLB2vSWz7gIZ5Cq9B8M=">())) {
               var3 ^= (17179869184L ^ var3) & -1L << 32;
            }
            break;
         case 1780673713:
            if (name.equals(Iiiiliiiiiii<"Iiiiliiiiiii","uoC3pvvXLOeez78lsi6jwVIObbdCjxqeYscRGiCjLr0wbsOeUg==">())) {
               var3 ^= (4294967296L ^ var3) & -1L << 32;
            }
      }
      return switch ((int)(var3 >>> 32)) {
         case 0 -> 0;
         case 1 -> 1;
         case 2 -> 2;
         case 3 -> 3;
         case 4 -> 4;
         case 5 -> 5;
         default -> -1;
      };
   }
}
