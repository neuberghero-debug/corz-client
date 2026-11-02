package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class IiilIiliilIi {
   public static final double IIlilIIIllIlilIIIl = 45.0;
   private static final double iIlilIIIlIllilIIIl = 1.0E-6;

   private IiilIiliilIi() {
   }

   public static double lIiiIiIlilli(List<Float> startYaw, float headings) {
      double var2 = 0.0;
      float var4 = headings;
      if (startYaw != null) {
         for (Float var6 : startYaw) {
            if (var6 != null) {
               var2 += IilliliilIIi(var4, var6);
               var4 = var6;
            }
         }
      }

      return var2;
   }

   private static boolean iIlIlllllill(IIlIlllllIlIllll candidate, IIlIlllllIlIllll incumbent) {
      if (incumbent == null) {
         return true;
      } else {
         return candidate.lIiiIiIlilli() != incumbent.lIiiIiIlilli()
            ? candidate.lIiiIiIlilli() < incumbent.lIiiIiIlilli()
            : candidate.IliIlllilIi() < incumbent.IliIlllilIi();
      }
   }

   public static double liiiIIllIl(
      IIlIlllllIlIllll heldMaterial, double materialSwapCost, double currentStand, long fromX, boolean standKnown, float fromZ, long currentYawDeg, double item
   ) {
      double var13 = standKnown && heldMaterial.liiiIIllIl() == fromX
         ? 0.0
         : Math.hypot(
            (double)llIiIiililIiIiil.IiIlliIliiIl(heldMaterial.liiiIIllIl()) + 0.5 - materialSwapCost,
            (double)llIiIiililIiIiil.Illlllllilll(heldMaterial.liiiIIllIl()) + 0.5 - currentStand
         );
      double var15 = IilliliilIIi(fromZ, heldMaterial.iIlIlllllill()) / 45.0;
      double var17 = heldMaterial.IilliliilIIi() == currentYawDeg ? 0.0 : Math.max(0.0, item);
      return var13 + var15 + var17;
   }

   public static <T> List<T> IliIlllilIi(
      List<T> startYawDeg, Function<T, IIlIlllllIlIllll> heldMaterial, double view, double items, float startX, long materialSwapCost, double startZ
   ) {
      long var33 = -2051090867609436456L;
      long var31 = 644072088752616518L;
      ArrayList var11 = new ArrayList();
      if (startYawDeg != null) {
         for (Object var13 : startYawDeg) {
            if (var13 != null) {
               var11.add(var13);
            }
         }
      }

      ArrayList var35 = new ArrayList(var11.size());
      double var36 = view;
      double var15 = items;
      float var17 = startX;
      long var18 = materialSwapCost;
      long var20 = 0L;
      var31 ^= (0L ^ var31) & -1L << 32;

      while (!var11.isEmpty()) {
         var31 ^= ~var31 & -1L >>> 32;
         double var24 = 0.0;
         IIlIlllllIlIllll var26 = null;

         for (var33 ^= (0L ^ var33) & -1L << 32; (int)(var33 >>> 32) < var11.size(); var33 += 4294967296L) {
            IIlIlllllIlIllll var28 = (IIlIlllllIlIllll)heldMaterial.apply(var11.get((int)(var33 >>> 32)));
            double var29 = liiiIIllIl(var28, var36, var15, var20, (boolean)((int)(var31 >>> 32)), var17, var18, startZ);
            if ((int)var31 < 0 || var29 < var24 - 1.0E-6 || var29 <= var24 + 1.0E-6 && iIlIlllllill(var28, var26)) {
               var31 ^= ((long)((int)(var33 >>> 32)) ^ var31) & -1L >>> 32;
               var24 = var29;
               var26 = var28;
            }
         }

         var35.add(var11.remove((int)var31));
         var36 = (double)llIiIiililIiIiil.IiIlliIliiIl(var26.liiiIIllIl()) + 0.5;
         var15 = (double)llIiIiililIiIiil.Illlllllilll(var26.liiiIIllIl()) + 0.5;
         var20 = var26.liiiIIllIl();
         var31 ^= (4294967296L ^ var31) & -1L << 32;
         var17 = var26.iIlIlllllill();
         var18 = var26.IilliliilIIi();
      }

      return var35;
   }

   public static float iliIiiliiiii(float d) {
      float var1 = d % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public static double IilliliilIIi(float fromDeg, float toDeg) {
      return (double)Math.abs(iliIiiliiiii(toDeg - fromDeg));
   }
}
