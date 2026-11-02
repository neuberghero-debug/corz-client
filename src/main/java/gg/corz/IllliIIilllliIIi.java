package gg.corz;

import net.minecraft.class_1058;
import net.minecraft.class_2246;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_324;
import net.minecraft.class_773;

public record IllliIIilllliIIi(class_773 models, class_324 colors, class_1058 water, class_1058 lava, iliIiiIiIiiIiiIi chests) {
   private final iliIiiIiIiiIiiIi IiIIiliiil;
   private final class_773 iIIIiliiil;
   private final class_1058 llIIiliiil;
   private final class_1058 ilIIiliiil;
   private final class_324 IlIIiliiil;

   private static class_1058 liiiIIllIl(class_773 state, class_2680 models) {
      try {
         return state.method_3339(models);
      } catch (Throwable var3) {
         return null;
      }
   }

   public static IllliIIilllliIIi IliIlllilIi() {
      class_310 var0 = class_310.method_1551();
      class_773 var1 = var0.method_1541().method_3351();

      iliIiiIiIiiIiiIi var2;
      try {
         var2 = iliIiiIiIiiIiiIi.IliIlllilIi(var0);
      } catch (Throwable var4) {
         var2 = null;
      }

      return new IllliIIilllliIIi(
         var1, var0.method_1505(), liiiIIllIl(var1, class_2246.field_10382.method_9564()), liiiIIllIl(var1, class_2246.field_10164.method_9564()), var2
      );
   }

   public class_773 iIlIlllllill() {
      return this.iIIIiliiil;
   }

   public class_324 IilliliilIIi() {
      return this.IlIIiliiil;
   }

   public class_1058 iliIiiliiiii() {
      return this.ilIIiliiil;
   }

   public iliIiiIiIiiIiiIi IIIllIIliIIl() {
      return this.IiIIiliiil;
   }

   public IllliIIilllliIIi(class_773 models, class_324 colors, class_1058 water, class_1058 lava, iliIiiIiIiiIiiIi chests) {
      this.iIIIiliiil = models;
      this.IlIIiliiil = colors;
      this.llIIiliiil = water;
      this.ilIIiliiil = lava;
      this.IiIIiliiil = chests;
   }

   public class_1058 lIiiIiIlilli() {
      return this.llIIiliiil;
   }
}
