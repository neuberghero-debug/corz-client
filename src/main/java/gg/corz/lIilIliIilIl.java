package gg.corz;

public record lIilIliIilIl(long id, int x, int y, int z, boolean curves, int shape) {
   private final int lIiIIilliIiIIill;
   private final int lllIIillillIIill;
   private final boolean iilIIillIIiIIill;
   private final long IIlIIilllIlIIill;
   private final int iIlIIillIllIIill;
   private final int IilIIilllilIIill;

   public lIilIliIilIl(long id, int x, int y, int z, boolean curves, int shape) {
      this.IIlIIilllIlIIill = id;
      this.iIlIIillIllIIill = x;
      this.lllIIillillIIill = y;
      this.IilIIilllilIIill = z;
      this.iilIIillIIiIIill = curves;
      this.lIiIIilliIiIIill = shape;
   }

   public int iliIiiliiiii() {
      return this.lIiIIilliIiIIill;
   }

   public int iIlIlllllill() {
      return this.lllIIillillIIill;
   }

   public int liiiIIllIl() {
      return this.iIlIIillIllIIill;
   }

   public boolean lIiiIiIlilli() {
      return this.iilIIillIIiIIill;
   }

   public int IilliliilIIi() {
      return this.IilIIilllilIIill;
   }

   public long IliIlllilIi() {
      return this.IIlIIilllIlIIill;
   }
}
