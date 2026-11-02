package gg.corz;

import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class IiliiIililiiIi {
   public static final float IiliiIiiililiiIiii = 5.0F;

   public static float liiiIIllIl(class_2338 cover, class_2338 self, iIIlIIiIlIlIIi anchor) {
      class_746 var3 = class_310.method_1551().field_1724;
      if (var3 != null && cover != null) {
         class_243 var4 = anchor != null ? anchor.IliIlllilIi() : var3.method_73189();
         class_238 var5 = anchor != null ? anchor.liiiIIllIl() : var3.method_5829();
         return lllIliIlillIliIl.IlIllllIll(var3, class_243.method_24953(cover), var4, var5, self, cover, 5.0F);
      } else {
         return 0.0F;
      }
   }

   public static float IliIlllilIi(class_1309 cover, iIIlIIiIlIlIIi at, class_2338 e, class_2338 anchor) {
      if (cover != null && e != null) {
         class_243 var4 = at != null ? at.IliIlllilIi() : cover.method_73189();
         class_238 var5 = at != null ? at.liiiIIllIl() : cover.method_5829();
         return lllIliIlillIliIl.IlIllllIll(cover, class_243.method_24953(e), var4, var5, anchor, e, 5.0F);
      } else {
         return 0.0F;
      }
   }

   private IiliiIililiiIi() {
   }
}
