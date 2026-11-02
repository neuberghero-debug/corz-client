package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;

record llIIilllilIIilll(class_2338 pos, class_243 center, class_238 box, class_243 top, boolean build, float targetDamage) {
   private final class_2338 iIlIIIlill;
   private final class_243 illIIIlill;
   private final boolean IilIIIlill;
   private final class_243 IllIIIlill;
   private final float lilIIIlill;
   private final class_238 lllIIIlill;

   public class_243 liiiIIllIl() {
      return this.IllIIIlill;
   }

   public class_2338 IliIlllilIi() {
      return this.iIlIIIlill;
   }

   public boolean lIiiIiIlilli() {
      return this.IilIIIlill;
   }

   public float iliIiiliiiii() {
      return this.lilIIIlill;
   }

   public class_238 iIlIlllllill() {
      return this.lllIIIlill;
   }

   public class_243 IilliliilIIi() {
      return this.illIIIlill;
   }

   llIIilllilIIilll(class_2338 pos, class_243 center, class_238 box, class_243 top, boolean build, float targetDamage) {
      this.iIlIIIlill = pos;
      this.IllIIIlill = center;
      this.lllIIIlill = box;
      this.illIIIlill = top;
      this.IilIIIlill = build;
      this.lilIIIlill = targetDamage;
   }
}
