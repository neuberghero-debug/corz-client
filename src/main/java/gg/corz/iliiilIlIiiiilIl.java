package gg.corz;

import java.util.List;

record iliiilIlIiiiilIl(List<ilIlIIilIiIlIIil> cells, int natural, iliIiiiIiiIiii counts, List<iiliIiIiIIiiIiIi> markers, long signature) {
   private final List<iiliIiIiIIiiIiIi> IiiiIIiIll;
   private final List<ilIlIIilIiIlIIil> IliiIIiIll;
   private final int lliiIIiIll;
   private final iliIiiiIiiIiii iliiIIiIll;
   private final long liiiIIiIll;

   public long lIiiIiIlilli() {
      return this.liiiIIiIll;
   }

   public int liiiIIllIl() {
      return this.lliiIIiIll;
   }

   public iliIiiiIiiIiii iIlIlllllill() {
      return this.iliiIIiIll;
   }

   public List<iiliIiIiIIiiIiIi> IilliliilIIi() {
      return this.IiiiIIiIll;
   }

   private iliiilIlIiiiilIl(List<ilIlIIilIiIlIIil> cells, int natural, iliIiiiIiiIiii counts, List<iiliIiIiIIiiIiIi> markers, long signature) {
      this.IliiIIiIll = cells;
      this.lliiIIiIll = natural;
      this.iliiIIiIll = counts;
      this.IiiiIIiIll = markers;
      this.liiiIIiIll = signature;
   }

   public List<ilIlIIilIiIlIIil> IliIlllilIi() {
      return this.IliiIIiIll;
   }
}
