package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.OptionalInt;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;

public class IiIliiliIlii {
   private final GpuBuffer[] iilllilIlIIillilIl = new GpuBuffer[4];
   private static final Vector3f iIlllilIlIllllilIl = new Vector3f(0.0F, 0.0F, 0.0F);
   private static final Matrix4f lllllilIlillllilIl = new Matrix4f();
   private int lIillilIliIillilIl;
   private boolean liillilIliiillilIl;
   private static final Vector4f IIlllilIllIlllilIl = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private GpuBuffer IlillilIlllillilIl;
   private static final int IilllilIllilllilIl = 4;
   private final Map<RenderPipeline, Boolean> IIIililIllIIililIl = new IdentityHashMap<>();
   private ByteBuffer ilillilIlIiillilIl;

   public void IilliliilIIi(GpuTextureView pipeline, RenderPipeline uniforms, lIIIlIiliIIIlIil target) {
      if (pipeline != null && !(target.IIliliIIil <= 0.0F) && !(target.lIliliIIil <= 0.0F)) {
         this.iliIiiliiiii();
         CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
         GpuBuffer var5 = this.lIiiIiIlilli();
         this.ilillilIlIiillilIl.clear();
         MemoryUtil.memSet(this.ilillilIlIiillilIl, 0);
         target.liiiIIllIl(this.ilillilIlIiillilIl);
         this.ilillilIlIiillilIl.position(0).limit(144);
         var4.writeToBuffer(var5.slice(), this.ilillilIlIiillilIl);
         GpuBufferSlice var6 = RenderSystem.getDynamicUniforms()
            .method_71106(RenderSystem.getModelViewMatrix(), IIlllilIllIlllilIl, iIlllilIlIllllilIl, lllllilIlillllilIl);
         RenderPass var7 = var4.createRenderPass(
            () -> Iilllilliill<"Iilllilliill","YgaCk9rmPmMMnNXJR1jdSQHKgac+5hnv8vIdoERd//aOVBh83W0pJ7LB">(), pipeline, OptionalInt.empty()
         );

         try {
            var7.setPipeline(uniforms);
            var7.setVertexBuffer(0, this.IlillilIlllillilIl);
            RenderSystem.bindDefaultUniforms(var7);
            var7.setUniform(Iilllilliill<"Iilllilliill","nkj6aUgi04YXyi0Q6qaocXIl/uvcbupKjQ70jG3xqSXo82aQiCoE1c40w18w">(), var6);
            var7.setUniform(Iilllilliill<"Iilllilliill","XSmAp/KfcmNrAyNFfg/W69YaVxYBfsUZWeY54fLsYOPNDU1U93j8Uqc=">(), var5);
            var7.draw(0, 6);
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }
      }
   }

   public void IlIlllIlilIl() {
      long var2 = 5484894205923633416L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 4; var4 += 4294967296L) {
         if (this.iilllilIlIIillilIl[(int)(var4 >>> 32)] != null) {
            this.iilllilIlIIillilIl[(int)(var4 >>> 32)].close();
            this.iilllilIlIIillilIl[(int)(var4 >>> 32)] = null;
         }
      }

      if (this.IlillilIlllillilIl != null) {
         this.IlillilIlllillilIl.close();
         this.IlillilIlllillilIl = null;
      }

      if (this.ilillilIlIiillilIl != null) {
         MemoryUtil.memFree(this.ilillilIlIiillilIl);
         this.ilillilIlIiillilIl = null;
      }

      this.liillilIliiillilIl = false;
   }

   private static GpuBuffer IIIllIIliIIl(String name) {
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

   private GpuBuffer lIiiIiIlilli() {
      long var3 = 952303420473900488L;
      this.lIillilIliIillilIl = (this.lIillilIliIillilIl + 1) % 4;
      GpuBuffer var1 = this.iilllilIlIIillilIl[this.lIillilIliIillilIl];
      if (var1 == null || var1.isClosed()) {
         var3 ^= ((long)this.lIillilIliIillilIl << 32 ^ var3) & -1L << 32;
         var1 = RenderSystem.getDevice()
            .createBuffer(
               () -> Iilllilliill<"Iilllilliill","o/H0g6ZSQ4lBfwImqOFMAUgwzbsrFgS5lXYydU+YWr6RLKV7h+WkDvUJ+cGoP7Jq8JOHOhl073B1JQ==">() + slot, 136, 144L
            );
         this.iilllilIlIIillilIl[this.lIillilIliIillilIl] = var1;
      }

      return var1;
   }

   public boolean liiiIIllIl(RenderPipeline pipeline) {
      Boolean var2 = this.IIIililIllIIililIl.get(pipeline);
      if (var2 == null) {
         try {
            var2 = RenderSystem.getDevice().precompilePipeline(pipeline).isValid();
         } catch (Throwable var4) {
            var2 = false;
         }

         this.IIIililIllIIililIl.put(pipeline, var2);
      }

      return var2;
   }

   public static RenderPipeline IliIlllilIi(String mode) {
      long var3 = 6613586788019206277L;
      var3 ^= (-4294967296L ^ var3) & -1L << 32;
      switch (mode.hashCode()) {
         case -1965582497:
            if (mode.equals(Iilllilliill<"Iilllilliill","aymOpj9GLMOXv9wB+R3dlDcadCnLKrb7ly5BVMutTayviQ==">())) {
               var3 ^= (4294967296L ^ var3) & -1L << 32;
            }
            break;
         case -1901891230:
            if (mode.equals(Iilllilliill<"Iilllilliill","ci6+pKixEi/p6VjoLAr4WfIpA0PeveeTHPghOrddHIoSCA==">())) {
               var3 ^= (8589934592L ^ var3) & -1L << 32;
            }
            break;
         case -1825594389:
            if (mode.equals(Iilllilliill<"Iilllilliill","+BI296mFhfzgR5DuGqMawTlVsS6HJoWF/frHXemfmwAXxg==">())) {
               var3 ^= (12884901888L ^ var3) & -1L << 32;
            }
            break;
         case -1368827775:
            if (mode.equals(Iilllilliill<"Iilllilliill","iOcZ+J+K+74Pdc6nQR7iVsYABuF5h8L0iGVh8DOOGCxS08ZkiQyypdiMwA==">())) {
               var3 ^= (17179869184L ^ var3) & -1L << 32;
            }
            break;
         case 66292184:
            if (mode.equals(Iilllilliill<"Iilllilliill","L+0vlyOd44HAuR5bPnsPZWO6rvdHjxmNJhZGj6adTZ/9">())) {
               var3 ^= (0L ^ var3) & -1L << 32;
            }
            break;
         case 296012929:
            if (mode.equals(Iilllilliill<"Iilllilliill","5WDC/hHaQKsY2MjgPLCau9mqf1ZuShXg1rPTSUutMbyjXBkC8Rg=">())) {
               var3 ^= (21474836480L ^ var3) & -1L << 32;
            }
      }
      return switch ((int)(var3 >>> 32)) {
         case 0 -> lIliiiliIliiil.illiillliIiliillli;
         case 1 -> lIliiiliIliiil.liliillliiiliillli;
         case 2 -> lIliiiliIliiil.IIiiilllilIiiillli;
         case 3 -> lIliiiliIliiil.lliiillliiliiillli;
         case 4 -> lIliiiliIliiil.Iiiiillliliiiillli;
         case 5 -> lIliiiliIliiil.iiiiillliIIIIIilli;
         default -> lIliiiliIliiil.iIiiillliIliiillli;
      };
   }

   private void iliIiiliiiii() {
      if (!this.liillilIliiillilIl) {
         this.ilillilIlIiillilIl = MemoryUtil.memAlloc(144);
         this.IlillilIlllillilIl = IIIllIIliIIl(
            Iilllilliill<"Iilllilliill","sdB1BhNn/ZWTEjsbmSaQ7fJvgdm34/FOnPlZ0Z9pN5CHFlnHfgELT/zb8vqbh3Yj3in1+z5J9LXj7TKJUKQ=">()
         );
         this.liillilIliiillilIl = true;
      }
   }

   public void iIlIlllllill(RenderPipeline pipeline) {
      this.IIIililIllIIililIl.put(pipeline, Boolean.FALSE);
   }
}
