package gg.corz;

public record liliiliiliil(IlililIillililIi verdict, lIllIIIiiIllIIIi next, String why) {
   private final IlililIillililIi iIiilIiiIliilIii;
   private final lIllIIIiiIllIIIi lliilIiiiliilIii;
   private final String IiiilIiiliiilIii;

   public IlililIillililIi liiiIIllIl() {
      return this.iIiilIiiIliilIii;
   }

   public boolean IliIlllilIi() {
      return this.iIiilIiiIliilIii == IlililIillililIi.lliIillIIi || this.iIiilIiiIliilIii == IlililIillililIi.iliIillIIi;
   }

   public String IilliliilIIi() {
      return this.IiiilIiiliiilIii;
   }

   public lIllIIIiiIllIIIi iIlIlllllill() {
      return this.lliilIiiiliilIii;
   }

   public liliiliiliil(IlililIillililIi verdict, lIllIIIiiIllIIIi next, String why) {
      this.iIiilIiiIliilIii = verdict;
      this.lliilIiiiliilIii = next;
      this.IiiilIiiliiilIii = why;
   }
}
