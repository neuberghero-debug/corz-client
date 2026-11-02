package gg.corz;

public record iiIllilIIlllil(
   IIIilIIiiIIi a, float ehp, boolean totemConfirmed, float woff, float wself, lIiliIiliIiliIil defuse, iIiiilllIliiilll shield, int shieldsRecent
) {
   private final float IIllIIIlilIllIIIli;
   private final IIIilIIiiIIi IlIlIIIlillIlIIIli;
   private final float ilIlIIIliIiIlIIIli;
   private final float iIllIIIliIlllIIIli;
   private final iIiiilllIliiilll IillIIIlilillIIIli;
   private final int iillIIIliIIilIIIli;
   private final lIiliIiliIiliIil llllIIIliilllIIIli;
   private final boolean liIlIIIliiiIlIIIli;

   public float liiiIIllIl() {
      return this.ilIlIIIliIiIlIIIli;
   }

   public iiIllilIIlllil(
      IIIilIIiiIIi a, float ehp, boolean totemConfirmed, float woff, float wself, lIiliIiliIiliIil defuse, iIiiilllIliiilll shield, int shieldsRecent
   ) {
      this.IlIlIIIlillIlIIIli = a;
      this.ilIlIIIliIiIlIIIli = ehp;
      this.liIlIIIliiiIlIIIli = totemConfirmed;
      this.IIllIIIlilIllIIIli = woff;
      this.iIllIIIliIlllIIIli = wself;
      this.llllIIIliilllIIIli = defuse;
      this.IillIIIlilillIIIli = shield;
      this.iillIIIliIIilIIIli = shieldsRecent;
   }

   public float IilliliilIIi() {
      return this.IIllIIIlilIllIIIli;
   }

   public iIiiilllIliiilll IIIllIIliIIl() {
      return this.IillIIIlilillIIIli;
   }

   public boolean iIlIlllllill() {
      return this.liIlIIIliiiIlIIIli;
   }

   public float lIiiIiIlilli() {
      return this.iIllIIIliIlllIIIli;
   }

   public lIiliIiliIiliIil iliIiiliiiii() {
      return this.llllIIIliilllIIIli;
   }

   public IIIilIIiiIIi IliIlllilIi() {
      return this.IlIlIIIlillIlIIIli;
   }

   public int IlIlllIlilIl() {
      return this.iillIIIliIIilIIIli;
   }
}
