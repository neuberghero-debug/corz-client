package gg.corz;

import com.google.gson.JsonObject;

public record llIIliIiilIIliIi(iIliIlIlIlliIlIl placement, String dimension) {
   private final String IllIIliIIi;
   private final iIliIlIlIlliIlIl iIlIIliIIi;

   public JsonObject IilliliilIIi() {
      JsonObject var1 = this.iIlIIliIIi.iIlIlllllill();
      var1.addProperty(IiIlliIliiIl<"IiIlliIliiIl","htrqvysN2a55dkIcaM6k8NnzTFlsLQC7TWBbCK4yCA==">(), this.IllIIliIIi);
      return var1;
   }

   public boolean liiiIIllIl(llIIliIiilIIliIi o) {
      return o != null && this.IllIIliIIi.equals(o.IllIIliIIi) && this.iIlIIliIIi != null && this.iIlIIliIIi.equals(o.iIlIIliIIi);
   }

   public String IlIlllIlilIl() {
      return this.IllIIliIIi;
   }

   public boolean IliIlllilIi() {
      return this.iIlIIliIIi != null && !this.IllIIliIIi.isEmpty();
   }

   public String iliIiiliiiii() {
      return this.iIlIIliIIi.lIiiIiIlilli() + IiIlliIliiIl<"IiIlliIliiIl","t8d/4YWSI7pDGECUahl6E9Jj83vd16YE/BLpXiSTvFM=">() + this.IllIIliIIi;
   }

   public iIliIlIlIlliIlIl IIIllIIliIIl() {
      return this.iIlIIliIIi;
   }

   public llIIliIiilIIliIi(iIliIlIlIlliIlIl placement, String dimension) {
      dimension = dimension == null ? "" : dimension;
      this.iIlIIliIIi = placement;
      this.IllIIliIIi = dimension;
   }

   public String iIlIlllllill() {
      if (!this.IliIlllilIi()) {
         return "";
      } else {
         iIliIlIlIlliIlIl var1 = this.iIlIIliIIi;
         return Integer.toHexString(this.IllIIliIIi.hashCode() * 31 + var1.hashCode());
      }
   }

   public static llIIliIiilIIliIi lIiiIiIlilli(JsonObject o) {
      if (o == null) {
         return null;
      } else {
         iIliIlIlIlliIlIl var1 = iIliIlIlIlliIlIl.IilliliilIIi(o);
         if (var1 == null) {
            return null;
         } else {
            String var2 = o.has(IiIlliIliiIl<"IiIlliIliiIl","htrqvysN2a55dkIcaM6k8NnzTFlsLQC7TWBbCK4yCA==">())
               ? o.get(IiIlliIliiIl<"IiIlliIliiIl","htrqvysN2a55dkIcaM6k8NnzTFlsLQC7TWBbCK4yCA==">()).getAsString()
               : "";
            return var2 != null && !var2.isEmpty() ? new llIIliIiilIIliIi(var1, var2) : null;
         }
      }
   }
}
