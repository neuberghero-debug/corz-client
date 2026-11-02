package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_243;

public class llIlIiIiilIlIiIi extends ilIllIiIll {
   private int lliIIIiIIi;
   private long iliIIIiIIi;
   private final iiIiiilIIliiil lIiIIIiIIi;
   private final IIIIlilllIIIlill IIiIIIiIIi = new IIIIlilllIIIlill(
      IliIlllilIi<"IliIlllilIi","ZN3X+BOjjcVrm9OAEc4m4in3qSS47KN7SgADhIDZ6+H8">(),
      IliIlllilIi<"IliIlllilIi","K/nRvl1qG6s84EaOC5jM6MRm9ZQMmcd3ygLgze0ZDRpOsFJ0YFqmKm1BKOjuJKNeiiBsXqA=">(),
      5.0,
      2.0,
      6.0,
      0.1
   );
   private final iilliIlIIiliIl iIiIIIiIIi;
   private final IllIIiIllllIIiIl IliIIIiIIi;

   public llIlIiIiilIlIiIi() {
      super(IliIlllilIi<"IliIlllilIi","yInQc4iWWv4slTv2crS97qNLLEdijv64G4TDbFMpxvcbp0MxIH6W16Ifw4s=">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.lIiIIIiIIi = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","28xSVCN/RKLwONeYWIzwGbcfXvDPQPe1DE3xLFI/0JU4YQ==">(),
         IliIlllilIi<"IliIlllilIi","T+6gtl0M1H8zluq8PpMKz39907NNcJYjUa50CqMrM10T7uGJYImt9voYTQ3WveB9BJamuITYMPEtPRZ2plU=">(),
         false
      );
      this.iIiIIIiIIi = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","Z/6oBKjna4xN15VZfPc+R29kpHZynN55E4E6I0ok/TO/">(),
         IliIlllilIi<"IliIlllilIi","iAcBKhCmKYaY7/ZhtjiRzSt0CoTC2xKZ197qqYu2N7kFByO1yqtojvV43LhvDqvfZovi+5gY2qsJ93s=">(),
         0,
         0,
         1000
      );
      this.IliIIIiIIi = new IllIIiIllllIIiIl();
      this.lliIIIiIIi = -1;
      this.iliIIIiIIi = Long.MIN_VALUE;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiIIIiIIi, this.lIiIIIiIIi, this.iIiIIIiIIi});
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            if (!Iiiilllliiilll.field_1724.method_6115()) {
               if (!IIllIIlilIllIIli.IIillIiliIil() && !IIllIIlilIllIIli.IIIilIIiiIIi() && !IIllIIlilIllIIli.IliIlllilIi()) {
                  if (this.IliIIIiIIi.iIlIlllllill((long)this.iIiIIIiIIi.Iilllilliill())) {
                     class_243 var1 = Iiiilllliiilll.field_1724.method_33571();
                     double var2 = this.IIiIIIiIIi.Iilllilliill() * this.IIiIIIiIIi.Iilllilliill();
                     class_1511 var4 = null;
                     double var5 = Double.MAX_VALUE;

                     for (class_1297 var8 : Iiiilllliiilll.field_1687.method_18112()) {
                        if (var8 instanceof class_1511) {
                           class_1511 var9 = (class_1511)var8;
                           if (var9.method_5805()) {
                              double var10 = var1.method_1025(var9.method_73189());
                              if (var10 <= var2 && var10 < var5) {
                                 var4 = var9;
                                 var5 = var10;
                              }
                           }
                        }
                     }

                     if (var4 != null) {
                        if (this.lIiIIIiIIi.Iilllilliill()) {
                           ilIiiIiIii.lIiiIiIlilli(this, var4.method_73189(), 60, true, true, false);
                           long var12 = IIllIIlilIllIIli.IlIlllIlilIl();
                           boolean var13 = this.lliIIIiIIi == var4.method_5628() && this.iliIIIiIIi == var12 - 1L;
                           this.lliIIIiIIi = var4.method_5628();
                           this.iliIIIiIIi = var12;
                           if (!var13) {
                              return;
                           }
                        }

                        Iiiilllliiilll.field_1761.method_2918(Iiiilllliiilll.field_1724, var4);
                        Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
                        this.IliIIIiIIi.IliIlllilIi();
                     }
                  }
               }
            }
         }
      }
   }
}
