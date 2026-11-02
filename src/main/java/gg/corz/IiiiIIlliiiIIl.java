package gg.corz;

public record IiiiIIlliiiIIl(lIIiiiIIii action, llIIliIiilIIliIi target, String userMessage) {
   private final String iilliiiIlIIiliiiIl;
   private final llIIliIiilIIliIi IilliiiIllilliiiIl;
   private final lIIiiiIIii lllliiiIlillliiiIl;

   public String lIiiIiIlilli() {
      return this.iilliiiIlIIiliiiIl;
   }

   public llIIliIiilIIliIi IilliliilIIi() {
      return this.IilliiiIllilliiiIl;
   }

   public IiiiIIlliiiIIl(lIIiiiIIii action, llIIliIiilIIliIi target, String userMessage) {
      this.lllliiiIlillliiiIl = action;
      this.IilliiiIllilliiiIl = target;
      this.iilliiiIlIIiliiiIl = userMessage;
   }

   public boolean liiiIIllIl() {
      return this.lllliiiIlillliiiIl == lIIiiiIIii.IlllIlIlllllIlIl || this.lllliiiIlillliiiIl == lIIiiiIIii.illlIlIlIillIlIl;
   }

   public boolean IliIlllilIi() {
      return this.lllliiiIlillliiiIl == lIIiiiIIii.illlIlIlIillIlIl;
   }

   public lIIiiiIIii iIlIlllllill() {
      return this.lllliiiIlillliiiIl;
   }
}
