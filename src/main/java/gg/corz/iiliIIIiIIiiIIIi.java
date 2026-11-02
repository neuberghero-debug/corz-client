package gg.corz;

public record iiliIIIiIIiiIIIi<P>(P plan, llIiiIililIiiIil observedReason, int provenMemberIndex, boolean dependencyChainProven, String why)
   implements IlllIillllIi<P> {
   private final int illIIlliil;
   private final boolean IilIIlliil;
   private final P IllIIlliil;
   private final llIiiIililIiiIil lllIIlliil;
   private final String lilIIlliil;

   @Override
   public P IIIllIIliIIl() {
      return this.IllIIlliil;
   }

   public String Ililllililil() {
      return this.lilIIlliil;
   }

   public int IIillIiliIil() {
      return this.illIIlliil;
   }

   @Override
   public boolean IliIlllilIi() {
      return this.IilIIlliil;
   }

   public iiliIIIiIIiiIIIi(P plan, llIiiIililIiiIil observedReason, int provenMemberIndex, boolean dependencyChainProven, String why) {
      this.IllIIlliil = (P)plan;
      this.lllIIlliil = observedReason;
      this.illIIlliil = provenMemberIndex;
      this.IilIIlliil = dependencyChainProven;
      this.lilIIlliil = why;
   }

   public llIiiIililIiiIil Iilllilliill() {
      return this.lllIIlliil;
   }
}
