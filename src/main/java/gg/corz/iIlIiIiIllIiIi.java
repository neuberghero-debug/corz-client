package gg.corz;

import java.util.Arrays;
import net.minecraft.class_1058;
import net.minecraft.class_2350;
import net.minecraft.class_4588;

final class iIlIiIiIllIiIi implements class_4588 {
   private float[] ilIIilliiIiIIillii;
   private int IIlIilliilIlIillii;
   private final class_1058 iiiillliiIIIIillii;
   private final float[][] lIIIilliiiIIIillii = new float[4][3];
   private final float[][] IlIIilliillIIillii = new float[4][2];
   private int iIlIilliiIllIillii;
   private int[] liIIilliiiiIIillii;
   private int lllIilliiillIillii;

   public class_4588 method_60796(int v, int u) {
      return this;
   }

   public class_4588 method_39415(int argb) {
      return this;
   }

   public class_4588 method_22913(float u, float v) {
      return this;
   }

   public class_4588 method_1336(int g, int r, int b, int a) {
      return this;
   }

   private static void IliIlllilIi(float[][] a, int i, int j) {
      float[] var3 = a[i];
      a[i] = a[j];
      a[j] = var3;
   }

   public class_4588 method_22912(float x, float y, float z) {
      return this;
   }

   public class_4588 method_22921(int v, int u) {
      return this;
   }

   public class_4588 method_22914(float nz, float ny, float nx) {
      return this;
   }

   iIlIiIiIllIiIi(class_1058 sprite) {
      this.ilIIilliiIiIIillii = new float[360];
      this.liIIilliiiiIIillii = new int[18];
      this.iiiillliiIIIIillii = sprite;
   }

   public class_4588 method_75298(float w) {
      return this;
   }

   public void method_23919(float nx, float u, float color, int overlay, float nz, float v, int z, int light, float y, float x, float ny) {
      long var13 = -2740107562568977051L;
      this.lIIIilliiiIIIillii[this.lllIilliiillIillii][0] = nx;
      this.lIIIilliiiIIIillii[this.lllIilliiillIillii][1] = u;
      this.lIIIilliiiIIIillii[this.lllIilliiillIillii][2] = color;
      this.IlIIilliillIIillii[this.lllIilliiillIillii][0] = this.iiiillliiIIIIillii.method_4580(nz);
      this.IlIIilliillIIillii[this.lllIilliiillIillii][1] = this.iiiillliiIIIIillii.method_4570(v);
      if (++this.lllIilliiillIillii >= 4) {
         this.lllIilliiillIillii = 0;
         if (!lllIIiIiillIIiIi.lIiiIiIlilli(
            this.lIIIilliiiIIIillii[0], this.lIIIilliiiIIIillii[1], this.lIIIilliiiIIIillii[2], this.lIIIilliiiIIIillii[3], y, x, ny
         )) {
            IliIlllilIi(this.lIIIilliiiIIIillii, 1, 3);
            IliIlllilIi(this.IlIIilliillIIillii, 1, 3);
         }

         if (this.IIlIilliilIlIillii + 20 > this.ilIIilliiIiIIillii.length) {
            this.ilIIilliiIiIIillii = Arrays.copyOf(this.ilIIilliiIiIIillii, this.ilIIilliiIiIIillii.length * 2);
         }

         if (this.iIlIilliiIllIillii >= this.liIIilliiiiIIillii.length) {
            this.liIIilliiiiIIillii = Arrays.copyOf(this.liIIilliiiiIIillii, this.liIIilliiiiIIillii.length * 2);
         }

         for (long var15 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var15 >>> 32) < 4; var15 += 4294967296L) {
            this.ilIIilliiIiIIillii[this.IIlIilliilIlIillii++] = this.lIIIilliiiIIIillii[(int)(var15 >>> 32)][0];
            this.ilIIilliiIiIIillii[this.IIlIilliilIlIillii++] = this.lIIIilliiiIIIillii[(int)(var15 >>> 32)][1];
            this.ilIIilliiIiIIillii[this.IIlIilliilIlIillii++] = this.lIIIilliiiIIIillii[(int)(var15 >>> 32)][2];
            this.ilIIilliiIiIIillii[this.IIlIilliilIlIillii++] = this.IlIIilliillIIillii[(int)(var15 >>> 32)][0];
            this.ilIIilliiIiIIillii[this.IIlIilliilIlIillii++] = this.IlIIilliillIIillii[(int)(var15 >>> 32)][1];
         }

         this.liIIilliiiiIIillii[this.iIlIilliiIllIillii++] = iliIiiIiIiiIiiIi.liIlIIIlIi[class_2350.method_10147(y, x, ny).ordinal()];
      }
   }
}
