package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class illlIlIlIillIlIl extends IilliIllilliIl {
   private final int lIilliilIl;
   private boolean iIilliilIl;
   private int IIilliilIl;

   public boolean IlIillIiilIi() {
      return this.IIilliilIl >= 0;
   }

   public illlIlIlIillIlIl(String description, String name) {
      this(description, name, -1);
   }

   public int Ililllililil() {
      return this.IIilliilIl;
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      long var4 = -1248870692788622659L;
      if (element != null && element.isJsonPrimitive()) {
         try {
            var4 ^= ((long)element.getAsInt() << 32 ^ var4) & -1L << 32;
            var4 ^= ((long)llIllIlilIllIl.lIiiIiIlilli((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
            this.Iiilliiliiil((int)var4);
            return (int)var4 == (int)(var4 >>> 32) ? iiiiIlllIIIIllll.lIilllIill : iiiiIlllIIIIllll.iIilllIill;
         } catch (Exception var6) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public illlIlIlIillIlIl Iilllilliill() {
      this.iIilliilIl = true;
      return this;
   }

   public void Iiilliiliiil(int key) {
      this.IIilliilIl = key;
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.IIilliilIl);
   }

   public boolean IiIiliIiiiIi(int input) {
      return this.IlIillIiilIi() && this.IIilliilIl == input;
   }

   public boolean IIillIiliIil() {
      return this.iIilliilIl;
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.IiiIlIilIl;
   }

   public int IIIilIIiiIIi() {
      return this.lIilliilIl;
   }

   public illlIlIlIillIlIl(String name, String description, int defaultKey) {
      super(name, description);
      this.IIilliilIl = defaultKey;
      this.lIilliilIl = defaultKey;
   }
}
