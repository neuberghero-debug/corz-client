package gg.corz;

public final class iiIIlIIiIIlIlIIi {
   private long lIlillliil;

   public void IliIlllilIi() {
      this.lIlillliil = System.nanoTime();
   }

   public float liiiIIllIl() {
      if (this.lIlillliil == (7490422819071778157L ^ 7490422819071778157L)) {
         return 1.0F;
      } else {
         float var1 = (float)(System.nanoTime() - this.lIlillliil) / 2.4E8F;
         if (var1 >= 1.0F) {
            this.lIlillliil = 0L;
            return 1.0F;
         } else {
            return 1.0F + 0.25F * llliIlIlilliIlIl.lIiiIiIlilli(var1);
         }
      }
   }
}
