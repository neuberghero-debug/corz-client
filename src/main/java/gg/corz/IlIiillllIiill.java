package gg.corz;

public record IlIiillllIiill(
   long tick,
   double gap,
   double theirGap,
   int toCharge,
   float charge,
   double theirLook,
   double awaySpeed,
   double closing,
   int targetReadyIn,
   boolean serverSprinting,
   int pingMs,
   iIlIllllIllIllll cfg,
   boolean targetBlocking,
   double heightDiff,
   long sinceHit,
   boolean lastHitSprint,
   boolean sightBlocked
) {
   private final boolean iIIiiIlIiIlIiiIlIi;
   private final int iilliIlIiIIiliIlIi;
   private final boolean illiiIlIiIiliiIlIi;
   private final double IliliIlIilliliIlIi;
   private final double liiliIlIiiiiliIlIi;
   private final double ililiIlIiIiiliIlIi;
   private final iIlIllllIllIllll IiIiiIlIiliIiiIlIi;
   private final boolean iiIiiIlIiIIliiIlIi;
   private final long iIlliIlIiIllliIlIi;
   private final double lllliIlIiillliIlIi;
   private final int llIiiIlIiilIiiIlIi;
   private final float lIiliIlIiiIiliIlIi;
   private final long IlliiIlIillliiIlIi;
   private final double lIliiIlIiiIliiIlIi;
   private final double IilliIlIililliIlIi;
   private final boolean liliiIlIiiiliiIlIi;
   private final int IIIiiIlIilIIiiIlIi;

   public long IliIlllilIi() {
      return this.iIlliIlIiIllliIlIi;
   }

   public double iliIiiliiiii() {
      return this.IliliIlIilliliIlIi;
   }

   public int IilliliilIIi() {
      return this.iilliIlIiIIiliIlIi;
   }

   public boolean IIlllIlliIll() {
      return this.iIIiiIlIiIlIiiIlIi;
   }

   public iIlIllllIllIllll Iilllilliill() {
      return this.IiIiiIlIiliIiiIlIi;
   }

   public int IiIlliIliiIl() {
      return this.IIIiiIlIilIIiiIlIi;
   }

   public boolean IlIillIiilIi() {
      return this.liliiIlIiiiliiIlIi;
   }

   public boolean IIillIiliIil() {
      return this.iiIiiIlIiIIliiIlIi;
   }

   public double iIlIlllllill() {
      return this.IilliIlIililliIlIi;
   }

   public int Illlllllilll() {
      return this.llIiiIlIiilIiiIlIi;
   }

   public long Iiilliiliiil() {
      return this.IlliiIlIillliiIlIi;
   }

   public double IlIlllIlilIl() {
      return this.liiliIlIiiiiliIlIi;
   }

   public double liiiIIllIl() {
      return this.lllliIlIiillliIlIi;
   }

   public double IIIllIIliIIl() {
      return this.ililiIlIiIiiliIlIi;
   }

   public boolean IIIilIIiiIIi() {
      return this.illiiIlIiIiliiIlIi;
   }

   public double Ililllililil() {
      return this.lIliiIlIiiIliiIlIi;
   }

   public IlIiillllIiill(
      long tick,
      double gap,
      double theirGap,
      int toCharge,
      float charge,
      double theirLook,
      double awaySpeed,
      double closing,
      int targetReadyIn,
      boolean serverSprinting,
      int pingMs,
      iIlIllllIllIllll cfg,
      boolean targetBlocking,
      double heightDiff,
      long sinceHit,
      boolean lastHitSprint,
      boolean sightBlocked
   ) {
      this.iIlliIlIiIllliIlIi = tick;
      this.lllliIlIiillliIlIi = gap;
      this.IilliIlIililliIlIi = theirGap;
      this.iilliIlIiIIiliIlIi = toCharge;
      this.lIiliIlIiiIiliIlIi = charge;
      this.IliliIlIilliliIlIi = theirLook;
      this.ililiIlIiIiiliIlIi = awaySpeed;
      this.liiliIlIiiiiliIlIi = closing;
      this.IIIiiIlIilIIiiIlIi = targetReadyIn;
      this.iIIiiIlIiIlIiiIlIi = serverSprinting;
      this.llIiiIlIiilIiiIlIi = pingMs;
      this.IiIiiIlIiliIiiIlIi = cfg;
      this.iiIiiIlIiIIliiIlIi = targetBlocking;
      this.lIliiIlIiiIliiIlIi = heightDiff;
      this.IlliiIlIillliiIlIi = sinceHit;
      this.illiiIlIiIiliiIlIi = lastHitSprint;
      this.liliiIlIiiiliiIlIi = sightBlocked;
   }

   public float lIiiIiIlilli() {
      return this.lIiliIlIiiIiliIlIi;
   }
}
