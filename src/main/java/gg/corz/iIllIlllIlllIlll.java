package gg.corz;

import net.minecraft.class_243;

public record iIllIlllIlllIlll(class_243 anchor, iiIIllIlIIlIllIl kind, class_243 prefer) {
   private final iiIIllIlIIlIllIl lliIiIIill;
   private final class_243 IliIiIIill;
   private final class_243 iliIiIIill;

   public class_243 IlIlllIlilIl() {
      return this.iliIiIIill;
   }

   public class_243 lIiiIiIlilli() {
      return this.iliIiIIill != null ? this.iliIiIIill : this.IliIiIIill;
   }

   public iiIIllIlIIlIllIl IIIllIIliIIl() {
      return this.lliIiIIill;
   }

   public iIllIlllIlllIlll(class_243 anchor, iiIIllIlIIlIllIl kind, class_243 prefer) {
      if (kind == null) {
         kind = iiIIllIlIIlIllIl.lIililIiIl;
      }

      this.IliIiIIill = anchor;
      this.lliIiIIill = kind;
      this.iliIiIIill = prefer;
   }

   public static iIllIlllIlllIlll iIlIlllllill(class_243 prefer, class_243 targetFeet) {
      return new iIllIlllIlllIlll(prefer, iiIIllIlIIlIllIl.iIililIiIl, targetFeet);
   }

   public static iIllIlllIlllIlll liiiIIllIl(class_243 prefer, class_243 targetFeet) {
      return new iIllIlllIlllIlll(prefer, iiIIllIlIIlIllIl.iillilIiIl, targetFeet);
   }

   public static iIllIlllIlllIlll IliIlllilIi(class_243 at) {
      return new iIllIlllIlllIlll(at, iiIIllIlIIlIllIl.lIililIiIl, at);
   }

   public static iIllIlllIlllIlll IilliliilIIi(class_243 prefer, class_243 crystalCentre) {
      return new iIllIlllIlllIlll(prefer, iiIIllIlIIlIllIl.IIililIiIl, crystalCentre);
   }

   public class_243 iliIiiliiiii() {
      return this.IliIiIIill;
   }
}
