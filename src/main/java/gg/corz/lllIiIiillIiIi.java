package gg.corz;

public record lllIiIiillIiIi(liiiIIlliiiiIIll kind, String text) {
   private final liiiIIlliiiiIIll IilIilliililIillii;
   public static final lllIiIiillIiIi lIiIilliiiIiIillii = new lllIiIiillIiIi(liiiIIlliiiiIIll.IiIiIlllll, null);
   private final String iilIilliiIIiIillii;

   public lllIiIiillIiIi(liiiIIlliiiiIIll kind, String text) {
      this.IilIilliililIillii = kind;
      this.iilIilliiIIiIillii = text;
   }

   public liiiIIlliiiiIIll IliIlllilIi() {
      return this.IilIilliililIillii;
   }

   public String liiiIIllIl() {
      return this.iilIilliiIIiIillii;
   }
}
