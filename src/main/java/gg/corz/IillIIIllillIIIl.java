package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import net.minecraft.class_1041;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public final class IillIIIllillIIIl {
   private IillIIIllillIIIl() {
   }

   public static boolean iIlIlllllill(class_304 keyCode, int key) {
      class_306 var2 = IilliliilIIi(keyCode);
      return var2 != null && var2.method_1442() == class_307.field_1668 && var2.method_1444() == key;
   }

   public static boolean liiiIIllIl(class_304 button, int key) {
      class_306 var2 = IilliliilIIi(button);
      return var2 != null && var2.method_1442() == class_307.field_1672 && var2.method_1444() == key;
   }

   public static boolean IliIlllilIi(class_304 key) {
      class_306 var1 = IilliliilIIi(key);
      if (var1 == null) {
         return false;
      } else {
         class_1041 var2 = class_310.method_1551().method_22683();
         if (var2 == null) {
            return false;
         } else if (var1.method_1442() == class_307.field_1672) {
            return GLFW.glfwGetMouseButton(var2.method_4490(), var1.method_1444()) == 1;
         } else {
            return var1.method_1442() == class_307.field_1668 ? class_3675.method_15987(var2, var1.method_1444()) : false;
         }
      }
   }

   private static class_306 IilliliilIIi(class_304 key) {
      if (key == null) {
         return null;
      } else {
         class_306 var1 = ((AccessorKeyBinding)key).getBoundKey();
         return var1 != null && var1.method_1444() >= 0 ? var1 : null;
      }
   }
}
