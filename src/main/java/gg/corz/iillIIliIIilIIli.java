package gg.corz;

import net.minecraft.class_10185;
import net.minecraft.class_746;

public class iillIIliIIilIIli extends ilIllIiIll {
   private final iiIiiilIIliiil iilIilIlIi;
   private final iiIiiilIIliiil lilIilIlIi;
   private static final double lllIilIlIi = 0.42;
   private final lliliIIiililiIIi illIilIlIi = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","VWphNJ+NUWupmiFES2LLErR/CokmEMPjPWjw3Hvhd5Y=">(),
      IliIlllilIi<"IliIlllilIi","TQypFOjUc39B8L/4nN+6jght5ZM3ZAsGtQdDJ8xbgoP5nDijs4ipLWg8zhhpOpJ2WlU4hA6WdrD3hwDIBp/mDtDo9BchDaNndwuSKYzTI5yO">(),
      IliIlllilIi<"IliIlllilIi","cCwil0rVrbJdtMbyic+3LWp5qVvrvKeVWozH3wPRzbvXQg==">(),
      IliIlllilIi<"IliIlllilIi","cCwil0rVrbJdtMbyic+3LWp5qVvrvKeVWozH3wPRzbvXQg==">(),
      IliIlllilIi<"IliIlllilIi","MMOOBa6F4twjTtiTfbNzQEd6TEhm1OfGy1DwKkEdEUE=">()
   );
   private final IIIIlilllIIIlill IilIilIlIi = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","tlmDbtMeLHA2cXuB8TPyO5v65PdvlWsF4RxK++VeqSYZ">(),
      IliIlllilIi<"IliIlllilIi","s/ugq4Mo8u89c2a1xFRtut1Ry3JQWVXoaLmJoyVS/wYW/2LWWWiCTnlb32wQpKMNAc8Fla2stHWyc4wJdz8qGlMkpYafqsGqFg==">(),
      1.4,
      1.0,
      5.0,
      0.1
   );
   private static final double IllIilIlIi = 0.2873;

   private boolean lIIlliIIll() {
      return IliIlllilIi<"IliIlllilIi","MMOOBa6F4twjTtiTfbNzQEd6TEhm1OfGy1DwKkEdEUE=">().equals(this.illIilIlIi.Iilllilliill());
   }

   public iillIIliIIilIIli() {
      super(IliIlllilIi<"IliIlllilIi","m+P5Rl+Id9N6pkEKQnXSx4pyiLJS5Orl9th6JwMNTgAKbPGZYQ==">(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.lilIilIlIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","TEd2ILDo/0295JirLMh3PqJ0jA6ls6xzOYcTqFbn7du14L/eAvvZ">(),
         IliIlllilIi<"IliIlllilIi","6rTPoMrqbzIcG8z9P0e5/SDvspAzNhVgI5ETBRfvf8BNi3h2qYrrRR2kFr5y9V2xswxe/JLZIy2f91CHhqA=">(),
         false
      );
      this.iilIilIlIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","2dIsdrW1d6UyG2hIMW/BAwUg9GvJPoVg3FxjeC5AqO4sT7dE5Q==">(),
         IliIlllilIi<"IliIlllilIi","1e/b7t2j8v7JFeiMERmPaDqCfP5AZfaNYxe2Kd39GXjH0JtWUKte8ARr2dr5pRWdvpLCsq67cOAY+ae0/77gitQ4i3qY">(),
         true
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illIilIlIi, this.IilIilIlIi, this.lilIilIlIi, this.iilIilIlIi});
   }

   public void iiiIlIIIll(class_746 p) {
      if (!p.method_31549().field_7479 && !p.method_6128() && !p.method_5765()) {
         if (!p.method_5799() && !p.method_5771() && !p.method_6101()) {
            if (!this.lilIilIlIi.Iilllilliill() || p.method_5624()) {
               class_10185 var2 = p.field_3913.field_54155;
               double var3 = (var2.comp_3159() ? 1.0 : 0.0) - (var2.comp_3160() ? 1.0 : 0.0);
               double var5 = (var2.comp_3161() ? 1.0 : 0.0) - (var2.comp_3162() ? 1.0 : 0.0);
               if (var3 != 0.0 || var5 != 0.0) {
                  double var7 = 0.2873 * this.IilIilIlIi.Iilllilliill();
                  double[] var9 = IilIililIi.IliIlllilIi(var5, var3, var7, p.method_36454());
                  double var10 = p.method_18798().field_1351;
                  if (this.lIIlliIIll() && this.iilIilIlIi.Iilllilliill() && p.method_24828()) {
                     var10 = 0.42;
                  }

                  p.method_18800(var9[0], var10, var9[1]);
               }
            }
         }
      }
   }
}
