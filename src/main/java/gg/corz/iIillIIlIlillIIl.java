package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class iIillIIlIlillIIl extends ilIllIiIll {
   private int ililiillIl = -1;

   public static void iiiIlIIIll(int slot) {
      if (slot >= 0 && slot <= ((15466895 * -67 * -1643291835 << 11 | 15466895 * -67 * -1643291835 >>> 21) ^ -61 ^ -1088225184)) {
         if (llilIllililIll.iliIiiliiiii(iIillIIlIlillIIl.class) instanceof iIillIIlIlillIIl var1) {
            var1.ililiillIl = slot;
         }
      }
   }

   public iIillIIlIlillIIl() {
      super(IliIlllilIi<"IliIlllilIi","ohRKMng0kawR+a5ffAKKRWkXrI12FpV/ufE3gvwiORVa0n/aXby9l79ZTj1McQ==">(), lllIllillIll.liiIIIIiiiiIIIIi);
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            int var1 = Iiiilllliiilll.field_1724.method_31548().method_67532();
            int var2 = this.ililiillIl;
            this.ililiillIl = var1;
            if (!IIllIIlilIllIIli.Iiilliiliiil() && !IIllIIlilIllIIli.IIIilIIiiIIi()) {
               if (var1 != var2) {
                  if (Iiiilllliiilll.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8281)) {
                     if (GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 1) != 1) {
                        if (Iiiilllliiilll.field_1765 instanceof class_3965 var3
                           && var3.method_17783() == class_240.field_1332
                           && Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var3).method_23665()) {
                           Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void Illillliilli() {
      this.ililiillIl = Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_31548().method_67532() : -1;
   }
}
