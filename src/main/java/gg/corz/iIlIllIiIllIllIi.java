package gg.corz;

public record iIlIllIiIllIllIi(
   long nowMs,
   long tick,
   Object sessionId,
   Object worldId,
   Object playerId,
   boolean alive,
   boolean screenOpen,
   boolean freecam,
   long lastSetbackMs,
   boolean outboundHeld,
   boolean inboundHeld,
   boolean timeStale,
   double tps,
   boolean userOverride,
   boolean otherMacro,
   String otherBot,
   String conflict,
   boolean creative,
   boolean spectator,
   boolean riding,
   int foreignTurnStreak
) {
   private final String llIIIiIIIi;
   private final String ilIIIiIIIi;
   private final Object IIiiilIIIi;
   private final boolean lliiilIIIi;
   private final long iiliilIIIi;
   private final int IIlIIiIIIi;
   private final double lIIIIiIIIi;
   private final Object iIiiilIIIi;
   private final boolean IiIIIiIIIi;
   private final boolean iliiilIIIi;
   private final boolean liiiilIIIi;
   private final boolean IlIIIiIIIi;
   private final boolean iiiiilIIIi;
   private final boolean IliiilIIIi;
   private final boolean iIIIIiIIIi;
   private final boolean IIIIIiIIIi;
   private final long IiiiilIIIi;
   private final boolean iiIIIiIIIi;
   private final boolean liIIIiIIIi;
   private final Object lIiiilIIIi;
   private final long liliilIIIi;

   public boolean IIIllIIliIIl() {
      return this.lliiilIIIi;
   }

   public boolean IIlilIliiIli() {
      return this.liIIIiIIIi;
   }

   public long IliIlllilIi() {
      return this.liliilIIIi;
   }

   public Object iIlIlllllill() {
      return this.IIiiilIIIi;
   }

   public iIlIllIiIllIllIi(
      long nowMs,
      long tick,
      Object sessionId,
      Object worldId,
      Object playerId,
      boolean alive,
      boolean screenOpen,
      boolean freecam,
      long lastSetbackMs,
      boolean outboundHeld,
      boolean inboundHeld,
      boolean timeStale,
      double tps,
      boolean userOverride,
      boolean otherMacro,
      String otherBot,
      String conflict,
      boolean creative,
      boolean spectator,
      boolean riding,
      int foreignTurnStreak
   ) {
      this.liliilIIIi = nowMs;
      this.iiliilIIIi = tick;
      this.IIiiilIIIi = sessionId;
      this.lIiiilIIIi = worldId;
      this.iIiiilIIIi = playerId;
      this.IliiilIIIi = alive;
      this.lliiilIIIi = screenOpen;
      this.iliiilIIIi = freecam;
      this.IiiiilIIIi = lastSetbackMs;
      this.liiiilIIIi = outboundHeld;
      this.iiiiilIIIi = inboundHeld;
      this.IIIIIiIIIi = timeStale;
      this.lIIIIiIIIi = tps;
      this.iIIIIiIIIi = userOverride;
      this.IlIIIiIIIi = otherMacro;
      this.llIIIiIIIi = otherBot;
      this.ilIIIiIIIi = conflict;
      this.IiIIIiIIIi = creative;
      this.liIIIiIIIi = spectator;
      this.iiIIIiIIIi = riding;
      this.IIlIIiIIIi = foreignTurnStreak;
   }

   public Object IilliliilIIi() {
      return this.lIiiilIIIi;
   }

   public double IIillIiliIil() {
      return this.lIIIIiIIIi;
   }

   public boolean Iiilliiliiil() {
      return this.IlIIIiIIIi;
   }

   public long IiIlliIliiIl() {
      return this.IiiiilIIIi;
   }

   public Object lIiiIiIlilli() {
      return this.iIiiilIIIi;
   }

   public boolean Ililllililil() {
      return this.iIIIIiIIIi;
   }

   public boolean IlIlllIlilIl() {
      return this.iliiilIIIi;
   }

   public boolean Illlllllilll() {
      return this.iiiiilIIIi;
   }

   public String IlIillIiilIi() {
      return this.ilIIIiIIIi;
   }

   public String IIIilIIiiIIi() {
      return this.llIIIiIIIi;
   }

   public boolean IiIiliIiiiIi() {
      return this.IiIIIiIIIi;
   }

   public long liiiIIllIl() {
      return this.iiliilIIIi;
   }

   public boolean iliIiiliiiii() {
      return this.IliiilIIIi;
   }

   public boolean IIlllIlliIll() {
      return this.liiiilIIIi;
   }

   public boolean Illillliilli() {
      return this.iiIIIiIIIi;
   }

   public int Iilililiiili() {
      return this.IIlIIiIIIi;
   }

   public boolean Iilllilliill() {
      return this.IIIIIiIIIi;
   }
}
