package gg.corz;

record lilIiIIliilIiIIl(int score, int total, String describe) {
   private final String iliiIIilIl;
   private final int IliiIIilIl;
   private final int lliiIIilIl;
   static final lilIiIIliilIiIIl IiiiIIilIl = new lilIiIIliilIiIIl(0, 0, "");

   lilIiIIliilIiIIl(int score, int total, String describe) {
      this.IliiIIilIl = score;
      this.lliiIIilIl = total;
      this.iliiIIilIl = describe;
   }

   public int IliIlllilIi() {
      return this.IliiIIilIl;
   }

   public String iIlIlllllill() {
      return this.iliiIIilIl;
   }

   public int liiiIIllIl() {
      return this.lliiIIilIl;
   }
}
