package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
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

public class illlIllIillIll {
   private GpuTexture[] llIlIIlililIlIIlil;
   private static final Vector4f IilIIIlillilIIIlil = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private int iiIlIIlilIIllIIlil;
   private int IlllIIlilllllIIlil;
   private GpuBuffer iliIIIlilIiiIIIlil;
   private static final Matrix4f lIiIIIliliIiIIIlil = new Matrix4f();
   private GpuTextureView[] IiIlIIlilliIlIIlil;
   private boolean illlIIlilIillIIlil;
   private static final int IliIIIlillliIIIlil = 80;
   private GpuBuffer liiIIIliliiiIIIlil;
   private ByteBuffer iIIlIIlilIlIlIIlil;
   private static final Vector3f iilIIIlilIIiIIIlil = new Vector3f(0.0F, 0.0F, 0.0F);
   private class_12137 IIIlIIlillIIlIIlil;
   private int lIllIIliliIllIIlil;

   private void IIIllIIliIIl(CommandEncoder encoder) {
      long var3 = -4082416423269032790L;
      var3 ^= ((long)this.iIIlIIlilIlIlIIlil.remaining() << 32 ^ var3) & -1L << 32;
      if (this.iliIIIlilIiiIIIlil == null || this.iliIIIlilIiiIIIlil.size() < (long)((int)(var3 >>> 32))) {
         if (this.iliIIIlilIiiIIIlil != null) {
            this.iliIIIlilIiiIIIlil.close();
         }

         this.iliIIIlilIiiIIIlil = RenderSystem.getDevice()
            .createBuffer(
               () -> IlIillIiilIi<"IlIillIiilIi","XIhaC274OgMuGqjBDAlMnCO0VEhiT0z6YxqU67mr2SA2SdBGNgefBhU7taMCmsSSn/orD7HwHZyr">(),
               136,
               (long)((int)(var3 >>> 32))
            );
      }

      encoder.writeToBuffer(this.iliIIIlilIiiIIIlil.slice(), this.iIIlIIlilIlIlIIlil);
   }

   private void lIiiIiIlilli() {
      long var5 = -8205663340650703217L;
      CommandEncoder var1 = RenderSystem.getDevice().createCommandEncoder();
      var5 ^= (0L ^ var5) & -1L << 32;

      while ((int)(var5 >>> 32) < 2) {
         var5 ^= ((long)((int)(var5 >>> 32)) ^ var5) & -1L >>> 32;
         RenderPass var4 = var1.createRenderPass(
            () -> IlIillIiilIi<"IlIillIiilIi","dksdU4w2Ra9b6dzCRpr9wtc+zRBn+56idz+NN3t6mtumK/s4ppc7doIALdi/Z5Ryo62YbrKzNhU=">() + index,
            this.IiIlIIlilliIlIIlil[(int)(var5 >>> 32)],
            OptionalInt.of(0)
         );
         if (var4 != null) {
            var4.close();
         }

         var5 += 4294967296L;
      }
   }

   private void iIlIlllllill(int w, int h) {
      long var5 = -2816758269285096524L;
      if (this.lIllIIliliIllIIlil != w || this.IlllIIlilllllIIlil != h || this.llIlIIlililIlIIlil[0] == null || this.llIlIIlililIlIIlil[1] == null) {
         this.IlIlllIlilIl();
         var5 ^= (0L ^ var5) & -1L << 32;

         while ((int)(var5 >>> 32) < 2) {
            var5 ^= ((long)((int)(var5 >>> 32)) ^ var5) & -1L >>> 32;
            this.llIlIIlililIlIIlil[(int)(var5 >>> 32)] = RenderSystem.getDevice()
               .createTexture(
                  () -> IlIillIiilIi<"IlIillIiilIi","ujsnPKayu3udv1TCnDH8d9dnqgA8s1iUndFDTTdGxt5MYqqyoS8PoO0nyxMuYks12Y0=">() + index,
                  13,
                  TextureFormat.RGBA8,
                  w,
                  h,
                  1,
                  1
               );
            this.IiIlIIlilliIlIIlil[(int)(var5 >>> 32)] = RenderSystem.getDevice().createTextureView(this.llIlIIlililIlIIlil[(int)(var5 >>> 32)]);
            var5 += 4294967296L;
         }

         this.lIllIIliliIllIIlil = w;
         this.IlllIIlilllllIIlil = h;
         this.iiIlIIlilIIllIIlil = 0;
         this.lIiiIiIlilli();
      }
   }

   private static GpuBuffer IiIlliIliiIl(String name) {
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

   public void Illlllllilll() {
      this.IlIlllIlilIl();
      if (this.IIIlIIlillIIlIIlil != null) {
         this.IIIlIIlillIIlIIlil.close();
         this.IIIlIIlillIIlIIlil = null;
      }

      if (this.iliIIIlilIiiIIIlil != null) {
         this.iliIIIlilIiiIIIlil.close();
         this.iliIIIlilIiiIIIlil = null;
      }

      if (this.liiIIIliliiiIIIlil != null) {
         this.liiIIIliliiiIIIlil.close();
         this.liiIIIliliiiIIIlil = null;
      }

      if (this.iIIlIIlilIlIlIIlil != null) {
         MemoryUtil.memFree(this.iIIlIIlilIlIlIIlil);
         this.iIIlIIlilIlIlIIlil = null;
      }

      this.illlIIlilIillIIlil = false;
   }

   private void iliIiiliiiii(
      int activity,
      int a,
      float time,
      float smoke,
      float w,
      float slash,
      float r,
      float blurRadius,
      float trailFade,
      float b,
      float intensity,
      float speed,
      float flameHeight,
      float g,
      float h,
      float softness,
      float slashDirection,
      float radius
   ) {
      this.iIIlIIlilIlIlIIlil.clear();
      this.iIIlIIlilIlIlIIlil.putFloat((float)activity);
      this.iIIlIIlilIlIlIIlil.putFloat((float)a);
      this.iIIlIIlilIlIlIIlil.putFloat(time);
      this.iIIlIIlilIlIlIIlil.putFloat(smoke);
      this.iIIlIIlilIlIlIIlil.putFloat(w);
      this.iIIlIIlilIlIlIIlil.putFloat(slash);
      this.iIIlIIlilIlIlIIlil.putFloat(r);
      this.iIIlIIlilIlIlIIlil.putFloat(blurRadius);
      this.iIIlIIlilIlIlIIlil.putFloat(trailFade);
      this.iIIlIIlilIlIlIIlil.putFloat(b);
      this.iIIlIIlilIlIlIIlil.putFloat(intensity);
      this.iIIlIIlilIlIlIIlil.putFloat(speed);
      this.iIIlIIlilIlIlIIlil.putFloat(flameHeight);
      this.iIIlIIlilIlIlIIlil.putFloat(g);
      this.iIIlIIlilIlIlIIlil.putFloat(h);
      this.iIIlIIlilIlIlIIlil.putFloat(radius);
      this.iIIlIIlilIlIlIIlil.putFloat(softness);
      this.iIIlIIlilIlIlIIlil.putFloat(slashDirection);
      this.iIIlIIlilIlIlIIlil.putFloat(0.0F);
      this.iIIlIIlilIlIlIIlil.putFloat(0.0F);
      this.iIIlIIlilIlIlIIlil.flip();
   }

   public GpuTexture IIlllIlliIll() {
      return this.llIlIIlililIlIIlil == null ? null : this.llIlIIlililIlIIlil[this.iiIlIIlilIIllIIlil];
   }

   private void IlIlllIlilIl() {
      long var2 = 4974608767920056013L;
      if (this.IiIlIIlilliIlIIlil != null) {
         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.IiIlIIlilliIlIIlil.length; var4 += 4294967296L) {
            if (this.IiIlIIlilliIlIIlil[(int)(var4 >>> 32)] != null) {
               this.IiIlIIlilliIlIIlil[(int)(var4 >>> 32)].close();
               this.IiIlIIlilliIlIIlil[(int)(var4 >>> 32)] = null;
            }

            if (this.llIlIIlililIlIIlil[(int)(var4 >>> 32)] != null) {
               this.llIlIIlililIlIIlil[(int)(var4 >>> 32)].close();
               this.llIlIIlililIlIIlil[(int)(var4 >>> 32)] = null;
            }
         }
      }

      this.lIllIIliliIllIIlil = 0;
      this.IlllIIlilllllIIlil = 0;
   }

   public void IilliliilIIi() {
      if (this.IiIlIIlilliIlIIlil != null && this.IiIlIIlilliIlIIlil[0] != null && this.IiIlIIlilliIlIIlil[1] != null) {
         this.lIiiIiIlilli();
      }
   }

   private void liiiIIllIl() {
      if (!this.illlIIlilIillIIlil) {
         this.iIIlIIlilIlIlIIlil = MemoryUtil.memAlloc(80);
         this.liiIIIliliiiIIIlil = IiIlliIliiIl(
            IlIillIiilIi<"IlIillIiilIi","+pptQ6pIrjHpwAziYvqJb4oWGKtv/Ysj7b+i0diyEqWFeMun0A9x4HrQUbzS4NvXOXgWJ4p5HnjiYpXWKLs=">()
         );
         this.IIIlIIlillIIlIIlil = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
         this.llIlIIlililIlIIlil = new GpuTexture[2];
         this.IiIlIIlilliIlIIlil = new GpuTextureView[2];
         this.illlIIlilIillIIlil = true;
      }
   }

   public GpuTextureView IliIlllilIi(
      GpuTextureView g,
      GpuTextureView r,
      int radius,
      int scene,
      float intensity,
      float flameHeight,
      float h,
      float blurRadius,
      float softness,
      float slash,
      float speed,
      float mask,
      float activity,
      float time,
      float trailFade,
      float w,
      float b,
      float a,
      float smoke,
      float slashDirection
   ) {
      long var27 = -4379140109912934490L;
      if (g != null && r != null && radius > 0 && scene > 0) {
         this.liiiIIllIl();
         this.iIlIlllllill(radius, scene);
         var27 ^= ((long)(1 - this.iiIlIIlilIIllIIlil) << 32 ^ var27) & -1L << 32;
         this.iliIiiliiiii(
            radius, scene, intensity, flameHeight, h, blurRadius, softness, slash, speed, mask, activity, time, trailFade, w, b, a, smoke, slashDirection
         );
         CommandEncoder var22 = RenderSystem.getDevice().createCommandEncoder();
         this.IIIllIIliIIl(var22);
         GpuBufferSlice var23 = RenderSystem.getDynamicUniforms()
            .method_71106(RenderSystem.getModelViewMatrix(), IilIIIlillilIIIlil, iilIIIlilIIiIIIlil, lIiIIIliliIiIIIlil);
         RenderPass var24 = var22.createRenderPass(
            () -> IlIillIiilIi<"IlIillIiilIi","ZpET+kzR2Y7SKOuBV3AodTO23nRROZjHKBsJoOjyyHaTnD5lJMSgRB0XAdG1UYIOpw==">(),
            this.IiIlIIlilliIlIIlil[(int)(var27 >>> 32)],
            OptionalInt.of(0)
         );

         try {
            var24.setPipeline(lIliiiliIliiil.iiIiillliIIliillli);
            var24.setVertexBuffer(0, this.liiIIIliliiiIIIlil);
            var24.bindTexture(
               IlIillIiilIi<"IlIillIiilIi","7dILEFFvgrw7nL+JLBsYgb5cTBgW/81dBuq9moSbYjNv5dHo0M3Q8lWEaN0=">(),
               this.IiIlIIlilliIlIIlil[this.iiIlIIlilIIllIIlil],
               this.IIIlIIlillIIlIIlil
            );
            var24.bindTexture(IlIillIiilIi<"IlIillIiilIi","wYT7bcqT63jtDYYRd7Pi/MwK/x+LpynWZsNh6IssQtHRv+YtTC3BJA==">(), g, this.IIIlIIlillIIlIIlil);
            var24.bindTexture(IlIillIiilIi<"IlIillIiilIi","Tzv5nFNR6G1DrS53WaXP3f95nzzN5+UddDEfNITtoz3vUU4AYZAn">(), r, this.IIIlIIlillIIlIIlil);
            RenderSystem.bindDefaultUniforms(var24);
            var24.setUniform(IlIillIiilIi<"IlIillIiilIi","xfhiTWU/CGrj/vc4ovcTuWVrffkR2MBjzD015SP8AImUqQZ18+eyjvZaO50a">(), var23);
            var24.setUniform(IlIillIiilIi<"IlIillIiilIi","vy9Jwl2zduNSplLvk0qX6+Asj5sFyozZCe+GgZKfJ/ZdNkq0Ysqx8Y0=">(), this.iliIIIlilIiiIIIlil);
            var24.draw(0, 6);
         } catch (Throwable var30) {
            if (var24 != null) {
               try {
                  var24.close();
               } catch (Throwable var29) {
                  var30.addSuppressed(var29);
               }
            }

            throw var30;
         }

         if (var24 != null) {
            var24.close();
         }

         this.iiIlIIlilIIllIIlil = (int)(var27 >>> 32);
         return this.IiIlIIlilliIlIIlil[this.iiIlIIlilIIllIIlil];
      } else {
         return null;
      }
   }
}
