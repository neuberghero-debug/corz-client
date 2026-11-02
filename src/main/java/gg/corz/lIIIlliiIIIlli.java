package gg.corz;

public record lIIIlliiIIIlli(
   long key,
   int y,
   boolean underPlayer,
   boolean activeMission,
   boolean banned,
   boolean hasTempAbove,
   boolean nearRemainingWork,
   boolean staleOwner,
   int ageTicks,
   boolean reachableTop,
   boolean baseReachable,
   boolean accessRoute
) {
   private final int llllllIIIl;
   private final boolean illlllIIIl;
   private final boolean IIilllIIIl;
   private final boolean IlilllIIIl;
   private final boolean lIilllIIIl;
   private final boolean llilllIIIl;
   private final boolean IillllIIIl;
   private final boolean lillllIIIl;
   private final long IlllllIIIl;
   private final int iIilllIIIl;
   private final boolean iillllIIIl;
   private final boolean ililllIIIl;

   public boolean iIlIlllllill() {
      return this.illlllIIIl;
   }

   public lIIIlliiIIIlli(
      long key,
      int y,
      boolean underPlayer,
      boolean activeMission,
      boolean banned,
      boolean hasTempAbove,
      boolean nearRemainingWork,
      boolean staleOwner,
      int ageTicks,
      boolean reachableTop,
      boolean baseReachable,
      boolean accessRoute
   ) {
      this.IlllllIIIl = key;
      this.llllllIIIl = y;
      this.illlllIIIl = underPlayer;
      this.IillllIIIl = activeMission;
      this.lillllIIIl = banned;
      this.iillllIIIl = hasTempAbove;
      this.IIilllIIIl = nearRemainingWork;
      this.lIilllIIIl = staleOwner;
      this.iIilllIIIl = ageTicks;
      this.IlilllIIIl = reachableTop;
      this.llilllIIIl = baseReachable;
      this.ililllIIIl = accessRoute;
   }

   public boolean IilliliilIIi() {
      return this.IillllIIIl;
   }

   public boolean Illlllllilll() {
      return this.llilllIIIl;
   }

   public long IliIlllilIi() {
      return this.IlllllIIIl;
   }

   public boolean IIlllIlliIll() {
      return this.IlilllIIIl;
   }

   public boolean lIiiIiIlilli() {
      return this.lillllIIIl;
   }

   public boolean IIIllIIliIIl() {
      return this.IIilllIIIl;
   }

   public int liiiIIllIl() {
      return this.llllllIIIl;
   }

   public lIIIlliiIIIlli(
      long banned,
      int baseReachable,
      boolean hasTempAbove,
      boolean reachableTop,
      boolean y,
      boolean ageTicks,
      boolean key,
      boolean nearRemainingWork,
      int underPlayer,
      boolean activeMission,
      boolean staleOwner
   ) {
      this(banned, baseReachable, hasTempAbove, reachableTop, y, ageTicks, key, nearRemainingWork, underPlayer, activeMission, staleOwner, false);
   }

   public boolean Iilllilliill() {
      return this.ililllIIIl;
   }

   public boolean IlIlllIlilIl() {
      return this.lIilllIIIl;
   }

   public int IiIlliIliiIl() {
      return this.iIilllIIIl;
   }

   public boolean iliIiiliiiii() {
      return this.iillllIIIl;
   }
}
