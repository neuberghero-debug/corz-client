package gg.corz;

record IiiIlIllliiIlIll(Object owner, iIllllIlIlllllIl intent, int prio, long tick) {
   private final iIllllIlIlllllIl iIiIiillll;
   private final int IliIiillll;
   private final long lliIiillll;
   private final Object lIiIiillll;

   public int iIlIlllllill() {
      return this.IliIiillll;
   }

   public iIllllIlIlllllIl liiiIIllIl() {
      return this.iIiIiillll;
   }

   public long IilliliilIIi() {
      return this.lliIiillll;
   }

   public Object IliIlllilIi() {
      return this.lIiIiillll;
   }

   private IiiIlIllliiIlIll(Object owner, iIllllIlIlllllIl intent, int prio, long tick) {
      this.lIiIiillll = owner;
      this.iIiIiillll = intent;
      this.IliIiillll = prio;
      this.lliIiillll = tick;
   }
}
