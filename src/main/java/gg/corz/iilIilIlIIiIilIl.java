package gg.corz;

import net.minecraft.class_1920;
import net.minecraft.class_1944;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2586;
import net.minecraft.class_2680;
import net.minecraft.class_3568;
import net.minecraft.class_3610;
import net.minecraft.class_638;
import net.minecraft.class_6539;
import net.minecraft.class_2338.class_2339;

final class iilIilIlIIiIilIl implements class_1920 {
   final class_2339 liIlillIll = new class_2339();
   private class_2680 IlllillIll;
   private static final class_2680 IiIlillIll = class_2246.field_10124.method_9564();
   private class_638 lIllillIll;
   private final class_2339 IIllillIll;
   final class_2339 iiIlillIll = new class_2339();
   private class_2680 iIllillIll;
   private int llllillIll;

   public class_2680 method_8320(class_2338 pos) {
      if (pos.equals(this.liIlillIll)) {
         return this.iIllillIll;
      } else {
         return pos.equals(this.iiIlillIll) ? this.IlllillIll : IiIlillIll;
      }
   }

   public class_3610 method_8316(class_2338 pos) {
      return this.method_8320(pos).method_26227();
   }

   public int method_23752(class_2338 resolver, class_6539 pos) {
      return this.lIllillIll.method_23752(this.liIlillIll, pos);
   }

   public int method_31605() {
      return this.lIllillIll.method_31605();
   }

   void IliIlllilIi(class_638 world, int y, int state, int cap, class_2680 z, class_2680 x) {
      this.lIllillIll = world;
      this.iIllillIll = z;
      this.IlllillIll = x == null ? IiIlillIll : x;
      this.liIlillIll.method_10103(y, state, cap);
      this.iiIlillIll.method_10103(y, state + 1, cap);
      this.llllillIll = state + 1;
   }

   public float method_24852(class_2350 shaded, boolean direction) {
      return this.lIllillIll.method_24852(shaded, direction);
   }

   public class_3568 method_22336() {
      return this.lIllillIll.method_22336();
   }

   public class_2586 method_8321(class_2338 pos) {
      return null;
   }

   iilIilIlIIiIilIl() {
      this.IIllillIll = new class_2339();
      this.iIllillIll = IiIlillIll;
      this.IlllillIll = IiIlillIll;
   }

   public int method_31607() {
      return this.lIllillIll.method_31607();
   }

   public int method_8314(class_1944 type, class_2338 pos) {
      this.IIllillIll.method_10103(pos.method_10263(), Math.max(pos.method_10264(), this.llllillIll), pos.method_10260());
      return this.lIllillIll.method_8314(type, this.IIllillIll);
   }

   void liiiIIllIl() {
      this.lIllillIll = null;
      this.iIllillIll = IiIlillIll;
      this.IlllillIll = IiIlillIll;
   }
}
