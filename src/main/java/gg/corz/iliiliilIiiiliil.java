package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class iliiliilIiiiliil extends IilliIllilliIl {
   private int lllIlIIiil;
   private final int IllIlIIiil;

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.lllIlIIiil);
   }

   public void IIillIiliIil(int color) {
      this.lllIlIIiil = color;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   public void IIIilIIiiIIi() {
      this.lllIlIIiil = this.IllIlIIiil;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         try {
            this.IIillIiliIil(element.getAsInt());
            return iiiiIlllIIIIllll.lIilllIill;
         } catch (Exception var3) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public void Iiilliiliiil(String hex) {
      try {
         String var2 = hex.startsWith(IliIlllilIi<"IliIlllilIi","SsW0dCUMse8kulYAGd2ukFtTieJUCW0aiZAQi5E=">()) ? hex.substring(1) : hex;
         long var3 = Long.parseLong(var2, 16);
         if (var2.length() == 6) {
            var3 |= 4278190080L;
         }

         this.lllIlIIiil = (int)var3;
         iiiIIIlIIIlIIl.liiiIIllIl();
      } catch (NumberFormatException var5) {
      }
   }

   public int Ililllililil() {
      return this.IllIlIIiil;
   }

   public int Iilllilliill() {
      return this.lllIlIIiil;
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.IIiIlIilIl;
   }

   public iliiliilIiiiliil(String name, String defaultColor, int description) {
      super(name, defaultColor);
      this.lllIlIIiil = description;
      this.IllIlIIiil = description;
   }
}
