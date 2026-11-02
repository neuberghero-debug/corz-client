package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_12137;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;

public class liiIlIliiiiIlIli {
   private GpuBuffer lIllIIllIi;
   private int[] IIilIIllIi;
   private int[] iillIIllIi;
   private int[] lIilIIllIi;
   private static final Vector4f llIlIIllIi = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private ByteBuffer IlllIIllIi;
   private static final Vector3f ilIlIIllIi = new Vector3f(0.0F, 0.0F, 0.0F);
   private boolean liilIIllIi;
   private static final Matrix4f IiIlIIllIi = new Matrix4f();
   private static final int liIlIIllIi = 8;
   private GpuTexture[] llllIIllIi;
   private class_12137 iIllIIllIi;
   private int ililIIllIi;
   private GpuTextureView[] lillIIllIi;
   private GpuBuffer IIllIIllIi;
   private GpuTextureView[] illlIIllIi;
   private int[] iIilIIllIi;
   private static final int iiIlIIllIi = 16;
   private GpuTexture IlilIIllIi;
   private int IiilIIllIi;
   private GpuTextureView llilIIllIi;
   private GpuTexture[] IillIIllIi;

   private static GpuBuffer IlIlllIlilIl(String name) {
      ByteBuffer var1 = MemoryUtil.memAlloc(4);

      GpuBuffer var2;
      try {
         var1.putInt(0);
         var1.flip();
         var2 = RenderSystem.getDevice().createBuffer(() -> name, 32, var1);
      } finally {
         MemoryUtil.memFree(var1);
      }

      return var2;
   }

   private void IilliliilIIi(
      CommandEncoder h, RenderPipeline source, GpuTextureView pipeline, GpuTextureView offset, int encoder, int name, float w, String target
   ) {
      if (pipeline != null && offset != null) {
         this.lIiiIiIlilli(encoder, name, w);
         this.iliIiiliiiii(h);
         GpuBufferSlice var9 = RenderSystem.getDynamicUniforms().method_71106(RenderSystem.getModelViewMatrix(), llIlIIllIi, ilIlIIllIi, IiIlIIllIi);
         RenderPass var10 = h.createRenderPass(() -> target, offset, OptionalInt.of(0));

         try {
            var10.setPipeline(source);
            var10.setVertexBuffer(0, this.lIllIIllIi);
            var10.bindTexture(IIIilIIiiIIi<"IIIilIIiiIIi","feKxLfXSGInysEgsiuhYO4BA5P4Fxcs/RAnfNQKxkG7P7qWJ">(), pipeline, this.iIllIIllIi);
            RenderSystem.bindDefaultUniforms(var10);
            var10.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","nj3euKzXmUnM6+vp6P8RDtccdzRjXUcY/kSomEg58U/cQIptFYtyz7mf2aRF">(), var9);
            var10.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","czTW2NYnQ/ZO6NWq1065Mu+bg96IVx60QT7BALxqOfjWdIMHr3s=">(), this.IIllIIllIi);
            var10.draw(0, 6);
         } catch (Throwable var14) {
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Throwable var13) {
                  var14.addSuppressed(var13);
               }
            }

            throw var14;
         }

         if (var10 != null) {
            var10.close();
         }
      }
   }

   public GpuTextureView IliIlllilIi(GpuTexture w, GpuTextureView iterations, int h, int sourceTexture, int offset, float sourceView) {
      long var12 = 7513126857270014842L;
      long var14 = -966266536912955164L;
      if (w != null && iterations != null && h > 0 && sourceTexture > 0) {
         this.liiiIIllIl();
         this.iIlIlllllill(h, sourceTexture);
         offset = Math.min(Math.max(offset, 1), 8);
         CommandEncoder var7 = RenderSystem.getDevice().createCommandEncoder();
         GpuTextureView var8 = iterations;
         var12 ^= ((long)h << 32 ^ var12) & -1L << 32;
         var12 ^= ((long)sourceTexture ^ var12) & -1L >>> 32;

         for (var14 ^= (0L ^ var14) & -1L << 32; (int)(var14 >>> 32) < offset; var14 += 4294967296L) {
            this.IilliliilIIi(
               var7,
               lIliiiliIliiil.iIIiillliIlIiillli,
               var8,
               this.illlIIllIi[(int)(var14 >>> 32)],
               (int)(var12 >>> 32),
               (int)var12,
               sourceView,
               IIIilIIiiIIi<"IIIilIIiiIIi","BMfzb/nhRGwVNEzTJGo/YnKCUGfYZWHq7F0s6vYBkAPTR93UV7N9juUVtf4qAlJ0/6yF">() + (int)(var14 >>> 32)
            );
            var8 = this.illlIIllIi[(int)(var14 >>> 32)];
            var12 ^= ((long)this.iillIIllIi[(int)(var14 >>> 32)] << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)this.IIilIIllIi[(int)(var14 >>> 32)] ^ var12) & -1L >>> 32;
         }

         for (long var22 = var14 ^ ((long)(offset - 1) << 32 ^ var14) & -1L << 32; (int)(var22 >>> 32) >= 0; var22 += -4294967296L) {
            this.IilliliilIIi(
               var7,
               lIliiiliIliiil.llIiillliilIiillli,
               var8,
               this.lillIIllIi[(int)(var22 >>> 32)],
               (int)(var12 >>> 32),
               (int)var12,
               sourceView,
               IIIilIIiiIIi<"IIIilIIiiIIi","fUHOwQCPtrCUXiPOlBttXpejQiT8+fKJapU0u2X3Xrjspd4wGX0OTCQVGTV5q06CjA==">() + (int)(var22 >>> 32)
            );
            var8 = this.lillIIllIi[(int)(var22 >>> 32)];
            var12 ^= ((long)this.lIilIIllIi[(int)(var22 >>> 32)] << 32 ^ var12) & -1L << 32;
            var12 ^= ((long)this.iIilIIllIi[(int)(var22 >>> 32)] ^ var12) & -1L >>> 32;
         }

         this.IilliliilIIi(
            var7,
            lIliiiliIliiil.llIiillliilIiillli,
            var8,
            this.llilIIllIi,
            (int)(var12 >>> 32),
            (int)var12,
            sourceView,
            IIIilIIiiIIi<"IIIilIIiiIIi","AECK2aUw4f8l1lcCrQ3yBdNMbVt0MSbBIGbqYtjP5XySWtJsOOKSa1CSlS7J0Y46rhSh">()
         );
         return this.llilIIllIi;
      } else {
         return null;
      }
   }

   private void lIiiIiIlilli(int offset, int w, float h) {
      this.IlllIIllIi.clear();
      this.IlllIIllIi.putFloat((float)offset);
      this.IlllIIllIi.putFloat((float)w);
      this.IlllIIllIi.putFloat(h);
      this.IlllIIllIi.putFloat(0.0F);
      this.IlllIIllIi.flip();
   }

   private void liiiIIllIl() {
      if (!this.liilIIllIi) {
         this.IlllIIllIi = MemoryUtil.memAlloc(16);
         this.lIllIIllIi = IlIlllIlilIl(IIIilIIiiIIi<"IIIilIIiiIIi","yxWCq6tfcy7P7zuWI0IWOcCkDxo/9VPswljeIHNwdfJI/mi2haOOr4iVySNAmL4xQCs/SB18WOJafQ==">());
         this.iIllIIllIi = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
         this.llllIIllIi = new GpuTexture[8];
         this.illlIIllIi = new GpuTextureView[8];
         this.IillIIllIi = new GpuTexture[8];
         this.lillIIllIi = new GpuTextureView[8];
         this.iillIIllIi = new int[8];
         this.IIilIIllIi = new int[8];
         this.lIilIIllIi = new int[8];
         this.iIilIIllIi = new int[8];
         this.liilIIllIi = true;
      }
   }

   private void iliIiiliiiii(CommandEncoder encoder) {
      long var3 = -3473780962009697098L;
      var3 ^= ((long)this.IlllIIllIi.remaining() << 32 ^ var3) & -1L << 32;
      if (this.IIllIIllIi == null || this.IIllIIllIi.size() < (long)((int)(var3 >>> 32))) {
         if (this.IIllIIllIi != null) {
            this.IIllIIllIi.close();
         }

         this.IIllIIllIi = RenderSystem.getDevice()
            .createBuffer(
               () -> IIIilIIiiIIi<"IIIilIIiiIIi","gV5KICBjApyUQGSzs6O8KUpFQ+o27KukhQOHMriiRjDFukBBcu0kBcbZxE6fwz+CCnhYVD0=">(), 136, (long)((int)(var3 >>> 32))
            );
      }

      encoder.writeToBuffer(this.IIllIIllIi.slice(), this.IlllIIllIi);
   }

   public void IiIlliIliiIl() {
      this.IIIllIIliIIl();
      if (this.iIllIIllIi != null) {
         this.iIllIIllIi.close();
         this.iIllIIllIi = null;
      }

      if (this.IIllIIllIi != null) {
         this.IIllIIllIi.close();
         this.IIllIIllIi = null;
      }

      if (this.lIllIIllIi != null) {
         this.lIllIIllIi.close();
         this.lIllIIllIi = null;
      }

      if (this.IlllIIllIi != null) {
         MemoryUtil.memFree(this.IlllIIllIi);
         this.IlllIIllIi = null;
      }

      this.liilIIllIi = false;
   }

   private void iIlIlllllill(int h, int w) {
      long var9 = 5779719107459174453L;
      long var11 = 2931365610329391528L;
      long var13 = -8952571083723723915L;
      if (h != this.ililIIllIi || w != this.IiilIIllIi || this.IlilIIllIi == null) {
         this.IIIllIIliIIl();
         this.IlilIIllIi = RenderSystem.getDevice()
            .createTexture(
               () -> IIIilIIiiIIi<"IIIilIIiiIIi","AECK2aUw4f8l1lcCrQ3yBdNMbVt0MSbBIGbqYtjP5XySWtJsOOKSa1CSlS7J0Y46rhSh">(), 13, TextureFormat.RGBA8, h, w, 1, 1
            );
         this.llilIIllIi = RenderSystem.getDevice().createTextureView(this.IlilIIllIi);
         var9 ^= ((long)h << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)w ^ var9) & -1L >>> 32;
         var11 ^= (0L ^ var11) & -1L << 32;

         while ((int)(var11 >>> 32) < 8) {
            long var17 = var9 ^ ((long)Math.max(1, (int)(var9 >>> 32) / 2) << 32 ^ var9) & -1L << 32;
            var9 = var17 ^ ((long)Math.max(1, (int)var17 / 2) ^ var17) & -1L >>> 32;
            var11 ^= ((long)((int)(var11 >>> 32)) ^ var11) & -1L >>> 32;
            long var20 = var13 ^ ((long)((int)(var9 >>> 32)) << 32 ^ var13) & -1L << 32;
            var13 = var20 ^ ((long)((int)var9) ^ var20) & -1L >>> 32;
            this.iillIIllIi[(int)(var11 >>> 32)] = (int)(var13 >>> 32);
            this.IIilIIllIi[(int)(var11 >>> 32)] = (int)var13;
            this.lIilIIllIi[(int)(var11 >>> 32)] = (int)(var13 >>> 32);
            this.iIilIIllIi[(int)(var11 >>> 32)] = (int)var13;
            this.llllIIllIi[(int)(var11 >>> 32)] = RenderSystem.getDevice()
               .createTexture(
                  () -> IIIilIIiiIIi<"IIIilIIiiIIi","BMfzb/nhRGwVNEzTJGo/YnKCUGfYZWHq7F0s6vYBkAPTR93UV7N9juUVtf4qAlJ0/6yF">() + index,
                  13,
                  TextureFormat.RGBA8,
                  (int)(var13 >>> 32),
                  (int)var13,
                  1,
                  1
               );
            this.illlIIllIi[(int)(var11 >>> 32)] = RenderSystem.getDevice().createTextureView(this.llllIIllIi[(int)(var11 >>> 32)]);
            this.IillIIllIi[(int)(var11 >>> 32)] = RenderSystem.getDevice()
               .createTexture(
                  () -> IIIilIIiiIIi<"IIIilIIiiIIi","fUHOwQCPtrCUXiPOlBttXpejQiT8+fKJapU0u2X3Xrjspd4wGX0OTCQVGTV5q06CjA==">() + index,
                  13,
                  TextureFormat.RGBA8,
                  (int)(var13 >>> 32),
                  (int)var13,
                  1,
                  1
               );
            this.lillIIllIi[(int)(var11 >>> 32)] = RenderSystem.getDevice().createTextureView(this.IillIIllIi[(int)(var11 >>> 32)]);
            var11 += 4294967296L;
         }

         this.ililIIllIi = h;
         this.IiilIIllIi = w;
      }
   }

   private void IIIllIIliIIl() {
      long var2 = -7129523443261398877L;
      if (this.llilIIllIi != null) {
         this.llilIIllIi.close();
         this.llilIIllIi = null;
      }

      if (this.IlilIIllIi != null) {
         this.IlilIIllIi.close();
         this.IlilIIllIi = null;
      }

      if (this.illlIIllIi != null) {
         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 8; var4 += 4294967296L) {
            if (this.illlIIllIi[(int)(var4 >>> 32)] != null) {
               this.illlIIllIi[(int)(var4 >>> 32)].close();
               this.illlIIllIi[(int)(var4 >>> 32)] = null;
            }

            if (this.llllIIllIi[(int)(var4 >>> 32)] != null) {
               this.llllIIllIi[(int)(var4 >>> 32)].close();
               this.llllIIllIi[(int)(var4 >>> 32)] = null;
            }

            if (this.lillIIllIi[(int)(var4 >>> 32)] != null) {
               this.lillIIllIi[(int)(var4 >>> 32)].close();
               this.lillIIllIi[(int)(var4 >>> 32)] = null;
            }

            if (this.IillIIllIi[(int)(var4 >>> 32)] != null) {
               this.IillIIllIi[(int)(var4 >>> 32)].close();
               this.IillIIllIi[(int)(var4 >>> 32)] = null;
            }
         }
      }

      this.ililIIllIi = 0;
      this.IiilIIllIi = 0;
   }
}
