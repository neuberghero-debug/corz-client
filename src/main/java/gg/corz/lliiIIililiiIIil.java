package gg.corz;

public record lliiIIililiiIIil(
   long mission, long target, long stand, String phase, long surfaceRevision, int confirmedCount, long playerSurfaceCell, long geometry, long access
) {
   private final long lIIiliIIil;
   private final long iIIiliIIil;
   private final long llilliIIil;
   private final String liilliIIil;
   private final long IiilliIIil;
   private final long ililliIIil;
   private final long IlIiliIIil;
   private final int IIIiliIIil;
   private final long iiilliIIil;

   public long IlIlllIlilIl() {
      return this.iIIiliIIil;
   }

   public String IilliliilIIi() {
      return this.liilliIIil;
   }

   public long iIlIlllllill() {
      return this.IiilliIIil;
   }

   public long IiIlliIliiIl() {
      return this.IlIiliIIil;
   }

   public long liiiIIllIl() {
      return this.ililliIIil;
   }

   public long IIIllIIliIIl() {
      return this.lIIiliIIil;
   }

   public lliiIIililiiIIil(
      long mission, long target, long stand, String phase, long surfaceRevision, int confirmedCount, long playerSurfaceCell, long geometry, long access
   ) {
      this.llilliIIil = mission;
      this.ililliIIil = target;
      this.IiilliIIil = stand;
      this.liilliIIil = phase;
      this.iiilliIIil = surfaceRevision;
      this.IIIiliIIil = confirmedCount;
      this.lIIiliIIil = playerSurfaceCell;
      this.iIIiliIIil = geometry;
      this.IlIiliIIil = access;
   }

   public int iliIiiliiiii() {
      return this.IIIiliIIil;
   }

   public long lIiiIiIlilli() {
      return this.iiilliIIil;
   }

   public long IliIlllilIi() {
      return this.llilliIIil;
   }
}
