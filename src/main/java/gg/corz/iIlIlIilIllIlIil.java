package gg.corz;

public record iIlIlIilIllIlIil(String memberId, llIIliIiilIIliIi anchor, boolean hostIntent) {
   private final llIIliIiilIIliIi lIIiiiIIil;
   private final boolean iIIiiiIIil;
   private final String IIIiiiIIil;

   public boolean IliIlllilIi() {
      return this.IIIiiiIIil != null && !this.IIIiiiIIil.isEmpty() && this.lIIiiiIIil != null && this.lIIiiiIIil.IliIlllilIi();
   }

   public iIlIlIilIllIlIil(String memberId, llIIliIiilIIliIi anchor, boolean hostIntent) {
      this.IIIiiiIIil = memberId;
      this.lIIiiiIIil = anchor;
      this.iIIiiiIIil = hostIntent;
   }

   public llIIliIiilIIliIi iIlIlllllill() {
      return this.lIIiiiIIil;
   }

   public String liiiIIllIl() {
      return this.IIIiiiIIil;
   }

   public boolean IilliliilIIi() {
      return this.iIIiiiIIil;
   }
}
