package com.corz.client.mixins;

import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_634.class})
public interface AccessorClientPlayNetworkHandler {
   @Accessor("field_19144")
   int getChunkLoadDistance();
}
