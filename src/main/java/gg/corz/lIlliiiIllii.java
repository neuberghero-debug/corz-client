package gg.corz;

public final class lIlliiiIllii {
   public final String lilililIliilililIl;
   public final String illililIlIilililIl;
   public final boolean IllililIllllililIl;

   static lIlliiiIllii liiiIIllIl(String msg) {
      return new lIlliiiIllii(false, null, msg);
   }

   private lIlliiiIllii(boolean error, String id, String ok) {
      this.IllililIllllililIl = error;
      this.illililIlIilililIl = id;
      this.lilililIliilililIl = ok;
   }

   static lIlliiiIllii IliIlllilIi(String id) {
      return new lIlliiiIllii(true, id, null);
   }
}
