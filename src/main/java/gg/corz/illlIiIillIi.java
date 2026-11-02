package gg.corz;

public record illlIiIillIi<P>(P plan, int provenMemberIndex, boolean dependencyChainProven) implements IlllIillllIi<P> {
   private final P lilllIIIliilllIIIl;
   private final boolean iIillIIIlIlillIIIl;
   private final int IIillIIIllIillIIIl;

   public illlIiIillIi(P plan, int provenMemberIndex, boolean dependencyChainProven) {
      this.lilllIIIliilllIIIl = (P)plan;
      this.IIillIIIllIillIIIl = provenMemberIndex;
      this.iIillIIIlIlillIIIl = dependencyChainProven;
   }

   public int Iilllilliill() {
      return this.IIillIIIllIillIIIl;
   }

   @Override
   public boolean IliIlllilIi() {
      return this.iIillIIIlIlillIIIl;
   }

   @Override
   public P IIIllIIliIIl() {
      return this.lilllIIIliilllIIIl;
   }
}
