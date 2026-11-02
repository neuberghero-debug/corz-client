package gg.corz;

record lIIIiIlliIIIiIll(IIilliIllIilliIl target, IIilliIllIilliIl support, String face, IIilliIllIilliIl nextFeet, boolean jump, boolean stair) {
   private final IIilliIllIilliIl illlllilll;
   private final String iillllilll;
   private final IIilliIllIilliIl IIilllilll;
   private final boolean iIilllilll;
   private final IIilliIllIilliIl lillllilll;
   private final boolean lIilllilll;

   public boolean lIiiIiIlilli() {
      return this.lIilllilll;
   }

   public IIilliIllIilliIl IliIlllilIi() {
      return this.illlllilll;
   }

   private lIIIiIlliIIIiIll(IIilliIllIilliIl target, IIilliIllIilliIl support, String face, IIilliIllIilliIl nextFeet, boolean jump, boolean stair) {
      this.illlllilll = target;
      this.lillllilll = support;
      this.iillllilll = face;
      this.IIilllilll = nextFeet;
      this.lIilllilll = jump;
      this.iIilllilll = stair;
   }

   public String iIlIlllllill() {
      return this.iillllilll;
   }

   public IIilliIllIilliIl liiiIIllIl() {
      return this.lillllilll;
   }

   public boolean iliIiiliiiii() {
      return this.iIilllilll;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.IIilllilll;
   }
}
