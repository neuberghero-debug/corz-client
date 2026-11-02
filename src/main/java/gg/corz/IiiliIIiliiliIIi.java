package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2824;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public class IiiliIIiliiliIIi extends ilIllIiIll {
   private long iilliliiil;
   private final lIillliliIilllil Iilliliiil;
   private final iiIiiilIIliiil illliliiil;
   private static final lilllliiilllli lIlliliiil = lilllliiilllli.iiIiIiIIIl.IilliliilIIi(true).iliIiiliiiii(true);
   private final Iiiliillliiliill lllliliiil;
   private class_746 lilliliiil;
   private final iilliIlIIiliIl Illliliiil;
   private final iilliIlIIiliIl iIlliliiil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","ulLEhw1sMNbMJsVyBagog51BuewhZqoHKH8S0Rfhp2Ep3g==">(),
      IliIlllilIi<"IliIlllilIi","21wps5mmKXPQliltLqOE+ZTpl3ATYXvAXHwxCsfyfbrr98RtfxwETbtVRrHrCtrvZBBk7cVM6C3ehzJ0brT7iR0RAJ4=">(),
      90,
      0,
      100
   );

   private static boolean lIIlliIIll(class_304 binding) {
      if (Iiiilllliiilll.method_22683() != null && Iiiilllliiilll.method_1569()) {
         class_306 var1 = ((AccessorKeyBinding)binding).getBoundKey();
         long var2 = Iiiilllliiilll.method_22683().method_4490();
         if (var1.method_1442() != class_307.field_1668) {
            return var1.method_1442() == class_307.field_1672
               ? GLFW.glfwGetMouseButton(var2, var1.method_1444())
                  == (-((805158101 ^ -49) * -1736263375 << 5 | (805158101 ^ -49) * -1736263375 >>> 27) ^ 1005306019)
               : false;
         } else {
            return var1.method_1444() != class_3675.field_16237.method_1444()
               && GLFW.glfwGetKey(var2, var1.method_1444()) == (((1643866751 ^ 73) + -45) * -252645135 ^ -913882504);
         }
      } else {
         return false;
      }
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (event.lIiilIIIIi instanceof class_2824 var2) {
         class_746 var11 = Iiiilllliiilll.field_1724;
         if (var11 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1690 != null && Iiiilllliiilll.method_18854()) {
            if (Iiiilllliiilll.field_1755 == null && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
               int var4 = IIIliiIilIIliiIi.liiiIIllIl(var2);
               if (!event.lIiiIiIlilli() && this.Iilliliiil.lIiiIiIlilli(var4, this.iilliliiil)) {
                  this.lilliliiil = var11;
               } else if (this.Iilliliiil.IliIlllilIi()) {
                  class_1297 var5 = Iiiilllliiilll.field_1687.method_8469(var4);
                  if (liiIIIlliiiIIIll.IliIlllilIi(var5, lIlliliiil)) {
                     if (illllIlIilllIl.IIlllIlliIll(var11.method_5624(), var11.method_7261(0.5F))) {
                        if (Iiiilllliiilll.field_1690.field_1894.method_1434() && lIIlliIIll(Iiiilllliiilll.field_1690.field_1894)) {
                           if (!this.illliliiil.Iilllilliill()
                              || illllIlIilllIl.Illlllllilll(illIllilIilIllil.Ililllililil((class_1309)var5), illIllilIilIllil.IlIlllIlilIl())) {
                              ThreadLocalRandom var6 = ThreadLocalRandom.current();
                              if (illllIlIilllIl.IliIlllilIi((double)this.iIlliliiil.Iilllilliill(), var6.nextDouble())) {
                                 double var7 = illllIlIilllIl.liiiIIllIl(this.lllliliiil.Iilllilliill(), this.lllliliiil.Ililllililil(), var6.nextDouble());
                                 int var9 = illllIlIilllIl.iIlIlllllill((double)this.Illliliiil.Iilllilliill());
                                 int var10 = illllIlIilllIl.iIlIlllllill(var7);
                                 if (event.lIiiIiIlilli()) {
                                    this.Iilliliiil.IilliliilIIi(var4, this.iilliliiil, var9, var10);
                                 } else {
                                    if (this.Iilliliiil.iIlIlllllill(this.iilliliiil, var9, var10)) {
                                       this.lilliliiil = var11;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iiiIlIIIll();
      this.Iilliliiil.IIIllIIliIIl();
      this.lilliliiil = null;
   }

   @Override
   protected void iIIIlIlIIl() {
      this.iilliliiil++;
      if (!this.Iilliliiil.IliIlllilIi()) {
         if (Iiiilllliiilll.field_1724 == null || Iiiilllliiilll.field_1724 != this.lilliliiil || Iiiilllliiilll.field_1690 == null) {
            this.iiiIlIIIll();
            this.Iilliliiil.IIIllIIliIIl();
         } else if (Iiiilllliiilll.field_1755 != null) {
            this.Iilliliiil.IIIllIIliIIl();
         } else {
            class_304 var1 = Iiiilllliiilll.field_1690.field_1894;
            switch (this.Iilliliiil.iliIiiliiiii(this.iilliliiil, lIIlliIIll(var1))) {
               case lIilillIIi:
               case iIilillIIi:
                  illIilIilIil.IliIlllilIi(var1, false);
                  break;
               case IlilillIIi:
                  illIilIilIil.IliIlllilIi(var1, lIIlliIIll(var1));
            }
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.Iilliliiil.IIIllIIliIIl();
      this.lilliliiil = null;
   }

   private void iiiIlIIIll() {
      if (this.Iilliliiil.liiiIIllIl() && Iiiilllliiilll.field_1690 != null) {
         illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1894, Iiiilllliiilll.field_1755 == null && lIIlliIIll(Iiiilllliiilll.field_1690.field_1894));
      }
   }

   public IiiliIIiliiliIIi() {
      super(IliIlllilIi<"IliIlllilIi","BjsBUdQQFF7OvFK25em69w3B49ZMlgStzzylLLFo1cdT">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.Illliliiil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","7QQ7dBjt01WDL8O8hAl9GpHMzuBlzzQNnDOkYoxEhgN4Ku9kESkqxCY=">(),
         IliIlllilIi<"IliIlllilIi","xIri8e5k8Jykh6koSDesabGU6XFAKAZujA8HmgFkMkWsQrhvOIUqiMMHdNNBaR+H5vzPmiEhLFJKSGutQUuz71lZJUmE2TrolH3Xi0PMS06pN0iiA3+8HwLBxl4zJG9QSKjEYDI=">(),
         0,
         0,
         500,
         50
      );
      this.lllliliiil = new Iiiliillliiliill(
         IliIlllilIi<"IliIlllilIi","X2b9IueqIrUDNfwj3WbJLU45NG4QAEiQqZe+JQyOJ7I8yScOc0Dm">(),
         IliIlllilIi<"IliIlllilIi","6YeiY+6MqBTNBztM4eS6aaOqyRBSM8rPoOwASHumMRZdJLasd101sHGE7a8jhYlNM+O8xua5/lO3yKnr2Q2sNGXU7cN/Ovpva9Xt8+cJ7zO1+5614LECKq6Xa2j1vRE=">(),
         50.0,
         100.0,
         0.0,
         400.0,
         10.0
      );
      this.illliliiil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","XaDCTPEjJ2gzRFoWsaSoE8mlBi15tBysAorWY1Zv+8+mMM9UeAk5">(),
         IliIlllilIi<"IliIlllilIi","5O14IcU/wHthY7FTIMoJ9hIo9Mu+U0Hw8QVgsRqTw5mycihbJmqU9DXQO3H82bttP6+XmLpiFxCdX7nolMKpKtOMW56MwYl+eDfGfbq15uY=">(),
         true
      );
      this.Iilliliiil = new lIillliliIilllil();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIlliliiil, this.Illliliiil, this.lllliliiil, this.illliliiil});
   }
}
