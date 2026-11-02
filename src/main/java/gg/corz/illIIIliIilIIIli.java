package gg.corz;

import java.io.IOException;

public record illIIIliIilIIIli(short[] samples, int channels, int rate) {
   private final short[] IIIlIlIlIi;
   static final double IlIlIlIlIi = 3.0;
   private final int iIIlIlIlIi;
   private final int lIIlIlIlIi;

   public int Illlllllilll() {
      return this.lIIlIlIlIi;
   }

   public illIIIliIilIIIli iIlIlllllill(int startMs, int lengthMs) {
      long var8 = -7259240782879665966L;
      long var10 = -6605744410543021638L;
      var8 ^= ((long)this.IliIlllilIi() << 32 ^ var8) & -1L << 32;
      var8 ^= (
            (long)lIiiIiIlilli(
                  (int)Math.round((double)startMs * (double)this.iIIlIlIlIi / Double.longBitsToDouble(20679771829272167L ^ 4667479793601314407L)),
                  (int)(var8 >>> 32)
               )
               ^ var8
         )
         & -1L >>> 32;
      var10 ^= (
            (long)lIiiIiIlilli(
                     (int)var8
                        + (int)Math.round((double)lengthMs * (double)this.iIIlIlIlIi / Double.longBitsToDouble(-933405540454627745L ^ -5511103455444203937L)),
                     (int)(var8 >>> 32)
                  )
                  << 32
               ^ var10
         )
         & -1L << 32;
      short[] var6 = new short[((int)(var10 >>> 32) - (int)var8) * this.lIIlIlIlIi];
      System.arraycopy(this.IIIlIlIlIi, (int)var8 * this.lIIlIlIlIi, var6, 0, var6.length);
      illIIIliIilIIIli var7 = new illIIIliIilIIIli(var6, this.lIIlIlIlIi, this.iIIlIlIlIi);
      var7.IilliliilIIi();
      return var7;
   }

   public int Iilllilliill() {
      return this.iIIlIlIlIi;
   }

   private static short[] iliIiiliiiii(byte[] size, int off, int d, int bits) {
      switch (bits) {
         case 8:
            short[] var7 = new short[d];

            for (int var9 = 0; var9 < d; var9++) {
               var7[var9] = (short)((size[off + var9] & 255) - 128 << 8);
            }

            return var7;
         case 16:
            short[] var6 = new short[d / 2];

            for (int var8 = 0; var8 < var6.length; var8++) {
               var6[var8] = (short)IlIlllIlilIl(size, off + var8 * 2);
            }

            return var6;
         case 24:
            short[] var4 = new short[d / 3];

            for (int var5 = 0; var5 < var4.length; var5++) {
               var4[var5] = (short)(size[off + var5 * 3 + 1] & 255 | size[off + var5 * 3 + 2] << 8);
            }

            return var4;
         default:
            throw new IOException(IIillIiliIil<"IIillIiliIil","hwgzwzaWHYZOacV1yAQSW/yw7A42w6960nWWBBrUmAdsEK8A8RnYPcf5WhG8CkTseGP/wmCV">() + bits);
      }
   }

   private static int IlIlllIlilIl(byte[] d, int off) {
      return d[off] & (-1382430663 + 39 + 3 ^ -1382430564)
         | (d[off + 1] & ((1211367173 + 69) * 21 * 1084587701 ^ 1565150533)) << (--935070496 * 1227133513 + -83 ^ -747148347);
   }

   public int IliIlllilIi() {
      return this.lIIlIlIlIi <= 0 ? 0 : this.IIIlIlIlIi.length / this.lIIlIlIlIi;
   }

   public short[] IIlllIlliIll() {
      return this.IIIlIlIlIi;
   }

   void IilliliilIIi() {
      int var1 = this.IliIlllilIi();
      int var2 = Math.min(var1, (int)Math.round(3.0 * (double)this.iIIlIlIlIi / 1000.0));

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = var1 - var2 + var3;
         double var5 = (double)(var2 - 1 - var3) / (double)var2;

         for (int var7 = 0; var7 < this.lIIlIlIlIi; var7++) {
            int var8 = var4 * this.lIIlIlIlIi + var7;
            this.IIIlIlIlIi[var8] = (short)((int)Math.round((double)this.IIIlIlIlIi[var8] * var5));
         }
      }
   }

   private static int lIiiIiIlilli(int max, int v) {
      return Math.max(0, Math.min(v, max));
   }

   private static int IiIlliIliiIl(byte[] d, int off) {
      return d[off] & (((1788447713 >>> 9 | 1788447713 << 23) + -95 - 73 << 27 | (1788447713 >>> 9 | 1788447713 << 23) + -95 - 73 >>> 5) ^ -276452705)
         | (d[off + 1] & (~(1344587305 + 57) ^ -1344587422)) << (~(-1806502569 << 5 | -1806502569 >>> 27) + 113 ^ 1973507446)
         | (d[off + 2] & ((934821112 ^ -105) * -630453915 * -63 ^ -1035825164)) << ((~839607458 ^ -99) + 13 ^ 839607517)
         | (d[off + 3] & ((-1003608032 >>> 27 | -1003608032 << 5) + -45 ^ -2050686188)) << (-(-(-1110014455 ^ -87)) * 43 ^ 485977592);
   }

   public illIIIliIilIIIli(short[] samples, int channels, int rate) {
      this.IIIlIlIlIi = samples;
      this.lIIlIlIlIi = channels;
      this.iIIlIlIlIi = rate;
   }

   public static illIIIliIilIIIli liiiIIllIl(byte[] data) {
      if (data.length >= 12
         && IIIllIIliIIl(data, 0, IIillIiliIil<"IIillIiliIil","2glaVHG15/k8kNLzxRd8y2M5vsaBL59CuL9PyS8BKTM=">())
         && IIIllIIliIIl(data, 8, IIillIiliIil<"IIillIiliIil","ZRWL/OYPYmljGV4JT2d68yI6zj5AE6xSWc8MjXxieVc=">())) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;
         int var5 = 12;

         while (var5 + 8 <= data.length) {
            int var6 = IiIlliIliiIl(data, var5 + 4);
            int var7 = var5 + 8;
            if (var6 < 0 || var7 + var6 > data.length) {
               var6 = data.length - var7;
            }

            if (IIIllIIliIIl(data, var5, IIillIiliIil<"IIillIiliIil","JXqvtwgXMxd05VIxf76wIljnZFCzgiZv5IYdHwg+2mc=">()) && var6 >= 16) {
               var4 = IlIlllIlilIl(data, var7);
               var1 = IlIlllIlilIl(data, var7 + 2);
               var2 = IiIlliIliiIl(data, var7 + 4);
               var3 = IlIlllIlilIl(data, var7 + 14);
               if (var4 == 65534 && var6 >= 26) {
                  var4 = IlIlllIlilIl(data, var7 + 24);
               }
            } else if (IIIllIIliIIl(data, var5, IIillIiliIil<"IIillIiliIil","7YKnzH5CaZoRM7NhrJ2HEB8hSsRvE6LrF0PVDbFqvmE=">())) {
               if (var4 != 1) {
                  throw new IOException(
                     IIillIiliIil<"IIillIiliIil","86R/Fkbp/gPTTmersHRHvw4mrQ7bJG4TnTGpwpK+MIqdZQKurYLB9nUZgP+oWkiKXqwtl2cdm6Ng">()
                        + var4
                        + IIillIiliIil<"IIillIiliIil","XGtUmw8QOfzxGyxdV0VmJr+o4yu4bG7PpRUzsRw=">()
                  );
               }

               if (var1 >= 1 && var1 <= 2 && var2 > 0) {
                  return new illIIIliIilIIIli(iliIiiliiiii(data, var7, var6, var3), var1, var2);
               }

               throw new IOException(IIillIiliIil<"IIillIiliIil","dNucugbOnduhhhjqhtDqgHJ1cbcIuR5v/4+BFpliE0XTAB5FPjzdZsnUGanXp5qbk4A=">());
            }

            var5 = var7 + var6 + (var6 & 1);
         }

         throw new IOException(IIillIiliIil<"IIillIiliIil","MXP4xZrv9/mGziA0+WrEQbGyJ8iyHt/+Kf+7r5FXbpCNg93R4O/LOCwIfDOXHyw6uQ==">());
      } else {
         throw new IOException(IIillIiliIil<"IIillIiliIil","txfPVcqwPXZ3cGFk9jBff368axLLQhXaHswW6PrMhLbiPFIVbqa5COVr">());
      }
   }

   private static boolean IIIllIIliIIl(byte[] t, int off, String d) {
      if (off + 4 > t.length) {
         return false;
      } else {
         for (int var3 = 0; var3 < 4; var3++) {
            if (t[off + var3] != d.charAt(var3)) {
               return false;
            }
         }

         return true;
      }
   }
}
