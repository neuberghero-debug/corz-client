package gg.corz;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.class_745;
import net.minecraft.class_1297.class_5529;

public class Iliiilillliiilil extends ilIllIiIll {
   private class_745 Iillilllil;

   public Iliiilillliiilil() {
      super(IliIlllilIi<"IliIlllilIi","1omaqm0SFZ+C2+QYPJyc0mcDF0IbZrdrUIpF/Ea/3KsAmXiY5FFm">(), lllIllillIll.IiIlIIIiliIlIIIi);
   }

   @Override
   public void Iilililiiili() {
      if (this.Iillilllil != null && Iiiilllliiilll.field_1687 != null) {
         Iiiilllliiilll.field_1687.method_2945(this.Iillilllil.method_5628(), class_5529.field_26999);
         this.Iillilllil = null;
      }
   }

   @Override
   public void Illillliilli() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         GameProfile var1 = new GameProfile(UUID.randomUUID(), IliIlllilIi<"IliIlllilIi","GcnhxwBarbELpcLtqmdR6t4166bv7ksyDJzT+lYZsgj3NUJe7Io=">());
         this.Iillilllil = new class_745(Iiiilllliiilll.field_1687, var1);
         this.Iillilllil.method_5719(Iiiilllliiilll.field_1724);
         this.Iillilllil.method_31548().method_7377(Iiiilllliiilll.field_1724.method_31548());
         Iiiilllliiilll.field_1687.method_53875(this.Iillilllil);
      } else {
         this.IIillIiliIil(false);
      }
   }
}
