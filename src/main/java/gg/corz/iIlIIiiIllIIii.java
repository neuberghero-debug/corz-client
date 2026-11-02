package gg.corz;

public record iIlIIiiIllIIii(float time, ilIIIIIiIiIIIIIi kind, float speed) {
   private final float IlillllIIl;
   private final ilIIIIIiIiIIIIIi llillllIIl;
   private final float ilillllIIl;

   public float IliIlllilIi() {
      return this.IlillllIIl;
   }

   public iIlIIiiIllIIii(float time, ilIIIIIiIiIIIIIi kind, float speed) {
      this.IlillllIIl = time;
      this.llillllIIl = kind;
      this.ilillllIIl = speed;
   }

   public float iIlIlllllill() {
      return this.ilillllIIl;
   }

   public ilIIIIIiIiIIIIIi liiiIIllIl() {
      return this.llillllIIl;
   }
}
