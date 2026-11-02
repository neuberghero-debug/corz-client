package gg.corz;

import net.minecraft.class_243;

public record IiiIilIiliiIilIi(float yaw, float pitch, class_243 landing, String why) {
   private final class_243 lIlllllIIi;
   private final float iiIllllIIi;
   private final float IIlllllIIi;
   private final String iIlllllIIi;

   public IiiIilIiliiIilIi(float yaw, float pitch, class_243 landing, String why) {
      this.iiIllllIIi = yaw;
      this.IIlllllIIi = pitch;
      this.lIlllllIIi = landing;
      this.iIlllllIIi = why;
   }

   public String IilliliilIIi() {
      return this.iIlllllIIi;
   }

   public class_243 iIlIlllllill() {
      return this.lIlllllIIi;
   }

   public float IliIlllilIi() {
      return this.iiIllllIIi;
   }

   public float liiiIIllIl() {
      return this.IIlllllIIi;
   }
}
