package gg.corz;

import net.minecraft.class_2350;
import net.minecraft.class_4588;

final class ililiiilIiiliiil implements class_4588 {
   private final float[] iIllilIiil;
   private class_4588 lIllilIiil;

   public class_4588 method_60796(int u, int v) {
      return this.lIllilIiil.method_60796(u, v);
   }

   public class_4588 method_22912(float z, float y, float x) {
      return this.lIllilIiil.method_22912(z, y, x);
   }

   public class_4588 method_22921(int u, int v) {
      return this.lIllilIiil.method_22921(u, v);
   }

   ililiiilIiiliiil IliIlllilIi(class_4588 d) {
      this.lIllilIiil = d;
      return this;
   }

   public class_4588 method_22913(float v, float u) {
      return this.lIllilIiil.method_22913(v, u);
   }

   ililiiilIiiliiil(float[] shade) {
      this.iIllilIiil = shade;
   }

   public void method_23919(float u, float light, float ny, int nz, float v, float y, int overlay, int nx, float z, float x, float color) {
      float var12 = this.iIllilIiil[class_2350.method_10147(z, x, color).ordinal()];
      this.lIllilIiil.method_23919(u, light, ny, lIIlliiIIlli.Iilililiiili(nz, var12), v, y, overlay, nx, z, x, color);
   }

   public class_4588 method_22914(float ny, float nx, float nz) {
      return this.lIllilIiil.method_22914(ny, nx, nz);
   }

   public class_4588 method_1336(int g, int r, int b, int a) {
      return this.lIllilIiil.method_1336(g, r, b, a);
   }

   public class_4588 method_39415(int argb) {
      return this.lIllilIiil.method_39415(argb);
   }

   public class_4588 method_75298(float w) {
      return this.lIllilIiil.method_75298(w);
   }
}
