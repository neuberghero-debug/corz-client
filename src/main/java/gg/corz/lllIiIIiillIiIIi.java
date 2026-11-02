package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class lllIiIIiillIiIIi {
   public static final int IiiiIliiil = 0;
   public static final int liiiIliiil = 1;
   public static final int lIIIlliiil = 4;
   public static final int iiiiIliiil = 2;
   public static final int IIIIlliiil = 7;

   private static Set<Long> IiIlliIliiIl(long[] n, int cells) {
      long var4 = -7529723996674074924L;
      HashSet var2 = new HashSet(Math.max(16, cells * 2));

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < cells; var6 += 4294967296L) {
         var2.add(n[(int)(var6 >>> 32)]);
      }

      return var2;
   }

   public static long IliIlllilIi(int z, int x, int y) {
      return (long)(z & 67108863) << 38 | (long)(y & 67108863) << 12 | (long)x & 4095L;
   }

   private static boolean Illlllllilll(List<Set<Long>> z, int x, int axis, int drawn, int y) {
      long var7 = 2716744187205857613L;

      for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < 3; var9 += 4294967296L) {
         if ((int)(var9 >>> 32) != x) {
            Set var6 = (Set)z.get((int)(var9 >>> 32));
            if (var6.contains(IliIlllilIi(axis, drawn, y))) {
               return true;
            }

            if (var6.contains(
               IliIlllilIi(axis - ((int)(var9 >>> 32) == 0 ? 1 : 0), drawn - ((int)(var9 >>> 32) == 1 ? 1 : 0), y - ((int)(var9 >>> 32) == 2 ? 1 : 0))
            )) {
               return true;
            }
         }
      }

      return false;
   }

   public static int liiiIIllIl(long k) {
      return (int)(k >> 38);
   }

   public static boolean IIIllIIliIIl(Set<Long> set, int axis, int lx, int lz, int ly) {
      long var10 = -9195001009736442867L;
      long var12 = -5812285957807269736L;
      long var14 = -1499546406879475502L;
      switch (axis) {
         case 0:
            var10 ^= ((long)set.contains(IliIlllilIi(lx, lz - 1, ly - 1)) << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)set.contains(IliIlllilIi(lx, lz, ly - 1)) ^ var10) & -1L >>> 32;
            var12 ^= ((long)set.contains(IliIlllilIi(lx, lz - 1, ly)) << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)set.contains(IliIlllilIi(lx, lz, ly)) ^ var12) & -1L >>> 32;
            break;
         case 1:
            var10 ^= ((long)set.contains(IliIlllilIi(lx - 1, lz, ly - 1)) << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)set.contains(IliIlllilIi(lx, lz, ly - 1)) ^ var10) & -1L >>> 32;
            var12 ^= ((long)set.contains(IliIlllilIi(lx - 1, lz, ly)) << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)set.contains(IliIlllilIi(lx, lz, ly)) ^ var12) & -1L >>> 32;
            break;
         default:
            var10 ^= ((long)set.contains(IliIlllilIi(lx - 1, lz - 1, ly)) << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)set.contains(IliIlllilIi(lx, lz - 1, ly)) ^ var10) & -1L >>> 32;
            var12 ^= ((long)set.contains(IliIlllilIi(lx - 1, lz, ly)) << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)set.contains(IliIlllilIi(lx, lz, ly)) ^ var12) & -1L >>> 32;
      }

      var14 ^= (
            (long)(((int)(var10 >>> 32) != 0 ? 1 : 0) + ((int)var10 != 0 ? 1 : 0) + ((int)(var12 >>> 32) != 0 ? 1 : 0) + ((int)var12 != 0 ? 1 : 0)) << 32
               ^ var14
         )
         & -1L << 32;
      return (int)(var14 >>> 32) == 1 || (int)(var14 >>> 32) == 3 || (int)(var14 >>> 32) == 2 && (int)(var10 >>> 32) == (int)var12;
   }

   public static int[] lIiiIiIlilli(long[] cells, int n) {
      return iliIiiliiiii(cells, n, null, 0);
   }

   public static int[] IlIlllIlilIl(long[] n, int cells) {
      long var17 = -4673230806873462241L;
      long var19 = -4760769538792239428L;
      long var21 = -6139842190851359772L;
      long var15 = 6451980974556617095L;
      Set var2 = IiIlliIliiIl(n, cells);
      int[] var3 = new int[var2.size() * 6 * 4];
      var15 ^= (0L ^ var15) & -1L << 32;

      for (long var6 : var2) {
         var15 ^= ((long)liiiIIllIl(var6) ^ var15) & -1L >>> 32;
         var17 ^= ((long)iIlIlllllill(var6) << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)IilliliilIIi(var6) ^ var17) & -1L >>> 32;
         var19 ^= (0L ^ var19) & -1L << 32;

         while ((int)(var19 >>> 32) < 6) {
            var19 ^= ((long)((int)var15) ^ var19) & -1L >>> 32;
            var21 ^= ((long)((int)(var17 >>> 32)) << 32 ^ var21) & -1L << 32;
            var21 ^= ((long)((int)var17) ^ var21) & -1L >>> 32;
            switch ((int)(var19 >>> 32)) {
               case 0:
                  var19 ^= (var19 ^ var19 + (long)-1) & -1L >>> 32;
                  break;
               case 1:
                  var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32;
                  break;
               case 2:
                  var21 += -4294967296L;
                  break;
               case 3:
                  var21 += 4294967296L;
                  break;
               case 4:
                  var21 ^= (var21 ^ var21 + (long)-1) & -1L >>> 32;
                  break;
               default:
                  var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32;
            }

            if (!var2.contains(IliIlllilIi((int)var19, (int)(var21 >>> 32), (int)var21))) {
               int var10001 = (int)(var15 >>> 32);
               var15 += 4294967296L;
               var3[var10001] = (int)var15;
               var10001 = (int)(var15 >>> 32);
               var15 += 4294967296L;
               var3[var10001] = (int)(var17 >>> 32);
               var10001 = (int)(var15 >>> 32);
               var15 += 4294967296L;
               var3[var10001] = (int)var17;
               var10001 = (int)(var15 >>> 32);
               var15 += 4294967296L;
               var3[var10001] = (int)(var19 >>> 32);
            }

            var19 += 4294967296L;
         }
      }

      return Arrays.copyOf(var3, (int)(var15 >>> 32));
   }

   public static int[] iliIiiliiiii(long[] cells, int n, long[] m, int minus) {
      long var22 = -1314424275735333277L;
      long var24 = 927679469867009583L;
      long var26 = -1653012334168716950L;
      long var28 = 3366036697149867915L;
      long var30 = -7218191435350209025L;
      Set var4 = IiIlliIliiIl(cells, n);
      Set var5 = m != null && minus > 0 ? IiIlliIliiIl(m, minus) : null;
      List var6 = List.of(new HashSet(), new HashSet(), new HashSet());
      List var7 = List.of(new HashSet(), new HashSet(), new HashSet());

      for (long var9 : var4) {
         var22 ^= ((long)liiiIIllIl(var9) << 32 ^ var22) & -1L << 32;
         var22 ^= ((long)iIlIlllllill(var9) ^ var22) & -1L >>> 32;
         var24 ^= ((long)IilliliilIIi(var9) << 32 ^ var24) & -1L << 32;

         for (var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < 3; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            var26 ^= (0L ^ var26) & -1L << 32;

            while ((int)(var26 >>> 32) <= 1) {
               for (var26 ^= (0L ^ var26) & -1L >>> 32; (int)var26 <= 1; var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
                  var28 ^= ((long)((int)(var22 >>> 32)) << 32 ^ var28) & -1L << 32;
                  var28 ^= ((long)((int)var22) ^ var28) & -1L >>> 32;
                  var30 ^= ((long)((int)(var24 >>> 32)) << 32 ^ var30) & -1L << 32;
                  switch ((int)var24) {
                     case 0:
                        var28 ^= ((long)((int)var28 + (int)(var26 >>> 32)) ^ var28) & -1L >>> 32;
                        var30 ^= ((long)((int)(var30 >>> 32) + (int)var26) << 32 ^ var30) & -1L << 32;
                        break;
                     case 1:
                        var28 ^= ((long)((int)(var28 >>> 32) + (int)(var26 >>> 32)) << 32 ^ var28) & -1L << 32;
                        var30 ^= ((long)((int)(var30 >>> 32) + (int)var26) << 32 ^ var30) & -1L << 32;
                        break;
                     default:
                        var28 ^= ((long)((int)(var28 >>> 32) + (int)(var26 >>> 32)) << 32 ^ var28) & -1L << 32;
                        var28 ^= ((long)((int)var28 + (int)var26) ^ var28) & -1L >>> 32;
                  }

                  long var20 = IliIlllilIi((int)(var28 >>> 32), (int)var28, (int)(var30 >>> 32));
                  if (((Set)var7.get((int)var24)).add(var20)
                     && IIIllIIliIIl(var4, (int)var24, (int)(var28 >>> 32), (int)var28, (int)(var30 >>> 32))
                     && (var5 == null || !IIIllIIliIIl(var5, (int)var24, (int)(var28 >>> 32), (int)var28, (int)(var30 >>> 32)))) {
                     ((Set)var6.get((int)var24)).add(var20);
                  }
               }

               var26 += 4294967296L;
            }
         }
      }

      return IIlllIlliIll(var6);
   }

   private lllIiIIiillIiIIi() {
   }

   public static int IilliliilIIi(long k) {
      return (int)(k << 26 >> 38);
   }

   private static int[] IIlllIlliIll(List<Set<Long>> drawn) {
      long var16 = -715208865977955298L;
      long var18 = -343265618863478293L;
      long var20 = 6616571863569972779L;
      long var22 = 8870389346563888103L;
      long var24 = 3707956304880828140L;
      long var14 = 5917731770513757245L;
      ArrayList var1 = new ArrayList();

      for (var14 ^= (0L ^ var14) & -1L << 32; (int)(var14 >>> 32) < 3; var14 += 4294967296L) {
         ArrayList var3 = new ArrayList(((Set)drawn.get((int)(var14 >>> 32))).size());

         for (long var5 : (Set)drawn.get((int)(var14 >>> 32))) {
            var14 ^= ((long)liiiIIllIl(var5) ^ var14) & -1L >>> 32;
            long var30 = var16 ^ ((long)iIlIlllllill(var5) << 32 ^ var16) & -1L << 32;
            var16 = var30 ^ ((long)IilliliilIIi(var5) ^ var30) & -1L >>> 32;
            long var32 = var18
               ^ ((long)((int)(var14 >>> 32) == 0 ? (int)var14 : ((int)(var14 >>> 32) == 1 ? (int)(var16 >>> 32) : (int)var16)) << 32 ^ var18) & -1L << 32;
            var18 = var32 ^ ((long)((int)(var14 >>> 32) == 0 ? (int)(var16 >>> 32) : (int)var14) ^ var32) & -1L >>> 32;
            var20 ^= ((long)((int)(var14 >>> 32) == 2 ? (int)(var16 >>> 32) : (int)var16) << 32 ^ var20) & -1L << 32;
            var3.add(new int[]{(int)var18, (int)(var20 >>> 32), (int)(var18 >>> 32), (int)var14, (int)(var16 >>> 32), (int)var16});
         }

         var3.sort((q, p) -> q[0] != p[0] ? Integer.compare(q[0], p[0]) : (q[1] != p[1] ? Integer.compare(q[1], p[1]) : Integer.compare(q[2], p[2])));

         for (var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < var3.size(); var20 ^= ((long)((int)var20 + (int)(var22 >>> 32)) ^ var20) & -1L >>> 32) {
            int[] var27 = (int[])var3.get((int)var20);

            for (var22 ^= (4294967296L ^ var22) & -1L << 32; (int)var20 + (int)(var22 >>> 32) < var3.size(); var22 += 4294967296L) {
               int[] var7 = (int[])var3.get((int)var20 + (int)(var22 >>> 32));
               if (var7[0] != var27[0] || var7[1] != var27[1] || var7[2] != var27[2] + (int)(var22 >>> 32)) {
                  break;
               }
            }

            var1.add(new int[]{(int)(var14 >>> 32), var27[3], var27[4], var27[5], (int)(var22 >>> 32)});
         }
      }

      int[] var2 = new int[var1.size() * 7];
      var22 ^= (0L ^ var22) & -1L >>> 32;

      for (int[] var28 : var1) {
         long var35 = var22 ^ ((long)var28[0] << 32 ^ var22) & -1L << 32;
         var14 ^= ((long)var28[1] ^ var14) & -1L >>> 32;
         long var31 = var16 ^ ((long)var28[2] << 32 ^ var16) & -1L << 32;
         var16 = var31 ^ ((long)var28[3] ^ var31) & -1L >>> 32;
         long var33 = var18 ^ ((long)var28[4] << 32 ^ var18) & -1L << 32;
         var18 = var33 ^ ((long)((int)var14 + ((int)(var35 >>> 32) == 0 ? (int)(var33 >>> 32) : 0)) ^ var33) & -1L >>> 32;
         var20 ^= ((long)((int)(var16 >>> 32) + ((int)(var35 >>> 32) == 1 ? (int)(var18 >>> 32) : 0)) << 32 ^ var20) & -1L << 32;
         var24 ^= ((long)((int)var16 + ((int)(var35 >>> 32) == 2 ? (int)(var18 >>> 32) : 0)) << 32 ^ var24) & -1L << 32;
         int var10001 = (int)var35;
         long var36 = var35 ^ (var35 ^ var35 + (long)1) & -1L >>> 32;
         var2[var10001] = (int)(var36 >>> 32);
         var10001 = (int)var36;
         long var37 = var36 ^ (var36 ^ var36 + (long)1) & -1L >>> 32;
         var2[var10001] = (int)var14;
         var10001 = (int)var37;
         long var38 = var37 ^ (var37 ^ var37 + (long)1) & -1L >>> 32;
         var2[var10001] = (int)(var16 >>> 32);
         var10001 = (int)var38;
         long var39 = var38 ^ (var38 ^ var38 + (long)1) & -1L >>> 32;
         var2[var10001] = (int)var16;
         var10001 = (int)var39;
         long var40 = var39 ^ (var39 ^ var39 + (long)1) & -1L >>> 32;
         var2[var10001] = (int)(var18 >>> 32);
         var10001 = (int)var40;
         long var41 = var40 ^ (var40 ^ var40 + (long)1) & -1L >>> 32;
         var2[var10001] = Illlllllilll(drawn, (int)(var41 >>> 32), (int)var14, (int)(var16 >>> 32), (int)var16) ? 1 : 0;
         var10001 = (int)var41;
         var22 = var41 ^ (var41 ^ var41 + (long)1) & -1L >>> 32;
         var2[var10001] = Illlllllilll(drawn, (int)(var22 >>> 32), (int)var18, (int)(var20 >>> 32), (int)(var24 >>> 32)) ? 1 : 0;
      }

      return var2;
   }

   public static int iIlIlllllill(long k) {
      return (int)(k << 52 >> 52);
   }
}
