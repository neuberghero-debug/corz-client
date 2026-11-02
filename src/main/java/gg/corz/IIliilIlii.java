package gg.corz;

import net.minecraft.class_2338;

record IIliilIlii(class_2338 feet, iiiIllilIIIlllil aim, int pathTicks, boolean cover, double score) {
   private final boolean IIIillIllIIillIl;
   private final double iIIillIlIlIillIl;
   private final int liilllIliiilllIl;
   private final class_2338 IlilllIlllilllIl;
   private final iiiIllilIIIlllil ililllIlIiilllIl;

   public double lIiiIiIlilli() {
      return this.iIIillIlIlIillIl;
   }

   IIliilIlii(class_2338 feet, iiiIllilIIIlllil aim, int pathTicks, boolean cover, double score) {
      this.IlilllIlllilllIl = feet;
      this.ililllIlIiilllIl = aim;
      this.liilllIliiilllIl = pathTicks;
      this.IIIillIllIIillIl = cover;
      this.iIIillIlIlIillIl = score;
   }

   public boolean IilliliilIIi() {
      return this.IIIillIllIIillIl;
   }

   public class_2338 IliIlllilIi() {
      return this.IlilllIlllilllIl;
   }

   public iiiIllilIIIlllil liiiIIllIl() {
      return this.ililllIlIiilllIl;
   }

   public int iIlIlllllill() {
      return this.liilllIliiilllIl;
   }
}
