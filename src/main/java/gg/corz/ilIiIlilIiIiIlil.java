package gg.corz;

import net.minecraft.class_3532;

public final class ilIiIlilIiIiIlil {
   public static final double iliIiIiIil = 0.08;
   private static final double iiiIiIiIil = 0.98F;
   private static final double liiIiIiIil = 0.99F;
   public static final float lIIliIiIil = 300.0F;
   public static final float iIIliIiIil = 260.0F;
   private static final float IIIliIiIil = (float) (Math.PI / 180.0);
   public static final double IiiIiIiIil = 0.01;

   public static float IlIlllIlilIl(float degPerSec, float target, float cur) {
      float var3 = class_3532.method_15393(target - degPerSec);
      float var4 = Math.abs(var3);
      if (var4 < 1.0E-4F) {
         return degPerSec;
      } else {
         float var5 = Math.min(var4, llIliillilIliill.IilliliilIIi(var4, cur));
         return degPerSec + Math.copySign(var5, var3);
      }
   }

   private ilIiIlilIiIiIlil() {
   }

   public static int IIIllIIliIIl(int flightDuration) {
      return ((1321992213 >>> 29 | 1321992213 << 3) - 103 + 11 ^ 1986003012) * (Math.max(1, flightDuration) + 1) + 5;
   }

   public static void iliIiiliiiii(IliIIIlllliIIIll b) {
      b.IiiIiiIlll = b.IiiIiiIlll + b.IIIliiIlll;
      b.liiIiiIlll = b.liiIiiIlll + b.lIIliiIlll;
      b.iiiIiiIlll = b.iiiIiiIlll + b.iIIliiIlll;
   }

   public static float IiIlliIliiIl(float cur, float target) {
      return class_3532.method_15363(IlIlllIlilIl(cur, class_3532.method_15363(target, -90.0F, 90.0F), 260.0F), -90.0F, 90.0F);
   }

   public static double liiiIIllIl(float pitch) {
      return (double)(-class_3532.method_15374((double)(pitch * (float) (Math.PI / 180.0))));
   }

   public static void IilliliilIIi(IliIIIlllliIIIll b, double gravity) {
      float var3 = b.IlIliiIlll;
      float var4 = b.llIliiIlll;
      double var5 = IliIlllilIi(var3, var4);
      double var7 = iIlIlllllill(var3, var4);
      float var9 = var4 * (float) (Math.PI / 180.0);
      double var10 = Math.sqrt(var5 * var5 + var7 * var7);
      double var12 = Math.sqrt(b.IIIliiIlll * b.IIIliiIlll + b.iIIliiIlll * b.iIIliiIlll);
      double var14 = Math.cos((double)var9);
      double var16 = var14 * var14;
      double var18 = b.IIIliiIlll;
      double var20 = b.lIIliiIlll;
      double var22 = b.iIIliiIlll;
      var20 += gravity * (-1.0 + var16 * 0.75);
      if (var20 < 0.0 && var10 > 0.0) {
         double var24 = var20 * -0.1 * var16;
         var18 += var5 * var24 / var10;
         var20 += var24;
         var22 += var7 * var24 / var10;
      }

      if (var9 < 0.0F && var10 > 0.0) {
         double var27 = var12 * (double)(-class_3532.method_15374((double)var9)) * 0.04;
         var18 += -var5 * var27 / var10;
         var20 += var27 * 3.2;
         var22 += -var7 * var27 / var10;
      }

      if (var10 > 0.0) {
         var18 += (var5 / var10 * var12 - var18) * 0.1;
         var22 += (var7 / var10 * var12 - var22) * 0.1;
      }

      b.IIIliiIlll = var18 * 0.99F;
      b.lIIliiIlll = var20 * 0.98F;
      b.iIIliiIlll = var22 * 0.99F;
   }

   public static double iIlIlllllill(float yaw, float pitch) {
      return (double)(
         class_3532.method_15362((double)(-yaw * (float) (Math.PI / 180.0))) * class_3532.method_15362((double)(pitch * (float) (Math.PI / 180.0)))
      );
   }

   public static void lIiiIiIlilli(IliIIIlllliIIIll b) {
      double var1 = IliIlllilIi(b.IlIliiIlll, b.llIliiIlll);
      double var3 = liiiIIllIl(b.llIliiIlll);
      double var5 = iIlIlllllill(b.IlIliiIlll, b.llIliiIlll);
      b.IIIliiIlll = b.IIIliiIlll
         + var1 * Double.longBitsToDouble(-5684395480732766485L ^ -8168014644648085647L)
         + (var1 * Double.longBitsToDouble(7801230188197568278L ^ 6033567334454648598L) - b.IIIliiIlll)
            * Double.longBitsToDouble(2451419785105515305L ^ 2154182209699062569L);
      b.lIIliiIlll = b.lIIliiIlll
         + var3 * Double.longBitsToDouble(2218490263059432766L ^ 2409479378125429924L)
         + (var3 * Double.longBitsToDouble(8131216448969879427L ^ 5706028049630867331L) - b.lIIliiIlll)
            * Double.longBitsToDouble(-4740125794856040956L ^ -9090603034895940092L);
      b.iIIliiIlll = b.iIIliiIlll
         + var5 * Double.longBitsToDouble(-4903258341286623924L ^ -8913264549059470122L)
         + (var5 * Double.longBitsToDouble(37999498514559435L ^ 4575376123090334155L) - b.iIIliiIlll)
            * Double.longBitsToDouble(7170126607072605309L ^ 6656716249552368765L);
   }

   public static double IliIlllilIi(float pitch, float yaw) {
      return (double)(
         class_3532.method_15374((double)(-pitch * (float) (Math.PI / 180.0))) * class_3532.method_15362((double)(yaw * (float) (Math.PI / 180.0)))
      );
   }

   public static float IIlllIlliIll(double fromX, double fromZ, double toX, double toZ) {
      return (float)Math.toDegrees(Math.atan2(-(toX - fromX), toZ - fromZ));
   }
}
