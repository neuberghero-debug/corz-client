package gg.corz;

public final class lIIlliiiIIllii {
   private static final double IilIIliIIl = 0.8;
   private static final double illIIliIIl = 0.4;

   public static IiIllIilliIllIil IliIlllilIi(double explosionKnockbackResistance) {
      if (explosionKnockbackResistance < 0.4) {
         return IiIllIilliIllIil.IiIilIlIil;
      } else {
         return explosionKnockbackResistance < 0.8 ? IiIllIilliIllIil.liIilIlIil : IiIllIilliIllIil.iiIilIlIil;
      }
   }

   private lIIlliiiIIllii() {
   }

   public static double liiiIIllIl(IiIllIilliIllIil l) {
      if (l == null) {
         return 0.0;
      } else {
         return switch (l) {
            case liIilIlIil -> 1.0;
            case iiIilIlIil -> 0.25;
            case IiIilIlIil -> 0.0;
         };
      }
   }
}
