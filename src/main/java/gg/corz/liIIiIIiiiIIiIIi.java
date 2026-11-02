package gg.corz;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class liIIiIIiiiIIiIIi extends ilIllIiIll {
   private final Iiiliillliiliill iiilIliiil = new Iiiliillliiliill(
      IliIlllilIi<"IliIlllilIi","yLm+RbHku66mQj8Dlx6AADtX4xyK6BCk2iYSsbxXiA==">(),
      IliIlllilIi<"IliIlllilIi","EbL+UJNRYODx/ls0Qy/D1kdEfI8sUC/GwWv+/KkhLrOtbwWfTgAETlZ6JMODOujxm/HT">(),
      Double.longBitsToDouble(8813076380167737810L ^ 4209271661088248274L),
      Double.longBitsToDouble(6801501782949176298L ^ 2184186264987575274L),
      1.0,
      Double.longBitsToDouble(-608770490850689434L ^ -5209197510209651098L),
      1.0
   );
   private int lIIiIliiil;
   private double iIIiIliiil;
   private int IlIiIliiil;
   private boolean ilIiIliiil;
   private int llIiIliiil;
   private final iiIiiilIIliiil IIIiIliiil = new iiIiiilIIliiil(
      IliIlllilIi<"IliIlllilIi","qYaVsNQQkOpiogPjZT3Z9hTpPemZhVu+wU+rtV9qu2PvS/6C6ryY">(),
      IliIlllilIi<"IliIlllilIi","Py/eXsOpAchIMHl1Ee5RLDM/1uJ4n1IW5CF8XW5UUZBKyPLAcxhtWEugt1VNUI1t9NlvAZlDhuLuAdfES7Fd0cKPW6CYyxqYI1RH5efrO4395TDzeOPv8jjZ7KIxJ9J+IIrcPp2iQxxcb9WoAXnnbzDiqjbYG169biJiO+rm/qbnlxTyWcYGoxRao7KVBdJd0llCZNamiCs=">(),
      false
   );

   @Override
   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   private void lIIlliIIll(boolean onBlock) {
      if (!iIiIlillIliIlill.iIIilIlIil(false)) {
         if (iIiIlillIliIlill.iilllIIill()) {
            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         } else if (!onBlock && Iiiilllliiilll.field_1765 instanceof class_3966 var2 && var2.method_17782() instanceof class_1309 var3) {
            if (!lIIIIIlliIIIIIll.liiiIIllIl(var3)) {
               Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
            } else if (IIllIIlilIllIIli.Iilllilliill(this, var3)) {
               lIIIIIlliIIIIIll.iIlIlllllill();
               Iiiilllliiilll.field_1761.method_2918(Iiiilllliiilll.field_1724, var3);
               Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
               Iiiilllliiilll.field_1724.method_75203();
            }
         } else {
            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         }
      }
   }

   private void iiiIlIIIll() {
      this.ilIiIliiil = false;
      this.lIIiIliiil = 0;
      this.IlIiIliiil = 0;
      this.llIiIliiil = 0;
      this.iIIiIliiil = 0.0;
   }

   @Override
   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1755 == null) {
         if (GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 0) != 1) {
            this.ilIiIliiil = false;
         } else if (!this.ilIiIliiil) {
            this.ilIiIliiil = true;
            this.IlIiIliiil = 0;
            this.iIIiIliiil = 0.0;
            this.lIIiIliiil = this.IlIllllIll();
         } else if (this.lIIiIliiil > 0) {
            this.lIIiIliiil--;
         } else {
            boolean var1 = Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1332;
            if (!var1 || this.IIIiIliiil.Iilllilliill()) {
               this.lIIlliIIll(var1);
               this.IlIiIliiil++;
               this.lIIiIliiil = this.IlIllllIll();
            }
         }
      } else {
         this.ilIiIliiil = false;
      }
   }

   private int IlIllllIll() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      double var2 = this.iiilIliiil.Iilllilliill();
      double var4 = this.iiilIliiil.Ililllililil();
      double var6 = Math.max(0.5, var4 - var2);
      if (this.iIIiIliiil == 0.0) {
         this.iIIiIliiil = (var2 + var4) / 2.0;
      }

      this.iIIiIliiil = this.iIIiIliiil + var1.nextGaussian() * var6 * 0.18;
      if (var1.nextDouble() < 0.05) {
         this.iIIiIliiil = var2 + var1.nextDouble() * var6;
      }

      this.iIIiIliiil = Math.min(var4, Math.max(var2, this.iIIiIliiil));
      double var8 = this.iIIiIliiil;
      if (this.IlIiIliiil < 4) {
         var8 *= 0.78 + 0.06 * (double)this.IlIiIliiil;
      }

      double var10 = 1000.0 / var8;
      var10 *= 1.0 + var1.nextGaussian() * 0.22;
      if (var1.nextDouble() < 0.09) {
         var10 += 100.0 + var1.nextDouble() * 200.0;
      }

      double var12 = Math.max(1.0, var10 / 50.0);
      int var14 = (int)var12;
      if (var1.nextDouble() < var12 - (double)var14) {
         var14++;
      }

      if (var14 >= 3) {
         this.llIiIliiil = 0;
      } else if (++this.llIiIliiil >= 8 + var1.nextInt(4)) {
         var14 = 3 + var1.nextInt(3);
         this.llIiIliiil = 0;
      }

      return var14;
   }

   public liIIiIIiiiIIiIIi() {
      super(IliIlllilIi<"IliIlllilIi","zNBnUoYNuC/a9nZtkn8XoNFyrWw0ame3SgyTBlgmaiW359kRFLyg">(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiilIliiil, this.IIIiIliiil});
   }

   @Override
   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }
}
