package com.corz.client.mixins;

import gg.corz.IIIiIllllIIiIlll;
import gg.corz.IIlllIIilIlllIIi;
import gg.corz.IilliiIllilliiIl;
import gg.corz.IlIliIlllIliIl;
import gg.corz.IlllIIllllllIIll;
import gg.corz.iIiIIIilIliIIIil;
import gg.corz.iIiiliIiIliiliIi;
import gg.corz.iiiIIlllIIIlIlll;
import gg.corz.illIIlllIilIIlll;
import gg.corz.llilIllililIll;
import gg.corz.lllIlIlillIlIl;
import java.lang.reflect.Method;
import java.util.function.IntToDoubleFunction;
import net.minecraft.class_11659;
import net.minecraft.class_12249;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_1839;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import net.minecraft.class_7833;
import net.minecraft.class_7920;
import net.minecraft.class_811;
import net.minecraft.class_898;
import net.minecraft.class_9334;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_759.class})
public abstract class MixinHeldItemRenderer {
   @Shadow
   private class_1799 field_4048;
   @Shadow
   @Final
   private class_898 field_4046;
   @Unique
   private Matrix4f corz$knifeCorrection;
   @Unique
   private class_4665 corz$knifeArmEntry;
   @Unique
   private static Method corz$applySwingTransformsMethod;
   @Unique
   private static Method corz$applyUseTransformsMethod;
   @Unique
   private static boolean corz$lancingResolved;

   @Shadow
   public abstract void method_3233(class_1309 var1, class_1799 var2, class_811 var3, class_4587 var4, class_11659 var5, int var6);

   @Shadow
   protected abstract void method_65816(float var1, class_4587 var2, int var3, class_1306 var4);

   @Shadow
   protected abstract void method_3224(class_4587 var1, class_1306 var2, float var3);

   @Shadow
   protected abstract void method_3218(class_4587 var1, float var2, class_1306 var3, class_1799 var4, class_1657 var5);

   @Shadow
   protected abstract void method_49340(class_4587 var1, float var2, class_1306 var3, class_1657 var4);

   @Shadow
   protected abstract void method_3231(class_4587 var1, class_11659 var2, int var3, float var4, float var5, float var6);

   @Shadow
   protected abstract void method_3222(class_4587 var1, class_11659 var2, int var3, float var4, class_1306 var5, float var6, class_1799 var7);

   @Shadow
   protected abstract void method_3219(class_4587 var1, class_11659 var2, int var3, float var4, float var5, class_1306 var6);

   @Inject(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = {@At("HEAD")}
   )
   private void corz$beforeHands(float tickProgress, class_4587 matrices, class_11659 queue, class_746 player, int light, CallbackInfo ci) {
      IilliiIllilliiIl.IliIlllilIi().Iiiiliiiiiii();
   }

   @Inject(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = {@At("TAIL")}
   )
   private void corz$afterHands(float tickProgress, class_4587 matrices, class_11659 queue, class_746 player, int light, CallbackInfo ci) {
      IilliiIllilliiIl renderer = IilliiIllilliiIl.IliIlllilIi();
      renderer.IIIIllIIIl();
      renderer.iIIIlIlIIl();
   }

   @Inject(
      method = {"method_3219(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;IFFLnet/minecraft/class_1306;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1007;method_4220(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;Z)V"
      )}
   )
   private void corz$knifeRightArm(class_4587 matrices, class_11659 queue, int light, float equipProgress, float swingProgress, class_1306 arm, CallbackInfo ci) {
      this.corz$poseKnifeArm(matrices);
   }

   @Inject(
      method = {"method_3219(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;IFFLnet/minecraft/class_1306;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1007;method_4221(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;Z)V"
      )}
   )
   private void corz$knifeLeftArm(class_4587 matrices, class_11659 queue, int light, float equipProgress, float swingProgress, class_1306 arm, CallbackInfo ci) {
      this.corz$poseKnifeArm(matrices);
   }

   @Unique
   private void corz$poseKnifeArm(class_4587 matrices) {
      if (this.corz$knifeCorrection != null) {
         matrices.method_34425(this.corz$knifeCorrection);
         this.corz$knifeArmEntry = matrices.method_23760().method_56822();
      }
   }

   @Unique
   private boolean corz$renderKnifeInHand(
      IIlllIIilIlllIIi si,
      illIIlllIilIIlll rig,
      class_742 player,
      class_1306 arm,
      class_1799 item,
      float swingProgress,
      float equipProgress,
      class_4587 matrices,
      class_11659 queue,
      int light
   ) {
      boolean meshes = IIIiIllllIIiIlll.IIIllIIliIIl(rig);
      if (!meshes && !si.ilIIiIiIIi(rig)) {
         return false;
      } else {
         int side = arm == class_1306.field_6183 ? 1 : -1;
         IntToDoubleFunction ch = iIiIIIilIliIIIil.iliIiiliiiii(si.lIliliIlil(swingProgress), (double)swingProgress);
         this.corz$knifeCorrection = corz$matrix(iIiIIIilIliIIIil.liiiIIllIl(side, ch));
         this.corz$knifeArmEntry = null;
         matrices.method_22903();

         try {
            this.method_3219(matrices, queue, light, equipProgress, 0.0F, arm);
         } finally {
            matrices.method_22909();
            this.corz$knifeCorrection = null;
         }

         class_4665 armEntry = this.corz$knifeArmEntry;
         this.corz$knifeArmEntry = null;
         if (armEntry == null) {
            return false;
         } else {
            matrices.method_22903();

            try {
               matrices.method_23760().method_66521(armEntry);
               ((class_591)this.field_4046.method_74405(player).method_4038()).method_2808(arm).method_22703(matrices);
               matrices.method_34425(corz$matrix(iIiIIIilIliIIIil.IilliliilIIi(side, 0.48, ch, player.method_52814().comp_1629() == class_7920.field_41122)));
               float[] pose = new float[3];
               class_811 ctx = arm == class_1306.field_6183 ? class_811.field_4322 : class_811.field_4321;
               lllIlIlillIlIl finish = meshes ? iiiIIlllIIIlIlll.liiiIIllIl(rig, IlIliIlllIliIl.IIIllIIliIIl(si.IlIIillIIi())) : null;

               for (int i = 0; i < rig.IlIlllIlilIl(); i++) {
                  matrices.method_22903();

                  try {
                     rig.IIlllIlliIll(i, ch, pose);
                     matrices.method_46416(pose[1], pose[2], 0.0F);
                     matrices.method_22907(class_7833.field_40718.rotationDegrees(pose[0]));
                     IIIiIllllIIiIlll mesh = meshes ? IIIiIllllIIiIlll.iliIiiliiiii(rig.IiIlliIliiIl(i).IliIlllilIi()) : null;
                     iIiiliIiIliiliIi skin = finish != null ? finish.IliIlllilIi(i) : null;
                     if (mesh != null && mesh.Iiilliiliiil(skin)) {
                        queue.method_73483(
                           matrices, finish.llIlIIIllilIlIIIll, (entry, vc) -> mesh.IIIilIIiiIIi(entry, vc, light, class_4608.field_21444, skin)
                        );
                        if (finish.liiiIIllIl(i)) {
                           queue.method_73529(1).method_73483(matrices, finish.IiIlIIIllliIlIIIll, (entry, vc) -> mesh.IlIillIiilIi(entry, vc, skin));
                        }

                        if (item.method_7958()) {
                           queue.method_73483(matrices, class_12249.method_75997(), (entry, vc) -> mesh.Ililllililil(entry, vc, light, class_4608.field_21444));
                        }
                     } else if (mesh != null) {
                        queue.method_73483(
                           matrices, IIIiIllllIIiIlll.Illlllllilll(), (entry, vc) -> mesh.Ililllililil(entry, vc, light, class_4608.field_21444)
                        );
                        if (item.method_7958()) {
                           queue.method_73483(matrices, class_12249.method_75997(), (entry, vc) -> mesh.Ililllililil(entry, vc, light, class_4608.field_21444));
                        }
                     } else {
                        matrices.method_46416(8.0F, 8.0F, 8.0F);
                        matrices.method_22905(16.0F, 16.0F, 16.0F);
                        this.method_3233(player, si.liIIiiiIIi(item, rig, i), ctx, matrices, queue, light);
                     }
                  } finally {
                     matrices.method_22909();
                  }
               }
            } finally {
               matrices.method_22909();
            }

            return true;
         }
      }
   }

   @Unique
   private static Matrix4f corz$matrix(double[] m) {
      return new Matrix4f(
         (float)m[0],
         (float)m[4],
         (float)m[8],
         (float)m[12],
         (float)m[1],
         (float)m[5],
         (float)m[9],
         (float)m[13],
         (float)m[2],
         (float)m[6],
         (float)m[10],
         (float)m[14],
         (float)m[3],
         (float)m[7],
         (float)m[11],
         (float)m[15]
      );
   }

   @Unique
   private IlllIIllllllIIll corz$handCustomer() {
      return (IlllIIllllllIIll)llilIllililIll.iliIiiliiiii(IlllIIllllllIIll.class);
   }

   @Inject(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corz$renderFirstPersonItem(
      class_742 player,
      float tickProgress,
      float pitch,
      class_1268 hand,
      float swingProgress,
      class_1799 item,
      float equipProgress,
      class_4587 matrices,
      class_11659 orderedRenderCommandQueue,
      int light,
      CallbackInfo ci
   ) {
      IIlllIIilIlllIIi si = (IIlllIIilIlllIIi)llilIllililIll.iliIiiliiiii(IIlllIIilIlllIIi.class);
      if (si != null && si.IIiillIiil(player, hand, item)) {
         si.lliililiil(player, item, matrices, orderedRenderCommandQueue, light);
         ci.cancel();
      } else {
         if (si != null && !player.method_31550() && !player.method_5767()) {
            illIIlllIilIIlll rig = si.IiIilliIil(player, hand, item);
            if (rig != null && (rig != illIIlllIilIIlll.liIIIIIill || si.iIiilIliil()) && (!player.method_6115() || player.method_6058() != hand)) {
               class_1306 kArm = player.method_6068();
               if (this.corz$renderKnifeInHand(si, rig, player, kArm, item, swingProgress, equipProgress, matrices, orderedRenderCommandQueue, light)) {
                  ci.cancel();
                  return;
               }
            }
         }

         if (si != null && si.IilIililIi(hand, item) && !player.method_31550()) {
            ci.cancel();
            class_1306 iArm = hand == class_1268.field_5808 ? player.method_6068() : player.method_6068().method_5928();
            int iSide = iArm == class_1306.field_6183 ? 1 : -1;
            matrices.method_22903();
            si.llIliilIli(matrices, iSide, iArm);
            if (!player.method_5767()) {
               matrices.method_22903();
               si.IiIliliIli(matrices, iSide, iArm);
               this.method_3219(matrices, orderedRenderCommandQueue, light, equipProgress, 0.0F, iArm);
               matrices.method_22909();
            }

            this.method_3224(matrices, iArm, equipProgress);
            si.iiIliIIlli(matrices, iSide, iArm);
            si.lIlliiIlli(matrices, iSide, iArm);
            this.method_3233(
               player, item, iArm == class_1306.field_6183 ? class_811.field_4322 : class_811.field_4321, matrices, orderedRenderCommandQueue, light
            );
            matrices.method_22909();
         } else {
            IlllIIllllllIIll hc = this.corz$handCustomer();
            if (hc != null && hc.iiiIlIIIll()) {
               if (!player.method_31550()) {
                  ci.cancel();
                  this.corz$renderFirstPersonItemInternal(
                     hc, player, tickProgress, pitch, hand, swingProgress, item, equipProgress, matrices, orderedRenderCommandQueue, light
                  );
               }
            }
         }
      }
   }

   @Unique
   private void corz$renderFirstPersonItemInternal(
      IlllIIllllllIIll hc,
      class_742 player,
      float tickProgress,
      float pitch,
      class_1268 hand,
      float swingProgress,
      class_1799 item,
      float equipProgress,
      class_4587 matrices,
      class_11659 orderedRenderCommandQueue,
      int light
   ) {
      boolean isMainHand = hand == class_1268.field_5808;
      class_1306 arm = isMainHand ? player.method_6068() : player.method_6068().method_5928();
      matrices.method_22903();
      if (item.method_7960()) {
         if (hc.iiiIlIIIll()) {
            hc.lIIlliIIll(matrices, arm);
         }

         if (isMainHand && !player.method_5767()) {
            this.method_3219(matrices, orderedRenderCommandQueue, light, equipProgress, swingProgress, arm);
         }
      } else if (item.method_57826(class_9334.field_49646)) {
         if (hc.iiiIlIIIll()) {
            hc.lIIlliIIll(matrices, arm);
         }

         if (isMainHand && this.field_4048.method_7960()) {
            this.method_3231(matrices, orderedRenderCommandQueue, light, pitch, equipProgress, swingProgress);
         } else {
            this.method_3222(matrices, orderedRenderCommandQueue, light, equipProgress, arm, swingProgress, item);
         }
      } else if (item.method_31574(class_1802.field_8399)) {
         if (hc.iiiIlIIIll()) {
            hc.lIIlliIIll(matrices, arm);
         }

         this.method_3224(matrices, arm, equipProgress);
         boolean isCharged = class_1764.method_7781(item);
         boolean isRightArm = arm == class_1306.field_6183;
         int i = isRightArm ? 1 : -1;
         if (player.method_6115() && player.method_6014() > 0 && player.method_6058() == hand && !isCharged) {
            matrices.method_46416((float)i * -0.4785682F, -0.094387F, 0.05731531F);
            matrices.method_22907(class_7833.field_40714.rotationDegrees(-11.935F));
            matrices.method_22907(class_7833.field_40716.rotationDegrees((float)i * 65.3F));
            matrices.method_22907(class_7833.field_40718.rotationDegrees((float)i * -9.785F));
            float f = (float)item.method_7935(player) - ((float)player.method_6014() - tickProgress + 1.0F);
            float g = f / (float)class_1764.method_7775(item, player);
            g = class_3532.method_15363(g, 0.0F, 1.0F);
            if (g > 0.1F) {
               float h = class_3532.method_15374((double)((f - 0.1F) * 1.3F));
               float k = h * (g - 0.1F);
               matrices.method_46416(k * 0.0F, k * 0.004F, k * 0.0F);
            }

            matrices.method_46416(g * 0.0F, g * 0.0F, g * 0.04F);
            matrices.method_22905(1.0F, 1.0F, 1.0F + g * 0.2F);
            matrices.method_22907(class_7833.field_40715.rotationDegrees((float)i * 45.0F));
         } else {
            this.method_65816(swingProgress, matrices, i, arm);
            if (isCharged && swingProgress < 0.001F && isMainHand) {
               matrices.method_46416((float)i * -0.641864F, 0.0F, 0.0F);
               matrices.method_22907(class_7833.field_40716.rotationDegrees((float)i * 10.0F));
            }
         }

         this.method_3233(player, item, isRightArm ? class_811.field_4322 : class_811.field_4321, matrices, orderedRenderCommandQueue, light);
      } else {
         boolean isRightArm = arm == class_1306.field_6183;
         int side = isRightArm ? 1 : -1;
         if (player.method_6115() && player.method_6014() > 0 && player.method_6058() == hand) {
            if (hc.iiiIlIIIll()) {
               hc.lIIlliIIll(matrices, arm);
            }

            class_1839 useAction = item.method_7976();
            if (!useAction.method_75225()) {
               this.method_3224(matrices, arm, equipProgress);
            }

            switch (useAction) {
               case field_8952:
               default:
                  break;
               case field_8950:
               case field_8946:
                  this.method_3218(matrices, tickProgress, arm, item, player);
                  this.method_3224(matrices, arm, equipProgress);
                  break;
               case field_8949:
                  if (!(item.method_7909() instanceof class_1819)) {
                     matrices.method_46416((float)side * -0.14142136F, 0.08F, 0.14142136F);
                     matrices.method_22907(class_7833.field_40714.rotationDegrees(-102.25F));
                     matrices.method_22907(class_7833.field_40716.rotationDegrees((float)side * 13.365F));
                     matrices.method_22907(class_7833.field_40718.rotationDegrees((float)side * 78.05F));
                  }
                  break;
               case field_8953: {
                  matrices.method_46416((float)side * -0.2785682F, 0.18344387F, 0.15731531F);
                  matrices.method_22907(class_7833.field_40714.rotationDegrees(-13.935F));
                  matrices.method_22907(class_7833.field_40716.rotationDegrees((float)side * 35.3F));
                  matrices.method_22907(class_7833.field_40718.rotationDegrees((float)side * -9.785F));
                  float f = (float)item.method_7935(player) - ((float)player.method_6014() - tickProgress + 1.0F);
                  float gx = f / 20.0F;
                  gx = (gx * gx + gx * 2.0F) / 3.0F;
                  if (gx > 1.0F) {
                     gx = 1.0F;
                  }

                  if (gx > 0.1F) {
                     float h = class_3532.method_15374((double)((f - 0.1F) * 1.3F));
                     float k = h * (gx - 0.1F);
                     matrices.method_46416(k * 0.0F, k * 0.004F, k * 0.0F);
                  }

                  matrices.method_46416(gx * 0.0F, gx * 0.0F, gx * 0.04F);
                  matrices.method_22905(1.0F, 1.0F, 1.0F + gx * 0.2F);
                  matrices.method_22907(class_7833.field_40715.rotationDegrees((float)side * 45.0F));
                  break;
               }
               case field_63380: {
                  matrices.method_46416((float)side * -0.5F, 0.7F, 0.1F);
                  matrices.method_22907(class_7833.field_40714.rotationDegrees(-55.0F));
                  matrices.method_22907(class_7833.field_40716.rotationDegrees((float)side * 35.3F));
                  matrices.method_22907(class_7833.field_40718.rotationDegrees((float)side * -9.785F));
                  float f = (float)item.method_7935(player) - ((float)player.method_6014() - tickProgress + 1.0F);
                  float g = f / 10.0F;
                  if (g > 1.0F) {
                     g = 1.0F;
                  }

                  if (g > 0.1F) {
                     float h = class_3532.method_15374((double)((f - 0.1F) * 1.3F));
                     float k = h * (g - 0.1F);
                     matrices.method_46416(k * 0.0F, k * 0.004F, k * 0.0F);
                  }

                  matrices.method_46416(0.0F, 0.0F, g * 0.2F);
                  matrices.method_22905(1.0F, 1.0F, 1.0F + g * 0.2F);
                  matrices.method_22907(class_7833.field_40715.rotationDegrees((float)side * 45.0F));
                  break;
               }
               case field_42717:
                  this.method_49340(matrices, tickProgress, arm, player);
                  break;
               case field_55494:
                  this.method_65816(swingProgress, matrices, side, arm);
                  break;
               case field_8951: {
                  matrices.method_46416((float)side * 0.56F, -0.52F, -0.72F);
                  float f = (float)item.method_7935(player) - ((float)player.method_6014() - tickProgress + 1.0F);
                  corz$invokeLancingUse(player.method_75879(tickProgress), matrices, f, arm, item);
               }
            }
         } else if (player.method_6123()) {
            if (hc.iiiIlIIIll()) {
               hc.lIIlliIIll(matrices, arm);
            }

            this.method_3224(matrices, arm, equipProgress);
            matrices.method_46416((float)side * -0.4F, 0.8F, 0.3F);
            matrices.method_22907(class_7833.field_40716.rotationDegrees((float)side * 65.0F));
            matrices.method_22907(class_7833.field_40718.rotationDegrees((float)side * -85.0F));
         } else {
            boolean handled = false;
            if (hc.iiiIlIIIll()) {
               handled = hc.IlIllllIll(swingProgress, equipProgress, matrices, (float)side, arm);
            }

            if (!handled) {
               if (hc.iiiIlIIIll()) {
                  hc.lIIlliIIll(matrices, arm);
               }

               this.method_3224(matrices, arm, equipProgress);
               switch (item.method_75218().comp_4975()) {
                  case field_63398:
                  default:
                     break;
                  case field_63399:
                     this.method_65816(swingProgress, matrices, side, arm);
                     break;
                  case field_63400:
                     corz$invokeLancingSwing(swingProgress, matrices, side, arm);
               }
            }
         }

         this.method_3233(player, item, isRightArm ? class_811.field_4322 : class_811.field_4321, matrices, orderedRenderCommandQueue, light);
      }

      matrices.method_22909();
   }

   @Unique
   private static void corz$resolveLancing() {
      if (!corz$lancingResolved) {
         corz$lancingResolved = true;

         try {
            Class<?> lancingClass = Class.forName("net.minecraft.client.render.entity.state.Lancing");

            for (Method m : lancingClass.getDeclaredMethods()) {
               if ((m.getName().equals("method_75391") || m.getName().equals("applySwingTransforms") || m.getName().equals("applySwingOffset"))
                  && m.getParameterCount() == 4) {
                  m.setAccessible(true);
                  corz$applySwingTransformsMethod = m;
               }

               if ((m.getName().equals("method_75396") || m.getName().equals("applyUseTransforms") || m.getName().equals("applyUseOffset"))
                  && m.getParameterCount() == 5) {
                  m.setAccessible(true);
                  corz$applyUseTransformsMethod = m;
               }
            }
         } catch (Exception var5) {
         }
      }
   }

   @Unique
   private static void corz$invokeLancingSwing(float swingProgress, class_4587 matrices, int side, class_1306 arm) {
      corz$resolveLancing();
      if (corz$applySwingTransformsMethod != null) {
         try {
            corz$applySwingTransformsMethod.invoke(null, swingProgress, matrices, side, arm);
         } catch (Exception var5) {
         }
      }
   }

   @Unique
   private static void corz$invokeLancingUse(float time, class_4587 matrices, float f, class_1306 arm, class_1799 item) {
      corz$resolveLancing();
      if (corz$applyUseTransformsMethod != null) {
         try {
            corz$applyUseTransformsMethod.invoke(null, time, matrices, f, arm, item);
         } catch (Exception var6) {
         }
      }
   }
}
