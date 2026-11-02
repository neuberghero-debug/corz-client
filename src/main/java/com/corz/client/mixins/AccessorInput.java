package com.corz.client.mixins;

import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_744.class})
public interface AccessorInput {
   @Accessor("field_54155")
   class_10185 getPlayerInput();

   @Accessor("field_54155")
   void setPlayerInput(class_10185 var1);

   @Accessor("field_55868")
   void setMovementVector(class_241 var1);
}
