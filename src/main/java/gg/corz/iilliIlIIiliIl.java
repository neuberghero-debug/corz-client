package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class iilliIlIIiliIl extends IilliIllilliIl {
   private int lillllilliillllill = Integer.MIN_VALUE;
   private final int IiIlllillliIlllill;
   private int illlllillIillllill;
   private String IIilllilllIilllill = null;
   private final int lIllllilliIllllill;
   private final int iiIlllillIIllllill;
   private final int Illlllillllllllill;

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.iIlIlIilIl;
   }

   public iilliIlIIiliIl(String name, String min, int description, int defaultValue, int max) {
      this(name, min, description, defaultValue, max, 1);
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.illlllillIillllill);
   }

   public int IIIilIIiiIIi() {
      return this.lIllllilliIllllill;
   }

   public void Illillliilli() {
      this.IIillIiliIil(this.illlllillIillllill + this.Illlllillllllllill);
   }

   public int Ililllililil() {
      return this.IiIlllillliIlllill;
   }

   public iilliIlIIiliIl IiIiliIiiiIi(int text, String threshold) {
      this.lillllilliillllill = text;
      this.IIilllilllIilllill = threshold;
      return this;
   }

   public void Iilililiiili() {
      this.IIillIiliIil(this.illlllillIillllill - this.Illlllillllllllill);
   }

   public int Iiilliiliiil() {
      return this.iiIlllillIIllllill;
   }

   public int IlIillIiilIi() {
      return this.Illlllillllllllill;
   }

   public iilliIlIIiliIl(String defaultValue, String name, int max, int increment, int description, int min) {
      super(defaultValue, name);
      this.IiIlllillliIlllill = increment;
      this.iiIlllillIIllllill = description;
      this.Illlllillllllllill = min;
      this.lIllllilliIllllill = max;
      this.illlllillIillllill = Math.max(increment, Math.min(description, max));
   }

   public String IIlilIliiIli() {
      return this.IIilllilllIilllill != null && this.illlllillIillllill < this.lillllilliillllill ? this.IIilllilllIilllill : null;
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      long var3 = 7537696919644696138L;
      if (element != null && element.isJsonPrimitive()) {
         try {
            var3 ^= ((long)((int)Math.round(element.getAsDouble())) << 32 ^ var3) & -1L << 32;
            this.IIillIiliIil((int)(var3 >>> 32));
            return this.illlllillIillllill == (int)(var3 >>> 32) ? iiiiIlllIIIIllll.lIilllIill : iiiiIlllIIIIllll.iIilllIill;
         } catch (Exception var5) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public int Iilllilliill() {
      return this.illlllillIillllill;
   }

   public void IIillIiliIil(int value) {
      long var3 = 524974754504616829L;
      var3 ^= ((long)Math.max(this.IiIlllillliIlllill, Math.min(this.iiIlllillIIllllill, value)) << 32 ^ var3) & -1L << 32;
      if (this.illlllillIillllill != (int)(var3 >>> 32)) {
         this.illlllillIillllill = (int)(var3 >>> 32);
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }
}
