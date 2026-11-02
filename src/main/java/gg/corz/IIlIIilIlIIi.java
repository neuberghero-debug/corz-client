package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1294;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import net.minecraft.class_1802;
import net.minecraft.class_490;

public class IIlIIilIlIIi extends ilIllIiIll {
   public final Iiiliillliiliill IIIIiliilIIIilii = new Iiiliillliiliill(
      IliIlllilIi<"IliIlllilIi","fv0gKr1cRoz5A+DdMQ3OA7Ui0Lke73kSVxViCb7HAINF">(),
      IliIlllilIi<"IliIlllilIi","M6nPV6y7EPj3rsP6CnZcI9mt/s+0LXELh0L93eJSzBXI1LGaoeLUwkPYQw86apjdR9GIJX/NBcnwt4YyHPloXdWZVymBrg/o">(),
      Double.longBitsToDouble(4928439718861812581L ^ 313938950667318117L),
      Double.longBitsToDouble(8638248905482959397L ^ 4010518813383064101L),
      0.0,
      Double.longBitsToDouble(5672632463873664621L ^ 1066224101259601517L),
      1.0
   );
   private double IiIIiliiliIIilii;
   private final IIilIIilIilIIi llIIiliiilIIilii;
   public final iiIiiilIIliiil iIIIiliiIlIIilii = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","8q7xV+xnnl1Q1HOnwiRsGxTQ+Sat3iEKfQdW7yf5BluRBD1DAZMSKNjIXw==">(),
      IliIlllilIi<"IliIlllilIi","VFuiUqJWrxAboPz7KD1SRzhHFL2HkM+eqAW8arr76qP8PiBTjCRVAHtjlswcZWIifyYpOyMu5jtzZeleaJs=">(),
      false
   );

   public IIlIIilIlIIi() {
      super(IliIlllilIi<"IliIlllilIi","dUVg53/rVtW8z7bNTuybpRlBY3nH/AEb+aKgFx3tVvqEmi0gGd/FTyc=">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.llIIiliiilIIilii = new IIilIIilIilIIi();
      this.IiIIiliiliIIilii = Double.longBitsToDouble(-8322028098386267285L ^ -3694016531309661333L);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIIiliilIIIilii, this.iIIIiliiIlIIilii});
   }

   private void iiiIlIIIll() {
      this.IiIIiliiliIIilii = this.IIIIiliilIIIilii.Iilllilliill()
         + ThreadLocalRandom.current().nextDouble() * (this.IIIIiliilIIIilii.Ililllililil() - this.IIIIiliilIIIilii.Iilllilliill());
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 instanceof class_490 var1) {
            if (this.lIIlliIIll() != -1 && this.llIIiliiilIIilii.iIlIlllllill(this.IiIIiliiliIIilii)) {
               int var3 = IllIiIillllIiIil.IliIlllilIi(9, 36, this.iIIIiliiIlIIilii.Iilllilliill() ? class_1294.field_5915 : null);
               if (var3 != -1) {
                  Iiiilllliiilll.field_1761
                     .method_2906(((class_1723)var1.method_17577()).field_7763, var3, 0, class_1713.field_7794, Iiiilllliiilll.field_1724);
                  this.iiiIlIIIll();
                  this.llIIiliiilIIilii.IliIlllilIi();
               }
            }
         } else {
            this.iiiIlIIIll();
            this.llIIiliiilIIilii.IliIlllilIi();
         }
      }
   }

   private int lIIlliIIll() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(var1).method_7909() == class_1802.field_8162) {
            return var1;
         }
      }

      return -1;
   }
}
