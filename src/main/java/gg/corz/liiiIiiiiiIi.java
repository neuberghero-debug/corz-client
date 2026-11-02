package gg.corz;

public record liiiIiiiiiIi(
   boolean threat, boolean rtpReady, boolean rtpAwaiting, boolean warmup, double nearest, long cooldownLeftMs, boolean logoutOn, long sincePlayerHitMs
) {
   private final boolean IIlIilIIllIlIilIIl;
   private final double lllIilIIlillIilIIl;
   private final long lIiIilIIliIiIilIIl;
   private final boolean ilIIilIIlIiIIilIIl;
   private final boolean iilIilIIlIIiIilIIl;
   private final boolean iIlIilIIlIllIilIIl;
   private final boolean liIIilIIliiIIilIIl;
   private final long IilIilIIllilIilIIl;

   public boolean iIlIlllllill() {
      return this.IIlIilIIllIlIilIIl;
   }

   public boolean liiiIIllIl() {
      return this.liIIilIIliiIIilIIl;
   }

   public liiiIiiiiiIi(
      boolean threat, boolean rtpReady, boolean rtpAwaiting, boolean warmup, double nearest, long cooldownLeftMs, boolean logoutOn, long sincePlayerHitMs
   ) {
      this.ilIIilIIlIiIIilIIl = threat;
      this.liIIilIIliiIIilIIl = rtpReady;
      this.IIlIilIIllIlIilIIl = rtpAwaiting;
      this.iIlIilIIlIllIilIIl = warmup;
      this.lllIilIIlillIilIIl = nearest;
      this.IilIilIIllilIilIIl = cooldownLeftMs;
      this.iilIilIIlIIiIilIIl = logoutOn;
      this.lIiIilIIliIiIilIIl = sincePlayerHitMs;
   }

   public long IlIlllIlilIl() {
      return this.lIiIilIIliIiIilIIl;
   }

   public boolean IliIlllilIi() {
      return this.ilIIilIIlIiIIilIIl;
   }

   public double lIiiIiIlilli() {
      return this.lllIilIIlillIilIIl;
   }

   public boolean IilliliilIIi() {
      return this.iIlIilIIlIllIilIIl;
   }

   public boolean IIIllIIliIIl() {
      return this.iilIilIIlIIiIilIIl;
   }

   public long iliIiiliiiii() {
      return this.IilIilIIllilIilIIl;
   }
}
