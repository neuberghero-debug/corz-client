package gg.corz;

import java.util.List;

public record lliiililiiil(long root, List<lIiliiliIiliil> members) {
   private final List<lIiliiliIiliil> IlIIiIiillIIiIii;
   private final long lIIIiIiiiIIIiIii;

   public long liiiIIllIl() {
      return this.lIIIiIiiiIIIiIii;
   }

   public int IliIlllilIi() {
      return this.IlIIiIiillIIiIii.size();
   }

   public lliiililiiil(long root, List<lIiliiliIiliil> members) {
      members = members == null ? List.of() : List.copyOf(members);
      this.lIIIiIiiiIIIiIii = root;
      this.IlIIiIiillIIiIii = members;
   }

   public List<lIiliiliIiliil> iIlIlllllill() {
      return this.IlIIiIiillIIiIii;
   }
}
