package gg.corz;

import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_746;

public final class IliIIlIllliIIlIl {
   private class_243 illiIiilIl;

   public boolean IilliliilIIi(class_746 p, class_243 point, float speed) {
      if (p != null && point != null) {
         if (this.illiIiilIl == null || this.illiIiilIl.method_1025(point) > 9.0) {
            this.illiIiilIl = point;
         }

         this.illiIiilIl = new class_243(
            this.illiIiilIl.field_1352 + (point.field_1352 - this.illiIiilIl.field_1352) * 0.35,
            this.illiIiilIl.field_1351 + (point.field_1351 - this.illiIiilIl.field_1351) * 0.35,
            this.illiIiilIl.field_1350 + (point.field_1350 - this.illiIiilIl.field_1350) * 0.35
         );
         class_243 var4 = p.method_33571();
         double var5 = this.illiIiilIl.field_1352 - var4.field_1352;
         double var7 = this.illiIiilIl.field_1351 - var4.field_1351;
         double var9 = this.illiIiilIl.field_1350 - var4.field_1350;
         double var11 = Math.sqrt(var5 * var5 + var9 * var9);
         float var13 = (float)(Math.toDegrees(Math.atan2(var9, var5)) - 90.0);
         float var14 = class_3532.method_15363((float)(-Math.toDegrees(Math.atan2(var7, var11))), -90.0F, 90.0F);
         float var15 = p.method_36454();
         float var16 = p.method_36455();
         float var17 = class_3532.method_15393(var13 - var15);
         float var18 = var14 - var16;
         float var19 = Math.abs(var17);
         float var20 = Math.abs(var18);
         if (var19 <= 0.6F && var20 <= 0.6F) {
            return true;
         } else {
            float var21 = Math.min(1.0F, var19 / 35.0F);
            float var22 = var21 * var21 * (3.0F - 2.0F * var21);
            float var23 = Math.max(2.5F, Math.min(22.0F, speed * (0.25F + 0.75F * var22)));
            float var24 = Math.min(1.0F, var20 / 25.0F);
            float var25 = var24 * var24 * (3.0F - 2.0F * var24);
            float var26 = Math.max(2.0F, Math.min(16.0F, speed * (0.25F + 0.75F * var25)));
            p.method_36456(var15 + class_3532.method_15363(var17 * 0.35F, -var23, var23));
            p.method_36457(class_3532.method_15363(var16 + class_3532.method_15363(var18 * 0.35F, -var26, var26), -90.0F, 90.0F));
            return var19 < 3.5F && var20 < 3.5F;
         }
      } else {
         return false;
      }
   }

   public static void iIlIlllllill(class_746 p, float targetYaw) {
      float var2 = p.method_36454();
      p.method_36456(var2 + class_3532.method_15393(targetYaw - var2));
   }

   public static boolean liiiIIllIl(class_746 speed, float p, float targetYaw) {
      if (speed == null) {
         return false;
      } else {
         float var3 = speed.method_36454();
         float var4 = class_3532.method_15393(p - var3);
         float var5 = Math.abs(var4);
         if (var5 <= 0.3F) {
            return false;
         } else {
            float var6 = Math.min(1.0F, var5 / 45.0F);
            float var7 = var6 * (2.0F - var6);
            float var8 = Math.max(3.0F, Math.min(20.0F, targetYaw * (0.25F + 0.75F * var7)));
            float var9 = class_3532.method_15363(var4 * 0.35F, -var8, var8);
            speed.method_36456(var3 + var9);
            return var5 > var8;
         }
      }
   }

   public static float IliIlllilIi(double dx, double dz) {
      return (float)(Math.toDegrees(Math.atan2(dz, dx)) - 90.0);
   }
}
