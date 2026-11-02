package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class ilIilliIiIilli {
   private final Map<llIliIIiilIliIIi, illIIiilIilIIiil> iiiIliIIIl = new LinkedHashMap<>();
   private int IIIlliIIIl;

   public String liiiIIllIl(long dependencyFingerprint, long stand, long target) {
      llIliIIiilIliIIi var7 = new llIliIIiilIliIIi(dependencyFingerprint, stand);
      illIIiilIilIIiil var8 = this.iiiIliIIIl.get(var7);
      if (var8 == null) {
         return null;
      } else if (var8.IliIlllilIi() != target) {
         this.iiiIliIIIl.remove(var7);
         return null;
      } else {
         this.IIIlliIIIl++;
         return var8.liiiIIllIl();
      }
   }

   public void IliIlllilIi(long tick, long why, long dependencyFingerprint, String target, int stand) {
      this.iiiIliIIIl
         .put(
            new llIliIIiilIliIIi(tick, why),
            new illIIiilIilIIiil(
               dependencyFingerprint,
               target != null && !target.isBlank() ? target : IlIlllIlilIl<"IlIlllIlilIl","VU8mHcBNDqOEZ6dxR0jBaQIg2U2g/eYkybxeaqAm81PVuSOeSsya">(),
               stand
            )
         );
   }

   public String iIlIlllllill(long dependencyFingerprint, long target) {
      ArrayList var5 = new ArrayList();
      String var6 = null;

      for (Entry var8 : this.iiiIliIIIl.entrySet()) {
         if (((llIliIIiilIliIIi)var8.getKey()).IliIlllilIi() == dependencyFingerprint) {
            if (((illIIiilIilIIiil)var8.getValue()).IliIlllilIi() != target) {
               var5.add((llIliIIiilIliIIi)var8.getKey());
            } else if (var6 == null) {
               var6 = ((illIIiilIilIIiil)var8.getValue()).liiiIIllIl();
            }
         }
      }

      for (llIliIIiilIliIIi var10 : var5) {
         this.iiiIliIIIl.remove(var10);
      }

      if (var6 != null) {
         this.IIIlliIIIl++;
      }

      return var6;
   }

   public int lIiiIiIlilli() {
      return this.IIIlliIIIl;
   }

   public String IIIllIIliIIl() {
      return IlIlllIlilIl<"IlIlllIlilIl","YV7OUmx4vwlmUYwoGrqxnobbTXy66oc4HCwW7cNsVvmgNNLSoI2CmJ9pLDHyA+U=">()
         + this.iiiIliIIIl.size()
         + IlIlllIlilIl<"IlIlllIlilIl","X1W8V5vPofAGJLKTycqvo1EhcGQGLQhT0OlSms9BcT2HKB21ZQqcZcC4KRz5djDhdw==">()
         + this.IIIlliIIIl;
   }

   public int IilliliilIIi() {
      return this.iiiIliIIIl.size();
   }

   public void iliIiiliiiii() {
      this.iiiIliIIIl.clear();
      this.IIIlliIIIl = 0;
   }
}
