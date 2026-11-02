package gg.corz;

final class iiIlllllIIllllll {
   final float iIiIIiIill;
   final float liiIIiIill;
   final float IliIIiIill;
   final float IIiIIiIill;
   final float iliIIiIill;
   final float lIiIIiIill;
   final float lliIIiIill;
   final float IiiIIiIill;

   boolean IliIlllilIi() {
      return this.lliIIiIill > 0.0F && this.iliIIiIill > 0.0F && (this.lIiIIiIill != this.IIiIIiIill || this.IliIIiIill != this.iIiIIiIill);
   }

   iiIlllllIIllllll(illlliilIillliil aw, float g, float ah) {
      this.liiIIiIill = aw.liIlIiilil;
      iIlIillIllIill var4 = aw.IIllIiilil;
      if (var4 != null) {
         this.IIiIIiIill = var4.ilIIIiIIiIiIIIiIIi / g;
         this.lIiIIiIill = var4.IIlIIiIIilIlIIiIIi / g;
         this.iIiIIiIill = 1.0F - var4.liIIIiIIiiiIIIiIIi / ah;
         this.IliIIiIill = 1.0F - var4.iIlIIiIIiIllIIiIIi / ah;
      } else {
         this.IIiIIiIill = this.lIiIIiIill = this.iIiIIiIill = this.IliIIiIill = 0.0F;
      }

      iIlIillIllIill var5 = aw.iiIlIiilil;
      if (var5 != null) {
         this.lliIIiIill = var5.IIlIIiIIilIlIIiIIi - var5.ilIIIiIIiIiIIIiIIi;
         this.iliIIiIill = var5.liIIIiIIiiiIIIiIIi - var5.iIlIIiIIiIllIIiIIi;
         this.IiiIIiIill = var5.liIIIiIIiiiIIIiIIi;
      } else {
         this.lliIIiIill = this.iliIIiIill = this.IiiIIiIill = 0.0F;
      }
   }
}
