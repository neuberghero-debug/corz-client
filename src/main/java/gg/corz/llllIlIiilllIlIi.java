package gg.corz;

import net.minecraft.class_1309;
import net.minecraft.class_243;

record llllIlIiilllIlIi(class_1309 entity, class_243 serverPos, double dist, boolean keep) {
   private final class_1309 IlilIIIIIi;
   private final boolean IiilIIIIIi;
   private final class_243 llilIIIIIi;
   private final double ililIIIIIi;

   public double iIlIlllllill() {
      return this.ililIIIIIi;
   }

   public class_1309 IliIlllilIi() {
      return this.IlilIIIIIi;
   }

   private llllIlIiilllIlIi(class_1309 entity, class_243 serverPos, double dist, boolean keep) {
      this.IlilIIIIIi = entity;
      this.llilIIIIIi = serverPos;
      this.ililIIIIIi = dist;
      this.IiilIIIIIi = keep;
   }

   public class_243 liiiIIllIl() {
      return this.llilIIIIIi;
   }

   public boolean IilliliilIIi() {
      return this.IiilIIIIIi;
   }
}
