package gg.corz;

import java.util.List;
import java.util.function.BiFunction;
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_742;

public final class iIiIiliIliIili {
   private static boolean iilliiIIIl;
   private static BiFunction<class_742, class_1799, iiIiliiIIlilii> IIiliiIIIl = iIiIiliIliIili.lilliiIIIl;
   private static final BiFunction<class_742, class_1799, iiIiliiIIlilii> lilliiIIIl = (stack, player) -> iiIiliiIIlilii.lIIllliIIl;

   public static void Iiiiliiiiiii(class_742 finish, class_4587 player, class_11659 glint, int matrices, lIIllIiiIIllIi light, boolean queue) {
      IIililIili.iIlIlllllill(finish, player, glint, matrices, light, queue);
   }

   public static List<iIiiiilIliiiil> Illillliilli() {
      return lliIIililiIIil.IiIlliIliiIl();
   }

   static iiIiliiIIlilii lIiiIiIlilli() {
      class_310 var0 = class_310.method_1551();
      return var0.field_1724 == null ? null : IilliliilIIi(var0.field_1724, var0.field_1724.method_6047());
   }

   public static void IliIlllilIi(boolean value) {
      iilliiIIIl = value;
      if (value) {
         iIllliIlllli.liiiIIllIl();
      } else {
         lliIIililiIIil.IliIlllilIi();
      }
   }

   public static String Iiilliiliiil() {
      return lliIIililiIIil.IilliliilIIi();
   }

   public static boolean Ililllililil() {
      return lliIIililiIIil.IlIlllIlilIl();
   }

   public static boolean IIlllIlliIll(iiIiliiIIlilii knife) {
      return iIllliIlllli.IlIlllIlilIl(knife);
   }

   public static void iIlIlllllill(BiFunction<class_742, class_1799, iiIiliiIIlilii> value) {
      IIiliiIIIl = value == null ? lilliiIIIl : value;
   }

   public static float IIlilIliiIli() {
      return lliIIililiIIil.IIIllIIliIIl();
   }

   public static float IiIiliIiiiIi() {
      return lliIIililiIIil.iliIiiliiiii();
   }

   public static void Iilllilliill(boolean inspectPressed) {
      if (iilliiIIIl) {
         iIllliIlllli.liiiIIllIl();
         iiIiliiIIlilii var1 = lIiiIiIlilli();
         if (var1 != null) {
            iIllliIlllli.iIlIlllllill(var1);
         }
      }

      lliIIililiIIil.IIlllIlliIll(class_310.method_1551(), inspectPressed);
   }

   public static void IIillIiliIil() {
      lliIIililiIIil.IIillIiliIil();
   }

   public static String IIIllIIliIIl() {
      return iIllliIlllli.IiIlliIliiIl();
   }

   public static void Iilililiiili() {
      lliIIililiIIil.IliIlllilIi();
      iIllliIlllli.Illlllllilll();
      if (iilliiIIIl) {
         iIllliIlllli.liiiIIllIl();
      }
   }

   public static boolean IIIIllIIIl(class_1309 entity, class_1268 hand) {
      return lliIIililiIIil.Ililllililil(entity, hand);
   }

   public static boolean liiiIIllIl() {
      return iilliiIIIl;
   }

   public static iiIiliiIIlilii IIIilIIiiIIi() {
      return lliIIililiIIil.iIlIlllllill();
   }

   public static boolean IIiilIiiiIii(class_742 hand, class_1268 player, class_1799 stack) {
      return IIililIili.IliIlllilIi(hand, player, stack);
   }

   static iiIiliiIIlilii IilliliilIIi(class_742 stack, class_1799 player) {
      return stack != null && player != null ? IIiliiIIIl.apply(stack, player) : null;
   }

   private iIiIiliIliIili() {
   }

   public static long IlIillIiilIi() {
      return lliIIililiIIil.lIiiIiIlilli();
   }

   public static void Iliilliiilii(class_742 queue, class_4587 matrices, class_11659 light, int player) {
      IIililIili.liiiIIllIl(queue, matrices, light, player);
   }

   public static String IlIlllIlilIl(iiIiliiIIlilii knife) {
      return iIllliIlllli.IIlllIlliIll(knife);
   }

   public static boolean IiIlliIliiIl() {
      return iIllliIlllli.IIIllIIliIIl();
   }

   public static void iliIiiliiiii(iiIiliiIIlilii knife) {
      iIllliIlllli.iIlIlllllill(knife);
   }

   public static boolean Illlllllilll(iiIiliiIIlilii knife) {
      iIllliIlllli.iIlIlllllill(knife);
      return iIllliIlllli.iliIiiliiiii(knife) != null;
   }
}
