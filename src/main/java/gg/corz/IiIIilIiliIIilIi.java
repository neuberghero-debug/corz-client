package gg.corz;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntToDoubleFunction;
import net.minecraft.class_11659;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_7833;

public final class IiIIilIiliIIilIi {
   static final int iilliIlIIi = 120;
   private static final iiIiiiIlIIliiiIl iIiliIlIIi = new iiIiiiIlIIliiiIl();
   private static final Map<illIIlllIilIIlll, IiIIIilliIIIil> IIiliIlIIi = new HashMap<>();
   private static final float[] lIiliIlIIi = new float[3];

   static IiIIIilliIIIil IilliliilIIi(illIIlllIilIIlll knife, String rig) {
      if (knife != null && IIIiIllllIIiIlll.IIIllIIliIIl(knife)) {
         IiIIIilliIIIil var2 = IIiliIlIIi.get(knife);
         if (var2 != null) {
            return var2;
         } else {
            var2 = lIiiIiIlilli(knife, IIlllIIilIlllIIi.IIililIili(rig));
            IIiliIlIIi.put(knife, var2);
            return var2;
         }
      } else {
         return null;
      }
   }

   public static boolean iIlIlllllill(String knife, lIIllIiiIIllIi finish) {
      if (finish != null && !finish.IliIlllilIi()) {
         illIIlllIilIIlll var2 = illIIlllIilIIlll.IIIllIIliIIl(knife);
         return var2 == null || iiiIIlllIIIlIlll.liiiIIllIl(var2, finish) != null;
      } else {
         return true;
      }
   }

   static IiIIIilliIIIil iliIiiliiiii(illIIlllIilIIlll parts, float[][] rig, iliiiIiiii clip) {
      float[] var3 = new float[3];
      IntToDoubleFunction var4 = ch -> 0.0;
      float var5 = Float.MAX_VALUE;
      float var6 = Float.MAX_VALUE;
      float var7 = Float.MAX_VALUE;
      float var8 = -Float.MAX_VALUE;
      float var9 = -Float.MAX_VALUE;
      float var10 = -Float.MAX_VALUE;

      for (int var11 = 0; var11 < rig.length; var11++) {
         parts.IIlllIlliIll(var11, var4, var3);
         float var12 = (float)Math.cos(Math.toRadians((double)var3[0]));
         float var13 = (float)Math.sin(Math.toRadians((double)var3[0]));
         float[] var14 = rig[var11];

         for (byte var15 = 0; var15 < var14.length; var15 += 3) {
            float var16 = var12 * var14[var15] - var13 * var14[var15 + 1] + var3[1];
            float var17 = var13 * var14[var15] + var12 * var14[var15 + 1] + var3[2];
            float var18 = var14[var15 + 2];
            var5 = Math.min(var5, var16);
            var8 = Math.max(var8, var16);
            var6 = Math.min(var6, var17);
            var9 = Math.max(var9, var17);
            var7 = Math.min(var7, var18);
            var10 = Math.max(var10, var18);
         }
      }

      float var25 = (var5 + var8) / 2.0F;
      float var26 = (var6 + var9) / 2.0F;
      float var27 = (var7 + var10) / 2.0F;
      float var28 = 0.0F;
      iiIiiiIlIIliiiIl var29 = new iiIiiiIlIIliiiIl();
      var29.liilIiIlll = clip;

      for (int var30 = 0; var30 <= (clip == null ? 0 : 120); var30++) {
         var29.iiilIiIlll = (float)var30 / 120.0F;

         for (int var31 = 0; var31 < rig.length; var31++) {
            parts.IIlllIlliIll(var31, var29, var3);
            float var32 = (float)Math.cos(Math.toRadians((double)var3[0]));
            float var19 = (float)Math.sin(Math.toRadians((double)var3[0]));
            float[] var20 = rig[var31];

            for (byte var21 = 0; var21 < var20.length; var21 += 3) {
               float var22 = var32 * var20[var21] - var19 * var20[var21 + 1] + var3[1] - var25;
               float var23 = var19 * var20[var21] + var32 * var20[var21 + 1] + var3[2] - var26;
               float var24 = var20[var21 + 2] - var27;
               var28 = Math.max(var28, var22 * var22 + var23 * var23 + var24 * var24);
            }
         }
      }

      return new IiIIIilliIIIil(var25, var26, var27, Math.max(0.001F, (float)Math.sqrt((double)var28)));
   }

   public static boolean IIIllIIliIIl(
      class_4587 light, class_11659 knife, String queue, lIIllIiiIIllIi p, iliiiIiiii clip, float spin, boolean finish, int matrices
   ) {
      illIIlllIilIIlll var8 = illIIlllIilIIlll.IIIllIIliIIl(queue);
      IiIIIilliIIIil var9 = IilliliilIIi(var8, queue);
      if (var9 == null) {
         return false;
      } else {
         iIiliIlIIi.liilIiIlll = clip;
         iIiliIlIIi.iiilIiIlll = Math.max(0.0F, Math.min(1.0F, spin));
         lllIlIlillIlIl var10 = iiiIIlllIIIlIlll.liiiIIllIl(var8, p);
         light.method_22903();

         try {
            if (finish && clip != null) {
               light.method_22907(class_7833.field_40718.rotationDegrees((float)iIiliIlIIi.applyAsDouble(11)));
               light.method_22907(class_7833.field_40714.rotationDegrees((float)iIiliIlIIi.applyAsDouble(13)));
               light.method_22907(class_7833.field_40716.rotationDegrees((float)(-iIiliIlIIi.applyAsDouble(12))));
            }

            light.method_46416(-var9.IliIlllilIi(), -var9.liiiIIllIl(), -var9.iIlIlllllill());

            for (int var11 = 0; var11 < var8.IlIlllIlilIl(); var11++) {
               IIIiIllllIIiIlll var12 = IIIiIllllIIiIlll.iliIiiliiiii(var8.IiIlliIliiIl(var11).IliIlllilIi());
               if (var12 != null) {
                  var8.IIlllIlliIll(var11, iIiliIlIIi, lIiliIlIIi);
                  light.method_22903();

                  try {
                     light.method_46416(lIiliIlIIi[1], lIiliIlIIi[2], 0.0F);
                     light.method_22907(class_7833.field_40718.rotationDegrees(lIiliIlIIi[0]));
                     iIiiliIiIliiliIi var13 = var10 != null ? var10.IliIlllilIi(var11) : null;
                     if (var13 != null && var12.Iiilliiliiil(var13)) {
                        knife.method_73483(
                           light, var10.llIlIIIllilIlIIIll, (lightx, entry) -> var12.IIIilIIiiIIi(lightx, entry, matrices, class_4608.field_21444, var13)
                        );
                        if (var10.liiiIIllIl(var11)) {
                           knife.method_73529(1).method_73483(light, var10.IiIlIIIllliIlIIIll, (skin, vc) -> var12.IlIillIiilIi(skin, vc, var13));
                        }
                     } else {
                        knife.method_73483(
                           light, IIIiIllllIIiIlll.Illlllllilll(), (entry, vc) -> var12.Ililllililil(entry, vc, matrices, class_4608.field_21444)
                        );
                     }
                  } finally {
                     light.method_22909();
                  }
               }
            }
         } finally {
            light.method_22909();
         }

         return true;
      }
   }

   public static boolean IliIlllilIi(String knife) {
      illIIlllIilIIlll var1 = illIIlllIilIIlll.IIIllIIliIIl(knife);
      return var1 != null && var1 != illIIlllIilIIlll.liIIIIIill && IIIiIllllIIiIlll.IIIllIIliIIl(var1);
   }

   static IiIIIilliIIIil lIiiIiIlilli(illIIlllIilIIlll rig, iliiiIiiii clip) {
      float[][] var2 = new float[rig.IlIlllIlilIl()][];

      for (int var3 = 0; var3 < rig.IlIlllIlilIl(); var3++) {
         var2[var3] = IIIiIllllIIiIlll.iliIiiliiiii(rig.IiIlliIliiIl(var3).IliIlllilIi()).lIIiiIIill;
      }

      return iliIiiliiiii(rig, var2, clip);
   }

   private IiIIilIiliIIilIi() {
   }

   public static float liiiIIllIl(String knife) {
      IiIIIilliIIIil var1 = IilliliilIIi(illIIlllIilIIlll.IIIllIIliIIl(knife), knife);
      return var1 == null ? 8.0F : var1.IilliliilIIi();
   }
}
