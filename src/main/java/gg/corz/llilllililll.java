package gg.corz;

import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.util.Arrays;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public final class llilllililll {
   private static final Vector3f lIIIllIiiIIIllIi = new Vector3f();
   private static final double[][][] IiiiIlIiliiiIlIi = new double[65][][];
   private static final double[] iiiiIlIiIIIIllIi = new double[12];
   private static final Matrix4f iIiiIlIiIliiIlIi = new Matrix4f();
   private static final int[] illiIlIiIiliIlIi = new int[4];
   private static final Vector4f IIiiIlIilIiiIlIi = new Vector4f();
   private static float[] ilIIllIiIiIIllIi = new float[64];
   private static final double[][][] lliiIlIiiliiIlIi = new double[65][][];
   public static boolean IlliIlIillliIlIi = true;
   private static float[] IlIIllIillIIllIi = new float[64];
   private static float[] liIIllIiiiIIllIi = new float[64];
   private static final Vector3f liliIlIiiiliIlIi = new Vector3f();

   public static double IilliliilIIi() {
      double var0;
      if (ilIllIiIll.Iiiilllliiilll.method_47599() > 0) {
         var0 = 1.0 / (double)ilIllIiIll.Iiiilllliiilll.method_47599();
      } else {
         var0 = 1.0;
      }

      return var0;
   }

   private static void IlIillIiilIi(int n13, double s) {
      long var16 = 1609284270186135094L;
      long var14 = 7650015779655952634L;
      double[][] var3 = new double[4][];
      double[][] var4 = new double[4][];
      var14 ^= (0L ^ var14) & -1L << 32;

      while ((int)(var14 >>> 32) < 4) {
         var14 ^= (0L ^ var14) & -1L >>> 32;

         for (double var7 = (double)((int)(var14 >>> 32)) * 90.0; var7 < 90.0 + (double)((int)(var14 >>> 32)) * 90.0; var7 += 90.0 / s) {
            var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32;
         }

         double[] var18 = new double[(int)var14 + 1];
         double[] var8 = new double[(int)var14 + 1];
         var16 ^= (0L ^ var16) & -1L << 32;

         for (double var10 = (double)((int)(var14 >>> 32)) * 90.0; var10 < 90.0 + (double)((int)(var14 >>> 32)) * 90.0; var10 += 90.0 / s) {
            double var12 = Math.toRadians(var10);
            var18[(int)(var16 >>> 32)] = Math.sin((double)((float)var12));
            var8[(int)(var16 >>> 32)] = Math.cos((double)((float)var12));
            var16 += 4294967296L;
         }

         double var19 = Math.toRadians(90.0 + (double)((int)(var14 >>> 32)) * 90.0);
         var18[(int)(var16 >>> 32)] = Math.sin((double)((float)var19));
         var8[(int)(var16 >>> 32)] = Math.cos((double)((float)var19));
         var3[(int)(var14 >>> 32)] = var18;
         var4[(int)(var14 >>> 32)] = var8;
         var14 += 4294967296L;
      }

      IiiiIlIiliiiIlIi[n13] = var4;
      lliiIlIiiliiIlIi[n13] = var3;
   }

   public static class_4184 liiiIIllIl() {
      return ilIllIiIll.Iiiilllliiilll.field_1773.method_19418();
   }

   private static void IiIiliIiiiIi(int size) {
      long var2 = 6928067312326706327L;
      if (size > IlIIllIillIIllIi.length) {
         var2 ^= ((long)Math.max(size, IlIIllIillIIllIi.length * 2) << 32 ^ var2) & -1L << 32;
         IlIIllIillIIllIi = Arrays.copyOf(IlIIllIillIIllIi, (int)(var2 >>> 32));
         ilIIllIiIiIIllIi = Arrays.copyOf(ilIIllIiIiIIllIi, (int)(var2 >>> 32));
         liIIllIiiiIIllIi = Arrays.copyOf(liIIllIiiiIIllIi, (int)(var2 >>> 32));
      }
   }

   private static void IIIllIIliIIl() {
   }

   public static void Illlllllilll(class_4587 color, Color n4, double n, double matrixStack, double n3, int n2) {
      long var16 = -4045692877852647014L;
      long var18 = 2076035309072407603L;
      var16 ^= ((long)class_3532.method_15340(n2, 4, 360) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)n4.getRGB() ^ var16) & -1L >>> 32;
      Matrix4f var11 = color.method_23760().method_23761();
      IIIllIIliIIl();
      class_4588 var12 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27381);

      for (long var22 = var18 ^ (0L ^ var18) & -1L << 32;
         (int)(var22 >>> 32) < 360;
         var22 ^= ((long)((int)(var22 >>> 32) + Math.min(360 / (int)(var16 >>> 32), 360 - (int)(var22 >>> 32))) << 32 ^ var22) & -1L << 32
      ) {
         double var14 = Math.toRadians((double)((int)(var22 >>> 32)));
         var12.method_22918(var11, (float)(n + Math.sin(var14) * n3), (float)(matrixStack + Math.cos(var14) * n3), 0.0F)
            .method_22915(
               (float)((int)var16 >> 16 & 0xFF) / 255.0F,
               (float)((int)var16 >> 8 & 0xFF) / 255.0F,
               (float)((int)var16 & 0xFF) / 255.0F,
               (float)((int)var16 >> 24 & 0xFF) / 255.0F
            );
      }

      llIllIililIllIil.IIillIiliIil();
      IlIlllIlilIl();
   }

   public static class_243 IliIlllilIi() {
      return ilIllIiIll.Iiiilllliiilll.field_1773.method_19418().method_71156();
   }

   public static float lIiiIiIlilli(float n3, float n, float n2) {
      return (1.0F - class_3532.method_15363((float)(IilliliilIIi() * (double)n2), 0.0F, 1.0F)) * n3
         + class_3532.method_15363((float)(IilliliilIIi() * (double)n2), 0.0F, 1.0F) * n;
   }

   public static void IIlilIliiIli(
      Matrix4f n12,
      float matrix4f,
      float n7,
      float n6,
      float n4,
      double n8,
      double n11,
      double n10,
      double n9,
      double n13,
      double n3,
      double n,
      double n2,
      double n5
   ) {
      long var38 = -670386144985225672L;
      long var40 = 8791478907524291790L;
      long var42 = 4814304838242308142L;
      double[] var23 = iiiiIlIiIIIIllIi;
      var23[0] = n10 - n2;
      var23[1] = n9 - n2;
      var23[2] = n2;
      var23[3] = n10 - n3;
      var23[4] = n11 + n3;
      var23[5] = n3;
      var23[6] = n8 + n13;
      var23[7] = n11 + n13;
      var23[8] = n13;
      var23[9] = n8 + n;
      var23[10] = n9 - n;
      var23[11] = n;
      var38 ^= ((long)((int)n5) << 32 ^ var38) & -1L << 32;
      var38 ^= ((long)((double)((int)(var38 >>> 32)) == n5 && (int)(var38 >>> 32) >= 1 && (int)(var38 >>> 32) <= 64 ? 1 : 0) ^ var38) & -1L >>> 32;
      if ((int)var38 != 0 && lliiIlIiiliiIlIi[(int)(var38 >>> 32)] == null) {
         IlIillIiilIi((int)(var38 >>> 32), n5);
      }

      var40 ^= (0L ^ var40) & -1L << 32;

      for (var40 ^= (0L ^ var40) & -1L >>> 32; (int)var40 < 4; var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32) {
         double var28 = var23[(int)var40 * 3];
         double var30 = var23[(int)var40 * 3 + 1];
         double var32 = var23[(int)var40 * 3 + 2];
         if ((int)var38 != 0) {
            double[] var46 = lliiIlIiiliiIlIi[(int)(var38 >>> 32)][(int)var40];
            double[] var35 = IiiiIlIiliiiIlIi[(int)(var38 >>> 32)][(int)var40];
            IiIiliIiiiIi((int)(var40 >>> 32) + var46.length);

            for (var42 ^= (0L ^ var42) & -1L << 32; (int)(var42 >>> 32) < var46.length; var42 += 4294967296L) {
               IlIIllIillIIllIi[(int)(var40 >>> 32)] = (float)var28 + (float)(var46[(int)(var42 >>> 32)] * var32);
               ilIIllIiIiIIllIi[(int)(var40 >>> 32)] = (float)var30 + (float)(var35[(int)(var42 >>> 32)] * var32);
               var40 += 4294967296L;
            }
         } else {
            for (double var34 = (double)((int)var40) * 90.0; var34 < 90.0 + (double)((int)var40) * 90.0; var34 += 90.0 / n5) {
               double var36 = Math.toRadians(var34);
               IiIiliIiiiIi((int)(var40 >>> 32) + 1);
               IlIIllIillIIllIi[(int)(var40 >>> 32)] = (float)var28 + (float)(Math.sin((double)((float)var36)) * var32);
               ilIIllIiIiIIllIi[(int)(var40 >>> 32)] = (float)var30 + (float)(Math.cos((double)((float)var36)) * var32);
               var40 += 4294967296L;
            }

            double var45 = Math.toRadians(90.0 + (double)((int)var40) * 90.0);
            IiIiliIiiiIi((int)(var40 >>> 32) + 1);
            IlIIllIillIIllIi[(int)(var40 >>> 32)] = (float)var28 + (float)(Math.sin((double)((float)var45)) * var32);
            ilIIllIiIiIIllIi[(int)(var40 >>> 32)] = (float)var30 + (float)(Math.cos((double)((float)var45)) * var32);
            var40 += 4294967296L;
         }
      }

      if (!llIllIililIllIil.Illlllllilll()) {
         class_4588 var27 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27381);

         for (long var52 = var42 ^ (0L ^ var42) & -1L >>> 32; (int)var52 < (int)(var40 >>> 32); var52 ^= (var52 ^ var52 + (long)1) & -1L >>> 32) {
            var27.method_22918(n12, IlIIllIillIIllIi[(int)var52], ilIIllIiIiIIllIi[(int)var52], 0.0F).method_22915(matrix4f, n7, n6, n4);
         }

         llIllIililIllIil.IIillIiliIil();
      } else if ((int)(var40 >>> 32) >= 3) {
         for (var40 ^= (0L ^ var40) & -1L >>> 32; (int)var40 < (int)(var40 >>> 32); var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32) {
            n12.transformPosition(IlIIllIillIIllIi[(int)var40], ilIIllIiIiIIllIi[(int)var40], 0.0F, lIIIllIiiIIIllIi);
            IlIIllIillIIllIi[(int)var40] = lIIIllIiiIIIllIi.x;
            ilIIllIiIiIIllIi[(int)var40] = lIIIllIiiIIIllIi.y;
            liIIllIiiiIIllIi[(int)var40] = lIIIllIiiIIIllIi.z;
         }

         class_4588 var44 = llIllIililIllIil.Iilllilliill();

         for (long var53 = var42 ^ (1L ^ var42) & -1L >>> 32; (int)var53 < (int)(var40 >>> 32) - 1; var53 ^= (var53 ^ var53 + (long)1) & -1L >>> 32) {
            var44.method_22912(IlIIllIillIIllIi[0], ilIIllIiIiIIllIi[0], liIIllIiiiIIllIi[0]).method_22915(matrix4f, n7, n6, n4);
            var44.method_22912(IlIIllIillIIllIi[(int)var53], ilIIllIiIiIIllIi[(int)var53], liIIllIiiiIIllIi[(int)var53]).method_22915(matrix4f, n7, n6, n4);
            var44.method_22912(IlIIllIillIIllIi[(int)var53 + 1], ilIIllIiIiIIllIi[(int)var53 + 1], liIIllIiiiIIllIi[(int)var53 + 1])
               .method_22915(matrix4f, n7, n6, n4);
         }
      }
   }

   public static void Ililllililil(class_4587 n4, float matrixStack, float n5, float n2, float n, int n3) {
      float var6 = (float)(n3 >> 24 & 0xFF) / 255.0F;
      float var7 = (float)(n3 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(n3 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(n3 & 0xFF) / 255.0F;
      n4.method_22903();
      n4.method_22905(0.5F, 0.5F, 0.5F);
      n4.method_22904((double)matrixStack, (double)n5, 0.0);
      Matrix4f var10 = n4.method_23760().method_23761();
      class_4588 var11 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27382);
      var11.method_22918(var10, 0.0F, 0.0F, 0.0F).method_22915(var7, var8, var9, var6);
      var11.method_22918(var10, 0.0F, n, 0.0F).method_22915(var7, var8, var9, var6);
      var11.method_22918(var10, n2, n, 0.0F).method_22915(var7, var8, var9, var6);
      var11.method_22918(var10, n2, 0.0F, 0.0F).method_22915(var7, var8, var9, var6);
      llIllIililIllIil.IIillIiliIil();
      n4.method_22909();
   }

   public static void iliIiiliiiii(
      class_4587 n3, Color n6, double n7, double n2, double n8, double matrixStack, double n5, double n9, double n4, double color, double n
   ) {
      long var22 = 3695929429414885391L;
      var22 ^= ((long)n6.getRGB() << 32 ^ var22) & -1L << 32;
      Matrix4f var21 = n3.method_23760().method_23761();
      IIlilIliiIli(
         var21,
         (float)((int)(var22 >>> 32) >> 16 & 0xFF) / 255.0F,
         (float)((int)(var22 >>> 32) >> 8 & 0xFF) / 255.0F,
         (float)((int)(var22 >>> 32) & 0xFF) / 255.0F,
         (float)((int)(var22 >>> 32) >> 24 & 0xFF) / 255.0F,
         n7,
         n2,
         n8,
         matrixStack,
         n5,
         n9,
         n4,
         color,
         n
      );
   }

   public static void IIlllIlliIll(
      Matrix4f n,
      float n7,
      float n13,
      float n11,
      float n5,
      double n9,
      double matrix4f,
      double n3,
      double n14,
      double n10,
      double n6,
      double n8,
      double n12,
      double n4,
      double n2
   ) {
      long var43 = 6626187202491401862L;
      class_4588 var25 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27380);
      double[][] var26 = new double[][]{{n3 - n12, n14 - n12, n12}, {n3 - n6, matrix4f + n6, n6}, {n9 + n10, matrix4f + n10, n10}, {n9 + n8, n14 - n8, n8}};

      for (long var51 = var43 ^ (0L ^ var43) & -1L << 32; (int)(var51 >>> 32) < 4; var51 += 4294967296L) {
         double[] var28 = var26[(int)(var51 >>> 32)];
         double var29 = var28[2];
         double var31 = (double)((int)(var51 >>> 32)) * 90.0;

         while (var31 < 90.0 + (double)((int)(var51 >>> 32)) * 90.0) {
            double var33 = Math.toRadians(var31);
            double var35 = Math.sin((double)((float)var33));
            double var37 = var35 * var29;
            double var39 = Math.cos((double)((float)var33));
            double var41 = var39 * var29;
            var25.method_22918(n, (float)var28[0] + (float)var37, (float)var28[1] + (float)var41, 0.0F).method_22915(n7, n13, n11, n5);
            var25.method_22918(n, (float)(var28[0] + (double)((float)var37) + var35 * n4), (float)(var28[1] + (double)((float)var41) + var39 * n4), 0.0F)
               .method_22915(n7, n13, n11, n5);
            var31 += 90.0 / n2;
         }

         var31 = Math.toRadians(90.0 + (double)((int)(var51 >>> 32)) * 90.0);
         double var47 = Math.sin((double)((float)var31));
         double var48 = var47 * var29;
         double var49 = Math.cos((double)((float)var31));
         double var50 = var49 * var29;
         var25.method_22918(n, (float)var28[0] + (float)var48, (float)var28[1] + (float)var50, 0.0F).method_22915(n7, n13, n11, n5);
         var25.method_22918(n, (float)(var28[0] + (double)((float)var48) + var47 * n4), (float)(var28[1] + (double)((float)var50) + var49 * n4), 0.0F)
            .method_22915(n7, n13, n11, n5);
      }

      double[] var27 = var26[0];
      double var45 = var27[2];
      var25.method_22918(n, (float)var27[0], (float)var27[1] + (float)var45, 0.0F).method_22915(n7, n13, n11, n5);
      var25.method_22918(n, (float)var27[0], (float)(var27[1] + (double)((float)var45) + n4), 0.0F).method_22915(n7, n13, n11, n5);
      llIllIililIllIil.IIillIiliIil();
   }

   private static void IlIlllIlilIl() {
   }

   public static void Iilllilliill(
      class_4587 color4, Color n5, Color n2, Color color2, Color matrixStack, float color3, float n, float n3, float color, float n4, float n6
   ) {
      class_4588 var11 = llIllIililIllIil.IlIlllIlilIl(class_5596.field_27382);
      Matrix4f var12 = color4.method_23760().method_23761();
      var11.method_22918(var12, color3 - 10.0F, n - 10.0F, 0.0F).method_39415(n5.getRGB());
      var11.method_22918(var12, color3 - 10.0F, n + color + 20.0F, 0.0F).method_39415(n2.getRGB());
      var11.method_22918(var12, color3 + n3 + 20.0F, n + color + 20.0F, 0.0F).method_39415(color2.getRGB());
      var11.method_22918(var12, color3 + n3 + 20.0F, n - 10.0F, 0.0F).method_39415(matrixStack.getRGB());
      llIllIililIllIil.IIillIiliIil();
   }

   public static void IIIilIIiiIIi() {
      llIllIililIllIil.IIlllIlliIll();
   }

   public static void IiIlliIliiIl(class_4587 matrixStack, Color color, double n5, double n, double n6, double n4, double n2, double n3) {
      iliIiiliiiii(matrixStack, color, n5, n, n6, n4, n2, n2, n2, n2, n3);
   }

   public static void Iiilliiliiil() {
      llIllIililIllIil.IiIlliIliiIl();
   }

   public static class_243 iIlIlllllill(class_243 pos) {
      long var13 = -6547503037066103319L;
      class_4184 var1 = ilIllIiIll.Iiiilllliiilll.method_1561().field_4686;
      if (var1 == null) {
         return null;
      } else {
         var13 ^= ((long)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506() << 32 ^ var13) & -1L << 32;
         int[] var3 = illiIlIiIiliIlIi;
         var3[2] = ilIllIiIll.Iiiilllliiilll.method_22683().method_4489();
         var3[3] = ilIllIiIll.Iiiilllliiilll.method_22683().method_4506();
         Vector3f var4 = liliIlIiiiliIlIi;
         class_243 var5 = var1.method_71156();
         double var6 = pos.field_1352 - var5.field_1352;
         double var8 = pos.field_1351 - var5.field_1351;
         double var10 = pos.field_1350 - var5.field_1350;
         Vector4f var12 = IIiiIlIilIiiIlIi.set((float)var6, (float)var8, (float)var10, 1.0F).mul(iliIliIlIiiIliIl.IliIIiiIll);
         iIiiIlIiIliiIlIi.set(iliIliIlIiiIliIl.lIiIIiiIll).mul(iliIliIlIiiIliIl.iIiIIiiIll).project(var12.x(), var12.y(), var12.z(), var3, var4);
         return new class_243(
            (double)(var4.x / (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4495()),
            (double)(((float)((int)(var13 >>> 32)) - var4.y) / (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4495()),
            (double)var4.z
         );
      }
   }

   public static void Iilililiiili(class_4587 color, Color vec3d, class_243 vec3d2, class_243 matrixStack) {
      color.method_22903();
      Matrix4f var4 = color.method_23760().method_23761();
      iIiiIIilIliiIIil.IIIIllIIIl(var4, vec3d2, matrixStack, vec3d.getRGB(), 1.0F);
      color.method_22909();
   }

   public static void Illillliilli(class_4587 n6, float n4, float n3, float color, float n, float matrixStack, float n5, Color n2) {
      iIiiIIilIliiIIil.IIlilIliiIli(
         n6.method_23760().method_23761(),
         n4,
         n3,
         color,
         n,
         matrixStack,
         n5,
         (float)n2.getRed() / 255.0F,
         (float)n2.getGreen() / 255.0F,
         (float)n2.getBlue() / 255.0F,
         (float)n2.getAlpha() / 255.0F
      );
   }

   public static void IIiilIiiiIii(class_332 y, class_1799 drawContext, int scale, int z, float x, int itemStack) {
      if (!drawContext.method_7960()) {
         if (x == 1.0F) {
            y.method_51427(drawContext, scale, z);
         } else {
            y.method_51448().pushMatrix();
            y.method_51448().scale(x, x);
            y.method_51427(drawContext, (int)((float)scale / x), (int)((float)z / x));
            y.method_51448().popMatrix();
         }
      }
   }

   public static void IIillIiliIil(
      class_332 drawContext, Color n5, double n9, double n, double n2, double color, double n3, double n4, double n8, double n10, double n6, double n7
   ) {
      long var24 = -6999375999028825985L;
      var24 ^= ((long)n5.getRGB() << 32 ^ var24) & -1L << 32;
      Matrix4f var23 = new Matrix4f();
      IIIllIIliIIl();
      IIlllIlliIll(
         var23,
         (float)((int)(var24 >>> 32) >> 16 & 0xFF) / 255.0F,
         (float)((int)(var24 >>> 32) >> 8 & 0xFF) / 255.0F,
         (float)((int)(var24 >>> 32) & 0xFF) / 255.0F,
         (float)((int)(var24 >>> 32) >> 24 & 0xFF) / 255.0F,
         n9,
         n,
         n2,
         color,
         n3,
         n4,
         n8,
         n10,
         n6,
         n7
      );
      IlIlllIlilIl();
   }
}
