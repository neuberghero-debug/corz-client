package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1294;
import net.minecraft.class_2246;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public class iIlIiIIiIllIiIIi extends ilIllIiIll implements lilIliiiilIlii {
   private static final double IiliIliiil = 60.0;
   private int lliiIliiil;
   private final iiIiiilIIliiil lIiiIliiil;
   private boolean IliiIliiil;
   private final iilliIlIIiliIl iiliIliiil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","HZ9xNNX1ZzUfvajdm7pzz94GoG9Xvf2nmznojispldqgKw==">(),
      IliIlllilIi<"IliIlllilIi","G2M+X2SHhn2DwQgiKGwezqus+km43s9HUFpiPVZE1blFaWXKnPvBEU1pXR93mfF0eUvgn7lvlIPWtfU4uVqYD6St5uf7D9lDZ/k=">(),
      40,
      0,
      100
   );
   private static final double illiIliiil = 6.0;
   private static final int liliIliiil = 22;
   private final Iiiliillliiliill IIiiIliiil = new Iiiliillliiliill(
      IliIlllilIi<"IliIlllilIi","RfpezcIpFRH6WjxzlEZLsaxtlNe8zfFJ4hSZOxXSd12JHJ+h">(),
      IliIlllilIi<"IliIlllilIi","tS2232Gh7+M8BN+eKp6IHQcWWHsMZKPmnQA/FtKzGMwjX4pKXsNuAq2je5A/57BjoL6ygV0WEJeJ5LTy09INujFjRFl12WMU/7gC/cNmSyBlwl5ZYp1d4hRn6duZqglr3QLL0g==">(),
      40.0,
      60.0,
      0.0,
      100.0,
      1.0
   );
   private boolean iliiIliiil;
   private class_746 iIiiIliiil;

   public iIlIiIIiIllIiIIi() {
      super(IliIlllilIi<"IliIlllilIi","8C99YhuZOuYL8n509R1xQ19D38IilwXX6gI8RTyhnHXL2q9m0vkC0U/EVw==">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.lIiiIliiil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","cVmieUV6qjs2KiTXNiGJoWcH0LiVCNq2+iAr1G0EmV1AH4Wus4LnmR257dqyRnE=">(),
         IliIlllilIi<"IliIlllilIi","VmfYIrJthBDa2gnzqwRAdrfrXpd1sWr2CtmqI3WQUKdbE4oNumZorfahgFDD7ReCiuvo0V3qfYltdwYoqeWCfWjTgrBsAsou4zZ3XihN/pT7bg==">(),
         false
      );
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiliIliiil, this.IIiiIliiil, this.lIiiIliiil});
   }

   @Override
   protected void Illillliilli() {
      this.IliiIliiil = false;
      this.lliiIliiil = 0;
      this.iliiIliiil = false;
      this.iIiiIliiil = null;
   }

   private boolean IlIllllIll(class_746 player) {
      if (player.method_6115() || player.method_5765()) {
         return false;
      } else if (player.method_5799() || player.method_5771()) {
         return false;
      } else {
         return player.method_6059(class_1294.field_5913)
            ? false
            : Iiiilllliiilll.field_1687 != null
               && Iiiilllliiilll.field_1687
                  .method_29546(player.method_5829().method_1011(Double.longBitsToDouble(-3458496110264819628L ^ -1202295824790730328L)))
                  .noneMatch(state -> state.method_27852(class_2246.field_10343));
      }
   }

   private void lIIlliIIll() {
      if (this.iliiIliiil) {
         this.iliiIliiil = false;
         if (Iiiilllliiilll.field_1690 != null) {
            illIilIilIil.IliIlllilIi(
               Iiiilllliiilll.field_1690.field_1903, Iiiilllliiilll.field_1755 == null && liIlliiIll(Iiiilllliiilll.field_1690.field_1903)
            );
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (this.iliiIliiil) {
         this.lIIlliIIll();
      }

      if (this.IliiIliiil) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (var1 != null && var1 == this.iIiiIliiil && Iiiilllliiilll.field_1690 != null) {
            boolean var2 = Iiiilllliiilll.field_1755 == null && this.IlIllllIll(var1) && !Iiiilllliiilll.field_1690.field_1903.method_1434();
            ilIiililIiIiilil var3 = var2 ? illllIlIilllIl.IiIlliIliiIl(this.lliiIliiil, var1.method_24828(), this.iiiIlIIIll()) : ilIiililIiIiilil.IIlIllllil;
            switch (var3) {
               case iiIIllllil:
                  illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1903, true);
                  this.iliiIliiil = true;
                  this.IliiIliiil = false;
                  break;
               case liIIllllil:
                  this.lliiIliiil++;
                  break;
               case IIlIllllil:
                  this.IliiIliiil = false;
            }
         } else {
            this.IliiIliiil = false;
         }
      }
   }

   private boolean iiiIlIIIll() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      double var2 = illllIlIilllIl.liiiIIllIl(this.IIiiIliiil.Iilllilliill(), this.IIiiIliiil.Ililllililil(), var1.nextDouble());
      return illllIlIilllIl.IliIlllilIi(var2, var1.nextDouble());
   }

   @Override
   public void iIlllIllll(class_243 explosion, boolean velocity) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (!velocity && explosion != null && var3 != null && Iiiilllliiilll.field_1687 != null) {
         if (illllIlIilllIl.IIIllIIliIIl(explosion.field_1352, explosion.field_1351, explosion.field_1350)) {
            if (var3.method_24828() && this.IlIllllIll(var3)) {
               if (illllIlIilllIl.IlIlllIlilIl(var3.field_6235, illIllilIilIllil.Iilllilliill(var3.method_5628()), -(-1840837801 * -69) ^ 1831210597)) {
                  if (!this.lIiiIliiil.Iilllilliill() || this.ilIllIiIll(var3)) {
                     if (illllIlIilllIl.IliIlllilIi((double)this.iiliIliiil.Iilllilliill(), ThreadLocalRandom.current().nextDouble())) {
                        this.IliiIliiil = true;
                        this.lliiIliiil = 0;
                        this.iIiiIliiil = var3;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean ilIllIiIll(class_746 self) {
      double var2 = (double)iIiIlillIliIlill.ilillIiill();

      for (class_742 var5 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var5 != self
            && liiIIIlliiiIIIll.IliIlllilIi(var5, lilllliiilllli.iiIiIiIIIl)
            && !((double)self.method_5739(var5) >= 6.0)
            && illllIlIilllIl.iliIiiliiiii(var2, self.method_23317(), self.method_23321(), var5.method_23317(), var5.method_23321(), 60.0)
            && illllIlIilllIl.iliIiiliiiii(
               (double)var5.method_36454(), var5.method_23317(), var5.method_23321(), self.method_23317(), self.method_23321(), 60.0
            )) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void Iilililiiili() {
      this.lIIlliIIll();
      this.IliiIliiil = false;
      this.lliiIliiil = 0;
      this.iIiiIliiil = null;
   }

   private static boolean liIlliiIll(class_304 binding) {
      if (Iiiilllliiilll.method_22683() != null && Iiiilllliiilll.method_1569()) {
         class_306 var1 = ((AccessorKeyBinding)binding).getBoundKey();
         long var2 = Iiiilllliiilll.method_22683().method_4490();
         if (var1.method_1442() != class_307.field_1668) {
            return var1.method_1442() == class_307.field_1672
               ? GLFW.glfwGetMouseButton(var2, var1.method_1444()) == (((94730320 - -119 ^ 33) - 65 << 29 | (94730320 - -119 ^ 33) - 65 >>> 3) ^ -1598771435)
               : false;
         } else {
            return var1.method_1444() != class_3675.field_16237.method_1444()
               && GLFW.glfwGetKey(var2, var1.method_1444()) == (~(1447311538 - -19) ^ -1447311557);
         }
      } else {
         return false;
      }
   }
}
