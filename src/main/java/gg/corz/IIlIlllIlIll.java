package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1294;

public class IIlIlllIlIll extends ilIllIiIll {
   public final IIIIlilllIIIlill lIiIIIIiiIiIIIIi;
   private final IIilIIilIilIIi iliIIIIiIiiIIIIi;
   public final lliliIIiililiIIi iilIIIIiIIiIIIIi = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","YQ8pGRSWsEu88MByQfn7siBy/MVgK8ru61iRLJ19Zu4=">(),
      IliIlllilIi<"IliIlllilIi","x65HvmJSHe0XaObC0ElluI5yLv/UB1R+k0Hi6wsUZR6zNDWGFgZQJqZ6pCy0fAViceU=">(),
      IliIlllilIi<"IliIlllilIi","7FTlxTcZgO3wQ02xnb3dFSN/aFRobNUR0bEw9U6eXlA=">(),
      IliIlllilIi<"IliIlllilIi","7FTlxTcZgO3wQ02xnb3dFSN/aFRobNUR0bEw9U6eXlA=">(),
      IliIlllilIi<"IliIlllilIi","fX/u8EpYnx5l611gtK0urfIGBq47QHsBrGgM+JDPMtmvjvRlLJHv7DU=">()
   );
   public final IIIIlilllIIIlill IliIIIIilliIIIIi;

   public IIlIlllIlIll() {
      super(IliIlllilIi<"IliIlllilIi","urgn5rbLrYhLdkksRuGi0aLsgoY/9/xWJnZk9qshCktmFQZj">(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.lIiIIIIiiIiIIIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","Gc5QqLg1O346g5GJqjYvzqt686ISNhRtu33k8PSeDCh+bg==">(),
         IliIlllilIi<"IliIlllilIi","3EnVJIwS7vM4hugnpKl7ukqbIIVxLmNYtnKlZLlN/Xcpv5K/6jHsiNsWCa7Xf6ep/+ueXu9AhLVx9/mt95FkIiKEauDYEFqTN8oGZ5o=">(),
         10.0,
         0.1,
         20.0,
         0.1
      );
      this.IliIIIIilliIIIIi = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","l5VHk9dkwFUYH8Nvx9cwaf7KdWNTwM8DQb+GzBLfTCCQ">(),
         IliIlllilIi<"IliIlllilIi","i5mt3GWu5MtOdqzHRD+Vt9LagsBQklWwPbTnW3RXG88cMOVRJidNDP8oq9ZFCEEe7KKJ+tB9">(),
         70.0,
         50.0,
         90.0,
         1.0
      );
      this.iliIIIIiIiiIIIIi = new IIilIIilIilIIi();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iilIIIIiIIiIIIIi, this.lIiIIIIiiIiIIIIi, this.IliIIIIilliIIIIi});
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_1569()) {
         boolean var1 = this.iilIIIIiIIiIIIIi.Iilllilliill().equals(IliIlllilIi<"IliIlllilIi","7FTlxTcZgO3wQ02xnb3dFSN/aFRobNUR0bEw9U6eXlA=">());
         if (var1 && (double)Iiiilllliiilll.field_1724.method_6032() > this.lIiIIIIiiIiIIIIi.Iilllilliill()) {
            this.iliIIIIiIiiIIIIi.IliIlllilIi();
         } else if (this.iliIIIIiIiiIIIIi.iIlIlllllill(300.0)) {
            int var2;
            if (var1) {
               var2 = IllIiIillllIiIil.IliIlllilIi(0, 9, class_1294.field_5915);
               if (var2 == -1) {
                  return;
               }
            } else {
               var2 = Iiiilllliiilll.field_1724.method_31548().method_67532();
            }

            float var3 = Iiiilllliiilll.field_1724.method_36455();
            int var4 = Iiiilllliiilll.field_1724.method_31548().method_67532();
            Iiiilllliiilll.field_1724.method_31548().method_61496(var2);
            Iiiilllliiilll.field_1724.method_36457((float)this.IliIIIIilliIIIIi.Iilllilliill() - 1.0F + ThreadLocalRandom.current().nextFloat());
            Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
            Iiiilllliiilll.field_1724.method_36457(var3);
            Iiiilllliiilll.field_1724.method_31548().method_61496(var4);
            this.iliIIIIiIiiIIIIi.IliIlllilIi();
         }
      }
   }
}
