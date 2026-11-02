package gg.corz;

import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1802;

public class IIIIIIlilIIIIIli extends ilIllIiIll {
   private final iilliIlIIiliIl llIiiIIlIi = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","+IT/lVh+14PUQfcCHx8q5vJU5p1IGuHU426+/AXWoQxI">(),
      IliIlllilIi<"IliIlllilIi","U/l1wNPojIwQAbiKPme2uSw0WrXLP7DS01ziessMHSuKCIggvohcSldnRiqd3cLtHAIsG6vrmEV2QKE+VVTIGKJtpbBAWtL9pg==">(),
      0,
      1,
      5
   );
   private int ilIiiIIlIi;

   @Override
   public void Illillliilli() {
      this.ilIiiIIlIi = 0;
   }

   @Override
   public void Iilililiiili() {
      this.ilIiiIIlIi = 0;
   }

   private static int iiiIlIIIll(int slotIndex) {
      return slotIndex < ((-1067875226 >>> 25 | -1067875226 << 7) * 723362913 ^ 1348401001)
         ? (((-498269770 - 121) * -2083697005 << 13 | (-498269770 - 121) * -2083697005 >>> 19) ^ 696316810) + slotIndex
         : slotIndex;
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(40).method_31574(class_1802.field_8288)) {
            this.ilIiiIIlIi = this.llIiiIIlIi.Iilllilliill();
         } else if (this.ilIiiIIlIi > 0) {
            this.ilIiiIIlIi--;
         } else {
            int var1 = this.lIIlliIIll(class_1802.field_8288);
            if (var1 != -1) {
               if (lIlillliIlilll.IliIlllilIi(this)) {
                  try {
                     Iiiilllliiilll.field_1761
                        .method_2906(Iiiilllliiilll.field_1724.field_7512.field_7763, iiiIlIIIll(var1), 40, class_1713.field_7791, Iiiilllliiilll.field_1724);
                  } finally {
                     lIlillliIlilll.liiiIIllIl(this);
                  }

                  this.ilIiiIIlIi = this.llIiiIIlIi.Iilllilliill();
               }
            }
         }
      }
   }

   public IIIIIIlilIIIIIli() {
      super(IliIlllilIi<"IliIlllilIi","Sx2L+tznWO3/ha4HfrTEXcycaDt6/Hu/kEIJZnah72jrBVDokwI=">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIiiIIlIi});
      this.ilIiiIIlIi = 0;
   }

   private int lIIlliIIll(class_1792 item) {
      if (Iiiilllliiilll.field_1724 == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            if (Iiiilllliiilll.field_1724.method_31548().method_5438(var2).method_31574(item)) {
               return var2;
            }
         }

         return -1;
      }
   }
}
