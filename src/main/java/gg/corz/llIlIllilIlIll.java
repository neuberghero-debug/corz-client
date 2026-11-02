package gg.corz;

public record llIlIllilIlIll(lllIlIliillIlIli kind, String text) {
   public static final llIlIllilIlIll iIllIiIilIlllIiIil = new llIlIllilIlIll(lllIlIliillIlIli.lIiiiiIlIi, null);
   private final String liIlIiIiliiIlIiIil;
   public static final llIlIllilIlIll IIllIiIillIllIiIil = new llIlIllilIlIll(lllIlIliillIlIli.iiliiiIlIi, null);
   private final lllIlIliillIlIli ilIlIiIilIiIlIiIil;

   public String liiiIIllIl() {
      return this.liIlIiIiliiIlIiIil;
   }

   public lllIlIliillIlIli IliIlllilIi() {
      return this.ilIlIiIilIiIlIiIil;
   }

   public llIlIllilIlIll(lllIlIliillIlIli kind, String text) {
      this.ilIlIiIilIiIlIiIil = kind;
      this.liIlIiIiliiIlIiIil = text;
   }
}
