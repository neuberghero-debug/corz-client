package gg.corz;

import net.minecraft.class_1007;
import net.minecraft.class_11659;
import net.minecraft.class_12249;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1664;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_7920;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix4f;

public final class IIililIili {
   private static Matrix4f[] lliiiIIliliiiIIl;
   private static lIIiilIliIIiilIl iIiiiIIlIliiiIIl;
   private static final float IIiiiIIllIiiiIIl = 1.0E-10F;

   private IIililIili() {
   }

   private static boolean iliIiiliiiii(
      lIIiilIliIIiilIl bones, Matrix4f[] queue, class_4587 finish, class_11659 model, int light, lllIlIlillIlIl matrices, boolean glint
   ) {
      int var7 = lIiiiIiiIiiiIi.IlilIliiillilIliii.length;
      IIIiIllllIIiIlll[] var8 = new IIIiIllllIIiIlll[var7];
      iIiiliIiIliiliIi[] var9 = new iIiiliIiIliiliIi[var7];

      for (int var10 = 0; var10 < var7; var10++) {
         var8[var10] = IIIiIllllIIiIlll.iliIiiliiiii(lIiiiIiiIiiiIi.IlilIliiillilIliii[var10]);
         var9[var10] = matrices.IliIlllilIi(var10);
         if (var8[var10] == null || !var8[var10].Iiilliiliiil(var9[var10]) || lIiiiIiiIiiiIi.IilliliilIIi(bones, var10) < 0) {
            return false;
         }
      }

      Matrix4f[] var18 = lIiiIiIlilli(bones);

      for (int var11 = 0; var11 < var7; var11++) {
         int var12 = lIiiiIiiIiiiIi.IilliliilIIi(bones, var11);
         if (var18[var11] != null && !(Math.abs(queue[var12].determinant3x3()) < 1.0E-10F)) {
            IIIiIllllIIiIlll var13 = var8[var11];
            iIiiliIiIliiliIi var14 = var9[var11];
            finish.method_22903();

            try {
               finish.method_34425(new Matrix4f(queue[var12]).mul(var18[var11]));
               model.method_73483(
                  finish, matrices.llIlIIIllilIlIIIll, (lightx, entry) -> var13.IIIilIIiiIIi(lightx, entry, light, class_4608.field_21444, var14)
               );
               if (matrices.liiiIIllIl(var11)) {
                  model.method_73529(1).method_73483(finish, matrices.IiIlIIIllliIlIIIll, (mesh, skin) -> var13.IlIillIiilIi(mesh, skin, var14));
               }

               if (glint) {
                  model.method_73483(finish, class_12249.method_75997(), (vc, lightx) -> var13.Ililllililil(vc, lightx, light, class_4608.field_21444));
               }
            } finally {
               finish.method_22909();
            }
         }
      }

      return true;
   }

   public static void iIlIlllllill(class_742 light, class_4587 matrices, class_11659 glint, int finish, lIIllIiiIIllIi player, boolean queue) {
      float[] var6 = lliIIililiIIil.IIIilIIiiIIi();
      liIlIiliiIlIil var7 = lliIIililiIIil.Illlllllilll();
      if (var7 != null && var6 != null) {
         lIIiilIliIIiilIl var8 = var7.liiiIIllIl();
         Matrix4f[] var9 = var8.Iilllilliill();
         var8.IIillIiliIil(var6, var9);
         matrices.method_22903();

         try {
            boolean var10 = light.method_6068() == class_1306.field_6182;
            if (var10) {
               matrices.method_22905(-1.0F, 1.0F, 1.0F);
            }

            matrices.method_34425(var8.IIIIiilIll);
            lllIlIlillIlIl var11 = var7.IliIlllilIi().IliIlllilIi() ? iiiIIlllIIIlIlll.liiiIIllIl(illIIlllIilIIlll.iiIIIIIill, player) : null;
            if (var11 == null || !iliIiiliiiii(var8, var9, matrices, glint, finish, var11, queue)) {
               class_1921 var12 = IilliliilIIi(var7);
               glint.method_73483(matrices, var12, (vc, entry) -> IIIllIIliIIl(var8, var9, vc, entry, finish, -1, class_4608.field_21444));
               if (queue) {
                  glint.method_73483(
                     matrices, class_12249.method_75997(), (lightx, model) -> IIIllIIliIIl(var8, var9, lightx, model, finish, -1, class_4608.field_21444)
                  );
               }
            }

            if (light.method_5767()) {
               return;
            }

            class_1007 var26 = class_310.method_1551().method_1561().method_74405(light);
            class_2960 var13 = light.method_52814().comp_1626().comp_3627();
            boolean var14 = light.method_52814().comp_1629() == class_7920.field_41122;

            for (int var15 = 0; var15 < var8.liiililIll.length; var15++) {
               int var16 = var8.liiililIll[var15].iliIiiliiiii();
               if (var16 != 0 && !(Math.abs(var9[var15].determinant3x3()) < 1.0E-10F) && (var16 >= 0 || light.method_6079().method_7960())) {
                  matrices.method_22903();

                  try {
                     matrices.method_34425(var9[var15]);
                     float[] var17 = var8.liiililIll[var15].IIIllIIliIIl();
                     if (var17 != null && !var7.IliIlllilIi().IliIlllilIi()) {
                        matrices.method_46416(var17[0] - (float)var16 * (var14 ? 5.5F : 6.0F) / 16.0F, var17[1], var17[2]);
                     }

                     matrices.method_22907(class_7833.field_40718.rotationDegrees(180.0F));
                     if (var10) {
                        matrices.method_22905(-1.0F, 1.0F, 1.0F);
                        var16 = -var16;
                     }

                     if (var16 > 0) {
                        var26.method_4220(matrices, glint, finish, var13, light.method_74091(class_1664.field_7570));
                     } else {
                        var26.method_4221(matrices, glint, finish, var13, light.method_74091(class_1664.field_7568));
                     }
                  } finally {
                     matrices.method_22909();
                  }
               }
            }
         } finally {
            matrices.method_22909();
         }
      }
   }

   public static void liiiIIllIl(class_742 player, class_4587 light, class_11659 queue, int matrices) {
      iIlIlllllill(player, light, queue, matrices, null, false);
   }

   public static boolean IliIlllilIi(class_742 stack, class_1268 player, class_1799 hand) {
      class_310 var3 = class_310.method_1551();
      if (stack != null
         && stack == var3.field_1724
         && var3.method_1560() == stack
         && var3.field_1690.method_31044().method_31034()
         && iIiIiliIliIili.liiiIIllIl()
         && player == class_1268.field_5808
         && hand != null
         && hand.method_31573(class_3489.field_42611)
         && stack.method_5805()
         && !stack.method_7325()
         && !stack.method_6115()
         && !stack.method_6123()) {
         iiIiliiIIlilii var4 = iIiIiliIliIili.IilliliilIIi(stack, hand);
         if (var4 == null) {
            return false;
         } else {
            iIllliIlllli.iIlIlllllill(var4);
            return iIllliIlllli.iliIiiliiiii(var4) != null;
         }
      } else {
         return false;
      }
   }

   static void IIIllIIliIIl(lIIiilIliIIiilIl color, Matrix4f[] root, class_4665 model, class_4588 bones, int out, int light, int overlay) {
      class_4587 var7 = new class_4587();
      var7.method_23760().method_66521(model);

      for (int var8 = 0; var8 < root.length; var8++) {
         float[] var9 = color.liiililIll[var8].lIiiIiIlilli();
         if (var9.length != 0 && !(Math.abs(root[var8].determinant3x3()) < 1.0E-10F)) {
            var7.method_22903();
            var7.method_34425(root[var8]);
            class_4665 var10 = var7.method_23760();

            for (byte var11 = 0; var11 < var9.length; var11 += 8) {
               bones.method_56824(var10, var9[var11], var9[var11 + 1], var9[var11 + 2])
                  .method_39415(light)
                  .method_22913(var9[var11 + 3], var9[var11 + 4])
                  .method_22922(overlay)
                  .method_60803(out)
                  .method_60831(var10, var9[var11 + 5], var9[var11 + 6], var9[var11 + 7]);
            }

            var7.method_22909();
         }
      }
   }

   static Matrix4f[] lIiiIiIlilli(lIIiilIliIIiilIl model) {
      if (iIiiiIIlIliiiIIl != model || lliiiIIliliiiIIl == null) {
         lliiiIIliliiiIIl = lIiiiIiiIiiiIi.IIIllIIliIIl(model);
         iIiiiIIlIliiiIIl = model;
      }

      return lliiiIIliliiiIIl;
   }

   static class_1921 IilliliilIIi(liIlIiliiIlIil asset) {
      return asset.IilliliilIIi() != null
         ? IlIlIlllllIlIlll.IliIlllilIi(asset.iIlIlllllill(), asset.IilliliilIIi())
         : class_12249.method_75994(asset.iIlIlllllill());
   }
}
