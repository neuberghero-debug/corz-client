package gg.corz;

public record IiilliIlliilliIl(iiiIlIIiIIIllIIi from, iiiIlIIiIIIllIIi to, lIllIIIiiIllIIIi next, String why) {
   private final String lilliiiIll;
   private final iiiIlIIiIIIllIIi illliiiIll;
   private final lIllIIIiiIllIIIi IilliiiIll;
   private final iiiIlIIiIIIllIIi lllliiiIll;

   public IiilliIlliilliIl(iiiIlIIiIIIllIIi from, iiiIlIIiIIIllIIi to, lIllIIIiiIllIIIi next, String why) {
      this.lllliiiIll = from;
      this.illliiiIll = to;
      this.IilliiiIll = next;
      this.lilliiiIll = why;
   }

   public String IilliliilIIi() {
      return this.lilliiiIll;
   }

   public iiiIlIIiIIIllIIi IliIlllilIi() {
      return this.lllliiiIll;
   }

   public iiiIlIIiIIIllIIi liiiIIllIl() {
      return this.illliiiIll;
   }

   public lIllIIIiiIllIIIi iIlIlllllill() {
      return this.IilliiiIll;
   }
}
