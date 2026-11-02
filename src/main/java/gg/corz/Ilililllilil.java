package gg.corz;

public record Ilililllilil(int x, int y, int z, boolean exposed, int digs, double cost) {
   private final int IiilIIiiliilIIii;
   private final boolean lIIiIIiiiIIiIIii;
   private final int iiilIIiiIIIiIIii;
   private final double ilIiIIiiIiIiIIii;
   private final int llilIIiiililIIii;
   private final int IlIiIIiillIiIIii;

   public Ilililllilil(int x, int y, int z, boolean exposed, int digs, double cost) {
      this.llilIIiiililIIii = x;
      this.IiilIIiiliilIIii = y;
      this.iiilIIiiIIIiIIii = z;
      this.lIIiIIiiiIIiIIii = exposed;
      this.IlIiIIiillIiIIii = digs;
      this.ilIiIIiiIiIiIIii = cost;
   }

   public int liiiIIllIl() {
      return this.IiilIIiiliilIIii;
   }

   public boolean IilliliilIIi() {
      return this.lIIiIIiiiIIiIIii;
   }

   public int lIiiIiIlilli() {
      return this.IlIiIIiillIiIIii;
   }

   public int iIlIlllllill() {
      return this.iiilIIiiIIIiIIii;
   }

   public int IliIlllilIi() {
      return this.llilIIiiililIIii;
   }

   public double iliIiiliiiii() {
      return this.ilIiIIiiIiIiIIii;
   }
}
