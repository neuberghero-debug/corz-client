package gg.corz;

public record iiIIIlIiIIlIIlIi(
   boolean maces, boolean smashOnly, double minFall, lIiiilliIiiill preference, boolean stunSlam, boolean axes, boolean swords, boolean swapBack
) {
   public static final double lliIiiiiil = 1.5;
   private final boolean illIiiiiil;
   private final double lilIiiiiil;
   private final lIiiilliIiiill iilIiiiiil;
   private final boolean iIiIiiiiil;
   private final boolean IilIiiiiil;
   private final boolean IliIiiiiil;
   private final boolean IIiIiiiiil;
   private final boolean lIiIiiiiil;

   public boolean IIIllIIliIIl() {
      return this.lIiIiiiiil;
   }

   public boolean IiIlliIliiIl() {
      return this.IliIiiiiil;
   }

   public iiIIIlIiIIlIIlIi(
      boolean maces, boolean smashOnly, double minFall, lIiiilliIiiill preference, boolean stunSlam, boolean axes, boolean swords, boolean swapBack
   ) {
      if (preference == null) {
         preference = lIiiilliIiiill.llIilllIiilIilllIi;
      }

      if (!(minFall >= 1.5)) {
         minFall = 1.5;
      }

      this.illIiiiiil = maces;
      this.IilIiiiiil = smashOnly;
      this.lilIiiiiil = minFall;
      this.iilIiiiiil = preference;
      this.IIiIiiiiil = stunSlam;
      this.lIiIiiiiil = axes;
      this.iIiIiiiiil = swords;
      this.IliIiiiiil = swapBack;
   }

   public double IilliliilIIi() {
      return this.lilIiiiiil;
   }

   public boolean IlIlllIlilIl() {
      return this.iIiIiiiiil;
   }

   public boolean iliIiiliiiii() {
      return this.IIiIiiiiil;
   }

   public lIiiilliIiiill lIiiIiIlilli() {
      return this.iilIiiiiil;
   }

   public static iiIIIlIiIIlIIlIi IliIlllilIi(boolean swapBack) {
      return new iiIIIlIiIIlIIlIi(false, true, 1.5, lIiiilliIiiill.llIilllIiilIilllIi, false, true, false, swapBack);
   }

   public boolean liiiIIllIl() {
      return this.illIiiiiil;
   }

   public boolean iIlIlllllill() {
      return this.IilIiiiiil;
   }
}
