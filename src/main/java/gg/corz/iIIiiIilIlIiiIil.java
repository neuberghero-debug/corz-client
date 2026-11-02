package gg.corz;

record iIIiiIilIlIiiIil(String key, int w, int h, int[] px) {
   private final int IilIlilIil;
   private final String lllIlilIil;
   private final int[] lilIlilIil;
   private final int illIlilIil;

   public String IliIlllilIi() {
      return this.lllIlilIil;
   }

   private iIIiiIilIlIiiIil(String key, int w, int h, int[] px) {
      this.lllIlilIil = key;
      this.illIlilIil = w;
      this.IilIlilIil = h;
      this.lilIlilIil = px;
   }

   public int[] IilliliilIIi() {
      return this.lilIlilIil;
   }

   public int iIlIlllllill() {
      return this.IilIlilIil;
   }

   public int liiiIIllIl() {
      return this.illIlilIil;
   }
}
