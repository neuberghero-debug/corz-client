package gg.corz;

import net.minecraft.class_10590;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3489;
import net.minecraft.class_9334;
import net.minecraft.class_9362;

public final class lliillliliilll {
   private lliillliliilll() {
   }

   public static boolean liiiIIllIl(class_1799 stack) {
      return stack != null && !stack.method_7960() && (stack.method_31573(class_3489.field_42614) || stack.method_31573(class_3489.field_42615));
   }

   public static boolean iIlIlllllill(class_1799 stack) {
      return stack != null && stack.method_7909() instanceof class_9362;
   }

   public static boolean IliIlllilIi(class_1799 stack) {
      return stack != null && !stack.method_7960()
         ? stack.method_31573(class_3489.field_42611)
            || stack.method_31573(class_3489.field_42612)
            || stack.method_31573(class_3489.field_63257)
            || stack.method_7909() instanceof class_9362
            || stack.method_31574(class_1802.field_8547)
         : false;
   }

   public static boolean IilliliilIIi(class_1799 stack) {
      if (stack != null && !stack.method_7960()) {
         class_10590 var1 = (class_10590)stack.method_58694(class_9334.field_55878);
         return var1 != null && var1.comp_3602() > 0.0F;
      } else {
         return false;
      }
   }
}
