package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import net.minecraft.class_1269.class_9860;
import net.minecraft.class_1269.class_9861;

public final class IiIiiiilliIiiiil {
   public static class_3965 liiiIIllIl(class_2338 reach, class_2350[] block, class_2350 yaw, double side, float pitch, float faces) {
      class_310 var7 = class_310.method_1551();
      class_746 var8 = var7.field_1724;
      return var8 != null && var7.field_1687 != null && reach != null && block != null
         ? lllIliIlillIliIl.Iliilliiilii(reach, block, yaw, var8.method_33571(), pitch, faces, side)
         : null;
   }

   public static class_3965 IliIlllilIi(class_2338 reach, class_2350 block, double pitch, float yaw, float side) {
      class_310 var6 = class_310.method_1551();
      class_746 var7 = var6.field_1724;
      if (var7 != null && var6.field_1687 != null && reach != null) {
         class_243 var8 = var7.method_33571();
         return lllIliIlillIliIl.IIiilIiiiIii(lllIliIlillIliIl.Iilililiiili(var8, yaw, side), reach, block, var8, pitch);
      } else {
         return null;
      }
   }

   public static class_1269 iliIiiliiiii(class_3965 hit) {
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      if (var2 != null && var1.field_1761 != null && hit != null) {
         class_1269 var3 = var1.field_1761.method_2896(var2, class_1268.field_5808, hit);
         if (var3 instanceof class_9860 var4 && var4.comp_2909() == class_9861.field_52427) {
            var2.method_6104(class_1268.field_5808);
         }

         return var3;
      } else {
         return class_1269.field_5811;
      }
   }

   public static class_3965 IilliliilIIi(class_3965 cap, class_2350[] core, class_2350 pitch, double reach, float near, float faces, class_2338 side, float yaw) {
      class_310 var9 = class_310.method_1551();
      class_746 var10 = var9.field_1724;
      if (cap != null && side != null && var10 != null && yaw > 0.0F) {
         class_243 var11 = var10.method_33571();
         float[] var12 = ilIiiIiIii.Ililllililil(var11, class_243.method_24953(side));
         class_3965 var13 = liiiIIllIl(cap.method_17777(), core, pitch, reach, var12[0], var12[1]);
         if (var13 == null) {
            return cap;
         } else {
            return lIiiIiIlilli(var11, var13, near, faces, yaw) <= lIiiIiIlilli(var11, cap, near, faces, yaw) ? var13 : cap;
         }
      } else {
         return cap;
      }
   }

   private IiIiiiilliIiiiil() {
   }

   static double lIiiIiIlilli(class_243 h, class_3965 eye, float yaw, float pitch, float cap) {
      float[] var5 = ilIiiIiIii.Ililllililil(h, eye.method_17784());
      return Math.ceil(liiIIliliiiIIlil.Iilllilliill(yaw, pitch, var5[0], var5[1]) / (double)cap);
   }

   public static class_3965 iIlIlllllill(class_2338 pitch, double block, float reach, float yaw) {
      long var20 = -7090317189765967968L;
      class_3965 var5 = liiiIIllIl(pitch, class_2350.values(), null, block, reach, yaw);
      if (var5 != null) {
         return var5;
      } else {
         class_310 var6 = class_310.method_1551();
         class_746 var7 = var6.field_1724;
         if (var7 != null && var6.field_1687 != null && pitch != null) {
            class_243 var8 = var7.method_33571();
            class_3965 var9 = null;
            double var10 = Double.MAX_VALUE;
            class_2350[] var12 = class_2350.values();
            var20 ^= ((long)var12.length << 32 ^ var20) & -1L << 32;

            for (long var23 = var20 ^ (0L ^ var20) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
               class_2350 var15 = var12[(int)var23];
               class_3965 var16 = liiiIIllIl(pitch, new class_2350[]{var15}, null, block, reach, yaw);
               if (var16 != null) {
                  float[] var17 = ilIiiIiIii.Ililllililil(var8, var16.method_17784());
                  double var18 = liiIIliliiiIIlil.Iilllilliill(reach, yaw, var17[0], var17[1]);
                  if (var18 < var10) {
                     var10 = var18;
                     var9 = var16;
                  }
               }
            }

            return var9;
         } else {
            return null;
         }
      }
   }
}
