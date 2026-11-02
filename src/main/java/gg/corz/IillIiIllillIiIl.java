package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public record IillIiIllillIiIl(class_2338 anchor, class_2350 face, class_243 aim, class_2338 cell) {
   private final class_243 IIIiIliIll;
   private final class_2338 lIIiIliIll;
   private final class_2350 iiilIliIll;
   private final class_2338 liilIliIll;

   public class_2338 IliIlllilIi() {
      return this.liilIliIll;
   }

   public IillIiIllillIiIl(class_2338 anchor, class_2350 face, class_243 aim, class_2338 cell) {
      this.liilIliIll = anchor;
      this.iiilIliIll = face;
      this.IIIiIliIll = aim;
      this.lIIiIliIll = cell;
   }

   public class_2350 liiiIIllIl() {
      return this.iiilIliIll;
   }

   public class_243 iIlIlllllill() {
      return this.IIIiIliIll;
   }

   public class_2338 IilliliilIIi() {
      return this.lIIiIliIll;
   }
}
