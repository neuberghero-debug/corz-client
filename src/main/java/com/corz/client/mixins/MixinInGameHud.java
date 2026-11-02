package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import gg.corz.IIiliilllIiliill;
import gg.corz.IIililillIililil;
import gg.corz.IliiIilliiIi;
import gg.corz.iIIlIllIlIlIll;
import gg.corz.iIlIiiiIllIiii;
import gg.corz.ilIllIiIll;
import gg.corz.lIiIlliiIiIlli;
import gg.corz.liIlliiiIlli;
import gg.corz.lilIliIiiilIliIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class MixinInGameHud {
   @Unique
   private boolean corzTextLifted;

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1753(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void onRender(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      IIililillIililil.illIilIilIil();
      if (IIiliilllIiliill.IilliliilIIi()) {
         iIIlIllIlIlIll.Iiiiliiiiiii(context, tickCounter.method_60637(false));
         ci.cancel();
      } else if (IIiliilllIiliill.liiiIIllIl()) {
         lIiIlliiIiIlli event = new lIiIlliiIiIlli(context, tickCounter.method_60637(false));
         IliiIilliiIi.iiIIlIIlIl();

         try {
            llilIllililIll.IlIlllIlilIl(event);
         } finally {
            IliiIilliiIi.lIlIliIlIl();
         }
      }
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_55802(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void onRenderChat(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      if (IIiliilllIiliill.iIlIlllllill()) {
         ci.cancel();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      cancellable = true,
      method = {"method_55803(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_70837(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_55800(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_55801(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_55804(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"}
   )
   private void onRenderServerHudLayer(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      if (IIiliilllIiliill.iIlIlllllill()) {
         ci.cancel();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1736(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void onRenderCrosshair(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      if (class_310.method_1551().field_1755 != null || liIlliiiIlli.lIliliIlil()) {
         ci.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"method_1736(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_5498;method_31034()Z"
      )}
   )
   private boolean corzFreecamCrosshair(boolean isFirstPerson) {
      return isFirstPerson || lilIliIiiilIliIi.lIIlliIIll();
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1765(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      cancellable = true
   )
   private void onRenderStatusEffectOverlay(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      ilIllIiIll m = llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      if (m != null && m.IliIlllilIi()) {
         ci.cancel();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1735(Lnet/minecraft/class_332;Lnet/minecraft/class_1297;)V"},
      cancellable = true
   )
   private void onRenderVignetteOverlay(class_332 context, class_1297 entity, CallbackInfo ci) {
      ilIllIiIll m = llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      if (m != null && m.IliIlllilIi()) {
         ci.cancel();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      cancellable = true,
      require = 0,
      method = {"method_1759(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"}
   )
   private void corzCustomHotbar(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      if (IIililillIililil.iIlllIllll() && iIlIiiiIllIiii.IliIlllilIi(context, tickCounter)) {
         ci.cancel();
      }
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1760(Lnet/minecraft/class_332;)V"},
      cancellable = true,
      require = 0
   )
   private void corzHideStatusBars(class_332 context, CallbackInfo ci) {
      if (IIililillIililil.IIiIillIiIil()) {
         ci.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"method_55805(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V", "method_70842()Lnet/minecraft/class_329$class_11220;"},
      require = 0,
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_636;method_2913()Z"
      )}
   )
   private boolean corzHideExperienceBar(boolean shown) {
      return shown && !IIililillIililil.IIiIillIiIil();
   }

   @Inject(
      at = {@At("HEAD")},
      method = {"method_1749(Lnet/minecraft/class_332;)V"},
      require = 0
   )
   private void corzLiftHeldItemTooltip(class_332 context, CallbackInfo ci) {
      this.corzLiftText(context);
   }

   @Inject(
      at = {@At("RETURN")},
      method = {"method_1749(Lnet/minecraft/class_332;)V"},
      require = 0
   )
   private void corzDropHeldItemTooltip(class_332 context, CallbackInfo ci) {
      this.corzDropText(context);
   }

   @Inject(
      at = {@At("HEAD")},
      require = 0,
      method = {"method_55800(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"}
   )
   private void corzLiftOverlayMessage(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      if (!IIiliilllIiliill.iIlIlllllill()) {
         this.corzLiftText(context);
      }
   }

   @Inject(
      at = {@At("RETURN")},
      require = 0,
      method = {"method_55800(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"}
   )
   private void corzDropOverlayMessage(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
      this.corzDropText(context);
   }

   @Unique
   private void corzLiftText(class_332 context) {
      class_310 mc = class_310.method_1551();
      float lift = IIililillIililil.lliIililiIil(mc.field_1761 != null && mc.field_1761.method_2908());
      if (!(lift <= 0.0F)) {
         context.method_51448().pushMatrix();
         context.method_51448().translate(0.0F, -lift);
         this.corzTextLifted = true;
      }
   }

   @Unique
   private void corzDropText(class_332 context) {
      if (this.corzTextLifted) {
         this.corzTextLifted = false;
         context.method_51448().popMatrix();
      }
   }
}
