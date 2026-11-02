package gg.corz;

import java.util.Map;

public record IIllIIllIllIIl(
   long tick,
   lliiilIiiliiilIi self,
   liiilIiliiiilIil target,
   int enemiesWithin8,
   IlIillllIill threat,
   int targetReadyIn,
   int selfClosedFor,
   boolean nether,
   llilIlIlililIlIl cfg,
   Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> options,
   iIlIIIIiIllIIIIi committed,
   iIlIIIIiIllIIIIi lastLane,
   int ticksSinceOwnPop,
   int stallWindows,
   boolean lootNearby,
   double nearestEnemy,
   boolean pearlIncoming,
   IiIililiIili lastPosture,
   iiliiiIiIIiiiiIi combo,
   float selfSpent,
   IIIilIIiiIIi anchor,
   iiliiiIiIIiiiiIi breach,
   boolean popPending
) {
   private final llilIlIlililIlIl IliiIliIllliiIliIl;
   private final int iIliIliIlIlliIliIl;
   private final float lilIlliIliilIlliIl;
   private final long ilIiIliIlIiIiIliIl;
   private final int llIIlliIlilIIlliIl;
   private final Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> iliiIliIlIiiiIliIl;
   private final int IiliIliIlliliIliIl;
   private final boolean lIlIlliIliIlIlliIl;
   private final double iiIIlliIlIIlIlliIl;
   private final IIIilIIiiIIi IIiIlliIllIiIlliIl;
   private final iiliiiIiIIiiiiIi illIlliIlIilIlliIl;
   private final iiliiiIiIIiiiiIi iIiIlliIlIliIlliIl;
   private final boolean lliIlliIliliIlliIl;
   private final iIlIIIIiIllIIIIi IIIIlliIllIIIlliIl;
   private final boolean lIiiIliIliIiiIliIl;
   private final liiilIiliiiilIil IIliIliIllIliIliIl;
   private final int iIIIlliIlIlIIlliIl;
   private final boolean IiIIlliIlliIIlliIl;
   private final IiIililiIili IllIlliIllllIlliIl;
   private final iIlIIIIiIllIIIIi liiiIliIliiiiIliIl;
   private final IlIillllIill llliIliIlilliIliIl;
   private final lliiilIiiliiilIi liIiIliIliiIiIliIl;
   private final int iiliIliIlIIiiIliIl;

   public ilIiliilIiIiliil IliIlllilIi() {
      IlIIIlilllIIIlil var1 = this.IliiIliIllliiIliIl != null && this.IliiIliIllliiIliIl.IliIlllilIi() != null
         ? this.IliiIliIllliiIliIl.IliIlllilIi()
         : IlIIIlilllIIIlil.iliIiilIil;
      if (this.liIiIliIliiIiIliIl == null) {
         return ilIiliilIiIiliil.IiIlIIIiil;
      } else {
         return var1 == IlIIIlilllIIIlil.iliIiilIil
            ? ilIiliilIiIiliil.IilliliilIIi(
               this.liIiIliIliiIiIliIl.Iilllilliill() && this.liIiIliIliiIiIliIl.IIillIiliIil() >= 1 && !this.lliIlliIliliIlliIl && this.iIIIlliIlIlIIlliIl > 2,
               this.liIiIliIliiIiIliIl.IIillIiliIil(),
               this.liIiIliIliiIiIliIl.IliIlllilIi(),
               this.liiiIIllIl()
            )
            : ilIiliilIiIiliil.iIlIlllllill(
               var1 == IlIIIlilllIIIlil.iliIiilIil,
               this.liIiIliIliiIiIliIl.Iilllilliill(),
               this.liIiIliIliiIiIliIl.IIillIiliIil(),
               this.liIiIliIliiIiIliIl.IliIlllilIi(),
               this.lliIlliIliliIlliIl || this.iIIIlliIlIlIIlliIl <= 5,
               this.liiiIIllIl()
            );
      }
   }

   public iIlIIIIiIllIIIIi IlIillIiilIi() {
      return this.liiiIliIliiiiIliIl;
   }

   public boolean Iilililiiili() {
      return this.IiIIlliIlliIIlliIl;
   }

   public int Iilllilliill() {
      return this.IiliIliIlliliIliIl;
   }

   public IIllIIllIllIIl lIiiIiIlilli(iiliiiIiIIiiiiIi c) {
      return new IIllIIllIllIIl(
         this.ilIiIliIlIiIiIliIl,
         this.liIiIliIliiIiIliIl,
         this.IIliIliIllIliIliIl,
         this.iIliIliIlIlliIliIl,
         this.llliIliIlilliIliIl,
         this.IiliIliIlliliIliIl,
         this.iiliIliIlIIiiIliIl,
         this.lIiiIliIliIiiIliIl,
         this.IliiIliIllliiIliIl,
         this.iliiIliIlIiiiIliIl,
         this.liiiIliIliiiiIliIl,
         this.IIIIlliIllIIIlliIl,
         this.iIIIlliIlIlIIlliIl,
         this.llIIlliIlilIIlliIl,
         this.IiIIlliIlliIIlliIl,
         this.iiIIlliIlIIlIlliIl,
         this.lIlIlliIliIlIlliIl,
         this.IllIlliIllllIlliIl,
         c == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : c,
         this.lilIlliIliilIlliIl,
         this.IIiIlliIllIiIlliIl,
         this.iIiIlliIlIliIlliIl,
         this.lliIlliIliliIlliIl
      );
   }

   public float iIIIlIlIIl() {
      return this.lilIlliIliilIlliIl;
   }

   public double IIiilIiiiIii() {
      return this.iiIIlliIlIIlIlliIl;
   }

   public int IIlilIliiIli() {
      return this.iIIIlliIlIlIIlliIl;
   }

   public boolean iiIIlIIlIl() {
      return this.lliIlliIliliIlliIl;
   }

   public boolean Ililllililil() {
      return this.lIiiIliIliIiiIliIl;
   }

   public int IIillIiliIil() {
      return this.iiliIliIlIIiiIliIl;
   }

   public IiIililiIili Iiiiliiiiiii() {
      return this.IllIlliIllllIlliIl;
   }

   public Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> IIIilIIiiIIi() {
      return this.iliiIliIlIiiiIliIl;
   }

   public static boolean iIlIlllllill(lliiilIiiliiilIi t, liiilIiliiiilIil self) {
      return t != null && self != null && t.llIIlilIIl() > self.iiIIlIIlIl();
   }

   public liiilIiliiiilIil IiIlliIliiIl() {
      return this.IIliIliIllIliIliIl;
   }

   public IIllIIllIllIIl(
      long threat,
      lliiilIiiliiilIi lastLane,
      liiilIiliiiilIil tick,
      int lastPosture,
      IlIillllIill cfg,
      int lootNearby,
      int nearestEnemy,
      boolean committed,
      llilIlIlililIlIl target,
      Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> pearlIncoming,
      iIlIIIIiIllIIIIi ticksSinceOwnPop,
      iIlIIIIiIllIIIIi self,
      int combo,
      int options,
      boolean selfClosedFor,
      double stallWindows,
      boolean targetReadyIn,
      IiIililiIili nether,
      iiliiiIiIIiiiiIi enemiesWithin8
   ) {
      this(
         threat,
         lastLane,
         tick,
         lastPosture,
         cfg,
         lootNearby,
         nearestEnemy,
         committed,
         target,
         pearlIncoming,
         ticksSinceOwnPop,
         self,
         combo,
         options,
         selfClosedFor,
         stallWindows,
         targetReadyIn,
         nether,
         enemiesWithin8,
         0.0F
      );
   }

   public llilIlIlililIlIl Iiilliiliiil() {
      return this.IliiIliIllliiIliIl;
   }

   public IIllIIllIllIIl iliIiiliiiii(iiliiiIiIIiiiiIi b) {
      return new IIllIIllIllIIl(
         this.ilIiIliIlIiIiIliIl,
         this.liIiIliIliiIiIliIl,
         this.IIliIliIllIliIliIl,
         this.iIliIliIlIlliIliIl,
         this.llliIliIlilliIliIl,
         this.IiliIliIlliliIliIl,
         this.iiliIliIlIIiiIliIl,
         this.lIiiIliIliIiiIliIl,
         this.IliiIliIllliiIliIl,
         this.iliiIliIlIiiiIliIl,
         this.liiiIliIliiiiIliIl,
         this.IIIIlliIllIIIlliIl,
         this.iIIIlliIlIlIIlliIl,
         this.llIIlliIlilIIlliIl,
         this.IiIIlliIlliIIlliIl,
         this.iiIIlliIlIIlIlliIl,
         this.lIlIlliIliIlIlliIl,
         this.IllIlliIllllIlliIl,
         this.illIlliIlIilIlliIl,
         this.lilIlliIliilIlliIl,
         this.IIiIlliIllIiIlliIl,
         b == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : b,
         this.lliIlliIliliIlliIl
      );
   }

   public boolean Iliilliiilii() {
      return this.lIlIlliIliIlIlliIl;
   }

   public iiliiiIiIIiiiiIi IIIIllIIIl() {
      return this.illIlliIlIilIlliIl;
   }

   public lliiilIiiliiilIi IlIlllIlilIl() {
      return this.liIiIliIliiIiIliIl;
   }

   public iiliiiIiIIiiiiIi IiIIlliIIl() {
      return this.iIiIlliIlIliIlliIl;
   }

   public IIllIIllIllIIl(
      long pearlIncoming,
      lliiilIiiliiilIi options,
      liiilIiliiiilIil cfg,
      int nether,
      IlIillllIill self,
      int lastPosture,
      int selfClosedFor,
      boolean targetReadyIn,
      llilIlIlililIlIl lootNearby,
      Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> target,
      iIlIIIIiIllIIIIi tick,
      iIlIIIIiIllIIIIi committed,
      int enemiesWithin8,
      int stallWindows,
      boolean combo,
      double nearestEnemy,
      boolean ticksSinceOwnPop,
      IiIililiIili lastLane,
      iiliiiIiIIiiiiIi threat,
      float selfSpent
   ) {
      this(
         pearlIncoming,
         options,
         cfg,
         nether,
         self,
         lastPosture,
         selfClosedFor,
         targetReadyIn,
         lootNearby,
         target,
         tick,
         committed,
         enemiesWithin8,
         stallWindows,
         combo,
         nearestEnemy,
         ticksSinceOwnPop,
         lastLane,
         threat,
         selfSpent,
         IIIilIIiiIIi.IIIllllIIlll,
         iiliiiIiIIiiiiIi.iIiliIIlIi
      );
   }

   public IlIillllIill Illlllllilll() {
      return this.llliIliIlilliIliIl;
   }

   public boolean liiiIIllIl() {
      return iIlIlllllill(this.liIiIliIliiIiIliIl, this.IIliIliIllIliIliIl);
   }

   public IIIilIIiiIIi llIIlilIIl() {
      return this.IIiIlliIllIiIlliIl;
   }

   public IIllIIllIllIIl(
      long lootNearby,
      lliiilIiiliiilIi threat,
      liiilIiliiiilIil tick,
      int nether,
      IlIillllIill breach,
      int nearestEnemy,
      int lastPosture,
      boolean anchor,
      llilIlIlililIlIl self,
      Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> targetReadyIn,
      iIlIIIIiIllIIIIi target,
      iIlIIIIiIllIIIIi combo,
      int selfClosedFor,
      int stallWindows,
      boolean pearlIncoming,
      double options,
      boolean enemiesWithin8,
      IiIililiIili cfg,
      iiliiiIiIIiiiiIi selfSpent,
      float lastLane,
      IIIilIIiiIIi committed,
      iiliiiIiIIiiiiIi ticksSinceOwnPop
   ) {
      this(
         lootNearby,
         threat,
         tick,
         nether,
         breach,
         nearestEnemy,
         lastPosture,
         anchor,
         self,
         targetReadyIn,
         target,
         combo,
         selfClosedFor,
         stallWindows,
         pearlIncoming,
         options,
         enemiesWithin8,
         cfg,
         selfSpent,
         lastLane,
         committed,
         ticksSinceOwnPop,
         false
      );
   }

   public IilliIIllilliIIl IilliliilIIi(iIlIIIIiIllIIIIi l) {
      IilliIIllilliIIl var2 = this.iliiIliIlIiiiIliIl == null ? null : this.iliiIliIlIiiiIliIl.get(l);
      return var2 != null ? var2 : IilliIIllilliIIl.IliIlllilIi(l, lIlIliIlIl<"lIlIliIlIl","Qlpnomub7GypO5UqmniyfvjlnDqiltbiDOBSTyEoXQ==">());
   }

   public iIlIIIIiIllIIIIi IiIiliIiiiIi() {
      return this.IIIIlliIllIIIlliIl;
   }

   public IIllIIllIllIIl(
      long tick,
      lliiilIiiliiilIi self,
      liiilIiliiiilIil target,
      int enemiesWithin8,
      IlIillllIill threat,
      int targetReadyIn,
      int selfClosedFor,
      boolean nether,
      llilIlIlililIlIl cfg,
      Map<iIlIIIIiIllIIIIi, IilliIIllilliIIl> options,
      iIlIIIIiIllIIIIi committed,
      iIlIIIIiIllIIIIi lastLane,
      int ticksSinceOwnPop,
      int stallWindows,
      boolean lootNearby,
      double nearestEnemy,
      boolean pearlIncoming,
      IiIililiIili lastPosture,
      iiliiiIiIIiiiiIi combo,
      float selfSpent,
      IIIilIIiiIIi anchor,
      iiliiiIiIIiiiiIi breach,
      boolean popPending
   ) {
      anchor = anchor == null ? IIIilIIiiIIi.IIIllllIIlll : anchor;
      breach = breach == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : breach;
      this.ilIiIliIlIiIiIliIl = tick;
      this.liIiIliIliiIiIliIl = self;
      this.IIliIliIllIliIliIl = target;
      this.iIliIliIlIlliIliIl = enemiesWithin8;
      this.llliIliIlilliIliIl = threat;
      this.IiliIliIlliliIliIl = targetReadyIn;
      this.iiliIliIlIIiiIliIl = selfClosedFor;
      this.lIiiIliIliIiiIliIl = nether;
      this.IliiIliIllliiIliIl = cfg;
      this.iliiIliIlIiiiIliIl = options;
      this.liiiIliIliiiiIliIl = committed;
      this.IIIIlliIllIIIlliIl = lastLane;
      this.iIIIlliIlIlIIlliIl = ticksSinceOwnPop;
      this.llIIlliIlilIIlliIl = stallWindows;
      this.IiIIlliIlliIIlliIl = lootNearby;
      this.iiIIlliIlIIlIlliIl = nearestEnemy;
      this.lIlIlliIliIlIlliIl = pearlIncoming;
      this.IllIlliIllllIlliIl = lastPosture;
      this.illIlliIlIilIlliIl = combo;
      this.lilIlliIliilIlliIl = selfSpent;
      this.IIiIlliIllIiIlliIl = anchor;
      this.iIiIlliIlIliIlliIl = breach;
      this.lliIlliIliliIlliIl = popPending;
   }

   public long IIIllIIliIIl() {
      return this.ilIiIliIlIiIiIliIl;
   }

   public int Illillliilli() {
      return this.llIIlliIlilIIlliIl;
   }

   public int IIlllIlliIll() {
      return this.iIliIliIlIlliIliIl;
   }
}
