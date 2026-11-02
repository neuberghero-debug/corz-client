package gg.corz;

public record iIIllliIlIllli(lllllIiillllIi verdict, String why) {
   private final String llililIIIl;
   private final lllllIiillllIi IlililIIIl;

   public iIIllliIlIllli(lllllIiillllIi verdict, String why) {
      this.IlililIIIl = verdict;
      this.llililIIIl = why;
   }

   public boolean liiiIIllIl() {
      return this.IlililIIIl == lllllIiillllIi.iIIiilIiiIlIiilIii;
   }

   public lllllIiillllIi iIlIlllllill() {
      return this.IlililIIIl;
   }

   public boolean IliIlllilIi() {
      return this.IlililIIIl == lllllIiillllIi.liililIiiiiililIii;
   }

   public String IilliliilIIi() {
      return this.llililIIIl;
   }
}
