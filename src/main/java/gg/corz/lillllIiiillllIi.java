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

public final class lillllIiiillllIi {
   public static final RenderPipeline IilliiIIIi = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(iIlIlllllill(lIiiIiIlilli<"lIiiIiIlilli","g1GiPjBqqFLXGOF7U1Dnx9shY3e6Ic4gJrjQjwg+Tx8y1RZal1+QkYkOvdIo31xPZA==">()))
         .withVertexShader(liiiIIllIl(lIiiIiIlilli<"lIiiIiIlilli","B3ZHn6C6uowsdWb5qLf6vyC0sGqICtCwe97P4B/nH05cXsFF5iMRCenZKMunog==">()))
         .withFragmentShader(liiiIIllIl(lIiiIiIlilli<"lIiiIiIlilli","B3ZHn6C6uowsdWb5qLf6vyC0sGqICtCwe97P4B/nH05cXsFF5iMRCenZKMunog==">()))
         .withUniform(lIiiIiIlilli<"lIiiIiIlilli","zWwJejVKqmOqjKc1s6PgjczAykdCZQvPACq9gNnonO/BmjPu+wun6Hw=">(), class_10789.field_60031)
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline lllliiIIIi = class_10799.method_67887(
      IilliliilIIi(lIiiIiIlilli<"lIiiIiIlilli","47I7Sfl6kEBfRHZ3J5TbB2sNyaXRFmP/YKfib3MXsOWYig==">())
         .withShaderDefine(lIiiIiIlilli<"lIiiIiIlilli","xm2hBD9B+1hQgYLwZWGpYNh5equwX/dmguk7ZhTiTdGotPhuZkYsrw==">(), 0.5F)
         .build()
   );
   public static final RenderPipeline IllliiIIIi = class_10799.method_67887(
      IilliliilIIi(lIiiIiIlilli<"lIiiIiIlilli","/Lwt/YB6tRC50lruOigVMwxvYCqx+5+jIXuhjAyktxC+">()).build()
   );
   public static final RenderPipeline illliiIIIi = class_10799.method_67887(
      IilliliilIIi(lIiiIiIlilli<"lIiiIiIlilli","6wxyI45hp873W1a20qli9bbj8+1PBuMakTayk2hNGNVNsu49mSjb">())
         .withBlend(BlendFunction.TRANSLUCENT)
         .withShaderDefine(lIiiIiIlilli<"lIiiIiIlilli","xm2hBD9B+1hQgYLwZWGpYNh5equwX/dmguk7ZhTiTdGotPhuZkYsrw==">(), 0.01F)
         .withDepthWrite(false)
         .build()
   );
   public static final RenderPipeline lilliiIIIi = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
         .withLocation(iIlIlllllill(lIiiIiIlilli<"lIiiIiIlilli","nRqDD7sTiwWNxZNKrLsoLwBZxK/98B03knftjGRkD2VYN9/LzJjx5Z4trw==">()))
         .withBlend(BlendFunction.TRANSLUCENT)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );

   public static void IliIlllilIi() {
   }

   private static class_2960 iIlIlllllill(String name) {
      return class_2960.method_60655(
         lIiiIiIlilli<"lIiiIiIlilli","Qpyp9ulWCrLUSCDcSeT47WRnNqq1Qs8PJwlUwZM4kayZzP8B95s=">(),
         lIiiIiIlilli<"lIiiIiIlilli","vrYt+aFceZdatpFj7ZsUtS/q3qs+eOpgtv4g+cUP/2M8/CScR50B9VcjoXAVsI8=">() + name
      );
   }

   private lillllIiiillllIi() {
   }

   private static class_2960 liiiIIllIl(String name) {
      return class_2960.method_60655(
         lIiiIiIlilli<"lIiiIiIlilli","Qpyp9ulWCrLUSCDcSeT47WRnNqq1Qs8PJwlUwZM4kayZzP8B95s=">(),
         lIiiIiIlilli<"lIiiIiIlilli","NuNhx+xVuj7UofGjJPra4lh3qb9daOuyFebE68cgcXlw">() + name
      );
   }

   private static Builder IilliliilIIi(String name) {
      return RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
         .withLocation(iIlIlllllill(name))
         .withVertexShader(liiiIIllIl(lIiiIiIlilli<"lIiiIiIlilli","dEyutCB5OsmrGUNwT2jeo/iOvp2+BxKFlLt1vwDHjqOb2YNa+f0mA+Lr">()))
         .withFragmentShader(liiiIIllIl(lIiiIiIlilli<"lIiiIiIlilli","dEyutCB5OsmrGUNwT2jeo/iOvp2+BxKFlLt1vwDHjqOb2YNa+f0mA+Lr">()))
         .withUniform(lIiiIiIlilli<"lIiiIiIlilli","RiDHpBRmpXsYs5EXKBT/6SdY3SERlNHHYdusWCiijg==">(), class_10789.field_60031)
         .withSampler(lIiiIiIlilli<"lIiiIiIlilli","iRfFnkR1JJzK3M/zWWcvO0pjyyzRMvDTeNx7TKuaMh+QnI/X">())
         .withSampler(lIiiIiIlilli<"lIiiIiIlilli","87n9KJ70yzvzcpX2eRF0RqkG56+/SuQsSKUAHdK5am5K9Yek">())
         .withVertexFormat(class_290.field_1590, class_5596.field_27382);
   }
}
