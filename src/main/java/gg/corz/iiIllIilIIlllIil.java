package gg.corz;

import java.nio.ByteOrder;
import java.util.Arrays;

public final class iiIllIilIIlllIil {
   private final int[] IililIlIil;
   private boolean iIiilIlIil;
   private final int illilIlIil;
   private int[] lililIlIil;
   public static final int iIlilIlIil = 24;
   private int lIiilIlIil = -1;
   public static final int lIlilIlIil = 6;
   private static final int[] IliilIlIil = new int[0];
   private int iililIlIil;
   private int IIiilIlIil;
   public static final int IllilIlIil = 24;
   private static final boolean lllilIlIil = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;

   public void IilliliilIIi(float color, float z, float x, float y, float v, int u) {
      long var9 = 8633943216420785350L;
      if (this.lIiilIlIil < 0) {
         this.iIlIlllllill(0);
      }

      if (this.iililIlIil + 6 > this.lililIlIil.length) {
         this.lIiiIiIlilli();
      }

      int[] var7 = this.lililIlIil;
      var9 ^= ((long)this.iililIlIil << 32 ^ var9) & -1L << 32;
      var7[(int)(var9 >>> 32)] = Float.floatToRawIntBits(color);
      var7[(int)(var9 >>> 32) + 1] = Float.floatToRawIntBits(z);
      var7[(int)(var9 >>> 32) + 2] = Float.floatToRawIntBits(x);
      var7[(int)(var9 >>> 32) + 3] = Float.floatToRawIntBits(y);
      var7[(int)(var9 >>> 32) + 4] = Float.floatToRawIntBits(v);
      var7[(int)(var9 >>> 32) + 5] = u;
      this.iililIlIil = (int)(var9 >>> 32) + 6;
      if (this.iililIlIil % 24 == 0) {
         this.IIiilIlIil++;
      }
   }

   public int IIIllIIliIIl() {
      return this.illilIlIil;
   }

   public int IiIlliIliiIl() {
      return this.iililIlIil;
   }

   public void iliIiiliiiii() {
      if (!this.iIiilIlIil) {
         if (this.iililIlIil % 24 != 0) {
            throw new IllegalStateException(IIIilIIiiIIi<"IIIilIIiiIIi","scQNjNqnbrrf2sBqm6u0M3CtLG7HTGvd6LDV+U0xKUTKIT1YagXfLNjDZw==">());
         } else {
            while (this.lIiilIlIil < this.illilIlIil) {
               this.lIiilIlIil++;
               this.IililIlIil[this.lIiilIlIil] = this.IIiilIlIil;
            }

            this.iIiilIlIil = true;
         }
      }
   }

   private void lIiiIiIlilli() {
      long var1 = Math.max((long)this.lililIlIil.length + 24L, (long)this.lililIlIil.length * 2L);
      if (var1 > 2147483639L) {
         throw new IllegalStateException(IIIilIIiiIIi<"IIIilIIiiIIi","D5hQ/Hhao3rOZEcirQPZgNV8sCF/WrBS3rpvq7s5j+p2MRpwIKuMpIok">());
      } else {
         this.lililIlIil = Arrays.copyOf(this.lililIlIil, (int)var1);
      }
   }

   public int[] IIlllIlliIll() {
      return this.lililIlIil;
   }

   public iiIllIilIIlllIil(int initialQuads, int layers) {
      this.illilIlIil = Math.max(1, initialQuads);
      this.IililIlIil = new int[this.illilIlIil + 1];
      this.lililIlIil = new int[Math.max(1, layers) * 24];
   }

   public int IlIlllIlilIl() {
      return this.IIiilIlIil;
   }

   public int Illlllllilll(int layer) {
      return this.IililIlIil[Math.max(0, Math.min(this.illilIlIil, layer))];
   }

   public int Iilllilliill(int layer) {
      return this.Illlllllilll(layer + 1);
   }

   public void Iiilliiliiil() {
      this.lililIlIil = IliilIlIil;
      this.iililIlIil = 0;
   }

   public int IIillIiliIil(int lastLayer) {
      return lastLayer < 0 ? 0 : this.Illlllllilll(Math.min(this.illilIlIil - 1, lastLayer) + 1);
   }

   public static int IliIlllilIi(int a, int r, int b, int g) {
      a &= 255;
      r &= 255;
      b &= 255;
      g &= 255;
      return lllilIlIil ? a | r << 8 | b << 16 | g << 24 : a << 24 | r << 16 | b << 8 | g;
   }

   public boolean Ililllililil() {
      return this.iIiilIlIil;
   }

   public static int liiiIIllIl(int rgb) {
      return IliIlllilIi(rgb >> 16, rgb >> 8, rgb, 255);
   }

   public void iIlIlllllill(int k) {
      long var3 = -2970143202933039698L;
      if (this.iIiilIlIil) {
         throw new IllegalStateException(IIIilIIiiIIi<"IIIilIIiiIIi","UEcQI3kGZIKlE0Vt5LpxrvoVrYe9tqWL8HD/TMwXod1BWwr94ttUTjk=">());
      } else {
         var3 ^= ((long)Math.max(0, Math.min(this.illilIlIil - 1, k)) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) < this.lIiilIlIil) {
            throw new IllegalArgumentException(
               IIIilIIiiIIi<"IIIilIIiiIIi","7whFPLQcUqbN4Fji3W50rV4/49v+fV1mI8ba38D/M92/4QB0Xk9zViuycGiXQOKFTKw40yc=">()
                  + (int)(var3 >>> 32)
                  + IIIilIIiiIIi<"IIIilIIiiIIi","V6hw7lg+Xz2XWKKDk0gHQmAeyQQOk5Ghsv3Qa2fl1g==">()
                  + this.lIiilIlIil
            );
         } else {
            while (this.lIiilIlIil < (int)(var3 >>> 32)) {
               this.lIiilIlIil++;
               this.IililIlIil[this.lIiilIlIil] = this.IIiilIlIil;
            }
         }
      }
   }
}
