package gg.corz;

import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

public final class ilIiiIiIii {
   private static boolean llIIllIlilIIllIl;
   private static final class_310 IIliIlIllIliIlIl = class_310.method_1551();
   private static boolean iiIIllIlIIlIllIl;
   private static boolean lIiiIlIliIiiIlIl;
   private static float iiliIlIlIIiiIlIl;
   private static float liiiIlIliiiiIlIl;
   private static int llliIlIlilliIlIl = Integer.MIN_VALUE;
   private static boolean IliiIlIllliiIlIl;
   private static float IiliIlIlliliIlIl;
   private static boolean iIIIllIlIlIIllIl;
   private static boolean iliiIlIlIiiiIlIl;
   private static boolean iIliIlIlIlliIlIl;
   private static float IIIIllIllIIIllIl;
   private static boolean IiIIllIlliIIllIl;

   public static class_243 Iiilliiliiil(float pitch, float yaw) {
      float var2 = -pitch * (float) (Math.PI / 180.0) - (float) Math.PI;
      float var3 = -yaw * (float) (Math.PI / 180.0);
      float var4 = class_3532.method_15362((double)var2);
      float var5 = class_3532.method_15374((double)var2);
      float var6 = -class_3532.method_15362((double)var3);
      float var7 = class_3532.method_15374((double)var3);
      return new class_243((double)(var5 * var6), (double)var7, (double)(var4 * var6));
   }

   public static void IIIllIIliIIl() {
      iIliIlIlIlliIlIl = false;
      iIIIllIlIlIIllIl = false;
      llIIllIlilIIllIl = false;
      IiIIllIlliIIllIl = false;
      iiIIllIlIIlIllIl = false;
      llliIlIlilliIlIl = Integer.MIN_VALUE;
   }

   public static void iIlIlllllill(Object freezeMove, float moveFix, float o, int prio, boolean yaw, boolean pitch, boolean silent) {
      if (IIliIlIllIliIlIl.field_1724 != null) {
         if (!iIliIlIlIlliIlIl || prio >= llliIlIlilliIlIl) {
            iIliIlIlIlliIlIl = true;
            llliIlIlilliIlIl = prio;
            IiliIlIlliliIlIl = class_3532.method_15393(moveFix);
            iiliIlIlIIiiIlIl = class_3532.method_15363(o, -90.0F, 90.0F);
            lIiiIlIliIiiIlIl = yaw;
            IliiIlIllliiIlIl = pitch;
            iliiIlIlIiiiIlIl = silent;
         }
      }
   }

   public static boolean Illlllllilll() {
      return iiIIllIlIIlIllIl;
   }

   public static boolean IIlllIlliIll() {
      return IiIIllIlliIIllIl;
   }

   public static boolean IlIlllIlilIl() {
      return iIIIllIlIlIIllIl;
   }

   public static void lIiiIiIlilli(Object prio, class_243 target, int o, boolean silent, boolean moveFix, boolean freezeMove) {
      if (IIliIlIllIliIlIl.field_1724 != null) {
         float[] var6 = Ililllililil(IIliIlIllIliIlIl.field_1724.method_33571(), target);
         iIlIlllllill(prio, var6[0], var6[1], o, silent, moveFix, freezeMove);
      }
   }

   public static void iliIiiliiiii() {
      long var10 = -5243072825550880366L;
      if (IIliIlIllIliIlIl.field_1724 != null && IIliIlIllIliIlIl.method_1562() != null) {
         float var0 = IIliIlIllIliIlIl.field_1724.method_36454();
         float var1 = IIliIlIllIliIlIl.field_1724.method_36455();
         float var2 = IilIIilllilIIill.iIlIlllllill();
         float var3 = 25.0F;
         if (var2 > 0.0F && Float.isFinite(var2)) {
            var3 = (float)(Math.floor((double)(var3 / var2)) * (double)var2);
         }

         var10 ^= (
               (long)(
                        iIliIlIlIlliIlIl
                              || !llIIllIlilIIllIl
                              || !(Math.abs(class_3532.method_15393(liiiIlIliiiiIlIl - var0)) > var3) && !(Math.abs(IIIIllIllIIIllIl - var1) > var3)
                           ? 0
                           : 1
                     )
                     << 32
                  ^ var10
            )
            & -1L << 32;
         if (!iIliIlIlIlliIlIl && (int)(var10 >>> 32) == 0) {
            iIIIllIlIlIIllIl = false;
            llIIllIlilIIllIl = false;
            IiIIllIlliIIllIl = false;
            iiIIllIlIIlIllIl = false;
            liiiIlIliiiiIlIl = IIliIlIllIliIlIl.field_1724.method_36454();
            IIIIllIllIIIllIl = IIliIlIllIliIlIl.field_1724.method_36455();
         } else {
            var10 ^= ((long)((!iIliIlIlIlliIlIl || lIiiIlIliIiiIlIl) && llIIllIlilIIllIl ? 1 : 0) ^ var10) & -1L >>> 32;
            float var6 = (int)var10 != 0 ? var0 + class_3532.method_15393(liiiIlIliiiiIlIl - var0) : var0;
            float var7 = (int)var10 != 0 ? IIIIllIllIIIllIl : var1;
            float var8 = class_3532.method_15393((iIliIlIlIlliIlIl ? IiliIlIlliliIlIl : var0) - var6);
            if (Math.abs(var8) > var3) {
               var8 = Math.copySign(var3, var8);
            }

            float var9 = (iIliIlIlIlliIlIl ? class_3532.method_15363(iiliIlIlIIiiIlIl, -90.0F, 90.0F) : var1) - var7;
            if (Math.abs(var9) > var3) {
               var9 = Math.copySign(var3, var9);
            }

            liiiIlIliiiiIlIl = var6 + var8;
            IIIIllIllIIIllIl = class_3532.method_15363(var7 + var9, -90.0F, 90.0F);
            iIIIllIlIlIIllIl = true;
            if (!iIliIlIlIlliIlIl) {
               iiIIllIlIIlIllIl = false;
            } else {
               llIIllIlilIIllIl = lIiiIlIliIiiIlIl;
               IiIIllIlliIIllIl = lIiiIlIliIiiIlIl && IliiIlIllliiIlIl;
               iiIIllIlIIlIllIl = iliiIlIlIiiiIlIl;
               if (!lIiiIlIliIiiIlIl) {
                  IIliIlIllIliIlIl.field_1724.method_36456(liiiIlIliiiiIlIl);
                  IIliIlIllIliIlIl.field_1724.method_36457(IIIIllIllIIIllIl);
               }
            }
         }

         iIliIlIlIlliIlIl = false;
         llliIlIlilliIlIl = Integer.MIN_VALUE;
      } else {
         IIIllIIliIIl();
      }
   }

   public static void liiiIIllIl(Object prio, float yaw, float moveFix, int pitch, boolean silent, boolean o) {
      iIlIlllllill(prio, yaw, moveFix, pitch, silent, o, false);
   }

   public static boolean IiIlliIliiIl() {
      return llIIllIlilIIllIl;
   }

   public static float[] Ililllililil(class_243 to, class_243 from) {
      double var2 = from.field_1352 - to.field_1352;
      double var4 = from.field_1351 - to.field_1351;
      double var6 = from.field_1350 - to.field_1350;
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);
      float var10 = (float)Math.toDegrees(Math.atan2(-var2, var6));
      float var11 = (float)Math.toDegrees(Math.atan2(-var4, var8));
      return new float[]{class_3532.method_15393(var10), class_3532.method_15363(var11, -90.0F, 90.0F)};
   }

   public static float Iilllilliill() {
      return liiiIlIliiiiIlIl;
   }

   public static float IIillIiliIil() {
      return IIIIllIllIIIllIl;
   }

   public static void IliIlllilIi(Object silent, float o, float pitch, int prio, boolean yaw) {
      iIlIlllllill(silent, o, pitch, prio, yaw, false, false);
   }

   private ilIiiIiIii() {
   }

   public static void IilliliilIIi(Object silent, class_243 prio, int o, boolean target) {
      if (IIliIlIllIliIlIl.field_1724 != null) {
         float[] var4 = Ililllililil(IIliIlIllIliIlIl.field_1724.method_33571(), prio);
         IliIlllilIi(silent, var4[0], var4[1], o, target);
      }
   }
}
