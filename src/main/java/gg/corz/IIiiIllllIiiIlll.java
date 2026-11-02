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

final class IIiiIllllIiiIlll {
   private long[] iilIllIill;
   private final int IIIIllIill;
   private int lIIlllIill;
   private double[] IilIllIill;
   private double[] iliIllIill;
   private final iIlIllIllIll lliiIlIill;
   private int[] iIlIllIill;
   private byte[] IIiIllIill;
   private final Long2FloatOpenHashMap IIlIllIill;
   private int[] lliIllIill;
   private long[][] lIiIllIill;
   private final int lIIIllIill;
   private final Long2ByteOpenHashMap iiIIllIill;
   private final Long2IntOpenHashMap liIIllIill = new Long2IntOpenHashMap();
   private final int llIIllIill;
   private final int iiiiIlIill;
   private boolean[] iIiIllIill;
   private int iiiIllIill;
   private int[] lilIllIill;
   private int lIlIllIill;
   private final long[] IIIlllIill;
   private final boolean IiiiIlIill;
   private final int IiIIllIill;
   private final int iIIIllIill;
   private final int IlIIllIill;
   private double[] illIllIill;
   private final Predicate<class_2338> iliiIlIill;
   private double[] IiiIllIill;
   private int[] IliIllIill;
   private int[] lllIllIill;
   private final int liiiIlIill;
   private int[] IllIllIill;
   private int liiIllIill;
   private final int ilIIllIill;

   IIiiIllllIiiIlll(iIlIllIllIll g, Predicate<class_2338> min, class_2338 hint, class_2338 max, class_2338 goal) {
      this.iiIIllIill = new Long2ByteOpenHashMap(4096);
      this.IIlIllIill = new Long2FloatOpenHashMap();
      this.iIlIllIill = new int[1024];
      this.IllIllIill = new int[1024];
      this.lllIllIill = new int[1024];
      this.illIllIill = new double[1024];
      this.IilIllIill = new double[1024];
      this.lilIllIill = new int[1024];
      this.iilIllIill = new long[1024];
      this.IIiIllIill = new byte[1024];
      this.lIiIllIill = new long[1024][];
      this.iIiIllIill = new boolean[1024];
      this.IliIllIill = new int[1024];
      this.lliIllIill = new int[1024];
      this.iliIllIill = new double[1024];
      this.IiiIllIill = new double[1024];
      this.IIIlllIill = new long[3];
      this.lliiIlIill = g;
      this.iliiIlIill = min;
      this.IiiiIlIill = hint != null;
      this.liiiIlIill = this.IiiiIlIill ? hint.method_10263() : 0;
      this.iiiiIlIill = this.IiiiIlIill ? hint.method_10264() : 0;
      this.IIIIllIill = this.IiiiIlIill ? hint.method_10260() : 0;
      this.lIIIllIill = Math.min(max.method_10263(), goal.method_10263());
      this.iIIIllIill = Math.min(max.method_10264(), goal.method_10264());
      this.IlIIllIill = Math.min(max.method_10260(), goal.method_10260());
      this.llIIllIill = Math.max(max.method_10263(), goal.method_10263());
      this.ilIIllIill = Math.max(max.method_10264(), goal.method_10264());
      this.IiIIllIill = Math.max(max.method_10260(), goal.method_10260());
      this.liIIllIill.defaultReturnValue(-1);
      this.IIlIllIill.defaultReturnValue(-1.0F);
   }

   private void IiIiliIiiiIi(int b, int a) {
      long var9 = 4724076164506298561L;
      var9 ^= ((long)this.IliIllIill[b] << 32 ^ var9) & -1L << 32;
      this.IliIllIill[b] = this.IliIllIill[a];
      this.IliIllIill[a] = (int)(var9 >>> 32);
      var9 ^= ((long)this.lliIllIill[b] ^ var9) & -1L >>> 32;
      this.lliIllIill[b] = this.lliIllIill[a];
      this.lliIllIill[a] = (int)var9;
      double var5 = this.iliIllIill[b];
      this.iliIllIill[b] = this.iliIllIill[a];
      this.iliIllIill[a] = var5;
      double var7 = this.IiiIllIill[b];
      this.IiiIllIill[b] = this.IiiIllIill[a];
      this.IiiIllIill[a] = var7;
   }

   private boolean IIIllIIliIIl(int z, int y, int x, int i) {
      long var5 = class_2338.method_10064(y, x, i);
      return this.IiIlliIliiIl(y, x, i, var5) && !this.Iilllilliill(z, var5);
   }

   private boolean IiIlliIliiIl(int key, int z, int y, long x) {
      long var7 = -8792031043901042984L;
      var7 ^= ((long)this.iiIIllIill.get(x) << 32 ^ var7) & -1L << 32;
      if (((int)(var7 >>> 32) & 1) == 0) {
         var7 ^= ((long)((byte)((int)(var7 >>> 32) | (this.lliiIlIill.IliIlllilIi(key, z, y) ? 3 : 1))) << 32 ^ var7) & -1L << 32;
         this.iiIIllIill.put(x, (byte)((int)(var7 >>> 32)));
      }

      return ((int)(var7 >>> 32) & 2) != 0;
   }

   private void Ililllililil(int from, int x, int cost, int z, lIIIiiIIIi mv, double y) {
      double var8 = this.illIllIill[from] + y;
      long var10 = class_2338.method_10064(x, cost, z);
      int var12 = this.liIIllIill.get(var10);
      if (var12 < 0) {
         var12 = this.Iiilliiliiil(x, cost, z, var10);
      } else if (var8 >= this.illIllIill[var12] - 1.0E-9) {
         return;
      }

      long var13 = this.iilIllIill[from];

      for (int var15 = 0; var15 < this.lIIlllIill; var15++) {
         var13 |= lIiIilIliIiIilIl.IilliliilIIi(this.IIIlllIill[var15]);
      }

      this.illIllIill[var12] = var8;
      this.lilIllIill[var12] = from;
      this.IIiIllIill[var12] = (byte)mv.ordinal();
      this.lIiIllIill[var12] = this.lIIlllIill == 0 ? null : Arrays.copyOf(this.IIIlllIill, this.lIIlllIill);
      this.iilIllIill[var12] = var13;
      this.iIiIllIill[var12] = false;
      this.IIlilIliiIli(var12);
   }

   private void IilliliilIIi(int nz, int x, int i, int nx, int z, int y) {
      long var14 = 3935540298750623669L;
      var14 ^= ((long)(i + 1) << 32 ^ var14) & -1L << 32;
      if ((int)(var14 >>> 32) >= this.iIIIllIill && (int)(var14 >>> 32) <= this.ilIIllIill && this.IIIllIIliIIl(nz, z, i, y)) {
         this.lIIlllIill = 0;
         double var8 = this.IlIlllIlilIl(nz, x, i + 2, nx);
         if (!(var8 < Double.longBitsToDouble(-8845206337405316121L ^ -8845206337405316121L))) {
            double var10 = this.IlIlllIlilIl(nz, z, (int)(var14 >>> 32) + 1, y);
            if (!(var10 < Double.longBitsToDouble(-2202726756542191476L ^ -2202726756542191476L))) {
               double var12 = this.IlIlllIlilIl(nz, z, (int)(var14 >>> 32), y);
               if (!(var12 < Double.longBitsToDouble(2662457004702363998L ^ 2662457004702363998L))) {
                  this.Ililllililil(
                     nz,
                     z,
                     (int)(var14 >>> 32),
                     y,
                     lIIIiiIIIi.IIIiililIIiili,
                     Double.longBitsToDouble(-4782508979756553746L ^ -170822961329165842L) + var8 + var10 + var12
                  );
               }
            }
         }
      }
   }

   IlIIiIillIIiIi IliIlllilIi(class_2338 maxExpanded, int start) {
      int var3 = this.Iiilliiliiil(maxExpanded.method_10263(), maxExpanded.method_10264(), maxExpanded.method_10260(), maxExpanded.method_10063());
      this.illIllIill[var3] = 0.0;
      this.lilIllIill[var3] = -1;
      this.IIiIllIill[var3] = -1;
      this.IIlilIliiIli(var3);
      int var4 = 0;
      int var5 = var3;

      while (this.liiIllIill > 0) {
         int var6 = this.IliIllIill[0];
         double var7 = this.iliIllIill[0];
         this.Illillliilli();
         if (!this.iIiIllIill[var6] && var7 == this.illIllIill[var6] + this.IilIllIill[var6]) {
            if (this.iliiIlIill.test(new class_2338(this.iIlIllIill[var6], this.IllIllIill[var6], this.lllIllIill[var6]))) {
               return new IlIIiIillIIiIi(this.IIIilIIiiIIi(var6), true, var4);
            }

            if (var4 >= start) {
               break;
            }

            this.iIiIllIill[var6] = true;
            var4++;
            if (this.IilIllIill[var6] < this.IilIllIill[var5]
               || this.IilIllIill[var6] == this.IilIllIill[var5] && this.illIllIill[var6] < this.illIllIill[var5]) {
               var5 = var6;
            }

            this.liiiIIllIl(var6);
         }
      }

      return new IlIIiIillIIiIi(this.IIIilIIiiIIi(var5), false, var4);
   }

   private void lIiiIiIlilli(int y, int nx, int nz, int i) {
      this.lIIlllIill = 0;
      double var5 = this.IlIlllIlilIl(y, nz, nx + 1, i);
      if (!(var5 < 0.0)) {
         double var7 = this.IlIlllIlilIl(y, nz, nx, i);
         if (!(var7 < 0.0)) {
            for (int var9 = 2; var9 <= 4; var9++) {
               if (this.IIIllIIliIIl(y, nz, nx - var9, i)) {
                  int var10 = nx - var9 + 1;
                  if (var10 >= this.iIIIllIill && var10 <= this.ilIIllIill) {
                     this.Ililllililil(y, nz, var10, i, lIIIiiIIIi.iIIiiliIlIiili, 1.0 + var5 + var7 + 0.5 * (double)(var9 - 1));
                  }

                  return;
               }
            }
         }
      }
   }

   private void iliIiiliiiii(int z, int y, int x, int i) {
      if (y >= this.lIIIllIill && y <= this.llIIllIill && i >= this.IlIIllIill && i <= this.IiIIllIill) {
         long var5 = class_2338.method_10064(y, x - 1, i);
         if (this.IIIllIIliIIl(z, y, x - 1, i) && this.IIlllIlliIll(y, x - 1, i, var5)) {
            double var7 = this.Illlllllilll(y, x - 1, i, var5);

            for (int var9 = 2; var9 <= 5; var9++) {
               if (this.IIIllIIliIIl(z, y, x - var9, i)) {
                  int var10 = x - var9 + 1;
                  if (var10 >= this.iIIIllIill && var10 <= this.ilIIllIill) {
                     this.lIIlllIill = 0;
                     this.IIIlllIill[this.lIIlllIill++] = var5;
                     this.Ililllililil(z, y, var10, i, lIIIiiIIIi.llIiiliilIiili, 2.0 + var7 + 0.5 * (double)(var9 - 1));
                     return;
                  }

                  return;
               }
            }
         }
      }
   }

   private double Illlllllilll(int y, int key, int z, long x) {
      float var6 = this.IIlIllIill.get(x);
      if (var6 < 0.0F) {
         var6 = Math.max(1.0F, this.lliiIlIill.iIlIlllllill(y, key, z));
         this.IIlIllIill.put(x, var6);
      }

      return (double)var6;
   }

   private boolean IIlllIlliIll(int z, int x, int key, long y) {
      long var7 = -2833775258651884450L;
      var7 ^= ((long)this.iiIIllIill.get(y) << 32 ^ var7) & -1L << 32;
      if (((int)(var7 >>> 32) & 4) == 0) {
         var7 ^= (
               (long)((byte)((int)(var7 >>> 32) | (this.lliiIlIill.liiiIIllIl(z, x, key) ? -(-(-1069075636 >>> 15 | -1069075636 << 17)) - 79 ^ 1721335859 : 4)))
                     << 32
                  ^ var7
            )
            & -1L << 32;
         this.iiIIllIill.put(y, (byte)((int)(var7 >>> 32)));
      }

      return ((int)(var7 >>> 32) & (2144492066 * 103 * 7 * 1857283155 ^ 232415726)) != 0;
   }

   private void liiiIIllIl(int i) {
      int var2 = this.iIlIllIill[i];
      int var3 = this.IllIllIill[i];
      int var4 = this.lllIllIill[i];

      for (int var5 = 0; var5 < 4; var5++) {
         int var6 = var2 + lIiIilIliIiIilIl.lillillIll[var5];
         int var7 = var4 + lIiIilIliIiIilIl.iillillIll[var5];
         if (var6 >= this.lIIIllIill && var6 <= this.llIIllIill && var7 >= this.IlIIllIill && var7 <= this.IiIIllIill) {
            boolean var8 = this.IIIllIIliIIl(i, var6, var3 - 1, var7);
            if (var8) {
               this.iIlIlllllill(i, var3, var6, var7);
            }

            this.IilliliilIIi(i, var2, var3, var4, var6, var7);
            if (!var8) {
               this.lIiiIiIlilli(i, var3, var6, var7);
            }
         }
      }

      this.iliIiiliiiii(i, var2, var3, var4);
   }

   private List<llIiiiililIiiiil> IIIilIIiiIIi(int i) {
      ArrayList var2 = new ArrayList();
      int var3 = i;

      while (this.lilIllIill[var3] >= 0) {
         long[] var4 = this.lIiIllIill[var3];
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

         var2.add(
            new llIiiiililIiiiil(
               new class_2338(this.iIlIllIill[var3], this.IllIllIill[var3], this.lllIllIill[var3]), lIiIilIliIiIilIl.IIilillIll[this.IIiIllIill[var3]], var5
            )
         );
         var3 = this.lilIllIill[var3];
      }

      Collections.reverse(var2);
      return List.copyOf(var2);
   }

   private void Illillliilli() {
      int var1 = --this.liiIllIill;
      if (var1 != 0) {
         this.IliIllIill[0] = this.IliIllIill[var1];
         this.lliIllIill[0] = this.lliIllIill[var1];
         this.iliIllIill[0] = this.iliIllIill[var1];
         this.IiiIllIill[0] = this.IiiIllIill[var1];
         int var2 = 0;

         while (true) {
            int var3 = 2 * var2 + 1;
            if (var3 >= this.liiIllIill) {
               break;
            }

            int var4 = var3 + 1;
            int var5 = var4 < this.liiIllIill && this.IlIillIiilIi(var4, var3) ? var4 : var3;
            if (!this.IlIillIiilIi(var5, var2)) {
               break;
            }

            this.IiIiliIiiiIi(var2, var5);
            var2 = var5;
         }
      }
   }

   private boolean Iilllilliill(int i, long key) {
      long var4 = lIiIilIliIiIilIl.IilliliilIIi(key);
      int var6 = i;

      while (var6 >= 0 && (this.iilIllIill[var6] & var4) != 0L) {
         long[] var7 = this.lIiIllIill[var6];
         if (var7 != null) {
            for (long var11 : var7) {
               if (var11 == key) {
                  return true;
               }
            }
         }

         var6 = this.lilIllIill[var6];
      }

      return false;
   }

   private double IlIlllIlilIl(int x, int z, int y, int i) {
      long var5 = class_2338.method_10064(z, y, i);
      if (!this.IiIlliIliiIl(z, y, i, var5) || this.Iilllilliill(x, var5)) {
         return 0.0;
      } else if (!this.IIlllIlliIll(z, y, i, var5)) {
         return Double.longBitsToDouble(7274649784288654870L ^ -2664794593318029802L);
      } else {
         this.IIIlllIill[this.lIIlllIill++] = var5;
         return this.Illlllllilll(z, y, i, var5);
      }
   }

   private double IIillIiliIil(int y, int x, int z) {
      long var6 = -5045732764479235855L;
      if (!this.IiiiIlIill) {
         return 0.0;
      } else {
         var6 ^= ((long)(Math.abs(this.liiiIlIill - y) + Math.abs(this.IIIIllIill - z)) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)(this.iiiiIlIill - x) ^ var6) & -1L >>> 32;
         if ((int)var6 > 0) {
            return (double)(Math.max((int)(var6 >>> 32), (int)var6) + (int)var6);
         } else {
            return (int)var6 < 0
               ? (double)Math.max((int)(var6 >>> 32), (-((int)var6) + 4 - 1) / 4)
                  + Double.longBitsToDouble(1102058514020730284L ^ 3506980715036575148L) * (double)(-((int)var6))
               : (double)((int)(var6 >>> 32));
         }
      }
   }

   private int Iiilliiliiil(int x, int key, int z, long y) {
      long var7 = 3976355509232490863L;
      if (this.lIlIllIill == this.iIlIllIill.length) {
         var7 ^= ((long)(this.lIlIllIill * 2) << 32 ^ var7) & -1L << 32;
         this.iIlIllIill = Arrays.copyOf(this.iIlIllIill, (int)(var7 >>> 32));
         this.IllIllIill = Arrays.copyOf(this.IllIllIill, (int)(var7 >>> 32));
         this.lllIllIill = Arrays.copyOf(this.lllIllIill, (int)(var7 >>> 32));
         this.illIllIill = Arrays.copyOf(this.illIllIill, (int)(var7 >>> 32));
         this.IilIllIill = Arrays.copyOf(this.IilIllIill, (int)(var7 >>> 32));
         this.lilIllIill = Arrays.copyOf(this.lilIllIill, (int)(var7 >>> 32));
         this.iilIllIill = Arrays.copyOf(this.iilIllIill, (int)(var7 >>> 32));
         this.IIiIllIill = Arrays.copyOf(this.IIiIllIill, (int)(var7 >>> 32));
         this.lIiIllIill = Arrays.copyOf(this.lIiIllIill, (int)(var7 >>> 32));
         this.iIiIllIill = Arrays.copyOf(this.iIiIllIill, (int)(var7 >>> 32));
      }

      var7 ^= ((long)(this.lIlIllIill++) << 32 ^ var7) & -1L << 32;
      this.iIlIllIill[(int)(var7 >>> 32)] = x;
      this.IllIllIill[(int)(var7 >>> 32)] = key;
      this.lllIllIill[(int)(var7 >>> 32)] = z;
      this.illIllIill[(int)(var7 >>> 32)] = Double.longBitsToDouble(1350331599218490021L ^ 7877544037263656282L);
      this.IilIllIill[(int)(var7 >>> 32)] = this.IIillIiliIil(x, key, z);
      this.liIIllIill.put(y, (int)(var7 >>> 32));
      return (int)(var7 >>> 32);
   }

   private void IIlilIliiIli(int node) {
      if (this.liiIllIill == this.IliIllIill.length) {
         int var2 = this.liiIllIill * 2;
         this.IliIllIill = Arrays.copyOf(this.IliIllIill, var2);
         this.lliIllIill = Arrays.copyOf(this.lliIllIill, var2);
         this.iliIllIill = Arrays.copyOf(this.iliIllIill, var2);
         this.IiiIllIill = Arrays.copyOf(this.IiiIllIill, var2);
      }

      int var4 = this.liiIllIill++;
      this.IliIllIill[var4] = node;
      this.lliIllIill[var4] = this.iiiIllIill++;
      this.iliIllIill[var4] = this.illIllIill[node] + this.IilIllIill[node];
      this.IiiIllIill[var4] = this.IilIllIill[node];

      while (var4 > 0) {
         int var3 = var4 - 1 >>> 1;
         if (!this.IlIillIiilIi(var4, var3)) {
            break;
         }

         this.IiIiliIiiiIi(var4, var3);
         var4 = var3;
      }
   }

   private void iIlIlllllill(int nx, int y, int nz, int i) {
      if (y >= this.iIIIllIill && y <= this.ilIIllIill) {
         this.lIIlllIill = 0;
         double var5 = this.IlIlllIlilIl(nx, nz, y + 1, i);
         if (!(var5 < Double.longBitsToDouble(-1543897099807907262L ^ -1543897099807907262L))) {
            double var7 = this.IlIlllIlilIl(nx, nz, y, i);
            if (!(var7 < Double.longBitsToDouble(8985886383417497953L ^ 8985886383417497953L))) {
               this.Ililllililil(nx, nz, y, i, lIIIiiIIIi.liililiiiilili, 1.0 + var5 + var7);
            }
         }
      }
   }

   private boolean IlIillIiilIi(int b, int a) {
      if (this.iliIllIill[b] != this.iliIllIill[a]) {
         return this.iliIllIill[b] < this.iliIllIill[a];
      } else {
         return this.IiiIllIill[b] != this.IiiIllIill[a] ? this.IiiIllIill[b] < this.IiiIllIill[a] : this.lliIllIill[b] < this.lliIllIill[a];
      }
   }
}
