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

public class IilIiiIililIiiIi {
   private static final Vector3f liIliiiIIi = new Vector3f(0.0F, 0.0F, 0.0F);
   private class_12137 lIlliiiIIi;
   private static final Matrix4f iiIliiiIIi = new Matrix4f();
   private static final Vector4f IiIliiiIIi = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private boolean illliiiIIi;
   private GpuBuffer iIlliiiIIi;
   private GpuBuffer IllliiiIIi;
   private static final int IIlliiiIIi = 16;
   private ByteBuffer lllliiiIIi;

   private void liiiIIllIl() {
      if (!this.illliiiIIi) {
         this.lllliiiIIi = MemoryUtil.memAlloc(16);
         this.IllliiiIIi = lIiiIiIlilli(IIlllIlliIll<"IIlllIlliIll","JQD/6n3LepEyAt1ZvfKhsXmEgOEYDUYoPpa/cYJKeY7IzbMAyy8x5IkOD1pZ8yurL5IPUI5X7jmVXX6AbQ==">());
         this.lIlliiiIIi = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
         this.illliiiIIi = true;
      }
   }

   private void IilliliilIIi(CommandEncoder encoder) {
      long var3 = 8505453291959318220L;
      var3 ^= ((long)this.lllliiiIIi.remaining() << 32 ^ var3) & -1L << 32;
      if (this.iIlliiiIIi == null || this.iIlliiiIIi.size() < (long)((int)(var3 >>> 32))) {
         if (this.iIlliiiIIi != null) {
            this.iIlliiiIIi.close();
         }

         this.iIlliiiIIi = RenderSystem.getDevice()
            .createBuffer(
               () -> IIlllIlliIll<"IIlllIlliIll","vL6QnB05Vy4199A/W3nJDiqThm2r15/yfxl6RcieNKSdKg8TP3I7ApD/17/kfYvijBTVLdiPKzw=">(),
               136,
               (long)((int)(var3 >>> 32))
            );
      }

      encoder.writeToBuffer(this.iIlliiiIIi.slice(), this.lllliiiIIi);
   }

   private void iIlIlllllill(int h, int w) {
      this.lllliiiIIi.clear();
      this.lllliiiIIi.putFloat((float)h);
      this.lllliiiIIi.putFloat((float)w);
      this.lllliiiIIi.putFloat(0.0F);
      this.lllliiiIIi.putFloat(0.0F);
      this.lllliiiIIi.flip();
   }

   public void iliIiiliiiii() {
      if (this.lIlliiiIIi != null) {
         this.lIlliiiIIi.close();
         this.lIlliiiIIi = null;
      }

      if (this.iIlliiiIIi != null) {
         this.iIlliiiIIi.close();
         this.iIlliiiIIi = null;
      }

      if (this.IllliiiIIi != null) {
         this.IllliiiIIi.close();
         this.IllliiiIIi = null;
      }

      if (this.lllliiiIIi != null) {
         MemoryUtil.memFree(this.lllliiiIIi);
         this.lllliiiIIi = null;
      }

      this.illliiiIIi = false;
   }

   public void IliIlllilIi(
      GpuTextureView h, GpuTextureView after, GpuTextureView depthBefore, GpuTextureView depthAfter, GpuTextureView before, int w, int target
   ) {
      if (h != null && after != null && depthBefore != null && depthAfter != null && before != null) {
         if (w > 0 && target > 0) {
            this.liiiIIllIl();
            this.iIlIlllllill(w, target);
            CommandEncoder var8 = RenderSystem.getDevice().createCommandEncoder();
            this.IilliliilIIi(var8);
            GpuBufferSlice var9 = RenderSystem.getDynamicUniforms().method_71106(RenderSystem.getModelViewMatrix(), IiIliiiIIi, liIliiiIIi, iiIliiiIIi);
            RenderPass var10 = var8.createRenderPass(
               () -> IIlllIlliIll<"IIlllIlliIll","r3SzwAeZjMEFuEu/1JPgrNio85cFu9J65u6+gotlD2V/hWOzt2Af7p/vY/JkoDV7">(), h, OptionalInt.of(0)
            );

            try {
               var10.setPipeline(lIliiiliIliiil.lIliillliiIliillli);
               var10.setVertexBuffer(0, this.IllliiiIIi);
               var10.bindTexture(IIlllIlliIll<"IIlllIlliIll","NW0JBmh1EJdllX/RK6kvZcj1/tUq7jGkNyyAD0/ZqT6lHwt0W/D4GKs=">(), after, this.lIlliiiIIi);
               var10.bindTexture(IIlllIlliIll<"IIlllIlliIll","M+M1BK+KzRC921ArePCDjqeF9xNwKNyvXv4hY73BwvWdu4ydTCuSqg==">(), depthBefore, this.lIlliiiIIi);
               var10.bindTexture(IIlllIlliIll<"IIlllIlliIll","QSg3VjwxyTCqsvPo2pb+Z6c3e84up8GFMd1S3Sn8w6fqaxZFnCw3wCvho3QL3Q==">(), depthAfter, this.lIlliiiIIi);
               var10.bindTexture(IIlllIlliIll<"IIlllIlliIll","6jU7h/BIKgXyyE0JmMc9kzqgqZrGVUeMQvgCtE9ovDd51+uc7GWYsllszKaS">(), before, this.lIlliiiIIi);
               RenderSystem.bindDefaultUniforms(var10);
               var10.setUniform(IIlllIlliIll<"IIlllIlliIll","cXXKO23ifTH1Jyf5ETWvG9Y1KnFcgoYTgynQr2A4G2PApsPaXxTrkW5zBPVA">(), var9);
               var10.setUniform(IIlllIlliIll<"IIlllIlliIll","vNllpi5FMQP6hckrGQjALZ0UxAoqgT8pAmfQ30cLFoA8mkBz">(), this.iIlliiiIIi);
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
}
