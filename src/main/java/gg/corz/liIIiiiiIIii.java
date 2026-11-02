package gg.corz;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_290;
import net.minecraft.class_2960;

final class liIIiiiiIIii {
   static final RenderPipeline illllllIlIilllllIl = RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
      .withLocation(
         class_2960.method_60655(
            IliIlllilIi<"IliIlllilIi","hxxvzQdALo8hoYoIoaJVlNjxlzR+H+1yKt9U6Kvs2gUTDBZ+/3E=">(),
            IliIlllilIi<"IliIlllilIi","aTiy3sNzU2k/S2k5qGuEU1Y/JHOeqH6OKF7S6psuDNJTmxQwYsL9PFdor1XPAleckj4w">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            IliIlllilIi<"IliIlllilIi","hxxvzQdALo8hoYoIoaJVlNjxlzR+H+1yKt9U6Kvs2gUTDBZ+/3E=">(),
            IliIlllilIi<"IliIlllilIi","oJ+C/PAGn8trK5AJ3NG+1X0Hy7OnDsTebNwYJROej3USfY4jOfe3VH+5">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            IliIlllilIi<"IliIlllilIi","hxxvzQdALo8hoYoIoaJVlNjxlzR+H+1yKt9U6Kvs2gUTDBZ+/3E=">(),
            IliIlllilIi<"IliIlllilIi","oJ+C/PAGn8trK5AJ3NG+1X0Hy7OnDsTebNwYJROej3USfY4jOfe3VH+5">()
         )
      )
      .withUniform(IliIlllilIi<"IliIlllilIi","dD0om4g7Z9W6bC9AR0gmxFbdj23SzYxW15r6F7+W+w==">(), class_10789.field_60031)
      .withSampler(IliIlllilIi<"IliIlllilIi","f8dszlcrHbaA9sTCnnISgLKR6h+6E7UouM43XX6Jrl3A64V3">())
      .withVertexFormat(class_290.field_1584, class_5596.field_27382)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
      .withDepthWrite(false)
      .build();

   private liIIiiiiIIii() {
   }
}
