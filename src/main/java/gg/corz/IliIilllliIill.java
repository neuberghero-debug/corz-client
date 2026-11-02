package gg.corz;

public record IliIilllliIill(String name, IIiIIlIilIiIIlIi tier, int rgb) {
   private final IIiIIlIilIiIIlIi iiliIiIIiIIiiIiIIi;
   private final String IiliIiIIililiIiIIi;
   private final int lIiiIiIIiiIiiIiIIi;

   public IliIilllliIill(String name, IIiIIlIilIiIIlIi tier, int rgb) {
      this.IiliIiIIililiIiIIi = name;
      this.iiliIiIIiIIiiIiIIi = tier;
      this.lIiiIiIIiiIiiIiIIi = rgb;
   }

   public int iIlIlllllill() {
      return this.lIiiIiIIiiIiiIiIIi;
   }

   public String IliIlllilIi() {
      return this.IiliIiIIililiIiIIi;
   }

   public IIiIIlIilIiIIlIi liiiIIllIl() {
      return this.iiliIiIIiIIiiIiIIi;
   }
}
