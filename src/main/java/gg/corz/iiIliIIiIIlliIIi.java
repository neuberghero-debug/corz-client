package gg.corz;

import net.minecraft.class_3965;

record iiIliIIiIIlliIIi(class_3965 hit, float yaw, float pitch) {
   private final float lililliiil;
   private final float iililliiil;
   private final class_3965 Iililliiil;

   public class_3965 IliIlllilIi() {
      return this.Iililliiil;
   }

   private iiIliIIiIIlliIIi(class_3965 hit, float yaw, float pitch) {
      this.Iililliiil = hit;
      this.lililliiil = yaw;
      this.iililliiil = pitch;
   }

   public float liiiIIllIl() {
      return this.lililliiil;
   }

   public float iIlIlllllill() {
      return this.iililliiil;
   }
}
