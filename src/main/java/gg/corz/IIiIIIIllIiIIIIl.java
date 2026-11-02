package gg.corz;

import net.minecraft.class_310;
import net.minecraft.class_746;

public final class IIiIIIIllIiIIIIl {
   private final liiIiiiiiiIiii IllIliIlIl;

   public void IliIlllilIi(iIIlIlIlIlIlIlIl e, boolean run) {
      if (e != null && run && this.IllIliIlIl != null && !e.Iilllilliill()) {
         if (!lilIliIiiilIliIi.iiiIlIIIll() && !iIIilIIiIlIilIIi.lIIlliIIll()) {
            class_746 var3 = class_310.method_1551().field_1724;
            if (var3 != null) {
               if (this.IllIliIlIl.iIlIlllllill(IIllIIlilIllIIli.IlIlllIlilIl(), var3.method_36454(), var3.method_36455())) {
                  float var4 = e.Illlllllilll();
                  e.IlIlllIlilIl(this.IllIliIlIl.IilliliilIIi(var4));
                  e.IIlllIlliIll(this.IllIliIlIl.lIiiIiIlilli(var4));
                  e.IIillIiliIil();
               }
            }
         }
      }
   }

   public IIiIIIIllIiIIIIl(liiIiiiiiiIiii lerp) {
      this.IllIliIlIl = lerp;
   }
}
