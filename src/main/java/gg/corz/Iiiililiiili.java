package gg.corz;

public record Iiiililiiili(boolean safe, String reason) {
   public static final Iiiililiiili llIllllIlilIllllIl = new Iiiililiiili(true, IilliliilIIi<"IilliliilIIi","btzO2grtMsin9XrR9nm7AY2p3nGbZaC2e5v/3Ak9">());
   private final String iIIllllIlIlIllllIl;
   private final boolean IIIllllIllIIllllIl;

   public Iiiililiiili(boolean safe, String reason) {
      this.IIIllllIllIIllllIl = safe;
      this.iIIllllIlIlIllllIl = reason;
   }

   public String iIlIlllllill() {
      return this.iIIllllIlIlIllllIl;
   }

   public boolean liiiIIllIl() {
      return this.IIIllllIllIIllllIl;
   }

   public static Iiiililiiili IliIlllilIi(String reason) {
      return new Iiiililiiili(false, reason);
   }
}
