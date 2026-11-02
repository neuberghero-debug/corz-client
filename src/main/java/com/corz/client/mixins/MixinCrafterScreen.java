package com.corz.client.mixins;

import gg.corz.IlIliIIlllIliIIl;
import net.minecraft.class_1661;
import net.minecraft.class_2561;
import net.minecraft.class_4185;
import net.minecraft.class_465;
import net.minecraft.class_8881;
import net.minecraft.class_8898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_8898.class})
public abstract class MixinCrafterScreen extends class_465<class_8881> {
   protected MixinCrafterScreen(class_8881 handler, class_1661 inventory, class_2561 title) {
      super(handler, inventory, title);
   }

   @Inject(
      method = {"method_25426()V"},
      at = {@At("TAIL")}
   )
   private void corz$addPresetButtons(CallbackInfo ci) {
      if (IlIliIIlllIliIIl.iIlIlllllill()) {
         int bx = this.field_2776 + this.field_2792 + 4;
         int by = this.field_2800 + 4;
         this.method_37063(
            class_4185.method_46430(class_2561.method_43470("Save"), b -> IlIliIIlllIliIIl.iliIiiliiiii((class_8881)this.field_2797))
               .method_46434(bx, by, 44, 18)
               .method_46431()
         );
         this.method_37063(
            class_4185.method_46430(class_2561.method_43470("Load"), b -> IlIliIIlllIliIIl.IIIllIIliIIl((class_8881)this.field_2797))
               .method_46434(bx, by + 21, 44, 18)
               .method_46431()
         );
      }
   }
}
