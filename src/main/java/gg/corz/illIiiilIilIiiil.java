package gg.corz;

public record illIiiilIilIiiil(
   float selfEhp,
   int selfTotems,
   boolean totemConfirmed,
   float maxIncoming,
   boolean lethal,
   float bestHit,
   float targetEhp,
   boolean targetAwaitingTotem,
   boolean targetEating,
   float targetArmorMin,
   int enemiesWithin8,
   boolean pearlsAvailable,
   IlIIIlilllIIIlil style
) {
   private final boolean iIiIIlIiil;
   private final IlIIIlilllIIIlil IiiIIlIiil;
   private final float iilIIlIiil;
   private final boolean lIiIIlIiil;
   private final float IIiIIlIiil;
   private final int lllIIlIiil;
   private final float IilIIlIiil;
   private final float IliIIlIiil;
   private final boolean iliIIlIiil;
   private final float IllIIlIiil;
   private final boolean lilIIlIiil;
   private final boolean illIIlIiil;
   private final int lliIIlIiil;

   public illIiiilIilIiiil(
      float selfEhp,
      int selfTotems,
      boolean totemConfirmed,
      float maxIncoming,
      boolean lethal,
      float bestHit,
      float targetEhp,
      boolean targetAwaitingTotem,
      boolean targetEating,
      float targetArmorMin,
      int enemiesWithin8,
      boolean pearlsAvailable,
      IlIIIlilllIIIlil style
   ) {
      this.IllIIlIiil = selfEhp;
      this.lllIIlIiil = selfTotems;
      this.illIIlIiil = totemConfirmed;
      this.IilIIlIiil = maxIncoming;
      this.lilIIlIiil = lethal;
      this.iilIIlIiil = bestHit;
      this.IIiIIlIiil = targetEhp;
      this.lIiIIlIiil = targetAwaitingTotem;
      this.iIiIIlIiil = targetEating;
      this.IliIIlIiil = targetArmorMin;
      this.lliIIlIiil = enemiesWithin8;
      this.iliIIlIiil = pearlsAvailable;
      this.IiiIIlIiil = style;
   }

   public int Illlllllilll() {
      return this.lliIIlIiil;
   }

   public boolean Iilllilliill() {
      return this.iliIIlIiil;
   }

   public float iliIiiliiiii() {
      return this.iilIIlIiil;
   }

   public float IIIllIIliIIl() {
      return this.IIiIIlIiil;
   }

   public float IIlllIlliIll() {
      return this.IliIIlIiil;
   }

   public boolean lIiiIiIlilli() {
      return this.lilIIlIiil;
   }

   public float IliIlllilIi() {
      return this.IllIIlIiil;
   }

   public IlIIIlilllIIIlil IIillIiliIil() {
      return this.IiiIIlIiil;
   }

   public boolean iIlIlllllill() {
      return this.illIIlIiil;
   }

   public boolean IiIlliIliiIl() {
      return this.iIiIIlIiil;
   }

   public int liiiIIllIl() {
      return this.lllIIlIiil;
   }

   public float IilliliilIIi() {
      return this.IilIIlIiil;
   }

   public boolean IlIlllIlilIl() {
      return this.lIiIIlIiil;
   }
}
