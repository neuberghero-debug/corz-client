package gg.corz;

import java.util.Set;

public record liIIlIIliiIIlIIl(liiIiiiiiIii reason, Set<Long> blocked, int tempBudget, Set<Long> hazardStands) {
   private final int iIIIIillIl;
   private final Set<Long> lIIIIillIl;
   private final Set<Long> IlIIIillIl;
   private final liiIiiiiiIii IIIIIillIl;

   public iiIlIiiIIllIii liiiIIllIl() {
      return iiIlIiiIIllIii.liiiIIllIl(this.lIIIIillIl, this.iIIIIillIl);
   }

   public boolean iIlIlllllill() {
      return !this.lIIIIillIl.isEmpty();
   }

   public int iliIiiliiiii() {
      return this.iIIIIillIl;
   }

   public liiIiiiiiIii IilliliilIIi() {
      return this.IIIIIillIl;
   }

   public static liIIlIIliiIIlIIl IliIlllilIi(Set<Long> blocked, Set<Long> tempBudget, int hazardStands) {
      return new liIIlIIliiIIlIIl(liiIiiiiiIii.IIIIlilIllIIIlilIl, blocked, hazardStands, tempBudget);
   }

   public Set<Long> IIIllIIliIIl() {
      return this.IlIIIillIl;
   }

   public liIIlIIliiIIlIIl(liiIiiiiiIii reason, Set<Long> blocked, int tempBudget, Set<Long> hazardStands) {
      blocked = blocked == null ? Set.of() : Set.copyOf(blocked);
      hazardStands = hazardStands == null ? Set.of() : Set.copyOf(hazardStands);
      tempBudget = Math.max(0, tempBudget);
      this.IIIIIillIl = reason;
      this.lIIIIillIl = blocked;
      this.iIIIIillIl = tempBudget;
      this.IlIIIillIl = hazardStands;
   }

   public Set<Long> lIiiIiIlilli() {
      return this.lIIIIillIl;
   }
}
