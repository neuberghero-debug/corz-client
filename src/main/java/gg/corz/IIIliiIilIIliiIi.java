package gg.corz;

import com.corz.client.mixins.AccessorPlayerInteractEntityC2SPacket;
import net.minecraft.class_2824;

public final class IIIliiIilIIliiIi {
   public static boolean IliIlllilIi(class_2824 packet) {
      IlIiiiillIiiii var1 = new IlIiiiillIiiii();
      packet.method_34209(var1);
      return var1.lIilllIlIl;
   }

   private IIIliiIilIIliiIi() {
   }

   public static int liiiIIllIl(class_2824 packet) {
      return ((AccessorPlayerInteractEntityC2SPacket)packet).getEntityId();
   }
}
