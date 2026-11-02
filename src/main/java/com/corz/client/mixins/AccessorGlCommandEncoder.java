package com.corz.client.mixins;

import net.minecraft.class_10860;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_10860.class})
public interface AccessorGlCommandEncoder {
   @Accessor("field_57848")
   boolean corzRenderPassOpen();
}
