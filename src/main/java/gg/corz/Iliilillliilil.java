package gg.corz;

import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import net.minecraft.class_9334;

public final class Iliilillliilil {
   private Iliilillliilil() {
   }

   public static class_1799 lIiiIiIlilli(liIlIliiIlIl look) {
      return look == null ? class_1799.field_8037 : IliIlllilIi(look.IiIIlliIIl(), look.IIiilIiiiIii());
   }

   public static class_1799 IliIlllilIi(class_2960 item, class_2960 potion) {
      return liiiIIllIl(item, potion, false);
   }

   public static class_1799 iliIiiliiiii(liIlIliiIlIl look) {
      return look == null ? class_1799.field_8037 : liiiIIllIl(look.Iilililiiili(), look.IIiilIiiiIii(), look.lIlIliIlIl());
   }

   public static class_1799 iIlIlllllill(liIlIliiIlIl look) {
      return look == null ? class_1799.field_8037 : liiiIIllIl(look.Illillliilli(), look.IIiilIiiiIii(), look.lIlIliIlIl());
   }

   public static class_1799 IilliliilIIi(liIlIliiIlIl look) {
      return look == null ? class_1799.field_8037 : liiiIIllIl(look.llIIlilIIl(), look.IIiilIiiiIii(), look.lIlIliIlIl());
   }

   public static class_1799 liiiIIllIl(class_2960 item, class_2960 potion, boolean glint) {
      if (item == null) {
         return class_1799.field_8037;
      } else {
         class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(item);
         if (var3 != null && var3 != class_1802.field_8162) {
            class_1799 var4 = var3.method_7854();
            if (potion != null && var4.method_57826(class_9334.field_49651)) {
               class_7923.field_41179.method_10223(potion).ifPresent(s -> var4.method_57379(class_9334.field_49651, new class_1844(s)));
            }

            if (glint) {
               var4.method_57379(class_9334.field_49641, true);
            }

            return var4;
         } else {
            return class_1799.field_8037;
         }
      }
   }
}
