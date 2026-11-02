package gg.corz;

import net.minecraft.class_243;

final class IIlIIlllIlIIll {
   lIililiIilil liiIlIIiliiiIlIIil;
   double iliIlIIilIiiIlIIil = Double.NaN;

   private IIlIIlllIlIIll() {
   }

   lIililiIilil IliIlllilIi(class_243 spawn, float motion, double p, double[] yaw) {
      if (p == this.iliIlIIilIiiIlIIil && this.liiIlIIiliiiIlIIil != null) {
         return this.liiIlIIiliiiIlIIil;
      } else {
         double[] var6 = Iilllilillli.IliIlllilIi(motion, (float)p, yaw[0], yaw[1], yaw[2]);
         this.liiIlIIiliiiIlIIil = liIiililiiIiilil.iIlIlllllill(spawn, new class_243(var6[0], var6[1], var6[2]), 200);
         this.iliIlIIilIiiIlIIil = p;
         return this.liiIlIIiliiiIlIIil;
      }
   }
}
