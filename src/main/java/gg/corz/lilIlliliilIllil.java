package gg.corz;

public record lilIlliliilIllil(IlIliilllIliil verdict, int plateauCells, boolean closed, int entries) {
   private final int IIlilliIil;
   private final IlIliilllIliil ilIilliIil;
   private final boolean iiIilliIil;
   private final int liIilliIil;

   public int liiiIIllIl() {
      return this.liIilliIil;
   }

   public int IilliliilIIi() {
      return this.IIlilliIil;
   }

   public lilIlliliilIllil(IlIliilllIliil verdict, int plateauCells, boolean closed, int entries) {
      this.ilIilliIil = verdict;
      this.liIilliIil = plateauCells;
      this.iiIilliIil = closed;
      this.IIlilliIil = entries;
   }

   public IlIliilllIliil IliIlllilIi() {
      return this.ilIilliIil;
   }

   public boolean iIlIlllllill() {
      return this.iiIilliIil;
   }
}
