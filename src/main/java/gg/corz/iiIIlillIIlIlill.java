package gg.corz;

public final class iiIIlillIIlIlill {
   private long lllIiilill;
   private float lilIiilill;
   private final liIliIliiIliIl IllIiilill = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, ~(704519565 - -75) ^ -704519441, 0.0);
   private float IilIiilill;
   private long illIiilill;

   public float IliIlllilIi() {
      return this.IilIiilill;
   }

   public iiIIlillIIlIlill() {
      this.lilIiilill = 1.0F;
   }

   public boolean IilliliilIIi(boolean visible, long pass) {
      double var4 = visible ? 1.0 : 0.0;
      if (Math.abs(this.IllIiilill.IiIlliIliiIl() - var4) > 0.01) {
         this.IllIiilill.lIiiIiIlilli(var4);
      }

      float var6 = (float)this.IllIiilill.iIlIlllllill();
      if (var6 < 0.004F) {
         this.illIiilill = 0L;
         this.IilIiilill = 0.0F;
         this.lilIiilill = 1.0F;
         return false;
      } else {
         long var7 = System.nanoTime();
         if (this.illIiilill == 0L || pass - this.illIiilill > 1L) {
            this.lllIiilill = var7;
         }

         this.illIiilill = pass;
         float var9 = (float)(var7 - this.lllIiilill) / 2.2E8F;
         if (var9 >= 1.0F) {
            this.lilIiilill = 1.0F;
            this.IilIiilill = var6;
         } else {
            this.lilIiilill = 0.94F + 0.060000002F * llliIlIlilliIlIl.IilliliilIIi(var9, 1.7F);
            this.IilIiilill = var6 * llliIlIlilliIlIl.iIlIlllllill(var9 / 0.6F);
         }

         return true;
      }
   }

   public void iIlIlllllill() {
      this.lllIiilill = System.nanoTime();
   }

   public float liiiIIllIl() {
      return this.lilIiilill;
   }
}
