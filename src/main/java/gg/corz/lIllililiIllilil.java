package gg.corz;

import net.minecraft.class_243;

record lIllililiIllilil(class_243 point, float yaw, float pitch, double angle) {
   private final float lIiiIlIlil;
   private final float IIiiIlIlil;
   private final double iIiiIlIlil;
   private final class_243 iiliIlIlil;

   public float liiiIIllIl() {
      return this.IIiiIlIlil;
   }

   public class_243 IliIlllilIi() {
      return this.iiliIlIlil;
   }

   public float iIlIlllllill() {
      return this.lIiiIlIlil;
   }

   public double IilliliilIIi() {
      return this.iIiiIlIlil;
   }

   private lIllililiIllilil(class_243 point, float yaw, float pitch, double angle) {
      this.iiliIlIlil = point;
      this.IIiiIlIlil = yaw;
      this.lIiiIlIlil = pitch;
      this.iIiiIlIlil = angle;
   }
}
