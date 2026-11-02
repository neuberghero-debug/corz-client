package gg.corz;

record llIiiililIiiil(int weight, String detail, long expiresAt) {
   private final String liIlillliiiIlillli;
   private final long IIllilllilIllillli;
   private final int ilIlillliIiIlillli;

   private llIiiililIiiil(int weight, String detail, long expiresAt) {
      this.ilIlillliIiIlillli = weight;
      this.liIlillliiiIlillli = detail;
      this.IIllilllilIllillli = expiresAt;
   }

   public long iIlIlllllill() {
      return this.IIllilllilIllillli;
   }

   public String liiiIIllIl() {
      return this.liIlillliiiIlillli;
   }

   public int IliIlllilIi() {
      return this.ilIlillliIiIlillli;
   }
}
