package gg.corz;

public record iillliiIIillii(int expanded, int budget, boolean success, boolean budgetExhausted, int openRemaining, int distance) {
   private final boolean iillIliIIl;
   private final int IillIliIIl;
   private final boolean IIilIliIIl;
   private final int lIilIliIIl;
   private final int iIilIliIIl;
   private final int lillIliIIl;

   public int IliIlllilIi() {
      return this.IillIliIIl;
   }

   public int iliIiiliiiii() {
      return this.iIilIliIIl;
   }

   public iillliiIIillii(int expanded, int budget, boolean success, boolean budgetExhausted, int openRemaining, int distance) {
      this.IillIliIIl = expanded;
      this.lillIliIIl = budget;
      this.iillIliIIl = success;
      this.IIilIliIIl = budgetExhausted;
      this.lIilIliIIl = openRemaining;
      this.iIilIliIIl = distance;
   }

   public boolean IilliliilIIi() {
      return this.IIilIliIIl;
   }

   public boolean iIlIlllllill() {
      return this.iillIliIIl;
   }

   public int lIiiIiIlilli() {
      return this.lIilIliIIl;
   }

   public int liiiIIllIl() {
      return this.lillIliIIl;
   }
}
