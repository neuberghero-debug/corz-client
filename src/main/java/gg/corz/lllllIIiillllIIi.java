package gg.corz;

public record lllllIIiillllIIi(llIliIllilIliIll step, String why) {
   private final String illliiliil;
   private final llIliIllilIliIll lllliiliil;

   public String iIlIlllllill() {
      return this.illliiliil;
   }

   public boolean IliIlllilIi() {
      return this.lllliiliil != llIliIllilIliIll.IIliililll && this.lllliiliil != llIliIllilIliIll.lIliililll;
   }

   public lllllIIiillllIIi(llIliIllilIliIll step, String why) {
      this.lllliiliil = step;
      this.illliiliil = why;
   }

   public llIliIllilIliIll liiiIIllIl() {
      return this.lllliiliil;
   }
}
