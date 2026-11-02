package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_243;

record llilllIiililllIi(float pitch, class_243 landing, class_2338 stand, int flight) {
   private final int liIiiiIIIi;
   private final class_2338 IiIiiiIIIi;
   private final class_243 ilIiiiIIIi;
   private final float llIiiiIIIi;

   public float IliIlllilIi() {
      return this.llIiiiIIIi;
   }

   public int IilliliilIIi() {
      return this.liIiiiIIIi;
   }

   private llilllIiililllIi(float pitch, class_243 landing, class_2338 stand, int flight) {
      this.llIiiiIIIi = pitch;
      this.ilIiiiIIIi = landing;
      this.IiIiiiIIIi = stand;
      this.liIiiiIIIi = flight;
   }

   public class_243 liiiIIllIl() {
      return this.ilIiiiIIIi;
   }

   public class_2338 iIlIlllllill() {
      return this.IiIiiiIIIi;
   }
}
