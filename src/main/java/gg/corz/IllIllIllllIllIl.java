package gg.corz;

public final class IllIllIllllIllIl {
   private double IiliilIiIl;
   static final int iiIiilIiIl = 6;
   private int liliilIiIl;
   static final int lIliilIiIl = 12;
   private boolean IIiiilIiIl;
   static final int iIliilIiIl = 22;
   private boolean llliilIiIl;
   static final int IIliilIiIl = 8;
   private double illiilIiIl;
   static final int IlliilIiIl = 40;
   private double iIiiilIiIl;
   private int iiliilIiIl = -1;
   static final double IiIiilIiIl = 0.03;
   private boolean lIiiilIiIl;
   static final double liIiilIiIl = 0.05;

   public iiiIilllIIIlilll liiiIIllIl(boolean z, double onGround, double remaining, double want, boolean x, boolean collided) {
      long var17 = -6359400580288910464L;
      long var19 = 3893924665502858556L;
      if (Double.isFinite(onGround) && Double.isFinite(remaining)) {
         double var10 = onGround - this.illiilIiIl;
         double var12 = remaining - this.IiliilIiIl;
         var17 ^= ((long)this.llliilIiIl << 32 ^ var17) & -1L << 32;
         this.llliilIiIl = true;
         this.illiilIiIl = onGround;
         this.IiliilIiIl = remaining;
         if (!z) {
            this.iIlIlllllill();
            return iiiIilllIIIlilll.iIillIlill;
         } else {
            var17 ^= ((long)Double.isFinite(want) ^ var17) & -1L >>> 32;
            if ((int)(var17 >>> 32) == 0) {
               this.iIlIlllllill();
               if ((int)var17 != 0) {
                  this.iIiiilIiIl = want;
               }

               return iiiIilllIIIlilll.iIillIlill;
            } else {
               var19 ^= ((long)((int)var17 != 0 && Double.isFinite(this.iIiiilIiIl) && want <= this.iIiiilIiIl - 0.05 ? 1 : 0) << 32 ^ var19) & -1L << 32;
               if (!(Math.hypot(var10, var12) >= 0.03) && (int)(var19 >>> 32) == 0) {
                  if ((int)var17 != 0 && (!Double.isFinite(this.iIiiilIiIl) || want < this.iIiiilIiIl)) {
                     this.iIiiilIiIl = want;
                  }

                  this.liliilIiIl++;
                  if (this.liliilIiIl >= 40) {
                     this.iIlIlllllill();
                     return iiiIilllIIIlilll.IiillIlill;
                  } else if (this.liliilIiIl >= 22 && !this.lIiiilIiIl) {
                     this.lIiiilIiIl = true;
                     return iiiIilllIIIlilll.ilillIlill;
                  } else if (this.liliilIiIl >= 12 && !this.IIiiilIiIl) {
                     this.IIiiilIiIl = true;
                     return iiiIilllIIIlilll.llillIlill;
                  } else if (this.liliilIiIl < 6 || !collided || this.iiliilIiIl >= 0 && (!x || this.liliilIiIl - this.iiliilIiIl < 8)) {
                     return iiiIilllIIIlilll.iIillIlill;
                  } else {
                     this.iiliilIiIl = this.liliilIiIl;
                     return iiiIilllIIIlilll.IlillIlill;
                  }
               } else {
                  this.iIlIlllllill();
                  if ((int)var17 != 0) {
                     this.iIiiilIiIl = want;
                  }

                  return iiiIilllIIIlilll.iIillIlill;
               }
            }
         }
      } else {
         this.IliIlllilIi();
         return iiiIilllIIIlilll.iIillIlill;
      }
   }

   private void iIlIlllllill() {
      this.liliilIiIl = 0;
      this.iiliilIiIl = -1;
      this.IIiiilIiIl = false;
      this.lIiiilIiIl = false;
      this.iIiiilIiIl = Double.NaN;
   }

   public void IliIlllilIi() {
      this.llliilIiIl = false;
      this.illiilIiIl = 0.0;
      this.IiliilIiIl = 0.0;
      this.iIlIlllllill();
   }

   public IllIllIllllIllIl() {
      this.iIiiilIiIl = Double.NaN;
   }
}
