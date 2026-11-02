package gg.corz;

import net.minecraft.class_243;

record llIiliIiilIiliIi(int id, class_243 eye, long lastSwing) {
   private final long lliiiliIIi;
   private final class_243 IliiiliIIi;
   private final int iIiiiliIIi;

   public class_243 liiiIIllIl() {
      return this.IliiiliIIi;
   }

   public long iIlIlllllill() {
      return this.lliiiliIIi;
   }

   llIiliIiilIiliIi(int id, class_243 eye, long lastSwing) {
      this.iIiiiliIIi = id;
      this.IliiiliIIi = eye;
      this.lliiiliIIi = lastSwing;
   }

   public int IliIlllilIi() {
      return this.iIiiiliIIi;
   }
}
