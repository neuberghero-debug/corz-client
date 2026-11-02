package gg.corz;

import net.minecraft.class_2350;
import net.minecraft.class_3532;
import net.minecraft.class_2350.class_2351;

public final class IililIillililIil {
   private IililIillililIil() {
   }

   public static float[] lIiiIiIlilli(float goalPitch, float curPitch, float maxStep, float curYaw, float fraction, float minStep, float gcd, float goalYaw) {
      float var8 = class_3532.method_15393(maxStep - goalPitch);
      float var9 = curYaw - curPitch;
      float var10 = (float)Math.sqrt((double)(var8 * var8 + var9 * var9));
      if (var10 < 0.001F) {
         return new float[]{goalPitch, curPitch};
      } else {
         float var11 = Math.min(var10, Math.max(gcd, Math.min(minStep, var10 * fraction)));
         float var12 = var8 * var11 / var10;
         float var13 = var9 * var11 / var10;
         if (goalYaw > 0.0F) {
            var12 = (float)Math.round(var12 / goalYaw) * goalYaw;
            var13 = (float)Math.round(var13 / goalYaw) * goalYaw;
         }

         return new float[]{goalPitch + var12, class_3532.method_15363(curPitch + var13, -90.0F, 90.0F)};
      }
   }

   public static class_2350 IliIlllilIi(float pitch, float yaw) {
      long var19 = -8823885847870186435L;
      long var21 = 1444959246259362395L;
      float var2 = yaw * (float) (Math.PI / 180.0);
      float var3 = -pitch * (float) (Math.PI / 180.0);
      float var4 = class_3532.method_15374((double)var2);
      float var5 = class_3532.method_15362((double)var2);
      float var6 = class_3532.method_15374((double)var3);
      float var7 = class_3532.method_15362((double)var3);
      var19 ^= ((long)(var6 > 0.0F ? 1 : 0) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)(var4 < 0.0F ? 1 : 0) ^ var19) & -1L >>> 32;
      var21 ^= ((long)(var7 > 0.0F ? 1 : 0) << 32 ^ var21) & -1L << 32;
      float var11 = (int)(var19 >>> 32) != 0 ? var6 : -var6;
      float var12 = (int)var19 != 0 ? -var4 : var4;
      float var13 = (int)(var21 >>> 32) != 0 ? var7 : -var7;
      float var14 = var11 * var5;
      float var15 = var13 * var5;
      class_2350 var16 = (int)(var19 >>> 32) != 0 ? class_2350.field_11034 : class_2350.field_11039;
      class_2350 var17 = (int)var19 != 0 ? class_2350.field_11036 : class_2350.field_11033;
      class_2350 var18 = (int)(var21 >>> 32) != 0 ? class_2350.field_11035 : class_2350.field_11043;
      if (var11 > var13) {
         return var12 > var14 ? var17 : var16;
      } else {
         return var12 > var15 ? var17 : var18;
      }
   }

   public static float[] iIlIlllllill(class_2350 yawFacing, class_2350 j3, float j2, float camYaw, float j1, float look, float camPitch) {
      float var7 = j2;
      float var8;
      if (yawFacing.method_10166() == class_2351.field_11052) {
         float var9 = yawFacing == class_2350.field_11036 ? -1.0F : 1.0F;
         var8 = var9 * class_3532.method_15363(var9 * camYaw, 51.0F + 5.0F * j1, 87.0F - 3.0F * look);
         if (j3 != null) {
            var7 = IilliliilIIi(j2, class_2350.method_62673(j3), 33.0F + 5.0F * camPitch);
         }
      } else {
         float var12 = class_2350.method_62673(yawFacing);
         var7 = IilliliilIIi(j2, var12, 32.0F + 5.0F * look);
         float var10 = Math.abs(class_3532.method_15393(var7 - var12));
         float var11 = (float)Math.toDegrees(Math.atan(Math.cos(Math.toRadians((double)var10)))) - (6.0F + 4.0F * camPitch);
         var8 = class_3532.method_15363(camYaw, -var11, var11);
      }

      return new float[]{var7, var8};
   }

   public static boolean liiiIIllIl(class_2350 yaw, class_2350 look, float yawFacing, float pitch) {
      return IliIlllilIi(yawFacing, pitch) != yaw ? false : look == null || class_2350.method_10150((double)yawFacing) == look;
   }

   static float IilliliilIIi(float half, float camYaw, float centre) {
      float var3 = class_3532.method_15393(half - camYaw);
      return half + (class_3532.method_15363(var3, -centre, centre) - var3);
   }
}
