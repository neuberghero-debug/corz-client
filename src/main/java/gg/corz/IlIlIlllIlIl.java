package gg.corz;

public record IlIlIlllIlIl(int bestCost, String bestWhere, int inStock, int restocking, int unchecked, int belowLevel) {
   private final int IllIlIlllllIlIll;
   private final int illIlIllIilIlIll;
   private final int iiIIlIllIIlIlIll;
   private final String lIlIlIlliIlIlIll;
   private final int lilIlIlliilIlIll;
   private final int IIiIlIlllIiIlIll;

   public int IilliliilIIi() {
      return this.illIlIllIilIlIll;
   }

   public int lIiiIiIlilli() {
      return this.lilIlIlliilIlIll;
   }

   public int iliIiiliiiii() {
      return this.IIiIlIlllIiIlIll;
   }

   public int iIlIlllllill() {
      return this.IllIlIlllllIlIll;
   }

   public IlIlIlllIlIl(int bestCost, String bestWhere, int inStock, int restocking, int unchecked, int belowLevel) {
      this.iiIIlIllIIlIlIll = bestCost;
      this.lIlIlIlliIlIlIll = bestWhere;
      this.IllIlIlllllIlIll = inStock;
      this.illIlIllIilIlIll = restocking;
      this.lilIlIlliilIlIll = unchecked;
      this.IIiIlIlllIiIlIll = belowLevel;
   }

   public int IliIlllilIi() {
      return this.iiIIlIllIIlIlIll;
   }

   public String liiiIIllIl() {
      return this.lIlIlIlliIlIlIll;
   }
}
