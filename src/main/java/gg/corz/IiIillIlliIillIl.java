package gg.corz;

public record IiIillIlliIillIl(
   iIiiIIlIliiIIl kind, int page, int slot, String name, long price, long maxCharge, long secondsLeft, double durability, String fingerprint
) {
   private final String illIIlliIl;
   private final int lllIIlliIl;
   private final long lilIIlliIl;
   private final double IIiIIlliIl;
   private final long iilIIlliIl;
   private final long IilIIlliIl;
   private final iIiiIIlIliiIIl iIlIIlliIl;
   private final int IllIIlliIl;
   private final String lIiIIlliIl;

   public String IIlllIlliIll() {
      return this.lIiIIlliIl;
   }

   public int iIlIlllllill() {
      return this.IllIIlliIl;
   }

   public double IiIlliIliiIl() {
      return this.IIiIIlliIl;
   }

   public IiIillIlliIillIl(
      iIiiIIlIliiIIl kind, int page, int slot, String name, long price, long maxCharge, long secondsLeft, double durability, String fingerprint
   ) {
      maxCharge = Math.max(price, maxCharge);
      this.iIlIIlliIl = kind;
      this.IllIIlliIl = page;
      this.lllIIlliIl = slot;
      this.illIIlliIl = name;
      this.IilIIlliIl = price;
      this.lilIIlliIl = maxCharge;
      this.iilIIlliIl = secondsLeft;
      this.IIiIIlliIl = durability;
      this.lIiIIlliIl = fingerprint;
   }

   public long iliIiiliiiii() {
      return this.IilIIlliIl;
   }

   public int IilliliilIIi() {
      return this.lllIIlliIl;
   }

   public iIiiIIlIliiIIl liiiIIllIl() {
      return this.iIlIIlliIl;
   }

   public long IlIlllIlilIl() {
      return this.iilIIlliIl;
   }

   public String lIiiIiIlilli() {
      return this.illIIlliIl;
   }

   public long IIIllIIliIIl() {
      return this.lilIIlliIl;
   }

   public double IliIlllilIi() {
      return (double)this.IilIIlliIl * 3600.0 / (double)Math.max(1L, this.iilIIlliIl);
   }
}
