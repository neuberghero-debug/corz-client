package gg.corz;

import java.util.List;

public record iiillliIIIilli(List<iiliilIlIIiiilIl> steps, boolean reached, int expanded) {
   private final boolean IlIIliIIIl;
   private final List<iiliilIlIIiiilIl> iIIIliIIIl;
   private final int llIIliIIIl;

   public List<iiliilIlIIiiilIl> IliIlllilIi() {
      return this.iIIIliIIIl;
   }

   public int iIlIlllllill() {
      return this.llIIliIIIl;
   }

   public iiillliIIIilli(List<iiliilIlIIiiilIl> steps, boolean reached, int expanded) {
      this.iIIIliIIIl = steps;
      this.IlIIliIIIl = reached;
      this.llIIliIIIl = expanded;
   }

   public boolean liiiIIllIl() {
      return this.IlIIliIIIl;
   }
}
