package gg.corz;

import com.corz.client.mixins.AccessorGlCommandEncoder;
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
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.class_5595;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_1044;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_12137;
import net.minecraft.class_276;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_9801;
import net.minecraft.class_9801.class_4574;
import org.joml.Matrix4f;

public final class IliiIilliiIi {
   private static final int lIiiIlIIliIiiIlIIl = 64;
   private static boolean lliIllIIliliIllIIl;
   private static class_12137 iiiIllIIlIIIlllIIl;
   public static float ilIlllIIlIiIlllIIl = 1.0F;
   private static final Supplier<String> ililllIIlIiilllIIl = () -> ilIllIiIll<"ilIllIiIll","WTH4CP8uAQ9xD7aONfE0vjbr08J36DyW29B2j1n71zwv7Rft4xc=">();
   private static final int iliiIlIIlIiiiIlIIl = 48;
   private static float iIllllIIlIlllllIIl;
   private static GpuTextureView IiIillIIlliIillIIl;
   private static float IillllIIllillllIIl;
   public static final RenderPipeline lilIllIIliilIllIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","YZMbG0fs/8o4tXBvQPmFjLppn7EBVQQNnqvpa6l2dyQKBarigmHCRqeG0vM/">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","ckPwt8Ki8UbLdn7Q53NP05BaESAZw7LLYGcjTU2j/gSjs+KDjwtQddDPzgmqGQ==">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","ckPwt8Ki8UbLdn7Q53NP05BaESAZw7LLYGcjTU2j/gSjs+KDjwtQddDPzgmqGQ==">()
         )
      )
      .withVertexFormat(class_290.field_1575, class_5596.field_27382)
      .withUniform(ilIllIiIll<"ilIllIiIll","9bpWnghVmMmd/4xYhGKKuNZJgM/Qr8oTHzaUGjEF+y9Yd1UgJAmjDA==">(), class_10789.field_60031)
      .withSampler(ilIllIiIll<"ilIllIiIll","5lQeLqnpQciIVgoHTed/GH1+EsUNCYhPVaSv5zMTKHR2zHhn">())
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static int IIIillIIllIIillIIl;
   private static float llllllIIlilllllIIl;
   private static final int IIIIllIIllIIIllIIl = 240;
   public static final RenderPipeline IIiIllIIllIiIllIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","wwQGqLhnr+uwhO2D2M+lAqE8BgznHyVfLoek/bOG+G0nBhuN/IGRM0KEPr17+U33DUJ5pSk=">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","sPBd3OVxXnqmoOUBUVpCXpmy0UcCv7KBSEcKJ7nOgTLoQc364Yvd17wfeUEQm+npqZ/teW/6">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","sPBd3OVxXnqmoOUBUVpCXpmy0UcCv7KBSEcKJ7nOgTLoQc364Yvd17wfeUEQm+npqZ/teW/6">()
         )
      )
      .withVertexFormat(class_290.field_1575, class_5596.field_27382)
      .withUniform(ilIllIiIll<"ilIllIiIll","9EZnIDg0SLmbwSI/NT9QNW5UlU3cvIGNHDjlaMsnwa2qFEeJLeFS87o9">(), class_10789.field_60031)
      .withSampler(ilIllIiIll<"ilIllIiIll","5lQeLqnpQciIVgoHTed/GH1+EsUNCYhPVaSv5zMTKHR2zHhn">())
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   public static final RenderPipeline IllIllIIllllIllIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","T+b7kDH/3OQPtyh2YRq5MXBlQesQzR+vh9nZC7UqNCBeVlw7CpvZLoHZPvFDDMICMA==">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","oEaxUmluZAEtlnz/y3AFAX7Vr0uB0A2G1zDns990MTpvoVsnzKmohHTHYb5Q">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","oEaxUmluZAEtlnz/y3AFAX7Vr0uB0A2G1zDns990MTpvoVsnzKmohHTHYb5Q">()
         )
      )
      .withVertexFormat(class_290.field_1592, class_5596.field_27382)
      .withUniform(ilIllIiIll<"ilIllIiIll","u6IbwYWD+K7DAu0tCPTx5ARlHt2ltMAqNUv1/KoPYitcUBUwNJcNYm5F3A==">(), class_10789.field_60031)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static final llllIIliilllIIli[] lIilllIIliIilllIIl = new llllIIliilllIIli[512];
   private static int liilllIIliiilllIIl;
   private static GpuTextureView iiIillIIlIIlillIIl;
   public static final int IiIIllIIlliIIllIIl = 6;
   private static final int liiiIlIIliiiiIlIIl = 96;
   private static class_12137 IiiIllIIlliiIllIIl;
   private static final int iIIIllIIlIlIIllIIl = 48;
   public static final RenderPipeline iiIIllIIlIIlIllIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","7bQV8R1gj+6iyWV0KvKPhV3hWqyb0IYne2Gy0Q+Ri1P+aavZwGIX2v2cs4c=">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","mbsVTY7dEFOUKtC09X9tBxajiw2bwrdwdwtv7gZfyfNdzlMhsUou5FgFbrVY">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","mbsVTY7dEFOUKtC09X9tBxajiw2bwrdwdwtv7gZfyfNdzlMhsUou5FgFbrVY">()
         )
      )
      .withVertexFormat(class_290.field_1592, class_5596.field_27382)
      .withUniform(ilIllIiIll<"ilIllIiIll","9VFFoy6GBWbQYomZ7BkH9pVERe4Fh3o/TPOxnv0ZBR79ueMKxAJg">(), class_10789.field_60031)
      .withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static int iIIillIIlIlIillIIl;
   private static float IIllllIIllIllllIIl;
   public static final RenderPipeline lIlIllIIliIlIllIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","JqEE911qvnSYPT/XYPcWwkrqZzctGzvx78j4RWUrxAykkEwjyBbosKGzN0VffA==">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","eKDxzWmgJ1M1mNI3VM7BAn4frmfr12Pq6dgrmhM8PRq3xYJOB8CwuZ0l1BN2bYg=">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","eKDxzWmgJ1M1mNI3VM7BAn4frmfr12Pq6dgrmhM8PRq3xYJOB8CwuZ0l1BN2bYg=">()
         )
      )
      .withVertexFormat(class_290.field_1592, class_5596.field_27382)
      .withUniform(ilIllIiIll<"ilIllIiIll","JqdDSikdPGmDnvwzBrTaM91eQ2ccsWZV3tMpQLEV6S6Z+mRslpkwRww=">(), class_10789.field_60031)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   private static float liIlllIIliiIlllIIl;
   private static final int IliiIlIIllliiIlIIl = 112;
   private static final int iillllIIlIIilllIIl = 512;
   public static float lIIlllIIliIIlllIIl = 0.0F;
   private static final IIiIillllIiIilll IlilllIIlllilllIIl = new IIiIillllIiIilll();
   private static final int llIIllIIlilIIllIIl = 144;
   private static boolean llIillIIlilIillIIl;
   public static final RenderPipeline illIllIIlIilIllIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","pd1zB+EdmcYWP/22ynRYdzWmkL3iqUmLWFb5BrAbsqLpXEbmcb+YD6ojcPiceJWgUwpiZ1bv">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","OSI4991F76UCS9yzOitXXp81m4Ta3M5/J4hvFTKv02/LxwxFrhka/XIoIOwGeuv2a4s=">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","OSI4991F76UCS9yzOitXXp81m4Ta3M5/J4hvFTKv02/LxwxFrhka/XIoIOwGeuv2a4s=">()
         )
      )
      .withVertexFormat(class_290.field_1592, class_5596.field_27382)
      .withUniform(ilIllIiIll<"ilIllIiIll","bxDPn+WQJDmfy2zVK44GSSO3b6jSSWklfP/+kFyxPikD40X5+euSg4H2yqzp/5A=">(), class_10789.field_60031)
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();
   public static float IlIlllIIlllIlllIIl = 0.0F;
   public static final RenderPipeline iIiIllIIlIliIllIIl = RenderPipeline.builder(new Snippet[0])
      .withLocation(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","WcM+Ij2iJA4R9AwFRlzU2WV0NgYjADHUNI+1fr7xD0rogweVYhCdix130xeM4g==">()
         )
      )
      .withVertexShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","eojKSxDYkcT7ygOmARAI63zyhyiTxH0oxeJpCiinPlvqPNVN7OxEGPn/bftTNUY=">()
         )
      )
      .withFragmentShader(
         class_2960.method_60655(
            ilIllIiIll<"ilIllIiIll","Iysp7lPiFZS2DwUEV/9XWOMyI5Ltoc81+xtQXp8BswsZwO82fq4=">(),
            ilIllIiIll<"ilIllIiIll","eojKSxDYkcT7ygOmARAI63zyhyiTxH0oxeJpCiinPlvqPNVN7OxEGPn/bftTNUY=">()
         )
      )
      .withVertexFormat(class_290.field_1575, class_5596.field_27382)
      .withUniform(ilIllIiIll<"ilIllIiIll","tIxkf/4W2AZOyZTJhcHtlQzetD75qLORzGsgoesymv/ATPHW">(), class_10789.field_60031)
      .withSampler(ilIllIiIll<"ilIllIiIll","5lQeLqnpQciIVgoHTed/GH1+EsUNCYhPVaSv5zMTKHR2zHhn">())
      .withBlend(BlendFunction.TRANSLUCENT)
      .withCull(false)
      .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
      .withDepthWrite(false)
      .build();

   public static boolean IIillIiliIil(Matrix4f m) {
      float var1 = 1.0E-5F;
      return Math.abs(m.m01()) <= 1.0E-5F
         && Math.abs(m.m10()) <= 1.0E-5F
         && Math.abs(m.m03()) <= 1.0E-5F
         && Math.abs(m.m13()) <= 1.0E-5F
         && Math.abs(m.m33() - 1.0F) <= 1.0E-5F
         && m.m00() > 1.0E-5F
         && m.m11() > 1.0E-5F;
   }

   public static int IlIlllIlilIl(int argb) {
      long var3 = -2801328751020591741L;
      var3 ^= ((long)(argb >>> 24 & 0xFF) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)Math.round((float)((int)(var3 >>> 32)) * ilIlllIIlIiIlllIIl) ^ var3) & -1L >>> 32;
      return Math.max(0, Math.min(255, (int)var3)) << 24 | argb & 16777215;
   }

   public static void Iiiiliiiiiii(
      Matrix4f y2, float matrix, float x2, float u1, float alpha, float x, float v1, float v2, float view, GpuTextureView y, float u2, float radius
   ) {
      if (y != null) {
         ByteBuffer var12 = IIiilIiiiIii(y2, matrix, x2, u1, alpha, u2);
         float var13 = ilIlllIIlIiIlllIIl * (radius < 0.0F ? 0.0F : (radius > 1.0F ? 1.0F : radius));
         class_287 var14 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
         var14.method_22918(y2, matrix, alpha, 0.0F).method_22913(x, view).method_22915(1.0F, 1.0F, 1.0F, var13);
         var14.method_22918(y2, u1, alpha, 0.0F).method_22913(v2, view).method_22915(1.0F, 1.0F, 1.0F, var13);
         var14.method_22918(y2, u1, x2, 0.0F).method_22913(v2, v1).method_22915(1.0F, 1.0F, 1.0F, var13);
         var14.method_22918(y2, matrix, x2, 0.0F).method_22913(x, v1).method_22915(1.0F, 1.0F, 1.0F, var13);
         iIiIlIliIl(
            var14.method_60800(),
            IIiIllIIllIiIllIIl,
            ilIllIiIll<"ilIllIiIll","70j+1wN4FY7s2bAlwZg2YwXVFvA31vS4fIMUcs10zvWkBUWKFHs=">(),
            ilIllIiIll<"ilIllIiIll","9EZnIDg0SLmbwSI/NT9QNW5UlU3cvIGNHDjlaMsnwa2qFEeJLeFS87o9">(),
            var12,
            y,
            liiiIIllIl()
         );
      }
   }

   public static void illIlIilIl() {
      if (liilllIIliiilllIIl != 0 && !llIillIIlilIillIIl && RenderSystem.isOnRenderThread()) {
         if (RenderSystem.getDevice().createCommandEncoder() instanceof AccessorGlCommandEncoder var0 && var0.corzRenderPassOpen()) {
            return;
         }

         lilIliilIl();
      }
   }

   public static void Illillliilli(
      Matrix4f or,
      float og,
      float x1,
      float inner,
      float cy,
      int r,
      int oa,
      float y2,
      float radius,
      float x2,
      float ob,
      float y1,
      float outline,
      float arcHalf,
      float b,
      float halfW,
      float a,
      float halfH,
      float cx,
      float mode,
      float glow,
      float angle,
      float g,
      float shape,
      float matrix
   ) {
      ByteBuffer var25 = IIlliiillIlliiil.IliIlllilIi(96);
      var25.putFloat(0, IiIlliIliiIl());
      var25.putFloat(4, IIlllIlliIll());
      var25.putFloat(8, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489());
      var25.putFloat(12, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506());
      var25.putFloat(16, y2);
      var25.putFloat(20, radius);
      var25.putFloat(24, x2);
      var25.putFloat(28, ob);
      var25.putFloat(32, halfH);
      var25.putFloat(36, cx);
      var25.putFloat(40, mode);
      var25.putFloat(44, glow);
      var25.putFloat(48, angle);
      var25.putFloat(52, g);
      var25.putFloat(56, shape);
      var25.putFloat(60, matrix);
      var25.putFloat(64, y1);
      var25.putFloat(68, outline);
      var25.putFloat(72, halfW);
      var25.putFloat(76, arcHalf);
      var25.putFloat(80, b);
      var25.putFloat(84, a);
      var25.putInt(88, r);
      var25.putInt(92, oa);
      IiiIlliiIl(lIlIllIIliIlIllIIl, ilIllIiIll<"ilIllIiIll","JqdDSikdPGmDnvwzBrTaM91eQ2ccsWZV3tMpQLEV6S6Z+mRslpkwRww=">(), var25, or, og, x1, inner, cy);
   }

   public static void Iilllilliill(
      Matrix4f radius,
      float r,
      float y1,
      float g,
      float b,
      float a,
      float posX,
      float x2,
      float sizeX,
      float x1,
      float posY,
      float matrix,
      float y2,
      float sizeY
   ) {
      Iiilliiliiil(radius, r, y1, g, b, a, posX, x2, sizeX, x1, 0.0F, posY, matrix, y2, sizeY);
   }

   public static void Iiilliiliiil(
      Matrix4f y2,
      float matrix,
      float r,
      float sizeY,
      float radius,
      float g,
      float x2,
      float stroke,
      float b,
      float posX,
      float y1,
      float x1,
      float posY,
      float sizeX,
      float a
   ) {
      if (Ililllililil(y2)) {
         g = g * iIllllIIlIlllllIIl + liIlllIIliiIlllIIl;
         x2 = x2 * llllllIIlilllllIIl + IIllllIIllIllllIIl;
         stroke *= iIllllIIlIlllllIIl;
         b *= llllllIIlilllllIIl;
         posX *= IillllIIllillllIIl;
         y1 *= IillllIIllillllIIl;
      }

      ByteBuffer var15 = IIlliiillIlliiil.IliIlllilIi(64);
      var15.putFloat(0, IiIlliIliiIl());
      var15.putFloat(4, IIlllIlliIll());
      var15.putFloat(8, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489());
      var15.putFloat(12, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506());
      var15.putFloat(16, g);
      var15.putFloat(20, x2);
      var15.putFloat(24, stroke);
      var15.putFloat(28, b);
      var15.putFloat(32, posX);
      var15.putFloat(36, y1);
      var15.putFloat(48, x1);
      var15.putFloat(52, posY);
      var15.putFloat(56, sizeX);
      var15.putFloat(60, a);
      IiiIlliiIl(
         IllIllIIllllIllIIl, ilIllIiIll<"ilIllIiIll","u6IbwYWD+K7DAu0tCPTx5ARlHt2ltMAqNUv1/KoPYitcUBUwNJcNYm5F3A==">(), var15, y2, matrix, r, sizeY, radius
      );
   }

   public static float IilliliilIIi(float alpha) {
      float var1 = ilIlllIIlIiIlllIIl;
      float var2 = alpha < 0.0F ? 0.0F : (alpha > 1.0F ? 1.0F : alpha);
      ilIlllIIlIiIlllIIl = var1 * var2;
      return var1;
   }

   public static float Illlllllilll() {
      return IIlllIlliIll() / (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506();
   }

   public static void IliIlllilIi() {
      if (!lliIllIIliliIllIIl) {
         lliIllIIliliIllIIl = true;
         class_10799.method_67887(IllIllIIllllIllIIl);
         class_10799.method_67887(illIllIIlIilIllIIl);
         class_10799.method_67887(lilIllIIliilIllIIl);
         class_10799.method_67887(IIiIllIIllIiIllIIl);
         class_10799.method_67887(iIiIllIIlIliIllIIl);
         class_10799.method_67887(lIlIllIIliIlIllIIl);
      }
   }

   private static void IiiIlliiIl(RenderPipeline y2, String pipeline, ByteBuffer matrix, Matrix4f x1, float y1, float x2, float uboName, float uboData) {
      class_287 var8 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1592);
      var8.method_22918(x1, y1, x2, 0.0F);
      var8.method_22918(x1, y1, uboData, 0.0F);
      var8.method_22918(x1, uboName, uboData, 0.0F);
      var8.method_22918(x1, uboName, x2, 0.0F);
      iIiIlIliIl(var8.method_60800(), y2, ilIllIiIll<"ilIllIiIll","yQo8lQF6uqib8VLvdS3vvm1ejKL4LYhFLiObJaWbFtSbFed8UJeg">(), pipeline, matrix, null, null);
   }

   private static void IiIIlliIIl(class_9801 built, GpuTextureView view) {
      ByteBuffer var2 = IIlliiillIlliiil.IliIlllilIi(16);
      var2.putFloat(0, IiIlliIliiIl());
      var2.putFloat(4, IIlllIlliIll());
      iIiIlIliIl(
         built,
         iIiIllIIlIliIllIIl,
         ilIllIiIll<"ilIllIiIll","CwI+1CzjwJRp8wExzjnFT6IEVFs7P1kLaK3PUkDm7G25qL2fKAErXZ62">(),
         ilIllIiIll<"ilIllIiIll","tIxkf/4W2AZOyZTJhcHtlQzetD75qLORzGsgoesymv/ATPHW">(),
         var2,
         view,
         liiiIIllIl()
      );
   }

   public static void llIIlilIIl(class_9801 built, class_2960 texture) {
      class_1044 var2 = ilIllIiIll.Iiiilllliiilll.method_1531().method_4619(texture);
      IiIIlliIIl(built, var2.method_71659());
   }

   public static void IIIIllIIIl(class_9801 texture, class_2960 built) {
      class_1044 var2 = ilIllIiIll.Iiiilllliiilll.method_1531().method_4619(built);
      lliIliliIl(texture, var2.method_71659(), lilIllIIliilIllIIl, ilIllIiIll<"ilIllIiIll","wLh871T7MP7O5BxweCNrfxI5jexc8Kq3zLefyEus/Ir4VczcDUc4Nng=">());
   }

   public static void lIiiIiIlilli(float token) {
      ilIlllIIlIiIlllIIl = token;
   }

   private static ByteBuffer IIiilIiiiIii(Matrix4f y, float x, float y2, float matrix, float radius, float x2) {
      float var6 = Illlllllilll();
      float var7 = x / var6;
      float var8 = y2 / var6;
      float var9 = (matrix - x) / var6;
      float var10 = (radius - y2) / var6;
      float var11 = x2 / var6;
      if (Ililllililil(y)) {
         var7 = var7 * iIllllIIlIlllllIIl + liIlllIIliiIlllIIl;
         var8 = var8 * llllllIIlilllllIIl + IIllllIIllIllllIIl;
         var9 *= iIllllIIlIlllllIIl;
         var10 *= llllllIIlilllllIIl;
         var11 *= IillllIIllillllIIl;
      }

      ByteBuffer var12 = IIlliiillIlliiil.IliIlllilIi(48);
      var12.putFloat(0, IiIlliIliiIl());
      var12.putFloat(4, IIlllIlliIll());
      var12.putFloat(8, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489());
      var12.putFloat(12, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506());
      var12.putFloat(16, var7);
      var12.putFloat(20, var8);
      var12.putFloat(24, var9);
      var12.putFloat(28, var10);
      var12.putFloat(32, var11);
      return var12;
   }

   public static boolean IiIiliIiiiIi() {
      return RenderSystem.getDevice().precompilePipeline(iiIIllIIlIIlIllIIl).isValid();
   }

   private static boolean IIiIllIiIl(
      RenderPipeline uboName, String indexCount, GpuBufferSlice view, illliiIillii pipeline, int sampler, GpuTextureView ubo, class_12137 v
   ) {
      if (ubo == null && !uboName.getSamplers().isEmpty()) {
         return false;
      } else {
         class_276 var7 = ilIllIiIll.Iiiilllliiilll.method_1522();
         GpuTextureView var8 = var7.method_71639();
         GpuTextureView var9 = var7.method_71640();
         if (var8 != null && !var8.isClosed() && (var9 == null || !var9.isClosed())) {
            if (liilllIIliiilllIIl > 0 && (liilllIIliiilllIIl == 512 || var8 != IiIillIIlliIillIIl || var9 != iiIillIIlIIlillIIl)) {
               lilIliilIl();
            }

            IiIillIIlliIillIIl = var8;
            iiIillIIlIIlillIIl = var9;
            llllIIliilllIIli var10 = lIilllIIliIilllIIl[liilllIIliiilllIIl];
            if (var10 == null) {
               var10 = lIilllIIliIilllIIl[liilllIIliiilllIIl] = new llllIIliilllIIli();
            }

            var10.IliillIlIi = uboName;
            var10.lliillIlIi = indexCount;
            var10.iliillIlIi = view;
            var10.IiiillIlIi = pipeline.IliIlllilIi();
            var10.liiillIlIi = pipeline.liiiIIllIl();
            var10.iiiillIlIi = sampler;
            var10.IIIIilIlIi = ubo;
            var10.lIIIilIlIi = v;
            IlilllIIlllilllIIl.llIllIlill = false;
            iIIiilIiIlIiilIi.IilliliilIIi(IlilllIIlllilllIIl);
            var10.iIIIilIlIi = IlilllIIlllilllIIl.llIllIlill;
            var10.IlIIilIlIi = IlilllIIlllilllIIl.ilIllIlill;
            var10.llIIilIlIi = IlilllIIlllilllIIl.IiIllIlill;
            var10.ilIIilIlIi = IlilllIIlllilllIIl.liIllIlill;
            var10.IiIIilIlIi = IlilllIIlllilllIIl.iiIllIlill;
            RenderSystem.getSequentialBuffer(class_5596.field_27382).method_68274(sampler);
            if (sampler > IIIillIIllIIillIIl) {
               IIIillIIllIIillIIl = sampler;
            }

            liilllIIliiilllIIl++;
            IIlliiillIlliiil.iliillIiil++;
            return true;
         } else {
            return false;
         }
      }
   }

   public static void IlIillIiilIi(
      Matrix4f posY,
      float x1,
      float a,
      float glowStrength,
      float clipY,
      float glowSize,
      float clipFade,
      float sizeX,
      float posX,
      float clipRadius,
      float y2,
      float matrix,
      float r,
      float y1,
      float fill,
      float x2,
      boolean clipH,
      float g,
      float clipX,
      float clipW,
      float sizeY,
      float b,
      float radius
   ) {
      if (Ililllililil(posY)) {
         glowSize = glowSize * iIllllIIlIlllllIIl + liIlllIIliiIlllIIl;
         clipFade = clipFade * llllllIIlilllllIIl + IIllllIIllIllllIIl;
         sizeX *= iIllllIIlIlllllIIl;
         posX *= llllllIIlilllllIIl;
         clipRadius *= IillllIIllillllIIl;
         fill *= IillllIIllillllIIl;
         g = g * iIllllIIlIlllllIIl + liIlllIIliiIlllIIl;
         clipX = clipX * llllllIIlilllllIIl + IIllllIIllIllllIIl;
         clipW *= iIllllIIlIlllllIIl;
         sizeY *= llllllIIlilllllIIl;
         b *= IillllIIllillllIIl;
         radius *= IillllIIllillllIIl;
      }

      ByteBuffer var23 = IIlliiillIlliiil.IliIlllilIi(112);
      var23.putFloat(0, IiIlliIliiIl());
      var23.putFloat(4, IIlllIlliIll());
      var23.putFloat(8, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489());
      var23.putFloat(12, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506());
      var23.putFloat(16, glowSize);
      var23.putFloat(20, clipFade);
      var23.putFloat(24, sizeX);
      var23.putFloat(28, posX);
      var23.putFloat(32, clipRadius);
      var23.putFloat(36, fill);
      var23.putFloat(48, y2);
      var23.putFloat(52, matrix);
      var23.putFloat(56, r);
      var23.putFloat(60, y1);
      var23.putFloat(64, x2);
      var23.putInt(68, clipH ? 1 : 0);
      var23.putFloat(80, g);
      var23.putFloat(84, clipX);
      var23.putFloat(88, clipW);
      var23.putFloat(92, sizeY);
      var23.putFloat(96, b);
      var23.putFloat(100, radius);
      IiiIlliiIl(
         illIllIIlIilIllIIl,
         ilIllIiIll<"ilIllIiIll","bxDPn+WQJDmfy2zVK44GSSO3b6jSSWklfP/+kFyxPikD40X5+euSg4H2yqzp/5A=">(),
         var23,
         posY,
         x1,
         a,
         glowStrength,
         clipY
      );
   }

   public static void iiIIlIIlIl() {
      iIIillIIlIlIillIIl++;
   }

   public static void Iilililiiili(
      Matrix4f x2, float g, float u1, float x, float y2, float b, float v1, float y, float r, class_2960 v2, float matrix, float u2, float texture, float a
   ) {
      class_1044 var14 = ilIllIiIll.Iiiilllliiilll.method_1531().method_4619(v2);
      GpuTextureView var15 = var14.method_71659();
      ByteBuffer var16 = IIlliiillIlliiil.IliIlllilIi(16);
      var16.putFloat(0, IiIlliIliiIl());
      var16.putFloat(4, IIlllIlliIll());
      class_287 var17 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
      var17.method_22918(x2, g, y2, 0.0F).method_22913(b, r).method_22915(matrix, u2, texture, a);
      var17.method_22918(x2, x, y2, 0.0F).method_22913(y, r).method_22915(matrix, u2, texture, a);
      var17.method_22918(x2, x, u1, 0.0F).method_22913(y, v1).method_22915(matrix, u2, texture, a);
      var17.method_22918(x2, g, u1, 0.0F).method_22913(b, v1).method_22915(matrix, u2, texture, a);
      lliIliliIl(var17.method_60800(), var15, lilIllIIliilIllIIl, ilIllIiIll<"ilIllIiIll","wLh871T7MP7O5BxweCNrfxI5jexc8Kq3zLefyEus/Ir4VczcDUc4Nng=">());
   }

   private static float IiIlliIliiIl() {
      return lIIlllIIliIIlllIIl > 0.0F
         ? lIIlllIIliIIlllIIl
         : (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489() / (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4495();
   }

   private IliiIilliiIi() {
   }

   public static void Iliilliiilii(
      Matrix4f y, float x, float x2, float y2, float v1, float u2, float texture, float v2, float radius, class_2960 u1, float matrix
   ) {
      class_1044 var11 = ilIllIiIll.Iiiilllliiilll.method_1531().method_4619(u1);
      GpuTextureView var12 = var11.method_71659();
      ByteBuffer var13 = IIiilIiiiIii(y, x, x2, y2, v1, matrix);
      float var14 = ilIlllIIlIiIlllIIl;
      class_287 var15 = class_289.method_1348().method_60827(class_5596.field_27382, class_290.field_1575);
      var15.method_22918(y, x, v1, 0.0F).method_22913(u2, radius).method_22915(1.0F, 1.0F, 1.0F, var14);
      var15.method_22918(y, y2, v1, 0.0F).method_22913(v2, radius).method_22915(1.0F, 1.0F, 1.0F, var14);
      var15.method_22918(y, y2, x2, 0.0F).method_22913(v2, texture).method_22915(1.0F, 1.0F, 1.0F, var14);
      var15.method_22918(y, x, x2, 0.0F).method_22913(u2, texture).method_22915(1.0F, 1.0F, 1.0F, var14);
      iIiIlIliIl(
         var15.method_60800(),
         IIiIllIIllIiIllIIl,
         ilIllIiIll<"ilIllIiIll","E1bjDJRIfrL1jyxDA7DR7b9hqhd9EJh4nERPQnCVCmH5OqjauTgaCxr6OqVY7Ch6Ow==">(),
         ilIllIiIll<"ilIllIiIll","9EZnIDg0SLmbwSI/NT9QNW5UlU3cvIGNHDjlaMsnwa2qFEeJLeFS87o9">(),
         var13,
         var12,
         iIlIlllllill()
      );
   }

   private static float IIlllIlliIll() {
      return IlIlllIIlllIlllIIl > 0.0F
         ? IlIlllIIlllIlllIIl
         : (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506() / (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4495();
   }

   public static void lIlIliIlIl() {
      if (iIIillIIlIlIillIIl > 0 && --iIIillIIlIlIillIIl == 0) {
         lilIliilIl();
      }
   }

   public static void iliIiiliiiii(float body, Runnable alpha) {
      float var2 = IilliliilIIi(body);

      try {
         alpha.run();
      } finally {
         lIiiIiIlilli(var2);
      }
   }

   private static class_12137 iIlIlllllill() {
      if (iiiIllIIlIIIlllIIl == null) {
         iiiIllIIlIIIlllIIl = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.NEAREST, FilterMode.NEAREST, 1, OptionalDouble.empty());
      }

      return iiiIllIIlIIIlllIIl;
   }

   public static void IIIilIIiiIIi(
      Matrix4f y1,
      float x2,
      float sizeX,
      float glowStrength,
      float y2,
      float fill,
      float matrix,
      float r,
      float radius,
      float sizeY,
      float glowSize,
      float a,
      float g,
      float posY,
      float posX,
      float b,
      boolean x1
   ) {
      IlIillIiilIi(y1, x2, sizeX, glowStrength, y2, fill, matrix, r, radius, sizeY, glowSize, a, g, posY, posX, b, x1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public static float IIIllIIliIIl() {
      return ilIlllIIlIiIlllIIl;
   }

   public static void IllIllllIl(boolean renderPassOpen) {
      if (liilllIIliiilllIIl != 0 && !llIillIIlilIillIIl && !renderPassOpen && RenderSystem.isOnRenderThread()) {
         lilIliilIl();
      }
   }

   private static void iIiIlIliIl(
      class_9801 passName, RenderPipeline pipeline, String view, String built, ByteBuffer sampler, GpuTextureView uboName, class_12137 ubo
   ) {
      class_9801 var7 = passName;

      label70: {
         try {
            class_4574 var8 = var7.method_60822();
            illliiIillii var9 = IIlliiillIlliiil.iIlIlllllill(var7.method_60818(), pipeline.getVertexFormat().getVertexSize());
            GpuBufferSlice var10 = IIlliiillIlliiil.liiiIIllIl(sampler);
            if (iIIillIIlIlIillIIl > 0 && IIiIllIiIl(pipeline, built, var10, var9, var8.comp_751(), uboName, ubo)) {
               break label70;
            }

            class_5590 var11 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
            GpuBuffer var12 = var11.method_68274(var8.comp_751());
            class_276 var13 = ilIllIiIll.Iiiilllliiilll.method_1522();
            CommandEncoder var14 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var15 = var14.createRenderPass(() -> view, var13.method_71639(), OptionalInt.empty(), var13.method_71640(), OptionalDouble.empty());

            try {
               IIlliiillIlliiil.iliillIiil++;
               var15.setPipeline(pipeline);
               iIIiilIiIlIiilIi.IilliliilIIi(var15);
               var15.setUniform(built, var10);
               if (uboName != null) {
                  var15.bindTexture(ilIllIiIll<"ilIllIiIll","5lQeLqnpQciIVgoHTed/GH1+EsUNCYhPVaSv5zMTKHR2zHhn">(), uboName, ubo);
               }

               var15.setVertexBuffer(0, var9.IliIlllilIi());
               var15.setIndexBuffer(var12, var11.method_31924());
               var15.drawIndexed(var9.liiiIIllIl(), 0, var8.comp_751(), 1);
            } catch (Throwable var20) {
               if (var15 != null) {
                  try {
                     var15.close();
                  } catch (Throwable var19) {
                     var20.addSuppressed(var19);
                  }
               }

               throw var20;
            }

            if (var15 != null) {
               var15.close();
            }
         } catch (Throwable var21) {
            if (passName != null) {
               try {
                  var7.close();
               } catch (Throwable var18) {
                  var21.addSuppressed(var18);
               }
            }

            throw var21;
         }

         if (passName != null) {
            passName.close();
         }

         return;
      }

      if (passName != null) {
         passName.close();
      }
   }

   public static void IIlilIliiIli(
      Matrix4f alpha, float y, float w, float matrix, float blobs, float h, float count, float fade, float[] radius, float[] x, int colors
   ) {
      long var24 = 7609718769920124445L;
      long var26 = -958077674470035641L;
      long var28 = 4655664851430100665L;
      if (!(matrix <= 0.0F) && !(blobs <= 0.0F) && !(fade <= 0.0F)) {
         float var11 = 1.0F / Illlllllilll();
         var24 ^= ((long)Ililllililil(alpha) << 32 ^ var24) & -1L << 32;
         float var13 = (int)(var24 >>> 32) != 0 ? iIllllIIlIlllllIIl : 1.0F;
         float var14 = (int)(var24 >>> 32) != 0 ? llllllIIlilllllIIl : 1.0F;
         float var15 = (int)(var24 >>> 32) != 0 ? IillllIIllillllIIl : 1.0F;
         float var16 = (int)(var24 >>> 32) != 0 ? liIlllIIliiIlllIIl : 0.0F;
         float var17 = (int)(var24 >>> 32) != 0 ? IIllllIIllIllllIIl : 0.0F;
         var24 ^= ((long)Math.max(0, Math.min(6, colors)) ^ var24) & -1L >>> 32;
         ByteBuffer var19 = IIlliiillIlliiil.IliIlllilIi(240);
         var19.putFloat(0, IiIlliIliiIl());
         var19.putFloat(4, IIlllIlliIll());
         var19.putFloat(8, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4489());
         var19.putFloat(12, (float)ilIllIiIll.Iiiilllliiilll.method_22683().method_4506());
         var19.putFloat(16, y * var11 * var13 + var16);
         var19.putFloat(20, w * var11 * var14 + var17);
         var19.putFloat(24, matrix * var11 * var13);
         var19.putFloat(28, blobs * var11 * var14);
         var19.putFloat(32, h * var11 * var15);
         var19.putFloat(36, count * var11 * var15);
         var19.putFloat(40, fade > 1.0F ? 1.0F : fade);
         var19.putFloat(44, 1.0F);
         var26 ^= (0L ^ var26) & -1L << 32;

         while ((int)(var26 >>> 32) < 6) {
            var26 ^= ((long)(48 + (int)(var26 >>> 32) * 16) ^ var26) & -1L >>> 32;
            long var34 = var28 ^ ((long)(144 + (int)(var26 >>> 32) * 16) << 32 ^ var28) & -1L << 32;
            var28 = var34 ^ ((long)((int)(var26 >>> 32) < (int)var24 ? 1 : 0) ^ var34) & -1L >>> 32;
            var19.putFloat((int)var26, (int)var28 != 0 ? radius[(int)(var26 >>> 32) * 4] * var11 * var13 + var16 : 0.0F);
            var19.putFloat((int)var26 + 4, (int)var28 != 0 ? radius[(int)(var26 >>> 32) * 4 + 1] * var11 * var14 + var17 : 0.0F);
            var19.putFloat((int)var26 + 8, (int)var28 != 0 ? Math.max(1.0F, radius[(int)(var26 >>> 32) * 4 + 2] * var11 * var15) : 1.0F);
            var19.putFloat((int)var26 + 12, (int)var28 != 0 ? radius[(int)(var26 >>> 32) * 4 + 3] : 0.0F);
            var19.putFloat((int)(var28 >>> 32), (int)var28 != 0 ? x[(int)(var26 >>> 32) * 3] : 0.0F);
            var19.putFloat((int)(var28 >>> 32) + 4, (int)var28 != 0 ? x[(int)(var26 >>> 32) * 3 + 1] : 0.0F);
            var19.putFloat((int)(var28 >>> 32) + 8, (int)var28 != 0 ? x[(int)(var26 >>> 32) * 3 + 2] : 0.0F);
            var19.putFloat((int)(var28 >>> 32) + 12, 1.0F);
            var26 += 4294967296L;
         }

         IiiIlliiIl(
            iiIIllIIlIIlIllIIl, ilIllIiIll<"ilIllIiIll","9VFFoy6GBWbQYomZ7BkH9pVERe4Fh3o/TPOxnv0ZBR79ueMKxAJg">(), var19, alpha, y, w, y + matrix, w + blobs
         );
      }
   }

   private static class_12137 liiiIIllIl() {
      if (IiiIllIIlliiIllIIl == null) {
         IiiIllIIlliiIllIIl = RenderSystem.getDevice()
            .createSampler(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, 1, OptionalDouble.empty());
      }

      return IiiIllIIlliiIllIIl;
   }

   private static boolean Ililllililil(Matrix4f m) {
      float var1 = m.m00();
      float var2 = m.m11();
      float var3 = m.m30();
      float var4 = m.m31();
      if (var1 == 1.0F && var2 == 1.0F && var3 == 0.0F && var4 == 0.0F) {
         return false;
      } else if (!IIillIiliIil(m)) {
         return false;
      } else {
         float var5 = 1.0F / Illlllllilll();
         liIlllIIliiIlllIIl = var3 * var5;
         IIllllIIllIllllIIl = var4 * var5;
         iIllllIIlIlllllIIl = var1;
         llllllIIlilllllIIl = var2;
         IillllIIllillllIIl = Math.min(var1, var2);
         return true;
      }
   }

   public static void iIIIlIlIIl(GpuBuffer vertexBuffer, int indexCount, class_2960 texture) {
      if (vertexBuffer != null && indexCount > 0) {
         lilIliilIl();
         class_1044 var3 = ilIllIiIll.Iiiilllliiilll.method_1531().method_4619(texture);
         GpuTextureView var4 = var3.method_71659();
         GpuDevice var5 = RenderSystem.getDevice();
         ByteBuffer var6 = IIlliiillIlliiil.IliIlllilIi(16);
         var6.putFloat(0, IiIlliIliiIl());
         var6.putFloat(4, IIlllIlliIll());
         GpuBufferSlice var7 = IIlliiillIlliiil.liiiIIllIl(var6);
         class_5590 var8 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
         GpuBuffer var9 = var8.method_68274(indexCount);
         class_276 var10 = ilIllIiIll.Iiiilllliiilll.method_1522();
         CommandEncoder var11 = var5.createCommandEncoder();
         RenderPass var12 = var11.createRenderPass(
            () -> ilIllIiIll<"ilIllIiIll","nQhs4Gq+g2EfMDXsdnNxFT98mGD30O1uluDglk2LRiLSIc4MgXKohr2O/30Dl6dd">(),
            var10.method_71639(),
            OptionalInt.empty(),
            var10.method_71640(),
            OptionalDouble.empty()
         );

         try {
            IIlliiillIlliiil.iliillIiil++;
            var12.setPipeline(lilIllIIliilIllIIl);
            iIIiilIiIlIiilIi.IilliliilIIi(var12);
            var12.setUniform(ilIllIiIll<"ilIllIiIll","9bpWnghVmMmd/4xYhGKKuNZJgM/Qr8oTHzaUGjEF+y9Yd1UgJAmjDA==">(), var7);
            var12.bindTexture(ilIllIiIll<"ilIllIiIll","5lQeLqnpQciIVgoHTed/GH1+EsUNCYhPVaSv5zMTKHR2zHhn">(), var4, liiiIIllIl());
            var12.setVertexBuffer(0, vertexBuffer);
            var12.setIndexBuffer(var9, var8.method_31924());
            var12.drawIndexed(0, 0, indexCount, 1);
         } catch (Throwable var16) {
            if (var12 != null) {
               try {
                  var12.close();
               } catch (Throwable var15) {
                  var16.addSuppressed(var15);
               }
            }

            throw var16;
         }

         if (var12 != null) {
            var12.close();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void lilIliilIl() {
      long var10 = 8629837116067081505L;
      long var12 = 22298344557476506L;
      if (liilllIIliiilllIIl != 0 && !llIillIIlilIillIIl) {
         llIillIIlilIillIIl = true;
         boolean var17 = false /* VF: Semaphore variable */;

         try {
            var17 = true;
            class_5590 var0 = RenderSystem.getSequentialBuffer(class_5596.field_27382);
            GpuBuffer var1 = var0.method_68274(IIIillIIllIIillIIl);
            class_5595 var2 = var0.method_31924();
            CommandEncoder var3 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var4 = var3.createRenderPass(ililllIIlIiilllIIl, IiIillIIlliIillIIl, OptionalInt.empty(), iiIillIIlIIlillIIl, OptionalDouble.empty());

            try {
               RenderPipeline var5 = null;

               for (var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < liilllIIliiilllIIl; var10 += 4294967296L) {
                  llllIIliilllIIli var7 = lIilllIIliIilllIIl[(int)(var10 >>> 32)];
                  if (var7.IliillIlIi != var5) {
                     var4.setPipeline(var7.IliillIlIi);
                     var5 = var7.IliillIlIi;
                  }

                  if (var7.iIIIilIlIi) {
                     var4.enableScissor(var7.IlIIilIlIi, var7.llIIilIlIi, var7.ilIIilIlIi, var7.IiIIilIlIi);
                  } else {
                     var4.disableScissor();
                  }

                  var4.setUniform(var7.lliillIlIi, var7.iliillIlIi);
                  if (var7.IIIIilIlIi != null) {
                     var4.bindTexture(ilIllIiIll<"ilIllIiIll","5lQeLqnpQciIVgoHTed/GH1+EsUNCYhPVaSv5zMTKHR2zHhn">(), var7.IIIIilIlIi, var7.lIIIilIlIi);
                  }

                  var4.setVertexBuffer(0, var7.IiiillIlIi);
                  var4.setIndexBuffer(var1, var2);
                  var4.drawIndexed(var7.liiillIlIi, 0, var7.iiiillIlIi, 1);
               }
            } catch (Throwable var19) {
               if (var4 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var18) {
                     var19.addSuppressed(var18);
                  }
               }

               throw var19;
            }

            if (var4 != null) {
               var4.close();
               var17 = false;
            } else {
               var17 = false;
            }
         } finally {
            if (var17) {
               for (long var23 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var23 >>> 32) < liilllIIliiilllIIl; var23 += 4294967296L) {
                  lIilllIIliIilllIIl[(int)(var23 >>> 32)].IliIlllilIi();
               }

               liilllIIliiilllIIl = 0;
               IIIillIIllIIillIIl = 0;
               IiIillIIlliIillIIl = null;
               iiIillIIlIIlillIIl = null;
               llIillIIlilIillIIl = false;
            }
         }

         for (long var22 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var22 < liilllIIliiilllIIl; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            lIilllIIliIilllIIl[(int)var22].IliIlllilIi();
         }

         liilllIIliiilllIIl = 0;
         IIIillIIllIIillIIl = 0;
         IiIillIIlliIillIIl = null;
         iiIillIIlIIlillIIl = null;
         llIillIIlilIillIIl = false;
      }
   }

   private static void lliIliliIl(class_9801 pipeline, GpuTextureView passName, RenderPipeline view, String built) {
      ByteBuffer var4 = IIlliiillIlliiil.IliIlllilIi(16);
      var4.putFloat(0, IiIlliIliiIl());
      var4.putFloat(4, IIlllIlliIll());
      iIiIlIliIl(pipeline, view, built, ilIllIiIll<"ilIllIiIll","9bpWnghVmMmd/4xYhGKKuNZJgM/Qr8oTHzaUGjEF+y9Yd1UgJAmjDA==">(), var4, passName, liiiIIllIl());
   }
}
