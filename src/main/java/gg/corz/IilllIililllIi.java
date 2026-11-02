package gg.corz;

final class IilllIililllIi extends lIiilIliIiilIl {
   int IIiiilIiilIiiilIii;
   int IlliilIiillliilIii;
   long iiiiilIiiIIIIIiIii;
   double IiiiilIiiliiiilIii;
   int lllIIiIiiillIIiIii;
   int iiIiilIiiIIliilIii;
   int illiilIiiIiliilIii;
   long IiIiilIiiliIiilIii;
   int[] IlIIIiIiillIIIiIii;
   int[] ilIIIiIiiIiIIIiIii;
   double iIiiilIiiIliiilIii;
   int liIIIiIiiiiIIIiIii;
   int[] lIIIIiIiiiIIIIiIii = new int[0];
   int lIliilIiiiIliilIii;
   double lliiilIiiiliiilIii;
   int iIlIIiIiiIllIIiIii;
   int IIlIIiIiilIlIIiIii;
   int liliilIiiiiliilIii;

   private IilllIililllIi() {
      this.IlIIIiIiillIIIiIii = new int[0];
      this.ilIIIiIiiIiIIIiIii = new int[0];
      this.liIIIiIiiiiIIIiIii = -1;
   }

   float lIiiIiIlilli(long now) {
      if (this.iiiiilIiiIIIIIiIii == 0L) {
         return 0.0F;
      } else {
         float var3 = (float)(now - this.iiiiilIiiIIIIIiIii) / 2.3E8F;
         if (var3 >= 1.0F) {
            this.iiiiilIiiIIIIIiIii = 0L;
            return 0.0F;
         } else {
            float var4 = 1.0F - Math.max(0.0F, var3);
            return var4 * var4 * var4;
         }
      }
   }
}
