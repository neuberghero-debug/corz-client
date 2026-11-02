package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_12137;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;

public class iliIIiIiIiiIIiIi {
   private class_12137 iilIiilIIi;
   private static final int lilIiilIIi = 48;
   private ByteBuffer iIiIiilIIi;
   private static final Vector4f lllIiilIIi = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private GpuBuffer lIiIiilIIi;
   private static final Matrix4f IilIiilIIi = new Matrix4f();
   private static final Vector3f illIiilIIi = new Vector3f(0.0F, 0.0F, 0.0F);
   private boolean IliIiilIIi;
   private GpuBuffer IIiIiilIIi;

   private void IilliliilIIi(CommandEncoder encoder) {
      long var3 = 6358327531773719504L;
      var3 ^= ((long)this.iIiIiilIIi.remaining() << 32 ^ var3) & -1L << 32;
      if (this.IIiIiilIIi == null || this.IIiIiilIIi.size() < (long)((int)(var3 >>> 32))) {
         if (this.IIiIiilIIi != null) {
            this.IIiIiilIIi.close();
         }

         this.IIiIiilIIi = RenderSystem.getDevice()
            .createBuffer(
               () -> IIlllIlliIll<"IIlllIlliIll","ZPVJA3L0O5Ript/K/L0hd4EmnQJmxO5+fsAgUTpwIrT7MXmcYAvLj8dsKVkVu/+kJ9Xb/eQdpoUJOaA=">(),
               136,
               (long)((int)(var3 >>> 32))
            );
      }

      encoder.writeToBuffer(this.IIiIiilIIi.slice(), this.iIiIiilIIi);
   }

   private void liiiIIllIl() {
      if (!this.IliIiilIIi) {
         this.iIiIiilIIi = MemoryUtil.memAlloc(48);
         this.lIiIiilIIi = lIiiIiIlilli(
            IIlllIlliIll<"IIlllIlliIll","5WOH3GZDalVygMSEb0UBsikYHuxopj+tuf+/31BKmGYgmXfEM67DYgOHBp1ASqqlpfE3u+4II1zTdhj4rlsFfA==">()
         );
         this.iilIiilIIi = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
         this.IliIiilIIi = true;
      }
   }

   private static GpuBuffer lIiiIiIlilli(String name) {
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

   public void IliIlllilIi(
      GpuTextureView h,
      GpuTextureView target,
      GpuTextureView mask,
      int b,
      int glow,
      float scene,
      float r,
      float width,
      int a,
      float g,
      float mode,
      float time,
      float w
   ) {
      if (h != null && target != null && mask != null && b > 0 && glow > 0) {
         this.liiiIIllIl();
         this.iIlIlllllill(b, glow, scene, r, width, a, g, mode, time, w);
         CommandEncoder var14 = RenderSystem.getDevice().createCommandEncoder();
         this.IilliliilIIi(var14);
         GpuBufferSlice var15 = RenderSystem.getDynamicUniforms().method_71106(RenderSystem.getModelViewMatrix(), lllIiilIIi, illIiilIIi, IilIiilIIi);
         RenderPass var16 = var14.createRenderPass(
            () -> IIlllIlliIll<"IIlllIlliIll","/Quv60YBiqTIxT23d+QIHOtyQzaEmIUYCIut65zlEsEO8648zmv7SZG41kk/NpHpOnf0">(), h, OptionalInt.empty()
         );

         try {
            var16.setPipeline(lIliiiliIliiil.Illiilllillliillli);
            var16.setVertexBuffer(0, this.lIiIiilIIi);
            var16.bindTexture(IIlllIlliIll<"IIlllIlliIll","wq2djq5I9kTgi7fhtqKwrdDQ6+PS/ONmhbsz107+0cJEWNeC1iQYHQ==">(), target, this.iilIiilIIi);
            var16.bindTexture(IIlllIlliIll<"IIlllIlliIll","7bLyE/I2pdGUsmpGjvsOWPTAEm1b2kJ8grhEgHwfgwcxDv7VEzIv">(), mask, this.iilIiilIIi);
            RenderSystem.bindDefaultUniforms(var16);
            var16.setUniform(IIlllIlliIll<"IIlllIlliIll","L8Vugw9hlki4yF6ItdU4TxyOXK4Um0yzreXmGnAHVHT3/VW9TKdZerZOiOQO">(), var15);
            var16.setUniform(IIlllIlliIll<"IIlllIlliIll","9cyor7Issz+1SsJoHPusyk/LhYYx0ge8XcccSNYIr8LAe4MnrrVZ1oEf2g==">(), this.IIiIiilIIi);
            var16.draw(0, 6);
         } catch (Throwable var20) {
            if (var16 != null) {
               try {
                  var16.close();
               } catch (Throwable var19) {
                  var20.addSuppressed(var19);
               }
            }

            throw var20;
         }

         if (var16 != null) {
            var16.close();
         }
      }
   }

   public void iliIiiliiiii() {
      if (this.iilIiilIIi != null) {
         this.iilIiilIIi.close();
         this.iilIiilIIi = null;
      }

      if (this.IIiIiilIIi != null) {
         this.IIiIiilIIi.close();
         this.IIiIiilIIi = null;
      }

      if (this.lIiIiilIIi != null) {
         this.lIiIiilIIi.close();
         this.lIiIiilIIi = null;
      }

      if (this.iIiIiilIIi != null) {
         MemoryUtil.memFree(this.iIiIiilIIi);
         this.iIiIiilIIi = null;
      }

      this.IliIiilIIi = false;
   }

   private void iIlIlllllill(int time, int g, float r, float a, float mode, int width, float h, float b, float w, float glow) {
      this.iIiIiilIIi.clear();
      this.iIiIiilIIi.putFloat((float)time);
      this.iIiIiilIIi.putFloat((float)g);
      this.iIiIiilIIi.putFloat(r);
      this.iIiIiilIIi.putFloat(0.0F);
      this.iIiIiilIIi.putFloat(h);
      this.iIiIiilIIi.putFloat(b);
      this.iIiIiilIIi.putFloat(w);
      this.iIiIiilIIi.putFloat(glow);
      this.iIiIiilIIi.putFloat(a);
      this.iIiIiilIIi.putFloat(mode);
      this.iIiIiilIIi.putFloat((float)width);
      this.iIiIiilIIi.putFloat(0.0F);
      this.iIiIiilIIi.flip();
   }
}
