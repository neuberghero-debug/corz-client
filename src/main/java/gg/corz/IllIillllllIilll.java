package gg.corz;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class IllIillllllIilll extends ilIllIiIll {
   private final iiIiiilIIliiil iIiiIIlill;
   private final iiIiiilIIliiil IliiIIlill;
   private final iilliIlIIiliIl liliIIlill;
   private final Map<Integer, iIIlllIiIlIlllIi> iliiIIlill;
   private final iilliIlIIiliIl iiliIIlill;
   private final iilliIlIIiliIl IIiiIIlill;
   private final lliliIIiililiIIi IiliIIlill = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","TGL8akXfQfRZxD8gr7ZuaxMuRyB+fxtP7vsptNHXeso=">(),
      IliIlllilIi<"IliIlllilIi","nITijeFDz7+CyyQAzOAf0dAefc6vd5xi/3mzxNFT7v+K1MWdGKHArhXXkQ==">(),
      IliIlllilIi<"IliIlllilIi","r3jg7fZO6qN7y/YGcOJF7RFsBplrJ2B9g1R/EXnNkJWdpmzUPFWhNg==">(),
      IliIlllilIi<"IliIlllilIi","r3jg7fZO6qN7y/YGcOJF7RFsBplrJ2B9g1R/EXnNkJWdpmzUPFWhNg==">(),
      IliIlllilIi<"IliIlllilIi","54JYJDFygh3jn08k1t1z+sjizq5oAlIlDRTaszj5vWjgGWC8nsk=">(),
      IliIlllilIi<"IliIlllilIi","bnBx7A38Gp+xSwZttBrtBq2/ovBp1Jfkv1sEThMTm02GJ4cBv6Q=">(),
      IliIlllilIi<"IliIlllilIi","Fkv8ajvvvryJvizE+e8EuoxD8g4CvSZ1VMDyfx3UlKfxvANyK6o=">(),
      IliIlllilIi<"IliIlllilIi","7CJq7rGdfD3nrCehcIVxj0XfJ/yOnrapT5LgaNOrx+suUQHm">()
   );
   private final iiIiiilIIliiil lliiIIlill;
   private final iiIiiilIIliiil lIiiIIlill;

   private void ilIllIiIll(class_4587 p, class_1657 px, double bone, double td, double dots, float pz, int py, int lw, float ms, boolean joint) {
      Matrix4f var14 = p.method_23760().method_23761();
      iIIlllIiIlIlllIi var15 = this.iliiIIlill.computeIfAbsent(px.method_5628(), pzx -> {
         iIIlllIiIlIlllIi var5 = new iIIlllIiIlIlllIi();
         var5.IililiIIIi = bone;
         var5.lililiIIIi = dots;
         var5.iililiIIIi = System.nanoTime();
         return var5;
      });
      var15.IIiiliIIIi = true;
      long var16 = System.nanoTime();
      double var18 = Math.min(0.1, Math.max(1.0E-4, (double)(var16 - var15.iililiIIIi) / 1.0E9));
      double var20 = bone - var15.IililiIIIi;
      double var22 = dots - var15.lililiIIIi;
      double var24 = Math.sqrt(var20 * var20 + var22 * var22) / var18;
      var15.IililiIIIi = bone;
      var15.lililiIIIi = dots;
      var15.iililiIIIi = var16;
      double var26 = Math.min(1.0, var24 / 4.3);
      var15.illiliIIIi = var15.illiliIIIi + (var26 - var15.illiliIIIi) * Math.min(1.0, var18 * 12.0);
      var15.llliliIIIi += var24 * var18 * 3.4;
      double var28 = var15.llliliIIIi;
      double var30 = var15.illiliIIIi;
      float var32 = class_3532.method_17821(pz, px.field_6220, px.field_6283);
      float var33 = class_3532.method_17821(pz, px.field_6259, px.field_6241);
      double var34 = Math.toRadians((double)var32);
      double var36 = Math.toRadians((double)var33);
      double var38 = Math.toRadians((double)class_3532.method_16439(pz, px.field_6004, px.method_36455()));
      class_243 var40 = new class_243(-Math.sin(var34), 0.0, Math.cos(var34));
      class_243 var41 = new class_243(-Math.cos(var34), 0.0, -Math.sin(var34));
      class_243 var42 = new class_243(-Math.sin(var36), 0.0, Math.cos(var36));
      class_243 var43 = new class_243(bone, td, dots);
      String var44 = px.method_18376().name();
      boolean var45 = var44.equals(IliIlllilIi<"IliIlllilIi","HKYfLmXY1V5sYTsKxTq3DavEKiQrNIYzMc+4nBbgGUTCwYLI">())
         || var44.equals(IliIlllilIi<"IliIlllilIi","NVq4WPyXRd7XeehXiZMhMUPuLF8Eswl5TyK6xbibYBcsieQ=">())
         || var44.equals(IliIlllilIi<"IliIlllilIi","/MshOGnfmdjlMcT0MtuyMSOyqdyHwGTpwufB4GUH02wXdUFj6dmE">());
      boolean var46 = !var45 && (var44.equals(IliIlllilIi<"IliIlllilIi","ebd/3A7jXpHaatboTxyPAx8JkVUY/EB84gC6e3coBGBKI0v9LA==">()) || px.method_5715());
      boolean var47 = px.method_5765();
      class_243 var48;
      class_243 var49;
      class_243 var50;
      class_243 var51;
      class_243 var52;
      class_243 var53;
      class_243 var54;
      class_243 var55;
      class_243 var56;
      class_243 var57;
      class_243 var58;
      if (var45) {
         var48 = var43.method_1031(0.0, 0.35, 0.0);
         var49 = var48.method_1019(var40.method_1021(0.66));
         var50 = var49.method_1019(var40.method_1021(0.24)).method_1031(0.0, 0.06, 0.0);
         var51 = var49.method_1020(var41.method_1021(0.26));
         var52 = var49.method_1019(var41.method_1021(0.26));
         var53 = var48.method_1020(var41.method_1021(0.11));
         var54 = var48.method_1019(var41.method_1021(0.11));
         double var59 = Math.sin(var28) * var30 * 0.25;
         var55 = var51.method_1020(var41.method_1021(0.18)).method_1020(var40.method_1021(0.45)).method_1031(0.0, 0.05, 0.0);
         var56 = var52.method_1019(var41.method_1021(0.18)).method_1020(var40.method_1021(0.45)).method_1031(0.0, 0.05, 0.0);
         var57 = var53.method_1020(var40.method_1021(0.7)).method_1031(0.0, var59, 0.0);
         var58 = var54.method_1020(var40.method_1021(0.7)).method_1031(0.0, -var59, 0.0);
      } else {
         double var69 = var46 ? 0.62 : 0.72;
         double var61 = 0.66;
         double var63 = var46 ? 0.5 : 0.0;
         var48 = var43.method_1031(0.0, var69, 0.0);
         var49 = var48.method_1019(var40.method_1021(var61 * Math.sin(var63))).method_1031(0.0, var61 * Math.cos(var63), 0.0);
         var50 = var49.method_1031(0.0, 0.22 * Math.cos(var38), 0.0).method_1019(var42.method_1021(0.22 * Math.sin(var38)));
         var51 = var49.method_1020(var41.method_1021(0.28));
         var52 = var49.method_1019(var41.method_1021(0.28));
         var53 = var48.method_1020(var41.method_1021(0.11));
         var54 = var48.method_1019(var41.method_1021(0.11));
         double var65 = var47 ? 1.35 : Math.sin(var28) * var30 * 0.85;
         double var67 = Math.sin(var28) * var30 * 0.6 + (var46 ? 0.35 : 0.0);
         var58 = liIlliiIll(var54, var40, 0.72, var65);
         var57 = liIlliiIll(var53, var40, 0.72, var47 ? 1.35 : -var65);
         var56 = liIlliiIll(var52, var40, 0.62, -var67);
         var55 = liIlliiIll(var51, var40, 0.62, var67);
      }

      iIiiIIilIliiIIil.IIIIllIIIl(var14, var50, var49, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var49, var51, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var49, var52, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var51, var55, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var52, var56, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var49, var48, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var48, var53, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var48, var54, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var53, var57, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var54, var58, py, ms);
      if (joint) {
         float var70 = ms * 2.5F + 3.0F;

         for (class_243 var72 : new class_243[]{var50, var55, var56, var48, var57, var58}) {
            iIiiIIilIliiIIil.IIIIllIIIl(var14, var72, var72.method_1031(0.0, 0.003, 0.0), lw, var70);
         }
      }
   }

   public boolean iiiIlIIIll(class_1297 entity) {
      return this.IliIlllilIi()
         && this.IiliIIlill.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","r3jg7fZO6qN7y/YGcOJF7RFsBplrJ2B9g1R/EXnNkJWdpmzUPFWhNg==">())
         && entity instanceof class_1657
         && (entity != Iiiilllliiilll.field_1724 || iIIlIllIlIlIll.IlIlllIlilIl());
   }

   private static void iIlllIllll(class_4587 y2, float z2, float y1, float x1, float color, float z1, float lineWidth, Color matrixStack, int x2) {
      Matrix4f var9 = y2.method_23760().method_23761();
      iIiiIIilIliiIIil.iIIIlIlIIl(var9, z2, y1, x1, color, z1, lineWidth, matrixStack.getRGB(), (float)x2);
   }

   public static Color IlIllllIll(int alpha) {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), alpha);
   }

   private static void Iillllilll(class_4587 x1, float y1, float y2, float z1, float color, float matrixStack, float lineWidth, Color x2, int z2) {
      Matrix4f var9 = x1.method_23760().method_23761();
      int var10 = x2.getRGB();
      float var11 = (float)z2;
      float var12 = (color - y1) * 0.25F;
      float var13 = (matrixStack - y2) * 0.25F;
      float var14 = (lineWidth - z1) * 0.25F;
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, z1, y1 + var12, y2, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, z1, y1, y2 + var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, z1, y1, y2, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, z1, color - var12, y2, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, z1, color, y2 + var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, z1, color, y2, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, lineWidth, color - var12, y2, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, lineWidth, color, y2 + var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, lineWidth, color, y2, lineWidth - var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, lineWidth, y1 + var12, y2, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, lineWidth, y1, y2 + var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, lineWidth, y1, y2, lineWidth - var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, z1, y1 + var12, matrixStack, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, z1, y1, matrixStack - var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, z1, y1, matrixStack, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, z1, color - var12, matrixStack, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, z1, color, matrixStack - var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, z1, color, matrixStack, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, lineWidth, color - var12, matrixStack, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, lineWidth, color, matrixStack - var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, lineWidth, color, matrixStack, lineWidth - var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, lineWidth, y1 + var12, matrixStack, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, lineWidth, y1, matrixStack - var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, lineWidth, y1, matrixStack, lineWidth - var14, var10, var11);
   }

   @Override
   public void IIiilIiiiIii(illlllIillll render3DEvent) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         String var2 = this.IiliIIlill.Iilllilliill();
         Color var3 = IlIllllIll(this.iiliIIlill.Iilllilliill());
         Color var4 = IlIllllIll(this.liliIIlill.Iilllilliill());
         Color var5 = IlIllllIll(255);
         Color var6 = new Color(255, 255, 255, 235);

         for (class_1657 var8 : Iiiilllliiilll.field_1687.method_18456()) {
            if ((var8 != Iiiilllliiilll.field_1724 || iIIlIllIlIlIll.IlIlllIlilIl()) && !iIIiIiIlIlIiIiIl.liiiIIllIl(var8)) {
               class_4184 var9 = Iiiilllliiilll.field_1773.method_19418();
               render3DEvent.IliiiIIilliiiIIi.method_22903();
               if (var9 != null) {
                  class_243 var10 = var9.method_71156();
                  render3DEvent.IliiiIIilliiiIIi.method_22904(-var10.field_1352, -var10.field_1351, -var10.field_1350);
               }

               float var27 = render3DEvent.liiiiIIiiiiiiIIi;
               double var11 = class_3532.method_16436((double)var27, var8.field_6014, var8.method_23317());
               double var13 = class_3532.method_16436((double)var27, var8.field_6036, var8.method_23318());
               double var15 = class_3532.method_16436((double)var27, var8.field_5969, var8.method_23321());
               float var17 = var8.method_17681() / 2.0F;
               float var18 = var8.method_17682();
               float var19 = (float)var11 - var17;
               float var20 = (float)var13;
               float var21 = (float)var15 - var17;
               float var22 = (float)var11 + var17;
               float var23 = (float)var13 + var18;
               float var24 = (float)var15 + var17;
               if (var2.equals(IliIlllilIi<"IliIlllilIi","54JYJDFygh3jn08k1t1z+sjizq5oAlIlDRTaszj5vWjgGWC8nsk=">())) {
                  Iillllilll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var3, this.IIiiIIlill.Iilllilliill());
               } else if (var2.equals(IliIlllilIi<"IliIlllilIi","bnBx7A38Gp+xSwZttBrtBq2/ovBp1Jfkv1sEThMTm02GJ4cBv6Q=">())) {
                  IIllllIlll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var4);
                  if (this.lIiiIIlill.Iilllilliill()) {
                     iIlllIllll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var5, this.IIiiIIlill.Iilllilliill());
                  }
               } else if (var2.equals(IliIlllilIi<"IliIlllilIi","Fkv8ajvvvryJvizE+e8EuoxD8g4CvSZ1VMDyfx3UlKfxvANyK6o=">())) {
                  iIlllIllll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var6, this.IIiiIIlill.Iilllilliill());
                  if (var9 != null) {
                     lllllillll(render3DEvent.IliiiIIilliiiIIi, var8, var11, var13, var15, var17, var18, var9, this.IIiiIIlill.Iilllilliill());
                  }
               } else if (var2.equals(IliIlllilIi<"IliIlllilIi","7CJq7rGdfD3nrCehcIVxj0XfJ/yOnrapT5LgaNOrx+suUQHm">())) {
                  if (this.iIiiIIlill.Iilllilliill()) {
                     iIlllIllll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, IlIllllIll(170), this.IIiiIIlill.Iilllilliill());
                  }

                  this.ilIllIiIll(
                     render3DEvent.IliiiIIilliiiIIi,
                     var8,
                     var11,
                     var13,
                     var15,
                     var27,
                     -419430401,
                     var5.getRGB(),
                     (float)this.IIiiIIlill.Iilllilliill(),
                     this.IliiIIlill.Iilllilliill()
                  );
               }

               if (this.lliiIIlill.Iilllilliill() && var9 != null) {
                  Iillllilll.IIlllIlliIll(var11, var13 + (double)var8.method_17682() * 0.5, var15, var5.getRGB(), 1.0F);
               }

               render3DEvent.IliiiIIilliiiIIi.method_22909();
            }
         }

         this.iliiIIlill.values().removeIf(s -> !s.IIiiliIIIi);

         for (iIIlllIiIlIlllIi var26 : this.iliiIIlill.values()) {
            var26.IIiiliIIIi = false;
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private static class_243 liIlliiIll(class_243 f, class_243 len, double pivot, double a) {
      return f.method_1019(len.method_1021(pivot * Math.sin(a))).method_1031(0.0, -pivot * Math.cos(a), 0.0);
   }

   public int lIIlliIIll() {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return -1138225346 - -119 ^ -45 ^ -1126698906
         | var1.getRed() << (~1085672500 * 67 ^ 274386481)
         | var1.getGreen()
            << (((-158505277 - 101 >>> 31 | -158505277 - 101 << 1) >>> 9 | (-158505277 - 101 >>> 31 | -158505277 - 101 << 1) << 23) ^ 19 ^ 1593216381)
         | var1.getBlue();
   }

   private static void IIllllIlll(class_4587 x2, float z1, float y1, float y2, float color, float x1, float z2, Color matrixStack) {
      Matrix4f var8 = x2.method_23760().method_23761();
      iIiiIIilIliiIIil.IIlilIliiIli(
         var8,
         z1,
         y1,
         y2,
         color,
         x1,
         z2,
         (float)matrixStack.getRed() / 255.0F,
         (float)matrixStack.getGreen() / 255.0F,
         (float)matrixStack.getBlue() / 255.0F,
         (float)matrixStack.getAlpha() / 255.0F
      );
   }

   private static void lllllillll(
      class_4587 height,
      class_1657 player,
      double matrixStack,
      double centerZ,
      double bottomY,
      float lineWidth,
      float halfWidth,
      class_4184 centerX,
      int camera
   ) {
      float var12 = Math.max(1.0F, player.method_6063());
      float var13 = class_3532.method_15363(player.method_6032() / var12, 0.0F, 1.0F);
      float var14 = centerX.method_19330() * (float) (Math.PI / 180.0);
      float var15 = lineWidth + 0.18F;
      float var16 = (float)matrixStack + class_3532.method_15362((double)var14) * var15;
      float var17 = (float)bottomY + class_3532.method_15374((double)var14) * var15;
      float var18 = (float)centerZ;
      float var19 = var18 + halfWidth;
      Matrix4f var20 = height.method_23760().method_23761();
      float var21 = Math.max(3.0F, (float)camera + 2.0F);
      float var22 = Math.max(1.5F, (float)camera + 0.5F);
      iIiiIIilIliiIIil.Iliilliiilii(var20, var16, var18, var17, var16, var19, var17, -939524096, var21);
      if (var13 > 0.001F) {
         int var23 = 0xFF000000 | Color.HSBtoRGB(var13 * 0.33F, 0.88F, 1.0F) & 16777215;
         iIiiIIilIliiIIil.Iliilliiilii(var20, var16, var18, var17, var16, var18 + halfWidth * var13, var17, var23, var22);
      }
   }

   public IllIillllllIilll() {
      super(IliIlllilIi<"IliIlllilIi","TCgi2SUm8ffW8QTF6sYIJwypGsuZIwQVmgglcaRLDahnoBLhSQ==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.liliIIlill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","3KE6tQ3RgDxaZ/lcKUBrwt/fghto9lsLbiz37m7j1OFn">(),
         IliIlllilIi<"IliIlllilIi","NKRkEzrj83WnO62M6gG26wrOZ+0D9kJr3Sb6aqeVKigAbuiiD7e5zFy76is=">(),
         80,
         1,
         255
      );
      this.iiliIIlill = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","DM0KlNJZnFsoVaManwlKmNXv1PeteYphutLqq/KM36uPBY+afjc7Sw==">(),
         IliIlllilIi<"IliIlllilIi","pHwL7zN61k+yB7EOYmBTtU0YU0ZYvMu7k9WFZlvEYZg/bVkKU/Bq7LSO9c0=">(),
         255,
         1,
         255
      );
      this.IIiiIIlill = new iilliIlIIiliIl(IliIlllilIi<"IliIlllilIi","7lW6N27Z5dRLkKHWyxdKJ148QZzZf4aUStps7236VC8WYCTGdbQ=">(), "", 1, 1, 10);
      this.lIiiIIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","TyTCu6WPnb6MtPKrSJTUXnVY3h6swDkt16978TmGcKZdGgwo6LXw9vMv">(),
         IliIlllilIi<"IliIlllilIi","T3xmxegmtS/kbrNnzvJ4KHvlQQ6Ms+KzkxLyv6BAicwr6oPnbSdbwTzQU4qmK1pX9L7Tubg=">(),
         false
      );
      this.iIiiIIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","fH/DUP1bEg/vojO0mGPG3XWI1wPdoGjn7lxf4PaIA1OY9xgDB+V1bg==">(),
         IliIlllilIi<"IliIlllilIi","9Ite+3LO5UUa+RpPndABC8kNkLusjAroRc3FVUMEihRNccaqFkpqCiE8bgQnPAqsfrE7vOjf6UNtcLul8LxpIY499A4=">(),
         true
      );
      this.IliiIIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","uJiDg28YUn/I286kQN4VHjnL84GC8sTBqnJCfZQtDObKGO+iFUfWTWJsUw==">(),
         IliIlllilIi<"IliIlllilIi","8gggHd9YdfU7aSYZmfmvd0chFoLp+L16PC3dPd473SJasJw+1VOfpGEtV+N2y73buo20xavOAigJ1DkHLkLlbK0D94XK1cYgvdn+kdo=">(),
         true
      );
      this.lliiIIlill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","2SJsSL07Rf7kj2tUr9NIrw1o2ZPXntaMi1DaY6bliP+q320=">(),
         IliIlllilIi<"IliIlllilIi","I3W9lGsQFjl2tCF2ODIQqY1W2sZjVUF1/9tqaNJrwRZgf6SJOOCC9705Cj9g/FTUJo3HnunPH7d37nKmATOm14DMBFVp9g==">(),
         false
      );
      this.iliiIIlill = new HashMap<>();
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.IiliIIlill, this.liliIIlill, this.iiliIIlill, this.IIiiIIlill, this.lIiiIIlill, this.iIiiIIlill, this.IliiIIlill, this.lliiIIlill
         }
      );
   }
}
