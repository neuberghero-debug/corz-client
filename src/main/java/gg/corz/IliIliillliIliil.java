package gg.corz;

import net.minecraft.class_6575;

final class IliIliillliIliil extends class_6575 {
   private final double ililiIilil;
   private final String lliliIilil;
   private boolean IiiliIilil;

   public int method_43048(int bound) {
      if (!this.IiiliIilil && bound > 0) {
         this.IiiliIilil = true;
         return IIiiIIlilIiiIIli.IlliIiIlIi.IliIlllilIi(this.lliliIilil, bound, this.ililiIilil);
      } else {
         return super.method_43048(bound);
      }
   }

   IliIliillliIliil(long family, String u, double seed) {
      super(family);
      this.lliliIilil = u;
      this.ililiIilil = seed;
   }
}
