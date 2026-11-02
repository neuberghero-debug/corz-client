package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Iiiliillliiliill extends IilliIllilliIl {
   private final double lliiliiill;
   private final double liiiliiill;
   private final double iiiiliiill;
   private final double Iiiiliiill;
   private final double iliiliiill;
   private double lIIIiiiill;
   private double IIIIiiiill;

   public double Iilllilliill() {
      return this.IIIIiiiill;
   }

   public double IiIiliIiiiIi() {
      return this.Iiiiliiill;
   }

   public double IIIilIIiiIIi() {
      return this.lliiliiill;
   }

   public double Illillliilli() {
      return this.iiiiliiill;
   }

   public double IIlilIliiIli() {
      return this.liiiliiill;
   }

   @Override
   public JsonElement IIlllIlliIll() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IliIlllilIi<"IliIlllilIi","QQzMYqR5ZQVzKte/kLyAZbn35YwICHCOn9E+PHsbog==">(), this.IIIIiiiill);
      var1.addProperty(IliIlllilIi<"IliIlllilIi","m5JmcDG91BRyiuKY+/zKSfmg6/Iu4a6WtiaNLP0CoA==">(), this.lIIIiiiill);
      return var1;
   }

   public void Iiilliiliiil(double maxValue) {
      this.lIIIiiiill = Math.max(this.IIIIiiiill, Math.min(this.iliiliiill, maxValue));
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   @Override
   public iiiiIlllIIIIllll Illlllllilll(JsonElement element) {
      long var9 = 3809184452833251902L;
      if (element != null && element.isJsonObject()) {
         try {
            JsonObject var2 = element.getAsJsonObject();
            double var3 = var2.has(IliIlllilIi<"IliIlllilIi","QQzMYqR5ZQVzKte/kLyAZbn35YwICHCOn9E+PHsbog==">())
                  && var2.get(IliIlllilIi<"IliIlllilIi","QQzMYqR5ZQVzKte/kLyAZbn35YwICHCOn9E+PHsbog==">()).isJsonPrimitive()
               ? var2.get(IliIlllilIi<"IliIlllilIi","QQzMYqR5ZQVzKte/kLyAZbn35YwICHCOn9E+PHsbog==">()).getAsDouble()
               : this.IIIIiiiill;
            double var5 = var2.has(IliIlllilIi<"IliIlllilIi","m5JmcDG91BRyiuKY+/zKSfmg6/Iu4a6WtiaNLP0CoA==">())
                  && var2.get(IliIlllilIi<"IliIlllilIi","m5JmcDG91BRyiuKY+/zKSfmg6/Iu4a6WtiaNLP0CoA==">()).isJsonPrimitive()
               ? var2.get(IliIlllilIi<"IliIlllilIi","m5JmcDG91BRyiuKY+/zKSfmg6/Iu4a6WtiaNLP0CoA==">()).getAsDouble()
               : this.lIIIiiiill;
            if (!Double.isNaN(var3) && !Double.isNaN(var5)) {
               if (var3 > var5) {
                  double var7 = var3;
                  var3 = var5;
                  var5 = var7;
               }

               var9 ^= ((long)(!(var3 < this.lliiliiill) && !(var5 > this.iliiliiill) ? 0 : 1) << 32 ^ var9) & -1L << 32;
               this.IIillIiliIil(var3);
               this.Iiilliiliiil(var5);
               this.IIillIiliIil(var3);
               return (int)(var9 >>> 32) != 0 ? iiiiIlllIIIIllll.iIilllIill : iiiiIlllIIIIllll.lIilllIill;
            } else {
               return iiiiIlllIIIIllll.IlilllIill;
            }
         } catch (Exception var11) {
            return iiiiIlllIIIIllll.IIilllIill;
         }
      } else {
         return iiiiIlllIIIIllll.IIilllIill;
      }
   }

   public double Ililllililil() {
      return this.lIIIiiiill;
   }

   public Iiiliillliiliill(String maxBound, String maxValue, double minBound, double increment, double name, double description, double minValue) {
      super(maxBound, maxValue);
      this.lliiliiill = name;
      this.iliiliiill = description;
      this.Iiiiliiill = minValue;
      this.IIIIiiiill = Math.max(name, Math.min(description, minBound));
      this.lIIIiiiill = Math.max(name, Math.min(description, increment));
      if (this.IIIIiiiill > this.lIIIiiiill) {
         double var13 = this.IIIIiiiill;
         this.IIIIiiiill = this.lIIIiiiill;
         this.lIIIiiiill = var13;
      }

      this.liiiliiill = this.IIIIiiiill;
      this.iiiiliiill = this.lIIIiiiill;
   }

   public double IlIillIiilIi() {
      return this.iliiliiill;
   }

   public void IIillIiliIil(double minValue) {
      this.IIIIiiiill = Math.max(this.lliiliiill, Math.min(this.lIIIiiiill, minValue));
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   @Override
   public iIiIiIIlIliIiIIl IiIlliIliiIl() {
      return iIiIiIIlIliIiIIl.IilIlIilIl;
   }
}
