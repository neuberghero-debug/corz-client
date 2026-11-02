package gg.corz;

record iliiIIiIiiiIIi(String key, IlIilIilllIilIil[] lines) {
   private final IlIilIilllIilIil[] iIIIlIIiiIlIIlIIii;
   private final String IIIIlIIiilIIIlIIii;

   public IlIilIilllIilIil[] liiiIIllIl() {
      return this.iIIIlIIiiIlIIlIIii;
   }

   public String IliIlllilIi() {
      return this.IIIIlIIiilIIIlIIii;
   }

   iliiIIiIiiiIIi(String key, IlIilIilllIilIil[] lines) {
      this.IIIIlIIiilIIIlIIii = key;
      this.iIIIlIIiiIlIIlIIii = lines;
   }
}
