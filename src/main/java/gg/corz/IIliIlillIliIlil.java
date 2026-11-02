package gg.corz;

import java.util.List;

public final class IIliIlillIliIlil {
   public static boolean iIlIlllllill(List<liiIilliiiIill> button, int grid) {
      if (button == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < button.size(); var2++) {
            if (var2 != grid) {
               liiIilliiiIill var3 = (liiIilliiiIill)button.get(var2);
               if (var3 == null || var3.IliIlllilIi()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static int IliIlllilIi(List<liiIilliiiIill> grid) {
      if (grid == null) {
         return -1;
      } else {
         int var1 = -1;

         for (int var2 = 0; var2 < grid.size(); var2++) {
            liiIilliiiIill var3 = (liiIilliiiIill)grid.get(var2);
            if (var3 != null && !var3.IliIlllilIi()) {
               if (iiilliilIIIiliil.IliIlllilIi(var3.liiiIIllIl()).contains(IilliliilIIi<"IilliliilIIi","Vi5cJBgPIuTMKWkvOaU5tj5K+UVm2IWQRWq2vlWNm+k=">())) {
                  return var2;
               }

               if (var3.iIlIlllllill()) {
                  var1 = var2;
               }
            }
         }

         return var1;
      }
   }

   private IIliIlillIliIlil() {
   }

   public static boolean liiiIIllIl(String title, List<liiIilliiiIill> grid) {
      return iiilliilIIIiliil.IliIlllilIi(title).contains(IilliliilIIi<"IilliliilIIi","Vi5cJBgPIuTMKWkvOaU5tj5K+UVm2IWQRWq2vlWNm+k=">())
         ? true
         : IliIlllilIi(grid) >= 0;
   }
}
