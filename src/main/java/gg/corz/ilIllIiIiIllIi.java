package gg.corz;

import com.google.gson.JsonObject;

public final class ilIllIiIiIllIi {
   public final String iIilllIiiIlilllIii;
   public final long IiilllIiiliilllIii;
   public final IlIiIlIlllIiIlIl IIilllIiilIilllIii;
   public final long llilllIiiililllIii;
   public final JsonObject iiilllIiiIIIillIii;

   public static ilIllIiIiIllIi IliIlllilIi(IlIiIlIlllIiIlIl payload, String senderId, JsonObject type) {
      return new ilIllIiIiIllIi(payload, senderId, -1L, System.currentTimeMillis(), type);
   }

   public String IilliliilIIi(String k) {
      return this.iiilllIiiIIIillIii.has(k) ? this.iiilllIiiIIIillIii.get(k).getAsString() : null;
   }

   public static ilIllIiIiIllIi iIlIlllllill(JsonObject o) {
      if (o == null) {
         return null;
      } else {
         IlIiIlIlllIiIlIl var1 = IlIiIlIlllIiIlIl.IliIlllilIi(
            o.has(IlIlllIlilIl<"IlIlllIlilIl","ye32c0thYALz2ofNkvWxxgUgd10RUWYLy0Q7u97Hqaw=">())
               ? o.get(IlIlllIlilIl<"IlIlllIlilIl","ye32c0thYALz2ofNkvWxxgUgd10RUWYLy0Q7u97Hqaw=">()).getAsString()
               : null
         );
         if (var1 == null) {
            return null;
         } else {
            String var2 = o.has(IlIlllIlilIl<"IlIlllIlilIl","5x8b6mwyLkNZYuKj99YpRaMfmM0FtlhtUHlytqkp8IU=">())
               ? o.get(IlIlllIlilIl<"IlIlllIlilIl","5x8b6mwyLkNZYuKj99YpRaMfmM0FtlhtUHlytqkp8IU=">()).getAsString()
               : "";
            long var3 = o.has(IlIlllIlilIl<"IlIlllIlilIl","911CYhqWX+9m7ovivYa6EGEtrwIN26CV2yuI2E8HWw==">())
               ? o.get(IlIlllIlilIl<"IlIlllIlilIl","911CYhqWX+9m7ovivYa6EGEtrwIN26CV2yuI2E8HWw==">()).getAsLong()
               : -1L;
            long var5 = o.has(IlIlllIlilIl<"IlIlllIlilIl","btiAfuC5B5y3e/vyhcV8q4e+au5rrubsVWHHSnR2">())
               ? o.get(IlIlllIlilIl<"IlIlllIlilIl","btiAfuC5B5y3e/vyhcV8q4e+au5rrubsVWHHSnR2">()).getAsLong()
               : System.currentTimeMillis();
            JsonObject var7 = o.has(IlIlllIlilIl<"IlIlllIlilIl","ImTOSavtJymavtkylX7gvFhIjKYTxw1OkXYxwQWpcUcQ7Ck=">())
                  && o.get(IlIlllIlilIl<"IlIlllIlilIl","ImTOSavtJymavtkylX7gvFhIjKYTxw1OkXYxwQWpcUcQ7Ck=">()).isJsonObject()
               ? o.getAsJsonObject(IlIlllIlilIl<"IlIlllIlilIl","ImTOSavtJymavtkylX7gvFhIjKYTxw1OkXYxwQWpcUcQ7Ck=">())
               : new JsonObject();
            return new ilIllIiIiIllIi(var1, var2, var3, var5, var7);
         }
      }
   }

   public String lIiiIiIlilli(String def, String k) {
      String var3 = this.IilliliilIIi(def);
      return var3 == null ? k : var3;
   }

   public int iliIiiliiiii(String k, int def) {
      try {
         return this.iiilllIiiIIIillIii.has(k) ? this.iiilllIiiIIIillIii.get(k).getAsInt() : def;
      } catch (Exception var4) {
         return def;
      }
   }

   public JsonObject liiiIIllIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IlIlllIlilIl<"IlIlllIlilIl","ye32c0thYALz2ofNkvWxxgUgd10RUWYLy0Q7u97Hqaw=">(), this.IIilllIiilIilllIii.name());
      var1.addProperty(IlIlllIlilIl<"IlIlllIlilIl","5x8b6mwyLkNZYuKj99YpRaMfmM0FtlhtUHlytqkp8IU=">(), this.iIilllIiiIlilllIii);
      if (this.llilllIiiililllIii >= 0L) {
         var1.addProperty(IlIlllIlilIl<"IlIlllIlilIl","911CYhqWX+9m7ovivYa6EGEtrwIN26CV2yuI2E8HWw==">(), this.llilllIiiililllIii);
      }

      var1.addProperty(IlIlllIlilIl<"IlIlllIlilIl","btiAfuC5B5y3e/vyhcV8q4e+au5rrubsVWHHSnR2">(), this.IiilllIiiliilllIii);
      var1.add(IlIlllIlilIl<"IlIlllIlilIl","ImTOSavtJymavtkylX7gvFhIjKYTxw1OkXYxwQWpcUcQ7Ck=">(), this.iiilllIiiIIIillIii);
      return var1;
   }

   public ilIllIiIiIllIi(IlIiIlIlllIiIlIl payload, String type, long tsMs, long seq, JsonObject senderId) {
      this.IIilllIiilIilllIii = payload;
      this.iIilllIiiIlilllIii = type;
      this.llilllIiiililllIii = tsMs;
      this.IiilllIiiliilllIii = seq;
      this.iiilllIiiIIIillIii = senderId != null ? senderId : new JsonObject();
   }

   public long IIIllIIliIIl(String def, long k) {
      try {
         return this.iiilllIiiIIIillIii.has(def) ? this.iiilllIiiIIIillIii.get(def).getAsLong() : k;
      } catch (Exception var5) {
         return k;
      }
   }
}
