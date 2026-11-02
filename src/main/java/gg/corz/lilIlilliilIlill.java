package gg.corz;

public record lilIlilliilIlill(long target, long laneCell, long support, int supportFace, int lookDir, boolean directional, boolean sneakPulse) {
   private final long iIlliilill;
   private final boolean Iilliilill;
   private final long lIlliilill;
   private final boolean lilliilill;
   private final long Illliilill;
   private final int illliilill;
   private final int lllliilill;

   public long IliIlllilIi() {
      return this.lIlliilill;
   }

   public int lIiiIiIlilli() {
      return this.illliilill;
   }

   public lilIlilliilIlill(long target, long laneCell, long support, int supportFace, int lookDir, boolean directional, boolean sneakPulse) {
      this.lIlliilill = target;
      this.iIlliilill = laneCell;
      this.Illliilill = support;
      this.lllliilill = supportFace;
      this.illliilill = lookDir;
      this.Iilliilill = directional;
      this.lilliilill = sneakPulse;
   }

   public int IilliliilIIi() {
      return this.lllliilill;
   }

   public lilIlilliilIlill(long supportFace, long target, long support, int laneCell) {
      this(supportFace, target, support, laneCell, -1, false, false);
   }

   public boolean IIIllIIliIIl() {
      return this.lilliilill;
   }

   public boolean iliIiiliiiii() {
      return this.Iilliilill;
   }

   public long liiiIIllIl() {
      return this.iIlliilill;
   }

   public long iIlIlllllill() {
      return this.Illliilill;
   }
}
