package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
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
import net.minecraft.class_11219;
import net.minecraft.class_11286;
import net.minecraft.class_11684;
import net.minecraft.class_12137;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_758;
import net.minecraft.class_758.class_4596;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

final class llIIiIililIIiIil {
   private static final int IiiIlllIil = 20;
   private static class_758 iiiIlllIil;
   private GpuBuffer IIlllllIil;
   private GpuTexture lIlllllIil;
   private final float[] IlIllllIil;
   private final String lIIllllIil;
   private static final int liiIlllIil = 64;
   static final float lilllllIil = 4200000.0F;
   private static final int iliIlllIil = 48;
   private int illllllIil;
   private int IilllllIil;
   private static class_12137 IIIllllIil;
   private GpuTextureView IllllllIil;
   private GpuTexture iIlllllIil;
   private ByteBuffer liIllllIil;
   private class_11286 iiIllllIil;
   private final Matrix4f ilIllllIil;
   private final ByteBuffer IiIllllIil;
   private final float[] iIIllllIil;
   private GpuTextureView lllllllIil;
   private final class_4587 llIllllIil = new class_4587();

   private GpuBufferSlice Illillliilli() {
      long var3 = -5269596450809657123L;
      if (this.IIlllllIil == null) {
         ByteBuffer var1 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());

         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 3; var5 += 4294967296L) {
            var1.putFloat((int)(var5 >>> 32) * 4, this.iIIllllIil[(int)(var5 >>> 32)]);
            var1.putFloat(16 + (int)(var5 >>> 32) * 4, this.IlIllllIil[(int)(var5 >>> 32)]);
         }

         this.IIlllllIil = RenderSystem.getDevice()
            .createBuffer(() -> iIIIlIlIIl<"iIIIlIlIIl","wP3thGAi1Dx9V+G8zYHY+HTriIHEy+7KN+EZGkk/HcBk7UMwGU+XiEgTmo8qLILzB0Vt">() + this.lIIllllIil, 128, var1);
      }

      return this.IIlllllIil.slice();
   }

   void IIIllIIliIIl() {
      if (this.iIlllllIil != null) {
         RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.iIlllllIil, 1.0);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void IiIlliIliiIl(int py, int pw, int px, int content, Matrix4f scene, IiiIIilliiIIil ph) {
      long var32 = 2207214291719327054L;
      long var34 = -1464196013219442115L;
      long var30 = 8866298925677731447L;
      if (this.lIlllllIil != null && px > 0 && content > 0) {
         float var7 = (float)px / (float)this.illllllIil;
         float var8 = (float)content / (float)this.IilllllIil;
         float var9 = (2.0F * (float)py + (float)px) / (float)this.illllllIil - 1.0F;
         float var10 = 1.0F - (2.0F * (float)pw + (float)content) / (float)this.IilllllIil;
         this.ilIllllIil.identity().translate(var9, var10, 0.0F).scale(var7, var8, 1.0F).mul(scene);
         if (this.iiIllllIil == null) {
            this.iiIllllIil = new class_11286(iIIIlIlIIl<"iIIIlIlIIl","sFKO6GvRSzgCYMLtUjS/xqnFTRB//ek50O/IvR3c18xBXJDWNiOV0G0OXEQ=">() + this.lIIllllIil);
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

            RenderSystem.outputColorTextureOverride = this.IllllllIil;
            RenderSystem.outputDepthTextureOverride = this.lllllllIil;
            RenderSystem.setProjectionMatrix(this.iiIllllIil.method_71123(this.ilIllllIil), class_10366.field_54953);
            RenderSystem.setShaderFog(IIlilIliiIli());
            RenderSystem.setShaderLights(this.Illillliilli());
            class_11684 var25 = var11.field_1773.method_72911();
            this.llIllllIil.method_34426();
            boolean var52 = false /* VF: Semaphore variable */;

            try {
               var52 = true;
               ph.draw(this.llIllllIil, var25.method_73003());
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

   void IIlllIlliIll(
      Matrix4f m,
      float maskY1,
      float h,
      float v0,
      float w,
      float v1,
      float u1,
      float alpha,
      float u0,
      float maskX0,
      float x,
      float maskY0,
      float radius,
      float maskX1,
      float y
   ) {
      if (this.IllllllIil != null && !(y <= 0.002F) && !(v0 <= 0.0F) && !(w <= 0.0F)) {
         float var16 = m.m00() * maskY1 + m.m30();
         float var17 = m.m11() * h + m.m31();
         float var18 = m.m00() * (maskY1 + v0) + m.m30();
         float var19 = m.m11() * (h + w) + m.m31();
         this.IiIllllIil.clear();
         IIIilIIiiIIi(this.IiIllllIil, var16, var19, v1, u0);
         IIIilIIiiIIi(this.IiIllllIil, var18, var19, alpha, u0);
         IIIilIIiiIIi(this.IiIllllIil, var18, var17, alpha, u1);
         IIIilIIiiIIi(this.IiIllllIil, var16, var17, v1, u1);
         this.IiIllllIil.flip();
         this.IIillIiliIil(this.IiIllllIil, 1, maskX0, x, maskY0, radius, maskX1, y);
      }
   }

   private void IIillIiliIil(ByteBuffer data, int alpha, float quads, float maskX0, float radius, float maskX1, float maskY0, float maskY1) {
      long var25 = 891598410963706517L;
      class_310 var9 = class_310.method_1551();
      var25 ^= ((long)var9.method_22683().method_4489() << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)var9.method_22683().method_4506() ^ var25) & -1L >>> 32;
      float var12 = (float)var9.method_22683().method_4495();
      float var13 = IliiIilliiIi.lIIlllIIliIIlllIIl > 0.0F ? IliiIilliiIi.lIIlllIIliIIlllIIl : (float)((int)(var25 >>> 32)) / var12;
      float var14 = IliiIilliiIi.IlIlllIIlllIlllIIl > 0.0F ? IliiIilliiIi.IlIlllIIlllIlllIIl : (float)((int)var25) / var12;
      float var15 = (float)((int)var25) / var14;
      illliiIillii var16 = IIlliiillIlliiil.iIlIlllllill(data, 20);
      ByteBuffer var17 = IIlliiillIlliiil.IliIlllilIi(48);
      var17.putFloat(0, var13);
      var17.putFloat(4, var14);
      var17.putFloat(8, (float)((int)(var25 >>> 32)));
      var17.putFloat(12, (float)((int)var25));
      var17.putFloat(16, Math.min(quads, radius) * var15);
      var17.putFloat(20, (float)((int)var25) - Math.max(maskX0, maskX1) * var15);
      var17.putFloat(24, Math.max(quads, radius) * var15);
      var17.putFloat(28, (float)((int)var25) - Math.min(maskX0, maskX1) * var15);
      var17.putFloat(32, Math.max(0.0F, maskY0 * var15));
      var17.putFloat(36, Math.min(1.0F, maskY1));
      var17.putFloat(40, 0.0F);
      var17.putFloat(44, 0.0F);
      GpuBufferSlice var18 = IIlliiillIlliiil.liiiIIllIl(var17);
      class_5590 var19 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
      GpuBuffer var20 = var19.method_68274(alpha * 6);
      class_276 var21 = var9.method_1522();
      RenderPass var22 = RenderSystem.getDevice()
         .createCommandEncoder()
         .createRenderPass(
            () -> iIIIlIlIIl<"iIIIlIlIIl","h7eGb5QfDfUQhbM+kjqRCf/gXIj+PnoRFtEjztbCrAGh927KDNyUOR2m8wDEAnaix0YorTM=">(),
            var21.method_71639(),
            OptionalInt.empty(),
            var21.method_71640(),
            OptionalDouble.empty()
         );

      try {
         IIlliiillIlliiil.iliillIiil++;
         var22.setPipeline(IIllIllllIllIlll.llIIiIIill);
         iIIiilIiIlIiilIi.IilliliilIIi(var22);
         var22.setUniform(iIIIlIlIIl<"iIIIlIlIIl","v0jw/TVDiZeIXGlLYTR913/ypjoKkhuCa1g9AP5GPJyqOu+SVDlt3ryd">(), var18);
         var22.bindTexture(iIIIlIlIIl<"iIIIlIlIIl","3orIYmWqiR2mDXTiSTWTj6eZCghI/pkJvyravk5s2j9fA6AF">(), this.IllllllIil, Iilililiiili());
         var22.setVertexBuffer(0, var16.IliIlllilIi());
         var22.setIndexBuffer(var20, var19.method_31924());
         var22.drawIndexed(var16.liiiIIllIl(), 0, alpha * 6, 1);
      } catch (Throwable var28) {
         if (var22 != null) {
            try {
               var22.close();
            } catch (Throwable var27) {
               var28.addSuppressed(var27);
            }
         }

         throw var28;
      }

      if (var22 != null) {
         var22.close();
      }
   }

   void iliIiiliiiii(int needH, int needW) {
      long var9 = 1182906830528888447L;
      long var11 = -1332596718218870920L;
      long var13 = 6421903917208087605L;
      var9 ^= ((long)Math.max(1, needH) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)Math.max(1, needW) ^ var9) & -1L >>> 32;
      GpuDevice var5 = RenderSystem.getDevice();
      var11 ^= ((long)Math.min(8192, var5.getMaxTextureSize()) << 32 ^ var11) & -1L << 32;
      var9 ^= ((long)Math.min((int)(var9 >>> 32), (int)(var11 >>> 32)) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)Math.min((int)var9, (int)(var11 >>> 32)) ^ var9) & -1L >>> 32;
      var11 ^= ((long)Math.min((int)(var11 >>> 32), IlIlllIlilIl((int)(var9 >>> 32))) ^ var11) & -1L >>> 32;
      var13 ^= ((long)Math.min((int)(var11 >>> 32), IlIlllIlilIl((int)var9)) << 32 ^ var13) & -1L << 32;
      if (this.lIlllllIil == null
         || (int)(var9 >>> 32) > this.illllllIil
         || (int)var9 > this.IilllllIil
         || (int)var11 <= this.illllllIil / 2
         || (int)(var13 >>> 32) <= this.IilllllIil / 2) {
         this.IlIillIiilIi();
         this.illllllIil = Math.min((int)(var11 >>> 32), IlIlllIlilIl((int)(var9 >>> 32)));
         this.IilllllIil = Math.min((int)(var11 >>> 32), IlIlllIlilIl((int)var9));
         this.lIlllllIil = var5.createTexture(
            () -> iIIIlIlIIl<"iIIIlIlIIl","sFKO6GvRSzgCYMLtUjS/xqnFTRB//ek50O/IvR3c18xBXJDWNiOV0G0OXEQ=">() + this.lIIllllIil,
            12,
            TextureFormat.RGBA8,
            this.illllllIil,
            this.IilllllIil,
            1,
            1
         );
         this.IllllllIil = var5.createTextureView(this.lIlllllIil);
         this.iIlllllIil = var5.createTexture(
            () -> iIIIlIlIIl<"iIIIlIlIIl","YoRfdSfx3WFXS+o74J8YXEq196BeWQERtqqlyx3OmdMcnFP5tnhfxNfXsN3MOjqvs58=">() + this.lIIllllIil,
            8,
            TextureFormat.DEPTH32,
            this.illllllIil,
            this.IilllllIil,
            1,
            1
         );
         this.lllllllIil = var5.createTextureView(this.iIlllllIil);
      }

      var5.createCommandEncoder().clearColorAndDepthTextures(this.lIlllllIil, 0, this.iIlllllIil, 1.0);
   }

   private static class_12137 Iilililiiili() {
      if (IIIllllIil == null) {
         IIIllllIil = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
      }

      return IIIllllIil;
   }

   llIIiIililIIiIil(String label, float[] key, float[] fill) {
      this.ilIllllIil = new Matrix4f();
      this.IiIllllIil = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder());
      this.lIIllllIil = label;
      this.iIIllllIil = key;
      this.IlIllllIil = fill;
   }

   private static void IIIilIIiiIIi(ByteBuffer u, float v, float b, float x, float y) {
      u.putFloat(v).putFloat(b).putFloat(0.0F).putFloat(x).putFloat(y);
   }

   private void Iilllilliill(Matrix4f tw, float bh, float by, float x, float th, float bx, float bw, int m, int y) {
      float var10 = tw.m00() * bh + tw.m30();
      float var11 = tw.m11() * by + tw.m31();
      IIIilIIiiIIi(this.liIllllIil, var10, var11, this.Ililllililil((bh - x) / bx * (float)m), this.Iiilliiliiil((by - th) / bw * (float)y));
   }

   void Illlllllilll(Matrix4f th, float by, float cx, float[] alpha, float[] bx, int bh, float n, float tw, float ys, float cy, int m, int bw, float xs) {
      long var19 = -4968373913373323869L;
      long var21 = -644845689625370266L;
      if (this.IllllllIil != null && !(xs <= 0.002F) && bh >= 3 && !(ys <= 0.0F) && !(cy <= 0.0F)) {
         var19 ^= ((long)(bh * 4 * 20) << 32 ^ var19) & -1L << 32;
         if (this.liIllllIil == null || this.liIllllIil.capacity() < (int)(var19 >>> 32)) {
            this.liIllllIil = ByteBuffer.allocateDirect((int)(var19 >>> 32)).order(ByteOrder.nativeOrder());
         }

         this.liIllllIil.clear();

         for (long var24 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var24 < bh; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            var21 ^= ((long)(((int)var24 + 1) % bh) << 32 ^ var21) & -1L << 32;
            this.Iilllilliill(th, by, cx, n, tw, ys, cy, m, bw);
            this.Iilllilliill(th, alpha[(int)var24], bx[(int)var24], n, tw, ys, cy, m, bw);
            this.Iilllilliill(th, alpha[(int)(var21 >>> 32)], bx[(int)(var21 >>> 32)], n, tw, ys, cy, m, bw);
            this.Iilllilliill(th, alpha[(int)(var21 >>> 32)], bx[(int)(var21 >>> 32)], n, tw, ys, cy, m, bw);
         }

         this.liIllllIil.flip();
         class_310 var15 = class_310.method_1551();
         float var16 = (float)var15.method_22683().method_4495();
         float var17 = (float)var15.method_22683().method_4489() / var16;
         float var18 = (float)var15.method_22683().method_4506() / var16;
         this.IIillIiliIil(this.liIllllIil, bh, 0.0F, 0.0F, var17, var18, 0.0F, xs);
      }
   }

   private void IlIillIiilIi() {
      if (this.IllllllIil != null) {
         this.IllllllIil.close();
      }

      if (this.lIlllllIil != null) {
         this.lIlllllIil.close();
      }

      if (this.lllllllIil != null) {
         this.lllllllIil.close();
      }

      if (this.iIlllllIil != null) {
         this.iIlllllIil.close();
      }

      this.IllllllIil = null;
      this.lIlllllIil = null;
      this.lllllllIil = null;
      this.iIlllllIil = null;
      this.illllllIil = 0;
      this.IilllllIil = 0;
   }

   static boolean liiiIIllIl() {
      return IIllIllllIllIlll.IliIlllilIi();
   }

   float Iiilliiliiil(float py) {
      return 1.0F - py / (float)Math.max(1, this.IilllllIil);
   }

   int IilliliilIIi() {
      return this.IilllllIil;
   }

   private static int IlIlllIlilIl(int v) {
      return (v + 64 - 1) / 64 * 64;
   }

   static float IliIlllilIi(float scale, float guiW, float guiH) {
      float var3 = Math.max(1.0F, scale * guiW);
      return Math.min(guiH, (float)Math.sqrt((double)(4200000.0F / var3)));
   }

   float Ililllililil(float px) {
      return px / (float)Math.max(1, this.illllllIil);
   }

   private static GpuBufferSlice IIlilIliiIli() {
      if (iiiIlllIil == null) {
         iiiIlllIil = new class_758();
      }

      return iiiIlllIil.method_71109(class_4596.field_60101);
   }

   int iIlIlllllill() {
      return this.illllllIil;
   }

   boolean lIiiIiIlilli() {
      return this.lIlllllIil != null;
   }

   void IiIiliIiiiIi() {
      this.IlIillIiilIi();
      if (this.iiIllllIil != null) {
         this.iiIllllIil.close();
      }

      this.iiIllllIil = null;
      if (this.IIlllllIil != null) {
         this.IIlllllIil.close();
      }

      this.IIlllllIil = null;
   }
}
