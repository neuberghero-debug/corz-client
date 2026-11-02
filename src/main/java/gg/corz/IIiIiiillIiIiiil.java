package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public final class IIiIiiillIiIiiil {
   public static final int liiIIlIiil = 2;

   public static int IiIlliIliiIl(int baseTicks, int emptyCycles, int maxTicks) {
      long var6 = 6076670880708129595L;
      var6 ^= ((long)Math.max(0, Math.min(baseTicks, 16)) << 32 ^ var6) & -1L << 32;
      long var4 = (long)Math.max(1, emptyCycles) << Math.max(0, (int)(var6 >>> 32) - 1);
      return (int)Math.min((long)Math.max(emptyCycles, maxTicks), (int)(var6 >>> 32) == 0 ? 0L : var4);
   }

   public static <K> int iliIiiliiiii(List<iiIIIIlIIlIIIl<K>> late, Map<K, Integer> maxStack, ToIntFunction<K> carried, Set<K> skip, Set<K> layers) {
      long var12 = -572955342938128169L;
      long var14 = -5083889101486872014L;
      if (late != null && skip != null && !skip.isEmpty()) {
         var12 ^= (9223372032559808512L ^ var12) & -1L << 32;
         var12 ^= (2147483647L ^ var12) & -1L >>> 32;
         HashMap var7 = new HashMap();

         for (iiIIIIlIIlIIIl var9 : late) {
            for (Entry var11 : var9.iIlIlllllill().entrySet()) {
               if (var11.getValue() != null && (Integer)var11.getValue() > 0 && (layers == null || !layers.contains(var11.getKey()))) {
                  if (var9.liiiIIllIl() < (int)var12) {
                     var12 ^= ((long)var9.liiiIIllIl() ^ var12) & -1L >>> 32;
                  }

                  if (skip.contains(var11.getKey())) {
                     if (var9.liiiIIllIl() < (int)(var12 >>> 32)) {
                        var12 ^= ((long)var9.liiiIIllIl() << 32 ^ var12) & -1L << 32;
                        var7.clear();
                     }

                     if (var9.liiiIIllIl() == (int)(var12 >>> 32)) {
                        var7.merge(var11.getKey(), (Integer)var11.getValue(), Integer::sum);
                     }
                  }
               }
            }
         }

         if ((int)(var12 >>> 32) != (int)var12) {
            return 0;
         } else {
            var14 ^= (0L ^ var14) & -1L << 32;

            for (Entry var17 : var7.entrySet()) {
               var14 ^= (
                     (long)(
                              (int)(var14 >>> 32)
                                 + IliIlllilIi(
                                    (Integer)var17.getValue(), IIlllIlliIll(maxStack, var17.getKey()), Math.max(1, carried.applyAsInt(var17.getKey()))
                                 )
                           )
                           << 32
                        ^ var14
                  )
                  & -1L << 32;
            }

            return (int)(var14 >>> 32);
         }
      } else {
         return 0;
      }
   }

   private static <K> Comparator<Entry<K, Integer>> lIiiIiIlilli() {
      return (a, b) -> {
         long var3 = -8114935195987392823L;
         var3 ^= ((long)Integer.compare(a.getValue(), b.getValue()) << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) != 0 ? (int)(var3 >>> 32) : String.valueOf(a.getKey()).compareTo(String.valueOf(b.getKey()));
      };
   }

   public static <K> IlIiIillIiIi<K> iIlIlllllill(
      List<iiIIIIlIIlIIIl<K>> late,
      Map<K, Integer> reserve,
      int layers,
      ToIntFunction<K> carried,
      Map<K, Integer> urgent,
      Set<K> skip,
      Set<K> maxStack,
      Map<K, Integer> freeSlots
   ) {
      long var33 = 6565243736158463885L;
      long var35 = -944536123903999178L;
      long var27 = 6198943915440814396L;
      long var29 = -3484604922257985838L;
      long var31 = -1109412135987352080L;
      IlIiIillIiIi var8 = new IlIiIillIiIi();
      lIlliIlliIlliIll var9 = new lIlliIlliIlliIll(reserve, Math.max(0, layers), carried);
      ArrayList var10 = new ArrayList();
      ArrayList var11 = new ArrayList();
      HashMap var12 = new HashMap();
      if (late != null) {
         ArrayList var13 = new ArrayList(late);
         var13.sort(Comparator.comparingInt(iiIIIIlIIlIIIl::liiiIIllIl));

         for (iiIIIIlIIlIIIl var15 : var13) {
            LinkedHashMap var16 = new LinkedHashMap();
            LinkedHashMap var17 = new LinkedHashMap();

            for (Entry var19 : var15.iIlIlllllill().entrySet()) {
               if (var19.getValue() != null && (Integer)var19.getValue() > 0) {
                  Object var20 = var19.getKey();
                  if (skip == null || !skip.contains(var20)) {
                     var12.merge(var20, (Integer)var19.getValue(), Integer::sum);
                     if (maxStack != null && maxStack.contains(var20)) {
                        var17.put(var20, (Integer)var19.getValue());
                     } else {
                        var16.put(var20, (Integer)var19.getValue());
                     }
                  } else if (!var8.iilliIIIlIIiliIIIl.contains(var20)) {
                     var8.iilliIIIlIIiliIIIl.add((K)var20);
                  }
               }
            }

            if (!var16.isEmpty()) {
               var10.add(new iiIIIIlIIlIIIl<>(var15.liiiIIllIl(), var16));
            }

            if (!var17.isEmpty()) {
               var11.add(new iiIIIIlIIlIIIl<>(var15.liiiIIllIl(), var17));
            }

            if (!var16.isEmpty() || !var17.isEmpty()) {
               var8.liiliIIIliiiliIIIl++;
            }
         }
      }

      for (iiIIIIlIIlIIIl var40 : var10) {
         var8.iIIiiIIIlIlIiiIIIl = var8.iIIiiIIIlIlIiiIIIl + var40.IliIlllilIi();
      }

      for (iiIIIIlIIlIIIl var41 : var11) {
         var8.iIIiiIIIlIlIiiIIIl = var8.iIIiiIIIlIlIiiIIIl + var41.IliIlllilIi();
      }

      HashMap var39 = new HashMap();
      if (freeSlots != null) {
         ArrayList var42 = new ArrayList();

         for (Entry var47 : freeSlots.entrySet()) {
            if (var47.getValue() != null && (Integer)var47.getValue() > 0 && (skip == null || !skip.contains(var47.getKey()))) {
               var42.add(var47);
            }
         }

         var42.sort(lIiiIiIlilli());

         for (Entry var48 : var42) {
            var27 ^= ((long)var9.IilliliilIIi(var48.getKey(), (Integer)var48.getValue()) << 32 ^ var27) & -1L << 32;
            if ((int)(var27 >>> 32) > 0) {
               var39.merge(var48.getKey(), (int)(var27 >>> 32), Integer::sum);
            }
         }
      }

      HashMap var43 = new HashMap();
      if (urgent != null) {
         for (Entry var49 : urgent.entrySet()) {
            if (var49.getValue() != null && (Integer)var49.getValue() > 0 && (skip == null || !skip.contains(var49.getKey()))) {
               var27 ^= ((long)var9.IilliliilIIi(var49.getKey(), (Integer)var49.getValue()) << 32 ^ var27) & -1L << 32;
               if ((int)(var27 >>> 32) > 0) {
                  var43.merge(var49.getKey(), (int)(var27 >>> 32), Integer::sum);
               }
            }
         }
      }

      var27 ^= (0L ^ var27) & -1L >>> 32;
      var29 ^= (Long.MIN_VALUE ^ var29) & -1L << 32;

      for (long var74 = var27 ^ (0L ^ var27) & -1L << 32; (int)(var74 >>> 32) < 2 && (int)var74 == 0; var74 += 4294967296L) {
         for (iiIIIIlIIlIIIl var58 : (int)(var74 >>> 32) == 0 ? var10 : var11) {
            if ((int)(var74 >>> 32) == 0) {
               var29 ^= ((long)var58.liiiIIllIl() << 32 ^ var29) & -1L << 32;
            }

            LinkedHashMap var64 = new LinkedHashMap();

            for (Entry var22 : var58.iIlIlllllill().entrySet()) {
               var29 ^= ((long)((Integer)var22.getValue()).intValue() ^ var29) & -1L >>> 32;
               Integer var24 = (Integer)var39.get(var22.getKey());
               if (var24 != null && var24 > 0) {
                  var31 ^= ((long)Math.min(var24, (int)var29) << 32 ^ var31) & -1L << 32;
                  var29 ^= ((long)((int)var29 - (int)(var31 >>> 32)) ^ var29) & -1L >>> 32;
                  var39.put(var22.getKey(), var24 - (int)(var31 >>> 32));
               }

               if ((int)var29 > 0) {
                  var64.put(var22.getKey(), Integer.valueOf((int)var29));
               }
            }

            if (!var64.isEmpty()) {
               if (!var9.liiiIIllIl(var64)) {
                  ArrayList var68 = new ArrayList(var64.entrySet());
                  var68.sort(lIiiIiIlilli());

                  for (Entry var23 : var68) {
                     var9.IilliliilIIi(var23.getKey(), (Integer)var23.getValue());
                  }

                  var74 ^= (1L ^ var74) & -1L >>> 32;
                  break;
               }

               var9.iIlIlllllill(var64);
            }
         }
      }

      var8.lllliIIIlillliIIIl.putAll(var9.liIIIiilll);

      for (Entry var54 : var8.lllliIIIlillliIIIl.entrySet()) {
         Object var59 = var54.getKey();
         var31 ^= ((long)IIlllIlliIll(reserve, var59) ^ var31) & -1L >>> 32;
         if ((Integer)var54.getValue() > (int)var31) {
            var33 ^= ((long)(var12.getOrDefault(var59, 0) + var43.getOrDefault(var59, 0)) << 32 ^ var33) & -1L << 32;
            if ((int)(var33 >>> 32) > (Integer)var54.getValue()) {
               var33 ^= ((long)Math.max(1, carried.applyAsInt(var59)) ^ var33) & -1L >>> 32;
               var29 ^= (
                     (long)(
                           Math.max(iIIIilIiIlIIilIi.IliIlllilIi((Integer)var54.getValue(), (int)var33), iIIIilIiIlIIilIi.IliIlllilIi((int)var31, (int)var33))
                              * (int)var33
                        )
                        ^ var29
                  )
                  & -1L >>> 32;
               if ((int)var29 > (Integer)var54.getValue()) {
                  var54.setValue(Math.min((int)(var33 >>> 32), (int)var29));
               }
            }
         }
      }

      for (Entry var55 : var8.lllliIIIlillliIIIl.entrySet()) {
         Object var60 = var55.getKey();
         var31 ^= ((long)IIlllIlliIll(reserve, var60) ^ var31) & -1L >>> 32;
         var33 ^= ((long)(var55.getValue() - (int)var31) << 32 ^ var33) & -1L << 32;
         if ((int)(var33 >>> 32) > 0) {
            var8.IilliIIIllilliIIIl.put((K)var60, Integer.valueOf((int)(var33 >>> 32)));
            var8.IiIiiIIIlliIiiIIIl += (int)(var33 >>> 32);
            var8.llIiiIIIlilIiiIIIl = var8.llIiiIIIlilIiiIIIl + IliIlllilIi((Integer)var55.getValue(), (int)var31, Math.max(1, carried.applyAsInt(var60)));
         }
      }

      HashMap var52 = new HashMap<>(var8.lllliIIIlillliIIIl);

      for (Entry var61 : var43.entrySet()) {
         var52.merge(var61.getKey(), -(Integer)var61.getValue(), Integer::sum);
      }

      HashMap var57 = new HashMap();

      for (iiIIIIlIIlIIIl var65 : var10) {
         var57.merge(var65.liiiIIllIl(), var65.IliIlllilIi(), Integer::sum);
      }

      for (iiIIIIlIIlIIIl var66 : var11) {
         var57.merge(var66.liiiIIllIl(), var66.IliIlllilIi(), Integer::sum);
      }

      for (long var76 = var35 ^ (0L ^ var35) & -1L << 32; (int)(var76 >>> 32) < 2; var76 += 4294967296L) {
         for (iiIIIIlIIlIIIl var69 : (int)(var76 >>> 32) == 0 ? var10 : var11) {
            var33 ^= (0L ^ var33) & -1L >>> 32;

            for (Entry var72 : var69.iIlIlllllill().entrySet()) {
               var31 ^= ((long)Math.max(0, var52.getOrDefault(var72.getKey(), 0)) << 32 ^ var31) & -1L << 32;
               var76 ^= ((long)Math.min((int)(var31 >>> 32), (Integer)var72.getValue()) ^ var76) & -1L >>> 32;
               if ((int)var76 > 0) {
                  var52.put(var72.getKey(), (int)(var31 >>> 32) - (int)var76);
                  var33 ^= ((long)((int)var33 + (int)var76) ^ var33) & -1L >>> 32;
               }
            }

            if ((int)var33 > 0) {
               var8.IIIiiIIIllIIiiIIIl += (int)var33;
               if (var57.merge(var69.liiiIIllIl(), -((int)var33), Integer::sum) == 0) {
                  var8.ililiIIIlIiiliIIIl++;
               }

               if ((int)(var76 >>> 32) == 1) {
                  var8.iiIiiIIIlIIliiIIIl = true;
               } else if (var69.liiiIIllIl() <= (int)(var29 >>> 32)) {
                  var8.lIiliIIIliIiliIIIl = Math.min(var8.lIiliIIIliIiliIIIl, var69.liiiIIllIl());
                  var8.IliliIIIllliliIIIl = Math.max(var8.IliliIIIllliliIIIl, var69.liiiIIllIl());
               }
            }
         }
      }

      return var8;
   }

   public static <K> LinkedHashMap<K, Integer> IIIllIIliIIl(List<iiIIIIlIIlIIIl<K>> layers, Map<K, Integer> carried, Set<K> late, int depth) {
      long var16 = 1426079739972728142L;
      long var14 = 1957859479164392911L;
      LinkedHashMap var4 = new LinkedHashMap();
      if (layers == null) {
         return var4;
      } else {
         ArrayList var5 = new ArrayList(layers);
         var5.sort(Comparator.comparingInt(iiIIIIlIIlIIIl::liiiIIllIl));
         var14 ^= (4294967296L ^ var14) & -1L << 32;

         for (iiIIIIlIIlIIIl var8 : var5) {
            for (Entry var10 : var8.iIlIlllllill().entrySet()) {
               if (var10.getValue() != null && (Integer)var10.getValue() > 0 && (late == null || !late.contains(var10.getKey()))) {
                  var14 ^= (0L ^ var14) & -1L << 32;
               }
            }
         }

         var14 ^= (0L ^ var14) & -1L >>> 32;

         for (iiIIIIlIIlIIIl var19 : var5) {
            var16 ^= (0L ^ var16) & -1L << 32;

            for (Entry var12 : var19.iIlIlllllill().entrySet()) {
               if (var12.getValue() != null && (Integer)var12.getValue() > 0) {
                  Object var13 = var12.getKey();
                  if ((int)(var14 >>> 32) != 0 || late == null || !late.contains(var13)) {
                     var16 ^= (4294967296L ^ var16) & -1L << 32;
                     if (IIlllIlliIll(carried, var13) <= 0) {
                        var4.merge(var13, (Integer)var12.getValue(), Integer::sum);
                     }
                  }
               }
            }

            if ((int)(var16 >>> 32) != 0) {
               var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32;
               if ((int)var14 >= Math.max(1, depth)) {
                  break;
               }
            }
         }

         return var4;
      }
   }

   private static <K> int IIlllIlliIll(Map<K, Integer> k, K m) {
      if (k == null) {
         return 0;
      } else {
         Integer var2 = (Integer)k.get(m);
         return var2 == null ? 0 : Math.max(0, var2);
      }
   }

   private IIiIiiillIiIiiil() {
   }

   public static <K> IlIiIillIiIi<K> liiiIIllIl(
      List<iiIIIIlIIlIIIl<K>> skip, Map<K, Integer> reserve, int carried, ToIntFunction<K> late, Map<K, Integer> layers, Set<K> maxStack, Set<K> freeSlots
   ) {
      return iIlIlllllill(skip, reserve, carried, late, layers, maxStack, freeSlots, null);
   }

   public static <K> int IilliliilIIi(Map<K, Integer> maxStack, Map<K, Integer> carried, Map<K, Integer> skip, ToIntFunction<K> urgent, Set<K> reserve) {
      long var10 = 2837972135520067538L;
      HashMap var5 = new HashMap();

      for (var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < 2; var10 += 4294967296L) {
         Map var7 = (int)(var10 >>> 32) == 0 ? maxStack : carried;
         if (var7 != null) {
            for (Entry var9 : var7.entrySet()) {
               if (var9.getValue() != null && (Integer)var9.getValue() > 0 && (reserve == null || !reserve.contains(var9.getKey()))) {
                  var5.merge(var9.getKey(), (Integer)var9.getValue(), Integer::sum);
               }
            }
         }
      }

      var10 ^= (0L ^ var10) & -1L << 32;

      for (Entry var13 : var5.entrySet()) {
         var10 ^= (
               (long)(
                        (int)(var10 >>> 32)
                           + IliIlllilIi((Integer)var13.getValue(), IIlllIlliIll(skip, var13.getKey()), Math.max(1, urgent.applyAsInt(var13.getKey())))
                     )
                     << 32
                  ^ var10
            )
            & -1L << 32;
      }

      return (int)(var10 >>> 32);
   }

   public static int IliIlllilIi(int want, int maxStack, int carried) {
      return Math.max(0, iIIIilIiIlIIilIi.IliIlllilIi(want, carried) - iIIIilIiIlIIilIi.IliIlllilIi(Math.max(0, maxStack), carried));
   }

   public static int IlIlllIlilIl(int emptySlots, int margin) {
      long var4 = 171850230246449815L;
      var4 ^= ((long)Math.max(0, emptySlots) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)Math.max(0, margin) ^ var4) & -1L >>> 32;
      return (int)(var4 >>> 32) > (int)var4 ? (int)(var4 >>> 32) - (int)var4 : (int)(var4 >>> 32);
   }
}
