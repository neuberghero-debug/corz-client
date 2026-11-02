package gg.corz;

public record IliilIIllliilIIl(long primary, long[] supporting) {
   private final long[] IilIIIilIl;
   private final long illIIIilIl;

   public boolean IliIlllilIi() {
      return this.illIIIilIl != 0L;
   }

   public long[] IilliliilIIi() {
      return this.IilIIIilIl;
   }

   public long iIlIlllllill() {
      return this.illIIIilIl;
   }

   public int liiiIIllIl() {
      return this.IilIIIilIl.length;
   }

   public IliilIIllliilIIl(long primary, long[] supporting) {
      this.illIIIilIl = primary;
      this.IilIIIilIl = supporting;
   }
}
