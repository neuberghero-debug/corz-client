package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1811;
import net.minecraft.class_9334;

public class liiiIliliiiiIlil extends ilIllIiIll {
   private final iiIiiilIIliiil iIllIliIil;
   private final iilliIlIIiliIl llllIliIil;
   private final iiIiiilIIliiil IlllIliIil;
   private final iiIiiilIIliiil lIllIliIil = new iiIiiilIIliiil(IliIlllilIi<"IliIlllilIi","JGZ8RFk8Sl2D6Y7vgBOi8pzG/HDC1jpFw0Qb2hh6un5OsgQ=">(), "", false);
   private final iiIiiilIIliiil illlIliIil;

   @Override
   public void Iiiiliiiiiii(iillIIIlIIilIIIl postItemUseEvent) {
      long var9 = 7330219789139530028L;
      class_1799 var2 = Iiiilllliiilll.field_1724.method_6047();
      class_1799 var3 = Iiiilllliiilll.field_1724.method_6079();
      class_1792 var4 = var2.method_7909();
      class_1792 var5 = Iiiilllliiilll.field_1724.method_6079().method_7909();
      if (var2.method_31574(class_1802.field_8287) || var3.method_31574(class_1802.field_8287) || !this.lIllIliIil.Iilllilliill()) {
         if (!this.lIllIliIil.Iilllilliill()) {
            if (!(var4 instanceof class_1747) && !(var5 instanceof class_1747)) {
               if (!this.IlllIliIil.Iilllilliill()) {
                  return;
               }
            } else if (!this.iIllIliIil.Iilllilliill()) {
               return;
            }
         }

         if (var4.method_57347().method_58694(class_9334.field_50075) == null) {
            if (var5.method_57347().method_58694(class_9334.field_50075) == null) {
               if (!var2.method_31574(class_1802.field_23141)
                  && !var2.method_31574(class_1802.field_8801)
                  && !var3.method_31574(class_1802.field_23141)
                  && !var3.method_31574(class_1802.field_8801)) {
                  if (!(var4 instanceof class_1811) && !(var5 instanceof class_1811)) {
                     var9 ^= ((long)this.llllIliIil.Iilllilliill() << 32 ^ var9) & -1L << 32;
                     if (this.illlIliIil.Iilllilliill()
                        && (int)(var9 >>> 32) < (((1647550336 << 15 | 1647550336 >>> 17) >>> 5 | (1647550336 << 15 | 1647550336 >>> 17) << 27) ^ -830602870)) {
                        double var7 = ThreadLocalRandom.current().nextDouble();
                        var9 ^= (
                              (long)(
                                       var7 < Double.longBitsToDouble(-2504635550070227836L ^ -2120027032935586530L)
                                          ? 4
                                          : (var7 < Double.longBitsToDouble(3532943879134111274L ^ 1068684132455732505L) ? 3 : 2)
                                    )
                                    << 32
                                 ^ var9
                           )
                           & -1L << 32;
                     }

                     postItemUseEvent.iillIIllIl = (int)(var9 >>> 32);
                  }
               }
            }
         }
      }
   }

   public liiiIliliiiiIlil() {
      super(IliIlllilIi<"IliIlllilIi","fduYSwja3AX5xHED63QlpWGxIgUREB/ZibKZIB+E1vRms5/lIn4=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iIllIliIil = new iiIiiilIIliiil(IliIlllilIi<"IliIlllilIi","h4xuya7pJ5RB0jpa5uHOG/tLl+pKvbvykzM64DaYqlmD9Q==">(), "", true);
      this.IlllIliIil = new iiIiiilIIliiil(IliIlllilIi<"IliIlllilIi","87ho91TDxIXum6tZeKy75f4WGWdfzr0XObjN73Vk/kHi">(), "", true);
      this.llllIliIil = new iilliIlIIiliIl(IliIlllilIi<"IliIlllilIi","rtaUph2UICHIZUCsxzgiDYgVijpFUERwHOq3Ci+xO6+V">(), "", 0, 0, 10);
      this.illlIliIil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","CaJlaYj61+YKWUZICdS2e5Gd5QQG/mbYX3hrOvvgVq5gN5RPHfnYqAnF">(),
         IliIlllilIi<"IliIlllilIi","iXbb3eFeh3kCWiHhY2cjjc+08njXbqWGJNyq6gPgk1U658OlTXtCTIOLRVbAYkPKgnYpr8cUFNjpDYojMpg6pbuTi9qoZ9/7sxYvlzhKvvUM/an4hnvjdqQbLNd4SxYurYa32hDLO7r0ZMMuvuUWcesyEp/CzFI2wlStL78MJG993De8nLjOo86ZdevQyn7Y3ZI5wHudVQ12TjfCETLCj7ms1RxgXb6w9WPVI0WhtCBMYTX470gMAaGjy+zZBq5RbkquV+w19vvxhkw=">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIllIliIil, this.iIllIliIil, this.IlllIliIil, this.llllIliIil, this.illlIliIil});
   }
}
