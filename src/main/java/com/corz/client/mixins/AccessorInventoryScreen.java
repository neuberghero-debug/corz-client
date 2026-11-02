package com.corz.client.mixins;

import net.minecraft.class_10017;
import net.minecraft.class_1309;
import net.minecraft.class_490;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_490.class})
public interface AccessorInventoryScreen {
   @Invoker("method_48472")
   static class_10017 corzBuildEntityState(class_1309 entity) {
      throw new AssertionError();
   }
}
