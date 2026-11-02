package gg.corz;

public record lliliIiililiIi(long cell, long stand, iIlIililIllIilil pose, int standDist, int dirX, int dirZ) {
   private final iIlIililIllIilil lIIliiliiiIIliilii;
   private final long IiiIiiliiliiIiilii;
   private final int ilIliiliiIiIliilii;
   private final int IlIliiliillIliilii;
   private final int liIliiliiiiIliilii;
   private final long iiiIiiliiIIIliilii;

   public iIlIililIllIilil iIlIlllllill() {
      return this.lIIliiliiiIIliilii;
   }

   public long liiiIIllIl() {
      return this.iiiIiiliiIIIliilii;
   }

   public int iliIiiliiiii() {
      return this.liIliiliiiiIliilii;
   }

   public int IilliliilIIi() {
      return this.IlIliiliillIliilii;
   }

   public long IliIlllilIi() {
      return this.IiiIiiliiliiIiilii;
   }

   public int lIiiIiIlilli() {
      return this.ilIliiliiIiIliilii;
   }

   public lliliIiililiIi(long cell, long stand, iIlIililIllIilil pose, int standDist, int dirX, int dirZ) {
      this.IiiIiiliiliiIiilii = cell;
      this.iiiIiiliiIIIliilii = stand;
      this.lIIliiliiiIIliilii = pose;
      this.IlIliiliillIliilii = standDist;
      this.ilIliiliiIiIliilii = dirX;
      this.liIliiliiiiIliilii = dirZ;
   }
}
