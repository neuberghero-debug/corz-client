package gg.corz;

import java.awt.Color;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import org.joml.Matrix4f;

public class lIIllIIiiIIllIIi extends ilIllIiIll {
   private final iiIiiilIIliiil Illiilliil;
   private final iiIiiilIIliiil iIliilliil;
   private final IIIIlilllIIIlill lIliilliil = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","VNP+v3AwGIcuQLc0LloGecFD44hMdoDgnar7/VbE7rOM">(),
      IliIlllilIi<"IliIlllilIi","1riq4QKeRdP7ltZyzPICp7B+t0v76H9HJNIuEb+pVqR65rxJWd1WrQMuKxTC78jL">(),
      Double.longBitsToDouble(4594276787086233533L ^ 9221725404209418173L),
      Double.longBitsToDouble(4685581856254347628L ^ 78399437454330220L),
      Double.longBitsToDouble(-1016368338075212288L ^ -5641565155384711680L),
      1.0
   );

   public lIIllIIiiIIllIIi() {
      super(IliIlllilIi<"IliIlllilIi","UcLzE3m2qW7zdnPh4FM0StLH3ay+wutuSQBHSshoy3H+yjyo7Ww=">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iIliilliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","Em5MT6LiQV5m3AdDBqNtYvnC9DDan/gGswA0zG59UbWthaMXilbtLw==">(),
         IliIlllilIi<"IliIlllilIi","eT8YIrM7EFjmos9NH8wHDDMf4O8ePMr/fFKAuLauEai1Wu9y53P/Gj+mxYmJMLN+Us0A">(),
         true
      );
      this.Illiilliil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","+jYi1FYOt0f+IxyZ2n/rSH0UyUSmLLFi7YHWSFCHnztvkg==">(),
         IliIlllilIi<"IliIlllilIi","gvi4tCZgD/wP+rw1RSwKMt+JkR3loYhLzbySiwzt+gbuVPKcwu6Us8Lzg1rXBMmgBeQFVVamN9o=">(),
         false
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIliilliil, this.iIliilliil, this.Illiilliil});
   }

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         if (var2 != null) {
            class_243 var3 = var2.method_71156();
            class_243 var4 = Iiiilllliiilll.field_1724.method_33571();
            double var5 = this.lIliilliil.Iilllilliill() * this.lIliilliil.Iilllilliill();
            float var7 = event.liiiiIIiiiiiiIIi;
            event.IliiiIIilliiiIIi.method_22903();
            event.IliiiIIilliiiIIi.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
            Matrix4f var8 = event.IliiiIIilliiiIIi.method_23760().method_23761();
            boolean var9 = false;

            for (class_1297 var11 : Iiiilllliiilll.field_1687.method_18112()) {
               if ((var11 != Iiiilllliiilll.field_1724 || iIIlIllIlIlIll.IlIlllIlilIl()) && var11 instanceof class_1309) {
                  class_1309 var12 = (class_1309)var11;
                  if (var12.method_5805()
                     && (!this.iIliilliil.Iilllilliill() || var11 instanceof class_1657)
                     && !(var4.method_1025(var12.method_33571()) > var5)) {
                     float var13 = var12.method_6063() <= 0.0F ? 1.0F : class_3532.method_15363(var12.method_6032() / var12.method_6063(), 0.0F, 1.0F);
                     Color var14 = Color.getHSBColor(var13 * 0.333F, 1.0F, 1.0F);
                     int var15 = 0xFF000000 | var14.getRGB() & 16777215;
                     class_243 var16 = var12.method_30950(var7);
                     float var17 = var12.method_17681() / 2.0F;
                     float var18 = var12.method_17682();
                     float var19 = (float)(var16.field_1352 - (double)var17);
                     float var20 = (float)var16.field_1351;
                     float var21 = (float)(var16.field_1350 - (double)var17);
                     float var22 = (float)(var16.field_1352 + (double)var17);
                     float var23 = (float)(var16.field_1351 + (double)var18);
                     float var24 = (float)(var16.field_1350 + (double)var17);
                     if (this.Illiilliil.Iilllilliill()) {
                        iIiiIIilIliiIIil.IIlilIliiIli(
                           var8,
                           var19,
                           var20,
                           var21,
                           var22,
                           var23,
                           var24,
                           (float)var14.getRed() / 255.0F,
                           (float)var14.getGreen() / 255.0F,
                           (float)var14.getBlue() / 255.0F,
                           0.25F
                        );
                     }

                     iIiiIIilIliiIIil.iIIIlIlIIl(var8, var19, var20, var21, var22, var23, var24, var15, 1.5F);
                     var9 = true;
                  }
               }
            }

            event.IliiiIIilliiiIIi.method_22909();
            if (var9) {
               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }
         }
      }
   }
}
