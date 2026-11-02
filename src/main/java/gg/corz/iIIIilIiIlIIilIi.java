package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.ToIntFunction;

public final class iIIIilIiIlIIilIi {
   public static boolean IlIlllIlilIl(int carried, int stackCount, int want) {
      return stackCount - want >= Math.max(0, carried);
   }

   private static <K> boolean lIiiIiIlilli(IliIlllllliIllll<K> load, iiIIIIlIIlIIIl<K> budget, Map<K, Integer> carried, int layer, ToIntFunction<K> maxStack) {
      long var9 = 4851370013565557945L;
      HashMap var5 = new HashMap<>(load.IlIlilIill);

      for (Entry var7 : budget.lIlIiIiIliIlIiIiIl.entrySet()) {
         if ((Integer)var7.getValue() > 0) {
            var5.merge(var7.getKey(), (Integer)var7.getValue(), Integer::sum);
         }
      }

      var9 ^= (0L ^ var9) & -1L << 32;

      for (Entry var8 : var5.entrySet()) {
         var9 ^= (
               (long)((int)(var9 >>> 32) + liiiIIllIl((Integer)var8.getValue(), IiIlliIliiIl(carried, var8.getKey()), maxStack.applyAsInt(var8.getKey())))
                     << 32
                  ^ var9
            )
            & -1L << 32;
      }

      if ((int)(var9 >>> 32) > layer) {
         return false;
      } else {
         for (Entry var13 : budget.lIlIiIiIliIlIiIiIl.entrySet()) {
            if ((Integer)var13.getValue() > 0) {
               load.IlIlilIill.merge((K)var13.getKey(), (Integer)var13.getValue(), Integer::sum);
            }
         }

         load.llIlilIill = (int)(var9 >>> 32);
         return true;
      }
   }

   private iIIIilIiIlIIilIi() {
   }

   public static <K> int iIlIlllllill(Map<K, Integer> maxStack, ToIntFunction<K> counts) {
      long var5 = 7530342373316173196L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for (Entry var4 : maxStack.entrySet()) {
         var5 ^= ((long)((int)(var5 >>> 32) + IliIlllilIi((Integer)var4.getValue(), counts.applyAsInt(var4.getKey()))) << 32 ^ var5) & -1L << 32;
      }

      return (int)(var5 >>> 32);
   }

   public static <K> IliIlllllliIllll<K> IilliliilIIi(
      List<iiIIIIlIIlIIIl<K>> layers, Map<K, Integer> maxStack, int freeSlots, ToIntFunction<K> reserve, Map<K, Integer> carried
   ) {
      long var13 = -7210923843137062152L;
      IliIlllllliIllll var5 = new IliIlllllliIllll();
      ArrayList var6 = new ArrayList(layers);
      var6.sort(Comparator.comparingInt(iiIIIIlIIlIIIl::liiiIIllIl));

      for (iiIIIIlIIlIIIl var8 : var6) {
         var5.liIlilIill = var5.liIlilIill + var8.IliIlllilIi();
      }

      var13 ^= ((long)Math.max(0, freeSlots) << 32 ^ var13) & -1L << 32;
      if (carried != null) {
         for (Entry var9 : carried.entrySet()) {
            iliIiiliiiii(var5, var9.getKey(), (Integer)var9.getValue(), maxStack, (int)(var13 >>> 32), reserve);
         }
      }

      for (iiIIIIlIIlIIIl var17 : var6) {
         if (var17.IliIlllilIi() == 0) {
            var5.ilIlilIill++;
         } else {
            if (!lIiiIiIlilli(var5, var17, maxStack, (int)(var13 >>> 32), reserve)) {
               ArrayList var10 = new ArrayList<>(var17.lIlIiIiIliIlIiIiIl.entrySet());
               var10.sort((a, b) -> {
                  long var3 = -2884354493802828416L;
                  var3 ^= ((long)Integer.compare((Integer)b.getValue(), (Integer)a.getValue()) << 32 ^ var3) & -1L << 32;
                  return (int)(var3 >>> 32) != 0 ? (int)(var3 >>> 32) : String.valueOf(a.getKey()).compareTo(String.valueOf(b.getKey()));
               });

               for (Entry var12 : var10) {
                  var5.IiIlilIill = var5.IiIlilIill + iliIiiliiiii(var5, var12.getKey(), (Integer)var12.getValue(), maxStack, (int)(var13 >>> 32), reserve);
               }
               break;
            }

            var5.ilIlilIill++;
            var5.IiIlilIill = var5.IiIlilIill + var17.IliIlllilIi();
         }
      }

      return var5;
   }

   public static int liiiIIllIl(int want, int carried, int maxStack) {
      return IliIlllilIi(Math.max(0, want - Math.max(0, carried)), maxStack);
   }

   public static int IliIlllilIi(int count, int maxStack) {
      long var3 = 7147571151930501499L;
      if (count <= 0) {
         return 0;
      } else {
         var3 ^= ((long)Math.max(1, maxStack) << 32 ^ var3) & -1L << 32;
         return (count + (int)(var3 >>> 32) - 1) / (int)(var3 >>> 32);
      }
   }

   private static <K> int IiIlliIliiIl(Map<K, Integer> k, K m) {
      if (k == null) {
         return 0;
      } else {
         Integer var2 = (Integer)k.get(m);
         return var2 == null ? 0 : Math.max(0, var2);
      }
   }

   public static <K> LinkedHashMap<K, Integer> IIIllIIliIIl(List<iiIIIIlIIlIIIl<K>> layers, Map<K, Integer> stocked, Map<K, Integer> missing) {
      long var9 = -832180585446014201L;
      HashMap var3 = new HashMap();

      for (iiIIIIlIIlIIIl var5 : layers) {
         for (Entry var7 : var5.lIlIiIiIliIlIiIiIl.entrySet()) {
            if ((Integer)var7.getValue() > 0) {
               var3.merge(var7.getKey(), var5.liiiIIllIl(), Math::min);
            }
         }
      }

      ArrayList var11 = new ArrayList(stocked.keySet());
      var11.sort((a, b) -> {
         long var5x = 4982086238897033438L;
         var5x ^= ((long)Integer.compare(var3.getOrDefault(a, Integer.MAX_VALUE), var3.getOrDefault(b, Integer.MAX_VALUE)) << 32 ^ var5x) & -1L << 32;
         if ((int)(var5x >>> 32) != 0) {
            return (int)(var5x >>> 32);
         } else {
            var5x ^= ((long)Integer.compare(IiIlliIliiIl(stocked, b), IiIlliIliiIl(stocked, a)) << 32 ^ var5x) & -1L << 32;
            return (int)(var5x >>> 32) != 0 ? (int)(var5x >>> 32) : String.valueOf(a).compareTo(String.valueOf(b));
         }
      });
      LinkedHashMap var12 = new LinkedHashMap();

      for (Object var14 : var11) {
         var9 ^= ((long)Math.max(0, IiIlliIliiIl(stocked, var14) - IiIlliIliiIl(missing, var14)) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) > 0) {
            var12.put(var14, Integer.valueOf((int)(var9 >>> 32)));
         }
      }

      return var12;
   }

   private static <K> int iliIiiliiiii(IliIlllllliIllll<K> count, K carried, int k, Map<K, Integer> maxStack, int load, ToIntFunction<K> budget) {
      long var16 = -7977154730463019371L;
      long var18 = 8834469583389054750L;
      long var20 = 7190244509235132570L;
      long var14 = 6078239114575738830L;
      if (k <= 0) {
         return 0;
      } else {
         var14 ^= ((long)count.IlIlilIill.getOrDefault(carried, 0).intValue() << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)IiIlliIliiIl(maxStack, carried) ^ var14) & -1L >>> 32;
         var16 ^= ((long)Math.max(1, budget.applyAsInt(carried)) << 32 ^ var16) & -1L << 32;
         var16 ^= ((long)liiiIIllIl((int)(var14 >>> 32), (int)var14, (int)(var16 >>> 32)) ^ var16) & -1L >>> 32;
         var18 ^= ((long)Math.max(0, load - (count.llIlilIill - (int)var16)) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)((int)var14 + (int)(var18 >>> 32) * (int)(var16 >>> 32)) ^ var18) & -1L >>> 32;
         var20 ^= ((long)Math.min((int)(var14 >>> 32) + k, (int)var18) << 32 ^ var20) & -1L << 32;
         var20 ^= ((long)((int)(var20 >>> 32) - (int)(var14 >>> 32)) ^ var20) & -1L >>> 32;
         if ((int)var20 <= 0) {
            return 0;
         } else {
            count.IlIlilIill.put((K)carried, Integer.valueOf((int)(var20 >>> 32)));
            count.llIlilIill = count.llIlilIill + (liiiIIllIl((int)(var20 >>> 32), (int)var14, (int)(var16 >>> 32)) - (int)var16);
            return (int)var20;
         }
      }
   }
}
