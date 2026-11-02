package gg.corz;

record IlIiillIii(String key, lillIIlliillIIll kind, String label, String desc, IilliIllilliIl setting, String haystack) {
   private final lillIIlliillIIll iiilIlIlIIIiIlIl;
   private final String lIIiIlIliIIiIlIl;
   private final String IiilIlIlliilIlIl;
   private final String IlIiIlIlllIiIlIl;
   private final String liIiIlIliiIiIlIl;
   private final IilliIllilliIl ilIiIlIlIiIiIlIl;

   public lillIIlliillIIll liiiIIllIl() {
      return this.iiilIlIlIIIiIlIl;
   }

   public String IliIlllilIi() {
      return this.IiilIlIlliilIlIl;
   }

   public String iIlIlllllill() {
      return this.lIIiIlIliIIiIlIl;
   }

   private IlIiillIii(String key, lillIIlliillIIll kind, String label, String desc, IilliIllilliIl setting, String haystack) {
      this.IiilIlIlliilIlIl = key;
      this.iiilIlIlIIIiIlIl = kind;
      this.lIIiIlIliIIiIlIl = label;
      this.IlIiIlIlllIiIlIl = desc;
      this.ilIiIlIlIiIiIlIl = setting;
      this.liIiIlIliiIiIlIl = haystack;
   }

   public String iliIiiliiiii() {
      return this.liIiIlIliiIiIlIl;
   }

   public IilliIllilliIl lIiiIiIlilli() {
      return this.ilIiIlIlIiIiIlIl;
   }

   public String IilliliilIIi() {
      return this.IlIiIlIlllIiIlIl;
   }
}
