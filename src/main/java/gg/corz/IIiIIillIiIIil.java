package gg.corz;

import net.minecraft.class_243;

public final class IIiIIillIiIIil {
   private static final double IIiIiilIilIiIiilIi = Math.sqrt(0.5);
   private static final double lilIiilIiiilIiilIi = Math.sqrt(2.0);

   public static IlIililllIilil iIlIlllllill(class_243 losBudget, class_243 los, llIiililIiil targetFeet, int prefer) {
      double var4 = 0.3;
      double var7 = Math.min(losBudget.field_1351 + 1.8 - 0.1, losBudget.field_1351 + 0.45);
      IlIililllIilil var9 = new IlIililllIilil(
         true,
         losBudget,
         los,
         losBudget.field_1352 - var4,
         losBudget.field_1351,
         losBudget.field_1350 - var4,
         losBudget.field_1352 + var4,
         losBudget.field_1351 + 1.8,
         losBudget.field_1350 + var4,
         losBudget.field_1352,
         var7,
         losBudget.field_1350,
         2.8,
         var4,
         losBudget.field_1351,
         targetFeet,
         prefer
      );
      var9.IIlllIlliIll(
         losBudget.field_1352 - var4,
         losBudget.field_1351,
         losBudget.field_1350 - var4,
         losBudget.field_1352 + var4,
         losBudget.field_1351 + 1.8,
         losBudget.field_1350 + var4
      );
      return var9;
   }

   public static double IlIlllIlilIl(double feetY, double levelY) {
      return Double.isFinite(feetY) && Double.isFinite(levelY) ? lilliiiillii.IilliliilIIi(feetY - levelY) : lilliiiillii.IilliliilIIi(Double.NaN);
   }

   static double IIIllIIliIIl(double az, double bz, double bx, double ax) {
      return Math.hypot(az - bx, bz - ax);
   }

   public static liiIIlliiiIIll iliIiiliiiii(class_243 at) {
      return new lIilIiIliIilIiIl(at);
   }

   public static IlIililllIilil IilliliilIIi(class_243 centre, class_243 los, llIiililIiil prefer, int losBudget) {
      IlIililllIilil var4 = lIiiIiIlilli(centre, los, prefer, losBudget);
      double var5 = centre.field_1351 - 1.0;
      var4.lIlIllIliiIlIllIli = Double.isFinite(var5) ? var5 + 0.6 : Double.POSITIVE_INFINITY;
      return var4;
   }

   public static IlIililllIilil lIiiIiIlilli(class_243 los, class_243 prefer, llIiililIiil centre, int losBudget) {
      double var4 = 1.0;
      IlIililllIilil var7 = new IlIililllIilil(
         false,
         los,
         prefer,
         los.field_1352 - var4,
         los.field_1351 - var4,
         los.field_1350 - var4,
         los.field_1352 + var4,
         los.field_1351 + var4,
         los.field_1350 + var4,
         los.field_1352,
         los.field_1351,
         los.field_1350,
         2.8,
         var4,
         los.field_1351 - var4,
         centre,
         losBudget
      );
      double var8 = 0.5;
      var7.IIlllIlliIll(
         los.field_1352 - var8, los.field_1351 - var4, los.field_1350 - var8, los.field_1352 + var8, los.field_1351 + var4, los.field_1350 + var8
      );
      return var7;
   }

   public static liiIIlliiiIIll IliIlllilIi(iIllIlllIlllIlll t, llIiililIiil losBudget, int los) {
      if (t != null && t.iliIiiliiiii() != null) {
         return (liiIIlliiiIIll)(switch (t.IIIllIIliIIl()) {
            case iillilIiIl -> iIlIlllllill(t.iliIiiliiiii(), t.IlIlllIlilIl(), losBudget, los);
            case iIililIiIl -> liiiIIllIl(t.iliIiiliiiii(), t.IlIlllIlilIl(), t.iliIiiliiiii().field_1351, losBudget, los);
            case IIililIiIl -> IilliliilIIi(t.iliIiiliiiii(), t.IlIlllIlilIl(), losBudget, los);
            case lIililIiIl -> iliIiiliiiii(t.iliIiiliiiii());
         });
      } else {
         return null;
      }
   }

   public static IlIililllIilil liiiIIllIl(class_243 targetFeet, class_243 los, double losBudget, llIiililIiil levelY, int prefer) {
      IlIililllIilil var6 = iIlIlllllill(targetFeet, los, levelY, prefer);
      var6.lIlIllIliiIlIllIli = Double.isFinite(losBudget) ? losBudget + 0.6 : Double.POSITIVE_INFINITY;
      return var6;
   }

   private IIiIIillIiIIil() {
   }
}
