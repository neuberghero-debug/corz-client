package gg.corz;

record iililiIlIIiiliIl(iIiiilllIliiilll shield, int slot) {
   static final iililiIlIIiiliIl IllIlIIlll = new iililiIlIIiiliIl(iIiiilllIliiilll.lliiIllill, -1);
   private final int iIlIlIIlll;
   private final iIiiilllIliiilll lIlIlIIlll;

   private iililiIlIIiiliIl(iIiiilllIliiilll shield, int slot) {
      this.lIlIlIIlll = shield;
      this.iIlIlIIlll = slot;
   }

   public iIiiilllIliiilll IliIlllilIi() {
      return this.lIlIlIIlll;
   }

   public int liiiIIllIl() {
      return this.iIlIlIIlll;
   }
}
