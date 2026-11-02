package gg.corz;

record liIlIliiiIlIli(String name, long firstSeenMs, boolean staff) {
   private final String IiilIIIIIl;
   private final boolean iiilIIIIIl;
   private final long liilIIIIIl;

   private liIlIliiiIlIli(String name, long firstSeenMs, boolean staff) {
      this.IiilIIIIIl = name;
      this.liilIIIIIl = firstSeenMs;
      this.iiilIIIIIl = staff;
   }

   public long liiiIIllIl() {
      return this.liilIIIIIl;
   }

   public boolean iIlIlllllill() {
      return this.iiilIIIIIl;
   }

   public String IliIlllilIi() {
      return this.IiilIIIIIl;
   }
}
