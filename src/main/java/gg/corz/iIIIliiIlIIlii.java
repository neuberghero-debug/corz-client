package gg.corz;

import java.util.List;

public record iIIIliiIlIIlii(lIiliiliIiliil target, String reason, List<lIiliiliIiliil> dependsOn) {
   private final lIiliiliIiliil iIiilIiIIl;
   private final List<lIiliiliIiliil> lliilIiIIl;
   private final String IliilIiIIl;

   @Override
   public String toString() {
      return this.iIiilIiIIl
         + IilliliilIIi<"IilliliilIIi","XePQREsShfj8xodHAAO70MU/UWupSWz2V7p1USA=">()
         + this.IliilIiIIl
         + (this.lliilIiIIl.isEmpty() ? "" : IilliliilIIi<"IilliliilIIi","Yf5QItUpMADgzlo3OlOGcYxwUoq5JqKKGFZiim+JbclmSlKqNmqs">() + this.lliilIiIIl);
   }

   public iIIIliiIlIIlii(lIiliiliIiliil target, String reason, List<lIiliiliIiliil> dependsOn) {
      this.iIiilIiIIl = target;
      this.IliilIiIIl = reason;
      this.lliilIiIIl = dependsOn;
   }

   public List<lIiliiliIiliil> iIlIlllllill() {
      return this.lliilIiIIl;
   }

   public String liiiIIllIl() {
      return this.IliilIiIIl;
   }

   public lIiliiliIiliil IliIlllilIi() {
      return this.iIiilIiIIl;
   }
}
