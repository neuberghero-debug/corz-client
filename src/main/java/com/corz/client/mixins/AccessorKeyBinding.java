package com.corz.client.mixins;

import net.minecraft.class_304;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_304.class})
public interface AccessorKeyBinding {
   @Accessor("field_1655")
   class_306 getBoundKey();

   @Accessor("field_1653")
   void setPressedRaw(boolean var1);

   @Accessor("field_1653")
   boolean getPressedRaw();

   @Accessor("field_1661")
   int corzGetTimesPressed();

   @Accessor("field_1661")
   void corzSetTimesPressed(int var1);
}
