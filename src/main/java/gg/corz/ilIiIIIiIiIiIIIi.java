package gg.corz;

import java.util.List;

record ilIiIIIiIiIiIIIi(IIilliIllIilliIl feet, List<IIilliIllIilliIl> dirt) {
   private final IIilliIllIilliIl liIiiIliil;
   private final List<IIilliIllIilliIl> iiIiiIliil;

   private ilIiIIIiIiIiIIIi(IIilliIllIilliIl feet, List<IIilliIllIilliIl> dirt) {
      this.liIiiIliil = feet;
      this.iiIiiIliil = dirt;
   }

   public List<IIilliIllIilliIl> liiiIIllIl() {
      return this.iiIiiIliil;
   }

   public IIilliIllIilliIl IliIlllilIi() {
      return this.liIiiIliil;
   }
}
