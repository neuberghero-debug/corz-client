package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.LongPredicate;

public final class IIlIlIlilIlIlIli {
   public static long lIiiIiIlilli(long cell) {
      return llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(cell), llIiIiililIiIiil.IIlllIlliIll(cell) + 1, llIiIiililIiIiil.Illlllllilll(cell));
   }

   public static boolean iIlIlllllill(long cell, LongPredicate solid) {
      return liiiIIllIl(cell, solid) == 0;
   }

   private IIlIlIlilIlIlIli() {
   }

   public static boolean IilliliilIIi(long solid, LongPredicate ownedTemp, LongPredicate cell) {
      long var9 = -3492332804384678713L;
      long[] var4 = IliIlllilIi(solid);
      var9 ^= ((long)var4.length << 32 ^ var9) & -1L << 32;

      for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         long var7 = var4[(int)var12];
         if (ownedTemp.test(var7) && cell.test(var7)) {
            return true;
         }
      }

      return false;
   }

   public static boolean Illlllllilll(int ownedTempRemaining) {
      return ownedTempRemaining == 0;
   }

   public static boolean IiIlliIliiIl(long cell, long feetCell) {
      long var7 = -7685919679644423979L;
      long var9 = -1833537272774776180L;
      var7 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(feetCell) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(feetCell) ^ var7) & -1L >>> 32;
      var9 ^= ((long)llIiIiililIiIiil.Illlllllilll(feetCell) << 32 ^ var9) & -1L << 32;
      return cell == feetCell
         || cell == llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7 - 1, (int)(var9 >>> 32))
         || cell == llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7 + 1, (int)(var9 >>> 32));
   }

   public static int liiiIIllIl(long solid, LongPredicate cell) {
      long var9 = -1355921155165147187L;
      long var11 = -258681314452442796L;
      var9 ^= (0L ^ var9) & -1L << 32;
      long[] var4 = IliIlllilIi(solid);
      var9 ^= ((long)var4.length ^ var9) & -1L >>> 32;

      for (long var15 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var15 >>> 32) < (int)var9; var15 += 4294967296L) {
         long var7 = var4[(int)(var15 >>> 32)];
         if (!cell.test(var7)) {
            var9 += 4294967296L;
         }
      }

      return (int)(var9 >>> 32);
   }

   public static List<Long> IlIlllIlilIl(Iterable<Long> solid, LongPredicate ownedTemp, LongPredicate owned) {
      long var13 = 3767194577432634523L;
      long var15 = -8087024011428408672L;
      LinkedHashSet var3 = new LinkedHashSet();

      for (long var5 : solid) {
         var3.add(var5);
      }

      ArrayList var17 = new ArrayList(var3.size());

      while (!var3.isEmpty()) {
         Long var18 = null;
         var13 ^= (-4294967296L ^ var13) & -1L << 32;
         var13 ^= (-2147483648L ^ var13) & -1L >>> 32;

         for (long var9 : var3) {
            if (!var3.contains(lIiiIiIlilli(var9))) {
               var15 ^= ((long)liiiIIllIl(var9, ownedTemp) << 32 ^ var15) & -1L << 32;
               var15 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var9) ^ var15) & -1L >>> 32;
               if (var18 == null
                  || (int)(var15 >>> 32) > (int)(var13 >>> 32)
                  || (int)(var15 >>> 32) == (int)(var13 >>> 32) && (int)var15 > (int)var13
                  || (int)(var15 >>> 32) == (int)(var13 >>> 32) && (int)var15 == (int)var13 && var9 < var18) {
                  var18 = var9;
                  var13 ^= ((long)((int)(var15 >>> 32)) << 32 ^ var13) & -1L << 32;
                  var13 ^= ((long)((int)var15) ^ var13) & -1L >>> 32;
               }
            }
         }

         if (var18 == null) {
            for (long var20 : var3) {
               if (var18 == null || llIiIiililIiIiil.IIlllIlliIll(var20) > llIiIiililIiIiil.IIlllIlliIll(var18)) {
                  var18 = var20;
               }
            }
         }

         var17.add(var18);
         var3.remove(var18);
      }

      return var17;
   }

   public static boolean iliIiiliiiii(long ownedTemp, LongPredicate cell) {
      return cell.test(lIiiIiIlilli(ownedTemp));
   }

   public static lliIliiiliIlii IIlllIlliIll(long visibleFromHere, long breakPoseExists, boolean cell, boolean feetCell, boolean blockedByNeighbour) {
      if (IiIlliIliiIl(visibleFromHere, breakPoseExists)) {
         return lliIliiiliIlii.liIIIliIIl;
      } else if (cell) {
         return lliIliiiliIlii.llIIIliIIl;
      } else if (feetCell) {
         return lliIliiiliIlii.ilIIIliIIl;
      } else {
         return blockedByNeighbour ? lliIliiiliIlii.IiIIIliIIl : lliIliiiliIlii.iiIIIliIIl;
      }
   }

   public static long[] IliIlllilIi(long cell) {
      long var5 = 754239195996476181L;
      long var7 = -8635667728511993934L;
      var5 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(cell) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(cell) ^ var5) & -1L >>> 32;
      var7 ^= ((long)llIiIiililIiIiil.Illlllllilll(cell) << 32 ^ var7) & -1L << 32;
      return new long[]{
         llIiIiililIiIiil.IIIllIIliIIl((int)(var5 >>> 32) + 1, (int)var5, (int)(var7 >>> 32)),
         llIiIiililIiIiil.IIIllIIliIIl((int)(var5 >>> 32) - 1, (int)var5, (int)(var7 >>> 32)),
         llIiIiililIiIiil.IIIllIIliIIl((int)(var5 >>> 32), (int)var5 + 1, (int)(var7 >>> 32)),
         llIiIiililIiIiil.IIIllIIliIIl((int)(var5 >>> 32), (int)var5 - 1, (int)(var7 >>> 32)),
         llIiIiililIiIiil.IIIllIIliIIl((int)(var5 >>> 32), (int)var5, (int)(var7 >>> 32) + 1),
         llIiIiililIiIiil.IIIllIIliIIl((int)(var5 >>> 32), (int)var5, (int)(var7 >>> 32) - 1)
      };
   }

   public static List<Long> IIIllIIliIIl(Iterable<Long> owned, LongPredicate solid) {
      HashSet var2 = new HashSet();

      for (long var4 : owned) {
         var2.add(var4);
      }

      return IlIlllIlilIl(owned, solid, var2::contains);
   }
}
