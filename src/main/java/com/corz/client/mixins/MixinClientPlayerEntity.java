package com.corz.client.mixins;

import gg.corz.iIlIilIlIllIilIl;
import gg.corz.iillIIliIIilIIli;
import gg.corz.ilIiiIiIii;
import gg.corz.illIilIilIil;
import gg.corz.lIiiiIIiiIiiiIIi;
import gg.corz.lIiiiiiIiiii;
import gg.corz.lIlIiIliIlIiIl;
import gg.corz.llilIllililIll;
import net.minecraft.class_10185;
import net.minecraft.class_1656;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_746.class})
public class MixinClientPlayerEntity {
   @Shadow
   protected int field_3935;
   @Unique
   private float corzRealYaw;
   @Unique
   private float corzRealPitch;
   @Unique
   private boolean corzRotationSwapped;
   @Unique
   private float corzPrevSentYaw = Float.NaN;

   @Inject(
      method = {"method_6007()V"},
      at = {@At("HEAD")}
   )
   private void corzGapJumpIsAWalkingHop(CallbackInfo ci) {
      if (iIlIilIlIllIilIl.iiiIlIiiIl) {
         iIlIilIlIllIilIl builder = (iIlIilIlIllIilIl)llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
         if (builder != null && builder.IliIlllilIi()) {
            class_746 self = (class_746)this;
            this.field_3935 = 0;
            class_315 options = class_310.method_1551().field_1690;
            if (options != null) {
               illIilIilIil.IliIlllilIi(options.field_1867, false);
            }

            if (self.method_5624()) {
               self.method_5728(false);
            }
         } else {
            iIlIilIlIllIilIl.iiiIlIiiIl = false;
         }
      }
   }

   @Inject(
      method = {"method_6007()V"},
      at = {@At("HEAD")}
   )
   private void corzWalkerNeedsGravity(CallbackInfo ci) {
      class_746 self = (class_746)this;
      class_1656 ab = self.method_31549();
      iIlIilIlIllIilIl builder = (iIlIilIlIllIilIl)llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
      if (builder != null && builder.IliIlllilIi()) {
         if (ab.field_7477 || ab.field_7478 || ab.field_7479) {
            if (ab.field_7478) {
               iIlIilIlIllIilIl.illlIIiiIl = true;
            }

            ab.field_7478 = false;
            if (ab.field_7479) {
               ab.field_7479 = false;
               self.method_7355();
            }
         }
      }
   }

   @Inject(
      method = {"method_6007()V"},
      at = {@At("TAIL")}
   )
   private void corzMovementHacks(CallbackInfo ci) {
      class_746 self = (class_746)this;
      lIiiiIIiiIiiiIIi flight = (lIiiiIIiiIiiiIIi)llilIllililIll.iliIiiliiiii(lIiiiIIiiIiiiIIi.class);
      if (flight == null || !flight.IliIlllilIi() || !flight.lIIlliIIll(self)) {
         iillIIliIIilIIli speed = (iillIIliIIilIIli)llilIllililIll.iliIiiliiiii(iillIIliIIilIIli.class);
         if (speed != null && speed.IliIlllilIi()) {
            speed.iiiIlIIIll(self);
         }
      }
   }

   @Inject(
      method = {"method_7353(Lnet/minecraft/class_2561;Z)V"},
      at = {@At("HEAD")}
   )
   private void onMessage(class_2561 message, boolean overlay, CallbackInfo ci) {
      if (message != null && !overlay) {
         class_746 self = (class_746)this;
         lIiiiiiIiiii autoPromo = (lIiiiiiIiiii)llilIllililIll.iliIiiliiiii(lIiiiiiIiiii.class);
         if (autoPromo != null && autoPromo.IliIlllilIi()) {
            String raw = message.getString();
            String myName = self.method_5477().getString();
            String lower = raw.toLowerCase();
            String lowerMe = myName.toLowerCase();
            String victim = null;
            if (lower.contains(" by " + lowerMe)) {
               int wasIdx = lower.indexOf(" was ");
               if (wasIdx > 0) {
                  victim = raw.substring(0, wasIdx).trim();
               }
            } else if (lower.startsWith(lowerMe + " killed ")) {
               victim = raw.substring((myName + " killed ").length()).trim();
            }

            if (victim != null && !victim.equalsIgnoreCase(myName)) {
               autoPromo.iiiIlIIIll(victim);
            }
         }
      }
   }

   @Redirect(
      method = {"method_39759(Lnet/minecraft/class_243;)Z"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_36454()F"
      )
   )
   private float corzCollidedSoftlyYaw(class_746 self) {
      return ilIiiIiIii.IIlllIlliIll() ? ilIiiIiIii.Iilllilliill() : self.method_36454();
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At("HEAD")}
   )
   private void corzSilentAimHead(CallbackInfo ci) {
      this.corzRotationSwapped = false;
      class_746 self = (class_746)this;
      boolean silent = ilIiiIiIii.IiIlliIliiIl();
      if (silent) {
         this.corzRealYaw = self.method_36454();
         this.corzRealPitch = self.method_36455();
         self.method_36456(ilIiiIiIii.Iilllilliill());
         self.method_36457(ilIiiIiIii.IIillIiliIil());
         this.corzRotationSwapped = true;
      }
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At("RETURN")}
   )
   private void corzSilentAimReturn(CallbackInfo ci) {
      if (this.corzRotationSwapped) {
         class_746 self = (class_746)this;
         self.method_36456(this.corzRealYaw);
         self.method_36457(this.corzRealPitch);
         this.corzRotationSwapped = false;
      }
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_46742()V",
         shift = Shift.AFTER
      )}
   )
   private void corzFireSilentInventory(CallbackInfo ci) {
      class_746 self = (class_746)this;
      class_10185 p = self.field_3913.field_54155;
      boolean quiet = !p.comp_3159() && !p.comp_3160() && !p.comp_3161() && !p.comp_3162() && !p.comp_3163() && !p.comp_3164() && !self.method_5624();
      double speed = Math.hypot(self.method_18798().field_1352, self.method_18798().field_1350);
      lIlIiIliIlIiIl.IiIiliIiiiIi(quiet, speed, self.method_24828());
   }
}
