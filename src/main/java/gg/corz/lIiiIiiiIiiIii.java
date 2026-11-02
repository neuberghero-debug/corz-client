package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.List;

public class lIiiIiiiIiiIii extends IilliIllilliIl {
   private static final int iilllIiIIl = 640;
   private String IIillIiIIl = "";

   public void Iiilliiliiil(String key) {
      String var2 = key == null ? "" : key;
      if (!var2.equals(this.IIillIiIIl)) {
         this.IIillIiIIl = var2;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public List<IIIlliIllIIlliIl> Iilllilliill() {
      return llIliiIiilIliiIi.IliIlllilIi();
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.IIillIiIIl);
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.liiIlIilIl;
   }

   public lIiiIiiiIiiIii(String name, String description) {
      super(name, description);
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         try {
            String var2 = element.getAsString();
            if (var2 != null && var2.length() <= 640) {
               this.IIillIiIIl = var2;
               return iiiiIlllIIIIllll.lIilllIill;
            } else {
               return iiiiIlllIIIIllll.IlilllIill;
            }
         } catch (Exception var3) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public boolean Ililllililil(IIIlliIllIIlliIl station) {
      return station != null && station.IliIlllilIi() && station.IiIlliIliiIl().equals(this.IIillIiIIl);
   }

   public String IIillIiliIil() {
      return this.IIillIiIIl;
   }
}
