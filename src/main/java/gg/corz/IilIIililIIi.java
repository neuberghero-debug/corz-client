package gg.corz;

import java.util.function.Predicate;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_310;

public final class IilIIililIIi {
   private static int IIiIiliilIiIilii = -1;
   private static final class_310 lilIiliiiilIilii = class_310.method_1551();

   private IilIIililIIi() {
   }

   public static void liiiIIllIl() {
      if (IIiIiliilIiIilii != -1 && lilIiliiiilIilii.field_1724 != null) {
         class_1661 var0 = lilIiliiiilIilii.field_1724.method_31548();
         if (var0.method_67532() != IIiIiliilIiIilii) {
            var0.method_61496(IIiIiliilIiIilii);
         }

         IIiIiliilIiIilii = -1;
      } else {
         IIiIiliilIiIilii = -1;
      }
   }

   public static int lIiiIiIlilli(class_1792 item) {
      return iliIiiliiiii(itemx -> itemx.method_31574(item));
   }

   public static boolean IilliliilIIi() {
      return IIiIiliilIiIilii != -1;
   }

   public static int iliIiiliiiii(Predicate<class_1799> test) {
      long var4 = -6916318611521621497L;
      if (lilIiliiiilIilii.field_1724 == null) {
         return -1;
      } else {
         class_1661 var1 = lilIiliiiilIilii.field_1724.method_31548();

         for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
            class_1799 var3 = var1.method_5438((int)(var6 >>> 32));
            if (!var3.method_7960() && test.test(var3)) {
               return (int)(var6 >>> 32);
            }
         }

         return -1;
      }
   }

   public static void IliIlllilIi(int slot) {
      if (lilIiliiiilIilii.field_1724 != null && slot >= 0 && slot <= 8) {
         class_1661 var1 = lilIiliiiilIilii.field_1724.method_31548();
         if (IIiIiliilIiIilii == -1) {
            IIiIiliilIiIilii = var1.method_67532();
         }

         if (var1.method_67532() != slot) {
            var1.method_61496(slot);
         }
      }
   }

   public static void iIlIlllllill() {
      IIiIiliilIiIilii = -1;
   }
}
