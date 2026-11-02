package gg.corz;

import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

public class IllillIllllillIl extends ilIllIiIll {
   private int llIlIlliIl;
   private final iiIiiilIIliiil IlIlIlliIl = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","wxcDfUQfhaCpYbQqXkyBPZmyIrRz2vTQutEP+Z0iTb/aT1vEGA==">(),
      IliIlllilIi<"IliIlllilIi","ToWXJnZ5f5Fxr5ES14pJceWP3TCWwxPWUVLg4EadGQ1UdaOq1yB5OShXEmgk4LT/BI1lu798YtZtLq6otkX8F5FvI8jfDemw/caVWUY=">(),
      true
   );

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         class_2338 var1 = this.iiiIlIIIll();
         if (var1 == null) {
            this.lIIlliIIll();
         } else {
            class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(var1);
            if (var2.method_26215()) {
               this.lIIlliIIll();
            } else {
               class_1661 var3 = Iiiilllliiilll.field_1724.method_31548();
               int var4 = var3.method_67532();
               float[] var5 = new float[class_1661.method_7368()];
               boolean[] var6 = new boolean[var5.length];

               for (int var7 = 0; var7 < var5.length; var7++) {
                  class_1799 var8 = var3.method_5438(var7);
                  var5[var7] = var8.method_7924(var2);
                  var6[var7] = var8.method_7951(var2);
               }

               int var9 = IIiiIlilIiiIli.IliIlllilIi(var5, var6, var4);
               if (var9 != var4) {
                  if (this.llIlIlliIl < 0) {
                     this.llIlIlliIl = var4;
                  }

                  var3.method_61496(var9);
               }
            }
         }
      }
   }

   public IllillIllllillIl() {
      super(IliIlllilIi<"IliIlllilIi","oZUJcmds0j/mqZ4xQ+OP97tmgflhLuJqIAWJ/JMRZftsjrar">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.llIlIlliIl = -1;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlIlIlliIl});
   }

   private void lIIlliIIll() {
      if (!this.IlIlIlliIl.Iilllilliill()) {
         this.llIlIlliIl = -1;
      } else if (this.llIlIlliIl >= 0 && Iiiilllliiilll.field_1724 != null) {
         if (this.llIlIlliIl >= 0 && this.llIlIlliIl < class_1661.method_7368()) {
            Iiiilllliiilll.field_1724.method_31548().method_61496(this.llIlIlliIl);
         }

         this.llIlIlliIl = -1;
      }
   }

   private class_2338 iiiIlIIIll() {
      if (!Iiiilllliiilll.field_1690.field_1886.method_1434()) {
         return null;
      } else if (Iiiilllliiilll.field_1765 instanceof class_3965 var1) {
         return var1.method_17783() != class_240.field_1332 ? null : var1.method_17777();
      } else {
         return null;
      }
   }

   @Override
   protected void Iilililiiili() {
      this.lIIlliIIll();
   }
}
