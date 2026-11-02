package gg.corz;

import java.awt.Color;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class IlIIlilllIIlil {
   public static void IliIlllilIi(float radius, float color, float x, float y, float height, Color width, class_4587 matrices) {
      iIlIlllllill(radius, color, x, y, height, 0.0F, width, matrices);
   }

   private static void iIlIlllllill(float matrices, float color, float width, float y, float stroke, float radius, Color height, class_4587 x) {
      long var16 = -5048728042735119676L;
      long var14 = 3791640419546885928L;
      var14 ^= ((long)((int)matrices) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)((int)color) ^ var14) & -1L >>> 32;
      var16 ^= ((long)((int)(matrices + width)) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)((int)(color + y)) ^ var16) & -1L >>> 32;
      float var12 = IliiIilliiIi.Illlllllilll();
      Matrix4f var13 = x.method_23760().method_23761();
      IliiIilliiIi.Iiilliiliiil(
         var13,
         (float)((int)(var14 >>> 32) - 1),
         (float)((int)var14 - 1),
         (float)((int)(var16 >>> 32) + 1),
         (float)((int)var16 + 1),
         (float)((int)(var14 >>> 32)) / var12,
         (float)((int)var14) / var12,
         (float)((int)(var16 >>> 32) - (int)(var14 >>> 32)) / var12,
         (float)((int)var16 - (int)var14) / var12,
         stroke / var12,
         radius / var12,
         (float)height.getRed() / 255.0F,
         (float)height.getGreen() / 255.0F,
         (float)height.getBlue() / 255.0F,
         (float)height.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl
      );
   }

   public static void liiiIIllIl(float height, float width, float color, float radius, float stroke, float x, Color matrices, class_4587 y) {
      iIlIlllllill(height, width, color, radius, stroke, x, matrices, y);
   }
}
