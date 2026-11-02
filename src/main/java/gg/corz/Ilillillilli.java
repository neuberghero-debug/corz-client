package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public final class Ilillillilli {
   public int iIIilIlIlIlIilIlIl;
   public int IIIilIlIllIIilIlIl;
   public int IiIilIlIlliIilIlIl;
   public int llIilIlIlilIilIlIl;
   public String liillIlIliiillIlIl;
   public final List<lllililillilil> ilillIlIlIiillIlIl = new ArrayList<>();

   public static Ilillillilli IliIlllilIi(JsonObject o) {
      Ilillillilli var1 = new Ilillillilli();
      if (o == null) {
         return var1;
      } else {
         var1.liillIlIliiillIlIl = o.has(iIlIlllllill<"iIlIlllllill","XPPxTjLO9ufa1bDbAFeSxCGCBpC4kp2CoSRXqE96eMo=">())
            ? o.get(iIlIlllllill<"iIlIlllllill","XPPxTjLO9ufa1bDbAFeSxCGCBpC4kp2CoSRXqE96eMo=">()).getAsString()
            : null;
         var1.IIIilIlIllIIilIlIl = liiiIIllIl(o, iIlIlllllill<"iIlIlllllill","tVm2O3m+tQXm8YgpdgjYB/pZuXxZGBX2o1mkpSCNmpU=">(), 1);
         var1.iIIilIlIlIlIilIlIl = liiiIIllIl(o, iIlIlllllill<"iIlIlllllill","4jU7UAfiqCsZ0tQ1lIuJz+W7EehcQu6bhhqDG32vjDaVF8On">(), 20);
         var1.llIilIlIlilIilIlIl = liiiIIllIl(o, iIlIlllllill<"iIlIlllllill","rNLMa79GA1ohP+EFjK4xfZ0oWup9w28XBjO55PguAIQS">(), 0);
         var1.IiIilIlIlliIilIlIl = liiiIIllIl(o, iIlIlllllill<"iIlIlllllill","j7KF5JsDBbMWan3Bd87IFGwm3sezcnHmiQo8mpjb8wdfX8qv2DU=">(), 1);
         JsonArray var2 = o.has(iIlIlllllill<"iIlIlllllill","BRWjufU/ZSX1jaRjfaRoFiSYeHLT4p4SpD3Lgz6QlfU/7F8=">())
               && o.get(iIlIlllllill<"iIlIlllllill","BRWjufU/ZSX1jaRjfaRoFiSYeHLT4p4SpD3Lgz6QlfU/7F8=">()).isJsonArray()
            ? o.getAsJsonArray(iIlIlllllill<"iIlIlllllill","BRWjufU/ZSX1jaRjfaRoFiSYeHLT4p4SpD3Lgz6QlfU/7F8=">())
            : null;
         if (var2 != null) {
            for (JsonElement var4 : var2) {
               if (var4.isJsonObject()) {
                  lllililillilil var5 = lllililillilil.IliIlllilIi(var4.getAsJsonObject());
                  if (var5 != null) {
                     var1.ilillIlIlIiillIlIl.add(var5);
                  }
               }
            }
         }

         return var1;
      }
   }

   private static int liiiIIllIl(JsonObject d, String k, int o) {
      try {
         return d.has(k) && d.get(k).isJsonPrimitive() ? d.get(k).getAsInt() : o;
      } catch (Exception var4) {
         return o;
      }
   }
}
