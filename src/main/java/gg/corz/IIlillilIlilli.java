package gg.corz;

final class IIlillilIlilli {
   final float iIllliIIIl;
   final float IillliIIIl;
   final float llllliIIIl;
   final float iillliIIIl;
   final float illlliIIIl;
   final float IlllliIIIl;
   final float lIllliIIIl;
   final float lillliIIIl;

   IIlillilIlilli(illlliilIillliil aw, float ah, float g) {
      this.iillliIIIl = aw.liIlIiilil;
      iIlIillIllIill var4 = aw.IIllIiilil;
      if (var4 != null) {
         this.lIllliIIIl = var4.ilIIIiIIiIiIIIiIIi / ah;
         this.iIllliIIIl = var4.IIlIIiIIilIlIIiIIi / ah;
         this.IlllliIIIl = 1.0F - var4.liIIIiIIiiiIIIiIIi / g;
         this.llllliIIIl = 1.0F - var4.iIlIIiIIiIllIIiIIi / g;
      } else {
         this.lIllliIIIl = this.iIllliIIIl = this.IlllliIIIl = this.llllliIIIl = 0.0F;
      }

      iIlIillIllIill var5 = aw.iiIlIiilil;
      if (var5 != null) {
         this.illlliIIIl = var5.IIlIIiIIilIlIIiIIi - var5.ilIIIiIIiIiIIIiIIi;
         this.IillliIIIl = var5.liIIIiIIiiiIIIiIIi - var5.iIlIIiIIiIllIIiIIi;
         this.lillliIIIl = var5.liIIIiIIiiiIIIiIIi;
      } else {
         this.illlliIIIl = this.IillliIIIl = this.lillliIIIl = 0.0F;
      }
   }

   boolean IliIlllilIi() {
      return this.illlliIIIl > 0.0F && this.IillliIIIl > 0.0F && (this.iIllliIIIl != this.lIllliIIIl || this.llllliIIIl != this.IlllliIIIl);
   }
}
