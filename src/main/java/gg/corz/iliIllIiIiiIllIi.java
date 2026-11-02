package gg.corz;

import java.awt.Color;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iliIllIiIiiIllIi {
   public static void IliIlllilIi(
      float matrices, float y, float glowStrength, float height, float radius, Color glowSize, float color, float x, boolean width, class_4587 fill
   ) {
      liiiIIllIl(matrices, y, glowStrength, height, radius, glowSize, color, x, width, fill, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public static void liiiIIllIl(
      float glowSize,
      float cx,
      float radius,
      float cw,
      float color,
      Color cy,
      float cr,
      float ch,
      boolean width,
      class_4587 y,
      float cFade,
      float x,
      float glowStrength,
      float matrices,
      float fill,
      float height
   ) {
      long var23 = -2067016391317253876L;
      long var25 = -5609909973219844003L;
      var23 ^= ((long)((int)glowSize) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)((int)cx) ^ var23) & -1L >>> 32;
      var25 ^= ((long)((int)(glowSize + radius)) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)((int)(cx + cw)) ^ var25) & -1L >>> 32;
      float var20 = IliiIilliiIi.Illlllllilll();
      float var21 = Math.max(2.0F, cr + 2.0F);
      Matrix4f var22 = y.method_23760().method_23761();
      IliiIilliiIi.IlIillIiilIi(
         var22,
         (float)((int)(var23 >>> 32)) - var21,
         (float)((int)var23) - var21,
         (float)((int)(var25 >>> 32)) + var21,
         (float)((int)var25) + var21,
         (float)((int)(var23 >>> 32)) / var20,
         (float)((int)var23) / var20,
         (float)((int)(var25 >>> 32) - (int)(var23 >>> 32)) / var20,
         (float)((int)var25 - (int)var23) / var20,
         color / var20,
         (float)cy.getRed() / 255.0F,
         (float)cy.getGreen() / 255.0F,
         (float)cy.getBlue() / 255.0F,
         (float)cy.getAlpha() / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl,
         cr / var20,
         ch,
         width,
         cFade / var20,
         x / var20,
         glowStrength / var20,
         matrices / var20,
         fill / var20,
         height / var20
      );
   }
}
