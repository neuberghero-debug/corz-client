package gg.corz;

import net.minecraft.class_2338;

public record lIiIIiiIiIIi(class_2338 from, class_2338 to, iiiIIiilIIIlIiil kind, IllIlilllIli primitive, IilIlIlililIlIli result) {
   private final class_2338 ilIIiiiiIiIIiiii;
   private final class_2338 IlIIiiiillIIiiii;
   private final IilIlIlililIlIli iIlIiiiiIllIiiii;
   private final IllIlilllIli IIlIiiiilIlIiiii;
   private final iiiIIiilIIIlIiil liIIiiiiiiIIiiii;

   public IilIlIlililIlIli lIiiIiIlilli() {
      return this.iIlIiiiiIllIiiii;
   }

   public class_2338 liiiIIllIl() {
      return this.ilIIiiiiIiIIiiii;
   }

   public class_2338 IliIlllilIi() {
      return this.IlIIiiiillIIiiii;
   }

   public lIiIIiiIiIIi(class_2338 from, class_2338 to, iiiIIiilIIIlIiil kind, IllIlilllIli primitive, IilIlIlililIlIli result) {
      this.IlIIiiiillIIiiii = from;
      this.ilIIiiiiIiIIiiii = to;
      this.liIIiiiiiiIIiiii = kind;
      this.IIlIiiiilIlIiiii = primitive;
      this.iIlIiiiiIllIiiii = result;
   }

   public IllIlilllIli IilliliilIIi() {
      return this.IIlIiiiilIlIiiii;
   }

   public iiiIIiilIIIlIiil iIlIlllllill() {
      return this.liIIiiiiiiIIiiii;
   }
}
