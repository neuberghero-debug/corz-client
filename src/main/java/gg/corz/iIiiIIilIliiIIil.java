package gg.corz;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.LinkedHashMap;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class iIiiIIilIliiIIil {
   private static boolean IlilliIIil;
   private static final class_1921 lIllliIIil = class_1921.method_75940(
      llIIlilIIl<"llIIlilIIl","gaD6iST0iYpu/zrmM6B/Wrevbjm2yULES6KcELn4jT7EAVlwD+bOlZiEOydE">(),
      class_12247.method_75927(iIiiIIilIliiIIil.ilIlliIIil).method_75938()
   );
   public static final RenderPipeline llIlliIIil = RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
      .withLocation(
         class_2960.method_60655(
            llIIlilIIl<"llIIlilIIl","GqH6NimlG8ymozRiCS9SB5YVBfhJe4BMLnN7W0oJKdV9kHdczBs=">(),
            llIIlilIIl<"llIIlilIIl","Wa2A+7sdx46s5HnIfRXVaY5htkQRozukZiuF5BV8gqe/bQBYwDYpJhYi+cBUhg==">()
         )
      )
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static double iIilliIIil;
   private static double lIilliIIil;
   public static final RenderPipeline ilIlliIIil = RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
      .withLocation(
         class_2960.method_60655(
            llIIlilIIl<"llIIlilIIl","GqH6NimlG8ymozRiCS9SB5YVBfhJe4BMLnN7W0oJKdV9kHdczBs=">(),
            llIIlilIIl<"llIIlilIIl","EQDseE0jqGSmYfCL0grRBYBf4O8p61yUKouPcGJhZ0gZoRQxLv+I6vMQOrXXwmrRfQ==">()
         )
      )
      .withVertexFormat(class_290.field_1576, class_5596.field_27382)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static boolean illlliIIil;
   private static final Matrix4f lillliIIil = new Matrix4f();
   private static int IillliIIil = 0;
   public static final RenderPipeline IiIlliIIil = RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
      .withLocation(
         class_2960.method_60655(
            llIIlilIIl<"llIIlilIIl","GqH6NimlG8ymozRiCS9SB5YVBfhJe4BMLnN7W0oJKdV9kHdczBs=">(),
            llIIlilIIl<"llIIlilIIl","f/X8ZvuZYu02RD5yRh+C9gxzUETeWoS+1AAfvcRu+GQR7GeztDR/0AoUEgNgJi4Ap38=">()
         )
      )
      .withVertexFormat(class_290.field_1576, class_5596.field_27379)
      .withBlend(BlendFunction.ADDITIVE)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static final Vector3f iillliIIil = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final class_1921 iIllliIIil = class_1921.method_75940(
      llIIlilIIl<"llIIlilIIl","L/AkmUVxPZhQGig/Cl/PW9JY9B2J7bFh9T4fLAmukXaCt/VxFzbfwOQB/HLSBA==">(), class_12247.method_75927(IiIlliIIil).method_75938()
   );
   private static final class_1921 IIllliIIil = class_1921.method_75940(
      llIIlilIIl<"llIIlilIIl","fXg5ENqyuNUbvXSx+qYAQjaZ/Pij0cki+uGzfO2m5EKCuBxOHBEcgeG7">(), class_12247.method_75927(llIlliIIil).method_75938()
   );
   private static final class_4598 llllliIIil = IliIlllilIi();
   private static final class_1921 IlllliIIil = class_1921.method_75940(
      llIIlilIIl<"llIIlilIIl","QAtazsGH8lHFspTSIotIvE+akBwYNZIbSm7AFt0p5yIp0wkETe+ZtEnB5vXHLvEZ+GvNbQ==">(),
      class_12247.method_75927(iIiiIIilIliiIIil.liIlliIIil).method_75938()
   );
   private static final class_1921 iiIlliIIil = class_1921.method_75940(
      llIIlilIIl<"llIIlilIIl","OktTt28Hk45Bfh5gxg4Vww0eucr+QyvQPJuqmjyt2v9DJsEzzx2TD2AxhA==">(),
      class_12247.method_75927(iIiiIIilIliiIIil.IlIlliIIil).method_75938()
   );
   private static double IIilliIIil;
   public static final RenderPipeline liIlliIIil = RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
      .withLocation(
         class_2960.method_60655(
            llIIlilIIl<"llIIlilIIl","GqH6NimlG8ymozRiCS9SB5YVBfhJe4BMLnN7W0oJKdV9kHdczBs=">(),
            llIIlilIIl<"llIIlilIIl","LfxARzaaqyeY7w6t8ZzSMbp2vkxP04tLgCBRcYlRNEE2Mz+8kN4JYh+BzeOsDeTSTOjqKE1cd+A=">()
         )
      )
      .withVertexFormat(class_290.field_1576, class_5596.field_27379)
      .withBlend(BlendFunction.ADDITIVE)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static final class_9799 iIIlliIIil = new class_9799(2097152);
   public static final RenderPipeline IlIlliIIil = RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
      .withLocation(
         class_2960.method_60655(
            llIIlilIIl<"llIIlilIIl","GqH6NimlG8ymozRiCS9SB5YVBfhJe4BMLnN7W0oJKdV9kHdczBs=">(),
            llIIlilIIl<"llIIlilIIl","9sdFD9H8+9p4tODVdbJglVEgzQ3j0fOga+pwoj8B6qg/XvJZtYHvDgp/n7UQAJE=">()
         )
      )
      .withVertexFormat(class_290.field_1576, class_5596.field_27382)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();

   public static float Iiilliiliiil(double worldY) {
      return (float)(worldY - lIilliIIil);
   }

   private static void Iilililiiili(
      class_4588 by,
      Matrix4f ax,
      float vc,
      float color,
      float dz,
      float cz,
      float dy,
      float bz,
      float cy,
      float az,
      float cx,
      float ay,
      float dx,
      float m,
      int bx
   ) {
      Illlllllilll(4);
      by.method_22918(ax, vc, color, dz).method_39415(bx);
      by.method_22918(ax, cz, dy, bz).method_39415(bx);
      by.method_22918(ax, cy, az, cx).method_39415(bx);
      by.method_22918(ax, ay, dx, m).method_39415(bx);
   }

   public static void liiiIIllIl() {
      if (!illlliIIil) {
         illlliIIil = true;
         class_10799.method_67887(IlIlliIIil);
         class_10799.method_67887(llIlliIIil);
         class_10799.method_67887(ilIlliIIil);
         class_10799.method_67887(IiIlliIIil);
         class_10799.method_67887(liIlliIIil);
      }
   }

   static void IIiilIiiiIii(class_4588 endArgb, Matrix4f z2, float matrix, float y2, float vc, int x1, float startArgb, float x2, float width, int z1, float y1) {
      float var11 = startArgb - matrix;
      float var12 = x2 - y2;
      float var13 = width - vc;
      float var14 = var11 * var11 + var12 * var12 + var13 * var13;
      if (var14 > 1.0E-9F) {
         float var15 = (float)(1.0 / Math.sqrt((double)var14));
         var11 *= var15;
         var12 *= var15;
         var13 *= var15;
      }

      Illlllllilll(2);
      endArgb.method_22918(z2, matrix, y2, vc).method_39415(x1).method_22914(var11, var12, var13).method_75298(y1);
      endArgb.method_22918(z2, startArgb, x2, width).method_39415(z1).method_22914(var11, var12, var13).method_75298(y1);
   }

   public static void Iilllilliill(class_4587 matrices) {
      lillliIIil.set(matrices.method_23760().method_23761());
      class_4184 var1 = class_310.method_1551().field_1773.method_19418();
      class_243 var2 = var1.method_71156();
      IIilliIIil = var2.field_1352;
      lIilliIIil = var2.field_1351;
      iIilliIIil = var2.field_1350;
      iillliIIil.set(0.0F, 0.0F, -1.0F).rotate(var1.method_23767());
      Iillllilll.IliIlllilIi(var1);
   }

   public static void IiIiliIiiiIi() {
      if (!IlilliIIil) {
         IlilliIIil = true;
      }

      llllliIIil.method_22993();
   }

   public static void Iiiiliiiiiii(Matrix4f x2, float z2, float z1, float width, float startArgb, float y2, float x1, int y1, int endArgb, float matrix) {
      IIiilIiiiIii(IIlllIlliIll(), x2, z2, z1, width, y1, startArgb, y2, x1, endArgb, matrix);
   }

   public static void iIIIlIlIIl(Matrix4f argb, float width, float y1, float z1, float matrix, float x1, float z2, int x2, float y2) {
      class_4588 var9 = IIlllIlliIll();
      IIiilIiiiIii(var9, argb, width, y1, z1, x2, matrix, y1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z1, x2, matrix, y1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z2, x2, width, y1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, width, y1, z2, x2, width, y1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, width, x1, z1, x2, matrix, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, x1, z1, x2, matrix, x1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, x1, z2, x2, width, x1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, width, x1, z2, x2, width, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, width, y1, z1, x2, width, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z1, x2, matrix, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z2, x2, matrix, x1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, width, y1, z2, x2, width, x1, z2, x2, y2);
   }

   public static float IIIilIIiiIIi(double worldZ) {
      return (float)(worldZ - iIilliIIil);
   }

   public static class_4588 lIiiIiIlilli() {
      return llllliIIil.method_73477(lIllliIIil);
   }

   private iIiiIIilIliiIIil() {
   }

   public static class_4588 IilliliilIIi() {
      return llllliIIil.method_73477(iiIlliIIil);
   }

   static void Illlllllilll(int n) {
      IillliIIil += n;
   }

   public static class_4588 IIlllIlliIll() {
      return llllliIIil.method_73477(IIllliIIil);
   }

   public static void IlIlllIlilIl(
      class_4588 bz,
      Matrix4f m,
      float cc,
      float bx,
      float by,
      int ay,
      float ca,
      float vc,
      float cx,
      int az,
      float cd,
      float ax,
      float cb,
      int cz,
      float dz,
      float cy,
      float dy,
      int dx
   ) {
      Illlllllilll(4);
      bz.method_22918(m, cc, bx, by).method_39415(ay);
      bz.method_22918(m, ca, vc, cx).method_39415(az);
      bz.method_22918(m, cd, ax, cb).method_39415(cz);
      bz.method_22918(m, dz, cy, dy).method_39415(dx);
   }

   public static float Ililllililil(double worldX) {
      return (float)(worldX - IIilliIIil);
   }

   public static boolean IlIillIiilIi(double worldY, double worldX, double worldZ, float radius) {
      double var7 = (worldY - IIilliIIil) * (double)iillliIIil.x + (worldX - lIilliIIil) * (double)iillliIIil.y + (worldZ - iIilliIIil) * (double)iillliIIil.z;
      return var7 < (double)(-radius);
   }

   public static void Iliilliiilii(Matrix4f z1, float z2, float y2, float x2, float width, float argb, float x1, int matrix, float y1) {
      IIiilIiiiIii(IIlllIlliIll(), z1, z2, y2, x2, matrix, width, argb, x1, matrix, y1);
   }

   private static class_4598 IliIlllilIi() {
      LinkedHashMap var0 = new LinkedHashMap();
      var0.put(iiIlliIIil, new class_9799(1048576));
      var0.put(lIllliIIil, new class_9799(262144));
      var0.put(iIllliIIil, new class_9799(262144));
      var0.put(IlllliIIil, new class_9799(262144));
      var0.put(IIllliIIil, new class_9799(1048576));
      return class_4597.method_22992(var0, iIIlliIIil);
   }

   private static int iIlIlllllill(float g, float r, float a, float b) {
      return (int)(b * 255.0F) << 24 | (int)(g * 255.0F) << 16 | (int)(r * 255.0F) << 8 | (int)(a * 255.0F);
   }

   public static class_4588 iliIiiliiiii() {
      return llllliIIil.method_73477(iIllliIIil);
   }

   public static void IIIIllIIIl(Matrix4f matrix, class_243 width, class_243 a, int argb, float b) {
      Iliilliiilii(
         matrix,
         (float)width.field_1352,
         (float)width.field_1351,
         (float)width.field_1350,
         (float)a.field_1352,
         (float)a.field_1351,
         (float)a.field_1350,
         argb,
         b
      );
   }

   public static class_4588 IIIllIIliIIl() {
      return llllliIIil.method_73477(IlllliIIil);
   }

   public static void Illillliilli(
      Matrix4f ay, float argb, float ax, float dz, float az, float by, float cx, float bx, float bz, float dx, float dy, float cz, float m, int cy
   ) {
      Iilililiiili(IilliliilIIi(), ay, argb, ax, dz, az, by, cx, bx, bz, dx, dy, cz, m, cy);
   }

   public static Matrix4f IIillIiliIil() {
      return lillliIIil;
   }

   public static void IiIlliIliiIl(
      class_4588 cz, Matrix4f ca, float cy, float vc, float bz, int cx, float ax, float cb, float by, int m, float cc, float az, float ay, int bx
   ) {
      Illlllllilll(3);
      cz.method_22918(ca, cy, vc, bz).method_39415(cx);
      cz.method_22918(ca, ax, cb, by).method_39415(m);
      cz.method_22918(ca, cc, az, ay).method_39415(bx);
   }

   public static void IIlilIliiIli(Matrix4f z1, float x2, float a, float g, float matrix, float b, float z2, float r, float y1, float x1, float y2) {
      long var13 = -8166975245998705386L;
      class_4588 var11 = IilliliilIIi();
      var13 ^= ((long)iIlIlllllill(r, y1, x1, y2) << 32 ^ var13) & -1L << 32;
      Iilililiiili(var11, z1, x2, a, g, matrix, a, g, matrix, a, z2, x2, a, z2, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, b, g, x2, b, z2, matrix, b, z2, matrix, b, g, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, a, g, x2, b, g, matrix, b, g, matrix, a, g, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, a, z2, matrix, a, z2, matrix, b, z2, x2, b, z2, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, a, g, x2, a, z2, x2, b, z2, x2, b, g, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, matrix, a, g, matrix, b, g, matrix, b, z2, matrix, a, z2, (int)(var13 >>> 32));
   }
}
