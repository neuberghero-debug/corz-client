package gg.corz;

record IlIilIilllIilIil(long start, long end, String text, String[] words, long[] ws, long[] we) {
   private final long iiIiiIlIil;
   private final long[] llliiIlIil;
   private final String[] iIliiIlIil;
   private final String lIliiIlIil;
   private final long[] IlliiIlIil;
   private final long IIliiIlIil;

   public String IilliliilIIi() {
      return this.lIliiIlIil;
   }

   public String[] lIiiIiIlilli() {
      return this.iIliiIlIil;
   }

   IlIilIilllIilIil(long start, long end, String text, String[] words, long[] ws, long[] we) {
      this.iiIiiIlIil = start;
      this.IIliiIlIil = end;
      this.lIliiIlIil = text;
      this.iIliiIlIil = words;
      this.IlliiIlIil = ws;
      this.llliiIlIil = we;
   }

   boolean IliIlllilIi() {
      return this.iIliiIlIil.length == 0;
   }

   public long[] iliIiiliiiii() {
      return this.IlliiIlIil;
   }

   public long iIlIlllllill() {
      return this.IIliiIlIil;
   }

   public long[] IIIllIIliIIl() {
      return this.llliiIlIil;
   }

   public long liiiIIllIl() {
      return this.iiIiiIlIil;
   }
}
