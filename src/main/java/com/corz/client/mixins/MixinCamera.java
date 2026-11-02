package com.corz.client.mixins;

import gg.corz.Illliillllii;
import gg.corz.iIIlIlIlIlIlIlIl;
import gg.corz.iIIlIllIlIlIll;
import gg.corz.lilIliIiiilIliIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({class_4184.class})
public abstract class MixinCamera {
   @Shadow
   private boolean field_18719;
   @Shadow
   private class_243 field_18712;
   @Shadow
   private float field_18718;
   @Shadow
   private float field_18717;
   private iIIlIlIlIlIlIlIl cachedEvent;
   private float capturedTickDelta;
   private boolean dispatchedThisUpdate;

   @Shadow
   protected abstract void method_19322(class_243 var1);

   @Shadow
   protected abstract void method_19327(double var1, double var3, double var5);

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @Shadow
   protected abstract void method_19324(float var1, float var2, float var3);

   @Shadow
   private float method_19318(float distance) {
      throw new AssertionError();
   }

   @Inject(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = {@At("HEAD")}
   )
   private void captureTickDelta(class_1937 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo ci) {
      this.capturedTickDelta = tickDelta;
      this.dispatchedThisUpdate = false;
   }

   @ModifyArgs(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_4184;method_19325(FF)V"
      )
   )
   private void modifyRotation(Args args) {
      if (!this.dispatchedThisUpdate) {
         float defYaw = (Float)args.get(0);
         float defPitch = (Float)args.get(1);
         this.dispatchCameraEvent(defYaw, defPitch);
      }

      if (this.cachedEvent != null && this.cachedEvent.Iilllilliill()) {
         args.set(0, this.cachedEvent.IIIllIIliIIl());
         args.set(1, this.cachedEvent.IiIlliIliiIl());
      }
   }

   @ModifyArgs(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_4184;method_19327(DDD)V"
      )
   )
   private void modifyPos(Args args) {
      if (!this.dispatchedThisUpdate) {
         class_1297 entity = class_310.method_1551().method_1560();
         float y = entity != null ? entity.method_5705(this.capturedTickDelta) : 0.0F;
         float p = entity != null ? entity.method_5695(this.capturedTickDelta) : 0.0F;
         this.dispatchCameraEvent(y, p);
      }

      if (this.cachedEvent != null && this.cachedEvent.Iilllilliill() && this.cachedEvent.Ililllililil()) {
         args.set(0, this.cachedEvent.IliIlllilIi());
         args.set(1, this.cachedEvent.iIlIlllllill());
         args.set(2, this.cachedEvent.lIiiIiIlilli());
      }
   }

   private void dispatchCameraEvent(float defYaw, float defPitch) {
      this.cachedEvent = new iIIlIlIlIlIlIlIl(0.0, 0.0, 0.0, defYaw, defPitch, this.capturedTickDelta);
      llilIllililIll.Ililllililil(this.cachedEvent);
      this.dispatchedThisUpdate = true;
   }

   @Inject(
      method = {"method_19321(Lnet/minecraft/class_1937;Lnet/minecraft/class_1297;ZZF)V"},
      at = {@At("TAIL")}
   )
   private void corzFreecamView(class_1937 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo ci) {
      if (lilIliIiiilIliIi.iiiIlIIIll()) {
         lilIliIiiilIliIi freecam = lilIliIiiilIliIi.IIiillIiil();
         this.method_19325(freecam.illilIilil(tickDelta), freecam.lililiilil(tickDelta));
         this.method_19322(freecam.Illillllil(tickDelta));
      } else if (iIIlIllIlIlIll.IIIllIIliIIl() && focusedEntity != null && this.field_18712 != null) {
         try {
            Illliillllii rig = iIIlIllIlIlIll.lllllillll(
               focusedEntity,
               tickDelta,
               this.field_18712.field_1352,
               this.field_18712.field_1351,
               this.field_18712.field_1350,
               this.field_18718,
               this.field_18717
            );
            if (rig.IIlIiilIllIlIiilIl) {
               this.field_18719 = true;
            }

            this.method_19325(rig.IIiililIllIiililIl, rig.iIiililIlIliililIl);
            this.method_19327(rig.IlIIiilIlllIIiilIl, rig.ilIIiilIlIiIIiilIl, rig.liIIiilIliiIIiilIl);
            if (rig.lliililIliliililIl > 0.001F) {
               float back = iIIlIllIlIlIll.Iillllilll(this.method_19318(rig.lliililIliliililIl), rig.lliililIliliililIl);
               float side = iIIlIllIlIlIll.iilllIIill(rig, back * rig.IiiililIlliiililIl);
               if (side > 0.001F) {
                  this.method_19324(0.0F, 0.0F, side);
                  back = Math.min(back, this.method_19318(back));
               }

               this.method_19324(-back, 0.0F, 0.0F);
            }
         } catch (Throwable var10) {
            iIIlIllIlIlIll.lliIliliIl("camera", var10);
         }
      }
   }
}
