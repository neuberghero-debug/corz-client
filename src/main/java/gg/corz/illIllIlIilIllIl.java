package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class illIllIlIilIllIl {
   private final long[] liiiilIiIl;
   private final int[] lIIIIiIiIl;
   private final long[] IiiiilIiIl;
   private final long[][] IIIIIiIiIl;
   private static final int lliiilIiIl = IIIIiIllIIIiIl.values().length;
   private final long[] iIIIIiIiIl;
   private final long[] iiiiilIiIl;
   private static final int IliiilIiIl = liilIiliiilIil.values().length;
   private static final int iliiilIiIl = 256;

   public void IIlllIlliIll() {
      long var5 = -7763096006674334241L;
      Arrays.fill(this.IiiiilIiIl, 0L);
      Arrays.fill(this.liiiilIiIl, 0L);
      Arrays.fill(this.iiiiilIiIl, 0L);
      Arrays.fill(this.lIIIIiIiIl, 0);
      Arrays.fill(this.iIIIIiIiIl, 0L);
      long[][] var1 = this.IIIIIiIiIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         long[] var4 = var1[(int)var8];
         Arrays.fill(var4, 0L);
      }
   }

   public void IilliliilIIi(IIIIiIllIIIiIl c) {
      this.iIIIIiIiIl[c.ordinal()]++;
   }

   public List<String> IIillIiliIil() {
      long var9 = -4899918509550121709L;
      long var11 = -8373109388757153968L;
      ArrayList var1 = new ArrayList();
      Integer[] var2 = new Integer[IliiilIiIl];

      for (var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < IliiilIiIl; var9 += 4294967296L) {
         var2[(int)(var9 >>> 32)] = (int)(var9 >>> 32);
      }

      Arrays.sort(var2, (b, a) -> Long.compare(this.liiiilIiIl[a], this.liiiilIiIl[b]));
      Integer[] var3 = var2;
      var9 ^= ((long)var2.length ^ var9) & -1L >>> 32;
      var11 ^= (0L ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) < (int)var9) {
         var11 ^= ((long)var3[(int)(var11 >>> 32)].intValue() ^ var11) & -1L >>> 32;
         if (this.IiiiilIiIl[(int)var11] != 0L) {
            long var7 = this.liiiilIiIl[(int)var11] / this.IiiiilIiIl[(int)var11];
            var1.add(
               String.format(
                  Locale.ROOT,
                  Iiilliiliiil<"Iiilliiliiil","+5b599aekeVzKMA3XQkFVh6/WerLfEn+istTte9uNjHrCR2nzXiFpOS5DVjOSI7CpZTwGRxYaLYiEKjHmVlRIdm0CjTBMiVRRuwlN6gWTLV6iPRMYQ==">(),
                  liilIiliiilIil.values()[(int)var11],
                  this.IiiiilIiIl[(int)var11],
                  this.liiiilIiIl[(int)var11] / 1000000L,
                  Iilllilliill(var7),
                  Iilllilliill(this.Illlllllilll((int)var11, 0.5)),
                  Iilllilliill(this.Illlllllilll((int)var11, 0.95)),
                  Iilllilliill(this.Illlllllilll((int)var11, 0.99)),
                  Iilllilliill(this.iiiiilIiIl[(int)var11])
               )
            );
         }

         var11 += 4294967296L;
      }

      StringBuilder var13 = new StringBuilder(Iiilliiliiil<"Iiilliiliiil","pum2RzyBOp9TzPsBJ256LChpAWzjGll4XNmBrWiV7+Q=">());
      IIIIiIllIIIiIl[] var4 = IIIIiIllIIIiIl.values();
      var11 ^= ((long)var4.length << 32 ^ var11) & -1L << 32;

      for (long var20 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         IIIIiIllIIIiIl var14 = var4[(int)var20];
         if (this.iIIIIiIiIl[var14.ordinal()] != 0L) {
            var13.append(' ').append(var14).append('=').append(this.iIIIIiIiIl[var14.ordinal()]);
         }
      }

      if (var13.length() > 4) {
         var1.add(var13.toString());
      }

      return var1;
   }

   public illIllIlIilIllIl() {
      this.IiiiilIiIl = new long[IliiilIiIl];
      this.liiiilIiIl = new long[IliiilIiIl];
      this.iiiiilIiIl = new long[IliiilIiIl];
      this.IIIIIiIiIl = new long[IliiilIiIl][256];
      this.lIIIIiIiIl = new int[IliiilIiIl];
      this.iIIIIiIiIl = new long[lliiilIiIl];
   }

   public void iIlIlllllill(IIIIiIllIIIiIl c, long n) {
      this.iIIIIiIiIl[c.ordinal()] += n;
   }

   public long IliIlllilIi() {
      return System.nanoTime();
   }

   public long lIiiIiIlilli(liilIiliiilIil p) {
      return this.IiiiilIiIl[p.ordinal()];
   }

   private static String Iilllilliill(long ns) {
      return ns >= 1000000L
         ? ns / 1000000L + Iiilliiliiil<"Iiilliiliiil","jF7QsR0GMSN7zM1PnkZT606CJ1uczKAKfp/LtcLA">()
         : String.format(Locale.ROOT, Iiilliiliiil<"Iiilliiliiil","UE9RI/rKxk5ThoJpa4tgYeEmESTRsDUd9pev9H1f5qN2LQ==">(), (double)ns / 1000000.0);
   }

   public long IIIllIIliIIl(liilIiliiilIil p) {
      return this.iiiiilIiIl[p.ordinal()] / 1000000L;
   }

   private long Illlllllilll(int phase, double p) {
      long var6 = -2687137956739549651L;
      var6 ^= ((long)Math.min(this.lIIIIiIiIl[phase], 256) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) == 0) {
         return 0L;
      } else {
         long[] var5 = Arrays.copyOf(this.IIIIIiIiIl[phase], (int)(var6 >>> 32));
         Arrays.sort(var5);
         return var5[Math.min((int)(var6 >>> 32) - 1, (int)Math.floor(p * (double)((int)(var6 >>> 32))))];
      }
   }

   public void liiiIIllIl(liilIiliiilIil token, long phase) {
      long var7 = 8029425880322866131L;
      long var4 = System.nanoTime() - phase;
      var7 ^= ((long)token.ordinal() << 32 ^ var7) & -1L << 32;
      this.IiiiilIiIl[(int)(var7 >>> 32)]++;
      this.liiiilIiIl[(int)(var7 >>> 32)] = this.liiiilIiIl[(int)(var7 >>> 32)] + var4;
      if (var4 > this.iiiiilIiIl[(int)(var7 >>> 32)]) {
         this.iiiiilIiIl[(int)(var7 >>> 32)] = var4;
      }

      this.IIIIIiIiIl[(int)(var7 >>> 32)][this.lIIIIiIiIl[(int)(var7 >>> 32)]++ & 0xFF] = var4;
   }

   public long iliIiiliiiii(liilIiliiilIil p) {
      return this.liiiilIiIl[p.ordinal()] / 1000000L;
   }

   public long IlIlllIlilIl(liilIiliiilIil q, double p) {
      return this.Illlllllilll(q.ordinal(), p) / 1000000L;
   }

   public long IiIlliIliiIl(IIIIiIllIIIiIl c) {
      return this.iIIIIiIiIl[c.ordinal()];
   }
}
