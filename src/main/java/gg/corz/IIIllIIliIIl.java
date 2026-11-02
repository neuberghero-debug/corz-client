package gg.corz;

final class IIIllIIliIIl {
   double liIiiiiIii;
   long IIliilIlii;
   final double IlIiillIii;
   double ilIiiIiIii;

   boolean liiiIIllIl(double var1, long var3) {
      if (var1 == this.liIiiiiIii) {
         return false;
      } else {
         this.ilIiiIiIii = this.IliIlllilIi(var3);
         this.liIiiiiIii = var1;
         this.IIliilIlii = var3;
         return true;
      }
   }

   IIIllIIliIIl(double var1) {
      this.IlIiillIii = var1;
   }

   double IliIlllilIi(long var1) {
      return this.ilIiiIiIii + (this.liIiiiiIii - this.ilIiiIiIii) * IilliliilIIi.Iiiiliiiiiii((double)(var1 - this.IIliilIlii) / 1.0E9 / this.IlIiillIii);
   }
}
