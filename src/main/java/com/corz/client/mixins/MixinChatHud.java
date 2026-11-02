package com.corz.client.mixins;

import gg.corz.IiliIlIlliliIlIl;
import gg.corz.iIlIilIlIllIilIl;
import gg.corz.iiIlIIIiIIllIIIi;
import gg.corz.liIlliIiiiIlliIi;
import gg.corz.llllililllil;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_338.class})
public class MixinChatHud {
   @ModifyVariable(
      method = {"method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V"},
      at = @At("HEAD"),
      argsOnly = true,
      index = 1
   )
   private class_2561 corz_maskChatName(class_2561 message) {
      if (message != null && iIlIilIlIllIilIl.lIliliiIlili()) {
         iIlIilIlIllIilIl.Illililllili(message.getString());
      }

      if (message != null && llllililllil.iiiIlIIIll()) {
         llllililllil.lIIlliIIll(message.getString());
      }

      if (message != null && IiliIlIlliliIlIl.IliIlllilIi()) {
         IiliIlIlliliIlIl.liiiIIllIl(message.getString());
      }

      if (message != null && iiIlIIIiIIllIIIi.iiiIlIIIll()) {
         iiIlIIIiIIllIIIi.lIIlliIIll(message.getString());
      }

      return liIlliIiiiIlliIi.iilllIIill(message);
   }
}
