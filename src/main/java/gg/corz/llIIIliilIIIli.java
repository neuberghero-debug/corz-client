package gg.corz;

import java.util.function.DoubleUnaryOperator;

public enum llIIIliilIIIli {
   iiillliiiIIIilliii(f -> 1.0 - Math.pow(1.0 - f, 3.0)),
   Iililliiilililliii(f -> f * f * f * f * f),
   llillliiiilillliii(f -> -(Math.cos(Math.PI * f) - 1.0) / 2.0),
   iIillliiiIlillliii(f -> Math.sin(f * Math.PI / 2.0)),
   IIIIiliiilIIIiliii(f -> f == 0.0 ? 0.0 : Math.pow(2.0, 10.0 * f - 10.0)),
   lIlIiliiiiIlIiliii(
      f -> {
         if (f <= 0.0) {
            return 0.0;
         } else if (f >= 1.0) {
            return 1.0;
         } else {
            double var2 = Math.PI * 4.0 / 9.0;
            return f < 0.5
               ? -(Math.pow(2.0, 20.0 * f - 10.0) * Math.sin((20.0 * f - 11.125) * var2)) / 2.0
               : Math.pow(2.0, -20.0 * f + 10.0) * Math.sin((20.0 * f - 11.125) * var2) / 2.0 + 1.0;
         }
      }
   ),
   liiilliiiiiiilliii(f -> f < 0.5 ? (1.0 - Math.sqrt(1.0 - 4.0 * f * f)) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * f + 2.0, 2.0)) + 1.0) / 2.0),
   iliilliiiIiiilliii(f -> Math.sqrt(1.0 - Math.pow(f - 1.0, 2.0))),
   IIillliiilIillliii(f -> 1.0 - Math.cos(f * Math.PI / 2.0)),
   IIiIiliiilIiIiliii(f -> 1.0 - IliIlllilIi(1.0 - f)),
   iIlilliiiIllilliii(f -> 1.0 - Math.pow(1.0 - f, 4.0)),
   IiIIiliiiliIIiliii(f -> {
      if (f <= 0.0) {
         return 0.0;
      } else if (f >= 1.0) {
         return 1.0;
      } else {
         double var2 = Math.PI * 2.0 / 3.0;
         return -Math.pow(2.0, 10.0 * f - 10.0) * Math.sin((f * 10.0 - 0.75) * var2);
      }
   }),
   lIiilliiiiIiilliii(f -> f < 0.5 ? 16.0 * f * f * f * f * f : 1.0 - Math.pow(-2.0 * f + 2.0, 5.0) / 2.0),
   llIIiliiiilIIiliii(f -> {
      if (f == 0.0) {
         return 0.0;
      } else if (f == 1.0) {
         return 1.0;
      } else {
         return f < 0.5 ? Math.pow(2.0, 20.0 * f - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * f + 10.0)) / 2.0;
      }
   }),
   lllilliiiillilliii(f -> f < 0.5 ? 8.0 * f * f * f * f : 1.0 - Math.pow(-2.0 * f + 2.0, 4.0) / 2.0),
   iililliiiIIiilliii(f -> 1.0 - Math.pow(1.0 - f, 5.0)),
   iIIIiliiiIlIIiliii(f -> f == 1.0 ? 1.0 : 1.0 - Math.pow(2.0, -10.0 * f)),
   lilIiliiiiilIiliii(
      f -> {
         double var2 = 2.5949095;
         return f < 0.5
            ? Math.pow(2.0 * f, 2.0) * ((var2 + 1.0) * 2.0 * f - var2) / 2.0
            : (Math.pow(2.0 * f - 2.0, 2.0) * ((var2 + 1.0) * (2.0 * f - 2.0) + var2) + 2.0) / 2.0;
      }
   ),
   lliIiliiiiliIiliii(f -> f < 0.5 ? (1.0 - IliIlllilIi(1.0 - 2.0 * f)) / 2.0 : (1.0 + IliIlllilIi(2.0 * f - 1.0)) / 2.0),
   illIiliiiIilIiliii(f -> {
      double var2 = 1.70158;
      double var4 = f - 1.0;
      return 1.0 + (var2 + 1.0) * var4 * var4 * var4 + var2 * var4 * var4;
   }),
   ilIliliiiIiIliliii(4) {
      @Override
      public double liiiIIllIl(double factor) {
         long var4 = 7841290301679105831L;
         var4 ^= (17179869184L ^ var4) & -1L << 32;
         return Math.floor(factor * (double)((int)(var4 >>> 32))) / (double)((int)(var4 >>> 32));
      }
   },
   lIIilliiiiIIilliii(f -> f < 0.5 ? 4.0 * f * f * f : 1.0 - Math.pow(-2.0 * f + 2.0, 3.0) / 2.0),
   IlIilliiillIilliii(f -> f * f),
   IllIiliiilllIiliii(f -> {
      double var2 = 1.70158;
      return (var2 + 1.0) * f * f * f - var2 * f * f;
   }),
   iIiIiliiiIliIiliii(llIIIliilIIIli::IliIlllilIi),
   lIIliliiiiIIliliii(f -> f >= 1.0 ? 1.0 : 0.0),
   lilllliiiiilllliii(f -> f),
   IIlilliiilIlilliii(f -> f * f * f * f),
   Iliilliiilliilliii(f -> 1.0 - Math.sqrt(1.0 - f * f)),
   iiiIiliiiIIIliliii(
      f -> {
         double var2 = 1.70158;
         double var4 = var2 * 1.525;
         return f < 0.5
            ? Math.pow(2.0 * f, 2.0) * ((var4 + 1.0) * 2.0 * f - var4) / 2.0
            : (Math.pow(2.0 * f - 2.0, 2.0) * ((var4 + 1.0) * (2.0 * f - 2.0) + var4) + 2.0) / 2.0;
      }
   ),
   ilIilliiiIiIilliii(f -> 1.0 - (1.0 - f) * (1.0 - f)),
   liIilliiiiiIilliii(f -> f < 0.5 ? 2.0 * f * f : 1.0 - Math.pow(-2.0 * f + 2.0, 2.0) / 2.0),
   IiiIiliiiliiIiliii(f -> 1.0 - Math.pow(1.0 - f, 5.0)),
   iiIIiliiiIIlIiliii(f -> {
      if (f <= 0.0) {
         return 0.0;
      } else if (f >= 1.0) {
         return 1.0;
      } else {
         double var2 = Math.PI * 2.0 / 3.0;
         return Math.pow(2.0, -10.0 * f) * Math.sin((f * 10.0 - 0.75) * var2) + 1.0;
      }
   }),
   Iiillliiiliillliii(f -> f * f * f),
   IlIliliiillIliliii(f -> f > 0.0 ? 1.0 : 0.0);
   private final DoubleUnaryOperator liIliliiiiiIliliii;
   // $VF: synthetic field
   private static final llIIIliilIIIli[] IIlliliiilIlliliii = iiiIlIIIll();

   private static double IliIlllilIi(double f) {
      double var2 = 7.5625;
      double var4 = 2.75;
      if (f < 1.0 / var4) {
         return var2 * f * f;
      } else if (f < 2.0 / var4) {
         double var8;
         return var2 * (var8 = f - 1.5 / var4) * var8 + 0.75;
      } else {
         double var6;
         double var7;
         return f < 2.5 / var4 ? var2 * (var6 = f - 2.25 / var4) * var6 + 0.9375 : var2 * (var7 = f - 2.625 / var4) * var7 + 0.984375;
      }
   }

   private llIIIliilIIIli(DoubleUnaryOperator nullx) {
      this.liIliliiiiiIliliii = nullx;
   }

   public double liiiIIllIl(double factor) {
      double var3 = Math.min(1.0, Math.max(0.0, factor));
      return this.liIliliiiiiIliliii.applyAsDouble(var3);
   }

   private llIIIliilIIIli(int steps) {
      this(stepsx -> Math.floor(stepsx * (double)steps) / (double)steps);
   }
}
