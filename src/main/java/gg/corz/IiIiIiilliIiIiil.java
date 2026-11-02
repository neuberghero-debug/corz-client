package gg.corz;

record IiIiIiilliIiIiil(long pos, String dimension, IliliIllliliIl type, long startMs) {
   private final String lIIiIIilil;
   private final long IIIiIIilil;
   private final IliliIllliliIl iIIiIIilil;
   private final long IlIiIIilil;

   public String liiiIIllIl() {
      return this.lIIiIIilil;
   }

   private IiIiIiilliIiIiil(long pos, String dimension, IliliIllliliIl type, long startMs) {
      this.IIIiIIilil = pos;
      this.lIIiIIilil = dimension;
      this.iIIiIIilil = type;
      this.IlIiIIilil = startMs;
   }

   public long IilliliilIIi() {
      return this.IlIiIIilil;
   }

   public IliliIllliliIl iIlIlllllill() {
      return this.iIIiIIilil;
   }

   public long IliIlllilIi() {
      return this.IIIiIIilil;
   }
}
