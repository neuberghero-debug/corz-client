package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2561;
import net.minecraft.class_3417;
import net.minecraft.class_640;

public class illiIliIiliIli extends ilIllIiIll {
   private final iilliIlIIiliIl IlIIllIIIl;
   private final List<IIillIllIillIl> ilIIllIIIl;
   private final iiIiiilIIliiil lIIIllIIIl;
   private static final String IiIIllIIIl = "&aYou have sent &f${amount} &ato &f{player}&a.";
   private final iiIiiilIIliiil iIIIllIIIl;
   private final iiIiiilIIliiil llIIllIIIl;
   private final IIiiIIIllIiiIIIl iiiiIlIIIl = new IIiiIIIllIiiIIIl(
      IliIlllilIi<"IliIlllilIi","sMjBFjSH/0zFw7TVfZrFes6SrUK/e4tuFDWwJWQyMG+rWQY=">(),
      IliIlllilIi<"IliIlllilIi","URtPO10tednOKMQPTjcf7EEDFHmH8ilmeie7iiWKAvKUjZDVGphSUFRanv0R5gojY9aVYsrqzqZ47dUH+kclMhySDFVDKq6PH6vZoHJ9w9C8L1keBawDTkhPA2G7w/yw4a8tpN5JRshuRtgou5I=">(),
      IliIlllilIi<"IliIlllilIi","qykuWnQMoMQunejo37c7vBhHn2Hufq7YTAe8k4KrexKXFAuEAAakcN+rD/iBpCQwNqLHa56oJlltA0W1x4g=">()
   );

   static String IIllllIlll(long v) {
      String[] var2 = new String[]{
         "",
         IliIlllilIi<"IliIlllilIi","g9bE70Z31U9FFe3v92WGE/YVkLRH2OVT4MJVvRM=">(),
         IliIlllilIi<"IliIlllilIi","9oL/KqYWG0Afsk0qZj/WU4mFOhwkqjsdqBHkUiQ=">(),
         IliIlllilIi<"IliIlllilIi","7qbLA99Os1CrN4VXCX1y1tCuPL81eGkD22m91cc=">(),
         IliIlllilIi<"IliIlllilIi","ahP4TTKjHX4JmDffTVkotMD+H4dPxn3AbQm4hAs=">()
      };
      double var3 = (double)v;

      int var5;
      for (var5 = 0; Math.abs(var3) >= 1000.0 && var5 < var2.length - 1; var5++) {
         var3 /= 1000.0;
      }

      if (var5 == 0) {
         return String.format(IliIlllilIi<"IliIlllilIi","BR4zWP5O3jzEw1ZNTgtRlHLdmdJCBxTD0hPOMBQkkA==">(), v);
      } else {
         String var6 = var3 == Math.floor(var3)
            ? String.valueOf((long)var3)
            : String.format(IliIlllilIi<"IliIlllilIi","qrtYHtvSmESpFRdSsitjBpfADxjqLDDD2qyDoWPAhEM=">(), var3);
         return var6 + var2[var5];
      }
   }

   public illiIliIiliIli() {
      super(IliIlllilIi<"IliIlllilIi","tuJxEX0/w6NPp8ngnRjgyx+mhX++x6zreMrljk/ibhXNlWM=">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lIIIllIIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Sjr+mGMbJvKS+msRV+aAn118qsRJA1lyZJv72W6dq7hE5CcRSmk=">(),
         IliIlllilIi<"IliIlllilIi","7AhkU/KE7LcTS3DC5mmadkOKOq0CnjKF3zq6IAvae1CUSX38j2Uvx7EOaqWc/eVddpkG6qCnHAv0oFTHjQ0R8MPV00MEnvuNxtuaZZ+w45FxAR+e79CMaW701j8DrEWs5w==">(),
         true
      );
      this.iIIIllIIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","mx34w5aWKBCp/7u8XNjVC9VhYb9hG05xfr4rD3clYdq4EcuolPtgAgM/oGU=">(),
         IliIlllilIi<"IliIlllilIi","X4zQbZjjE3X76tU0XQAauNpIqkqNmSqKm26KLCtJd4RfMCvxaXenO6g+hnEqDfJs9UuHT3brNISNqMSxIOQFLqVHtzZCuQUl5lnmQ00B4UVuVTv8P4WOlCg=">(),
         true
      );
      this.IlIIllIIIl = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","IWX1dPER1Z66jqVg+vD4ZvLWVE51NbfjlaPv/NbZi60u">(),
         IliIlllilIi<"IliIlllilIi","ta4ctvGbzDsA7OIaBNgpgdkBDT5+VxLM5MrTeFvJ07m4GC342A4rpMPKGsGceXwF1GB9p447HGOpTXj2FN1+1yjnVHavSYazTLl95DRmqFrZUsdO0j3z0WLqan3d2JE=">(),
         2,
         0,
         (-1881978147 ^ 93 ^ -35) * -29 ^ 1257206879
      );
      this.llIIllIIIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","3ahEoiwv5geOgjDrQ8AeOandH+TqLnQ+isLQBNLJIJsYY956e50DARsB">(),
         IliIlllilIi<"IliIlllilIi","eEPm1PbViDtDdATr4JW4bQhKpPMtiyUY/cKlB30rm4dZ2ZuvqjriwqHTYV1IO8SB2Ot0fyaoM4/Fn9SJnHaZ8gKHG2JieRYTTQZbRSSUKqQUi1xVankAEg==">(),
         true
      );
      this.ilIIllIIIl = new ArrayList<>();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiiiIlIIIl, this.lIIIllIIIl, this.iIIIllIIIl, this.IlIIllIIIl, this.llIIllIIIl});
   }

   @Override
   public void IiiIlliiIl() {
      if (IliIlllilIi<"IliIlllilIi","0Myx31ZQY1n1LenAOp65YcgZwHHwIh31AQaiZsAdoU7zN7MqwY05BACF6VWnj377EmxzV74j4t87RyfDZgI1CM0FssaLaWPmB9g=">()
         .equals(this.iiiiIlIIIl.Iilllilliill())) {
         this.iiiiIlIIIl.IIillIiliIil(this.iiiiIlIIIl.Ililllililil());
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   @Override
   public void Iilililiiili() {
      this.ilIIllIIIl.clear();
   }

   private String IlIllllIll(String typed) {
      if (Iiiilllliiilll.method_1562() != null) {
         for (class_640 var3 : Iiiilllliiilll.method_1562().method_2880()) {
            if (var3.method_2966() != null) {
               String var4 = var3.method_2966().name();
               if (var4 != null && var4.equalsIgnoreCase(typed)) {
                  return var4;
               }
            }
         }
      }

      return typed;
   }

   static Long liIlliiIll(String s) {
      if (s == null) {
         return null;
      } else {
         s = s.trim().replace(IliIlllilIi<"IliIlllilIi","l113F5sf/h/VPNTs561aAlECZP/L3BI2iWIpu9Y=">(), "");
         if (s.startsWith(IliIlllilIi<"IliIlllilIi","Z/jJxmMFzWRT+ZniwWpSU23PV0iVvQOBZ/yqrdY=">())) {
            s = s.substring(1);
         }

         if (s.isEmpty()) {
            return null;
         } else {
            double var1 = 1.0;
            char var3 = Character.toLowerCase(s.charAt(s.length() - 1));
            if (Character.isLetter(var3)) {
               switch (var3) {
                  case 'b':
                     var1 = 1.0E9;
                     break;
                  case 'k':
                     var1 = 1000.0;
                     break;
                  case 'm':
                     var1 = 1000000.0;
                     break;
                  case 't':
                     var1 = 1.0E12;
                     break;
                  default:
                     return null;
               }

               s = s.substring(0, s.length() - 1);
               if (s.isEmpty()) {
                  return null;
               }
            }

            try {
               double var4 = Double.parseDouble(s);
               return !(var4 < 0.0) && !Double.isNaN(var4) && !Double.isInfinite(var4) ? Math.round(var4 * var1) : null;
            } catch (NumberFormatException var6) {
               return null;
            }
         }
      }
   }

   @Override
   public void iIIIlIlIIl() {
      if (!this.ilIIllIIIl.isEmpty()) {
         for (int var1 = this.ilIIllIIIl.size() - 1; var1 >= 0; var1--) {
            IIillIllIillIl var2 = this.ilIIllIIIl.get(var1);
            if (--var2.lIililIlliIililIll <= 0) {
               this.ilIllIiIll(var2.iillilIllIIililIll);
               this.ilIIllIIIl.remove(var1);
            }
         }
      }
   }

   static String iIlllIllll(String s) {
      return s == null
         ? ""
         : s.replaceAll(
            IliIlllilIi<"IliIlllilIi","ZUFqOJj/RlvZ7FoMX6wLfOcjteEYJV2Bxr37F58mFMH2NNUonhATp8mRbqCL+hE=">(),
            IliIlllilIi<"IliIlllilIi","RWwO1g3OXNzyNmr2WGH/zrJe5H1MoI+cSwGJJSRFPsI=">()
         );
   }

   private String lIIlliIIll(String amount, long player, String raw) {
      String var5 = String.format(IliIlllilIi<"IliIlllilIi","BR4zWP5O3jzEw1ZNTgtRlHLdmdJCBxTD0hPOMBQkkA==">(), player);
      String var6 = IIllllIlll(player);
      String var7 = this.iiiiIlIIIl
         .Iilllilliill()
         .replace(IliIlllilIi<"IliIlllilIi","j/vSJk8HYtLNkxVdLBFl6GIGha3jwlTmlnNSKMmAeqOFzk8u">(), this.IlIllllIll(amount))
         .replace(IliIlllilIi<"IliIlllilIi","ORg2X0MCc4JjlbJsTdcWEDjMEvkSjH669yXKQnqEABKE7k6x">(), var6)
         .replace(IliIlllilIi<"IliIlllilIi","GaPmoZ8Bz7Y82CoHTK/I1dLFd4MRGh1hPrE7hng9WGWLGQ==">(), var5)
         .replace(IliIlllilIi<"IliIlllilIi","3fKKqQDTOy4Ly9DSKEF13uVy43aQ7eKtmwK2O2oNtNVWXzI=">(), var6)
         .replace(IliIlllilIi<"IliIlllilIi","37j35X/6B9mCKiEqjB5S7G2uOk8H2vPLlpUazdBvM0nC">(), raw);
      return iIlllIllll(var7);
   }

   public boolean iiiIlIIIll(String command) {
      long var8 = -394883987294749996L;
      if (command == null) {
         return false;
      } else {
         String[] var2 = command.trim().split(IliIlllilIi<"IliIlllilIi","kENc4uzVspEpXFcgId8OtklsS3n7numj/7tzVVaFBw==">());
         if (var2.length == (((180960199 ^ -77) - 65) * -23 ^ -132882584)
            && var2[0].equalsIgnoreCase(IliIlllilIi<"IliIlllilIi","OzFvPI7c2ViRewwMtX9BM1ayW51x7uyiEpQ/l2XSxQ==">())) {
            String var3 = var2[1];
            Long var4 = liIlliiIll(var2[2]);
            if (var4 == null) {
               return false;
            } else if (this.llIIllIIIl.Iilllilliill()
               && Iiiilllliiilll.field_1724 != null
               && var3.equalsIgnoreCase(Iiiilllliiilll.field_1724.method_5477().getString())) {
               return true;
            } else {
               IIilliillIilliil var5 = (IIilliillIilliil)llilIllililIll.iliIiiliiiii(IIilliillIilliil.class);
               if (var5 != null && var5.IliIlllilIi() && var5.ilIllIiIll()) {
                  var5.IlIllllIll((double)var4.longValue());
               }

               String var6 = this.lIIlliIIll(var3, var4, var2[2]);
               var8 ^= ((long)this.IlIIllIIIl.Iilllilliill() << 32 ^ var8) & -1L << 32;
               if ((int)(var8 >>> 32) <= 0) {
                  this.ilIllIiIll(var6);
               } else {
                  this.ilIIllIIIl.add(new IIillIllIillIl(var6, (int)(var8 >>> 32)));
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }

   private void ilIllIiIll(String text) {
      if (Iiiilllliiilll.field_1705 != null) {
         class_2561 var2 = IlIllllllIllll.lllllillll(class_2561.method_43470(text));
         Iiiilllliiilll.field_1705.method_1743().method_1812(var2);
         if (this.iIIIllIIIl.Iilllilliill()) {
            Iiiilllliiilll.field_1705.method_1758(var2, false);
         }

         if (this.lIIIllIIIl.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_5783(class_3417.field_14627, 1.0F, 1.0F);
         }
      }
   }
}
