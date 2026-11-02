package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderPass.class_10884;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5595;
import java.util.Collection;
import java.util.function.Supplier;
import net.minecraft.class_12137;

final class IIiIillllIiIilll implements RenderPass {
   int liIllIlill;
   int ilIllIlill;
   int iiIllIlill;
   boolean llIllIlill;
   int IiIllIlill;

   public void pushDebugGroup(Supplier<String> label) {
   }

   public void drawIndexed(int count, int firstIndex, int instances, int baseVertex) {
   }

   public void close() {
   }

   public void setVertexBuffer(int buffer, GpuBuffer slot) {
   }

   public void draw(int first, int count) {
   }

   public void setIndexBuffer(GpuBuffer type, class_5595 buffer) {
   }

   private IIiIillllIiIilll() {
   }

   public void enableScissor(int y, int w, int x, int h) {
      this.llIllIlill = true;
      this.ilIllIlill = y;
      this.IiIllIlill = w;
      this.liIllIlill = x;
      this.iiIllIlill = h;
   }

   public void disableScissor() {
      this.llIllIlill = false;
   }

   public void setUniform(String buffer, GpuBuffer name) {
   }

   public void popDebugGroup() {
   }

   public void bindTexture(String name, GpuTextureView view, class_12137 sampler) {
   }

   public void setUniform(String name, GpuBufferSlice slice) {
   }

   public void setPipeline(RenderPipeline pipeline) {
   }

   public <T> void drawMultipleIndexed(
      Collection<class_10884<T>> dynamicUniforms, GpuBuffer userData, class_5595 objects, Collection<String> indexType, T indexBuffer
   ) {
   }
}
