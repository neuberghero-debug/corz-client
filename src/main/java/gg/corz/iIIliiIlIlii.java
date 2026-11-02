package gg.corz;

public record iIIliiIlIlii(IIIliiilIIliii phase, iiiIliiIIIllii fail) {
   private final iiiIliiIIIllii lIIllilIliIIllilIl;
   private final IIIliiilIIliii iiiIlilIlIIIllilIl;

   public iiiIliiIIIllii IilliliilIIi() {
      return this.lIIllilIliIIllilIl;
   }

   public IIIliiilIIliii iIlIlllllill() {
      return this.iiiIlilIlIIIllilIl;
   }

   static iIIliiIlIlii liiiIIllIl(iiiIliiIIIllii f) {
      return new iIIliiIlIlii(IIIliiilIIliii.IiIiliiIIl, f);
   }

   public iIIliiIlIlii(IIIliiilIIliii phase, iiiIliiIIIllii fail) {
      this.iiiIlilIlIIIllilIl = phase;
      this.lIIllilIliIIllilIl = fail;
   }

   static iIIliiIlIlii IliIlllilIi(IIIliiilIIliii p) {
      return new iIIliiIlIlii(p, iiiIliiIIIllii.lIlIIliIIl);
   }
}
