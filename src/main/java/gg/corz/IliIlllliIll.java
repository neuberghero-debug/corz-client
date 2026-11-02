package gg.corz;

import net.minecraft.class_4588;

final class IliIlllliIll implements class_4588 {
   private int[] iiliIIIiIIiiIIIi = new int[((-1166042212 ^ -37) - -115 >>> 13 | (-1166042212 ^ -37) - -115 << 19) ^ 634531587];
   int lIiiIIIiiIiiIIIi;
   private int IliiIIIilliiIIIi = ~(-547460399 << 21 | -547460399 >>> 11) ^ 1513876426;

   public class_4588 method_1336(int red, int alpha, int green, int blue) {
      if (this.IilliliilIIi()) {
         this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 3] = (blue & (1955125029 - 49 + 101 ^ 117 ^ 1955125203)) << (~(-1531654275 + 113) ^ 1531654153)
            | (red & ((1964910905 ^ 75) * -23 ^ 2051687997)) << (~((-900284275 >>> 13 | -900284275 << 19) * -799063683) * -91 ^ -1355917483)
            | (alpha & ((-1703601082 * -1431655765 ^ 93) + 81 ^ 863788559))
               << ((-(-(-260855548 * -1594008481)) << 25 | -(-(-260855548 * -1594008481)) >>> 7) ^ -123127208)
            | green & ((~725285519 + 27) * 1455319497 ^ -1390322212);
      }

      return this;
   }

   private boolean IilliliilIIi() {
      return this.IliiIIIilliiIIIi >= 0;
   }

   public class_4588 method_22912(float x, float z, float y) {
      this.iIlIlllllill(x, z, y);
      return this;
   }

   public class_4588 method_75298(float width) {
      return this;
   }

   public class_4588 method_22913(float v, float u) {
      if (this.IilliliilIIi()) {
         this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 4] = Float.floatToRawIntBits(v);
         this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 5] = Float.floatToRawIntBits(u);
      }

      return this;
   }

   public class_4588 method_39415(int argb) {
      if (this.IilliliilIIi()) {
         this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 3] = argb;
      }

      return this;
   }

   int[] liiiIIllIl(float inset, int[] reuse) {
      int var3 = this.lIiiIIIiiIiiIIIi * 8;
      int[] var4 = reuse != null && reuse.length >= var3 ? reuse : new int[var3];
      System.arraycopy(this.iiliIIIiIIiiIIIi, 0, var4, 0, var3);
      float var5 = 1.0F - 2.0F * inset;

      for (byte var6 = 0; var6 < var3; var6 += 8) {
         var4[var6] = Float.floatToRawIntBits(0.5F + (Float.intBitsToFloat(var4[var6]) - 0.5F) * var5);
         var4[var6 + 2] = Float.floatToRawIntBits(0.5F + (Float.intBitsToFloat(var4[var6 + 2]) - 0.5F) * var5);
      }

      return var4;
   }

   private static byte iliIiiliiiii(float v) {
      float var1 = v < -1.0F ? -1.0F : (v > 1.0F ? 1.0F : v);
      return (byte)Math.round(var1 * 127.0F);
   }

   public class_4588 method_22914(float z, float x, float y) {
      if (this.IilliliilIIi()) {
         this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + (-(--2080513188 ^ 77) ^ -2080513264)] = lIiiIiIlilli(z, x, y);
      }

      return this;
   }

   public void method_23919(float color, float z, float u, int v, float normalZ, float normalY, int normalX, int light, float y, float overlay, float x) {
      this.iIlIlllllill(color, z, u);
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 3] = v;
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 4] = Float.floatToRawIntBits(normalZ);
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 5] = Float.floatToRawIntBits(normalY);
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + ((~(-1914528981 * 750576809) ^ 101) * -83 ^ -625564861)] = light;
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi
         + (
            (
                  ((-1852714913 >>> 7 | -1852714913 << 25) << 25 | (-1852714913 >>> 7 | -1852714913 << 25) >>> 7) >>> 3
                     | ((-1852714913 >>> 7 | -1852714913 << 25) << 25 | (-1852714913 >>> 7 | -1852714913 << 25) >>> 7) << 29
               )
               ^ -399521585
         )] = lIiiIiIlilli(y, overlay, x);
   }

   void IliIlllilIi() {
      this.lIiiIIIiiIiiIIIi = 0;
      this.IliiIIIilliiIIIi = -(--1092258877 << 1 | --1092258877 >>> 31) ^ -2110449538;
   }

   private void iIlIlllllill(float x, float y, float z) {
      this.IliiIIIilliiIIIi = this.lIiiIIIiiIiiIIIi * 8;
      if (this.IliiIIIilliiIIIi + 8 > this.iiliIIIiIIiiIIIi.length) {
         int[] var4 = new int[this.iiliIIIiIIiiIIIi.length * 2];
         System.arraycopy(this.iiliIIIiIIiiIIIi, 0, var4, 0, this.iiliIIIiIIiiIIIi.length);
         this.iiliIIIiIIiiIIIi = var4;
      }

      this.lIiiIIIiiIiiIIIi++;
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi] = Float.floatToRawIntBits(x);
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 1] = Float.floatToRawIntBits(y);
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 2] = Float.floatToRawIntBits(z);
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 3] = -1;
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 4] = 0;
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 5] = 0;
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 6] = 15728880;
      this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi + 7] = lIiiIiIlilli(0.0F, 1.0F, 0.0F);
   }

   static int lIiiIiIlilli(float z, float y, float x) {
      return iliIiiliiiii(z) & ((414187499 + -61 + 103 >>> 17 | 414187499 + -61 + 103 << 15) - -29 ^ 691338)
         | (iliIiiliiiii(y) & (((1048566804 << 29 | 1048566804 >>> 3) ^ -117) * 1527099483 * 63 ^ -1104990862))
            << (-(607092584 >>> 9 | 607092584 << 23) ^ 1273882697)
         | (iliIiiliiiii(x) & (((-(-774364077 * -23) ^ 49) << 21 | (-(-774364077 * -23) ^ 49) >>> 11) ^ 1755008407))
            << (~(-207299434 + 3 << 23 | -207299434 + 3 >>> 9) * -954437177 ^ -1765380953);
   }

   public class_4588 method_60796(int u, int v) {
      return this;
   }

   public class_4588 method_22921(int v, int u) {
      if (this.IilliliilIIi()) {
         this.iiliIIIiIIiiIIIi[this.IliiIIIilliiIIIi
            + (~((-992575469 >>> 19 | -992575469 << 13) >>> 5 | (-992575469 >>> 19 | -992575469 << 13) << 27) + 31 ^ 696249436)] = v
               & (-24823178 + -93 + -17 ^ -24787465)
            | (u & (~(-547620167) ^ 547683001)) << (-(-1800409865 - 63) - 57 ^ 1800409887);
      }

      return this;
   }
}
