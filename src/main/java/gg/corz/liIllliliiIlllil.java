package gg.corz;

import java.util.Arrays;

public final class liIllliliiIlllil {
   public static final int lIiiIiiIil = 9;
   private int IliiIiiIil;
   private float[] iIiiIiiIil = new float[2304];

   public float[] iIlIlllllill() {
      return Arrays.copyOf(this.iIiiIiiIil, this.IliiIiiIil * 9);
   }

   public static int IilliliilIIi(float[] o, int d) {
      return Float.floatToRawIntBits(o[d + 8]);
   }

   public int liiiIIllIl() {
      return this.IliiIiiIil;
   }

   public void IliIlllilIi(float nx, float u, float ny, float v, float z, float nz, float x, float color, int y) {
      long var12 = -6292458100626306910L;
      var12 ^= ((long)(this.IliiIiiIil * 9) << 32 ^ var12) & -1L << 32;
      if ((int)(var12 >>> 32) + 9 > this.iIiiIiiIil.length) {
         this.iIiiIiiIil = Arrays.copyOf(this.iIiiIiiIil, this.iIiiIiiIil.length * 2);
      }

      float var11 = (float)Math.sqrt((double)(nz * nz + x * x + color * color));
      if (var11 > 1.0E-8F) {
         nz /= var11;
         x /= var11;
         color /= var11;
      } else {
         nz = 0.0F;
         x = 1.0F;
         color = 0.0F;
      }

      this.iIiiIiiIil[(int)(var12 >>> 32)] = nx;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 1] = u;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 2] = ny;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 3] = v;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 4] = z;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 5] = nz;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 6] = x;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 7] = color;
      this.iIiiIiiIil[(int)(var12 >>> 32) + 8] = Float.intBitsToFloat(y);
      this.IliiIiiIil++;
   }
}
