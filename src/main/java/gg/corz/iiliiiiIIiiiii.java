package gg.corz;

import java.util.Arrays;
import java.util.Locale;

public final class iiliiiiIIiiiii {
   public static final int IIIIilIlIl = 2048;
   public static final long lIIIilIlIl = 50000L;
   private long liIIilIlIl;
   private long llIIilIlIl;
   private long lllIilIlIl;
   private long IllIilIlIl;
   private final long[] iIIIilIlIl = new long[2048];
   private int IlIIilIlIl;
   private long lIlIilIlIl;
   private long iIlIilIlIl;
   private long IiIIilIlIl;
   private int ilIIilIlIl;
   private long IIlIilIlIl;
   private long iiIIilIlIl;

   public iiliiiiIIiiiii() {
      this.llIIilIlIl = Long.MIN_VALUE;
      this.ilIIilIlIl = Integer.MIN_VALUE;
      this.iIlIilIlIl = Long.MAX_VALUE;
   }

   public long IIIllIIliIIl() {
      return this.iIlIilIlIl == Long.MAX_VALUE ? 0L : this.iIlIilIlIl;
   }

   public long lIiiIiIlilli() {
      return this.liIIilIlIl;
   }

   public long IilliliilIIi() {
      return this.IiIIilIlIl;
   }

   public void IliIlllilIi(int rotationChanged, long tickId, boolean positionChanged, boolean nanos, boolean onGroundChanged) {
      this.IiIIilIlIl++;
      if (rotationChanged == this.ilIIilIlIl) {
         this.liIIilIlIl++;
      }

      this.ilIIilIlIl = rotationChanged;
      if (positionChanged) {
         this.iiIIilIlIl++;
      }

      if (nanos) {
         this.IIlIilIlIl++;
      }

      if (onGroundChanged) {
         this.lIlIilIlIl++;
      }

      if (this.llIIilIlIl != Long.MIN_VALUE) {
         long var7 = Math.max(0L, (tickId - this.llIIilIlIl) / 1000L);
         this.iIIIilIlIl[Math.floorMod(this.IlIIilIlIl, 2048)] = var7;
         this.IlIIilIlIl++;
         if (var7 < this.iIlIilIlIl) {
            this.iIlIilIlIl = var7;
         }

         if (var7 > this.IllIilIlIl) {
            this.IllIilIlIl = var7;
         }

         if (var7 < 40000L) {
            this.lllIilIlIl++;
         }
      }

      this.llIIilIlIl = tickId;
   }

   public void IIlllIlliIll() {
      Arrays.fill(this.iIIIilIlIl, 0L);
      this.IlIIilIlIl = 0;
      this.llIIilIlIl = Long.MIN_VALUE;
      this.ilIIilIlIl = Integer.MIN_VALUE;
      this.IiIIilIlIl = this.liIIilIlIl = this.iiIIilIlIl = this.IIlIilIlIl = this.lIlIilIlIl = 0L;
      this.iIlIilIlIl = Long.MAX_VALUE;
      this.IllIilIlIl = 0L;
      this.lllIilIlIl = 0L;
   }

   public double IiIlliIliiIl() {
      long var9 = 7420189025009193275L;
      long[] var1 = this.liiiIIllIl();
      if (var1.length == 0) {
         return 0.0;
      } else {
         long var2 = 0L;
         long[] var4 = var1;
         var9 ^= ((long)var1.length << 32 ^ var9) & -1L << 32;

         for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            long var7 = var4[(int)var12];
            var2 += var7;
         }

         return var2 == 0L ? 0.0 : (double)var1.length / ((double)var2 / 1000000.0);
      }
   }

   private long[] liiiIIllIl() {
      long var3 = 1095051725881902508L;
      var3 ^= ((long)Math.min(this.IlIIilIlIl, 2048) << 32 ^ var3) & -1L << 32;
      long[] var2 = Arrays.copyOf(this.iIIIilIlIl, (int)(var3 >>> 32));
      Arrays.sort(var2);
      return var2;
   }

   public String Illlllllilll() {
      return String.format(
         Locale.ROOT,
         Iilllilliill<"Iilllilliill","nP4y2eda0/gQFj4MAQYDlGmVynY6oh4/W6Vtt4p/NE+H7pXCXb6ai93nTMyi6XVfkSGuhqlNjTN20Hv+uTjmSDraw7ylk0Cs6rQq9BbMaLJjZlvLSWpz/Gmz4gp/taXuoDdwsxZ5NbC74nqn0Hhc9iyhWe5Lalkxq99ffMaOg8+QfIUeBRrE9j0XDG9DEkXvT3SmeNL8qqLNsP+B0JZqw4QLzzWlGa6FCRi14PUoSTEQhXrkPWnbEJofZblvB7Gb3XldcLf+hucmYbftBTX9h28=">(),
         this.IiIIilIlIl,
         this.IiIlliIliiIl(),
         this.IIIllIIliIIl(),
         this.iIlIlllllill(1.0),
         this.iIlIlllllill(50.0),
         this.iIlIlllllill(99.0),
         this.IlIlllIlilIl(),
         this.liIIilIlIl,
         this.lllIilIlIl,
         this.iiIIilIlIl,
         this.IIlIilIlIl,
         this.lIlIilIlIl
      );
   }

   public long iIlIlllllill(double p) {
      long var5 = -2110223951863500022L;
      long[] var3 = this.liiiIIllIl();
      if (var3.length == 0) {
         return 0L;
      } else {
         var5 ^= ((long)((int)Math.round(p / 100.0 * (double)(var3.length - 1))) << 32 ^ var5) & -1L << 32;
         return var3[Math.max(0, Math.min(var3.length - 1, (int)(var5 >>> 32)))];
      }
   }

   public long IlIlllIlilIl() {
      return this.IllIilIlIl;
   }

   public long iliIiiliiiii() {
      return this.lllIilIlIl;
   }
}
