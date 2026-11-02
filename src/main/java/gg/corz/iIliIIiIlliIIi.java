package gg.corz;

import java.util.Set;

public record iIliIIiIlliIIi(
   double reach,
   int dirtBudget,
   int maxPillar,
   boolean allowEdgeAim,
   boolean allowFluidCellDirt,
   boolean allowFutureStands,
   int windowMargin,
   Set<Long> bannedIntents,
   long budgetNanos,
   boolean edgeSneak,
   boolean egressGuard,
   Set<Long> bannedPairs,
   Set<Long> unreachableStands
) {
   private final int IiIiiiililiIiiiili;
   private final boolean Illiiiilillliiiili;
   private final double iIIiiiiliIlIiiiili;
   private final boolean lIliiiiliiIliiiili;
   private final int llIiiiiliilIiiiili;
   private final boolean lliiiiiliiliiiiili;
   private final Set<Long> iiiiiiiliIIIIIIIii;
   private final Set<Long> Iiiiiiililiiiiiili;
   private final long IIiiiiililIiiiiili;
   private final Set<Long> liliiiiliiiliiiili;
   private final int illiiiiliIiliiiili;
   private final boolean iIiiiiiliIliiiiili;
   private final boolean iiIiiiiliIIliiiili;

   public iIliIIiIlliIIi(
      double allowFluidCellDirt, int windowMargin, int reach, boolean dirtBudget, boolean allowFutureStands, boolean allowEdgeAim, int maxPillar
   ) {
      this(allowFluidCellDirt, windowMargin, reach, dirtBudget, allowFutureStands, allowEdgeAim, maxPillar, Set.of(), 0L, true, true);
   }

   public boolean Iiiiliiiiiii() {
      return this.iIiiiiiliIliiiiili;
   }

   public iIliIIiIlliIIi IilliliilIIi(boolean on) {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         on,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public boolean IiIiliIiiiIi() {
      return this.iiIiiiiliIIliiiili;
   }

   public int Iilililiiili() {
      return this.illiiiiliIiliiiili;
   }

   public int IlIillIiilIi() {
      return this.IiIiiiililiIiiiili;
   }

   public double Iiilliiliiil() {
      return this.iIIiiiiliIlIiiiili;
   }

   public boolean Illillliilli() {
      return this.Illiiiilillliiiili;
   }

   public iIliIIiIlliIIi IIIllIIliIIl(long millis) {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         millis <= 0L ? 0L : millis * 1000000L,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public static iIliIIiIlliIIi lIiiIiIlilli(double reach) {
      return new iIliIIiIlliIIi(reach, 8, 3, false, false, true, 4);
   }

   public iIliIIiIlliIIi(
      double reach,
      int dirtBudget,
      int maxPillar,
      boolean allowEdgeAim,
      boolean allowFluidCellDirt,
      boolean allowFutureStands,
      int windowMargin,
      Set<Long> bannedIntents,
      long budgetNanos,
      boolean edgeSneak,
      boolean egressGuard,
      Set<Long> bannedPairs,
      Set<Long> unreachableStands
   ) {
      this.iIIiiiiliIlIiiiili = reach;
      this.llIiiiiliilIiiiili = dirtBudget;
      this.IiIiiiililiIiiiili = maxPillar;
      this.iiIiiiiliIIliiiili = allowEdgeAim;
      this.lIliiiiliiIliiiili = allowFluidCellDirt;
      this.Illiiiilillliiiili = allowFutureStands;
      this.illiiiiliIiliiiili = windowMargin;
      this.liliiiiliiiliiiili = bannedIntents;
      this.IIiiiiililIiiiiili = budgetNanos;
      this.iIiiiiiliIliiiiili = edgeSneak;
      this.lliiiiiliiliiiiili = egressGuard;
      this.Iiiiiiililiiiiiili = bannedPairs;
      this.iiiiiiiliIIIIIIIii = unreachableStands;
   }

   public iIliIIiIlliIIi iliIiiliiiii(Set<Long> keys) {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         keys == null ? Set.of() : keys,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public boolean IIIIllIIIl() {
      return this.lliiiiiliiliiiiili;
   }

   public Set<Long> iIIIlIlIIl() {
      return this.Iiiiiiililiiiiiili;
   }

   boolean IIillIiliIil(lIiliiliIiliil s) {
      return !this.iiiiiiiliIIIIIIIii.isEmpty() && this.iiiiiiiliIIIIIIIii.contains(s.IIIllIIliIIl());
   }

   public iIliIIiIlliIIi(
      double maxPillar,
      int bannedIntents,
      int edgeSneak,
      boolean reach,
      boolean egressGuard,
      boolean dirtBudget,
      int allowEdgeAim,
      Set<Long> budgetNanos,
      long windowMargin,
      boolean allowFluidCellDirt,
      boolean allowFutureStands
   ) {
      this(
         maxPillar,
         bannedIntents,
         edgeSneak,
         reach,
         egressGuard,
         dirtBudget,
         allowEdgeAim,
         budgetNanos,
         windowMargin,
         allowFluidCellDirt,
         allowFutureStands,
         Set.of(),
         Set.of()
      );
   }

   iIliIIiIlliIIi IiIlliIliiIl() {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         true,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public Set<Long> IIiilIiiiIii() {
      return this.liliiiiliiiliiiili;
   }

   public iIliIIiIlliIIi IlIlllIlilIl(boolean on) {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         on,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public iIliIIiIlliIIi Iilllilliill(int margin) {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         margin,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public Set<Long> llIIlilIIl() {
      return this.iiiiiiiliIIIIIIIii;
   }

   public iIliIIiIlliIIi IliIlllilIi(Set<Long> pairs) {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         pairs == null ? Set.of() : pairs,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public iIliIIiIlliIIi Illlllllilll(Set<Long> stands) {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         stands == null ? Set.of() : stands
      );
   }

   public long Iliilliiilii() {
      return this.IIiiiiililIiiiiili;
   }

   boolean iIlIlllllill(lIiliiliIiliil stand, lIiliiliIiliil target) {
      return !this.Iiiiiiililiiiiiili.isEmpty() && this.Iiiiiiililiiiiiili.contains(liiiIIllIl(stand, target));
   }

   iIliIIiIlliIIi IIlllIlliIll() {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         true,
         this.Illiiiilillliiiili,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public static long liiiIIllIl(lIiliiliIiliil stand, lIiliiliIiliil target) {
      return iIiIliIliIli.IilliliilIIi(stand.IIIllIIliIIl(), target.IIIllIIliIIl());
   }

   iIliIIiIlliIIi Ililllililil() {
      return new iIliIIiIlliIIi(
         this.iIIiiiiliIlIiiiili,
         this.llIiiiiliilIiiiili,
         this.IiIiiiililiIiiiili,
         this.iiIiiiiliIIliiiili,
         this.lIliiiiliiIliiiili,
         true,
         this.illiiiiliIiliiiili,
         this.liliiiiliiiliiiili,
         this.IIiiiiililIiiiiili,
         this.iIiiiiiliIliiiiili,
         this.lliiiiiliiliiiiili,
         this.Iiiiiiililiiiiiili,
         this.iiiiiiiliIIIIIIIii
      );
   }

   public int IIIilIIiiIIi() {
      return this.llIiiiiliilIiiiili;
   }

   public boolean IIlilIliiIli() {
      return this.lIliiiiliiIliiiili;
   }
}
