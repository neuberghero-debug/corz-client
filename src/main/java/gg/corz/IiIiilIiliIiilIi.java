package gg.corz;

public final class IiIiilIiliIiilIi {
   public static boolean liiiIIllIl(
      boolean tempActive, boolean confirming, boolean falling, boolean anyScreenOpen, boolean grounded, boolean placing, boolean cleanupActive
   ) {
      return tempActive && !confirming && !falling && !anyScreenOpen && !grounded && !placing && !cleanupActive;
   }

   public static iIIliiIlIlii IliIlllilIi(IIIliiilIIliii in, lililiiilili p) {
      return switch (in) {
         case ilIiliiIIl -> iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.iIIiliiIIl);
         case lIIiliiIIl -> p.iIlIlllllill()
         ? iIIliiIlIlii.liiiIIllIl(iiiIliiIIIllii.iIlIIliIIl)
         : (p.IliIlllilIi() ? iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.IlIiliiIIl) : iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.iIIiliiIIl));
         case llIiliiIIl -> iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.llIiliiIIl);
         case iIIiliiIIl -> p.iIlIlllllill()
         ? iIIliiIlIlii.liiiIIllIl(iiiIliiIIIllii.IllIIliIIl)
         : (p.liiiIIllIl() ? iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.ilIiliiIIl) : iIIliiIlIlii.IliIlllilIi(IIIliiilIIliii.llIiliiIIl));
         case IlIiliiIIl, IiIiliiIIl -> iIIliiIlIlii.IliIlllilIi(in);
      };
   }

   private IiIiilIiliIiilIi() {
   }
}
