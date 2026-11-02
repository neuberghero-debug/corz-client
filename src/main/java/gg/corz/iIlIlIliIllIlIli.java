package gg.corz;

public final class iIlIlIliIllIlIli {
   private final boolean liliiiIlIi;
   final int IiliiiIlIi;
   final iIlIliilIllIliil illiiiIlIi;

   float IilliliilIIi(float f) {
      return this.illiiiIlIi.iIlIlllllill(this.liliiiIlIi ? 0.5F : f);
   }

   iIlIlIliIllIlIli(iIlIliilIllIliil solid, int region, boolean color) {
      this.illiiiIlIi = solid;
      this.IiliiiIlIi = region;
      this.liliiiIlIi = color;
   }

   public iIlIlIliIllIlIli liiiIIllIl(float a) {
      return new iIlIlIliIllIlIli(this.illiiiIlIi, iiiIIIliIIIlIIli.IilliliilIIi(this.IiliiiIlIi, a), this.liliiiIlIi);
   }

   float iIlIlllllill(float f) {
      return this.illiiiIlIi.liiiIIllIl(this.liliiiIlIi ? 0.5F : f);
   }

   public iIlIlIliIllIlIli IliIlllilIi(int rgb) {
      return new iIlIlIliIllIlIli(this.illiiiIlIi, iiiIIIliIIIlIIli.IliIlllilIi(rgb), this.liliiiIlIi);
   }
}
