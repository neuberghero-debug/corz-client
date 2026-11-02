package com.corz.client.mixins;

import gg.corz.IIilliillIilliil;
import gg.corz.llilIllililIll;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_5348;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class MixinScoreboardFakeStats {
   private static final String SIDEBAR = "renderScoreboardSidebar(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/scoreboard/ScoreboardObjective;)V";

   @Inject(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = {@At("HEAD")}
   )
   private void corz_beginSidebar(class_332 context, class_266 objective, CallbackInfo ci) {
      IIilliillIilliil fs = fakeStats();
      if (fs != null) {
         fs.liIlliiIll();
      }
   }

   @Redirect(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_327;method_27525(Lnet/minecraft/class_5348;)I",
         ordinal = 1
      ),
      require = 0
   )
   private int corz_lineWidth(class_327 font, class_5348 text) {
      IIilliillIilliil fs = fakeStats();
      if (fs != null && text instanceof class_2561 t) {
         try {
            return font.method_27525(fs.IIllllIlll(t));
         } catch (Exception var6) {
         }
      }

      return font.method_27525(text);
   }

   @ModifyArg(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V",
         ordinal = 1
      ),
      index = 1,
      require = 0
   )
   private class_2561 corz_lineText(class_2561 text) {
      IIilliillIilliil fs = fakeStats();
      if (fs != null) {
         try {
            return fs.iIlllIllll(text);
         } catch (Exception var4) {
         }
      }

      return text;
   }

   private static IIilliillIilliil fakeStats() {
      IIilliillIilliil fs = (IIilliillIilliil)llilIllililIll.iliIiiliiiii(IIilliillIilliil.class);
      return fs != null && fs.IliIlllilIi() ? fs : null;
   }
}
