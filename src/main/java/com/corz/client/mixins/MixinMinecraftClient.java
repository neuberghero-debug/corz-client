package com.corz.client.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import gg.corz.IIllIIlilIllIIli;
import gg.corz.Ilillllllillll;
import gg.corz.iIIiIlIlIiIl;
import gg.corz.iIiIIiIlIliIIiIl;
import gg.corz.iIlIilIlIllIilIl;
import gg.corz.iiiIliIIIlli;
import gg.corz.iiliililIIiiilil;
import gg.corz.iillIIIlIIilIIIl;
import gg.corz.lIllIiiIllIi;
import gg.corz.liilliIiiiilliIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_310.class})
public class MixinMinecraftClient {
   @Shadow
   @Nullable
   public class_638 field_1687;
   @Shadow
   private int field_1752;
   @Shadow
   protected int field_1771;

   @Inject(
      method = {"method_1583()V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onItemUseHead(CallbackInfo ci) {
      if (IIllIIlilIllIIli.iIIIlIlIIl()) {
         IIllIIlilIllIIli.llIIlilIIl();
         ci.cancel();
      } else {
         iiiIliIIIlli event = new iiiIliIIIlli();
         llilIllililIll.IIlllIlliIll(event);
         if (event.liiiIIllIl()) {
            IIllIIlilIllIIli.llIIlilIIl();
            ci.cancel();
         }
      }
   }

   @Inject(
      method = {"method_1583()V"},
      at = {@At("RETURN")}
   )
   private void onItemUseReturn(CallbackInfo ci) {
      iillIIIlIIilIIIl event = new iillIIIlIIilIIIl(this.field_1752);
      llilIllililIll.IiIlliIliiIl(event);
      this.field_1752 = event.iillIIllIl;
      IIllIIlilIllIIli.llIIlilIIl();
   }

   @Inject(
      method = {"method_1508()V"},
      at = {@At("RETURN")}
   )
   private void corzAfterInputEvents(CallbackInfo ci) {
      IIllIIlilIllIIli.IIiilIiiiIii();
   }

   @Inject(
      method = {"method_1574()V"},
      at = {@At("HEAD")}
   )
   private void onTick(CallbackInfo ci) {
      liilliIiiiilliIi.ilIiiliIIi.iIlIlllllill();
      if (this.field_1687 != null) {
         llilIllililIll.Illlllllilll();
      }
   }

   @Inject(
      method = {"method_1574()V"},
      at = {@At("RETURN")}
   )
   private void corzAfterTick(CallbackInfo ci) {
      IIllIIlilIllIIli.Iliilliiilii();
   }

   @Inject(
      method = {"method_1590(Z)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corzBotOwnsBreak(boolean breaking, CallbackInfo ci) {
      iIlIilIlIllIilIl builder = (iIlIilIlIllIilIl)llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
      if (builder != null && builder.IiIilliIil()) {
         ci.cancel();
      } else {
         Ilillllllillll spawnerProtect = (Ilillllllillll)llilIllililIll.iliIiiliiiii(Ilillllllillll.class);
         if (spawnerProtect != null && spawnerProtect.lIIlliIIll()) {
            ci.cancel();
         } else {
            iIIiIlIlIiIl elytra = (iIIiIlIlIiIl)llilIllililIll.iliIiiliiiii(iIIiIlIlIiIl.class);
            if (elytra != null && elytra.iiIlllIIllll()) {
               ci.cancel();
            } else {
               if (IIllIIlilIllIIli.Ililllililil()) {
                  ci.cancel();
               }
            }
         }
      }
   }

   @ModifyVariable(
      method = {"method_1590(Z)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private boolean corzMinerV2HoldsAttack(boolean breaking) {
      if (breaking) {
         return true;
      } else {
         iiliililIIiiilil miner = (iiliililIIiiilil)llilIllililIll.iliIiiliiiii(iiliililIIiiilil.class);
         if (miner == null || !miner.IIllllIlll()) {
            iIiIIiIlIliIIiIl hunter = (iIiIIiIlIliIIiIl)llilIllililIll.iliIiiliiiii(iIiIIiIlIliIIiIl.class);
            if (hunter == null || !hunter.lIIlliIIll()) {
               return false;
            }
         }

         this.field_1771 = 0;
         return true;
      }
   }

   @Inject(
      method = {"method_1536()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corzSilentAimAttack(CallbackInfoReturnable<Boolean> cir) {
      Boolean result = IIllIIlilIllIIli.Iiiiliiiiiii();
      if (result != null) {
         cir.setReturnValue(result);
      }
   }

   @Inject(
      method = {"method_1536()Z"},
      at = {@At("RETURN")}
   )
   private void corzAfterAttack(CallbackInfoReturnable<Boolean> cir) {
      IIllIIlilIllIIli.IIIIllIIIl();
   }

   @ModifyReturnValue(
      method = {"method_1522()Lnet/minecraft/class_276;"},
      at = {@At("RETURN")}
   )
   private class_276 corz$gui3dFramebuffer(class_276 original) {
      class_276 override = lIllIiiIllIi.IliIlllilIi();
      return override != null ? override : original;
   }

   @WrapOperation(
      method = {"method_1523(Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_757;method_3192(Lnet/minecraft/class_9779;Z)V"
      )}
   )
   private void corz$gui3dGuard(class_757 renderer, class_9779 tickCounter, boolean tick, Operation<Void> original) {
      try {
         original.call(new Object[]{renderer, tickCounter, tick});
      } finally {
         lIllIiiIllIi.lIiiIiIlilli();
      }
   }

   @Inject(
      method = {"method_15993()V"},
      at = {@At("HEAD")}
   )
   private void corz$gui3dResize(CallbackInfo ci) {
      lIllIiiIllIi.lIiiIiIlilli();
   }
}
