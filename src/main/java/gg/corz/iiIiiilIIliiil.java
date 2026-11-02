package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class iiIiiilIIliiil extends IilliIllilliIl {
   private final boolean iillillliIIilillli;
   private boolean lIilillliiIilillli;

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.lIlIlIilIl;
   }

   public void Ililllililil() {
      this.lIilillliiIilillli = !this.lIilillliiIilillli;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   public boolean Iiilliiliiil() {
      return this.iillillliIIilillli;
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.lIilillliiIilillli);
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         try {
            this.IIillIiliIil(element.getAsBoolean());
            return iiiiIlllIIIIllll.lIilllIill;
         } catch (Exception var3) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public boolean Iilllilliill() {
      return this.lIilillliiIilillli;
   }

   public void IIillIiliIil(boolean value) {
      if (this.lIilillliiIilillli != value) {
         this.lIilillliiIilillli = value;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public iiIiiilIIliiil(String name, String defaultValue, boolean description) {
      super(name, defaultValue);
      this.iillillliIIilillli = description;
      this.lIilillliiIilillli = description;
   }
}
