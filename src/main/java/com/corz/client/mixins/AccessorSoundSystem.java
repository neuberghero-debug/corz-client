package com.corz.client.mixins;

import java.util.Map;
import net.minecraft.class_1113;
import net.minecraft.class_1140;
import net.minecraft.class_4235.class_4236;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_1140.class})
public interface AccessorSoundSystem {
   @Accessor("field_18950")
   Map<class_1113, class_4236> corzSources();

   @Invoker("method_4853")
   float corzAdjustedVolume(class_1113 var1);
}
