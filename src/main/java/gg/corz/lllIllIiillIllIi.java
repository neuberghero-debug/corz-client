package gg.corz;

public record lllIllIiillIllIi(iillIlIiIIilIlIi verdict, int componentBefore, int componentAfter) {
   private final int IllIIiIIIi;
   private final iillIlIiIIilIlIi lIlIIiIIIi;
   private final int iIlIIiIIIi;

   public lllIllIiillIllIi(iillIlIiIIilIlIi verdict, int componentBefore, int componentAfter) {
      this.lIlIIiIIIi = verdict;
      this.iIlIIiIIIi = componentBefore;
      this.IllIIiIIIi = componentAfter;
   }

   public boolean liiiIIllIl() {
      return this.lIlIIiIIIi == iillIlIiIIilIlIi.ilIiIIIIIi;
   }

   public boolean IliIlllilIi() {
      return this.lIlIIiIIIi == iillIlIiIIilIlIi.IlIiIIIIIi;
   }

   public int IilliliilIIi() {
      return this.iIlIIiIIIi;
   }

   public int lIiiIiIlilli() {
      return this.IllIIiIIIi;
   }

   public iillIlIiIIilIlIi iIlIlllllill() {
      return this.lIlIIiIIIi;
   }
}
