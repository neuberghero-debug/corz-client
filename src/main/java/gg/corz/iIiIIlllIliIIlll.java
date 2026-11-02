package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2FloatOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_2338;

public final class iIiIIlllIliIIlll {
   private long[][] iIilIIIill;
   private int[] IiilIIIill;
   private final int lliIIIIill;
   private boolean[] IlilIIIill;
   private int IiIiIIIill;
   private int[] ililIIIill;
   private final Long2IntOpenHashMap[] liIlIIIill = new Long2IntOpenHashMap[9];
   private int[] iillIIIill;
   private final illlilIlIillilIl IliIIIIill;
   private double[] IillIIIill;
   private int[] liilIIIill;
   private final int iIIlIIIill;
   private int llIiIIIill;
   private final int ilIlIIIill;
   private final long[] IlIiIIIill;
   private final int IiIlIIIill;
   private final ilIliiIlIiIliiIl lIiIIIIill;
   private final int llIlIIIill;
   private int iIIiIIIill;
   private final int lIIlIIIill;
   private iiillliIIIilli liIiIIIill;
   private final int liiIIIIill;
   private final Predicate<class_2338> iIiIIIIill;
   private long[] IIilIIIill;
   private final int IlIlIIIill;
   private final boolean IiiIIIIill;
   private int iIllIIIill;
   private final Long2ByteOpenHashMap iiIlIIIill = new Long2ByteOpenHashMap(4096);
   private int[] illlIIIill;
   private int lIIiIIIill;
   private final int iiiIIIIill;
   private final int iliIIIIill;
   private int ilIiIIIill;
   private byte[] lIilIIIill;
   private final int IIIlIIIill;
   private int[] IlllIIIill;
   private double[] IIIiIIIill;
   private double[] lillIIIill;
   private double[] iiilIIIill;
   private final Long2FloatOpenHashMap IIllIIIill = new Long2FloatOpenHashMap();
   private final Long2IntOpenHashMap lIllIIIill = new Long2IntOpenHashMap();
   private int[] llllIIIill;
   private int[] llilIIIill;

   private boolean Iilililiiili(int y, int x, int z) {
      long var7 = 9011063352762987456L;
      long var4 = class_2338.method_10064(y, x, z);
      var7 ^= ((long)(this.iiIlIIIill.get(var4) & (-(2055991175 ^ 101) ^ -2055991071)) << 32 ^ var7) & -1L << 32;
      if (((int)(var7 >>> 32) & (~(~442130477 + -1 >>> 7 | ~442130477 + -1 << 25) ^ 1546957952)) == 0) {
         var7 ^= (
               (long)(
                        (int)(var7 >>> 32)
                           | (this.lIiIIIIill.IIIllIIliIIl(y, x, z) ? ((-840771053 - -55) * 45 + 73) * -954437177 ^ -1045549427 : ~(-2005293703) ^ 2005293766)
                     )
                     << 32
                  ^ var7
            )
            & -1L << 32;
         this.iiIlIIIill.put(var4, (byte)((int)(var7 >>> 32)));
      }

      return ((int)(var7 >>> 32) & ((1133443284 - -125) * 63 * 373475417 ^ -1424009833)) != 0 && !this.Illillliilli(y, x, z, var4);
   }

   private double IIIIllIIIl(int x, int key, int y, long z) {
      float var6 = this.IIllIIIill.get(z);
      if (var6 < 0.0F) {
         var6 = Math.max(1.0F, this.lIiIIIIill.iIlIlllllill(x, key, y));
         this.IIllIIIill.put(z, var6);
      }

      return (double)var6;
   }

   private double iiIIlIIlIl(int y, int z, int x) {
      long var9 = 3085408161235598221L;
      long var11 = -7714147440128637572L;
      if (!this.IiiIIIIill) {
         return 0.0;
      } else {
         var9 ^= ((long)Math.abs(this.liiIIIIill - y) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)Math.abs(this.IIIlIIIill - x) ^ var9) & -1L >>> 32;
         double var6 = (double)Math.max((int)(var9 >>> 32), (int)var9) + (IliliIillliliIil.IiIiIilIil - 1.0) * (double)Math.min((int)(var9 >>> 32), (int)var9);
         var11 ^= ((long)(this.iiiIIIIill - z) << 32 ^ var11) & -1L << 32;
         if ((int)(var11 >>> 32) > 0) {
            return Math.max(var6, (double)((int)(var11 >>> 32))) + (double)((int)(var11 >>> 32));
         } else {
            return (int)(var11 >>> 32) < 0
               ? Math.max(var6, (double)((-((int)(var11 >>> 32)) + 4 - 1) / 4))
                  + Double.longBitsToDouble(-2379673005588866633L ^ -2226550618258269769L) * (double)(-((int)(var11 >>> 32)))
               : var6;
         }
      }
   }

   private void iIiIlIliIl(int node) {
      if (this.lIIiIIIill == this.IiilIIIill.length) {
         int var2 = this.lIIiIIIill * 2;
         this.IiilIIIill = Arrays.copyOf(this.IiilIIIill, var2);
         this.liilIIIill = Arrays.copyOf(this.liilIIIill, var2);
         this.iiilIIIill = Arrays.copyOf(this.iiilIIIill, var2);
         this.IIIiIIIill = Arrays.copyOf(this.IIIiIIIill, var2);
      }

      int var4 = this.lIIiIIIill++;
      this.IiilIIIill[var4] = node;
      this.liilIIIill[var4] = this.iIIiIIIill++;
      this.iiilIIIill[var4] = this.iliIiiliiiii(node);
      this.IIIiIIIill[var4] = this.lillIIIill[node];

      while (var4 > 0) {
         int var3 = var4 - 1 >>> 1;
         if (!this.lilIliilIl(var4, var3)) {
            break;
         }

         this.IIiIllIiIl(var4, var3);
         var4 = var3;
      }
   }

   private void IIIllIIliIIl(int i) {
      int var2 = this.IlllIIIill[i];
      int var3 = this.llllIIIill[i];
      int var4 = this.illlIIIill[i];
      boolean var5 = this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(var2, var3, var4);

      for (int var6 = 0; var6 < 4; var6++) {
         int var7 = var2 + IliliIillliliIil.IiliIilIil[var6];
         int var8 = var4 + IliliIillliliIil.liliIilIil[var6];
         if (var7 >= this.lIIlIIIill && var7 <= this.llIlIIIill && var8 >= this.IlIlIIIill && var8 <= this.IiIlIIIill) {
            if (var5) {
               this.IiIlliIliiIl(i, var3, var7, var8, 1.0, IllIllllllIlll.iiiiIIiilIIIIlIiil, IllIllllllIlll.liliIIiiliiliIIiil);
               this.IIlllIlliIll(i, var2, var3, var4, var7, var8);
               if (!this.IiIiliIiiiIi(i, var7, var3, var8)
                  && !this.IiIiliIiiiIi(i, var7, var3 + 1, var8)
                  && !this.IiIiliIiiiIi(i, var7, var3 - 1, var8)
                  && !this.Iilililiiili(var7, var3, var8)) {
                  this.Iiilliiliiil(i, var3, var7, var8, IliliIillliliIil.IiliIilIil[var6], IliliIillliliIil.liliIilIil[var6]);
               }
            } else {
               boolean var9 = this.IiIiliIiiiIi(i, var7, var3 - 1, var8);
               boolean var10 = this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(var7, var3, var8);
               if (var9 || var10) {
                  this.IlIlllIlilIl(i, var3, var7, var8, var10);
               }

               this.Ililllililil(i, var2, var3, var4, var7, var8);
               if (!var9 && !var10) {
                  this.Iiilliiliiil(i, var3, var7, var8, IliliIillliliIil.IiliIilIil[var6], IliliIillliliIil.liliIilIil[var6]);
               }
            }
         }
      }

      for (int var11 = 0; var11 < 4; var11++) {
         this.Iilllilliill(i, var2, var3, var4, IliliIillliliIil.iiliIilIil[var11], IliliIillliliIil.IIiiIilIil[var11], var5);
      }

      if (var5) {
         this.Illlllllilll(i, var2, var3, var4);
      } else {
         this.IlIillIiilIi(i, var2, var3, var4);
      }
   }

   private double iliIiiliiiii(int i) {
      return this.IillIIIill[i] + this.IliIIIIill.IilliliilIIi() * this.lillIIIill[i];
   }

   private Long2IntOpenHashMap IliIlllilIi(int bucket) {
      Long2IntOpenHashMap var2 = this.liIlIIIill[bucket];
      if (var2 == null) {
         var2 = new Long2IntOpenHashMap();
         var2.defaultReturnValue(-1);
         this.liIlIIIill[bucket] = var2;
      }

      return var2;
   }

   private List<iiliilIlIIiiilIl> illIlIilIl(int i) {
      ArrayList var2 = new ArrayList();
      int var3 = i;

      while (this.iillIIIill[var3] >= 0) {
         long[] var4 = this.iIilIIIill[var3];
         List var5;
         if (var4 == null) {
            var5 = List.of();
         } else {
            class_2338[] var6 = new class_2338[var4.length];

            for (int var7 = 0; var7 < var4.length; var7++) {
               var6[var7] = class_2338.method_10092(var4[var7]);
            }

            var5 = List.of(var6);
         }

         boolean var8 = this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(this.IlllIIIill[var3], this.llllIIIill[var3], this.illlIIIill[var3]);
         var2.add(
            new iiliilIlIIiiilIl(
               new class_2338(this.IlllIIIill[var3], this.llllIIIill[var3], this.illlIIIill[var3]),
               IliliIillliliIil.lIiiIilIil[this.lIilIIIill[var3]],
               var5,
               var8,
               this.IIiilIiiiIii(this.IlllIIIill[var3], this.llllIIIill[var3], this.illlIIIill[var3])
            )
         );
         var3 = this.iillIIIill[var3];
      }

      Collections.reverse(var2);
      return List.copyOf(var2);
   }

   private void lIlIliIlIl(int x, int from, int mv, int z, IllIllllllIlll y, double cost) {
      if (!this.Iliilliiilii(from, mv, z) && !this.Iliilliiilii(from, mv + 1, z) && !this.Iliilliiilii(from, mv - 1, z)) {
         boolean var8 = this.IIiilIiiiIii(from, mv, z);
         double var11 = 0.0;
         int var9;
         int var10;
         if (var8 && !this.IliIIIIill.IliIlllilIi()) {
            int var13 = llIIlilIIl(y, this.IlllIIIill[x] != from && this.illlIIIill[x] != z);
            var10 = this.ililIIIill[x] + var13;
            var9 = this.llilIIIill[x] - var13;
            int var14 = this.iIIIlIlIIl(from, mv, z);
            int var15 = var14 < 0 ? var10 : Math.min(var14, var10);
            if (var9 < IiIiIlliIiIl.liiiIIllIl(var15) + 40) {
               return;
            }

            var11 = 0.6 + 1.5 * (1.0 - (double)var9 / (double)Math.max(1, this.lliIIIIill));
         } else {
            var9 = this.lliIIIIill;
            var10 = 0;
         }

         double var22 = this.IillIIIill[x] + cost + var11 + (double)Math.max(0.0F, this.lIiIIIIill.lIiiIiIlilli(from, mv, z));
         long var23 = class_2338.method_10064(from, mv, z);
         int var17 = IliliIillliliIil.iliIiiliiiii(var8, this.IliIIIIill.IliIlllilIi(), var9);
         int var18 = this.IliIlllilIi(var17).get(var23);
         if (var18 < 0) {
            var18 = this.IllIllllIl(from, mv, z, var23, var17);
         } else if (var22 >= this.IillIIIill[var18] - 1.0E-9 || var8 && var9 < this.llilIIIill[var18]) {
            return;
         }

         long var19 = this.IIilIIIill[x];

         for (int var21 = 0; var21 < this.llIiIIIill; var21++) {
            var19 |= IliliIillliliIil.IIIllIIliIIl(this.IlIiIIIill[var21]);
         }

         this.IillIIIill[var18] = var22;
         this.iillIIIill[var18] = x;
         this.lIilIIIill[var18] = (byte)y.ordinal();
         this.iIilIIIill[var18] = this.llIiIIIill == 0 ? null : Arrays.copyOf(this.IlIiIIIill, this.llIiIIIill);
         this.IIilIIIill[var18] = var19;
         this.llilIIIill[var18] = var9;
         this.ililIIIill[var18] = var10;
         this.IlilIIIill[var18] = false;
         this.iIiIlIliIl(var18);
      }
   }

   private boolean Iliilliiilii(int x, int y, int z) {
      long var7 = 7006242590060628451L;
      long var4 = class_2338.method_10064(x, y, z);
      var7 ^= ((long)(this.iiIlIIIill.get(var4) & (-351002603 * 11 ^ 433938456)) << 32 ^ var7) & -1L << 32;
      if (((int)(var7 >>> 32) & (~-556323212 * -1030792151 ^ 1568441171)) == 0) {
         var7 ^= (
               (long)(
                        (int)(var7 >>> 32)
                           | (
                              this.lIiIIIIill.IilliliilIIi(x, y, z)
                                 ? ((1544679155 << 17 | 1544679155 >>> 15) * -69 << 11 | (1544679155 << 17 | 1544679155 >>> 15) * -69 >>> 21) + -111
                                    ^ -2097903321
                                 : -((146425973 >>> 23 | 146425973 << 9) << 15 | (146425973 >>> 23 | 146425973 << 9) >>> 17) ^ -1963506264
                           )
                     )
                     << 32
                  ^ var7
            )
            & -1L << 32;
         this.iiIlIIIill.put(var4, (byte)((int)(var7 >>> 32)));
      }

      return ((int)(var7 >>> 32) & (((-1765798694 << 5 | -1765798694 >>> 27) ^ 77) + 15 ^ -670983410)) != 0;
   }

   static int llIIlilIIl(IllIllllllIlll mv, boolean diag) {
      return switch (mv) {
         case iiiiIIiilIIIIlIiil -> 10;
         case IIiiIIiillIiiIIiil -> 5;
         default -> diag ? 18 : 13;
         case iIiiIIiilIliiIIiil -> 8;
         case lliiIIiililiiIIiil -> 9;
      };
   }

   private void IlIillIiilIi(int y, int x, int z, int i) {
      if (x >= this.lIIlIIIill && x <= this.llIlIIIill && i >= this.IlIlIIIill && i <= this.IiIlIIIill) {
         long var5 = class_2338.method_10064(x, z - 1, i);
         if (this.IiIiliIiiiIi(y, x, z - 1, i) && this.Iiiiliiiiiii(x, z - 1, i, var5)) {
            double var7 = this.IIIIllIIIl(x, z - 1, i, var5);

            for (int var9 = 2; var9 <= 5; var9++) {
               if (this.Iliilliiilii(x, z - var9, i)) {
                  return;
               }

               if (this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(x, z - var9, i)) {
                  return;
               }

               if (this.IiIiliIiiiIi(y, x, z - var9, i)) {
                  int var10 = z - var9 + 1;
                  if (var10 >= this.iIIlIIIill && var10 <= this.ilIlIIIill && !this.lIiIIIIill.iliIiiliiiii(x, var10, i)) {
                     this.llIiIIIill = 0;
                     this.IlIiIIIill[this.llIiIIIill++] = var5;
                     this.lIlIliIlIl(y, x, var10, i, IllIllllllIlll.lliiIIiililiiIIiil, 2.0 + var7 + 0.5 * (double)(var9 - 1));
                     return;
                  }

                  return;
               }
            }
         }
      }
   }

   private boolean IiIiliIiiiIi(int i, int z, int y, int x) {
      long var5 = class_2338.method_10064(z, y, x);
      return this.Illillliilli(z, y, x, var5) && !this.IiIIlliIIl(i, var5);
   }

   public boolean iIlIlllllill() {
      return this.liIiIIIill != null;
   }

   private boolean IIillIiliIil(int x, int i, int z, int y) {
      return !this.IiIiliIiiiIi(x, i, z, y) && !this.IiIiliIiiiIi(x, i, z + 1, y) && !this.Iliilliiilii(i, z, y) && !this.Iliilliiilii(i, z + 1, y);
   }

   public iiillliIIIilli IilliliilIIi() {
      return new iiillliIIIilli(this.illIlIilIl(this.IiIiIIIill), false, this.ilIiIIIill);
   }

   private void IiIlliIliiIl(int i, int nx, int scale, int nz, double swim, IllIllllllIlll y, IllIllllllIlll land) {
      if (nx >= this.iIIlIIIill && nx <= this.ilIlIIIill) {
         if (!this.IiIiliIiiiIi(i, scale, nx, nz) && !this.IiIiliIiiiIi(i, scale, nx + 1, nz)) {
            this.llIiIIIill = 0;
            if (this.Iilililiiili(scale, nx, nz)) {
               this.lIlIliIlIl(
                  i,
                  scale,
                  nx,
                  nz,
                  y,
                  swim
                     * (
                        this.IIiilIiiiIii(scale, nx, nz)
                           ? Double.longBitsToDouble(8982580154300068585L ^ 4372695520760632463L)
                           : Double.longBitsToDouble(-1728445837965667430L ^ -6340131856393055334L)
                     )
               );
            } else {
               if (this.IiIiliIiiiIi(i, scale, nx - 1, nz)) {
                  this.lIlIliIlIl(i, scale, nx, nz, land, swim * Double.longBitsToDouble(150810398855970073L ^ 4463007042063219993L));
               }
            }
         }
      }
   }

   private boolean IIIilIIiiIIi(int i, int ly, int ox, int oz) {
      if (this.Iliilliiilii(ly, ox, oz) || this.Iliilliiilii(ly, ox + 1, oz)) {
         return false;
      } else if (this.IiIiliIiiiIi(i, ly, ox, oz)) {
         return true;
      } else {
         for (int var5 = 1; var5 <= 4; var5++) {
            if (this.Iliilliiilii(ly, ox - var5, oz)) {
               return false;
            }

            if (this.IiIiliIiiiIi(i, ly, ox - var5, oz) || this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(ly, ox - var5, oz)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean Iiiiliiiiiii(int x, int key, int z, long y) {
      long var7 = 6906071267483759082L;
      if (this.Iliilliiilii(x, key, z)) {
         return false;
      } else {
         var7 ^= ((long)(this.iiIlIIIill.get(y) & (-(1104980907 - 117 + -63 >>> 19 | 1104980907 - 117 + -63 << 13) ^ 1788942138)) << 32 ^ var7) & -1L << 32;
         if (((int)(var7 >>> 32) & 4) == 0) {
            var7 ^= (
                  (long)(
                           (int)(var7 >>> 32)
                              | (
                                 this.lIiIIIIill.liiiIIllIl(x, key, z)
                                    ? (
                                          (2008690295 + 105 << 25 | 2008690295 + 105 >>> 7) - -97 >>> 25
                                             | (2008690295 + 105 << 25 | 2008690295 + 105 >>> 7) - -97 << 7
                                       )
                                       ^ 2008702828
                                    : 4
                              )
                        )
                        << 32
                     ^ var7
               )
               & -1L << 32;
            this.iiIlIIIill.put(y, (byte)((int)(var7 >>> 32)));
         }

         return ((int)(var7 >>> 32) & ((2077575018 * -107 - 107) * 991146299 ^ -79828651)) != 0;
      }
   }

   private boolean IiIIlliIIl(int i, long key) {
      long var4 = IliliIillliliIil.IIIllIIliIIl(key);
      int var6 = i;

      while (var6 >= 0 && (this.IIilIIIill[var6] & var4) != 0L) {
         long[] var7 = this.iIilIIIill[var6];
         if (var7 != null) {
            for (long var11 : var7) {
               if (var11 == key) {
                  return true;
               }
            }
         }

         var6 = this.iillIIIill[var6];
      }

      return false;
   }

   private void lliIliliIl() {
      int var1 = --this.lIIiIIIill;
      if (var1 != 0) {
         this.IiilIIIill[0] = this.IiilIIIill[var1];
         this.liilIIIill[0] = this.liilIIIill[var1];
         this.iiilIIIill[0] = this.iiilIIIill[var1];
         this.IIIiIIIill[0] = this.IIIiIIIill[var1];
         int var2 = 0;

         while (true) {
            int var3 = 2 * var2 + 1;
            if (var3 >= this.lIIiIIIill) {
               break;
            }

            int var4 = var3 + 1;
            int var5 = var4 < this.lIIiIIIill && this.lilIliilIl(var4, var3) ? var4 : var3;
            if (!this.lilIliilIl(var5, var2)) {
               break;
            }

            this.IIiIllIiIl(var2, var5);
            var2 = var5;
         }
      }
   }

   private boolean IIiilIiiiIii(int y, int z, int x) {
      return this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(y, z + 1, x);
   }

   private int iIIIlIlIIl(int y, int x, int z) {
      long var4 = class_2338.method_10064(y, x, z);
      int var6 = this.lIllIIIill.get(var4);
      if (var6 != Integer.MIN_VALUE) {
         return var6;
      } else {
         var6 = -1;

         for (int var7 = 0; var7 <= 24; var7++) {
            int var8 = x + var7;
            if (var7 > 0 && (this.Illillliilli(y, var8, z, class_2338.method_10064(y, var8, z)) || this.Iliilliiilii(y, var8, z))) {
               break;
            }

            long var9 = class_2338.method_10064(y, var8 + 1, z);
            if (this.Illillliilli(y, var8 + 1, z, var9) || this.Iliilliiilii(y, var8 + 1, z)) {
               break;
            }

            if (!this.Iilililiiili(y, var8 + 1, z)) {
               var6 = var7 * 8;
               break;
            }
         }

         this.lIllIIIill.put(var4, var6);
         return var6;
      }
   }

   public iiillliIIIilli lIiiIiIlilli(int budget) {
      if (this.liIiIIIill != null) {
         return this.liIiIIIill;
      } else {
         long var2 = (long)this.ilIiIIIill + (long)Math.max(1, budget);

         while (this.lIIiIIIill > 0) {
            int var4 = this.IiilIIIill[0];
            double var5 = this.iiilIIIill[0];
            this.lliIliliIl();
            if (!this.IlilIIIill[var4] && var5 == this.iliIiiliiiii(var4)) {
               if (this.iIiIIIIill.test(new class_2338(this.IlllIIIill[var4], this.llllIIIill[var4], this.illlIIIill[var4]))) {
                  return this.liIiIIIill = new iiillliIIIilli(this.illIlIilIl(var4), true, this.ilIiIIIill);
               }

               if (this.ilIiIIIill >= this.iliIIIIill) {
                  return this.liIiIIIill = new iiillliIIIilli(this.illIlIilIl(this.IiIiIIIill), false, this.ilIiIIIill);
               }

               this.IlilIIIill[var4] = true;
               this.ilIiIIIill++;
               if (this.lillIIIill[var4] < this.lillIIIill[this.IiIiIIIill]
                  || this.lillIIIill[var4] == this.lillIIIill[this.IiIiIIIill] && this.IillIIIill[var4] < this.IillIIIill[this.IiIiIIIill]) {
                  this.IiIiIIIill = var4;
               }

               this.IIIllIIliIIl(var4);
               if ((long)this.ilIiIIIill >= var2) {
                  return null;
               }
            }
         }

         return this.liIiIIIill = new iiillliIIIilli(this.illIlIilIl(this.IiIiIIIill), false, this.ilIiIIIill);
      }
   }

   public int liiiIIllIl() {
      return this.ilIiIIIill;
   }

   private iIiIIlllIliIIlll(
      ilIliiIlIiIliiIl start, class_2338 o, Predicate<class_2338> max, class_2338 goal, class_2338 maxExpanded, class_2338 g, int min, illlilIlIillilIl hint
   ) {
      this.IlllIIIill = new int[1024];
      this.llllIIIill = new int[1024];
      this.illlIIIill = new int[1024];
      this.IillIIIill = new double[1024];
      this.lillIIIill = new double[1024];
      this.iillIIIill = new int[1024];
      this.IIilIIIill = new long[1024];
      this.lIilIIIill = new byte[1024];
      this.iIilIIIill = new long[1024][];
      this.IlilIIIill = new boolean[1024];
      this.llilIIIill = new int[1024];
      this.ililIIIill = new int[1024];
      this.IiilIIIill = new int[1024];
      this.liilIIIill = new int[1024];
      this.iiilIIIill = new double[1024];
      this.IIIiIIIill = new double[1024];
      this.IlIiIIIill = new long[3];
      this.lIiIIIIill = start;
      this.iIiIIIIill = max;
      this.IliIIIIill = hint;
      this.lliIIIIill = IiIiIlliIiIl.IliIlllilIi(hint.iIlIlllllill());
      this.iliIIIIill = Math.max(1, min);
      this.IiiIIIIill = goal != null;
      this.liiIIIIill = this.IiiIIIIill ? goal.method_10263() : 0;
      this.iiiIIIIill = this.IiiIIIIill ? goal.method_10264() : 0;
      this.IIIlIIIill = this.IiiIIIIill ? goal.method_10260() : 0;
      this.lIIlIIIill = Math.min(maxExpanded.method_10263(), g.method_10263());
      this.iIIlIIIill = Math.min(maxExpanded.method_10264(), g.method_10264());
      this.IlIlIIIill = Math.min(maxExpanded.method_10260(), g.method_10260());
      this.llIlIIIill = Math.max(maxExpanded.method_10263(), g.method_10263());
      this.ilIlIIIill = Math.max(maxExpanded.method_10264(), g.method_10264());
      this.IiIlIIIill = Math.max(maxExpanded.method_10260(), g.method_10260());
      this.IIllIIIill.defaultReturnValue(-1.0F);
      this.lIllIIIill.defaultReturnValue(Integer.MIN_VALUE);
      boolean var9 = this.IIiilIiiiIii(o.method_10263(), o.method_10264(), o.method_10260());
      int var10 = var9 ? Math.min(hint.liiiIIllIl(), this.lliIIIIill) : this.lliIIIIill;
      int var11 = this.IllIllllIl(
         o.method_10263(), o.method_10264(), o.method_10260(), o.method_10063(), IliliIillliliIil.iliIiiliiiii(var9, hint.IliIlllilIi(), var10)
      );
      this.IillIIIill[var11] = 0.0;
      this.iillIIIill[var11] = -1;
      this.lIilIIIill[var11] = -1;
      this.llilIIIill[var11] = var10;
      this.ililIIIill[var11] = var9 ? Math.max(0, this.lliIIIIill - var10) : 0;
      this.iIiIlIliIl(var11);
   }

   private void IlIlllIlilIl(int nz, int y, int intoWater, int i, boolean nx) {
      if (y >= this.iIIlIIIill && y <= this.ilIlIIIill) {
         this.llIiIIIill = 0;
         double var6 = this.IIlilIliiIli(nz, intoWater, y + 1, i);
         if (!(var6 < Double.longBitsToDouble(4062979168417715445L ^ 4062979168417715445L))) {
            double var8 = this.IIlilIliiIli(nz, intoWater, y, i);
            if (!(var8 < Double.longBitsToDouble(-5358775844467460283L ^ -5358775844467460283L))) {
               if (nx) {
                  this.lIlIliIlIl(
                     nz,
                     intoWater,
                     y,
                     i,
                     IllIllllllIlll.iiiiIIiilIIIIlIiil,
                     Double.longBitsToDouble(-1682957434257135483L ^ -6294643452684523387L) + var6 + var8
                  );
               } else {
                  this.lIlIliIlIl(nz, intoWater, y, i, IllIllllllIlll.liliIIiiliiliIIiil, 1.0 + var6 + var8);
               }
            }
         }
      }
   }

   private boolean lilIliilIl(int a, int b) {
      if (this.iiilIIIill[a] != this.iiilIIIill[b]) {
         return this.iiilIIIill[a] < this.iiilIIIill[b];
      } else {
         return this.IIIiIIIill[a] != this.IIIiIIIill[b] ? this.IIIiIIIill[a] < this.IIIiIIIill[b] : this.liilIIIill[a] < this.liilIIIill[b];
      }
   }

   private void IIlllIlliIll(int z, int nx, int x, int i, int nz, int y) {
      long var8 = -4799413138140382938L;
      var8 ^= ((long)(x + 1) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) >= this.iIIlIIIill && (int)(var8 >>> 32) <= this.ilIlIIIill && this.IiIiliIiiiIi(z, nz, x, y)) {
         if (!this.IiIiliIiiiIi(z, nx, x + 2, i) && !this.IiIiliIiiiIi(z, nz, (int)(var8 >>> 32), y) && !this.IiIiliIiiiIi(z, nz, (int)(var8 >>> 32) + 1, y)) {
            if (!this.Iliilliiilii(nx, x + 2, i)) {
               this.llIiIIIill = 0;
               this.lIlIliIlIl(
                  z, nz, (int)(var8 >>> 32), y, IllIllllllIlll.IIiiIIiillIiiIIiil, Double.longBitsToDouble(5647644957929489173L ^ 1037084839408943893L)
               );
            }
         }
      }
   }

   private boolean Illillliilli(int y, int key, int z, long x) {
      long var7 = -5836592349602546407L;
      var7 ^= ((long)(this.iiIlIIIill.get(x) & (~(--1763693553 * -678152731) ^ 1901233301)) << 32 ^ var7) & -1L << 32;
      if (((int)(var7 >>> 32) & 1) == 0) {
         var7 ^= ((long)((int)(var7 >>> 32) | (this.lIiIIIIill.IliIlllilIi(y, key, z) ? 3 : 1)) << 32 ^ var7) & -1L << 32;
         this.iiIlIIIill.put(x, (byte)((int)(var7 >>> 32)));
      }

      return ((int)(var7 >>> 32) & 2) != 0;
   }

   private void Illlllllilll(int x, int y, int z, int i) {
      if (z + 1 <= this.ilIlIIIill && this.Iilililiiili(y, z + 1, i) && !this.IiIiliIiiiIi(x, y, z + 2, i)) {
         this.llIiIIIill = 0;
         this.lIlIliIlIl(x, y, z + 1, i, IllIllllllIlll.lIIIlIiiliIIIlIiil, Double.longBitsToDouble(3657386893536160829L ^ 953238320376667918L));
      }

      if (z - 1 >= this.iIIlIIIill && this.Iilililiiili(y, z - 1, i)) {
         this.llIiIIIill = 0;
         this.lIlIliIlIl(x, y, z - 1, i, IllIllllllIlll.IlIIlIiilllIIlIiil, Double.longBitsToDouble(1905307630035469237L ^ 2706047636935790456L));
      }
   }

   private int IllIllllIl(int x, int z, int y, long key, int bucket) {
      if (this.iIllIIIill == this.IlllIIIill.length) {
         int var7 = this.iIllIIIill * 2;
         this.IlllIIIill = Arrays.copyOf(this.IlllIIIill, var7);
         this.llllIIIill = Arrays.copyOf(this.llllIIIill, var7);
         this.illlIIIill = Arrays.copyOf(this.illlIIIill, var7);
         this.IillIIIill = Arrays.copyOf(this.IillIIIill, var7);
         this.lillIIIill = Arrays.copyOf(this.lillIIIill, var7);
         this.iillIIIill = Arrays.copyOf(this.iillIIIill, var7);
         this.IIilIIIill = Arrays.copyOf(this.IIilIIIill, var7);
         this.lIilIIIill = Arrays.copyOf(this.lIilIIIill, var7);
         this.iIilIIIill = Arrays.copyOf(this.iIilIIIill, var7);
         this.IlilIIIill = Arrays.copyOf(this.IlilIIIill, var7);
         this.llilIIIill = Arrays.copyOf(this.llilIIIill, var7);
         this.ililIIIill = Arrays.copyOf(this.ililIIIill, var7);
      }

      int var8 = this.iIllIIIill++;
      this.IlllIIIill[var8] = x;
      this.llllIIIill[var8] = z;
      this.illlIIIill[var8] = y;
      this.IillIIIill[var8] = Double.MAX_VALUE;
      this.lillIIIill[var8] = this.iiIIlIIlIl(x, z, y);
      this.IliIlllilIi(bucket).put(key, var8);
      return var8;
   }

   private void IIiIllIiIl(int b, int a) {
      long var9 = 3613571820713457800L;
      var9 ^= ((long)this.IiilIIIill[b] << 32 ^ var9) & -1L << 32;
      this.IiilIIIill[b] = this.IiilIIIill[a];
      this.IiilIIIill[a] = (int)(var9 >>> 32);
      var9 ^= ((long)this.liilIIIill[b] ^ var9) & -1L >>> 32;
      this.liilIIIill[b] = this.liilIIIill[a];
      this.liilIIIill[a] = (int)var9;
      double var5 = this.iiilIIIill[b];
      this.iiilIIIill[b] = this.iiilIIIill[a];
      this.iiilIIIill[a] = var5;
      double var7 = this.IIIiIIIill[b];
      this.IIIiIIIill[b] = this.IIIiIIIill[a];
      this.IIIiIIIill[a] = var7;
   }

   private void Iilllilliill(int dx, int i, int y, int dz, int x, int z, boolean wet) {
      int var8 = i + x;
      int var9 = dz + z;
      if (var8 >= this.lIIlIIIill
         && var8 <= this.llIlIIIill
         && var9 >= this.IlIlIIIill
         && var9 <= this.IiIlIIIill
         && y >= this.iIIlIIIill
         && y <= this.ilIlIIIill) {
         if (this.IIillIiliIil(dx, var8, y, var9) && this.IIillIiliIil(dx, i + x, y, dz) && this.IIillIiliIil(dx, i, y, dz + z)) {
            if (wet) {
               this.IiIlliIliiIl(dx, y, var8, var9, IliliIillliliIil.IiIiIilIil, IllIllllllIlll.iiiiIIiilIIIIlIiil, IllIllllllIlll.IiiiIIiilliiiIIiil);
            } else {
               this.llIiIIIill = 0;
               if (this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(var8, y, var9)) {
                  this.lIlIliIlIl(dx, var8, y, var9, IllIllllllIlll.iiiiIIiilIIIIlIiil, IliliIillliliIil.IiIiIilIil * 2.0);
               } else if (this.IiIiliIiiiIi(dx, var8, y - 1, var9) && this.IiIiliIiiiIi(dx, i + x, y - 1, dz) && this.IiIiliIiiiIi(dx, i, y - 1, dz + z)) {
                  if (!this.Iliilliiilii(i + x, y - 1, dz) && !this.Iliilliiilii(i, y - 1, dz + z)) {
                     this.lIlIliIlIl(dx, var8, y, var9, IllIllllllIlll.IiiiIIiilliiiIIiil, IliliIillliliIil.IiIiIilIil);
                  }
               }
            }
         }
      }
   }

   private void Ililllililil(int z, int y, int x, int nx, int nz, int i) {
      long var14 = 3392984435435858426L;
      var14 ^= ((long)(x + 1) << 32 ^ var14) & -1L << 32;
      if ((int)(var14 >>> 32) >= this.iIIlIIIill && (int)(var14 >>> 32) <= this.ilIlIIIill && this.IiIiliIiiiIi(z, nz, x, i)) {
         this.llIiIIIill = 0;
         double var8 = this.IIlilIliiIli(z, y, x + 2, nx);
         if (!(var8 < Double.longBitsToDouble(-7116327758173798190L ^ -7116327758173798190L))) {
            double var10 = this.IIlilIliiIli(z, nz, (int)(var14 >>> 32) + 1, i);
            if (!(var10 < Double.longBitsToDouble(-7664870287460354267L ^ -7664870287460354267L))) {
               double var12 = this.IIlilIliiIli(z, nz, (int)(var14 >>> 32), i);
               if (!(var12 < Double.longBitsToDouble(-5107024761570940870L ^ -5107024761570940870L))) {
                  this.lIlIliIlIl(
                     z,
                     nz,
                     (int)(var14 >>> 32),
                     i,
                     IllIllllllIlll.IIiiIIiillIiiIIiil,
                     Double.longBitsToDouble(1813905433310992775L ^ 6425591451738380679L) + var8 + var10 + var12
                  );
               }
            }
         }
      }
   }

   private void Iiilliiliiil(int i, int nz, int nx, int dx, int y, int dz) {
      this.llIiIIIill = 0;
      double var7 = this.IIlilIliiIli(i, nx, nz + 1, dx);
      if (!(var7 < 0.0)) {
         double var9 = this.IIlilIliiIli(i, nx, nz, dx);
         if (!(var9 < 0.0)) {
            int var11 = this.IliIIIIill.lIiiIiIlilli() ? Math.max(12, 4) : 4;

            for (int var12 = 1; var12 <= var11; var12++) {
               int var13 = nz - var12;
               if (this.Iliilliiilii(nx, var13, dx)) {
                  return;
               }

               if (this.IliIIIIill.lIiiIiIlilli() && this.Iilililiiili(nx, var13, dx)) {
                  if (var13 >= this.iIIlIIIill && var13 <= this.ilIlIIIill) {
                     this.lIlIliIlIl(i, nx, var13, dx, IllIllllllIlll.iIiiIIiilIliiIIiil, 1.0 + var7 + var9 + 0.3 * (double)var12);
                     return;
                  }

                  return;
               }

               if (this.IiIiliIiiiIi(i, nx, var13, dx)) {
                  if (var12 < 2) {
                     return;
                  }

                  if (var12 > 4) {
                     return;
                  }

                  int var14 = var13 + 1;
                  if (var14 >= this.iIIlIIIill
                     && var14 <= this.ilIlIIIill
                     && !this.lIiIIIIill.iliIiiliiiii(nx, var14, dx)
                     && this.IIIilIIiiIIi(i, nx + y, var14, dx + dz)) {
                     this.lIlIliIlIl(i, nx, var14, dx, IllIllllllIlll.iIiiIIiilIliiIIiil, 1.0 + var7 + var9 + 0.5 * (double)(var12 - 1));
                     return;
                  }

                  return;
               }
            }
         }
      }
   }

   private double IIlilIliiIli(int x, int z, int i, int y) {
      long var5 = class_2338.method_10064(z, i, y);
      if (this.Iliilliiilii(z, i, y)) {
         return Double.longBitsToDouble(-3058366902166307918L ^ 7673711009857584050L);
      } else if (!this.Illillliilli(z, i, y, var5) || this.IiIIlliIIl(x, var5)) {
         return 0.0;
      } else if (!this.Iiiiliiiiiii(z, i, y, var5)) {
         return Double.longBitsToDouble(-7598863059167443246L ^ 2989099664780592850L);
      } else {
         this.IlIiIIIill[this.llIiIIIill++] = var5;
         return this.IIIIllIIIl(z, i, y, var5);
      }
   }
}
