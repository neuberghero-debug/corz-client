package gg.corz;

import com.google.gson.JsonObject;
import net.minecraft.class_1792;
import net.minecraft.class_1802;

public final class IiIlIIiliIlIIi {
   public String IiIiiIililiIiiIili;
   public String lIliiIiliiIliiIili;
   public int IlliiIilillliiIili;
   public String llIiiIiliilIiiIili;
   public llIlIlIlilIlIlIl IIIiiIililIIiiIili;
   public int iiIiiIiliIIliiIili;
   public int liliiIiliiiliiIili;
   public boolean liiliIiliiiiliIili = true;
   public boolean iIiiiIiliIliiiIili;
   public ililIlIiilIl iIIiiIiliIlIiiIili;
   public boolean IIiiiIililIiiiIili;
   public int illiiIiliIiliiIili;
   public transient int lliiiIiliiliiiIili;

   public static IiIlIIiliIlIIi liiiIIllIl(String priority, String profession, int item) {
      IiIlIIiliIlIIi var3 = new IiIlIIiliIlIIi();
      var3.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.iilIliilIl;
      var3.iIIiiIiliIlIiiIili = ililIlIiilIl.iliIIillIiiIIill;
      var3.llIiiIiliilIiiIili = priority;
      var3.lIliiIiliiIliiIili = profession;
      var3.illiiIiliIiliiIili = item;
      return var3;
   }

   public int IlIlllIlilIl() {
      return IiiIlliiIl.IIIllIIliIIl(this.iliIiiliiiii());
   }

   public static IiIlIIiliIlIIi lIiiIiIlilli(lIllIilliIllIill ti, String profession) {
      if (ti == null) {
         return null;
      } else {
         String var2 = profession != null && !profession.isEmpty() ? profession : Iiilliiliiil<"Iiilliiliiil","Q7NTyPCtj3vvBm2Z0mc2I6tdLt2Qc77MnUzFhyx3Tg==">();
         if (ti.IlIiIilill && ti.llIiIilill != null) {
            String var6 = IliiiiIilliiiiIi.lIiiIiIlilli(ti.llIiIilill);
            if (IliiiiIilliiiiIi.liiiIIllIl(var6) == null) {
               return null;
            } else {
               IiIlIIiliIlIIi var7 = IliIlllilIi(var6, Math.max(1, ti.IiIiIilill), 80, false);
               var7.llIiiIiliilIiiIili = var2;
               return var7;
            }
         } else if (!ti.iIIiIilill) {
            String var5 = IiiIlliiIl.IilliliilIIi(ti.lIilIilill);
            return var5 == null ? null : iIlIlllllill(var2, var5, 80);
         } else {
            class_1792 var3 = ti.illlIilill != null && ti.illlIilill != class_1802.field_8687
               ? ti.illlIilill
               : (ti.lillIilill != null && ti.lillIilill != class_1802.field_8687 ? ti.lillIilill : null);
            String var4 = IiiIlliiIl.IilliliilIIi(var3);
            return var4 == null ? null : liiiIIllIl(var2, var4, 60);
         }
      }
   }

   public static IiIlIIiliIlIIi Ililllililil(JsonObject o) {
      IiIlIIiliIlIIi var1 = new IiIlIIiliIlIIi();

      try {
         if (o.has(Iiilliiliiil<"Iiilliiliiil","IBcgb3yOveyDaR4P66E7VO3E3A+Kja/VGt7du7Ez0JF+FI4=">())) {
            var1.liiliIiliiiiliIili = o.get(Iiilliiliiil<"Iiilliiliiil","IBcgb3yOveyDaR4P66E7VO3E3A+Kja/VGt7du7Ez0JF+FI4=">()).getAsBoolean();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","y+e3lgNAySz80wnFl/L8sdls9Oqii0CM3vjCotas1XEI9w==">())) {
            var1.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.valueOf(
               o.get(Iiilliiliiil<"Iiilliiliiil","y+e3lgNAySz80wnFl/L8sdls9Oqii0CM3vjCotas1XEI9w==">()).getAsString()
            );
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","LshGxXADDlda8h9ft0ZEPZn3HHv6AhRbGhPGqhDqyuk=">())) {
            var1.iIIiiIiliIlIiiIili = ililIlIiilIl.valueOf(o.get(Iiilliiliiil<"Iiilliiliiil","LshGxXADDlda8h9ft0ZEPZn3HHv6AhRbGhPGqhDqyuk=">()).getAsString());
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","yoBqPX/kBVNOGazI6pV+Jl3WHP2QtbOMQGNZ2nfzvH/HWnU/5aQ=">())) {
            var1.llIiiIiliilIiiIili = o.get(Iiilliiliiil<"Iiilliiliiil","yoBqPX/kBVNOGazI6pV+Jl3WHP2QtbOMQGNZ2nfzvH/HWnU/5aQ=">()).getAsString();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","hhXPPRad5aB1t8zc+vie1uVLdru+mA+67BfIbA2budEyMZY=">())) {
            var1.IiIiiIililiIiiIili = o.get(Iiilliiliiil<"Iiilliiliiil","hhXPPRad5aB1t8zc+vie1uVLdru+mA+67BfIbA2budEyMZY=">()).getAsString();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","sNF4S65tJa+3AVwYatAZs9Cr7lwpeO5jPBWuUnAwMTWa8dk24Ca8xQ==">())) {
            var1.iiIiiIiliIIliiIili = o.get(Iiilliiliiil<"Iiilliiliiil","sNF4S65tJa+3AVwYatAZs9Cr7lwpeO5jPBWuUnAwMTWa8dk24Ca8xQ==">()).getAsInt();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","Jn/KbWmdMp7WLRNvV2mVUX17VJtSUGTA6mx2u5u3COU=">())) {
            var1.lIliiIiliiIliiIili = o.get(Iiilliiliiil<"Iiilliiliiil","Jn/KbWmdMp7WLRNvV2mVUX17VJtSUGTA6mx2u5u3COU=">()).getAsString();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","B2c+xxoSy+ESxhrJUt/4xnNmsCjjIfz2rbTCRAERo5wfG2TEuFu6AQR+">())) {
            var1.IlliiIilillliiIili = o.get(Iiilliiliiil<"Iiilliiliiil","B2c+xxoSy+ESxhrJUt/4xnNmsCjjIfz2rbTCRAERo5wfG2TEuFu6AQR+">()).getAsInt();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","w+o3BJEDhv6P9s2Pa/wB3OHl5Sjvegaqt6SPGKr6JRHr1fFI">())) {
            var1.illiiIiliIiliiIili = o.get(Iiilliiliiil<"Iiilliiliiil","w+o3BJEDhv6P9s2Pa/wB3OHl5Sjvegaqt6SPGKr6JRHr1fFI">()).getAsInt();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","syYx6rJB9jcGz7XW09cZZ88iBQFMPzuDu8Ms6wr1iymIxGLXrTnWOA==">())) {
            var1.liliiIiliiiliiIili = o.get(Iiilliiliiil<"Iiilliiliiil","syYx6rJB9jcGz7XW09cZZ88iBQFMPzuDu8Ms6wr1iymIxGLXrTnWOA==">()).getAsInt();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","/uzlERQ676xTBK0Rj9B1Sj7eOe8k6Ly/q+99OxLWvbvCr/eyraAmYhw=">())) {
            var1.IIiiiIililIiiiIili = o.get(Iiilliiliiil<"Iiilliiliiil","/uzlERQ676xTBK0Rj9B1Sj7eOe8k6Ly/q+99OxLWvbvCr/eyraAmYhw=">()).getAsBoolean();
         }

         if (o.has(Iiilliiliiil<"Iiilliiliiil","s9/E5axNn3PYmsmqA/txtQORoEKIaNqDh5gU1V2hOcJY+Vzf">())) {
            var1.iIiiiIiliIliiiIili = o.get(Iiilliiliiil<"Iiilliiliiil","s9/E5axNn3PYmsmqA/txtQORoEKIaNqDh5gU1V2hOcJY+Vzf">()).getAsBoolean();
         }
      } catch (Exception var3) {
      }

      return var1;
   }

   public boolean IIIllIIliIIl() {
      return IiiIlliiIl.iliIiiliiiii(this.iliIiiliiiii());
   }

   public boolean IiIlliIliiIl() {
      return this.liliiIiliiiliiIili > 0 && this.lliiiIiliiliiiIili >= this.liliiIiliiiliiIili;
   }

   public JsonObject IIillIiliIil() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","IBcgb3yOveyDaR4P66E7VO3E3A+Kja/VGt7du7Ez0JF+FI4=">(), this.liiliIiliiiiliIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","y+e3lgNAySz80wnFl/L8sdls9Oqii0CM3vjCotas1XEI9w==">(), this.IIIiiIililIIiiIili.name());
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","LshGxXADDlda8h9ft0ZEPZn3HHv6AhRbGhPGqhDqyuk=">(), this.iIIiiIiliIlIiiIili.name());
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","yoBqPX/kBVNOGazI6pV+Jl3WHP2QtbOMQGNZ2nfzvH/HWnU/5aQ=">(), this.llIiiIiliilIiiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","hhXPPRad5aB1t8zc+vie1uVLdru+mA+67BfIbA2budEyMZY=">(), this.IiIiiIililiIiiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","sNF4S65tJa+3AVwYatAZs9Cr7lwpeO5jPBWuUnAwMTWa8dk24Ca8xQ==">(), this.iiIiiIiliIIliiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","Jn/KbWmdMp7WLRNvV2mVUX17VJtSUGTA6mx2u5u3COU=">(), this.lIliiIiliiIliiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","B2c+xxoSy+ESxhrJUt/4xnNmsCjjIfz2rbTCRAERo5wfG2TEuFu6AQR+">(), this.IlliiIilillliiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","w+o3BJEDhv6P9s2Pa/wB3OHl5Sjvegaqt6SPGKr6JRHr1fFI">(), this.illiiIiliIiliiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","syYx6rJB9jcGz7XW09cZZ88iBQFMPzuDu8Ms6wr1iymIxGLXrTnWOA==">(), this.liliiIiliiiliiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","/uzlERQ676xTBK0Rj9B1Sj7eOe8k6Ly/q+99OxLWvbvCr/eyraAmYhw=">(), this.IIiiiIililIiiiIili);
      var1.addProperty(Iiilliiliiil<"Iiilliiliiil","s9/E5axNn3PYmsmqA/txtQORoEKIaNqDh5gU1V2hOcJY+Vzf">(), this.iIiiiIiliIliiiIili);
      return var1;
   }

   public static IiIlIIiliIlIIi IilliliilIIi() {
      return iIlIlllllill(Iiilliiliiil<"Iiilliiliiil","oXw6XdnAty1pMfMBphSVClWjP2FDGIp3ujncLWukayKmlg==">(), IiiIlliiIl.IilliliilIIi(class_1802.field_8287), 80);
   }

   public IiIlIIiliIlIIi() {
      this.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.IilIliilIl;
      this.iIIiiIiliIlIiiIili = ililIlIiilIl.IliIIilllliIIill;
      this.llIiiIiliilIiiIili = Iiilliiliiil<"Iiilliiliiil","Q7NTyPCtj3vvBm2Z0mc2I6tdLt2Qc77MnUzFhyx3Tg==">();
      this.IiIiiIililiIiiIili = Iiilliiliiil<"Iiilliiliiil","EaFMTVwKJsUrQXnf//Fvw2HRCbQ65I+6Rc7gKAfv32Ej2kU=">();
      this.iiIiiIiliIIliiIili = 1;
      this.lIliiIiliiIliiIili = Iiilliiliiil<"Iiilliiliiil","h7hjJvbBuqjTqPKyoyM3gli5jDGkasJXV3Y5b3QFdGf7mVA=">();
      this.IlliiIilillliiIili = 0;
      this.illiiIiliIiliiIili = 50;
      this.liliiIiliiiliiIili = 0;
      this.IIiiiIililIiiiIili = true;
      this.iIiiiIiliIliiiIili = false;
      this.lliiiIiliiliiiIili = 0;
   }

   public static IiIlIIiliIlIIi IliIlllilIi(String level, int autoDrop, int priority, boolean enchant) {
      IiIlIIiliIlIIi var4 = new IiIlIIiliIlIIi();
      var4.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.IilIliilIl;
      var4.iIIiiIiliIlIiiIili = ililIlIiilIl.IliIIilllliIIill;
      var4.llIiiIiliilIiiIili = Iiilliiliiil<"Iiilliiliiil","uvO8FTDK7Jl9rUbkwT1v4CshdPIwmnk2O6jVi0v/Cz3dHPJ8Pw==">();
      var4.IiIiiIililiIiiIili = level;
      var4.iiIiiIiliIIliiIili = autoDrop;
      var4.illiiIiliIiliiIili = priority;
      var4.iIiiiIiliIliiiIili = enchant;
      return var4;
   }

   public String Iilllilliill() {
      return switch (this.iIIiiIiliIlIiiIili) {
         case IliIIilllliIIill -> this.iiIiiIiliIIliiIili > 1
         ? this.IiIiiIililiIiiIili
            + Iiilliiliiil<"Iiilliiliiil","Iu79ZauSvjXr32ycNzmBR/pCfz0lWtdWEU3rfqw=">()
            + IliiiiIilliiiiIi.iliIiiliiiii(this.iiIiiIiliIIliiIili)
         : this.IiIiiIililiIiiIili;
         case liiIIilliiiIIill -> Iiilliiliiil<"Iiilliiliiil","gjQyfg7Fstz0nJzVt7tytmQVjShSmsBIE6gY+Q3BUQb1">()
         + IiiIlliiIl.lIiiIiIlilli(this.lIliiIiliiIliiIili);
         case iliIIillIiiIIill -> IiiIlliiIl.lIiiIiIlilli(this.lIliiIiliiIliiIili);
      };
   }

   public String Illlllllilll() {
      String var1 = this.iIIiiIiliIlIiiIili == ililIlIiilIl.iliIIillIiiIIill
         ? IiiIlliiIl.lIiiIiIlilli(this.lIliiIiliiIliiIili) + Iiilliiliiil<"Iiilliiliiil","hVmzRnQuaa7BpQSqy7nK+icHGKcaL4bWS7YW3UIPxXjnBPeVI7PCBw==">()
         : this.Iilllilliill();
      return this.IIIiiIililIIiiIili
         + Iiilliiliiil<"Iiilliiliiil","Iu79ZauSvjXr32ycNzmBR/pCfz0lWtdWEU3rfqw=">()
         + var1
         + Iiilliiliiil<"Iiilliiliiil","nCdlp1J4PaOvQ1k261vMPALcjv/tlcFsHs28dHGf">()
         + this.llIiiIiliilIiiIili
         + Iiilliiliiil<"Iiilliiliiil","41+84qFqW+8LjpOWyN3dD3Ymige3oLFlDbfTw+M=">();
   }

   public class_1792 iliIiiliiiii() {
      return this.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl && this.iIIiiIiliIlIiiIili == ililIlIiilIl.liiIIilliiiIIill
         ? IiiIlliiIl.iIlIlllllill(this.lIliiIiliiIliiIili)
         : null;
   }

   public static IiIlIIiliIlIIi iIlIlllllill(String profession, String priority, int item) {
      IiIlIIiliIlIIi var3 = new IiIlIIiliIlIIi();
      var3.IIIiiIililIIiiIili = llIlIlIlilIlIlIl.IilIliilIl;
      var3.iIIiiIiliIlIiiIili = ililIlIiilIl.liiIIilliiiIIill;
      var3.llIiiIiliilIiiIili = profession;
      var3.lIliiIiliiIliiIili = priority;
      var3.illiiIiliIiliiIili = item;
      return var3;
   }

   public boolean IIlllIlliIll() {
      return this.liiliIiliiiiliIili && !this.IiIlliIliiIl();
   }
}
