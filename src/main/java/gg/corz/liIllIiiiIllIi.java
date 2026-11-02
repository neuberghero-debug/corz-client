package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import org.lwjgl.system.MemoryUtil;

public final class liIllIiiiIllIi {
   public static final RenderPipeline ilIillIiiIiIillIii = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[0])
         .withLocation(
            class_2960.method_60655(
               IIlllIlliIll<"IIlllIlliIll","zjPBkB+5zVXZWwbg34xI4JTCHtdQDxab+UMe4dm1bctiQ9MSlJw=">(),
               IIlllIlliIll<"IIlllIlliIll","ZIsYdL5AK0kP+w+LvDmd/vJswiKjAK2j6R3k0Esd5fEjnlWrYebkPTZFyb5TCxsR">()
            )
         )
         .withVertexShader(
            class_2960.method_60655(
               IIlllIlliIll<"IIlllIlliIll","zjPBkB+5zVXZWwbg34xI4JTCHtdQDxab+UMe4dm1bctiQ9MSlJw=">(),
               IIlllIlliIll<"IIlllIlliIll","TznETYeRoO+8HeBGM9HgK6EysI8XA4MDTRzJqY9ukO2TOhApwNYiCKAaAmM=">()
            )
         )
         .withFragmentShader(
            class_2960.method_60655(
               IIlllIlliIll<"IIlllIlliIll","zjPBkB+5zVXZWwbg34xI4JTCHtdQDxab+UMe4dm1bctiQ9MSlJw=">(),
               IIlllIlliIll<"IIlllIlliIll","TznETYeRoO+8HeBGM9HgK6EysI8XA4MDTRzJqY9ukO2TOhApwNYiCKAaAmM=">()
            )
         )
         .withUniform(IIlllIlliIll<"IIlllIlliIll","b4AE58Px42YIqlBsMklhPWcG0yt3pNffnbyflr8ZVrdwndF/x0uAKPpe">(), class_10789.field_60031)
         .withSampler(IIlllIlliIll<"IIlllIlliIll","JE5V2yajuajvs3FgtFTKyblvoiGbJTh2cH9yHFLDJF1uIGGGc9y9jWbN">())
         .withBlend(liIllIiiiIllIi.IlIillIiillIillIii)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withCull(false)
         .withVertexFormat(class_290.field_60033, class_5596.field_27379)
         .build()
   );
   private Boolean IliillIiilliillIii;
   private ByteBuffer lIiillIiiiIiillIii;
   private boolean IilillIiililillIii;
   private static final BlendFunction IlIillIiillIillIii = new BlendFunction(
      SourceFactor.ONE, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ONE_MINUS_SRC_ALPHA
   );
   private static final int lIIillIiiiIIillIii = 16;
   private int lllillIiiillillIii;
   private GpuBuffer iilillIiiIIiillIii;
   private GpuTexture liIillIiiiiIillIii;
   private int iIlillIiiIllillIii;
   private GpuTextureView IIlillIiilIlillIii;

   public boolean IliIlllilIi(class_276 tintB, float tintG, float tintR, float framebuffer, float retention) {
      long var14 = -8047760940839961376L;
      if (tintB == null) {
         return false;
      } else {
         GpuTexture var6 = tintB.method_30277();
         GpuTextureView var7 = tintB.method_71639();
         if (var6 == null || var7 == null || var6.isClosed()) {
            return false;
         } else if (!this.iIlIlllllill()) {
            return false;
         } else {
            var14 ^= ((long)tintB.field_1482 << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)tintB.field_1481 ^ var14) & -1L >>> 32;
            if ((int)(var14 >>> 32) > 0 && (int)var14 > 0) {
               this.IilliliilIIi((int)(var14 >>> 32), (int)var14);
               CommandEncoder var10 = RenderSystem.getDevice().createCommandEncoder();
               if (!this.IilillIiililillIii) {
                  var10.copyTextureToTexture(var6, this.liIillIiiiiIillIii, 0, 0, 0, 0, 0, (int)(var14 >>> 32), (int)var14);
                  this.IilillIiililillIii = true;
                  return true;
               } else {
                  this.lIiillIiiiIiillIii.clear();
                  this.lIiillIiiiIiillIii.putFloat(tintR);
                  this.lIiillIiiiIiillIii.putFloat(framebuffer);
                  this.lIiillIiiiIiillIii.putFloat(retention);
                  this.lIiillIiiiIiillIii.putFloat(tintG);
                  this.lIiillIiiiIiillIii.flip();
                  var10.writeToBuffer(this.iilillIiiIIiillIii.slice(), this.lIiillIiiiIiillIii);
                  RenderPass var11 = var10.createRenderPass(
                     () -> IIlllIlliIll<"IIlllIlliIll","b62ifw5LqThar35UNQbkhMLJppiaAnSHU1MRRVi9v7DKCao4r78oL1q9s1mTN3VMX3A=">(), var7, OptionalInt.empty()
                  );

                  try {
                     var11.setPipeline(ilIillIiiIiIillIii);
                     RenderSystem.bindDefaultUniforms(var11);
                     var11.bindTexture(
                        IIlllIlliIll<"IIlllIlliIll","JE5V2yajuajvs3FgtFTKyblvoiGbJTh2cH9yHFLDJF1uIGGGc9y9jWbN">(),
                        this.IIlillIiilIlillIii,
                        RenderSystem.getSamplerCache().method_75294(FilterMode.NEAREST)
                     );
                     var11.setUniform(IIlllIlliIll<"IIlllIlliIll","b4AE58Px42YIqlBsMklhPWcG0yt3pNffnbyflr8ZVrdwndF/x0uAKPpe">(), this.iilillIiiIIiillIii);
                     var11.draw(0, 3);
                  } catch (Throwable var17) {
                     if (var11 != null) {
                        try {
                           var11.close();
                        } catch (Throwable var16) {
                           var17.addSuppressed(var16);
                        }
                     }

                     throw var17;
                  }

                  if (var11 != null) {
                     var11.close();
                  }

                  var10.copyTextureToTexture(var6, this.liIillIiiiiIillIii, 0, 0, 0, 0, 0, (int)(var14 >>> 32), (int)var14);
                  return true;
               }
            } else {
               return false;
            }
         }
      }
   }

   private void lIiiIiIlilli() {
      if (this.IIlillIiilIlillIii != null) {
         this.IIlillIiilIlillIii.close();
         this.IIlillIiilIlillIii = null;
      }

      if (this.liIillIiiiiIillIii != null) {
         this.liIillIiiiiIillIii.close();
         this.liIillIiiiiIillIii = null;
      }

      this.iIlillIiiIllillIii = 0;
      this.lllillIiiillillIii = 0;
      this.IilillIiililillIii = false;
   }

   public void iliIiiliiiii() {
      this.lIiiIiIlilli();
      if (this.iilillIiiIIiillIii != null) {
         this.iilillIiiIIiillIii.close();
         this.iilillIiiIIiillIii = null;
      }

      if (this.lIiillIiiiIiillIii != null) {
         MemoryUtil.memFree(this.lIiillIiiiIiillIii);
         this.lIiillIiiiIiillIii = null;
      }
   }

   public void liiiIIllIl() {
      this.IilillIiililillIii = false;
   }

   private boolean iIlIlllllill() {
      long var3 = -4000361102964944778L;
      if (this.IliillIiilliillIii == null) {
         try {
            var3 ^= ((long)RenderSystem.getDevice().precompilePipeline(ilIillIiiIiIillIii).isValid() << 32 ^ var3) & -1L << 32;
         } catch (Throwable var5) {
            var3 ^= (0L ^ var3) & -1L << 32;
         }

         this.IliillIiilliillIii = Boolean.valueOf((boolean)((int)(var3 >>> 32)));
      }

      return this.IliillIiilliillIii;
   }

   private void IilliliilIIi(int w, int h) {
      if (this.lIiillIiiiIiillIii == null) {
         this.lIiillIiiiIiillIii = MemoryUtil.memAlloc(16);
         this.iilillIiiIIiillIii = RenderSystem.getDevice()
            .createBuffer(() -> IIlllIlliIll<"IIlllIlliIll","M8LH5BpDYNodHW+/7vbcud5uokcyW+5XypU95t9nLYg1/xPPdTEiS9cAQ9kSrP+UPmegrnGAtO+EVA==">(), 136, 16L);
      }

      if (w != this.iIlillIiiIllillIii || h != this.lllillIiiillillIii || this.liIillIiiiiIillIii == null) {
         this.lIiiIiIlilli();
         this.liIillIiiiiIillIii = RenderSystem.getDevice()
            .createTexture(
               () -> IIlllIlliIll<"IIlllIlliIll","hvbmRJDcP84HFidMWAF0soduyc3NLQGl6G9coJWBJDbihcOCxAQvOl2Qe524xqLL+9zFP1+SBLvruw==">(),
               5,
               TextureFormat.RGBA8,
               w,
               h,
               1,
               1
            );
         this.IIlillIiilIlillIii = RenderSystem.getDevice().createTextureView(this.liIillIiiiiIillIii);
         this.iIlillIiiIllillIii = w;
         this.lllillIiiillillIii = h;
         this.IilillIiililillIii = false;
      }
   }
}
