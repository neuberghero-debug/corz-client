package com.corz.client.mixins;

import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_465.class})
public interface AccessorHandledScreen {
   @Accessor("field_2776")
   int corzX();

   @Accessor("field_2800")
   int corzY();

   @Accessor("field_2792")
   int corzBackgroundWidth();
}
