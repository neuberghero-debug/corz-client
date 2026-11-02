package gg.corz;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map.Entry;

public final class lIIiiIlliIIiiIll {
   private long IiIiIiilll;
   public static final int lIIiIiilll = 512;
   private static final int iiilIiilll = 5;
   private static final IIIIIlIilIIIIlIi[] IIIiIiilll = IIIIIlIilIIIIlIi.values();
   private final long[] IlIiIiilll;
   private static final iIilIlIlIlilIlIl[] liilIiilll = iIilIlIlIlilIlIl.values();
   private final long[] iIIiIiilll = new long[liilIiilll.length];
   private final long[] llIiIiilll;
   private final LinkedHashMap<Integer, Long> ilIiIiilll;

   public void IIIllIIliIIl(int planEpoch) {
      this.ilIiIiilll.merge(Integer.valueOf(planEpoch), Long.valueOf(1L), Long::sum);

      while (this.ilIiIiilll.size() > 512) {
         Iterator var2 = this.ilIiIiilll.entrySet().iterator();
         this.IiIiIiilll = this.IiIiIiilll + (Long)((Entry)var2.next()).getValue();
         var2.remove();
      }
   }

   public long IiIlliIliiIl(IIIIIlIilIIIIlIi o) {
      return o == null ? 0L : this.llIiIiilll[o.ordinal()];
   }

   public void IliIlllilIi(iIilIlIlIlilIlIl b) {
      if (b == null) {
         b = iIilIlIlIlilIlIl.lliiiiilIl;
      }

      this.iIIiIiilll[b.ordinal()]++;
      this.IlIiIiilll[b.ordinal()]++;
   }

   public String IIIilIIiiIIi() {
      return IIlilIliiIli(this.IlIiIiilll);
   }

   public long liiiIIllIl(iIilIlIlIlilIlIl b) {
      return b == null ? 0L : this.iIIiIiilll[b.ordinal()];
   }

   private static long IlIillIiilIi(long[] c) {
      long var8 = 7097444114085927597L;
      long var1 = 0L;
      long[] var3 = c;
      var8 ^= ((long)c.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         var1 += var6;
      }

      return var1;
   }

   public double Illlllllilll() {
      long var8 = -6206645873756113285L;
      long var1 = this.IIlllIlliIll();
      long[] var3 = this.llIiIiilll;
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         var1 += var6;
      }

      return var1 <= 0L ? 0.0 : (double)this.llIiIiilll[IIIIIlIilIIIIlIi.IIIIiiiiil.ordinal()] / (double)var1;
   }

   public long lIiiIiIlilli() {
      return IiIiliIiiiIi(this.iIIiIiilll);
   }

   public void IlIlllIlilIl(int planEpoch, IIIIIlIilIIIIlIi o) {
      if (o != null) {
         Long var3 = this.ilIiIiilll.remove(Integer.valueOf(planEpoch));
         if (var3 != null) {
            this.llIiIiilll[o.ordinal()] += var3;
         }
      }
   }

   public lIIiiIlliIIiiIll() {
      this.IlIiIiilll = new long[liilIiilll.length];
      this.llIiIiilll = new long[IIIiIiilll.length];
      this.ilIiIiilll = new LinkedHashMap<>();
   }

   public String Ililllililil() {
      return IIlilIliiIli(this.iIIiIiilll);
   }

   public double iliIiiliiiii() {
      long var1 = this.IilliliilIIi();
      return var1 <= 0L ? 0.0 : (double)this.lIiiIiIlilli() / (double)var1;
   }

   public long IilliliilIIi() {
      return IlIillIiilIi(this.iIIiIiilll);
   }

   public void Iiilliiliiil() {
      Arrays.fill(this.IlIiIiilll, 0L);
   }

   public String IIillIiliIil() {
      return String.format(
         Locale.ROOT,
         Illillliilli<"Illillliilli","CvYXrPmHK6dnkEQR1cEA4HhJUGL5sIj0p/8pIV4+DPC2xJ46oR1tBoD6NMjcGyvnLcrZZKzBqMkMHpyBJUuMtWKdyrR4FyeO8YoK6w139YunHQ6EAvQAGNkuQFx/J6Azzc4GC8zVF/JaO5vcBDsWy+KhwCMDtuxaFQv13gIY/RqO5+0QflzRO9w5ohSCWp6wyTFim3iRBoRJvyfRZoVfkX887VZLBE7o6lMmYXogRrok9DL8msho0LCrq3TcpdfiI5gMCYV51Zhx0Tji+W+Nj8G6sHyl+KogAdY=">(),
         this.Illlllllilll(),
         this.llIiIiilll[IIIIIlIilIIIIlIi.IIIIiiiiil.ordinal()],
         this.llIiIiilll[IIIIIlIilIIIIlIi.lIIIiiiiil.ordinal()],
         this.llIiIiilll[IIIIIlIilIIIIlIi.iIIIiiiiil.ordinal()],
         this.llIiIiilll[IIIIIlIilIIIIlIi.IlIIiiiiil.ordinal()],
         this.llIiIiilll[IIIIIlIilIIIIlIi.llIIiiiiil.ordinal()],
         this.IIlllIlliIll()
      );
   }

   public long IIlllIlliIll() {
      long var1 = this.IiIiIiilll;

      for (long var4 : this.ilIiIiilll.values()) {
         var1 += var4;
      }

      return var1;
   }

   private static String IIlilIliiIli(long[] c) {
      long var1 = IlIillIiilIi(c);
      double var3 = var1 <= 0L ? 0.0 : (double)IiIiliIiiiIi(c) / (double)var1;
      return String.format(
         Locale.ROOT,
         Illillliilli<"Illillliilli","mCK8JWhY4AxSNqrwU0Q9Kr0UlDGxYvtHeybguD3eIOwr3JXM/3YG6elGAIQdGkp8iHAun6TiuUUENY3OyqIxCbH06L9sfrORF1hye7iqEQSWqCAPRtI1C1Bn20JzorD5FOVjHnTsgnbeqgCKtlywer2/6Dj0QoblE69QppcFWk/LxujYctEAvfM78aSfs+tNg+MjmI4GqCkEFD4vzlZMOk3YTQPZvA==">(),
         var3,
         c[iIilIlIlIlilIlIl.illiiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.IiliiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.liliiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.iiliiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.IIiiiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.lIiiiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.iIiiiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.IliiiiilIl.ordinal()],
         c[iIilIlIlIlilIlIl.lliiiiilIl.ordinal()],
         var1
      );
   }

   public long iIlIlllllill(iIilIlIlIlilIlIl b) {
      return b == null ? 0L : this.IlIiIiilll[b.ordinal()];
   }

   public void Iilllilliill() {
      this.ilIiIiilll.clear();
      Arrays.fill(this.llIiIiilll, 0L);
      this.IiIiIiilll = 0L;
   }

   private static long IiIiliIiiiIi(long[] c) {
      long var4 = 6230273460812978977L;
      long var1 = 0L;

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 5; var6 += 4294967296L) {
         var1 += c[(int)(var6 >>> 32)];
      }

      return var1;
   }
}
