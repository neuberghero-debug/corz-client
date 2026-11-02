package gg.corz;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import java.util.List;
import net.minecraft.class_1059;
import net.minecraft.class_10799;
import net.minecraft.class_1087;
import net.minecraft.class_10889;
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_5611;
import net.minecraft.class_5819;
import net.minecraft.class_777;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.joml.Vector3fc;

public final class lilIiIliilIiIl {
   private static final class_2350[] iIiIlIillIliIlIill = new class_2350[]{
      class_2350.field_11033, class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034, null
   };
   private static class_1087 IlIllIillllIllIill;
   private static final class_1921 iiiIlIillIIIllIill = class_1921.method_75940(
      IilliliilIIi<"IilliliilIIi","HLUh99iBLV/rhkAMBvxlFZkhSD/Pye4021oBxkDP0Jiy/+7WRx+Kf1VlyeDfSzc=">(),
      class_12247.method_75927(lilIiIliilIiIl.IiiIlIillliiIlIill)
         .method_75934(IilliliilIIi<"IilliliilIIi","Q3uYWVpkzU1dCpUIOzI0Kgy4lx3l7dslDeNRKwy5yYCZAhDr">(), class_1059.field_5275)
         .method_75938()
   );
   private static float[] ilIllIillIiIllIill = new float[0];
   private static final RenderPipeline IiiIlIillliiIlIill = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
         .withLocation(
            class_2960.method_60655(
               IilliliilIIi<"IilliliilIIi","AnAFgyl1X1/yF5hMN94VV/31B+NJMRMQTpjfvs+1R7EPkoGx0u8=">(),
               IilliliilIIi<"IilliliilIIi","SdfNyTJ+iuUfGZTU25wRpSg8Kcsrj3u3vOAx/XOFESTfb9deDiI5UdhAuS8oFK6GEyck">()
            )
         )
         .withCull(true)
         .withDepthWrite(false)
         .build()
   );
   private static final class_2680 lliIlIilliliIlIill = class_2246.field_22109.method_9564();
   private static final float[] IIiIlIilllIiIlIill = new float[]{0.55F, 1.0F, 0.82F, 0.82F, 0.68F, 0.68F};
   private static final int lilIlIilliilIlIill = 6;
   private static class_4598 lIIllIilliIIllIill;

   public static int IliIlllilIi(List<class_2338> alpha, int blocks) {
      if (alpha.isEmpty()) {
         return 0;
      } else {
         float[] var2 = iIlIlllllill();
         if (var2.length == 0) {
            return 0;
         } else {
            Matrix4f var3 = iIiiIIilIliiIIil.IIillIiliIil();
            class_4598 var4 = liiiIIllIl();
            class_4588 var5 = var4.method_73477(iiiIlIillIIIllIill);
            int var6 = Math.max(0, Math.min(255, blocks)) << 24;
            int var7 = 0;

            for (int var8 = alpha.size() - 1; var8 >= 0; var8--) {
               class_2338 var9 = (class_2338)alpha.get(var8);
               if (!iIiiIIilIliiIIil.IlIillIiilIi((double)var9.method_10263() + 0.5, (double)var9.method_10264() + 0.5, (double)var9.method_10260() + 0.5, 1.0F)
                  )
                {
                  float var10 = iIiiIIilIliiIIil.Ililllililil((double)var9.method_10263());
                  float var11 = iIiiIIilIliiIIil.Iiilliiliiil((double)var9.method_10264());
                  float var12 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)var9.method_10260());

                  for (byte var13 = 0; var13 < var2.length; var13 += 6) {
                     int var14 = Math.round(255.0F * var2[var13 + 5]);
                     var5.method_22918(var3, var10 + var2[var13], var11 + var2[var13 + 1], var12 + var2[var13 + 2])
                        .method_22913(var2[var13 + 3], var2[var13 + 4])
                        .method_39415(var6 | var14 << 16 | var14 << 8 | var14);
                  }

                  var7++;
               }
            }

            var4.method_22994(iiiIlIillIIIllIill);
            return var7;
         }
      }
   }

   private static class_4598 liiiIIllIl() {
      if (lIIllIilliIIllIill == null) {
         lIIllIilliIIllIill = class_4597.method_22991(new class_9799(((1180755437 ^ -65) << 31 | (1180755437 ^ -65) >>> 1) ^ 1556843817));
      }

      return lIIllIilliIIllIill;
   }

   private lilIiIliilIiIl() {
   }

   private static float[] iIlIlllllill() {
      class_1087 var0 = class_310.method_1551().method_1541().method_3349(lliIlIilliliIlIill);
      if (var0 == null) {
         return new float[0];
      } else if (var0 == IlIllIillllIllIill) {
         return ilIllIillIiIllIill;
      } else {
         List var1 = var0.method_68512(class_5819.method_43049(42L));
         int var2 = 0;

         for (class_10889 var4 : var1) {
            for (class_2350 var8 : iIiIlIillIliIlIill) {
               var2 += var4.method_68509(var8).size();
            }
         }

         float[] var18 = new float[var2 * 4 * 6];
         int var19 = 0;

         for (class_10889 var26 : var1) {
            for (class_2350 var10 : iIiIlIillIliIlIill) {
               for (class_777 var12 : var26.method_68509(var10)) {
                  float var13 = var12.comp_3725() && var12.comp_3723() != null ? IIiIlIilllIiIlIill[var12.comp_3723().ordinal()] : 1.0F;

                  for (int var14 = 0; var14 < 4; var14++) {
                     Vector3fc var15 = var12.method_76648(var14);
                     long var16 = var12.method_76649(var14);
                     var18[var19++] = var15.x();
                     var18[var19++] = var15.y();
                     var18[var19++] = var15.z();
                     var18[var19++] = class_5611.method_76641(var16);
                     var18[var19++] = class_5611.method_76642(var16);
                     var18[var19++] = var13;
                  }
               }
            }
         }

         IlIllIillllIllIill = var0;
         ilIllIillIiIllIill = var18;
         return var18;
      }
   }
}
