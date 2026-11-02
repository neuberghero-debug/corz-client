package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import net.minecraft.class_2338;

public final class IiIiIlliIiIl {
   public static final double lililliliilillil = 1.4;
   public static final int liillliliiilllil = 20;
   public static final int Ililllilllilllil = 1000000;
   public static final int lIillliliIilllil = 300;
   public static final int Illillillllillil = 8000;
   public static final int lIlilliliIlillil = 24;
   public static final int iIIillilIlIillil = 8;
   public static final int illillilIilillil = 10;
   public static final int iiIillilIIlillil = 9;
   private static final int[] IIiillillIiillil = new int[]{1, -1, 0, 0};
   public static final int IIIillillIIillil = 40;
   private static final int[] iIiillilIliillil = new int[]{0, 0, 1, -1};
   public static final int IiIillilliIillil = 18;
   public static final int llIillililIillil = 13;
   public static final int ililllilIiilllil = 60;

   public static int Illlllllilll(int air, double oxygenBonus) {
      if (air >= ((389502792 - -127 << 13 | 389502792 - -127 >>> 19) ^ -352870234)) {
         return (-353890866 * 45 - -113 - -49 << 5 | -353890866 * 45 - -113 - -49 >>> 27) ^ 1497561417;
      } else {
         double var3 = 1.0 + Math.max(0.0, oxygenBonus);
         return (int)Math.min(3812215184936824715L ^ 3812215184937528756L, Math.round((double)air * var3));
      }
   }

   public static boolean lIiiIiIlilli(lIilIiliIilIil y, int x, int z, int c) {
      long var5 = 1351213884332646809L;
      if (!iIlIlllllill(y, x, z, c)) {
         return false;
      } else {
         var5 ^= ((long)y.IliIlllilIi(x, z + 1, c) << 32 ^ var5) & -1L << 32;
         return lIilIiliIilIil.iIlIlllllill((int)(var5 >>> 32))
            && !lIilIiliIilIil.liiiIIllIl((int)(var5 >>> 32), (-89784438 >>> 11 | -89784438 << 21) + -11 + -49 ^ -245410675);
      }
   }

   public static boolean IIillIiliIil(int maxAir, int air, boolean submerged) {
      return !submerged && maxAir >= IliIlllilIi(air);
   }

   private IiIiIlliIiIl() {
   }

   public static int liiiIIllIl(int escapeTicks) {
      return (1983925662 * 1057222719 + -57 - -51 ^ 762395104)
         + (int)Math.ceil(Double.longBitsToDouble(9007099890120507155L ^ 4830607333613754741L) * (double)Math.max(0, escapeTicks));
   }

   public static boolean IilliliilIIi(lIilIiliIilIil x, int c, int y, int z) {
      long var5 = -2520114510480652093L;
      var5 ^= ((long)x.IliIlllilIi(c, y, z) << 32 ^ var5) & -1L << 32;
      return lIilIiliIilIil.liiiIIllIl((int)(var5 >>> 32), 4) && lIilIiliIilIil.iIlIlllllill((int)(var5 >>> 32));
   }

   private static void IlIlllIlilIl(
      PriorityQueue<long[]> y, Long2IntOpenHashMap z, Long2IntOpenHashMap parent, List<long[]> nodes, long cost, int from, int g, int x, int open
   ) {
      long var10 = class_2338.method_10064(from, g, x);
      if (open < z.get(var10)) {
         z.put(var10, open);
         parent.put(var10, nodes.size());
         nodes.add(new long[]{var10, cost});
         y.add(new long[]{var10, (long)open});
      }
   }

   public static int iliIiiliiiii(lIilIiliIilIil c, int y, int z, int x) {
      for (int var4 = 0; var4 <= 24; var4++) {
         if (!iIlIlllllill(c, y, z + var4, x) || !iIlIlllllill(c, y, z + 1 + var4, x)) {
            return -1;
         }

         if (lIiiIiIlilli(c, y, z + var4, x)) {
            return var4 * 8;
         }
      }

      return -1;
   }

   public static boolean iIlIlllllill(lIilIiliIilIil y, int c, int x, int z) {
      long var5 = -6136582401245783383L;
      var5 ^= ((long)y.IliIlllilIi(c, x, z) << 32 ^ var5) & -1L << 32;
      return lIilIiliIilIil.iIlIlllllill((int)(var5 >>> 32))
         && !lIilIiliIilIil.liiiIIllIl((int)(var5 >>> 32), (727407528 << 7 | 727407528 >>> 25) - -41 ^ -1381116892);
   }

   public static List<class_2338> IIIllIIliIIl(lIilIiliIilIil sz, int c, int sy, int maxNodes, int sx) {
      if (lIiiIiIlilli(sz, c, sy, maxNodes)) {
         return List.of(new class_2338(c, sy, maxNodes));
      } else {
         Long2IntOpenHashMap var5 = new Long2IntOpenHashMap();
         Long2IntOpenHashMap var6 = new Long2IntOpenHashMap();
         var5.defaultReturnValue(Integer.MAX_VALUE);
         ArrayList var7 = new ArrayList();
         PriorityQueue var8 = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
         long var9 = class_2338.method_10064(c, sy, maxNodes);
         var5.put(var9, 0);
         var6.put(var9, -1);
         var7.add(new long[]{var9});
         var8.add(new long[]{var9, 0L});
         int var11 = 0;

         while (!var8.isEmpty() && var11 < sx) {
            long[] var12 = (long[])var8.poll();
            long var13 = var12[0];
            int var15 = var5.get(var13);
            if (var12[1] == (long)var15) {
               var11++;
               int var16 = class_2338.method_10061(var13);
               int var17 = class_2338.method_10071(var13);
               int var18 = class_2338.method_10083(var13);
               if (lIiiIiIlilli(sz, var16, var17, var18)) {
                  return IiIlliIliiIl(var13, var6, var7);
               }

               if (Math.abs(var16 - c) <= 10 && Math.abs(var18 - maxNodes) <= 10) {
                  if (IilliliilIIi(sz, var16, var17, var18) && iIlIlllllill(sz, var16, var17 + 1, var18) && iIlIlllllill(sz, var16, var17 + 2, var18)) {
                     IlIlllIlilIl(var8, var5, var6, var7, var13, var16, var17 + 1, var18, var15 + 8);
                  }

                  for (int var19 = 0; var19 < 4; var19++) {
                     int var20 = var16 + IIiillillIiillil[var19];
                     int var21 = var18 + iIiillilIliillil[var19];
                     if (iIlIlllllill(sz, var20, var17, var21)
                        && iIlIlllllill(sz, var20, var17 + 1, var21)
                        && (IilliliilIIi(sz, var20, var17, var21) || lIilIiliIilIil.liiiIIllIl(sz.IliIlllilIi(var20, var17 - 1, var21), 1))) {
                        IlIlllIlilIl(var8, var5, var6, var7, var13, var20, var17, var21, var15 + 13);
                     }
                  }

                  if (IilliliilIIi(sz, var16, var17 - 1, var18)) {
                     IlIlllIlilIl(var8, var5, var6, var7, var13, var16, var17 - 1, var18, var15 + 9);
                  }
               }
            }
         }

         return null;
      }
   }

   public static IIIlilillIIlilil Iilllilliill(int submerged, boolean unlimited, boolean air, int drowning, boolean needTicks) {
      if (!air && unlimited) {
         if (needTicks || submerged <= (~(-1842455801 + -9) ^ 115 ^ 1842455916)) {
            return IIIlilillIIlilil.lIIiIlIlil;
         } else if (drowning < 0) {
            return submerged
                  < (((1843897313 >>> 13 | 1843897313 << 19) + -117 >>> 9 | (1843897313 >>> 13 | 1843897313 << 19) + -117 << 23) * -128207979 ^ -409679757)
               ? IIIlilillIIlilil.lIIiIlIlil
               : IIIlilillIIlilil.IIIiIlIlil;
         } else {
            return submerged <= liiiIIllIl(drowning) ? IIIlilillIIlilil.IIIiIlIlil : IIIlilillIIlilil.iiilIlIlil;
         }
      } else {
         return IIIlilillIIlilil.iiilIlIlil;
      }
   }

   public static int IliIlllilIi(int maxAir) {
      return maxAir >= (-(~(789059878 * -941362695 ^ -57)) ^ -892369294)
         ? -1907758995 * 103 ^ 1068745115
         : Math.max(-1930398338 - 121 ^ -67 ^ 1930398340, maxAir - (412754325 * -121 * -49 ^ -910965815));
   }

   public static int IIlllIlliIll(List<class_2338> route) {
      if (route == null) {
         return -1;
      } else {
         byte var1 = 0;

         for (int var2 = 1; var2 < route.size(); var2++) {
            class_2338 var3 = (class_2338)route.get(var2 - 1);
            class_2338 var4 = (class_2338)route.get(var2);
            if (var4.method_10264() > var3.method_10264()) {
               var1 += 8;
            } else if (var4.method_10264() < var3.method_10264()) {
               var1 += 9;
            } else {
               var1 += 13;
            }
         }

         return var1;
      }
   }

   private static List<class_2338> IiIlliIliiIl(long nodes, Long2IntOpenHashMap from, List<long[]> end) {
      ArrayList var4 = new ArrayList();
      long var5 = nodes;

      for (int var7 = 0; var7 < 4096; var7++) {
         var4.add(class_2338.method_10092(var5));
         int var8 = from.get(var5);
         if (var8 < 0) {
            break;
         }

         var5 = ((long[])end.get(var8))[1];
      }

      Collections.reverse(var4);
      return var4;
   }
}
