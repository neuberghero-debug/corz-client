package gg.corz;

record iiiiIIliIIIIlIli(String name, String key, boolean online) {
   private final String iIIIliIlIi;
   private final boolean IlIIliIlIi;
   private final String lIIIliIlIi;

   public boolean iIlIlllllill() {
      return this.IlIIliIlIi;
   }

   private iiiiIIliIIIIlIli(String name, String key, boolean online) {
      this.lIIIliIlIi = name;
      this.iIIIliIlIi = key;
      this.IlIIliIlIi = online;
   }

   public String IliIlllilIi() {
      return this.lIIIliIlIi;
   }

   public String liiiIIllIl() {
      return this.iIIIliIlIi;
   }
}
