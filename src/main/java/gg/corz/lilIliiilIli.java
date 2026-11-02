package gg.corz;

import java.util.ArrayDeque;
import java.util.HashSet;

public final class lilIliiilIli {
   public static final int llllIiIIlilllIiIIl = 256;
   private static final int[][] iillIiIIlIIilIiIIl = new int[][]{{0, 1, 0}, {0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}};
   private static final int[][] IillIiIIllillIiIIl = new int[][]{{0, -1, 0}, {1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}};

   public static boolean IliIlllilIi(lillIilliillIill z, int y, int x, int g, int cap) {
      long var16 = 6470694066336666987L;
      long var18 = 4787655009501812755L;
      long var20 = -8954803706403288217L;
      ArrayDeque var5 = new ArrayDeque();
      HashSet var6 = new HashSet();
      var5.add(new int[]{y, x, g});
      var6.add(llIiIiililIiIiil.IIIllIIliIIl(y, x, g));

      while (!var5.isEmpty()) {
         int[] var7 = (int[])var5.poll();
         int[][] var8 = IillIiIIllillIiIIl;
         var16 ^= ((long)var8.length << 32 ^ var16) & -1L << 32;

         for (var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
            int[] var11 = var8[(int)var16];
            long var23 = var18 ^ ((long)(var7[0] + var11[0]) << 32 ^ var18) & -1L << 32;
            var18 = var23 ^ ((long)(var7[1] + var11[1]) ^ var23) & -1L >>> 32;
            var20 ^= ((long)(var7[2] + var11[2]) << 32 ^ var20) & -1L << 32;
            iiIlliIlIIllliIl var15 = z.at((int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32));
            if (var15 != iiIlliIlIIllliIl.lIIIiiiIll && var6.add(llIiIiililIiIiil.IIIllIIliIIl((int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32)))) {
               if (var15 == iiIlliIlIIllliIl.llIIiiiIll || var6.size() > cap) {
                  return true;
               }

               var5.add(new int[]{(int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32)});
            }
         }
      }

      return false;
   }

   public static boolean iIlIlllllill(lillIilliillIill y, int cap, int z, int g, int x) {
      long var17 = 3693666867342880051L;
      long var19 = 1890372366074223050L;
      long var21 = -1174417867928215828L;
      int[][] var5 = new int[][]{{0, -1, 0}, {0, 0, -1}, {0, 0, 1}, {-1, 0, 0}, {1, 0, 0}};
      ArrayDeque var6 = new ArrayDeque();
      HashSet var7 = new HashSet();
      var6.add(new int[]{cap, z, g});
      var7.add(llIiIiililIiIiil.IIIllIIliIIl(cap, z, g));

      while (!var6.isEmpty()) {
         int[] var8 = (int[])var6.poll();
         int[][] var9 = var5;
         var17 ^= ((long)var5.length << 32 ^ var17) & -1L << 32;

         for (var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
            int[] var12 = var9[(int)var17];
            var19 ^= ((long)(var8[0] + var12[0]) << 32 ^ var19) & -1L << 32;
            var19 ^= ((long)(var8[1] + var12[1]) ^ var19) & -1L >>> 32;
            var21 ^= ((long)(var8[2] + var12[2]) << 32 ^ var21) & -1L << 32;
            if (var7.add(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32)))) {
               iiIlliIlIIllliIl var16 = y.at((int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32));
               if (var16 != iiIlliIlIIllliIl.lIIIiiiIll) {
                  if (var16 == iiIlliIlIIllliIl.llIIiiiIll || var7.size() > x) {
                     return false;
                  }

                  var6.add(new int[]{(int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32)});
               }
            }
         }
      }

      return true;
   }

   public static boolean liiiIIllIl(lIilliiIilli y, ilIilIIlIiIilIIl cap, int z, int x, int body, int g) {
      long var17 = -3429977995969587101L;
      long var19 = 7734190501361844797L;
      long var21 = -9103322716984171603L;
      if (cap.at(z, x, body)) {
         return false;
      } else {
         ArrayDeque var6 = new ArrayDeque();
         HashSet var7 = new HashSet();
         var6.add(new int[]{z, x, body});
         var7.add(llIiIiililIiIiil.IIIllIIliIIl(z, x, body));

         while (!var6.isEmpty()) {
            int[] var8 = (int[])var6.poll();
            int[][] var9 = iillIiIIlIIilIiIIl;
            var17 ^= ((long)var9.length << 32 ^ var17) & -1L << 32;

            for (var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
               int[] var12 = var9[(int)var17];
               long var24 = var19 ^ ((long)(var8[0] + var12[0]) << 32 ^ var19) & -1L << 32;
               var19 = var24 ^ ((long)(var8[1] + var12[1]) ^ var24) & -1L >>> 32;
               var21 ^= ((long)(var8[2] + var12[2]) << 32 ^ var21) & -1L << 32;
               illllilIilllil var16 = y.at(var8[0], var8[1], var8[2], (int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32));
               if (var16 == illllilIilllil.iIIllIIliIlIllIIli) {
                  return false;
               }

               if (var12[1] <= 0 && var16 != illllilIilllil.lIiIlIIliiIiIlIIli && var16 != illllilIilllil.IliIlIIlilliIlIIli) {
                  if (var16 == illllilIilllil.IIIllIIlilIIllIIli || var16 == illllilIilllil.iliIlIIliIiiIlIIli && var12[1] < 0) {
                     return false;
                  }

                  if (var7.add(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32)))) {
                     if (cap.at((int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32)) || var7.size() > g) {
                        return false;
                     }

                     var6.add(new int[]{(int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32)});
                  }
               }
            }
         }

         return true;
      }
   }

   public static boolean IilliliilIIi(boolean schematicBlockBelow, boolean belowExactBuilt, boolean sourceFluid) {
      return schematicBlockBelow && belowExactBuilt && !sourceFluid;
   }

   private lilIliiilIli() {
   }
}
