package com.corz.client.mixins;

import net.minecraft.class_2684;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2684.class})
public interface AccessorEntityS2CPacket {
   @Accessor("field_12310")
   int corzGetEntityId();
}
