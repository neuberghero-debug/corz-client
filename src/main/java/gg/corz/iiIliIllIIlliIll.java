package gg.corz;

import com.google.gson.JsonElement;

public final class iiIliIllIIlliIll extends IilliIllilliIl {
   private final IilliIllilliIl IiIIIiilll;

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return this.IiIIIiilll.IiIlliIliiIl();
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      return element != null && !element.isJsonNull() ? this.IiIIIiilll.Illlllllilll(element) : iiiiIlllIIIIllll.IIilllIill;
   }

   public iiIliIllIIlliIll(String target, IilliIllilliIl legacyName) {
      super(target, legacyName.liiiIIllIl());
      this.IiIIIiilll = legacyName;
      this.lIiiIiIlilli();
   }

   public IilliIllilliIl Iilllilliill() {
      return this.IiIIIiilll;
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return null;
   }
}
