package gg.corz;

public record illiiIlIiliiIl(iilIIIIiIIiIIIIi op, int item, double turnDegrees, boolean sameBaseAsLastBreak) {
   private final int Iiiliiillliiliiill;
   private final iilIIIIiIIiIIIIi lliliiillililiiill;
   private final boolean lIIiiiilliIIiiiill;
   private final double iiiliiillIIIiiiill;

   public illiiIlIiliiIl(iilIIIIiIIiIIIIi op, int item, double turnDegrees, boolean sameBaseAsLastBreak) {
      this.lliliiillililiiill = op;
      this.Iiiliiillliiliiill = item;
      this.iiiliiillIIIiiiill = turnDegrees;
      this.lIIiiiilliIIiiiill = sameBaseAsLastBreak;
   }

   public iilIIIIiIIiIIIIi IliIlllilIi() {
      return this.lliliiillililiiill;
   }

   public int liiiIIllIl() {
      return this.Iiiliiillliiliiill;
   }

   public double iIlIlllllill() {
      return this.iiiliiillIIIiiiill;
   }

   public boolean IilliliilIIi() {
      return this.lIIiiiilliIIiiiill;
   }
}
