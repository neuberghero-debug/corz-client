package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class IIiiIIIllIiiIIIl extends IilliIllilliIl {
   private final String IIlIllllIl;
   private static final int iIlIllllIl = 2048;
   private String lIlIllllIl;

   public String Iilllilliill() {
      return this.lIlIllllIl;
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.lIlIllllIl);
   }

   public String Ililllililil() {
      return this.IIlIllllIl;
   }

   public IIiiIIIllIiiIIIl(String name, String defaultValue, String description) {
      super(name, defaultValue);
      this.IIlIllllIl = description;
      this.lIlIllllIl = description;
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      long var4 = 8985254641649778472L;
      if (element != null && element.isJsonPrimitive()) {
         try {
            String var2 = element.getAsString();
            var4 ^= ((long)(var2.length() > 2048 ? 1 : 0) << 32 ^ var4) & -1L << 32;
            this.IIillIiliIil((int)(var4 >>> 32) != 0 ? var2.substring(0, 2048) : var2);
            return (int)(var4 >>> 32) != 0 ? iiiiIlllIIIIllll.iIilllIill : iiiiIlllIIIIllll.lIilllIill;
         } catch (Exception var6) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.iilIlIilIl;
   }

   public void IIillIiliIil(String value) {
      this.lIlIllllIl = value != null ? value : "";
   }
}
