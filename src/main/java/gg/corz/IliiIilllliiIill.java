package gg.corz;

public final class IliiIilllliiIill {
   private long Iilililill;
   private boolean illililill;

   public boolean iIlIlllllill() {
      return this.illililill;
   }

   public liIiiilliiIiiill IliIlllilIi(iliIllllIiiIllll request) {
      long var2 = request.IliIlllilIi();
      if (!this.illililill) {
         this.illililill = true;
         this.Iilililill = var2;
         return liIiiilliiIiiill.iIlIiiiill;
      } else {
         return this.Iilililill == var2 ? liIiiilliiIiiill.IllIiiiill : liIiiilliiIiiill.lllIiiiill;
      }
   }

   public long IilliliilIIi() {
      return this.Iilililill;
   }

   public void liiiIIllIl() {
      this.illililill = false;
      this.Iilililill = 0L;
   }
}
