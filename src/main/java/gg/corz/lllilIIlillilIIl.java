package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2680;

record lllilIIlillilIIl(class_2338 pos, class_2680 original, int brokeTick) {
   private final class_2680 lIIIIIilIl;
   private final int iIIIIIilIl;
   private final class_2338 IIIIIIilIl;

   public int iIlIlllllill() {
      return this.iIIIIIilIl;
   }

   private lllilIIlillilIIl(class_2338 pos, class_2680 original, int brokeTick) {
      this.IIIIIIilIl = pos;
      this.lIIIIIilIl = original;
      this.iIIIIIilIl = brokeTick;
   }

   public class_2680 liiiIIllIl() {
      return this.lIIIIIilIl;
   }

   public class_2338 IliIlllilIi() {
      return this.IIIIIIilIl;
   }
}
