package gg.corz;

import net.minecraft.class_2338;

record iililliIIiilli(iIiIiilIliIiil shot, class_2338 base, double score) {
   private final class_2338 iiIiliIIIl;
   private final iIiIiilIliIiil liIiliIIIl;
   private final double IIliliIIIl;

   public class_2338 liiiIIllIl() {
      return this.iiIiliIIIl;
   }

   private iililliIIiilli(iIiIiilIliIiil shot, class_2338 base, double score) {
      this.liIiliIIIl = shot;
      this.iiIiliIIIl = base;
      this.IIliliIIIl = score;
   }

   public double iIlIlllllill() {
      return this.IIliliIIIl;
   }

   public iIiIiilIliIiil IliIlllilIi() {
      return this.liIiliIIIl;
   }
}
