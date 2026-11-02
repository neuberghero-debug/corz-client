package gg.corz;

import net.minecraft.class_2350;
import net.minecraft.class_2350.class_2351;

public record liIIilliiIIill(class_2350 supportDir, class_2350 lookDir, Float yaw, class_2351 axis, boolean sixWay) {
   private final class_2350 IiIiilIIiliIiilIIi;
   private final boolean illiilIIiIiliilIIi;
   private final Float lIliilIIiiIliilIIi;
   private final class_2351 IlliilIIillliilIIi;
   private final class_2350 iiIiilIIiIIliilIIi;

   public class_2350 liiiIIllIl() {
      return this.iiIiilIIiIIliilIIi;
   }

   public boolean lIiiIiIlilli() {
      return this.illiilIIiIiliilIIi;
   }

   public liIIilliiIIill(class_2350 supportDir, class_2350 lookDir, Float yaw, class_2351 axis, boolean sixWay) {
      this.IiIiilIIiliIiilIIi = supportDir;
      this.iiIiilIIiIIliilIIi = lookDir;
      this.lIliilIIiiIliilIIi = yaw;
      this.IlliilIIillliilIIi = axis;
      this.illiilIIiIiliilIIi = sixWay;
   }

   public Float iIlIlllllill() {
      return this.lIliilIIiiIliilIIi;
   }

   public class_2351 IilliliilIIi() {
      return this.IlliilIIillliilIIi;
   }

   public class_2350 IliIlllilIi() {
      return this.IiIiilIIiliIiilIIi;
   }
}
