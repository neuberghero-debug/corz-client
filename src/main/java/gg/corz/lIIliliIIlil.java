package gg.corz;

public final class lIIliliIIlil {
   public static final float liiIilliiiiIilli = 0.6F;
   public static final float iliIilliIiiIilli = 1.6F;
   public static final float IIIlillilIIlilli = 35.0F;

   public static float IliIlllilIi(double dx) {
      return (float)(-dx * 1.6F);
   }

   private lIIliliIIlil() {
   }

   public static float iIlIlllllill(float yaw) {
      return yaw % 360.0F;
   }

   public static float liiiIIllIl(double dy) {
      return (float)(dy * 0.6F);
   }

   public static float IilliliilIIi(float pitch) {
      return pitch < -35.0F ? -35.0F : (pitch > 35.0F ? 35.0F : pitch);
   }
}
