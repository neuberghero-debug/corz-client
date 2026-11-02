package gg.corz;

import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_2824;
import net.minecraft.class_1297.class_5529;

public class IliliIIllliliIIl extends ilIllIiIll {
   public IliliIIllliliIIl() {
      super(IliIlllilIi<"IliIlllilIi","3c5o+NgLQCKBOg2npOotH6l6ZO0NdfsLyuoQfhmGTvloKpBwTwdyKYSQdls3">(), lllIllillIll.liiIIIIiiiiIIIIi);
   }

   @Override
   public void llIIlilIIl(IiIiIlIiliIiIlIi packetSendEvent) {
      if (packetSendEvent.lIiilIIIIi instanceof class_2824 var2) {
         if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
            if (IIIliiIilIIliiIi.IliIlllilIi(var2)) {
               class_1297 var4 = Iiiilllliiilll.field_1687.method_8469(IIIliiIilIIliiIi.liiiIIllIl(var2));
               if (var4 instanceof class_1511) {
                  if (Iiiilllliiilll.field_1724.method_6112(class_1294.field_5911) == null) {
                     var4.method_31745(class_5529.field_26998);
                     var4.method_36209();
                  }
               }
            }
         }
      }
   }
}
