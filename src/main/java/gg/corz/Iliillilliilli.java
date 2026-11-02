package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.minecraft.class_1792;
import net.minecraft.class_7923;

final class Iliillilliilli {
   int IiiiliIIIl;
   int IIiiliIIIl;
   int IliiliIIIl;
   int lililiIIIl;
   int iliiliIIIl;
   int lliiliIIIl;
   int iIiiliIIIl;
   int lIiiliIIIl;
   int iililiIIIl;
   final LinkedHashMap<class_1792, Integer> liiiliIIIl = new LinkedHashMap<>();

   String IliIlllilIi() {
      if (this.liiiliIIIl.isEmpty()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(IilliliilIIi<"IilliliilIIi","1dtnfNuS98QYlsfxpy1ajTA+EgaFJj8pRUmlCqbL4YUXVd9mCoQ=">());
         int var2 = 0;

         for (Entry var4 : this.liiiliIIIl.entrySet()) {
            if (var2++ > 0) {
               var1.append(IilliliilIIi<"IilliliilIIi","d4x47SJbKKJT0CPoCHOVSWLn3RYXXBqTRcS9lu2X">());
            }

            if (var2 > 4) {
               var1.append(IilliliilIIi<"IilliliilIIi","VKePhk0x4oFyS/FdImhA0ClsjYKtE1/ka8G5t7A=">())
                  .append(this.liiiliIIIl.size() - 4)
                  .append(IilliliilIIi<"IilliliilIIi","A1BVaO677vr1TqCVuNgSruRrQMQuJkARL7bdroVnFG9+">());
               break;
            }

            var1.append(class_7923.field_41178.method_10221((class_1792)var4.getKey()).method_12832())
               .append(IilliliilIIi<"IilliliilIIi","qAyBc61byH8TQCd+T9NuNn3TEbDUD059zx0ImFhk">())
               .append(var4.getValue());
         }

         return var1.append(IilliliilIIi<"IilliliilIIi","YgxOi8B6ttCJlq9DL33lwYSwe7of8zBoDfaqJx4=">()).toString();
      }
   }

   private Iliillilliilli() {
   }

   int liiiIIllIl() {
      return this.iIiiliIIIl + this.IliiliIIIl + this.lliiliIIIl + this.iliiliIIIl + this.IiiiliIIIl;
   }

   String iIlIlllllill() {
      return IilliliilIIi<"IilliliilIIi","nE5LeQjSPkG8FM0Z8siUiyR79Trb1sbIfb1vuSfCmbhrupHi3SXT">()
         + this.IIiiliIIIl
         + IilliliilIIi<"IilliliilIIi","cs3SfVeKlT2MTSUzdl8pIcLXOScsSbLg6BThhb6tBnKzLFXfSJSOkOF/">()
         + this.lIiiliIIIl
         + IilliliilIIi<"IilliliilIIi","rnD+urXRjAWRCDTBxwFVGa68tuRVi4DW0fk/sY+wwSyxLZUZB3qqgA==">()
         + this.iIiiliIIIl
         + IilliliilIIi<"IilliliilIIi","Fgy2pncOCHCFaN5en64OgIymKB4jaJ0O5TiUPy4Ryg+fr9SljwWnPvo=">()
         + this.IliiliIIIl
         + IilliliilIIi<"IilliliilIIi","RaDBKjuGMgOxnbJVYFuppZgpNVY537i8B4e0aNbO0Ea3Qo0LPx4oQuo=">()
         + this.lliiliIIIl
         + IilliliilIIi<"IilliliilIIi","PLIojlHzVhucDK2hWIJW3XqZ5PGk9jj47L+WiHsJp5QxWw==">()
         + this.iliiliIIIl
         + (this.IiiiliIIIl > 0 ? IilliliilIIi<"IilliliilIIi","w3CbYZ8vgN2HX5FdyqjRX9VcUNza+2F4siepEjlYU8MJ5pAM8pQ=">() + this.IiiiliIIIl : "")
         + this.IliIlllilIi()
         + IilliliilIIi<"IilliliilIIi","YgxOi8B6ttCJlq9DL33lwYSwe7of8zBoDfaqJx4=">();
   }
}
