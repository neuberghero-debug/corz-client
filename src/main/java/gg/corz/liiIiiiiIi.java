package gg.corz;

public record liiIiiiiIi(long cell, long stand, iIlIililIllIilil pose, int dirX, int dirZ) {
   private final int IiliIiililiIii;
   private final long IIliIiilIliIii;
   private final int iiliIiiIIiiIii;
   private final long iIliIiiIlliIii;
   private final iIlIililIllIilil llliIiiilliIii;

   public int lIiiIiIlilli() {
      return this.iiliIiiIIiiIii;
   }

   public liiIiiiiIi(long cell, long stand, iIlIililIllIilil pose, int dirX, int dirZ) {
      this.IIliIiilIliIii = cell;
      this.iIliIiiIlliIii = stand;
      this.llliIiiilliIii = pose;
      this.IiliIiililiIii = dirX;
      this.iiliIiiIIiiIii = dirZ;
   }

   public long liiiIIllIl() {
      return this.iIliIiiIlliIii;
   }

   public long IliIlllilIi() {
      return this.IIliIiilIliIii;
   }

   public int IilliliilIIi() {
      return this.IiliIiililiIii;
   }

   public iIlIililIllIilil iIlIlllllill() {
      return this.llliIiiilliIii;
   }
}
