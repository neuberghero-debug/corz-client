package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import net.minecraft.class_304;

public final class illIilIilIil {
   private illIilIilIil() {
   }

   public static void IliIlllilIi(class_304 pressed, boolean key) {
      if (pressed != null) {
         ((AccessorKeyBinding)pressed).setPressedRaw(key);
      }
   }
}
