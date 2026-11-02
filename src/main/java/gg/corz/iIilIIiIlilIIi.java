package gg.corz;

record iIilIIiIlilIIi(iIiiIIlIliiIIl kind, long coins) {
   private final long iiiiIiiliIIIIliili;
   private final iIiiIIlIliiIIl IiiiIiililiiiIiili;

   private iIilIIiIlilIIi(iIiiIIlIliiIIl kind, long coins) {
      this.IiiiIiililiiiIiili = kind;
      this.iiiiIiiliIIIIliili = coins;
   }

   public long liiiIIllIl() {
      return this.iiiiIiiliIIIIliili;
   }

   public iIiiIIlIliiIIl IliIlllilIi() {
      return this.IiiiIiililiiiIiili;
   }
}
