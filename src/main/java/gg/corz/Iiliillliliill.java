package gg.corz;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_290;
import net.minecraft.class_2960;

public final class Iiliillliliill {
   public static final RenderPipeline ilIllllIiIiIllllIi = IIIllIIliIIl(
      IlIlllIlilIl<"IlIlllIlilIl","JphJQjwfa7EnCFYIxp24MAG+0aDQC5sWsCgQUqEHFelCPvA=">(), DepthTestFunction.LEQUAL_DEPTH_TEST, true
   );
   private static final float lliIlllIiiliIlllIi = -0.2F;
   private static final float iIiIlllIiIliIlllIi = -1.2F;
   private static final float IIiIlllIilIiIlllIi = -0.8F;
   private static final float IllIlllIilllIlllIi = -0.3F;
   public static final RenderPipeline iiiIlllIiIIIllllIi = lIiiIiIlilli(
      IlIlllIlilIl<"IlIlllIlilIl","iVKRPJixk54wSOTAGnvqVWBI/VnXPur+ZFzSWSnZgCKtkzjB/7sa/mIQ">(), DepthTestFunction.GREATER_DEPTH_TEST, true, false
   );
   private static final float lilIlllIiiilIlllIi = -0.4F;
   public static final RenderPipeline lIIllllIiiIIllllIi = iliIiiliiiii(
      IlIlllIlilIl<"IlIlllIlilIl","+Xy+kUvaA/JU6K5Nel2/QcNcMQunPe5TX1nnQuJcT8pjz+qPax8As3c=">(), DepthTestFunction.LEQUAL_DEPTH_TEST, true
   );
   public static final RenderPipeline liIllllIiiiIllllIi = IIIllIIliIIl(
      IlIlllIlilIl<"IlIlllIlilIl","gh9GZ8H2o7Iuhz869IW8g2Iimf1gOVWGzJDN3nGUitMT7PYikYd5O/4z99E=">(), DepthTestFunction.GREATER_DEPTH_TEST, false
   );
   public static final RenderPipeline IlIllllIillIllllIi = iliIiiliiiii(
      IlIlllIlilIl<"IlIlllIlilIl","pcOApoyRjmKWp8FqcFJPOlB//+NRYf3wYCFhLEg4exoaVEDa5lGv2pbVerxJz8caTos=">(), DepthTestFunction.GREATER_DEPTH_TEST, false
   );
   private static final float illIlllIiIilIlllIi = -0.6F;
   public static final RenderPipeline IiiIlllIiliiIlllIi = lIiiIiIlilli(
      IlIlllIlilIl<"IlIlllIlilIl","jW/9IEgWMrXJs7Z+NuKyFN+7LFK1ZScQiSnNn+DI9fcp">(), DepthTestFunction.LEQUAL_DEPTH_TEST, true, true
   );

   public static void IliIlllilIi() {
      lillllIiiillllIi.IliIlllilIi();
   }

   private static class_2960 iIlIlllllill(String name) {
      return class_2960.method_60655(
         IlIlllIlilIl<"IlIlllIlilIl","Yh3zmK9l9qne82Udbml1lR3yM2UnqmgXWFyAZfeE3FlA94+Q1i0=">(),
         IlIlllIlilIl<"IlIlllIlilIl","BQcwoZzmIfwk1NY4GjXltM3IX3SV7RF5FKApyPX9u+iuC0r+DoNAQgXtHA==">() + name
      );
   }

   private static RenderPipeline IIIllIIliIIl(String name, DepthTestFunction depth, boolean bias) {
      Builder var3 = RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
         .withLocation(iIlIlllllill(name))
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthTestFunction(depth)
         .withDepthWrite(false);
      if (bias) {
         var3 = var3.withDepthBias(-1.2F, -0.2F);
      }

      return IilliliilIIi(var3.build());
   }

   private static RenderPipeline iliIiiliiiii(String name, DepthTestFunction depth, boolean bias) {
      Builder var3 = RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(iIlIlllllill(name))
         .withVertexShader(liiiIIllIl(IlIlllIlilIl<"IlIlllIlilIl","7MdKqiiQBMwSFPnl5NemXEsRU08NHigOTi8rE2yir7ZJROJHDJIP5KEKsW41Cg==">()))
         .withFragmentShader(liiiIIllIl(IlIlllIlilIl<"IlIlllIlilIl","7MdKqiiQBMwSFPnl5NemXEsRU08NHigOTi8rE2yir7ZJROJHDJIP5KEKsW41Cg==">()))
         .withUniform(IlIlllIlilIl<"IlIlllIlilIl","GGCKow8Uqa3sYlUmof59mnn1XzFg2gX2SLs0L4vauhBdofPoW+w4OLo=">(), class_10789.field_60031)
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthTestFunction(depth)
         .withDepthWrite(false);
      if (bias) {
         var3 = var3.withDepthBias(-0.4F, -0.8F);
      }

      return IilliliilIIi(var3.build());
   }

   private static RenderPipeline IilliliilIIi(RenderPipeline p) {
      return class_10799.method_67887(p);
   }

   private static RenderPipeline lIiiIiIlilli(String cull, DepthTestFunction name, boolean depth, boolean bias) {
      Builder var4 = RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(iIlIlllllill(cull))
         .withVertexShader(liiiIIllIl(IlIlllIlilIl<"IlIlllIlilIl","sNQEGPzmVd+8+DSoMhasEPhziHzL3UdtEFUgtp8Qfc0DKFjpD+/ZvXUrqh8=">()))
         .withFragmentShader(liiiIIllIl(IlIlllIlilIl<"IlIlllIlilIl","sNQEGPzmVd+8+DSoMhasEPhziHzL3UdtEFUgtp8Qfc0DKFjpD+/ZvXUrqh8=">()))
         .withSampler(IlIlllIlilIl<"IlIlllIlilIl","Hqz304gDZKDYDCNBrzV42QsmWBjvkYF6fbIVVThkqwM/mHbv">())
         .withUniform(IlIlllIlilIl<"IlIlllIlilIl","GGCKow8Uqa3sYlUmof59mnn1XzFg2gX2SLs0L4vauhBdofPoW+w4OLo=">(), class_10789.field_60031)
         .withVertexFormat(class_290.field_1590, class_5596.field_27382)
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(depth)
         .withDepthTestFunction(name)
         .withDepthWrite(false);
      if (bias) {
         var4 = var4.withDepthBias(-0.3F, -0.6F);
      }

      return IilliliilIIi(var4.build());
   }

   private Iiliillliliill() {
   }

   private static class_2960 liiiIIllIl(String name) {
      return class_2960.method_60655(
         IlIlllIlilIl<"IlIlllIlilIl","Yh3zmK9l9qne82Udbml1lR3yM2UnqmgXWFyAZfeE3FlA94+Q1i0=">(),
         IlIlllIlilIl<"IlIlllIlilIl","HWHUz7OSCIsyimGeJzWAimdreUT4pp1Y+4sQpgFPyGT2">() + name
      );
   }
}
