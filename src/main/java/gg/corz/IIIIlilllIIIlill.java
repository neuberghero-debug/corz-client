package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class IIIIlilllIIIlill extends IilliIllilliIl {
   private final double iliililill;
   private final double liiililill;
   private double iiiililill;
   private final double Iiiililill;
   private final double lliililill;

   public void IIlilIliiIli() {
      this.IIillIiliIil(this.iiiililill - this.liiililill);
   }

   @Override
   public JsonElement IIlllIlliIll() {
      return new JsonPrimitive(this.iiiililill);
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonPrimitive()) {
         try {
            double var2 = element.getAsDouble();
            if (!Double.isNaN(var2) && !Double.isInfinite(var2)) {
               this.IIillIiliIil(var2);
               return this.iiiililill == var2 ? iiiiIlllIIIIllll.lIilllIill : iiiiIlllIIIIllll.iIilllIill;
            } else {
               return iiiiIlllIIIIllll.IlilllIill;
            }
         } catch (Exception var4) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.IllIlIilIl;
   }

   public double Iilllilliill() {
      return this.iiiililill;
   }

   public void IIillIiliIil(double value) {
      double var3 = Math.max(this.lliililill, Math.min(this.iliililill, value));
      if (this.iiiililill != var3) {
         this.iiiililill = var3;
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public IIIIlilllIIIlill(String name, String description, double max, double defaultValue, double min) {
      this(name, description, max, defaultValue, min, 0.1);
   }

   public double IlIillIiilIi() {
      return this.liiililill;
   }

   public double IIIilIIiiIIi() {
      return this.Iiiililill;
   }

   public void IiIiliIiiiIi() {
      this.IIillIiliIil(this.iiiililill + this.liiililill);
   }

   public double Ililllililil() {
      return this.lliililill;
   }

   public double Iiilliiliiil() {
      return this.iliililill;
   }

   public IIIIlilllIIIlill(String defaultValue, String name, double description, double max, double increment, double min) {
      super(defaultValue, name);
      this.lliililill = max;
      this.iliililill = increment;
      this.liiililill = min;
      this.Iiiililill = description;
      this.iiiililill = description;
   }
}
