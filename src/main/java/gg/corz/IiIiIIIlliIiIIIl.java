package gg.corz;

record IiIiIIIlliIiIIIl(int id, int x, int y, IilIIIlllilIIIll kind, int count, int hash) {
   private final IilIIIlllilIIIll IiiliIllIl;
   private final int iiiliIllIl;
   private final int liiliIllIl;
   private final int IliliIllIl;
   private final int lliliIllIl;
   private final int ililiIllIl;

   public int liiiIIllIl() {
      return this.lliliIllIl;
   }

   public int iIlIlllllill() {
      return this.ililiIllIl;
   }

   public IilIIIlllilIIIll IilliliilIIi() {
      return this.IiiliIllIl;
   }

   public int lIiiIiIlilli() {
      return this.liiliIllIl;
   }

   IiIiIIIlliIiIIIl(int id, int x, int y, IilIIIlllilIIIll kind, int count, int hash) {
      this.IliliIllIl = id;
      this.lliliIllIl = x;
      this.ililiIllIl = y;
      this.IiiliIllIl = kind;
      this.liiliIllIl = count;
      this.iiiliIllIl = hash;
   }

   public int IliIlllilIi() {
      return this.IliliIllIl;
   }

   public int iliIiiliiiii() {
      return this.iiiliIllIl;
   }
}
