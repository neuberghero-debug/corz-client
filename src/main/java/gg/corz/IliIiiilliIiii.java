package gg.corz;

import java.util.List;

public record IliIiiilliIiii(List<lliiliiiliilii> ordered, List<lliiliiiliilii> unsequenced) {
   private final List<lliiliiiliilii> lIllliiIIl;
   private final List<lliiliiiliilii> IIllliiIIl;

   public boolean IliIlllilIi() {
      return this.lIllliiIIl.isEmpty();
   }

   public IliIiiilliIiii(List<lliiliiiliilii> ordered, List<lliiliiiliilii> unsequenced) {
      this.IIllliiIIl = ordered;
      this.lIllliiIIl = unsequenced;
   }

   public List<lliiliiiliilii> iIlIlllllill() {
      return this.lIllliiIIl;
   }

   public List<lliiliiiliilii> liiiIIllIl() {
      return this.IIllliiIIl;
   }
}
