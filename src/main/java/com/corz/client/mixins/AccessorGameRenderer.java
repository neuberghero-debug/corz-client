package com.corz.client.mixins;

import net.minecraft.class_11228;
import net.minecraft.class_757;
import net.minecraft.class_758;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_757.class})
public interface AccessorGameRenderer {
   @Accessor("field_59965")
   class_11228 corzGuiRenderer();

   @Accessor("field_60793")
   class_758 corzFogRenderer();
}
