package gg.corz;

public record IllIiillllIiil(iIiIiIilIliIiIil why, long base, int climb, int cost, IiIlIiiliIlIii column, boolean usedAstar, boolean deferred, int validUntil) {
   private final int iiIlliIliIIllliIli;
   private final boolean lillliIliiillliIli;
   private final long IiIlliIliliIlliIli;
   private final int lIllliIliiIllliIli;
   public static final IllIiillllIiil iIilliIliIlilliIli = new IllIiillllIiil(null, 0L, 0, 0, IiIlIiiliIlIii.IiIIiilIIl, false, true, 0);
   private final IiIlIiiliIlIii IlllliIlillllliIli;
   private final iIiIiIilIliIiIil llIlliIliilIlliIli;
   private final boolean illlliIliIillliIli;
   private final int IIilliIlilIilliIli;

   public IllIiillllIiil iIlIlllllill(int validUntil) {
      return new IllIiillllIiil(
         this.llIlliIliilIlliIli,
         this.IiIlliIliliIlliIli,
         this.iiIlliIliIIllliIli,
         this.lIllliIliiIllliIli,
         this.IlllliIlillllliIli,
         this.illlliIliIillliIli,
         this.lillliIliiillliIli,
         validUntil
      );
   }

   public int IIIllIIliIIl() {
      return this.iiIlliIliIIllliIli;
   }

   public boolean Illlllllilll() {
      return this.lillliIliiillliIli;
   }

   public long iliIiiliiiii() {
      return this.IiIlliIliliIlliIli;
   }

   public IllIiillllIiil(iIiIiIilIliIiIil why, long base, int climb, int cost, IiIlIiiliIlIii column, boolean usedAstar, boolean deferred, int validUntil) {
      this.llIlliIliilIlliIli = why;
      this.IiIlliIliliIlliIli = base;
      this.iiIlliIliIIllliIli = climb;
      this.lIllliIliiIllliIli = cost;
      this.IlllliIlillllliIli = column;
      this.illlliIliIillliIli = usedAstar;
      this.lillliIliiillliIli = deferred;
      this.IIilliIlilIilliIli = validUntil;
   }

   public IiIlIiiliIlIii IiIlliIliiIl() {
      return this.IlllliIlillllliIli;
   }

   public int Iilllilliill() {
      return this.IIilliIlilIilliIli;
   }

   public iIiIiIilIliIiIil lIiiIiIlilli() {
      return this.llIlliIliilIlliIli;
   }

   public int IlIlllIlilIl() {
      return this.lIllliIliiIllliIli;
   }

   public boolean IilliliilIIi() {
      return this.llIlliIliilIlliIli == null && !this.lillliIliiillliIli;
   }

   public static IllIiillllIiil liiiIIllIl(iIiIiIilIliIiIil column, long base, IiIlIiiliIlIii why, boolean usedAstar) {
      return new IllIiillllIiil(column, base, 0, 0, why == null ? IiIlIiiliIlIii.IiIIiilIIl : why, usedAstar, false, 0);
   }

   public boolean IIlllIlliIll() {
      return this.illlliIliIillliIli;
   }

   public static IllIiillllIiil IliIlllilIi(long base, int climb, int cost, boolean usedAstar) {
      return new IllIiillllIiil(null, base, climb, cost, IiIlIiiliIlIii.IiIIiilIIl, usedAstar, false, 0);
   }
}
