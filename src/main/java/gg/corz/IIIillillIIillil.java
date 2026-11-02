package gg.corz;

import java.util.Locale;

public final class IIIillillIIillil {
   public static final double IIIiliiIil = 5.0;
   public static final double lIIiliiIil = 0.08;
   public static final double IlIiliiIil = 1.0;
   public static final double iIIiliiIil = 25.0;
   public static final double iiilliiIil = 40.0;
   public static final double liilliiIil = 1.5;

   private IIIillillIIillil() {
   }

   public static String iIlIlllllill(iIlliilIllliil d, illiilllIiliilll c, IIlIIilllIlIIill switchCostTicks, double netGainTicks, double a) {
      return String.format(
         Locale.ROOT,
         lIiiIiIlilli<"lIiiIiIlilli","Dl9jeplQa3fb7o63Hvc39mHqHtJzi57xevHJwnQH+MA+gva/csFM11q2fvt1RR0zCmjZ0bvbfwXOrQuj7Qc0fKO0oU9T7HJl9ajYXiPIQxORG40sS1SM7r0DA7TGnRsW4I9xX0kD/Dd79eOEiClpBup3zwATDOeerXTFZHHQsUEHzNwhHrCzc8h3REfvCNZd">(),
         c == null ? 0L : c.IliIlllilIi(),
         c == null ? 0 : c.liiiIIllIl(),
         c == null ? 0.0 : c.iIlIlllllill(),
         switchCostTicks == null ? lIiiIiIlilli<"lIiiIiIlilli","vRLrgX+vJcEka8o8gp1RHWwOQ6BEj/uPYMDx0uKQkKk=">() : switchCostTicks.IliIlllilIi(),
         switchCostTicks == null ? 0L : switchCostTicks.liiiIIllIl(),
         netGainTicks,
         a,
         d
      );
   }

   public static liliiliiiliili liiiIIllIl(illiilllIiliilll a, IIlIIilllIlIIill c, double perPlacementTicks) {
      long var18 = -3537003001776463730L;
      double var4 = Math.max(0.0, perPlacementTicks);
      double var6 = IliIlllilIi(a, c);
      var18 ^= ((long)(c == null ? 0 : Math.max(0, c.iIlIlllllill())) << 32 ^ var18) & -1L << 32;
      double var9 = (double)((int)(var18 >>> 32)) * var4;
      double var11 = (int)(var18 >>> 32) <= 0 ? 0.0 : (double)((int)(var18 >>> 32)) / Math.max(1.0, var6 + var9);
      if (a != null && a.liiiIIllIl() > 0) {
         double var13 = (double)a.liiiIIllIl() / Math.max(1.0, a.iIlIlllllill());
         if ((int)(var18 >>> 32) <= 0) {
            return IilliliilIIi(iIlliilIllliil.iIliiIlliIlliiIlli, a, c, var13, 0.0, var6, 0.0);
         } else {
            double var15 = (double)((int)(var18 >>> 32)) / var13 - (var6 + var9);
            iIlliilIllliil var17 = var15 > 40.0 && var11 > var13 * 1.5 ? iIlliilIllliil.llliiIlliilliiIlli : iIlliilIllliil.iIliiIlliIlliiIlli;
            return IilliliilIIi(var17, a, c, var13, var11, var6, var15);
         }
      } else {
         return IilliliilIIi(iIlliilIllliil.IiliiIllililiiIlli, a, c, 0.0, var11, var6, 0.0);
      }
   }

   public static double IliIlllilIi(illiilllIiliilll a, IIlIIilllIlIIill c) {
      if (c == null) {
         return 0.0;
      } else {
         double var2 = Math.max(0.0, c.IilliliilIIi()) * 5.0 + Math.max(0.0, c.lIiiIiIlilli()) * 0.08;
         if (a != null && c.iliIiiliiiii() != a.iliIiiliiiii()) {
            var2 += 25.0;
         }

         if (a != null && c.IIIllIIliIIl()) {
            var2 += Math.max(0.0, a.IilliliilIIi()) * 5.0 * 1.0;
         }

         return var2;
      }
   }

   private static liliiliiiliili IilliliilIIi(
      iIlliilIllliil altRate, illiilllIiliilll netGain, IIlIIilllIlIIill d, double sc, double a, double currentRate, double c
   ) {
      return new liliiliiiliili(altRate, sc, a, currentRate, c, iIlIlllllill(altRate, netGain, d, currentRate, c));
   }
}
