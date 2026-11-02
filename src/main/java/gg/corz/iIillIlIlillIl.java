package gg.corz;

public record iIillIlIlillIl(liIlIliiIlIl look, ilIllIiIll module) {
   private final liIlIliiIlIl IlililIllllililIll;
   private final ilIllIiIll ilililIllIiililIll;

   public ilIllIiIll IilliliilIIi() {
      return this.ilililIllIiililIll;
   }

   public liIlIliiIlIl iIlIlllllill() {
      return this.IlililIllllililIll;
   }

   public String liiiIIllIl() {
      return this.IlililIllllililIll.Iiilliiliiil();
   }

   public iIillIlIlillIl(liIlIliiIlIl look, ilIllIiIll module) {
      this.IlililIllllililIll = look;
      this.ilililIllIiililIll = module;
   }

   public boolean IliIlllilIi() {
      return this.ilililIllIiililIll == null;
   }
}
