package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.awt.Color;
import java.nio.ByteBuffer;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.lwjgl.system.MemoryUtil;

public final class lIliiiliIliiil {
   public static final RenderPipeline Iiiiillliliiiillli = IIIllIIliIIl(
      IiIlliIliiIl<"IiIlliIliiIl","M9fUwFudwHUnlL461iDqzTclD8HYqIEoQpWmmcTvobrA2Q==">(),
      IiIlliIliiIl<"IiIlliIliiIl","M9fUwFudwHUnlL461iDqzTclD8HYqIEoQpWmmcTvobrA2Q==">()
   );
   public static final RenderPipeline iiIiillliIIliillli = iIlIlllllill(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(IiIlliIliiIl<"IiIlliIliiIl","yKKY2H0itsEYObHKFviAfbVa10gkjg0dWumow+JJGErofpQEmFhFPlScjdd7jWE=">())
         .withUniform(IiIlliIliiIl<"IiIlliIliiIl","UCjj4jyPxw0irM8b9AC3/ACFN7OmHxkAVskH+wpkzw2GT7g5XtOtKcs=">(), class_10789.field_60031)
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","MYPxaUkD8CDDUsHHn1AsjGst5xLnH1E2jVxtiWUypY85AMNY603lOXm1Kik=">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","xarSSd5d+pZN4GJLnDqh/Jd2DhQblioWWL4Ep7tyBcugQo6ymbjgOQ==">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","wtFDivuLUhYCTrBo/k+6JNqv2bqrFOWhVMY2Se+1RH0Rkz7E66yP">())
         .withVertexShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","0kNtSRuAcgAm9Tk8qTf1irS6kulHST+xzzXRhzMrdx1pWdd1UZo=">()))
         .withFragmentShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","0kNtSRuAcgAm9Tk8qTf1irS6kulHST+xzzXRhzMrdx1pWdd1UZo=">()))
         .withBlend(lIliiiliIliiil.Ilililllillilillli)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withCull(false)
         .withVertexFormat(class_290.field_60033, class_5596.field_27379)
         .build()
   );
   public static final RenderPipeline iiiiillliIIIIIilli = IIIllIIliIIl(
      IiIlliIliiIl<"IiIlliIliiIl","lkdCDi/WucFaU/dUzhv0RZ7X3RuiWr/q1f1jtEDrOiuIL4QCeDI=">(),
      IiIlliIliiIl<"IiIlliIliiIl","lkdCDi/WucFaU/dUzhv0RZ7X3RuiWr/q1f1jtEDrOiuIL4QCeDI=">()
   );
   public static final RenderPipeline liliillliiiliillli = IIIllIIliIIl(
      IiIlliIliiIl<"IiIlliIliiIl","/iW62JksqED9cVwLj/lB22j8LxXe70l4khmyWpEr8EptKQ==">(),
      IiIlliIliiIl<"IiIlliIliiIl","/iW62JksqED9cVwLj/lB22j8LxXe70l4khmyWpEr8EptKQ==">()
   );
   public static final RenderPipeline iIIiillliIlIiillli = iIlIlllllill(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(IiIlliIliiIl<"IiIlliIliiIl","fFn5wN3NNYv3kEyj6m4MM49JEeBWo8L5uTToafzAIst4otA5mJrcWvbx6XKxioMZ">())
         .withUniform(IiIlliIliiIl<"IiIlliIliiIl","/a1HyNdzsleN9KQSW1Psq4EUjeqA7EenO3eQoEXCDe86RTbJ9SU=">(), class_10789.field_60031)
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","a0Ym6SGKiFHpdb80NxeoLYi6qXyysI9XvWojMgjllKcJ4ET4">())
         .withVertexShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","+WhcGfNxOgO1l0t3Q/njq5jqvrQQmGW6ze0w+eZi3pQSow0ez5zD">()))
         .withFragmentShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","+WhcGfNxOgO1l0t3Q/njq5jqvrQQmGW6ze0w+eZi3pQSow0ez5zD">()))
         .withBlend(lIliiiliIliiil.Ilililllillilillli)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withCull(false)
         .withVertexFormat(class_290.field_60033, class_5596.field_27379)
         .build()
   );
   private static GpuBuffer ililillliIiilillli;
   public static final RenderPipeline iIiiillliIliiillli = IIIllIIliIIl(
      IiIlliIliiIl<"IiIlliIliiIl","zYMdy9HEfMa1is0xYfc51WS/EIDS4KP6NBVUsyPJrNZ2">(),
      IiIlliIliiIl<"IiIlliIliiIl","zYMdy9HEfMa1is0xYfc51WS/EIDS4KP6NBVUsyPJrNZ2">()
   );
   public static final RenderPipeline Illiilllillliillli = iIlIlllllill(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(IiIlliIliiIl<"IiIlliIliiIl","0MIm3FiMwjHZcZYuZscQCDE9GXbY2mEod0BrhxE1cdALhIPnSlWLcL2UheYjmOXpEQ==">())
         .withUniform(IiIlliIliiIl<"IiIlliIliiIl","0gVE9GveiINk9BjED03Lf7tnKKGRqskTB//+Vo5wcdvcNhAqYsksc0+l0Q==">(), class_10789.field_60031)
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","xarSSd5d+pZN4GJLnDqh/Jd2DhQblioWWL4Ep7tyBcugQo6ymbjgOQ==">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","wtFDivuLUhYCTrBo/k+6JNqv2bqrFOWhVMY2Se+1RH0Rkz7E66yP">())
         .withVertexShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","NX6q0uDQSVBqxar13o1mEfdLw+aKX0SnmLEOkVfS4tytgUFp0zqvAw==">()))
         .withFragmentShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","NX6q0uDQSVBqxar13o1mEfdLw+aKX0SnmLEOkVfS4tytgUFp0zqvAw==">()))
         .withBlend(lIliiiliIliiil.Ilililllillilillli)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withCull(false)
         .withVertexFormat(class_290.field_60033, class_5596.field_27379)
         .build()
   );
   public static final RenderPipeline lliiillliiliiillli = IIIllIIliIIl(
      IiIlliIliiIl<"IiIlliIliiIl","WVwcG7YcQypCwT4eZUHiWQ5ZgUQCwJnad1FEv2flYOsU/Q==">(),
      IiIlliIliiIl<"IiIlliIliiIl","WVwcG7YcQypCwT4eZUHiWQ5ZgUQCwJnad1FEv2flYOsU/Q==">()
   );
   private static long IIIiilllilIIiillli = -1L;
   public static final RenderPipeline lIliillliiIliillli = iIlIlllllill(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(IiIlliIliiIl<"IiIlliIliiIl","dLOUf6AQWnAbp2zbIxpcrbLUSk/5oU1L1+fnO4LgMH5oMTu3oOyGdupMpn8WeA==">())
         .withUniform(IiIlliIliiIl<"IiIlliIliiIl","xIIqCBIRpYcn8NEJDDUem3XJLf+amg2aZpfV3Y/ZnKl15+gJ">(), class_10789.field_60031)
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","ECmXSaI/avUS3NxtW6TU/tFSRBDSjV0OxL/HBfoOi+AQ8S5xSFyVOXs=">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","ySks2jP6IBFXRBXslY/p+Ren/1f8tozWdNcWK1NJ6kvyz80/5J8+kQ==">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","pJB65U2AogWxFNWA5De1ExKX4w7Jm2UVGfpSYUGRXnrEr8vlQY1IKAPXWeExTg==">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","lc8ERBU0Q1yGitP5txh78bdQc1WltCpV2d5xF5ZASRO5HL1q+rfvIxH0P+di">())
         .withVertexShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","gO8lYChGpXKmHHeTA32hsp2K32t5lUxsgdUSlhf/30FPH02nVA==">()))
         .withFragmentShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","gO8lYChGpXKmHHeTA32hsp2K32t5lUxsgdUSlhf/30FPH02nVA==">()))
         .withBlend(lIliiiliIliiil.Ilililllillilillli)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withCull(false)
         .withVertexFormat(class_290.field_60033, class_5596.field_27379)
         .build()
   );
   private static ByteBuffer liilillliiiilillli;
   public static final RenderPipeline IiIiillliliIiillli = iIlIlllllill(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(IiIlliIliiIl<"IiIlliIliiIl","XtPkOypp4LD6GMSbxxa8z09ZD8nsL39802T1hRTiHZ0Yr6DgbiSCgIcM8Bs9kw==">())
         .withUniform(IiIlliIliiIl<"IiIlliIliiIl","KXcK1IXZmuyfMu0MrJ/eFoXik1zXiRbYaf2cpWFqgArYr9o+DmQjkQ==">(), class_10789.field_60031)
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","xarSSd5d+pZN4GJLnDqh/Jd2DhQblioWWL4Ep7tyBcugQo6ymbjgOQ==">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","8OyD5cyQmpfcgWM8h1/ZhJAbCL3uCjGpuxkH3d3i7oXLYrZp7EX2">())
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","wtFDivuLUhYCTrBo/k+6JNqv2bqrFOWhVMY2Se+1RH0Rkz7E66yP">())
         .withVertexShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","NCpBMgteDfkO5uNVxb8s3IyBMRtkm0hMRm2Su9lV0zR6PEq9kw==">()))
         .withFragmentShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","NCpBMgteDfkO5uNVxb8s3IyBMRtkm0hMRm2Su9lV0zR6PEq9kw==">()))
         .withBlend(lIliiiliIliiil.Ilililllillilillli)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withCull(false)
         .withVertexFormat(class_290.field_60033, class_5596.field_27379)
         .build()
   );
   public static final RenderPipeline IIiiilllilIiiillli = IIIllIIliIIl(
      IiIlliIliiIl<"IiIlliIliiIl","zvlUVVa1IqzHnLmkLZNufTxt84tv9GUqdX68oX3dkunVFw==">(),
      IiIlliIliiIl<"IiIlliIliiIl","zvlUVVa1IqzHnLmkLZNufTxt84tv9GUqdX68oX3dkunVFw==">()
   );
   private static final BlendFunction Ilililllillilillli = new BlendFunction(SourceFactor.ONE, DestFactor.ZERO, SourceFactor.ONE, DestFactor.ZERO);
   public static final RenderPipeline llIiillliilIiillli = iIlIlllllill(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(IiIlliIliiIl<"IiIlliIliiIl","P6dWXSvQ9O4OBCQsxotQTezWhu4KfJJWEAuWPdAUFdB/1+lQY8fpxYQioRZf/g==">())
         .withUniform(IiIlliIliiIl<"IiIlliIliiIl","/a1HyNdzsleN9KQSW1Psq4EUjeqA7EenO3eQoEXCDe86RTbJ9SU=">(), class_10789.field_60031)
         .withSampler(IiIlliIliiIl<"IiIlliIliiIl","a0Ym6SGKiFHpdb80NxeoLYi6qXyysI9XvWojMgjllKcJ4ET4">())
         .withVertexShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","j+rK4Qw5I+NTFyEY3xaLmdy1AkdHvPc0vRaTVDyW7V+bMFm5vA==">()))
         .withFragmentShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","j+rK4Qw5I+NTFyEY3xaLmdy1AkdHvPc0vRaTVDyW7V+bMFm5vA==">()))
         .withBlend(Ilililllillilillli)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withCull(false)
         .withVertexFormat(class_290.field_60033, class_5596.field_27379)
         .build()
   );
   public static final RenderPipeline illiillliIiliillli = IIIllIIliIIl(
      IiIlliIliiIl<"IiIlliIliiIl","1NK+8smUVcfFV4eOBPRGt33cPiS6RfweZr2j/xK9wmuR">(),
      IiIlliIliiIl<"IiIlliIliiIl","1NK+8smUVcfFV4eOBPRGt33cPiS6RfweZr2j/xK9wmuR">()
   );

   private static RenderPipeline IIIllIIliIIl(String location, String frag) {
      return iIlIlllllill(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(IiIlliIliiIl<"IiIlliIliiIl","aVpQnT0bjUBlwN0k6qk1U3HsuEInCS7ta1Ux+xdSFTgxadsc9Q==">() + location)
            .withUniform(IiIlliIliiIl<"IiIlliIliiIl","Jq6ZHeN0R8D4/G3SJNlRUGsDd8ID0x6qLINUFfqkL8GiGR70JBF5fgs=">(), class_10789.field_60031)
            .withVertexShader(liiiIIllIl(IiIlliIliiIl<"IiIlliIliiIl","6b77DbsbYhmdbhhDi1hGwPJne3nHEs/aECg/eKU5S0OViZ9M9Bg=">()))
            .withFragmentShader(liiiIIllIl(frag))
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_60033, class_5596.field_27379)
            .build()
      );
   }

   private static RenderPipeline iIlIlllllill(RenderPipeline pipeline) {
      return class_10799.method_67887(pipeline);
   }

   public static class_2960 liiiIIllIl(String name) {
      return class_2960.method_60655(
         IiIlliIliiIl<"IiIlliIliiIl","7TK9xBCPigdDdEc1tCIr/uA1Mto7zQJGTJKHHZqgdZjdJu5M57Q=">(),
         IiIlliIliiIl<"IiIlliIliiIl","W/rs8SUKBk4adXtYDnUSct6YituY+Bm72DXk7kOJV1um">() + name
      );
   }

   private lIliiiliIliiil() {
   }

   public static void iliIiiliiiii() {
      if (ililillliIiilillli != null) {
         ililillliIiilillli.close();
         ililillliIiilillli = null;
      }

      if (liilillliiiilillli != null) {
         MemoryUtil.memFree(liilillliiiilillli);
         liilillliiiilillli = null;
      }

      IIIiilllilIIiillli = -1L;
   }

   public static void lIiiIiIlilli(float color, float alpha, float intensity, float scale, Color speed) {
      if (IIIiilllilIIiillli < 0L) {
         IIIiilllilIIiillli = System.currentTimeMillis();
      }

      GpuBuffer var5 = IilliliilIIi();
      class_310 var6 = class_310.method_1551();
      if (var6.method_22683() != null) {
         float var7 = (float)(System.currentTimeMillis() - IIIiilllilIIiillli) / 1000.0F;
         float var8 = (float)var6.method_22683().method_4489();
         float var9 = (float)var6.method_22683().method_4506();
         float var10 = 0.0F;
         float var11 = 0.0F;
         float var12 = 70.0F;
         if (var6.field_1773 != null && var6.field_1773.method_19418() != null) {
            class_4184 var13 = var6.field_1773.method_19418();
            var10 = (float)Math.toRadians((double)(-var13.method_19330()));
            var11 = (float)Math.toRadians((double)var13.method_19329());
         }

         var12 = IiilIIiliilIIi.liiiIIllIl();
         liilillliiiilillli.clear();
         liilillliiiilillli.putFloat(var8);
         liilillliiiilillli.putFloat(var9);
         liilillliiiilillli.putFloat(var10);
         liilillliiiilillli.putFloat(var11);
         liilillliiiilillli.putFloat((float)speed.getRed() / 255.0F);
         liilillliiiilillli.putFloat((float)speed.getGreen() / 255.0F);
         liilillliiiilillli.putFloat((float)speed.getBlue() / 255.0F);
         liilillliiiilillli.putFloat(var7);
         liilillliiiilillli.putFloat(color);
         liilillliiiilillli.putFloat(alpha);
         liilillliiiilillli.putFloat(intensity);
         liilillliiiilillli.putFloat(scale);
         liilillliiiilillli.putFloat(var12);
         liilillliiiilillli.putFloat(0.0F);
         liilillliiiilillli.putFloat(0.0F);
         liilillliiiilillli.putFloat(0.0F);
         liilillliiiilillli.flip();
         CommandEncoder var15 = RenderSystem.getDevice().createCommandEncoder();
         var15.writeToBuffer(var5.slice(), liilillliiiilillli);
      }
   }

   public static GpuBuffer IilliliilIIi() {
      if (ililillliIiilillli == null) {
         liilillliiiilillli = MemoryUtil.memAlloc(64);
         ililillliIiilillli = RenderSystem.getDevice()
            .createBuffer(
               () -> IiIlliIliiIl<"IiIlliIliiIl","qniu0M/mS+VjJq7mtuzhtIf//BCSKIdv54uLztgppw2+h8Bug+jtQfA87i06dUJdPJ8M+baix9u6R3J1+fab6l5X">(), 136, 64L
            );
      }

      return ililillliIiilillli;
   }

   public static void IliIlllilIi() {
   }
}
