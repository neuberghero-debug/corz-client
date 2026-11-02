package gg.corz;

public record Iililllilill(lIliliiIlili kind, int source, int target) {
   private final lIliliiIlili iIlIIiIiIllIIiIi;
   private final int lllIIiIiillIIiIi;
   private final int IilIIiIililIIiIi;

   public int iIlIlllllill() {
      return this.IilIIiIililIIiIi;
   }

   public Iililllilill(lIliliiIlili kind, int source, int target) {
      this.iIlIIiIiIllIIiIi = kind;
      this.lllIIiIiillIIiIi = source;
      this.IilIIiIililIIiIi = target;
   }

   public int liiiIIllIl() {
      return this.lllIIiIiillIIiIi;
   }

   public lIliliiIlili IliIlllilIi() {
      return this.iIlIIiIiIllIIiIi;
   }
}
