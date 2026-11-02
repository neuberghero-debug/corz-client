package gg.corz;

public record llIIIiililIIIiil(
   long tick,
   boolean struck,
   boolean strikeWasSprint,
   IlliIlllllliIlll crystal,
   boolean pearlThrown,
   boolean pearlFailed,
   boolean anchorDetonated,
   boolean anchorFailed,
   float selfEhpDrop,
   float targetDamageDealt,
   boolean ownPop,
   boolean targetPop,
   boolean acted
) {
   private final boolean liililllil;
   private final IlliIlllllliIlll iiililllil;
   private final float llIiilllil;
   private final boolean iiIiilllil;
   private final boolean iIIiilllil;
   private final boolean lIIiilllil;
   private final boolean IlIiilllil;
   private final long ilililllil;
   private final float ilIiilllil;
   private final boolean IIIiilllil;
   private final boolean IiIiilllil;
   private final boolean Iiililllil;
   private final boolean liIiilllil;

   public long IliIlllilIi() {
      return this.ilililllil;
   }

   public float IiIlliIliiIl() {
      return this.llIiilllil;
   }

   public boolean Iilllilliill() {
      return this.liIiilllil;
   }

   public boolean IlIlllIlilIl() {
      return this.IlIiilllil;
   }

   public boolean liiiIIllIl() {
      return this.Iiililllil;
   }

   public boolean Illlllllilll() {
      return this.IiIiilllil;
   }

   public llIIIiililIIIiil(
      long anchorFailed,
      boolean struck,
      boolean selfEhpDrop,
      IlliIlllllliIlll pearlThrown,
      boolean anchorDetonated,
      boolean strikeWasSprint,
      boolean crystal,
      boolean tick,
      float pearlFailed,
      float targetPop,
      boolean targetDamageDealt,
      boolean ownPop
   ) {
      this(
         anchorFailed,
         struck,
         selfEhpDrop,
         pearlThrown,
         anchorDetonated,
         strikeWasSprint,
         crystal,
         tick,
         pearlFailed,
         targetPop,
         targetDamageDealt,
         ownPop,
         false
      );
   }

   public llIIIiililIIIiil(
      long tick,
      boolean struck,
      boolean strikeWasSprint,
      IlliIlllllliIlll crystal,
      boolean pearlThrown,
      boolean pearlFailed,
      boolean anchorDetonated,
      boolean anchorFailed,
      float selfEhpDrop,
      float targetDamageDealt,
      boolean ownPop,
      boolean targetPop,
      boolean acted
   ) {
      this.ilililllil = tick;
      this.Iiililllil = struck;
      this.liililllil = strikeWasSprint;
      this.iiililllil = crystal;
      this.IIIiilllil = pearlThrown;
      this.lIIiilllil = pearlFailed;
      this.iIIiilllil = anchorDetonated;
      this.IlIiilllil = anchorFailed;
      this.llIiilllil = selfEhpDrop;
      this.ilIiilllil = targetDamageDealt;
      this.IiIiilllil = ownPop;
      this.liIiilllil = targetPop;
      this.iiIiilllil = acted;
   }

   public float IIlllIlliIll() {
      return this.ilIiilllil;
   }

   public boolean iIlIlllllill() {
      return this.liililllil;
   }

   public boolean lIiiIiIlilli() {
      return this.IIIiilllil;
   }

   public boolean iliIiiliiiii() {
      return this.lIIiilllil;
   }

   public IlliIlllllliIlll IilliliilIIi() {
      return this.iiililllil;
   }

   public boolean IIillIiliIil() {
      return this.iiIiilllil;
   }

   public boolean IIIllIIliIIl() {
      return this.iIIiilllil;
   }
}
