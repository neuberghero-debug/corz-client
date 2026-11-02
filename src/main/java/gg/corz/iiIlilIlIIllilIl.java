package gg.corz;

import java.awt.Color;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iiIlilIlIIllilIl {
   public static void liiiIIllIl(float y, float texture, float width, float x, class_2960 matrices, class_4587 height) {
      IliIlllilIi(y, texture, width, x, matrices, Color.WHITE, height);
   }

   public static void iIlIlllllill(
      float color, float v2, float v1, float width, float matrices, float texture, float y, float x, class_2960 height, Color u2, class_4587 u1
   ) {
      long var24 = 3956435629268994001L;
      long var26 = -5308863779168198630L;
      Matrix4f var11 = u1.method_23760().method_23761();
      var24 ^= ((long)((matrices != 0.0F || y != 1.0F) && (matrices != 1.0F || y != 0.0F) ? 0 : 1) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((texture != 0.0F || x != 1.0F) && (texture != 1.0F || x != 0.0F) ? 0 : 1) ^ var24) & -1L >>> 32;
      if ((int)(var24 >>> 32) != 0 && (int)var24 != 0 && IliiIilliiIi.IIillIiliIil(var11)) {
         float var14 = IliiIilliiIi.Illlllllilll();
         float var15 = var11.m00();
         float var16 = var11.m11();
         float var17 = v1 * var15 / var14;
         float var18 = width * var16 / var14;
         var26 ^= ((long)Math.round(var17) << 32 ^ var26) & -1L << 32;
         var26 ^= ((long)Math.round(var18) ^ var26) & -1L >>> 32;
         if ((int)(var26 >>> 32) > 0
            && (int)var26 > 0
            && Math.abs(var17 - (float)((int)(var26 >>> 32))) < 0.02F
            && Math.abs(var18 - (float)((int)var26)) < 0.02F) {
            class_2960 var21 = IlilIiilllilIiil.IliIlllilIi(height, (int)(var26 >>> 32), (int)var26);
            if (var21 != height) {
               height = var21;
               float var22 = (color * var15 + var11.m30()) / var14;
               float var23 = (v2 * var16 + var11.m31()) / var14;
               color += ((float)Math.round(var22) - var22) * var14 / var15;
               v2 += ((float)Math.round(var23) - var23) * var14 / var16;
            }
         }
      }

      IliiIilliiIi.Iilililiiili(
         var11,
         color,
         v2,
         color + v1,
         v2 + width,
         matrices,
         texture,
         y,
         x,
         height,
         (float)u2.getRed() / 255.0F,
         (float)u2.getGreen() / 255.0F,
         (float)u2.getBlue() / 255.0F,
         (float)u2.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl
      );
   }

   public static void IliIlllilIi(float x, float color, float texture, float matrices, class_2960 y, Color height, class_4587 width) {
      iIlIlllllill(x, color, texture, matrices, 0.0F, 0.0F, 1.0F, 1.0F, y, height, width);
   }
}
