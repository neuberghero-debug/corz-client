package gg.corz;

import java.util.List;

public record lilliiiiilliii(iiiiIIlIIIIlIl chosen, List<iiiiIIlIIIIlIl> candidates) {
   private final List<iiiiIIlIIIIlIl> iIlIllIlIl;
   private final iiiiIIlIIIIlIl lIlIllIlIl;

   public List<iiiiIIlIIIIlIl> iIlIlllllill() {
      return this.iIlIllIlIl;
   }

   public iiiiIIlIIIIlIl liiiIIllIl() {
      return this.lIlIllIlIl;
   }

   public lilliiiiilliii(iiiiIIlIIIIlIl chosen, List<iiiiIIlIIIIlIl> candidates) {
      this.lIlIllIlIl = chosen;
      this.iIlIllIlIl = candidates;
   }

   public boolean IliIlllilIi() {
      return this.lIlIllIlIl != null;
   }
}
