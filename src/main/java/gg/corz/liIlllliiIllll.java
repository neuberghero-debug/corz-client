package gg.corz;

public final class liIlllliiIllll {
   private static final double Iiliiliilliliiliil = 1.5;
   private static final double lIiiiliiliIiiiliil = 0.6;
   private static final double iiliiliilIIiiiliil = 7.0;
   private static final double llliiliililliiliil = 3.0;

   public static double IliIlllilIi(iIilIiiIlilIii in, IIliiiIilIliiiIi w) {
      if (!(in.IIIllIIliIIl() <= in.IlIlllIlilIl())) {
         return Double.NEGATIVE_INFINITY;
      } else {
         double var2 = in.IliIlllilIi();
         double var4 = w.IilliliilIIi() * w.liiiIIllIl() * (var2 + (in.liiiIIllIl() ? 8.0 : 0.0) + (in.iIlIlllllill() ? 100.0 : 0.0));
         double var6 = w.lIiiIiIlilli() * (double)Math.min(Math.max(in.IilliliilIIi(), 0), w.iliIiiliiiii());
         return var4
            + var6
            - liiiIIllIl(in.lIiiIiIlilli())
            + w.IIIllIIliIIl() * in.iliIiiliiiii()
            - w.iIlIlllllill() * in.IIIllIIliIIl()
            - w.IlIlllIlilIl() * (double)in.IiIlliIliiIl()
            - w.IiIlliIliiIl() * (double)in.IIlllIlliIll()
            - in.Illlllllilll() * var2
            + (in.Iilllilliill() ? w.IIlllIlliIll() : 0.0);
      }
   }

   public static double liiiIIllIl(double apexAboveFloor) {
      if (apexAboveFloor < 3.0) {
         return (3.0 - apexAboveFloor) * 1.5;
      } else {
         return apexAboveFloor > 7.0 ? (apexAboveFloor - 7.0) * 0.6 : 0.0;
      }
   }

   private liIlllliiIllll() {
   }
}
