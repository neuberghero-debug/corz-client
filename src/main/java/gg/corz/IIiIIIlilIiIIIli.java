package gg.corz;

import com.corz.client.mixins.AccessorClientPlayerInteractionManager;
import net.minecraft.class_310;

public final class IIiIIIlilIiIIIli {
   public static void IliIlllilIi(int slot) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && slot >= 0 && slot <= 8) {
         if (var1.field_1724.method_31548().method_67532() != slot) {
            var1.field_1724.method_31548().method_61496(slot);
            iIillIIlIlillIIl.iiiIlIIIll(slot);
            ((AccessorClientPlayerInteractionManager)var1.field_1761).corzSyncSelectedSlot();
         }
      }
   }

   private IIiIIIlilIiIIIli() {
   }
}
