package gg.corz;

import java.util.Locale;

public final class IilIiIililIiIi {
   public static lIlIliiIlIli liiiIIllIl(boolean remainingNearAsset, int cap, int debt) {
      return remainingNearAsset && cap < 2 * debt ? lIlIliiIlIli.illIIiIIlIilIIiIIl : lIlIliiIlIli.lilIIiIIliilIIiIIl;
   }

   public static boolean iIlIlllllill(String reason) {
      if (reason == null) {
         return false;
      } else {
         String var1 = reason.toLowerCase(Locale.ROOT);
         return !var1.contains(IilliliilIIi<"IilliliilIIi","5M/cHrEyZMwJxfaVq0UBls4PinQUMBn+xkZCvNepCBGwUbPD">())
               && !var1.contains(IilliliilIIi<"IilliliilIIi","NM2QRgpqdX72L4NRZN4tYzoc8mIh768GjFT6Fe5wGn/KoodOzOQPgpA2">())
               && !var1.contains(IilliliilIIi<"IilliliilIIi","XohBGrOJjMy+4/4qHij12PwDM7JVEq5bmGDYGQ4gC57HvSA=">())
            ? var1.contains(IilliliilIIi<"IilliliilIIi","KZkLqiPoTD7nikPCqyLGD4IyxesivhWbfLFPv+ITuxmRVCrMPIQUFgqmAQsQFY27">())
               || var1.contains(IilliliilIIi<"IilliliilIIi","QBC0qXsLoNcdsh9bXaOBWCNlppmNP9sLlopHDsuTGcbmGsiUo6xo2rf4">())
               || var1.contains(IilliliilIIi<"IilliliilIIi","ifNh5DBmGfRvg9K+10qRF3zeGR2WJ7LFK85Fcu4ewxbrHS3l">())
               || var1.contains(IilliliilIIi<"IilliliilIIi","9aHAUIPy97jZziG+abH2AfLcUHQ/7VtucfJatjMzfvNfaYMLsrXe">())
               || var1.contains(IilliliilIIi<"IilliliilIIi","Jk70SysJR2sphNDLipdaEHsriMH+PDCw7kFw23Wk+jdWoDQ=">())
               || var1.contains(IilliliilIIi<"IilliliilIIi","to06VLq2jPnQdxyGoMyieVGWZ6yId2VKAH22ZoE+a3udpPzZUvHk">())
            : false;
      }
   }

   public static lIlIliiIlIli IliIlllilIi(boolean servableNeighbour, boolean remainingNearAsset, int debt, int cap) {
      if (servableNeighbour) {
         return lIlIliiIlIli.IllIIiIIllllIIiIIl;
      } else {
         return remainingNearAsset && debt < 2 * cap ? lIlIliiIlIli.illIIiIIlIilIIiIIl : lIlIliiIlIli.lilIIiIIliilIIiIIl;
      }
   }

   private IilIiIililIiIi() {
   }
}
