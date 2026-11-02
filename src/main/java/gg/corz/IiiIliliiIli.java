package gg.corz;

public record IiiIliliiIli(
   iIllIliIlllIli mode,
   IiIililiIili posture,
   lilliIiiilliIi weights,
   iIlIIIIiIllIIIIi lane,
   IlIIIillllIIIill stance,
   boolean dodge,
   float minDamage,
   float selfWeight,
   float maxSelfDamage,
   boolean allowTotemTrade,
   illlliIlIillliIl breaks,
   boolean anchorRelease,
   boolean restockWindow,
   String status,
   iiliiiIiIIiiiiIi combo,
   boolean comboYield,
   ilIiliilIiIiliil trade
) {
   private final float iIilliIIlIlilliIIl;
   private final ilIiliilIiIiliil iIliliIIlIlliliIIl;
   private final boolean lIIiliIIliIIiliIIl;
   private final boolean IiilliIIlliilliIIl;
   private final IiIililiIili iiIlliIIlIIllliIIl;
   private final iIllIliIlllIli IiIlliIIlliIlliIIl;
   private final boolean IIliliIIllIliliIIl;
   private final iiliiiIiIIiiiiIi liIiliIIliiIiliIIl;
   private final String ilIiliIIlIiIiliIIl;
   private final IlIIIillllIIIill illlliIIlIillliIIl;
   private final lilliIiiilliIi lIllliIIliIllliIIl;
   private final boolean IlIiliIIlllIiliIIl;
   private final iIlIIIIiIllIIIIi IlllliIIlllllliIIl;
   private final float llilliIIlililliIIl;
   private final boolean lillliIIliillliIIl;
   private final float IIilliIIllIilliIIl;
   private final illlliIlIillliIl iiilliIIlIIIiliIIl;

   public IiiIliliiIli(
      iIllIliIlllIli mode,
      IiIililiIili posture,
      lilliIiiilliIi weights,
      iIlIIIIiIllIIIIi lane,
      IlIIIillllIIIill stance,
      boolean dodge,
      float minDamage,
      float selfWeight,
      float maxSelfDamage,
      boolean allowTotemTrade,
      illlliIlIillliIl breaks,
      boolean anchorRelease,
      boolean restockWindow,
      String status,
      iiliiiIiIIiiiiIi combo,
      boolean comboYield,
      ilIiliilIiIiliil trade
   ) {
      trade = trade == null ? ilIiliilIiIiliil.IiIlIIIiil : trade;
      this.IiIlliIIlliIlliIIl = mode;
      this.iiIlliIIlIIllliIIl = posture;
      this.lIllliIIliIllliIIl = weights;
      this.IlllliIIlllllliIIl = lane;
      this.illlliIIlIillliIIl = stance;
      this.lillliIIliillliIIl = dodge;
      this.IIilliIIllIilliIIl = minDamage;
      this.iIilliIIlIlilliIIl = selfWeight;
      this.llilliIIlililliIIl = maxSelfDamage;
      this.IiilliIIlliilliIIl = allowTotemTrade;
      this.iiilliIIlIIIiliIIl = breaks;
      this.lIIiliIIliIIiliIIl = anchorRelease;
      this.IlIiliIIlllIiliIIl = restockWindow;
      this.ilIiliIIlIiIiliIIl = status;
      this.liIiliIIliiIiliIIl = combo;
      this.IIliliIIllIliliIIl = comboYield;
      this.iIliliIIlIlliliIIl = trade;
   }

   public float IIIllIIliIIl() {
      return this.IIilliIIllIilliIIl;
   }

   public boolean IIIilIIiiIIi() {
      return this.IIliliIIllIliliIIl;
   }

   public iIlIIIIiIllIIIIi IilliliilIIi() {
      return this.IlllliIIlllllliIIl;
   }

   public ilIiliilIiIiliil IlIillIiilIi() {
      return this.iIliliIIlIlliliIIl;
   }

   public boolean IIlllIlliIll() {
      return this.IiilliIIlliilliIIl;
   }

   public IiiIliliiIli(
      iIllIliIlllIli comboYield,
      IiIililiIili breaks,
      lilliIiiilliIi anchorRelease,
      iIlIIIIiIllIIIIi dodge,
      IlIIIillllIIIill combo,
      boolean mode,
      float restockWindow,
      float allowTotemTrade,
      float status,
      boolean lane,
      illlliIlIillliIl maxSelfDamage,
      boolean stance,
      boolean weights,
      String posture,
      iiliiiIiIIiiiiIi minDamage,
      boolean selfWeight
   ) {
      this(
         comboYield,
         breaks,
         anchorRelease,
         dodge,
         combo,
         mode,
         restockWindow,
         allowTotemTrade,
         status,
         lane,
         maxSelfDamage,
         stance,
         weights,
         posture,
         minDamage,
         selfWeight,
         ilIiliilIiIiliil.IiIlIIIiil
      );
   }

   public boolean IIillIiliIil() {
      return this.IlIiliIIlllIiliIIl;
   }

   public String Ililllililil() {
      return this.ilIiliIIlIiIiliIIl;
   }

   public lilliIiiilliIi iIlIlllllill() {
      return this.lIllliIIliIllliIIl;
   }

   public iiliiiIiIIiiiiIi Iiilliiliiil() {
      return this.liIiliIIliiIiliIIl;
   }

   public boolean iliIiiliiiii() {
      return this.lillliIIliillliIIl;
   }

   public illlliIlIillliIl Illlllllilll() {
      return this.iiilliIIlIIIiliIIl;
   }

   public boolean Iilllilliill() {
      return this.lIIiliIIliIIiliIIl;
   }

   public IlIIIillllIIIill lIiiIiIlilli() {
      return this.illlliIIlIillliIIl;
   }

   public float IiIlliIliiIl() {
      return this.llilliIIlililliIIl;
   }

   public float IlIlllIlilIl() {
      return this.iIilliIIlIlilliIIl;
   }

   public IiIililiIili liiiIIllIl() {
      return this.iiIlliIIlIIllliIIl;
   }

   public iIllIliIlllIli IliIlllilIi() {
      return this.IiIlliIIlliIlliIIl;
   }
}
