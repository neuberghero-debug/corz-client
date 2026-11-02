package gg.corz;

import net.minecraft.class_1268;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;

public final class lliiliIiiliiliIi {
   private static final class_310 IIIiIiiIIi = class_310.method_1551();

   public static boolean IliIlllilIi(class_2338 pos) {
      if (IIIiIiiIIi.field_1687 == null) {
         return false;
      } else {
         class_2680 var1 = IIIiIiiIIi.field_1687.method_8320(pos);
         return !var1.method_26215() && !var1.method_45474() ? false : liiiIIllIl(pos) != null;
      }
   }

   public static boolean iIlIlllllill(Object silent, class_2338 priority, boolean pos, boolean owner, int rotate) {
      if (IIIiIiiIIi.field_1724 != null && IIIiIiiIIi.field_1761 != null) {
         class_3965 var5 = liiiIIllIl(priority);
         if (var5 == null) {
            return false;
         } else {
            if (pos) {
               ilIiiIiIii.IilliliilIIi(silent, var5.method_17784(), rotate, owner);
            }

            IIIiIiiIIi.field_1761.method_2896(IIIiIiiIIi.field_1724, class_1268.field_5808, var5);
            return true;
         }
      } else {
         return false;
      }
   }

   public static class_3965 liiiIIllIl(class_2338 pos) {
      long var9 = -2961489361370023122L;
      if (IIIiIiiIIi.field_1687 == null) {
         return null;
      } else {
         class_2350[] var1 = class_2350.values();
         var9 ^= ((long)var1.length << 32 ^ var9) & -1L << 32;

         for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            class_2350 var4 = var1[(int)var12];
            class_2338 var5 = pos.method_10093(var4);
            class_2680 var6 = IIIiIiiIIi.field_1687.method_8320(var5);
            if (!var6.method_26215() && !var6.method_45474()) {
               class_2350 var7 = var4.method_10153();
               class_243 var8 = class_243.method_24953(var5)
                  .method_1031((double)var7.method_10148() * 0.5, (double)var7.method_10164() * 0.5, (double)var7.method_10165() * 0.5);
               return new class_3965(var8, var7, var5, false);
            }
         }

         return null;
      }
   }

   private lliiliIiiliiliIi() {
   }
}
