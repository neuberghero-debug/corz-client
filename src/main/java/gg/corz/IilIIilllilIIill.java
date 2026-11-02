package gg.corz;

import java.util.Random;
import net.minecraft.class_310;
import net.minecraft.class_3532;

public final class IilIIilllilIIill {
   private float IiIIillill;
   private static final class_310 IlIIillill = class_310.method_1551();
   private final Random llIIillill = new Random();
   private boolean liIIillill;
   private float ilIIillill;

   public static float iIlIlllllill() {
      double var0 = (Double)IlIIillill.field_1690.method_42495().method_41753() * 0.6 + 0.2;
      return (float)(var0 * var0 * var0 * 8.0 * 0.15);
   }

   public void IliIlllilIi() {
      this.liIIillill = false;
   }

   public float[] liiiIIllIl(float targetPitch, float targetYaw) {
      if (!this.liIIillill) {
         this.ilIIillill = ilIiiIiIii.Iilllilliill();
         this.IiIIillill = ilIiiIiIii.IIillIiliIil();
         this.liIIillill = true;
      }

      float var3 = iIlIlllllill();
      float var4 = class_3532.method_15393(targetPitch - this.ilIIillill);
      float var5 = class_3532.method_15363(targetYaw, -90.0F, 90.0F) - this.IiIIillill;
      var4 *= 0.6F + this.llIIillill.nextFloat() * 0.3F;
      var5 *= 0.5F + this.llIIillill.nextFloat() * 0.3F;
      if (Math.abs(var4) > var3) {
         var4 += (this.llIIillill.nextFloat() - 0.5F) * 2.0F * var3;
      }

      if (Math.abs(var5) > var3) {
         var5 += (this.llIIillill.nextFloat() - 0.5F) * 2.0F * var3;
      }

      var4 = (float)Math.round(var4 / var3) * var3;
      var5 = (float)Math.round(var5 / var3) * var3;
      this.ilIIillill += var4;
      this.IiIIillill = class_3532.method_15363(this.IiIIillill + var5, -90.0F, 90.0F);
      return new float[]{this.ilIIillill, this.IiIIillill};
   }
}
