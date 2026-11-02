package gg.corz;

import net.minecraft.class_243;

public record iIiIiilIliIiil(float yaw, float pitch, class_243 landing, int flightTicks, double acceptRadius, long validUntil, String why) {
   private final float liiiliIliiiiiliIli;
   private final class_243 iIIIiiIliIlIIiiIli;
   private final long iiIIiiIliIIlIiiIli;
   private final String lIlIiiIliiIlIiiIli;
   private final double IiIIiiIliliIIiiIli;
   private final int llIIiiIliilIIiiIli;
   private final float IIIIiiIlilIIIiiIli;

   public float liiiIIllIl() {
      return this.IIIIiiIlilIIIiiIli;
   }

   public iIiIiilIliIiil(float yaw, float pitch, class_243 landing, int flightTicks, double acceptRadius, long validUntil, String why) {
      this.liiiliIliiiiiliIli = yaw;
      this.IIIIiiIlilIIIiiIli = pitch;
      this.iIIIiiIliIlIIiiIli = landing;
      this.llIIiiIliilIIiiIli = flightTicks;
      this.IiIIiiIliliIIiiIli = acceptRadius;
      this.iiIIiiIliIIlIiiIli = validUntil;
      this.lIlIiiIliiIlIiiIli = why;
   }

   public double lIiiIiIlilli() {
      return this.IiIIiiIliliIIiiIli;
   }

   public int IilliliilIIi() {
      return this.llIIiiIliilIIiiIli;
   }

   public float IliIlllilIi() {
      return this.liiiliIliiiiiliIli;
   }

   public String IIIllIIliIIl() {
      return this.lIlIiiIliiIlIiiIli;
   }

   public long iliIiiliiiii() {
      return this.iiIIiiIliIIlIiiIli;
   }

   public class_243 iIlIlllllill() {
      return this.iIIIiiIliIlIIiiIli;
   }
}
