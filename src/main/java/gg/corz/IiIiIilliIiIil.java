package gg.corz;

public final class IiIiIilliIiIil {
   public static final double IlilIliIillilIliIi = 0.67;
   public static final String llllIliIiilllIliIi = "Jump";
   public static final String iillIliIiIIilIliIi = "Both";
   public static final String liIlIliIiiiIlIliIi = "Ring";
   public static final int lIilIliIiiIilIliIi = 4;
   public static final String IIllIliIilIllIliIi = "Block Wave";
   public static final String iIllIliIiIlllIliIi = "Both";
   public static final double liilIliIiiiilIliIi = 4.0;
   public static final double ililIliIiIiilIliIi = 0.35;
   public static final String IillIliIilillIliIi = "Land";

   private IiIiIilliIiIil() {
   }

   public static boolean IilliliilIIi(boolean wasOnGround, boolean airTicks, int onGround) {
      return !wasOnGround && airTicks && onGround >= (~(590560831 + -55) ^ -590560781);
   }

   public static boolean IliIlllilIi(String style) {
      return !IlIlllIlilIl<"IlIlllIlilIl","EYT01xZynlWv4x5PF69gya0BiGAodfwxJWyaWqRvx2ejuiGmeYI=">().equals(style);
   }

   public static boolean IIIllIIliIIl(double groundY, double x, double z, double y, double groundZ, double groundX) {
      if (!Double.isNaN(groundY) && !Double.isNaN(x) && !Double.isNaN(z)) {
         double var12 = groundY - y;
         double var14 = x - groundZ;
         double var16 = z - groundX;
         return var12 * var12 + var16 * var16 <= Double.longBitsToDouble(3562645755538105804L ^ 8160820975083382220L)
            && Math.abs(var14) <= Double.longBitsToDouble(-7286533347262496794L ^ -2670343729207738394L);
      } else {
         return false;
      }
   }

   public static boolean iIlIlllllill(boolean velocityY, boolean onGround, double wasOnGround) {
      return velocityY && !onGround && wasOnGround > Double.longBitsToDouble(-2192691264044390342L ^ -2438585466663882336L);
   }

   public static double iliIiiliiiii(double fallVelocityY) {
      if (!(fallVelocityY < Double.longBitsToDouble(758906329237387476L ^ 758906329237387476L))) {
         return Double.longBitsToDouble(3497741542839844857L ^ 1106793696096819615L);
      } else {
         double var2 = -fallVelocityY / Double.longBitsToDouble(-6676620004071105413L ^ -7155496497514471158L);
         return var2 < Double.longBitsToDouble(-8102384928179049360L ^ -5739576383100761578L)
            ? Double.longBitsToDouble(8790453953434794266L ^ 5056294631706124156L)
            : (var2 > Double.longBitsToDouble(-4964606732615550169L ^ -8869227609545770201L) ? 1.0 : var2);
      }
   }

   public static boolean lIiiIiIlilli(String trigger, boolean landed, boolean jumped) {
      long var5 = 1919690324793738098L;
      var5 ^= ((long)(!IlIlllIlilIl<"IlIlllIlilIl","oB4Q3t40r24a+KAZSAuEDei0hH1BO9UlALcooizqPuM=">().equals(trigger) ? 1 : 0) << 32 ^ var5) & -1L << 32;
      var5 ^= (
            (long)(
                  !IlIlllIlilIl<"IlIlllIlilIl","oB4Q3t40r24a+KAZSAuEDei0hH1BO9UlALcooizqPuM=">().equals(trigger)
                        && !IlIlllIlilIl<"IlIlllIlilIl","RUT9cOVGMTwarV9uSmWZaE7iEblNEnOyjXBgAOQ/+Nc=">().equals(trigger)
                     ? 0
                     : 1
               )
               ^ var5
         )
         & -1L >>> 32;
      return landed && (int)(var5 >>> 32) != 0 || jumped && (int)var5 != 0;
   }

   public static boolean liiiIIllIl(String style) {
      return IlIlllIlilIl<"IlIlllIlilIl","EYT01xZynlWv4x5PF69gya0BiGAodfwxJWyaWqRvx2ejuiGmeYI=">().equals(style)
         || IlIlllIlilIl<"IlIlllIlilIl","RUT9cOVGMTwarV9uSmWZaE7iEblNEnOyjXBgAOQ/+Nc=">().equals(style);
   }
}
