package gg.corz;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_2960;

public final class IlIlIlllllIlIlll {
   private static final Map<Iliiliillliiliil, class_1921> lIlllIIill = new HashMap<>();
   private static boolean iIlllIIill;
   public static final RenderPipeline IIlllIIill = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(
            class_2960.method_60655(
               iIlIlllllill<"iIlIlllllill","+xr7LJA9YKDIvDfphtr+h11jYltKbpmkzY45jZHVFkFLs7ObUqE=">(),
               iIlIlllllill<"iIlIlllllill","kT3zHt0L4rrn9wUlGfkrEEsyREDhDmu04jMxR1Z769+KaISrK6pLmuRLX0JvBwU7s47NDuU=">()
            )
         )
         .withVertexShader(
            class_2960.method_60655(
               iIlIlllllill<"iIlIlllllill","+xr7LJA9YKDIvDfphtr+h11jYltKbpmkzY45jZHVFkFLs7ObUqE=">(),
               iIlIlllllill<"iIlIlllllill","ODbO1wCA9dXHWQIrWI7Z+3pViDjdhC5GanwlpR0W4A3KlmrDeQiS6iZDFJM4f6Drbc4t">()
            )
         )
         .withFragmentShader(
            class_2960.method_60655(
               iIlIlllllill<"iIlIlllllill","+xr7LJA9YKDIvDfphtr+h11jYltKbpmkzY45jZHVFkFLs7ObUqE=">(),
               iIlIlllllill<"iIlIlllllill","ODbO1wCA9dXHWQIrWI7Z+3pViDjdhC5GanwlpR0W4A3KlmrDeQiS6iZDFJM4f6Drbc4t">()
            )
         )
         .withSampler(iIlIlllllill<"iIlIlllllill","h0o44fc475Os4toorh/LZ9QjcDSb0Tm8jK06QlDMLGFlqKrQ">())
         .withSampler(iIlIlllllill<"iIlIlllllill","m04yb15+4P4XVMvm75Gt7fyD4228DSOtXNc4LfwvN8YH8ccx">())
         .withSampler(iIlIlllllill<"iIlIlllllill","xlPPqCx7++sp6ZrrJCddSTDYQMjSJMOIG+IafeJFjpqc3+0Q">())
         .withVertexFormat(class_290.field_1580, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(true)
         .build()
   );

   private IlIlIlllllIlIlll() {
   }

   public static class_1921 IliIlllilIi(class_2960 color, class_2960 specular) {
      if (specular != null && !iIlllIIill) {
         try {
            return lIlllIIill.computeIfAbsent(
               new Iliiliillliiliil(color, specular),
               k -> class_1921.method_75940(
                     iIlIlllllill<"iIlIlllllill","kHzOTdwrC05DMSarpnx8XmfzDua9PJeYAsj6md3hf4rB9k2WXsWvzT00ebQAInSWQQ==">(),
                     class_12247.method_75927(IIlllIIill)
                        .method_75934(iIlIlllllill<"iIlIlllllill","h0o44fc475Os4toorh/LZ9QjcDSb0Tm8jK06QlDMLGFlqKrQ">(), k.IliIlllilIi())
                        .method_75934(iIlIlllllill<"iIlIlllllill","m04yb15+4P4XVMvm75Gt7fyD4228DSOtXNc4LfwvN8YH8ccx">(), k.liiiIIllIl())
                        .method_75928()
                        .method_75929(~1913812811 * 654471207 - -81 ^ 140678077)
                        .method_75938()
                  )
            );
         } catch (RuntimeException var3) {
            iIlllIIill = true;
            System.err.println(iIlIlllllill<"iIlIlllllill","cIBPm3DokJT71l5yHlHv7JCZBBTRe1kS6tfQOhGY">() + var3);
            return class_12249.method_75994(color);
         }
      } else {
         return class_12249.method_75994(color);
      }
   }
}
