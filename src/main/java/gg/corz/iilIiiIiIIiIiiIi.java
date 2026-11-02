package gg.corz;

import net.minecraft.class_10185;
import net.minecraft.class_2338;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_744;
import net.minecraft.class_746;

public final class iilIiiIiIIiIiiIi extends class_744 {
   private int lliliiiIIi;
   public int iIiliiiIIi;
   private boolean lIiliiiIIi;
   private float lilliiiIIi;
   public boolean IliliiiIIi;
   private float IilliiiIIi;
   private boolean IIiliiiIIi;
   private boolean iilliiiIIi;

   public void iIlIlllllill() {
      this.IilliiiIIi = 0.0F;
      this.lilliiiIIi = 0.0F;
      this.iilliiiIIi = false;
      this.IIiliiiIIi = false;
      this.lIiliiiIIi = false;
   }

   public void IliIlllilIi(float jump, float forward, boolean strafe, boolean sprint) {
      this.liiiIIllIl(jump, forward, strafe, sprint, false);
   }

   private static float iliIiiliiiii(boolean negative, boolean positive) {
      if (negative == positive) {
         return 0.0F;
      } else {
         return negative ? 1.0F : -1.0F;
      }
   }

   public void liiiIIllIl(float jump, float forward, boolean sprint, boolean strafe, boolean sneak) {
      this.IilliiiIIi = IIIllIIliIIl(jump);
      this.lilliiiIIi = IIIllIIliIIl(forward);
      this.iilliiiIIi = sprint;
      this.IIiliiiIIi = strafe;
      this.lIiliiiIIi = sneak;
   }

   private static float IIIllIIliIIl(float v) {
      return Math.max(-1.0F, Math.min(1.0F, v));
   }

   public void method_3129() {
      long var17 = -8781568980484030497L;
      long var11 = -4940998674704695068L;
      long var13 = -1200698404908573663L;
      long var15 = 3041489271741355634L;
      this.lliliiiIIi++;
      if (this.iIiliiiIIi > 0) {
         this.iIiliiiIIi--;
      }

      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1 != null ? var1.field_1724 : null;
      var11 ^= (0L ^ var11) & -1L << 32;
      var11 ^= (0L ^ var11) & -1L >>> 32;
      if (var2 != null) {
         try {
            var11 ^= ((long)(!var2.method_5869() && !var2.method_5771() ? 0 : 1) ^ var11) & -1L >>> 32;
            var11 ^= ((long)(!var2.method_5799() && (int)var11 == 0 ? 0 : 1) << 32 ^ var11) & -1L << 32;
            if ((int)(var11 >>> 32) == 0 && var1.field_1687 != null) {
               class_2338 var5 = var2.method_24515();
               var11 ^= (
                     (long)(
                              var1.field_1687.method_8320(var5).method_26227().method_15769()
                                    && var1.field_1687.method_8320(var5.method_10084()).method_26227().method_15769()
                                 ? 0
                                 : 1
                           )
                           << 32
                        ^ var11
                  )
                  & -1L << 32;
            }
         } catch (Throwable var19) {
         }
      }

      if ((int)(var11 >>> 32) == 0 && lIlIiIliIlIiIl.Iilllilliill()) {
         this.field_54155 = new class_10185(false, false, false, false, false, false, false);
         this.field_55868 = class_241.field_1340;
      } else {
         var13 ^= ((long)((int)(var11 >>> 32) != 0 || !this.lIiliiiIIi && this.iIiliiiIIi <= 0 ? 0 : 1) << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)((int)(var11 >>> 32) != 0 ? ((int)var11 == 0 && this.IliliiiIIi ? 0 : 1) : (this.iilliiiIIi && !this.IliliiiIIi ? 1 : 0)) ^ var13)
            & -1L >>> 32;
         var15 ^= ((long)this.lIiiIiIlilli(this.IilliiiIIi) << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)this.lIiiIiIlilli(-this.IilliiiIIi) ^ var15) & -1L >>> 32;
         var17 ^= ((long)this.lIiiIiIlilli(this.lilliiiIIi) << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)this.lIiiIiIlilli(-this.lilliiiIIi) ^ var17) & -1L >>> 32;
         this.field_54155 = new class_10185(
            (boolean)((int)(var15 >>> 32)),
            (boolean)((int)var15),
            (boolean)((int)(var17 >>> 32)),
            (boolean)((int)var17),
            (boolean)((int)var13),
            (boolean)((int)(var13 >>> 32)),
            this.IIiliiiIIi && (int)(var15 >>> 32) != 0 && (int)(var13 >>> 32) == 0
         );
         this.field_55868 = new class_241(
               iliIiiliiiii((boolean)((int)(var17 >>> 32)), (boolean)((int)var17)), iliIiiliiiii((boolean)((int)(var15 >>> 32)), (boolean)((int)var15))
            )
            .method_35581();
      }
   }

   public void IilliliilIIi() {
      this.iIiliiiIIi = 0;
      this.IliliiiIIi = false;
   }

   private boolean lIiiIiIlilli(float v) {
      return v >= 0.5F || v > 0.0F && this.lliliiiIIi % 3 == 0;
   }
}
