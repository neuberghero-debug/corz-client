package gg.corz;

public final class iliiIlilIiiiIlil {
   public static final double liIlIliIil = 4.0;
   public static final double IiIlIliIil = 0.35;
   public static final double iIiIIliIil = 1.0;
   public static final double IiiIIliIil = 1.5;
   public static final double liiIIliIil = 3.0;
   public static final double lliIIliIil = 0.45;
   public static final double llIlIliIil = -2.0;
   public static final float IliIIliIil = 6.0F;
   public static final double IIllIliIil = 10.0;
   public static final double iiiIIliIil = 1.5;
   public static final double IIIlIliIil = 0.5;
   public static final double lIIlIliIil = 2.0;
   public static final double iIIlIliIil = 1.5;
   public static final double iliIIliIil = 4.0;
   public static final double IlIlIliIil = -1.0;
   public static final double iiIlIliIil = 2.5;
   public static final double ilIlIliIil = -3.0;

   public static double iIlIlllllill(liiilIiliiiilIil e) {
      iiIllIlIIlllIl var1 = e.IlIillIiilIi() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : e.IlIillIiilIi();
      float var2 = (float)liiIIliliiiIIlil.IliIlllilIi(1.0, 1.0, 6.0);
      float var3 = iiIiiliIIliili.IliIlllilIi(var2, var1.lIiiIiIlilli());
      double var4 = (double)iiIiiliIIliili.lIiiIiIlilli(var3, var1);
      if (e.liiiIIllIl()) {
         var4 *= 0.45;
      }

      float var6 = e.Illillliilli();
      return var4 * (double)(Float.isFinite(var6) && var6 > 0.0F ? var6 : 1.0F);
   }

   public static double IliIlllilIi(liiilIiliiiilIil current, lliiilIiiliiilIi self, float threatToUs, boolean e) {
      if (current == null) {
         return Double.NEGATIVE_INFINITY;
      } else {
         double var4 = iIlIlllllill(current);
         double var6 = 4.0 * IilliliilIIi(var4 / Math.max(1.0, (double)current.IliIlllilIi()), 0.0, 1.5);
         if (current.IllIllllIl() || !current.Iilililiiili()) {
            var6 += 3.0;
         }

         if ((double)current.IIlilIliiIli() < 0.5) {
            var6 += 1.5 * (1.0 - (double)current.IIlilIliiIli());
         }

         float var8 = self == null ? 20.0F : self.IliIlllilIi();
         if (Float.isFinite(threatToUs) && threatToUs > 0.0F) {
            var6 += 2.0 * (double)threatToUs / Math.max(1.0, (double)var8);
         }

         if (current.Iiiiliiiiiii()) {
            var6++;
         }

         if (current.liiiIIllIl()) {
            var6 += -1.0;
         }

         if (!current.Iilllilliill()) {
            var6 += -2.0;
         }

         if (current.lliIliliIl()) {
            var6 += -3.0;
         }

         var6 -= 0.35 * Math.max(0.0, liiiIIllIl(current.Illlllllilll(), e) - 4.0);
         if (e) {
            var6 += 2.5;
         }

         return var6;
      }
   }

   private iliiIlilIiiiIlil() {
   }

   public static double liiiIIllIl(double current, boolean distance) {
      return distance && current > 10.0 ? 10.0 : current;
   }

   private static double IilliliilIIi(double hi, double v, double lo) {
      return hi < v ? v : Math.min(hi, lo);
   }
}
