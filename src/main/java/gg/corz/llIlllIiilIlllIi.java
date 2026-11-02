package gg.corz;

import net.minecraft.class_3965;

public record llIlllIiilIlllIi(class_3965 hit, ilIiIllIiIiIll reject, String detail) {
   private final class_3965 lIiiliIIIi;
   private final ilIiIllIiIiIll iIiiliIIIi;
   private final String IliiliIIIi;

   public llIlllIiilIlllIi(class_3965 hit, ilIiIllIiIiIll reject, String detail) {
      this.lIiiliIIIi = hit;
      this.iIiiliIIIi = reject;
      this.IliiliIIIi = detail;
   }

   public String iliIiiliiiii() {
      return this.IliiliIIIi;
   }

   public static llIlllIiilIlllIi liiiIIllIl(class_3965 hit) {
      return new llIlllIiilIlllIi(hit, ilIiIllIiIiIll.illilIlilIililIlil, null);
   }

   public class_3965 IilliliilIIi() {
      return this.lIiiliIIIi;
   }

   public boolean IliIlllilIi() {
      return this.lIiiliIIIi != null;
   }

   public ilIiIllIiIiIll lIiiIiIlilli() {
      return this.iIiiliIIIi;
   }

   public static llIlllIiilIlllIi iIlIlllllill(ilIiIllIiIiIll detail, String r) {
      return new llIlllIiilIlllIi(null, detail, r);
   }
}
