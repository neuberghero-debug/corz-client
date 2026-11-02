package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_10366;
import net.minecraft.class_10789;
import net.minecraft.class_11219;
import net.minecraft.class_11286;
import net.minecraft.class_11684;
import net.minecraft.class_12137;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_758;
import net.minecraft.class_758.class_4596;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public final class IIllIllllIllIlll {
   private static final float[] IlIIiIIill = new float[]{0.52F, 0.08F, 0.3F};
   private static final int iiiilIIill = 48;
   private final String lIlIiIIill;
   private GpuTexture IilIiIIill;
   private static GpuBuffer liIIiIIill;
   private int iIiIiIIill;
   private GpuTexture lilIiIIill;
   private class_11286 illIiIIill;
   private final Matrix4f IllIiIIill;
   private GpuTextureView iilIiIIill;
   private static final int lIIIiIIill = 64;
   private static Boolean ilIIiIIill;
   private GpuTextureView IIiIiIIill;
   public static final RenderPipeline llIIiIIill = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            Illillliilli<"Illillliilli","IZ2fQONwqcYScA376+oylpYTqxxteLiFwh1+ZBux3Ar874HQKbI=">(),
            Illillliilli<"Illillliilli","OSOE1bxvdbGvwtiseBoDsDy3RMHcI2j/BTavLAvvZXZy5UQD0uTdnTZYuX8NXxuK">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            Illillliilli<"Illillliilli","IZ2fQONwqcYScA376+oylpYTqxxteLiFwh1+ZBux3Ar874HQKbI=">(),
            Illillliilli<"Illillliilli","KKRMFFB9iyZSv2rt086Z8CqqYd8GS8QgU96byWq9LnbRZLiqqt+BTJrNNNA5Hd+nag==">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            Illillliilli<"Illillliilli","IZ2fQONwqcYScA376+oylpYTqxxteLiFwh1+ZBux3Ar874HQKbI=">(),
            Illillliilli<"Illillliilli","KKRMFFB9iyZSv2rt086Z8CqqYd8GS8QgU96byWq9LnbRZLiqqt+BTJrNNNA5Hd+nag==">()
         )
      )
      .withVertexFormat(class_290.field_1585, class_5596.field_27382)
      .withUniform(Illillliilli<"Illillliilli","o6DrHxOmccVyrxipTgARTGqcnseedDQer0NlQp8m17N7JjZa1Yf1LjFN">(), class_10789.field_60031)
      .withSampler(Illillliilli<"Illillliilli","CWHPJep0bi2ISWQBbFPKv5D/ktbHsP+MyADudT8w5VXZaR9u">())
      .withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static final int IIIIiIIill = 20;
   private final ByteBuffer lllIiIIill;
   private static int IiIIiIIill;
   private static class_758 iiIIiIIill;
   private int lIiIiIIill;
   public static final int liiilIIill = 2;
   private final class_4587 iIlIiIIill = new class_4587();
   private static class_12137 IIlIiIIill;
   private static final float[] iIIIiIIill = new float[]{-0.42F, 0.78F, 0.62F};

   public float IiIlliIliiIl(int px) {
      return (float)px / (float)Math.max(1, this.lIiIiIIill);
   }

   public int IilliliilIIi() {
      return this.iIiIiIIill;
   }

   public static int liiiIIllIl() {
      if (IiIIiIIill <= 0) {
         IiIIiIIill = Math.max(64, Math.min(8192, RenderSystem.getDevice().getMaxTextureSize()));
      }

      return IiIIiIIill;
   }

   private static GpuBufferSlice IIillIiliIil() {
      if (iiIIiIIill == null) {
         iiIIiIIill = new class_758();
      }

      return iiIIiIIill.method_71109(class_4596.field_60101);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void IIIllIIliIIl(int pw, int ph, int py, int content, Matrix4f px, IiiIIilliiIIil scene) {
      long var32 = 4529094459490950877L;
      long var34 = 3291204280019982253L;
      long var30 = -7472224481493564675L;
      if (this.IilIiIIill != null && py > 0 && content > 0) {
         float var7 = (float)py / (float)this.lIiIiIIill;
         float var8 = (float)content / (float)this.iIiIiIIill;
         float var9 = (2.0F * (float)pw + (float)py) / (float)this.lIiIiIIill - 1.0F;
         float var10 = 1.0F - (2.0F * (float)ph + (float)content) / (float)this.iIiIiIIill;
         this.IllIiIIill.identity().translate(var9, var10, 0.0F).scale(var7, var8, 1.0F).mul(px);
         if (this.illIiIIill == null) {
            this.illIiIIill = new class_11286(Illillliilli<"Illillliilli","uwTaMe/T6VgRb4Q27aBPrvcdL+AdexgDlrHexO2YkMpeptzNQ14ofd2KQQUG">() + this.lIlIiIIill);
         }

         class_310 var11 = class_310.method_1551();
         GpuTextureView var12 = RenderSystem.outputColorTextureOverride;
         GpuTextureView var13 = RenderSystem.outputDepthTextureOverride;
         GpuBufferSlice var14 = RenderSystem.getProjectionMatrixBuffer();
         class_10366 var15 = RenderSystem.getProjectionType();
         GpuBufferSlice var16 = RenderSystem.getShaderFog();
         GpuBufferSlice var17 = RenderSystem.getShaderLights();
         class_11219 var18 = RenderSystem.getScissorStateForRenderTypeDraws();
         var30 ^= ((long)var18.method_72091() << 32 ^ var30) & -1L << 32;
         var30 ^= ((long)var18.method_72092() ^ var30) & -1L >>> 32;
         var32 ^= ((long)var18.method_72093() << 32 ^ var32) & -1L << 32;
         var32 ^= ((long)var18.method_72094() ^ var32) & -1L >>> 32;
         var34 ^= ((long)var18.method_72095() << 32 ^ var34) & -1L << 32;
         Matrix4fStack var24 = RenderSystem.getModelViewStack();
         var24.pushMatrix();

         try {
            var24.identity();
            if ((int)(var30 >>> 32) != 0) {
               RenderSystem.disableScissorForRenderTypeDraws();
            }

            RenderSystem.outputColorTextureOverride = this.iilIiIIill;
            RenderSystem.outputDepthTextureOverride = this.IIiIiIIill;
            RenderSystem.setProjectionMatrix(this.illIiIIill.method_71123(this.IllIiIIill), class_10366.field_54953);
            RenderSystem.setShaderFog(IIillIiliIil());
            RenderSystem.setShaderLights(Ililllililil());
            class_11684 var25 = var11.field_1773.method_72911();
            this.iIlIiIIill.method_34426();
            boolean var52 = false /* VF: Semaphore variable */;

            try {
               var52 = true;
               scene.draw(this.iIlIiIIill, var25.method_73003());
               var52 = false;
            } finally {
               if (var52) {
                  try {
                     var25.method_73002();
                  } finally {
                     var11.method_22940().method_23000().method_22993();
                  }
               }
            }

            try {
               var25.method_73002();
            } finally {
               var11.method_22940().method_23000().method_22993();
            }
         } finally {
            RenderSystem.outputColorTextureOverride = var12;
            RenderSystem.outputDepthTextureOverride = var13;
            if (var14 != null) {
               RenderSystem.setProjectionMatrix(var14, var15);
            }

            if (var16 != null) {
               RenderSystem.setShaderFog(var16);
            }

            if (var17 != null) {
               RenderSystem.setShaderLights(var17);
            }

            if ((int)(var30 >>> 32) != 0) {
               RenderSystem.enableScissorForRenderTypeDraws((int)var30, (int)(var32 >>> 32), (int)var32, (int)(var34 >>> 32));
            }

            var24.popMatrix();
         }
      }
   }

   private static int iliIiiliiiii(int v) {
      return (v + 64 - 1) / 64 * 64;
   }

   public IIllIllllIllIlll(String label) {
      this.IllIiIIill = new Matrix4f();
      this.lllIiIIill = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder());
      this.lIlIiIIill = label;
   }

   public void IlIlllIlilIl(
      Matrix4f w,
      float v1,
      float radius,
      float x,
      float maskX0,
      float maskY0,
      float y,
      float m,
      float u0,
      float v0,
      float alpha,
      float maskY1,
      float maskX1,
      float h,
      float u1
   ) {
      long var36 = 5951720244846519565L;
      if (this.iilIiIIill != null && !(u1 <= 0.002F) && !(x <= 0.0F) && !(maskX0 <= 0.0F)) {
         class_310 var16 = class_310.method_1551();
         var36 ^= ((long)var16.method_22683().method_4489() << 32 ^ var36) & -1L << 32;
         var36 ^= ((long)var16.method_22683().method_4506() ^ var36) & -1L >>> 32;
         float var19 = (float)var16.method_22683().method_4495();
         float var20 = IliiIilliiIi.lIIlllIIliIIlllIIl > 0.0F ? IliiIilliiIi.lIIlllIIliIIlllIIl : (float)((int)(var36 >>> 32)) / var19;
         float var21 = IliiIilliiIi.IlIlllIIlllIlllIIl > 0.0F ? IliiIilliiIi.IlIlllIIlllIlllIIl : (float)((int)var36) / var19;
         float var22 = (float)((int)var36) / var21;
         float var23 = w.m00() * v1 + w.m30();
         float var24 = w.m11() * radius + w.m31();
         float var25 = w.m00() * (v1 + x) + w.m30();
         float var26 = w.m11() * (radius + maskX0) + w.m31();
         this.lllIiIIill.clear();
         this.Illlllllilll(var23, var26, maskY0, u0);
         this.Illlllllilll(var25, var26, m, u0);
         this.Illlllllilll(var25, var24, m, y);
         this.Illlllllilll(var23, var24, maskY0, y);
         this.lllIiIIill.flip();
         illliiIillii var27 = IIlliiillIlliiil.iIlIlllllill(this.lllIiIIill, 20);
         ByteBuffer var28 = IIlliiillIlliiil.IliIlllilIi(48);
         var28.putFloat(0, var20);
         var28.putFloat(4, var21);
         var28.putFloat(8, (float)((int)(var36 >>> 32)));
         var28.putFloat(12, (float)((int)var36));
         var28.putFloat(16, Math.min(v0, maskY1) * var22);
         var28.putFloat(20, (float)((int)var36) - Math.max(alpha, maskX1) * var22);
         var28.putFloat(24, Math.max(v0, maskY1) * var22);
         var28.putFloat(28, (float)((int)var36) - Math.min(alpha, maskX1) * var22);
         var28.putFloat(32, Math.max(0.0F, h * var22));
         var28.putFloat(36, Math.min(1.0F, u1));
         var28.putFloat(40, 0.0F);
         var28.putFloat(44, 0.0F);
         GpuBufferSlice var29 = IIlliiillIlliiil.liiiIIllIl(var28);
         class_5590 var30 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
         GpuBuffer var31 = var30.method_68274(6);
         class_276 var32 = var16.method_1522();
         RenderPass var33 = RenderSystem.getDevice()
            .createCommandEncoder()
            .createRenderPass(
               () -> Illillliilli<"Illillliilli","hY+ZKhgB5UY/Rxh90CPoW5H4+Nc7lmel2w5E6MzlO5hmFfeDkIa3BGTNo3HkX9YOB1TM3SjV">(),
               var32.method_71639(),
               OptionalInt.empty(),
               var32.method_71640(),
               OptionalDouble.empty()
            );

         try {
            IIlliiillIlliiil.iliillIiil++;
            var33.setPipeline(llIIiIIill);
            iIIiilIiIlIiilIi.IilliliilIIi(var33);
            var33.setUniform(Illillliilli<"Illillliilli","o6DrHxOmccVyrxipTgARTGqcnseedDQer0NlQp8m17N7JjZa1Yf1LjFN">(), var29);
            var33.bindTexture(Illillliilli<"Illillliilli","CWHPJep0bi2ISWQBbFPKv5D/ktbHsP+MyADudT8w5VXZaR9u">(), this.iilIiIIill, Iiilliiliiil());
            var33.setVertexBuffer(0, var27.IliIlllilIi());
            var33.setIndexBuffer(var31, var30.method_31924());
            var33.drawIndexed(var27.liiiIIllIl(), 0, 6, 1);
         } catch (Throwable var39) {
            if (var33 != null) {
               try {
                  var33.close();
               } catch (Throwable var38) {
                  var39.addSuppressed(var38);
               }
            }

            throw var39;
         }

         if (var33 != null) {
            var33.close();
         }
      }
   }

   public void Iilllilliill() {
      if (this.iilIiIIill != null) {
         this.iilIiIIill.close();
      }

      if (this.IilIiIIill != null) {
         this.IilIiIIill.close();
      }

      if (this.IIiIiIIill != null) {
         this.IIiIiIIill.close();
      }

      if (this.lilIiIIill != null) {
         this.lilIiIIill.close();
      }

      if (this.illIiIIill != null) {
         this.illIiIIill.close();
      }

      this.illIiIIill = null;
      this.iilIiIIill = null;
      this.IilIiIIill = null;
      this.IIiIiIIill = null;
      this.lilIiIIill = null;
      this.lIiIiIIill = 0;
      this.iIiIiIIill = 0;
   }

   public int iIlIlllllill() {
      return this.lIiIiIIill;
   }

   private void Illlllllilll(float y, float u, float v, float x) {
      this.lllIiIIill.putFloat(y).putFloat(u).putFloat(0.0F).putFloat(v).putFloat(x);
   }

   public float IIlllIlliIll(int py) {
      return 1.0F - (float)py / (float)Math.max(1, this.iIiIiIIill);
   }

   public void lIiiIiIlilli(int needH, int needW) {
      long var7 = 5050497851164247734L;
      long var9 = 1740632722522106522L;
      var7 ^= ((long)Math.max(1, needH) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)Math.max(1, needW) ^ var7) & -1L >>> 32;
      GpuDevice var5 = RenderSystem.getDevice();
      var9 ^= ((long)Math.min(8192, var5.getMaxTextureSize()) << 32 ^ var9) & -1L << 32;
      var7 ^= ((long)Math.min((int)(var7 >>> 32), (int)(var9 >>> 32)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)Math.min((int)var7, (int)(var9 >>> 32)) ^ var7) & -1L >>> 32;
      if (this.IilIiIIill == null || (int)(var7 >>> 32) > this.lIiIiIIill || (int)var7 > this.iIiIiIIill) {
         this.Iilllilliill();
         this.lIiIiIIill = Math.min((int)(var9 >>> 32), iliIiiliiiii((int)(var7 >>> 32)));
         this.iIiIiIIill = Math.min((int)(var9 >>> 32), iliIiiliiiii((int)var7));
         this.IilIiIIill = var5.createTexture(
            () -> Illillliilli<"Illillliilli","uwTaMe/T6VgRb4Q27aBPrvcdL+AdexgDlrHexO2YkMpeptzNQ14ofd2KQQUG">() + this.lIlIiIIill,
            12,
            TextureFormat.RGBA8,
            this.lIiIiIIill,
            this.iIiIiIIill,
            1,
            1
         );
         this.iilIiIIill = var5.createTextureView(this.IilIiIIill);
         this.lilIiIIill = var5.createTexture(
            () -> Illillliilli<"Illillliilli","OOWhxDSbF6QIm30R2LJMTTWpi4T5LJAETF9LyIAKh7tyE65+8PhjdD5iVX87nLNPlh15">() + this.lIlIiIIill,
            8,
            TextureFormat.DEPTH32,
            this.lIiIiIIill,
            this.iIiIiIIill,
            1,
            1
         );
         this.IIiIiIIill = var5.createTextureView(this.lilIiIIill);
      }

      var5.createCommandEncoder().clearColorAndDepthTextures(this.IilIiIIill, 0, this.lilIiIIill, 1.0);
   }

   public static boolean IliIlllilIi() {
      if (ilIIiIIill == null) {
         try {
            ilIIiIIill = RenderSystem.getDevice().precompilePipeline(llIIiIIill).isValid();
         } catch (Throwable var1) {
            ilIIiIIill = false;
         }
      }

      return ilIIiIIill;
   }

   private static GpuBufferSlice Ililllililil() {
      long var2 = 6650700377576302567L;
      if (liIIiIIill == null) {
         ByteBuffer var0 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());

         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 3; var4 += 4294967296L) {
            var0.putFloat((int)(var4 >>> 32) * 4, iIIIiIIill[(int)(var4 >>> 32)]);
            var0.putFloat(16 + (int)(var4 >>> 32) * 4, IlIIiIIill[(int)(var4 >>> 32)]);
         }

         liIIiIIill = RenderSystem.getDevice()
            .createBuffer(() -> Illillliilli<"Illillliilli","nb2ihm+fwP9fewnyK+UhVOd2XfFcH4gI11LYTrDnDHpnxEPDCqraplqrGeKMEo3aa8bK">(), 128, var0);
      }

      return liIIiIIill.slice();
   }

   private static class_12137 Iiilliiliiil() {
      if (IIlIiIIill == null) {
         IIlIiIIill = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
      }

      return IIlIiIIill;
   }
}
