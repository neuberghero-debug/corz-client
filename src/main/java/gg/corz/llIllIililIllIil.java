package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_276;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_9801;
import net.minecraft.class_9801.class_4574;
import org.joml.Matrix4f;

public final class llIllIililIllIil {
   private static class_287 llIilIlIil;
   private static class_5596 lIIilIlIil;
   private static final Map<class_5596, RenderPipeline> iiillIlIil = new EnumMap<>(class_5596.class);
   private static class_287 IIIilIlIil;
   private static int IlIilIlIil;
   private static final Matrix4f ilIilIlIil = new Matrix4f();

   public static void IIlllIlliIll() {
      if (IlIilIlIil > 0) {
         if (--IlIilIlIil <= 0) {
            class_287 var0 = llIilIlIil;
            llIilIlIil = null;
            if (var0 != null && IIIilIlIil == var0) {
               IIillIiliIil();
            }
         }
      }
   }

   public static void iliIiiliiiii(class_4588 y2, float y1, float x1, float argb, float vc, int x2) {
      Matrix4f var6 = lIiiIiIlilli();
      y2.method_22918(var6, y1, x1, 0.0F).method_39415(x2);
      y2.method_22918(var6, y1, vc, 0.0F).method_39415(x2);
      y2.method_22918(var6, argb, vc, 0.0F).method_39415(x2);
      y2.method_22918(var6, argb, x1, 0.0F).method_39415(x2);
   }

   public static class_4588 IlIlllIlilIl(class_5596 mode) {
      if (llIilIlIil != null) {
         class_287 var1 = llIilIlIil;
         llIilIlIil = null;
         if (IIIilIlIil == var1) {
            IIillIiliIil();
         }
      }

      IIIilIlIil = class_289.method_1348().method_60827(mode, class_290.field_1576);
      lIIilIlIil = mode;
      return IIIilIlIil;
   }

   public static class_4588 Iilllilliill() {
      if (llIilIlIil == null || IIIilIlIil != llIilIlIil) {
         IlIlllIlilIl(class_5596.field_27379);
         llIilIlIil = IIIilIlIil;
      }

      return llIilIlIil;
   }

   private static RenderPipeline IliIlllilIi(class_5596 mode) {
      return iiillIlIil.computeIfAbsent(
         mode,
         m -> {
            RenderPipeline var1 = RenderPipeline.builder(new Snippet[0])
               .withLocation(
                  class_2960.method_60655(
                     IIIilIIiiIIi<"IIIilIIiiIIi","XbyS2Y5h7S36pf3y1yZto+drYlgWTe3DUQdcmNZDFC58oGzgYf0=">(),
                     IIIilIIiiIIi<"IIIilIIiiIIi","C1E/KqFI0Nv2/hJL37WvYYLol50R2YT1YGLfBcZM0v7IPE/rGxadY9BKJiwuaok=">() + m.name().toLowerCase()
                  )
               )
               .withVertexShader(
                  class_2960.method_60655(
                     IIIilIIiiIIi<"IIIilIIiiIIi","XbyS2Y5h7S36pf3y1yZto+drYlgWTe3DUQdcmNZDFC58oGzgYf0=">(),
                     IIIilIIiiIIi<"IIIilIIiiIIi","GMeBKFFoKiXqubvvnrjGsYMqkoL21y8wuB9u2kuLedHfhia31z/JOlQ0koyrciY=">()
                  )
               )
               .withFragmentShader(
                  class_2960.method_60655(
                     IIIilIIiiIIi<"IIIilIIiiIIi","XbyS2Y5h7S36pf3y1yZto+drYlgWTe3DUQdcmNZDFC58oGzgYf0=">(),
                     IIIilIIiiIIi<"IIIilIIiiIIi","GMeBKFFoKiXqubvvnrjGsYMqkoL21y8wuB9u2kuLedHfhia31z/JOlQ0koyrciY=">()
                  )
               )
               .withVertexFormat(class_290.field_1576, m)
               .withUniform(IIIilIIiiIIi<"IIIilIIiiIIi","4MvGn4IiG1Ix7hFwqnwueUTeyajJu2sdj1IK+JL7k9pwSOc=">(), class_10789.field_60031)
               .withBlend(BlendFunction.TRANSLUCENT)
               .withCull(false)
               .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
               .withDepthWrite(false)
               .build();
            class_10799.method_67887(var1);
            return var1;
         }
      );
   }

   public static class_4588 IilliliilIIi() {
      return IlIlllIlilIl(class_5596.field_27382);
   }

   public static void IiIlliIliiIl() {
      IlIilIlIil++;
   }

   public static void IIIllIIliIIl(class_4588 argb, float vc, float by, float cx, float dy, float ay, float cy, float ax, float dx, int bx) {
      Matrix4f var10 = lIiiIiIlilli();
      argb.method_22918(var10, vc, by, 0.0F).method_39415(bx);
      argb.method_22918(var10, cx, dy, 0.0F).method_39415(bx);
      argb.method_22918(var10, ay, cy, 0.0F).method_39415(bx);
      argb.method_22918(var10, ax, dx, 0.0F).method_39415(bx);
   }

   public static void liiiIIllIl() {
      IliIlllilIi(class_5596.field_27381);
      IliIlllilIi(class_5596.field_27380);
      IliIlllilIi(class_5596.field_27382);
      IliIlllilIi(class_5596.field_27379);
   }

   public static boolean Illlllllilll() {
      return IlIilIlIil > 0;
   }

   public static void IIillIiliIil() {
      if (IIIilIlIil != null) {
         class_9801 var0 = IIIilIlIil.method_60794();
         class_5596 var1 = lIIilIlIil;
         IIIilIlIil = null;
         lIIilIlIil = null;
         if (var0 != null) {
            GpuDevice var2 = RenderSystem.getDevice();
            ByteBuffer var3 = IIlliiillIlliiil.IliIlllilIi(16);
            var3.putFloat(0, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489() / (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4495());
            var3.putFloat(4, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506() / (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4495());
            class_9801 var4 = var0;

            try {
               class_4574 var5 = var4.method_60822();
               illliiIillii var6 = IIlliiillIlliiil.iIlIlllllill(var4.method_60818(), class_290.field_1576.getVertexSize());
               GpuBufferSlice var7 = IIlliiillIlliiil.liiiIIllIl(var3);
               class_5590 var8 = RenderSystem.getSequentialBuffer(var1);
               GpuBuffer var9 = var8.method_68274(var5.comp_751());
               class_276 var10 = ilIllIiIll.Iiiilllliiilll.method_1522();
               CommandEncoder var11 = var2.createCommandEncoder();
               RenderPass var12 = var11.createRenderPass(
                  () -> IIIilIIiiIIi<"IIIilIIiiIIi","pQH2mF5nzazuUiN/PyfNOTcJwGRJPmzs4If+xfll9iSfJpl/6RMQcVjW">(),
                  var10.method_71639(),
                  OptionalInt.empty(),
                  var10.method_71640(),
                  OptionalDouble.empty()
               );

               try {
                  IIlliiillIlliiil.iliillIiil++;
                  var12.setPipeline(IliIlllilIi(var1));
                  iIIiilIiIlIiilIi.IilliliilIIi(var12);
                  var12.setUniform(IIIilIIiiIIi<"IIIilIIiiIIi","4MvGn4IiG1Ix7hFwqnwueUTeyajJu2sdj1IK+JL7k9pwSOc=">(), var7);
                  var12.setVertexBuffer(0, var6.IliIlllilIi());
                  var12.setIndexBuffer(var9, var8.method_31924());
                  var12.drawIndexed(var6.liiiIIllIl(), 0, var5.comp_751(), 1);
               } catch (Throwable var17) {
                  if (var12 != null) {
                     try {
                        var12.close();
                     } catch (Throwable var16) {
                        var17.addSuppressed(var16);
                     }
                  }

                  throw var17;
               }

               if (var12 != null) {
                  var12.close();
               }
            } catch (Throwable var18) {
               if (var0 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var15) {
                     var18.addSuppressed(var15);
                  }
               }

               throw var18;
            }

            if (var0 != null) {
               var0.close();
            }
         }
      }
   }

   private llIllIililIllIil() {
   }

   public static void iIlIlllllill(float x1, float y1, float argb, float y2, int x2) {
      class_4588 var5 = IilliliilIIi();
      iliIiiliiiii(var5, x1, y1, argb, y2, x2);
      IIillIiliIil();
   }

   private static Matrix4f lIiiIiIlilli() {
      class_4587 var0 = IIIiiIillIIiiIil.liiiIIllIl();
      return var0 == null ? ilIilIlIil : var0.method_23760().method_23761();
   }
}
