package com.corz.client.mixins;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.minecraft.class_7202;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_7202.class})
public interface AccessorPendingUpdateManager {
   @Accessor("field_37953")
   Long2ObjectOpenHashMap<?> corzPendingByPos();
}
