package gg.corz;

public record ilIiIiIiIiIi(liIIiiIiiiIIiiIi rail, liIIiiIiiiIIiiIi stage, liIIiiIiiiIIiiIi inspector) {
   private final liIIiiIiiiIIiiIi illiiIIIlIiliiIIIl;
   private final liIIiiIiiiIIiiIi lIliiIIIliIliiIIIl;
   private final liIIiiIiiiIIiiIi IlliiIIIlllliiIIIl;

   public liIIiiIiiiIIiiIi iIlIlllllill() {
      return this.illiiIIIlIiliiIIIl;
   }

   public liIIiiIiiiIIiiIi IliIlllilIi() {
      return this.lIliiIIIliIliiIIIl;
   }

   public ilIiIiIiIiIi(liIIiiIiiiIIiiIi rail, liIIiiIiiiIIiiIi stage, liIIiiIiiiIIiiIi inspector) {
      this.lIliiIIIliIliiIIIl = rail;
      this.IlliiIIIlllliiIIIl = stage;
      this.illiiIIIlIiliiIIIl = inspector;
   }

   public liIIiiIiiiIIiiIi liiiIIllIl() {
      return this.IlliiIIIlllliiIIIl;
   }
}
