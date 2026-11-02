package gg.corz;

import net.minecraft.class_3532;

public class iIIilIIiIlIilIIi extends ilIllIiIll {
   private float IIllIIiiil;
   private float iiIlIIiiil;
   private float liIlIIiiil;
   private float IiIlIIiiil;

   @Override
   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      float var2 = e.Illlllllilll();
      e.IlIlllIlilIl(class_3532.method_16439(var2, this.iiIlIIiiil, this.IiIlIIiiil));
      e.IIlllIlliIll(class_3532.method_16439(var2, this.IIllIIiiil, this.liIlIIiiil));
      e.IIillIiliIil();
   }

   public static boolean lIIlliIIll() {
      iIIilIIiIlIilIIi var0 = (iIIilIIiIlIilIIi)llilIllililIll.iliIiiliiiii(iIIilIIiIlIilIIi.class);
      return var0 != null && var0.IliIlllilIi();
   }

   @Override
   public void Illillliilli() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.IiIlIIiiil = this.iiIlIIiiil = Iiiilllliiilll.field_1724.method_36454();
         this.liIlIIiiil = this.IIllIIiiil = Iiiilllliiilll.field_1724.method_36455();
      }
   }

   public void iiiIlIIIll(double deltaYaw, double deltaPitch) {
      this.iiIlIIiiil = this.IiIlIIiiil;
      this.IIllIIiiil = this.liIlIIiiil;
      this.IiIlIIiiil += (float)(deltaYaw * 0.15);
      this.liIlIIiiil = class_3532.method_15363(this.liIlIIiiil + (float)(deltaPitch * 0.15), -90.0F, 90.0F);
   }

   public iIIilIIiIlIilIIi() {
      super(IliIlllilIi<"IliIlllilIi","mz+MvaWh6cXHDPnjd6ukNyFM7PrvRQEl/WJLZEWKQNShxtcc">(), lllIllillIll.llIlIIIiilIlIIIi);
   }
}
