package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Arrays;
import java.util.List;

public class lliliIIiililiIIi extends IilliIllilliIl {
   private final List<String> liIliliiil;
   private int IIlliliiil;
   private final int iiIliliiil;

   public String IlIillIiilIi() {
      return this.liIliliiil.get(this.iiIliliiil);
   }

   public List<String> IiIiliIiiiIi() {
      return this.liIliliiil;
   }

   public void IIlilIliiIli() {
      this.IIlliliiil = (this.IIlliliiil + 1) % this.liIliliiil.size();
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.lilIlIilIl;
   }

   public int IIIilIIiiIIi() {
      return this.iiIliliiil;
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         try {
            String var2 = element.getAsString();
            if (!this.liIliliiil.contains(var2)) {
               return iiiiIlllIIIIllll.IlilllIill;
            } else {
               this.IIillIiliIil(var2);
               return iiiiIlllIIIIllll.lIilllIill;
            }
         } catch (Exception var3) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public void IIillIiliIil(String value) {
      long var3 = -3271513600672236421L;
      var3 ^= ((long)this.liIliliiil.indexOf(value) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != -1) {
         this.IIlliliiil = (int)(var3 >>> 32);
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void Iiilliiliiil(int index) {
      if (index >= 0 && index < this.liIliliiil.size()) {
         this.IIlliliiil = index;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void Illillliilli() {
      this.IIlliliiil = (this.IIlliliiil - 1 + this.liIliliiil.size()) % this.liIliliiil.size();
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.Iilllilliill());
   }

   public int Ililllililil() {
      return this.IIlliliiil;
   }

   public String Iilllilliill() {
      return this.liIliliiil.get(this.IIlliliiil);
   }

   public lliliIIiililiIIi(String options, String defaultValue, String description, String... name) {
      super(options, defaultValue);
      this.liIliliiil = Arrays.asList(name);
      this.IIlliliiil = this.liIliliiil.indexOf(description);
      if (this.IIlliliiil == -1) {
         this.IIlliliiil = 0;
      }

      this.iiIliliiil = this.IIlliliiil;
   }
}
