package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class iIIIlillIlIIlill {
   public static final int IIIIiilill = 12;
   public static final int iIIIiilill = 8;
   public static final int lIIIiilill = 12;

   public static int liiiIIllIl(List<ilIlIIilIiIlIIil> cells) {
      ArrayList var1 = new ArrayList();

      for (ilIlIIilIiIlIIil var3 : cells) {
         if (var3.IiIiIlIIil == lIlliIIiiIlliIIi.lliilliiil) {
            var1.add(var3);
         }
      }

      return iIlIlllllill(var1) + IilliliilIIi(var1) + iliIiiliiiii(cells);
   }

   public static int IilliliilIIi(List<ilIlIIilIiIlIIil> crafted) {
      long var5 = 2138488689338957749L;
      if (crafted.size() < 3) {
         return 0;
      } else {
         HashSet var1 = new HashSet();

         for (ilIlIIilIiIlIIil var3 : crafted) {
            var1.add(IIIllIIliIIl(var3.IlIiIlIIil, var3.llIiIlIIil, var3.ilIiIlIIil));
         }

         var5 ^= (0L ^ var5) & -1L << 32;

         for (ilIlIIilIiIlIIil var4 : crafted) {
            var5 ^= ((long)((int)(var5 >>> 32) + lIiiIiIlilli(var1, var4.IlIiIlIIil, var4.llIiIlIIil, var4.ilIiIlIIil, 1, 0, 0)) << 32 ^ var5) & -1L << 32;
            var5 ^= ((long)((int)(var5 >>> 32) + lIiiIiIlilli(var1, var4.IlIiIlIIil, var4.llIiIlIIil, var4.ilIiIlIIil, 0, 1, 0)) << 32 ^ var5) & -1L << 32;
            var5 ^= ((long)((int)(var5 >>> 32) + lIiiIiIlilli(var1, var4.IlIiIlIIil, var4.llIiIlIIil, var4.ilIiIlIIil, 0, 0, 1)) << 32 ^ var5) & -1L << 32;
         }

         return Math.min((int)(var5 >>> 32) * 3, 12);
      }
   }

   public static int IliIlllilIi(lIiiIIIiiIiiIIIi e) {
      return liiiIIllIl(e.IIIllIIliIIl());
   }

   public static int iliIiiliiiii(List<ilIlIIilIiIlIIil> cells) {
      long var7 = -1200380712804940684L;
      long var9 = 953174306780927872L;
      int[] var1 = new int[6];

      for (ilIlIIilIiIlIIil var3 : cells) {
         if (var3.iiIiIlIIil >= 0 && var3.iiIiIlIIil < 6) {
            var1[var3.iiIiIlIIil]++;
         }
      }

      var7 ^= (0L ^ var7) & -1L << 32;
      int[] var11 = var1;
      var7 ^= ((long)var1.length ^ var7) & -1L >>> 32;
      var9 ^= (0L ^ var9) & -1L << 32;

      while ((int)(var9 >>> 32) < (int)var7) {
         var9 ^= ((long)var11[(int)(var9 >>> 32)] ^ var9) & -1L >>> 32;
         if ((int)var9 > (int)(var7 >>> 32)) {
            var7 ^= ((long)((int)var9) << 32 ^ var7) & -1L << 32;
         }

         var9 += 4294967296L;
      }

      return (int)(var7 >>> 32) >= 3 ? Math.min((int)(var7 >>> 32), 8) : 0;
   }

   public static int iIlIlllllill(List<ilIlIIilIiIlIIil> crafted) {
      long var6 = 1468209665984893498L;
      if (crafted.size() < 6) {
         return 0;
      } else {
         HashMap var1 = new HashMap();
         var6 ^= (0L ^ var6) & -1L << 32;

         for (ilIlIIilIiIlIIil var4 : crafted) {
            var6 ^= ((long)var1.merge(var4.llIiIlIIil, 1, Integer::sum).intValue() ^ var6) & -1L >>> 32;
            if ((int)var6 > (int)(var6 >>> 32)) {
               var6 ^= ((long)((int)var6) << 32 ^ var6) & -1L << 32;
            }
         }

         return (int)(var6 >>> 32) >= 6 ? Math.min((int)(var6 >>> 32), 12) : 0;
      }
   }

   private iIIIlillIlIIlill() {
   }

   private static long IIIllIIliIIl(int x, int z, int y) {
      return (long)x & 67108863L | ((long)y & 67108863L) << 26 | (long)(z & 4095) << 52;
   }

   private static int lIiiIiIlilli(Set<Long> y, int x, int dy, int z, int dx, int set, int dz) {
      long var8 = 7510192352091170510L;
      if (y.contains(IIIllIIliIIl(x - dx, dy - set, z - dz))) {
         return 0;
      } else {
         var8 ^= (4294967296L ^ var8) & -1L << 32;

         while (y.contains(IIIllIIliIIl(x + dx * (int)(var8 >>> 32), dy + set * (int)(var8 >>> 32), z + dz * (int)(var8 >>> 32)))) {
            var8 += 4294967296L;
         }

         return (int)(var8 >>> 32) >= 3 ? 1 : 0;
      }
   }
}
