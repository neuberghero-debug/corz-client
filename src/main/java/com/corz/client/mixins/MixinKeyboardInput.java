package com.corz.client.mixins;

import gg.corz.IiIiIlllliIiIlll;
import gg.corz.ilIiiIiIii;
import gg.corz.lIIIililiIIIilil;
import gg.corz.lIlIiIliIlIiIl;
import gg.corz.lilIliIiiilIliIi;
import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_743.class})
public class MixinKeyboardInput {
   @Inject(
      method = {"method_3129()V"},
      at = {@At("RETURN")}
   )
   private void corzFreezeMove(CallbackInfo ci) {
      class_310 mc = class_310.method_1551();
      if (mc.field_1724 != null) {
         AccessorInput in = (AccessorInput)this;
         if (mc.field_1724.field_3913 == this) {
            lilIliIiiilIliIi.IIllllIlll();
            lIIIililiIIIilil.iIlIlllllill(in, mc.field_1724);
         }

         boolean rotFreeze = ilIiiIiIii.Illlllllilll();
         boolean invMask = lIlIiIliIlIiIl.Iilllilliill();
         if (!rotFreeze && !invMask) {
            if (ilIiiIiIii.IIlllIlliIll() && !lIIIililiIIIilil.lIiiIiIlilli()) {
               class_10185 p = in.getPlayerInput();
               int strafe = (p.comp_3161() ? 1 : 0) - (p.comp_3162() ? 1 : 0);
               int forward = (p.comp_3159() ? 1 : 0) - (p.comp_3160() ? 1 : 0);
               if (strafe == 0 && forward == 0) {
                  return;
               }

               int[] r = IiIiIlllliIiIlll.IliIlllilIi(strafe, forward, mc.field_1724.method_36454(), ilIiiIiIii.Iilllilliill());
               if (r[0] == strafe && r[1] == forward) {
                  return;
               }

               in.setPlayerInput(new class_10185(r[1] > 0, r[1] < 0, r[0] > 0, r[0] < 0, p.comp_3163(), p.comp_3164(), p.comp_3165()));
               in.setMovementVector(new class_241((float)r[0], (float)r[1]).method_35581());
            }
         } else {
            in.setMovementVector(class_241.field_1340);
            class_10185 px = in.getPlayerInput();
            boolean jump = px.comp_3163() && !invMask;
            boolean sneak = px.comp_3164() && !invMask;
            in.setPlayerInput(new class_10185(false, false, false, false, jump, sneak, false));
         }
      }
   }
}
