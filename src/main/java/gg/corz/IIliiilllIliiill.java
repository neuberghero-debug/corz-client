package gg.corz;

public final class IIliiilllIliiill {
   public static float iIlIlllllill(int tickDelta, float ticksLeft) {
      return Math.max(0.0F, (float)tickDelta - ticksLeft) / 20.0F;
   }

   public static float iliIiiliiiii(float fraction) {
      return -90.0F + 180.0F * fraction;
   }

   public static float IIIllIIliIIl(float fraction) {
      return 360.0F * fraction;
   }

   public static String lIiiIiIlilli(int tenths) {
      return tenths / (((~-1734193921 << 11 | ~-1734193921 >>> 21) >>> 15 | (~-1734193921 << 11 | ~-1734193921 >>> 21) << 17) ^ 108387130)
         + IiIlliIliiIl<"IiIlliIliiIl","CNylqVnfrjVrGOBoDBVhAEdKil9QOOqvZlscUic=">()
         + tenths
            % (
               (
                     (~(-624805962 * -654471207) << 7 | ~(-624805962 * -654471207) >>> 25) << 29
                        | (~(-624805962 * -654471207) << 7 | ~(-624805962 * -654471207) >>> 25) >>> 3
                  )
                  ^ 1445055389
            );
   }

   public static float liiiIIllIl(int age, float ticksLeft, int tickDelta) {
      float var3 = (float)(age + tickDelta);
      return var3 <= 0.0F ? 1.0F : Illiiiilllliiiil.lIiiIiIlilli(((float)age + ticksLeft) / var3);
   }

   public static float IlIlllIlilIl(float arcLength, float totalLength) {
      return (1.0F - IliIlllilIi(arcLength / 7.0F)) * IliIlllilIi((totalLength - arcLength) / 2.0F);
   }

   public static float IliIlllilIi(float t) {
      t = Illiiiilllliiiil.lIiiIiIlilli(t);
      return t * t * (3.0F - 2.0F * t);
   }

   private IIliiilllIliiill() {
   }

   public static int IilliliilIIi(float seconds) {
      return Math.max(0, Math.round(seconds * 10.0F));
   }
}
