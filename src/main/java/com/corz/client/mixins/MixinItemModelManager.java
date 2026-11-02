package com.corz.client.mixins;

import gg.corz.IIlllIIilIlllIIi;
import gg.corz.llilIllililIll;
import net.minecraft.class_10442;
import net.minecraft.class_10444;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_811;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_10442.class})
public abstract class MixinItemModelManager {
   @ModifyVariable(
      method = {"method_65597(Lnet/minecraft/class_10444;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_1309;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_1799 corz$thirdPersonKnife(class_1799 stack, class_10444 state, class_1799 original, class_811 context, class_1309 entity) {
      IIlllIIilIlllIIi si = (IIlllIIilIlllIIi)llilIllililIll.iliIiiliiiii(IIlllIIilIlllIIi.class);
      return si == null ? stack : si.iiIilIIlil(entity, stack, context);
   }
}
