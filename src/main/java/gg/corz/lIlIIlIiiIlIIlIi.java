package gg.corz;

public record lIlIIlIiiIlIIlIi<P>(llIiiIililIiiIil reason, int provenMemberIndex, boolean dependencyChainProven) implements IlllIillllIi<P> {
   private final llIiiIililIiiIil iliIiiiiil;
   private final boolean liiIiiiiil;
   private final int IiiIiiiiil;

   public lIlIIlIiiIlIIlIi(llIiiIililIiiIil reason, int provenMemberIndex, boolean dependencyChainProven) {
      this.iliIiiiiil = reason;
      this.IiiIiiiiil = provenMemberIndex;
      this.liiIiiiiil = dependencyChainProven;
   }

   @Override
   public boolean IliIlllilIi() {
      return this.liiIiiiiil;
   }

   @Override
   public llIiiIililIiiIil IlIlllIlilIl() {
      return this.iliIiiiiil;
   }

   public int Iilllilliill() {
      return this.IiiIiiiiil;
   }
}
