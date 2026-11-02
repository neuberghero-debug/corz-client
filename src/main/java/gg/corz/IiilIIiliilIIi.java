package gg.corz;

import net.minecraft.class_310;

public final class IiilIIiliilIIi {
   private static volatile float iilIliiliIIiIliili = -1.0F;

   public static float liiiIIllIl() {
      float var0 = iilIliiliIIiIliili;
      if (var0 > 0.0F) {
         return var0;
      } else {
         class_310 var1 = class_310.method_1551();
         return var1 != null && var1.field_1690 != null && var1.field_1690.method_41808() != null
            ? ((Integer)var1.field_1690.method_41808().method_41753()).floatValue()
            : 70.0F;
      }
   }

   private IiilIIiliilIIi() {
   }

   public static void IliIlllilIi(float fovDegrees) {
      if (fovDegrees > 0.0F && Float.isFinite(fovDegrees)) {
         iilIliiliIIiIliili = fovDegrees;
      }
   }
}
