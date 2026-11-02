package gg.corz;

public record iIllliIiIlllliIi(iilillIiIIiillIi cls, lIliliiIlili kind, int count, int maxCount, double score, boolean blocked) {
   private final boolean IiIliliIIi;
   private final int IlIliliIIi;
   private final iilillIiIIiillIi lIIliliIIi;
   public static final iIllliIiIlllliIi liIliliIIi = new iIllliIiIlllliIi(iilillIiIIiillIi.IiliIIlIIi, null, 0, 64, 0.0, false);
   private final lIliliiIlili iIIliliIIi;
   private final double ilIliliIIi;
   private final int llIliliIIi;

   public boolean iliIiiliiiii() {
      return this.IiIliliIIi;
   }

   public iIllliIiIlllliIi(iilillIiIIiillIi cls, lIliliiIlili kind, int count, int maxCount, double score, boolean blocked) {
      this.lIIliliIIi = cls;
      this.iIIliliIIi = kind;
      this.IlIliliIIi = count;
      this.llIliliIIi = maxCount;
      this.ilIliliIIi = score;
      this.IiIliliIIi = blocked;
   }

   public int IilliliilIIi() {
      return this.llIliliIIi;
   }

   public double lIiiIiIlilli() {
      return this.ilIliliIIi;
   }

   public lIliliiIlili liiiIIllIl() {
      return this.iIIliliIIi;
   }

   public int iIlIlllllill() {
      return this.IlIliliIIi;
   }

   public iilillIiIIiillIi IliIlllilIi() {
      return this.lIIliliIIi;
   }
}
