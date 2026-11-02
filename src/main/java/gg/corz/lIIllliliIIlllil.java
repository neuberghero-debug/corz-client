package gg.corz;

public record lIIllliliIIlllil(int face, long supportCell, int clickedFace) {
   private final long iiilIiiIil;
   private final int liilIiiIil;
   private final int IIIiIiiIil;

   public int IliIlllilIi() {
      return this.liilIiiIil;
   }

   public long liiiIIllIl() {
      return this.iiilIiiIil;
   }

   public lIIllliliIIlllil(int face, long supportCell, int clickedFace) {
      this.liilIiiIil = face;
      this.iiilIiiIil = supportCell;
      this.IIIiIiiIil = clickedFace;
   }

   public int iIlIlllllill() {
      return this.IIIiIiiIil;
   }
}
