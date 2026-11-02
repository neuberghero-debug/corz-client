package gg.corz;

public record Ilililllllililll(int slot, int count, long totalPrice) {
   private final int lIiliIlill;
   private final int IIiliIlill;
   private final long iIiliIlill;

   public int liiiIIllIl() {
      return this.IIiliIlill;
   }

   public long IilliliilIIi() {
      return this.iIiliIlill;
   }

   public int iIlIlllllill() {
      return this.lIiliIlill;
   }

   public long IliIlllilIi() {
      return this.lIiliIlill <= 0 ? Long.MAX_VALUE : (this.iIiliIlill + (long)this.lIiliIlill - 1L) / (long)this.lIiliIlill;
   }

   public Ilililllllililll(int slot, int count, long totalPrice) {
      this.IIiliIlill = slot;
      this.lIiliIlill = count;
      this.iIiliIlill = totalPrice;
   }
}
