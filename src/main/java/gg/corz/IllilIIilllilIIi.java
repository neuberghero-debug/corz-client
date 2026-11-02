package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2824;
import net.minecraft.class_2879;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2828.class_2829;

public class IllilIIilllilIIi extends ilIllIiIll {
   private boolean lIiilIiiil;
   private int IIiilIiiil;
   public final lliliIIiililiIIi lililIiiil = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","FQ2x0Ot/b22PVdaZmFQBvSmZlQne9B6wVG0Dhz5tNs8=">(),
      IliIlllilIi<"IliIlllilIi","5utVbd5b0iG7Gqtpige6hGDfAVrrXgM8CL8JuER6HMRAZICiE39gxrvump91+TtAKg7Ufzdz6AdTvLVrcOBt4H/HwUCRPaciKAfQfR6v">(),
      IliIlllilIi<"IliIlllilIi","wAxN/SRPIBVJV7VnFhHrFcf/prF6isyAlt2wCa+jnloL">(),
      IliIlllilIi<"IliIlllilIi","wAxN/SRPIBVJV7VnFhHrFcf/prF6isyAlt2wCa+jnloL">(),
      IliIlllilIi<"IliIlllilIi","a3H4A1seygZ1w8ATqgbCkxk/ozsNVlFGnaAjYSAoSA7MGCE=">(),
      IliIlllilIi<"IliIlllilIi","79hE5dPdZ26HAB8MqUG3YoA8BQ/Jff5103/4mLVPwyYxvQ==">()
   );
   private class_2824 iililIiiil;

   @Override
   protected void Iilililiiili() {
      this.iililIiiil = null;
      this.IIiilIiiil = 0;
      this.lIiilIiiil = false;
   }

   public IllilIIilllilIIi() {
      super(IliIlllilIi<"IliIlllilIi","iUsSmYt+B+L1XoujdL4lTTJR3bILVXGCwO1YL1oQ+fRcBg8njg==">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lililIiiil});
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (this.iiiIlIIIll() && !this.lIiilIiiil) {
         if (event.lIiilIIIIi instanceof class_2824 var2 && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
            class_1297 var5 = Iiiilllliiilll.field_1687.method_8469(IIIliiIilIIliiIi.liiiIIllIl(var2));
            if (!(var5 instanceof class_1657)) {
               return;
            }

            if (this.lililIiiil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","79hE5dPdZ26HAB8MqUG3YoA8BQ/Jff5103/4mLVPwyYxvQ==">())) {
               this.lIIlliIIll(0.0625F);
               this.lIIlliIIll(0.0F);
            } else {
               this.iililIiiil = var2;
               if (this.lililIiiil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","wAxN/SRPIBVJV7VnFhHrFcf/prF6isyAlt2wCa+jnloL">())) {
                  Iiiilllliiilll.field_1724.method_6043();
               } else {
                  class_243 var4 = Iiiilllliiilll.field_1724.method_18798();
                  Iiiilllliiilll.field_1724
                     .method_18799(
                        new class_243(
                           var4.field_1352, var4.field_1351 + Double.longBitsToDouble(-1256261084195756056L ^ -3363082812538333989L), var4.field_1350
                        )
                     );
               }

               this.IIiilIiiil = this.lililIiiil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","wAxN/SRPIBVJV7VnFhHrFcf/prF6isyAlt2wCa+jnloL">())
                  ? (
                        ((-1903891471 << 3 | -1903891471 >>> 29) << 19 | (-1903891471 << 3 | -1903891471 >>> 29) >>> 13) << 1
                           | ((-1903891471 << 3 | -1903891471 >>> 29) << 19 | (-1903891471 << 3 | -1903891471 >>> 29) >>> 13) >>> 31
                     )
                     ^ -121159053
                  : 1;
               event.IliIlllilIi();
            }
         }

         if (event.lIiilIIIIi instanceof class_2879
            && !this.lililIiiil.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","79hE5dPdZ26HAB8MqUG3YoA8BQ/Jff5103/4mLVPwyYxvQ==">())
            && this.iililIiiil != null) {
            event.IliIlllilIi();
         }
      }
   }

   private void lIIlliIIll(float dy) {
      Iiiilllliiilll.field_1724
         .field_3944
         .method_52787(
            new class_2829(
               Iiiilllliiilll.field_1724.method_23317(),
               Iiiilllliiilll.field_1724.method_23318() + (double)dy,
               Iiiilllliiilll.field_1724.method_23321(),
               false,
               Iiiilllliiilll.field_1724.field_5976
            )
         );
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.iililIiiil != null) {
         if (this.IIiilIiiil > 0) {
            this.IIiilIiiil--;
         } else {
            this.lIiilIiiil = true;
            class_239 var1 = Iiiilllliiilll.field_1765;
            if (var1 != null && var1.method_17783() == class_240.field_1331 && Iiiilllliiilll.field_1724 != null) {
               Iiiilllliiilll.field_1724.field_3944.method_52787(this.iililIiiil);
               Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
            }

            this.lIiilIiiil = false;
            this.iililIiiil = null;
         }
      }
   }

   private boolean iiiIlIIIll() {
      return Iiiilllliiilll.field_1724 != null
         && Iiiilllliiilll.field_1687 != null
         && Iiiilllliiilll.field_1724.method_24828()
         && !Iiiilllliiilll.field_1724.method_5869()
         && !Iiiilllliiilll.field_1724.method_5771()
         && !Iiiilllliiilll.field_1724.method_6101();
   }
}
