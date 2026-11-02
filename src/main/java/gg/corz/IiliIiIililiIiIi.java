package gg.corz;

import net.minecraft.class_1101;
import net.minecraft.class_1111;
import net.minecraft.class_1144;
import net.minecraft.class_1146;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_1113.class_1114;

final class IiliIiIililiIiIi extends class_1101 {
   class_1111 llIliIiIIi;
   private boolean IlIliIiIIi;
   final long iIIliIiIIi;

   IiliIiIililiIiIi(class_3414 run, float seed, float volume, long u, String event, double pitch, long family) {
      super(run, class_3419.field_15248, new IliIliillliIliil(family, event, pitch));
      this.field_5442 = seed;
      this.field_5441 = volume;
      this.iIIliIiIIi = u;
      this.field_5446 = false;
      this.field_5451 = 0;
      this.field_5440 = class_1114.field_5478;
      this.field_18936 = true;
      this.field_5439 = 0.0;
      this.field_5450 = 0.0;
      this.field_5449 = 0.0;
   }

   void IliIlllilIi() {
      this.IlIliIiIIi = true;
   }

   public class_1146 method_4783(class_1144 manager) {
      class_1146 var2 = super.method_4783(manager);
      if (this.llIliIiIIi != null && var2 != null) {
         this.field_5444 = this.llIliIiIIi;
      }

      return var2;
   }

   public void method_16896() {
      if (this.IlIliIiIIi) {
         this.field_5442 *= 0.3F;
         if (this.field_5442 < 0.01F) {
            this.method_24876();
         }
      }
   }
}
