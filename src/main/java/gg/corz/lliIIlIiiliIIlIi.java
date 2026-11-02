package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.class_243;
import net.minecraft.class_3532;

class lliIIlIiiliIIlIi {
   final int IIliiiiiil;
   double liiliiiiil;
   double liIiiiiiil;
   double llIiiiiiil;
   double IiIiiiiiil;
   final long lIliiiiiil = System.currentTimeMillis();
   final List<iIiiIIliIliiIIli> Illiiiiiil;
   final int llliiiiiil;
   double ilIiiiiiil;
   double IlIiiiiiil;
   double lIIiiiiiil;
   double iiiliiiiil;
   double iIIiiiiiil;
   double IIIiiiiiil;
   double Iiiliiiiil;
   double iiIiiiiiil;
   final Random illiiiiiil;
   long iIliiiiiil = System.currentTimeMillis();

   void IliIlllilIi(float maxSpeed, float playerPos, class_243 speedMult) {
      this.IIIiiiiiil = this.Iiiliiiiil;
      this.lIIiiiiiil = this.liiliiiiil;
      this.iIIiiiiiil = this.iiiliiiiil;
      if (System.currentTimeMillis() - this.iIliiiiiil > (long)(2000 + this.illiiiiiil.nextInt(2000))) {
         double var4 = Math.toRadians(this.illiiiiiil.nextDouble() * 360.0);
         double var6 = Math.toRadians((this.illiiiiiil.nextDouble() - 0.5) * 40.0);
         this.IiIiiiiiil = -Math.sin(var4) * Math.cos(var6) * (double)maxSpeed;
         this.liIiiiiiil = Math.sin(var6) * (double)maxSpeed * 0.3;
         this.iiIiiiiiil = Math.cos(var4) * Math.cos(var6) * (double)maxSpeed;
         this.iIliiiiiil = System.currentTimeMillis();
      }

      double var16 = speedMult.field_1352 - this.Iiiliiiiil;
      double var17 = speedMult.field_1351 + 1.0 - this.liiliiiiil;
      double var8 = speedMult.field_1350 - this.iiiliiiiil;
      double var10 = Math.sqrt(var16 * var16 + var17 * var17 + var8 * var8);
      if (var10 > 35.0) {
         this.IiIiiiiiil += var16 / var10 * (double)maxSpeed * 0.15;
         this.liIiiiiiil += var17 / var10 * (double)maxSpeed * 0.15;
         this.iiIiiiiiil += var8 / var10 * (double)maxSpeed * 0.15;
      }

      double var12 = 0.02;
      this.IlIiiiiiil = this.IlIiiiiiil + (this.IiIiiiiiil - this.IlIiiiiiil) * var12;
      this.llIiiiiiil = this.llIiiiiiil + (this.liIiiiiiil - this.llIiiiiiil) * var12;
      this.ilIiiiiiil = this.ilIiiiiiil + (this.iiIiiiiiil - this.ilIiiiiiil) * var12;
      double var14 = 0.03;
      this.IlIiiiiiil = this.IlIiiiiiil + (this.illiiiiiil.nextDouble() - 0.5) * var14;
      this.llIiiiiiil = this.llIiiiiiil + (this.illiiiiiil.nextDouble() - 0.5) * var14;
      this.ilIiiiiiil = this.ilIiiiiiil + (this.illiiiiiil.nextDouble() - 0.5) * var14;
      this.IlIiiiiiil = class_3532.method_15350(this.IlIiiiiiil, (double)(-playerPos), (double)playerPos);
      this.llIiiiiiil = class_3532.method_15350(this.llIiiiiiil, (double)(-playerPos), (double)playerPos);
      this.ilIiiiiiil = class_3532.method_15350(this.ilIiiiiiil, (double)(-playerPos), (double)playerPos);
      this.Iiiliiiiil = this.Iiiliiiiil + this.IlIiiiiiil;
      this.liiliiiiil = this.liiliiiiil + this.llIiiiiiil;
      this.iiiliiiiil = this.iiiliiiiil + this.ilIiiiiiil;
      this.Illiiiiiil.add(0, new iIiiIIliIliiIIli(this.Iiiliiiiil, this.liiliiiiil, this.iiiliiiiil));

      while (this.Illiiiiiil.size() > this.llliiiiiil) {
         this.Illiiiiiil.remove(this.Illiiiiiil.size() - 1);
      }
   }

   double iIlIlllllill(float td) {
      return class_3532.method_16436((double)td, this.IIIiiiiiil, this.Iiiliiiiil);
   }

   double IilliliilIIi(float td) {
      return class_3532.method_16436((double)td, this.lIIiiiiiil, this.liiliiiiil);
   }

   double lIiiIiIlilli(float td) {
      return class_3532.method_16436((double)td, this.iIIiiiiiil, this.iiiliiiiil);
   }

   boolean liiiIIllIl(class_243 playerPos) {
      double var2 = this.Iiiliiiiil - playerPos.field_1352;
      double var4 = this.liiliiiiil - playerPos.field_1351;
      double var6 = this.iiiliiiiil - playerPos.field_1350;
      return var2 * var2 + var4 * var4 + var6 * var6 > Double.longBitsToDouble(-6919096497570562417L ^ -2358920399881224561L);
   }

   float IIIllIIliIIl() {
      long var1 = System.currentTimeMillis() - this.lIliiiiiil;
      return var1 < (6770974974985575257L ^ 6770974974985574577L) ? (float)var1 / 1000.0F : 1.0F;
   }

   lliIIlIiiliIIlIi(double velY, double maxTrailLength, double z, double x, double baseRandomColor, double y, int velZ, int velX) {
      this.Illiiiiiil = new ArrayList<>();
      this.illiiiiiil = new Random();
      this.Iiiliiiiil = this.IIIiiiiiil = velY;
      this.liiliiiiil = this.lIIiiiiiil = maxTrailLength;
      this.iiiliiiiil = this.iIIiiiiiil = z;
      this.IlIiiiiiil = this.IiIiiiiiil = x;
      this.llIiiiiiil = this.liIiiiiiil = baseRandomColor;
      this.ilIiiiiiil = this.iiIiiiiiil = y;
      this.IIliiiiiil = velZ;
      this.llliiiiiil = velX;
   }

   float iliIiiliiiii() {
      double var1 = Double.longBitsToDouble(-575196883638342150L ^ -4040321628091272096L)
         + Double.longBitsToDouble(4198100085123102312L ^ 399479312301240306L)
            * Math.sin((double)(System.currentTimeMillis() - this.lIliiiiiil) / Double.longBitsToDouble(7848021669360913374L ^ 3206780778378906590L));
      return (float)var1;
   }
}
