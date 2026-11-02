package gg.corz;

import java.util.Arrays;
import net.minecraft.class_1944;
import net.minecraft.class_638;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_2902.class_2903;

final class liIIIlIliiIIIlIl implements ilIIIlIlIiIIIlIl {
   private final float[] iIllIiilIl;
   private final class_2339 llllIiilIl;
   private class_638 illlIiilIl;
   private int IillIiilIl;
   private static final int iiIlIiilIl = 160;
   private static final int IiIlIiilIl = 63;
   private final byte[] IlllIiilIl;
   private static final int liIlIiilIl = 4096;
   private static final int ilIlIiilIl = 6;
   private static final long IIllIiilIl = Long.MIN_VALUE;
   private final long[] lIllIiilIl = new long[4096];

   private static long lIiiIiIlilli(int x, int z) {
      return (long)x << 32 | (long)z & 4294967295L;
   }

   @Override
   public float top(int x, int z) {
      long var4 = -5055866400597319977L;
      var4 ^= ((long)iliIiiliiiii(x, z) << 32 ^ var4) & -1L << 32;
      if (this.lIllIiilIl[(int)(var4 >>> 32)] != lIiiIiIlilli(x, z)) {
         if (this.illlIiilIl == null) {
            return Float.NEGATIVE_INFINITY;
         }

         this.IilliliilIIi((int)(var4 >>> 32), x, z);
      }

      return this.iIllIiilIl[(int)(var4 >>> 32)];
   }

   private static int iliIiiliiiii(int x, int z) {
      return (x & 63) << 6 | z & 63;
   }

   int iIlIlllllill(int z, int x, double y) {
      long var10 = -633273712997884179L;
      long var12 = 4394615669230399285L;
      var10 ^= ((long)iliIiiliiiii(z, x) << 32 ^ var10) & -1L << 32;
      if (this.lIllIiilIl[(int)(var10 >>> 32)] != lIiiIiIlilli(z, x)) {
         return 0;
      } else {
         var10 ^= ((long)this.IlllIiilIl[(int)(var10 >>> 32)] ^ var10) & -1L >>> 32;
         if ((int)var10 <= 0) {
            return 0;
         } else {
            double var7 = y - (double)this.iIllIiilIl[(int)(var10 >>> 32)];
            var12 ^= ((long)(var7 > 0.0 ? (int)var10 - (int)var7 : (int)var10) << 32 ^ var12) & -1L << 32;
            return (int)(var12 >>> 32) < 0 ? 0 : (int)(var12 >>> 32);
         }
      }
   }

   private void IilliliilIIi(int i, int x, int z) {
      long var5 = -1334957842660519958L;
      this.lIllIiilIl[i] = lIiiIiIlilli(x, z);
      var5 ^= ((long)this.illlIiilIl.method_8624(class_2903.field_13197, x, z) << 32 ^ var5) & -1L << 32;
      this.iIllIiilIl[i] = (float)((int)(var5 >>> 32));
      this.llllIiilIl.method_10103(x, (int)(var5 >>> 32), z);
      this.IlllIiilIl[i] = (byte)this.illlIiilIl.method_8314(class_1944.field_9282, this.llllIiilIl);
   }

   void liiiIIllIl() {
      this.illlIiilIl = null;
      Arrays.fill(this.lIllIiilIl, Long.MIN_VALUE);
   }

   liIIIlIliiIIIlIl() {
      this.iIllIiilIl = new float[4096];
      this.IlllIiilIl = new byte[4096];
      this.llllIiilIl = new class_2339();
      Arrays.fill(this.lIllIiilIl, Long.MIN_VALUE);
   }

   void IliIlllilIi(class_638 w) {
      long var6 = -4284611338508984305L;
      if (w != this.illlIiilIl) {
         this.illlIiilIl = w;
         Arrays.fill(this.lIllIiilIl, Long.MIN_VALUE);
      }

      if (this.illlIiilIl != null) {
         var6 ^= (0L ^ var6) & -1L << 32;

         while ((int)(var6 >>> 32) < 160) {
            var6 ^= ((long)this.IillIiilIl ^ var6) & -1L >>> 32;
            this.IillIiilIl = this.IillIiilIl + 1 & 4095;
            long var4 = this.lIllIiilIl[(int)var6];
            if (var4 != Long.MIN_VALUE) {
               this.IilliliilIIi((int)var6, (int)(var4 >> 32), (int)var4);
            }

            var6 += 4294967296L;
         }
      }
   }
}
