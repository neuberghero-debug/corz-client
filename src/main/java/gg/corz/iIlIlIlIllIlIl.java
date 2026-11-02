package gg.corz;

public record iIlIlIlIllIlIl(String file, int startMs, int lengthMs) {
   private final int iIIlIIIllIlIlIIIll;
   private final int IIIlIIIlllIIlIIIll;
   private final String liiIIIIlliiiIIIIll;

   public int IilliliilIIi() {
      return this.iIIlIIIllIlIlIIIll;
   }

   public String liiiIIllIl() {
      return this.liiIIIIlliiiIIIIll;
   }

   public int iIlIlllllill() {
      return this.IIIlIIIlllIIlIIIll;
   }

   public boolean IliIlllilIi() {
      return this.IIIlIIIlllIIlIIIll >= 0;
   }

   public iIlIlIlIllIlIl(String file, int startMs, int lengthMs) {
      this.liiIIIIlliiiIIIIll = file;
      this.IIIlIIIlllIIlIIIll = startMs;
      this.iIIlIIIllIlIlIIIll = lengthMs;
   }
}
