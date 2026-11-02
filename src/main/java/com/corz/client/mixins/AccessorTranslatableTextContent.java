package com.corz.client.mixins;

import net.minecraft.class_2588;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_2588.class})
public interface AccessorTranslatableTextContent {
   @Accessor("field_11876")
   String corzKey();

   @Accessor("field_41875")
   String corzFallback();

   @Accessor("field_11875")
   Object[] corzArgs();
}
