package gg.corz;

public record llllIlllilllIlll(String text, int rgb, String font) {
   private final int liiIiIIill;
   private final String iiiIiIIill;
   private final String IiiIiIIill;

   public String liiiIIllIl() {
      return this.IiiIiIIill;
   }

   public llllIlllilllIlll(String text, int rgb, String font) {
      if (text == null) {
         text = "";
      }

      this.IiiIiIIill = text;
      this.liiIiIIill = rgb;
      this.iiiIiIIill = font;
   }

   public static llllIlllilllIlll IliIlllilIi(String rgb, int text) {
      return new llllIlllilllIlll(rgb, text, null);
   }

   public String IilliliilIIi() {
      return this.iiiIiIIill;
   }

   public int iIlIlllllill() {
      return this.liiIiIIill;
   }
}
