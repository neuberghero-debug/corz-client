package gg.corz;

import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import net.minecraft.class_9334;

public final class IllIiIillllIiIil {
   public static int IliIlllilIi(int effect, int end, class_6880<class_1291> start) {
      long var6 = 8682554977731927129L;
      class_310 var3 = class_310.method_1551();
      if (var3.field_1724 == null) {
         return -1;
      } else {
         for (long var8 = var6 ^ ((long)effect << 32 ^ var6) & -1L << 32; (int)(var8 >>> 32) < end; var8 += 4294967296L) {
            class_1799 var5 = var3.field_1724.method_31548().method_5438((int)(var8 >>> 32));
            if (var5.method_7909() == class_1802.field_8436 && (start == null || liiiIIllIl(var5, start))) {
               return (int)(var8 >>> 32);
            }
         }

         return -1;
      }
   }

   private static boolean liiiIIllIl(class_1799 effect, class_6880<class_1291> stack) {
      class_1844 var2 = (class_1844)effect.method_58694(class_9334.field_49651);
      if (var2 == null) {
         return false;
      } else {
         for (class_1293 var4 : var2.method_57397()) {
            if (var4.method_5579().equals(stack)) {
               return true;
            }
         }

         return false;
      }
   }

   private IllIiIillllIiIil() {
   }
}
