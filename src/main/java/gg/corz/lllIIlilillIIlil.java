package gg.corz;

import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3486;

public final class lllIIlilillIIlil {
   public static boolean IliIlllilIi(class_2680 s) {
      return s.method_26227().method_15767(class_3486.field_15518);
   }

   private lllIIlilillIIlil() {
   }

   public static boolean iIlIlllllill(class_1937 p, class_2338 w) {
      return p.method_8320(w).method_26227().method_15767(class_3486.field_15517);
   }

   public static boolean IIIllIIliIIl(class_1937 w, class_2338 p) {
      return iliIiiliiiii(w, p.method_10074()) && lIiiIiIlilli(w, p) && lIiiIiIlilli(w, p.method_10084());
   }

   public static boolean iliIiiliiiii(class_1937 p, class_2338 w) {
      class_2680 var2 = p.method_8320(w);
      return !IliIlllilIi(var2) && var2.method_26227().method_15769() ? class_2248.method_9501(var2.method_26220(p, w), class_2350.field_11036) : false;
   }

   public static boolean IilliliilIIi(class_1937 p, class_2338 w) {
      class_2680 var2 = p.method_8320(w);
      return !var2.method_26215() && var2.method_26227().method_15769() ? var2.method_26214(p, w) >= 0.0F : false;
   }

   public static boolean liiiIIllIl(class_1937 w, class_2338 p) {
      return IliIlllilIi(w.method_8320(p));
   }

   public static boolean lIiiIiIlilli(class_1937 p, class_2338 w) {
      class_2680 var2 = p.method_8320(w);
      return !IliIlllilIi(var2) && var2.method_26220(p, w).method_1110();
   }

   public static class_243 IlIlllIlilIl(class_2338 d, class_2350 p) {
      return class_243.method_24953(d).method_1031((double)p.method_10148() * 0.5, (double)p.method_10164() * 0.5, (double)p.method_10165() * 0.5);
   }
}
