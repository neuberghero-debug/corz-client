package com.corz.client.mixins;

import net.minecraft.class_4234;
import net.minecraft.class_4856;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_4856.class})
public interface AccessorRepeatingAudioStream {
   @Accessor("field_22444")
   class_4234 corzDelegate();
}
