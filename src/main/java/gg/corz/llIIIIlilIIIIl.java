package gg.corz;

public record llIIIIlilIIIIl(long maxPrice, long minSecondsLeft, long budgetLeft) {
   private final long IIlilIiIllIlilIiIl;
   private final long iIlilIiIlIllilIiIl;
   private final long lllilIiIlillilIiIl;

   public long liiiIIllIl() {
      return this.iIlilIiIlIllilIiIl;
   }

   public long IliIlllilIi() {
      return this.IIlilIiIllIlilIiIl;
   }

   public long iIlIlllllill() {
      return this.lllilIiIlillilIiIl;
   }

   public llIIIIlilIIIIl(long maxPrice, long minSecondsLeft, long budgetLeft) {
      this.IIlilIiIllIlilIiIl = maxPrice;
      this.iIlilIiIlIllilIiIl = minSecondsLeft;
      this.lllilIiIlillilIiIl = budgetLeft;
   }
}
