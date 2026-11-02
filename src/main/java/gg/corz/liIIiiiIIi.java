package gg.corz;

public record liIIiiiIIi(IiiIiIIlliiIiIIl cls, long stand, String why) {
   private final long lIIIIiiiIIIIii;
   private final String IlIIIiillIIIii;
   private final IiiIiIIlliiIiIIl iiiiiliIIIIIii;

   public String IIIllIIliIIl() {
      return this.IlIIIiillIIIii;
   }

   public long iliIiiliiiii() {
      return this.lIIIIiiiIIIIii;
   }

   public IiiIiIIlliiIiIIl lIiiIiIlilli() {
      return this.iiiiiliIIIIIii;
   }

   public boolean liiiIIllIl() {
      return this.iiiiiliIIIIIii == IiiIiIIlliiIiIIl.IllllIilIl;
   }

   public boolean IilliliilIIi() {
      return this.lIIIIiiiIIIIii != Long.MIN_VALUE;
   }

   public boolean IliIlllilIi() {
      return this.iiiiiliIIIIIii == IiiIiIIlliiIiIIl.IIlllIilIl;
   }

   public boolean iIlIlllllill() {
      return this.iiiiiliIIIIIii == IiiIiIIlliiIiIIl.lIlllIilIl || this.iiiiiliIIIIIii == IiiIiIIlliiIiIIl.iIlllIilIl;
   }

   public liIIiiiIIi(IiiIiIIlliiIiIIl cls, long stand, String why) {
      cls = cls == null ? IiiIiIIlliiIiIIl.lllllIilIl : cls;
      why = why == null ? "" : why;
      this.iiiiiliIIIIIii = cls;
      this.lIIIIiiiIIIIii = stand;
      this.IlIIIiillIIIii = why;
   }
}
