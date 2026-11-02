package gg.corz;

public record liIillIiiiIillIi(
   String activity,
   int tone,
   String destination,
   double remaining,
   double total,
   long etaSeconds,
   double speedBps,
   int altitude,
   int rockets,
   int rocketTarget,
   int xpBottles,
   int durability,
   int durabilityMax
) {
   public static final int illlIIlIIi = 3;
   private final long IlIlIIlIIi;
   private final int liIlIIlIIi;
   public static final liIillIiiiIillIi IillIIlIIi = new liIillIiiiIillIi(
      IIIilIIiiIIi<"IIIilIIiiIIi","6wRNGBU0rBPSBbZrWdgHp7h/0drNbv18AJ/7IeB5ccblvvtY6q5lat0=">(),
      0,
      "",
      Double.longBitsToDouble(-6888106819893984220L ^ 2276718421804975140L),
      Double.longBitsToDouble(-7639168716517287425L ^ 3029858800723417599L),
      -1L,
      0.0,
      0,
      0,
      0,
      0,
      -1,
      -1
   );
   private final double iIIlIIlIIi;
   private final double lIIlIIlIIi;
   private final int iiiIIIlIIi;
   private final int lIllIIlIIi;
   private final int IIllIIlIIi;
   private final int IiIlIIlIIi;
   private final String liiIIIlIIi;
   private final int ilIlIIlIIi;
   private final String IIIlIIlIIi;
   private final double llIlIIlIIi;
   public static final int llllIIlIIi = 2;
   public static final int IlllIIlIIi = 1;
   private final int iiIlIIlIIi;
   public static final int iIllIIlIIi = 0;

   public int IIlllIlliIll() {
      return this.ilIlIIlIIi;
   }

   public int Illlllllilll() {
      return this.IiIlIIlIIi;
   }

   public String iIlIlllllill() {
      return this.liiIIIlIIi;
   }

   public int IilliliilIIi() {
      return this.iiiIIIlIIi;
   }

   public double iliIiiliiiii() {
      return this.lIIlIIlIIi;
   }

   public int Ililllililil() {
      return this.IIllIIlIIi;
   }

   public double IiIlliIliiIl() {
      return this.llIlIIlIIi;
   }

   public float IliIlllilIi() {
      return this.iIIlIIlIIi > Double.longBitsToDouble(-4472815504261262582L ^ -4472815504261262582L)
            && !Double.isInfinite(this.iIIlIIlIIi)
            && this.lIIlIIlIIi >= Double.longBitsToDouble(-5395490900075083597L ^ -5395490900075083597L)
            && !Double.isInfinite(this.lIIlIIlIIi)
         ? (float)Math.max(0.0, Math.min(1.0, 1.0 - this.lIIlIIlIIi / this.iIIlIIlIIi))
         : 0.0F;
   }

   public liIillIiiiIillIi(
      String activity,
      int tone,
      String destination,
      double remaining,
      double total,
      long etaSeconds,
      double speedBps,
      int altitude,
      int rockets,
      int rocketTarget,
      int xpBottles,
      int durability,
      int durabilityMax
   ) {
      this.liiIIIlIIi = activity;
      this.iiiIIIlIIi = tone;
      this.IIIlIIlIIi = destination;
      this.lIIlIIlIIi = remaining;
      this.iIIlIIlIIi = total;
      this.IlIlIIlIIi = etaSeconds;
      this.llIlIIlIIi = speedBps;
      this.ilIlIIlIIi = altitude;
      this.IiIlIIlIIi = rockets;
      this.liIlIIlIIi = rocketTarget;
      this.iiIlIIlIIi = xpBottles;
      this.IIllIIlIIi = durability;
      this.lIllIIlIIi = durabilityMax;
   }

   public String lIiiIiIlilli() {
      return this.IIIlIIlIIi;
   }

   public int IIillIiliIil() {
      return this.iiIlIIlIIi;
   }

   public int Iilllilliill() {
      return this.liIlIIlIIi;
   }

   public long IlIlllIlilIl() {
      return this.IlIlIIlIIi;
   }

   public int Iiilliiliiil() {
      return this.lIllIIlIIi;
   }

   public double IIIllIIliIIl() {
      return this.iIIlIIlIIi;
   }

   public float liiiIIllIl() {
      return this.IIllIIlIIi >= 0 && this.lIllIIlIIi > 0 ? Math.max(0.0F, Math.min(1.0F, (float)this.IIllIIlIIi / (float)this.lIllIIlIIi)) : -1.0F;
   }
}
