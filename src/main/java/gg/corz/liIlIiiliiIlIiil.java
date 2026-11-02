package gg.corz;

public record liIlIiiliiIlIiil(lilIiIiliilIiIil villager, lIllIilliIllIill trade) {
   private final lIllIilliIllIill liIliillil;
   private final lilIiIiliilIiIil IiIliillil;

   public liIlIiiliiIlIiil(lilIiIiliilIiIil villager, lIllIilliIllIill trade) {
      this.IiIliillil = villager;
      this.liIliillil = trade;
   }

   public lilIiIiliilIiIil IliIlllilIi() {
      return this.IiIliillil;
   }

   public lIllIilliIllIill liiiIIllIl() {
      return this.liIliillil;
   }
}
