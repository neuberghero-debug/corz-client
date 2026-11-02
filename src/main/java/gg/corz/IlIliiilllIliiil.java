package gg.corz;

public record IlIliiilllIliiil(long unitPrice, long day, long lastPrice, long lastDay) {
   private final long iIilIlIiil;
   private final long lIilIlIiil;
   private final long IIilIlIiil;
   private final long IlilIlIiil;

   public long liiiIIllIl() {
      return this.lIilIlIiil;
   }

   public IlIliiilllIliiil(long unitPrice, long day) {
      this(unitPrice, day, unitPrice, day);
   }

   public long iIlIlllllill() {
      return this.iIilIlIiil;
   }

   public IlIliiilllIliiil(long unitPrice, long day, long lastPrice, long lastDay) {
      this.IIilIlIiil = unitPrice;
      this.lIilIlIiil = day;
      this.iIilIlIiil = lastPrice;
      this.IlilIlIiil = lastDay;
   }

   public long IilliliilIIi() {
      return this.IlilIlIiil;
   }

   public long IliIlllilIi() {
      return this.IIilIlIiil;
   }
}
