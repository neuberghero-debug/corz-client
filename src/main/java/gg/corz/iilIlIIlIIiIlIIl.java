package gg.corz;

import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2680;

public final class iilIlIIlIIiIlIIl {
   public static class_1792 liiiIIllIl(class_2680 state) {
      if (state == null) {
         return class_1802.field_8162;
      } else {
         iiIIiIIlIIlIiIIl var1 = IliIlllilIi(
            state.method_26204() == class_2246.field_10164, state.method_26204() == class_2246.field_10382, state.method_26227().method_15771()
         );

         return switch (var1) {
            case liilIIilIl -> state.method_26204() == class_2246.field_23079
            ? class_1802.field_23070
            : (
               state.method_26204() == class_2246.field_22124
                  ? class_1802.field_21992
                  : (state.method_26204() == class_2246.field_10108 ? class_1802.field_8648 : state.method_26204().method_8389())
            );
            case llilIIilIl -> class_1802.field_8187;
            case IiilIIilIl -> class_1802.field_8705;
            case ililIIilIl -> class_1802.field_8162;
         };
      }
   }

   private iilIlIIlIIiIlIIl() {
   }

   static iiIIiIIlIIlIiIIl IliIlllilIi(boolean lava, boolean still, boolean water) {
      if (!lava && !still) {
         return iiIIiIIlIIlIiIIl.llilIIilIl;
      } else if (!water) {
         return iiIIiIIlIIlIiIIl.liilIIilIl;
      } else {
         return lava ? iiIIiIIlIIlIiIIl.ililIIilIl : iiIIiIIlIIlIiIIl.IiilIIilIl;
      }
   }
}
