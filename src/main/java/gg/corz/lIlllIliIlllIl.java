package gg.corz;

import net.minecraft.class_10590;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9362;

public final class lIlllIliIlllIl {
   private static final class_310 IiiIilIllliiIilIll = class_310.method_1551();

   public static int IiIlliIliiIl(int preferred) {
      long var5 = 1313868661083077087L;
      if (IiiIilIllliiIilIll.field_1724 == null) {
         return -1;
      } else {
         class_1661 var1 = IiiIilIllliiIilIll.field_1724.method_31548();
         var5 ^= ((long)var1.method_67532() << 32 ^ var5) & -1L << 32;
         if (iIlIlllllill(var1.method_5438((int)(var5 >>> 32)))) {
            return (int)(var5 >>> 32);
         } else if (class_1661.method_7380(preferred) && iIlIlllllill(var1.method_5438(preferred))) {
            return preferred;
         } else {
            boolean[] var3 = new boolean[9];

            for (var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < 9; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
               var3[(int)var5] = iIlIlllllill(var1.method_5438((int)var5));
            }

            return llIiIililIiIil.liiiIIllIl(var3, (int)(var5 >>> 32));
         }
      }
   }

   public static class_1799 iliIiiliiiii(int slot) {
      return IiiIilIllliiIilIll.field_1724 != null && class_1661.method_7380(slot)
         ? IiiIilIllliiIilIll.field_1724.method_31548().method_5438(slot)
         : class_1799.field_8037;
   }

   public static int lIiiIiIlilli(class_1799 key, class_5321<class_1887> stack) {
      if (key != null && !key.method_7960() && stack != null) {
         class_9304 var2 = (class_9304)key.method_58695(class_9334.field_49633, class_9304.field_49385);

         for (class_6880 var4 : var2.method_57534()) {
            if (var4.method_40225(stack)) {
               return var2.method_57536(var4);
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   public static boolean iIlIlllllill(class_1799 stack) {
      return stack != null && !stack.method_7960() && stack.method_31573(class_3489.field_42611);
   }

   public static boolean liiiIIllIl(class_1799 stack) {
      if (stack != null && !stack.method_7960()) {
         class_10590 var1 = (class_10590)stack.method_58694(class_9334.field_55878);
         return var1 != null && var1.comp_3602() > 0.0F;
      } else {
         return false;
      }
   }

   private lIlllIliIlllIl() {
   }

   public static int IlIlllIlilIl() {
      long var3 = 5281521670200149189L;
      if (IiiIilIllliiIilIll.field_1724 == null) {
         return -1;
      } else {
         class_1661 var0 = IiiIilIllliiIilIll.field_1724.method_31548();
         boolean[] var1 = new boolean[9];

         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
            var1[(int)(var5 >>> 32)] = liiiIIllIl(var0.method_5438((int)(var5 >>> 32)));
         }

         return llIiIililIiIil.liiiIIllIl(var1, var0.method_67532());
      }
   }

   public static boolean IliIlllilIi(class_1799 stack) {
      return stack != null && !stack.method_7960() && stack.method_7909() instanceof class_9362;
   }

   public static boolean IilliliilIIi(class_1799 stack) {
      return iIlIlllllill(stack)
         || IliIlllilIi(stack)
         || liiiIIllIl(stack)
         || stack != null && !stack.method_7960() && stack.method_31573(class_3489.field_42612);
   }

   public static int IIIllIIliIIl(lIiiilliIiiill preference) {
      long var7 = -9010843598707560666L;
      if (IiiIilIllliiIilIll.field_1724 == null) {
         return -1;
      } else {
         class_1661 var1 = IiiIilIllliiIilIll.field_1724.method_31548();

         class_5321 var2 = switch (preference == null ? lIiiilliIiiill.llIilllIiilIilllIi : preference) {
            case IIIilllIilIIilllIi -> class_1893.field_50157;
            case iIIilllIiIlIilllIi -> class_1893.field_50158;
            case llIilllIiilIilllIi -> null;
         };
         boolean[] var3 = new boolean[9];
         int[] var4 = new int[9];

         for (long var9 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var9 >>> 32) < 9; var9 += 4294967296L) {
            class_1799 var6 = var1.method_5438((int)(var9 >>> 32));
            var3[(int)(var9 >>> 32)] = IliIlllilIi(var6);
            var4[(int)(var9 >>> 32)] = var3[(int)(var9 >>> 32)] && var2 != null ? lIiiIiIlilli(var6, var2) : 0;
         }

         return llIiIililIiIil.IliIlllilIi(var3, var4, var1.method_67532());
      }
   }
}
