package com.corz.client.mixins;

import io.netty.channel.Channel;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_2535.class})
public interface AccessorClientConnection {
   @Accessor("field_11651")
   Channel corzChannel();

   @Invoker("method_10759")
   static void corzHandlePacket(class_2596<?> packet, class_2547 listener) {
      throw new AssertionError();
   }
}
