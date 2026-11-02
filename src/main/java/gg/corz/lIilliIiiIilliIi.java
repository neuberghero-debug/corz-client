package gg.corz;

import net.minecraft.class_10055;
import net.minecraft.class_591;
import net.minecraft.class_630;

final class lIilliIiiIilliIi extends class_591 {
   public void method_62110(class_10055 s) {
      super.method_62110(s);
      if (s instanceof liilliiiiillii var2) {
         float var3 = var2.IliiIliIIl;
         if (var3 > 0.0F) {
            this.field_3391.field_3654 += 0.5F * var3;
            this.field_3391.field_3656 += 3.2F * var3;
            this.field_3398.field_3656 += 4.2F * var3;
            this.field_3401.field_3656 += 3.2F * var3;
            this.field_27433.field_3656 += 3.2F * var3;
            this.field_3401.field_3654 += 0.4F * var3;
            this.field_27433.field_3654 += 0.4F * var3;
            this.field_3392.field_3655 += 4.0F * var3;
            this.field_3397.field_3655 += 4.0F * var3;
            this.field_3392.field_3656 += 0.2F * var3;
            this.field_3397.field_3656 += 0.2F * var3;
         }

         switch (var2.IiliIliIIl) {
            case 0:
               if (var2.iIiiIliIIl > 0.0F) {
                  this.field_3401.field_3654 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3654, -2.05F, var2.iIiiIliIIl);
                  this.field_3401.field_3675 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3675, -0.55F, var2.iIiiIliIIl);
                  this.field_3401.field_3674 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3674, 0.1F, var2.iIiiIliIIl);
               }
               break;
            case 1:
               float var5 = var2.liliIliIIl;
               this.field_3401.field_3654 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3654, -2.9F, var5);
               this.field_27433.field_3654 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3654, -2.9F, var5);
               this.field_3401.field_3674 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3674, 0.18F, var5);
               this.field_27433.field_3674 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3674, -0.18F, var5);
               this.field_3401.field_3675 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3675, 0.0F, var5);
               this.field_27433.field_3675 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3675, 0.0F, var5);
               break;
            case 2:
               float var4 = var2.liliIliIIl;
               this.field_3401.field_3654 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3654, -2.9F, var4);
               this.field_27433.field_3654 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3654, -2.9F, var4);
               this.field_3401.field_3674 = ilIIllIiIIll.IiIilliIil(this.field_3401.field_3674, 0.18F, var4);
               this.field_27433.field_3674 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3674, -0.18F, var4);
               break;
            default:
               if (var2.iiliIliIIl > 0.0F) {
                  this.field_27433.field_3654 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3654, var2.IIiiIliIIl, var2.iiliIliIIl);
                  this.field_27433.field_3674 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3674, -0.35F, var2.iiliIliIIl);
               }

               if (var2.lIiiIliIIl > 0.0F) {
                  this.field_27433.field_3654 = ilIIllIiIIll.IiIilliIil(this.field_27433.field_3654, -2.55F, var2.lIiiIliIIl);
                  this.field_27433.field_3674 = ilIIllIiIIll.IiIilliIil(
                     this.field_27433.field_3674, 0.55F + 0.38F * (float)Math.sin((double)(var2.field_53328 * 0.55F)), var2.lIiiIliIIl
                  );
               }
         }
      }
   }

   lIilliIiiIilliIi(class_630 root) {
      super(root, false);
   }
}
