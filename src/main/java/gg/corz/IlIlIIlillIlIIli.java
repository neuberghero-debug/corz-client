package gg.corz;

import net.minecraft.class_2338;

record IlIlIIlillIlIIli(class_2338 cell, int hits, double dist) {
   private final double lIlIllIlIi;
   private final class_2338 iiIIllIlIi;
   private final int IIlIllIlIi;

   private IlIlIIlillIlIIli(class_2338 cell, int hits, double dist) {
      this.iiIIllIlIi = cell;
      this.IIlIllIlIi = hits;
      this.lIlIllIlIi = dist;
   }

   public int liiiIIllIl() {
      return this.IIlIllIlIi;
   }

   public class_2338 IliIlllilIi() {
      return this.iiIIllIlIi;
   }

   public double iIlIlllllill() {
      return this.lIlIllIlIi;
   }
}
