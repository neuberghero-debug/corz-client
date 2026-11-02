package com.corz.client.mixins;

import gg.corz.IiIiIlIiliIiIlIi;
import gg.corz.IliIliIllliIliIl;
import gg.corz.iiIliillIIlliill;
import gg.corz.iillIlllIIilIlll;
import gg.corz.liilliIiiiilliIi;
import gg.corz.llilIllililIll;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2535.class})
public class MixinClientConnection {
   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPacketSend(class_2596<?> packet, CallbackInfo ci) {
      IiIiIlIiliIiIlIi event = new IiIiIlIiliIiIlIi(packet, (class_2535)this);
      llilIllililIll.Iilllilliill(event);
      iiIliillIIlliill.Iilllilliill(event);
      if (event.liiiIIllIl()) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"method_52906(Lnet/minecraft/class_2596;Lio/netty/channel/ChannelFutureListener;Z)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corzOrderOutbound(class_2596<?> packet, ChannelFutureListener listener, boolean flush, CallbackInfo ci) {
      if (iiIliillIIlliill.IIillIiliIil((class_2535)this, packet, listener, flush)) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPacketReceive(ChannelHandlerContext ctx, class_2596<?> packet, CallbackInfo ci) {
      liilliIiiiilliIi.IliIlllilIi(packet);
      IliIliIllliIliIl event = new IliIliIllliIliIl(packet);
      llilIllililIll.IIillIiliIil(event);
      if (event.liiiIIllIl()) {
         ci.cancel();
      }
   }

   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void corzHoldInbound(ChannelHandlerContext ctx, class_2596<?> packet, CallbackInfo ci) {
      if (iillIlllIIilIlll.IIlllIlliIll((class_2535)this, packet)) {
         ci.cancel();
      }
   }
}
