package gg.corz;

public record IIllIiIllIllIiIl(boolean forward, boolean jump, boolean sprint, boolean sneak) {
   private final boolean IIllIliIll;
   public static final IIllIiIllIllIiIl IlllIliIll = new IIllIiIllIllIiIl(false, false, false, false);
   private final boolean lIllIliIll;
   private final boolean iiIlIliIll;
   private final boolean iIllIliIll;

   public boolean IliIlllilIi() {
      return this.iiIlIliIll;
   }

   public boolean IilliliilIIi() {
      return this.iIllIliIll;
   }

   public boolean iIlIlllllill() {
      return this.lIllIliIll;
   }

   public IIllIiIllIllIiIl(boolean forward, boolean jump, boolean sprint, boolean sneak) {
      this.iiIlIliIll = forward;
      this.IIllIliIll = jump;
      this.lIllIliIll = sprint;
      this.iIllIliIll = sneak;
   }

   public boolean liiiIIllIl() {
      return this.IIllIliIll;
   }
}
