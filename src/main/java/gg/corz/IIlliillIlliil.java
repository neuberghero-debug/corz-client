package gg.corz;

import java.util.LinkedHashSet;
import java.util.List;

record IIlliillIlliil(IIilliIllIilliIl feet, LinkedHashSet<IIilliIllIilliIl> dirt, List<lliiIiililiiIiil> steps, int cost) {
   private final LinkedHashSet<IIilliIllIilliIl> ilIiiIlliIiIiiIlli;
   private final IIilliIllIilliIl IlIiiIllillIiiIlli;
   private final int IIliiIllilIliiIlli;
   private final List<lliiIiililiiIiil> liIiiIlliiiIiiIlli;

   public LinkedHashSet<IIilliIllIilliIl> liiiIIllIl() {
      return this.ilIiiIlliIiIiiIlli;
   }

   private IIlliillIlliil(IIilliIllIilliIl feet, LinkedHashSet<IIilliIllIilliIl> dirt, List<lliiIiililiiIiil> steps, int cost) {
      this.IlIiiIllillIiiIlli = feet;
      this.ilIiiIlliIiIiiIlli = dirt;
      this.liIiiIlliiiIiiIlli = steps;
      this.IIliiIllilIliiIlli = cost;
   }

   public IIilliIllIilliIl IliIlllilIi() {
      return this.IlIiiIllillIiiIlli;
   }

   public List<lliiIiililiiIiil> iIlIlllllill() {
      return this.liIiiIlliiiIiiIlli;
   }

   public int IilliliilIIi() {
      return this.IIliiIllilIliiIlli;
   }
}
