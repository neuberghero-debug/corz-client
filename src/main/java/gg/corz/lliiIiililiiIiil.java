package gg.corz;

public record lliiIiililiiIiil(
   iIliIiiIlliIii action,
   IIilliIllIilliIl from,
   IIilliIllIilliIl to,
   IIilliIllIilliIl dirtTarget,
   IIilliIllIilliIl support,
   String supportFace,
   boolean jumpPlacement
) {
   private final boolean IlIIlIilil;
   private final IIilliIllIilliIl IIIIlIilil;
   private final IIilliIllIilliIl iiiiIIilil;
   private final IIilliIllIilliIl liiiIIilil;
   private final IIilliIllIilliIl lIIIlIilil;
   private final String iIIIlIilil;
   private final iIliIiiIlliIii IiiiIIilil;

   public IIilliIllIilliIl lIiiIiIlilli() {
      return this.lIIIlIilil;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.IIIIlIilil;
   }

   public boolean IIIllIIliIIl() {
      return this.IlIIlIilil;
   }

   public IIilliIllIilliIl liiiIIllIl() {
      return this.liiiIIilil;
   }

   public String iliIiiliiiii() {
      return this.iIIIlIilil;
   }

   public iIliIiiIlliIii IliIlllilIi() {
      return this.IiiiIIilil;
   }

   public lliiIiililiiIiil(
      iIliIiiIlliIii action,
      IIilliIllIilliIl from,
      IIilliIllIilliIl to,
      IIilliIllIilliIl dirtTarget,
      IIilliIllIilliIl support,
      String supportFace,
      boolean jumpPlacement
   ) {
      this.IiiiIIilil = action;
      this.liiiIIilil = from;
      this.iiiiIIilil = to;
      this.IIIIlIilil = dirtTarget;
      this.lIIIlIilil = support;
      this.iIIIlIilil = supportFace;
      this.IlIIlIilil = jumpPlacement;
   }

   public IIilliIllIilliIl iIlIlllllill() {
      return this.iiiiIIilil;
   }
}
