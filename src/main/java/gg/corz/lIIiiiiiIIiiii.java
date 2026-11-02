package gg.corz;

record lIIiiiiiIIiiii(iilIillIIiIill recipe, lliliIiililiIi deckPick, IlIillillIilli intent, iIliillIlliill cert) {
   private final iilIillIIiIill IillllIlIl;
   private final iIliillIlliill IIilllIlIl;
   private final IlIillillIilli iillllIlIl;
   private final lliliIiililiIi lillllIlIl;

   public iilIillIIiIill IliIlllilIi() {
      return this.IillllIlIl;
   }

   private lIIiiiiiIIiiii(iilIillIIiIill recipe, lliliIiililiIi deckPick, IlIillillIilli intent, iIliillIlliill cert) {
      this.IillllIlIl = recipe;
      this.lillllIlIl = deckPick;
      this.iillllIlIl = intent;
      this.IIilllIlIl = cert;
   }

   public iIliillIlliill IilliliilIIi() {
      return this.IIilllIlIl;
   }

   lIIiiiiiIIiiii(iilIillIIiIill intent, lliliIiililiIi deckPick, IlIillillIilli recipe) {
      this(intent, deckPick, recipe, null);
   }

   public IlIillillIilli iIlIlllllill() {
      return this.iillllIlIl;
   }

   public lliliIiililiIi liiiIIllIl() {
      return this.lillllIlIl;
   }
}
